package com.paneedah.weaponlib2.render;

import com.paneedah.mwc.utils.ModReference;
import net.minecraft.util.ResourceLocation;

public class QRL {
	
	public static ResourceLocation quickLoc(String folder, String name) {
		//new ResourceLocation(ModReference.id + ":textures/entity/vehicleshadow.png");
		return new ResourceLocation(ModReference.id + ":textures/" + folder + "/" + name + ".png");
	}

}
