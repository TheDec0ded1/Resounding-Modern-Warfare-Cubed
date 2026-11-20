package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class SL8Mag extends ModelBase {
	private final ModelRenderer mag;
	private final ModelRenderer cube_r43;
	private final ModelRenderer cube_r44;
	private final ModelRenderer cube_r45;
	private final ModelRenderer cube_r46;
	private final ModelRenderer cube_r47;
	private final ModelRenderer cube_r48;
	private final ModelRenderer mag2;
	private final ModelRenderer cube_r49;
	private final ModelRenderer cube_r50;
	private final ModelRenderer cube_r51;
	private final ModelRenderer cube_r52;
	private final ModelRenderer cube_r53;
	private final ModelRenderer cube_r54;
	private final ModelRenderer mag3;
	private final ModelRenderer cube_r55;
	private final ModelRenderer cube_r56;
	private final ModelRenderer cube_r57;
	private final ModelRenderer cube_r58;
	private final ModelRenderer cube_r59;
	private final ModelRenderer cube_r60;
	private final ModelRenderer mag4;
	private final ModelRenderer cube_r61;
	private final ModelRenderer cube_r62;
	private final ModelRenderer cube_r63;
	private final ModelRenderer cube_r64;
	private final ModelRenderer cube_r65;
	private final ModelRenderer cube_r66;
	private final ModelRenderer cube_r67;
	private final ModelRenderer cube_r68;

	public SL8Mag() {
		textureWidth = 220;
		textureHeight = 220;

		mag = new ModelRenderer(this);
		mag.setRotationPoint(-1.3249F, -18.218F, -16.884F);
		

		cube_r43 = new ModelRenderer(this);
		cube_r43.setRotationPoint(-0.75F, 3.0687F, -1.3137F);
		mag.addChild(cube_r43);
		setRotationAngle(cube_r43, -0.1309F, 0.0F, 0.0F);
		

		cube_r44 = new ModelRenderer(this);
		cube_r44.setRotationPoint(-3.8107F, 2.9844F, -1.9547F);
		mag.addChild(cube_r44);
		setRotationAngle(cube_r44, -0.1841F, 0.7769F, -0.1298F);
		

		cube_r45 = new ModelRenderer(this);
		cube_r45.setRotationPoint(-3.8107F, 2.8538F, -2.9461F);
		mag.addChild(cube_r45);
		setRotationAngle(cube_r45, -0.1841F, 0.7769F, -0.1298F);
		

		cube_r46 = new ModelRenderer(this);
		cube_r46.setRotationPoint(-1.2249F, 2.9844F, -1.9547F);
		mag.addChild(cube_r46);
		setRotationAngle(cube_r46, -0.1841F, 0.7769F, -0.1298F);
		

		cube_r47 = new ModelRenderer(this);
		cube_r47.setRotationPoint(-1.2249F, 2.8538F, -2.9461F);
		mag.addChild(cube_r47);
		setRotationAngle(cube_r47, -0.1841F, 0.7769F, -0.1298F);
		

		cube_r48 = new ModelRenderer(this);
		cube_r48.setRotationPoint(-0.75F, 2.6119F, -4.7838F);
		mag.addChild(cube_r48);
		setRotationAngle(cube_r48, -0.1309F, 0.0F, 0.0F);
		

		mag2 = new ModelRenderer(this);
		mag2.setRotationPoint(0.0F, 0.0F, 0.0F);
		mag.addChild(mag2);
		setRotationAngle(mag2, 0.0436F, 0.0F, 0.0F);
		

		cube_r49 = new ModelRenderer(this);
		cube_r49.setRotationPoint(-0.75F, -2.7046F, -0.567F);
		mag2.addChild(cube_r49);
		setRotationAngle(cube_r49, -0.1309F, 0.0F, 0.0F);
		cube_r49.cubeList.add(new ModelBox(cube_r49, 19, 0, -0.002F, 10.834F, -0.5142F, 1, 5, 4, 0.001F, false));
		cube_r49.cubeList.add(new ModelBox(cube_r49, 21, 0, 0.998F, 10.834F, -0.5142F, 1, 5, 5, 0.001F, false));
		cube_r49.cubeList.add(new ModelBox(cube_r49, 43, 50, -0.002F, 10.834F, 3.4858F, 1, 5, 1, 0.001F, false));

		cube_r50 = new ModelRenderer(this);
		cube_r50.setRotationPoint(-3.8107F, -2.789F, -1.2079F);
		mag2.addChild(cube_r50);
		setRotationAngle(cube_r50, -0.1841F, 0.7769F, -0.1298F);
		cube_r50.cubeList.add(new ModelBox(cube_r50, 47, 82, 2.0692F, 10.834F, 2.2566F, 1, 5, 1, 0.0F, false));

		cube_r51 = new ModelRenderer(this);
		cube_r51.setRotationPoint(-3.8107F, -2.9195F, -2.1994F);
		mag2.addChild(cube_r51);
		setRotationAngle(cube_r51, -0.1841F, 0.7769F, -0.1298F);
		cube_r51.cubeList.add(new ModelBox(cube_r51, 102, 76, 2.0692F, 10.834F, 2.2566F, 1, 5, 1, 0.0F, false));

		cube_r52 = new ModelRenderer(this);
		cube_r52.setRotationPoint(-1.2249F, -2.789F, -1.2079F);
		mag2.addChild(cube_r52);
		setRotationAngle(cube_r52, -0.1841F, 0.7769F, -0.1298F);
		cube_r52.cubeList.add(new ModelBox(cube_r52, 105, 4, 0.655F, 10.834F, 0.8423F, 1, 5, 1, 0.0F, false));

		cube_r53 = new ModelRenderer(this);
		cube_r53.setRotationPoint(-1.2249F, -2.9195F, -2.1994F);
		mag2.addChild(cube_r53);
		setRotationAngle(cube_r53, -0.1841F, 0.7769F, -0.1298F);
		cube_r53.cubeList.add(new ModelBox(cube_r53, 106, 46, 0.655F, 10.834F, 0.8423F, 1, 5, 1, 0.0F, false));

		cube_r54 = new ModelRenderer(this);
		cube_r54.setRotationPoint(-0.75F, -3.1615F, -4.0371F);
		mag2.addChild(cube_r54);
		setRotationAngle(cube_r54, -0.1309F, 0.0F, 0.0F);
		cube_r54.cubeList.add(new ModelBox(cube_r54, 53, 21, -0.002F, 10.834F, -1.0142F, 1, 5, 3, 0.001F, false));
		cube_r54.cubeList.add(new ModelBox(cube_r54, 56, 21, 0.998F, 10.834F, -1.0142F, 1, 5, 3, 0.001F, false));

		mag3 = new ModelRenderer(this);
		mag3.setRotationPoint(0.0F, 0.0F, 0.0F);
		mag.addChild(mag3);
		setRotationAngle(mag3, -0.0873F, 0.0F, 0.0F);
		

		cube_r55 = new ModelRenderer(this);
		cube_r55.setRotationPoint(-0.75F, 7.7094F, -1.4821F);
		mag3.addChild(cube_r55);
		setRotationAngle(cube_r55, -0.1309F, 0.0F, 0.0F);
		cube_r55.cubeList.add(new ModelBox(cube_r55, 72, 66, 0.0F, 4.8103F, 0.7318F, 1, 5, 4, -0.001F, false));
		cube_r55.cubeList.add(new ModelBox(cube_r55, 74, 65, 1.0F, 4.8103F, 0.7318F, 1, 5, 5, -0.001F, false));
		cube_r55.cubeList.add(new ModelBox(cube_r55, 71, 82, 0.0F, 4.8103F, 4.7318F, 1, 5, 1, -0.001F, false));

		cube_r56 = new ModelRenderer(this);
		cube_r56.setRotationPoint(-3.8107F, 7.6251F, -2.123F);
		mag3.addChild(cube_r56);
		setRotationAngle(cube_r56, -0.1841F, 0.7769F, -0.1298F);
		cube_r56.cubeList.add(new ModelBox(cube_r56, 111, 3, 1.1896F, 4.8103F, 3.1389F, 1, 5, 1, 0.0F, false));

		cube_r57 = new ModelRenderer(this);
		cube_r57.setRotationPoint(-3.8107F, 7.4945F, -3.1144F);
		mag3.addChild(cube_r57);
		setRotationAngle(cube_r57, -0.1841F, 0.7769F, -0.1298F);
		cube_r57.cubeList.add(new ModelBox(cube_r57, 111, 56, 1.1896F, 4.8103F, 3.1389F, 1, 5, 1, 0.0F, false));

		cube_r58 = new ModelRenderer(this);
		cube_r58.setRotationPoint(-1.2249F, 7.6251F, -2.123F);
		mag3.addChild(cube_r58);
		setRotationAngle(cube_r58, -0.1841F, 0.7769F, -0.1298F);
		cube_r58.cubeList.add(new ModelBox(cube_r58, 111, 62, -0.2246F, 4.8103F, 1.7247F, 1, 5, 1, 0.0F, false));

		cube_r59 = new ModelRenderer(this);
		cube_r59.setRotationPoint(-1.2249F, 7.4945F, -3.1144F);
		mag3.addChild(cube_r59);
		setRotationAngle(cube_r59, -0.1841F, 0.7769F, -0.1298F);
		cube_r59.cubeList.add(new ModelBox(cube_r59, 13, 112, -0.2246F, 4.8103F, 1.7247F, 1, 5, 1, 0.0F, false));

		cube_r60 = new ModelRenderer(this);
		cube_r60.setRotationPoint(-0.75F, 7.2526F, -4.9521F);
		mag3.addChild(cube_r60);
		setRotationAngle(cube_r60, -0.1309F, 0.0F, 0.0F);
		cube_r60.cubeList.add(new ModelBox(cube_r60, 0, 91, 0.0F, 4.8103F, 0.2318F, 1, 5, 3, -0.001F, false));
		cube_r60.cubeList.add(new ModelBox(cube_r60, 3, 91, 1.0F, 4.8103F, 0.2318F, 1, 5, 3, -0.001F, false));

		mag4 = new ModelRenderer(this);
		mag4.setRotationPoint(-0.75F, 6.7922F, -3.2605F);
		mag.addChild(mag4);
		setRotationAngle(mag4, -0.1745F, 0.0F, 0.0F);
		

		cube_r61 = new ModelRenderer(this);
		cube_r61.setRotationPoint(0.0F, 8.2232F, 5.4171F);
		mag4.addChild(cube_r61);
		setRotationAngle(cube_r61, -0.1309F, 0.0F, 0.0F);
		cube_r61.cubeList.add(new ModelBox(cube_r61, 23, 79, -0.5001F, 7.1299F, 0.9054F, 3, 1, 1, 0.001F, false));

		cube_r62 = new ModelRenderer(this);
		cube_r62.setRotationPoint(0.0F, 7.5706F, 0.4599F);
		mag4.addChild(cube_r62);
		setRotationAngle(cube_r62, -0.1309F, 0.0F, 0.0F);
		cube_r62.cubeList.add(new ModelBox(cube_r62, 33, 194, -0.5F, 7.1298F, -2.5946F, 3, 1, 9, 0.0F, false));

		cube_r63 = new ModelRenderer(this);
		cube_r63.setRotationPoint(0.0F, 5.0919F, 0.7862F);
		mag4.addChild(cube_r63);
		setRotationAngle(cube_r63, -0.1309F, 0.0F, 0.0F);
		cube_r63.cubeList.add(new ModelBox(cube_r63, 25, 47, 0.0F, 4.6298F, 1.4054F, 1, 5, 5, 0.001F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 28, 47, 1.0F, 4.6298F, 1.4054F, 1, 5, 5, 0.001F, false));

		cube_r64 = new ModelRenderer(this);
		cube_r64.setRotationPoint(-3.0607F, 5.0076F, 0.1453F);
		mag4.addChild(cube_r64);
		setRotationAngle(cube_r64, -0.1841F, 0.7769F, -0.1298F);
		cube_r64.cubeList.add(new ModelBox(cube_r64, 0, 83, 0.7133F, 4.6298F, 3.6152F, 1, 5, 1, 0.0F, false));

		cube_r65 = new ModelRenderer(this);
		cube_r65.setRotationPoint(-3.0607F, 4.877F, -0.8462F);
		mag4.addChild(cube_r65);
		setRotationAngle(cube_r65, -0.1841F, 0.7769F, -0.1298F);
		cube_r65.cubeList.add(new ModelBox(cube_r65, 84, 10, 0.7133F, 4.6298F, 3.6152F, 1, 5, 1, 0.0F, false));

		cube_r66 = new ModelRenderer(this);
		cube_r66.setRotationPoint(-0.4749F, 5.0076F, 0.1453F);
		mag4.addChild(cube_r66);
		setRotationAngle(cube_r66, -0.1841F, 0.7769F, -0.1298F);
		cube_r66.cubeList.add(new ModelBox(cube_r66, 84, 47, -0.7009F, 4.6298F, 2.201F, 1, 5, 1, 0.0F, false));

		cube_r67 = new ModelRenderer(this);
		cube_r67.setRotationPoint(-0.4749F, 4.877F, -0.8462F);
		mag4.addChild(cube_r67);
		setRotationAngle(cube_r67, -0.1841F, 0.7769F, -0.1298F);
		cube_r67.cubeList.add(new ModelBox(cube_r67, 106, 96, -0.7009F, 4.6298F, 2.201F, 1, 5, 1, 0.0F, false));

		cube_r68 = new ModelRenderer(this);
		cube_r68.setRotationPoint(0.0F, 4.6351F, -2.6839F);
		mag4.addChild(cube_r68);
		setRotationAngle(cube_r68, -0.1309F, 0.0F, 0.0F);
		cube_r68.cubeList.add(new ModelBox(cube_r68, 45, 73, 0.0F, 4.6298F, 0.9054F, 1, 5, 3, 0.001F, false));
		cube_r68.cubeList.add(new ModelBox(cube_r68, 48, 73, 1.0F, 4.6298F, 0.9054F, 1, 5, 3, 0.001F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		mag.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}