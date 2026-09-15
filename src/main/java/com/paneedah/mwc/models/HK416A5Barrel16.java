package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class HK416A5Barrel16 extends ModelBase {
	private final ModelRenderer barrel145;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer barrel_r1;
	private final ModelRenderer barrel_r2;
	private final ModelRenderer barrel_r3;
	private final ModelRenderer barrel_r4;
	private final ModelRenderer flashider3;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;
	private final ModelRenderer mk12gasblock3;
	private final ModelRenderer cube_r29;
	private final ModelRenderer cube_r30;
	private final ModelRenderer cube_r31;
	private final ModelRenderer cube_r32;
	private final ModelRenderer cube_r33;

	public HK416A5Barrel16() {
		textureWidth = 512;
		textureHeight = 512;

		barrel145 = new ModelRenderer(this);
		barrel145.setRotationPoint(-1.5F, -13.8929F, -39.501F);
		barrel145.cubeList.add(new ModelBox(barrel145, 0, 0, -0.5F, -1.2071F, -29.5F, 1, 1, 48, -0.1F, false));
		barrel145.cubeList.add(new ModelBox(barrel145, 176, 364, -0.5F, -2.9071F, -7.5F, 1, 1, 26, -0.2F, false));
		barrel145.cubeList.add(new ModelBox(barrel145, 0, 49, -1.0657F, -0.6414F, -29.5F, 1, 1, 48, -0.1F, false));
		barrel145.cubeList.add(new ModelBox(barrel145, 0, 98, 0.0657F, -0.6414F, -29.5F, 1, 1, 48, -0.1F, false));
		barrel145.cubeList.add(new ModelBox(barrel145, 0, 147, -0.5F, -0.0757F, -29.5F, 1, 1, 48, -0.1F, false));
		barrel145.cubeList.add(new ModelBox(barrel145, 414, 456, 0.2071F, -0.7F, -10.999F, 1, 1, 3, 0.0F, false));
		barrel145.cubeList.add(new ModelBox(barrel145, 488, 9, -1.2071F, -0.7F, -10.999F, 1, 1, 3, 0.0F, false));
		barrel145.cubeList.add(new ModelBox(barrel145, 488, 13, -0.5F, 0.0071F, -10.999F, 1, 1, 3, 0.0F, false));
		barrel145.cubeList.add(new ModelBox(barrel145, 488, 379, -1.0F, -0.1929F, -10.199F, 2, 2, 2, 0.0F, false));
		barrel145.cubeList.add(new ModelBox(barrel145, 386, 135, -0.5F, -2.2929F, -10.999F, 1, 2, 3, 0.0F, false));
		barrel145.cubeList.add(new ModelBox(barrel145, 472, 486, -0.995F, -2.83F, -11.1419F, 1, 1, 4, -0.15F, false));
		barrel145.cubeList.add(new ModelBox(barrel145, 204, 487, -0.005F, -2.83F, -11.1419F, 1, 1, 4, -0.15F, false));
		barrel145.cubeList.add(new ModelBox(barrel145, 214, 487, -0.5F, -3.325F, -11.1419F, 1, 1, 4, -0.15F, false));
		barrel145.cubeList.add(new ModelBox(barrel145, 486, 186, -0.5F, -2.7929F, -14.599F, 1, 1, 5, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.35F, -1.98F, -10.1419F);
		barrel145.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 194, 487, -0.5F, -0.5F, -1.0F, 1, 1, 4, -0.15F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(0.35F, -1.98F, -10.1419F);
		barrel145.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, 0.7854F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 482, 486, -0.5F, -0.5F, -1.0F, 1, 1, 4, -0.15F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-0.35F, -2.68F, -10.1419F);
		barrel145.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, 0.7854F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 462, 486, -0.5F, -0.5F, -1.0F, 1, 1, 4, -0.15F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.35F, -2.68F, -10.1419F);
		barrel145.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, 0.7854F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 452, 486, -0.5F, -0.5F, -1.0F, 1, 1, 4, -0.15F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-0.5F, 0.3F, -7.499F);
		barrel145.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, -0.7854F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 488, 17, -0.5F, -0.5F, -3.5F, 1, 1, 3, 0.0F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(0.5F, 0.3F, -7.499F);
		barrel145.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, -0.7854F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 488, 5, -0.5F, -0.5F, -3.5F, 1, 1, 3, 0.0F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-0.5F, -0.7F, -7.499F);
		barrel145.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.0F, -0.7854F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 480, 435, -0.5F, -0.5F, -3.5F, 1, 1, 3, 0.0F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(0.5F, -0.7F, -7.499F);
		barrel145.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.0F, -0.7854F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 472, 435, -0.5F, -0.5F, -3.5F, 1, 1, 3, 0.0F, false));

		barrel_r1 = new ModelRenderer(this);
		barrel_r1.setRotationPoint(1.0142F, 1.6728F, 0.0F);
		barrel145.addChild(barrel_r1);
		setRotationAngle(barrel_r1, 0.0F, 0.0F, -0.7854F);
		barrel_r1.cubeList.add(new ModelBox(barrel_r1, 98, 147, -0.5F, -2.5F, -29.5F, 1, 1, 48, -0.1F, false));

		barrel_r2 = new ModelRenderer(this);
		barrel_r2.setRotationPoint(-1.0142F, -1.1556F, 0.0F);
		barrel145.addChild(barrel_r2);
		setRotationAngle(barrel_r2, 0.0F, 0.0F, -0.7854F);
		barrel_r2.cubeList.add(new ModelBox(barrel_r2, 98, 98, -0.5F, 1.5F, -29.5F, 1, 1, 48, -0.1F, false));

		barrel_r3 = new ModelRenderer(this);
		barrel_r3.setRotationPoint(1.0142F, 0.8728F, 0.0F);
		barrel145.addChild(barrel_r3);
		setRotationAngle(barrel_r3, 0.0F, 0.0F, -0.7854F);
		barrel_r3.cubeList.add(new ModelBox(barrel_r3, 98, 49, -0.5F, -2.5F, -29.5F, 1, 1, 48, -0.1F, false));

		barrel_r4 = new ModelRenderer(this);
		barrel_r4.setRotationPoint(-1.0142F, -1.9556F, 0.0F);
		barrel145.addChild(barrel_r4);
		setRotationAngle(barrel_r4, 0.0F, 0.0F, -0.7854F);
		barrel_r4.cubeList.add(new ModelBox(barrel_r4, 98, 0, -0.5F, 1.5F, -29.5F, 1, 1, 48, -0.1F, false));

		flashider3 = new ModelRenderer(this);
		flashider3.setRotationPoint(-0.5F, 0.3F, -17.749F);
		barrel145.addChild(flashider3);
		flashider3.cubeList.add(new ModelBox(flashider3, 464, 379, 0.0F, -0.2929F, -16.5F, 1, 1, 5, 0.0F, false));
		flashider3.cubeList.add(new ModelBox(flashider3, 502, 18, -0.7071F, -1.0F, -12.5F, 1, 1, 1, 0.0F, false));
		flashider3.cubeList.add(new ModelBox(flashider3, 20, 502, 0.0F, -1.7071F, -12.5F, 1, 1, 1, 0.0F, false));
		flashider3.cubeList.add(new ModelBox(flashider3, 502, 20, 0.7071F, -1.0F, -12.5F, 1, 1, 1, 0.0F, false));
		flashider3.cubeList.add(new ModelBox(flashider3, 502, 22, 0.7071F, -1.0F, -16.5F, 1, 1, 1, 0.0F, false));
		flashider3.cubeList.add(new ModelBox(flashider3, 24, 502, 0.0F, -1.7071F, -16.5F, 1, 1, 1, 0.0F, false));
		flashider3.cubeList.add(new ModelBox(flashider3, 502, 24, -0.7071F, -1.0F, -16.5F, 1, 1, 1, 0.0F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(1.0F, 0.0F, -13.0F);
		flashider3.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, 0.0F, -0.7854F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 486, 180, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(1.0F, -1.0F, -13.0F);
		flashider3.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 0.0F, -0.7854F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 80, 484, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(0.0F, -1.0F, -13.0F);
		flashider3.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0F, 0.0F, -0.7854F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 476, 379, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(0.0F, 0.0F, -13.0F);
		flashider3.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.0F, 0.0F, -0.7854F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 456, 409, -0.5F, -0.5F, -3.5F, 1, 1, 5, 0.0F, false));

		mk12gasblock3 = new ModelRenderer(this);
		mk12gasblock3.setRotationPoint(1.5F, 37.8929F, 40.501F);
		barrel145.addChild(mk12gasblock3);
		mk12gasblock3.cubeList.add(new ModelBox(mk12gasblock3, 358, 494, -1.2929F, -38.5929F, -61.5F, 1, 1, 2, 0.0F, false));
		mk12gasblock3.cubeList.add(new ModelBox(mk12gasblock3, 442, 486, -2.0F, -40.8F, -48.0F, 1, 1, 4, 0.0F, false));
		mk12gasblock3.cubeList.add(new ModelBox(mk12gasblock3, 238, 342, -2.0F, -40.8F, -29.7F, 1, 1, 6, 0.0F, false));
		mk12gasblock3.cubeList.add(new ModelBox(mk12gasblock3, 426, 494, -2.7071F, -38.5929F, -61.5F, 1, 1, 2, 0.0F, false));
		mk12gasblock3.cubeList.add(new ModelBox(mk12gasblock3, 432, 494, -2.0F, -37.8858F, -61.5F, 1, 1, 2, 0.0F, false));
		mk12gasblock3.cubeList.add(new ModelBox(mk12gasblock3, 100, 412, -2.0F, -40.1858F, -61.5F, 1, 2, 2, 0.0F, false));
		mk12gasblock3.cubeList.add(new ModelBox(mk12gasblock3, 502, 26, -2.0F, -40.8929F, -60.7929F, 1, 1, 1, 0.0F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(-2.0F, -37.5929F, -56.0F);
		mk12gasblock3.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.0F, 0.0F, -0.7854F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 438, 494, -0.5F, -0.5F, -5.5F, 1, 1, 2, 0.0F, false));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(-1.5F, -39.8322F, -60.4393F);
		mk12gasblock3.addChild(cube_r30);
		setRotationAngle(cube_r30, -0.7854F, 0.0F, 0.0F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 28, 502, -0.5F, -0.5F, -1.0F, 1, 1, 1, 0.0F, false));

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(-1.0F, -37.5929F, -56.0F);
		mk12gasblock3.addChild(cube_r31);
		setRotationAngle(cube_r31, 0.0F, 0.0F, -0.7854F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 420, 494, -0.5F, -0.5F, -5.5F, 1, 1, 2, 0.0F, false));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(-2.0F, -38.5929F, -56.0F);
		mk12gasblock3.addChild(cube_r32);
		setRotationAngle(cube_r32, 0.0F, 0.0F, -0.7854F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 414, 494, -0.5F, -0.5F, -5.5F, 1, 1, 2, 0.0F, false));

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(-1.0F, -38.5929F, -56.0F);
		mk12gasblock3.addChild(cube_r33);
		setRotationAngle(cube_r33, 0.0F, 0.0F, -0.7854F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 408, 494, -0.5F, -0.5F, -5.5F, 1, 1, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		barrel145.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}