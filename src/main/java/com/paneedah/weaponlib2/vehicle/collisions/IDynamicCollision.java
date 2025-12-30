package com.paneedah.weaponlib2.vehicle.collisions;

public interface IDynamicCollision {
	
	public OreintedBB getOreintedBoundingBox();
	public void updateOBB();
	public void doOBBCollision();

}
