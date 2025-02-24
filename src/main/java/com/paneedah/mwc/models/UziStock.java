package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class UziStock extends ModelBase {
	private final ModelRenderer Stock2;
	private final ModelRenderer gun9;
	private final ModelRenderer gun10;
	private final ModelRenderer rear2;
	private final ModelRenderer gun11;
	private final ModelRenderer gun12;
	private final ModelRenderer gun17;
	private final ModelRenderer gun20;
	private final ModelRenderer gun21;
	private final ModelRenderer gun27;
	private final ModelRenderer front2;
	private final ModelRenderer gun28;
	private final ModelRenderer gun29;
	private final ModelRenderer gun31;
	private final ModelRenderer gun32;
	private final ModelRenderer gun33;
	private final ModelRenderer gun34;
	private final ModelRenderer gun35;
	private final ModelRenderer gun36;
	private final ModelRenderer gun37;
	private final ModelRenderer gun38;
	private final ModelRenderer gun219_r1;
	private final ModelRenderer gun218_r1;
	private final ModelRenderer gun39;
	private final ModelRenderer gun40;
	private final ModelRenderer gun41;
	private final ModelRenderer gun42;
	private final ModelRenderer gun43;

	public UziStock() {
		textureWidth = 512;
		textureHeight = 512;

		Stock2 = new ModelRenderer(this);
		Stock2.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		gun9 = new ModelRenderer(this);
		gun9.setRotationPoint(-3.0F, -37.0F, 13.5F);
		Stock2.addChild(gun9);
		gun9.cubeList.add(new ModelBox(gun9, 337, 157, -0.5F, 0.1F, 0.0F, 4, 4, 3, 0.0F, false));
		gun9.cubeList.add(new ModelBox(gun9, 341, 267, -0.5F, 3.2075F, 0.6419F, 4, 1, 2, 0.0F, false));

		gun10 = new ModelRenderer(this);
		gun10.setRotationPoint(-3.0F, -37.0F, 16.5F);
		Stock2.addChild(gun10);
		setRotationAngle(gun10, -1.4128F, 0.0F, 0.0F);
		gun10.cubeList.add(new ModelBox(gun10, 324, 108, -0.5F, 0.0157F, 0.0988F, 4, 1, 4, 0.0F, false));

		rear2 = new ModelRenderer(this);
		rear2.setRotationPoint(-1.6F, -33.553F, 32.2496F);
		Stock2.addChild(rear2);
		setRotationAngle(rear2, -0.1745F, 0.0F, 0.0F);
		rear2.cubeList.add(new ModelBox(rear2, 99, 280, -2.0F, -1.0F, -6.0F, 1, 2, 13, 0.0F, false));
		rear2.cubeList.add(new ModelBox(rear2, 213, 295, -2.0F, 0.5F, -6.0F, 1, 1, 12, 0.0F, false));
		rear2.cubeList.add(new ModelBox(rear2, 128, 280, 1.0F, -1.0F, -6.0F, 1, 2, 13, 0.0F, false));

		gun11 = new ModelRenderer(this);
		gun11.setRotationPoint(-1.4F, 0.8F, 9.45F);
		rear2.addChild(gun11);
		setRotationAngle(gun11, -1.6359F, 0.0F, 0.0F);
		gun11.cubeList.add(new ModelBox(gun11, 294, 305, 2.4F, 0.0F, 0.0F, 1, 2, 10, 0.0F, false));
		gun11.cubeList.add(new ModelBox(gun11, 23, 307, 1.9F, 0.0F, 0.0F, 1, 2, 10, 0.0F, false));
		gun11.cubeList.add(new ModelBox(gun11, 240, 307, -0.6F, 0.0F, 0.0F, 1, 2, 10, 0.0F, false));
		gun11.cubeList.add(new ModelBox(gun11, 121, 309, -0.1F, 0.0F, 0.0F, 1, 2, 10, 0.0F, false));
		gun11.cubeList.add(new ModelBox(gun11, 343, 69, 0.4F, 0.0F, 8.0F, 2, 2, 2, 0.0F, false));

		gun12 = new ModelRenderer(this);
		gun12.setRotationPoint(-1.4F, 0.8F, 7.45F);
		rear2.addChild(gun12);
		setRotationAngle(gun12, -1.5243F, 0.0F, 0.0F);
		gun12.cubeList.add(new ModelBox(gun12, 130, 156, -0.6F, 0.0F, 0.0F, 1, 2, 10, 0.0F, false));
		gun12.cubeList.add(new ModelBox(gun12, 99, 266, 2.4F, 0.0F, 0.0F, 1, 2, 10, 0.0F, false));
		gun12.cubeList.add(new ModelBox(gun12, 329, 124, -0.6F, -0.3341F, -0.819F, 1, 1, 1, 0.0F, false));
		gun12.cubeList.add(new ModelBox(gun12, 334, 142, 2.4F, -0.3341F, -0.819F, 1, 1, 1, 0.0F, false));
		gun12.cubeList.add(new ModelBox(gun12, 53, 332, 0.4F, 0.0F, 8.0F, 2, 2, 2, 0.0F, false));

		gun17 = new ModelRenderer(this);
		gun17.setRotationPoint(-1.4F, -1.0F, 7.0F);
		rear2.addChild(gun17);
		setRotationAngle(gun17, -0.632F, 0.0F, 0.0F);
		gun17.cubeList.add(new ModelBox(gun17, 242, 36, -0.6F, 0.0F, 0.0F, 4, 1, 3, 0.0F, false));

		gun20 = new ModelRenderer(this);
		gun20.setRotationPoint(-0.4F, 2.8F, -2.55F);
		rear2.addChild(gun20);
		setRotationAngle(gun20, 1.1154F, 0.0F, 0.0F);
		gun20.cubeList.add(new ModelBox(gun20, 246, 163, 1.3F, -1.1582F, 1.4992F, 1, 6, 2, 0.0F, false));

		gun21 = new ModelRenderer(this);
		gun21.setRotationPoint(-0.4F, 4.5F, 1.9F);
		rear2.addChild(gun21);
		setRotationAngle(gun21, 0.409F, 0.0F, 0.0F);
		gun21.cubeList.add(new ModelBox(gun21, 56, 229, 1.3F, -1.9175F, 0.3977F, 1, 6, 2, 0.0F, false));

		gun27 = new ModelRenderer(this);
		gun27.setRotationPoint(-0.4F, 10.0F, 4.3F);
		rear2.addChild(gun27);
		setRotationAngle(gun27, 1.1897F, 0.0F, 0.0F);
		gun27.cubeList.add(new ModelBox(gun27, 43, 349, 1.3F, -1.0934F, 1.622F, 1, 2, 2, 0.0F, false));

		front2 = new ModelRenderer(this);
		front2.setRotationPoint(0.0F, -64.3925F, 36.8457F);
		Stock2.addChild(front2);
		setRotationAngle(front2, 2.9671F, 0.0F, 0.0F);
		

		gun28 = new ModelRenderer(this);
		gun28.setRotationPoint(-3.5F, -34.0F, 14.2F);
		front2.addChild(gun28);
		gun28.cubeList.add(new ModelBox(gun28, 89, 244, -0.6F, 0.0F, 0.55F, 5, 1, 2, 0.0F, false));

		gun29 = new ModelRenderer(this);
		gun29.setRotationPoint(-3.5F, -35.0F, 15.0F);
		front2.addChild(gun29);
		gun29.cubeList.add(new ModelBox(gun29, 223, 350, -0.6F, 0.0F, -0.05F, 1, 1, 2, 0.0F, false));

		gun31 = new ModelRenderer(this);
		gun31.setRotationPoint(-3.5F, -35.0F, 17.0F);
		front2.addChild(gun31);
		setRotationAngle(gun31, -1.3013F, 0.0F, 0.0F);
		gun31.cubeList.add(new ModelBox(gun31, 350, 132, -0.6F, 0.0482F, -0.0133F, 1, 1, 2, 0.0F, false));

		gun32 = new ModelRenderer(this);
		gun32.setRotationPoint(-3.5F, -35.0F, 15.0F);
		front2.addChild(gun32);
		setRotationAngle(gun32, -0.5205F, 0.0F, 0.0F);
		gun32.cubeList.add(new ModelBox(gun32, 86, 352, -0.6F, 0.0249F, -0.0434F, 1, 2, 1, 0.0F, false));
		gun32.cubeList.add(new ModelBox(gun32, 352, 89, 3.4F, 0.0249F, -0.0434F, 1, 2, 1, 0.0F, false));

		gun33 = new ModelRenderer(this);
		gun33.setRotationPoint(-0.5F, -35.0F, 17.0F);
		front2.addChild(gun33);
		setRotationAngle(gun33, -1.3013F, 0.0F, 0.0F);
		gun33.cubeList.add(new ModelBox(gun33, 350, 136, 0.4F, 0.0482F, -0.0133F, 1, 1, 2, 0.0F, false));

		gun34 = new ModelRenderer(this);
		gun34.setRotationPoint(-0.5F, -35.0F, 15.0F);
		front2.addChild(gun34);
		gun34.cubeList.add(new ModelBox(gun34, 230, 350, 0.4F, 0.0F, -0.05F, 1, 1, 2, 0.0F, false));

		gun35 = new ModelRenderer(this);
		gun35.setRotationPoint(-3.5F, -33.0F, 3.5F);
		front2.addChild(gun35);
		gun35.cubeList.add(new ModelBox(gun35, 229, 245, 3.4F, 0.0F, -1.0F, 1, 2, 15, 0.0F, false));
		gun35.cubeList.add(new ModelBox(gun35, 89, 248, -0.6F, 0.0F, -1.0F, 1, 2, 15, 0.0F, false));

		gun36 = new ModelRenderer(this);
		gun36.setRotationPoint(-3.5F, -31.0F, 4.5F);
		front2.addChild(gun36);
		gun36.cubeList.add(new ModelBox(gun36, 0, 256, 3.4F, 0.0F, -2.0F, 1, 1, 15, 0.0F, false));
		gun36.cubeList.add(new ModelBox(gun36, 256, 140, -0.6F, 0.0F, -2.0F, 1, 1, 15, 0.0F, false));

		gun37 = new ModelRenderer(this);
		gun37.setRotationPoint(-3.7F, -32.1F, 7.5F);
		front2.addChild(gun37);
		gun37.cubeList.add(new ModelBox(gun37, 297, 114, -0.6F, 0.0F, -3.0F, 1, 1, 11, 0.0F, false));

		gun38 = new ModelRenderer(this);
		gun38.setRotationPoint(-0.3F, -32.1F, 7.5F);
		front2.addChild(gun38);
		gun38.cubeList.add(new ModelBox(gun38, 184, 297, 0.4F, 0.0F, -3.0F, 1, 1, 11, 0.0F, false));
		gun38.cubeList.add(new ModelBox(gun38, 295, 274, -3.6F, 0.4F, -4.8F, 4, 1, 1, 0.0F, false));
		gun38.cubeList.add(new ModelBox(gun38, 258, 350, 0.3F, -0.0075F, 1.6543F, 2, 1, 1, -0.3F, false));
		gun38.cubeList.add(new ModelBox(gun38, 340, 318, 1.5828F, -0.0075F, 1.9371F, 1, 1, 5, -0.3F, false));
		gun38.cubeList.add(new ModelBox(gun38, 251, 350, 0.3F, -0.0075F, 6.2199F, 2, 1, 1, -0.3F, false));

		gun219_r1 = new ModelRenderer(this);
		gun219_r1.setRotationPoint(2.0F, 0.4925F, 6.6371F);
		gun38.addChild(gun219_r1);
		setRotationAngle(gun219_r1, 0.0F, -0.7854F, 0.0F);
		gun219_r1.cubeList.add(new ModelBox(gun219_r1, 133, 353, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.3F, false));

		gun218_r1 = new ModelRenderer(this);
		gun218_r1.setRotationPoint(2.0F, 0.4925F, 2.2371F);
		gun38.addChild(gun218_r1);
		setRotationAngle(gun218_r1, 0.0F, -0.7854F, 0.0F);
		gun218_r1.cubeList.add(new ModelBox(gun218_r1, 173, 353, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.3F, false));

		gun39 = new ModelRenderer(this);
		gun39.setRotationPoint(-3.7F, -31.1F, 7.5F);
		front2.addChild(gun39);
		setRotationAngle(gun39, 0.0F, 0.0F, -0.7854F);
		gun39.cubeList.add(new ModelBox(gun39, 149, 231, -0.4243F, -0.4243F, -3.0F, 1, 1, 11, 0.0F, false));

		gun40 = new ModelRenderer(this);
		gun40.setRotationPoint(-3.7F, -32.1F, 7.5F);
		front2.addChild(gun40);
		setRotationAngle(gun40, 0.0F, 0.0F, -0.7854F);
		gun40.cubeList.add(new ModelBox(gun40, 121, 296, -0.4243F, -0.4243F, -3.0F, 1, 1, 11, 0.0F, false));

		gun41 = new ModelRenderer(this);
		gun41.setRotationPoint(0.7F, -31.1F, 7.5F);
		front2.addChild(gun41);
		setRotationAngle(gun41, 0.0F, 0.0F, 2.3562F);
		gun41.cubeList.add(new ModelBox(gun41, 297, 225, -0.2828F, -0.2828F, -3.0F, 1, 1, 11, 0.0F, false));

		gun42 = new ModelRenderer(this);
		gun42.setRotationPoint(0.7F, -32.1F, 7.5F);
		front2.addChild(gun42);
		setRotationAngle(gun42, 0.0F, 0.0F, 2.3562F);
		gun42.cubeList.add(new ModelBox(gun42, 297, 16, -0.2828F, -0.2828F, -3.0F, 1, 1, 11, 0.0F, false));

		gun43 = new ModelRenderer(this);
		gun43.setRotationPoint(-3.5F, -33.7F, 2.8F);
		front2.addChild(gun43);
		gun43.cubeList.add(new ModelBox(gun43, 91, 352, 3.4F, 1.0F, -1.0F, 1, 2, 1, 0.0F, false));
		gun43.cubeList.add(new ModelBox(gun43, 96, 352, -0.6F, 1.0F, -1.0F, 1, 2, 1, 0.0F, false));
		gun43.cubeList.add(new ModelBox(gun43, 354, 25, -0.6F, 2.7F, -1.0F, 1, 1, 1, 0.0F, false));
		gun43.cubeList.add(new ModelBox(gun43, 354, 28, 3.4F, 2.7F, -1.0F, 1, 1, 1, 0.0F, false));
		gun43.cubeList.add(new ModelBox(gun43, 352, 248, -0.6F, 0.4351F, 11.1554F, 1, 1, 1, 0.0F, false));
		gun43.cubeList.add(new ModelBox(gun43, 352, 251, 3.4F, 0.4351F, 11.1554F, 1, 1, 1, 0.0F, false));
		gun43.cubeList.add(new ModelBox(gun43, 352, 254, -0.6F, 0.6278F, 13.6826F, 1, 1, 1, 0.0F, false));
		gun43.cubeList.add(new ModelBox(gun43, 352, 345, 3.4F, 0.6278F, 13.6826F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Stock2.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}