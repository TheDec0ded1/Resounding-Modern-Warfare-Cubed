package com.paneedah.mwc.models;

import com.paneedah.weaponlib2.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AN94Action extends ModelWithAttachments {
	private final ModelRenderer action;
	private final ModelRenderer gun295_r1;
	private final ModelRenderer gun294_r1;
	private final ModelRenderer gun294_r2;
	private final ModelRenderer gun293_r1;
	private final ModelRenderer gun331_r1;
	private final ModelRenderer action17;
	private final ModelRenderer action16;
	private final ModelRenderer action15;
	private final ModelRenderer action14;
	private final ModelRenderer action12;
	private final ModelRenderer action11;
	private final ModelRenderer action10;
	private final ModelRenderer action9;
	private final ModelRenderer action2;
	private final ModelRenderer action3;

	public AN94Action() {
		textureWidth = 512;
		textureHeight = 256;

		action = new ModelRenderer(this);
		action.setRotationPoint(0.0F, 22.3F, -1.6F);
		action.cubeList.add(new ModelBox(action, 144, 14, -2.5F, -33.4F, -79.1F, 1, 1, 1, 0.3F, false));
		action.cubeList.add(new ModelBox(action, 171, 32, -2.4F, -33.6F, -79.1F, 1, 1, 1, 0.3F, false));
		action.cubeList.add(new ModelBox(action, 158, 18, -2.2F, -33.8F, -79.1F, 1, 1, 1, 0.3F, false));
		action.cubeList.add(new ModelBox(action, 133, 19, -1.5F, -33.4F, -79.1F, 1, 1, 1, 0.3F, false));
		action.cubeList.add(new ModelBox(action, 144, 14, -2.5F, -36.4F, -80.7F, 1, 4, 1, 0.3F, false));
		action.cubeList.add(new ModelBox(action, 133, 19, -1.5F, -36.4F, -80.7F, 1, 4, 1, 0.3F, false));
		action.cubeList.add(new ModelBox(action, 143, 13, -2.5F, -34.4F, -83.3F, 1, 2, 2, 0.3F, false));
		action.cubeList.add(new ModelBox(action, 141, 11, -2.025F, -34.4F, -87.9F, 1, 2, 4, 0.3F, false));
		action.cubeList.add(new ModelBox(action, 132, 18, -1.5F, -34.4F, -83.3F, 1, 2, 2, 0.3F, false));
		action.cubeList.add(new ModelBox(action, 174, 18, -1.6F, -33.6F, -79.1F, 1, 1, 1, 0.3F, false));
		action.cubeList.add(new ModelBox(action, 142, 19, -1.8F, -33.8F, -79.1F, 1, 1, 1, 0.3F, false));
		action.cubeList.add(new ModelBox(action, 158, 21, -2.0F, -33.9F, -79.101F, 1, 1, 1, 0.3F, false));
		action.cubeList.add(new ModelBox(action, 130, 7, -1.8F, -33.8F, -67.1F, 1, 1, 13, 0.3F, false));
		action.cubeList.add(new ModelBox(action, 162, -4, -1.8F, -33.0F, -67.1F, 1, 1, 13, 0.3F, false));
		action.cubeList.add(new ModelBox(action, 162, -1, -1.6F, -33.2F, -67.1F, 1, 1, 13, 0.3F, false));
		action.cubeList.add(new ModelBox(action, 120, 7, -1.5F, -33.4F, -67.1F, 1, 1, 13, 0.3F, false));
		action.cubeList.add(new ModelBox(action, 156, 6, -2.0F, -32.9F, -67.1F, 1, 1, 13, 0.3F, false));
		action.cubeList.add(new ModelBox(action, 162, 6, -1.6F, -33.6F, -67.1F, 1, 1, 13, 0.3F, false));
		action.cubeList.add(new ModelBox(action, 146, 9, -2.0F, -33.9F, -67.101F, 1, 1, 13, 0.3F, false));
		action.cubeList.add(new ModelBox(action, 146, 6, -2.2F, -33.8F, -67.1F, 1, 1, 13, 0.3F, false));
		action.cubeList.add(new ModelBox(action, 159, 20, -2.4F, -33.6F, -67.1F, 1, 1, 13, 0.3F, false));
		action.cubeList.add(new ModelBox(action, 132, 2, -2.5F, -33.4F, -67.1F, 1, 1, 13, 0.3F, false));
		action.cubeList.add(new ModelBox(action, 152, -9, -2.2F, -33.0F, -67.1F, 1, 1, 13, 0.3F, false));
		action.cubeList.add(new ModelBox(action, 113, 38, -2.4F, -33.2F, -67.1F, 1, 1, 13, 0.3F, false));
		action.cubeList.add(new ModelBox(action, 143, 13, -2.5F, -33.4F, -91.5F, 1, 1, 2, 0.3F, false));
		action.cubeList.add(new ModelBox(action, 170, 31, -2.4F, -33.6F, -91.5F, 1, 1, 2, 0.3F, false));
		action.cubeList.add(new ModelBox(action, 157, 17, -2.2F, -33.8F, -91.5F, 1, 1, 2, 0.3F, false));
		action.cubeList.add(new ModelBox(action, 157, 20, -2.0F, -33.9F, -91.501F, 1, 1, 2, 0.3F, false));
		action.cubeList.add(new ModelBox(action, 124, 49, -2.4F, -33.2F, -91.5F, 1, 1, 2, 0.3F, false));
		action.cubeList.add(new ModelBox(action, 167, 17, -2.0F, -32.9F, -91.5F, 1, 1, 2, 0.3F, false));
		action.cubeList.add(new ModelBox(action, 163, 2, -2.2F, -33.0F, -91.5F, 1, 1, 2, 0.3F, false));
		action.cubeList.add(new ModelBox(action, 141, 18, -1.8F, -33.8F, -91.5F, 1, 1, 2, 0.3F, false));
		action.cubeList.add(new ModelBox(action, 173, 17, -1.6F, -33.6F, -91.5F, 1, 1, 2, 0.3F, false));
		action.cubeList.add(new ModelBox(action, 132, 18, -1.5F, -33.4F, -91.5F, 1, 1, 2, 0.3F, false));
		action.cubeList.add(new ModelBox(action, 173, 10, -1.6F, -33.2F, -91.5F, 1, 1, 2, 0.3F, false));
		action.cubeList.add(new ModelBox(action, 173, 7, -1.8F, -33.0F, -91.5F, 1, 1, 2, 0.3F, false));
		action.cubeList.add(new ModelBox(action, 125, 50, -2.4F, -32.2F, -79.1F, 1, 1, 1, 0.3F, false));
		action.cubeList.add(new ModelBox(action, 174, 11, -1.6F, -32.2F, -79.1F, 1, 1, 1, 0.3F, false));
		action.cubeList.add(new ModelBox(action, 152, 0, -2.001F, -35.3F, -48.5F, 1, 2, 1, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 117, 14, -2.4F, -33.2F, -48.6F, 1, 1, 1, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 117, 50, -2.2F, -33.0F, -48.6F, 1, 1, 1, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 171, 35, -2.5F, -33.4F, -48.6F, 1, 1, 1, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 162, 18, -2.4F, -33.6F, -48.6F, 1, 1, 1, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 174, 14, -2.2F, -33.8F, -48.6F, 1, 1, 1, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 136, 19, -2.0F, -33.9F, -48.6F, 1, 1, 1, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 174, 23, -1.8F, -33.8F, -48.6F, 1, 1, 1, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 174, 25, -1.6F, -33.6F, -48.6F, 1, 1, 1, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 175, 32, -1.5F, -33.4F, -48.6F, 1, 1, 1, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 175, 35, -1.6F, -33.2F, -48.6F, 1, 1, 1, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 162, 21, -1.8F, -33.0F, -48.6F, 1, 1, 1, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 136, 22, -2.0F, -32.9F, -48.6F, 1, 1, 1, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 117, 10, -2.001F, -35.9F, -56.099F, 1, 3, 2, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 167, 5, -2.2F, -33.6F, -84.0F, 1, 1, 39, 0.2F, false));
		action.cubeList.add(new ModelBox(action, 158, 14, -2.0F, -33.7F, -84.0F, 1, 1, 39, 0.2F, false));
		action.cubeList.add(new ModelBox(action, 195, 51, -2.0F, -38.1F, -80.7F, 1, 2, 1, -0.1F, false));
		action.cubeList.add(new ModelBox(action, 195, 51, -2.0F, -39.8F, -80.7F, 1, 2, 1, -0.4F, false));
		action.cubeList.add(new ModelBox(action, 194, 50, -2.0F, -38.6F, -81.2F, 2, 1, 2, -0.4F, false));
		action.cubeList.add(new ModelBox(action, 195, 51, -1.5F, -40.85F, -80.3F, 1, 1, 1, -0.3F, false));
		action.cubeList.add(new ModelBox(action, 195, 51, -2.5F, -40.85F, -80.3F, 1, 1, 1, -0.3F, false));
		action.cubeList.add(new ModelBox(action, 195, 51, -2.5F, -40.85F, -80.7F, 1, 1, 1, -0.3F, false));
		action.cubeList.add(new ModelBox(action, 195, 51, -1.5F, -40.85F, -80.7F, 1, 1, 1, -0.3F, false));
		action.cubeList.add(new ModelBox(action, 195, 51, -2.5F, -40.85F, -81.1F, 1, 1, 1, -0.3F, false));
		action.cubeList.add(new ModelBox(action, 195, 51, -1.5F, -40.85F, -81.1F, 1, 1, 1, -0.3F, false));
		action.cubeList.add(new ModelBox(action, 194, 50, -0.7F, -40.1196F, -81.2F, 1, 2, 2, -0.4F, false));
		action.cubeList.add(new ModelBox(action, 194, 50, -3.3F, -40.1196F, -81.2F, 1, 2, 2, -0.4F, false));
		action.cubeList.add(new ModelBox(action, 194, 50, -3.0F, -38.6F, -81.2F, 2, 1, 2, -0.4F, false));
		action.cubeList.add(new ModelBox(action, 194, 50, -3.0F, -40.6392F, -81.2F, 2, 1, 2, -0.4F, false));
		action.cubeList.add(new ModelBox(action, 194, 50, -2.0F, -40.6392F, -81.2F, 2, 1, 2, -0.4F, false));
		action.cubeList.add(new ModelBox(action, 116, 0, -1.8F, -33.6F, -84.0F, 1, 1, 39, 0.2F, false));
		action.cubeList.add(new ModelBox(action, 154, 23, -1.7F, -33.4F, -84.0F, 1, 1, 39, 0.2F, false));
		action.cubeList.add(new ModelBox(action, 181, -7, -2.3F, -33.4F, -84.0F, 1, 1, 39, 0.2F, false));
		action.cubeList.add(new ModelBox(action, 181, 15, -2.2F, -33.2F, -84.0F, 1, 1, 39, 0.2F, false));
		action.cubeList.add(new ModelBox(action, 190, -18, -1.8F, -33.2F, -84.0F, 1, 1, 39, 0.2F, false));
		action.cubeList.add(new ModelBox(action, 190, 4, -2.0F, -33.1F, -84.0F, 1, 1, 39, 0.2F, false));
		action.cubeList.add(new ModelBox(action, 126, 29, -2.3F, -36.2F, -56.1F, 1, 1, 3, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 137, 28, -1.7F, -36.2F, -56.1F, 1, 1, 3, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 147, 0, -2.2F, -36.1F, -56.101F, 1, 1, 3, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 147, 4, -1.8F, -36.1F, -56.102F, 1, 1, 3, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 147, 9, -1.8F, -36.7F, -56.099F, 1, 1, 3, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 147, 13, -2.2F, -36.7F, -56.099F, 1, 1, 3, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 147, 23, -1.7F, -36.6F, -56.1F, 1, 1, 3, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 147, 19, -2.3F, -36.6F, -56.1F, 1, 1, 3, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 147, 28, -2.4F, -36.4F, -56.103F, 1, 1, 3, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 137, 32, -1.6F, -36.4F, -56.104F, 1, 1, 3, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 147, 32, -2.002F, -36.0F, -56.1F, 1, 1, 3, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 178, 40, -1.6F, -36.2F, -49.1F, 1, 1, 1, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 167, 20, -2.0F, -36.8F, -56.102F, 1, 1, 3, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 178, 42, -1.8F, -36.0F, -49.1F, 1, 1, 1, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 158, 24, -2.0F, -35.9F, -49.1F, 1, 1, 1, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 162, 24, -2.2F, -36.0F, -49.1F, 1, 1, 1, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 132, 25, -2.4F, -36.2F, -49.1F, 1, 1, 1, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 136, 25, -2.5F, -36.4F, -49.1F, 1, 1, 1, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 117, 26, -2.4F, -36.6F, -49.1F, 1, 1, 1, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 181, 0, -1.6F, -36.6F, -49.1F, 1, 1, 1, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 181, 3, -1.5F, -36.4F, -49.1F, 1, 1, 1, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 124, 26, -1.8F, -36.8F, -49.1F, 1, 1, 1, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 181, 23, -2.2F, -36.8F, -49.1F, 1, 1, 1, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 181, 25, -2.0F, -36.9F, -49.1F, 1, 1, 1, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 137, 9, -2.2F, -36.2F, -56.1F, 1, 1, 8, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 137, 19, -1.8F, -36.2F, -56.1F, 1, 1, 8, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 138, 30, -1.8F, -36.6F, -55.1F, 1, 1, 7, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 142, 19, -2.2F, -36.6F, -54.1F, 1, 1, 6, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 137, 28, -1.7F, -36.4F, -56.1F, 1, 1, 8, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 164, 8, -2.3F, -36.4F, -56.1F, 1, 1, 8, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 158, 18, -2.0F, -36.1F, -56.1F, 1, 1, 8, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 132, 19, -2.0F, -36.7F, -56.1F, 1, 1, 8, 0.0F, false));

		gun295_r1 = new ModelRenderer(this);
		gun295_r1.setRotationPoint(0.0847F, -38.6892F, -80.2F);
		action.addChild(gun295_r1);
		setRotationAngle(gun295_r1, 0.0F, 0.0F, -1.0472F);
		gun295_r1.cubeList.add(new ModelBox(gun295_r1, 194, 50, -0.6F, -3.5F, -1.0F, 1, 1, 2, -0.4F, false));
		gun295_r1.cubeList.add(new ModelBox(gun295_r1, 194, 50, -0.8F, -3.5F, -1.0F, 1, 1, 2, -0.4F, false));
		gun295_r1.cubeList.add(new ModelBox(gun295_r1, 194, 50, -1.0F, -3.5F, -1.0F, 1, 1, 2, -0.4F, false));

		gun294_r1 = new ModelRenderer(this);
		gun294_r1.setRotationPoint(-0.1866F, -38.5696F, -80.2F);
		action.addChild(gun294_r1);
		setRotationAngle(gun294_r1, 0.0F, 0.0F, -1.0472F);
		gun294_r1.cubeList.add(new ModelBox(gun294_r1, 194, 50, -0.6F, -0.5F, -1.0F, 1, 1, 2, -0.4F, false));
		gun294_r1.cubeList.add(new ModelBox(gun294_r1, 194, 50, -0.8F, -0.5F, -1.0F, 1, 1, 2, -0.4F, false));
		gun294_r1.cubeList.add(new ModelBox(gun294_r1, 194, 50, -1.0F, -0.5F, -1.0F, 1, 1, 2, -0.4F, false));

		gun294_r2 = new ModelRenderer(this);
		gun294_r2.setRotationPoint(-4.8167F, -37.6892F, -80.2F);
		action.addChild(gun294_r2);
		setRotationAngle(gun294_r2, 0.0F, 0.0F, 1.0472F);
		gun294_r2.cubeList.add(new ModelBox(gun294_r2, 194, 50, -0.4F, -5.5F, -1.0F, 1, 1, 2, -0.4F, false));
		gun294_r2.cubeList.add(new ModelBox(gun294_r2, 194, 50, -0.2F, -5.5F, -1.0F, 1, 1, 2, -0.4F, false));
		gun294_r2.cubeList.add(new ModelBox(gun294_r2, 194, 50, 0.0F, -5.5F, -1.0F, 1, 1, 2, -0.4F, false));

		gun293_r1 = new ModelRenderer(this);
		gun293_r1.setRotationPoint(-4.5454F, -37.5696F, -80.2F);
		action.addChild(gun293_r1);
		setRotationAngle(gun293_r1, 0.0F, 0.0F, 1.0472F);
		gun293_r1.cubeList.add(new ModelBox(gun293_r1, 194, 50, -0.4F, -2.5F, -1.0F, 1, 1, 2, -0.4F, false));
		gun293_r1.cubeList.add(new ModelBox(gun293_r1, 194, 50, -0.2F, -2.5F, -1.0F, 1, 1, 2, -0.4F, false));
		gun293_r1.cubeList.add(new ModelBox(gun293_r1, 194, 50, 0.0F, -2.5F, -1.0F, 1, 1, 2, -0.4F, false));

		gun331_r1 = new ModelRenderer(this);
		gun331_r1.setRotationPoint(-1.5F, -32.9F, -86.1005F);
		action.addChild(gun331_r1);
		setRotationAngle(gun331_r1, 0.0F, 1.5708F, 0.0F);
		gun331_r1.cubeList.add(new ModelBox(gun331_r1, 143, 13, 1.6F, -0.9F, -0.9995F, 1, 1, 2, 0.7F, false));
		gun331_r1.cubeList.add(new ModelBox(gun331_r1, 170, 31, 1.7F, -1.1F, -0.9995F, 1, 1, 2, 0.7F, false));
		gun331_r1.cubeList.add(new ModelBox(gun331_r1, 157, 17, 1.9F, -1.3F, -0.9995F, 1, 1, 2, 0.7F, false));
		gun331_r1.cubeList.add(new ModelBox(gun331_r1, 157, 20, 2.1F, -1.4F, -1.0005F, 1, 1, 2, 0.7F, false));
		gun331_r1.cubeList.add(new ModelBox(gun331_r1, 141, 18, 2.3F, -1.3F, -0.9995F, 1, 1, 2, 0.7F, false));
		gun331_r1.cubeList.add(new ModelBox(gun331_r1, 132, 18, 2.6F, -0.9F, -0.9995F, 1, 1, 2, 0.7F, false));
		gun331_r1.cubeList.add(new ModelBox(gun331_r1, 173, 17, 2.5F, -1.1F, -0.9995F, 1, 1, 2, 0.7F, false));
		gun331_r1.cubeList.add(new ModelBox(gun331_r1, 173, 10, 2.5F, -0.7F, -0.9995F, 1, 1, 2, 0.7F, false));
		gun331_r1.cubeList.add(new ModelBox(gun331_r1, 167, 17, 2.1F, -0.4F, -0.9995F, 1, 1, 2, 0.7F, false));
		gun331_r1.cubeList.add(new ModelBox(gun331_r1, 173, 7, 2.3F, -0.5F, -0.9995F, 1, 1, 2, 0.7F, false));
		gun331_r1.cubeList.add(new ModelBox(gun331_r1, 163, 2, 1.9F, -0.5F, -0.9995F, 1, 1, 2, 0.7F, false));
		gun331_r1.cubeList.add(new ModelBox(gun331_r1, 124, 49, 1.7F, -0.7F, -0.9995F, 1, 1, 2, 0.7F, false));
		gun331_r1.cubeList.add(new ModelBox(gun331_r1, 124, 49, -1.7F, -0.7F, -0.9995F, 1, 1, 2, 0.7F, false));
		gun331_r1.cubeList.add(new ModelBox(gun331_r1, 163, 2, -1.5F, -0.5F, -0.9995F, 1, 1, 2, 0.7F, false));
		gun331_r1.cubeList.add(new ModelBox(gun331_r1, 173, 7, -1.1F, -0.5F, -0.9995F, 1, 1, 2, 0.7F, false));
		gun331_r1.cubeList.add(new ModelBox(gun331_r1, 167, 17, -1.3F, -0.4F, -0.9995F, 1, 1, 2, 0.7F, false));
		gun331_r1.cubeList.add(new ModelBox(gun331_r1, 173, 10, -0.9F, -0.7F, -0.9995F, 1, 1, 2, 0.7F, false));
		gun331_r1.cubeList.add(new ModelBox(gun331_r1, 173, 17, -0.9F, -1.1F, -0.9995F, 1, 1, 2, 0.7F, false));
		gun331_r1.cubeList.add(new ModelBox(gun331_r1, 132, 18, -0.8F, -0.9F, -0.9995F, 1, 1, 2, 0.7F, false));
		gun331_r1.cubeList.add(new ModelBox(gun331_r1, 141, 18, -1.1F, -1.3F, -0.9995F, 1, 1, 2, 0.7F, false));
		gun331_r1.cubeList.add(new ModelBox(gun331_r1, 157, 20, -1.3F, -1.4F, -1.0005F, 1, 1, 2, 0.7F, false));
		gun331_r1.cubeList.add(new ModelBox(gun331_r1, 157, 17, -1.5F, -1.3F, -0.9995F, 1, 1, 2, 0.7F, false));
		gun331_r1.cubeList.add(new ModelBox(gun331_r1, 170, 31, -1.7F, -1.1F, -0.9995F, 1, 1, 2, 0.7F, false));
		gun331_r1.cubeList.add(new ModelBox(gun331_r1, 143, 13, -1.8F, -0.9F, -0.9995F, 1, 1, 2, 0.7F, false));

		action17 = new ModelRenderer(this);
		action17.setRotationPoint(-5.8F, -36.3F, -32.0F);
		action.addChild(action17);
		setRotationAngle(action17, 0.0F, 2.6025F, 0.0F);
		action17.cubeList.add(new ModelBox(action17, 169, 34, 1.5401F, 0.0F, 2.5745F, 1, 1, 1, 0.0F, false));

		action16 = new ModelRenderer(this);
		action16.setRotationPoint(-3.8F, -36.5F, -32.8F);
		action.addChild(action16);
		setRotationAngle(action16, 0.0F, 0.0F, 1.3384F);
		action16.cubeList.add(new ModelBox(action16, 169, 39, 0.0F, 0.0F, -3.0F, 1, 1, 1, 0.0F, false));

		action15 = new ModelRenderer(this);
		action15.setRotationPoint(-3.8F, -36.3F, -31.5F);
		action.addChild(action15);
		setRotationAngle(action15, 0.0F, 2.7512F, 0.0F);
		action15.cubeList.add(new ModelBox(action15, 169, 43, 1.1417F, 0.0F, 2.7743F, 1, 1, 1, 0.0F, false));

		action14 = new ModelRenderer(this);
		action14.setRotationPoint(-3.8F, -36.3F, -31.6F);
		action.addChild(action14);
		setRotationAngle(action14, 0.0F, 2.9743F, 0.0F);
		action14.cubeList.add(new ModelBox(action14, 134, 26, 0.4995F, -0.001F, 2.9581F, 2, 1, 1, 0.0F, false));

		action12 = new ModelRenderer(this);
		action12.setRotationPoint(-3.8F, -36.2F, -33.5F);
		action.addChild(action12);
		action12.cubeList.add(new ModelBox(action12, 134, 51, 0.0F, 0.0F, -3.0F, 1, 1, 2, 0.0F, false));

		action11 = new ModelRenderer(this);
		action11.setRotationPoint(-3.8F, -36.5F, -33.5F);
		action.addChild(action11);
		action11.cubeList.add(new ModelBox(action11, 143, 52, -0.001F, 0.0F, -2.301F, 1, 1, 1, 0.0F, false));

		action10 = new ModelRenderer(this);
		action10.setRotationPoint(-3.3F, -37.0F, -25.5F);
		action.addChild(action10);
		setRotationAngle(action10, 0.0F, 0.0F, -2.1564F);
		

		action9 = new ModelRenderer(this);
		action9.setRotationPoint(-3.5F, -37.0F, -33.5F);
		action.addChild(action9);
		setRotationAngle(action9, 0.0F, 0.0F, -2.1564F);
		action9.cubeList.add(new ModelBox(action9, 144, 1, -1.4167F, -0.2764F, -3.0F, 1, 1, 18, 0.0F, false));

		action2 = new ModelRenderer(this);
		action2.setRotationPoint(-3.5F, -37.0F, -33.5F);
		action.addChild(action2);
		action2.cubeList.add(new ModelBox(action2, 124, 1, 0.0F, 0.5F, -3.0F, 2, 2, 18, 0.0F, false));

		action3 = new ModelRenderer(this);
		action3.setRotationPoint(-0.5F, -37.0F, -33.5F);
		action.addChild(action3);
		action3.cubeList.add(new ModelBox(action3, 132, 49, -2.1666F, -0.0527F, -3.0F, 2, 1, 17, 0.0F, false));
		action3.cubeList.add(new ModelBox(action3, 132, 49, -0.8334F, -0.0527F, -3.001F, 1, 1, 17, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		action.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}