package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class MP133Pump extends ModelWithAttachments {
	private final ModelRenderer pumpSawed;
	private final ModelRenderer pump27_r1;
	private final ModelRenderer pump20_r1;
	private final ModelRenderer pump19_r1;
	private final ModelRenderer pump14_r1;
	private final ModelRenderer pump11_r1;
	private final ModelRenderer pump10_r1;
	private final ModelRenderer pump9_r1;
	private final ModelRenderer pump7_r1;
	private final ModelRenderer pump6_r1;
	private final ModelRenderer pump3_r1;
	private final ModelRenderer pump1_r1;
	private final ModelRenderer pump28_r1;

	public MP133Pump() {
		textureWidth = 410;
		textureHeight = 410;

		pumpSawed = new ModelRenderer(this);
		pumpSawed.setRotationPoint(-25.908F, -11.1129F, 0.0F);
		pumpSawed.cubeList.add(new ModelBox(pumpSawed, 0, 128, 23.208F, 5.5129F, -12.0F, 1, 1, 8, 0.0F, false));
		pumpSawed.cubeList.add(new ModelBox(pumpSawed, 363, 149, 22.608F, 8.5129F, -38.5F, 1, 1, 14, 0.0F, false));
		pumpSawed.cubeList.add(new ModelBox(pumpSawed, 360, 349, 26.208F, 8.5129F, -38.5F, 1, 1, 14, 0.0F, false));
		pumpSawed.cubeList.add(new ModelBox(pumpSawed, 139, 252, 23.708F, 10.2129F, -38.5F, 1, 1, 14, 0.0F, false));
		pumpSawed.cubeList.add(new ModelBox(pumpSawed, 230, 318, 24.108F, 10.2129F, -38.5F, 2, 1, 14, 0.0F, false));
		pumpSawed.cubeList.add(new ModelBox(pumpSawed, 372, 361, 26.3716F, 8.5385F, -38.5F, 1, 1, 2, 0.1F, false));
		pumpSawed.cubeList.add(new ModelBox(pumpSawed, 242, 330, 24.108F, 10.5129F, -38.5F, 2, 1, 2, 0.1F, false));
		pumpSawed.cubeList.add(new ModelBox(pumpSawed, 151, 264, 23.708F, 10.5129F, -38.5F, 1, 1, 2, 0.1F, false));
		pumpSawed.cubeList.add(new ModelBox(pumpSawed, 375, 161, 22.4444F, 8.5384F, -38.5F, 1, 1, 2, 0.1F, false));
		pumpSawed.cubeList.add(new ModelBox(pumpSawed, 376, 162, 22.4444F, 8.5384F, -35.5F, 1, 1, 1, 0.1F, false));
		pumpSawed.cubeList.add(new ModelBox(pumpSawed, 152, 265, 23.708F, 10.5129F, -35.5F, 1, 1, 1, 0.1F, false));
		pumpSawed.cubeList.add(new ModelBox(pumpSawed, 243, 331, 24.108F, 10.5129F, -35.5F, 2, 1, 1, 0.1F, false));
		pumpSawed.cubeList.add(new ModelBox(pumpSawed, 373, 362, 26.3716F, 8.5385F, -35.5F, 1, 1, 1, 0.1F, false));
		pumpSawed.cubeList.add(new ModelBox(pumpSawed, 376, 162, 22.4444F, 8.5384F, -33.5F, 1, 1, 1, 0.1F, false));
		pumpSawed.cubeList.add(new ModelBox(pumpSawed, 152, 265, 23.708F, 10.5129F, -33.5F, 1, 1, 1, 0.1F, false));
		pumpSawed.cubeList.add(new ModelBox(pumpSawed, 243, 331, 24.108F, 10.5129F, -33.5F, 2, 1, 1, 0.1F, false));
		pumpSawed.cubeList.add(new ModelBox(pumpSawed, 373, 362, 26.3716F, 8.5385F, -33.5F, 1, 1, 1, 0.1F, false));
		pumpSawed.cubeList.add(new ModelBox(pumpSawed, 376, 162, 22.4444F, 8.5384F, -31.5F, 1, 1, 1, 0.1F, false));
		pumpSawed.cubeList.add(new ModelBox(pumpSawed, 152, 265, 23.708F, 10.5129F, -31.5F, 1, 1, 1, 0.1F, false));
		pumpSawed.cubeList.add(new ModelBox(pumpSawed, 243, 331, 24.108F, 10.5129F, -31.5F, 2, 1, 1, 0.1F, false));
		pumpSawed.cubeList.add(new ModelBox(pumpSawed, 373, 362, 26.3716F, 8.5385F, -31.5F, 1, 1, 1, 0.1F, false));
		pumpSawed.cubeList.add(new ModelBox(pumpSawed, 376, 162, 22.4444F, 8.5384F, -29.5F, 1, 1, 1, 0.1F, false));
		pumpSawed.cubeList.add(new ModelBox(pumpSawed, 152, 265, 23.708F, 10.5129F, -29.5F, 1, 1, 1, 0.1F, false));
		pumpSawed.cubeList.add(new ModelBox(pumpSawed, 243, 331, 24.108F, 10.5129F, -29.5F, 2, 1, 1, 0.1F, false));
		pumpSawed.cubeList.add(new ModelBox(pumpSawed, 373, 362, 26.3716F, 8.5385F, -29.5F, 1, 1, 1, 0.1F, false));
		pumpSawed.cubeList.add(new ModelBox(pumpSawed, 376, 162, 22.4444F, 8.5384F, -27.5F, 1, 1, 1, 0.1F, false));
		pumpSawed.cubeList.add(new ModelBox(pumpSawed, 152, 265, 23.708F, 10.5129F, -27.5F, 1, 1, 1, 0.1F, false));
		pumpSawed.cubeList.add(new ModelBox(pumpSawed, 243, 331, 24.108F, 10.5129F, -27.5F, 2, 1, 1, 0.1F, false));
		pumpSawed.cubeList.add(new ModelBox(pumpSawed, 373, 362, 26.3716F, 8.5385F, -27.5F, 1, 1, 1, 0.1F, false));
		pumpSawed.cubeList.add(new ModelBox(pumpSawed, 376, 162, 22.4444F, 8.5384F, -25.5F, 1, 1, 1, 0.1F, false));
		pumpSawed.cubeList.add(new ModelBox(pumpSawed, 152, 265, 23.708F, 10.5129F, -25.5F, 1, 1, 1, 0.1F, false));
		pumpSawed.cubeList.add(new ModelBox(pumpSawed, 243, 331, 24.108F, 10.5129F, -25.5F, 2, 1, 1, 0.1F, false));
		pumpSawed.cubeList.add(new ModelBox(pumpSawed, 373, 362, 26.3716F, 8.5385F, -25.5F, 1, 1, 1, 0.1F, false));

		pump27_r1 = new ModelRenderer(this);
		pump27_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		pumpSawed.addChild(pump27_r1);
		setRotationAngle(pump27_r1, 0.0F, 0.0F, 1.7846F);
		

		pump20_r1 = new ModelRenderer(this);
		pump20_r1.setRotationPoint(27.0234F, -18.1182F, 0.0F);
		pumpSawed.addChild(pump20_r1);
		setRotationAngle(pump20_r1, 0.0F, 0.0F, 3.0858F);
		

		pump19_r1 = new ModelRenderer(this);
		pump19_r1.setRotationPoint(20.796F, -18.2297F, 0.0F);
		pumpSawed.addChild(pump19_r1);
		setRotationAngle(pump19_r1, 0.0F, 0.0F, -3.0858F);
		

		pump14_r1 = new ModelRenderer(this);
		pump14_r1.setRotationPoint(25.7699F, -18.1038F, 0.0F);
		pumpSawed.addChild(pump14_r1);
		setRotationAngle(pump14_r1, 0.0F, 0.0F, -2.8999F);
		pump14_r1.cubeList.add(new ModelBox(pump14_r1, 142, 57, -4.3F, -26.6F, -38.5F, 1, 1, 12, 0.0F, false));
		pump14_r1.cubeList.add(new ModelBox(pump14_r1, 152, 67, -4.1268F, -26.4907F, -38.5F, 1, 1, 2, 0.1F, false));
		pump14_r1.cubeList.add(new ModelBox(pump14_r1, 153, 68, -4.1268F, -26.4907F, -35.5F, 1, 1, 1, 0.1F, false));
		pump14_r1.cubeList.add(new ModelBox(pump14_r1, 153, 68, -4.1268F, -26.4907F, -33.5F, 1, 1, 1, 0.1F, false));
		pump14_r1.cubeList.add(new ModelBox(pump14_r1, 153, 68, -4.1268F, -26.4907F, -31.5F, 1, 1, 1, 0.1F, false));
		pump14_r1.cubeList.add(new ModelBox(pump14_r1, 153, 68, -4.1268F, -26.4907F, -29.5F, 1, 1, 1, 0.1F, false));
		pump14_r1.cubeList.add(new ModelBox(pump14_r1, 153, 68, -4.1268F, -26.4907F, -27.5F, 1, 1, 1, 0.1F, false));
		pump14_r1.cubeList.add(new ModelBox(pump14_r1, 153, 68, -4.1268F, -26.4907F, -25.5F, 1, 1, 1, 0.1F, false));
		pump14_r1.cubeList.add(new ModelBox(pump14_r1, 152, 67, -4.3F, -26.6F, -26.5F, 1, 1, 2, 0.0F, false));

		pump11_r1 = new ModelRenderer(this);
		pump11_r1.setRotationPoint(38.3876F, -9.0178F, 0.0F);
		pumpSawed.addChild(pump11_r1);
		setRotationAngle(pump11_r1, 0.0F, 0.0F, -2.3562F);
		pump11_r1.cubeList.add(new ModelBox(pump11_r1, 226, 334, -3.9F, -24.65F, -38.5F, 1, 1, 14, 0.0F, false));
		pump11_r1.cubeList.add(new ModelBox(pump11_r1, 226, 334, -1.7203F, -22.6986F, -38.5F, 1, 1, 14, 0.0F, false));
		pump11_r1.cubeList.add(new ModelBox(pump11_r1, 238, 346, -4.0372F, -24.9389F, -38.5F, 1, 1, 2, 0.1F, false));
		pump11_r1.cubeList.add(new ModelBox(pump11_r1, 238, 346, -1.4783F, -22.5607F, -38.5F, 1, 1, 2, 0.1F, false));
		pump11_r1.cubeList.add(new ModelBox(pump11_r1, 239, 347, -1.4783F, -22.5607F, -35.5F, 1, 1, 1, 0.1F, false));
		pump11_r1.cubeList.add(new ModelBox(pump11_r1, 239, 347, -4.0372F, -24.9389F, -35.5F, 1, 1, 1, 0.1F, false));
		pump11_r1.cubeList.add(new ModelBox(pump11_r1, 239, 347, -1.4783F, -22.5607F, -33.5F, 1, 1, 1, 0.1F, false));
		pump11_r1.cubeList.add(new ModelBox(pump11_r1, 239, 347, -4.0372F, -24.9389F, -33.5F, 1, 1, 1, 0.1F, false));
		pump11_r1.cubeList.add(new ModelBox(pump11_r1, 239, 347, -1.4783F, -22.5607F, -31.5F, 1, 1, 1, 0.1F, false));
		pump11_r1.cubeList.add(new ModelBox(pump11_r1, 239, 347, -4.0372F, -24.9389F, -31.5F, 1, 1, 1, 0.1F, false));
		pump11_r1.cubeList.add(new ModelBox(pump11_r1, 239, 347, -1.4783F, -22.5607F, -29.5F, 1, 1, 1, 0.1F, false));
		pump11_r1.cubeList.add(new ModelBox(pump11_r1, 239, 347, -4.0372F, -24.9389F, -29.5F, 1, 1, 1, 0.1F, false));
		pump11_r1.cubeList.add(new ModelBox(pump11_r1, 239, 347, -1.4783F, -22.5607F, -27.5F, 1, 1, 1, 0.1F, false));
		pump11_r1.cubeList.add(new ModelBox(pump11_r1, 239, 347, -4.0372F, -24.9389F, -27.5F, 1, 1, 1, 0.1F, false));
		pump11_r1.cubeList.add(new ModelBox(pump11_r1, 239, 347, -1.4783F, -22.5607F, -25.5F, 1, 1, 1, 0.1F, false));
		pump11_r1.cubeList.add(new ModelBox(pump11_r1, 239, 347, -4.0372F, -24.9389F, -25.5F, 1, 1, 1, 0.1F, false));

		pump10_r1 = new ModelRenderer(this);
		pump10_r1.setRotationPoint(10.6566F, -13.3653F, 0.0F);
		pumpSawed.addChild(pump10_r1);
		setRotationAngle(pump10_r1, 0.0F, 0.0F, 2.7884F);
		pump10_r1.cubeList.add(new ModelBox(pump10_r1, 337, 201, -4.3F, -26.6F, -38.5F, 1, 1, 14, 0.0F, false));
		pump10_r1.cubeList.add(new ModelBox(pump10_r1, 349, 213, -4.1095F, -26.7265F, -38.5F, 1, 1, 2, 0.1F, false));
		pump10_r1.cubeList.add(new ModelBox(pump10_r1, 350, 214, -4.1095F, -26.7265F, -35.5F, 1, 1, 1, 0.1F, false));
		pump10_r1.cubeList.add(new ModelBox(pump10_r1, 350, 214, -4.1095F, -26.7265F, -33.5F, 1, 1, 1, 0.1F, false));
		pump10_r1.cubeList.add(new ModelBox(pump10_r1, 350, 214, -4.1095F, -26.7265F, -31.5F, 1, 1, 1, 0.1F, false));
		pump10_r1.cubeList.add(new ModelBox(pump10_r1, 350, 214, -4.1095F, -26.7265F, -29.5F, 1, 1, 1, 0.1F, false));
		pump10_r1.cubeList.add(new ModelBox(pump10_r1, 350, 214, -4.1095F, -26.7265F, -27.5F, 1, 1, 1, 0.1F, false));
		pump10_r1.cubeList.add(new ModelBox(pump10_r1, 350, 214, -4.1095F, -26.7265F, -25.5F, 1, 1, 1, 0.1F, false));

		pump9_r1 = new ModelRenderer(this);
		pump9_r1.setRotationPoint(10.0996F, -7.639F, 0.0F);
		pumpSawed.addChild(pump9_r1);
		setRotationAngle(pump9_r1, 0.0F, 0.0F, 2.3562F);
		pump9_r1.cubeList.add(new ModelBox(pump9_r1, 348, 103, 0.95F, -24.65F, -38.5F, 1, 1, 14, 0.0F, false));
		pump9_r1.cubeList.add(new ModelBox(pump9_r1, 348, 103, -1.1945F, -22.6633F, -38.5F, 1, 1, 14, 0.0F, false));
		pump9_r1.cubeList.add(new ModelBox(pump9_r1, 360, 115, -1.4363F, -22.5254F, -38.5F, 1, 1, 2, 0.1F, false));
		pump9_r1.cubeList.add(new ModelBox(pump9_r1, 360, 115, 1.1227F, -24.9035F, -38.5F, 1, 1, 2, 0.1F, false));
		pump9_r1.cubeList.add(new ModelBox(pump9_r1, 361, 116, 1.1227F, -24.9035F, -35.5F, 1, 1, 1, 0.1F, false));
		pump9_r1.cubeList.add(new ModelBox(pump9_r1, 361, 116, -1.4363F, -22.5254F, -35.5F, 1, 1, 1, 0.1F, false));
		pump9_r1.cubeList.add(new ModelBox(pump9_r1, 361, 116, 1.1227F, -24.9035F, -33.5F, 1, 1, 1, 0.1F, false));
		pump9_r1.cubeList.add(new ModelBox(pump9_r1, 361, 116, -1.4363F, -22.5254F, -33.5F, 1, 1, 1, 0.1F, false));
		pump9_r1.cubeList.add(new ModelBox(pump9_r1, 361, 116, 1.1227F, -24.9035F, -31.5F, 1, 1, 1, 0.1F, false));
		pump9_r1.cubeList.add(new ModelBox(pump9_r1, 361, 116, -1.4363F, -22.5254F, -31.5F, 1, 1, 1, 0.1F, false));
		pump9_r1.cubeList.add(new ModelBox(pump9_r1, 361, 116, 1.1227F, -24.9035F, -29.5F, 1, 1, 1, 0.1F, false));
		pump9_r1.cubeList.add(new ModelBox(pump9_r1, 361, 116, -1.4363F, -22.5254F, -29.5F, 1, 1, 1, 0.1F, false));
		pump9_r1.cubeList.add(new ModelBox(pump9_r1, 361, 116, 1.1227F, -24.9035F, -27.5F, 1, 1, 1, 0.1F, false));
		pump9_r1.cubeList.add(new ModelBox(pump9_r1, 361, 116, -1.4363F, -22.5254F, -27.5F, 1, 1, 1, 0.1F, false));
		pump9_r1.cubeList.add(new ModelBox(pump9_r1, 361, 116, 1.1227F, -24.9035F, -25.5F, 1, 1, 1, 0.1F, false));
		pump9_r1.cubeList.add(new ModelBox(pump9_r1, 361, 116, -1.4363F, -22.5254F, -25.5F, 1, 1, 1, 0.1F, false));

		pump7_r1 = new ModelRenderer(this);
		pump7_r1.setRotationPoint(37.283F, -14.0571F, 0.0F);
		pumpSawed.addChild(pump7_r1);
		setRotationAngle(pump7_r1, 0.0F, 0.0F, -2.7884F);
		pump7_r1.cubeList.add(new ModelBox(pump7_r1, 351, 26, 1.3F, -26.6F, -38.5F, 1, 1, 14, 0.0F, false));
		pump7_r1.cubeList.add(new ModelBox(pump7_r1, 363, 38, 1.1096F, -26.7266F, -38.5F, 1, 1, 2, 0.1F, false));
		pump7_r1.cubeList.add(new ModelBox(pump7_r1, 364, 39, 1.1096F, -26.7266F, -35.5F, 1, 1, 1, 0.1F, false));
		pump7_r1.cubeList.add(new ModelBox(pump7_r1, 364, 39, 1.1096F, -26.7266F, -33.5F, 1, 1, 1, 0.1F, false));
		pump7_r1.cubeList.add(new ModelBox(pump7_r1, 364, 39, 1.1096F, -26.7266F, -31.5F, 1, 1, 1, 0.1F, false));
		pump7_r1.cubeList.add(new ModelBox(pump7_r1, 364, 39, 1.1096F, -26.7266F, -29.5F, 1, 1, 1, 0.1F, false));
		pump7_r1.cubeList.add(new ModelBox(pump7_r1, 364, 39, 1.1096F, -26.7266F, -27.5F, 1, 1, 1, 0.1F, false));
		pump7_r1.cubeList.add(new ModelBox(pump7_r1, 364, 39, 1.1096F, -26.7266F, -25.5F, 1, 1, 1, 0.1F, false));

		pump6_r1 = new ModelRenderer(this);
		pump6_r1.setRotationPoint(22.1045F, -17.6252F, 0.0F);
		pumpSawed.addChild(pump6_r1);
		setRotationAngle(pump6_r1, 0.0F, 0.0F, 2.8999F);
		pump6_r1.cubeList.add(new ModelBox(pump6_r1, 60, 197, 1.3F, -26.6F, -38.5F, 1, 1, 12, 0.0F, false));
		pump6_r1.cubeList.add(new ModelBox(pump6_r1, 70, 207, 1.1271F, -26.4907F, -38.5F, 1, 1, 2, 0.1F, false));
		pump6_r1.cubeList.add(new ModelBox(pump6_r1, 71, 208, 1.1271F, -26.4907F, -35.5F, 1, 1, 1, 0.1F, false));
		pump6_r1.cubeList.add(new ModelBox(pump6_r1, 71, 208, 1.1271F, -26.4907F, -33.5F, 1, 1, 1, 0.1F, false));
		pump6_r1.cubeList.add(new ModelBox(pump6_r1, 71, 208, 1.1271F, -26.4907F, -31.5F, 1, 1, 1, 0.1F, false));
		pump6_r1.cubeList.add(new ModelBox(pump6_r1, 71, 208, 1.1271F, -26.4907F, -29.5F, 1, 1, 1, 0.1F, false));
		pump6_r1.cubeList.add(new ModelBox(pump6_r1, 71, 208, 1.1271F, -26.4907F, -27.5F, 1, 1, 1, 0.1F, false));
		pump6_r1.cubeList.add(new ModelBox(pump6_r1, 71, 208, 1.1271F, -26.4907F, -25.5F, 1, 1, 1, 0.1F, false));
		pump6_r1.cubeList.add(new ModelBox(pump6_r1, 70, 207, 1.3F, -26.6F, -26.5F, 1, 1, 2, 0.0F, false));

		pump3_r1 = new ModelRenderer(this);
		pump3_r1.setRotationPoint(41.5743F, 28.6021F, 0.0F);
		pumpSawed.addChild(pump3_r1);
		setRotationAngle(pump3_r1, 0.0F, 0.0F, -0.5995F);
		pump3_r1.cubeList.add(new ModelBox(pump3_r1, 49, 279, -2.7F, -28.6F, -12.0F, 1, 2, 15, 0.0F, false));

		pump1_r1 = new ModelRenderer(this);
		pump1_r1.setRotationPoint(46.0476F, 24.5341F, 0.0F);
		pumpSawed.addChild(pump1_r1);
		setRotationAngle(pump1_r1, 0.0F, 0.0F, -0.7854F);
		pump1_r1.cubeList.add(new ModelBox(pump1_r1, 27, 129, -2.7F, -29.6F, -12.0F, 1, 1, 8, 0.0F, false));

		pump28_r1 = new ModelRenderer(this);
		pump28_r1.setRotationPoint(49.3917F, -1.9546F, 0.0F);
		pumpSawed.addChild(pump28_r1);
		setRotationAngle(pump28_r1, 0.0F, 0.0F, -1.7846F);
		
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		pumpSawed.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}