package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QBZ03 extends ModelWithAttachments {
	private final ModelRenderer gun;
	private final ModelRenderer barrelandreciever_r1;
	private final ModelRenderer barrelandreciever_r2;
	private final ModelRenderer barrelandreciever_r3;
	private final ModelRenderer handguard_r1;
	private final ModelRenderer handguard_r2;
	private final ModelRenderer handguard_r3;
	private final ModelRenderer handguard_r4;
	private final ModelRenderer handguard_r5;
	private final ModelRenderer handguard_r6;
	private final ModelRenderer handguard_r7;

	public QBZ03() {
		textureWidth = 416;
		textureHeight = 416;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.0F, 24.0F, 0.0F);
		gun.cubeList.add(new ModelBox(gun, 352, 58, -4.5F, -35.1F, 2.0F, 6, 3, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 285, 191, -4.5F, -35.7F, 2.0F, 6, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 43, 346, -3.0F, -32.8F, -15.3F, 3, 4, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 396, 39, -2.0F, -31.1F, -7.6F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 153, 372, -2.5F, -32.1F, -6.2F, 2, 5, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 201, 224, -2.5F, -28.1F, -10.2F, 2, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 348, 159, -3.75F, -35.1F, -15.4F, 1, 3, 18, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 350, 66, -0.25F, -35.1F, -15.4F, 1, 3, 18, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 50, 371, -3.75F, -35.1F, -24.4F, 1, 2, 9, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 311, 370, -0.25F, -35.1F, -24.4F, 1, 2, 9, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 113, 372, -3.75F, -33.6F, -24.4F, 1, 1, 9, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 92, 372, -0.25F, -33.6F, -24.4F, 1, 1, 9, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 291, 137, -3.7F, -32.8F, -15.7F, 5, 1, 18, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 352, 0, -4.3F, -32.8F, -15.7F, 1, 1, 18, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 291, 108, -0.7F, -35.4F, -24.7F, 2, 1, 27, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 291, 79, -4.3F, -35.4F, -24.7F, 2, 1, 27, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 189, 297, -4.4868F, -36.0096F, -23.7F, 2, 1, 26, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 295, 0, -0.5132F, -36.0096F, -23.7F, 2, 1, 26, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 302, 389, -0.5132F, -36.0096F, -24.3F, 2, 1, 2, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 389, 83, -4.4868F, -36.0096F, -24.3F, 2, 1, 2, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 371, 218, -4.3F, -33.1071F, -24.2414F, 1, 1, 9, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 143, 389, -4.3F, -35.5071F, -25.2414F, 1, 3, 2, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 295, 389, 0.3F, -35.5071F, -25.2414F, 1, 3, 2, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 318, 390, 0.3F, -36.0071F, -25.2414F, 1, 2, 2, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 311, 390, -4.3F, -36.0071F, -25.2414F, 1, 2, 2, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 71, 371, 0.3F, -33.1071F, -24.2414F, 1, 1, 9, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 351, 382, -4.0F, -34.9292F, -27.9072F, 5, 2, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 335, 258, -4.5F, -34.9292F, -27.6572F, 6, 2, 2, -0.25F, false));
		gun.cubeList.add(new ModelBox(gun, 354, 258, -2.6F, -34.9292F, -3.6572F, 4, 2, 2, -0.25F, false));
		gun.cubeList.add(new ModelBox(gun, 367, 389, -0.75F, -34.4292F, -26.7072F, 2, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 42, 395, -4.05F, -34.7292F, -0.6072F, 2, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 396, 27, -4.85F, -33.4292F, 2.3928F, 1, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 397, 197, -4.85F, -35.2292F, 3.7928F, 1, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 29, 396, 0.85F, -33.4292F, 2.3928F, 1, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 388, 63, -1.75F, -35.9292F, 1.7928F, 4, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 129, 384, -2.55F, -34.4292F, -2.8072F, 4, 1, 2, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 389, 369, 1.25F, -37.4292F, 1.2928F, 1, 3, 2, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 43, 367, -4.95F, -35.9292F, 1.7928F, 4, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 397, 200, 0.85F, -35.2292F, 3.7928F, 1, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 304, 191, -4.0F, -35.7042F, -27.9072F, 5, 1, 3, 0.0F, false));

		barrelandreciever_r1 = new ModelRenderer(this);
		barrelandreciever_r1.setRotationPoint(-1.5F, -32.3828F, -15.4F);
		gun.addChild(barrelandreciever_r1);
		setRotationAngle(barrelandreciever_r1, -0.7854F, 0.0F, 0.0F);
		barrelandreciever_r1.cubeList.add(new ModelBox(barrelandreciever_r1, 396, 48, -2.8F, -0.5F, -0.5F, 1, 1, 1, -0.3F, false));
		barrelandreciever_r1.cubeList.add(new ModelBox(barrelandreciever_r1, 396, 51, 1.8F, -0.5F, -0.5F, 1, 1, 1, -0.3F, false));

		barrelandreciever_r2 = new ModelRenderer(this);
		barrelandreciever_r2.setRotationPoint(-1.5F, -32.6657F, -15.6828F);
		gun.addChild(barrelandreciever_r2);
		setRotationAngle(barrelandreciever_r2, -0.7854F, 0.0F, 0.0F);
		barrelandreciever_r2.cubeList.add(new ModelBox(barrelandreciever_r2, 397, 218, -2.8F, -0.5F, -0.3F, 1, 1, 1, -0.3F, false));
		barrelandreciever_r2.cubeList.add(new ModelBox(barrelandreciever_r2, 397, 221, 1.8F, -0.5F, -0.3F, 1, 1, 1, -0.3F, false));

		barrelandreciever_r3 = new ModelRenderer(this);
		barrelandreciever_r3.setRotationPoint(-1.8F, -33.2291F, -26.3548F);
		gun.addChild(barrelandreciever_r3);
		setRotationAngle(barrelandreciever_r3, -0.1309F, 0.0F, 0.0F);
		barrelandreciever_r3.cubeList.add(new ModelBox(barrelandreciever_r3, 331, 291, -2.2F, -0.5F, -1.5F, 5, 1, 4, 0.0F, false));

		handguard_r1 = new ModelRenderer(this);
		handguard_r1.setRotationPoint(1.3508F, -36.4155F, -7.0F);
		gun.addChild(handguard_r1);
		setRotationAngle(handguard_r1, 0.0F, 0.0F, 0.6109F);
		handguard_r1.cubeList.add(new ModelBox(handguard_r1, 112, 316, -0.5F, 1.0F, -17.0F, 1, 1, 26, 0.0F, false));

		handguard_r2 = new ModelRenderer(this);
		handguard_r2.setRotationPoint(-4.3508F, -36.4155F, -7.0F);
		gun.addChild(handguard_r2);
		setRotationAngle(handguard_r2, 0.0F, 0.0F, -0.6109F);
		handguard_r2.cubeList.add(new ModelBox(handguard_r2, 167, 325, -0.5F, 1.0F, -17.0F, 1, 1, 26, 0.0F, false));

		handguard_r3 = new ModelRenderer(this);
		handguard_r3.setRotationPoint(-1.5F, -28.8361F, -14.5996F);
		gun.addChild(handguard_r3);
		setRotationAngle(handguard_r3, -1.309F, 0.0F, 0.0F);
		handguard_r3.cubeList.add(new ModelBox(handguard_r3, 389, 353, -1.0F, -0.5F, -0.5F, 2, 1, 2, 0.0F, false));

		handguard_r4 = new ModelRenderer(this);
		handguard_r4.setRotationPoint(-1.5F, -28.2361F, -11.2996F);
		gun.addChild(handguard_r4);
		setRotationAngle(handguard_r4, -0.48F, 0.0F, 0.0F);
		handguard_r4.cubeList.add(new ModelBox(handguard_r4, 368, 382, -1.0F, -0.5F, -3.5F, 2, 1, 5, 0.0F, false));

		handguard_r5 = new ModelRenderer(this);
		handguard_r5.setRotationPoint(-1.5F, -31.5056F, -7.1792F);
		gun.addChild(handguard_r5);
		setRotationAngle(handguard_r5, 0.1745F, 0.0F, 0.0F);
		handguard_r5.cubeList.add(new ModelBox(handguard_r5, 395, 285, -0.5F, -1.5F, -0.5F, 1, 2, 1, 0.0F, false));

		handguard_r6 = new ModelRenderer(this);
		handguard_r6.setRotationPoint(-1.5F, -29.3731F, -7.8746F);
		gun.addChild(handguard_r6);
		setRotationAngle(handguard_r6, -0.9163F, 0.0F, 0.0F);
		handguard_r6.cubeList.add(new ModelBox(handguard_r6, 396, 45, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		handguard_r7 = new ModelRenderer(this);
		handguard_r7.setRotationPoint(-1.5F, -29.9772F, -7.2964F);
		gun.addChild(handguard_r7);
		setRotationAngle(handguard_r7, -0.6109F, 0.0F, 0.0F);
		handguard_r7.cubeList.add(new ModelBox(handguard_r7, 396, 42, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		gun.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}