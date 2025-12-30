package com.paneedah.weaponlib2;

import net.minecraft.entity.player.EntityPlayer;

public interface Reloadable {

	public void reloadMainHeldItemForPlayer(EntityPlayer player);
	
	public void unloadMainHeldItemForPlayer(EntityPlayer player);
}
