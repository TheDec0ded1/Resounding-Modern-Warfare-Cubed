package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Type64SMGMag2 extends ModelWithAttachments {
	private final ModelRenderer mag2;
	private final ModelRenderer gun106_r1;
	private final ModelRenderer gun107_r1;
	private final ModelRenderer gun105_r1;
	private final ModelRenderer gun104_r1;
	private final ModelRenderer bone6;
	private final ModelRenderer gun106_r2;
	private final ModelRenderer gun105_r2;
	private final ModelRenderer gun104_r2;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;
	private final ModelRenderer bone10;

	public Type64SMGMag2() {
		textureWidth = 256;
		textureHeight = 256;

		mag2 = new ModelRenderer(this);
		mag2.setRotationPoint(-1.4643F, 0.2143F, -22.7514F);
		setRotationAngle(mag2, -0.1309F, 0.0F, 0.0F);
		mag2.cubeList.add(new ModelBox(mag2, 173, 90, -1.9357F, -7.2143F, -3.2586F, 2, 7, 1, 0.0F, true));
		mag2.cubeList.add(new ModelBox(mag2, 173, 90, -2.0357F, -7.2143F, -1.1586F, 1, 7, 1, 0.0F, true));
		mag2.cubeList.add(new ModelBox(mag2, 173, 90, -1.9357F, -7.2143F, 1.2414F, 2, 7, 1, 0.0F, true));
		mag2.cubeList.add(new ModelBox(mag2, 173, 90, -0.0357F, -7.2143F, 1.2414F, 2, 7, 1, 0.0F, true));
		mag2.cubeList.add(new ModelBox(mag2, 173, 90, 1.0643F, -7.2143F, -1.1586F, 1, 7, 1, 0.0F, true));
		mag2.cubeList.add(new ModelBox(mag2, 173, 90, 1.0643F, -7.2143F, 0.5414F, 1, 7, 1, 0.0F, true));
		mag2.cubeList.add(new ModelBox(mag2, 173, 90, -2.0357F, -7.2143F, 0.5414F, 1, 7, 1, 0.0F, true));
		mag2.cubeList.add(new ModelBox(mag2, 173, 92, 0.9643F, -7.2143F, -0.7586F, 1, 7, 2, 0.0F, true));
		mag2.cubeList.add(new ModelBox(mag2, 173, 92, -1.9357F, -7.2143F, -0.7586F, 1, 7, 2, 0.0F, true));
		mag2.cubeList.add(new ModelBox(mag2, 173, 92, 0.9643F, -7.2143F, -2.2586F, 1, 7, 2, 0.0F, true));
		mag2.cubeList.add(new ModelBox(mag2, 173, 92, -1.9357F, -7.2143F, -2.2586F, 1, 7, 2, 0.0F, true));
		mag2.cubeList.add(new ModelBox(mag2, 173, 90, -1.0357F, -7.2143F, -3.2486F, 3, 7, 1, 0.0F, true));

		gun106_r1 = new ModelRenderer(this);
		gun106_r1.setRotationPoint(0.0143F, 1.4867F, -19.1195F);
		mag2.addChild(gun106_r1);
		setRotationAngle(gun106_r1, -0.3054F, 0.0F, 0.0F);
		gun106_r1.cubeList.add(new ModelBox(gun106_r1, 173, 118, -2.05F, 12.5642F, 18.562F, 1, 1, 2, 0.0F, true));
		gun106_r1.cubeList.add(new ModelBox(gun106_r1, 172, 118, -2.05F, 12.5642F, 15.862F, 1, 1, 3, 0.0F, true));
		gun106_r1.cubeList.add(new ModelBox(gun106_r1, 171, 118, 1.05F, 12.5642F, 15.862F, 1, 1, 3, 0.0F, true));
		gun106_r1.cubeList.add(new ModelBox(gun106_r1, 172, 119, 1.05F, 12.5642F, 18.562F, 1, 1, 2, 0.0F, true));
		gun106_r1.cubeList.add(new ModelBox(gun106_r1, 173, 90, -1.95F, 12.5642F, 15.762F, 2, 1, 1, 0.0F, true));
		gun106_r1.cubeList.add(new ModelBox(gun106_r1, 173, 92, -1.95F, 12.5642F, 16.762F, 1, 1, 2, 0.0F, true));
		gun106_r1.cubeList.add(new ModelBox(gun106_r1, 173, 92, -1.95F, 12.5642F, 18.262F, 1, 1, 2, 0.0F, true));
		gun106_r1.cubeList.add(new ModelBox(gun106_r1, 173, 90, -1.95F, 12.5642F, 20.262F, 2, 1, 1, 0.0F, true));
		gun106_r1.cubeList.add(new ModelBox(gun106_r1, 173, 90, -1.05F, 12.5642F, 15.772F, 3, 1, 1, 0.0F, true));
		gun106_r1.cubeList.add(new ModelBox(gun106_r1, 173, 92, -1.05F, 12.5642F, 18.262F, 2, 1, 2, 0.0F, true));
		gun106_r1.cubeList.add(new ModelBox(gun106_r1, 173, 92, -1.05F, 12.5642F, 16.762F, 2, 1, 2, 0.0F, true));
		gun106_r1.cubeList.add(new ModelBox(gun106_r1, 173, 92, 0.95F, 12.5642F, 16.762F, 1, 1, 2, 0.0F, true));
		gun106_r1.cubeList.add(new ModelBox(gun106_r1, 173, 92, 0.95F, 12.5642F, 18.262F, 1, 1, 2, 0.0F, true));
		gun106_r1.cubeList.add(new ModelBox(gun106_r1, 173, 90, -0.05F, 12.5642F, 20.262F, 2, 1, 1, 0.0F, true));

		gun107_r1 = new ModelRenderer(this);
		gun107_r1.setRotationPoint(0.0143F, 5.7613F, -4.5661F);
		mag2.addChild(gun107_r1);
		setRotationAngle(gun107_r1, -0.3054F, 0.0F, 0.0F);
		gun107_r1.cubeList.add(new ModelBox(gun107_r1, 173, 90, -2.05F, 5.8638F, 4.3968F, 1, 7, 1, 0.0F, true));
		gun107_r1.cubeList.add(new ModelBox(gun107_r1, 173, 90, -2.05F, 5.8638F, 2.6968F, 1, 7, 1, 0.0F, true));
		gun107_r1.cubeList.add(new ModelBox(gun107_r1, 173, 90, 1.05F, 5.8638F, 4.3968F, 1, 7, 1, 0.0F, true));
		gun107_r1.cubeList.add(new ModelBox(gun107_r1, 173, 90, 1.05F, 5.8638F, 2.6968F, 1, 7, 1, 0.0F, true));
		gun107_r1.cubeList.add(new ModelBox(gun107_r1, 173, 90, -1.95F, 5.8638F, 0.5968F, 2, 7, 1, 0.0F, true));
		gun107_r1.cubeList.add(new ModelBox(gun107_r1, 173, 90, -1.05F, 5.8638F, 0.6068F, 3, 7, 1, 0.0F, true));
		gun107_r1.cubeList.add(new ModelBox(gun107_r1, 173, 92, 0.95F, 5.8638F, 1.5968F, 1, 7, 2, 0.0F, true));
		gun107_r1.cubeList.add(new ModelBox(gun107_r1, 173, 92, -1.95F, 5.8638F, 1.5968F, 1, 7, 2, 0.0F, true));
		gun107_r1.cubeList.add(new ModelBox(gun107_r1, 173, 92, -1.95F, 5.8638F, 3.0968F, 1, 7, 2, 0.0F, true));
		gun107_r1.cubeList.add(new ModelBox(gun107_r1, 173, 92, 0.95F, 5.8638F, 3.0968F, 1, 7, 2, 0.0F, true));
		gun107_r1.cubeList.add(new ModelBox(gun107_r1, 173, 90, -0.05F, 5.8638F, 5.0968F, 2, 7, 1, 0.0F, true));
		gun107_r1.cubeList.add(new ModelBox(gun107_r1, 173, 90, -1.95F, 5.8638F, 5.0968F, 2, 7, 1, 0.0F, true));

		gun105_r1 = new ModelRenderer(this);
		gun105_r1.setRotationPoint(0.0143F, 9.1413F, -1.7704F);
		mag2.addChild(gun105_r1);
		setRotationAngle(gun105_r1, -0.2618F, 0.0F, 0.0F);
		gun105_r1.cubeList.add(new ModelBox(gun105_r1, 173, 90, -1.95F, -3.375F, 1.27F, 2, 7, 1, 0.0F, true));
		gun105_r1.cubeList.add(new ModelBox(gun105_r1, 173, 90, -0.05F, -3.375F, 1.27F, 2, 7, 1, 0.0F, true));
		gun105_r1.cubeList.add(new ModelBox(gun105_r1, 173, 92, 0.95F, -3.375F, -0.73F, 1, 7, 2, 0.0F, true));
		gun105_r1.cubeList.add(new ModelBox(gun105_r1, 173, 92, -1.95F, -3.375F, -0.73F, 1, 7, 2, 0.0F, true));
		gun105_r1.cubeList.add(new ModelBox(gun105_r1, 173, 92, -1.95F, -3.375F, -2.23F, 1, 7, 2, 0.0F, true));
		gun105_r1.cubeList.add(new ModelBox(gun105_r1, 173, 92, 0.95F, -3.375F, -2.23F, 1, 7, 2, 0.0F, true));
		gun105_r1.cubeList.add(new ModelBox(gun105_r1, 173, 90, -1.05F, -3.375F, -3.22F, 3, 7, 1, 0.0F, true));
		gun105_r1.cubeList.add(new ModelBox(gun105_r1, 173, 90, -1.95F, -3.375F, -3.23F, 2, 7, 1, 0.0F, true));
		gun105_r1.cubeList.add(new ModelBox(gun105_r1, 173, 90, 1.05F, -3.375F, -1.13F, 1, 7, 1, 0.0F, true));
		gun105_r1.cubeList.add(new ModelBox(gun105_r1, 173, 90, 1.05F, -3.375F, 0.57F, 1, 7, 1, 0.0F, true));
		gun105_r1.cubeList.add(new ModelBox(gun105_r1, 173, 90, -2.05F, -3.375F, -1.13F, 1, 7, 1, 0.0F, true));
		gun105_r1.cubeList.add(new ModelBox(gun105_r1, 173, 90, -2.05F, -3.375F, 0.57F, 1, 7, 1, 0.0F, true));

		gun104_r1 = new ModelRenderer(this);
		gun104_r1.setRotationPoint(0.0143F, 2.7694F, -0.4741F);
		mag2.addChild(gun104_r1);
		setRotationAngle(gun104_r1, -0.1309F, 0.0F, 0.0F);
		gun104_r1.cubeList.add(new ModelBox(gun104_r1, 173, 90, -1.05F, -3.4358F, -3.228F, 3, 7, 1, 0.0F, true));
		gun104_r1.cubeList.add(new ModelBox(gun104_r1, 173, 90, -1.95F, -3.4358F, -3.238F, 2, 7, 1, 0.0F, true));
		gun104_r1.cubeList.add(new ModelBox(gun104_r1, 173, 92, -1.95F, -3.4358F, -2.238F, 1, 7, 2, 0.0F, true));
		gun104_r1.cubeList.add(new ModelBox(gun104_r1, 173, 90, -2.05F, -3.4358F, -1.138F, 1, 7, 1, 0.0F, true));
		gun104_r1.cubeList.add(new ModelBox(gun104_r1, 173, 90, -2.05F, -3.4358F, 0.562F, 1, 7, 1, 0.0F, true));
		gun104_r1.cubeList.add(new ModelBox(gun104_r1, 173, 92, -1.95F, -3.4358F, -0.738F, 1, 7, 2, 0.0F, true));
		gun104_r1.cubeList.add(new ModelBox(gun104_r1, 173, 92, 0.95F, -3.4358F, -2.238F, 1, 7, 2, 0.0F, true));
		gun104_r1.cubeList.add(new ModelBox(gun104_r1, 173, 90, 1.05F, -3.4358F, -1.138F, 1, 7, 1, 0.0F, true));
		gun104_r1.cubeList.add(new ModelBox(gun104_r1, 173, 90, 1.05F, -3.4358F, 0.562F, 1, 7, 1, 0.0F, true));
		gun104_r1.cubeList.add(new ModelBox(gun104_r1, 173, 92, 0.95F, -3.4358F, -0.738F, 1, 7, 2, 0.0F, true));
		gun104_r1.cubeList.add(new ModelBox(gun104_r1, 173, 90, -0.05F, -3.4358F, 1.262F, 2, 7, 1, 0.0F, true));
		gun104_r1.cubeList.add(new ModelBox(gun104_r1, 173, 90, -1.95F, -3.4358F, 1.262F, 2, 7, 1, 0.0F, true));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-2.5357F, 25.7857F, 17.7514F);
		mag2.addChild(bone6);
		bone6.cubeList.add(new ModelBox(bone6, 173, 91, 1.5F, -33.25F, -15.55F, 2, 7, 1, 0.0F, true));

		gun106_r2 = new ModelRenderer(this);
		gun106_r2.setRotationPoint(2.55F, -20.0244F, -22.3175F);
		bone6.addChild(gun106_r2);
		setRotationAngle(gun106_r2, -0.3054F, 0.0F, 0.0F);
		gun106_r2.cubeList.add(new ModelBox(gun106_r2, 173, 91, -1.05F, 5.6138F, 6.0568F, 2, 7, 1, 0.0F, true));

		gun105_r2 = new ModelRenderer(this);
		gun105_r2.setRotationPoint(2.55F, -16.6444F, -19.5218F);
		bone6.addChild(gun105_r2);
		setRotationAngle(gun105_r2, -0.2618F, 0.0F, 0.0F);
		gun105_r2.cubeList.add(new ModelBox(gun105_r2, 173, 91, -1.05F, -3.625F, 2.23F, 2, 7, 1, 0.0F, true));

		gun104_r2 = new ModelRenderer(this);
		gun104_r2.setRotationPoint(2.55F, -23.0163F, -18.2255F);
		bone6.addChild(gun104_r2);
		setRotationAngle(gun104_r2, -0.1309F, 0.0F, 0.0F);
		gun104_r2.cubeList.add(new ModelBox(gun104_r2, 173, 91, -1.05F, -3.6858F, 2.222F, 2, 7, 1, 0.0F, true));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-2.5357F, 25.7857F, 18.7514F);
		mag2.addChild(bone7);
		bone7.cubeList.add(new ModelBox(bone7, 173, 91, 1.5F, -33.25F, -15.55F, 2, 3, 1, 0.0F, true));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-0.0857F, -7.2143F, -1.2486F);
		mag2.addChild(bone8);
		setRotationAngle(bone8, 0.0F, 0.0F, -0.7854F);
		

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(1.0143F, -12.1143F, -1.7486F);
		mag2.addChild(bone9);
		setRotationAngle(bone9, 0.0F, 0.0698F, -2.0769F);
		bone9.cubeList.add(new ModelBox(bone9, 171, 117, -4.9958F, -2.6899F, -0.3593F, 1, 1, 4, 0.0F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(-1.1357F, -12.0143F, -1.7486F);
		mag2.addChild(bone10);
		setRotationAngle(bone10, 0.0F, -0.0698F, 2.0769F);
		bone10.cubeList.add(new ModelBox(bone10, 172, 116, 3.836F, -2.7726F, -0.3481F, 1, 1, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		mag2.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}