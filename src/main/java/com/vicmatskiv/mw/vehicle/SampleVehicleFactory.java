package com.vicmatskiv.mw.vehicle;

import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.models.ATV;
import com.vicmatskiv.mw.models.SampleVehicleControlArm;
import com.vicmatskiv.mw.models.SampleVehicleSteeringWheel;
import com.vicmatskiv.mw.models.Wheel;
import com.vicmatskiv.weaponlib.EntityConfiguration;
import com.vicmatskiv.weaponlib.ModContext;
import com.vicmatskiv.weaponlib.vehicle.EntityVehicle;
import com.vicmatskiv.weaponlib.vehicle.EntityVehicleConfiguration;
import com.vicmatskiv.weaponlib.vehicle.Positioners;
import com.vicmatskiv.weaponlib.vehicle.StatefulRenderer;
import com.vicmatskiv.weaponlib.vehicle.VehiclePart;
import com.vicmatskiv.weaponlib.vehicle.VehicleRenderableState;
import com.vicmatskiv.weaponlib.vehicle.VehicleRendererBuilder;

public class SampleVehicleFactory implements VehicleFactory {

    public EntityConfiguration createVehicle(ModContext modContext) {
        
        StatefulRenderer<VehicleRenderableState> renderer = new VehicleRendererBuilder()
                
                .withPartTexturedModel(VehiclePart.MAIN, ATV::new, "atv")
                .withPartTexturedModel(VehiclePart.STEERING_WHEEL, SampleVehicleSteeringWheel::new, "sample-vehicle")
                .withPartTexturedModel(VehiclePart.FRONT_LEFT_CONTROL_ARM, SampleVehicleControlArm::new, "sample-vehicle")
                .withPartTexturedModel(VehiclePart.FRONT_RIGHT_CONTROL_ARM, SampleVehicleControlArm::new, "sample-vehicle")
                .withPartTexturedModel(VehiclePart.FRONT_LEFT_WHEEL, Wheel::new, "wheel")
                .withPartTexturedModel(VehiclePart.FRONT_RIGHT_WHEEL, Wheel::new, "wheel")
                .withPartTexturedModel(VehiclePart.REAR_LEFT_WHEEL, Wheel::new, "wheel")
                .withPartTexturedModel(VehiclePart.REAR_RIGHT_WHEEL, Wheel::new, "wheel")

                // part positions
                
                .withPartPosition(VehiclePart.MAIN, c -> {
//                    GL11.glTranslatef(0.000000f, -1.449999f, 0f);
                    Positioners.position(
                            0.000000f, -1.400000f, -1.600000f,
                            0.000000f, 0.000000f, 0.000000f,
                            0.000000f, 0.000000f, 0.000000f,
                            1.200000f, 1.200000f, 1.200000f
                        );
                })

                .withPartPosition(VehiclePart.STEERING_WHEEL, context -> {
                    Positioners.position(
                            0.000000f, -0.150000f, 0.725000f,
                            0.000000f, context.getSymmetricProgress() * 90f, 0.000000f,
                            0.000000f, 0.000000f, 0.000000f,
                            1.000000f, 1.000000f, 1.000000f
                        );
//                    Positioners.position(
//                            -0.010000f, -1.035001f, -0.690000f,
//                            0.000000f, context.getSymmetricProgress() * 90f, 0.000000f,
//                            0.020000f, 0.000000f, 0.110000f,
//                            1.000000f, 1.000000f, 1.000000f
//                            );
                })

                .withPartPosition(VehiclePart.LEFT_HAND, VehicleRenderableState.IDLE, context -> {
                    Positioners.position(
                            0.1f, -0.85f, 2f,
                            0f, 0f, 0f, 
                            0.3f, 0.75f, -0.05f, 
                            1f, 1f, 1f);
                })

                .withPartPosition(VehiclePart.LEFT_HAND, VehicleRenderableState.DRIVING, context -> {
                    Positioners.position(
                            0.1f, -0.85f, 0.2f,
                            -90f, -100f * context.getSymmetricProgress(), 0f,
                            0.3f, 0.75f, -0.05f, 
                            1f, 1f, 1f);
                })

                .withPartPosition(VehiclePart.RIGHT_HAND, VehicleRenderableState.IDLE, context -> {
                    Positioners.position(
                            -0.200000f, -0.250000f, 1.249999f,
                            0.000000f, 0.000000f, 0.000000f,
                            0.000000f, 0.000000f, 0.000000f,
                            1.000000f, 1.000000f, 1.000000f);
                })
                .withPartPosition(VehiclePart.RIGHT_HAND, VehicleRenderableState.DRIVING, context -> {
                    Positioners.position(
                            -0.1f, -0.860000f, 0.100000f,
                            -90.000000f, -100f * context.getSymmetricProgress(), 0f,
                            -0.350000f, 0.785000f, -0.000000f,
                            1.000000f, 1.000000f, 1.000000f
                            );
                })
                
                .withPartPosition(VehiclePart.FRONT_LEFT_CONTROL_ARM, context -> {
                    Positioners.position(
                            0.050000f, -0.060000f, -0.1500000f,
                            0.000000f, context.getSymmetricProgress() * 80f - 180f, 0.000000f,
                            0.800000f, 0.000000f, 0.400000f,
                            1.000000f, 1.000000f, 1.000000f
                        );
//                    Positioners.position(
//                            -1.600001f, -0.000000f, 2.749997f,
//                            0.000000f, context.getSymmetricProgress() * 80f - 180f, 0.000000f,
//                            0.840000f, -0.600000f, -2.430000f,
//                            1.000000f, 1.000000f, 1.000000f
//                        );
//                    Positioners.position(
//                            0.049999f, 0.010000f, 0.000000f,
//                            0.000000f, context.getSymmetricProgress() * 80f, 0.000000f,
//                            0.510000f, 0.000000f, -1.169999f,
//                            1.000000f, 1.000000f, 1.000000f
//                        );
                })
                
                .withPartPosition(VehiclePart.FRONT_RIGHT_CONTROL_ARM, context -> {
                    Positioners.position(
                            -1.600001f, -0.000000f, 2.749997f,
                            0.000000f, context.getSymmetricProgress() * 80f - 180f, 0.000000f,
                            0.840000f, -0.600000f, -2.430000f,
                            1.000000f, 1.000000f, 1.000000f
                        );
                    
//                    Positioners.position(
//                            0.049999f - 1.000f, 0.010000f, 0.200000f,
//                            0.000000f, context.getSymmetricProgress() * 80f - 180f, 0.000000f,
//                            0.510000f, 0.000000f, -1.169999f,
//                            1.000000f, 1.000000f, 1.000000f
//                        );
                })
                
                .withPartPosition(VehiclePart.FRONT_LEFT_WHEEL, context -> {
                    EntityVehicle entityVehicle = (EntityVehicle) context.getEntity();
                    Positioners.position(
                            0.975000f, 0.095001f, 0.350003f,
                            entityVehicle.getWheelRotationAngle(), 0.000000f, 0.000000f,
                            0.000000f, 0.990000f, 0.030000f,
                            1.000000f, 1.000000f, 1.000000f
                        );
//                    Positioners.position(
//                            -0.035000f, -0.030000f, 0.055000f,
//                            context.getProgress() * 360f, 0.000000f, 0.000000f,
//                            0.660000f, 0.125000f, -1.130000f,
//                            1.000000f, 1.000000f, 1.000000f
//                            );
                })
                
                .withPartPosition(VehiclePart.FRONT_RIGHT_WHEEL, context -> {
                    EntityVehicle entityVehicle = (EntityVehicle) context.getEntity();
                    Positioners.position(
                            0.970000f, 0.089997f, -2.500000f,
                            entityVehicle.getWheelRotationAngle(), 0.000000f, 0.000000f,
                            -0.100000f, 0.965000f, 0.025000f,
                            1.000000f, 1.000000f, 1.000000f
                        );
                    
//                    EntityVehicle entityVehicle = (EntityVehicle) context.getEntity();
//                    Positioners.position(
//                            1.000000f, 0.140000f, -2.399999f,
//                            entityVehicle.getWheelRotationAngle() /*-context.getProgress() * 360f*/, 0.000000f, 0.000000f,
//                            0.000000f, 0.965000f, 0.030000f,
//                            1.000000f, 1.000000f, 1.000000f
//                        );
//                    Positioners.position(
//                            -0.035000f, -0.030000f, 0.055000f,
//                            -context.getProgress() * 360f, 0.000000f, 0.000000f,
//                            0.660000f, 0.125000f, -1.130000f,
//                            1.000000f, 1.000000f, 1.000000f
//                            );
                })

                .withPartPosition(VehiclePart.REAR_LEFT_WHEEL, context -> {
                    EntityVehicle entityVehicle = (EntityVehicle) context.getEntity();
                    Positioners.position(
                            0.875000f, 0.095001f, 2.550003f,
                            -entityVehicle.getWheelRotationAngle(), 0.000000f, 0.000000f,
                            -0.100000f, 0.965000f, 0.025000f,
                            1.000000f, 1.000000f, 1.000000f
                        );
//                    GL11.glScalef(0f, 0f, 0f);
//                    Positioners.position(
//                            -0.090000f, -0.030000f, 2.200000f,
//                            context.getProgress() * 360f, 0.000000f, 0.000000f,
//                            -0.110000f, 0.130000f, -1.120000f,
//                            1.000000f, 1.000000f, 1.000000f
//                            );
                })
                
                .withPartPosition(VehiclePart.REAR_RIGHT_WHEEL, context -> {
                    EntityVehicle entityVehicle = (EntityVehicle) context.getEntity();
                    Positioners.position(
                            -0.730000f, 0.089997f, 2.570000f,
                            -entityVehicle.getWheelRotationAngle(), 0.000000f, 0.000000f,
                            -0.100000f, 0.965000f, 0.025000f,
                            1.000000f, 1.000000f, 1.000000f
                        );
//                    GL11.glScalef(0f, 0f, 0f);
//                    Positioners.position(
//                            0.3000f, -0.030000f, 2.200000f,
//                            -context.getProgress() * 360f, 180.000000f, 0.000000f,
//                            -0.110000f, 0.130000f, -1.120000f,
//                            1.000000f, 1.000000f, 1.000000f
//                            );
                })

                .build(modContext, VehiclePart.MAIN);
        
        return new EntityVehicleConfiguration.Builder()
                .withName("vehicle")
                .withEntityIdSupplier(() -> 10201)
                .withSpawnEgg(0xA0A010, 0xA0A010)
                .withEnterSound("vehicle-enter")
                .withExitSound("vehicle-exit")
                .withRunSound("vehicle-driving")
                .withIdleSound("vehicle-idle")
                .withSeat()
                .withSeat()
                .withHandlingFactor(10)
                .withAccelerationIncrement(0.015)
                .withForwardDeccelerationFactor(0.97)
                .withRenderer(renderer)
                .build(ModernWarfareMod.MOD_CONTEXT);
    }

}
