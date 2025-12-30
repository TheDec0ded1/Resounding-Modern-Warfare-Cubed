package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Glock26TTBody extends ModelBase {
	private final ModelRenderer G26razorbackbody;
	private final ModelRenderer gun111_r7;
	private final ModelRenderer gun110_r6;
	private final ModelRenderer gun114_r1;
	private final ModelRenderer gun113_r2;
	private final ModelRenderer gun112_r2;
	private final ModelRenderer gun111_r8;
	private final ModelRenderer gun112_r3;
	private final ModelRenderer gun111_r9;
	private final ModelRenderer gun112_r4;
	private final ModelRenderer gun111_r10;
	private final ModelRenderer gun112_r5;
	private final ModelRenderer gun111_r11;
	private final ModelRenderer gun112_r6;
	private final ModelRenderer gun112_r7;
	private final ModelRenderer gun40_r1;
	private final ModelRenderer gun39_r2;
	private final ModelRenderer gun38_r2;
	private final ModelRenderer gun94_r1;
	private final ModelRenderer gun93_r2;
	private final ModelRenderer gun93_r3;
	private final ModelRenderer gun142_r1;
	private final ModelRenderer gun141_r2;
	private final ModelRenderer gun158_r1;
	private final ModelRenderer gun11_r3;
	private final ModelRenderer gun13_r5;
	private final ModelRenderer gun14_r2;
	private final ModelRenderer gun14_r3;
	private final ModelRenderer gun15_r1;
	private final ModelRenderer gun14_r4;
	private final ModelRenderer gun12_r4;
	private final ModelRenderer gun11_r4;
	private final ModelRenderer gun10_r4;
	private final ModelRenderer gun12_r5;
	private final ModelRenderer gun13_r6;
	private final ModelRenderer gun13_r7;
	private final ModelRenderer gun14_r5;
	private final ModelRenderer gun11_r5;
	private final ModelRenderer gun10_r5;
	private final ModelRenderer gun9_r3;
	private final ModelRenderer gun8_r2;
	private final ModelRenderer gun7_r2;
	private final ModelRenderer gun146_r1;
	private final ModelRenderer gun146_r2;
	private final ModelRenderer gun145_r3;

	public Glock26TTBody() {
		textureWidth = 192;
		textureHeight = 192;

		G26razorbackbody = new ModelRenderer(this);
		G26razorbackbody.setRotationPoint(0.0F, 24.0F, 0.0F);
		G26razorbackbody.cubeList.add(new ModelBox(G26razorbackbody, 40, 144, -2.999F, -31.0F, -6.8F, 4, 1, 4, 0.0F, false));
		G26razorbackbody.cubeList.add(new ModelBox(G26razorbackbody, 41, 67, -2.5F, -21.95F, -6.7F, 3, 1, 2, 0.0F, false));
		G26razorbackbody.cubeList.add(new ModelBox(G26razorbackbody, 104, 15, -3.0F, -23.95F, -5.6F, 4, 3, 6, -0.002F, false));
		G26razorbackbody.cubeList.add(new ModelBox(G26razorbackbody, 161, 49, -2.999F, -24.45F, 0.0F, 4, 2, 1, 0.0F, false));
		G26razorbackbody.cubeList.add(new ModelBox(G26razorbackbody, 104, 153, -2.5F, -24.45F, 0.625F, 3, 2, 1, 0.0F, false));
		G26razorbackbody.cubeList.add(new ModelBox(G26razorbackbody, 91, 153, -3.0F, -32.0F, -8.5F, 4, 2, 2, 0.0F, false));
		G26razorbackbody.cubeList.add(new ModelBox(G26razorbackbody, 142, 87, -3.0F, -34.0F, 0.25F, 4, 1, 2, 0.0F, false));
		G26razorbackbody.cubeList.add(new ModelBox(G26razorbackbody, 161, 167, -2.5F, -35.7F, 0.8F, 3, 2, 1, 0.0F, false));
		G26razorbackbody.cubeList.add(new ModelBox(G26razorbackbody, 91, 158, -0.1F, -32.0F, -6.5F, 1, 1, 4, 0.0F, false));
		G26razorbackbody.cubeList.add(new ModelBox(G26razorbackbody, 158, 131, -2.9F, -32.0F, -6.5F, 1, 1, 4, 0.0F, false));
		G26razorbackbody.cubeList.add(new ModelBox(G26razorbackbody, 61, 134, -2.499F, -27.5F, -16.5F, 3, 1, 7, 0.0F, false));
		G26razorbackbody.cubeList.add(new ModelBox(G26razorbackbody, 123, 41, -3.0F, -34.7F, -23.4F, 1, 1, 10, 0.0F, false));
		G26razorbackbody.cubeList.add(new ModelBox(G26razorbackbody, 0, 125, 0.0F, -34.7F, -23.4F, 1, 1, 10, 0.0F, false));
		G26razorbackbody.cubeList.add(new ModelBox(G26razorbackbody, 162, 99, -2.9F, -34.0F, -23.4F, 1, 1, 4, 0.0F, false));
		G26razorbackbody.cubeList.add(new ModelBox(G26razorbackbody, 24, 162, -0.1F, -34.0F, -23.4F, 1, 1, 4, 0.0F, false));
		G26razorbackbody.cubeList.add(new ModelBox(G26razorbackbody, 103, 134, -2.999F, -33.8F, -19.4F, 4, 2, 6, 0.0F, false));
		G26razorbackbody.cubeList.add(new ModelBox(G26razorbackbody, 80, 91, -2.999F, -34.0F, -10.5F, 4, 1, 11, 0.0F, false));
		G26razorbackbody.cubeList.add(new ModelBox(G26razorbackbody, 29, 105, -3.0F, -33.0F, -10.5F, 4, 1, 10, 0.0F, false));
		G26razorbackbody.cubeList.add(new ModelBox(G26razorbackbody, 70, 92, -0.299F, -34.0F, -13.4F, 1, 3, 3, 0.0F, false));
		G26razorbackbody.cubeList.add(new ModelBox(G26razorbackbody, 29, 96, -2.699F, -34.0F, -13.4F, 1, 3, 3, 0.0F, false));
		G26razorbackbody.cubeList.add(new ModelBox(G26razorbackbody, 124, 163, -2.499F, -31.6F, -16.1F, 3, 4, 1, 0.0F, false));
		G26razorbackbody.cubeList.add(new ModelBox(G26razorbackbody, 158, 137, -2.9F, -33.0F, -23.4F, 1, 1, 4, 0.0F, false));
		G26razorbackbody.cubeList.add(new ModelBox(G26razorbackbody, 0, 159, -0.1F, -33.0F, -23.4F, 1, 1, 4, 0.0F, false));
		G26razorbackbody.cubeList.add(new ModelBox(G26razorbackbody, 146, 47, -2.5F, -32.2F, -23.4F, 3, 1, 4, 0.0F, false));

		gun111_r7 = new ModelRenderer(this);
		gun111_r7.setRotationPoint(1.0F, -33.7F, -28.4F);
		G26razorbackbody.addChild(gun111_r7);
		setRotationAngle(gun111_r7, 0.0F, 0.0F, 0.9774F);
		

		gun110_r6 = new ModelRenderer(this);
		gun110_r6.setRotationPoint(-3.0F, -33.7F, -28.4F);
		G26razorbackbody.addChild(gun110_r6);
		setRotationAngle(gun110_r6, 0.0F, 0.0F, -0.9774F);
		

		gun114_r1 = new ModelRenderer(this);
		gun114_r1.setRotationPoint(-1.3F, -32.2F, -27.4F);
		G26razorbackbody.addChild(gun114_r1);
		setRotationAngle(gun114_r1, 0.0F, 0.0F, -0.7854F);
		

		gun113_r2 = new ModelRenderer(this);
		gun113_r2.setRotationPoint(0.7F, -32.2F, -27.4F);
		G26razorbackbody.addChild(gun113_r2);
		setRotationAngle(gun113_r2, 0.0F, 0.0F, -0.7854F);
		

		gun112_r2 = new ModelRenderer(this);
		gun112_r2.setRotationPoint(0.8F, -33.0F, -28.4F);
		G26razorbackbody.addChild(gun112_r2);
		setRotationAngle(gun112_r2, 0.0F, 0.0F, -0.7854F);
		gun112_r2.cubeList.add(new ModelBox(gun112_r2, 159, 53, -1.6364F, -0.2222F, 5.0F, 1, 1, 4, 0.0F, false));

		gun111_r8 = new ModelRenderer(this);
		gun111_r8.setRotationPoint(-2.8F, -33.0F, -28.4F);
		G26razorbackbody.addChild(gun111_r8);
		setRotationAngle(gun111_r8, 0.0F, 0.0F, -0.7854F);
		gun111_r8.cubeList.add(new ModelBox(gun111_r8, 65, 159, -0.7778F, 0.6364F, 5.0F, 1, 1, 4, 0.0F, false));

		gun112_r3 = new ModelRenderer(this);
		gun112_r3.setRotationPoint(0.0F, -31.53F, -27.8F);
		G26razorbackbody.addChild(gun112_r3);
		setRotationAngle(gun112_r3, 0.6632F, 0.0F, 0.0F);
		

		gun111_r9 = new ModelRenderer(this);
		gun111_r9.setRotationPoint(0.0F, -31.3F, -26.8F);
		G26razorbackbody.addChild(gun111_r9);
		setRotationAngle(gun111_r9, 1.3439F, 0.0F, 0.0F);
		

		gun112_r4 = new ModelRenderer(this);
		gun112_r4.setRotationPoint(1.501F, -31.2F, -19.5F);
		G26razorbackbody.addChild(gun112_r4);
		setRotationAngle(gun112_r4, 1.5184F, 0.0F, 0.0F);
		gun112_r4.cubeList.add(new ModelBox(gun112_r4, 41, 54, -4.001F, 0.0F, 0.0F, 3, 11, 1, 0.0F, false));

		gun111_r10 = new ModelRenderer(this);
		gun111_r10.setRotationPoint(1.001F, -31.8F, -19.4F);
		G26razorbackbody.addChild(gun111_r10);
		setRotationAngle(gun111_r10, 1.501F, 0.0F, 0.0F);
		gun111_r10.cubeList.add(new ModelBox(gun111_r10, 142, 152, -4.001F, 0.0F, 0.0F, 4, 6, 1, -0.002F, false));

		gun112_r5 = new ModelRenderer(this);
		gun112_r5.setRotationPoint(-2.999F, -31.8F, -19.4F);
		G26razorbackbody.addChild(gun112_r5);
		setRotationAngle(gun112_r5, 0.0F, -0.7854F, 0.0F);
		gun112_r5.cubeList.add(new ModelBox(gun112_r5, 166, 180, 0.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F, false));

		gun111_r11 = new ModelRenderer(this);
		gun111_r11.setRotationPoint(1.001F, -31.8F, -19.4F);
		G26razorbackbody.addChild(gun111_r11);
		setRotationAngle(gun111_r11, 0.0F, -0.7854F, 0.0F);
		gun111_r11.cubeList.add(new ModelBox(gun111_r11, 171, 180, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun112_r6 = new ModelRenderer(this);
		gun112_r6.setRotationPoint(0.501F, -29.8F, -15.6F);
		G26razorbackbody.addChild(gun112_r6);
		setRotationAngle(gun112_r6, 0.8727F, 0.0F, 0.0F);
		gun112_r6.cubeList.add(new ModelBox(gun112_r6, 162, 110, -3.002F, -2.0F, 0.0F, 3, 2, 2, 0.0F, false));

		gun112_r7 = new ModelRenderer(this);
		gun112_r7.setRotationPoint(1.101F, -32.85F, -7.5F);
		G26razorbackbody.addChild(gun112_r7);
		setRotationAngle(gun112_r7, 0.0F, 0.0F, 0.192F);
		gun112_r7.cubeList.add(new ModelBox(gun112_r7, 141, 171, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun40_r1 = new ModelRenderer(this);
		gun40_r1.setRotationPoint(-3.0F, -30.9F, -10.7F);
		G26razorbackbody.addChild(gun40_r1);
		setRotationAngle(gun40_r1, -0.1222F, 0.0F, 0.0F);
		gun40_r1.cubeList.add(new ModelBox(gun40_r1, 148, 20, 0.0F, -2.0F, 0.0F, 4, 2, 3, -0.001F, false));

		gun39_r2 = new ModelRenderer(this);
		gun39_r2.setRotationPoint(-3.0F, -30.9F, -10.7F);
		G26razorbackbody.addChild(gun39_r2);
		setRotationAngle(gun39_r2, 1.8218F, 0.0F, 0.0F);
		gun39_r2.cubeList.add(new ModelBox(gun39_r2, 152, 5, 0.0F, 0.0F, 0.0F, 4, 1, 3, -0.002F, false));

		gun38_r2 = new ModelRenderer(this);
		gun38_r2.setRotationPoint(-3.0F, -30.9F, -13.5F);
		G26razorbackbody.addChild(gun38_r2);
		setRotationAngle(gun38_r2, 1.8218F, 0.0F, 0.0F);
		gun38_r2.cubeList.add(new ModelBox(gun38_r2, 148, 32, 0.0F, 0.0F, 0.0F, 4, 1, 3, 0.0F, false));

		gun94_r1 = new ModelRenderer(this);
		gun94_r1.setRotationPoint(0.5F, -27.5F, -13.6F);
		G26razorbackbody.addChild(gun94_r1);
		setRotationAngle(gun94_r1, -0.5934F, 0.0F, 0.0F);
		gun94_r1.cubeList.add(new ModelBox(gun94_r1, 161, 83, -3.0F, 0.0F, -2.0F, 3, 1, 2, 0.0F, false));

		gun93_r2 = new ModelRenderer(this);
		gun93_r2.setRotationPoint(0.5F, -27.5F, -16.5F);
		G26razorbackbody.addChild(gun93_r2);
		setRotationAngle(gun93_r2, -0.4538F, 0.0F, 0.0F);
		gun93_r2.cubeList.add(new ModelBox(gun93_r2, 36, 170, -3.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun93_r3 = new ModelRenderer(this);
		gun93_r3.setRotationPoint(0.501F, -26.5F, -9.5F);
		G26razorbackbody.addChild(gun93_r3);
		setRotationAngle(gun93_r3, 2.0246F, 0.0F, 0.0F);
		gun93_r3.cubeList.add(new ModelBox(gun93_r3, 9, 168, -3.0F, 0.0F, 0.0F, 3, 2, 1, -0.002F, false));

		gun142_r1 = new ModelRenderer(this);
		gun142_r1.setRotationPoint(-2.0F, -29.5F, -10.0F);
		G26razorbackbody.addChild(gun142_r1);
		setRotationAngle(gun142_r1, 3.0356F, 0.0F, 0.0F);
		gun142_r1.cubeList.add(new ModelBox(gun142_r1, 172, 11, 0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F, false));

		gun141_r2 = new ModelRenderer(this);
		gun141_r2.setRotationPoint(-2.0F, -29.5F, -10.0F);
		G26razorbackbody.addChild(gun141_r2);
		setRotationAngle(gun141_r2, -2.3051F, 0.0F, 0.0F);
		gun141_r2.cubeList.add(new ModelBox(gun141_r2, 18, 168, 0.0F, 0.0F, 0.0F, 2, 1, 2, -0.001F, false));

		gun158_r1 = new ModelRenderer(this);
		gun158_r1.setRotationPoint(-0.2F, -31.3F, -12.3F);
		G26razorbackbody.addChild(gun158_r1);
		setRotationAngle(gun158_r1, 1.8218F, 0.0F, 0.0F);
		gun158_r1.cubeList.add(new ModelBox(gun158_r1, 18, 172, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));
		gun158_r1.cubeList.add(new ModelBox(gun158_r1, 172, 20, -2.6F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun11_r3 = new ModelRenderer(this);
		gun11_r3.setRotationPoint(1.0F, -30.0F, -8.5F);
		G26razorbackbody.addChild(gun11_r3);
		setRotationAngle(gun11_r3, -0.5585F, 0.0F, 0.0F);
		gun11_r3.cubeList.add(new ModelBox(gun11_r3, 40, 131, -3.999F, -1.0F, 0.0F, 4, 1, 1, 0.0F, false));

		gun13_r5 = new ModelRenderer(this);
		gun13_r5.setRotationPoint(1.0F, -31.7F, -1.4F);
		G26razorbackbody.addChild(gun13_r5);
		setRotationAngle(gun13_r5, -1.0647F, 0.0F, 0.0F);
		gun13_r5.cubeList.add(new ModelBox(gun13_r5, 102, 162, -4.0F, -3.0F, -1.0F, 4, 3, 1, -0.003F, false));

		gun14_r2 = new ModelRenderer(this);
		gun14_r2.setRotationPoint(1.0F, -33.0F, 2.25F);
		G26razorbackbody.addChild(gun14_r2);
		setRotationAngle(gun14_r2, 0.1745F, 0.0F, 0.0F);
		gun14_r2.cubeList.add(new ModelBox(gun14_r2, 144, 73, -4.001F, -1.0F, -2.0F, 4, 1, 2, 0.0F, false));

		gun14_r3 = new ModelRenderer(this);
		gun14_r3.setRotationPoint(1.0F, -34.0F, 2.25F);
		G26razorbackbody.addChild(gun14_r3);
		setRotationAngle(gun14_r3, 1.0123F, 0.0F, 0.0F);
		gun14_r3.cubeList.add(new ModelBox(gun14_r3, 133, 12, -4.0F, -1.0F, -1.0F, 4, 1, 1, -0.001F, false));

		gun15_r1 = new ModelRenderer(this);
		gun15_r1.setRotationPoint(0.5F, -31.0F, -0.45F);
		G26razorbackbody.addChild(gun15_r1);
		setRotationAngle(gun15_r1, 0.1396F, 0.0F, 0.0F);
		gun15_r1.cubeList.add(new ModelBox(gun15_r1, 153, 124, -2.999F, 0.0F, -2.0F, 3, 4, 2, -0.001F, false));

		gun14_r4 = new ModelRenderer(this);
		gun14_r4.setRotationPoint(0.5F, -33.0F, 2.25F);
		G26razorbackbody.addChild(gun14_r4);
		setRotationAngle(gun14_r4, 0.5236F, 0.0F, 0.0F);
		gun14_r4.cubeList.add(new ModelBox(gun14_r4, 153, 152, -3.0F, -1.0F, -3.0F, 3, 1, 3, 0.0F, false));

		gun12_r4 = new ModelRenderer(this);
		gun12_r4.setRotationPoint(0.5F, -30.0F, -0.8F);
		G26razorbackbody.addChild(gun12_r4);
		setRotationAngle(gun12_r4, -0.576F, 0.0F, 0.0F);
		gun12_r4.cubeList.add(new ModelBox(gun12_r4, 76, 159, -3.001F, -3.0F, -2.0F, 3, 3, 2, 0.0F, false));

		gun11_r4 = new ModelRenderer(this);
		gun11_r4.setRotationPoint(1.0F, -30.0F, -1.8F);
		G26razorbackbody.addChild(gun11_r4);
		setRotationAngle(gun11_r4, -0.576F, 0.0F, 0.0F);
		gun11_r4.cubeList.add(new ModelBox(gun11_r4, 0, 153, -4.0F, -3.0F, -2.0F, 4, 3, 2, -0.002F, false));

		gun10_r4 = new ModelRenderer(this);
		gun10_r4.setRotationPoint(-2.5F, -17.5F, -4.8F);
		G26razorbackbody.addChild(gun10_r4);
		setRotationAngle(gun10_r4, 0.8029F, 0.0F, 0.0F);
		gun10_r4.cubeList.add(new ModelBox(gun10_r4, 161, 163, 0.001F, -4.4579F, 1.8814F, 3, 1, 2, 0.0F, false));

		gun12_r5 = new ModelRenderer(this);
		gun12_r5.setRotationPoint(1.001F, -20.0F, 2.9F);
		G26razorbackbody.addChild(gun12_r5);
		setRotationAngle(gun12_r5, -1.0996F, 0.0F, 0.0F);
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 144, 61, -4.0F, -0.3271F, -8.8276F, 4, 1, 4, 0.0F, false));

		gun13_r6 = new ModelRenderer(this);
		gun13_r6.setRotationPoint(0.501F, -20.0F, 3.9F);
		G26razorbackbody.addChild(gun13_r6);
		setRotationAngle(gun13_r6, 0.4712F, 0.0F, 0.0F);
		gun13_r6.cubeList.add(new ModelBox(gun13_r6, 35, 164, -3.0F, -9.0F, -1.0F, 3, 4, 1, 0.0F, false));

		gun13_r7 = new ModelRenderer(this);
		gun13_r7.setRotationPoint(0.501F, -18.0F, 3.9F);
		G26razorbackbody.addChild(gun13_r7);
		setRotationAngle(gun13_r7, -0.7854F, 0.0F, 0.0F);
		gun13_r7.cubeList.add(new ModelBox(gun13_r7, 113, 162, -3.0F, -1.5379F, -6.7553F, 3, 2, 2, 0.0F, false));

		gun14_r5 = new ModelRenderer(this);
		gun14_r5.setRotationPoint(-1.699F, -17.8F, 2.5F);
		G26razorbackbody.addChild(gun14_r5);
		setRotationAngle(gun14_r5, -0.4014F, 0.0F, 0.0F);
		gun14_r5.cubeList.add(new ModelBox(gun14_r5, 128, 115, -1.001F, -3.3539F, -4.4876F, 1, 1, 1, 0.3F, false));
		gun14_r5.cubeList.add(new ModelBox(gun14_r5, 153, 131, 1.399F, -3.3539F, -4.4876F, 1, 1, 1, 0.3F, false));

		gun11_r5 = new ModelRenderer(this);
		gun11_r5.setRotationPoint(-5.1F, -31.45F, -8.8F);
		G26razorbackbody.addChild(gun11_r5);
		setRotationAngle(gun11_r5, 0.3543F, 0.0F, 0.0F);
		gun11_r5.cubeList.add(new ModelBox(gun11_r5, 175, 96, 2.0F, 3.0F, 1.0F, 1, 1, 1, 0.0F, false));

		gun10_r5 = new ModelRenderer(this);
		gun10_r5.setRotationPoint(-1.9F, -31.35F, -8.6F);
		G26razorbackbody.addChild(gun10_r5);
		setRotationAngle(gun10_r5, 0.3543F, 0.0F, 0.0F);
		gun10_r5.cubeList.add(new ModelBox(gun10_r5, 45, 170, 2.0F, 3.0F, 0.0F, 1, 2, 2, 0.0F, false));

		gun9_r3 = new ModelRenderer(this);
		gun9_r3.setRotationPoint(-2.3F, -31.2F, -9.0F);
		G26razorbackbody.addChild(gun9_r3);
		setRotationAngle(gun9_r3, 0.3543F, 0.0F, 0.0F);
		gun9_r3.cubeList.add(new ModelBox(gun9_r3, 136, 174, 2.0F, 3.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun8_r2 = new ModelRenderer(this);
		gun8_r2.setRotationPoint(-2.5F, -30.7F, -9.2F);
		G26razorbackbody.addChild(gun8_r2);
		setRotationAngle(gun8_r2, 0.3543F, 0.0F, 0.0F);
		gun8_r2.cubeList.add(new ModelBox(gun8_r2, 96, 118, 0.0F, 0.0F, 0.0F, 3, 9, 6, 0.0F, false));

		gun7_r2 = new ModelRenderer(this);
		gun7_r2.setRotationPoint(-3.0F, -30.0F, -8.0F);
		G26razorbackbody.addChild(gun7_r2);
		setRotationAngle(gun7_r2, 0.3718F, 0.0F, 0.0F);
		gun7_r2.cubeList.add(new ModelBox(gun7_r2, 54, 118, 0.0F, 0.0F, 0.0F, 4, 9, 6, 0.0F, false));

		gun146_r1 = new ModelRenderer(this);
		gun146_r1.setRotationPoint(-2.6F, -30.0F, -5.8F);
		G26razorbackbody.addChild(gun146_r1);
		setRotationAngle(gun146_r1, 0.0F, 0.0F, 0.7854F);
		gun146_r1.cubeList.add(new ModelBox(gun146_r1, 159, 87, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		gun146_r2 = new ModelRenderer(this);
		gun146_r2.setRotationPoint(0.5F, -33.3F, -7.95F);
		G26razorbackbody.addChild(gun146_r2);
		setRotationAngle(gun146_r2, 0.0F, 0.0F, 0.7854F);
		gun146_r2.cubeList.add(new ModelBox(gun146_r2, 70, 99, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		gun145_r3 = new ModelRenderer(this);
		gun145_r3.setRotationPoint(0.6F, -30.0F, -5.8F);
		G26razorbackbody.addChild(gun145_r3);
		setRotationAngle(gun145_r3, 0.0F, 0.0F, 0.7854F);
		gun145_r3.cubeList.add(new ModelBox(gun145_r3, 159, 93, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		G26razorbackbody.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}