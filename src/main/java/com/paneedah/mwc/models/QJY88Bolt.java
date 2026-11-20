package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QJY88Bolt extends ModelWithAttachments {
	private final ModelRenderer bolt;
	private final ModelRenderer cube_r1;
	private final ModelRenderer gun_r1;
	private final ModelRenderer gun_r2;
	private final ModelRenderer gun_r3;
	private final ModelRenderer gun_r4;

	public QJY88Bolt() {
		textureWidth = 512;
		textureHeight = 512;

		bolt = new ModelRenderer(this);
		bolt.setRotationPoint(-1.4292F, -12.1075F, -26.24F);
		bolt.cubeList.add(new ModelBox(bolt, 336, 38, -0.5698F, -0.7925F, -21.11F, 1, 1, 34, -0.1F, false));
		bolt.cubeList.add(new ModelBox(bolt, 216, 326, -0.0041F, -0.2269F, -21.11F, 1, 1, 34, -0.1F, false));
		bolt.cubeList.add(new ModelBox(bolt, 146, 326, -1.1355F, -0.2269F, -21.11F, 1, 1, 34, -0.1F, false));
		bolt.cubeList.add(new ModelBox(bolt, 76, 326, -0.5698F, 0.3388F, -21.11F, 1, 1, 34, -0.1F, false));
		bolt.cubeList.add(new ModelBox(bolt, 444, 302, -1.9708F, -0.8925F, 12.24F, 4, 2, 14, 0.0F, false));
		bolt.cubeList.add(new ModelBox(bolt, 440, 454, -1.4708F, -3.7925F, 12.24F, 3, 3, 14, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.1708F, -4.0926F, 25.44F);
		bolt.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.7854F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 262, 508, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		gun_r1 = new ModelRenderer(this);
		gun_r1.setRotationPoint(1.3909F, -0.3875F, 5.39F);
		bolt.addChild(gun_r1);
		setRotationAngle(gun_r1, 0.0F, 0.0F, 0.7854F);
		gun_r1.cubeList.add(new ModelBox(gun_r1, 336, 73, -0.5F, 1.0F, -26.5F, 1, 1, 34, -0.1F, false));

		gun_r2 = new ModelRenderer(this);
		gun_r2.setRotationPoint(-0.8233F, 1.0267F, 5.39F);
		bolt.addChild(gun_r2);
		setRotationAngle(gun_r2, 0.0F, 0.0F, 0.7854F);
		gun_r2.cubeList.add(new ModelBox(gun_r2, 338, 108, -0.5F, -1.0F, -26.5F, 1, 1, 34, -0.1F, false));

		gun_r3 = new ModelRenderer(this);
		gun_r3.setRotationPoint(0.6838F, -0.4804F, 5.39F);
		bolt.addChild(gun_r3);
		setRotationAngle(gun_r3, 0.0F, 0.0F, 0.7854F);
		gun_r3.cubeList.add(new ModelBox(gun_r3, 0, 342, -0.5F, 0.0F, -26.5F, 1, 1, 34, -0.1F, false));

		gun_r4 = new ModelRenderer(this);
		gun_r4.setRotationPoint(-1.5305F, 0.9338F, 5.39F);
		bolt.addChild(gun_r4);
		setRotationAngle(gun_r4, 0.0F, 0.0F, 0.7854F);
		gun_r4.cubeList.add(new ModelBox(gun_r4, 352, 0, -0.5F, -2.0F, -26.5F, 1, 1, 34, -0.1F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bolt.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}