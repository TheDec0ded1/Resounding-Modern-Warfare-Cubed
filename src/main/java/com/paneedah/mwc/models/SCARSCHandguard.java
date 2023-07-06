package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class SCARSCHandguard extends ModelWithAttachments {
	private final ModelRenderer handguard;
	private final ModelRenderer cube_r52;
	private final ModelRenderer cube_r53;
	private final ModelRenderer cube_r54;
	private final ModelRenderer cube_r55;
	private final ModelRenderer cube_r56;
	private final ModelRenderer cube_r57;
	private final ModelRenderer cube_r58;
	private final ModelRenderer cube_r59;
	private final ModelRenderer bone4;
	private final ModelRenderer cube_r60;
	private final ModelRenderer cube_r61;
	private final ModelRenderer bone6;
	private final ModelRenderer cube_r62;
	private final ModelRenderer cube_r63;
	private final ModelRenderer bone5;
	private final ModelRenderer cube_r64;
	private final ModelRenderer cube_r65;

	public SCARSCHandguard() {
		textureWidth = 360;
		textureHeight = 360;

		handguard = new ModelRenderer(this);
		handguard.setRotationPoint(-3.8F, -11.2F, -49.0F);
		handguard.cubeList.add(new ModelBox(handguard, 55, 2, 2.5F, -0.6F, 2.0F, 1, 2, 20, 0.001F, false));
		handguard.cubeList.add(new ModelBox(handguard, 2, 80, 3.5F, -1.0F, 2.0F, 1, 1, 20, -0.001F, false));
		handguard.cubeList.add(new ModelBox(handguard, 2, 2, 1.1F, -0.6F, 2.0F, 2, 2, 20, 0.002F, false));
		handguard.cubeList.add(new ModelBox(handguard, 55, 80, 0.1F, -1.0F, 2.0F, 1, 1, 20, -0.001F, false));
		handguard.cubeList.add(new ModelBox(handguard, 159, 56, 4.075F, -6.33F, 9.7F, 1, 1, 1, -0.2F, false));
		handguard.cubeList.add(new ModelBox(handguard, 50, 158, 4.075F, -5.93F, 9.7F, 1, 1, 1, -0.198F, false));
		handguard.cubeList.add(new ModelBox(handguard, 53, 159, 3.65F, -5.5F, 9.7F, 1, 1, 1, -0.199F, false));
		handguard.cubeList.add(new ModelBox(handguard, 159, 58, 3.65F, -6.75F, 9.7F, 1, 1, 1, -0.199F, false));
		handguard.cubeList.add(new ModelBox(handguard, 98, 55, 2.05F, -6.85F, 9.7F, 2, 4, 1, -0.199F, false));
		handguard.cubeList.add(new ModelBox(handguard, 98, 36, 0.55F, -6.85F, 9.7F, 2, 4, 1, -0.2F, false));
		handguard.cubeList.add(new ModelBox(handguard, 31, 158, -0.05F, -6.75F, 9.7F, 1, 1, 1, -0.199F, false));
		handguard.cubeList.add(new ModelBox(handguard, 23, 158, -0.475F, -5.93F, 9.7F, 1, 1, 1, -0.198F, false));
		handguard.cubeList.add(new ModelBox(handguard, 43, 158, -0.475F, -6.33F, 9.7F, 1, 1, 1, -0.2F, false));
		handguard.cubeList.add(new ModelBox(handguard, 39, 158, -0.05F, -5.5F, 9.7F, 1, 1, 1, -0.199F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 116, 2.9F, -3.55F, 9.7F, 2, 3, 1, -0.201F, false));
		handguard.cubeList.add(new ModelBox(handguard, 144, 6, 2.9F, -1.05F, 9.7F, 2, 1, 1, -0.202F, false));
		handguard.cubeList.add(new ModelBox(handguard, 106, 115, -0.3F, -3.55F, 9.7F, 2, 3, 1, -0.201F, false));
		handguard.cubeList.add(new ModelBox(handguard, 6, 144, -0.3F, -1.05F, 9.7F, 2, 1, 1, -0.202F, false));

		cube_r52 = new ModelRenderer(this);
		cube_r52.setRotationPoint(-0.1F, -3.35F, -0.1F);
		handguard.addChild(cube_r52);
		setRotationAngle(cube_r52, 0.0F, 0.0F, -0.9076F);
		cube_r52.cubeList.add(new ModelBox(cube_r52, 42, 135, -0.2F, -0.2F, 9.8F, 2, 2, 1, -0.202F, false));

		cube_r53 = new ModelRenderer(this);
		cube_r53.setRotationPoint(4.7F, -3.35F, -0.1F);
		handguard.addChild(cube_r53);
		setRotationAngle(cube_r53, 0.0F, 0.0F, 0.9076F);
		cube_r53.cubeList.add(new ModelBox(cube_r53, 12, 136, -1.8F, -0.2F, 9.8F, 2, 2, 1, -0.202F, false));

		cube_r54 = new ModelRenderer(this);
		cube_r54.setRotationPoint(0.15F, -4.7F, -0.1F);
		handguard.addChild(cube_r54);
		setRotationAngle(cube_r54, 0.0F, 0.0F, -0.7854F);
		cube_r54.cubeList.add(new ModelBox(cube_r54, 35, 158, -0.2F, -0.8F, 9.8F, 1, 1, 1, -0.201F, false));

		cube_r55 = new ModelRenderer(this);
		cube_r55.setRotationPoint(0.15F, -6.55F, -0.1F);
		handguard.addChild(cube_r55);
		setRotationAngle(cube_r55, 0.0F, 0.0F, 0.7854F);
		cube_r55.cubeList.add(new ModelBox(cube_r55, 27, 158, -0.2F, -0.2F, 9.8F, 1, 1, 1, -0.201F, false));

		cube_r56 = new ModelRenderer(this);
		cube_r56.setRotationPoint(4.45F, -6.55F, -0.1F);
		handguard.addChild(cube_r56);
		setRotationAngle(cube_r56, 0.0F, 0.0F, -0.7854F);
		cube_r56.cubeList.add(new ModelBox(cube_r56, 57, 159, -0.8F, -0.2F, 9.8F, 1, 1, 1, -0.201F, false));

		cube_r57 = new ModelRenderer(this);
		cube_r57.setRotationPoint(4.45F, -4.7F, -0.1F);
		handguard.addChild(cube_r57);
		setRotationAngle(cube_r57, 0.0F, 0.0F, 0.7854F);
		cube_r57.cubeList.add(new ModelBox(cube_r57, 158, 54, -0.8F, -0.8F, 9.8F, 1, 1, 1, -0.201F, false));

		cube_r58 = new ModelRenderer(this);
		cube_r58.setRotationPoint(0.1F, 0.0F, 0.0F);
		handguard.addChild(cube_r58);
		setRotationAngle(cube_r58, 0.0F, 0.0F, -0.8552F);
		cube_r58.cubeList.add(new ModelBox(cube_r58, 2, 56, 0.0F, 0.0F, 2.0F, 1, 2, 20, -0.002F, false));

		cube_r59 = new ModelRenderer(this);
		cube_r59.setRotationPoint(4.5F, 0.0F, 0.0F);
		handguard.addChild(cube_r59);
		setRotationAngle(cube_r59, 0.0F, 0.0F, 0.8552F);
		cube_r59.cubeList.add(new ModelBox(cube_r59, 55, 26, -1.0F, 0.0F, 2.0F, 1, 2, 20, -0.002F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(5.3F, -14.9F, 1.25F);
		handguard.addChild(bone4);
		setRotationAngle(bone4, 0.0F, 0.0F, 1.5708F);
		bone4.cubeList.add(new ModelBox(bone4, 142, 61, 12.2F, -0.2F, 2.05F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 142, 59, 12.2F, -0.2F, 3.3F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 142, 57, 12.2F, -0.2F, 4.55F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 142, 55, 12.2F, -0.2F, 5.8F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 142, 49, 12.2F, -0.2F, 7.05F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 41, 142, 12.2F, -0.2F, 8.3F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 35, 142, 12.2F, -0.2F, 9.55F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 79, 26, 12.3F, 0.4F, 0.75F, 2, 1, 9, -0.001F, false));
		bone4.cubeList.add(new ModelBox(bone4, 29, 142, 12.3F, 0.4F, 9.35F, 2, 1, 1, -0.002F, false));
		bone4.cubeList.add(new ModelBox(bone4, 25, 130, 12.1F, 0.4F, 0.75F, 1, 1, 9, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 152, 26, 12.1F, 0.4F, 9.35F, 1, 1, 1, -0.003F, false));
		bone4.cubeList.add(new ModelBox(bone4, 41, 98, 12.2F, -0.2F, 0.75F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 41, 98, 12.2F, -0.2F, 0.55F, 2, 1, 1, -0.199F, false));

		cube_r60 = new ModelRenderer(this);
		cube_r60.setRotationPoint(-1.6F, 0.0F, -1.25F);
		bone4.addChild(cube_r60);
		setRotationAngle(cube_r60, 0.0F, 0.0F, 0.8901F);
		cube_r60.cubeList.add(new ModelBox(cube_r60, 134, 110, 8.6105F, -11.08F, 2.0F, 1, 1, 1, -0.198F, false));
		cube_r60.cubeList.add(new ModelBox(cube_r60, 134, 110, 8.6105F, -11.08F, 1.8F, 1, 1, 1, -0.198F, false));
		cube_r60.cubeList.add(new ModelBox(cube_r60, 131, 57, 8.5605F, -10.93F, 2.4F, 1, 1, 9, -0.35F, false));
		cube_r60.cubeList.add(new ModelBox(cube_r60, 152, 28, 8.6105F, -11.08F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r60.cubeList.add(new ModelBox(cube_r60, 36, 152, 8.6105F, -11.08F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r60.cubeList.add(new ModelBox(cube_r60, 40, 152, 8.6105F, -11.08F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r60.cubeList.add(new ModelBox(cube_r60, 152, 52, 8.6105F, -11.08F, 7.05F, 1, 1, 1, -0.198F, false));
		cube_r60.cubeList.add(new ModelBox(cube_r60, 57, 152, 8.6105F, -11.08F, 5.8F, 1, 1, 1, -0.198F, false));
		cube_r60.cubeList.add(new ModelBox(cube_r60, 65, 152, 8.6105F, -11.08F, 4.55F, 1, 1, 1, -0.198F, false));
		cube_r60.cubeList.add(new ModelBox(cube_r60, 69, 152, 8.6105F, -11.08F, 3.3F, 1, 1, 1, -0.198F, false));

		cube_r61 = new ModelRenderer(this);
		cube_r61.setRotationPoint(0.0F, 0.0F, -1.25F);
		bone4.addChild(cube_r61);
		setRotationAngle(cube_r61, 0.0F, 0.0F, -0.8901F);
		cube_r61.cubeList.add(new ModelBox(cube_r61, 113, 134, 8.0105F, 10.68F, 2.0F, 1, 1, 1, -0.198F, false));
		cube_r61.cubeList.add(new ModelBox(cube_r61, 113, 134, 8.0105F, 10.68F, 1.8F, 1, 1, 1, -0.198F, false));
		cube_r61.cubeList.add(new ModelBox(cube_r61, 131, 79, 8.0605F, 10.83F, 2.4F, 1, 1, 9, -0.35F, false));
		cube_r61.cubeList.add(new ModelBox(cube_r61, 28, 152, 8.0105F, 10.68F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r61.cubeList.add(new ModelBox(cube_r61, 32, 152, 8.0105F, 10.68F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r61.cubeList.add(new ModelBox(cube_r61, 152, 38, 8.0105F, 10.68F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r61.cubeList.add(new ModelBox(cube_r61, 152, 49, 8.0105F, 10.68F, 7.05F, 1, 1, 1, -0.198F, false));
		cube_r61.cubeList.add(new ModelBox(cube_r61, 53, 152, 8.0105F, 10.68F, 5.8F, 1, 1, 1, -0.198F, false));
		cube_r61.cubeList.add(new ModelBox(cube_r61, 61, 152, 8.0105F, 10.68F, 4.55F, 1, 1, 1, -0.198F, false));
		cube_r61.cubeList.add(new ModelBox(cube_r61, 152, 66, 8.0105F, 10.68F, 3.3F, 1, 1, 1, -0.198F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(15.5F, 2.2F, 1.25F);
		handguard.addChild(bone6);
		setRotationAngle(bone6, 0.0F, 0.0F, -3.1416F);
		bone6.cubeList.add(new ModelBox(bone6, 73, 141, 12.2F, -0.2F, 3.3F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 73, 141, 12.2F, -0.2F, 2.1F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 65, 141, 12.2F, -0.2F, 4.55F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 59, 141, 12.2F, -0.2F, 5.8F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 53, 141, 12.2F, -0.2F, 7.05F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 141, 44, 12.2F, -0.2F, 8.3F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 141, 35, 12.2F, -0.2F, 9.55F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 140, 120, 12.2F, -0.2F, 12.05F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 11, 141, 12.2F, -0.2F, 10.8F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 112, 140, 12.2F, -0.2F, 14.55F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 118, 140, 12.2F, -0.2F, 13.3F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 94, 140, 12.2F, -0.2F, 17.05F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 106, 140, 12.2F, -0.2F, 15.8F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 35, 140, 12.2F, -0.2F, 19.55F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 29, 140, 12.2F, -0.2F, 19.95F, 2, 1, 1, -0.198F, false));
		bone6.cubeList.add(new ModelBox(bone6, 41, 140, 12.2F, -0.2F, 18.3F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 2, 26, 12.3F, 0.4F, 0.75F, 2, 1, 20, -0.001F, false));
		bone6.cubeList.add(new ModelBox(bone6, 55, 57, 12.1F, 0.4F, 0.75F, 1, 1, 20, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 53, 96, 12.2F, -0.2F, 0.55F, 2, 1, 2, -0.199F, false));

		cube_r62 = new ModelRenderer(this);
		cube_r62.setRotationPoint(-1.6F, 0.0F, -1.25F);
		bone6.addChild(cube_r62);
		setRotationAngle(cube_r62, 0.0F, 0.0F, 0.8901F);
		cube_r62.cubeList.add(new ModelBox(cube_r62, 12, 133, 8.6105F, -11.08F, 1.8F, 1, 1, 2, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 108, 110, 8.5605F, -10.93F, 2.4F, 1, 1, 19, -0.35F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 150, 100, 8.6105F, -11.08F, 19.55F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 150, 90, 8.6105F, -11.08F, 21.2F, 1, 1, 1, -0.197F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 150, 95, 8.6105F, -11.08F, 20.8F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 150, 114, 8.6105F, -11.08F, 17.05F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 150, 110, 8.6105F, -11.08F, 18.3F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 150, 134, 8.6105F, -11.08F, 14.55F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 150, 126, 8.6105F, -11.08F, 15.8F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 150, 142, 8.6105F, -11.08F, 12.05F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 150, 138, 8.6105F, -11.08F, 13.3F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 151, 21, 8.6105F, -11.08F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 151, 35, 8.6105F, -11.08F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 151, 43, 8.6105F, -11.08F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 151, 47, 8.6105F, -11.08F, 7.05F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 151, 92, 8.6105F, -11.08F, 5.8F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 100, 151, 8.6105F, -11.08F, 4.55F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 100, 151, 8.6105F, -11.08F, 3.35F, 1, 1, 1, -0.198F, false));

		cube_r63 = new ModelRenderer(this);
		cube_r63.setRotationPoint(0.0F, 0.0F, -1.25F);
		bone6.addChild(cube_r63);
		setRotationAngle(cube_r63, 0.0F, 0.0F, -0.8901F);
		cube_r63.cubeList.add(new ModelBox(cube_r63, 23, 133, 8.0105F, 10.68F, 1.8F, 1, 1, 2, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 2, 130, 8.0605F, 10.83F, 2.4F, 1, 1, 19, -0.35F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 150, 108, 8.0105F, 10.68F, 19.55F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 93, 150, 8.0105F, 10.68F, 21.2F, 1, 1, 1, -0.197F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 150, 97, 8.0105F, 10.68F, 20.8F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 150, 116, 8.0105F, 10.68F, 17.05F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 150, 112, 8.0105F, 10.68F, 18.3F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 150, 136, 8.0105F, 10.68F, 14.55F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 150, 132, 8.0105F, 10.68F, 15.8F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 143, 150, 8.0105F, 10.68F, 12.05F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 150, 140, 8.0105F, 10.68F, 13.3F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 151, 18, 8.0105F, 10.68F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 151, 33, 8.0105F, 10.68F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 43, 151, 8.0105F, 10.68F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 47, 151, 8.0105F, 10.68F, 7.05F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 151, 70, 8.0105F, 10.68F, 5.8F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 96, 151, 8.0105F, 10.68F, 4.55F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 96, 151, 8.0105F, 10.68F, 3.35F, 1, 1, 1, -0.198F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-0.7F, -14.9F, 1.25F);
		handguard.addChild(bone5);
		setRotationAngle(bone5, 0.0F, 0.0F, -1.5708F);
		bone5.cubeList.add(new ModelBox(bone5, 142, 18, -14.2F, -0.2F, 2.05F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 6, 142, -14.2F, -0.2F, 3.3F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 0, 142, -14.2F, -0.2F, 4.55F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 132, 141, -14.2F, -0.2F, 5.8F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 126, 141, -14.2F, -0.2F, 7.05F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 141, 99, -14.2F, -0.2F, 8.3F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 141, 96, -14.2F, -0.2F, 9.55F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 79, 2, -14.3F, 0.4F, 0.75F, 2, 1, 9, -0.001F, false));
		bone5.cubeList.add(new ModelBox(bone5, 89, 141, -14.3F, 0.4F, 9.35F, 2, 1, 1, -0.002F, false));
		bone5.cubeList.add(new ModelBox(bone5, 26, 80, -13.1F, 0.4F, 0.75F, 1, 1, 9, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 146, 151, -13.1F, 0.4F, 9.35F, 1, 1, 1, -0.003F, false));
		bone5.cubeList.add(new ModelBox(bone5, 62, 97, -14.2F, -0.2F, 0.75F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 62, 97, -14.2F, -0.2F, 0.55F, 2, 1, 1, -0.199F, false));

		cube_r64 = new ModelRenderer(this);
		cube_r64.setRotationPoint(1.6F, 0.0F, -1.25F);
		bone5.addChild(cube_r64);
		setRotationAngle(cube_r64, 0.0F, 0.0F, -0.8901F);
		cube_r64.cubeList.add(new ModelBox(cube_r64, 134, 84, -9.6105F, -11.08F, 2.0F, 1, 1, 1, -0.198F, false));
		cube_r64.cubeList.add(new ModelBox(cube_r64, 134, 84, -9.6105F, -11.08F, 1.8F, 1, 1, 1, -0.198F, false));
		cube_r64.cubeList.add(new ModelBox(cube_r64, 79, 80, -9.5605F, -10.93F, 2.4F, 1, 1, 9, -0.35F, false));
		cube_r64.cubeList.add(new ModelBox(cube_r64, 151, 148, -9.6105F, -11.08F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r64.cubeList.add(new ModelBox(cube_r64, 152, 0, -9.6105F, -11.08F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r64.cubeList.add(new ModelBox(cube_r64, 4, 152, -9.6105F, -11.08F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r64.cubeList.add(new ModelBox(cube_r64, 152, 6, -9.6105F, -11.08F, 7.05F, 1, 1, 1, -0.198F, false));
		cube_r64.cubeList.add(new ModelBox(cube_r64, 152, 8, -9.6105F, -11.08F, 5.8F, 1, 1, 1, -0.198F, false));
		cube_r64.cubeList.add(new ModelBox(cube_r64, 152, 13, -9.6105F, -11.08F, 4.55F, 1, 1, 1, -0.198F, false));
		cube_r64.cubeList.add(new ModelBox(cube_r64, 20, 152, -9.6105F, -11.08F, 3.3F, 1, 1, 1, -0.198F, false));

		cube_r65 = new ModelRenderer(this);
		cube_r65.setRotationPoint(0.0F, 0.0F, -1.25F);
		bone5.addChild(cube_r65);
		setRotationAngle(cube_r65, 0.0F, 0.0F, 0.8901F);
		cube_r65.cubeList.add(new ModelBox(cube_r65, 107, 134, -9.0105F, 10.68F, 2.0F, 1, 1, 1, -0.198F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 107, 134, -9.0105F, 10.68F, 1.8F, 1, 1, 1, -0.198F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 78, 109, -9.0605F, 10.83F, 2.4F, 1, 1, 9, -0.35F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 151, 146, -9.0105F, 10.68F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 0, 152, -9.0105F, 10.68F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 152, 2, -9.0105F, 10.68F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 152, 4, -9.0105F, 10.68F, 7.05F, 1, 1, 1, -0.198F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 8, 152, -9.0105F, 10.68F, 5.8F, 1, 1, 1, -0.198F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 12, 152, -9.0105F, 10.68F, 4.55F, 1, 1, 1, -0.198F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 16, 152, -9.0105F, 10.68F, 3.3F, 1, 1, 1, -0.198F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		handguard.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}