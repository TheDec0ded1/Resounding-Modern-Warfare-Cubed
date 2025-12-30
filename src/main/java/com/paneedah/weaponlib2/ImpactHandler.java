package com.paneedah.weaponlib2;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

@FunctionalInterface
public interface ImpactHandler {

	void onImpact(World world, EntityPlayer player, WeaponSpawnEntity entity, RayTraceResult position);
}
