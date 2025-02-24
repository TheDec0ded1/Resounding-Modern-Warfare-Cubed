package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QBZ03_556 extends ModelWithAttachments {
	private final ModelRenderer gun;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
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

	public QBZ03_556() {
		textureWidth = 400;
		textureHeight = 400;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.0F, 24.0F, 0.0F);
		gun.cubeList.add(new ModelBox(gun, 293, 72, -4.5F, -35.1F, 2.0F, 6, 3, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 312, 72, -4.5F, -35.7F, 2.0F, 6, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 343, 36, -2.0F, -31.1F, -7.6F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 191, 284, -2.5F, -32.1F, -6.2F, 2, 5, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 336, 355, -2.5F, -31.9471F, -13.748F, 2, 3, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 348, 31, -2.5F, -28.1F, -10.2F, 2, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 61, 315, -3.75F, -35.1F, -24.4F, 1, 3, 27, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 118, 315, -0.25F, -35.1F, -24.4F, 1, 3, 27, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 284, -3.7F, -32.8F, -24.7F, 5, 1, 27, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 175, 329, -4.3F, -32.8F, -24.7F, 1, 1, 27, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 252, 326, -0.7F, -35.4F, -24.7F, 2, 1, 27, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 311, 326, -4.3F, -35.4F, -24.7F, 2, 1, 27, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 329, 295, -4.4868F, -36.0096F, -23.7F, 2, 1, 26, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 333, 264, -0.5132F, -36.0096F, -23.7F, 2, 1, 26, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 354, 67, -0.5132F, -36.0096F, -24.3F, 2, 1, 2, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 354, 91, -4.4868F, -36.0096F, -24.3F, 2, 1, 2, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 340, 190, -4.3F, -35.1821F, -25.2164F, 1, 3, 2, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 354, 95, 0.3F, -35.1821F, -25.1914F, 1, 3, 2, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 354, 105, 0.3F, -36.0071F, -25.2414F, 1, 2, 2, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 266, 355, -4.3F, -36.0071F, -25.2414F, 1, 2, 2, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 314, 31, -4.0F, -34.9292F, -27.9072F, 5, 2, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 323, 190, -4.5F, -34.9292F, -27.6572F, 6, 2, 2, -0.25F, false));
		gun.cubeList.add(new ModelBox(gun, 252, 321, -2.6F, -34.9292F, -3.6572F, 4, 2, 2, -0.25F, false));
		gun.cubeList.add(new ModelBox(gun, 354, 101, -0.75F, -34.4292F, -26.7072F, 2, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 327, 227, -4.05F, -34.7292F, -0.6072F, 2, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 378, 81, -4.85F, -33.4292F, 2.3928F, 1, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 378, 87, -4.85F, -35.2292F, 3.7928F, 1, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 343, 323, 0.85F, -33.4292F, 2.3928F, 1, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 291, 156, -1.75F, -35.9292F, 1.7928F, 4, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 175, 325, -2.55F, -34.4292F, -2.8072F, 4, 1, 2, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 252, 355, 1.25F, -37.4292F, 1.2928F, 1, 3, 2, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 296, 227, -4.95F, -35.9292F, 1.7928F, 4, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 378, 90, 0.85F, -35.2292F, 3.7928F, 1, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 331, 31, -4.0F, -35.7042F, -27.9072F, 5, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 141, 346, -3.5F, -34.2592F, -23.812F, 4, 6, 10, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 175, 315, -4.6F, -32.3592F, -15.112F, 5, 2, 2, -0.5F, false));
		gun.cubeList.add(new ModelBox(gun, 335, 255, -0.875F, -32.3592F, -19.112F, 2, 2, 6, -0.5F, false));
		gun.cubeList.add(new ModelBox(gun, 252, 298, 0.0F, -31.0F, -19.5F, 1, 1, 6, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 296, 360, 0.0F, -32.4F, -19.5F, 1, 2, 1, -0.3F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.1F, -28.4F, -18.3F);
		gun.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 348, 170, -4.0F, 0.0F, -6.0F, 1, 1, 11, -0.3F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 291, 143, -3.8F, 0.0F, -6.0F, 5, 1, 11, -0.3F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.5F, -30.9592F, -15.612F);
		gun.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.7418F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 302, 156, -2.0F, 0.0F, 1.5F, 4, 1, 1, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-1.5F, -30.8592F, -14.912F);
		gun.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.7418F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 175, 320, -2.0F, 0.0F, 0.5F, 4, 1, 3, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-1.5F, -31.2913F, -24.0486F);
		gun.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.0873F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 348, 158, -2.0F, 2.0F, 0.5F, 4, 1, 10, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-1.5F, -32.5592F, -22.587F);
		gun.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.7418F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 307, 227, -2.0F, 0.5F, -1.0F, 4, 1, 1, 0.0F, false));

		barrelandreciever_r1 = new ModelRenderer(this);
		barrelandreciever_r1.setRotationPoint(-1.5F, -32.3828F, -15.4F);
		gun.addChild(barrelandreciever_r1);
		setRotationAngle(barrelandreciever_r1, -0.7854F, 0.0F, 0.0F);
		

		barrelandreciever_r2 = new ModelRenderer(this);
		barrelandreciever_r2.setRotationPoint(-1.5F, -32.6657F, -15.6828F);
		gun.addChild(barrelandreciever_r2);
		setRotationAngle(barrelandreciever_r2, -0.7854F, 0.0F, 0.0F);
		

		barrelandreciever_r3 = new ModelRenderer(this);
		barrelandreciever_r3.setRotationPoint(-1.8F, -33.2291F, -26.3548F);
		gun.addChild(barrelandreciever_r3);
		setRotationAngle(barrelandreciever_r3, -0.1309F, 0.0F, 0.0F);
		barrelandreciever_r3.cubeList.add(new ModelBox(barrelandreciever_r3, 285, 190, -2.2F, -0.5F, -1.5F, 5, 1, 4, 0.0F, false));

		handguard_r1 = new ModelRenderer(this);
		handguard_r1.setRotationPoint(1.3508F, -36.4155F, -7.0F);
		gun.addChild(handguard_r1);
		setRotationAngle(handguard_r1, 0.0F, 0.0F, 0.6109F);
		handguard_r1.cubeList.add(new ModelBox(handguard_r1, 335, 227, -0.5F, 1.0F, -17.0F, 1, 1, 26, 0.0F, false));

		handguard_r2 = new ModelRenderer(this);
		handguard_r2.setRotationPoint(-4.3508F, -36.4155F, -7.0F);
		gun.addChild(handguard_r2);
		setRotationAngle(handguard_r2, 0.0F, 0.0F, -0.6109F);
		handguard_r2.cubeList.add(new ModelBox(handguard_r2, 0, 344, -0.5F, 1.0F, -17.0F, 1, 1, 26, 0.0F, false));

		handguard_r3 = new ModelRenderer(this);
		handguard_r3.setRotationPoint(-1.5F, -28.8361F, -14.5996F);
		gun.addChild(handguard_r3);
		setRotationAngle(handguard_r3, -1.309F, 0.0F, 0.0F);
		

		handguard_r4 = new ModelRenderer(this);
		handguard_r4.setRotationPoint(-1.5F, -28.2361F, -11.2996F);
		gun.addChild(handguard_r4);
		setRotationAngle(handguard_r4, -0.48F, 0.0F, 0.0F);
		handguard_r4.cubeList.add(new ModelBox(handguard_r4, 201, 224, -1.0F, -0.5F, -2.5F, 2, 1, 4, 0.0F, false));

		handguard_r5 = new ModelRenderer(this);
		handguard_r5.setRotationPoint(-1.5F, -31.5056F, -7.1792F);
		gun.addChild(handguard_r5);
		setRotationAngle(handguard_r5, 0.1745F, 0.0F, 0.0F);
		handguard_r5.cubeList.add(new ModelBox(handguard_r5, 231, 360, -0.5F, -1.5F, -0.5F, 1, 2, 1, 0.0F, false));

		handguard_r6 = new ModelRenderer(this);
		handguard_r6.setRotationPoint(-1.5F, -29.3731F, -7.8746F);
		gun.addChild(handguard_r6);
		setRotationAngle(handguard_r6, -0.9163F, 0.0F, 0.0F);
		handguard_r6.cubeList.add(new ModelBox(handguard_r6, 378, 99, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		handguard_r7 = new ModelRenderer(this);
		handguard_r7.setRotationPoint(-1.5F, -29.9772F, -7.2964F);
		gun.addChild(handguard_r7);
		setRotationAngle(handguard_r7, -0.6109F, 0.0F, 0.0F);
		handguard_r7.cubeList.add(new ModelBox(handguard_r7, 345, 292, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
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