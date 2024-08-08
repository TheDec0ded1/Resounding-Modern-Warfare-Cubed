package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AS_Val extends ModelWithAttachments {
	private final ModelRenderer val;
	private final ModelRenderer TRIGGER2;
	private final ModelRenderer gun13TRIGGER2;
	private final ModelRenderer gun12TRIGGER2;
	private final ModelRenderer gun11TRIGGER2;
	private final ModelRenderer gun3;
	private final ModelRenderer gun10;
	private final ModelRenderer gun11;
	private final ModelRenderer gun12;
	private final ModelRenderer gun13;
	private final ModelRenderer gun14;
	private final ModelRenderer gun18;
	private final ModelRenderer gun19;
	private final ModelRenderer gun23;
	private final ModelRenderer gun24;
	private final ModelRenderer gun25;
	private final ModelRenderer gun26;
	private final ModelRenderer gun27;
	private final ModelRenderer gun30;
	private final ModelRenderer gun53;
	private final ModelRenderer gun54;
	private final ModelRenderer gun55;
	private final ModelRenderer gun56;
	private final ModelRenderer gun57;
	private final ModelRenderer gun138;
	private final ModelRenderer gun140;
	private final ModelRenderer gun141;
	private final ModelRenderer gun165;
	private final ModelRenderer gun172;
	private final ModelRenderer gun173;
	private final ModelRenderer gun174;
	private final ModelRenderer gun175;
	private final ModelRenderer gun176;
	private final ModelRenderer gun177;
	private final ModelRenderer gun178;
	private final ModelRenderer gun183;
	private final ModelRenderer gun184;
	private final ModelRenderer gun185;
	private final ModelRenderer gun187;
	private final ModelRenderer gun188;
	private final ModelRenderer gun189;
	private final ModelRenderer gun190;
	private final ModelRenderer gun191;
	private final ModelRenderer gun192;
	private final ModelRenderer gun193;
	private final ModelRenderer gun194;
	private final ModelRenderer gun195;
	private final ModelRenderer gun196;
	private final ModelRenderer gun197;
	private final ModelRenderer gun198;
	private final ModelRenderer gun199;
	private final ModelRenderer gun200;
	private final ModelRenderer gun201;
	private final ModelRenderer gun202;
	private final ModelRenderer gun203;
	private final ModelRenderer gun204;
	private final ModelRenderer gun205;
	private final ModelRenderer gun206;
	private final ModelRenderer gun207;
	private final ModelRenderer gun208;
	private final ModelRenderer gun209;
	private final ModelRenderer gun210;
	private final ModelRenderer gun211;
	private final ModelRenderer gun212;
	private final ModelRenderer gun213;
	private final ModelRenderer gun214;
	private final ModelRenderer gun215;
	private final ModelRenderer gun216;
	private final ModelRenderer gun217;
	private final ModelRenderer gun218;
	private final ModelRenderer gun219;
	private final ModelRenderer gun220;
	private final ModelRenderer gun221;
	private final ModelRenderer gun222;
	private final ModelRenderer gun223;
	private final ModelRenderer gun224;
	private final ModelRenderer gun225;
	private final ModelRenderer gun226;
	private final ModelRenderer gun227;
	private final ModelRenderer gun228;
	private final ModelRenderer gun229;
	private final ModelRenderer gun230;
	private final ModelRenderer gun231;
	private final ModelRenderer gun232;
	private final ModelRenderer gun233;
	private final ModelRenderer gun234;
	private final ModelRenderer gun235;
	private final ModelRenderer gun236;
	private final ModelRenderer gun237;
	private final ModelRenderer gun238;
	private final ModelRenderer gun239;
	private final ModelRenderer gun240;
	private final ModelRenderer gun241;
	private final ModelRenderer gun242;
	private final ModelRenderer gun243;
	private final ModelRenderer gun244;
	private final ModelRenderer gun245;
	private final ModelRenderer gun246;
	private final ModelRenderer gun247;
	private final ModelRenderer gun248;
	private final ModelRenderer gun249;
	private final ModelRenderer gun250;
	private final ModelRenderer gun251;
	private final ModelRenderer gun252;
	private final ModelRenderer gun253;
	private final ModelRenderer gun254;
	private final ModelRenderer bone4;
	private final ModelRenderer gun255;
	private final ModelRenderer gun256;
	private final ModelRenderer gun257;
	private final ModelRenderer gun173_r1;
	private final ModelRenderer gun174_r1;
	private final ModelRenderer gun258;
	private final ModelRenderer gun259;
	private final ModelRenderer gun260;
	private final ModelRenderer gun261;
	private final ModelRenderer gun262;
	private final ModelRenderer gun263;
	private final ModelRenderer barrel2;
	private final ModelRenderer barrel5;
	private final ModelRenderer bone5;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;
	private final ModelRenderer bone6;
	private final ModelRenderer cube_r29;
	private final ModelRenderer cube_r30;
	private final ModelRenderer bone7;
	private final ModelRenderer cube_r31;
	private final ModelRenderer cube_r32;
	private final ModelRenderer cube_r33;
	private final ModelRenderer bone8;
	private final ModelRenderer cube_r34;
	private final ModelRenderer cube_r35;
	private final ModelRenderer barrelouter2;
	private final ModelRenderer bone9;
	private final ModelRenderer cube_r36;
	private final ModelRenderer cube_r37;
	private final ModelRenderer bone10;
	private final ModelRenderer cube_r38;
	private final ModelRenderer cube_r39;
	private final ModelRenderer bone11;
	private final ModelRenderer cube_r40;
	private final ModelRenderer cube_r41;
	private final ModelRenderer bone12;
	private final ModelRenderer cube_r42;
	private final ModelRenderer cube_r43;
	private final ModelRenderer barrelouter3;
	private final ModelRenderer bone13;
	private final ModelRenderer cube_r44;
	private final ModelRenderer cube_r45;
	private final ModelRenderer bone14;
	private final ModelRenderer cube_r91;
	private final ModelRenderer cube_r92;
	private final ModelRenderer bone15;
	private final ModelRenderer cube_r93;
	private final ModelRenderer cube_r94;
	private final ModelRenderer bone16;
	private final ModelRenderer cube_r95;
	private final ModelRenderer cube_r96;
	private final ModelRenderer barrelouter4;
	private final ModelRenderer bone17;
	private final ModelRenderer cube_r97;
	private final ModelRenderer cube_r98;
	private final ModelRenderer bone18;
	private final ModelRenderer cube_r99;
	private final ModelRenderer cube_r100;
	private final ModelRenderer bone19;
	private final ModelRenderer cube_r101;
	private final ModelRenderer cube_r102;
	private final ModelRenderer bone20;
	private final ModelRenderer cube_r103;
	private final ModelRenderer cube_r104;
	private final ModelRenderer barrelouter9;
	private final ModelRenderer bone34;
	private final ModelRenderer cube_r105;
	private final ModelRenderer cube_r106;
	private final ModelRenderer bone35;
	private final ModelRenderer cube_r107;
	private final ModelRenderer cube_r108;
	private final ModelRenderer bone44;
	private final ModelRenderer cube_r109;
	private final ModelRenderer cube_r110;
	private final ModelRenderer bone45;
	private final ModelRenderer cube_r111;
	private final ModelRenderer cube_r112;
	private final ModelRenderer ironsights3;
	private final ModelRenderer cube_r113;
	private final ModelRenderer cube_r114;
	private final ModelRenderer cube_r115;
	private final ModelRenderer cube_r116;

	public AS_Val() {
		textureWidth = 512;
		textureHeight = 512;

		val = new ModelRenderer(this);
		val.setRotationPoint(0.1F, 23.7F, 0.0F);
		

		TRIGGER2 = new ModelRenderer(this);
		TRIGGER2.setRotationPoint(-2.0F, -31.2F, -10.5F);
		val.addChild(TRIGGER2);
		setRotationAngle(TRIGGER2, 0.4461F, 0.0F, 0.0F);
		TRIGGER2.cubeList.add(new ModelBox(TRIGGER2, 11, 18, -0.1F, -1.3453F, 0.8412F, 1, 2, 1, -0.2F, false));

		gun13TRIGGER2 = new ModelRenderer(this);
		gun13TRIGGER2.setRotationPoint(-2.0F, -28.0F, -9.7F);
		val.addChild(gun13TRIGGER2);
		setRotationAngle(gun13TRIGGER2, -2.6397F, 0.0F, 0.0F);
		gun13TRIGGER2.cubeList.add(new ModelBox(gun13TRIGGER2, 76, 185, -0.1F, 1.0629F, -0.9219F, 1, 1, 1, -0.199F, false));

		gun12TRIGGER2 = new ModelRenderer(this);
		gun12TRIGGER2.setRotationPoint(-2.0F, -28.7F, -9.1F);
		val.addChild(gun12TRIGGER2);
		setRotationAngle(gun12TRIGGER2, -2.3051F, 0.0F, 0.0F);
		gun12TRIGGER2.cubeList.add(new ModelBox(gun12TRIGGER2, 185, 72, -0.101F, 0.7308F, -0.9755F, 1, 1, 1, -0.2F, false));

		gun11TRIGGER2 = new ModelRenderer(this);
		gun11TRIGGER2.setRotationPoint(-2.0F, -31.8F, -9.0F);
		val.addChild(gun11TRIGGER2);
		setRotationAngle(gun11TRIGGER2, -0.3718F, 0.0F, 0.0F);
		gun11TRIGGER2.cubeList.add(new ModelBox(gun11TRIGGER2, 54, 11, -0.1F, -0.9317F, -0.3633F, 1, 3, 1, -0.199F, false));

		gun3 = new ModelRenderer(this);
		gun3.setRotationPoint(-1.7F, -38.3F, 0.85F);
		val.addChild(gun3);
		setRotationAngle(gun3, -1.0038F, 0.0F, 0.0F);
		gun3.cubeList.add(new ModelBox(gun3, 196, 196, -0.1F, 1.6182F, -0.4376F, 1, 1, 1, -0.2F, false));

		gun10 = new ModelRenderer(this);
		gun10.setRotationPoint(-1.7F, -38.7F, -0.1F);
		val.addChild(gun10);
		setRotationAngle(gun10, -0.409F, 0.0F, 0.0F);
		gun10.cubeList.add(new ModelBox(gun10, 76, 105, -0.1F, 1.162F, -0.9849F, 1, 1, 1, -0.2F, false));

		gun11 = new ModelRenderer(this);
		gun11.setRotationPoint(-2.3F, -38.3F, 0.85F);
		val.addChild(gun11);
		setRotationAngle(gun11, -1.0038F, 0.0F, 0.0F);
		gun11.cubeList.add(new ModelBox(gun11, 196, 55, -0.1F, 1.6182F, -0.4376F, 1, 1, 1, -0.2F, false));

		gun12 = new ModelRenderer(this);
		gun12.setRotationPoint(-2.3F, -38.7F, -0.1F);
		val.addChild(gun12);
		setRotationAngle(gun12, -0.409F, 0.0F, 0.0F);
		gun12.cubeList.add(new ModelBox(gun12, 52, 53, -0.1F, 1.162F, -0.9849F, 1, 1, 1, -0.2F, false));

		gun13 = new ModelRenderer(this);
		gun13.setRotationPoint(-2.0F, -38.35F, 1.12F);
		val.addChild(gun13);
		setRotationAngle(gun13, -1.1897F, 0.0F, 0.0F);
		gun13.cubeList.add(new ModelBox(gun13, 199, 122, -0.1F, 1.6712F, -0.131F, 1, 1, 1, -0.2F, false));

		gun14 = new ModelRenderer(this);
		gun14.setRotationPoint(-2.0F, -38.9F, 0.3F);
		val.addChild(gun14);
		setRotationAngle(gun14, -0.5949F, 0.0F, 0.0F);
		gun14.cubeList.add(new ModelBox(gun14, 15, 200, -0.1F, 1.3845F, -0.804F, 1, 1, 1, -0.2F, false));

		gun18 = new ModelRenderer(this);
		gun18.setRotationPoint(-2.0F, -38.4F, -0.6F);
		val.addChild(gun18);
		setRotationAngle(gun18, 0.5205F, 0.0F, 0.0F);
		gun18.cubeList.add(new ModelBox(gun18, 190, 184, -0.1F, -0.0317F, -1.4592F, 1, 1, 1, -0.2F, false));

		gun19 = new ModelRenderer(this);
		gun19.setRotationPoint(-3.75F, -35.2F, -26.5F);
		val.addChild(gun19);
		gun19.cubeList.add(new ModelBox(gun19, 86, 108, 0.1F, -0.2F, 17.99F, 1, 1, 8, -0.2F, false));

		gun23 = new ModelRenderer(this);
		gun23.setRotationPoint(0.9F, -33.8F, 0.5F);
		val.addChild(gun23);
		setRotationAngle(gun23, 0.0F, 0.0F, 2.491F);
		gun23.cubeList.add(new ModelBox(gun23, 184, 64, -0.162F, 0.0803F, -1.98F, 1, 1, 1, -0.2F, false));

		gun24 = new ModelRenderer(this);
		gun24.setRotationPoint(0.9F, -33.8F, -3.0F);
		val.addChild(gun24);
		setRotationAngle(gun24, 0.0F, 0.0F, 2.491F);
		gun24.cubeList.add(new ModelBox(gun24, 197, 150, -0.162F, 0.0803F, -1.99F, 1, 1, 1, -0.2F, false));

		gun25 = new ModelRenderer(this);
		gun25.setRotationPoint(-0.1F, -34.8F, 0.5F);
		val.addChild(gun25);
		gun25.cubeList.add(new ModelBox(gun25, 62, 184, 0.0F, 0.0F, -1.98F, 1, 1, 1, -0.2F, false));

		gun26 = new ModelRenderer(this);
		gun26.setRotationPoint(-0.1F, -34.8F, -3.0F);
		val.addChild(gun26);
		gun26.cubeList.add(new ModelBox(gun26, 197, 105, 0.0F, 0.0F, -1.99F, 1, 1, 1, -0.2F, false));

		gun27 = new ModelRenderer(this);
		gun27.setRotationPoint(-0.1F, -35.0F, -3.0F);
		val.addChild(gun27);
		gun27.cubeList.add(new ModelBox(gun27, 187, 197, -0.02F, 0.0F, -2.01F, 1, 1, 1, -0.2F, false));

		gun30 = new ModelRenderer(this);
		gun30.setRotationPoint(-0.1F, -35.0F, -2.5F);
		val.addChild(gun30);
		gun30.cubeList.add(new ModelBox(gun30, 156, 56, -0.01F, 0.0F, -2.0F, 1, 1, 4, -0.2F, false));

		gun53 = new ModelRenderer(this);
		gun53.setRotationPoint(0.9F, -33.8F, -12.5F);
		val.addChild(gun53);
		setRotationAngle(gun53, 0.0F, 0.0F, 2.491F);
		gun53.cubeList.add(new ModelBox(gun53, 53, 185, -0.154F, 0.0863F, -1.01F, 1, 1, 1, -0.2F, false));

		gun54 = new ModelRenderer(this);
		gun54.setRotationPoint(0.9F, -33.8F, -9.5F);
		val.addChild(gun54);
		setRotationAngle(gun54, 0.0F, 0.0F, 2.491F);
		gun54.cubeList.add(new ModelBox(gun54, 48, 185, -0.154F, 0.0863F, -0.99F, 1, 1, 1, -0.2F, false));

		gun55 = new ModelRenderer(this);
		gun55.setRotationPoint(-0.1F, -34.8F, -9.5F);
		val.addChild(gun55);
		gun55.cubeList.add(new ModelBox(gun55, 190, 179, -0.01F, 0.0F, -0.99F, 1, 1, 1, -0.2F, false));

		gun56 = new ModelRenderer(this);
		gun56.setRotationPoint(-0.1F, -34.8F, -12.5F);
		val.addChild(gun56);
		gun56.cubeList.add(new ModelBox(gun56, 190, 170, -0.01F, 0.0F, -1.01F, 1, 1, 1, -0.2F, false));

		gun57 = new ModelRenderer(this);
		gun57.setRotationPoint(-0.1F, -35.0F, -12.5F);
		val.addChild(gun57);
		gun57.cubeList.add(new ModelBox(gun57, 155, 68, 0.0F, 0.0F, -1.0F, 1, 1, 4, -0.2F, false));

		gun138 = new ModelRenderer(this);
		gun138.setRotationPoint(0.9F, -33.7F, -4.5F);
		val.addChild(gun138);
		setRotationAngle(gun138, 0.0F, 0.0F, 2.3423F);
		gun138.cubeList.add(new ModelBox(gun138, 190, 145, 0.4651F, -0.5201F, -1.9624F, 1, 1, 1, -0.2F, false));

		gun140 = new ModelRenderer(this);
		gun140.setRotationPoint(0.9F, -33.7F, -7.5F);
		val.addChild(gun140);
		setRotationAngle(gun140, 0.0F, 0.0F, 2.3423F);
		gun140.cubeList.add(new ModelBox(gun140, 194, 135, 0.4662F, -0.519F, -1.2397F, 1, 1, 1, -0.2F, false));

		gun141 = new ModelRenderer(this);
		gun141.setRotationPoint(-0.1F, -33.7F, -4.5F);
		val.addChild(gun141);
		gun141.cubeList.add(new ModelBox(gun141, 190, 137, -0.0343F, 0.5F, -1.9624F, 1, 1, 1, -0.2F, false));

		gun165 = new ModelRenderer(this);
		gun165.setRotationPoint(-0.1F, -33.7F, -7.5F);
		val.addChild(gun165);
		gun165.cubeList.add(new ModelBox(gun165, 134, 194, -0.0359F, 0.5F, -1.2397F, 1, 1, 1, -0.2F, false));

		gun172 = new ModelRenderer(this);
		gun172.setRotationPoint(0.9F, -33.5F, -4.5F);
		val.addChild(gun172);
		setRotationAngle(gun172, 0.0F, -3.0115F, 0.0F);
		gun172.cubeList.add(new ModelBox(gun172, 15, 184, -0.2076F, 0.5F, 1.5865F, 1, 1, 1, -0.2F, false));

		gun173 = new ModelRenderer(this);
		gun173.setRotationPoint(0.9F, -33.5F, -6.5F);
		val.addChild(gun173);
		setRotationAngle(gun173, 0.0F, -1.7102F, 0.0F);
		gun173.cubeList.add(new ModelBox(gun173, 192, 132, -1.5845F, 0.5F, 0.2223F, 1, 1, 1, -0.2F, false));

		gun174 = new ModelRenderer(this);
		gun174.setRotationPoint(-0.2F, -33.5F, -6.5F);
		val.addChild(gun174);
		gun174.cubeList.add(new ModelBox(gun174, 21, 177, 0.0F, 0.49F, -1.6F, 1, 1, 2, -0.2F, false));

		gun175 = new ModelRenderer(this);
		gun175.setRotationPoint(-0.1F, -33.5F, -4.5F);
		val.addChild(gun175);
		gun175.cubeList.add(new ModelBox(gun175, 116, 190, -0.0243F, 0.5F, -1.9724F, 1, 1, 1, -0.2F, false));

		gun176 = new ModelRenderer(this);
		gun176.setRotationPoint(-0.1F, -33.5F, -7.5F);
		val.addChild(gun176);
		gun176.cubeList.add(new ModelBox(gun176, 129, 194, -0.0259F, 0.5F, -1.2297F, 1, 1, 1, -0.2F, false));

		gun177 = new ModelRenderer(this);
		gun177.setRotationPoint(0.9F, -33.7F, -14.5F);
		val.addChild(gun177);
		setRotationAngle(gun177, 0.0F, 0.0F, 2.3423F);
		gun177.cubeList.add(new ModelBox(gun177, 190, 112, 0.4482F, -0.5375F, -0.99F, 1, 1, 1, -0.2F, false));

		gun178 = new ModelRenderer(this);
		gun178.setRotationPoint(0.9F, -33.7F, -17.5F);
		val.addChild(gun178);
		setRotationAngle(gun178, 0.0F, 0.0F, 2.3423F);
		gun178.cubeList.add(new ModelBox(gun178, 111, 190, 0.4482F, -0.5375F, -0.99F, 1, 1, 1, -0.2F, false));

		gun183 = new ModelRenderer(this);
		gun183.setRotationPoint(0.9F, -33.7F, -17.0F);
		val.addChild(gun183);
		setRotationAngle(gun183, 0.0F, 0.0F, 2.3423F);
		gun183.cubeList.add(new ModelBox(gun183, 106, 190, 0.4582F, -0.5375F, -1.01F, 1, 1, 1, -0.2F, false));

		gun184 = new ModelRenderer(this);
		gun184.setRotationPoint(-0.1F, -33.7F, -17.0F);
		val.addChild(gun184);
		gun184.cubeList.add(new ModelBox(gun184, 101, 190, -0.02F, 0.5F, -1.0F, 1, 1, 1, -0.2F, false));

		gun185 = new ModelRenderer(this);
		gun185.setRotationPoint(-0.1F, -33.7F, -14.5F);
		val.addChild(gun185);
		gun185.cubeList.add(new ModelBox(gun185, 190, 100, -0.01F, 0.5F, -0.99F, 1, 1, 1, -0.2F, false));

		gun187 = new ModelRenderer(this);
		gun187.setRotationPoint(-0.1F, -33.7F, -17.5F);
		val.addChild(gun187);
		gun187.cubeList.add(new ModelBox(gun187, 96, 190, -0.01F, 0.5F, -0.99F, 1, 1, 1, -0.2F, false));

		gun188 = new ModelRenderer(this);
		gun188.setRotationPoint(-0.4F, -35.0F, -22.0F);
		val.addChild(gun188);
		

		gun189 = new ModelRenderer(this);
		gun189.setRotationPoint(-0.1F, -35.0F, -22.0F);
		val.addChild(gun189);
		

		gun190 = new ModelRenderer(this);
		gun190.setRotationPoint(-0.1F, -33.5F, -17.5F);
		val.addChild(gun190);
		gun190.cubeList.add(new ModelBox(gun190, 129, 32, 0.0F, 0.5F, -0.985F, 1, 1, 4, -0.2F, false));

		gun191 = new ModelRenderer(this);
		gun191.setRotationPoint(-0.35F, -32.8F, -24.0F);
		val.addChild(gun191);
		

		gun192 = new ModelRenderer(this);
		gun192.setRotationPoint(-0.1F, -33.6F, -25.5F);
		val.addChild(gun192);
		setRotationAngle(gun192, 2.1935F, 0.0F, 0.0F);
		gun192.cubeList.add(new ModelBox(gun192, 91, 190, -0.03F, 0.5509F, -0.5187F, 1, 1, 1, -0.2F, false));
		gun192.cubeList.add(new ModelBox(gun192, 86, 190, -0.03F, 0.8509F, -0.5187F, 1, 1, 1, -0.2F, false));

		gun193 = new ModelRenderer(this);
		gun193.setRotationPoint(0.9F, -34.0F, -22.0F);
		val.addChild(gun193);
		setRotationAngle(gun193, 0.0F, 0.0F, 2.2679F);
		gun193.cubeList.add(new ModelBox(gun193, 181, 0, -0.2249F, 0.0817F, -0.5F, 2, 1, 1, -0.2F, false));

		gun194 = new ModelRenderer(this);
		gun194.setRotationPoint(-0.1F, -33.5F, -26.0F);
		val.addChild(gun194);
		

		gun195 = new ModelRenderer(this);
		gun195.setRotationPoint(-0.1F, -33.5F, -26.5F);
		val.addChild(gun195);
		gun195.cubeList.add(new ModelBox(gun195, 190, 72, -0.03F, -0.4791F, 0.9958F, 1, 1, 1, -0.2F, false));

		gun196 = new ModelRenderer(this);
		gun196.setRotationPoint(-0.1F, -34.0F, -26.5F);
		val.addChild(gun196);
		gun196.cubeList.add(new ModelBox(gun196, 43, 190, -0.03F, -0.5791F, 0.9958F, 1, 1, 1, -0.2F, false));

		gun197 = new ModelRenderer(this);
		gun197.setRotationPoint(-0.1F, -35.0F, -26.5F);
		val.addChild(gun197);
		gun197.cubeList.add(new ModelBox(gun197, 154, 42, 0.0F, 0.0F, 1.0F, 1, 1, 4, -0.2F, false));

		gun198 = new ModelRenderer(this);
		gun198.setRotationPoint(-0.4F, -35.0F, -17.5F);
		val.addChild(gun198);
		gun198.cubeList.add(new ModelBox(gun198, 272, 199, 0.04F, 0.0F, -0.99F, 1, 3, 18, -0.2F, false));
		gun198.cubeList.add(new ModelBox(gun198, 50, 148, 0.04F, 0.0F, -7.99F, 1, 3, 4, -0.2F, false));

		gun199 = new ModelRenderer(this);
		gun199.setRotationPoint(-0.4F, -35.0F, -26.5F);
		val.addChild(gun199);
		

		gun200 = new ModelRenderer(this);
		gun200.setRotationPoint(-0.6F, -31.6F, -7.5F);
		val.addChild(gun200);
		

		gun201 = new ModelRenderer(this);
		gun201.setRotationPoint(-3.4F, -28.3F, -19.5F);
		val.addChild(gun201);
		gun201.cubeList.add(new ModelBox(gun201, 30, 190, -0.2F, -0.1F, 1.7F, 1, 1, 1, -0.2F, false));

		gun202 = new ModelRenderer(this);
		gun202.setRotationPoint(-0.6F, -28.3F, -19.5F);
		val.addChild(gun202);
		gun202.cubeList.add(new ModelBox(gun202, 154, 14, 0.02F, -0.9F, -0.9F, 1, 1, 4, -0.2F, false));

		gun203 = new ModelRenderer(this);
		gun203.setRotationPoint(-3.4F, -27.8F, -19.0F);
		val.addChild(gun203);
		gun203.cubeList.add(new ModelBox(gun203, 25, 190, -0.2F, -1.2F, 1.5F, 1, 1, 1, -0.2F, false));
		gun203.cubeList.add(new ModelBox(gun203, 172, 112, -0.2F, -1.2F, -0.9F, 1, 1, 3, -0.2F, false));

		gun204 = new ModelRenderer(this);
		gun204.setRotationPoint(-0.6F, -27.8F, -19.0F);
		val.addChild(gun204);
		gun204.cubeList.add(new ModelBox(gun204, 14, 177, 0.02F, -0.9F, 0.2F, 1, 1, 2, -0.2F, false));

		gun205 = new ModelRenderer(this);
		gun205.setRotationPoint(-0.6F, -29.0F, -23.0F);
		val.addChild(gun205);
		gun205.cubeList.add(new ModelBox(gun205, 60, 108, 0.02F, -1.2F, -1.3F, 1, 1, 8, -0.2F, false));

		gun206 = new ModelRenderer(this);
		gun206.setRotationPoint(-3.4F, -29.0F, -23.0F);
		val.addChild(gun206);
		gun206.cubeList.add(new ModelBox(gun206, 103, 100, -0.2F, -1.2F, -1.3F, 1, 1, 8, -0.2F, false));

		gun207 = new ModelRenderer(this);
		gun207.setRotationPoint(-3.4F, -28.8F, -22.5F);
		val.addChild(gun207);
		gun207.cubeList.add(new ModelBox(gun207, 143, 30, -0.19F, -0.8F, 0.4F, 1, 1, 5, -0.2F, false));
		gun207.cubeList.add(new ModelBox(gun207, 20, 190, -0.19F, -0.8F, 5.0F, 1, 1, 1, -0.2F, false));

		gun208 = new ModelRenderer(this);
		gun208.setRotationPoint(-0.6F, -28.8F, -22.5F);
		val.addChild(gun208);
		gun208.cubeList.add(new ModelBox(gun208, 54, 140, 0.01F, -0.925F, 0.1F, 1, 1, 6, -0.2F, false));

		gun209 = new ModelRenderer(this);
		gun209.setRotationPoint(-3.5F, -26.25F, -17.5F);
		val.addChild(gun209);
		setRotationAngle(gun209, 1.3013F, 0.0F, 0.0F);
		gun209.cubeList.add(new ModelBox(gun209, 129, 173, -0.155F, -0.3267F, 1.0099F, 3, 1, 1, -0.199F, false));
		gun209.cubeList.add(new ModelBox(gun209, 0, 181, 1.995F, -0.3267F, 1.0099F, 2, 1, 1, -0.199F, false));

		gun210 = new ModelRenderer(this);
		gun210.setRotationPoint(-3.5F, -28.8F, -26.5F);
		val.addChild(gun210);
		setRotationAngle(gun210, 1.3013F, 0.0F, 0.0F);
		gun210.cubeList.add(new ModelBox(gun210, 112, 11, -0.155F, -0.3267F, 1.0099F, 3, 10, 1, -0.2F, false));
		gun210.cubeList.add(new ModelBox(gun210, 152, 122, 1.995F, -0.3267F, 1.0099F, 2, 10, 1, -0.2F, false));

		gun211 = new ModelRenderer(this);
		gun211.setRotationPoint(-3.4F, -30.2F, -14.5F);
		val.addChild(gun211);
		setRotationAngle(gun211, 2.3051F, 0.0F, 0.0F);
		gun211.cubeList.add(new ModelBox(gun211, 7, 177, -0.181F, -0.3691F, 1.7021F, 2, 2, 1, -0.201F, false));

		gun212 = new ModelRenderer(this);
		gun212.setRotationPoint(-3.4F, -31.2F, -16.5F);
		val.addChild(gun212);
		

		gun213 = new ModelRenderer(this);
		gun213.setRotationPoint(-0.6F, -30.9F, -15.1F);
		val.addChild(gun213);
		setRotationAngle(gun213, -2.4166F, 0.0F, 0.0F);
		gun213.cubeList.add(new ModelBox(gun213, 178, 180, -0.81F, 0.8485F, -0.6631F, 2, 1, 1, -0.2F, false));

		gun214 = new ModelRenderer(this);
		gun214.setRotationPoint(-3.4F, -31.9F, -15.5F);
		val.addChild(gun214);
		setRotationAngle(gun214, -1.7299F, 0.0F, 0.0F);
		gun214.cubeList.add(new ModelBox(gun214, 64, 9, -0.21F, 0.1584F, -0.5874F, 3, 1, 5, -0.2F, false));

		gun215 = new ModelRenderer(this);
		gun215.setRotationPoint(-0.6F, -31.9F, -15.5F);
		val.addChild(gun215);
		setRotationAngle(gun215, -1.7299F, 0.0F, 0.0F);
		gun215.cubeList.add(new ModelBox(gun215, 43, 111, -0.965F, 0.1584F, -0.5874F, 2, 1, 5, -0.2F, false));

		gun216 = new ModelRenderer(this);
		gun216.setRotationPoint(-3.3F, -30.0F, -7.0F);
		val.addChild(gun216);
		gun216.cubeList.add(new ModelBox(gun216, 190, 18, -0.2F, -1.0F, 0.0F, 1, 1, 1, -0.2F, false));

		gun217 = new ModelRenderer(this);
		gun217.setRotationPoint(-0.7F, -30.0F, -7.0F);
		val.addChild(gun217);
		

		gun218 = new ModelRenderer(this);
		gun218.setRotationPoint(-3.4F, -31.8F, -26.5F);
		val.addChild(gun218);
		gun218.cubeList.add(new ModelBox(gun218, 86, 95, -0.18F, -0.925F, 1.0F, 3, 3, 9, -0.2F, false));
		gun218.cubeList.add(new ModelBox(gun218, 69, 167, -0.18F, -1.0F, 9.5F, 3, 3, 1, -0.2F, false));

		gun219 = new ModelRenderer(this);
		gun219.setRotationPoint(-0.6F, -31.8F, -26.5F);
		val.addChild(gun219);
		gun219.cubeList.add(new ModelBox(gun219, 86, 12, -0.98F, -2.925F, 1.0F, 2, 5, 9, -0.2F, false));
		gun219.cubeList.add(new ModelBox(gun219, 11, 29, 0.02F, -1.5F, 9.6F, 1, 3, 1, -0.2F, false));

		gun220 = new ModelRenderer(this);
		gun220.setRotationPoint(-3.2F, -35.0F, -0.6F);
		val.addChild(gun220);
		gun220.cubeList.add(new ModelBox(gun220, 43, 58, -0.2F, 0.0F, -2.2F, 3, 4, 3, -0.2F, false));

		gun221 = new ModelRenderer(this);
		gun221.setRotationPoint(-0.8F, -35.0F, -0.6F);
		val.addChild(gun221);
		gun221.cubeList.add(new ModelBox(gun221, 69, 122, -0.8F, 0.0F, -2.2F, 2, 4, 3, -0.199F, false));

		gun222 = new ModelRenderer(this);
		gun222.setRotationPoint(-3.3F, -30.8F, -7.7F);
		val.addChild(gun222);
		setRotationAngle(gun222, 0.0F, 0.0F, -0.3961F);
		gun222.cubeList.add(new ModelBox(gun222, 86, 141, 0.2742F, -1.3546F, -0.01F, 1, 1, 1, -0.2F, false));

		gun223 = new ModelRenderer(this);
		gun223.setRotationPoint(0.3F, -30.8F, -7.7F);
		val.addChild(gun223);
		setRotationAngle(gun223, 0.0F, 0.0F, 1.9705F);
		gun223.cubeList.add(new ModelBox(gun223, 192, 106, -1.3526F, 0.2773F, -0.01F, 1, 1, 1, -0.2F, false));

		gun224 = new ModelRenderer(this);
		gun224.setRotationPoint(-0.6F, -31.8F, -16.5F);
		val.addChild(gun224);
		gun224.cubeList.add(new ModelBox(gun224, 43, 0, -0.8F, -1.0F, 0.0F, 2, 1, 16, -0.2F, false));

		gun225 = new ModelRenderer(this);
		gun225.setRotationPoint(-3.4F, -31.8F, -16.5F);
		val.addChild(gun225);
		gun225.cubeList.add(new ModelBox(gun225, 0, 40, -0.19F, -1.0F, 0.0F, 2, 1, 16, -0.2F, false));

		gun226 = new ModelRenderer(this);
		gun226.setRotationPoint(-2.5F, -30.0F, -7.7F);
		val.addChild(gun226);
		gun226.cubeList.add(new ModelBox(gun226, 180, 166, 0.0F, -1.0F, 0.0F, 2, 1, 1, -0.2F, false));

		gun227 = new ModelRenderer(this);
		gun227.setRotationPoint(-3.1F, -31.0F, -7.7F);
		val.addChild(gun227);
		gun227.cubeList.add(new ModelBox(gun227, 117, 29, -0.2F, -1.01F, -0.01F, 1, 5, 1, -0.2F, false));

		gun228 = new ModelRenderer(this);
		gun228.setRotationPoint(-0.9F, -31.0F, -7.7F);
		val.addChild(gun228);
		gun228.cubeList.add(new ModelBox(gun228, 0, 109, 0.2F, -1.01F, -0.01F, 1, 5, 1, -0.2F, false));

		gun229 = new ModelRenderer(this);
		gun229.setRotationPoint(0.4F, -30.6F, -7.5F);
		val.addChild(gun229);
		setRotationAngle(gun229, 0.0F, 0.0F, 2.2679F);
		

		gun230 = new ModelRenderer(this);
		gun230.setRotationPoint(-3.4F, -30.6F, -7.5F);
		val.addChild(gun230);
		setRotationAngle(gun230, 0.0F, 0.0F, -0.6692F);
		

		gun231 = new ModelRenderer(this);
		gun231.setRotationPoint(-3.4F, -31.6F, -7.5F);
		val.addChild(gun231);
		

		gun232 = new ModelRenderer(this);
		gun232.setRotationPoint(-3.3F, -30.2F, -3.0F);
		val.addChild(gun232);
		setRotationAngle(gun232, -0.7436F, 0.0F, 0.0F);
		

		gun233 = new ModelRenderer(this);
		gun233.setRotationPoint(-0.7F, -30.2F, -3.0F);
		val.addChild(gun233);
		setRotationAngle(gun233, -0.7436F, 0.0F, 0.0F);
		

		gun234 = new ModelRenderer(this);
		gun234.setRotationPoint(-2.5F, -25.7F, -14.8F);
		val.addChild(gun234);
		setRotationAngle(gun234, -1.45F, 0.0F, 0.0F);
		gun234.cubeList.add(new ModelBox(gun234, 180, 151, -0.001F, -0.3301F, -1.6174F, 2, 1, 1, -0.299F, false));
		gun234.cubeList.add(new ModelBox(gun234, 0, 155, -0.001F, -0.3301F, -1.2174F, 2, 1, 1, -0.299F, false));

		gun235 = new ModelRenderer(this);
		gun235.setRotationPoint(-3.0F, -30.5F, -14.5F);
		val.addChild(gun235);
		setRotationAngle(gun235, 2.3051F, 0.0F, 0.0F);
		gun235.cubeList.add(new ModelBox(gun235, 43, 128, 0.029F, 0.3959F, 0.631F, 3, 2, 1, -0.2F, false));

		gun236 = new ModelRenderer(this);
		gun236.setRotationPoint(-0.9F, -27.5F, -16.0F);
		val.addChild(gun236);
		gun236.cubeList.add(new ModelBox(gun236, 196, 147, 0.1F, -1.0F, 0.0F, 1, 1, 1, -0.2F, false));

		gun237 = new ModelRenderer(this);
		gun237.setRotationPoint(-0.9F, -29.4F, -15.5F);
		val.addChild(gun237);
		setRotationAngle(gun237, -0.7064F, 0.0F, 0.0F);
		

		gun238 = new ModelRenderer(this);
		gun238.setRotationPoint(-3.1F, -28.5F, -16.0F);
		val.addChild(gun238);
		gun238.cubeList.add(new ModelBox(gun238, 15, 190, -0.1F, 0.0F, 0.0F, 1, 1, 1, -0.2F, false));

		gun239 = new ModelRenderer(this);
		gun239.setRotationPoint(-2.5F, -26.0F, -16.2F);
		val.addChild(gun239);
		setRotationAngle(gun239, 0.5949F, 0.0F, 0.0F);
		gun239.cubeList.add(new ModelBox(gun239, 180, 146, 0.0F, -0.8257F, 0.921F, 2, 1, 1, -0.3F, false));
		gun239.cubeList.add(new ModelBox(gun239, 180, 141, 0.0F, -1.2257F, 0.921F, 2, 1, 1, -0.3F, false));

		gun240 = new ModelRenderer(this);
		gun240.setRotationPoint(-2.5F, -31.0F, -8.5F);
		val.addChild(gun240);
		setRotationAngle(gun240, 0.9666F, 0.0F, 0.0F);
		gun240.cubeList.add(new ModelBox(gun240, 0, 29, -0.5F, -0.8681F, 0.823F, 3, 2, 2, -0.2F, false));

		gun241 = new ModelRenderer(this);
		gun241.setRotationPoint(-2.5F, -29.2F, -7.8F);
		val.addChild(gun241);
		setRotationAngle(gun241, -0.2231F, 0.0F, 0.0F);
		gun241.cubeList.add(new ModelBox(gun241, 0, 177, 0.0F, -1.2752F, -0.1213F, 2, 2, 1, -0.2F, false));

		gun242 = new ModelRenderer(this);
		gun242.setRotationPoint(-3.2F, -31.5F, -3.6F);
		val.addChild(gun242);
		

		gun243 = new ModelRenderer(this);
		gun243.setRotationPoint(-0.8F, -31.5F, -3.6F);
		val.addChild(gun243);
		

		gun244 = new ModelRenderer(this);
		gun244.setRotationPoint(-3.0F, -31.5F, -5.3F);
		val.addChild(gun244);
		

		gun245 = new ModelRenderer(this);
		gun245.setRotationPoint(-3.2F, -26.5F, -4.3F);
		val.addChild(gun245);
		setRotationAngle(gun245, 2.8256F, 0.0F, 0.0F);
		

		gun246 = new ModelRenderer(this);
		gun246.setRotationPoint(-0.8F, -26.5F, -4.3F);
		val.addChild(gun246);
		setRotationAngle(gun246, 2.8256F, 0.0F, 0.0F);
		

		gun247 = new ModelRenderer(this);
		gun247.setRotationPoint(-3.0F, -26.8F, -7.4F);
		val.addChild(gun247);
		gun247.cubeList.add(new ModelBox(gun247, 54, 34, 0.0F, -1.0F, -0.1F, 3, 1, 2, -0.2F, false));

		gun248 = new ModelRenderer(this);
		gun248.setRotationPoint(-0.8F, -26.5F, -5.5F);
		val.addChild(gun248);
		setRotationAngle(gun248, 2.8256F, 0.0F, 0.0F);
		

		gun249 = new ModelRenderer(this);
		gun249.setRotationPoint(-3.2F, -26.5F, -5.5F);
		val.addChild(gun249);
		setRotationAngle(gun249, 2.8256F, 0.0F, 0.0F);
		

		gun250 = new ModelRenderer(this);
		gun250.setRotationPoint(-0.5F, -35.0F, -26.5F);
		val.addChild(gun250);
		

		gun251 = new ModelRenderer(this);
		gun251.setRotationPoint(-3.4F, -35.0F, -26.5F);
		val.addChild(gun251);
		gun251.cubeList.add(new ModelBox(gun251, 185, 191, -0.2F, 0.0F, 1.0F, 3, 3, 25, -0.2F, false));

		gun252 = new ModelRenderer(this);
		gun252.setRotationPoint(-3.0F, -32.0F, -16.5F);
		val.addChild(gun252);
		gun252.cubeList.add(new ModelBox(gun252, 69, 140, 0.0F, -1.1F, 0.1F, 3, 6, 2, -0.2F, false));
		gun252.cubeList.add(new ModelBox(gun252, 0, 18, 0.4F, -1.1F, 10.5F, 3, 6, 4, -0.3F, false));
		gun252.cubeList.add(new ModelBox(gun252, 43, 18, -0.4F, -1.1F, 10.5F, 2, 6, 4, -0.3F, false));
		gun252.cubeList.add(new ModelBox(gun252, 129, 168, 0.0F, 1.9F, -0.5F, 3, 3, 1, -0.2F, false));

		gun253 = new ModelRenderer(this);
		gun253.setRotationPoint(-2.5F, -27.0F, -14.5F);
		val.addChild(gun253);
		gun253.cubeList.add(new ModelBox(gun253, 129, 0, -0.5F, -0.99F, -0.3F, 3, 1, 9, -0.2F, false));

		gun254 = new ModelRenderer(this);
		gun254.setRotationPoint(-0.8F, -31.0F, -7.5F);
		val.addChild(gun254);
		gun254.cubeList.add(new ModelBox(gun254, 86, 95, 0.21F, -2.0F, 0.0F, 1, 6, 2, -0.2F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-3.9F, -33.0F, -8.5F);
		val.addChild(bone4);
		setRotationAngle(bone4, 0.5061F, 0.0F, 0.0F);
		bone4.cubeList.add(new ModelBox(bone4, 57, 183, -0.3F, -1.1749F, -0.403F, 1, 1, 1, -0.2F, false));
		bone4.cubeList.add(new ModelBox(bone4, 129, 51, -0.31F, -0.9749F, -0.803F, 1, 2, 2, -0.2F, false));
		bone4.cubeList.add(new ModelBox(bone4, 159, 182, -0.3F, -0.4749F, 0.397F, 1, 1, 1, -0.2F, false));
		bone4.cubeList.add(new ModelBox(bone4, 43, 193, -0.3F, -0.4749F, -1.003F, 1, 1, 1, -0.2F, false));
		bone4.cubeList.add(new ModelBox(bone4, 162, 129, -0.3F, 0.2251F, -0.403F, 1, 1, 1, -0.2F, false));

		gun255 = new ModelRenderer(this);
		gun255.setRotationPoint(0.0F, -3.0F, -7.0F);
		bone4.addChild(gun255);
		setRotationAngle(gun255, -0.0873F, 0.0F, 0.0F);
		gun255.cubeList.add(new ModelBox(gun255, 140, 22, -0.08F, -0.154F, 1.2185F, 1, 1, 6, -0.2F, false));

		gun256 = new ModelRenderer(this);
		gun256.setRotationPoint(-0.1F, -1.85F, 0.0F);
		bone4.addChild(gun256);
		setRotationAngle(gun256, -1.7474F, 0.0F, 0.0F);
		gun256.cubeList.add(new ModelBox(gun256, 33, 129, -0.1F, -0.0647F, -0.1892F, 1, 5, 1, -0.2F, false));

		gun257 = new ModelRenderer(this);
		gun257.setRotationPoint(0.0F, 2.2F, 0.4F);
		bone4.addChild(gun257);
		setRotationAngle(gun257, 2.6397F, 0.0F, 0.0F);
		gun257.cubeList.add(new ModelBox(gun257, 103, 87, -0.08F, 0.6945F, -0.0835F, 1, 1, 8, -0.2F, false));
		gun257.cubeList.add(new ModelBox(gun257, 190, 13, -0.08F, 0.5945F, 7.4165F, 1, 1, 1, -0.2F, false));
		gun257.cubeList.add(new ModelBox(gun257, 10, 190, -0.08F, 0.5945F, 8.0165F, 1, 1, 1, -0.2F, false));

		gun173_r1 = new ModelRenderer(this);
		gun173_r1.setRotationPoint(0.42F, 1.3945F, 8.0665F);
		gun257.addChild(gun173_r1);
		setRotationAngle(gun173_r1, 0.1571F, 0.0F, 0.0F);
		gun173_r1.cubeList.add(new ModelBox(gun173_r1, 5, 190, -0.5F, -0.5F, -0.65F, 1, 1, 1, -0.2F, false));

		gun174_r1 = new ModelRenderer(this);
		gun174_r1.setRotationPoint(0.42F, 1.3476F, 8.3628F);
		gun257.addChild(gun174_r1);
		setRotationAngle(gun174_r1, 0.1571F, 0.0F, 0.0F);
		gun174_r1.cubeList.add(new ModelBox(gun174_r1, 190, 5, -0.5F, -0.5F, -0.35F, 1, 1, 1, -0.2F, false));

		gun258 = new ModelRenderer(this);
		gun258.setRotationPoint(0.0F, -2.0F, -7.0F);
		bone4.addChild(gun258);
		setRotationAngle(gun258, 0.9666F, 0.0F, 0.0F);
		

		gun259 = new ModelRenderer(this);
		gun259.setRotationPoint(0.0F, -0.3F, 1.9F);
		bone4.addChild(gun259);
		setRotationAngle(gun259, -1.8961F, 0.0F, 0.0F);
		gun259.cubeList.add(new ModelBox(gun259, 17, 80, -0.08F, -0.0262F, -0.2944F, 1, 3, 2, -0.2F, false));
		gun259.cubeList.add(new ModelBox(gun259, 159, 122, -0.099F, 1.964F, -0.3967F, 1, 5, 1, -0.2F, false));
		gun259.cubeList.add(new ModelBox(gun259, 43, 134, -0.099F, 1.964F, 0.2033F, 1, 4, 1, -0.2F, false));

		gun260 = new ModelRenderer(this);
		gun260.setRotationPoint(0.0F, -2.45F, -0.1F);
		bone4.addChild(gun260);
		setRotationAngle(gun260, -0.8179F, 0.0F, 0.0F);
		gun260.cubeList.add(new ModelBox(gun260, 18, 166, -0.08F, -0.1904F, -0.0614F, 1, 2, 3, -0.2F, false));

		gun261 = new ModelRenderer(this);
		gun261.setRotationPoint(-0.1F, -1.0F, 0.5F);
		bone4.addChild(gun261);
		setRotationAngle(gun261, -2.6025F, 0.0F, 0.0F);
		gun261.cubeList.add(new ModelBox(gun261, 193, 154, -0.1F, 0.2668F, -0.0981F, 1, 1, 1, -0.2F, false));

		gun262 = new ModelRenderer(this);
		gun262.setRotationPoint(0.0F, 1.7F, 1.3F);
		bone4.addChild(gun262);
		setRotationAngle(gun262, -2.6397F, 0.0F, 0.0F);
		gun262.cubeList.add(new ModelBox(gun262, 6, 166, -0.08F, 0.3734F, -0.4624F, 1, 1, 1, -0.2F, false));

		gun263 = new ModelRenderer(this);
		gun263.setRotationPoint(-3.2F, -31.0F, -7.5F);
		val.addChild(gun263);
		gun263.cubeList.add(new ModelBox(gun263, 145, 0, -0.21F, -2.0F, 0.0F, 3, 6, 2, -0.2F, false));

		barrel2 = new ModelRenderer(this);
		barrel2.setRotationPoint(-1.1F, -22.1F, -81.8F);
		val.addChild(barrel2);
		

		barrel5 = new ModelRenderer(this);
		barrel5.setRotationPoint(1.0F, 36.8F, 85.5F);
		barrel2.addChild(barrel5);
		

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-1.5F, -37.8F, -85.5F);
		barrel5.addChild(bone5);
		

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone5.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0F, 0.0F, 0.4363F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 43, 162, -5.9162F, -12.6885F, 7.0F, 2, 1, 38, -0.2F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone5.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.0F, 0.0F, -0.4363F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 43, 122, 4.0916F, -12.6067F, 7.0F, 2, 1, 38, -0.2F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-1.5F, -32.4F, -85.5F);
		barrel5.addChild(bone6);
		

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone6.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.0F, 0.0F, -0.4363F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 86, 160, 6.1765F, -14.2467F, 7.0F, 2, 1, 38, -0.2F, false));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone6.addChild(cube_r30);
		setRotationAngle(cube_r30, 0.0F, 0.0F, 0.4363F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 160, -8.0012F, -14.3285F, 7.0F, 2, 1, 38, -0.2F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(1.2F, -35.1F, -85.5F);
		barrel5.addChild(bone7);
		setRotationAngle(bone7, 0.0F, 0.0F, 1.5708F);
		

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone7.addChild(cube_r31);
		setRotationAngle(cube_r31, 0.0F, 0.0F, 0.4363F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 86, 120, -12.966F, 6.2788F, 7.0F, 2, 1, 38, -0.2F, false));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(0.0F, 70.2F, 0.0F);
		bone7.addChild(cube_r32);
		setRotationAngle(cube_r32, 0.0F, 0.0F, 0.4363F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 180, 131, -42.647F, -57.4072F, 44.4F, 2, 1, 1, -0.2F, false));

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone7.addChild(cube_r33);
		setRotationAngle(cube_r33, 0.0F, 0.0F, -0.4363F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 110, 82, -14.9314F, -5.8656F, 44.4F, 2, 1, 1, -0.2F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 0, -14.9692F, -5.814F, 7.0F, 2, 1, 38, -0.2F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-4.2F, -35.1F, -85.5F);
		barrel5.addChild(bone8);
		setRotationAngle(bone8, 0.0F, 0.0F, -1.5708F);
		

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone8.addChild(cube_r34);
		setRotationAngle(cube_r34, 0.0F, 0.0F, -0.4363F);
		cube_r34.cubeList.add(new ModelBox(cube_r34, 129, 122, 10.8842F, 6.4541F, 7.0F, 2, 1, 38, -0.2F, false));

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone8.addChild(cube_r35);
		setRotationAngle(cube_r35, 0.0F, 0.0F, 0.4363F);
		cube_r35.cubeList.add(new ModelBox(cube_r35, 129, 82, 13.051F, -5.6387F, 7.0F, 2, 1, 38, -0.2F, false));

		barrelouter2 = new ModelRenderer(this);
		barrelouter2.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrel2.addChild(barrelouter2);
		

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(-0.5F, 4.4F, 0.0F);
		barrelouter2.addChild(bone9);
		

		cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone9.addChild(cube_r36);
		setRotationAngle(cube_r36, 0.0F, 0.0F, -0.4363F);
		cube_r36.cubeList.add(new ModelBox(cube_r36, 43, 171, 6.1836F, -15.2037F, 5.599F, 2, 2, 2, -0.15F, false));

		cube_r37 = new ModelRenderer(this);
		cube_r37.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone9.addChild(cube_r37);
		setRotationAngle(cube_r37, 0.0F, 0.0F, 0.4363F);
		cube_r37.cubeList.add(new ModelBox(cube_r37, 172, 107, -8.0084F, -15.2868F, 5.602F, 2, 2, 2, -0.149F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(2.2F, 1.7F, 0.0F);
		barrelouter2.addChild(bone10);
		setRotationAngle(bone10, 0.0F, 0.0F, 1.5708F);
		

		cube_r38 = new ModelRenderer(this);
		cube_r38.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone10.addChild(cube_r38);
		setRotationAngle(cube_r38, 0.0F, 0.0F, 0.4363F);
		cube_r38.cubeList.add(new ModelBox(cube_r38, 172, 147, -13.0019F, 6.2228F, 5.601F, 2, 2, 2, -0.148F, false));

		cube_r39 = new ModelRenderer(this);
		cube_r39.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone10.addChild(cube_r39);
		setRotationAngle(cube_r39, 0.0F, 0.0F, -0.4363F);
		cube_r39.cubeList.add(new ModelBox(cube_r39, 95, 168, -14.993F, -5.9008F, 5.599F, 2, 2, 2, -0.15F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(-3.2F, 1.7F, 0.0F);
		barrelouter2.addChild(bone11);
		setRotationAngle(bone11, 0.0F, 0.0F, -1.5708F);
		

		cube_r40 = new ModelRenderer(this);
		cube_r40.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone11.addChild(cube_r40);
		setRotationAngle(cube_r40, 0.0F, 0.0F, -0.4363F);
		cube_r40.cubeList.add(new ModelBox(cube_r40, 172, 102, 10.9193F, 6.3957F, 5.601F, 2, 2, 2, -0.15F, false));

		cube_r41 = new ModelRenderer(this);
		cube_r41.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone11.addChild(cube_r41);
		setRotationAngle(cube_r41, 0.0F, 0.0F, 0.4363F);
		cube_r41.cubeList.add(new ModelBox(cube_r41, 172, 97, 13.0746F, -5.7215F, 5.599F, 2, 2, 2, -0.148F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(-0.5F, -1.0F, 0.0F);
		barrelouter2.addChild(bone12);
		

		cube_r42 = new ModelRenderer(this);
		cube_r42.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone12.addChild(cube_r42);
		setRotationAngle(cube_r42, 0.0F, 0.0F, 0.4363F);
		cube_r42.cubeList.add(new ModelBox(cube_r42, 172, 162, -5.9358F, -12.7897F, 5.6F, 2, 2, 2, -0.149F, false));

		cube_r43 = new ModelRenderer(this);
		cube_r43.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone12.addChild(cube_r43);
		setRotationAngle(cube_r43, 0.0F, 0.0F, -0.4363F);
		cube_r43.cubeList.add(new ModelBox(cube_r43, 147, 168, 4.1128F, -12.7086F, 5.601F, 2, 2, 2, -0.15F, false));

		barrelouter3 = new ModelRenderer(this);
		barrelouter3.setRotationPoint(0.0F, 0.0F, 26.0F);
		barrel2.addChild(barrelouter3);
		

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(-0.5F, 4.4F, 0.0F);
		barrelouter3.addChild(bone13);
		

		cube_r44 = new ModelRenderer(this);
		cube_r44.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone13.addChild(cube_r44);
		setRotationAngle(cube_r44, 0.0F, 0.0F, -0.4363F);
		cube_r44.cubeList.add(new ModelBox(cube_r44, 108, 74, 6.1291F, -14.0859F, 7.0F, 2, 1, 2, -0.1F, false));

		cube_r45 = new ModelRenderer(this);
		cube_r45.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone13.addChild(cube_r45);
		setRotationAngle(cube_r45, 0.0F, 0.0F, 0.4363F);
		cube_r45.cubeList.add(new ModelBox(cube_r45, 154, 102, -7.9961F, -14.1479F, 7.0F, 2, 1, 2, -0.1F, false));

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(2.2F, 1.7F, 0.0F);
		barrelouter3.addChild(bone14);
		setRotationAngle(bone14, 0.0F, 0.0F, 1.5708F);
		

		cube_r91 = new ModelRenderer(this);
		cube_r91.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone14.addChild(cube_r91);
		setRotationAngle(cube_r91, 0.0F, 0.0F, 0.4363F);
		cube_r91.cubeList.add(new ModelBox(cube_r91, 29, 160, -12.9386F, 6.1452F, 7.0F, 2, 1, 2, -0.1F, false));

		cube_r92 = new ModelRenderer(this);
		cube_r92.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone14.addChild(cube_r92);
		setRotationAngle(cube_r92, 0.0F, 0.0F, -0.4363F);
		cube_r92.cubeList.add(new ModelBox(cube_r92, 11, 74, -14.937F, -5.9198F, 7.0F, 2, 1, 2, -0.1F, false));

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(-3.2F, 1.7F, 0.0F);
		barrelouter3.addChild(bone15);
		setRotationAngle(bone15, 0.0F, 0.0F, -1.5708F);
		

		cube_r93 = new ModelRenderer(this);
		cube_r93.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone15.addChild(cube_r93);
		setRotationAngle(cube_r93, 0.0F, 0.0F, -0.4363F);
		cube_r93.cubeList.add(new ModelBox(cube_r93, 149, 42, 10.8766F, 6.2782F, 7.0F, 2, 1, 2, -0.1F, false));

		cube_r94 = new ModelRenderer(this);
		cube_r94.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone15.addChild(cube_r94);
		setRotationAngle(cube_r94, 0.0F, 0.0F, 0.4363F);
		cube_r94.cubeList.add(new ModelBox(cube_r94, 139, 94, 12.999F, -5.7868F, 7.0F, 2, 1, 2, -0.1F, false));

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(-0.5F, -1.0F, 0.0F);
		barrelouter3.addChild(bone16);
		

		cube_r95 = new ModelRenderer(this);
		cube_r95.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone16.addChild(cube_r95);
		setRotationAngle(cube_r95, 0.0F, 0.0F, 0.4363F);
		cube_r95.cubeList.add(new ModelBox(cube_r95, 104, 173, -5.9358F, -12.7897F, 7.0F, 2, 1, 2, -0.1F, false));

		cube_r96 = new ModelRenderer(this);
		cube_r96.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone16.addChild(cube_r96);
		setRotationAngle(cube_r96, 0.0F, 0.0F, -0.4363F);
		cube_r96.cubeList.add(new ModelBox(cube_r96, 52, 74, 4.0688F, -12.7277F, 7.0F, 2, 1, 2, -0.1F, false));

		barrelouter4 = new ModelRenderer(this);
		barrelouter4.setRotationPoint(0.0F, 0.0F, 42.9F);
		barrel2.addChild(barrelouter4);
		

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(-0.5F, 4.4F, 0.0F);
		barrelouter4.addChild(bone17);
		

		cube_r97 = new ModelRenderer(this);
		cube_r97.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone17.addChild(cube_r97);
		setRotationAngle(cube_r97, 0.0F, 0.0F, -0.4363F);
		cube_r97.cubeList.add(new ModelBox(cube_r97, 50, 162, 6.1291F, -14.0859F, 0.0F, 2, 1, 1, -0.1F, false));

		cube_r98 = new ModelRenderer(this);
		cube_r98.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone17.addChild(cube_r98);
		setRotationAngle(cube_r98, 0.0F, 0.0F, 0.4363F);
		cube_r98.cubeList.add(new ModelBox(cube_r98, 180, 126, -7.9961F, -14.1479F, 0.0F, 2, 1, 1, -0.1F, false));

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(2.2F, 1.7F, 0.0F);
		barrelouter4.addChild(bone18);
		setRotationAngle(bone18, 0.0F, 0.0F, 1.5708F);
		bone18.cubeList.add(new ModelBox(bone18, 30, 10, -14.8F, 0.2001F, 1.4F, 1, 1, 2, -0.2F, false));

		cube_r99 = new ModelRenderer(this);
		cube_r99.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone18.addChild(cube_r99);
		setRotationAngle(cube_r99, 0.0F, 0.0F, 0.4363F);
		cube_r99.cubeList.add(new ModelBox(cube_r99, 100, 181, -12.9386F, 6.1452F, 0.0F, 2, 1, 1, -0.1F, false));

		cube_r100 = new ModelRenderer(this);
		cube_r100.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone18.addChild(cube_r100);
		setRotationAngle(cube_r100, 0.0F, 0.0F, -0.4363F);
		cube_r100.cubeList.add(new ModelBox(cube_r100, 57, 103, -14.937F, -5.9198F, 0.0F, 2, 1, 1, -0.1F, false));

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(-3.2F, 1.7F, 0.0F);
		barrelouter4.addChild(bone19);
		setRotationAngle(bone19, 0.0F, 0.0F, -1.5708F);
		

		cube_r101 = new ModelRenderer(this);
		cube_r101.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone19.addChild(cube_r101);
		setRotationAngle(cube_r101, 0.0F, 0.0F, -0.4363F);
		cube_r101.cubeList.add(new ModelBox(cube_r101, 180, 106, 10.8766F, 6.2782F, 0.0F, 2, 1, 1, -0.1F, false));

		cube_r102 = new ModelRenderer(this);
		cube_r102.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone19.addChild(cube_r102);
		setRotationAngle(cube_r102, 0.0F, 0.0F, 0.4363F);
		cube_r102.cubeList.add(new ModelBox(cube_r102, 180, 101, 12.999F, -5.7868F, 0.0F, 2, 1, 1, -0.1F, false));

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(-0.5F, -1.0F, 0.0F);
		barrelouter4.addChild(bone20);
		

		cube_r103 = new ModelRenderer(this);
		cube_r103.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone20.addChild(cube_r103);
		setRotationAngle(cube_r103, 0.0F, 0.0F, 0.4363F);
		cube_r103.cubeList.add(new ModelBox(cube_r103, 181, 115, -5.9358F, -12.7897F, 0.0F, 2, 1, 1, -0.1F, false));

		cube_r104 = new ModelRenderer(this);
		cube_r104.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone20.addChild(cube_r104);
		setRotationAngle(cube_r104, 0.0F, 0.0F, -0.4363F);
		cube_r104.cubeList.add(new ModelBox(cube_r104, 18, 148, 4.0688F, -12.7277F, 0.0F, 2, 1, 1, -0.1F, false));

		barrelouter9 = new ModelRenderer(this);
		barrelouter9.setRotationPoint(0.0F, 0.0F, 4.0F);
		barrel2.addChild(barrelouter9);
		

		bone34 = new ModelRenderer(this);
		bone34.setRotationPoint(-0.5F, 4.4F, 0.0F);
		barrelouter9.addChild(bone34);
		

		cube_r105 = new ModelRenderer(this);
		cube_r105.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone34.addChild(cube_r105);
		setRotationAngle(cube_r105, 0.0F, 0.0F, -0.4363F);
		

		cube_r106 = new ModelRenderer(this);
		cube_r106.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone34.addChild(cube_r106);
		setRotationAngle(cube_r106, 0.0F, 0.0F, 0.4363F);
		

		bone35 = new ModelRenderer(this);
		bone35.setRotationPoint(2.2F, 1.7F, 0.0F);
		barrelouter9.addChild(bone35);
		setRotationAngle(bone35, 0.0F, 0.0F, 1.5708F);
		

		cube_r107 = new ModelRenderer(this);
		cube_r107.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone35.addChild(cube_r107);
		setRotationAngle(cube_r107, 0.0F, 0.0F, 0.4363F);
		

		cube_r108 = new ModelRenderer(this);
		cube_r108.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone35.addChild(cube_r108);
		setRotationAngle(cube_r108, 0.0F, 0.0F, -0.4363F);
		

		bone44 = new ModelRenderer(this);
		bone44.setRotationPoint(-3.2F, 1.7F, 0.0F);
		barrelouter9.addChild(bone44);
		setRotationAngle(bone44, 0.0F, 0.0F, -1.5708F);
		

		cube_r109 = new ModelRenderer(this);
		cube_r109.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone44.addChild(cube_r109);
		setRotationAngle(cube_r109, 0.0F, 0.0F, -0.4363F);
		

		cube_r110 = new ModelRenderer(this);
		cube_r110.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone44.addChild(cube_r110);
		setRotationAngle(cube_r110, 0.0F, 0.0F, 0.4363F);
		

		bone45 = new ModelRenderer(this);
		bone45.setRotationPoint(-0.5F, -1.0F, 0.0F);
		barrelouter9.addChild(bone45);
		

		cube_r111 = new ModelRenderer(this);
		cube_r111.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone45.addChild(cube_r111);
		setRotationAngle(cube_r111, 0.0F, 0.0F, 0.4363F);
		

		cube_r112 = new ModelRenderer(this);
		cube_r112.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone45.addChild(cube_r112);
		setRotationAngle(cube_r112, 0.0F, 0.0F, -0.4363F);
		

		ironsights3 = new ModelRenderer(this);
		ironsights3.setRotationPoint(-22.1F, -11.7F, -2.2F);
		barrel2.addChild(ironsights3);
		ironsights3.cubeList.add(new ModelBox(ironsights3, 60, 58, 22.0F, -5.8F, 8.5F, 1, 4, 2, -0.3F, false));
		ironsights3.cubeList.add(new ModelBox(ironsights3, 60, 18, 21.0F, -4.6F, 37.5F, 2, 3, 8, -0.3F, false));
		ironsights3.cubeList.add(new ModelBox(ironsights3, 17, 58, 20.2F, -4.6F, 37.5F, 2, 3, 8, -0.299F, false));
		ironsights3.cubeList.add(new ModelBox(ironsights3, 141, 129, 20.2F, -4.8F, 40.5F, 1, 1, 5, -0.301F, false));
		ironsights3.cubeList.add(new ModelBox(ironsights3, 141, 42, 22.0F, -4.8F, 40.5F, 1, 1, 5, -0.301F, false));
		ironsights3.cubeList.add(new ModelBox(ironsights3, 129, 109, 20.2F, -5.66F, 38.42F, 1, 2, 2, -0.301F, false));
		ironsights3.cubeList.add(new ModelBox(ironsights3, 0, 109, 20.6F, -5.46F, 38.82F, 2, 1, 7, -0.301F, false));
		ironsights3.cubeList.add(new ModelBox(ironsights3, 55, 173, 20.1F, -5.26F, 45.12F, 3, 1, 1, -0.4F, false));
		ironsights3.cubeList.add(new ModelBox(ironsights3, 72, 172, 20.1F, -5.46F, 45.12F, 3, 1, 1, -0.4F, false));
		ironsights3.cubeList.add(new ModelBox(ironsights3, 172, 35, 20.1F, -5.66F, 45.12F, 3, 1, 1, -0.4F, false));
		ironsights3.cubeList.add(new ModelBox(ironsights3, 148, 110, 22.1F, -5.86F, 45.12F, 1, 1, 1, -0.4F, false));
		ironsights3.cubeList.add(new ModelBox(ironsights3, 148, 107, 21.9F, -5.86F, 45.12F, 1, 1, 1, -0.4F, false));
		ironsights3.cubeList.add(new ModelBox(ironsights3, 148, 49, 21.7F, -5.86F, 45.12F, 1, 1, 1, -0.4F, false));
		ironsights3.cubeList.add(new ModelBox(ironsights3, 147, 122, 21.5F, -5.86F, 45.12F, 1, 1, 1, -0.4F, false));
		ironsights3.cubeList.add(new ModelBox(ironsights3, 145, 11, 21.4F, -5.86F, 45.12F, 1, 1, 1, -0.401F, false));
		ironsights3.cubeList.add(new ModelBox(ironsights3, 195, 18, 21.4F, -5.96F, 45.12F, 1, 1, 1, -0.402F, false));
		ironsights3.cubeList.add(new ModelBox(ironsights3, 192, 194, 21.5F, -5.96F, 45.12F, 1, 1, 1, -0.401F, false));
		ironsights3.cubeList.add(new ModelBox(ironsights3, 187, 194, 21.7F, -5.96F, 45.12F, 1, 1, 1, -0.401F, false));
		ironsights3.cubeList.add(new ModelBox(ironsights3, 182, 194, 21.9F, -5.96F, 45.12F, 1, 1, 1, -0.401F, false));
		ironsights3.cubeList.add(new ModelBox(ironsights3, 177, 194, 22.1F, -5.96F, 45.12F, 1, 1, 1, -0.401F, false));
		ironsights3.cubeList.add(new ModelBox(ironsights3, 196, 0, 20.8F, -5.96F, 45.12F, 1, 1, 1, -0.402F, false));
		ironsights3.cubeList.add(new ModelBox(ironsights3, 195, 144, 20.7F, -5.96F, 45.12F, 1, 1, 1, -0.401F, false));
		ironsights3.cubeList.add(new ModelBox(ironsights3, 195, 124, 20.5F, -5.96F, 45.12F, 1, 1, 1, -0.401F, false));
		ironsights3.cubeList.add(new ModelBox(ironsights3, 172, 194, 20.3F, -5.96F, 45.12F, 1, 1, 1, -0.401F, false));
		ironsights3.cubeList.add(new ModelBox(ironsights3, 159, 194, 20.1F, -5.96F, 45.12F, 1, 1, 1, -0.401F, false));
		ironsights3.cubeList.add(new ModelBox(ironsights3, 162, 66, 20.8F, -5.86F, 45.12F, 1, 1, 1, -0.401F, false));
		ironsights3.cubeList.add(new ModelBox(ironsights3, 62, 162, 20.7F, -5.86F, 45.12F, 1, 1, 1, -0.4F, false));
		ironsights3.cubeList.add(new ModelBox(ironsights3, 104, 144, 20.3F, -5.86F, 45.12F, 1, 1, 1, -0.4F, false));
		ironsights3.cubeList.add(new ModelBox(ironsights3, 96, 143, 20.1F, -5.86F, 45.12F, 1, 1, 1, -0.4F, false));
		ironsights3.cubeList.add(new ModelBox(ironsights3, 161, 42, 20.5F, -5.86F, 45.12F, 1, 1, 1, -0.4F, false));
		ironsights3.cubeList.add(new ModelBox(ironsights3, 129, 100, 22.0F, -5.66F, 38.42F, 1, 2, 2, -0.301F, false));
		ironsights3.cubeList.add(new ModelBox(ironsights3, 60, 42, 20.2F, -5.8F, 8.5F, 1, 4, 2, -0.3F, false));
		ironsights3.cubeList.add(new ModelBox(ironsights3, 52, 18, 21.1F, -5.9F, 8.5F, 1, 2, 1, -0.4F, false));
		ironsights3.cubeList.add(new ModelBox(ironsights3, 139, 122, 22.0F, -5.0F, 8.1F, 1, 3, 1, -0.3F, false));
		ironsights3.cubeList.add(new ModelBox(ironsights3, 139, 100, 20.2F, -5.0F, 8.1F, 1, 3, 1, -0.3F, false));
		ironsights3.cubeList.add(new ModelBox(ironsights3, 139, 82, 20.6F, -4.8F, 8.4F, 2, 1, 2, -0.201F, false));
		ironsights3.cubeList.add(new ModelBox(ironsights3, 139, 71, 20.6F, -3.8F, 8.4F, 2, 1, 2, -0.201F, false));

		cube_r113 = new ModelRenderer(this);
		cube_r113.setRotationPoint(-0.4F, -1.66F, 35.22F);
		ironsights3.addChild(cube_r113);
		setRotationAngle(cube_r113, -0.5236F, 0.0F, 0.0F);
		cube_r113.cubeList.add(new ModelBox(cube_r113, 43, 122, 22.4F, -5.9543F, 2.0935F, 1, 2, 3, -0.302F, false));
		cube_r113.cubeList.add(new ModelBox(cube_r113, 0, 120, 20.6F, -5.9543F, 2.0935F, 1, 2, 3, -0.302F, false));

		cube_r114 = new ModelRenderer(this);
		cube_r114.setRotationPoint(-2.7F, -1.36F, 40.72F);
		ironsights3.addChild(cube_r114);
		setRotationAngle(cube_r114, 0.3665F, 0.0F, 0.0F);
		cube_r114.cubeList.add(new ModelBox(cube_r114, 185, 30, 22.7F, -2.3567F, 4.6669F, 1, 1, 1, -0.15F, false));
		cube_r114.cubeList.add(new ModelBox(cube_r114, 0, 190, 23.0F, -2.3567F, 4.6669F, 1, 1, 1, -0.151F, false));
		cube_r114.cubeList.add(new ModelBox(cube_r114, 189, 173, 24.6F, -2.3567F, 4.6669F, 1, 1, 1, -0.151F, false));
		cube_r114.cubeList.add(new ModelBox(cube_r114, 189, 85, 24.9F, -2.3567F, 4.6669F, 1, 1, 1, -0.15F, false));

		cube_r115 = new ModelRenderer(this);
		cube_r115.setRotationPoint(-0.4F, -1.16F, 33.92F);
		ironsights3.addChild(cube_r115);
		setRotationAngle(cube_r115, 0.3665F, 0.0F, 0.0F);
		cube_r115.cubeList.add(new ModelBox(cube_r115, 86, 155, 20.5F, -1.9984F, 5.6005F, 3, 1, 1, -0.1F, false));

		cube_r116 = new ModelRenderer(this);
		cube_r116.setRotationPoint(-0.8F, -0.6F, 32.9F);
		ironsights3.addChild(cube_r116);
		setRotationAngle(cube_r116, -0.7156F, 0.0F, 0.0F);
		cube_r116.cubeList.add(new ModelBox(cube_r116, 8, 51, 21.4F, -6.7071F, 0.9706F, 2, 1, 1, -0.302F, false));
		cube_r116.cubeList.add(new ModelBox(cube_r116, 31, 91, 22.8F, -7.7071F, 0.9706F, 1, 2, 2, -0.302F, false));
		cube_r116.cubeList.add(new ModelBox(cube_r116, 86, 27, 21.0F, -7.7071F, 0.9706F, 1, 2, 2, -0.302F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		val.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}