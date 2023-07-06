package com.paneedah.mwc.models;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class ASValHandguard extends ModelBase {
	private final ModelRenderer asval_handguard;
	private final ModelRenderer gun10;
	private final ModelRenderer gun11;
	private final ModelRenderer gun12;
	private final ModelRenderer gun13;
	private final ModelRenderer gun196;
	private final ModelRenderer gun198;
	private final ModelRenderer gun215;
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

	public ASValHandguard() {
		textureWidth = 256;
		textureHeight = 256;

		asval_handguard = new ModelRenderer(this);
		asval_handguard.setRotationPoint(0.0F, 24.0F, 0.0F);
		asval_handguard.cubeList.add(new ModelBox(asval_handguard, 57, 89, -3.0F, -29.5F, -27.5F, 3, 1, 1, -0.001F, false));

		gun10 = new ModelRenderer(this);
		gun10.setRotationPoint(-3.0F, -32.8F, -41.5F);
		asval_handguard.addChild(gun10);
		gun10.cubeList.add(new ModelBox(gun10, 168, 124, 0.0F, -2.0F, 0.0F, 3, 3, 3, 0.001F, false));

		gun11 = new ModelRenderer(this);
		gun11.setRotationPoint(-4.1F, -31.0F, -28.5F);
		asval_handguard.addChild(gun11);
		gun11.cubeList.add(new ModelBox(gun11, 68, 162, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun12 = new ModelRenderer(this);
		gun12.setRotationPoint(-4.1F, -32.0F, -33.5F);
		asval_handguard.addChild(gun12);
		gun12.cubeList.add(new ModelBox(gun12, 126, 98, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun13 = new ModelRenderer(this);
		gun13.setRotationPoint(-4.1F, -31.5F, -31.5F);
		asval_handguard.addChild(gun13);
		gun13.cubeList.add(new ModelBox(gun13, 146, 16, 0.001F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		gun196 = new ModelRenderer(this);
		gun196.setRotationPoint(-4.1F, -33.0F, -37.0F);
		asval_handguard.addChild(gun196);
		gun196.cubeList.add(new ModelBox(gun196, 64, 162, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun198 = new ModelRenderer(this);
		gun198.setRotationPoint(-4.1F, -32.5F, -36.5F);
		asval_handguard.addChild(gun198);
		gun198.cubeList.add(new ModelBox(gun198, 24, 67, -0.009F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		gun215 = new ModelRenderer(this);
		gun215.setRotationPoint(-4.1F, -32.5F, -27.5F);
		asval_handguard.addChild(gun215);
		gun215.cubeList.add(new ModelBox(gun215, 61, 0, 0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, false));

		gun217 = new ModelRenderer(this);
		gun217.setRotationPoint(0.2F, -31.0F, -28.5F);
		asval_handguard.addChild(gun217);
		gun217.cubeList.add(new ModelBox(gun217, 56, 162, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun218 = new ModelRenderer(this);
		gun218.setRotationPoint(0.2F, -31.5F, -31.5F);
		asval_handguard.addChild(gun218);
		gun218.cubeList.add(new ModelBox(gun218, 146, 5, -0.002F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		gun219 = new ModelRenderer(this);
		gun219.setRotationPoint(0.2F, -32.1F, -35.0F);
		asval_handguard.addChild(gun219);
		gun219.cubeList.add(new ModelBox(gun219, 116, 93, -0.001F, 0.0F, 0.0F, 1, 1, 8, 0.0F, false));

		gun220 = new ModelRenderer(this);
		gun220.setRotationPoint(0.2F, -32.0F, -27.5F);
		asval_handguard.addChild(gun220);
		gun220.cubeList.add(new ModelBox(gun220, 29, 67, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun221 = new ModelRenderer(this);
		gun221.setRotationPoint(0.2F, -33.0F, -39.5F);
		asval_handguard.addChild(gun221);
		gun221.cubeList.add(new ModelBox(gun221, 39, 156, -1.0F, 0.0F, 0.0F, 2, 1, 13, 0.0F, false));
		gun221.cubeList.add(new ModelBox(gun221, 49, 83, -1.0F, -0.4F, -2.0F, 2, 1, 2, 0.0F, false));

		gun222 = new ModelRenderer(this);
		gun222.setRotationPoint(0.2F, -32.0F, -39.5F);
		asval_handguard.addChild(gun222);
		setRotationAngle(gun222, 1.3614F, 0.0F, 0.0F);
		gun222.cubeList.add(new ModelBox(gun222, 96, 146, -0.998F, 0.0F, 0.0F, 2, 13, 1, 0.0F, false));
		gun222.cubeList.add(new ModelBox(gun222, 98, 65, -0.8F, -2.2F, -0.2F, 2, 3, 1, -0.201F, false));

		gun223 = new ModelRenderer(this);
		gun223.setRotationPoint(-3.0F, -31.8F, -41.5F);
		asval_handguard.addChild(gun223);
		setRotationAngle(gun223, 1.3614F, 0.0F, 0.0F);
		gun223.cubeList.add(new ModelBox(gun223, 10, 92, 0.0F, 0.0F, 0.0F, 3, 15, 1, 0.0F, false));

		gun224 = new ModelRenderer(this);
		gun224.setRotationPoint(-4.1F, -32.5F, -41.5F);
		asval_handguard.addChild(gun224);
		setRotationAngle(gun224, 1.3614F, 0.0F, 0.0F);
		gun224.cubeList.add(new ModelBox(gun224, 108, 19, -0.01F, 0.0F, 0.0F, 2, 15, 1, 0.0F, false));

		gun225 = new ModelRenderer(this);
		gun225.setRotationPoint(-4.1F, -36.5F, -41.5F);
		asval_handguard.addChild(gun225);
		setRotationAngle(gun225, 0.0F, 0.0F, -0.7436F);
		gun225.cubeList.add(new ModelBox(gun225, 205, 28, 0.0F, 0.0F, 0.0F, 2, 1, 15, 0.0F, false));

		gun226 = new ModelRenderer(this);
		gun226.setRotationPoint(1.2F, -36.5F, -41.5F);
		asval_handguard.addChild(gun226);
		setRotationAngle(gun226, 0.0F, 0.0F, 2.3794F);
		gun226.cubeList.add(new ModelBox(gun226, 146, 45, 0.0F, 0.0F, 2.0F, 1, 1, 13, 0.0F, false));
		gun226.cubeList.add(new ModelBox(gun226, 126, 41, 0.0F, 0.35F, 0.0F, 1, 1, 2, 0.0F, false));

		gun227 = new ModelRenderer(this);
		gun227.setRotationPoint(-4.1F, -36.5F, -41.5F);
		asval_handguard.addChild(gun227);
		gun227.cubeList.add(new ModelBox(gun227, 49, 93, -0.02F, 0.0F, -0.01F, 2, 4, 15, 0.0F, false));

		gun228 = new ModelRenderer(this);
		gun228.setRotationPoint(0.2F, -36.5F, -39.5F);
		asval_handguard.addChild(gun228);
		gun228.cubeList.add(new ModelBox(gun228, 32, 221, -0.999F, 0.0F, -0.01F, 2, 4, 13, 0.0F, false));

		gun229 = new ModelRenderer(this);
		gun229.setRotationPoint(-3.2F, -38.8F, -41.5F);
		asval_handguard.addChild(gun229);
		setRotationAngle(gun229, 0.0F, 0.0F, 0.2231F);
		gun229.cubeList.add(new ModelBox(gun229, 205, 0, 0.0F, 1.0F, -0.01F, 2, 1, 15, 0.0F, false));
		gun229.cubeList.add(new ModelBox(gun229, 84, 5, 0.0F, 0.0F, -0.01F, 2, 1, 3, 0.0F, false));
		gun229.cubeList.add(new ModelBox(gun229, 84, 5, 0.0F, 0.0F, 7.99F, 2, 1, 3, 0.0F, false));
		gun229.cubeList.add(new ModelBox(gun229, 151, 133, -0.4F, -0.4F, 0.99F, 2, 1, 12, -0.401F, false));
		gun229.cubeList.add(new ModelBox(gun229, 24, 82, 0.0F, 0.0F, 5.99F, 2, 1, 2, 0.0F, false));
		gun229.cubeList.add(new ModelBox(gun229, 90, 161, 0.0F, 0.0F, 10.99F, 2, 1, 4, 0.0F, false));
		gun229.cubeList.add(new ModelBox(gun229, 91, 162, 0.0F, 0.0F, 2.99F, 2, 1, 3, 0.0F, false));

		gun230 = new ModelRenderer(this);
		gun230.setRotationPoint(0.2F, -38.9F, -41.5F);
		asval_handguard.addChild(gun230);
		setRotationAngle(gun230, 0.0F, 0.0F, 1.3384F);
		gun230.cubeList.add(new ModelBox(gun230, 124, 217, 1.0F, 0.0F, -0.01F, 1, 2, 15, 0.0F, false));
		gun230.cubeList.add(new ModelBox(gun230, 39, 139, -0.4F, -0.4F, -0.01F, 1, 2, 15, -0.401F, false));
		gun230.cubeList.add(new ModelBox(gun230, 24, 77, 0.0F, 0.0F, -0.01F, 1, 2, 3, 0.0F, false));
		gun230.cubeList.add(new ModelBox(gun230, 24, 77, 0.0F, 0.0F, 2.99F, 1, 2, 3, 0.0F, false));
		gun230.cubeList.add(new ModelBox(gun230, 98, 55, 0.0F, 0.0F, 5.99F, 1, 2, 2, 0.0F, false));
		gun230.cubeList.add(new ModelBox(gun230, 10, 46, 0.0F, 0.0F, 10.99F, 1, 2, 4, 0.0F, false));
		gun230.cubeList.add(new ModelBox(gun230, 11, 47, 0.0F, 0.0F, 7.99F, 1, 2, 3, 0.0F, false));

		gun231 = new ModelRenderer(this);
		gun231.setRotationPoint(-2.3F, -39.32F, -41.5F);
		asval_handguard.addChild(gun231);
		setRotationAngle(gun231, 0.0F, 0.0F, 1.041F);
		gun231.cubeList.add(new ModelBox(gun231, 141, 219, 0.0F, 0.0F, 0.01F, 1, 1, 15, 0.0F, false));

		gun232 = new ModelRenderer(this);
		gun232.setRotationPoint(-2.0F, -39.5F, -41.5F);
		asval_handguard.addChild(gun232);
		setRotationAngle(gun232, 0.0F, 0.0F, 1.041F);
		gun232.cubeList.add(new ModelBox(gun232, 123, 201, 0.0F, 0.0F, 0.0F, 2, 1, 15, 0.0F, false));

		gun233 = new ModelRenderer(this);
		gun233.setRotationPoint(-0.7F, -39.35F, -41.5F);
		asval_handguard.addChild(gun233);
		setRotationAngle(gun233, 0.0F, 0.0F, 0.4461F);
		gun233.cubeList.add(new ModelBox(gun233, 0, 155, 0.0F, 0.0F, 0.01F, 1, 1, 15, 0.0F, false));

		gun234 = new ModelRenderer(this);
		gun234.setRotationPoint(-1.0F, -39.5F, -41.5F);
		asval_handguard.addChild(gun234);
		setRotationAngle(gun234, 0.0F, 0.0F, 0.4461F);
		gun234.cubeList.add(new ModelBox(gun234, 53, 217, 0.0F, 0.0F, 0.0F, 1, 2, 15, 0.0F, false));

		gun235 = new ModelRenderer(this);
		gun235.setRotationPoint(-2.0F, -39.5F, -41.5F);
		asval_handguard.addChild(gun235);
		gun235.cubeList.add(new ModelBox(gun235, 209, 116, 0.0F, 0.0F, -0.02F, 1, 2, 15, 0.0F, false));

		gun236 = new ModelRenderer(this);
		gun236.setRotationPoint(-2.5F, -38.5F, -41.0F);
		asval_handguard.addChild(gun236);
		gun236.cubeList.add(new ModelBox(gun236, 49, 93, 0.0F, 0.0F, 0.0F, 2, 6, 5, 0.0F, false));

		gun237 = new ModelRenderer(this);
		gun237.setRotationPoint(-1.5F, -37.0F, -41.5F);
		asval_handguard.addChild(gun237);
		gun237.cubeList.add(new ModelBox(gun237, 33, 115, 0.0F, 0.0F, 0.0F, 1, 3, 5, 0.0F, false));

		gun238 = new ModelRenderer(this);
		gun238.setRotationPoint(-2.5F, -38.0F, -41.5F);
		asval_handguard.addChild(gun238);
		gun238.cubeList.add(new ModelBox(gun238, 98, 111, 0.0F, 0.0F, 0.0F, 2, 5, 5, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		asval_handguard.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}