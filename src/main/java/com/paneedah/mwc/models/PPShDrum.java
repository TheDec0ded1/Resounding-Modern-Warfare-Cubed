package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class PPShDrum extends ModelWithAttachments {
	private final ModelRenderer mag3;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer bone5;
	private final ModelRenderer bone11;

	public PPShDrum() {
		textureWidth = 256;
		textureHeight = 256;

		mag3 = new ModelRenderer(this);
		mag3.setRotationPoint(-1.4643F, -4.7857F, -30.7514F);
		setRotationAngle(mag3, -0.1309F, 0.0F, 0.0F);
		mag3.cubeList.add(new ModelBox(mag3, 173, 90, -1.9357F, -7.2143F, -3.2586F, 2, 7, 1, 0.0F, true));
		mag3.cubeList.add(new ModelBox(mag3, 173, 90, -2.0357F, -7.2143F, -1.1586F, 1, 7, 1, 0.0F, true));
		mag3.cubeList.add(new ModelBox(mag3, 173, 90, -1.9357F, -7.2143F, 1.2414F, 2, 7, 1, 0.0F, true));
		mag3.cubeList.add(new ModelBox(mag3, 173, 90, -0.0357F, -7.2143F, 1.2414F, 2, 7, 1, 0.0F, true));
		mag3.cubeList.add(new ModelBox(mag3, 173, 90, 1.0643F, -7.2143F, -1.1586F, 1, 7, 1, 0.0F, true));
		mag3.cubeList.add(new ModelBox(mag3, 173, 90, 1.0643F, -7.2143F, 0.5414F, 1, 7, 1, 0.0F, true));
		mag3.cubeList.add(new ModelBox(mag3, 173, 90, -2.0357F, -7.2143F, 0.5414F, 1, 7, 1, 0.0F, true));
		mag3.cubeList.add(new ModelBox(mag3, 173, 92, 0.9643F, -7.2143F, -0.7586F, 1, 7, 2, 0.0F, true));
		mag3.cubeList.add(new ModelBox(mag3, 173, 92, -1.9357F, -7.2143F, -0.7586F, 1, 7, 2, 0.0F, true));
		mag3.cubeList.add(new ModelBox(mag3, 173, 92, 0.9643F, -7.2143F, -2.2586F, 1, 7, 2, 0.0F, true));
		mag3.cubeList.add(new ModelBox(mag3, 173, 92, -1.9357F, -7.2143F, -2.2586F, 1, 7, 2, 0.0F, true));
		mag3.cubeList.add(new ModelBox(mag3, 173, 90, -1.0357F, -7.2143F, -3.2486F, 3, 7, 1, 0.0F, true));
		mag3.cubeList.add(new ModelBox(mag3, 173, 92, -2.4357F, -7.2143F, -2.2586F, 1, 7, 2, 0.0F, true));
		mag3.cubeList.add(new ModelBox(mag3, 173, 90, -2.4357F, -7.2143F, -3.2586F, 2, 7, 1, 0.0F, true));
		mag3.cubeList.add(new ModelBox(mag3, 173, 90, -0.5357F, -7.2143F, -3.2486F, 3, 7, 1, 0.0F, true));
		mag3.cubeList.add(new ModelBox(mag3, 173, 92, -2.4357F, -7.2143F, -0.7586F, 1, 7, 2, 0.0F, true));
		mag3.cubeList.add(new ModelBox(mag3, 173, 90, -2.4357F, -7.2143F, 1.2414F, 2, 7, 1, 0.0F, true));
		mag3.cubeList.add(new ModelBox(mag3, 173, 90, 0.4643F, -7.2143F, 1.2414F, 2, 7, 1, 0.0F, true));
		mag3.cubeList.add(new ModelBox(mag3, 173, 92, 1.4643F, -7.2143F, -2.2586F, 1, 7, 2, 0.0F, true));
		mag3.cubeList.add(new ModelBox(mag3, 173, 92, 1.4643F, -7.2143F, -0.7586F, 1, 7, 2, 0.0F, true));
		mag3.cubeList.add(new ModelBox(mag3, 108, 179, 6.7589F, -0.0823F, -2.7586F, 5, 8, 5, 0.0F, false));
		mag3.cubeList.add(new ModelBox(mag3, 108, 179, -11.7303F, -0.0823F, -2.7586F, 5, 8, 5, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.9643F, 15.927F, -0.2586F);
		mag3.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 1.5708F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 108, 179, -14.5F, -0.5F, -2.7F, 5, 1, 5, 0.9F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(3.0643F, 15.927F, -0.2586F);
		mag3.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 1.5708F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 108, 179, -14.5F, 1.5F, -2.7F, 5, 4, 5, 0.9F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(1.9643F, 12.5497F, -0.2586F);
		mag3.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 1.5708F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 108, 179, -2.5F, -0.5F, -2.5F, 5, 1, 5, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(3.0643F, 12.5497F, -0.2586F);
		mag3.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 1.5708F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 108, 179, -2.5F, 1.5F, -2.5F, 5, 4, 5, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.9206F, 9.9766F, -0.2586F);
		mag3.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 2.4435F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 108, 179, 3.3677F, 3.709F, -2.5F, 5, 6, 5, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 108, 179, -1.6323F, 3.709F, -2.5F, 5, 6, 5, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(5.4861F, -3.0467F, -0.2586F);
		mag3.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -1.1345F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 108, 179, -2.5F, -4.5F, -2.5F, 5, 6, 5, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 108, 179, -7.5F, -4.5F, -2.5F, 5, 6, 5, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0143F, 9.554F, -0.2586F);
		mag3.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 2.0071F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 108, 179, -3.9838F, -0.1021F, -2.5F, 5, 6, 5, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 108, 179, 1.0162F, -0.1021F, -2.5F, 5, 6, 5, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-29.0216F, 7.9413F, -0.2586F);
		mag3.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 1.1345F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 108, 179, -2.5F, -30.5F, -2.5F, 5, 6, 5, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 108, 179, 2.5F, -30.5F, -2.5F, 5, 6, 5, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-0.892F, 9.9766F, -0.2586F);
		mag3.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -2.4435F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 108, 179, -8.3677F, 3.709F, -2.5F, 5, 6, 5, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 108, 179, -3.3677F, 3.709F, -2.5F, 5, 6, 5, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0143F, 9.554F, -0.2586F);
		mag3.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -2.0071F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 108, 179, -1.0162F, -0.1021F, -2.5F, 5, 6, 5, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 108, 179, -6.0162F, -0.1021F, -2.5F, 5, 6, 5, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-24.9207F, 19.5267F, -0.2586F);
		mag3.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, 0.6981F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 108, 179, 2.5F, -29.5F, -2.5F, 5, 6, 5, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 108, 179, -2.5F, -29.5F, -2.5F, 5, 6, 5, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(8.8796F, 0.3756F, -0.2586F);
		mag3.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, -0.6981F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 108, 179, -7.5F, -4.5F, -2.5F, 5, 6, 5, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 108, 179, -2.5F, -4.5F, -2.5F, 5, 6, 5, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-2.5357F, 25.7857F, 17.7514F);
		mag3.addChild(bone2);
		

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-2.5357F, 25.7857F, 18.7514F);
		mag3.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 173, 91, 1.5F, -32.75F, -16.55F, 2, 3, 1, 0.0F, true));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(1.0143F, -12.1143F, -1.7486F);
		mag3.addChild(bone5);
		setRotationAngle(bone5, 0.0F, 0.0698F, -2.0769F);
		bone5.cubeList.add(new ModelBox(bone5, 171, 117, -4.9958F, -2.6899F, -0.3593F, 1, 1, 4, 0.0F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(-1.1357F, -12.0143F, -1.7486F);
		mag3.addChild(bone11);
		setRotationAngle(bone11, 0.0F, -0.0698F, 2.0769F);
		bone11.cubeList.add(new ModelBox(bone11, 172, 116, 3.836F, -2.7726F, -0.3481F, 1, 1, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		mag3.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}