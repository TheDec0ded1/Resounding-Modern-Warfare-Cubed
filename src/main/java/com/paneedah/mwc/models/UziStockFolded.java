package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class UziStockFolded extends ModelBase {
	private final ModelRenderer Stock;
	private final ModelRenderer gun180;
	private final ModelRenderer gun181;
	private final ModelRenderer rear;
	private final ModelRenderer gun184;
	private final ModelRenderer gun185;
	private final ModelRenderer gun183;
	private final ModelRenderer gun186;
	private final ModelRenderer gun187;
	private final ModelRenderer gun188;
	private final ModelRenderer front;
	private final ModelRenderer gun175;
	private final ModelRenderer gun176;
	private final ModelRenderer gun177;
	private final ModelRenderer gun178;
	private final ModelRenderer gun179;
	private final ModelRenderer gun182;
	private final ModelRenderer gun171;
	private final ModelRenderer gun172;
	private final ModelRenderer gun215;
	private final ModelRenderer gun216;
	private final ModelRenderer gun219_r1;
	private final ModelRenderer gun218_r1;
	private final ModelRenderer gun220;
	private final ModelRenderer gun219;
	private final ModelRenderer gun218;
	private final ModelRenderer gun217;
	private final ModelRenderer gun213;

	public UziStockFolded() {
		textureWidth = 512;
		textureHeight = 512;

		Stock = new ModelRenderer(this);
		Stock.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		gun180 = new ModelRenderer(this);
		gun180.setRotationPoint(-3.0F, -37.0F, 13.5F);
		Stock.addChild(gun180);
		gun180.cubeList.add(new ModelBox(gun180, 183, 336, -0.5F, 0.1F, 0.0F, 4, 4, 3, 0.0F, false));
		gun180.cubeList.add(new ModelBox(gun180, 341, 263, -0.5F, 3.2075F, 0.6419F, 4, 1, 2, 0.0F, false));

		gun181 = new ModelRenderer(this);
		gun181.setRotationPoint(-3.0F, -37.0F, 16.5F);
		Stock.addChild(gun181);
		setRotationAngle(gun181, -1.4128F, 0.0F, 0.0F);
		gun181.cubeList.add(new ModelBox(gun181, 316, 181, -0.5F, 0.0157F, 0.0988F, 4, 1, 4, 0.0F, false));

		rear = new ModelRenderer(this);
		rear.setRotationPoint(0.0F, 1.3F, 0.0F);
		Stock.addChild(rear);
		rear.cubeList.add(new ModelBox(rear, 68, 266, -3.6F, -34.0F, 3.0F, 1, 2, 14, 0.0F, false));
		rear.cubeList.add(new ModelBox(rear, 182, 245, -0.6F, -34.0F, 3.0F, 1, 2, 14, 0.0F, false));

		gun184 = new ModelRenderer(this);
		gun184.setRotationPoint(-3.0F, -32.2F, 19.45F);
		rear.addChild(gun184);
		setRotationAngle(gun184, -1.6359F, 0.0F, 0.0F);
		gun184.cubeList.add(new ModelBox(gun184, 209, 309, 2.4F, 0.0F, 0.0F, 1, 2, 10, 0.0F, false));
		gun184.cubeList.add(new ModelBox(gun184, 171, 310, 1.9F, 0.0F, 0.0F, 1, 2, 10, 0.0F, false));
		gun184.cubeList.add(new ModelBox(gun184, 309, 274, -0.6F, 0.0F, 0.0F, 1, 2, 10, 0.0F, false));
		gun184.cubeList.add(new ModelBox(gun184, 309, 287, -0.1F, 0.0F, 0.0F, 1, 2, 10, 0.0F, false));
		gun184.cubeList.add(new ModelBox(gun184, 343, 100, 0.4F, 0.0F, 8.0F, 2, 2, 2, 0.0F, false));

		gun185 = new ModelRenderer(this);
		gun185.setRotationPoint(-3.0F, -32.2F, 17.45F);
		rear.addChild(gun185);
		setRotationAngle(gun185, -1.5243F, 0.0F, 0.0F);
		gun185.cubeList.add(new ModelBox(gun185, 299, 91, -0.6F, 0.0F, 0.0F, 1, 2, 10, 0.0F, false));
		gun185.cubeList.add(new ModelBox(gun185, 0, 303, 2.4F, 0.0F, 0.0F, 1, 2, 10, 0.0F, false));
		gun185.cubeList.add(new ModelBox(gun185, 318, 343, -0.6F, -0.3341F, -0.819F, 1, 1, 1, 0.0F, false));
		gun185.cubeList.add(new ModelBox(gun185, 221, 336, 2.4F, -0.3341F, -0.819F, 1, 1, 1, 0.0F, false));
		gun185.cubeList.add(new ModelBox(gun185, 240, 302, 0.4F, 0.0F, 8.0F, 2, 2, 2, 0.0F, false));

		gun183 = new ModelRenderer(this);
		gun183.setRotationPoint(-3.0F, -34.0F, 17.0F);
		rear.addChild(gun183);
		setRotationAngle(gun183, -0.632F, 0.0F, 0.0F);
		gun183.cubeList.add(new ModelBox(gun183, 188, 262, -0.6F, 0.0F, 0.0F, 4, 1, 3, 0.0F, false));

		gun186 = new ModelRenderer(this);
		gun186.setRotationPoint(-2.0F, -30.2F, 7.45F);
		rear.addChild(gun186);
		setRotationAngle(gun186, 1.1154F, 0.0F, 0.0F);
		gun186.cubeList.add(new ModelBox(gun186, 221, 267, 1.3F, -1.1582F, 1.4992F, 1, 6, 2, 0.0F, false));

		gun187 = new ModelRenderer(this);
		gun187.setRotationPoint(-2.0F, -28.5F, 11.9F);
		rear.addChild(gun187);
		setRotationAngle(gun187, 0.409F, 0.0F, 0.0F);
		gun187.cubeList.add(new ModelBox(gun187, 114, 219, 1.3F, -1.9175F, 0.3977F, 1, 6, 2, 0.0F, false));

		gun188 = new ModelRenderer(this);
		gun188.setRotationPoint(-2.0F, -23.0F, 14.3F);
		rear.addChild(gun188);
		setRotationAngle(gun188, 1.1897F, 0.0F, 0.0F);
		gun188.cubeList.add(new ModelBox(gun188, 36, 349, 1.3F, -1.0934F, 1.622F, 1, 2, 2, 0.0F, false));

		front = new ModelRenderer(this);
		front.setRotationPoint(0.0F, 0.0F, 0.0F);
		Stock.addChild(front);
		

		gun175 = new ModelRenderer(this);
		gun175.setRotationPoint(-3.5F, -34.0F, 14.2F);
		front.addChild(gun175);
		gun175.cubeList.add(new ModelBox(gun175, 130, 169, -0.6F, 0.0F, 0.55F, 5, 1, 2, 0.0F, false));

		gun176 = new ModelRenderer(this);
		gun176.setRotationPoint(-3.5F, -35.0F, 15.0F);
		front.addChild(gun176);
		gun176.cubeList.add(new ModelBox(gun176, 282, 349, -0.6F, 0.0F, -0.05F, 1, 1, 2, 0.0F, false));

		gun177 = new ModelRenderer(this);
		gun177.setRotationPoint(-3.5F, -35.0F, 17.0F);
		front.addChild(gun177);
		setRotationAngle(gun177, -1.3013F, 0.0F, 0.0F);
		gun177.cubeList.add(new ModelBox(gun177, 156, 350, -0.6F, 0.0482F, -0.0133F, 1, 1, 2, 0.0F, false));

		gun178 = new ModelRenderer(this);
		gun178.setRotationPoint(-3.5F, -35.0F, 15.0F);
		front.addChild(gun178);
		setRotationAngle(gun178, -0.5205F, 0.0F, 0.0F);
		gun178.cubeList.add(new ModelBox(gun178, 352, 73, -0.6F, 0.0249F, -0.0434F, 1, 2, 1, 0.0F, false));
		gun178.cubeList.add(new ModelBox(gun178, 352, 77, 3.4F, 0.0249F, -0.0434F, 1, 2, 1, 0.0F, false));

		gun179 = new ModelRenderer(this);
		gun179.setRotationPoint(-0.5F, -35.0F, 17.0F);
		front.addChild(gun179);
		setRotationAngle(gun179, -1.3013F, 0.0F, 0.0F);
		gun179.cubeList.add(new ModelBox(gun179, 216, 350, 0.4F, 0.0482F, -0.0133F, 1, 1, 2, 0.0F, false));

		gun182 = new ModelRenderer(this);
		gun182.setRotationPoint(-0.5F, -35.0F, 15.0F);
		front.addChild(gun182);
		gun182.cubeList.add(new ModelBox(gun182, 349, 283, 0.4F, 0.0F, -0.05F, 1, 1, 2, 0.0F, false));

		gun171 = new ModelRenderer(this);
		gun171.setRotationPoint(-3.5F, -33.0F, 3.5F);
		front.addChild(gun171);
		gun171.cubeList.add(new ModelBox(gun171, 56, 244, 3.4F, 0.0F, -1.0F, 1, 2, 15, 0.0F, false));
		gun171.cubeList.add(new ModelBox(gun171, 149, 245, -0.6F, 0.0F, -1.0F, 1, 2, 15, 0.0F, false));

		gun172 = new ModelRenderer(this);
		gun172.setRotationPoint(-3.5F, -31.0F, 4.5F);
		front.addChild(gun172);
		gun172.cubeList.add(new ModelBox(gun172, 254, 163, 3.4F, 0.0F, -2.0F, 1, 1, 15, 0.0F, false));
		gun172.cubeList.add(new ModelBox(gun172, 254, 180, -0.6F, 0.0F, -2.0F, 1, 1, 15, 0.0F, false));

		gun215 = new ModelRenderer(this);
		gun215.setRotationPoint(-3.7F, -32.1F, 7.5F);
		front.addChild(gun215);
		gun215.cubeList.add(new ModelBox(gun215, 146, 298, -0.6F, 0.0F, -3.0F, 1, 1, 11, 0.0F, false));

		gun216 = new ModelRenderer(this);
		gun216.setRotationPoint(-0.3F, -32.1F, 7.5F);
		front.addChild(gun216);
		gun216.cubeList.add(new ModelBox(gun216, 299, 0, 0.4F, 0.0F, -3.0F, 1, 1, 11, 0.0F, false));
		gun216.cubeList.add(new ModelBox(gun216, 237, 350, 0.3F, 0.0F, -2.4F, 2, 1, 1, -0.3F, false));
		gun216.cubeList.add(new ModelBox(gun216, 244, 350, 0.3F, 0.0F, 2.1657F, 2, 1, 1, -0.3F, false));
		gun216.cubeList.add(new ModelBox(gun216, 340, 311, 1.5828F, 0.0F, -2.1172F, 1, 1, 5, -0.3F, false));

		gun219_r1 = new ModelRenderer(this);
		gun219_r1.setRotationPoint(2.0F, 0.5F, 2.5828F);
		gun216.addChild(gun219_r1);
		setRotationAngle(gun219_r1, 0.0F, -0.7854F, 0.0F);
		gun219_r1.cubeList.add(new ModelBox(gun219_r1, 78, 353, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.3F, false));

		gun218_r1 = new ModelRenderer(this);
		gun218_r1.setRotationPoint(2.0F, 0.5F, -1.8172F);
		gun216.addChild(gun218_r1);
		setRotationAngle(gun218_r1, 0.0F, -0.7854F, 0.0F);
		gun218_r1.cubeList.add(new ModelBox(gun218_r1, 352, 348, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.3F, false));

		gun220 = new ModelRenderer(this);
		gun220.setRotationPoint(-3.7F, -31.1F, 7.5F);
		front.addChild(gun220);
		setRotationAngle(gun220, 0.0F, 0.0F, -0.7854F);
		gun220.cubeList.add(new ModelBox(gun220, 299, 55, -0.4243F, -0.4243F, -3.0F, 1, 1, 11, 0.0F, false));

		gun219 = new ModelRenderer(this);
		gun219.setRotationPoint(-3.7F, -32.1F, 7.5F);
		front.addChild(gun219);
		setRotationAngle(gun219, 0.0F, 0.0F, -0.7854F);
		gun219.cubeList.add(new ModelBox(gun219, 297, 212, -0.4243F, -0.4243F, -3.0F, 1, 1, 11, 0.0F, false));

		gun218 = new ModelRenderer(this);
		gun218.setRotationPoint(0.7F, -31.1F, 7.5F);
		front.addChild(gun218);
		setRotationAngle(gun218, 0.0F, 0.0F, 2.3562F);
		gun218.cubeList.add(new ModelBox(gun218, 299, 42, -0.2828F, -0.2828F, -3.0F, 1, 1, 11, 0.0F, false));

		gun217 = new ModelRenderer(this);
		gun217.setRotationPoint(0.7F, -32.1F, 7.5F);
		front.addChild(gun217);
		setRotationAngle(gun217, 0.0F, 0.0F, 2.3562F);
		gun217.cubeList.add(new ModelBox(gun217, 299, 29, -0.2828F, -0.2828F, -3.0F, 1, 1, 11, 0.0F, false));

		gun213 = new ModelRenderer(this);
		gun213.setRotationPoint(-3.5F, -33.7F, 2.8F);
		front.addChild(gun213);
		gun213.cubeList.add(new ModelBox(gun213, 221, 332, 3.4F, 1.0F, -1.0F, 1, 2, 1, 0.0F, false));
		gun213.cubeList.add(new ModelBox(gun213, 352, 47, -0.6F, 1.0F, -1.0F, 1, 2, 1, 0.0F, false));
		gun213.cubeList.add(new ModelBox(gun213, 352, 239, -0.6F, 2.7F, -1.0F, 1, 1, 1, 0.0F, false));
		gun213.cubeList.add(new ModelBox(gun213, 352, 236, 3.4F, 2.7F, -1.0F, 1, 1, 1, 0.0F, false));
		gun213.cubeList.add(new ModelBox(gun213, 352, 233, -0.6F, 0.4351F, 11.1554F, 1, 1, 1, 0.0F, false));
		gun213.cubeList.add(new ModelBox(gun213, 352, 230, 3.4F, 0.4351F, 11.1554F, 1, 1, 1, 0.0F, false));
		gun213.cubeList.add(new ModelBox(gun213, 352, 245, -0.6F, 0.6278F, 13.6826F, 1, 1, 1, 0.0F, false));
		gun213.cubeList.add(new ModelBox(gun213, 352, 242, 3.4F, 0.6278F, 13.6826F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Stock.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}