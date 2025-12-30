package com.paneedah.mwc.models;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QSZ92Body extends ModelBase {
	private final ModelRenderer body_92_9;
	private final ModelRenderer gun4;
	private final ModelRenderer gun7;
	private final ModelRenderer gun9;
	private final ModelRenderer gun10;
	private final ModelRenderer gun11;
	private final ModelRenderer gun145_r2;
	private final ModelRenderer gun146_r2;
	private final ModelRenderer gun17;
	private final ModelRenderer gun22;
	private final ModelRenderer gun144_r2;
	private final ModelRenderer gun34;
	private final ModelRenderer gun133_r1;
	private final ModelRenderer gun38;
	private final ModelRenderer gun46;
	private final ModelRenderer gun47;
	private final ModelRenderer gun51;
	private final ModelRenderer gun121_r1;
	private final ModelRenderer gun52;
	private final ModelRenderer gun54;
	private final ModelRenderer gun56;
	private final ModelRenderer gun57;
	private final ModelRenderer gun58;
	private final ModelRenderer gun114_r2;
	private final ModelRenderer gun59;
	private final ModelRenderer gun115_r2;
	private final ModelRenderer gun60;
	private final ModelRenderer gun61;
	private final ModelRenderer gun63;
	private final ModelRenderer gun64;
	private final ModelRenderer gun65;
	private final ModelRenderer gun66;
	private final ModelRenderer gun67;
	private final ModelRenderer gun68;
	private final ModelRenderer gun69;
	private final ModelRenderer gun70;
	private final ModelRenderer gun83_r1;
	private final ModelRenderer gun71;
	private final ModelRenderer gun73;
	private final ModelRenderer gun74;
	private final ModelRenderer gun76;
	private final ModelRenderer gun78;
	private final ModelRenderer gun15_r2;
	private final ModelRenderer gun79;
	private final ModelRenderer gun16_r1;
	private final ModelRenderer gun80;
	private final ModelRenderer gun81;
	private final ModelRenderer gun84;
	private final ModelRenderer gun11_r3;
	private final ModelRenderer gun85;
	private final ModelRenderer gun7_r1;
	private final ModelRenderer gun88;
	private final ModelRenderer gun3_r1;
	private final ModelRenderer gun94;
	private final ModelRenderer gun181_r1;
	private final ModelRenderer gun97;
	private final ModelRenderer gun180_r1;
	private final ModelRenderer gun98;
	private final ModelRenderer gun181_r2;
	private final ModelRenderer gun100;
	private final ModelRenderer hammer2;
	private final ModelRenderer gun101;
	private final ModelRenderer gun1200_r2;
	private final ModelRenderer gun102;

	public QSZ92Body() {
		textureWidth = 400;
		textureHeight = 400;

		body_92_9 = new ModelRenderer(this);
		body_92_9.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		gun4 = new ModelRenderer(this);
		gun4.setRotationPoint(-2.0F, -33.3F, -29.0F);
		body_92_9.addChild(gun4);
		gun4.cubeList.add(new ModelBox(gun4, 320, 52, 0.0F, 0.0F, 1.0F, 1, 1, 13, 0.0F, false));

		gun7 = new ModelRenderer(this);
		gun7.setRotationPoint(-3.5F, -33.0F, -16.5F);
		body_92_9.addChild(gun7);
		gun7.cubeList.add(new ModelBox(gun7, 368, 158, 0.4F, 0.0F, -3.0F, 4, 1, 3, 0.001F, false));
		gun7.cubeList.add(new ModelBox(gun7, 368, 163, -0.4F, 0.0F, -3.0F, 4, 1, 3, 0.001F, false));

		gun9 = new ModelRenderer(this);
		gun9.setRotationPoint(-0.9F, -31.6F, -26.0F);
		body_92_9.addChild(gun9);
		gun9.cubeList.add(new ModelBox(gun9, 68, 320, 0.199F, 0.099F, -4.501F, 1, 1, 13, 0.0F, false));
		gun9.cubeList.add(new ModelBox(gun9, 320, 140, -2.401F, -1.901F, -4.501F, 1, 1, 13, 0.0F, false));
		gun9.cubeList.add(new ModelBox(gun9, 145, 379, 0.199F, -0.901F, -4.501F, 1, 1, 3, 0.0F, false));
		gun9.cubeList.add(new ModelBox(gun9, 87, 375, 0.199F, -0.901F, 5.499F, 1, 1, 4, 0.0F, false));

		gun10 = new ModelRenderer(this);
		gun10.setRotationPoint(-3.0F, -33.0F, -26.0F);
		body_92_9.addChild(gun10);
		gun10.cubeList.add(new ModelBox(gun10, 323, 237, -0.201F, 0.099F, -4.501F, 1, 2, 11, -0.001F, false));
		gun10.cubeList.add(new ModelBox(gun10, 323, 251, 2.199F, 0.1F, -4.502F, 1, 2, 11, -0.001F, false));

		gun11 = new ModelRenderer(this);
		gun11.setRotationPoint(-0.5F, -32.9F, -11.5F);
		body_92_9.addChild(gun11);
		setRotationAngle(gun11, -0.4014F, 0.0F, 0.0F);
		gun11.cubeList.add(new ModelBox(gun11, 60, 381, 0.6F, 0.1672F, -0.3668F, 1, 2, 2, 0.0F, false));
		gun11.cubeList.add(new ModelBox(gun11, 390, 60, 0.6F, 3.1672F, 7.8332F, 1, 1, 1, 0.0F, false));

		gun145_r2 = new ModelRenderer(this);
		gun145_r2.setRotationPoint(0.5F, 32.9F, 11.5F);
		gun11.addChild(gun145_r2);
		setRotationAngle(gun145_r2, 0.0873F, 0.0F, 0.0F);
		

		gun146_r2 = new ModelRenderer(this);
		gun146_r2.setRotationPoint(0.5F, 32.9F, 11.5F);
		gun11.addChild(gun146_r2);
		setRotationAngle(gun146_r2, 0.4014F, 0.0F, 0.0F);
		

		gun17 = new ModelRenderer(this);
		gun17.setRotationPoint(1.4F, -32.4F, -9.0F);
		body_92_9.addChild(gun17);
		setRotationAngle(gun17, 0.0F, 0.0F, 2.2679F);
		gun17.cubeList.add(new ModelBox(gun17, 375, 200, 0.4993F, -0.0268F, -1.0F, 1, 1, 4, 0.0F, false));
		gun17.cubeList.add(new ModelBox(gun17, 227, 383, 0.4993F, -0.0268F, -3.0F, 1, 1, 2, 0.0F, false));

		gun22 = new ModelRenderer(this);
		gun22.setRotationPoint(0.4F, -33.4F, -9.0F);
		body_92_9.addChild(gun22);
		gun22.cubeList.add(new ModelBox(gun22, 292, 373, -0.3F, 0.4F, -1.0F, 1, 1, 4, 0.0F, false));
		gun22.cubeList.add(new ModelBox(gun22, 383, 40, -0.3F, 0.4F, -3.0F, 1, 1, 2, 0.0F, false));
		gun22.cubeList.add(new ModelBox(gun22, 270, 371, 0.001F, 0.1F, 0.7F, 1, 1, 4, -0.3F, false));

		gun144_r2 = new ModelRenderer(this);
		gun144_r2.setRotationPoint(-14.0F, 30.3F, 12.8F);
		gun22.addChild(gun144_r2);
		setRotationAngle(gun144_r2, 0.0F, 0.0F, 0.4363F);
		gun144_r2.cubeList.add(new ModelBox(gun144_r2, 383, 44, 0.2136F, -33.092F, -10.0F, 1, 1, 2, -0.2F, false));

		gun34 = new ModelRenderer(this);
		gun34.setRotationPoint(-0.7F, -34.0F, -13.8F);
		body_92_9.addChild(gun34);
		gun34.cubeList.add(new ModelBox(gun34, 288, 281, 0.6F, 0.0F, -3.0F, 1, 3, 14, 0.0F, false));
		gun34.cubeList.add(new ModelBox(gun34, 176, 283, 0.2F, 0.0F, -3.0F, 1, 3, 17, 0.0F, false));
		gun34.cubeList.add(new ModelBox(gun34, 82, 284, -2.8F, 0.0F, -3.0F, 1, 3, 17, 0.0F, false));

		gun133_r1 = new ModelRenderer(this);
		gun133_r1.setRotationPoint(-0.301F, 2.7328F, 2.7503F);
		gun34.addChild(gun133_r1);
		setRotationAngle(gun133_r1, -0.0436F, 0.0F, 0.0F);
		gun133_r1.cubeList.add(new ModelBox(gun133_r1, 37, 304, -0.1F, -0.5F, -8.5F, 1, 2, 14, 0.0F, false));
		gun133_r1.cubeList.add(new ModelBox(gun133_r1, 246, 302, 0.9F, -0.5F, -8.5F, 1, 2, 14, 0.0F, false));

		gun38 = new ModelRenderer(this);
		gun38.setRotationPoint(-3.0F, -29.2F, -7.2F);
		body_92_9.addChild(gun38);
		setRotationAngle(gun38, 0.2277F, 0.0F, 0.0F);
		gun38.cubeList.add(new ModelBox(gun38, 303, 373, 0.0F, -0.3F, 0.0F, 3, 3, 2, 0.0F, false));

		gun46 = new ModelRenderer(this);
		gun46.setRotationPoint(-3.0F, -30.2F, -8.4F);
		body_92_9.addChild(gun46);
		setRotationAngle(gun46, 0.9713F, 0.0F, 0.0F);
		gun46.cubeList.add(new ModelBox(gun46, 375, 315, 0.0F, 0.0F, 0.0F, 3, 2, 2, -0.001F, false));

		gun47 = new ModelRenderer(this);
		gun47.setRotationPoint(-3.0F, -26.2F, -7.4F);
		body_92_9.addChild(gun47);
		setRotationAngle(gun47, 0.8969F, 0.0F, 0.0F);
		gun47.cubeList.add(new ModelBox(gun47, 375, 320, 0.0F, 0.0F, 0.0F, 3, 2, 2, -0.001F, false));

		gun51 = new ModelRenderer(this);
		gun51.setRotationPoint(-3.0F, -30.5F, -13.0F);
		body_92_9.addChild(gun51);
		

		gun121_r1 = new ModelRenderer(this);
		gun121_r1.setRotationPoint(1.5005F, 0.6572F, -2.4227F);
		gun51.addChild(gun121_r1);
		setRotationAngle(gun121_r1, 0.0436F, 0.0F, 0.0F);
		gun121_r1.cubeList.add(new ModelBox(gun121_r1, 271, 357, -1.5005F, -1.6964F, -0.7633F, 3, 5, 1, -0.001F, false));

		gun52 = new ModelRenderer(this);
		gun52.setRotationPoint(-3.0F, -25.1F, -10.5F);
		body_92_9.addChild(gun52);
		setRotationAngle(gun52, 2.8628F, 0.0F, 0.0F);
		gun52.cubeList.add(new ModelBox(gun52, 368, 25, 0.0F, -0.4374F, 1.8004F, 3, 1, 4, 0.0F, false));

		gun54 = new ModelRenderer(this);
		gun54.setRotationPoint(-1.0F, -36.0F, 2.3F);
		body_92_9.addChild(gun54);
		setRotationAngle(gun54, -1.2641F, 0.0F, 0.0F);
		gun54.cubeList.add(new ModelBox(gun54, 67, 381, 0.001F, 0.3813F, 1.1792F, 1, 2, 2, -0.001F, false));

		gun56 = new ModelRenderer(this);
		gun56.setRotationPoint(0.1F, -19.0F, -2.7F);
		body_92_9.addChild(gun56);
		gun56.cubeList.add(new ModelBox(gun56, 206, 368, 0.0F, -0.6F, -0.201F, 1, 1, 5, -0.001F, false));
		gun56.cubeList.add(new ModelBox(gun56, 0, 369, -4.2F, -0.6F, -0.201F, 1, 1, 5, -0.001F, false));

		gun57 = new ModelRenderer(this);
		gun57.setRotationPoint(0.1F, -19.5F, -2.7F);
		body_92_9.addChild(gun57);
		gun57.cubeList.add(new ModelBox(gun57, 32, 369, 0.0F, -0.6F, -0.2F, 1, 1, 5, -0.002F, false));
		gun57.cubeList.add(new ModelBox(gun57, 45, 369, -4.2F, -0.6F, -0.2F, 1, 1, 5, -0.002F, false));

		gun58 = new ModelRenderer(this);
		gun58.setRotationPoint(0.1F, -30.0F, -5.0F);
		body_92_9.addChild(gun58);
		gun58.cubeList.add(new ModelBox(gun58, 190, 378, 0.001F, 1.3514F, 0.2415F, 1, 1, 3, -0.001F, false));
		gun58.cubeList.add(new ModelBox(gun58, 214, 378, -4.201F, 1.3514F, 0.2415F, 1, 1, 3, -0.001F, false));

		gun114_r2 = new ModelRenderer(this);
		gun114_r2.setRotationPoint(-3.201F, -1.0F, 2.8F);
		gun58.addChild(gun114_r2);
		setRotationAngle(gun114_r2, -0.6807F, 0.0F, 0.0F);
		gun114_r2.cubeList.add(new ModelBox(gun114_r2, 376, 291, -1.0F, 1.5495F, 1.823F, 1, 2, 3, -0.002F, false));
		gun114_r2.cubeList.add(new ModelBox(gun114_r2, 376, 297, 3.202F, 1.5495F, 1.823F, 1, 2, 3, -0.002F, false));

		gun59 = new ModelRenderer(this);
		gun59.setRotationPoint(0.1F, -29.0F, -5.0F);
		body_92_9.addChild(gun59);
		setRotationAngle(gun59, 0.2231F, 0.0F, 0.0F);
		gun59.cubeList.add(new ModelBox(gun59, 356, 366, 0.0F, 1.3706F, -0.0623F, 1, 9, 3, 0.0F, false));
		gun59.cubeList.add(new ModelBox(gun59, 301, 331, 0.0F, 3.3706F, 2.9377F, 1, 7, 2, 0.0F, false));
		gun59.cubeList.add(new ModelBox(gun59, 365, 366, -4.2F, 1.3706F, -0.0623F, 1, 9, 3, 0.0F, false));
		gun59.cubeList.add(new ModelBox(gun59, 50, 336, -4.2F, 3.3706F, 2.9377F, 1, 7, 2, 0.0F, false));

		gun115_r2 = new ModelRenderer(this);
		gun115_r2.setRotationPoint(-0.1F, 29.0F, 5.0F);
		gun59.addChild(gun115_r2);
		setRotationAngle(gun115_r2, -0.1047F, 0.0F, 0.0F);
		

		gun60 = new ModelRenderer(this);
		gun60.setRotationPoint(-3.5F, -17.6F, 1.0F);
		body_92_9.addChild(gun60);
		gun60.cubeList.add(new ModelBox(gun60, 141, 96, 0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));

		gun61 = new ModelRenderer(this);
		gun61.setRotationPoint(-3.5F, -17.0F, 1.5F);
		body_92_9.addChild(gun61);
		gun61.cubeList.add(new ModelBox(gun61, 314, 373, 0.0F, -0.6F, 0.0F, 4, 1, 2, -0.001F, false));

		gun63 = new ModelRenderer(this);
		gun63.setRotationPoint(-3.5F, -19.6F, 2.7F);
		body_92_9.addChild(gun63);
		gun63.cubeList.add(new ModelBox(gun63, 375, 325, 0.0F, 0.0F, 0.0F, 4, 3, 1, -0.002F, false));

		gun64 = new ModelRenderer(this);
		gun64.setRotationPoint(-3.5F, -30.5F, -5.2F);
		body_92_9.addChild(gun64);
		setRotationAngle(gun64, -1.3384F, 0.0F, 0.0F);
		gun64.cubeList.add(new ModelBox(gun64, 119, 304, 0.0F, 0.0F, 0.0F, 4, 2, 12, 0.0F, false));

		gun65 = new ModelRenderer(this);
		gun65.setRotationPoint(-3.5F, -19.6F, 3.7F);
		body_92_9.addChild(gun65);
		setRotationAngle(gun65, -2.8453F, 0.0F, 0.0F);
		gun65.cubeList.add(new ModelBox(gun65, 85, 335, 0.0F, 0.0F, 0.0F, 4, 5, 1, -0.001F, false));

		gun66 = new ModelRenderer(this);
		gun66.setRotationPoint(-3.5F, -19.0F, -4.3F);
		body_92_9.addChild(gun66);
		gun66.cubeList.add(new ModelBox(gun66, 285, 140, 0.0F, -0.7F, -0.2F, 4, 2, 5, -0.001F, false));

		gun67 = new ModelRenderer(this);
		gun67.setRotationPoint(-4.0F, -19.6F, -3.3F);
		body_92_9.addChild(gun67);
		gun67.cubeList.add(new ModelBox(gun67, 259, 229, 0.0F, 0.0F, 0.0F, 5, 2, 6, -0.001F, false));

		gun68 = new ModelRenderer(this);
		gun68.setRotationPoint(-3.5F, -30.5F, 0.8F);
		body_92_9.addChild(gun68);
		setRotationAngle(gun68, -1.3384F, 0.0F, 0.0F);
		gun68.cubeList.add(new ModelBox(gun68, 152, 304, 0.0F, 0.0F, 0.0F, 4, 2, 12, 0.0F, false));

		gun69 = new ModelRenderer(this);
		gun69.setRotationPoint(-3.5F, -31.0F, 1.4F);
		body_92_9.addChild(gun69);
		setRotationAngle(gun69, -1.9333F, 0.0F, 0.0F);
		gun69.cubeList.add(new ModelBox(gun69, 368, 31, 0.0F, -0.935F, -0.3546F, 4, 2, 3, -0.001F, false));

		gun70 = new ModelRenderer(this);
		gun70.setRotationPoint(-3.5F, -30.0F, 0.5F);
		body_92_9.addChild(gun70);
		setRotationAngle(gun70, 2.4166F, 0.0F, 0.0F);
		gun70.cubeList.add(new ModelBox(gun70, 370, 83, 0.0F, -0.6369F, -0.7485F, 4, 1, 3, 0.001F, false));

		gun83_r1 = new ModelRenderer(this);
		gun83_r1.setRotationPoint(2.0F, 2.3631F, 0.7515F);
		gun70.addChild(gun83_r1);
		setRotationAngle(gun83_r1, -0.48F, 0.0F, 0.0F);
		gun83_r1.cubeList.add(new ModelBox(gun83_r1, 341, 364, -2.0F, -2.2F, -1.5F, 4, 4, 3, 0.001F, false));

		gun71 = new ModelRenderer(this);
		gun71.setRotationPoint(-3.0F, -36.0F, 2.3F);
		body_92_9.addChild(gun71);
		setRotationAngle(gun71, -1.2641F, 0.0F, 0.0F);
		gun71.cubeList.add(new ModelBox(gun71, 74, 381, 0.0F, 0.3813F, 1.1792F, 1, 2, 2, -0.001F, false));

		gun73 = new ModelRenderer(this);
		gun73.setRotationPoint(-3.0F, -31.0F, -17.5F);
		body_92_9.addChild(gun73);
		setRotationAngle(gun73, 1.3384F, 0.0F, 0.0F);
		gun73.cubeList.add(new ModelBox(gun73, 172, 379, 0.0F, 2.0F, 0.0F, 3, 2, 1, 0.0F, false));

		gun74 = new ModelRenderer(this);
		gun74.setRotationPoint(-3.1F, -31.6F, -26.0F);
		body_92_9.addChild(gun74);
		gun74.cubeList.add(new ModelBox(gun74, 68, 305, -0.201F, 0.099F, -4.501F, 3, 1, 13, 0.0F, false));
		gun74.cubeList.add(new ModelBox(gun74, 320, 155, 2.399F, -1.901F, -4.501F, 1, 1, 13, 0.0F, false));
		gun74.cubeList.add(new ModelBox(gun74, 320, 170, 2.199F, 0.1F, -4.502F, 1, 1, 13, 0.0F, false));
		gun74.cubeList.add(new ModelBox(gun74, 154, 379, -0.201F, -0.901F, -4.501F, 1, 1, 3, 0.0F, false));
		gun74.cubeList.add(new ModelBox(gun74, 368, 61, -0.201F, -0.901F, 5.499F, 3, 1, 4, 0.0F, false));

		gun76 = new ModelRenderer(this);
		gun76.setRotationPoint(-1.5F, -25.2725F, -18.7386F);
		body_92_9.addChild(gun76);
		setRotationAngle(gun76, 1.8736F, 0.0F, 0.0F);
		gun76.cubeList.add(new ModelBox(gun76, 370, 88, -1.602F, 0.6214F, 4.9034F, 4, 1, 3, -0.001F, false));
		gun76.cubeList.add(new ModelBox(gun76, 370, 93, -2.402F, 0.6214F, 4.9034F, 4, 1, 3, -0.001F, false));

		gun78 = new ModelRenderer(this);
		gun78.setRotationPoint(-3.0F, -26.1F, -10.5F);
		body_92_9.addChild(gun78);
		

		gun15_r2 = new ModelRenderer(this);
		gun15_r2.setRotationPoint(2.999F, 27.518F, 6.1535F);
		gun78.addChild(gun15_r2);
		setRotationAngle(gun15_r2, -0.1745F, 0.0F, 0.0F);
		gun15_r2.cubeList.add(new ModelBox(gun15_r2, 371, 258, -3.0F, -25.8F, -12.5F, 3, 1, 3, 0.001F, false));

		gun79 = new ModelRenderer(this);
		gun79.setRotationPoint(-3.0F, -25.1F, -8.5F);
		body_92_9.addChild(gun79);
		setRotationAngle(gun79, 2.0334F, 0.0F, 0.0F);
		gun79.cubeList.add(new ModelBox(gun79, 377, 0, 0.0F, -1.0F, 0.0F, 3, 4, 1, 0.0F, false));
		gun79.cubeList.add(new ModelBox(gun79, 172, 96, 0.0F, -4.0444F, 6.9257F, 3, 1, 1, 0.0F, false));

		gun16_r1 = new ModelRenderer(this);
		gun16_r1.setRotationPoint(1.5F, -4.4393F, 7.872F);
		gun79.addChild(gun16_r1);
		setRotationAngle(gun16_r1, -0.8727F, 0.0F, 0.0F);
		gun16_r1.cubeList.add(new ModelBox(gun16_r1, 321, 311, -1.5F, -0.9067F, -0.5677F, 3, 1, 1, 0.0F, false));

		gun80 = new ModelRenderer(this);
		gun80.setRotationPoint(-4.0F, -31.0F, -6.0F);
		body_92_9.addChild(gun80);
		setRotationAngle(gun80, 0.2231F, 0.0F, 0.0F);
		gun80.cubeList.add(new ModelBox(gun80, 107, 359, 0.0F, 0.0F, 0.0F, 5, 2, 4, 0.0F, false));
		gun80.cubeList.add(new ModelBox(gun80, 322, 15, 0.0F, 2.0F, 0.0F, 5, 11, 6, 0.0F, false));
		gun80.cubeList.add(new ModelBox(gun80, 101, 315, 0.0F, 0.8672F, 5.4149F, 5, 1, 2, 0.0F, false));
		gun80.cubeList.add(new ModelBox(gun80, 131, 347, -0.001F, -0.4425F, -0.9504F, 5, 13, 1, 0.0F, false));

		gun81 = new ModelRenderer(this);
		gun81.setRotationPoint(-3.5F, -34.0F, -26.0F);
		body_92_9.addChild(gun81);
		gun81.cubeList.add(new ModelBox(gun81, 31, 321, 0.0F, 0.0F, -2.5F, 1, 1, 13, -0.001F, false));
		gun81.cubeList.add(new ModelBox(gun81, 321, 296, 3.0F, 0.0F, -2.5F, 1, 1, 13, -0.001F, false));

		gun84 = new ModelRenderer(this);
		gun84.setRotationPoint(-4.0F, -32.5F, -6.5F);
		body_92_9.addChild(gun84);
		gun84.cubeList.add(new ModelBox(gun84, 300, 223, -0.001F, 0.5F, 0.5F, 5, 1, 4, 0.0F, false));
		gun84.cubeList.add(new ModelBox(gun84, 218, 315, -0.001F, 0.5F, -1.5F, 5, 1, 2, 0.0F, false));
		gun84.cubeList.add(new ModelBox(gun84, 333, 219, -0.001F, -0.5F, 2.2F, 5, 1, 2, 0.0F, false));

		gun11_r3 = new ModelRenderer(this);
		gun11_r3.setRotationPoint(4.999F, 1.2F, 7.4F);
		gun84.addChild(gun11_r3);
		setRotationAngle(gun11_r3, -0.3491F, 0.0F, 0.0F);
		gun11_r3.cubeList.add(new ModelBox(gun11_r3, 341, 324, -5.0F, 1.2F, -3.4F, 5, 1, 3, 0.0F, false));
		gun11_r3.cubeList.add(new ModelBox(gun11_r3, 368, 37, -4.999F, 0.1969F, -1.1363F, 5, 3, 2, 0.0F, false));

		gun85 = new ModelRenderer(this);
		gun85.setRotationPoint(-3.3F, -34.0F, -13.8F);
		body_92_9.addChild(gun85);
		gun85.cubeList.add(new ModelBox(gun85, 37, 286, -0.6F, 0.0F, -3.0F, 1, 3, 14, 0.0F, false));

		gun7_r1 = new ModelRenderer(this);
		gun7_r1.setRotationPoint(1.899F, 2.7328F, 2.7503F);
		gun85.addChild(gun7_r1);
		setRotationAngle(gun7_r1, -0.0436F, 0.0F, 0.0F);
		gun7_r1.cubeList.add(new ModelBox(gun7_r1, 287, 18, -2.5F, -0.5F, -8.5F, 3, 2, 14, 0.0F, false));

		gun88 = new ModelRenderer(this);
		gun88.setRotationPoint(-2.0F, -31.1F, -7.3F);
		body_92_9.addChild(gun88);
		setRotationAngle(gun88, -0.3634F, 0.0F, 0.0F);
		gun88.cubeList.add(new ModelBox(gun88, 171, 387, 0.0F, 1.3914F, -1.7762F, 1, 2, 1, 0.0F, false));

		gun3_r1 = new ModelRenderer(this);
		gun3_r1.setRotationPoint(0.5F, 4.1948F, -1.5538F);
		gun88.addChild(gun3_r1);
		setRotationAngle(gun3_r1, -0.3054F, 0.0F, 0.0F);
		gun3_r1.cubeList.add(new ModelBox(gun3_r1, 176, 387, -0.5F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

		gun94 = new ModelRenderer(this);
		gun94.setRotationPoint(9.7F, -32.135F, 0.6035F);
		body_92_9.addChild(gun94);
		setRotationAngle(gun94, -0.7854F, 0.0F, 0.0F);
		

		gun181_r1 = new ModelRenderer(this);
		gun181_r1.setRotationPoint(-8.946F, -0.1282F, 0.1521F);
		gun94.addChild(gun181_r1);
		setRotationAngle(gun181_r1, 0.7418F, 0.0F, 0.0F);
		gun181_r1.cubeList.add(new ModelBox(gun181_r1, 126, 359, -4.954F, 0.1725F, -12.0563F, 1, 1, 1, 0.0F, false));
		gun181_r1.cubeList.add(new ModelBox(gun181_r1, 157, 391, -4.854F, -0.8275F, -1.0563F, 1, 1, 1, 0.0F, false));
		gun181_r1.cubeList.add(new ModelBox(gun181_r1, 62, 390, -0.554F, -0.8275F, -1.0563F, 1, 1, 1, 0.0F, false));

		gun97 = new ModelRenderer(this);
		gun97.setRotationPoint(0.3F, -37.0F, -2.3F);
		body_92_9.addChild(gun97);
		setRotationAngle(gun97, 0.0F, 0.0F, 0.632F);
		

		gun180_r1 = new ModelRenderer(this);
		gun180_r1.setRotationPoint(3.2504F, 3.6707F, 3.1018F);
		gun97.addChild(gun180_r1);
		setRotationAngle(gun180_r1, 0.6366F, -0.4105F, -0.137F);
		gun180_r1.cubeList.add(new ModelBox(gun180_r1, 383, 48, -0.8056F, -1.0089F, -2.1653F, 1, 1, 2, 0.0F, false));

		gun98 = new ModelRenderer(this);
		gun98.setRotationPoint(-4.0F, -37.0F, -2.3F);
		body_92_9.addChild(gun98);
		setRotationAngle(gun98, 0.0F, 0.0F, 0.632F);
		

		gun181_r2 = new ModelRenderer(this);
		gun181_r2.setRotationPoint(3.2504F, 3.6707F, 3.1018F);
		gun98.addChild(gun181_r2);
		setRotationAngle(gun181_r2, 0.6366F, -0.4105F, -0.137F);
		gun181_r2.cubeList.add(new ModelBox(gun181_r2, 383, 52, -1.0477F, -0.8316F, -2.1653F, 1, 1, 2, 0.0F, false));

		gun100 = new ModelRenderer(this);
		gun100.setRotationPoint(-0.35F, -42.5F, -0.1F);
		body_92_9.addChild(gun100);
		setRotationAngle(gun100, -0.5577F, 0.0F, 0.0F);
		gun100.cubeList.add(new ModelBox(gun100, 390, 63, 0.2F, 8.6641F, 3.4703F, 1, 1, 1, -0.2F, false));
		gun100.cubeList.add(new ModelBox(gun100, 390, 66, -3.5F, 8.6641F, 3.4703F, 1, 1, 1, -0.2F, false));

		hammer2 = new ModelRenderer(this);
		hammer2.setRotationPoint(-1.0F, -32.95F, 3.0F);
		body_92_9.addChild(hammer2);
		setRotationAngle(hammer2, -0.7679F, 0.0F, 0.0F);
		

		gun101 = new ModelRenderer(this);
		gun101.setRotationPoint(-1.0F, -3.0F, 0.0F);
		hammer2.addChild(gun101);
		setRotationAngle(gun101, -0.4833F, 0.0F, 0.0F);
		gun101.cubeList.add(new ModelBox(gun101, 44, 354, 0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, false));

		gun1200_r2 = new ModelRenderer(this);
		gun1200_r2.setRotationPoint(2.0F, 37.75F, -2.1F);
		gun101.addChild(gun1200_r2);
		setRotationAngle(gun1200_r2, 0.384F, 0.0F, 0.0F);
		gun1200_r2.cubeList.add(new ModelBox(gun1200_r2, 335, 383, -2.0F, -33.7055F, 15.0608F, 1, 3, 1, 0.001F, false));

		gun102 = new ModelRenderer(this);
		gun102.setRotationPoint(-1.0F, -1.95F, -1.8F);
		hammer2.addChild(gun102);
		setRotationAngle(gun102, 0.5205F, 0.0F, 0.0F);
		gun102.cubeList.add(new ModelBox(gun102, 67, 390, 0.0F, 0.0F, 1.0F, 1, 1, 1, -0.001F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		body_92_9.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}