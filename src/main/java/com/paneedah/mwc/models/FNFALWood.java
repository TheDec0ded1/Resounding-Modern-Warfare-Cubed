package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class FNFALWood extends ModelWithAttachments {
	private final ModelRenderer gun;
	private final ModelRenderer bone65;
	private final ModelRenderer bone84;
	private final ModelRenderer bone78;
	private final ModelRenderer bone79;
	private final ModelRenderer bone85;
	private final ModelRenderer bone88;
	private final ModelRenderer bone5;
	private final ModelRenderer bone6;
	private final ModelRenderer bone8;
	private final ModelRenderer bone11;
	private final ModelRenderer bone71;
	private final ModelRenderer bone83;
	private final ModelRenderer bone72;
	private final ModelRenderer bone81;
	private final ModelRenderer bone19;
	private final ModelRenderer bone25;
	private final ModelRenderer bone62;
	private final ModelRenderer bone90;
	private final ModelRenderer bone91;
	private final ModelRenderer bone66;
	private final ModelRenderer bone67;
	private final ModelRenderer bone68;
	private final ModelRenderer bone69;
	private final ModelRenderer bone70;
	private final ModelRenderer bone73;
	private final ModelRenderer bone75;
	private final ModelRenderer bone77;
	private final ModelRenderer bone76;
	private final ModelRenderer bone80;
	private final ModelRenderer bone82;
	private final ModelRenderer trigger;
	private final ModelRenderer bone20;
	private final ModelRenderer bone21;
	private final ModelRenderer bone22;
	private final ModelRenderer bone24;
	private final ModelRenderer bone23;
	private final ModelRenderer bone2;
	private final ModelRenderer bone;
	private final ModelRenderer bone4;
	private final ModelRenderer bone3;
	private final ModelRenderer mainbarrel;
	private final ModelRenderer barrel;
	private final ModelRenderer mainbarrel2;
	private final ModelRenderer barrel2;

	public FNFALWood() {
		textureWidth = 400;
		textureHeight = 400;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.25F, -15.75F, 15.5F);
		gun.cubeList.add(new ModelBox(gun, 130, 45, -2.749F, 4.798F, -45.5533F, 3, 2, 11, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 57, 34, -2.75F, -1.7087F, -48.1436F, 2, 5, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 51, 8, -2.75F, 0.5894F, -48.1436F, 2, 5, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 63, 68, -1.8265F, 0.0653F, -48.1436F, 2, 4, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 13, 68, -3.6735F, 0.0653F, -48.1436F, 2, 4, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 33, 18, -2.75F, -1.4587F, -15.1436F, 2, 8, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 184, 189, -0.2653F, 1.4454F, -48.1436F, 1, 2, 33, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 222, 0, -0.265F, 2.8454F, -48.1436F, 1, 1, 33, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 23, 54, -0.265F, 3.9454F, -34.3436F, 1, 2, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 23, 25, -4.25F, 2.9454F, -34.3436F, 1, 3, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 42, 46, -0.465F, 4.9454F, -31.8436F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 42, 38, -3.965F, 4.9454F, -31.8436F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 55, 222, -4.227F, 2.8454F, -48.1436F, 1, 1, 33, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 126, 68, -4.227F, 1.8454F, -44.1436F, 1, 1, 9, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 24, 99, -0.4653F, 4.1454F, -31.1436F, 1, 1, 16, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 33, 34, -3.9653F, 4.1454F, -31.1436F, 1, 1, 16, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 52, 131, -4.2347F, 1.4454F, -35.1436F, 1, 2, 20, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 16, 57, -4.2347F, 1.4454F, -48.1436F, 1, 2, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 6, 0, -5.6989F, 2.552F, -47.1436F, 1, 3, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 12, 244, -5.4489F, 5.052F, -45.6436F, 1, 1, 14, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 80, 12, -5.6989F, 5.302F, -45.6436F, 1, 1, 14, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 146, 242, -5.9489F, 5.052F, -45.6436F, 1, 1, 14, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 243, 106, -6.1989F, 4.802F, -45.6436F, 1, 1, 14, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 14, 82, -5.1989F, 4.802F, -45.6436F, 1, 1, 14, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 17, 243, -5.4489F, 4.552F, -45.6436F, 1, 1, 14, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 81, 11, -5.9489F, 4.552F, -45.6436F, 1, 1, 14, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 242, 107, -5.6989F, 4.302F, -45.6436F, 1, 1, 14, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 75, 8, -5.6989F, 4.552F, -46.1436F, 1, 1, 1, 0.0F, false));

		bone65 = new ModelRenderer(this);
		bone65.setRotationPoint(0.0F, -0.9587F, -15.1436F);
		gun.addChild(bone65);
		setRotationAngle(bone65, -0.1047F, 0.0F, 0.0F);
		bone65.cubeList.add(new ModelBox(bone65, 77, 74, -1.5F, 0.0F, 0.0F, 1, 2, 4, 0.0F, false));
		bone65.cubeList.add(new ModelBox(bone65, 69, 60, -2.65F, -1.2536F, -0.0312F, 1, 2, 4, 0.0F, false));
		bone65.cubeList.add(new ModelBox(bone65, 69, 41, -1.9F, -1.2543F, -0.0312F, 1, 2, 4, 0.0F, false));
		bone65.cubeList.add(new ModelBox(bone65, 61, 29, -2.05F, -1.2383F, 3.7756F, 1, 1, 1, 0.0F, false));
		bone65.cubeList.add(new ModelBox(bone65, 55, 34, -2.45F, -1.2393F, 3.7766F, 1, 1, 1, 0.0F, false));
		bone65.cubeList.add(new ModelBox(bone65, 26, 61, -2.25F, -0.5361F, 3.7435F, 1, 1, 1, 0.0F, false));
		bone65.cubeList.add(new ModelBox(bone65, 77, 68, -3.0F, 0.0F, 0.0F, 1, 2, 4, 0.0F, false));

		bone84 = new ModelRenderer(this);
		bone84.setRotationPoint(0.735F, 5.9454F, -34.3436F);
		gun.addChild(bone84);
		setRotationAngle(bone84, 0.7854F, 0.0F, 0.0F);
		bone84.cubeList.add(new ModelBox(bone84, 0, 34, -0.999F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));
		bone84.cubeList.add(new ModelBox(bone84, 48, 51, -0.999F, 0.1213F, 2.1214F, 1, 2, 3, 0.0F, false));
		bone84.cubeList.add(new ModelBox(bone84, 49, 18, -4.984F, 0.1213F, 2.1214F, 1, 2, 3, 0.0F, false));
		bone84.cubeList.add(new ModelBox(bone84, 33, 42, -4.984F, -2.0F, 0.0F, 1, 2, 2, 0.0F, false));
		bone84.cubeList.add(new ModelBox(bone84, 33, 46, -1.199F, 2.182F, 3.182F, 1, 1, 2, 0.0F, false));
		bone84.cubeList.add(new ModelBox(bone84, 25, 42, -4.699F, 2.182F, 3.182F, 1, 1, 2, 0.0F, false));

		bone78 = new ModelRenderer(this);
		bone78.setRotationPoint(0.735F, 3.9454F, -48.1436F);
		gun.addChild(bone78);
		setRotationAngle(bone78, 0.0F, 0.0F, 0.576F);
		bone78.cubeList.add(new ModelBox(bone78, 219, 219, -1.0545F, -0.0839F, 0.0F, 1, 1, 33, 0.0F, false));

		bone79 = new ModelRenderer(this);
		bone79.setRotationPoint(-4.265F, 3.9454F, -48.1436F);
		gun.addChild(bone79);
		setRotationAngle(bone79, 0.0F, 0.0F, -0.576F);
		bone79.cubeList.add(new ModelBox(bone79, 190, 154, 0.0915F, -0.0839F, 0.0F, 1, 1, 33, 0.0F, false));

		bone85 = new ModelRenderer(this);
		bone85.setRotationPoint(1.085F, 3.9454F, -48.1436F);
		gun.addChild(bone85);
		setRotationAngle(bone85, 0.0F, 0.0F, -0.5934F);
		bone85.cubeList.add(new ModelBox(bone85, 98, 153, -1.0F, -1.0F, 0.0F, 1, 1, 18, 0.0F, false));

		bone88 = new ModelRenderer(this);
		bone88.setRotationPoint(0.485F, 2.7454F, -48.1436F);
		gun.addChild(bone88);
		setRotationAngle(bone88, 0.0F, 0.0F, 0.7505F);
		bone88.cubeList.add(new ModelBox(bone88, 130, 23, -1.0F, -1.0F, 0.0F, 1, 1, 20, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-0.25F, 8.298F, -30.8533F);
		gun.addChild(bone5);
		setRotationAngle(bone5, -0.829F, 0.0F, 0.0F);
		bone5.cubeList.add(new ModelBox(bone5, 33, 0, -3.501F, -1.7439F, -5.6273F, 4, 5, 4, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-0.25F, 5.8785F, -45.4679F);
		gun.addChild(bone6);
		setRotationAngle(bone6, -1.2217F, 0.0F, 0.0F);
		bone6.cubeList.add(new ModelBox(bone6, 33, 9, -3.5F, -1.5855F, -2.2349F, 4, 2, 3, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-1.75F, 5.048F, -50.3533F);
		gun.addChild(bone8);
		setRotationAngle(bone8, -0.0175F, 0.7854F, 0.0F);
		bone8.cubeList.add(new ModelBox(bone8, 77, 76, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(-0.25F, -0.5F, -29.5F);
		gun.addChild(bone11);
		setRotationAngle(bone11, -0.0087F, 0.0F, 0.0F);
		

		bone71 = new ModelRenderer(this);
		bone71.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone11.addChild(bone71);
		bone71.cubeList.add(new ModelBox(bone71, 53, 42, -0.7F, 1.2914F, 14.3455F, 1, 4, 4, 0.0F, false));
		bone71.cubeList.add(new ModelBox(bone71, 69, 29, -0.4F, 0.9914F, 14.3429F, 1, 8, 2, 0.0F, false));
		bone71.cubeList.add(new ModelBox(bone71, 10, 34, -0.399F, 5.2993F, 13.4281F, 1, 2, 1, 0.0F, false));
		bone71.cubeList.add(new ModelBox(bone71, 10, 54, -0.399F, 4.987F, 15.8429F, 1, 4, 1, 0.0F, false));
		bone71.cubeList.add(new ModelBox(bone71, 33, 51, -3.3F, 1.2914F, 14.3455F, 1, 4, 4, 0.0F, false));

		bone83 = new ModelRenderer(this);
		bone83.setRotationPoint(0.6F, 4.9532F, 16.8439F);
		bone71.addChild(bone83);
		setRotationAngle(bone83, 1.693F, 0.0F, 0.0F);
		bone83.cubeList.add(new ModelBox(bone83, 33, 59, -0.999F, -1.0F, 0.0F, 1, 1, 4, 0.0F, false));

		bone72 = new ModelRenderer(this);
		bone72.setRotationPoint(0.3F, 1.2752F, 14.3117F);
		bone71.addChild(bone72);
		setRotationAngle(bone72, 0.0F, 0.0F, -0.925F);
		bone72.cubeList.add(new ModelBox(bone72, 63, 75, -1.0F, -1.0F, 0.0F, 1, 1, 4, 0.0F, false));

		bone81 = new ModelRenderer(this);
		bone81.setRotationPoint(-3.3F, 1.2752F, 14.3117F);
		bone71.addChild(bone81);
		setRotationAngle(bone81, 0.0F, 0.0F, 0.925F);
		bone81.cubeList.add(new ModelBox(bone81, 69, 6, 0.0F, -1.0F, 0.0F, 1, 1, 4, 0.0F, false));

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(-0.25F, 7.4924F, -11.5F);
		gun.addChild(bone19);
		setRotationAngle(bone19, 0.0785F, 0.0F, 0.0F);
		bone19.cubeList.add(new ModelBox(bone19, 130, 0, -3.5F, -4.5F, -21.0F, 4, 5, 18, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 0, 34, -2.699F, -3.5F, -3.0F, 3, 4, 4, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 16, 49, -3.299F, -3.5F, -3.0F, 1, 4, 4, 0.0F, false));

		bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(-3.25F, 10.2042F, -36.4637F);
		gun.addChild(bone25);
		setRotationAngle(bone25, -0.2618F, 0.0F, 0.0F);
		bone25.cubeList.add(new ModelBox(bone25, 0, 68, -0.502F, -5.727F, -9.7246F, 1, 6, 11, 0.0F, false));

		bone62 = new ModelRenderer(this);
		bone62.setRotationPoint(-0.9691F, -1.402F, -30.1565F);
		gun.addChild(bone62);
		setRotationAngle(bone62, 0.0F, 0.0F, -0.48F);
		bone62.cubeList.add(new ModelBox(bone62, 60, 0, -0.6641F, -0.1708F, -17.9871F, 1, 2, 2, 0.0F, false));
		bone62.cubeList.add(new ModelBox(bone62, 26, 20, -0.6641F, -0.1708F, -15.9871F, 1, 4, 1, 0.0F, false));

		bone90 = new ModelRenderer(this);
		bone90.setRotationPoint(0.297F, 3.4707F, -16.9871F);
		bone62.addChild(bone90);
		setRotationAngle(bone90, -0.6109F, 0.0F, 0.0F);
		bone90.cubeList.add(new ModelBox(bone90, 33, 0, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		bone91 = new ModelRenderer(this);
		bone91.setRotationPoint(0.297F, 3.4707F, -13.9871F);
		bone62.addChild(bone91);
		setRotationAngle(bone91, 0.6109F, 0.0F, 0.0F);
		bone91.cubeList.add(new ModelBox(bone91, 26, 0, -1.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F, false));

		bone66 = new ModelRenderer(this);
		bone66.setRotationPoint(-1.1332F, -0.5729F, -46.6436F);
		gun.addChild(bone66);
		setRotationAngle(bone66, 0.0F, 0.0F, 0.48F);
		bone66.cubeList.add(new ModelBox(bone66, 39, 59, -1.9586F, -0.2609F, -1.5F, 1, 2, 2, 0.0F, false));
		bone66.cubeList.add(new ModelBox(bone66, 26, 15, -1.9586F, -0.2609F, 0.5F, 1, 4, 1, 0.0F, false));

		bone67 = new ModelRenderer(this);
		bone67.setRotationPoint(0.8668F, 1.4271F, -46.6436F);
		gun.addChild(bone67);
		setRotationAngle(bone67, 0.0F, 0.0F, -1.0908F);
		bone67.cubeList.add(new ModelBox(bone67, 190, 119, -1.0772F, -2.1088F, -1.5F, 1, 2, 33, 0.0F, false));

		bone68 = new ModelRenderer(this);
		bone68.setRotationPoint(0.8668F, 5.4271F, -46.6436F);
		gun.addChild(bone68);
		setRotationAngle(bone68, 0.0F, 0.0F, 1.0908F);
		bone68.cubeList.add(new ModelBox(bone68, 33, 0, -1.8164F, -0.5579F, -1.5F, 1, 2, 16, 0.0F, false));

		bone69 = new ModelRenderer(this);
		bone69.setRotationPoint(-1.1332F, 7.4271F, -46.6436F);
		gun.addChild(bone69);
		setRotationAngle(bone69, 0.0F, 0.0F, 0.48F);
		bone69.cubeList.add(new ModelBox(bone69, 69, 14, -1.5087F, -3.807F, -1.5F, 1, 2, 3, 0.0F, false));

		bone70 = new ModelRenderer(this);
		bone70.setRotationPoint(-0.9691F, -1.402F, -30.1565F);
		gun.addChild(bone70);
		setRotationAngle(bone70, 0.0F, 0.0F, -0.48F);
		bone70.cubeList.add(new ModelBox(bone70, 59, 18, -4.808F, 3.3791F, -17.9871F, 1, 2, 3, 0.0F, false));

		bone73 = new ModelRenderer(this);
		bone73.setRotationPoint(-0.5F, 14.248F, -21.1533F);
		gun.addChild(bone73);
		setRotationAngle(bone73, 1.309F, 0.0F, 0.0F);
		bone73.cubeList.add(new ModelBox(bone73, 39, 51, 0.25F, -5.3437F, 5.0508F, 1, 2, 2, 0.0F, false));
		bone73.cubeList.add(new ModelBox(bone73, 16, 0, 0.0F, -6.874F, 5.5811F, 1, 2, 1, 0.0F, false));
		bone73.cubeList.add(new ModelBox(bone73, 75, 34, 0.25F, -7.5205F, 5.5811F, 1, 1, 1, 0.0F, false));

		bone75 = new ModelRenderer(this);
		bone75.setRotationPoint(-4.3668F, 1.4271F, -46.6436F);
		gun.addChild(bone75);
		setRotationAngle(bone75, 0.0F, 0.0F, 1.0908F);
		bone75.cubeList.add(new ModelBox(bone75, 98, 131, 0.0772F, -2.1088F, 11.5F, 1, 2, 20, 0.0F, false));
		bone75.cubeList.add(new ModelBox(bone75, 69, 0, 0.0772F, -2.1088F, -1.5F, 1, 2, 4, 0.0F, false));

		bone77 = new ModelRenderer(this);
		bone77.setRotationPoint(-4.0F, 6.048F, -31.8533F);
		gun.addChild(bone77);
		setRotationAngle(bone77, -0.7854F, 0.0F, 0.0F);
		bone77.cubeList.add(new ModelBox(bone77, 75, 62, 0.0F, -0.6768F, 1.7374F, 1, 1, 1, 0.0F, false));
		bone77.cubeList.add(new ModelBox(bone77, 75, 41, 3.5F, -0.3939F, 1.4546F, 1, 1, 1, 0.0F, false));
		bone77.cubeList.add(new ModelBox(bone77, 75, 60, 0.0F, -1.5607F, 3.682F, 1, 1, 1, 0.0F, false));
		bone77.cubeList.add(new ModelBox(bone77, 75, 36, 3.5F, -1.2778F, 3.3991F, 1, 1, 1, 0.0F, false));
		bone77.cubeList.add(new ModelBox(bone77, 59, 23, 0.75F, -17.6827F, 7.6418F, 3, 1, 1, 0.0F, false));
		bone77.cubeList.add(new ModelBox(bone77, 42, 34, 3.5F, -16.6927F, 9.056F, 1, 2, 2, 0.0F, false));
		bone77.cubeList.add(new ModelBox(bone77, 75, 6, 0.0F, -12.1673F, 11.4602F, 1, 1, 1, 0.0F, false));
		bone77.cubeList.add(new ModelBox(bone77, 75, 2, 3.5F, -12.8744F, 12.1673F, 1, 1, 1, 0.0F, false));
		bone77.cubeList.add(new ModelBox(bone77, 75, 43, 0.0F, -4.2123F, 5.273F, 1, 1, 1, 0.0F, false));

		bone76 = new ModelRenderer(this);
		bone76.setRotationPoint(-0.5F, 6.048F, -32.0533F);
		gun.addChild(bone76);
		setRotationAngle(bone76, -0.7854F, 0.0F, 0.0F);
		bone76.cubeList.add(new ModelBox(bone76, 51, 0, 0.0F, 0.5607F, -0.5F, 1, 2, 2, 0.0F, false));
		bone76.cubeList.add(new ModelBox(bone76, 42, 42, -3.5F, 0.5607F, -0.5F, 1, 2, 2, 0.0F, false));

		bone80 = new ModelRenderer(this);
		bone80.setRotationPoint(-1.3832F, -0.5729F, -47.6436F);
		gun.addChild(bone80);
		setRotationAngle(bone80, 0.0F, 0.0F, 0.5236F);
		bone80.cubeList.add(new ModelBox(bone80, 26, 9, -2.1751F, -0.1359F, 0.5F, 1, 5, 1, 0.0F, false));

		bone82 = new ModelRenderer(this);
		bone82.setRotationPoint(-1.2191F, -1.652F, -40.1565F);
		gun.addChild(bone82);
		setRotationAngle(bone82, -0.0087F, 0.0F, 0.3491F);
		bone82.cubeList.add(new ModelBox(bone82, 0, 0, -1.5893F, 1.0768F, -4.9733F, 1, 3, 1, 0.0F, false));

		trigger = new ModelRenderer(this);
		trigger.setRotationPoint(-0.25F, 39.75F, -15.5F);
		gun.addChild(trigger);
		trigger.cubeList.add(new ModelBox(trigger, 33, 34, -2.5F, -31.452F, -17.9524F, 2, 4, 1, 0.0F, false));
		trigger.cubeList.add(new ModelBox(trigger, 24, 34, -3.5F, -32.952F, -19.8024F, 1, 4, 2, 0.0F, false));
		trigger.cubeList.add(new ModelBox(trigger, 10, 49, -3.502F, -32.952F, -18.3024F, 1, 4, 1, 0.0F, false));
		trigger.cubeList.add(new ModelBox(trigger, 16, 34, -0.5F, -32.952F, -19.8024F, 1, 4, 2, 0.0F, false));
		trigger.cubeList.add(new ModelBox(trigger, 58, 60, -3.0F, -30.952F, -12.1033F, 3, 3, 1, 0.0F, false));
		trigger.cubeList.add(new ModelBox(trigger, 49, 27, -3.0F, -27.6008F, -14.5779F, 3, 1, 2, 0.0F, false));
		trigger.cubeList.add(new ModelBox(trigger, 10, 28, -3.0F, -27.6008F, -16.3279F, 3, 1, 2, 0.0F, false));
		trigger.cubeList.add(new ModelBox(trigger, 79, 81, -2.05F, -31.2434F, -14.0084F, 1, 1, 1, 0.0F, false));

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(0.0F, -8.75F, -4.0F);
		trigger.addChild(bone20);
		bone20.cubeList.add(new ModelBox(bone20, 49, 23, -3.0F, -21.202F, -13.8024F, 3, 2, 1, 0.0F, false));

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(-1.5F, -30.452F, -15.8024F);
		trigger.addChild(bone21);
		setRotationAngle(bone21, -1.0472F, 0.0F, 0.0F);
		bone21.cubeList.add(new ModelBox(bone21, 59, 42, -1.5F, -1.0179F, -0.567F, 3, 3, 1, 0.0F, false));

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(-1.25F, -30.702F, -18.5524F);
		trigger.addChild(bone22);
		setRotationAngle(bone22, 0.0F, 0.0F, -0.2182F);
		bone22.cubeList.add(new ModelBox(bone22, 61, 11, -1.0F, -1.5F, -0.5F, 2, 3, 1, 0.0F, false));

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(-0.25F, -30.702F, -19.0524F);
		trigger.addChild(bone24);
		setRotationAngle(bone24, -0.1309F, 0.0F, 0.0F);
		bone24.cubeList.add(new ModelBox(bone24, 75, 29, -2.25F, -2.5326F, -0.2521F, 1, 4, 1, 0.0F, false));

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(0.75F, -30.702F, -18.5524F);
		trigger.addChild(bone23);
		setRotationAngle(bone23, 0.0F, 0.0F, 0.0873F);
		bone23.cubeList.add(new ModelBox(bone23, 33, 39, -1.5F, 0.5F, -0.5F, 2, 1, 1, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.2F, -23.848F, -11.8033F);
		trigger.addChild(bone2);
		setRotationAngle(bone2, 0.829F, 0.0F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 48, 56, -3.2F, -7.1957F, -1.0271F, 3, 2, 1, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.2F, -25.152F, -11.8033F);
		trigger.addChild(bone);
		setRotationAngle(bone, -0.829F, 0.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 58, 8, -3.2F, -2.4077F, -2.5915F, 3, 2, 1, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.2F, -29.902F, -13.5533F);
		trigger.addChild(bone4);
		setRotationAngle(bone4, -1.0472F, 0.0F, 0.0F);
		bone4.cubeList.add(new ModelBox(bone4, 78, 65, -2.25F, 0.7716F, 0.391F, 1, 1, 1, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.2F, -29.902F, -13.5533F);
		trigger.addChild(bone3);
		setRotationAngle(bone3, -0.2618F, 0.0F, 0.0F);
		bone3.cubeList.add(new ModelBox(bone3, 69, 41, -2.25F, -0.4708F, -0.562F, 1, 2, 1, 0.0F, false));

		mainbarrel = new ModelRenderer(this);
		mainbarrel.setRotationPoint(-1.5F, 3.75F, -94.5F);
		gun.addChild(mainbarrel);
		

		barrel = new ModelRenderer(this);
		barrel.setRotationPoint(0.0F, 0.0F, 0.0F);
		mainbarrel.addChild(barrel);
		barrel.cubeList.add(new ModelBox(barrel, 0, 130, -0.5F, -1.5F, -10.0F, 1, 1, 50, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 126, 60, -0.25F, -1.25F, -22.0F, 1, 1, 58, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 0, 68, -1.25F, -1.25F, -23.0F, 1, 1, 61, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 104, 177, -0.5F, -1.0F, -22.0F, 1, 1, 38, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 0, 0, -0.75F, -1.75F, -22.0F, 1, 1, 67, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 186, 89, -0.75F, -2.0F, -31.0F, 1, 1, 22, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 33, 18, -1.25F, -3.25F, 36.0F, 2, 1, 12, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 83, 68, -0.75F, -2.0F, 0.5F, 1, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 165, 119, -0.25F, -1.75F, -31.0F, 1, 1, 22, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 33, 51, 0.25F, -2.75F, 35.0F, 1, 1, 13, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 83, 74, -0.25F, -1.75F, 0.5F, 1, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 0, 153, 0.0F, -1.25F, -31.0F, 1, 1, 22, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 69, 0, 0.5F, -2.25F, 37.0F, 1, 3, 11, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 75, 84, 0.0F, -1.25F, 0.5F, 1, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 126, 83, -0.75F, -0.5F, -31.0F, 1, 1, 22, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 69, 14, -1.25F, 0.5F, 42.0F, 2, 1, 9, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 82, 14, -0.75F, -0.5F, 0.5F, 1, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 77, 74, -0.75F, -0.25F, 1.0F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 22, 49, -0.75F, -0.25F, -12.0F, 1, 1, 3, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 69, 6, -0.75F, -2.5F, -10.0F, 1, 2, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 126, 60, -1.25F, -0.75F, -31.0F, 1, 1, 22, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 104, 177, -1.75F, 0.25F, 34.0F, 1, 1, 15, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 82, 17, -1.25F, -0.75F, 0.5F, 1, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 0, 99, -0.25F, -0.75F, -31.0F, 1, 1, 22, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 63, 68, 0.25F, 0.25F, 37.0F, 1, 1, 12, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 82, 6, -0.25F, -0.75F, 0.5F, 1, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 0, 130, -1.5F, -1.25F, -31.0F, 1, 1, 22, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 96, 68, -2.0F, -2.25F, 35.0F, 1, 3, 13, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 82, 20, -1.5F, -1.25F, 0.5F, 1, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 63, 69, -0.75F, -0.75F, -23.0F, 1, 1, 61, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 69, 0, -1.0F, -1.5F, -22.0F, 1, 1, 59, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 45, 181, -1.25F, -1.75F, -31.0F, 1, 1, 22, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 96, 84, -1.75F, -2.75F, 38.0F, 1, 1, 10, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 82, 53, -1.25F, -1.75F, 0.5F, 1, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 147, 189, -1.0F, -1.0F, -23.0F, 1, 1, 35, 0.0F, false));

		mainbarrel2 = new ModelRenderer(this);
		mainbarrel2.setRotationPoint(0.0F, -3.5F, 36.0F);
		mainbarrel.addChild(mainbarrel2);
		

		barrel2 = new ModelRenderer(this);
		barrel2.setRotationPoint(0.0F, -0.25F, 0.0F);
		mainbarrel2.addChild(barrel2);
		barrel2.cubeList.add(new ModelBox(barrel2, 58, 177, -0.5F, -1.5F, -31.0F, 1, 1, 44, 0.0F, false));
		barrel2.cubeList.add(new ModelBox(barrel2, 176, 1, -0.35F, -1.25F, -31.0F, 1, 1, 44, 0.0F, false));
		barrel2.cubeList.add(new ModelBox(barrel2, 144, 144, -1.15F, -1.25F, -31.0F, 1, 1, 44, 0.0F, false));
		barrel2.cubeList.add(new ModelBox(barrel2, 98, 132, -0.5F, -1.0F, -31.0F, 1, 1, 44, 0.0F, false));
		barrel2.cubeList.add(new ModelBox(barrel2, 186, 46, -0.75F, -1.65F, -31.0F, 1, 1, 42, 0.0F, false));
		barrel2.cubeList.add(new ModelBox(barrel2, 52, 131, -0.75F, -0.85F, -31.0F, 1, 1, 44, 0.0F, false));
		barrel2.cubeList.add(new ModelBox(barrel2, 130, 0, -1.0F, -1.5F, -31.0F, 1, 1, 44, 0.0F, false));
		barrel2.cubeList.add(new ModelBox(barrel2, 0, 181, -1.0F, -1.0F, -31.0F, 1, 1, 43, 0.0F, false));
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