package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class ARPistolBufferTube extends ModelBase {
	private final ModelRenderer extension;
	private final ModelRenderer extension_r1;
	private final ModelRenderer extension_r2;
	private final ModelRenderer extension_r3;
	private final ModelRenderer extension_r4;
	private final ModelRenderer extension_r5;
	private final ModelRenderer extension_r6;
	private final ModelRenderer extension_r7;
	private final ModelRenderer extension_r8;
	private final ModelRenderer extension_r9;
	private final ModelRenderer extension_r10;
	private final ModelRenderer extension_r11;
	private final ModelRenderer extension_r12;
	private final ModelRenderer extension_r13;
	private final ModelRenderer extension_r14;
	private final ModelRenderer extension_r15;
	private final ModelRenderer extension_r16;
	private final ModelRenderer extension_r17;
	private final ModelRenderer extension_r18;
	private final ModelRenderer extension_r19;
	private final ModelRenderer extension_r20;
	private final ModelRenderer extension_r21;
	private final ModelRenderer extension_r22;
	private final ModelRenderer extension_r23;

	public ARPistolBufferTube() {
		textureWidth = 208;
		textureHeight = 208;

		extension = new ModelRenderer(this);
		extension.setRotationPoint(0.0F, 31.25F, -2.0F);
		extension.cubeList.add(new ModelBox(extension, 54, 48, -2.0F, -47.1F, 4.999F, 1, 1, 17, 0.0F, false));
		extension.cubeList.add(new ModelBox(extension, 186, 97, -2.0F, -47.225F, 4.499F, 1, 1, 2, 0.05F, false));

		extension_r1 = new ModelRenderer(this);
		extension_r1.setRotationPoint(-2.8606F, -45.2878F, 17.999F);
		extension.addChild(extension_r1);
		setRotationAngle(extension_r1, 0.0F, 0.0F, -1.5708F);
		extension_r1.cubeList.add(new ModelBox(extension_r1, 46, 186, -0.5F, -0.5766F, -13.5F, 1, 1, 2, 0.05F, false));

		extension_r2 = new ModelRenderer(this);
		extension_r2.setRotationPoint(-2.8453F, -45.3648F, 17.999F);
		extension.addChild(extension_r2);
		setRotationAngle(extension_r2, 0.0F, 0.0F, -1.1781F);
		extension_r2.cubeList.add(new ModelBox(extension_r2, 52, 186, 0.2413F, -0.7241F, -13.5F, 1, 1, 2, 0.05F, false));

		extension_r3 = new ModelRenderer(this);
		extension_r3.setRotationPoint(-2.8453F, -45.2107F, 17.999F);
		extension.addChild(extension_r3);
		setRotationAngle(extension_r3, 0.0F, 0.0F, -1.9635F);
		extension_r3.cubeList.add(new ModelBox(extension_r3, 58, 186, -1.2413F, -0.7241F, -13.5F, 1, 1, 2, 0.05F, false));

		extension_r4 = new ModelRenderer(this);
		extension_r4.setRotationPoint(-1.5F, -43.9272F, 17.999F);
		extension.addChild(extension_r4);
		setRotationAngle(extension_r4, 0.0F, 0.0F, 3.1416F);
		extension_r4.cubeList.add(new ModelBox(extension_r4, 64, 186, -0.5F, -0.5766F, -13.5F, 1, 1, 2, 0.05F, false));

		extension_r5 = new ModelRenderer(this);
		extension_r5.setRotationPoint(-1.5771F, -43.9425F, 17.999F);
		extension.addChild(extension_r5);
		setRotationAngle(extension_r5, 0.0F, 0.0F, -2.7489F);
		extension_r5.cubeList.add(new ModelBox(extension_r5, 70, 186, 0.2413F, -0.7241F, -13.5F, 1, 1, 2, 0.05F, false));

		extension_r6 = new ModelRenderer(this);
		extension_r6.setRotationPoint(-1.4229F, -43.9425F, 17.999F);
		extension.addChild(extension_r6);
		setRotationAngle(extension_r6, 0.0F, 0.0F, 2.7489F);
		extension_r6.cubeList.add(new ModelBox(extension_r6, 180, 164, -1.2413F, -0.7241F, -13.5F, 1, 1, 2, 0.05F, false));

		extension_r7 = new ModelRenderer(this);
		extension_r7.setRotationPoint(-0.1394F, -45.2878F, 17.999F);
		extension.addChild(extension_r7);
		setRotationAngle(extension_r7, 0.0F, 0.0F, 1.5708F);
		extension_r7.cubeList.add(new ModelBox(extension_r7, 76, 186, -0.5F, -0.5766F, -13.5F, 1, 1, 2, 0.05F, false));

		extension_r8 = new ModelRenderer(this);
		extension_r8.setRotationPoint(-0.1547F, -45.2107F, 17.999F);
		extension.addChild(extension_r8);
		setRotationAngle(extension_r8, 0.0F, 0.0F, 1.9635F);
		extension_r8.cubeList.add(new ModelBox(extension_r8, 82, 186, 0.2413F, -0.7241F, -13.5F, 1, 1, 2, 0.05F, false));

		extension_r9 = new ModelRenderer(this);
		extension_r9.setRotationPoint(-0.1547F, -45.3648F, 17.999F);
		extension.addChild(extension_r9);
		setRotationAngle(extension_r9, 0.0F, 0.0F, 1.1781F);
		extension_r9.cubeList.add(new ModelBox(extension_r9, 88, 186, -1.2413F, -0.7241F, -13.5F, 1, 1, 2, 0.05F, false));

		extension_r10 = new ModelRenderer(this);
		extension_r10.setRotationPoint(-2.3477F, -46.5564F, 17.999F);
		extension.addChild(extension_r10);
		setRotationAngle(extension_r10, 0.0F, 0.0F, -0.3927F);
		extension_r10.cubeList.add(new ModelBox(extension_r10, 186, 91, -0.5F, -0.5F, -13.5F, 1, 1, 2, 0.05F, false));

		extension_r11 = new ModelRenderer(this);
		extension_r11.setRotationPoint(-0.6523F, -46.5564F, 17.999F);
		extension.addChild(extension_r11);
		setRotationAngle(extension_r11, 0.0F, 0.0F, 0.3927F);
		extension_r11.cubeList.add(new ModelBox(extension_r11, 186, 94, -0.5F, -0.5F, -13.5F, 1, 1, 2, 0.05F, false));

		extension_r12 = new ModelRenderer(this);
		extension_r12.setRotationPoint(-0.2701F, -45.2934F, 18.499F);
		extension.addChild(extension_r12);
		setRotationAngle(extension_r12, 0.0F, 0.0F, 1.1781F);
		extension_r12.cubeList.add(new ModelBox(extension_r12, 36, 84, -1.2413F, -0.7241F, -13.5F, 1, 1, 17, 0.0F, false));

		extension_r13 = new ModelRenderer(this);
		extension_r13.setRotationPoint(-0.2701F, -45.2934F, 18.499F);
		extension.addChild(extension_r13);
		setRotationAngle(extension_r13, 0.0F, 0.0F, 1.9635F);
		extension_r13.cubeList.add(new ModelBox(extension_r13, 72, 84, 0.2413F, -0.7241F, -13.5F, 1, 1, 17, 0.0F, false));

		extension_r14 = new ModelRenderer(this);
		extension_r14.setRotationPoint(-0.2701F, -45.2934F, 18.499F);
		extension.addChild(extension_r14);
		setRotationAngle(extension_r14, 0.0F, 0.0F, 1.5708F);
		extension_r14.cubeList.add(new ModelBox(extension_r14, 90, 48, -0.5F, -0.5766F, -13.5F, 1, 1, 17, 0.0F, false));

		extension_r15 = new ModelRenderer(this);
		extension_r15.setRotationPoint(-1.5F, -44.0635F, 18.499F);
		extension.addChild(extension_r15);
		setRotationAngle(extension_r15, 0.0F, 0.0F, 2.7489F);
		extension_r15.cubeList.add(new ModelBox(extension_r15, 90, 66, -1.2413F, -0.7241F, -13.5F, 1, 1, 17, 0.0F, false));

		extension_r16 = new ModelRenderer(this);
		extension_r16.setRotationPoint(-1.5F, -44.0635F, 18.499F);
		extension.addChild(extension_r16);
		setRotationAngle(extension_r16, 0.0F, 0.0F, -2.7489F);
		extension_r16.cubeList.add(new ModelBox(extension_r16, 94, 27, 0.2413F, -0.7241F, -13.5F, 1, 1, 17, 0.0F, false));

		extension_r17 = new ModelRenderer(this);
		extension_r17.setRotationPoint(-2.0F, -44.8135F, 12.499F);
		extension.addChild(extension_r17);
		setRotationAngle(extension_r17, 0.0F, 0.0F, 3.1416F);
		extension_r17.cubeList.add(new ModelBox(extension_r17, 52, 177, -1.5F, -0.5766F, 8.5F, 2, 2, 1, 0.0F, false));

		extension_r18 = new ModelRenderer(this);
		extension_r18.setRotationPoint(-1.5F, -44.0635F, 18.499F);
		extension.addChild(extension_r18);
		setRotationAngle(extension_r18, 0.0F, 0.0F, 3.1416F);
		extension_r18.cubeList.add(new ModelBox(extension_r18, 0, 99, -0.5F, -0.5766F, -13.5F, 1, 1, 17, 0.0F, false));

		extension_r19 = new ModelRenderer(this);
		extension_r19.setRotationPoint(-2.7299F, -45.2934F, 18.499F);
		extension.addChild(extension_r19);
		setRotationAngle(extension_r19, 0.0F, 0.0F, -1.9635F);
		extension_r19.cubeList.add(new ModelBox(extension_r19, 36, 102, -1.2413F, -0.7241F, -13.5F, 1, 1, 17, 0.0F, false));

		extension_r20 = new ModelRenderer(this);
		extension_r20.setRotationPoint(-2.7299F, -45.2934F, 18.499F);
		extension.addChild(extension_r20);
		setRotationAngle(extension_r20, 0.0F, 0.0F, -1.1781F);
		extension_r20.cubeList.add(new ModelBox(extension_r20, 72, 102, 0.2413F, -0.7241F, -13.5F, 1, 1, 17, 0.0F, false));

		extension_r21 = new ModelRenderer(this);
		extension_r21.setRotationPoint(-2.7299F, -45.2934F, 18.499F);
		extension.addChild(extension_r21);
		setRotationAngle(extension_r21, 0.0F, 0.0F, -1.5708F);
		extension_r21.cubeList.add(new ModelBox(extension_r21, 108, 0, -0.5F, -0.5766F, -13.5F, 1, 1, 17, 0.0F, false));

		extension_r22 = new ModelRenderer(this);
		extension_r22.setRotationPoint(-2.2706F, -46.4467F, 18.499F);
		extension.addChild(extension_r22);
		setRotationAngle(extension_r22, 0.0F, 0.0F, -0.3927F);
		extension_r22.cubeList.add(new ModelBox(extension_r22, 0, 81, -0.5F, -0.5F, -13.5F, 1, 1, 17, 0.0F, false));

		extension_r23 = new ModelRenderer(this);
		extension_r23.setRotationPoint(-0.7294F, -46.4467F, 18.499F);
		extension.addChild(extension_r23);
		setRotationAngle(extension_r23, 0.0F, 0.0F, 0.3927F);
		extension_r23.cubeList.add(new ModelBox(extension_r23, 54, 66, -0.5F, -0.5F, -13.5F, 1, 1, 17, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		extension.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}