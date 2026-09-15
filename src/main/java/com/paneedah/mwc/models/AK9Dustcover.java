package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AK9Dustcover extends ModelBase {
	private final ModelRenderer dustcover;
	private final ModelRenderer cube_r1;
	private final ModelRenderer DustCover40;
	private final ModelRenderer DustCover39;
	private final ModelRenderer DustCover43;
	private final ModelRenderer DustCover41;
	private final ModelRenderer DustCover42;
	private final ModelRenderer DustCover8;
	private final ModelRenderer DustCover9;
	private final ModelRenderer DustCover10;
	private final ModelRenderer DustCover44;
	private final ModelRenderer DustCover5;
	private final ModelRenderer DustCover22;
	private final ModelRenderer DustCover35;
	private final ModelRenderer DustCover3;
	private final ModelRenderer DustCover2;
	private final ModelRenderer DustCover4;
	private final ModelRenderer DustCover1;
	private final ModelRenderer DustCover16;
	private final ModelRenderer DustCover47;
	private final ModelRenderer DustCover15;
	private final ModelRenderer DustCover21;
	private final ModelRenderer DustCover14;
	private final ModelRenderer DustCover36;
	private final ModelRenderer DustCover12;
	private final ModelRenderer DustCover11;
	private final ModelRenderer DustCover13;
	private final ModelRenderer DustCover20;
	private final ModelRenderer DustCover38;
	private final ModelRenderer DustCover37;
	private final ModelRenderer DustCover18;
	private final ModelRenderer DustCover17;
	private final ModelRenderer DustCover19;

	public AK9Dustcover() {
		textureWidth = 320;
		textureHeight = 320;

		dustcover = new ModelRenderer(this);
		dustcover.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.8833F, -38.0523F, -32.5F);
		dustcover.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.5672F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 100, 71, -1.0F, -2.0F, 3.0F, 1, 1, 8, 0.0F, false));

		DustCover40 = new ModelRenderer(this);
		DustCover40.setRotationPoint(-3.7F, -37.5F, 2.2F);
		dustcover.addChild(DustCover40);
		setRotationAngle(DustCover40, -0.9295F, 0.0F, 0.0F);
		DustCover40.cubeList.add(new ModelBox(DustCover40, 266, 17, 0.001F, 0.0F, 0.0F, 2, 2, 2, 0.0F, false));

		DustCover39 = new ModelRenderer(this);
		DustCover39.setRotationPoint(-1.3F, -37.5F, 2.2F);
		dustcover.addChild(DustCover39);
		setRotationAngle(DustCover39, -0.9295F, 0.0F, 0.0F);
		DustCover39.cubeList.add(new ModelBox(DustCover39, 282, 115, -0.001F, 0.0F, 0.0F, 2, 2, 2, 0.0F, false));

		DustCover43 = new ModelRenderer(this);
		DustCover43.setRotationPoint(-1.2F, -39.3F, 0.88F);
		dustcover.addChild(DustCover43);
		setRotationAngle(DustCover43, -0.9295F, 0.0F, 0.0F);
		DustCover43.cubeList.add(new ModelBox(DustCover43, 298, 249, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		DustCover41 = new ModelRenderer(this);
		DustCover41.setRotationPoint(-2.8F, -39.3F, 0.88F);
		dustcover.addChild(DustCover41);
		setRotationAngle(DustCover41, -0.9295F, 0.0F, 0.0F);
		DustCover41.cubeList.add(new ModelBox(DustCover41, 0, 305, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		DustCover42 = new ModelRenderer(this);
		DustCover42.setRotationPoint(-2.0F, -39.8F, 0.5F);
		dustcover.addChild(DustCover42);
		setRotationAngle(DustCover42, -0.9295F, 0.0F, 0.0F);
		DustCover42.cubeList.add(new ModelBox(DustCover42, 254, 183, 0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));

		DustCover8 = new ModelRenderer(this);
		DustCover8.setRotationPoint(-3.9F, -37.5F, -21.5F);
		dustcover.addChild(DustCover8);
		setRotationAngle(DustCover8, 0.0F, 0.0F, -0.7808F);
		DustCover8.cubeList.add(new ModelBox(DustCover8, 256, 17, 0.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, false));

		DustCover9 = new ModelRenderer(this);
		DustCover9.setRotationPoint(-3.9F, -37.5F, -21.5F);
		dustcover.addChild(DustCover9);
		DustCover9.cubeList.add(new ModelBox(DustCover9, 292, 278, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		DustCover10 = new ModelRenderer(this);
		DustCover10.setRotationPoint(-3.8F, -37.5F, -19.1F);
		dustcover.addChild(DustCover10);
		setRotationAngle(DustCover10, 0.0F, 0.0F, -0.7436F);
		DustCover10.cubeList.add(new ModelBox(DustCover10, 144, 271, 0.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		DustCover44 = new ModelRenderer(this);
		DustCover44.setRotationPoint(-3.7F, -37.5F, -11.0F);
		dustcover.addChild(DustCover44);
		setRotationAngle(DustCover44, 0.0F, 0.0F, -0.7436F);
		DustCover44.cubeList.add(new ModelBox(DustCover44, 268, 254, 0.0F, 0.0F, 0.0F, 1, 1, 12, 0.0F, false));

		DustCover5 = new ModelRenderer(this);
		DustCover5.setRotationPoint(-2.8F, -39.2F, -21.5F);
		dustcover.addChild(DustCover5);
		setRotationAngle(DustCover5, 0.0F, 0.0F, 0.3346F);
		DustCover5.cubeList.add(new ModelBox(DustCover5, 0, 194, 0.0F, 0.0F, -0.001F, 1, 2, 22, 0.0F, false));

		DustCover22 = new ModelRenderer(this);
		DustCover22.setRotationPoint(0.7F, -37.5F, -25.0F);
		dustcover.addChild(DustCover22);
		setRotationAngle(DustCover22, 0.0F, 0.0F, 2.3051F);
		DustCover22.cubeList.add(new ModelBox(DustCover22, 142, 31, 0.0F, 0.0F, 0.0F, 1, 1, 26, 0.0F, false));

		DustCover35 = new ModelRenderer(this);
		DustCover35.setRotationPoint(0.8F, -37.5F, -33.5F);
		dustcover.addChild(DustCover35);
		setRotationAngle(DustCover35, 0.0F, 0.0F, 2.3051F);
		DustCover35.cubeList.add(new ModelBox(DustCover35, 236, 297, 0.0F, 0.0F, 4.0F, 1, 1, 5, 0.0F, false));

		DustCover3 = new ModelRenderer(this);
		DustCover3.setRotationPoint(-0.17F, -39.25F, -33.5F);
		dustcover.addChild(DustCover3);
		setRotationAngle(DustCover3, 0.0F, 0.0F, 1.3013F);
		DustCover3.cubeList.add(new ModelBox(DustCover3, 0, 80, 0.0F, 0.0F, 3.999F, 2, 1, 30, 0.0F, false));

		DustCover2 = new ModelRenderer(this);
		DustCover2.setRotationPoint(-1.0F, -39.8F, -33.5F);
		dustcover.addChild(DustCover2);
		setRotationAngle(DustCover2, 0.0F, 0.0F, 0.5949F);
		DustCover2.cubeList.add(new ModelBox(DustCover2, 80, 40, 0.0F, 0.0F, 4.0F, 1, 1, 30, 0.0F, false));

		DustCover4 = new ModelRenderer(this);
		DustCover4.setRotationPoint(-2.0F, -39.8F, -33.5F);
		dustcover.addChild(DustCover4);
		setRotationAngle(DustCover4, 0.0F, 0.0F, 0.9295F);
		DustCover4.cubeList.add(new ModelBox(DustCover4, 64, 80, 0.0F, 0.0F, 4.0F, 1, 1, 30, 0.0F, false));

		DustCover1 = new ModelRenderer(this);
		DustCover1.setRotationPoint(-2.0F, -39.8F, -33.5F);
		dustcover.addChild(DustCover1);
		DustCover1.cubeList.add(new ModelBox(DustCover1, 86, 0, 0.0F, 0.0F, 4.0F, 1, 1, 30, 0.0F, false));

		DustCover16 = new ModelRenderer(this);
		DustCover16.setRotationPoint(-3.8F, -37.2F, -8.1F);
		dustcover.addChild(DustCover16);
		

		DustCover47 = new ModelRenderer(this);
		DustCover47.setRotationPoint(-3.7F, -36.5F, -9.5F);
		dustcover.addChild(DustCover47);
		DustCover47.cubeList.add(new ModelBox(DustCover47, 24, 288, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		DustCover15 = new ModelRenderer(this);
		DustCover15.setRotationPoint(-3.7F, -36.5F, -9.1F);
		dustcover.addChild(DustCover15);
		DustCover15.cubeList.add(new ModelBox(DustCover15, 170, 283, -0.001F, 0.0F, 0.0F, 1, 1, 11, 0.0F, false));

		DustCover21 = new ModelRenderer(this);
		DustCover21.setRotationPoint(-0.2F, -37.2F, -22.5F);
		dustcover.addChild(DustCover21);
		

		DustCover14 = new ModelRenderer(this);
		DustCover14.setRotationPoint(-3.7F, -37.5F, -10.1F);
		dustcover.addChild(DustCover14);
		DustCover14.cubeList.add(new ModelBox(DustCover14, 276, 211, 0.0F, 0.0F, 0.0F, 1, 1, 12, 0.0F, false));

		DustCover36 = new ModelRenderer(this);
		DustCover36.setRotationPoint(-0.2F, -37.5F, -24.5F);
		dustcover.addChild(DustCover36);
		setRotationAngle(DustCover36, -1.1525F, 0.0F, 0.0F);
		DustCover36.cubeList.add(new ModelBox(DustCover36, 310, 229, 0.001F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		DustCover12 = new ModelRenderer(this);
		DustCover12.setRotationPoint(-3.8F, -37.5F, -10.1F);
		dustcover.addChild(DustCover12);
		setRotationAngle(DustCover12, -0.8923F, 0.0F, 0.0F);
		DustCover12.cubeList.add(new ModelBox(DustCover12, 24, 290, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		DustCover11 = new ModelRenderer(this);
		DustCover11.setRotationPoint(-3.8F, -37.5F, -19.1F);
		dustcover.addChild(DustCover11);
		DustCover11.cubeList.add(new ModelBox(DustCover11, 106, 297, 0.001F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		DustCover13 = new ModelRenderer(this);
		DustCover13.setRotationPoint(-3.8F, -35.0F, -9.5F);
		dustcover.addChild(DustCover13);
		setRotationAngle(DustCover13, 2.1935F, 0.0F, 0.0F);
		DustCover13.cubeList.add(new ModelBox(DustCover13, 310, 232, -0.001F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		DustCover20 = new ModelRenderer(this);
		DustCover20.setRotationPoint(-0.3F, -37.5F, -25.0F);
		dustcover.addChild(DustCover20);
		DustCover20.cubeList.add(new ModelBox(DustCover20, 58, 140, 0.0F, 0.0F, 0.0F, 1, 2, 27, 0.0F, false));

		DustCover38 = new ModelRenderer(this);
		DustCover38.setRotationPoint(-0.2F, -37.5F, -33.5F);
		dustcover.addChild(DustCover38);
		DustCover38.cubeList.add(new ModelBox(DustCover38, 298, 39, 0.0F, 0.0F, 4.0F, 1, 1, 5, 0.0F, false));

		DustCover37 = new ModelRenderer(this);
		DustCover37.setRotationPoint(-0.2F, -37.0F, -33.5F);
		dustcover.addChild(DustCover37);
		DustCover37.cubeList.add(new ModelBox(DustCover37, 42, 298, -0.001F, 0.0F, 4.0F, 1, 1, 5, 0.0F, false));

		DustCover18 = new ModelRenderer(this);
		DustCover18.setRotationPoint(-3.8F, -36.0F, 2.5F);
		dustcover.addChild(DustCover18);
		DustCover18.cubeList.add(new ModelBox(DustCover18, 244, 81, 0.0F, -0.001F, 0.001F, 4, 1, 1, 0.0F, false));

		DustCover17 = new ModelRenderer(this);
		DustCover17.setRotationPoint(-3.8F, -36.0F, -9.5F);
		dustcover.addChild(DustCover17);
		DustCover17.cubeList.add(new ModelBox(DustCover17, 284, 224, 0.0F, 0.0F, 0.0F, 1, 1, 12, 0.0F, false));

		DustCover19 = new ModelRenderer(this);
		DustCover19.setRotationPoint(-0.2F, -36.0F, -24.5F);
		dustcover.addChild(DustCover19);
		DustCover19.cubeList.add(new ModelBox(DustCover19, 0, 111, 0.0F, 0.0F, 0.0F, 1, 1, 28, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		dustcover.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}