package com.paneedah.mwc.models;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AK19Grip extends ModelBase {
	private final ModelRenderer grip2;
	private final ModelRenderer gun14;
	private final ModelRenderer gun15;
	private final ModelRenderer gun16;
	private final ModelRenderer gun40_r2;
	private final ModelRenderer gun17;
	private final ModelRenderer gun18;
	private final ModelRenderer gun19;
	private final ModelRenderer gun20;
	private final ModelRenderer gun21;
	private final ModelRenderer gun22;
	private final ModelRenderer gun23;
	private final ModelRenderer gun24;
	private final ModelRenderer gun25;
	private final ModelRenderer gun26;
	private final ModelRenderer gun27;
	private final ModelRenderer gun28;
	private final ModelRenderer gun29;
	private final ModelRenderer gun30;
	private final ModelRenderer gun43;
	private final ModelRenderer gun44;
	private final ModelRenderer gun45;
	private final ModelRenderer gun46;
	private final ModelRenderer gun48;
	private final ModelRenderer gun49;
	private final ModelRenderer gun50;
	private final ModelRenderer gun47;
	private final ModelRenderer bone;
	private final ModelRenderer gun26_r1;
	private final ModelRenderer gun28_r1;

	public AK19Grip() {
		textureWidth = 50;
		textureHeight = 50;

		grip2 = new ModelRenderer(this);
		grip2.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		gun14 = new ModelRenderer(this);
		gun14.setRotationPoint(-3.5F, -21.0F, -2.2F);
		grip2.addChild(gun14);
		setRotationAngle(gun14, -0.4856F, 0.0F, 0.0F);
		

		gun15 = new ModelRenderer(this);
		gun15.setRotationPoint(-3.5F, -25.0F, -4.3F);
		grip2.addChild(gun15);
		setRotationAngle(gun15, -0.4856F, 0.0F, 0.0F);
		

		gun16 = new ModelRenderer(this);
		gun16.setRotationPoint(-3.5F, -24.2F, 1.5F);
		grip2.addChild(gun16);
		setRotationAngle(gun16, 0.4067F, 0.0F, 0.0F);
		

		gun40_r2 = new ModelRenderer(this);
		gun40_r2.setRotationPoint(4.0F, 0.0F, 1.0F);
		gun16.addChild(gun40_r2);
		setRotationAngle(gun40_r2, -0.0524F, 0.0F, 0.0F);
		gun40_r2.cubeList.add(new ModelBox(gun40_r2, 30, 21, -4.0F, 0.0F, -1.0F, 4, 7, 1, 0.0F, false));

		gun17 = new ModelRenderer(this);
		gun17.setRotationPoint(-3.5F, -27.7F, -1.5F);
		grip2.addChild(gun17);
		setRotationAngle(gun17, 0.7041F, 0.0F, 0.0F);
		gun17.cubeList.add(new ModelBox(gun17, 33, 10, 0.001F, 1.0F, 0.0F, 4, 4, 1, 0.0F, false));

		gun18 = new ModelRenderer(this);
		gun18.setRotationPoint(-3.6F, -28.8F, -5.0F);
		grip2.addChild(gun18);
		

		gun19 = new ModelRenderer(this);
		gun19.setRotationPoint(-0.4F, -28.8F, -5.0F);
		grip2.addChild(gun19);
		

		gun20 = new ModelRenderer(this);
		gun20.setRotationPoint(-0.4F, -28.8F, -6.5F);
		grip2.addChild(gun20);
		setRotationAngle(gun20, 0.4461F, 0.0F, 0.0F);
		

		gun21 = new ModelRenderer(this);
		gun21.setRotationPoint(-3.6F, -28.8F, -6.5F);
		grip2.addChild(gun21);
		setRotationAngle(gun21, 0.4461F, 0.0F, 0.0F);
		

		gun22 = new ModelRenderer(this);
		gun22.setRotationPoint(-3.6F, -29.8F, -6.5F);
		grip2.addChild(gun22);
		

		gun23 = new ModelRenderer(this);
		gun23.setRotationPoint(-0.4F, -29.8F, -6.5F);
		grip2.addChild(gun23);
		

		gun24 = new ModelRenderer(this);
		gun24.setRotationPoint(-0.4F, -27.5F, -5.9F);
		grip2.addChild(gun24);
		setRotationAngle(gun24, 0.481F, 0.0F, 0.0F);
		gun24.cubeList.add(new ModelBox(gun24, 18, 21, 0.0F, 2.8463F, 0.0887F, 1, 10, 5, 0.0F, false));

		gun25 = new ModelRenderer(this);
		gun25.setRotationPoint(-3.6F, -27.5F, -5.9F);
		grip2.addChild(gun25);
		setRotationAngle(gun25, 0.481F, 0.0F, 0.0F);
		gun25.cubeList.add(new ModelBox(gun25, 0, 27, 0.0F, 2.8463F, 0.0887F, 1, 10, 5, 0.0F, false));

		gun26 = new ModelRenderer(this);
		gun26.setRotationPoint(-3.5F, -29.2F, 0.67F);
		grip2.addChild(gun26);
		setRotationAngle(gun26, -2.1564F, 0.0F, 0.0F);
		gun26.cubeList.add(new ModelBox(gun26, 17, 6, 0.001F, 0.0F, 0.0F, 4, 1, 2, 0.0F, false));

		gun27 = new ModelRenderer(this);
		gun27.setRotationPoint(-3.5F, -30.0F, -0.4F);
		grip2.addChild(gun27);
		gun27.cubeList.add(new ModelBox(gun27, 33, 4, 0.002F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));

		gun28 = new ModelRenderer(this);
		gun28.setRotationPoint(-3.5F, -26.5F, -7.0F);
		grip2.addChild(gun28);
		setRotationAngle(gun28, 1.2269F, 0.0F, 0.0F);
		

		gun29 = new ModelRenderer(this);
		gun29.setRotationPoint(-1.499F, -25.2756F, -14.3126F);
		grip2.addChild(gun29);
		setRotationAngle(gun29, -1.9635F, 0.0F, 0.0F);
		gun29.cubeList.add(new ModelBox(gun29, 3, 19, -2.0F, -3.0272F, -1.2935F, 4, 6, 1, 0.0F, false));

		gun30 = new ModelRenderer(this);
		gun30.setRotationPoint(-3.5F, -26.5F, -7.0F);
		grip2.addChild(gun30);
		setRotationAngle(gun30, -1.309F, 0.0F, 0.0F);
		gun30.cubeList.add(new ModelBox(gun30, 3, 19, 0.001F, -1.2F, -0.1F, 4, 6, 1, 0.0F, false));

		gun43 = new ModelRenderer(this);
		gun43.setRotationPoint(-3.5F, -30.5F, -7.0F);
		grip2.addChild(gun43);
		gun43.cubeList.add(new ModelBox(gun43, 18, 10, 0.0F, 0.0F, 0.0F, 4, 4, 7, 0.0F, false));

		gun44 = new ModelRenderer(this);
		gun44.setRotationPoint(-3.5F, -18.8F, 4.2F);
		grip2.addChild(gun44);
		setRotationAngle(gun44, -0.6692F, 0.0F, 0.0F);
		

		gun45 = new ModelRenderer(this);
		gun45.setRotationPoint(-3.5F, -15.5F, 3.0F);
		grip2.addChild(gun45);
		setRotationAngle(gun45, 2.491F, 0.0F, 0.0F);
		gun45.cubeList.add(new ModelBox(gun45, 13, 10, 0.001F, 0.0F, 0.0F, 4, 3, 2, 0.0F, false));

		gun46 = new ModelRenderer(this);
		gun46.setRotationPoint(-3.5F, -28.5F, -1.5F);
		grip2.addChild(gun46);
		setRotationAngle(gun46, 0.481F, 0.0F, 0.0F);
		gun46.cubeList.add(new ModelBox(gun46, 7, 27, -0.001F, 1.0F, 0.0F, 4, 3, 1, 0.0F, false));

		gun48 = new ModelRenderer(this);
		gun48.setRotationPoint(-3.5F, -17.5F, -1.0F);
		grip2.addChild(gun48);
		gun48.cubeList.add(new ModelBox(gun48, 17, 0, 0.0F, 0.0F, 0.0F, 4, 2, 4, 0.0F, false));

		gun49 = new ModelRenderer(this);
		gun49.setRotationPoint(-3.5F, -30.0F, 2.0F);
		grip2.addChild(gun49);
		setRotationAngle(gun49, -2.5281F, 0.0F, 0.0F);
		gun49.cubeList.add(new ModelBox(gun49, 26, 6, -0.001F, 0.0F, 0.0F, 4, 1, 3, 0.0F, false));

		gun50 = new ModelRenderer(this);
		gun50.setRotationPoint(-3.5F, -26.5F, -6.0F);
		grip2.addChild(gun50);
		setRotationAngle(gun50, 0.481F, 0.0F, 0.0F);
		gun50.cubeList.add(new ModelBox(gun50, 0, 10, 0.002F, 0.0F, 0.0F, 4, 12, 5, 0.0F, false));
		gun50.cubeList.add(new ModelBox(gun50, 28, 46, -0.498F, -1.5F, 0.25F, 5, 1, 1, 0.0F, false));

		gun47 = new ModelRenderer(this);
		gun47.setRotationPoint(-3.5F, -31.0F, -7.0F);
		grip2.addChild(gun47);
		gun47.cubeList.add(new ModelBox(gun47, 0, 0, 0.001F, 0.0F, -0.001F, 4, 1, 9, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 9.0F, 0.0F);
		grip2.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 4, 21, -0.35F, -39.8F, -18.001F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 10, 20, -0.349F, -39.8F, -17.5F, 1, 1, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 33, 46, -3.6F, -37.7F, -17.5F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 32, 46, -0.4F, -37.7F, -17.5F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 3, 18, -3.5F, -41.2F, -18.0F, 4, 5, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 3, 18, -3.499F, -41.2F, -17.5F, 4, 5, 2, 0.0F, false));

		gun26_r1 = new ModelRenderer(this);
		gun26_r1.setRotationPoint(-1.5F, -36.2305F, -16.8824F);
		bone.addChild(gun26_r1);
		setRotationAngle(gun26_r1, 1.1345F, 0.0F, 0.0F);
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 22, 18, -2.0F, -1.0F, -0.5F, 4, 2, 1, 0.0F, false));

		gun28_r1 = new ModelRenderer(this);
		gun28_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(gun28_r1);
		setRotationAngle(gun28_r1, 0.2182F, 0.0F, 0.0F);
		gun28_r1.cubeList.add(new ModelBox(gun28_r1, 14, 45, -3.0F, -39.0F, -8.9F, 3, 3, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		grip2.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}