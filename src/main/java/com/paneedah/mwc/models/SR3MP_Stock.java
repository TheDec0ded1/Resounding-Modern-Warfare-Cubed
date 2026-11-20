package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class SR3MP_Stock extends ModelBase {
	private final ModelRenderer sr3mp_stock;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r61_r1;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r62_r1;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r63_r1;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r64_r1;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r65_r1;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r66_r1;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r67_r1;
	private final ModelRenderer cube_r117;
	private final ModelRenderer cube_r68_r1;
	private final ModelRenderer cube_r118;
	private final ModelRenderer cube_r69_r1;
	private final ModelRenderer cube_r119;
	private final ModelRenderer cube_r70_r1;
	private final ModelRenderer cube_r120;
	private final ModelRenderer cube_r71_r1;
	private final ModelRenderer cube_r121;
	private final ModelRenderer cube_r72_r1;
	private final ModelRenderer cube_r122;
	private final ModelRenderer cube_r73_r1;
	private final ModelRenderer bone46;
	private final ModelRenderer cube_r123;
	private final ModelRenderer cube_r74_r1;
	private final ModelRenderer cube_r124;
	private final ModelRenderer cube_r75_r1;
	private final ModelRenderer cube_r125;
	private final ModelRenderer cube_r76_r1;
	private final ModelRenderer bone47;
	private final ModelRenderer cube_r127;
	private final ModelRenderer cube_r77_r1;
	private final ModelRenderer cube_r128;
	private final ModelRenderer cube_r78_r1;
	private final ModelRenderer bone48;
	private final ModelRenderer cube_r130;
	private final ModelRenderer cube_r131;

	public SR3MP_Stock() {
		textureWidth = 512;
		textureHeight = 512;

		sr3mp_stock = new ModelRenderer(this);
		sr3mp_stock.setRotationPoint(0.5F, -6.6F, 14.6F);
		sr3mp_stock.cubeList.add(new ModelBox(sr3mp_stock, 0, 132, -2.19F, -1.9F, -20.3F, 2, 1, 6, 0.0F, false));
		sr3mp_stock.cubeList.add(new ModelBox(sr3mp_stock, 129, 131, -2.19F, -1.4F, -20.3F, 2, 1, 6, -0.001F, false));
		sr3mp_stock.cubeList.add(new ModelBox(sr3mp_stock, 19, 130, -3.59F, -1.9F, -20.3F, 2, 1, 6, 0.0F, false));
		sr3mp_stock.cubeList.add(new ModelBox(sr3mp_stock, 105, 110, -3.59F, -1.4F, -20.3F, 2, 1, 6, -0.001F, false));
		sr3mp_stock.cubeList.add(new ModelBox(sr3mp_stock, 86, 12, -3.099F, -5.8127F, -15.3389F, 3, 5, 1, -0.2F, false));
		sr3mp_stock.cubeList.add(new ModelBox(sr3mp_stock, 129, 69, -3.699F, -5.8127F, -15.3389F, 1, 5, 1, -0.2F, false));
		sr3mp_stock.cubeList.add(new ModelBox(sr3mp_stock, 71, 82, -3.099F, -5.8127F, -14.7389F, 3, 6, 1, -0.2F, false));
		sr3mp_stock.cubeList.add(new ModelBox(sr3mp_stock, 73, 42, -3.699F, -5.8127F, -14.7389F, 1, 6, 1, -0.2F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.5F, -3.95F, 10.55F);
		sr3mp_stock.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.1887F, -0.8638F, 0.1442F);
		

		cube_r61_r1 = new ModelRenderer(this);
		cube_r61_r1.setRotationPoint(-1.1569F, 5.4292F, 2.1753F);
		cube_r2.addChild(cube_r61_r1);
		setRotationAngle(cube_r61_r1, -2.4449F, -1.326F, -0.8705F);
		cube_r61_r1.cubeList.add(new ModelBox(cube_r61_r1, 21, 18, -19.2612F, -13.0382F, -17.9487F, 1, 4, 1, -0.001F, false));
		cube_r61_r1.cubeList.add(new ModelBox(cube_r61_r1, 21, 0, -18.4912F, -13.0382F, -17.3077F, 1, 4, 1, -0.001F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, -0.85F, 11.55F);
		sr3mp_stock.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.1222F, 0.0F, 0.0F);
		

		cube_r62_r1 = new ModelRenderer(this);
		cube_r62_r1.setRotationPoint(-1.91F, 2.4742F, -0.8581F);
		cube_r3.addChild(cube_r62_r1);
		setRotationAngle(cube_r62_r1, -0.2444F, 0.0F, -3.1416F);
		cube_r62_r1.cubeList.add(new ModelBox(cube_r62_r1, 20, 132, 0.51F, -11.0819F, -24.1568F, 1, 2, 1, 0.0F, false));
		cube_r62_r1.cubeList.add(new ModelBox(cube_r62_r1, 16, 96, -0.79F, -10.2819F, -23.6568F, 2, 1, 3, 0.0F, false));
		cube_r62_r1.cubeList.add(new ModelBox(cube_r62_r1, 100, 177, -1.09F, -11.0819F, -24.1568F, 2, 2, 1, -0.002F, false));
		cube_r62_r1.cubeList.add(new ModelBox(cube_r62_r1, 141, 86, -1.09F, -13.0319F, -25.1568F, 2, 2, 5, -0.001F, false));
		cube_r62_r1.cubeList.add(new ModelBox(cube_r62_r1, 32, 0, 0.71F, -13.2319F, -24.6568F, 1, 4, 1, -0.201F, false));
		cube_r62_r1.cubeList.add(new ModelBox(cube_r62_r1, 100, 42, 0.71F, -13.2319F, -20.9568F, 1, 3, 1, -0.201F, false));
		cube_r62_r1.cubeList.add(new ModelBox(cube_r62_r1, 151, 82, 0.71F, -13.2319F, -24.1568F, 1, 1, 4, -0.202F, false));
		cube_r62_r1.cubeList.add(new ModelBox(cube_r62_r1, 9, 140, 0.51F, -11.0819F, -23.1568F, 1, 1, 2, 0.0F, false));
		cube_r62_r1.cubeList.add(new ModelBox(cube_r62_r1, 63, 140, 0.51F, -11.0819F, -21.1568F, 1, 2, 1, 0.0F, false));
		cube_r62_r1.cubeList.add(new ModelBox(cube_r62_r1, 114, 177, -1.09F, -11.0819F, -21.1568F, 2, 2, 1, -0.002F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-0.2F, -2.95F, 12.15F);
		sr3mp_stock.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.1228F, 0.1039F, -0.0128F);
		

		cube_r63_r1 = new ModelRenderer(this);
		cube_r63_r1.setRotationPoint(-1.5755F, 4.6316F, -1.37F);
		cube_r4.addChild(cube_r63_r1);
		setRotationAngle(cube_r63_r1, -0.2483F, 0.2062F, 3.1158F);
		cube_r63_r1.cubeList.add(new ModelBox(cube_r63_r1, 172, 172, 2.7913F, -12.2409F, -23.8492F, 1, 1, 3, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-3.0F, -1.8F, 42.449F);
		sr3mp_stock.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.0498F, 0.0162F, 0.3138F);
		

		cube_r64_r1 = new ModelRenderer(this);
		cube_r64_r1.setRotationPoint(2.5747F, 4.3937F, -31.8355F);
		cube_r5.addChild(cube_r64_r1);
		setRotationAngle(cube_r64_r1, -0.0996F, 0.0324F, 3.14F);
		cube_r64_r1.cubeList.add(new ModelBox(cube_r64_r1, 71, 108, -5.586F, -13.6624F, 1.8843F, 1, 3, 3, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-1.0F, -1.8F, 42.449F);
		sr3mp_stock.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.0498F, -0.0162F, -0.3138F);
		

		cube_r65_r1 = new ModelRenderer(this);
		cube_r65_r1.setRotationPoint(-2.4035F, 4.4493F, -31.8355F);
		cube_r6.addChild(cube_r65_r1);
		setRotationAngle(cube_r65_r1, -0.0996F, -0.0324F, -3.14F);
		cube_r65_r1.cubeList.add(new ModelBox(cube_r65_r1, 114, 0, 4.4148F, -13.7181F, 1.8843F, 1, 3, 3, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-3.92F, 8.05F, 41.93F);
		sr3mp_stock.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.0462F, -0.0246F, -0.4881F);
		

		cube_r66_r1 = new ModelRenderer(this);
		cube_r66_r1.setRotationPoint(4.0692F, -3.375F, -31.8328F);
		cube_r7.addChild(cube_r66_r1);
		setRotationAngle(cube_r66_r1, -0.0925F, -0.0491F, -3.1393F);
		cube_r66_r1.cubeList.add(new ModelBox(cube_r66_r1, 129, 0, 0.5051F, -5.2314F, 1.8819F, 1, 2, 3, 0.001F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-3.92F, 1.05F, 42.3F);
		sr3mp_stock.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.0524F, 0.0F, 0.0F);
		

		cube_r67_r1 = new ModelRenderer(this);
		cube_r67_r1.setRotationPoint(2.01F, 2.1215F, -31.8358F);
		cube_r8.addChild(cube_r67_r1);
		setRotationAngle(cube_r67_r1, -0.1048F, 0.0F, -3.1416F);
		cube_r67_r1.cubeList.add(new ModelBox(cube_r67_r1, 114, 97, 0.83F, -11.8662F, 1.8843F, 1, 7, 3, 0.001F, false));
		cube_r67_r1.cubeList.add(new ModelBox(cube_r67_r1, 114, 122, -2.01F, -11.8662F, 1.8843F, 1, 7, 3, 0.001F, false));

		cube_r117 = new ModelRenderer(this);
		cube_r117.setRotationPoint(-0.08F, 8.05F, 41.93F);
		sr3mp_stock.addChild(cube_r117);
		setRotationAngle(cube_r117, -0.0462F, 0.0246F, 0.4881F);
		

		cube_r68_r1 = new ModelRenderer(this);
		cube_r68_r1.setRotationPoint(-3.9103F, -3.4595F, -31.8327F);
		cube_r117.addChild(cube_r68_r1);
		setRotationAngle(cube_r68_r1, -0.0925F, 0.0491F, 3.1393F);
		cube_r68_r1.cubeList.add(new ModelBox(cube_r68_r1, 129, 11, -1.664F, -5.1469F, 1.8819F, 1, 2, 3, 0.001F, false));

		cube_r118 = new ModelRenderer(this);
		cube_r118.setRotationPoint(-1.0F, -1.8F, 42.449F);
		sr3mp_stock.addChild(cube_r118);
		setRotationAngle(cube_r118, -0.0524F, 0.0F, 0.0F);
		

		cube_r69_r1 = new ModelRenderer(this);
		cube_r69_r1.setRotationPoint(-0.91F, 4.9754F, -31.8354F);
		cube_r118.addChild(cube_r69_r1);
		setRotationAngle(cube_r69_r1, -0.1048F, 0.0F, -3.1416F);
		cube_r69_r1.cubeList.add(new ModelBox(cube_r69_r1, 54, 162, -1.09F, -14.72F, 1.8839F, 2, 1, 3, 0.001F, false));
		cube_r69_r1.cubeList.add(new ModelBox(cube_r69_r1, 153, 146, -1.09F, -13.72F, 3.8839F, 2, 10, 1, 0.001F, false));
		cube_r69_r1.cubeList.add(new ModelBox(cube_r69_r1, 65, 162, -1.09F, -4.1F, 1.8839F, 2, 1, 3, 0.001F, false));

		cube_r119 = new ModelRenderer(this);
		cube_r119.setRotationPoint(-1.0F, -3.8F, 15.549F);
		sr3mp_stock.addChild(cube_r119);
		setRotationAngle(cube_r119, -0.4189F, 0.0F, 0.0F);
		

		cube_r70_r1 = new ModelRenderer(this);
		cube_r70_r1.setRotationPoint(-0.91F, 6.9385F, -2.5505F);
		cube_r119.addChild(cube_r70_r1);
		setRotationAngle(cube_r70_r1, -0.8378F, 0.0F, -3.1416F);
		cube_r70_r1.cubeList.add(new ModelBox(cube_r70_r1, 27, 229, -1.09F, -5.0307F, -21.4711F, 2, 2, 21, -0.5F, false));

		cube_r120 = new ModelRenderer(this);
		cube_r120.setRotationPoint(-1.0F, -3.4F, 15.449F);
		sr3mp_stock.addChild(cube_r120);
		setRotationAngle(cube_r120, -0.0524F, 0.0F, 0.0F);
		

		cube_r71_r1 = new ModelRenderer(this);
		cube_r71_r1.setRotationPoint(-0.91F, 5.1591F, -4.7886F);
		cube_r120.addChild(cube_r71_r1);
		setRotationAngle(cube_r71_r1, -0.1048F, 0.0F, -3.1416F);
		cube_r71_r1.cubeList.add(new ModelBox(cube_r71_r1, 99, 200, -1.09F, -14.7501F, -21.5458F, 2, 2, 25, -0.5F, false));
		cube_r71_r1.cubeList.add(new ModelBox(cube_r71_r1, 68, 98, -1.091F, -12.2438F, -21.4558F, 2, 2, 4, -0.499F, false));
		cube_r71_r1.cubeList.add(new ModelBox(cube_r71_r1, 146, 71, -1.091F, -5.1452F, -0.1404F, 2, 2, 4, -0.499F, false));

		cube_r121 = new ModelRenderer(this);
		cube_r121.setRotationPoint(0.5F, -3.95F, 10.55F);
		sr3mp_stock.addChild(cube_r121);
		setRotationAngle(cube_r121, -0.1222F, 0.0F, 0.0F);
		

		cube_r72_r1 = new ModelRenderer(this);
		cube_r72_r1.setRotationPoint(-2.41F, 5.4292F, 0.5124F);
		cube_r121.addChild(cube_r72_r1);
		setRotationAngle(cube_r72_r1, -0.2444F, 0.0F, -3.1416F);
		cube_r72_r1.cubeList.add(new ModelBox(cube_r72_r1, 0, 132, 1.01F, -13.0368F, -25.5272F, 1, 4, 1, 0.0F, false));

		cube_r122 = new ModelRenderer(this);
		cube_r122.setRotationPoint(0.0F, -4.6F, 9.55F);
		sr3mp_stock.addChild(cube_r122);
		setRotationAngle(cube_r122, -0.1222F, 0.0F, 0.0F);
		

		cube_r73_r1 = new ModelRenderer(this);
		cube_r73_r1.setRotationPoint(-1.91F, 5.9525F, 1.5841F);
		cube_r122.addChild(cube_r73_r1);
		setRotationAngle(cube_r73_r1, -0.2444F, 0.0F, -3.1416F);
		cube_r73_r1.cubeList.add(new ModelBox(cube_r73_r1, 60, 18, 0.51F, -13.5601F, -26.599F, 1, 5, 2, 0.101F, false));
		cube_r73_r1.cubeList.add(new ModelBox(cube_r73_r1, 100, 12, -1.49F, -12.5601F, -26.599F, 2, 4, 2, 0.1F, false));
		cube_r73_r1.cubeList.add(new ModelBox(cube_r73_r1, 112, 42, -1.49F, -13.1601F, -26.599F, 2, 1, 2, 0.098F, false));
		cube_r73_r1.cubeList.add(new ModelBox(cube_r73_r1, 102, 87, -1.79F, -13.8601F, -26.899F, 3, 2, 1, -0.201F, false));

		bone46 = new ModelRenderer(this);
		bone46.setRotationPoint(-3.0F, -2.2F, 36.249F);
		sr3mp_stock.addChild(bone46);
		setRotationAngle(bone46, -0.2094F, 0.0F, 0.0F);
		

		cube_r123 = new ModelRenderer(this);
		cube_r123.setRotationPoint(2.92F, 2.85F, -0.149F);
		bone46.addChild(cube_r123);
		setRotationAngle(cube_r123, -0.0524F, 0.0F, 0.0F);
		

		cube_r74_r1 = new ModelRenderer(this);
		cube_r74_r1.setRotationPoint(-1.83F, 7.4122F, -24.0139F);
		cube_r123.addChild(cube_r74_r1);
		setRotationAngle(cube_r74_r1, -0.5236F, 0.0F, -3.1416F);
		cube_r74_r1.cubeList.add(new ModelBox(cube_r74_r1, 28, 80, 0.5265F, -10.6685F, -10.5585F, 1, 4, 3, 0.001F, false));
		cube_r74_r1.cubeList.add(new ModelBox(cube_r74_r1, 115, 162, 0.9265F, -9.5813F, -10.5671F, 1, 2, 3, -0.1F, false));

		cube_r124 = new ModelRenderer(this);
		cube_r124.setRotationPoint(2.0F, 0.0F, 0.0F);
		bone46.addChild(cube_r124);
		setRotationAngle(cube_r124, 0.0698F, 0.0F, 0.0F);
		

		cube_r75_r1 = new ModelRenderer(this);
		cube_r75_r1.setRotationPoint(-0.91F, 7.2624F, -25.0857F);
		cube_r124.addChild(cube_r75_r1);
		setRotationAngle(cube_r75_r1, -0.2792F, 0.0F, 3.1416F);
		cube_r75_r1.cubeList.add(new ModelBox(cube_r75_r1, 0, 51, -1.09F, -13.7754F, -9.0526F, 2, 1, 3, 0.001F, false));

		cube_r125 = new ModelRenderer(this);
		cube_r125.setRotationPoint(2.0F, 0.0F, 0.0F);
		bone46.addChild(cube_r125);
		setRotationAngle(cube_r125, 0.0026F, 0.0187F, -0.3137F);
		

		cube_r76_r1 = new ModelRenderer(this);
		cube_r76_r1.setRotationPoint(-3.182F, 8.2106F, -24.6034F);
		cube_r125.addChild(cube_r76_r1);
		setRotationAngle(cube_r76_r1, -0.3941F, -0.0899F, -3.1236F);
		cube_r76_r1.cubeList.add(new ModelBox(cube_r76_r1, 51, 167, 4.0973F, -12.2153F, -9.8661F, 1, 2, 3, 0.0F, false));

		bone47 = new ModelRenderer(this);
		bone47.setRotationPoint(2.0F, -0.1247F, 0.5869F);
		bone46.addChild(bone47);
		setRotationAngle(bone47, -0.0698F, 0.0F, 0.0F);
		

		cube_r127 = new ModelRenderer(this);
		cube_r127.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone47.addChild(cube_r127);
		setRotationAngle(cube_r127, -0.0524F, 0.0F, 0.0F);
		

		cube_r77_r1 = new ModelRenderer(this);
		cube_r77_r1.setRotationPoint(-0.91F, 12.1112F, -23.8063F);
		cube_r127.addChild(cube_r77_r1);
		setRotationAngle(cube_r77_r1, -0.6632F, 0.0F, 3.1416F);
		cube_r77_r1.cubeList.add(new ModelBox(cube_r77_r1, 8, 153, -1.3938F, -5.1583F, -10.9954F, 2, 1, 3, 0.001F, false));

		cube_r128 = new ModelRenderer(this);
		cube_r128.setRotationPoint(0.92F, 9.85F, -0.519F);
		bone47.addChild(cube_r128);
		setRotationAngle(cube_r128, -0.0462F, 0.0246F, 0.4881F);
		

		cube_r78_r1 = new ModelRenderer(this);
		cube_r78_r1.setRotationPoint(-0.5605F, 2.8418F, -23.8041F);
		cube_r128.addChild(cube_r78_r1);
		setRotationAngle(cube_r78_r1, -0.6037F, 0.2932F, 3.0497F);
		cube_r78_r1.cubeList.add(new ModelBox(cube_r78_r1, 97, 162, -2.429F, -5.9395F, -10.9973F, 1, 2, 3, 0.001F, false));

		bone48 = new ModelRenderer(this);
		bone48.setRotationPoint(-1.7847F, 14.3231F, -15.0577F);
		sr3mp_stock.addChild(bone48);
		setRotationAngle(bone48, 0.0F, 0.0F, -3.1416F);
		bone48.cubeList.add(new ModelBox(bone48, 16, 153, -0.9231F, 0.3154F, -3.8423F, 2, 1, 1, -0.199F, false));
		bone48.cubeList.add(new ModelBox(bone48, 181, 93, -0.9231F, 0.3154F, -2.5923F, 2, 1, 1, -0.199F, false));
		bone48.cubeList.add(new ModelBox(bone48, 55, 179, -0.9231F, 0.3154F, -1.3423F, 2, 1, 1, -0.199F, false));
		bone48.cubeList.add(new ModelBox(bone48, 178, 172, -0.9231F, 0.3154F, -0.0923F, 2, 1, 1, -0.199F, false));
		bone48.cubeList.add(new ModelBox(bone48, 178, 137, -0.9231F, 0.3154F, 1.1577F, 2, 1, 1, -0.199F, false));
		bone48.cubeList.add(new ModelBox(bone48, 114, 181, -0.9231F, 0.3154F, 1.4577F, 2, 1, 1, -0.199F, false));
		bone48.cubeList.add(new ModelBox(bone48, 105, 29, -0.8231F, 0.9154F, -5.1423F, 2, 1, 7, -0.001F, false));
		bone48.cubeList.add(new ModelBox(bone48, 181, 109, -0.8231F, 0.9154F, 1.2577F, 2, 1, 1, -0.002F, false));
		bone48.cubeList.add(new ModelBox(bone48, 129, 122, -1.0231F, 0.9154F, -5.1423F, 1, 1, 7, 0.0F, false));
		bone48.cubeList.add(new ModelBox(bone48, 196, 102, -1.0231F, 0.9154F, 1.2577F, 1, 1, 1, -0.003F, false));
		bone48.cubeList.add(new ModelBox(bone48, 178, 112, -0.9231F, 0.3154F, -5.1423F, 2, 1, 1, -0.199F, false));
		bone48.cubeList.add(new ModelBox(bone48, 178, 87, -0.9231F, 0.3154F, -5.3423F, 2, 1, 1, -0.199F, false));

		cube_r130 = new ModelRenderer(this);
		cube_r130.setRotationPoint(-14.7231F, -0.4846F, -7.1423F);
		bone48.addChild(cube_r130);
		setRotationAngle(cube_r130, 0.0F, 0.0F, 0.8901F);
		cube_r130.cubeList.add(new ModelBox(cube_r130, 193, 109, 9.3876F, -10.4507F, 2.0F, 1, 1, 1, -0.198F, false));
		cube_r130.cubeList.add(new ModelBox(cube_r130, 106, 193, 9.3876F, -10.4507F, 1.8F, 1, 1, 1, -0.198F, false));
		cube_r130.cubeList.add(new ModelBox(cube_r130, 129, 109, 9.3376F, -10.3007F, 2.4F, 1, 1, 7, -0.35F, false));
		cube_r130.cubeList.add(new ModelBox(cube_r130, 154, 194, 9.3876F, -10.4507F, 8.6F, 1, 1, 1, -0.198F, false));
		cube_r130.cubeList.add(new ModelBox(cube_r130, 101, 193, 9.3876F, -10.4507F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r130.cubeList.add(new ModelBox(cube_r130, 96, 193, 9.3876F, -10.4507F, 7.05F, 1, 1, 1, -0.198F, false));
		cube_r130.cubeList.add(new ModelBox(cube_r130, 91, 193, 9.3876F, -10.4507F, 5.8F, 1, 1, 1, -0.198F, false));
		cube_r130.cubeList.add(new ModelBox(cube_r130, 149, 194, 9.3876F, -10.4507F, 4.55F, 1, 1, 1, -0.198F, false));
		cube_r130.cubeList.add(new ModelBox(cube_r130, 24, 166, 9.3876F, -10.4507F, 3.3F, 1, 1, 1, -0.198F, false));

		cube_r131 = new ModelRenderer(this);
		cube_r131.setRotationPoint(-13.1231F, -0.4846F, -7.1423F);
		bone48.addChild(cube_r131);
		setRotationAngle(cube_r131, 0.0F, 0.0F, -0.8901F);
		cube_r131.cubeList.add(new ModelBox(cube_r131, 0, 187, 7.2334F, 11.3093F, 2.0F, 1, 1, 1, -0.198F, false));
		cube_r131.cubeList.add(new ModelBox(cube_r131, 186, 182, 7.2334F, 11.3093F, 1.8F, 1, 1, 1, -0.198F, false));
		cube_r131.cubeList.add(new ModelBox(cube_r131, 129, 69, 7.2834F, 11.4593F, 2.4F, 1, 1, 7, -0.35F, false));
		cube_r131.cubeList.add(new ModelBox(cube_r131, 48, 194, 7.2334F, 11.3093F, 8.6F, 1, 1, 1, -0.198F, false));
		cube_r131.cubeList.add(new ModelBox(cube_r131, 186, 168, 7.2334F, 11.3093F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r131.cubeList.add(new ModelBox(cube_r131, 186, 148, 7.2334F, 11.3093F, 7.05F, 1, 1, 1, -0.198F, false));
		cube_r131.cubeList.add(new ModelBox(cube_r131, 186, 143, 7.2334F, 11.3093F, 5.8F, 1, 1, 1, -0.198F, false));
		cube_r131.cubeList.add(new ModelBox(cube_r131, 66, 193, 7.2334F, 11.3093F, 4.55F, 1, 1, 1, -0.198F, false));
		cube_r131.cubeList.add(new ModelBox(cube_r131, 162, 136, 7.2334F, 11.3093F, 3.3F, 1, 1, 1, -0.198F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		sr3mp_stock.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}