package com.paneedah.mwc.models;

import com.paneedah.weaponlib2.ai.EntityCustomMob;
import com.paneedah.weaponlib2.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumHandSide;
import net.minecraft.util.math.MathHelper;

// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class SWAT_Officer extends ModelBiped {
	private final QRenderer head;
	private final ModelRenderer helmet;
	private final ModelRenderer bone;
	private final ModelRenderer bone16;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer bone6;
	private final ModelRenderer bone5;
	private final ModelRenderer bone11;
	private final ModelRenderer bone12;
	private final ModelRenderer bone13;
	private final ModelRenderer bone4;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;
	private final ModelRenderer bone7;
	private final ModelRenderer bone10;
	private final ModelRenderer bone14;
	private final QRenderer body;
	private final ModelRenderer jacket;
	private final ModelRenderer jacket1;
	private final ModelRenderer jacket2;
	private final ModelRenderer jacket3;
	private final ModelRenderer jacket4;
	private final ModelRenderer jacket5;
	private final ModelRenderer jacket6;
	private final ModelRenderer jacket7;
	private final ModelRenderer vest;
	private final ModelRenderer bone19;
	private final ModelRenderer bone17;
	private final ModelRenderer bone20;
	private final ModelRenderer bone26;
	private final ModelRenderer bone21;
	private final ModelRenderer bone22;
	private final ModelRenderer bone23;
	private final ModelRenderer bone24;
	private final ModelRenderer bone25;
	private final ModelRenderer bone27;
	private final ModelRenderer patch;
	private final ModelRenderer bone15;
	private final ModelRenderer bone28;
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
	private final ModelRenderer holster;
	private final QRenderer rightarm;
	private final ModelRenderer rightarm_scp;
	private final ModelRenderer rightarm1;
	private final ModelRenderer rightarm2;
	private final ModelRenderer rightarm3;
	private final ModelRenderer rightarm4;
	private final ModelRenderer rightarm5;
	private final ModelRenderer rightarm6;
	private final ModelRenderer rightarm7;
	private final QRenderer leftarm;
	private final ModelRenderer leftarm_scp;
	private final ModelRenderer leftarm1;
	private final ModelRenderer leftarm2;
	private final ModelRenderer leftarm3;
	private final ModelRenderer leftarm4;
	private final ModelRenderer leftarm5;
	private final ModelRenderer leftarm6;
	private final ModelRenderer leftarm7;
	private final QRenderer rightleg;
	private final ModelRenderer rightleg_scp;
	private final ModelRenderer rightleg1;
	private final ModelRenderer rightleg2;
	private final ModelRenderer rightleg3;
	private final ModelRenderer rightleg4;
	private final QRenderer leftleg;
	private final ModelRenderer leftleg_scp;
	private final ModelRenderer leftleg1;
	private final ModelRenderer leftleg2;
	private final ModelRenderer leftleg3;
	private final ModelRenderer leftleg4;
	private final ModelRenderer leftleg5;

	public SWAT_Officer() {
		textureWidth = 130;
		textureHeight = 195;

		head = new QRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 1, 130, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));

		helmet = new ModelRenderer(this);
		helmet.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(helmet);
		

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(bone);
		setRotation(bone, -0.2443F, 0.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 73, 33, -4.0F, -6.9093F, -6.0678F, 8, 2, 1, 0.0F, false));

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(bone16);
		setRotation(bone16, 0.1571F, 0.0F, 0.0F);
		bone16.cubeList.add(new ModelBox(bone16, 53, 1, -4.0F, -7.4229F, 3.4514F, 8, 3, 2, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(bone2);
		setRotation(bone2, 0.0F, 0.0F, -0.2094F);
		bone2.cubeList.add(new ModelBox(bone2, 1, 32, 4.746F, -7.1F, -4.001F, 1, 3, 8, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 20, 32, 5.1706F, -5.7858F, -1.3F, 1, 2, 2, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-0.95F, 1.9F, 0.0F);
		helmet.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 32, 106, 4.746F, -7.1F, 1.0F, 1, 2, 3, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 73, 37, -3.604F, -7.1F, -1.05F, 1, 4, 5, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 68, 75, 4.496F, -7.1F, -1.05F, 1, 4, 5, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 47, 33, -3.104F, -5.1F, 3.2F, 3, 2, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 92, 6, -1.004F, -5.1F, 3.201F, 6, 2, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 36, 73, -3.604F, -7.85F, -2.05F, 1, 3, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 106, 114, 4.496F, -7.85F, -2.05F, 1, 3, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 106, 87, -3.8F, -7.1F, 1.0F, 1, 2, 3, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 73, 47, -3.054F, -7.1F, 3.7F, 8, 2, 1, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-2.65F, -5.9F, -2.05F);
		bone3.addChild(bone6);
		setRotation(bone6, 0.5236F, 0.0F, 0.0F);
		bone6.cubeList.add(new ModelBox(bone6, 62, 81, -0.95F, 0.866F, -0.5F, 1, 2, 1, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 57, 92, 7.15F, 0.866F, -0.5F, 1, 2, 1, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(5.8F, -5.1F, 1.0F);
		bone3.addChild(bone5);
		setRotation(bone5, 0.8552F, 0.0F, 0.0F);
		bone5.cubeList.add(new ModelBox(bone5, 112, 106, -1.05F, -3.0F, 0.0F, 1, 3, 2, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 112, 112, -9.61F, -3.0F, 0.0F, 1, 3, 2, 0.0F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(bone11);
		bone11.cubeList.add(new ModelBox(bone11, 1, 13, -3.5F, -8.9F, -3.49F, 7, 1, 7, 0.0F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(bone12);
		setRotation(bone12, -0.7854F, 0.0F, 0.0F);
		bone12.cubeList.add(new ModelBox(bone12, 77, 29, -3.5F, -3.8F, -8.76F, 7, 1, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 86, 43, -3.5F, -8.7497F, -3.8103F, 7, 1, 1, 0.0F, false));

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(bone13);
		setRotation(bone13, 0.0F, 0.0F, 0.7854F);
		bone13.cubeList.add(new ModelBox(bone13, 56, 33, -3.85F, -8.75F, -3.5F, 1, 1, 7, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 56, 42, -8.75F, -3.871F, -3.5F, 1, 1, 7, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(bone4);
		setRotation(bone4, 0.0F, 0.0F, 0.2094F);
		bone4.cubeList.add(new ModelBox(bone4, 20, 37, -5.7362F, -7.1F, -4.001F, 1, 3, 8, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 12, 44, -6.0651F, -5.688F, -1.3F, 1, 2, 2, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(bone8);
		setRotation(bone8, -0.1571F, 0.0F, 0.0F);
		bone8.cubeList.add(new ModelBox(bone8, 53, 64, -4.2F, -5.1F, -3.9F, 1, 5, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 36, 66, 3.2F, -5.1F, -3.9F, 1, 5, 1, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(bone9);
		setRotation(bone9, 0.192F, 0.0F, 0.0F);
		bone9.cubeList.add(new ModelBox(bone9, 30, 1, -4.1F, -1.8253F, -3.9628F, 3, 1, 8, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 34, 95, -1.5F, -1.9616F, -4.14F, 3, 1, 1, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 30, 11, 1.1F, -1.8253F, -3.9628F, 3, 1, 8, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(5.8F, -4.75F, -1.0F);
		helmet.addChild(bone7);
		setRotation(bone7, -0.192F, 0.0F, 0.0F);
		bone7.cubeList.add(new ModelBox(bone7, 101, 37, -1.5F, -1.0F, -3.0F, 1, 1, 4, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 45, 98, -0.7F, 0.0F, -3.0F, 0, 4, 4, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 21, 103, -11.1F, -1.0F, -3.0F, 1, 1, 4, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 1, 101, -10.9F, 0.0F, -3.0F, 0, 4, 4, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 93, 54, -8.85F, -1.0F, -4.9F, 6, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 44, 92, -8.8F, 0.0F, -4.77F, 6, 5, 0, 0.0F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(-0.5F, 0.0F, -3.0F);
		bone7.addChild(bone10);
		setRotation(bone10, 0.0F, -0.6981F, 0.0F);
		bone10.cubeList.add(new ModelBox(bone10, 57, 113, -3.0F, -1.001F, 0.0F, 3, 1, 1, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 10, 113, -3.0F, 0.0F, 0.2F, 3, 5, 0, 0.0F, false));

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(-11.1F, 0.0F, -3.0F);
		bone7.addChild(bone14);
		setRotation(bone14, 0.0F, 0.6981F, 0.0F);
		bone14.cubeList.add(new ModelBox(bone14, 113, 62, 0.0F, -1.001F, 0.0F, 3, 1, 1, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 50, 113, 0.0F, 0.0F, 0.2F, 3, 5, 0, 0.0F, false));

		body = new QRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 1, 146, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F, false));

		jacket = new ModelRenderer(this);
		jacket.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.addChild(jacket);
		

		jacket1 = new ModelRenderer(this);
		jacket1.setRotationPoint(0.0F, -24.0F, 0.0F);
		jacket.addChild(jacket1);
		setRotation(jacket1, 0.0F, -0.1047F, -0.0175F);
		jacket1.cubeList.add(new ModelBox(jacket1, 120, 132, -0.0418F, 0.85F, -2.58F, 4, 12, 1, 0.0F, false));

		jacket2 = new ModelRenderer(this);
		jacket2.setRotationPoint(0.0F, -24.0F, 0.0F);
		jacket.addChild(jacket2);
		setRotation(jacket2, 0.0F, 0.0349F, 0.0349F);
		jacket2.cubeList.add(new ModelBox(jacket2, 76, 161, -3.93F, 0.8411F, -2.294F, 5, 12, 1, 0.0F, false));

		jacket3 = new ModelRenderer(this);
		jacket3.setRotationPoint(0.0F, -24.0F, 0.0F);
		jacket.addChild(jacket3);
		setRotation(jacket3, -0.2094F, -0.1047F, 0.0F);
		jacket3.cubeList.add(new ModelBox(jacket3, 120, 184, -0.0209F, 0.4113F, -2.36F, 4, 1, 1, 0.0F, false));

		jacket4 = new ModelRenderer(this);
		jacket4.setRotationPoint(0.0F, -24.0F, 0.0F);
		jacket.addChild(jacket4);
		setRotation(jacket4, 0.0F, -0.0524F, -0.0175F);
		jacket4.cubeList.add(new ModelBox(jacket4, 107, 161, 3.1F, -0.0483F, -2.1973F, 1, 13, 4, 0.0F, false));

		jacket5 = new ModelRenderer(this);
		jacket5.setRotationPoint(0.0F, -24.0F, 0.0F);
		jacket.addChild(jacket5);
		setRotation(jacket5, 0.0F, 0.0524F, 0.0175F);
		jacket5.cubeList.add(new ModelBox(jacket5, 97, 178, -4.1135F, -0.1226F, -2.1748F, 1, 13, 4, 0.0F, false));

		jacket6 = new ModelRenderer(this);
		jacket6.setRotationPoint(0.0F, -24.0F, 0.0F);
		jacket.addChild(jacket6);
		setRotation(jacket6, -0.1047F, 0.0349F, 0.0349F);
		jacket6.cubeList.add(new ModelBox(jacket6, 115, 156, -3.9195F, 0.1396F, -2.2031F, 5, 1, 1, 0.0F, false));

		jacket7 = new ModelRenderer(this);
		jacket7.setRotationPoint(0.0F, -24.0F, 0.0F);
		jacket.addChild(jacket7);
		setRotation(jacket7, 0.0175F, 0.0F, 0.0F);
		jacket7.cubeList.add(new ModelBox(jacket7, 81, 135, -4.0F, -0.1191F, 1.0911F, 8, 13, 1, 0.0F, false));

		vest = new ModelRenderer(this);
		vest.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(vest);
		vest.cubeList.add(new ModelBox(vest, 84, 86, -2.0F, 1.3F, -3.25F, 4, 9, 1, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 101, 18, -1.5F, 7.2F, -4.95F, 3, 4, 2, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 106, 1, -1.6F, 8.2F, -5.05F, 3, 1, 2, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 107, 5, -1.6F, 9.7F, -5.05F, 3, 1, 2, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 66, 114, -0.5F, 2.1F, -4.45F, 2, 3, 1, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 100, 64, -2.5F, 2.0F, -3.45F, 5, 4, 1, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 1, 1, -4.5F, 4.0F, -2.5F, 9, 6, 5, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 1, 22, -5.0F, 3.5F, -1.5F, 10, 6, 3, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 47, 21, -3.5F, 0.2F, 1.8F, 7, 10, 1, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 103, 76, -2.0F, 9.9F, -3.0F, 5, 2, 1, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 105, 101, -2.0F, 11.9F, -2.7F, 4, 3, 1, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 23, 51, -4.6F, 9.8F, -2.8F, 5, 2, 5, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 77, 7, 2.6F, 9.8F, -2.6F, 2, 2, 5, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 77, 15, -4.1F, 9.8F, 1.6F, 8, 2, 1, 0.0F, false));

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(0.3F, 0.0F, -1.6F);
		vest.addChild(bone19);
		setRotation(bone19, 0.0F, -0.9338F, 0.0F);
		bone19.cubeList.add(new ModelBox(bone19, 94, 101, 0.8903F, 7.2F, -5.0868F, 3, 4, 2, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 107, 9, 0.9693F, 8.2F, -5.2041F, 3, 1, 2, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 107, 13, 0.9693F, 9.7F, -5.2041F, 3, 1, 2, 0.0F, false));

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(0.0F, 0.0F, 0.0F);
		vest.addChild(bone17);
		setRotation(bone17, 0.0F, -0.192F, 0.0F);
		bone17.cubeList.add(new ModelBox(bone17, 54, 102, 1.3523F, 1.3F, -3.5654F, 2, 9, 1, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 102, 57, 0.8903F, 7.2F, -5.0868F, 3, 4, 2, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 41, 107, 0.9693F, 8.2F, -5.2041F, 3, 1, 2, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 108, 52, 0.9693F, 9.7F, -5.2041F, 3, 1, 2, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 114, 68, 0.7949F, 2.1F, -4.5776F, 2, 3, 1, 0.0F, false));

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(0.0F, 0.0F, 0.0F);
		vest.addChild(bone20);
		setRotation(bone20, 0.0F, 0.192F, 0.0F);
		bone20.cubeList.add(new ModelBox(bone20, 61, 102, -3.3423F, 1.3F, -3.5754F, 2, 9, 1, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 10, 103, -3.9278F, 7.2F, -5.0874F, 3, 4, 2, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 108, 80, -4.0069F, 8.1F, -5.2046F, 3, 1, 2, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 90, 108, -4.0069F, 9.6F, -5.2046F, 3, 1, 2, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 99, 114, -2.1324F, 2.1F, -4.3782F, 2, 3, 1, 0.0F, false));

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(1.1F, 2.8F, 0.0F);
		vest.addChild(bone26);
		setRotation(bone26, 0.0F, -3.0369F, 0.0F);
		bone26.cubeList.add(new ModelBox(bone26, 77, 19, -5.2718F, 6.2F, -3.1308F, 2, 5, 4, 0.0F, false));

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(0.0F, 0.0F, 0.0F);
		vest.addChild(bone21);
		setRotation(bone21, -0.2618F, -0.192F, 0.0F);
		bone21.cubeList.add(new ModelBox(bone21, 1, 115, 1.3731F, 0.2132F, -3.107F, 2, 2, 1, 0.0F, false));
		bone21.cubeList.add(new ModelBox(bone21, 115, 46, 1.3423F, 3.1511F, -3.9747F, 1, 1, 1, 0.0F, false));
		bone21.cubeList.add(new ModelBox(bone21, 35, 115, 1.9423F, 0.0511F, -3.2747F, 1, 3, 1, 0.0F, false));

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(0.0F, 0.0F, 0.0F);
		vest.addChild(bone22);
		setRotation(bone22, -0.2618F, 0.192F, 0.0F);
		bone22.cubeList.add(new ModelBox(bone22, 28, 115, -3.3169F, 0.2166F, -3.1199F, 2, 2, 1, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 116, 33, -1.6677F, 3.0732F, -3.739F, 1, 1, 1, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 86, 115, -2.8677F, -0.0268F, -3.239F, 1, 3, 1, 0.0F, false));

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(0.0F, 0.0F, 0.0F);
		vest.addChild(bone23);
		setRotation(bone23, 0.0F, -0.1745F, 0.0F);
		bone23.cubeList.add(new ModelBox(bone23, 78, 51, 1.4F, -0.6F, -2.9199F, 2, 1, 5, 0.0F, false));

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(0.0F, 0.0F, 0.0F);
		vest.addChild(bone24);
		setRotation(bone24, 0.0F, 0.1745F, 0.0F);
		bone24.cubeList.add(new ModelBox(bone24, 85, 66, -3.35F, -0.6F, -2.9482F, 2, 1, 5, 0.0F, false));

		bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(0.0F, 0.0F, 0.0F);
		vest.addChild(bone25);
		setRotation(bone25, -0.733F, 0.0F, 0.0F);
		bone25.cubeList.add(new ModelBox(bone25, 112, 36, -2.0F, 2.1363F, -2.2526F, 4, 1, 1, 0.0F, false));

		bone27 = new ModelRenderer(this);
		bone27.setRotationPoint(0.0F, 0.0F, 0.0F);
		vest.addChild(bone27);
		setRotation(bone27, 0.0349F, 0.0F, 0.0F);
		bone27.cubeList.add(new ModelBox(bone27, 23, 66, -2.5F, 0.5117F, 2.3347F, 5, 10, 1, 0.0F, false));
		bone27.cubeList.add(new ModelBox(bone27, 70, 58, -3.0F, 6.1183F, 1.5136F, 6, 5, 2, 0.0F, false));

		patch = new ModelRenderer(this);
		patch.setRotationPoint(0.0F, 3.4F, 3.0F);
		vest.addChild(patch);
		setRotation(patch, 0.0349F, 0.0F, 0.0F);
		

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(0.0F, 0.0F, 0.0F);
		patch.addChild(bone15);
		bone15.cubeList.add(new ModelBox(bone15, 108, 93, -2.0F, -2.0F, -0.4F, 4, 2, 1, 0.0F, false));

		bone28 = new ModelRenderer(this);
		bone28.setRotationPoint(0.0F, 0.0F, 1.0F);
		patch.addChild(bone28);
		bone28.cubeList.add(new ModelBox(bone28, 112, 39, -1.7F, -2.3F, -0.975F, 4, 1, 1, -0.4F, false));
		bone28.cubeList.add(new ModelBox(bone28, 44, 89, -2.3F, -2.3F, -0.975F, 2, 1, 1, -0.4F, false));
		bone28.cubeList.add(new ModelBox(bone28, 114, 73, -2.3F, -0.7F, -0.975F, 2, 1, 1, -0.4F, false));
		bone28.cubeList.add(new ModelBox(bone28, 88, 112, -1.7F, -0.7F, -0.975F, 4, 1, 1, -0.4F, false));
		bone28.cubeList.add(new ModelBox(bone28, 91, 115, -2.3F, -2.1F, -0.975F, 1, 2, 1, -0.4F, false));
		bone28.cubeList.add(new ModelBox(bone28, 45, 116, -2.3F, -0.9F, -0.975F, 1, 1, 1, -0.4F, false));
		bone28.cubeList.add(new ModelBox(bone28, 57, 116, 1.3F, -0.9F, -0.975F, 1, 1, 1, -0.4F, false));
		bone28.cubeList.add(new ModelBox(bone28, 116, 25, 1.3F, -2.1F, -0.975F, 1, 2, 1, -0.4F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.3879F, -0.7214F, -0.475F);
		bone28.addChild(cube_r1);
		setRotation(cube_r1, 0.0F, 0.0F, 0.7854F);
		

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-0.6F, -0.5414F, -0.475F);
		bone28.addChild(cube_r2);
		setRotation(cube_r2, 0.0F, 0.0F, 0.7854F);
		

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-1.5F, -1.0664F, -0.475F);
		bone28.addChild(cube_r3);
		setRotation(cube_r3, 0.0F, 0.0F, 0.7854F);
		

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-1.2879F, -1.2464F, -0.475F);
		bone28.addChild(cube_r4);
		setRotation(cube_r4, 0.0F, 0.0F, 0.7854F);
		

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(2.1607F, -0.3979F, -0.475F);
		bone28.addChild(cube_r5);
		setRotation(cube_r5, 0.0F, 0.0F, -0.7854F);
		

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(1.1464F, -1.8121F, -0.475F);
		bone28.addChild(cube_r6);
		setRotation(cube_r6, 0.0F, 0.0F, -0.7854F);
		

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(1.1464F, -0.895F, -0.475F);
		bone28.addChild(cube_r7);
		setRotation(cube_r7, 0.0F, 0.0F, -0.7854F);
		

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(2.1607F, 0.5192F, -0.475F);
		bone28.addChild(cube_r8);
		setRotation(cube_r8, 0.0F, 0.0F, -0.7854F);
		

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.3464F, -0.895F, -0.475F);
		bone28.addChild(cube_r9);
		setRotation(cube_r9, 0.0F, 0.0F, -0.7854F);
		

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(1.3607F, 0.5192F, -0.475F);
		bone28.addChild(cube_r10);
		setRotation(cube_r10, 0.0F, 0.0F, -0.7854F);
		

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(1.3607F, -0.3979F, -0.475F);
		bone28.addChild(cube_r11);
		setRotation(cube_r11, 0.0F, 0.0F, -0.7854F);
		

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.3464F, -1.8121F, -0.475F);
		bone28.addChild(cube_r12);
		setRotation(cube_r12, 0.0F, 0.0F, -0.7854F);
		

		holster = new ModelRenderer(this);
		holster.setRotationPoint(-1.1F, 10.0F, -2.4F);
		vest.addChild(holster);
		setRotation(holster, -0.1034F, 0.2807F, 1.3727F);
		holster.cubeList.add(new ModelBox(holster, 91, 1, -0.6482F, 3.1437F, 1.5609F, 5, 2, 2, 0.0F, false));
		holster.cubeList.add(new ModelBox(holster, 115, 42, -0.4529F, 3.0041F, 3.146F, 2, 2, 1, 0.0F, false));

		rightarm = new QRenderer(this);
		rightarm.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm.cubeList.add(new ModelBox(rightarm, 17, 162, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));

		rightarm_scp = new ModelRenderer(this);
		rightarm_scp.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm.addChild(rightarm_scp);
		

		rightarm1 = new ModelRenderer(this);
		rightarm1.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm_scp.addChild(rightarm1);
		rightarm1.cubeList.add(new ModelBox(rightarm1, 108, 97, -3.0F, 7.05F, -2.1F, 4, 1, 1, 0.0F, false));
		rightarm1.cubeList.add(new ModelBox(rightarm1, 21, 109, -3.0F, 7.05F, 1.1F, 4, 1, 1, 0.0F, false));
		rightarm1.cubeList.add(new ModelBox(rightarm1, 18, 78, -3.0F, -1.95F, 1.2F, 4, 9, 1, 0.0F, false));
		rightarm1.cubeList.add(new ModelBox(rightarm1, 1, 62, 0.2F, -1.95F, -2.0F, 1, 9, 4, 0.0F, false));
		rightarm1.cubeList.add(new ModelBox(rightarm1, 68, 103, -3.1F, 7.05F, -2.0F, 1, 1, 4, 0.0F, false));
		rightarm1.cubeList.add(new ModelBox(rightarm1, 103, 70, 0.1F, 7.05F, -2.0F, 1, 1, 4, 0.0F, false));

		rightarm2 = new ModelRenderer(this);
		rightarm2.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm_scp.addChild(rightarm2);
		setRotation(rightarm2, 0.0F, 0.0F, 0.0524F);
		rightarm2.cubeList.add(new ModelBox(rightarm2, 29, 78, -3.1893F, -1.7398F, -2.0F, 1, 6, 4, 0.0F, false));
		rightarm2.cubeList.add(new ModelBox(rightarm2, 70, 66, -3.3942F, -1.8292F, -2.5F, 2, 3, 5, 0.0F, false));

		rightarm3 = new ModelRenderer(this);
		rightarm3.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm_scp.addChild(rightarm3);
		setRotation(rightarm3, 0.0F, 0.0F, -0.0524F);
		rightarm3.cubeList.add(new ModelBox(rightarm3, 92, 73, -3.6773F, 3.8986F, -2.0F, 1, 3, 4, 0.0F, false));

		rightarm4 = new ModelRenderer(this);
		rightarm4.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm_scp.addChild(rightarm4);
		setRotation(rightarm4, -0.0349F, 0.0349F, 0.0F);
		rightarm4.cubeList.add(new ModelBox(rightarm4, 93, 46, -2.93F, -1.8591F, -2.3035F, 4, 6, 1, 0.0F, false));

		rightarm5 = new ModelRenderer(this);
		rightarm5.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm_scp.addChild(rightarm5);
		setRotation(rightarm5, 0.0349F, 0.1047F, 0.0F);
		rightarm5.cubeList.add(new ModelBox(rightarm5, 105, 31, -2.78F, 3.9794F, -2.6191F, 4, 3, 1, 0.0F, false));

		rightarm6 = new ModelRenderer(this);
		rightarm6.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm_scp.addChild(rightarm6);
		setRotation(rightarm6, 0.0F, 0.0F, -0.0873F);
		rightarm6.cubeList.add(new ModelBox(rightarm6, 68, 109, -0.5F, 7.9063F, -1.9F, 1, 1, 3, 0.0F, false));
		rightarm6.cubeList.add(new ModelBox(rightarm6, 1, 110, -3.9F, 8.9F, -1.5F, 1, 1, 3, 0.0F, false));

		rightarm7 = new ModelRenderer(this);
		rightarm7.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm_scp.addChild(rightarm7);
		setRotation(rightarm7, 0.0F, 0.0F, -0.0349F);
		rightarm7.cubeList.add(new ModelBox(rightarm7, 23, 59, -2.9437F, -2.2486F, -2.51F, 4, 1, 5, 0.0F, false));
		rightarm7.cubeList.add(new ModelBox(rightarm7, 86, 37, -3.2365F, -2.4589F, -2.01F, 3, 1, 4, 0.0F, false));

		leftarm = new QRenderer(this);
		leftarm.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm.cubeList.add(new ModelBox(leftarm, 33, 130, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));

		leftarm_scp = new ModelRenderer(this);
		leftarm_scp.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm.addChild(leftarm_scp);
		

		leftarm1 = new ModelRenderer(this);
		leftarm1.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm_scp.addChild(leftarm1);
		setRotation(leftarm1, 0.0F, 0.0F, -0.0524F);
		leftarm1.cubeList.add(new ModelBox(leftarm1, 40, 78, 2.2489F, -1.75F, -2.0F, 1, 6, 4, 0.0F, false));
		leftarm1.cubeList.add(new ModelBox(leftarm1, 53, 72, 1.5038F, -1.8368F, -2.5F, 2, 3, 5, 0.0F, false));
		leftarm1.cubeList.add(new ModelBox(leftarm1, 94, 29, -1.5523F, 4.0254F, -2.0F, 1, 3, 4, 0.0F, false));

		leftarm2 = new ModelRenderer(this);
		leftarm2.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm_scp.addChild(leftarm2);
		setRotation(leftarm2, 0.0F, 0.0F, 0.0349F);
		leftarm2.cubeList.add(new ModelBox(leftarm2, 51, 81, -1.1508F, -1.863F, -2.0F, 1, 6, 4, 0.0F, false));
		leftarm2.cubeList.add(new ModelBox(leftarm2, 12, 95, 2.5914F, 3.9688F, -2.0F, 1, 3, 4, 0.0F, false));

		leftarm3 = new ModelRenderer(this);
		leftarm3.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm_scp.addChild(leftarm3);
		setRotation(leftarm3, -0.0175F, -0.0698F, 0.0F);
		leftarm3.cubeList.add(new ModelBox(leftarm3, 23, 95, -1.1523F, -1.8719F, -2.2856F, 4, 6, 1, 0.0F, false));

		leftarm4 = new ModelRenderer(this);
		leftarm4.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm_scp.addChild(leftarm4);
		setRotation(leftarm4, 0.0698F, -0.0524F, 0.0F);
		leftarm4.cubeList.add(new ModelBox(leftarm4, 79, 105, -1.1F, 3.9185F, -2.7298F, 4, 3, 1, 0.0F, false));

		leftarm5 = new ModelRenderer(this);
		leftarm5.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm_scp.addChild(leftarm5);
		leftarm5.cubeList.add(new ModelBox(leftarm5, 81, 75, -1.0F, -1.95F, 1.2F, 4, 9, 1, 0.0F, false));
		leftarm5.cubeList.add(new ModelBox(leftarm5, 10, 110, -1.0F, 7.05F, -2.1F, 4, 1, 1, 0.0F, false));
		leftarm5.cubeList.add(new ModelBox(leftarm5, 77, 110, -1.0F, 7.05F, 1.1F, 4, 1, 1, 0.0F, false));
		leftarm5.cubeList.add(new ModelBox(leftarm5, 104, 43, -1.1F, 7.05F, -2.0F, 1, 1, 4, 0.0F, false));
		leftarm5.cubeList.add(new ModelBox(leftarm5, 105, 25, 2.1F, 7.05F, -2.0F, 1, 1, 4, 0.0F, false));

		leftarm6 = new ModelRenderer(this);
		leftarm6.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm_scp.addChild(leftarm6);
		setRotation(leftarm6, 0.0F, 0.0F, 0.0873F);
		leftarm6.cubeList.add(new ModelBox(leftarm6, 41, 111, 2.9055F, 8.8926F, -1.5F, 1, 1, 3, 0.0F, false));
		leftarm6.cubeList.add(new ModelBox(leftarm6, 112, 17, -0.4953F, 7.8851F, -1.9F, 1, 1, 3, 0.0F, false));

		leftarm7 = new ModelRenderer(this);
		leftarm7.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm_scp.addChild(leftarm7);
		setRotation(leftarm7, 0.0F, 0.0F, 0.0349F);
		leftarm7.cubeList.add(new ModelBox(leftarm7, 59, 51, -1.0684F, -2.1712F, -2.51F, 4, 1, 5, 0.0F, false));
		leftarm7.cubeList.add(new ModelBox(leftarm7, 87, 58, 0.4244F, -2.3885F, -2.01F, 3, 1, 4, 0.0F, false));

		rightleg = new QRenderer(this);
		rightleg.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightleg.cubeList.add(new ModelBox(rightleg, 1, 162, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));

		rightleg_scp = new ModelRenderer(this);
		rightleg_scp.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightleg.addChild(rightleg_scp);
		

		rightleg1 = new ModelRenderer(this);
		rightleg1.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightleg_scp.addChild(rightleg1);
		rightleg1.cubeList.add(new ModelBox(rightleg1, 39, 37, -2.0F, -0.001F, -2.14F, 4, 9, 4, 0.0F, false));
		rightleg1.cubeList.add(new ModelBox(rightleg1, 62, 85, -2.0F, -0.0005F, 1.2F, 4, 9, 1, 0.0F, false));
		rightleg1.cubeList.add(new ModelBox(rightleg1, 95, 81, -2.0F, 9.0F, -2.1F, 4, 3, 2, 0.0F, false));
		rightleg1.cubeList.add(new ModelBox(rightleg1, 95, 87, -2.1F, 9.0F, -2.0F, 1, 3, 4, 0.0F, false));
		rightleg1.cubeList.add(new ModelBox(rightleg1, 95, 95, -2.0F, 9.0F, 0.1F, 4, 3, 2, 0.0F, false));
		rightleg1.cubeList.add(new ModelBox(rightleg1, 96, 10, 1.1F, 9.0F, -2.0F, 1, 3, 4, 0.0F, false));
		rightleg1.cubeList.add(new ModelBox(rightleg1, 74, 1, -2.0F, 11.01F, -2.0F, 4, 1, 4, 0.0F, false));

		rightleg2 = new ModelRenderer(this);
		rightleg2.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightleg_scp.addChild(rightleg2);
		setRotation(rightleg2, 0.0F, 0.0F, 0.0524F);
		rightleg2.cubeList.add(new ModelBox(rightleg2, 90, 19, -2.0948F, 0.0999F, -2.0F, 1, 5, 4, 0.0F, false));

		rightleg3 = new ModelRenderer(this);
		rightleg3.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightleg_scp.addChild(rightleg3);
		setRotation(rightleg3, 0.0F, 0.0F, -0.0175F);
		rightleg3.cubeList.add(new ModelBox(rightleg3, 12, 67, -2.3855F, 4.97F, -2.0F, 1, 4, 4, 0.0F, false));
		rightleg3.cubeList.add(new ModelBox(rightleg3, 42, 64, 1.1F, 0.05F, -2.0F, 1, 9, 4, 0.0F, false));

		rightleg4 = new ModelRenderer(this);
		rightleg4.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightleg_scp.addChild(rightleg4);
		setRotation(rightleg4, -0.1222F, 0.1047F, 0.0F);
		rightleg4.cubeList.add(new ModelBox(rightleg4, 112, 22, -1.8F, 11.1314F, -1.0206F, 4, 1, 1, 0.0F, false));

		leftleg = new QRenderer(this);
		leftleg.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftleg.cubeList.add(new ModelBox(leftleg, 25, 146, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));

		leftleg_scp = new ModelRenderer(this);
		leftleg_scp.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftleg.addChild(leftleg_scp);
		

		leftleg1 = new ModelRenderer(this);
		leftleg1.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftleg_scp.addChild(leftleg1);
		setRotation(leftleg1, 0.0F, -0.0524F, 0.0349F);
		leftleg1.cubeList.add(new ModelBox(leftleg1, 73, 86, 1.27F, -0.0955F, -2.1F, 1, 6, 4, 0.0F, false));

		leftleg2 = new ModelRenderer(this);
		leftleg2.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftleg_scp.addChild(leftleg2);
		setRotation(leftleg2, 0.0F, -0.0349F, -0.0349F);
		leftleg2.cubeList.add(new ModelBox(leftleg2, 1, 91, 0.9226F, 4.1F, -2.0509F, 1, 5, 4, 0.0F, false));

		leftleg3 = new ModelRenderer(this);
		leftleg3.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftleg_scp.addChild(leftleg3);
		setRotation(leftleg3, 0.0F, 0.0F, 0.0349F);
		leftleg3.cubeList.add(new ModelBox(leftleg3, 66, 7, -2.0965F, 0.068F, -2.03F, 1, 9, 4, 0.0F, false));

		leftleg4 = new ModelRenderer(this);
		leftleg4.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftleg_scp.addChild(leftleg4);
		leftleg4.cubeList.add(new ModelBox(leftleg4, 44, 51, -1.9535F, -0.001F, -2.1786F, 4, 9, 3, 0.0F, false));
		leftleg4.cubeList.add(new ModelBox(leftleg4, 64, 21, -2.0535F, -0.0001F, 0.2214F, 4, 9, 2, 0.0F, false));
		leftleg4.cubeList.add(new ModelBox(leftleg4, 57, 96, -2.0F, 9.0F, 0.1F, 4, 3, 2, 0.0F, false));
		leftleg4.cubeList.add(new ModelBox(leftleg4, 70, 97, -2.0F, 9.0F, -2.1F, 4, 3, 2, 0.0F, false));
		leftleg4.cubeList.add(new ModelBox(leftleg4, 1, 76, -2.0F, 11.01F, -2.0F, 4, 1, 4, 0.0F, false));
		leftleg4.cubeList.add(new ModelBox(leftleg4, 83, 97, 1.1F, 9.0F, -2.0F, 1, 3, 4, 0.0F, false));
		leftleg4.cubeList.add(new ModelBox(leftleg4, 34, 98, -2.1F, 9.0F, -2.0F, 1, 3, 4, 0.0F, false));

		leftleg5 = new ModelRenderer(this);
		leftleg5.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftleg_scp.addChild(leftleg5);
		setRotation(leftleg5, -0.1222F, -0.1047F, 0.0F);
		leftleg5.cubeList.add(new ModelBox(leftleg5, 28, 112, -2.1928F, 11.1268F, -0.9835F, 4, 1, 1, 0.0F, false));

	    this.bipedRightArm.addChild(rightarm);
	    this.bipedLeftArm.addChild(leftarm);
	    this.bipedBody.addChild(body);
	    this.bipedHead.addChild(head);
	    this.bipedLeftLeg.addChild(leftleg);
	    this.bipedRightLeg.addChild(rightleg);
	    
	    bipedHeadwear.isHidden = true;
	}
	private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

	@Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
        super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entityIn);
        ItemStack itemstack = ((EntityLivingBase)entityIn).getHeldItemMainhand();
        EntityCustomMob entityCustomMob = (EntityCustomMob)entityIn;

        if (entityCustomMob.isSwingingArms() && (itemstack == null || itemstack.getItem() != Items.BOW))
        {
            float f = MathHelper.sin(this.swingProgress * (float)Math.PI);
            float f1 = MathHelper.sin((1.0F - (1.0F - this.swingProgress) * (1.0F - this.swingProgress)) * (float)Math.PI);
            this.bipedRightArm.rotateAngleZ = 0.0F;
            this.bipedLeftArm.rotateAngleZ = 0.0F;
            this.bipedRightArm.rotateAngleY = -(0.1F - f * 0.6F);
            this.bipedLeftArm.rotateAngleY = 0.1F - f * 0.6F;
            this.bipedRightArm.rotateAngleX = -((float)Math.PI / 2F);
            this.bipedLeftArm.rotateAngleX = -((float)Math.PI / 2F);
            this.bipedRightArm.rotateAngleX -= f * 1.2F - f1 * 0.4F;
            this.bipedLeftArm.rotateAngleX -= f * 1.2F - f1 * 0.4F;
            this.bipedRightArm.rotateAngleZ += MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
            this.bipedLeftArm.rotateAngleZ -= MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
            this.bipedRightArm.rotateAngleX += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
            this.bipedLeftArm.rotateAngleX -= MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
        }
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float p_78086_2_, float p_78086_3_,
            float partialTickTime) {
        this.rightArmPose = ModelBiped.ArmPose.EMPTY;
        this.leftArmPose = ModelBiped.ArmPose.EMPTY;
        ItemStack itemstack = entitylivingbaseIn.getHeldItem(EnumHand.MAIN_HAND);

        if (itemstack != null && itemstack.getItem() == Items.BOW
                && ((EntityCustomMob) entitylivingbaseIn).isSwingingArms()) {
            if (entitylivingbaseIn.getPrimaryHand() == EnumHandSide.RIGHT) {
                this.rightArmPose = ModelBiped.ArmPose.BOW_AND_ARROW;
            } else {
                this.leftArmPose = ModelBiped.ArmPose.BOW_AND_ARROW;
            }
        }

        super.setLivingAnimations(entitylivingbaseIn, p_78086_2_, p_78086_3_, partialTickTime);
    }

    @Override
    public void postRenderArm(float scale, EnumHandSide side) {
        float f = side == EnumHandSide.RIGHT ? 1.0F : -1.0F;
        ModelRenderer modelrenderer = this.getArmForSide(side);
        modelrenderer.rotationPointX += f;
        modelrenderer.postRender(scale * 1.25f);
        modelrenderer.rotationPointX -= f;
    }

}