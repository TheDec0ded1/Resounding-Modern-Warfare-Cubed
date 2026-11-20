package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Mini14Action extends ModelWithAttachments {
	private final ModelRenderer action;
	private final ModelRenderer action13;
	private final ModelRenderer action12;
	private final ModelRenderer action11;
	private final ModelRenderer action10;
	private final ModelRenderer action12_r1;
	private final ModelRenderer action11_r1;
	private final ModelRenderer action9;
	private final ModelRenderer action8;
	private final ModelRenderer action7;
	private final ModelRenderer action6;
	private final ModelRenderer action5;
	private final ModelRenderer action4;
	private final ModelRenderer action3;
	private final ModelRenderer action1;

	public Mini14Action() {
		textureWidth = 340;
		textureHeight = 340;

		action = new ModelRenderer(this);
		action.setRotationPoint(0.0F, 24.0F, 0.0F);
		action.cubeList.add(new ModelBox(action, 5, 52, -3.6F, -38.8F, -49.0F, 1, 2, 16, 0.0F, false));

		action13 = new ModelRenderer(this);
		action13.setRotationPoint(-5.3F, -38.4F, -33.4F);
		action.addChild(action13);
		setRotationAngle(action13, 0.0F, -0.1859F, 0.0F);
		action13.cubeList.add(new ModelBox(action13, 73, 72, 0.8142F, 0.0F, 5.952F, 2, 1, 1, -0.001F, false));

		action12 = new ModelRenderer(this);
		action12.setRotationPoint(-5.3F, -38.8F, -33.4F);
		action.addChild(action12);
		setRotationAngle(action12, 0.0F, -0.1859F, 0.0F);
		action12.cubeList.add(new ModelBox(action12, 65, 72, 0.8142F, 0.0F, 5.952F, 2, 1, 1, 0.0F, false));

		action11 = new ModelRenderer(this);
		action11.setRotationPoint(-3.8F, -38.4F, -36.0F);
		action.addChild(action11);
		action11.cubeList.add(new ModelBox(action11, 0, 102, -0.3F, 0.0F, 3.0F, 1, 1, 7, 0.0F, false));

		action10 = new ModelRenderer(this);
		action10.setRotationPoint(-3.8F, -39.5F, -36.0F);
		action.addChild(action10);
		action10.cubeList.add(new ModelBox(action10, 85, 68, -0.4F, -1.05F, 2.9F, 1, 2, 3, -0.1F, false));

		action12_r1 = new ModelRenderer(this);
		action12_r1.setRotationPoint(1.3F, 0.2F, 0.3F);
		action10.addChild(action12_r1);
		setRotationAngle(action12_r1, -0.4014F, 0.0F, 0.0F);
		action12_r1.cubeList.add(new ModelBox(action12_r1, 51, 78, -1.7F, -2.6442F, 5.4231F, 1, 1, 2, -0.102F, false));

		action11_r1 = new ModelRenderer(this);
		action11_r1.setRotationPoint(1.3F, -0.8F, -0.35F);
		action10.addChild(action11_r1);
		setRotationAngle(action11_r1, -0.8203F, 0.0F, 0.0F);
		action11_r1.cubeList.add(new ModelBox(action11_r1, 39, 34, -1.7F, -4.6881F, 3.982F, 1, 2, 2, -0.101F, false));

		action9 = new ModelRenderer(this);
		action9.setRotationPoint(-3.8F, -38.8F, -36.0F);
		action.addChild(action9);
		action9.cubeList.add(new ModelBox(action9, 98, 101, -0.3F, 0.0F, 3.0F, 1, 1, 7, 0.001F, false));

		action8 = new ModelRenderer(this);
		action8.setRotationPoint(-1.0F, -39.5F, -36.0F);
		action.addChild(action8);
		setRotationAngle(action8, 0.0F, 0.0F, -1.1525F);
		action8.cubeList.add(new ModelBox(action8, 58, 94, -1.0812F, -0.1828F, 6.0F, 1, 1, 2, 0.0F, false));

		action7 = new ModelRenderer(this);
		action7.setRotationPoint(-2.0F, -39.5F, -36.0F);
		action.addChild(action7);
		setRotationAngle(action7, 0.0F, 0.0F, 1.1525F);
		action7.cubeList.add(new ModelBox(action7, 87, 8, -0.0812F, 0.1828F, 6.0F, 1, 1, 2, 0.0F, false));

		action6 = new ModelRenderer(this);
		action6.setRotationPoint(-2.0F, -39.5F, -36.0F);
		action.addChild(action6);
		action6.cubeList.add(new ModelBox(action6, 64, 82, -0.2F, 0.0F, 6.0F, 1, 1, 2, 0.0F, false));

		action5 = new ModelRenderer(this);
		action5.setRotationPoint(-1.0F, -39.3F, -36.0F);
		action.addChild(action5);
		setRotationAngle(action5, 0.0F, 0.0F, -1.1525F);
		action5.cubeList.add(new ModelBox(action5, 26, 50, -1.0812F, -0.1828F, 7.0F, 1, 1, 7, 0.0F, false));

		action4 = new ModelRenderer(this);
		action4.setRotationPoint(-2.0F, -39.3F, -36.0F);
		action.addChild(action4);
		setRotationAngle(action4, 0.0F, 0.0F, 1.1525F);
		action4.cubeList.add(new ModelBox(action4, 26, 26, -0.0812F, 0.1828F, 7.0F, 1, 1, 7, 0.0F, false));

		action3 = new ModelRenderer(this);
		action3.setRotationPoint(-2.9F, -38.9F, -36.0F);
		action.addChild(action3);
		action3.cubeList.add(new ModelBox(action3, 229, 200, 0.0F, 0.0F, 6.0F, 1, 2, 8, 0.0F, false));

		action1 = new ModelRenderer(this);
		action1.setRotationPoint(-2.0F, -39.3F, -36.0F);
		action.addChild(action1);
		action1.cubeList.add(new ModelBox(action1, 26, 3, -0.2F, 0.0F, 7.0F, 1, 1, 7, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		action.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}