package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;

import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench
// Paste this code into your mod.
// Make sure to generate all required imports

public class AKSUStock extends ModelWithAttachments {
	private final ModelRenderer gun233;
	private final ModelRenderer gun234;
	private final ModelRenderer gun235;
	private final ModelRenderer gun236;
	private final ModelRenderer gun237;
	private final ModelRenderer gun238;
	private final ModelRenderer gun239;
	private final ModelRenderer gun240;
	private final ModelRenderer gun241;
	private final ModelRenderer gun242;
	private final ModelRenderer gun243;
	private final ModelRenderer gun244;
	private final ModelRenderer gun245;
	private final ModelRenderer gun348;
	private final ModelRenderer gun349;
	private final ModelRenderer gun365;
	private final ModelRenderer gun366;

	public AKSUStock() {
		textureWidth = 512;
		textureHeight = 256;

		gun233 = new ModelRenderer(this);
		gun233.setRotationPoint(-3.5F, -10.9F, 3.5F);
		setRotationAngle(gun233, -0.1859F, 0.0F, 0.0F);

		gun234 = new ModelRenderer(this);
		gun234.setRotationPoint(-3.5F, -11.9F, -1.5F);
		setRotationAngle(gun234, -1.5708F, 0.0F, 0.0F);
		gun234.cubeList.add(new ModelBox(gun234, 134, 22, 0.0F, -7.8966F, -0.109F, 4, 4, 7, 0.0F, false));

		gun235 = new ModelRenderer(this);
		gun235.setRotationPoint(-3.5F, -8.3F, 8.5F);
		setRotationAngle(gun235, 0.4833F, 0.0F, 0.0F);

		gun236 = new ModelRenderer(this);
		gun236.setRotationPoint(-3.0F, -9.2F, 8.5F);
		setRotationAngle(gun236, 0.4833F, 0.0F, 0.0F);

		gun237 = new ModelRenderer(this);
		gun237.setRotationPoint(-3.0F, -11.5F, 12.95F);
		setRotationAngle(gun237, -0.1002F, 0.0F, 0.0F);
		gun237.cubeList.add(new ModelBox(gun237, 113, 6, 0.0F, 0.0F, -10.0F, 3, 2, 28, 0.0F, false));

		gun238 = new ModelRenderer(this);
		gun238.setRotationPoint(-3.5F, -10.6F, 12.75F);
		setRotationAngle(gun238, -0.0129F, 0.0F, 0.0F);

		gun239 = new ModelRenderer(this);
		gun239.setRotationPoint(-3.5F, -9.6F, 3.5F);
		setRotationAngle(gun239, -0.2231F, 0.0F, 0.0F);

		gun240 = new ModelRenderer(this);
		gun240.setRotationPoint(-3.5F, -5.7F, 26.4F);
		setRotationAngle(gun240, -0.1115F, 0.0F, 0.0F);

		gun241 = new ModelRenderer(this);
		gun241.setRotationPoint(-3.5F, 0.1F, 28.6F);
		setRotationAngle(gun241, -0.1115F, 0.0F, 0.0F);
		gun241.cubeList.add(new ModelBox(gun241, 136, 17, 0.001F, 0.5241F, -0.1312F, 4, 2, 1, 0.0F, false));

		gun242 = new ModelRenderer(this);
		gun242.setRotationPoint(-2.9F, -9.9F, 30.8F);
		setRotationAngle(gun242, -0.0873F, 0.0F, 0.0F);
		gun242.cubeList.add(new ModelBox(gun242, 161, 11, 0.0F, 0.2196F, -0.1507F, 2, 3, 1, 0.0F, false));

		gun243 = new ModelRenderer(this);
		gun243.setRotationPoint(-3.4F, -8.9F, 29.7F);
		setRotationAngle(gun243, -0.0873F, 0.0F, 0.0F);
		gun243.cubeList.add(new ModelBox(gun243, 142, 17, 0.0F, 0.4208F, -0.1768F, 3, 11, 2, 0.0F, false));

		gun244 = new ModelRenderer(this);
		gun244.setRotationPoint(-0.6F, -8.9F, 29.7F);
		setRotationAngle(gun244, -0.0873F, 0.0F, 0.0F);
		gun244.cubeList.add(new ModelBox(gun244, 153, 3, 0.0F, 0.4208F, -0.1761F, 1, 11, 2, 0.0F, false));

		gun245 = new ModelRenderer(this);
		gun245.setRotationPoint(-1.1F, -9.9F, 30.8F);
		setRotationAngle(gun245, -0.0873F, 0.0F, 0.0F);
		gun245.cubeList.add(new ModelBox(gun245, 153, 9, 0.0F, 0.2194F, -0.1501F, 1, 3, 1, 0.0F, false));

		gun348 = new ModelRenderer(this);
		gun348.setRotationPoint(-0.4F, -8.6F, 7.5F);
		setRotationAngle(gun348, -0.1859F, 0.0F, 0.0F);
		gun348.cubeList.add(new ModelBox(gun348, 147, 20, -3.6F, 0.7393F, -3.9311F, 1, 1, 3, 0.0F, false));

		gun349 = new ModelRenderer(this);
		gun349.setRotationPoint(-0.1F, -9.5F, 8.5F);
		setRotationAngle(gun349, -0.1859F, 0.0F, 0.0F);
		gun349.cubeList.add(new ModelBox(gun349, 147, 22, -4.3F, 0.7393F, -3.9311F, 1, 3, 1, 0.0F, false));

		gun365 = new ModelRenderer(this);
		gun365.setRotationPoint(-2.5F, -12.0F, 3.5F);
		setRotationAngle(gun365, -0.1859F, 0.0F, 0.0F);

		gun366 = new ModelRenderer(this);
		gun366.setRotationPoint(-3.5F, -7.6F, 12.5F);
		setRotationAngle(gun366, -0.3346F, 0.0F, 0.0F);
		gun366.cubeList.add(new ModelBox(gun366, 116, 0, -0.002F, 2.5153F, -6.7908F, 4, 2, 25, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		gun233.render(f5);
		gun234.render(f5);
		gun235.render(f5);
		gun236.render(f5);
		gun237.render(f5);
		gun238.render(f5);
		gun239.render(f5);
		gun240.render(f5);
		gun241.render(f5);
		gun242.render(f5);
		gun243.render(f5);
		gun244.render(f5);
		gun245.render(f5);
		gun348.render(f5);
		gun349.render(f5);
		gun365.render(f5);
		gun366.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
