package com.paneedah.mwc.models;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class SR2MG extends ModelBase {
	private final ModelRenderer grip;
	private final ModelRenderer asval_stock_r1;
	private final ModelRenderer cube_r55;
	private final ModelRenderer cube_r56;
	private final ModelRenderer cube_r57;
	private final ModelRenderer cube_r58;
	private final ModelRenderer cube_r59;
	private final ModelRenderer cube_r60;
	private final ModelRenderer bone21;
	private final ModelRenderer cube_r74;
	private final ModelRenderer cube_r75;
	private final ModelRenderer cube_r76;
	private final ModelRenderer bone22;
	private final ModelRenderer cube_r77;
	private final ModelRenderer cube_r78;

	public SR2MG() {
		textureWidth = 256;
		textureHeight = 256;

		grip = new ModelRenderer(this);
		grip.setRotationPoint(0.5F, -6.6F, -7.4F);
		grip.cubeList.add(new ModelBox(grip, 73, 68, -3.5F, 1.5F, 5.0F, 3, 1, 7, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 73, 68, -3.5F, 5.25F, -3.0F, 3, 1, 7, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 116, 102, -3.5F, 2.3F, 5.0F, 3, 1, 6, -0.001F, false));
		grip.cubeList.add(new ModelBox(grip, 127, 146, -3.5F, 3.3F, 4.6F, 3, 2, 5, -0.001F, false));
		grip.cubeList.add(new ModelBox(grip, 76, 167, -2.9F, 12.3F, 3.3F, 3, 1, 4, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 84, 63, -2.9F, 4.55F, 4.15F, 3, 1, 2, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 12, 174, -4.1F, 12.3F, 3.3F, 2, 1, 4, -0.001F, false));
		grip.cubeList.add(new ModelBox(grip, 78, 169, -2.9F, 12.3F, 7.3F, 3, 1, 2, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 14, 176, -4.1F, 12.3F, 7.3F, 2, 1, 2, -0.001F, false));
		grip.cubeList.add(new ModelBox(grip, 36, 88, -4.1F, 4.55F, 4.15F, 2, 1, 2, -0.001F, false));

		asval_stock_r1 = new ModelRenderer(this);
		asval_stock_r1.setRotationPoint(-1.1F, 30.65F, 10.65F);
		grip.addChild(asval_stock_r1);
		setRotationAngle(asval_stock_r1, -1.5708F, 0.0F, 0.0F);
		asval_stock_r1.cubeList.add(new ModelBox(asval_stock_r1, 73, 68, -2.4F, 13.65F, -31.4F, 3, 1, 7, 0.0F, false));

		cube_r55 = new ModelRenderer(this);
		cube_r55.setRotationPoint(-4.1F, 9.65F, 9.0F);
		grip.addChild(cube_r55);
		setRotationAngle(cube_r55, -1.2392F, 0.0F, 0.0F);
		cube_r55.cubeList.add(new ModelBox(cube_r55, 109, 146, 0.0F, -1.7594F, -8.0383F, 2, 1, 6, -0.003F, false));
		cube_r55.cubeList.add(new ModelBox(cube_r55, 116, 120, 1.2F, -1.7594F, -8.0383F, 3, 1, 6, -0.001F, false));

		cube_r56 = new ModelRenderer(this);
		cube_r56.setRotationPoint(-4.1F, 9.65F, 9.0F);
		grip.addChild(cube_r56);
		setRotationAngle(cube_r56, -1.4312F, 0.0F, 0.0F);
		cube_r56.cubeList.add(new ModelBox(cube_r56, 166, 162, 0.0F, -1.3381F, -2.3365F, 2, 1, 5, -0.001F, false));
		cube_r56.cubeList.add(new ModelBox(cube_r56, 49, 122, 1.2F, -1.3381F, -2.3365F, 3, 1, 5, 0.0F, false));

		cube_r57 = new ModelRenderer(this);
		cube_r57.setRotationPoint(-4.1F, 14.8F, 3.3F);
		grip.addChild(cube_r57);
		setRotationAngle(cube_r57, 0.7854F, 0.0F, 0.0F);
		cube_r57.cubeList.add(new ModelBox(cube_r57, 74, 102, 0.0F, -1.7678F, 1.7678F, 2, 1, 1, -0.002F, false));
		cube_r57.cubeList.add(new ModelBox(cube_r57, 73, 89, 1.2F, -1.7678F, 1.7678F, 3, 1, 1, -0.001F, false));

		cube_r58 = new ModelRenderer(this);
		cube_r58.setRotationPoint(-4.1F, 15.8F, 8.3F);
		grip.addChild(cube_r58);
		setRotationAngle(cube_r58, 0.4712F, 0.0F, 0.0F);
		cube_r58.cubeList.add(new ModelBox(cube_r58, 28, 88, 0.0F, -3.2276F, 1.8349F, 2, 1, 2, -0.003F, false));
		cube_r58.cubeList.add(new ModelBox(cube_r58, 81, 42, 1.2F, -3.2276F, 1.8349F, 3, 1, 2, -0.002F, false));

		cube_r59 = new ModelRenderer(this);
		cube_r59.setRotationPoint(-4.1F, 3.95F, 6.7F);
		grip.addChild(cube_r59);
		setRotationAngle(cube_r59, -1.5708F, 0.0F, 0.0F);
		cube_r59.cubeList.add(new ModelBox(cube_r59, 18, 115, 0.0F, -2.0F, -2.5F, 2, 5, 11, 0.002F, false));
		cube_r59.cubeList.add(new ModelBox(cube_r59, 146, 0, 1.2F, -2.0F, -2.5F, 3, 5, 11, 0.001F, false));
		cube_r59.cubeList.add(new ModelBox(cube_r59, 146, 0, 1.2F, -3.0F, -2.5F, 3, 1, 11, 0.001F, false));
		cube_r59.cubeList.add(new ModelBox(cube_r59, 18, 115, 0.0F, -3.0F, -2.5F, 2, 1, 11, 0.002F, false));

		cube_r60 = new ModelRenderer(this);
		cube_r60.setRotationPoint(-4.1F, 2.5F, 9.0F);
		grip.addChild(cube_r60);
		setRotationAngle(cube_r60, -0.8378F, 0.0F, 0.0F);
		cube_r60.cubeList.add(new ModelBox(cube_r60, 27, 127, 0.6F, -2.2295F, 1.0073F, 3, 3, 1, -0.002F, false));

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(-3.0F, -2.2F, 36.249F);
		grip.addChild(bone21);
		setRotationAngle(bone21, -0.2094F, 0.0F, 0.0F);
		

		cube_r74 = new ModelRenderer(this);
		cube_r74.setRotationPoint(2.92F, 2.85F, -0.149F);
		bone21.addChild(cube_r74);
		setRotationAngle(cube_r74, -0.0524F, 0.0F, 0.0F);
		

		cube_r75 = new ModelRenderer(this);
		cube_r75.setRotationPoint(2.0F, 0.0F, 0.0F);
		bone21.addChild(cube_r75);
		setRotationAngle(cube_r75, 0.0698F, 0.0F, 0.0F);
		

		cube_r76 = new ModelRenderer(this);
		cube_r76.setRotationPoint(2.0F, 0.0F, 0.0F);
		bone21.addChild(cube_r76);
		setRotationAngle(cube_r76, 0.0026F, 0.0187F, -0.3137F);
		

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(2.0F, -0.1247F, 0.5869F);
		bone21.addChild(bone22);
		setRotationAngle(bone22, -0.0698F, 0.0F, 0.0F);
		

		cube_r77 = new ModelRenderer(this);
		cube_r77.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone22.addChild(cube_r77);
		setRotationAngle(cube_r77, -0.0524F, 0.0F, 0.0F);
		

		cube_r78 = new ModelRenderer(this);
		cube_r78.setRotationPoint(0.92F, 9.85F, -0.519F);
		bone22.addChild(cube_r78);
		setRotationAngle(cube_r78, -0.0462F, 0.0246F, 0.4881F);
		
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		grip.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}