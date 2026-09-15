package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Type20Upper extends ModelBase {
	private final ModelRenderer receiver;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r29;
	private final ModelRenderer cube_r30;
	private final ModelRenderer cube_r31;
	private final ModelRenderer cube_r32;
	private final ModelRenderer rail2;
	private final ModelRenderer cube_r33;
	private final ModelRenderer cube_r34;
	private final ModelRenderer cube_r35;

	public Type20Upper() {
		textureWidth = 210;
		textureHeight = 210;

		receiver = new ModelRenderer(this);
		receiver.setRotationPoint(0.0F, -12.0F, 0.0F);
		receiver.cubeList.add(new ModelBox(receiver, 78, 0, -0.45F, -2.0F, -26.5F, 1, 3, 30, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 93, 20, -3.0F, -0.7F, -26.5F, 3, 3, 3, 0.001F, false));
		receiver.cubeList.add(new ModelBox(receiver, 0, 76, -0.45F, -3.0F, -26.5F, 1, 1, 15, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 85, 21, -0.45F, -3.0F, 1.5F, 1, 1, 2, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 0, 92, -0.7F, -3.43F, -11.5F, 1, 2, 13, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 0, 20, -3.55F, -3.0F, -26.5F, 1, 1, 16, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 23, 94, -3.55F, -2.0F, -26.5F, 1, 3, 4, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 0, 0, -3.55F, -2.0F, -13.5F, 1, 3, 17, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 18, 69, -5.1F, -2.0F, -12.0F, 2, 2, 1, 0.001F, false));
		receiver.cubeList.add(new ModelBox(receiver, 138, 0, -3.55F, 0.0F, -22.5F, 1, 1, 9, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 30, 69, -3.55F, -3.0F, 1.5F, 1, 1, 2, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 104, 70, -3.3F, -3.43F, -10.5F, 1, 2, 12, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 35, 77, -0.45F, -3.0F, -31.0F, 1, 3, 5, 0.001F, false));
		receiver.cubeList.add(new ModelBox(receiver, 70, 77, -2.5F, -5.5F, -26.5F, 2, 1, 30, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 39, 47, -2.5F, -5.5F, -32.25F, 2, 1, 6, 0.001F, false));
		receiver.cubeList.add(new ModelBox(receiver, 17, 76, -3.55F, -3.0F, -31.0F, 1, 3, 5, 0.001F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-3.75F, -2.1F, -28.9F);
		receiver.addChild(cube_r26);
		setRotationAngle(cube_r26, -0.3316F, 0.0F, 0.0F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 12, 107, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 107, 34, 3.5F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(-3.75F, -2.1F, -25.4F);
		receiver.addChild(cube_r27);
		setRotationAngle(cube_r27, -0.3316F, 0.0F, 0.0F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 8, 107, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));
		cube_r27.cubeList.add(new ModelBox(cube_r27, 24, 107, 3.5F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(-3.75F, -2.1F, -23.4F);
		receiver.addChild(cube_r28);
		setRotationAngle(cube_r28, -0.3316F, 0.0F, 0.0F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 4, 107, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));
		cube_r28.cubeList.add(new ModelBox(cube_r28, 20, 107, 3.5F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(-3.75F, 0.5F, 2.0F);
		receiver.addChild(cube_r29);
		setRotationAngle(cube_r29, -0.3316F, 0.0F, 0.0F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 107, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		cube_r29.cubeList.add(new ModelBox(cube_r29, 16, 107, 3.5F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(-3.55F, -3.0F, -31.0F);
		receiver.addChild(cube_r30);
		setRotationAngle(cube_r30, 0.0F, 0.0F, 0.5061F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 78, 70, 0.0F, -2.0F, 0.0F, 1, 2, 1, 0.001F, false));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 58, 46, 0.0F, -2.5F, -1.25F, 1, 1, 6, 0.0F, false));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 78, 39, 0.0F, -2.5F, 4.5F, 1, 1, 30, -0.001F, false));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 19, 50, 0.0F, -1.8F, -1.25F, 1, 1, 2, -0.001F, false));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 39, 47, 0.0F, -2.0F, 32.5F, 1, 2, 2, 0.0F, false));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 48, 8, 0.0F, -2.0F, 17.5F, 1, 2, 3, 0.0F, false));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 104, 84, 0.0F, -1.5F, 20.5F, 1, 1, 12, 0.0F, false));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 39, 18, -0.1F, -0.9F, 0.6F, 1, 1, 17, -0.1F, false));

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(0.55F, -3.0F, -32.25F);
		receiver.addChild(cube_r31);
		setRotationAngle(cube_r31, 0.0F, 0.0F, -0.5061F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 30, 50, -1.0F, -1.8F, 0.0F, 1, 1, 2, -0.001F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 64, -1.0F, -2.5F, 0.0F, 1, 1, 6, 0.0F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 80, 79, -1.0F, -2.0F, 1.25F, 1, 2, 1, 0.001F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 104, 70, -1.0F, -2.5F, 5.75F, 1, 1, 30, -0.001F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 70, 92, -1.0F, -1.5F, 20.75F, 1, 1, 13, 0.0F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 56, -1.0F, -2.0F, 33.75F, 1, 2, 2, 0.0F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 39, 39, -0.9F, -0.9F, 1.85F, 1, 1, 17, -0.1F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 57, 57, -1.0F, -2.0F, 18.75F, 1, 2, 2, 0.0F, false));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(-5.1F, 0.0F, -12.0F);
		receiver.addChild(cube_r32);
		setRotationAngle(cube_r32, 0.0F, 0.6283F, 0.0F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 24, 69, 0.0F, -2.0F, 0.0F, 2, 2, 1, 0.0F, false));

		rail2 = new ModelRenderer(this);
		rail2.setRotationPoint(-0.7F, -4.3F, -48.3F);
		receiver.addChild(rail2);
		setRotationAngle(rail2, 0.0F, 0.0F, -3.1416F);
		rail2.cubeList.add(new ModelBox(rail2, 42, 101, -0.2F, 0.8F, 22.05F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 22, 101, -0.2F, 0.8F, 23.3F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 93, 100, -0.2F, 0.8F, 24.55F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 100, 63, -0.2F, 0.8F, 25.8F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 100, 61, -0.2F, 0.8F, 28.3F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 58, 100, -0.2F, 0.8F, 27.05F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 100, 57, -0.2F, 0.8F, 30.8F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 100, 55, -0.2F, 0.8F, 29.55F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 6, 100, -0.2F, 0.8F, 33.3F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 99, 74, -0.2F, 0.8F, 32.05F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 90, 98, -0.2F, 0.8F, 35.8F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 75, 98, -0.2F, 0.8F, 34.55F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 40, 98, -0.2F, 0.8F, 37.05F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 77, 92, -0.2F, 0.8F, 38.3F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 22, 92, -0.2F, 0.8F, 40.8F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 42, 92, -0.2F, 0.8F, 39.55F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 78, 87, -0.2F, 0.8F, 43.3F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 62, 89, -0.2F, 0.8F, 42.05F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 85, 55, -0.2F, 0.8F, 45.8F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 85, 57, -0.2F, 0.8F, 44.55F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 3, 87, -0.2F, 0.8F, 48.3F, 2, 1, 3, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 85, 48, -0.2F, 0.8F, 47.05F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 77, 94, -0.2F, 0.8F, 17.05F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 42, 94, -0.2F, 0.8F, 18.3F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 93, 87, -0.2F, 0.8F, 19.55F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 93, 85, -0.2F, 0.8F, 20.8F, 2, 1, 1, -0.2F, false));
		rail2.cubeList.add(new ModelBox(rail2, 93, 77, -0.2F, 0.8F, 15.8F, 2, 1, 1, -0.2F, false));

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(0.0F, 0.6F, 6.0F);
		rail2.addChild(cube_r33);
		setRotationAngle(cube_r33, 0.0F, 0.0F, -0.9425F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 62, 102, -1.009F, -0.2122F, 9.8F, 1, 1, 1, -0.202F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 85, 102, -1.009F, -0.2122F, 14.8F, 1, 1, 1, -0.202F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 93, 102, -1.009F, -0.2122F, 13.55F, 1, 1, 1, -0.202F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 103, 2, -1.009F, -0.2122F, 12.3F, 1, 1, 1, -0.202F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 103, 8, -1.009F, -0.2122F, 11.05F, 1, 1, 1, -0.202F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 95, 2, -1.009F, -0.2122F, 41.05F, 1, 1, 1, -0.202F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 47, 57, -1.009F, -0.2122F, 42.3F, 1, 1, 3, -0.202F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 64, 96, -1.009F, -0.2122F, 38.55F, 1, 1, 1, -0.202F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 95, 8, -1.009F, -0.2122F, 39.8F, 1, 1, 1, -0.202F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 96, 97, -1.009F, -0.2122F, 36.05F, 1, 1, 1, -0.202F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 96, 81, -1.009F, -0.2122F, 37.3F, 1, 1, 1, -0.202F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 102, 35, -1.009F, -0.2122F, 33.55F, 1, 1, 1, -0.202F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 64, 100, -1.009F, -0.2122F, 34.8F, 1, 1, 1, -0.202F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 54, 102, -1.009F, -0.2122F, 32.3F, 1, 1, 1, -0.202F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 24, 103, -1.009F, -0.2122F, 31.05F, 1, 1, 1, -0.202F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 77, 103, -1.009F, -0.2122F, 29.8F, 1, 1, 1, -0.202F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 96, 103, -1.009F, -0.2122F, 28.55F, 1, 1, 1, -0.202F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 104, 50, -1.009F, -0.2122F, 27.3F, 1, 1, 1, -0.202F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 63, 104, -1.009F, -0.2122F, 26.05F, 1, 1, 1, -0.202F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 104, 77, -1.009F, -0.2122F, 24.8F, 1, 1, 1, -0.202F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 104, 79, -1.009F, -0.2122F, 23.55F, 1, 1, 1, -0.202F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 104, 88, -1.009F, -0.2122F, 22.3F, 1, 1, 1, -0.202F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 104, 90, -1.009F, -0.2122F, 21.05F, 1, 1, 1, -0.202F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 104, 94, -1.009F, -0.2122F, 19.8F, 1, 1, 1, -0.202F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 104, 101, -1.009F, -0.2122F, 18.55F, 1, 1, 1, -0.202F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 105, 36, -1.009F, -0.2122F, 17.3F, 1, 1, 1, -0.202F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 104, 105, -1.009F, -0.2122F, 16.05F, 1, 1, 1, -0.202F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 35, 77, -0.909F, -0.3122F, 10.3F, 1, 1, 33, -0.3F, false));

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(1.6F, 0.6F, 6.0F);
		rail2.addChild(cube_r34);
		setRotationAngle(cube_r34, 0.0F, 0.0F, 0.9425F);
		cube_r34.cubeList.add(new ModelBox(cube_r34, 70, 102, 0.009F, -0.2122F, 9.8F, 1, 1, 1, -0.202F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 74, 102, 0.009F, -0.2122F, 14.8F, 1, 1, 1, -0.202F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 89, 102, 0.009F, -0.2122F, 13.55F, 1, 1, 1, -0.202F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 103, 0, 0.009F, -0.2122F, 12.3F, 1, 1, 1, -0.202F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 103, 6, 0.009F, -0.2122F, 11.05F, 1, 1, 1, -0.202F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 95, 6, 0.009F, -0.2122F, 41.05F, 1, 1, 1, -0.202F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 8, 64, 0.009F, -0.2122F, 42.3F, 1, 1, 3, -0.202F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 96, 79, 0.009F, -0.2122F, 38.55F, 1, 1, 1, -0.202F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 29, 96, 0.009F, -0.2122F, 39.8F, 1, 1, 1, -0.202F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 55, 98, 0.009F, -0.2122F, 36.05F, 1, 1, 1, -0.202F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 96, 83, 0.009F, -0.2122F, 37.3F, 1, 1, 1, -0.202F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 50, 102, 0.009F, -0.2122F, 33.55F, 1, 1, 1, -0.202F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 8, 102, 0.009F, -0.2122F, 34.8F, 1, 1, 1, -0.202F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 58, 102, 0.009F, -0.2122F, 32.3F, 1, 1, 1, -0.202F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 20, 103, 0.009F, -0.2122F, 31.05F, 1, 1, 1, -0.202F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 40, 103, 0.009F, -0.2122F, 29.8F, 1, 1, 1, -0.202F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 44, 103, 0.009F, -0.2122F, 28.55F, 1, 1, 1, -0.202F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 104, 25, 0.009F, -0.2122F, 27.3F, 1, 1, 1, -0.202F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 28, 104, 0.009F, -0.2122F, 26.05F, 1, 1, 1, -0.202F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 104, 66, 0.009F, -0.2122F, 24.8F, 1, 1, 1, -0.202F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 104, 72, 0.009F, -0.2122F, 23.55F, 1, 1, 1, -0.202F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 104, 84, 0.009F, -0.2122F, 22.3F, 1, 1, 1, -0.202F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 104, 86, 0.009F, -0.2122F, 21.05F, 1, 1, 1, -0.202F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 104, 92, 0.009F, -0.2122F, 19.8F, 1, 1, 1, -0.202F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 104, 97, 0.009F, -0.2122F, 18.55F, 1, 1, 1, -0.202F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 104, 103, 0.009F, -0.2122F, 17.3F, 1, 1, 1, -0.202F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 105, 74, 0.009F, -0.2122F, 16.05F, 1, 1, 1, -0.202F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 76, -0.091F, -0.3122F, 10.3F, 1, 1, 33, -0.3F, false));

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(1.8F, 1.8F, 51.3F);
		rail2.addChild(cube_r35);
		setRotationAngle(cube_r35, 0.4363F, 0.0F, 0.0F);
		cube_r35.cubeList.add(new ModelBox(cube_r35, 85, 46, -2.0F, -1.0658F, -0.2967F, 2, 1, 1, -0.2F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		receiver.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}