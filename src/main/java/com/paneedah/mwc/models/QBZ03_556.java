package com.paneedah.mwc.models;

import com.paneedah.weaponlib2.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QBZ03_556 extends ModelWithAttachments {
	private final ModelRenderer gun;
	private final ModelRenderer cube_r44;
	private final ModelRenderer cube_r45;
	private final ModelRenderer cube_r46;
	private final ModelRenderer cube_r47;
	private final ModelRenderer cube_r48;
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
		gun.cubeList.add(new ModelBox(gun, 314, 31, -4.5F, -35.1F, 2.0F, 6, 3, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 320, 68, -4.5F, -35.7F, 2.0F, 6, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 25, 378, -2.0F, -31.1F, -7.6F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 352, 255, -2.5F, -32.1F, -6.2F, 2, 5, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 285, 355, -2.5F, -32.947F, -13.748F, 2, 4, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 348, 31, -2.5F, -28.1F, -10.2F, 2, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 317, -3.75F, -35.1F, -24.4F, 1, 3, 27, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 57, 317, -0.25F, -35.1F, -24.4F, 1, 3, 27, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 293, 39, -3.7F, -32.8F, -24.7F, 5, 1, 27, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 183, 329, -4.3F, -32.8F, -24.7F, 1, 1, 27, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 246, 326, -0.7F, -35.4F, -24.7F, 2, 1, 27, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 305, 326, -4.3F, -35.4F, -24.7F, 2, 1, 27, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 329, 295, -4.4868F, -36.0096F, -23.7F, 2, 1, 26, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 333, 264, -0.5132F, -36.0096F, -23.7F, 2, 1, 26, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 354, 136, -0.5132F, -36.0096F, -24.3F, 2, 1, 2, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 267, 355, -4.4868F, -36.0096F, -24.3F, 2, 1, 2, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 114, 323, -4.3F, -35.1821F, -25.2164F, 1, 3, 2, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 114, 329, 0.3F, -35.1821F, -25.1914F, 1, 3, 2, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 348, 355, 0.3F, -36.0071F, -25.2414F, 1, 2, 2, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 355, 355, -4.3F, -36.0071F, -25.2414F, 1, 2, 2, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 320, 73, -4.0F, -34.9292F, -27.9072F, 5, 2, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 323, 190, -4.5F, -34.9292F, -27.6572F, 6, 2, 2, -0.25F, false));
		gun.cubeList.add(new ModelBox(gun, 348, 195, -2.6F, -34.9292F, -3.6572F, 4, 2, 2, -0.25F, false));
		gun.cubeList.add(new ModelBox(gun, 276, 355, -0.75F, -34.4292F, -26.7072F, 2, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 337, 76, -4.05F, -34.7292F, -0.6072F, 2, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 378, 63, -4.85F, -33.4292F, 2.3928F, 1, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 378, 66, -4.85F, -35.2292F, 3.7928F, 1, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 378, 27, 0.85F, -33.4292F, 2.3928F, 1, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 335, 260, -2.55F, -34.4292F, -2.8072F, 4, 1, 2, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 378, 69, 0.85F, -35.2292F, 3.7928F, 1, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 335, 255, -4.0F, -35.7042F, -27.9072F, 5, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 320, 141, -3.5F, -34.2592F, -23.812F, 4, 6, 9, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 185, 292, -4.6F, -32.3592F, -16.112F, 5, 2, 2, -0.5F, false));
		gun.cubeList.add(new ModelBox(gun, 185, 284, -0.875F, -32.3592F, -19.112F, 2, 2, 5, -0.5F, false));
		gun.cubeList.add(new ModelBox(gun, 169, 346, 0.0F, -31.0F, -19.5F, 1, 1, 5, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 359, 212, 0.0F, -32.4F, -19.5F, 1, 2, 1, -0.3F, false));

		cube_r44 = new ModelRenderer(this);
		cube_r44.setRotationPoint(-0.1F, -28.4F, -19.3F);
		gun.addChild(cube_r44);
		setRotationAngle(cube_r44, -0.0873F, 0.0F, 0.0F);
		cube_r44.cubeList.add(new ModelBox(cube_r44, 348, 165, -4.0F, 0.0F, -5.0F, 1, 1, 10, -0.3F, false));
		cube_r44.cubeList.add(new ModelBox(cube_r44, 347, 141, -3.8F, 0.0F, -5.0F, 5, 1, 10, -0.3F, false));

		cube_r45 = new ModelRenderer(this);
		cube_r45.setRotationPoint(-1.5F, -30.9592F, -16.612F);
		gun.addChild(cube_r45);
		setRotationAngle(cube_r45, 0.7418F, 0.0F, 0.0F);
		cube_r45.cubeList.add(new ModelBox(cube_r45, 302, 156, -2.0F, 0.0F, 1.5F, 4, 1, 1, 0.0F, false));

		cube_r46 = new ModelRenderer(this);
		cube_r46.setRotationPoint(-1.5F, -30.8592F, -15.912F);
		gun.addChild(cube_r46);
		setRotationAngle(cube_r46, 0.7418F, 0.0F, 0.0F);
		cube_r46.cubeList.add(new ModelBox(cube_r46, 340, 190, -2.0F, 0.0F, 0.5F, 4, 1, 3, 0.0F, false));

		cube_r47 = new ModelRenderer(this);
		cube_r47.setRotationPoint(-1.5F, -31.2913F, -25.0486F);
		gun.addChild(cube_r47);
		setRotationAngle(cube_r47, -0.0873F, 0.0F, 0.0F);
		cube_r47.cubeList.add(new ModelBox(cube_r47, 293, 68, -2.0F, 2.0F, 1.5F, 4, 1, 9, 0.0F, false));

		cube_r48 = new ModelRenderer(this);
		cube_r48.setRotationPoint(-1.5F, -32.5592F, -22.587F);
		gun.addChild(cube_r48);
		setRotationAngle(cube_r48, -0.7418F, 0.0F, 0.0F);
		cube_r48.cubeList.add(new ModelBox(cube_r48, 307, 227, -2.0F, 0.5F, -1.0F, 4, 1, 1, 0.0F, false));

		barrelandreciever_r3 = new ModelRenderer(this);
		barrelandreciever_r3.setRotationPoint(-1.8F, -33.2291F, -26.3548F);
		gun.addChild(barrelandreciever_r3);
		setRotationAngle(barrelandreciever_r3, -0.1309F, 0.0F, 0.0F);
		barrelandreciever_r3.cubeList.add(new ModelBox(barrelandreciever_r3, 304, 190, -2.2F, -0.5F, -1.5F, 5, 1, 4, 0.0F, false));

		handguard_r1 = new ModelRenderer(this);
		handguard_r1.setRotationPoint(1.3508F, -36.4155F, -7.0F);
		gun.addChild(handguard_r1);
		setRotationAngle(handguard_r1, 0.0F, 0.0F, 0.6109F);
		handguard_r1.cubeList.add(new ModelBox(handguard_r1, 335, 227, -0.5F, 1.0F, -17.0F, 1, 1, 26, 0.0F, false));

		handguard_r2 = new ModelRenderer(this);
		handguard_r2.setRotationPoint(-4.3508F, -36.4155F, -7.0F);
		gun.addChild(handguard_r2);
		setRotationAngle(handguard_r2, 0.0F, 0.0F, -0.6109F);
		handguard_r2.cubeList.add(new ModelBox(handguard_r2, 114, 346, -0.5F, 1.0F, -17.0F, 1, 1, 26, 0.0F, false));

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
		handguard_r5.cubeList.add(new ModelBox(handguard_r5, 359, 208, -0.5F, -1.5F, -0.5F, 1, 2, 1, 0.0F, false));

		handguard_r6 = new ModelRenderer(this);
		handguard_r6.setRotationPoint(-1.5F, -29.3731F, -7.8746F);
		gun.addChild(handguard_r6);
		setRotationAngle(handguard_r6, -0.9163F, 0.0F, 0.0F);
		handguard_r6.cubeList.add(new ModelBox(handguard_r6, 378, 72, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		handguard_r7 = new ModelRenderer(this);
		handguard_r7.setRotationPoint(-1.5F, -29.9772F, -7.2964F);
		gun.addChild(handguard_r7);
		setRotationAngle(handguard_r7, -0.6109F, 0.0F, 0.0F);
		handguard_r7.cubeList.add(new ModelBox(handguard_r7, 30, 378, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
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