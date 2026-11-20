package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class PSS extends ModelWithAttachments {
	private final ModelRenderer gun;
	private final ModelRenderer gun182;
	private final ModelRenderer gun181;
	private final ModelRenderer gun180;
	private final ModelRenderer gun163;
	private final ModelRenderer gun162;
	private final ModelRenderer gun161;
	private final ModelRenderer gun160;
	private final ModelRenderer gun158;
	private final ModelRenderer gun157;
	private final ModelRenderer gun156;
	private final ModelRenderer gun155;
	private final ModelRenderer gun153;
	private final ModelRenderer gun152;
	private final ModelRenderer gun151;
	private final ModelRenderer gun150;
	private final ModelRenderer gun149;
	private final ModelRenderer gun148;
	private final ModelRenderer gun141;
	private final ModelRenderer gun140;
	private final ModelRenderer gun3;
	private final ModelRenderer gun131;
	private final ModelRenderer gun133_r1;
	private final ModelRenderer gun130;
	private final ModelRenderer gun126;
	private final ModelRenderer gun92;
	private final ModelRenderer gun86;
	private final ModelRenderer gun85;
	private final ModelRenderer gun84;
	private final ModelRenderer gun83;
	private final ModelRenderer gun15;
	private final ModelRenderer gun14;
	private final ModelRenderer gun6;
	private final ModelRenderer gun2;
	private final ModelRenderer hammer;
	private final ModelRenderer gun1822;
	private final ModelRenderer gun168;
	private final ModelRenderer gun169;
	private final ModelRenderer gun167;
	private final ModelRenderer gun183;
	private final ModelRenderer grip;
	private final ModelRenderer gun13;
	private final ModelRenderer gun15_r1;
	private final ModelRenderer gun145;
	private final ModelRenderer gun143;
	private final ModelRenderer gun144;
	private final ModelRenderer gun135;
	private final ModelRenderer gun87;
	private final ModelRenderer gun127;
	private final ModelRenderer gun91;
	private final ModelRenderer gun178;
	private final ModelRenderer gun174;
	private final ModelRenderer gun89;
	private final ModelRenderer gun93;
	private final ModelRenderer gun172;
	private final ModelRenderer gun175;
	private final ModelRenderer gun173;
	private final ModelRenderer gun171;
	private final ModelRenderer gun179;
	private final ModelRenderer gun176;
	private final ModelRenderer gun177;
	private final ModelRenderer gun170;

	public PSS() {
		textureWidth = 150;
		textureHeight = 150;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		gun182 = new ModelRenderer(this);
		gun182.setRotationPoint(-3.0F, -17.6F, 3.0F);
		gun.addChild(gun182);
		setRotationAngle(gun182, -3.0486F, 0.0F, 0.0F);
		gun182.cubeList.add(new ModelBox(gun182, 23, 0, 0.0F, 2.0F, 0.0F, 3, 5, 2, 0.0F, false));

		gun181 = new ModelRenderer(this);
		gun181.setRotationPoint(-3.0F, -23.7F, 2.3F);
		gun.addChild(gun181);
		setRotationAngle(gun181, -3.0486F, 0.0F, 0.0F);
		gun181.cubeList.add(new ModelBox(gun181, 50, 60, 0.0F, 0.0F, 0.0F, 3, 1, 2, 0.0F, false));

		gun180 = new ModelRenderer(this);
		gun180.setRotationPoint(-2.5F, -30.5F, 0.6F);
		gun.addChild(gun180);
		setRotationAngle(gun180, -1.3013F, 0.0F, 0.0F);
		gun180.cubeList.add(new ModelBox(gun180, 10, 75, 0.0F, 0.0F, 0.0F, 2, 2, 6, 0.0F, false));

		gun163 = new ModelRenderer(this);
		gun163.setRotationPoint(-0.3F, -32.0F, -8.5F);
		gun.addChild(gun163);
		setRotationAngle(gun163, 1.2641F, 0.0F, 0.0F);
		gun163.cubeList.add(new ModelBox(gun163, 0, 22, -0.6F, 0.0F, 0.0F, 1, 3, 1, 0.0F, false));

		gun162 = new ModelRenderer(this);
		gun162.setRotationPoint(-3.7F, -32.0F, -8.5F);
		gun.addChild(gun162);
		setRotationAngle(gun162, 1.2641F, 0.0F, 0.0F);
		gun162.cubeList.add(new ModelBox(gun162, 9, 22, 0.65F, 0.0F, 0.0F, 1, 3, 1, 0.0F, false));

		gun161 = new ModelRenderer(this);
		gun161.setRotationPoint(-3.7F, -34.0F, -10.7F);
		gun.addChild(gun161);
		gun161.cubeList.add(new ModelBox(gun161, 54, 13, 0.65F, 1.0F, 0.0F, 1, 1, 11, 0.0F, false));

		gun160 = new ModelRenderer(this);
		gun160.setRotationPoint(-0.3F, -34.0F, -10.7F);
		gun.addChild(gun160);
		gun160.cubeList.add(new ModelBox(gun160, 54, 33, -0.598F, 1.0F, 0.0F, 1, 1, 11, 0.0F, false));

		gun158 = new ModelRenderer(this);
		gun158.setRotationPoint(-3.5F, -17.0F, 0.0F);
		gun.addChild(gun158);
		gun158.cubeList.add(new ModelBox(gun158, 28, 42, 0.5F, -3.0F, 0.0F, 3, 1, 2, 0.0F, false));

		gun157 = new ModelRenderer(this);
		gun157.setRotationPoint(-2.5F, -25.6F, -12.5F);
		gun.addChild(gun157);
		setRotationAngle(gun157, 2.3562F, 0.0F, 0.0F);
		gun157.cubeList.add(new ModelBox(gun157, 12, 39, 0.001F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		gun156 = new ModelRenderer(this);
		gun156.setRotationPoint(-2.5F, -26.6F, -13.5F);
		gun.addChild(gun156);
		setRotationAngle(gun156, 0.7854F, 0.0F, 0.0F);
		gun156.cubeList.add(new ModelBox(gun156, 67, 22, -0.001F, 0.0F, -0.001F, 2, 1, 1, 0.0F, false));

		gun155 = new ModelRenderer(this);
		gun155.setRotationPoint(-3.5F, -31.0F, -10.0F);
		gun.addChild(gun155);
		setRotationAngle(gun155, 1.2641F, 0.0F, 0.0F);
		gun155.cubeList.add(new ModelBox(gun155, 34, 11, 0.502F, 0.0F, 0.0F, 3, 5, 2, 0.0F, false));

		gun153 = new ModelRenderer(this);
		gun153.setRotationPoint(-0.3F, -33.5F, 0.3F);
		gun.addChild(gun153);
		setRotationAngle(gun153, -1.3384F, 0.0F, 0.0F);
		gun153.cubeList.add(new ModelBox(gun153, 0, 53, -0.599F, 0.0F, 0.0F, 1, 7, 3, 0.0F, false));

		gun152 = new ModelRenderer(this);
		gun152.setRotationPoint(-3.7F, -33.5F, 0.3F);
		gun.addChild(gun152);
		setRotationAngle(gun152, -1.3384F, 0.0F, 0.0F);
		gun152.cubeList.add(new ModelBox(gun152, 34, 53, 0.649F, 0.0F, 0.0F, 1, 7, 3, 0.0F, false));

		gun151 = new ModelRenderer(this);
		gun151.setRotationPoint(-2.5F, -30.6F, -13.5F);
		gun.addChild(gun151);
		gun151.cubeList.add(new ModelBox(gun151, 0, 14, 0.0F, 0.0F, 0.0F, 2, 4, 1, 0.0F, false));

		gun150 = new ModelRenderer(this);
		gun150.setRotationPoint(-3.0F, -30.5F, -4.3F);
		gun.addChild(gun150);
		setRotationAngle(gun150, -1.3384F, 0.0F, 0.0F);
		gun150.cubeList.add(new ModelBox(gun150, 92, 40, 0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F, false));

		gun149 = new ModelRenderer(this);
		gun149.setRotationPoint(-3.5F, -16.0F, 2.0F);
		gun.addChild(gun149);
		setRotationAngle(gun149, 2.167F, 0.0F, 0.0F);
		gun149.cubeList.add(new ModelBox(gun149, 34, 18, 0.501F, 1.6845F, 2.4824F, 3, 1, 1, 0.0F, false));

		gun148 = new ModelRenderer(this);
		gun148.setRotationPoint(-3.5F, -16.5F, -4.4F);
		gun.addChild(gun148);
		gun148.cubeList.add(new ModelBox(gun148, 54, 26, 0.499F, -3.5F, 0.0F, 3, 1, 5, 0.0F, false));

		gun141 = new ModelRenderer(this);
		gun141.setRotationPoint(-3.0F, -30.5F, -10.2F);
		gun.addChild(gun141);
		setRotationAngle(gun141, 1.2641F, 0.0F, 0.0F);
		gun141.cubeList.add(new ModelBox(gun141, 50, 53, -0.001F, 0.0F, 0.0F, 3, 5, 2, 0.0F, false));

		gun140 = new ModelRenderer(this);
		gun140.setRotationPoint(-3.5F, -33.5F, -24.5F);
		gun.addChild(gun140);
		gun140.cubeList.add(new ModelBox(gun140, 58, 114, 0.5F, -1.1F, 7.0F, 3, 1, 6, 0.0F, false));
		gun140.cubeList.add(new ModelBox(gun140, 37, 95, 1.5F, -2.1F, 7.0F, 1, 3, 6, 0.0F, false));
		gun140.cubeList.add(new ModelBox(gun140, 62, 118, 0.5F, -1.1F, 5.0F, 3, 1, 2, 0.0F, false));
		gun140.cubeList.add(new ModelBox(gun140, 41, 99, 1.5F, -2.1F, 5.0F, 1, 3, 2, 0.0F, false));
		gun140.cubeList.add(new ModelBox(gun140, 42, 100, 1.5F, -3.1F, 5.0F, 1, 1, 1, 0.0F, false));
		gun140.cubeList.add(new ModelBox(gun140, 42, 100, 1.5F, -3.6F, 5.0F, 1, 1, 1, 0.0F, false));
		gun140.cubeList.add(new ModelBox(gun140, 33, 91, 1.5F, -3.1F, 5.0F, 1, 1, 10, -0.2F, false));
		gun140.cubeList.add(new ModelBox(gun140, 62, 118, 0.5F, -1.1F, 13.0F, 3, 1, 2, 0.0F, false));
		gun140.cubeList.add(new ModelBox(gun140, 41, 99, 1.5F, -2.1F, 13.0F, 1, 3, 2, 0.0F, false));

		gun3 = new ModelRenderer(this);
		gun3.setRotationPoint(-1.5F, -34.0F, -15.5F);
		gun.addChild(gun3);
		setRotationAngle(gun3, 0.0F, 0.0F, 0.7854F);
		gun3.cubeList.add(new ModelBox(gun3, 58, 114, -1.4849F, -0.7778F, -2.0F, 1, 1, 6, 0.0F, false));
		gun3.cubeList.add(new ModelBox(gun3, 37, 95, -0.7778F, -1.4849F, -2.0F, 1, 1, 6, 0.0F, false));
		gun3.cubeList.add(new ModelBox(gun3, 58, 114, -0.3636F, -1.4849F, -2.0F, 1, 1, 6, 0.0F, false));
		gun3.cubeList.add(new ModelBox(gun3, 37, 95, -1.4849F, -0.3636F, -2.0F, 1, 1, 6, 0.0F, false));
		gun3.cubeList.add(new ModelBox(gun3, 62, 118, -1.4849F, -0.7778F, 4.0F, 1, 1, 2, 0.0F, false));
		gun3.cubeList.add(new ModelBox(gun3, 41, 99, -0.7778F, -1.4849F, 4.0F, 1, 1, 2, 0.0F, false));
		gun3.cubeList.add(new ModelBox(gun3, 41, 99, -1.4849F, -0.3636F, 4.0F, 1, 1, 2, 0.0F, false));
		gun3.cubeList.add(new ModelBox(gun3, 62, 118, -0.3636F, -1.4849F, 4.0F, 1, 1, 2, 0.0F, false));
		gun3.cubeList.add(new ModelBox(gun3, 58, 114, 0.3435F, -0.7778F, -2.0F, 1, 1, 6, 0.0F, false));
		gun3.cubeList.add(new ModelBox(gun3, 37, 95, 0.3435F, -0.3636F, -2.0F, 1, 1, 6, 0.0F, false));
		gun3.cubeList.add(new ModelBox(gun3, 58, 114, -0.3636F, 0.3435F, -2.0F, 1, 1, 6, 0.0F, false));
		gun3.cubeList.add(new ModelBox(gun3, 37, 95, -0.7778F, 0.3435F, -2.0F, 1, 1, 6, 0.0F, false));
		gun3.cubeList.add(new ModelBox(gun3, 62, 118, -1.4849F, -0.7778F, -4.0F, 1, 1, 2, 0.0F, false));
		gun3.cubeList.add(new ModelBox(gun3, 41, 99, -0.7778F, -1.4849F, -4.0F, 1, 1, 2, 0.0F, false));
		gun3.cubeList.add(new ModelBox(gun3, 41, 99, -1.4849F, -0.3636F, -4.0F, 1, 1, 2, 0.0F, false));
		gun3.cubeList.add(new ModelBox(gun3, 62, 118, -0.3636F, -1.4849F, -4.0F, 1, 1, 2, 0.0F, false));
		gun3.cubeList.add(new ModelBox(gun3, 41, 99, -0.7778F, 0.3435F, -4.0F, 1, 1, 2, 0.0F, false));
		gun3.cubeList.add(new ModelBox(gun3, 62, 118, -0.3636F, 0.3435F, -4.0F, 1, 1, 2, 0.0F, false));
		gun3.cubeList.add(new ModelBox(gun3, 41, 99, 0.3435F, -0.3636F, -4.0F, 1, 1, 2, 0.0F, false));
		gun3.cubeList.add(new ModelBox(gun3, 62, 118, 0.3435F, -0.7778F, -4.0F, 1, 1, 2, 0.0F, false));

		gun131 = new ModelRenderer(this);
		gun131.setRotationPoint(-3.0F, -33.6F, -23.5F);
		gun.addChild(gun131);
		gun131.cubeList.add(new ModelBox(gun131, 42, 61, 0.5F, 1.1F, 10.0F, 2, 2, 2, 0.0F, false));
		gun131.cubeList.add(new ModelBox(gun131, 38, 57, 0.5F, -0.9F, 6.0F, 2, 2, 6, 0.0F, false));
		gun131.cubeList.add(new ModelBox(gun131, 42, 61, 0.5F, -0.9F, 4.0F, 2, 2, 2, 0.0F, false));
		gun131.cubeList.add(new ModelBox(gun131, 42, 61, 0.5F, 0.325F, 4.0F, 2, 2, 2, 0.0F, false));

		gun133_r1 = new ModelRenderer(this);
		gun133_r1.setRotationPoint(1.5F, 1.717F, 7.1562F);
		gun131.addChild(gun133_r1);
		setRotationAngle(gun133_r1, -0.1309F, 0.0F, 0.0F);
		gun133_r1.cubeList.add(new ModelBox(gun133_r1, 38, 57, -1.0F, -1.0F, -3.0F, 2, 2, 6, 0.0F, false));

		gun130 = new ModelRenderer(this);
		gun130.setRotationPoint(-3.0F, -31.3F, -11.6F);
		gun.addChild(gun130);
		setRotationAngle(gun130, 2.6769F, 0.0F, 0.0F);
		gun130.cubeList.add(new ModelBox(gun130, 98, 34, 0.001F, 1.6903F, -0.3398F, 3, 1, 2, 0.0F, false));

		gun126 = new ModelRenderer(this);
		gun126.setRotationPoint(-3.0F, -31.5F, -13.5F);
		gun.addChild(gun126);
		gun126.cubeList.add(new ModelBox(gun126, 52, 108, 0.0F, 0.0F, 2.0F, 3, 1, 12, 0.0F, false));

		gun92 = new ModelRenderer(this);
		gun92.setRotationPoint(-3.5F, -30.5F, -4.0F);
		gun.addChild(gun92);
		setRotationAngle(gun92, -1.3384F, 0.0F, 0.0F);
		gun92.cubeList.add(new ModelBox(gun92, 28, 89, 0.501F, 0.0F, -1.0F, 3, 3, 12, 0.0F, false));

		gun86 = new ModelRenderer(this);
		gun86.setRotationPoint(-3.5F, -30.5F, 1.4F);
		gun.addChild(gun86);
		setRotationAngle(gun86, -1.9333F, 0.0F, 0.0F);
		gun86.cubeList.add(new ModelBox(gun86, 98, 77, 0.501F, 0.0F, 0.0F, 3, 4, 3, 0.0F, false));

		gun85 = new ModelRenderer(this);
		gun85.setRotationPoint(-3.5F, -31.5F, 3.5F);
		gun.addChild(gun85);
		setRotationAngle(gun85, -2.9371F, 0.0F, 0.0F);
		gun85.cubeList.add(new ModelBox(gun85, 67, 41, 0.501F, 0.0F, 0.0F, 3, 1, 2, 0.0F, false));

		gun84 = new ModelRenderer(this);
		gun84.setRotationPoint(-3.5F, -33.5F, -0.5F);
		gun.addChild(gun84);
		gun84.cubeList.add(new ModelBox(gun84, 54, 33, 2.55F, 1.0F, 0.1F, 1, 1, 4, 0.0F, false));
		gun84.cubeList.add(new ModelBox(gun84, 54, 0, 2.551F, 0.2F, 0.099F, 1, 1, 4, 0.0F, false));
		gun84.cubeList.add(new ModelBox(gun84, 54, 18, 0.45F, 1.0F, 0.1F, 1, 1, 4, 0.0F, false));
		gun84.cubeList.add(new ModelBox(gun84, 54, 13, 0.449F, 0.2F, 0.099F, 1, 1, 4, 0.0F, false));
		gun84.cubeList.add(new ModelBox(gun84, 34, 75, 0.95F, 1.0F, 0.099F, 2, 1, 4, 0.0F, false));
		gun84.cubeList.add(new ModelBox(gun84, 19, 59, 0.95F, 0.5F, 0.098F, 2, 1, 4, 0.0F, false));

		gun83 = new ModelRenderer(this);
		gun83.setRotationPoint(-3.5F, -29.5F, 0.5F);
		gun.addChild(gun83);
		setRotationAngle(gun83, 2.4166F, 0.0F, 0.0F);
		gun83.cubeList.add(new ModelBox(gun83, 98, 84, 0.499F, 0.0F, 0.0F, 3, 3, 2, 0.0F, false));

		gun15 = new ModelRenderer(this);
		gun15.setRotationPoint(-2.5F, -26.6F, -12.5F);
		gun.addChild(gun15);
		gun15.cubeList.add(new ModelBox(gun15, 79, 35, 0.0F, 0.0F, 0.0F, 2, 1, 6, 0.0F, false));

		gun14 = new ModelRenderer(this);
		gun14.setRotationPoint(-3.0F, -26.0F, -7.3F);
		gun.addChild(gun14);
		setRotationAngle(gun14, 0.8923F, 0.0F, 0.0F);
		gun14.cubeList.add(new ModelBox(gun14, 96, 20, -0.001F, 0.0F, 0.0F, 3, 3, 3, 0.0F, false));

		gun6 = new ModelRenderer(this);
		gun6.setRotationPoint(-3.5F, -34.0F, -13.5F);
		gun.addChild(gun6);
		gun6.cubeList.add(new ModelBox(gun6, 56, 2, 0.5F, 1.0F, 2.0F, 3, 2, 8, 0.0F, false));
		gun6.cubeList.add(new ModelBox(gun6, 62, 8, 0.5F, 0.7F, 2.0F, 3, 1, 2, 0.0F, false));
		gun6.cubeList.add(new ModelBox(gun6, 62, 8, 0.5F, -0.3F, 2.0F, 3, 1, 2, 0.0F, false));

		gun2 = new ModelRenderer(this);
		gun2.setRotationPoint(-2.0F, -31.0F, -8.0F);
		gun.addChild(gun2);
		setRotationAngle(gun2, -0.5205F, 0.0F, 0.0F);
		gun2.cubeList.add(new ModelBox(gun2, 0, 0, 0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F, false));

		hammer = new ModelRenderer(this);
		hammer.setRotationPoint(0.0F, -33.4F, 2.3F);
		gun.addChild(hammer);
		setRotationAngle(hammer, -0.8378F, 0.0F, 0.0F);
		

		gun1822 = new ModelRenderer(this);
		gun1822.setRotationPoint(-2.0F, -2.0F, 0.7F);
		hammer.addChild(gun1822);
		setRotationAngle(gun1822, -0.7436F, 0.0F, 0.0F);
		gun1822.cubeList.add(new ModelBox(gun1822, 9, 77, -0.001F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun168 = new ModelRenderer(this);
		gun168.setRotationPoint(-2.0F, -2.0F, 0.7F);
		hammer.addChild(gun168);
		setRotationAngle(gun168, -0.7436F, 0.0F, 0.0F);
		gun168.cubeList.add(new ModelBox(gun168, 54, 76, -0.002F, 0.3F, 0.2F, 1, 2, 1, 0.0F, false));

		gun169 = new ModelRenderer(this);
		gun169.setRotationPoint(-2.0F, -2.0F, 0.7F);
		hammer.addChild(gun169);
		setRotationAngle(gun169, -0.7436F, 0.0F, 0.0F);
		gun169.cubeList.add(new ModelBox(gun169, 50, 76, 0.0F, 0.3F, -0.2F, 1, 2, 1, 0.0F, false));

		gun167 = new ModelRenderer(this);
		gun167.setRotationPoint(-2.5F, -0.4F, 1.2F);
		hammer.addChild(gun167);
		setRotationAngle(gun167, -2.1192F, 0.0F, 0.0F);
		gun167.cubeList.add(new ModelBox(gun167, 21, 26, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		gun183 = new ModelRenderer(this);
		gun183.setRotationPoint(-2.5F, -0.4F, 1.2F);
		hammer.addChild(gun183);
		setRotationAngle(gun183, -1.45F, 0.0F, 0.0F);
		gun183.cubeList.add(new ModelBox(gun183, 42, 76, 0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

		grip = new ModelRenderer(this);
		grip.setRotationPoint(0.0F, 0.0F, 0.0F);
		gun.addChild(grip);
		

		gun13 = new ModelRenderer(this);
		gun13.setRotationPoint(-4.0F, -29.0F, -6.0F);
		grip.addChild(gun13);
		setRotationAngle(gun13, 0.2231F, 0.0F, 0.0F);
		gun13.cubeList.add(new ModelBox(gun13, 21, 24, 0.902F, 0.0F, 0.0F, 1, 10, 6, 0.0F, false));
		gun13.cubeList.add(new ModelBox(gun13, 25, 24, 3.202F, 0.0F, 0.0F, 1, 10, 6, 0.0F, false));

		gun15_r1 = new ModelRenderer(this);
		gun15_r1.setRotationPoint(4.0F, 29.0F, 6.0F);
		gun13.addChild(gun15_r1);
		setRotationAngle(gun15_r1, -0.0873F, 0.0F, 0.0F);
		

		gun145 = new ModelRenderer(this);
		gun145.setRotationPoint(-4.0F, -31.1F, -3.4F);
		grip.addChild(gun145);
		setRotationAngle(gun145, -0.1115F, 0.0F, 0.0F);
		gun145.cubeList.add(new ModelBox(gun145, 14, 42, 0.9F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));
		gun145.cubeList.add(new ModelBox(gun145, 14, 42, 3.2F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));

		gun143 = new ModelRenderer(this);
		gun143.setRotationPoint(-4.0F, -30.0F, -6.2F);
		grip.addChild(gun143);
		setRotationAngle(gun143, 0.3718F, 0.0F, 0.0F);
		gun143.cubeList.add(new ModelBox(gun143, 88, 27, 0.901F, 0.0F, 0.0F, 1, 2, 3, 0.0F, false));
		gun143.cubeList.add(new ModelBox(gun143, 88, 27, 3.201F, 0.0F, 0.0F, 1, 2, 3, 0.0F, false));

		gun144 = new ModelRenderer(this);
		gun144.setRotationPoint(-4.0F, -30.0F, -6.2F);
		grip.addChild(gun144);
		setRotationAngle(gun144, 0.2231F, 0.0F, 0.0F);
		gun144.cubeList.add(new ModelBox(gun144, 45, 65, 0.9F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));
		gun144.cubeList.add(new ModelBox(gun144, 45, 65, 3.2F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun135 = new ModelRenderer(this);
		gun135.setRotationPoint(-4.0F, -30.5F, -3.2F);
		grip.addChild(gun135);
		gun135.cubeList.add(new ModelBox(gun135, 67, 26, 0.9015F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));
		gun135.cubeList.add(new ModelBox(gun135, 67, 26, 3.2015F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		gun87 = new ModelRenderer(this);
		gun87.setRotationPoint(-4.0F, -30.5F, 0.8F);
		grip.addChild(gun87);
		setRotationAngle(gun87, -1.3013F, 0.0F, 0.0F);
		gun87.cubeList.add(new ModelBox(gun87, 88, 0, 0.9F, 0.0F, 0.0F, 1, 2, 6, 0.0F, false));

		gun127 = new ModelRenderer(this);
		gun127.setRotationPoint(-4.0F, -23.7F, 2.5F);
		grip.addChild(gun127);
		setRotationAngle(gun127, -3.0486F, 0.0F, 0.0F);
		gun127.cubeList.add(new ModelBox(gun127, 0, 73, 0.899F, 0.0F, 0.001F, 1, 1, 2, 0.0F, false));

		gun91 = new ModelRenderer(this);
		gun91.setRotationPoint(-4.0F, -17.6F, 3.2F);
		grip.addChild(gun91);
		setRotationAngle(gun91, -3.0486F, 0.0F, 0.0F);
		gun91.cubeList.add(new ModelBox(gun91, 63, 64, 0.901F, 3.0F, 0.0F, 1, 4, 2, 0.0F, false));

		gun178 = new ModelRenderer(this);
		gun178.setRotationPoint(-3.5F, -17.6F, 3.2F);
		grip.addChild(gun178);
		setRotationAngle(gun178, -3.0486F, 0.0F, 0.0F);
		

		gun174 = new ModelRenderer(this);
		gun174.setRotationPoint(-3.5F, -30.5F, 0.8F);
		grip.addChild(gun174);
		setRotationAngle(gun174, -1.3013F, 0.0F, 0.0F);
		gun174.cubeList.add(new ModelBox(gun174, 25, 86, 0.5F, -0.001F, 0.0F, 1, 2, 6, 0.0F, false));

		gun89 = new ModelRenderer(this);
		gun89.setRotationPoint(-4.0F, -18.5F, -3.3F);
		grip.addChild(gun89);
		gun89.cubeList.add(new ModelBox(gun89, 0, 65, 3.2F, -2.7F, -0.5F, 1, 2, 6, 0.0F, false));
		gun89.cubeList.add(new ModelBox(gun89, 8, 65, 0.9F, -2.7F, -0.5F, 1, 2, 6, 0.0F, false));

		gun93 = new ModelRenderer(this);
		gun93.setRotationPoint(-4.0F, -17.6F, 2.2F);
		grip.addChild(gun93);
		gun93.cubeList.add(new ModelBox(gun93, 42, 81, 0.899F, -3.0F, -0.25F, 1, 1, 1, 0.0F, false));
		gun93.cubeList.add(new ModelBox(gun93, 42, 81, 0.899F, -2.6F, -0.25F, 1, 1, 1, 0.0F, false));

		gun172 = new ModelRenderer(this);
		gun172.setRotationPoint(0.0F, -30.5F, 0.8F);
		grip.addChild(gun172);
		setRotationAngle(gun172, -1.3013F, 0.0F, 0.0F);
		gun172.cubeList.add(new ModelBox(gun172, 48, 86, -0.8F, 0.0F, 0.0F, 1, 2, 6, 0.0F, false));

		gun175 = new ModelRenderer(this);
		gun175.setRotationPoint(-0.5F, -30.5F, 0.8F);
		grip.addChild(gun175);
		setRotationAngle(gun175, -1.3013F, 0.0F, 0.0F);
		gun175.cubeList.add(new ModelBox(gun175, 72, 0, -0.8F, -0.001F, 0.0F, 1, 2, 6, 0.0F, false));

		gun173 = new ModelRenderer(this);
		gun173.setRotationPoint(0.0F, -23.7F, 2.5F);
		grip.addChild(gun173);
		setRotationAngle(gun173, -3.0486F, 0.0F, 0.0F);
		gun173.cubeList.add(new ModelBox(gun173, 54, 72, -0.799F, 0.0F, 0.001F, 1, 1, 2, 0.0F, false));

		gun171 = new ModelRenderer(this);
		gun171.setRotationPoint(0.0F, -17.6F, 3.2F);
		grip.addChild(gun171);
		setRotationAngle(gun171, -3.0486F, 0.0F, 0.0F);
		gun171.cubeList.add(new ModelBox(gun171, 63, 53, -0.801F, 3.0F, 0.0F, 1, 4, 2, 0.0F, false));

		gun179 = new ModelRenderer(this);
		gun179.setRotationPoint(-0.5F, -17.6F, 3.2F);
		grip.addChild(gun179);
		setRotationAngle(gun179, -3.0486F, 0.0F, 0.0F);
		

		gun176 = new ModelRenderer(this);
		gun176.setRotationPoint(-3.5F, -23.7F, 2.5F);
		grip.addChild(gun176);
		setRotationAngle(gun176, -3.0486F, 0.0F, 0.0F);
		gun176.cubeList.add(new ModelBox(gun176, 72, 3, 0.5F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun177 = new ModelRenderer(this);
		gun177.setRotationPoint(-0.5F, -23.7F, 2.5F);
		grip.addChild(gun177);
		setRotationAngle(gun177, -3.0486F, 0.0F, 0.0F);
		gun177.cubeList.add(new ModelBox(gun177, 72, 0, -0.8F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun170 = new ModelRenderer(this);
		gun170.setRotationPoint(0.0F, -17.6F, 2.2F);
		grip.addChild(gun170);
		gun170.cubeList.add(new ModelBox(gun170, 38, 81, -0.799F, -3.0F, -0.25F, 1, 1, 1, 0.0F, false));
		gun170.cubeList.add(new ModelBox(gun170, 38, 81, -0.799F, -2.6F, -0.25F, 1, 1, 1, 0.0F, false));
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