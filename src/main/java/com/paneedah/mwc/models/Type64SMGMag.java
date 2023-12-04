package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Type64SMGMag extends ModelWithAttachments {
	private final ModelRenderer mag;
	private final ModelRenderer gun105_r1;
	private final ModelRenderer gun103_r1;
	private final ModelRenderer bone4;
	private final ModelRenderer gun103_r2;
	private final ModelRenderer bone5;
	private final ModelRenderer bone;
	private final ModelRenderer bone3;
	private final ModelRenderer bone2;

	public Type64SMGMag() {
		textureWidth = 256;
		textureHeight = 256;

		mag = new ModelRenderer(this);
		mag.setRotationPoint(-1.4643F, 0.2143F, -22.7514F);
		setRotationAngle(mag, -0.1309F, 0.0F, 0.0F);
		mag.cubeList.add(new ModelBox(mag, 173, 90, -1.9357F, -7.2143F, -3.2586F, 2, 7, 1, 0.0F, true));
		mag.cubeList.add(new ModelBox(mag, 173, 90, -2.0357F, -7.2143F, -1.1586F, 1, 7, 1, 0.0F, true));
		mag.cubeList.add(new ModelBox(mag, 173, 90, -1.9357F, -7.2143F, 1.2414F, 2, 7, 1, 0.0F, true));
		mag.cubeList.add(new ModelBox(mag, 173, 90, -0.0357F, -7.2143F, 1.2414F, 2, 7, 1, 0.0F, true));
		mag.cubeList.add(new ModelBox(mag, 173, 90, 1.0643F, -7.2143F, -1.1586F, 1, 7, 1, 0.0F, true));
		mag.cubeList.add(new ModelBox(mag, 173, 90, 1.0643F, -7.2143F, 0.5414F, 1, 7, 1, 0.0F, true));
		mag.cubeList.add(new ModelBox(mag, 173, 90, -2.0357F, -7.2143F, 0.5414F, 1, 7, 1, 0.0F, true));
		mag.cubeList.add(new ModelBox(mag, 173, 92, 0.9643F, -7.2143F, -0.7586F, 1, 7, 2, 0.0F, true));
		mag.cubeList.add(new ModelBox(mag, 173, 92, -1.9357F, -7.2143F, -0.7586F, 1, 7, 2, 0.0F, true));
		mag.cubeList.add(new ModelBox(mag, 173, 92, 0.9643F, -7.2143F, -2.2586F, 1, 7, 2, 0.0F, true));
		mag.cubeList.add(new ModelBox(mag, 173, 92, -1.9357F, -7.2143F, -2.2586F, 1, 7, 2, 0.0F, true));
		mag.cubeList.add(new ModelBox(mag, 173, 90, -1.0357F, -7.2143F, -3.2486F, 3, 7, 1, 0.0F, true));

		gun105_r1 = new ModelRenderer(this);
		gun105_r1.setRotationPoint(0.0143F, -6.1536F, 0.7006F);
		mag.addChild(gun105_r1);
		setRotationAngle(gun105_r1, -0.1309F, 0.0F, 0.0F);
		gun105_r1.cubeList.add(new ModelBox(gun105_r1, 173, 118, -2.05F, 12.5642F, -0.438F, 1, 1, 2, 0.0F, true));
		gun105_r1.cubeList.add(new ModelBox(gun105_r1, 172, 118, -2.05F, 12.5642F, -3.138F, 1, 1, 3, 0.0F, true));
		gun105_r1.cubeList.add(new ModelBox(gun105_r1, 171, 118, 1.05F, 12.5642F, -3.138F, 1, 1, 3, 0.0F, true));
		gun105_r1.cubeList.add(new ModelBox(gun105_r1, 172, 119, 1.05F, 12.5642F, -0.438F, 1, 1, 2, 0.0F, true));
		gun105_r1.cubeList.add(new ModelBox(gun105_r1, 173, 90, -1.95F, 12.5642F, -3.238F, 2, 1, 1, 0.0F, true));
		gun105_r1.cubeList.add(new ModelBox(gun105_r1, 173, 92, -1.95F, 12.5642F, -2.238F, 1, 1, 2, 0.0F, true));
		gun105_r1.cubeList.add(new ModelBox(gun105_r1, 173, 92, -1.95F, 12.5642F, -0.738F, 1, 1, 2, 0.0F, true));
		gun105_r1.cubeList.add(new ModelBox(gun105_r1, 173, 90, -1.95F, 12.5642F, 1.262F, 2, 1, 1, 0.0F, true));
		gun105_r1.cubeList.add(new ModelBox(gun105_r1, 173, 90, -1.05F, 12.5642F, -3.228F, 3, 1, 1, 0.0F, true));
		gun105_r1.cubeList.add(new ModelBox(gun105_r1, 173, 92, -1.05F, 12.5642F, -0.738F, 2, 1, 2, 0.0F, true));
		gun105_r1.cubeList.add(new ModelBox(gun105_r1, 173, 92, -1.05F, 12.5642F, -2.238F, 2, 1, 2, 0.0F, true));
		gun105_r1.cubeList.add(new ModelBox(gun105_r1, 173, 92, 0.95F, 12.5642F, -2.238F, 1, 1, 2, 0.0F, true));
		gun105_r1.cubeList.add(new ModelBox(gun105_r1, 173, 92, 0.95F, 12.5642F, -0.738F, 1, 1, 2, 0.0F, true));
		gun105_r1.cubeList.add(new ModelBox(gun105_r1, 173, 90, -0.05F, 12.5642F, 1.262F, 2, 1, 1, 0.0F, true));

		gun103_r1 = new ModelRenderer(this);
		gun103_r1.setRotationPoint(0.0143F, 2.7694F, -0.4741F);
		mag.addChild(gun103_r1);
		setRotationAngle(gun103_r1, -0.1309F, 0.0F, 0.0F);
		gun103_r1.cubeList.add(new ModelBox(gun103_r1, 173, 90, -1.05F, -3.4358F, -3.228F, 3, 7, 1, 0.0F, true));
		gun103_r1.cubeList.add(new ModelBox(gun103_r1, 173, 90, -1.95F, -3.4358F, -3.238F, 2, 7, 1, 0.0F, true));
		gun103_r1.cubeList.add(new ModelBox(gun103_r1, 173, 92, -1.95F, -3.4358F, -2.238F, 1, 7, 2, 0.0F, true));
		gun103_r1.cubeList.add(new ModelBox(gun103_r1, 173, 90, -2.05F, -3.4358F, -1.138F, 1, 6, 1, 0.0F, true));
		gun103_r1.cubeList.add(new ModelBox(gun103_r1, 173, 90, -2.05F, -3.4358F, 0.562F, 1, 6, 1, 0.0F, true));
		gun103_r1.cubeList.add(new ModelBox(gun103_r1, 173, 92, -1.95F, -3.4358F, -0.738F, 1, 7, 2, 0.0F, true));
		gun103_r1.cubeList.add(new ModelBox(gun103_r1, 173, 92, 0.95F, -3.4358F, -2.238F, 1, 7, 2, 0.0F, true));
		gun103_r1.cubeList.add(new ModelBox(gun103_r1, 173, 90, 1.05F, -3.4358F, -1.138F, 1, 6, 1, 0.0F, true));
		gun103_r1.cubeList.add(new ModelBox(gun103_r1, 173, 90, 1.05F, -3.4358F, 0.562F, 1, 6, 1, 0.0F, true));
		gun103_r1.cubeList.add(new ModelBox(gun103_r1, 173, 92, 0.95F, -3.4358F, -0.738F, 1, 7, 2, 0.0F, true));
		gun103_r1.cubeList.add(new ModelBox(gun103_r1, 173, 90, -0.05F, -3.4358F, 1.262F, 2, 7, 1, 0.0F, true));
		gun103_r1.cubeList.add(new ModelBox(gun103_r1, 173, 90, -1.95F, -3.4358F, 1.262F, 2, 7, 1, 0.0F, true));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-2.5357F, 25.7857F, 17.7514F);
		mag.addChild(bone4);
		bone4.cubeList.add(new ModelBox(bone4, 173, 91, 1.5F, -33.25F, -15.55F, 2, 7, 1, 0.0F, true));

		gun103_r2 = new ModelRenderer(this);
		gun103_r2.setRotationPoint(2.55F, -23.0163F, -18.2255F);
		bone4.addChild(gun103_r2);
		setRotationAngle(gun103_r2, -0.1309F, 0.0F, 0.0F);
		gun103_r2.cubeList.add(new ModelBox(gun103_r2, 173, 91, -1.05F, -3.6858F, 2.222F, 2, 7, 1, 0.0F, true));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-2.5357F, 25.7857F, 18.7514F);
		mag.addChild(bone5);
		bone5.cubeList.add(new ModelBox(bone5, 173, 91, 1.5F, -33.25F, -15.55F, 2, 3, 1, 0.0F, true));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-0.0857F, -7.2143F, -1.2486F);
		mag.addChild(bone);
		setRotationAngle(bone, 0.0F, 0.0F, -0.7854F);
		

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(1.0143F, -12.1143F, -1.7486F);
		mag.addChild(bone3);
		setRotationAngle(bone3, 0.0F, 0.0698F, -2.0769F);
		bone3.cubeList.add(new ModelBox(bone3, 171, 117, -4.9958F, -2.6899F, -0.3593F, 1, 1, 4, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-1.1357F, -12.0143F, -1.7486F);
		mag.addChild(bone2);
		setRotationAngle(bone2, 0.0F, -0.0698F, 2.0769F);
		bone2.cubeList.add(new ModelBox(bone2, 172, 116, 3.836F, -2.7726F, -0.3481F, 1, 1, 4, 0.0F, false));
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