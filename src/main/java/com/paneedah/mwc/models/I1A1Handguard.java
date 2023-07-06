package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class I1A1Handguard extends ModelBase {
	private final ModelRenderer handguard;
	private final ModelRenderer bone29;
	private final ModelRenderer bone28;
	private final ModelRenderer bone30;
	private final ModelRenderer bone32;
	private final ModelRenderer bone7;
	private final ModelRenderer bone59;
	private final ModelRenderer bone34;
	private final ModelRenderer bone33;
	private final ModelRenderer bone10;
	private final ModelRenderer bone27;
	private final ModelRenderer bone35;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer bone31;
	private final ModelRenderer bone36;
	private final ModelRenderer bone;
	private final ModelRenderer bone11;
	private final ModelRenderer bone5;
	private final ModelRenderer bone4;
	private final ModelRenderer bone9;
	private final ModelRenderer bone6;
	private final ModelRenderer bone8;

	public I1A1Handguard() {
		textureWidth = 512;
		textureHeight = 256;

		handguard = new ModelRenderer(this);
		handguard.setRotationPoint(0.0F, 24.0F, 0.0F);
		handguard.cubeList.add(new ModelBox(handguard, 279, 216, -3.4851F, -35.6034F, -66.5436F, 4, 1, 31, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 278, 222, -2.0F, -41.9587F, -66.5436F, 1, 2, 31, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 301, 238, -2.0F, -41.7087F, -35.6436F, 1, 2, 3, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 289, 236, -4.399F, -38.6587F, -35.6436F, 1, 2, 3, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 279, 235, 0.301F, -38.6587F, -35.6436F, 1, 2, 3, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 305, 239, 1.0F, -37.4587F, -73.3436F, 1, 1, 7, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 312, 244, 1.001F, -38.0587F, -73.3436F, 1, 1, 7, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 312, 244, 1.001F, -39.0587F, -73.3436F, 1, 1, 7, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 312, 244, -4.999F, -39.0587F, -73.3436F, 1, 1, 7, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 303, 238, -4.999F, -38.0587F, -73.3436F, 1, 1, 7, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 312, 239, -5.0F, -37.4587F, -73.3436F, 1, 1, 7, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 303, 239, -4.2351F, -35.6034F, -73.3436F, 4, 1, 7, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 311, 242, -0.7649F, -35.6034F, -73.3436F, 2, 1, 7, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 277, 225, -3.5F, -35.4494F, -65.7533F, 4, 1, 30, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 279, 216, -3.5F, -39.4535F, -72.5382F, 4, 4, 6, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 299, 227, -3.5F, -39.5777F, -73.3147F, 4, 4, 1, 0.0F, false));

		bone29 = new ModelRenderer(this);
		bone29.setRotationPoint(-3.5F, -41.25F, -57.9F);
		handguard.addChild(bone29);
		setRotationAngle(bone29, 0.0F, 0.0F, -0.9599F);
		bone29.cubeList.add(new ModelBox(bone29, 284, 217, 1.0145F, 1.6414F, -8.6436F, 1, 1, 31, 0.0F, false));
		bone29.cubeList.add(new ModelBox(bone29, 301, 216, 0.8097F, 1.7848F, 22.2564F, 1, 1, 3, 0.0F, false));

		bone28 = new ModelRenderer(this);
		bone28.setRotationPoint(-3.5F, -41.25F, -57.9F);
		handguard.addChild(bone28);
		setRotationAngle(bone28, 0.0F, 0.0F, 0.9599F);
		bone28.cubeList.add(new ModelBox(bone28, 288, 211, 0.2799F, -1.6352F, -8.6436F, 1, 1, 31, 0.0F, false));
		bone28.cubeList.add(new ModelBox(bone28, 301, 220, 0.4846F, -1.4918F, 22.2564F, 1, 1, 3, 0.0F, false));

		bone30 = new ModelRenderer(this);
		bone30.setRotationPoint(-3.9099F, -35.6584F, -51.2495F);
		handguard.addChild(bone30);
		setRotationAngle(bone30, 0.0F, 0.0F, 1.1781F);
		bone30.cubeList.add(new ModelBox(bone30, 281, 222, -1.1498F, -0.5459F, -15.2941F, 2, 1, 31, 0.0F, false));
		bone30.cubeList.add(new ModelBox(bone30, 305, 245, -1.1498F, -0.2959F, -22.0941F, 2, 1, 7, 0.0F, false));
		bone30.cubeList.add(new ModelBox(bone30, 298, 248, -1.105F, -0.9267F, 15.6059F, 2, 1, 3, 0.0F, false));

		bone32 = new ModelRenderer(this);
		bone32.setRotationPoint(3.9099F, -35.6584F, -51.2495F);
		handguard.addChild(bone32);
		setRotationAngle(bone32, 0.0F, 0.0F, -1.1781F);
		bone32.cubeList.add(new ModelBox(bone32, 285, 222, -1.9983F, -3.3175F, -15.2941F, 2, 1, 31, 0.0F, false));
		bone32.cubeList.add(new ModelBox(bone32, 309, 245, -1.9983F, -3.0675F, -22.0941F, 2, 1, 7, 0.0F, false));
		bone32.cubeList.add(new ModelBox(bone32, 288, 248, -2.0814F, -3.7907F, 15.6059F, 2, 1, 3, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0F, -34.952F, -34.6033F);
		handguard.addChild(bone7);
		setRotationAngle(bone7, -0.0175F, 0.0F, 0.0F);
		bone7.cubeList.add(new ModelBox(bone7, 290, 237, -2.7929F, -0.243F, -38.7041F, 2, 1, 7, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 279, 248, -1.2071F, -0.243F, -38.7041F, 1, 1, 7, 0.0F, false));

		bone59 = new ModelRenderer(this);
		bone59.setRotationPoint(0.25F, -1.9489F, -35.4519F);
		bone7.addChild(bone59);
		setRotationAngle(bone59, 0.7854F, 0.0F, 0.0F);
		bone59.cubeList.add(new ModelBox(bone59, 133, 8, -0.5F, -1.0395F, 0.021F, 1, 1, 1, 0.0F, false));
		bone59.cubeList.add(new ModelBox(bone59, 129, 8, -4.0F, -1.0395F, 0.021F, 1, 1, 1, 0.0F, false));

		bone34 = new ModelRenderer(this);
		bone34.setRotationPoint(1.0F, -25.9494F, -69.2533F);
		handguard.addChild(bone34);
		setRotationAngle(bone34, 0.0F, 0.0F, 0.7854F);
		bone34.cubeList.add(new ModelBox(bone34, 291, 218, -8.1618F, -6.4547F, -4.0614F, 1, 1, 8, 0.0F, false));

		bone33 = new ModelRenderer(this);
		bone33.setRotationPoint(-2.0F, -25.9494F, -69.2533F);
		handguard.addChild(bone33);
		setRotationAngle(bone33, 0.0F, 0.0F, 0.7854F);
		bone33.cubeList.add(new ModelBox(bone33, 279, 235, -7.8689F, -6.7476F, -4.0614F, 1, 1, 8, 0.0F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(0.0F, -40.952F, -72.3533F);
		handguard.addChild(bone10);
		setRotationAngle(bone10, 0.5672F, 0.0F, 0.0F);
		bone10.cubeList.add(new ModelBox(bone10, 293, 216, -3.5F, 0.6425F, -1.5493F, 4, 1, 1, 0.0F, false));

		bone27 = new ModelRenderer(this);
		bone27.setRotationPoint(-0.15F, -54.3587F, -66.5436F);
		handguard.addChild(bone27);
		bone27.cubeList.add(new ModelBox(bone27, 282, 219, 1.151F, 15.2F, 0.2F, 1, 1, 31, 0.0F, false));
		bone27.cubeList.add(new ModelBox(bone27, 280, 218, 1.15F, 16.9F, 0.2F, 1, 1, 31, 0.0F, false));
		bone27.cubeList.add(new ModelBox(bone27, 282, 253, 1.151F, 16.2F, 0.2F, 1, 1, 1, 0.0F, false));
		bone27.cubeList.add(new ModelBox(bone27, 279, 244, 1.151F, 16.2F, 5.2F, 1, 1, 2, 0.0F, false));
		bone27.cubeList.add(new ModelBox(bone27, 302, 238, 1.151F, 16.2F, 11.2F, 1, 1, 2, 0.0F, false));
		bone27.cubeList.add(new ModelBox(bone27, 279, 217, 1.151F, 16.2F, 13.2F, 1, 1, 18, 0.0F, false));

		bone35 = new ModelRenderer(this);
		bone35.setRotationPoint(0.0F, 1.6087F, 1.0F);
		bone27.addChild(bone35);
		setRotationAngle(bone35, -2.3562F, 0.0F, 0.0F);
		bone35.cubeList.add(new ModelBox(bone35, 300, 252, 1.15F, -11.4982F, 10.6065F, 1, 1, 1, 0.0F, false));
		bone35.cubeList.add(new ModelBox(bone35, 279, 252, 1.137F, -10.7495F, 9.8301F, 1, 1, 1, 0.0F, false));
		bone35.cubeList.add(new ModelBox(bone35, 282, 251, 1.137F, -14.9921F, 5.5875F, 1, 1, 1, 0.0F, false));
		bone35.cubeList.add(new ModelBox(bone35, 302, 245, 1.137F, -18.2448F, 2.3348F, 1, 1, 1, 0.0F, false));
		bone35.cubeList.add(new ModelBox(bone35, 294, 245, 1.137F, -14.0022F, 6.5774F, 1, 1, 1, 0.0F, false));
		bone35.cubeList.add(new ModelBox(bone35, 296, 252, 1.15F, -15.7408F, 6.3639F, 1, 1, 1, 0.0F, false));
		bone35.cubeList.add(new ModelBox(bone35, 298, 245, 1.15F, -18.9935F, 3.1112F, 1, 1, 1, 0.0F, false));
		bone35.cubeList.add(new ModelBox(bone35, 290, 245, 1.15F, -14.7509F, 7.3539F, 1, 1, 1, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-6.15F, -54.3587F, -66.5436F);
		handguard.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 282, 219, 1.151F, 15.2F, 0.2F, 1, 1, 31, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 280, 218, 1.15F, 16.9F, 0.2F, 1, 1, 31, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 282, 253, 1.151F, 16.2F, 0.2F, 1, 1, 1, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 279, 244, 1.151F, 16.2F, 5.2F, 1, 1, 2, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 302, 238, 1.151F, 16.2F, 11.2F, 1, 1, 2, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 279, 217, 1.151F, 16.2F, 13.2F, 1, 1, 18, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 1.6087F, 1.0F);
		bone2.addChild(bone3);
		setRotationAngle(bone3, -2.3562F, 0.0F, 0.0F);
		bone3.cubeList.add(new ModelBox(bone3, 300, 252, 1.15F, -11.4982F, 10.6065F, 1, 1, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 279, 252, 1.137F, -10.7495F, 9.8301F, 1, 1, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 282, 251, 1.137F, -14.9921F, 5.5875F, 1, 1, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 302, 245, 1.137F, -18.2448F, 2.3348F, 1, 1, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 294, 245, 1.137F, -14.0022F, 6.5774F, 1, 1, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 296, 252, 1.15F, -15.7408F, 6.3639F, 1, 1, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 298, 245, 1.15F, -18.9935F, 3.1112F, 1, 1, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 290, 245, 1.15F, -14.7509F, 7.3539F, 1, 1, 1, 0.0F, false));

		bone31 = new ModelRenderer(this);
		bone31.setRotationPoint(-2.85F, -54.3587F, -66.5436F);
		handguard.addChild(bone31);
		

		bone36 = new ModelRenderer(this);
		bone36.setRotationPoint(1.0357F, 1.6164F, 1.0F);
		bone31.addChild(bone36);
		setRotationAngle(bone36, -2.3562F, 0.0F, 0.0F);
		

		bone = new ModelRenderer(this);
		bone.setRotationPoint(1.0F, 0.0F, 0.0F);
		handguard.addChild(bone);
		setRotationAngle(bone, 0.0F, 0.0F, 0.2618F);
		bone.cubeList.add(new ModelBox(bone, 279, 215, -15.4456F, -38.0012F, -66.3436F, 1, 1, 31, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 288, 216, -15.4466F, -37.4012F, -66.3436F, 1, 1, 31, 0.0F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(1.0F, 0.0F, 31.0F);
		handguard.addChild(bone11);
		setRotationAngle(bone11, 0.0F, 0.0F, 0.2618F);
		bone11.cubeList.add(new ModelBox(bone11, 307, 243, -15.0427F, -38.0379F, -66.6436F, 1, 1, 3, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 316, 244, -15.0437F, -37.0379F, -66.6436F, 1, 1, 3, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(1.0F, -2.0F, 0.0F);
		handguard.addChild(bone5);
		setRotationAngle(bone5, 0.0F, 0.0F, 1.0472F);
		bone5.cubeList.add(new ModelBox(bone5, 279, 215, -36.0595F, -16.5492F, -66.3436F, 1, 1, 31, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 307, 243, -35.8016F, -16.2601F, -35.6436F, 1, 1, 3, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 288, 216, -36.0605F, -15.9492F, -66.3436F, 1, 1, 31, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-1.0F, 0.0F, 0.0F);
		handguard.addChild(bone4);
		setRotationAngle(bone4, 0.0F, 0.0F, -0.2618F);
		bone4.cubeList.add(new ModelBox(bone4, 288, 221, 11.5518F, -38.7771F, -66.3436F, 1, 1, 31, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 281, 216, 11.5508F, -38.1771F, -66.3436F, 1, 1, 31, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(-1.0F, 0.0F, 31.0F);
		handguard.addChild(bone9);
		setRotationAngle(bone9, 0.0F, 0.0F, -0.2618F);
		bone9.cubeList.add(new ModelBox(bone9, 316, 249, 11.1449F, -38.8143F, -66.6436F, 1, 1, 3, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 309, 244, 11.1439F, -37.8143F, -66.6436F, 1, 1, 3, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-1.0F, 0.0F, 0.0F);
		handguard.addChild(bone6);
		setRotationAngle(bone6, 0.0F, 0.0F, -1.0472F);
		bone6.cubeList.add(new ModelBox(bone6, 288, 221, 35.296F, -20.1441F, -66.3436F, 1, 1, 31, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 281, 216, 35.295F, -19.5441F, -66.3436F, 1, 1, 31, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-1.0F, 0.0F, 3.0F);
		handguard.addChild(bone8);
		setRotationAngle(bone8, 0.0F, 0.0F, -1.0472F);
		bone8.cubeList.add(new ModelBox(bone8, 316, 249, 35.0336F, -19.8581F, -38.6436F, 1, 1, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		handguard.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}