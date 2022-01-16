package com.vicmatskiv.mw.vehicle;

import org.lwjgl.opengl.GL11;

import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.models.AudiS4;
import com.vicmatskiv.mw.models.AudiS4SteeringWheel;
import com.vicmatskiv.mw.models.AudiS4Wheel;
import com.vicmatskiv.mw.models.AudiWindows;
import com.vicmatskiv.mw.models.SampleVehicleControlArm;
import com.vicmatskiv.mw.vehicle.engines.AudiS4Engine;
import com.vicmatskiv.mw.vehicle.engines.EvoIVEngine;
import com.vicmatskiv.weaponlib.EntityConfiguration;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.animation.Transition;
import com.vicmatskiv.weaponlib.vehicle.EntityVehicle;
import com.vicmatskiv.weaponlib.vehicle.EntityVehicleConfiguration;
import com.vicmatskiv.weaponlib.vehicle.GearShiftPattern;
import com.vicmatskiv.weaponlib.vehicle.Positioners;
import com.vicmatskiv.weaponlib.vehicle.StatefulRenderer;
import com.vicmatskiv.weaponlib.vehicle.VehicleDrivingAspect;
import com.vicmatskiv.weaponlib.vehicle.VehiclePart;
import com.vicmatskiv.weaponlib.vehicle.VehicleRenderableState;
import com.vicmatskiv.weaponlib.vehicle.VehicleRendererBuilder;
import com.vicmatskiv.weaponlib.vehicle.VehicleState;
import com.vicmatskiv.weaponlib.vehicle.collisions.VehicleInertiaBuilder;
import com.vicmatskiv.weaponlib.vehicle.jimphysics.Chassis;
import com.vicmatskiv.weaponlib.vehicle.jimphysics.Dimensions;
import com.vicmatskiv.weaponlib.vehicle.jimphysics.PhysicsConfiguration;
import com.vicmatskiv.weaponlib.vehicle.jimphysics.Transmission;
import com.vicmatskiv.weaponlib.vehicle.jimphysics.TyreSize;
import com.vicmatskiv.weaponlib.vehicle.jimphysics.solver.VehiclePhysicsSolver;
import com.vicmatskiv.weaponlib.vehicle.jimphysics.solver.WheelAxel;
import com.vicmatskiv.weaponlib.vehicle.jimphysics.solver.WheelSolver;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.enchantment.EnchantmentFishingSpeed;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class AudiS4Factory implements VehicleFactory {

	
	
	
    public EntityConfiguration createVehicle(ModContext modContext) {
        
    	
        StatefulRenderer<VehicleRenderableState> renderer = null;
    	
    	if(FMLCommonHandler.instance().getSide() == Side.CLIENT) {
    		renderer = new VehicleRendererBuilder()
    				
    				.performShiftAnimation(true)
    				.shiftWithRight(true)
                    
                    .withPartTexturedModel(VehiclePart.MAIN, AudiS4::new, "audis4")
                    .withPartTexturedModel(VehiclePart.WINDOWS, AudiWindows::new, "audis4")
                    .withPartTexturedModel(VehiclePart.STEERING_WHEEL, AudiS4SteeringWheel::new, "audis4")
                    .withPartTexturedModel(VehiclePart.FRONT_LEFT_CONTROL_ARM, SampleVehicleControlArm::new, "sample-vehicle")
                    .withPartTexturedModel(VehiclePart.FRONT_RIGHT_CONTROL_ARM, SampleVehicleControlArm::new, "sample-vehicle")
                    .withPartTexturedModel(VehiclePart.FRONT_LEFT_WHEEL, AudiS4Wheel::new, "audis4")
                    .withPartTexturedModel(VehiclePart.FRONT_RIGHT_WHEEL, AudiS4Wheel::new, "audis4")
                    .withPartTexturedModel(VehiclePart.REAR_LEFT_WHEEL, AudiS4Wheel::new, "audis4")
                    .withPartTexturedModel(VehiclePart.REAR_RIGHT_WHEEL, AudiS4Wheel::new, "audis4")

                    
                    // part positions
                    
                    .withPartPosition(VehiclePart.MAIN, c -> {
                    	
                    	EntityVehicle entityVehicle = (EntityVehicle) c.getEntity();
                    	float forwardLean = (float) entityVehicle.forwardLean;
                    	float sideLean = (float) entityVehicle.sideLean;
                    	
                        Positioners.position(
                                1.0f, (float) (-1.500000f-entityVehicle.rideOffset), -2.700000f,
                                0.0f, 0f, 0.0f,
                                0.000000f, 0.000000f, 0.000000f,
                                1.000000f, 1.000000f, 1.000000f
                            );
                    })
                    
                    .withPartPosition(VehiclePart.WINDOWS, c -> {
                    	
                    })
                   
                    .withPartPosition(VehiclePart.STEERING_WHEEL, context -> {
                    	
                    	float steer = (float) -Math.toDegrees(context.getSymmetricProgress()) - 57;
                    	Positioners.position(
                    		    0.000000f, 0.000000f, 0.000000f,
                    		    0.000000f, 0f, steer,
                    		    -1.025000f, -0.325000f, 0.000000f,
                    		    1.000000f, 1.000000f, 1.000000f
                    		);
                    })

                    .withPartPosition(VehiclePart.LEFT_HAND, VehicleRenderableState.IDLE, context -> {
                    	
                    	Positioners.position(
                    		    -0.945000f, -0.575000f, 2.730000f,
                    		    0.000000f, 0.000000f, 0.000000f,
                    		    0.000000f, 0.000000f, 0.000000f,
                    		    1.000000f, 1.000000f, 1.000000f
                    		);
                    })

                    .withPartPosition(VehiclePart.LEFT_HAND, VehicleRenderableState.DRIVING, context -> {
                    	
                    	Positioners.position(
                    		    -0.920000f, -0.240000f, 2.809999f,
                    		    -90.000000f, 5.000000f, 10.000000f,
                    		    0.000000f, 0.000000f, 0.000000f,
                    		    1.000000f, 1.000000f, 1.000000f
                    		);
                    })
                    
                    .withPartPosition(VehiclePart.RIGHT_HAND, VehicleRenderableState.SHIFTING, context -> {
                		EntityVehicle entityVehicle = (EntityVehicle) context.getEntity();
                		Transmission trans = entityVehicle.solver.transmission;
                		GearShiftPattern pattern = entityVehicle.getSolver().getPhysConf().getShiftPattern();
                		entityVehicle.smoothShift.updatePrev();
                		entityVehicle.smoothShift.set(pattern.quickDoAnimation(trans).scale(0.3));
                		Vec3d offset = entityVehicle.smoothShift.get();
                    	float xO = (float) -offset.z*0.5f;
                    	float zO = (float) -offset.x;
                    	
                        Positioners.position(
                                -1.500000f+xO, -0.370000f, 2.380000f+zO,
                                -50.000000f, 0.000000f, 0.000000f,
                                0.000000f, 0.000000f, 0.000000f,
                                1.000000f, 1.000000f, 1.000000f
                            );
                    }, 50)
                    
                  
                    
                   

                    .withPartPosition(VehiclePart.RIGHT_HAND, VehicleRenderableState.IDLE, context -> {
                    	Positioners.position(
                    		    -1.000000f, -0.670000f, 2.780000f,
                    		    0.000000f, 0.000000f, 0.000000f,
                    		    0.000000f, 0.000000f, 0.000000f,
                    		    1.000000f, 1.000000f, 1.000000f
                    		);
                    })
                    
                    .withPartPosition(VehiclePart.RIGHT_HAND, VehicleRenderableState.DRIVING, context -> {
                    	Positioners.position(
                    		    -1.050000f, -0.380001f, 2.760000f,
                    		    -95.000000f, 0.000000f, -5.000000f,
                    		    0.000000f, 0.000000f, 0.000000f,
                    		    1.000000f, 1.000000f, 1.000000f
                    		);
                    })
                    
                    .withPartPosition(VehiclePart.FRONT_LEFT_CONTROL_ARM, context -> {
                    	
                    	float steer = (float) Math.toDegrees(context.getSymmetricProgress()) + 60;
                    	
                    	Positioners.position(
                    		    0.000000f, 0.000000f, 0.000000f,
                    		    0.000000f, steer, 0.000000f,
                    		    -0.05000f, 0.000000f, 0.000000f,
                    		    1.000000f, 1.000000f, 1.000000f
                    		);
                    })
                    
                    .withPartPosition(VehiclePart.FRONT_RIGHT_CONTROL_ARM, context -> {
                    	float steer = (float) Math.toDegrees(context.getSymmetricProgress()) + 60;
                    	
                    	Positioners.position(
                    		    0.050000f, 0.000000f, 0.000000f,
                    		    0.000000f, steer, 0.000000f,
                    		    -3.850000f, 0.000000f, 0.000000f,
                    		    1.000000f, 1.000000f, 1.000000f
                    		);
                    })
                    
                    .withPartPosition(VehiclePart.FRONT_LEFT_WHEEL, context -> {
                    	EntityVehicle entityVehicle = (EntityVehicle) context.getEntity();
                    	float vertical = (float) entityVehicle.getSolver().frontAxel.leftWheel.getRenderRideHeight();
                    	WheelSolver ws = entityVehicle.getSolver().frontAxel.leftWheel;
                    	
                    	Positioners.position(
                    		    0.000000f, /*vertical*/ 0.0f, 0.000000f,
                    		    (float) ws.getInterpolatedWheelRotation(), 0.000000f, 0.000000f,
                    		    0.000000f, 0.750000f, -0.000000f,
                    		    1.000000f, 1.000000f, 1.000000f
                    		);
                    })
                    
                    .withPartPosition(VehiclePart.FRONT_RIGHT_WHEEL, context -> {
                    	
                    	EntityVehicle entityVehicle = (EntityVehicle) context.getEntity();
                    	WheelSolver ws = entityVehicle.getSolver().frontAxel.rightWheel;
                    	float vertical = (float) entityVehicle.getSolver().frontAxel.rightWheel.getRenderRideHeight();
                    	float steer = (float) Math.toDegrees(context.getSymmetricProgress());
                    	
                    	Positioners.position(
                    		    -3.899998f, /*vertical*/0.0f, 0.000000f,
                    		    (float) ws.getInterpolatedWheelRotation(), 0f, 0.000000f,
                    		    -0.650000f, 0.750000f, 0.010000f,
                    		    1.000000f, 1.000000f, 1.000000f
                    		);
                    })

                    .withPartPosition(VehiclePart.REAR_LEFT_WHEEL, context -> {
                    	
                    	EntityVehicle entityVehicle = (EntityVehicle) context.getEntity();
                    	WheelSolver ws = entityVehicle.getSolver().rearAxel.leftWheel;
                    	float vertical = (float) entityVehicle.getSolver().rearAxel.leftWheel.getRenderRideHeight();
                    	
                    	Positioners.position(
                    		    0.000000f, /*vertical*/0.0f, 5.724997f,
                    		    (float) ws.getInterpolatedWheelRotation(), 0.000000f, 0.000000f,
                    		    0.000000f, 0.740000f, 0.000000f,
                    		    1.000000f, 1.000000f, 1.000000f
                    		);

                    })
                    
                    .withPartPosition(VehiclePart.REAR_RIGHT_WHEEL, context -> {
                    	EntityVehicle entityVehicle = (EntityVehicle) context.getEntity();
                    	WheelSolver ws = entityVehicle.getSolver().rearAxel.rightWheel;
                    	float vertical = (float) ws.getRenderRideHeight();
                    	
                    	Positioners.position(
                    		    -3.799999f, /*vertical*/0.0f, 5.720000f,
                    		    (float) ws.getInterpolatedWheelRotation(), 0.000000f, 0.000000f,
                    		    0.000000f, 0.749999f, 0.000000f,
                    		    1.000000f, 1.000000f, 1.000000f
                    		);
                    })

                    
                    
                    
                    
                    .build(modContext, VehiclePart.MAIN);
            
    	}
    	// https://www.car.info/en-se/audi/a4/s4-6627162/specs
        return new EntityVehicleConfiguration.Builder()
        		
                .withName("audis4")
                .withEntityIdSupplier(() -> 10202)
                
                .withPhysicsConfig(new PhysicsConfiguration(
                		/* WHEELBASE (m)*/ 2.8194,
                		/* FRONT AREA (m^2) */ 2.2,
                		/* DRAG COEFF. */ 0.286,
                		/* MASS (kg) */ 1595,
                		/* COG HEIGHT */ 0.2,
                		/* DriveT EFF. */ 1.0,
                		/* Transmission */ PartInit.audiS4B7Transmission,
                		/* Engine */ new AudiS4Engine("4.2L V8 BBK", "Audi", 5000, 4603, 1019),
                		/* Real Dimensions (L*W*H)*/ new Dimensions(4.703, 1.826, 1.427),
                		/* Dimensions */ new Vec3d(/*length*/ 6, /*width*/ 3, /*height*/ 2), 
                		/* Chassis */ Chassis.SEDAN,
                		/* Shift pattern */ PartInit.STANDARD_SIX_SHIFT)
                		
                		.buildStructure()
                		
                		.withAxels(new WheelAxel(0.5, false)
                					.withWheels(new WheelSolver(new TyreSize("235/40R18"), 75.0, false)
                										.withRelativePosition(new Vec3d(-1.7, 0.0, 1.75)),
                						        new WheelSolver(new TyreSize("235/40R18"), 75.0, false)
                						        		.withRelativePosition(new Vec3d(0.5, 0.0, 1.75))),
                				
            
                				   new WheelAxel(-0.5, true)
                				     .withWheels(new WheelSolver(new TyreSize("235/40R18"), 75.0, false)
                				    		 			.withRelativePosition(new Vec3d(-1.7, 0.0, -1.75)),
                				    		     new WheelSolver(new TyreSize("235/40R18"), 75.0, false)
                				    		     		.withRelativePosition(new Vec3d(0.5, 0.0, -1.75)))
                             		)
                		.compileStructure()
                		
                		
                	)
                
                .withBackfireSound("carbackfire1")
                .withGearshiftSound("gearshift4")
                .withEnterSound("vehicle-enter")
                .withShiftSettings(true, true)
                .withExitSound("vehicle-exit")
                .withRunSound("audi_s4_engine")
                .withIdleSound("audi_s4_rev")
                .withRevSounds("audi_s4_rev$")
                .withConstantRevSound("audi_s4_max_rev")
                .withOBBDimensions(3.5, 2.5, 1.75)
                .withSeat(new Vec3d(0.0, -0.2, 0.0))
                .withSeat(new Vec3d(0.5, -0.2, 0.0))
                .withRenderer(renderer)
                .build(ModernWarfareMod.MOD_CONTEXT);
    }

}
