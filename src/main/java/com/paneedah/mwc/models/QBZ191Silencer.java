package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QBZ191Silencer extends ModelBase {
	private final ModelRenderer QBZ191;
	private final ModelRenderer bone38;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer WIP5;
	private final ModelRenderer bone39;
	private final ModelRenderer bone40;
	private final ModelRenderer bone41;
	private final ModelRenderer bone42;
	private final ModelRenderer bone43;
	private final ModelRenderer bone44;
	private final ModelRenderer bone45;
	private final ModelRenderer bone46;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;

	public QBZ191Silencer() {
		textureWidth = 224;
		textureHeight = 224;

		QBZ191 = new ModelRenderer(this);
		QBZ191.setRotationPoint(0.498F, 15.5153F, -85.6831F);
		

		bone38 = new ModelRenderer(this);
		bone38.setRotationPoint(0.0F, 0.0F, 12.0F);
		QBZ191.addChild(bone38);
		bone38.cubeList.add(new ModelBox(bone38, 154, 166, -3.498F, -30.55F, -10.9F, 3, 3, 12, -0.1F, false));
		bone38.cubeList.add(new ModelBox(bone38, 34, 167, -1.5181F, -28.5701F, -10.9F, 3, 3, 12, -0.1F, false));
		bone38.cubeList.add(new ModelBox(bone38, 0, 178, -5.4779F, -28.5701F, -10.9F, 3, 3, 12, -0.1F, false));
		bone38.cubeList.add(new ModelBox(bone38, 180, 0, -3.498F, -26.5902F, -10.9F, 3, 3, 12, -0.1F, false));
		bone38.cubeList.add(new ModelBox(bone38, 0, 145, -3.498F, -30.45F, -23.9F, 3, 3, 14, -0.15F, false));
		bone38.cubeList.add(new ModelBox(bone38, 146, 0, -1.5888F, -28.5408F, -23.9F, 3, 3, 14, -0.15F, false));
		bone38.cubeList.add(new ModelBox(bone38, 146, 17, -5.4072F, -28.5408F, -23.9F, 3, 3, 14, -0.15F, false));
		bone38.cubeList.add(new ModelBox(bone38, 146, 34, -3.498F, -26.6316F, -23.9F, 3, 3, 14, -0.15F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0591F, -24.9837F, -16.9F);
		bone38.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 162, -1.5F, -1.5F, -7.0F, 3, 2, 14, -0.15F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-5.4693F, -24.9837F, -16.9F);
		bone38.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -0.7854F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 122, 166, 0.5F, -0.5F, -7.0F, 2, 3, 14, -0.15F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-1.3551F, -29.0979F, -16.9F);
		bone38.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.7854F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 90, 166, -0.5F, -0.5F, -7.0F, 2, 3, 14, -0.15F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-4.0551F, -29.0979F, -16.9F);
		bone38.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.7854F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 146, 51, -1.5F, -0.5F, -7.0F, 3, 2, 14, -0.15F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.1091F, -24.963F, -5.9F);
		bone38.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -0.7854F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 180, 29, -1.5F, -1.5F, -5.0F, 3, 2, 12, -0.1F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-5.5193F, -24.963F, -5.9F);
		bone38.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, -0.7854F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 180, 143, 0.5F, -0.5F, -5.0F, 2, 3, 12, -0.1F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-1.3051F, -29.1772F, -5.9F);
		bone38.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -0.7854F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 180, 43, -0.5F, -0.5F, -5.0F, 2, 3, 12, -0.1F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-4.1051F, -29.1772F, -5.9F);
		bone38.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, -0.7854F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 180, 15, -1.5F, -0.5F, -5.0F, 3, 2, 12, -0.1F, false));

		WIP5 = new ModelRenderer(this);
		WIP5.setRotationPoint(0.002F, -29.8F, 6.5F);
		QBZ191.addChild(WIP5);
		

		bone39 = new ModelRenderer(this);
		bone39.setRotationPoint(-0.502F, 34.0284F, 20.0F);
		WIP5.addChild(bone39);
		

		bone40 = new ModelRenderer(this);
		bone40.setRotationPoint(3.0F, 0.2117F, 0.0F);
		WIP5.addChild(bone40);
		setRotationAngle(bone40, 0.0F, 0.0F, 0.7854F);
		

		bone41 = new ModelRenderer(this);
		bone41.setRotationPoint(-0.5589F, 0.9888F, 0.0F);
		WIP5.addChild(bone41);
		setRotationAngle(bone41, 0.0F, 0.0F, 1.5708F);
		

		bone42 = new ModelRenderer(this);
		bone42.setRotationPoint(-0.3266F, 2.2789F, 0.0F);
		WIP5.addChild(bone42);
		setRotationAngle(bone42, 0.0F, 0.0F, 2.3562F);
		

		bone43 = new ModelRenderer(this);
		bone43.setRotationPoint(-1.0746F, 3.3553F, 0.0F);
		WIP5.addChild(bone43);
		setRotationAngle(bone43, 0.0F, 0.0F, -3.1416F);
		

		bone44 = new ModelRenderer(this);
		bone44.setRotationPoint(-1.0746F, 3.3553F, 0.0F);
		WIP5.addChild(bone44);
		setRotationAngle(bone44, 0.0F, 0.0F, -2.3562F);
		

		bone45 = new ModelRenderer(this);
		bone45.setRotationPoint(-3.4411F, 2.8396F, 0.0F);
		WIP5.addChild(bone45);
		setRotationAngle(bone45, 0.0F, 0.0F, -1.5708F);
		

		bone46 = new ModelRenderer(this);
		bone46.setRotationPoint(-0.043F, -22.3486F, 12.4731F);
		QBZ191.addChild(bone46);
		setRotationAngle(bone46, 0.0F, 0.0F, -3.1416F);
		

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-12.8667F, -0.42F, -6.19F);
		bone46.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.8901F);
		

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-11.2667F, -0.42F, -6.19F);
		bone46.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -0.8901F);
		
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		QBZ191.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}