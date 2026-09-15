package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class OSV96SightsUp extends ModelBase {
	private final ModelRenderer irons_raised;
	private final ModelRenderer frontSightBlock;
	private final ModelRenderer ironsights_r1;
	private final ModelRenderer ironsights_r2;
	private final ModelRenderer ironsights_r3;
	private final ModelRenderer ironsights_r4;
	private final ModelRenderer ironsights_r5;
	private final ModelRenderer ironsights_r6;
	private final ModelRenderer ironsights_r7;
	private final ModelRenderer sights;
	private final ModelRenderer IronsRaised;
	private final ModelRenderer cube_r189;
	private final ModelRenderer cube_r190;
	private final ModelRenderer cube_r191;
	private final ModelRenderer cube_r192;
	private final ModelRenderer cube_r193;
	private final ModelRenderer cube_r194;

	public OSV96SightsUp() {
		textureWidth = 688;
		textureHeight = 688;

		irons_raised = new ModelRenderer(this);
		irons_raised.setRotationPoint(0.0F, -43.6F, 71.45F);
		

		frontSightBlock = new ModelRenderer(this);
		frontSightBlock.setRotationPoint(0.0F, 0.0F, -1.0F);
		irons_raised.addChild(frontSightBlock);
		

		ironsights_r1 = new ModelRenderer(this);
		ironsights_r1.setRotationPoint(-1.5F, 17.8877F, -215.1403F);
		frontSightBlock.addChild(ironsights_r1);
		setRotationAngle(ironsights_r1, 0.0F, -1.5708F, 0.0F);
		ironsights_r1.cubeList.add(new ModelBox(ironsights_r1, 668, 515, -0.375F, 2.3F, -1.0F, 1, 1, 2, -0.1F, false));

		ironsights_r2 = new ModelRenderer(this);
		ironsights_r2.setRotationPoint(-1.5F, 18.8877F, -214.4153F);
		frontSightBlock.addChild(ironsights_r2);
		setRotationAngle(ironsights_r2, 0.0F, -1.5708F, 0.0F);
		ironsights_r2.cubeList.add(new ModelBox(ironsights_r2, 132, 640, -1.4F, 1.0F, -1.0F, 1, 7, 2, -0.2F, false));

		ironsights_r3 = new ModelRenderer(this);
		ironsights_r3.setRotationPoint(-0.299F, 18.0129F, -215.0153F);
		frontSightBlock.addChild(ironsights_r3);
		setRotationAngle(ironsights_r3, 0.0F, -1.5708F, -0.48F);
		ironsights_r3.cubeList.add(new ModelBox(ironsights_r3, 668, 512, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r4 = new ModelRenderer(this);
		ironsights_r4.setRotationPoint(-1.814F, 18.4746F, -215.0153F);
		frontSightBlock.addChild(ironsights_r4);
		setRotationAngle(ironsights_r4, 0.0F, -1.5708F, 0.48F);
		ironsights_r4.cubeList.add(new ModelBox(ironsights_r4, 668, 509, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r5 = new ModelRenderer(this);
		ironsights_r5.setRotationPoint(0.1627F, 19.4467F, -215.0153F);
		frontSightBlock.addChild(ironsights_r5);
		setRotationAngle(ironsights_r5, 0.0F, -1.5708F, 0.48F);
		ironsights_r5.cubeList.add(new ModelBox(ironsights_r5, 668, 506, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r6 = new ModelRenderer(this);
		ironsights_r6.setRotationPoint(-2.2757F, 18.985F, -215.0153F);
		frontSightBlock.addChild(ironsights_r6);
		setRotationAngle(ironsights_r6, 0.0F, -1.5708F, -0.48F);
		ironsights_r6.cubeList.add(new ModelBox(ironsights_r6, 668, 503, -1.0F, -0.5F, 0.0F, 2, 2, 1, -0.4F, false));

		ironsights_r7 = new ModelRenderer(this);
		ironsights_r7.setRotationPoint(-1.5F, 18.8877F, -214.8403F);
		frontSightBlock.addChild(ironsights_r7);
		setRotationAngle(ironsights_r7, 0.0F, -1.5708F, 0.0F);
		ironsights_r7.cubeList.add(new ModelBox(ironsights_r7, 602, 628, -0.375F, 1.0F, -1.0F, 1, 7, 2, -0.2F, false));

		sights = new ModelRenderer(this);
		sights.setRotationPoint(0.0F, -35.9F, -146.35F);
		irons_raised.addChild(sights);
		sights.cubeList.add(new ModelBox(sights, 282, 642, -2.0F, 54.4F, -70.1F, 1, 2, 1, -0.4F, false));

		IronsRaised = new ModelRenderer(this);
		IronsRaised.setRotationPoint(-1.5F, -3.8107F, -117.2606F);
		irons_raised.addChild(IronsRaised);
		IronsRaised.cubeList.add(new ModelBox(IronsRaised, 362, 668, -0.5F, 21.5607F, -0.5894F, 1, 1, 2, -0.35F, false));
		IronsRaised.cubeList.add(new ModelBox(IronsRaised, 668, 485, -0.8F, 21.5607F, -0.5894F, 1, 1, 2, -0.35F, false));
		IronsRaised.cubeList.add(new ModelBox(IronsRaised, 668, 488, -0.2F, 21.5607F, -0.5894F, 1, 1, 2, -0.35F, false));
		IronsRaised.cubeList.add(new ModelBox(IronsRaised, 666, 154, -1.1F, 21.7607F, -0.5394F, 1, 2, 2, -0.4F, false));
		IronsRaised.cubeList.add(new ModelBox(IronsRaised, 368, 666, 0.1F, 21.7607F, -0.5394F, 1, 2, 2, -0.4F, false));
		IronsRaised.cubeList.add(new ModelBox(IronsRaised, 666, 136, -1.0F, 22.9107F, -0.6394F, 2, 1, 2, -0.3F, false));
		IronsRaised.cubeList.add(new ModelBox(IronsRaised, 256, 654, -1.0F, 24.1107F, -0.6384F, 2, 5, 2, -0.3F, false));
		IronsRaised.cubeList.add(new ModelBox(IronsRaised, 282, 665, -1.0F, 23.4107F, -0.6384F, 2, 4, 2, -0.1F, false));

		cube_r189 = new ModelRenderer(this);
		cube_r189.setRotationPoint(-1.1F, -30.4893F, -0.5394F);
		IronsRaised.addChild(cube_r189);
		setRotationAngle(cube_r189, 0.0F, 0.0F, 0.7854F);
		cube_r189.cubeList.add(new ModelBox(cube_r189, 102, 669, 37.9717F, 36.9716F, -0.001F, 1, 1, 2, -0.4F, false));
		cube_r189.cubeList.add(new ModelBox(cube_r189, 146, 669, 37.7717F, 36.9716F, -0.001F, 1, 1, 2, -0.4F, false));

		cube_r190 = new ModelRenderer(this);
		cube_r190.setRotationPoint(1.1F, -30.4893F, -0.5394F);
		IronsRaised.addChild(cube_r190);
		setRotationAngle(cube_r190, 0.0F, 0.0F, -0.7854F);
		cube_r190.cubeList.add(new ModelBox(cube_r190, 152, 669, -38.9717F, 36.9716F, -0.001F, 1, 1, 2, -0.4F, false));
		cube_r190.cubeList.add(new ModelBox(cube_r190, 158, 669, -38.7717F, 36.9716F, -0.001F, 1, 1, 2, -0.4F, false));

		cube_r191 = new ModelRenderer(this);
		cube_r191.setRotationPoint(-1.15F, -31.5893F, -0.5394F);
		IronsRaised.addChild(cube_r191);
		setRotationAngle(cube_r191, 0.0F, 0.0F, -0.7854F);
		cube_r191.cubeList.add(new ModelBox(cube_r191, 668, 491, -38.0417F, 37.9756F, -0.048F, 1, 1, 2, -0.35F, false));
		cube_r191.cubeList.add(new ModelBox(cube_r191, 668, 494, -37.9867F, 37.9766F, -0.049F, 1, 1, 2, -0.35F, false));

		cube_r192 = new ModelRenderer(this);
		cube_r192.setRotationPoint(-1.1F, -31.4893F, -0.5394F);
		IronsRaised.addChild(cube_r192);
		setRotationAngle(cube_r192, 0.0F, 0.0F, -0.7854F);
		cube_r192.cubeList.add(new ModelBox(cube_r192, 164, 669, -38.1717F, 37.9716F, -0.001F, 1, 1, 2, -0.4F, false));
		cube_r192.cubeList.add(new ModelBox(cube_r192, 170, 669, -37.9717F, 37.9716F, -0.001F, 1, 1, 2, -0.4F, false));

		cube_r193 = new ModelRenderer(this);
		cube_r193.setRotationPoint(1.1F, -31.4893F, -0.5394F);
		IronsRaised.addChild(cube_r193);
		setRotationAngle(cube_r193, 0.0F, 0.0F, 0.7854F);
		cube_r193.cubeList.add(new ModelBox(cube_r193, 176, 669, 36.9717F, 37.9716F, -0.001F, 1, 1, 2, -0.4F, false));
		cube_r193.cubeList.add(new ModelBox(cube_r193, 238, 669, 37.1717F, 37.9716F, -0.001F, 1, 1, 2, -0.4F, false));

		cube_r194 = new ModelRenderer(this);
		cube_r194.setRotationPoint(1.15F, -31.5893F, -0.5394F);
		IronsRaised.addChild(cube_r194);
		setRotationAngle(cube_r194, 0.0F, 0.0F, 0.7854F);
		cube_r194.cubeList.add(new ModelBox(cube_r194, 668, 497, 37.0417F, 37.9756F, -0.048F, 1, 1, 2, -0.35F, false));
		cube_r194.cubeList.add(new ModelBox(cube_r194, 668, 500, 36.9867F, 37.9766F, -0.049F, 1, 1, 2, -0.35F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		irons_raised.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}