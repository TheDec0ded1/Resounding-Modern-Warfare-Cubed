package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class OSV96SightsDown extends ModelBase {
	private final ModelRenderer irons_folded;
	private final ModelRenderer bone;
	private final ModelRenderer frontSightBlock2;
	private final ModelRenderer ironsights_r1;
	private final ModelRenderer ironsights_r2;
	private final ModelRenderer ironsights_r3;
	private final ModelRenderer ironsights_r4;
	private final ModelRenderer ironsights_r5;
	private final ModelRenderer ironsights_r6;
	private final ModelRenderer ironsights_r7;
	private final ModelRenderer sights2;
	private final ModelRenderer IronsRaised2;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;

	public OSV96SightsDown() {
		textureWidth = 688;
		textureHeight = 688;

		irons_folded = new ModelRenderer(this);
		irons_folded.setRotationPoint(0.0F, -43.6F, 71.45F);
		

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-1.5F, 26.0469F, -209.9827F);
		irons_folded.addChild(bone);
		setRotationAngle(bone, -1.5708F, 0.0F, 0.0F);
		

		frontSightBlock2 = new ModelRenderer(this);
		frontSightBlock2.setRotationPoint(0.0F, 0.5469F, -0.0327F);
		bone.addChild(frontSightBlock2);
		

		ironsights_r1 = new ModelRenderer(this);
		ironsights_r1.setRotationPoint(0.0F, -2.706F, -0.125F);
		frontSightBlock2.addChild(ironsights_r1);
		setRotationAngle(ironsights_r1, 0.0F, -1.5708F, 0.0F);
		ironsights_r1.cubeList.add(new ModelBox(ironsights_r1, 668, 579, -0.375F, 2.3F, -1.0F, 1, 1, 2, -0.1F, false));

		ironsights_r2 = new ModelRenderer(this);
		ironsights_r2.setRotationPoint(0.0F, -1.706F, 0.6F);
		frontSightBlock2.addChild(ironsights_r2);
		setRotationAngle(ironsights_r2, 0.0F, -1.5708F, 0.0F);
		ironsights_r2.cubeList.add(new ModelBox(ironsights_r2, 578, 663, -1.4F, 1.0F, -1.0F, 1, 7, 2, -0.2F, false));

		ironsights_r3 = new ModelRenderer(this);
		ironsights_r3.setRotationPoint(1.201F, -2.5809F, 0.0F);
		frontSightBlock2.addChild(ironsights_r3);
		setRotationAngle(ironsights_r3, 0.0F, -1.5708F, -0.48F);
		ironsights_r3.cubeList.add(new ModelBox(ironsights_r3, 568, 668, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r4 = new ModelRenderer(this);
		ironsights_r4.setRotationPoint(-0.314F, -2.1191F, 0.0F);
		frontSightBlock2.addChild(ironsights_r4);
		setRotationAngle(ironsights_r4, 0.0F, -1.5708F, 0.48F);
		ironsights_r4.cubeList.add(new ModelBox(ironsights_r4, 668, 562, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r5 = new ModelRenderer(this);
		ironsights_r5.setRotationPoint(1.6627F, -1.1471F, 0.0F);
		frontSightBlock2.addChild(ironsights_r5);
		setRotationAngle(ironsights_r5, 0.0F, -1.5708F, 0.48F);
		ironsights_r5.cubeList.add(new ModelBox(ironsights_r5, 668, 559, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r6 = new ModelRenderer(this);
		ironsights_r6.setRotationPoint(-0.7757F, -1.6088F, 0.0F);
		frontSightBlock2.addChild(ironsights_r6);
		setRotationAngle(ironsights_r6, 0.0F, -1.5708F, -0.48F);
		ironsights_r6.cubeList.add(new ModelBox(ironsights_r6, 668, 518, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r7 = new ModelRenderer(this);
		ironsights_r7.setRotationPoint(0.0F, -1.706F, 0.175F);
		frontSightBlock2.addChild(ironsights_r7);
		setRotationAngle(ironsights_r7, 0.0F, -1.5708F, 0.0F);
		ironsights_r7.cubeList.add(new ModelBox(ironsights_r7, 256, 661, -0.375F, 1.0F, -1.0F, 1, 7, 2, -0.2F, false));

		sights2 = new ModelRenderer(this);
		sights2.setRotationPoint(0.0F, -0.5469F, 0.0327F);
		bone.addChild(sights2);
		sights2.cubeList.add(new ModelBox(sights2, 410, 644, -0.5F, -1.0F, -0.5F, 1, 2, 1, -0.4F, false));

		IronsRaised2 = new ModelRenderer(this);
		IronsRaised2.setRotationPoint(-1.5F, 24.7893F, -145.2606F);
		irons_folded.addChild(IronsRaised2);
		setRotationAngle(IronsRaised2, 1.5708F, 0.0F, 0.0F);
		IronsRaised2.cubeList.add(new ModelBox(IronsRaised2, 668, 582, -0.5F, 21.5607F, -0.5894F, 1, 1, 2, -0.35F, false));
		IronsRaised2.cubeList.add(new ModelBox(IronsRaised2, 668, 585, -0.8F, 21.5607F, -0.5894F, 1, 1, 2, -0.35F, false));
		IronsRaised2.cubeList.add(new ModelBox(IronsRaised2, 668, 588, -0.2F, 21.5607F, -0.5894F, 1, 1, 2, -0.35F, false));
		IronsRaised2.cubeList.add(new ModelBox(IronsRaised2, 666, 661, -1.1F, 21.7607F, -0.5394F, 1, 2, 2, -0.4F, false));
		IronsRaised2.cubeList.add(new ModelBox(IronsRaised2, 666, 665, 0.1F, 21.7607F, -0.5394F, 1, 2, 2, -0.4F, false));
		IronsRaised2.cubeList.add(new ModelBox(IronsRaised2, 666, 139, -1.0F, 22.9107F, -0.6394F, 2, 1, 2, -0.3F, false));
		IronsRaised2.cubeList.add(new ModelBox(IronsRaised2, 664, 174, -1.0F, 24.1107F, -0.6384F, 2, 5, 2, -0.3F, false));
		IronsRaised2.cubeList.add(new ModelBox(IronsRaised2, 290, 665, -1.0F, 23.4107F, -0.6384F, 2, 4, 2, -0.1F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.1F, -30.4893F, -0.5394F);
		IronsRaised2.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.7854F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 668, 645, 37.9717F, 36.9716F, -0.001F, 1, 1, 2, -0.4F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 668, 648, 37.7717F, 36.9716F, -0.001F, 1, 1, 2, -0.4F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(1.1F, -30.4893F, -0.5394F);
		IronsRaised2.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.7854F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 668, 651, -38.9717F, 36.9716F, -0.001F, 1, 1, 2, -0.4F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 48, 669, -38.7717F, 36.9716F, -0.001F, 1, 1, 2, -0.4F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-1.15F, -31.5893F, -0.5394F);
		IronsRaised2.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.7854F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 54, 669, -38.0417F, 37.9756F, -0.048F, 1, 1, 2, -0.35F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 60, 669, -37.9867F, 37.9766F, -0.049F, 1, 1, 2, -0.35F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-1.1F, -31.4893F, -0.5394F);
		IronsRaised2.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, -0.7854F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 66, 669, -38.1717F, 37.9716F, -0.001F, 1, 1, 2, -0.4F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 72, 669, -37.9717F, 37.9716F, -0.001F, 1, 1, 2, -0.4F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(1.1F, -31.4893F, -0.5394F);
		IronsRaised2.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, 0.7854F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 78, 669, 36.9717F, 37.9716F, -0.001F, 1, 1, 2, -0.4F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 84, 669, 37.1717F, 37.9716F, -0.001F, 1, 1, 2, -0.4F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(1.15F, -31.5893F, -0.5394F);
		IronsRaised2.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.0F, 0.7854F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 90, 669, 37.0417F, 37.9756F, -0.048F, 1, 1, 2, -0.35F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 96, 669, 36.9867F, 37.9766F, -0.049F, 1, 1, 2, -0.35F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		irons_folded.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}