package com.vicmatskiv.mw;

import com.vicmatskiv.mw.vehicle.AudiS4Factory;
import com.vicmatskiv.mw.vehicle.SampleVehicleFactory;

public class Vehicles {
	
	public static void init(CommonProxy commonProxy) {
		new SampleVehicleFactory().createVehicle(ModernWarfareMod.MOD_CONTEXT);
		new AudiS4Factory().createVehicle(ModernWarfareMod.MOD_CONTEXT);
	}
}
