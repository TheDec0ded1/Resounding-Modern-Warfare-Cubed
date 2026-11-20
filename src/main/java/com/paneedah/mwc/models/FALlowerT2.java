package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class FALlowerT2 extends ModelBase {
	private final ModelRenderer lowerT2;
	private final ModelRenderer bone181;
	private final ModelRenderer bone11;
	private final ModelRenderer bone71;
	private final ModelRenderer bone71_r1;
	private final ModelRenderer bone71_r2;
	private final ModelRenderer bone83;
	private final ModelRenderer bone83_r1;
	private final ModelRenderer bone72;
	private final ModelRenderer bone81;
	private final ModelRenderer bone19;
	private final ModelRenderer bone73;
	private final ModelRenderer bone77;
	private final ModelRenderer bone77_r1;
	private final ModelRenderer bone76;
	private final ModelRenderer trigger;
	private final ModelRenderer bone20;
	private final ModelRenderer bone21;
	private final ModelRenderer bone2;
	private final ModelRenderer bone;
	private final ModelRenderer bone4;
	private final ModelRenderer bone3;

	public FALlowerT2() {
		textureWidth = 384;
		textureHeight = 384;

		lowerT2 = new ModelRenderer(this);
		lowerT2.setRotationPoint(0.25F, -15.75F, 19.5F);
		

		bone181 = new ModelRenderer(this);
		bone181.setRotationPoint(0.0F, -0.9587F, -15.1436F);
		lowerT2.addChild(bone181);
		setRotationAngle(bone181, -0.1047F, 0.0F, 0.0F);
		bone181.cubeList.add(new ModelBox(bone181, 222, 257, -2.5F, 0.0F, 0.0F, 2, 2, 4, 0.0F, false));
		bone181.cubeList.add(new ModelBox(bone181, 292, 33, -3.0F, 0.0F, 0.0F, 1, 2, 4, 0.0F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(-0.25F, -0.5F, -29.5F);
		lowerT2.addChild(bone11);
		setRotationAngle(bone11, -0.0087F, 0.0F, 0.0F);
		

		bone71 = new ModelRenderer(this);
		bone71.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone11.addChild(bone71);
		bone71.cubeList.add(new ModelBox(bone71, 356, 322, -0.7F, 1.2914F, 14.3455F, 1, 4, 4, 0.0F, false));
		bone71.cubeList.add(new ModelBox(bone71, 0, 357, -3.3F, 1.2914F, 14.3455F, 1, 4, 4, 0.0F, false));

		bone71_r1 = new ModelRenderer(this);
		bone71_r1.setRotationPoint(0.175F, 4.7142F, 15.1187F);
		bone71.addChild(bone71_r1);
		setRotationAngle(bone71_r1, 1.5708F, 0.0F, 0.0F);
		bone71_r1.cubeList.add(new ModelBox(bone71_r1, 328, 360, -0.574F, 0.2989F, -2.2757F, 1, 1, 1, 0.0F, false));
		bone71_r1.cubeList.add(new ModelBox(bone71_r1, 202, 268, -0.575F, -3.6968F, -3.7757F, 1, 5, 2, 0.0F, false));

		bone71_r2 = new ModelRenderer(this);
		bone71_r2.setRotationPoint(0.175F, 1.4143F, 13.8187F);
		bone71.addChild(bone71_r2);
		setRotationAngle(bone71_r2, 1.5708F, 0.0F, 0.0F);
		bone71_r2.cubeList.add(new ModelBox(bone71_r2, 96, 361, -0.574F, 0.6111F, -4.6905F, 1, 2, 1, 0.0F, false));

		bone83 = new ModelRenderer(this);
		bone83.setRotationPoint(0.6F, 4.9532F, 16.8439F);
		bone71.addChild(bone83);
		setRotationAngle(bone83, 1.693F, 0.0F, 0.0F);
		

		bone83_r1 = new ModelRenderer(this);
		bone83_r1.setRotationPoint(-0.425F, -1.6832F, 0.4475F);
		bone83.addChild(bone83_r1);
		setRotationAngle(bone83_r1, 1.5708F, 0.0F, 0.0F);
		bone83_r1.cubeList.add(new ModelBox(bone83_r1, 288, 152, -0.574F, -2.2975F, -0.1077F, 1, 1, 4, 0.0F, false));

		bone72 = new ModelRenderer(this);
		bone72.setRotationPoint(0.3F, 1.2752F, 14.3117F);
		bone71.addChild(bone72);
		setRotationAngle(bone72, 0.0F, 0.0F, -0.925F);
		bone72.cubeList.add(new ModelBox(bone72, 332, 189, -1.0F, -1.0F, 0.0F, 1, 1, 4, 0.0F, false));

		bone81 = new ModelRenderer(this);
		bone81.setRotationPoint(-3.3F, 1.2752F, 14.3117F);
		bone71.addChild(bone81);
		setRotationAngle(bone81, 0.0F, 0.0F, 0.925F);
		bone81.cubeList.add(new ModelBox(bone81, 348, 211, 0.0F, -1.0F, 0.0F, 1, 1, 4, 0.0F, false));

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(-0.25F, 7.4924F, -11.5F);
		lowerT2.addChild(bone19);
		setRotationAngle(bone19, 0.0785F, 0.0F, 0.0F);
		bone19.cubeList.add(new ModelBox(bone19, 302, 77, -3.5F, -4.5F, -21.0F, 4, 5, 18, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 156, 356, -2.699F, -3.5F, -3.0F, 3, 4, 4, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 10, 357, -3.299F, -3.5F, -3.0F, 1, 4, 4, 0.0F, false));

		bone73 = new ModelRenderer(this);
		bone73.setRotationPoint(-0.5F, 14.248F, -21.1533F);
		lowerT2.addChild(bone73);
		setRotationAngle(bone73, 1.309F, 0.0F, 0.0F);
		bone73.cubeList.add(new ModelBox(bone73, 340, 225, 0.25F, -3.4119F, 5.5684F, 1, 2, 2, 0.0F, false));
		bone73.cubeList.add(new ModelBox(bone73, 212, 363, 0.0F, -4.9422F, 6.0987F, 1, 2, 1, 0.0F, false));
		bone73.cubeList.add(new ModelBox(bone73, 148, 364, 0.25F, -5.5887F, 6.0987F, 1, 1, 1, 0.0F, false));

		bone77 = new ModelRenderer(this);
		bone77.setRotationPoint(-4.0F, 6.048F, -31.8533F);
		lowerT2.addChild(bone77);
		setRotationAngle(bone77, -0.7854F, 0.0F, 0.0F);
		bone77.cubeList.add(new ModelBox(bone77, 152, 364, 0.0F, -1.3839F, 2.4445F, 1, 1, 1, 0.0F, false));
		bone77.cubeList.add(new ModelBox(bone77, 156, 364, 3.5F, -1.101F, 2.1617F, 1, 1, 1, 0.0F, false));
		bone77.cubeList.add(new ModelBox(bone77, 160, 364, 0.0F, -2.9749F, 5.0962F, 1, 1, 1, 0.0F, false));
		bone77.cubeList.add(new ModelBox(bone77, 164, 364, 3.5F, -2.692F, 4.8133F, 1, 1, 1, 0.0F, false));
		bone77.cubeList.add(new ModelBox(bone77, 216, 364, 0.0F, -12.1673F, 11.4602F, 1, 1, 1, 0.0F, false));
		bone77.cubeList.add(new ModelBox(bone77, 220, 364, 3.5F, -12.8744F, 12.1673F, 1, 1, 1, 0.0F, false));
		bone77.cubeList.add(new ModelBox(bone77, 224, 364, 0.0F, -5.6265F, 6.6872F, 1, 1, 1, 0.0F, false));

		bone77_r1 = new ModelRenderer(this);
		bone77_r1.setRotationPoint(3.925F, -13.529F, 11.1214F);
		bone77.addChild(bone77_r1);
		setRotationAngle(bone77_r1, 1.5708F, 0.0F, 0.0F);
		bone77_r1.cubeList.add(new ModelBox(bone77_r1, 30, 362, -0.425F, -1.0424F, -4.1867F, 1, 2, 2, 0.0F, false));

		bone76 = new ModelRenderer(this);
		bone76.setRotationPoint(-0.5F, 6.048F, -32.0533F);
		lowerT2.addChild(bone76);
		setRotationAngle(bone76, -0.7854F, 0.0F, 0.0F);
		bone76.cubeList.add(new ModelBox(bone76, 360, 287, 0.0F, 0.5607F, -0.5F, 1, 2, 2, 0.0F, false));
		bone76.cubeList.add(new ModelBox(bone76, 308, 360, -3.5F, 0.5607F, -0.5F, 1, 2, 2, 0.0F, false));

		trigger = new ModelRenderer(this);
		trigger.setRotationPoint(-0.25F, 39.75F, -15.5F);
		lowerT2.addChild(trigger);
		trigger.cubeList.add(new ModelBox(trigger, 100, 343, -3.0F, -30.952F, -10.1033F, 3, 3, 1, 0.0F, false));
		trigger.cubeList.add(new ModelBox(trigger, 358, 303, -3.0F, -27.6008F, -12.5779F, 3, 1, 2, 0.0F, false));
		trigger.cubeList.add(new ModelBox(trigger, 358, 306, -3.0F, -27.6008F, -14.3279F, 3, 1, 2, 0.0F, false));
		trigger.cubeList.add(new ModelBox(trigger, 364, 251, -2.05F, -31.2434F, -12.0084F, 1, 1, 1, 0.0F, false));

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(0.0F, -8.75F, -4.0F);
		trigger.addChild(bone20);
		bone20.cubeList.add(new ModelBox(bone20, 100, 355, -3.0F, -21.202F, -11.8024F, 3, 2, 1, 0.0F, false));

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(-1.5F, -30.452F, -15.8024F);
		trigger.addChild(bone21);
		setRotationAngle(bone21, -1.0472F, 0.0F, 0.0F);
		bone21.cubeList.add(new ModelBox(bone21, 208, 359, -1.5F, -2.7499F, 0.433F, 3, 3, 1, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.2F, -23.848F, -11.8033F);
		trigger.addChild(bone2);
		setRotationAngle(bone2, 0.829F, 0.0F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 222, 359, -3.2F, -5.7212F, 0.3241F, 3, 2, 1, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.2F, -25.152F, -11.8033F);
		trigger.addChild(bone);
		setRotationAngle(bone, -0.829F, 0.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 230, 359, -3.2F, -3.8822F, -1.2403F, 3, 2, 1, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.2F, -29.902F, -13.5533F);
		trigger.addChild(bone4);
		setRotationAngle(bone4, -1.0472F, 0.0F, 0.0F);
		bone4.cubeList.add(new ModelBox(bone4, 364, 253, -2.25F, -0.9604F, 1.391F, 1, 1, 1, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.2F, -29.902F, -13.5533F);
		trigger.addChild(bone3);
		setRotationAngle(bone3, -0.2618F, 0.0F, 0.0F);
		bone3.cubeList.add(new ModelBox(bone3, 298, 142, -2.25F, -0.9884F, 1.3698F, 1, 2, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		lowerT2.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}