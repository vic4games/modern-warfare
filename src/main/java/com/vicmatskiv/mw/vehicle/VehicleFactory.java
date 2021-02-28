package com.vicmatskiv.mw.vehicle;

import com.vicmatskiv.weaponlib.EntityConfiguration;
import com.vicmatskiv.weaponlib.ModContext;

public interface VehicleFactory {

    public EntityConfiguration createVehicle(ModContext modContext);
}
