package com.paneedah.weaponlib2.vehicle;

import com.paneedah.weaponlib2.ModContext;
import net.minecraft.util.SoundEvent;

public class GeneralVehicleSounds {
	
	public static ModContext cont;
	
	public static SoundEvent driftConcrete1;
	public static SoundEvent driftDirt1;
	public static SoundEvent driftGround1;
	
	
	public static void setup(ModContext c) {
		
		cont = c;
		
		driftConcrete1 = c.registerSound("drift_concrete");
		driftDirt1 = c.registerSound("drift_dirt");
		driftGround1 = c.registerSound("drift_ground");
		
	}
	
	

}
