package com.paneedah.mwc.vehicle;

import com.paneedah.mwc.ModernWarfareMod;
import com.paneedah.mwc.models.VehicleKey;
import com.paneedah.mwc.models.VehicleLock;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.weaponlib2.render.QRL;
import com.paneedah.weaponlib2.vehicle.AccessibleVehicleGUI;
import com.paneedah.weaponlib2.vehicle.GeneralVehicleSounds;

public class Vehicles {
	
	public static void init(CommonProxy commonProxy) {

		// Panda: Is this still the case? I don't think so.

		// due to the fact that advanced warfare cannot be accessed from
		// weaponlib2, here are things that need to be set from this end.
		GeneralVehicleSounds.setup(ModernWarfareMod.MOD_CONTEXT);
		AccessibleVehicleGUI.remotelySetModels(new VehicleKey(), new VehicleLock(),
				QRL.quickLoc("gui", "vehiclekey"), QRL.quickLoc("gui", "keylock"));
		
		//new SampleVehicleFactory().createVehicle(ModernWarfareMod.MOD_CONTEXT);
		new AudiS4Factory().createVehicle(ModernWarfareMod.MOD_CONTEXT);
		new McLarenSennaFactory().createVehicle(ModernWarfareMod.MOD_CONTEXT);
		new AE86TruenoFactory().createVehicle(ModernWarfareMod.MOD_CONTEXT);
		new ATVFactory().createVehicle(ModernWarfareMod.MOD_CONTEXT);
	}
}
