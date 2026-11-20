package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QBZ95Silencer extends ModelBase {
	private final ModelRenderer QBZ95;
	private final ModelRenderer bone11;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r10;
	private final ModelRenderer WIP3;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer bone12;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer bone13;
	private final ModelRenderer cube_r17;
	private final ModelRenderer bone23;
	private final ModelRenderer cube_r18;
	private final ModelRenderer bone24;
	private final ModelRenderer bone25;
	private final ModelRenderer bone26;
	private final ModelRenderer cube_r19;
	private final ModelRenderer bone27;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer bone28;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;

	public QBZ95Silencer() {
		textureWidth = 224;
		textureHeight = 224;

		QBZ95 = new ModelRenderer(this);
		QBZ95.setRotationPoint(0.498F, 16.0153F, -63.3831F);
		

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(0.0F, 0.0F, 12.0F);
		QBZ95.addChild(bone11);
		bone11.cubeList.add(new ModelBox(bone11, 116, 71, -3.498F, -30.425F, 1.1F, 3, 1, 1, -0.2F, false));
		bone11.cubeList.add(new ModelBox(bone11, 82, 175, 0.3405F, -28.5865F, 1.1F, 1, 3, 1, -0.2F, false));
		bone11.cubeList.add(new ModelBox(bone11, 178, 92, -5.3365F, -28.5865F, 1.1F, 1, 3, 1, -0.2F, false));
		bone11.cubeList.add(new ModelBox(bone11, 124, 71, -3.498F, -24.748F, 1.1F, 3, 1, 1, -0.2F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0091F, -25.0794F, 10.1F);
		bone11.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 124, 69, -1.5F, -0.5F, -9.0F, 3, 1, 1, -0.2F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-5.4193F, -25.0794F, 10.1F);
		bone11.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -0.7854F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 82, 167, 0.5F, -0.5F, -9.0F, 1, 3, 1, -0.2F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-1.4051F, -29.0936F, 10.1F);
		bone11.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.7854F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 174, 92, 0.5F, -0.5F, -9.0F, 1, 3, 1, -0.2F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-4.0051F, -29.0936F, 10.1F);
		bone11.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.7854F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 122, 96, -1.5F, -0.5F, -9.0F, 3, 1, 1, -0.2F, false));

		WIP3 = new ModelRenderer(this);
		WIP3.setRotationPoint(0.002F, -29.8F, 6.5F);
		QBZ95.addChild(WIP3);
		WIP3.cubeList.add(new ModelBox(WIP3, 50, 73, -4.6264F, 1.7264F, -11.6F, 1, 2, 23, 0.15F, false));
		WIP3.cubeList.add(new ModelBox(WIP3, 50, 25, -3.0F, 0.1F, -11.6F, 2, 1, 23, 0.15F, false));
		WIP3.cubeList.add(new ModelBox(WIP3, 0, 75, -0.3737F, 1.7264F, -11.6F, 1, 2, 23, 0.15F, false));
		WIP3.cubeList.add(new ModelBox(WIP3, 50, 49, -3.0F, 4.3527F, -11.6F, 2, 1, 23, 0.15F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.2107F, 4.2299F, 9.4F);
		WIP3.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, 0.7854F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 50, 0, -2.0F, -0.5F, -21.0F, 2, 2, 23, 0.15F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-0.4965F, 1.2228F, 9.4F);
		WIP3.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, 0.7854F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 50, -1.0F, -0.5F, -21.0F, 2, 2, 23, 0.15F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-2.7965F, 1.2228F, 25.4F);
		WIP3.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, 0.7854F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 25, -1.0F, -0.5F, -37.0F, 2, 2, 23, 0.15F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-3.5036F, 4.2299F, 25.4F);
		WIP3.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, 0.7854F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 0, -1.0F, -1.5F, -37.0F, 2, 2, 23, 0.15F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(-0.502F, 34.0284F, 20.0F);
		WIP3.addChild(bone12);
		

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-1.6828F, -28.0972F, -11.6F);
		bone12.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, -0.3927F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 186, 92, -1.0F, -1.5F, -1.0F, 1, 1, 4, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.376F, -33.0676F, -11.6F);
		bone12.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, -0.3927F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 72, 185, -1.0F, -1.5F, -1.0F, 1, 1, 4, 0.0F, false));

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(3.0F, 0.2117F, 0.0F);
		WIP3.addChild(bone13);
		setRotationAngle(bone13, 0.0F, 0.0F, 0.7854F);
		

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(6.6129F, 10.0573F, -2.6F);
		bone13.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, -0.3927F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 186, 97, -4.5207F, -9.9997F, 10.0F, 1, 1, 4, 0.0F, false));

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(-0.5589F, 0.9888F, 0.0F);
		WIP3.addChild(bone23);
		setRotationAngle(bone23, 0.0F, 0.0F, 1.5708F);
		

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(12.7987F, -0.3115F, -2.6F);
		bone23.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, -0.3927F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 186, 102, -9.4997F, -5.0207F, 10.0F, 1, 1, 4, 0.0F, false));

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(-0.3266F, 2.2789F, 0.0F);
		WIP3.addChild(bone24);
		setRotationAngle(bone24, 0.0F, 0.0F, 2.3562F);
		

		bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(-1.0746F, 3.3553F, 0.0F);
		WIP3.addChild(bone25);
		setRotationAngle(bone25, 0.0F, 0.0F, -3.1416F);
		

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(-1.0746F, 3.3553F, 0.0F);
		WIP3.addChild(bone26);
		setRotationAngle(bone26, 0.0F, 0.0F, -2.3562F);
		

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-3.5232F, -8.4585F, -2.6F);
		bone26.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, -0.3927F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 186, 107, 2.5207F, 6.9997F, 10.0F, 1, 1, 4, 0.0F, false));

		bone27 = new ModelRenderer(this);
		bone27.setRotationPoint(-3.4411F, 2.8396F, 0.0F);
		WIP3.addChild(bone27);
		setRotationAngle(bone27, 0.0F, 0.0F, -1.5708F);
		

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-4.8789F, 2.2746F, -2.6F);
		bone27.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, 0.3927F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 188, 72, 1.903F, -1.2833F, 10.0F, 1, 1, 4, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-6.9085F, 0.2158F, -2.6F);
		bone27.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, 0.3927F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 188, 67, 8.3701F, -3.962F, 10.0F, 1, 1, 4, 0.0F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-7.1999F, -0.3115F, -2.6F);
		bone27.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, -0.3927F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 186, 112, 7.4997F, 2.0207F, 10.0F, 1, 1, 4, 0.0F, false));

		bone28 = new ModelRenderer(this);
		bone28.setRotationPoint(-0.043F, -22.3486F, 12.4731F);
		QBZ95.addChild(bone28);
		setRotationAngle(bone28, 0.0F, 0.0F, -3.1416F);
		

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-12.8667F, -0.42F, -6.19F);
		bone28.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.8901F);
		

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-11.2667F, -0.42F, -6.19F);
		bone28.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.8901F);
		
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		QBZ95.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}