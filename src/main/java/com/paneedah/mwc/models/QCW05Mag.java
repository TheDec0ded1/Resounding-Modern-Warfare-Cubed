package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QCW05Mag extends ModelBase {
	private final ModelRenderer magazine;
	private final ModelRenderer bone231;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer bone232;
	private final ModelRenderer bone233;
	private final ModelRenderer bone234;
	private final ModelRenderer bone235;
	private final ModelRenderer bone236;
	private final ModelRenderer bone237;
	private final ModelRenderer bone238;
	private final ModelRenderer bone239;
	private final ModelRenderer bone240;
	private final ModelRenderer bone241;
	private final ModelRenderer bone242;
	private final ModelRenderer bone243;
	private final ModelRenderer bone244;
	private final ModelRenderer bone245;
	private final ModelRenderer bone246;
	private final ModelRenderer bone247;
	private final ModelRenderer bone248;
	private final ModelRenderer bone249;

	public QCW05Mag() {
		textureWidth = 256;
		textureHeight = 256;

		magazine = new ModelRenderer(this);
		magazine.setRotationPoint(-1.5F, 10.15F, 48.9F);
		setRotationAngle(magazine, -0.0436F, 0.0F, 0.0F);
		

		bone231 = new ModelRenderer(this);
		bone231.setRotationPoint(1.75F, -17.0F, -17.0F);
		magazine.addChild(bone231);
		bone231.cubeList.add(new ModelBox(bone231, 124, 212, -3.5F, -3.23F, -21.8848F, 1, 5, 4, 0.0F, false));
		bone231.cubeList.add(new ModelBox(bone231, 130, 210, -3.501F, -3.229F, -18.2828F, 1, 5, 1, 0.0F, false));
		bone231.cubeList.add(new ModelBox(bone231, 130, 241, -3.0F, -3.229F, -21.8838F, 3, 5, 4, 0.0F, false));
		bone231.cubeList.add(new ModelBox(bone231, 107, 199, -2.999F, -3.229F, -18.2838F, 3, 5, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -3.969F, -3.3436F);
		bone231.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.4712F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 83, 212, -2.7821F, 1.2491F, -16.9838F, 1, 1, 3, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -3.969F, -3.3436F);
		bone231.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.4712F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 95, 212, -1.3364F, -0.3398F, -16.9838F, 1, 1, 3, 0.0F, false));

		bone232 = new ModelRenderer(this);
		bone232.setRotationPoint(1.75F, -15.0F, -17.0F);
		magazine.addChild(bone232);
		setRotationAngle(bone232, -0.0436F, 0.0F, 0.0F);
		bone232.cubeList.add(new ModelBox(bone232, 111, 184, -3.5F, 0.4805F, -21.9364F, 3, 3, 5, 0.0F, false));
		bone232.cubeList.add(new ModelBox(bone232, 99, 233, -1.0F, 0.4805F, -21.9354F, 1, 3, 5, 0.0F, false));

		bone233 = new ModelRenderer(this);
		bone233.setRotationPoint(-0.5F, 0.0F, -5.5F);
		bone232.addChild(bone233);
		setRotationAngle(bone233, 0.0F, -0.3927F, 0.0F);
		

		bone234 = new ModelRenderer(this);
		bone234.setRotationPoint(-2.5F, 0.0F, -5.5F);
		bone232.addChild(bone234);
		setRotationAngle(bone234, 0.0F, 0.3927F, 0.0F);
		

		bone235 = new ModelRenderer(this);
		bone235.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone232.addChild(bone235);
		setRotationAngle(bone235, -0.0436F, 0.0F, 0.0F);
		bone235.cubeList.add(new ModelBox(bone235, 112, 241, -3.5F, 4.1718F, -21.7695F, 3, 3, 5, 0.0F, false));
		bone235.cubeList.add(new ModelBox(bone235, 95, 181, -1.0F, 4.1718F, -21.7685F, 1, 3, 5, 0.0F, false));

		bone236 = new ModelRenderer(this);
		bone236.setRotationPoint(-0.5F, 0.0F, -5.5F);
		bone235.addChild(bone236);
		setRotationAngle(bone236, 0.0F, -0.3927F, 0.0F);
		

		bone237 = new ModelRenderer(this);
		bone237.setRotationPoint(-2.5F, 0.0F, -5.5F);
		bone235.addChild(bone237);
		setRotationAngle(bone237, 0.0F, 0.3927F, 0.0F);
		

		bone238 = new ModelRenderer(this);
		bone238.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone235.addChild(bone238);
		setRotationAngle(bone238, -0.0436F, 0.0F, 0.0F);
		bone238.cubeList.add(new ModelBox(bone238, 112, 229, -3.5F, 7.8522F, -21.4417F, 3, 3, 5, 0.0F, false));
		bone238.cubeList.add(new ModelBox(bone238, 96, 199, -1.0F, 7.8522F, -21.4407F, 1, 3, 5, 0.0F, false));

		bone239 = new ModelRenderer(this);
		bone239.setRotationPoint(-0.5F, 0.0F, -5.5F);
		bone238.addChild(bone239);
		setRotationAngle(bone239, 0.0F, -0.3927F, 0.0F);
		

		bone240 = new ModelRenderer(this);
		bone240.setRotationPoint(-2.5F, 0.0F, -5.5F);
		bone238.addChild(bone240);
		setRotationAngle(bone240, 0.0F, 0.3927F, 0.0F);
		

		bone241 = new ModelRenderer(this);
		bone241.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone238.addChild(bone241);
		setRotationAngle(bone241, -0.0436F, 0.0F, 0.0F);
		bone241.cubeList.add(new ModelBox(bone241, 112, 220, -3.5F, 11.5148F, -20.9538F, 3, 3, 5, 0.0F, false));
		bone241.cubeList.add(new ModelBox(bone241, 93, 236, -1.0F, 11.5148F, -20.9528F, 1, 3, 5, 0.0F, false));

		bone242 = new ModelRenderer(this);
		bone242.setRotationPoint(-0.5F, 0.0F, -5.5F);
		bone241.addChild(bone242);
		setRotationAngle(bone242, 0.0F, -0.3927F, 0.0F);
		

		bone243 = new ModelRenderer(this);
		bone243.setRotationPoint(-2.5F, 0.0F, -5.5F);
		bone241.addChild(bone243);
		setRotationAngle(bone243, 0.0F, 0.3927F, 0.0F);
		

		bone244 = new ModelRenderer(this);
		bone244.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone241.addChild(bone244);
		setRotationAngle(bone244, -0.0436F, 0.0F, 0.0F);
		bone244.cubeList.add(new ModelBox(bone244, 111, 208, -3.5F, 15.1526F, -20.3066F, 3, 3, 5, 0.0F, false));
		bone244.cubeList.add(new ModelBox(bone244, 98, 203, -1.0F, 15.1526F, -20.3056F, 1, 3, 5, 0.0F, false));

		bone245 = new ModelRenderer(this);
		bone245.setRotationPoint(-0.5F, 0.0F, -5.5F);
		bone244.addChild(bone245);
		setRotationAngle(bone245, 0.0F, -0.3927F, 0.0F);
		

		bone246 = new ModelRenderer(this);
		bone246.setRotationPoint(-2.5F, 0.0F, -5.5F);
		bone244.addChild(bone246);
		setRotationAngle(bone246, 0.0F, 0.3927F, 0.0F);
		

		bone247 = new ModelRenderer(this);
		bone247.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone244.addChild(bone247);
		setRotationAngle(bone247, -0.0436F, 0.0F, 0.0F);
		bone247.cubeList.add(new ModelBox(bone247, 112, 199, -3.6F, 18.7588F, -19.5014F, 3, 3, 5, 0.0F, false));
		bone247.cubeList.add(new ModelBox(bone247, 100, 211, -1.9239F, 18.7626F, -19.9307F, 1, 3, 1, 0.0F, false));
		bone247.cubeList.add(new ModelBox(bone247, 94, 211, -2.5761F, 18.7626F, -19.9317F, 1, 3, 1, 0.0F, false));
		bone247.cubeList.add(new ModelBox(bone247, 122, 242, -0.9F, 18.7588F, -19.5004F, 1, 3, 5, 0.0F, false));

		bone248 = new ModelRenderer(this);
		bone248.setRotationPoint(-0.5F, 0.0F, -5.5F);
		bone247.addChild(bone248);
		setRotationAngle(bone248, 0.0F, -0.3927F, 0.0F);
		bone248.cubeList.add(new ModelBox(bone248, 88, 211, -5.914F, 18.7626F, -13.17F, 1, 3, 1, 0.0F, false));

		bone249 = new ModelRenderer(this);
		bone249.setRotationPoint(-2.5F, 0.0F, -5.5F);
		bone247.addChild(bone249);
		setRotationAngle(bone249, 0.0F, 0.3927F, 0.0F);
		bone249.cubeList.add(new ModelBox(bone249, 91, 215, 4.4525F, 18.7626F, -13.3622F, 1, 3, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		magazine.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}