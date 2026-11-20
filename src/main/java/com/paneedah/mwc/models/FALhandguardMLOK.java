package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class FALhandguardMLOK extends ModelBase {
	private final ModelRenderer handguardDSA;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r4;
	private final ModelRenderer bone8;
	private final ModelRenderer bone26;
	private final ModelRenderer bone35;
	private final ModelRenderer rail2;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;

	public FALhandguardMLOK() {
		textureWidth = 576;
		textureHeight = 576;

		handguardDSA = new ModelRenderer(this);
		handguardDSA.setRotationPoint(0.0F, 24.0F, 1.0F);
		handguardDSA.cubeList.add(new ModelBox(handguardDSA, 0, 195, -2.5F, -41.8F, -64.65F, 2, 1, 36, 0.0F, false));
		handguardDSA.cubeList.add(new ModelBox(handguardDSA, 136, 301, -3.0F, -40.9032F, -64.6436F, 3, 1, 31, 0.0F, false));
		handguardDSA.cubeList.add(new ModelBox(handguardDSA, 70, 556, -3.0F, -34.6F, -34.55F, 3, 1, 2, -0.1F, false));
		handguardDSA.cubeList.add(new ModelBox(handguardDSA, 110, 552, -0.0201F, -38.5799F, -34.55F, 2, 3, 2, -0.1F, false));
		handguardDSA.cubeList.add(new ModelBox(handguardDSA, 166, 554, -4.9799F, -38.5799F, -34.55F, 2, 3, 2, -0.1F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-2.1929F, -34.9728F, -33.55F);
		handguardDSA.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 28, 548, -1.5F, -2.5F, -1.0F, 2, 3, 2, -0.1F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.6071F, -34.9728F, -33.55F);
		handguardDSA.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.7854F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 550, 554, -1.5F, -1.5F, -1.0F, 3, 2, 2, -0.1F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-1.5F, -33.6606F, -51.1436F);
		handguardDSA.addChild(bone8);
		bone8.cubeList.add(new ModelBox(bone8, 220, 232, 0.5F, -0.5F, -15.5F, 1, 1, 33, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 74, 233, -1.5F, -0.5F, -15.5F, 1, 1, 33, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 252, 553, -0.5F, -0.5F, 13.5F, 1, 1, 4, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 558, 277, -0.5F, -0.5F, 8.5F, 1, 1, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 558, 279, -0.5F, -0.5F, 3.5F, 1, 1, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 558, 281, -0.5F, -0.5F, -6.5F, 1, 1, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 280, 558, -0.5F, -0.5F, -1.5F, 1, 1, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 518, 293, -1.5F, -1.5F, -20.5F, 3, 2, 5, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 284, 558, -0.5F, -0.5F, -11.5F, 1, 1, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 234, 102, 2.8713F, -4.6213F, -15.5F, 1, 1, 33, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 234, 68, -3.8713F, -2.6213F, -15.5F, 1, 1, 33, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 542, 235, 1.8713F, -4.6213F, -20.5F, 2, 3, 5, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 558, 372, 2.8713F, -3.6213F, -11.5F, 1, 1, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 356, 330, -4.0287F, -5.0213F, -17.2F, 8, 1, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 370, 125, -4.0287F, -5.0213F, -20.2F, 8, 1, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 558, 370, 2.8713F, -3.6213F, -6.5F, 1, 1, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 336, 558, 2.8713F, -3.6213F, -1.5F, 1, 1, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 332, 558, 2.8713F, -3.6213F, 3.5F, 1, 1, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 328, 558, 2.8713F, -3.6213F, 8.5F, 1, 1, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 282, 553, 2.8713F, -3.6213F, 13.5F, 1, 1, 4, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 220, 266, -3.8713F, -4.6213F, -15.5F, 1, 1, 33, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 234, 136, 2.8713F, -2.6213F, -15.5F, 1, 1, 33, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 0, 39, -3.6213F, -5.1213F, -20.5F, 1, 1, 38, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 0, 0, 2.6213F, -5.1213F, -20.5F, 1, 1, 38, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 558, 460, -3.3713F, -5.6213F, -12.5F, 1, 1, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 558, 458, 2.3713F, -5.6213F, -12.5F, 1, 1, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 558, 464, -3.3713F, -5.6213F, 1.5F, 1, 1, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 558, 462, 2.3713F, -5.6213F, 1.5F, 1, 1, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 558, 468, -3.3713F, -5.6213F, 15.5F, 1, 1, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 558, 466, 2.3713F, -5.6213F, 15.5F, 1, 1, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 544, 458, -3.8713F, -4.6213F, -20.5F, 2, 3, 5, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 558, 382, -3.8713F, -3.6213F, -11.5F, 1, 1, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 558, 380, -3.8713F, -3.6213F, -6.5F, 1, 1, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 558, 378, -3.8713F, -3.6213F, -1.5F, 1, 1, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 558, 376, -3.8713F, -3.6213F, 3.5F, 1, 1, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 558, 374, -3.8713F, -3.6213F, 8.5F, 1, 1, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 292, 553, -3.8713F, -3.6213F, 13.5F, 1, 1, 4, 0.0F, false));

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(-1.5F, -33.6606F, -51.1436F);
		handguardDSA.addChild(bone26);
		setRotationAngle(bone26, 0.0F, 0.0F, -0.7854F);
		bone26.cubeList.add(new ModelBox(bone26, 118, 536, 5.182F, -2.0607F, 2.5F, 1, 1, 13, 0.0F, false));
		bone26.cubeList.add(new ModelBox(bone26, 452, 394, 5.182F, -2.0607F, 16.5F, 1, 1, 1, 0.0F, false));
		bone26.cubeList.add(new ModelBox(bone26, 310, 490, 5.182F, -2.0607F, -13.5F, 1, 1, 1, 0.0F, false));
		bone26.cubeList.add(new ModelBox(bone26, 194, 536, 5.182F, -2.0607F, -11.5F, 1, 1, 13, 0.0F, false));
		bone26.cubeList.add(new ModelBox(bone26, 320, 397, 5.182F, -4.0607F, -13.5F, 1, 2, 3, 0.0F, false));
		bone26.cubeList.add(new ModelBox(bone26, 528, 328, 5.182F, -4.0607F, -1.5F, 1, 2, 19, 0.0F, false));
		bone26.cubeList.add(new ModelBox(bone26, 222, 536, 5.182F, -4.0607F, -10.5F, 1, 1, 9, 0.0F, false));
		bone26.cubeList.add(new ModelBox(bone26, 118, 512, 5.182F, -3.0607F, -4.75F, 1, 1, 1, 0.0F, false));
		bone26.cubeList.add(new ModelBox(bone26, 540, 458, 5.182F, -3.0607F, -8.0F, 1, 1, 1, 0.0F, false));
		bone26.cubeList.add(new ModelBox(bone26, 74, 267, 2.7071F, 0.4142F, -15.5F, 1, 1, 33, 0.0F, false));
		bone26.cubeList.add(new ModelBox(bone26, 234, 0, 0.7071F, 0.4142F, -15.5F, 1, 1, 33, 0.0F, false));
		bone26.cubeList.add(new ModelBox(bone26, 262, 553, 1.7071F, 0.4142F, 13.5F, 1, 1, 4, 0.0F, false));
		bone26.cubeList.add(new ModelBox(bone26, 288, 558, 1.7071F, 0.4142F, 8.5F, 1, 1, 1, 0.0F, false));
		bone26.cubeList.add(new ModelBox(bone26, 292, 558, 1.7071F, 0.4142F, 3.5F, 1, 1, 1, 0.0F, false));
		bone26.cubeList.add(new ModelBox(bone26, 296, 558, 1.7071F, 0.4142F, -6.5F, 1, 1, 1, 0.0F, false));
		bone26.cubeList.add(new ModelBox(bone26, 300, 558, 1.7071F, 0.4142F, -1.5F, 1, 1, 1, 0.0F, false));
		bone26.cubeList.add(new ModelBox(bone26, 542, 80, 0.7071F, -0.5858F, -20.5F, 3, 2, 5, 0.0F, false));
		bone26.cubeList.add(new ModelBox(bone26, 304, 558, 1.7071F, 0.4142F, -11.5F, 1, 1, 1, 0.0F, false));

		bone35 = new ModelRenderer(this);
		bone35.setRotationPoint(0.7071F, -34.5748F, -51.1436F);
		handguardDSA.addChild(bone35);
		setRotationAngle(bone35, 0.0F, 0.0F, 0.7854F);
		bone35.cubeList.add(new ModelBox(bone35, 234, 34, -2.6213F, 2.6213F, -15.5F, 1, 1, 33, 0.0F, false));
		bone35.cubeList.add(new ModelBox(bone35, 536, 160, -7.0962F, 0.1464F, 2.5F, 1, 1, 13, 0.0F, false));
		bone35.cubeList.add(new ModelBox(bone35, 426, 558, -7.0962F, 0.1464F, 16.5F, 1, 1, 1, 0.0F, false));
		bone35.cubeList.add(new ModelBox(bone35, 430, 558, -7.0962F, 0.1464F, -13.5F, 1, 1, 1, 0.0F, false));
		bone35.cubeList.add(new ModelBox(bone35, 536, 174, -7.0962F, 0.1464F, -11.5F, 1, 1, 13, 0.0F, false));
		bone35.cubeList.add(new ModelBox(bone35, 256, 392, -7.0962F, -1.8536F, -13.5F, 1, 2, 3, 0.0F, false));
		bone35.cubeList.add(new ModelBox(bone35, 528, 349, -7.0962F, -1.8536F, -1.5F, 1, 2, 19, 0.0F, false));
		bone35.cubeList.add(new ModelBox(bone35, 242, 536, -7.0962F, -1.8536F, -10.5F, 1, 1, 9, 0.0F, false));
		bone35.cubeList.add(new ModelBox(bone35, 558, 470, -7.0962F, -0.8536F, -4.75F, 1, 1, 1, 0.0F, false));
		bone35.cubeList.add(new ModelBox(bone35, 558, 472, -7.0962F, -0.8536F, -8.0F, 1, 1, 1, 0.0F, false));
		bone35.cubeList.add(new ModelBox(bone35, 142, 267, -4.6213F, 2.6213F, -15.5F, 1, 1, 33, 0.0F, false));
		bone35.cubeList.add(new ModelBox(bone35, 272, 553, -3.6213F, 2.6213F, 13.5F, 1, 1, 4, 0.0F, false));
		bone35.cubeList.add(new ModelBox(bone35, 308, 558, -3.6213F, 2.6213F, 8.5F, 1, 1, 1, 0.0F, false));
		bone35.cubeList.add(new ModelBox(bone35, 312, 558, -3.6213F, 2.6213F, 3.5F, 1, 1, 1, 0.0F, false));
		bone35.cubeList.add(new ModelBox(bone35, 316, 558, -3.6213F, 2.6213F, -6.5F, 1, 1, 1, 0.0F, false));
		bone35.cubeList.add(new ModelBox(bone35, 320, 558, -3.6213F, 2.6213F, -1.5F, 1, 1, 1, 0.0F, false));
		bone35.cubeList.add(new ModelBox(bone35, 500, 482, -4.6213F, 1.6213F, -20.5F, 3, 2, 5, 0.0F, false));
		bone35.cubeList.add(new ModelBox(bone35, 324, 558, -3.6213F, 2.6213F, -11.5F, 1, 1, 1, 0.0F, false));

		rail2 = new ModelRenderer(this);
		rail2.setRotationPoint(-1.5237F, -41.3381F, -41.5868F);
		handguardDSA.addChild(rail2);
		rail2.cubeList.add(new ModelBox(rail2, 428, 394, -0.9737F, -1.0632F, -8.9132F, 2, 1, 1, -0.199F, false));
		rail2.cubeList.add(new ModelBox(rail2, 430, 189, -0.9737F, -1.0632F, -10.1132F, 2, 1, 1, -0.199F, false));
		rail2.cubeList.add(new ModelBox(rail2, 434, 394, -0.9737F, -1.0632F, -7.6632F, 2, 1, 1, -0.199F, false));
		rail2.cubeList.add(new ModelBox(rail2, 436, 189, -0.9737F, -1.0632F, -6.4132F, 2, 1, 1, -0.199F, false));
		rail2.cubeList.add(new ModelBox(rail2, 440, 394, -0.9737F, -1.0632F, -5.1632F, 2, 1, 1, -0.199F, false));
		rail2.cubeList.add(new ModelBox(rail2, 442, 189, -0.9737F, -1.0632F, -3.9132F, 2, 1, 1, -0.199F, false));
		rail2.cubeList.add(new ModelBox(rail2, 446, 394, -0.9737F, -1.0632F, -16.4132F, 2, 1, 1, -0.199F, false));
		rail2.cubeList.add(new ModelBox(rail2, 448, 189, -0.9737F, -1.0632F, -15.1632F, 2, 1, 1, -0.199F, false));
		rail2.cubeList.add(new ModelBox(rail2, 454, 189, -0.9737F, -1.0632F, -13.9132F, 2, 1, 1, -0.199F, false));
		rail2.cubeList.add(new ModelBox(rail2, 456, 426, -0.9737F, -1.0632F, -12.6632F, 2, 1, 1, -0.199F, false));
		rail2.cubeList.add(new ModelBox(rail2, 460, 189, -0.9737F, -1.0632F, -11.4132F, 2, 1, 1, -0.199F, false));
		rail2.cubeList.add(new ModelBox(rail2, 462, 426, -0.9737F, -1.0632F, -17.6632F, 2, 1, 1, -0.199F, false));
		rail2.cubeList.add(new ModelBox(rail2, 112, 512, -0.9737F, -1.0632F, -21.4132F, 2, 1, 1, -0.199F, false));
		rail2.cubeList.add(new ModelBox(rail2, 106, 512, -0.9737F, -1.0632F, -20.1632F, 2, 1, 1, -0.199F, false));
		rail2.cubeList.add(new ModelBox(rail2, 504, 426, -0.9737F, -1.0632F, -18.9132F, 2, 1, 1, -0.199F, false));
		rail2.cubeList.add(new ModelBox(rail2, 498, 426, -0.9737F, -1.0632F, -22.6632F, 2, 1, 1, -0.199F, false));
		rail2.cubeList.add(new ModelBox(rail2, 44, 513, -0.9737F, -1.0632F, -23.2632F, 2, 1, 1, -0.199F, false));
		rail2.cubeList.add(new ModelBox(rail2, 466, 189, -0.9737F, -1.0632F, -2.6632F, 2, 1, 1, -0.199F, false));
		rail2.cubeList.add(new ModelBox(rail2, 468, 426, -0.9737F, -1.0632F, -0.1632F, 2, 1, 1, -0.199F, false));
		rail2.cubeList.add(new ModelBox(rail2, 472, 189, -0.9737F, -1.0632F, -1.4132F, 2, 1, 1, -0.199F, false));
		rail2.cubeList.add(new ModelBox(rail2, 474, 426, -0.9737F, -1.0632F, 2.3368F, 2, 1, 1, -0.199F, false));
		rail2.cubeList.add(new ModelBox(rail2, 478, 189, -0.9737F, -1.0632F, 1.0868F, 2, 1, 1, -0.199F, false));
		rail2.cubeList.add(new ModelBox(rail2, 480, 426, -0.9737F, -1.0632F, 4.8368F, 2, 1, 1, -0.199F, false));
		rail2.cubeList.add(new ModelBox(rail2, 486, 426, -0.9737F, -1.0632F, 3.5868F, 2, 1, 1, -0.199F, false));
		rail2.cubeList.add(new ModelBox(rail2, 122, 489, -0.9737F, -1.0632F, 7.3368F, 2, 1, 1, -0.199F, false));
		rail2.cubeList.add(new ModelBox(rail2, 558, 12, -0.9737F, -1.0632F, 8.5368F, 2, 1, 1, -0.198F, false));
		rail2.cubeList.add(new ModelBox(rail2, 292, 490, -0.9737F, -1.0632F, 10.9868F, 2, 1, 1, -0.198F, false));
		rail2.cubeList.add(new ModelBox(rail2, 298, 490, -0.9737F, -1.0632F, 9.7868F, 2, 1, 1, -0.198F, false));
		rail2.cubeList.add(new ModelBox(rail2, 304, 490, -0.9737F, -1.0632F, 12.1368F, 2, 1, 1, -0.198F, false));
		rail2.cubeList.add(new ModelBox(rail2, 492, 426, -0.9737F, -1.0632F, 6.0868F, 2, 1, 1, -0.199F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-14.7737F, -0.3632F, -12.4632F);
		rail2.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.8901F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 224, 195, 8.1719F, -11.2447F, -10.3F, 1, 1, 36, -0.35F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 474, 558, 8.2219F, -11.3947F, 18.55F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 332, 560, 8.2219F, -11.3947F, 21.0F, 1, 1, 1, -0.197F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 558, 474, 8.2219F, -11.3947F, 23.45F, 1, 1, 1, -0.197F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 558, 476, 8.2219F, -11.3947F, 22.25F, 1, 1, 1, -0.197F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 478, 558, 8.2219F, -11.3947F, 24.6F, 1, 1, 1, -0.197F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 558, 478, 8.2219F, -11.3947F, 19.8F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 558, 480, 8.2219F, -11.3947F, 16.05F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 482, 558, 8.2219F, -11.3947F, 17.3F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 558, 512, 8.2219F, -11.3947F, 13.55F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 558, 514, 8.2219F, -11.3947F, 14.8F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 558, 516, 8.2219F, -11.3947F, 11.05F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 558, 518, 8.2219F, -11.3947F, 12.3F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 558, 520, 8.2219F, -11.3947F, 9.8F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 558, 522, 8.2219F, -11.3947F, 8.55F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 558, 524, 8.2219F, -11.3947F, 7.3F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 526, 558, 8.2219F, -11.3947F, 6.05F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 558, 526, 8.2219F, -11.3947F, 4.8F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 558, 528, 8.2219F, -11.3947F, 3.55F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 530, 558, 8.2219F, -11.3947F, -3.95F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 558, 530, 8.2219F, -11.3947F, -2.7F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 558, 532, 8.2219F, -11.3947F, -1.45F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 534, 558, 8.2219F, -11.3947F, -0.2F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 550, 558, 8.2219F, -11.3947F, 1.05F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 554, 558, 8.2219F, -11.3947F, -5.2F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 486, 559, 8.2219F, -11.3947F, -8.95F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 468, 559, 8.2219F, -11.3947F, -7.7F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 422, 559, 8.2219F, -11.3947F, -6.45F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 418, 559, 8.2219F, -11.3947F, -10.2F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 494, 559, 8.2219F, -11.3947F, -10.8F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 558, 558, 8.2219F, -11.3947F, 2.35F, 1, 1, 1, -0.198F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-13.1737F, -0.3632F, -12.4632F);
		rail2.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.8901F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 232, 8.4491F, 10.5153F, -10.3F, 1, 1, 36, -0.35F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 559, 8.3991F, 10.3653F, 18.55F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 336, 560, 8.3991F, 10.3653F, 21.0F, 1, 1, 1, -0.197F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 4, 559, 8.3991F, 10.3653F, 23.45F, 1, 1, 1, -0.197F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 8, 559, 8.3991F, 10.3653F, 22.25F, 1, 1, 1, -0.197F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 12, 559, 8.3991F, 10.3653F, 24.6F, 1, 1, 1, -0.197F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 16, 559, 8.3991F, 10.3653F, 19.8F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 20, 559, 8.3991F, 10.3653F, 16.05F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 24, 559, 8.3991F, 10.3653F, 17.3F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 28, 559, 8.3991F, 10.3653F, 13.55F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 32, 559, 8.3991F, 10.3653F, 14.8F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 36, 559, 8.3991F, 10.3653F, 11.05F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 40, 559, 8.3991F, 10.3653F, 12.3F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 44, 559, 8.3991F, 10.3653F, 9.8F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 48, 559, 8.3991F, 10.3653F, 8.55F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 52, 559, 8.3991F, 10.3653F, 7.3F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 56, 559, 8.3991F, 10.3653F, 6.05F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 60, 559, 8.3991F, 10.3653F, 4.8F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 64, 559, 8.3991F, 10.3653F, 3.55F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 68, 559, 8.3991F, 10.3653F, -3.95F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 72, 559, 8.3991F, 10.3653F, -2.7F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 76, 559, 8.3991F, 10.3653F, -1.45F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 146, 559, 8.3991F, 10.3653F, -0.2F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 150, 559, 8.3991F, 10.3653F, 1.05F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 154, 559, 8.3991F, 10.3653F, -5.2F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 414, 559, 8.3991F, 10.3653F, -8.95F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 170, 559, 8.3991F, 10.3653F, -7.7F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 166, 559, 8.3991F, 10.3653F, -6.45F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 162, 559, 8.3991F, 10.3653F, -10.2F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 490, 559, 8.3991F, 10.3653F, -10.8F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 158, 559, 8.3991F, 10.3653F, 2.35F, 1, 1, 1, -0.198F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		handguardDSA.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}