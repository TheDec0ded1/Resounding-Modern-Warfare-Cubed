package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M16Barrel606 extends ModelBase {
	private final ModelRenderer barrel606;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer flashider4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer colt_fs4;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;

	public M16Barrel606() {
		textureWidth = 672;
		textureHeight = 672;

		barrel606 = new ModelRenderer(this);
		barrel606.setRotationPoint(-1.5F, -13.8929F, -54.501F);
		barrel606.cubeList.add(new ModelBox(barrel606, 126, 315, -0.5F, -1.2071F, -28.5F, 1, 1, 61, -0.1F, false));
		barrel606.cubeList.add(new ModelBox(barrel606, 472, 105, -0.5F, -2.5071F, -7.5F, 1, 1, 40, -0.2F, false));
		barrel606.cubeList.add(new ModelBox(barrel606, 250, 315, -1.0657F, -0.6414F, -28.5F, 1, 1, 61, -0.1F, false));
		barrel606.cubeList.add(new ModelBox(barrel606, 374, 315, 0.0657F, -0.6414F, -28.5F, 1, 1, 61, -0.1F, false));
		barrel606.cubeList.add(new ModelBox(barrel606, 0, 378, -0.5F, -0.0757F, -28.5F, 1, 1, 61, -0.1F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.0142F, 1.6728F, 0.0F);
		barrel606.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 378, 0, -0.5F, -2.5F, -28.5F, 1, 1, 61, -0.1F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.0142F, -1.1556F, 0.0F);
		barrel606.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.7854F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 374, 377, -0.5F, 1.5F, -28.5F, 1, 1, 61, -0.1F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(1.0142F, 0.8728F, 0.0F);
		barrel606.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.7854F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 250, 377, -0.5F, -2.5F, -28.5F, 1, 1, 61, -0.1F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-1.0142F, -1.9556F, 0.0F);
		barrel606.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.7854F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 126, 377, -0.5F, 1.5F, -28.5F, 1, 1, 61, -0.1F, false));

		flashider4 = new ModelRenderer(this);
		flashider4.setRotationPoint(-0.5F, 0.3F, -17.749F);
		barrel606.addChild(flashider4);
		flashider4.cubeList.add(new ModelBox(flashider4, 658, 499, -0.7071F, -1.0F, -11.5F, 1, 1, 1, 0.0F, false));
		flashider4.cubeList.add(new ModelBox(flashider4, 658, 501, 0.0F, -1.7071F, -11.5F, 1, 1, 1, 0.0F, false));
		flashider4.cubeList.add(new ModelBox(flashider4, 658, 503, 0.7071F, -1.0F, -11.5F, 1, 1, 1, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(1.0F, 0.0F, -12.0F);
		flashider4.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.7854F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 490, 648, -0.5F, -0.5F, -2.5F, 1, 1, 4, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(1.0F, -1.0F, -12.0F);
		flashider4.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -0.7854F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 648, 485, -0.5F, -0.5F, -2.5F, 1, 1, 4, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, -1.0F, -12.0F);
		flashider4.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.7854F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 648, 480, -0.5F, -0.5F, -2.5F, 1, 1, 4, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 0.0F, -12.0F);
		flashider4.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.7854F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 480, 648, -0.5F, -0.5F, -2.5F, 1, 1, 4, 0.0F, false));

		colt_fs4 = new ModelRenderer(this);
		colt_fs4.setRotationPoint(1.5F, 37.8929F, 40.501F);
		barrel606.addChild(colt_fs4);
		colt_fs4.cubeList.add(new ModelBox(colt_fs4, 652, 593, -2.5F, -41.75F, -47.8F, 2, 3, 1, -0.2F, false));
		colt_fs4.cubeList.add(new ModelBox(colt_fs4, 312, 616, -2.5F, -45.275F, -52.45F, 2, 7, 1, -0.2F, false));
		colt_fs4.cubeList.add(new ModelBox(colt_fs4, 654, 370, -2.5F, -38.05F, -52.45F, 2, 2, 1, -0.2F, false));
		colt_fs4.cubeList.add(new ModelBox(colt_fs4, 654, 373, -2.5F, -38.35F, -47.8F, 2, 2, 1, -0.2F, false));
		colt_fs4.cubeList.add(new ModelBox(colt_fs4, 470, 606, -2.5F, -45.2738F, -50.7568F, 2, 1, 1, -0.2F, false));
		colt_fs4.cubeList.add(new ModelBox(colt_fs4, 226, 651, -2.5F, -45.2738F, -52.2068F, 2, 2, 2, -0.2F, false));
		colt_fs4.cubeList.add(new ModelBox(colt_fs4, 658, 509, -1.2929F, -38.5929F, -48.0F, 1, 1, 1, 0.0F, false));
		colt_fs4.cubeList.add(new ModelBox(colt_fs4, 658, 515, -2.0F, -39.3F, -48.0F, 1, 1, 1, 0.0F, false));
		colt_fs4.cubeList.add(new ModelBox(colt_fs4, 658, 519, -2.7071F, -38.5929F, -48.0F, 1, 1, 1, 0.0F, false));
		colt_fs4.cubeList.add(new ModelBox(colt_fs4, 658, 521, -2.0F, -37.8858F, -48.0F, 1, 1, 1, 0.0F, false));
		colt_fs4.cubeList.add(new ModelBox(colt_fs4, 658, 525, -1.2929F, -38.5929F, -52.25F, 1, 1, 1, 0.0F, false));
		colt_fs4.cubeList.add(new ModelBox(colt_fs4, 658, 529, -2.0F, -39.3F, -52.25F, 1, 1, 1, 0.0F, false));
		colt_fs4.cubeList.add(new ModelBox(colt_fs4, 648, 55, -2.0F, -40.5F, -52.05F, 1, 1, 5, 0.0F, false));
		colt_fs4.cubeList.add(new ModelBox(colt_fs4, 658, 553, -2.0F, -37.8858F, -52.25F, 1, 1, 1, 0.0F, false));
		colt_fs4.cubeList.add(new ModelBox(colt_fs4, 658, 555, -2.7071F, -38.5929F, -52.25F, 1, 1, 1, 0.0F, false));
		colt_fs4.cubeList.add(new ModelBox(colt_fs4, 564, 656, -2.0F, -46.3F, -51.85F, 1, 2, 1, -0.4F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-1.0F, -37.5929F, -51.75F);
		colt_fs4.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -0.7854F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 658, 557, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 658, 517, -0.5F, -0.5F, 3.75F, 1, 1, 1, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-2.0F, -37.5929F, -51.75F);
		colt_fs4.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.7854F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 658, 551, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 658, 523, -0.5F, -0.5F, 3.75F, 1, 1, 1, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-2.0F, -38.5929F, -51.75F);
		colt_fs4.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -0.7854F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 658, 549, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 658, 513, -0.5F, -0.5F, 3.75F, 1, 1, 1, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-1.0F, -38.5929F, -51.75F);
		colt_fs4.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, -0.7854F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 658, 527, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 658, 511, -0.5F, -0.5F, 3.75F, 1, 1, 1, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-1.5F, -40.8826F, -47.4843F);
		colt_fs4.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.6981F, 0.0F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 220, 651, -1.0F, -5.0F, 0.0F, 2, 5, 1, -0.2F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-0.825F, -45.5849F, -51.3314F);
		colt_fs4.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.3927F, 0.0F, 0.1309F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 658, 507, -0.5F, -1.0733F, -0.6829F, 1, 1, 1, -0.3F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-2.175F, -45.5849F, -51.3314F);
		colt_fs4.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.3927F, 0.0F, -0.1309F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 658, 505, -0.5F, -1.0733F, -0.6829F, 1, 1, 1, -0.3F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-2.175F, -45.5849F, -51.3314F);
		colt_fs4.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.6109F, 0.0F, -0.1309F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 370, 654, -0.5F, -0.3926F, -1.158F, 1, 1, 2, -0.3F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-0.825F, -45.5849F, -51.3314F);
		colt_fs4.addChild(cube_r17);
		setRotationAngle(cube_r17, -0.6109F, 0.0F, 0.1309F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 654, 367, -0.5F, -0.3926F, -1.158F, 1, 1, 2, -0.3F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-2.175F, -45.5849F, -51.3314F);
		colt_fs4.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, -0.1309F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 614, 652, -0.5F, -0.5403F, -1.1791F, 1, 2, 2, -0.3F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 656, 546, -0.5F, -1.021F, -0.5801F, 1, 2, 1, -0.3F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-0.825F, -45.5849F, -51.3314F);
		colt_fs4.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, 0.1309F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 608, 652, -0.5F, -0.5403F, -1.1791F, 1, 2, 2, -0.3F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 656, 543, -0.5F, -1.021F, -0.5801F, 1, 2, 1, -0.3F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-0.825F, -45.5849F, -51.3314F);
		colt_fs4.addChild(cube_r20);
		setRotationAngle(cube_r20, 1.0908F, 0.0F, 0.1309F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 654, 364, -0.5F, -0.5266F, -1.0051F, 1, 1, 2, -0.3F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-2.175F, -45.5849F, -51.3314F);
		colt_fs4.addChild(cube_r21);
		setRotationAngle(cube_r21, 1.0908F, 0.0F, -0.1309F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 364, 654, -0.5F, -0.5266F, -1.0051F, 1, 1, 2, -0.3F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-2.175F, -45.5849F, -51.3314F);
		colt_fs4.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.6981F, 0.0F, -0.1309F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 652, 601, -0.5F, -0.4057F, -0.9917F, 1, 2, 2, -0.3F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-0.825F, -45.5849F, -51.3314F);
		colt_fs4.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.6981F, 0.0F, 0.1309F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 652, 597, -0.5F, -0.4057F, -0.9917F, 1, 2, 2, -0.3F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		barrel606.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}