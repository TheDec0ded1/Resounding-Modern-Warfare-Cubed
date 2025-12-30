package com.paneedah.mwc.models;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QCW05Body extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer bone4;
	private final ModelRenderer handguard_r1;
	private final ModelRenderer handguard_r2;
	private final ModelRenderer handguard_r3;
	private final ModelRenderer handguard_r4;
	private final ModelRenderer handguard_r5;
	private final ModelRenderer handguard_r6;
	private final ModelRenderer handguard_r7;
	private final ModelRenderer handguard_r8;
	private final ModelRenderer handguard_r9;
	private final ModelRenderer handguard_r10;
	private final ModelRenderer handguard_r11;
	private final ModelRenderer handguard_r12;
	private final ModelRenderer handguard_r13;
	private final ModelRenderer handguard_r14;
	private final ModelRenderer handguard_r15;
	private final ModelRenderer handguard_r16;
	private final ModelRenderer grip;
	private final ModelRenderer cube_r80;
	private final ModelRenderer cube_r81;
	private final ModelRenderer cube_r82;
	private final ModelRenderer cube_r83;
	private final ModelRenderer cube_r84;
	private final ModelRenderer cube_r88_r1;
	private final ModelRenderer cube_r87_r1;
	private final ModelRenderer cube_r85;
	private final ModelRenderer bone30;
	private final ModelRenderer cube_r86;
	private final ModelRenderer cube_r87;
	private final ModelRenderer bone33;
	private final ModelRenderer cube_r88;
	private final ModelRenderer cube_r89;
	private final ModelRenderer bone31;
	private final ModelRenderer cube_r90;
	private final ModelRenderer cube_r91;
	private final ModelRenderer bone32;
	private final ModelRenderer cube_r92;
	private final ModelRenderer cube_r93;

	public QCW05Body() {
		textureWidth = 320;
		textureHeight = 320;

		body = new ModelRenderer(this);
		body.setRotationPoint(-0.1F, 24.0F, 2.0F);
		

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.8F, -3.2F, 20.9641F);
		body.addChild(bone4);
		bone4.cubeList.add(new ModelBox(bone4, 106, 156, -4.7F, -33.9F, -34.6641F, 5, 5, 17, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 285, 25, -4.7F, -32.9F, -17.6641F, 5, 1, 2, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 293, 259, -2.2F, -31.8F, -24.7641F, 3, 1, 2, -0.3F, false));
		bone4.cubeList.add(new ModelBox(bone4, 85, 294, -2.2F, -31.8F, -27.5641F, 3, 1, 2, -0.3F, false));
		bone4.cubeList.add(new ModelBox(bone4, 62, 288, -4.7F, -30.9F, -35.1641F, 5, 2, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 247, 250, -4.7F, -33.9F, -47.6641F, 1, 2, 13, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 0, 251, -0.7F, -33.9F, -47.6641F, 1, 2, 13, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 295, 301, -4.815F, -34.0433F, -47.6641F, 1, 2, 1, 0.1F, false));
		bone4.cubeList.add(new ModelBox(bone4, 300, 217, -0.5512F, -34.0433F, -47.6641F, 1, 2, 1, 0.1F, false));
		bone4.cubeList.add(new ModelBox(bone4, 197, 268, -5.0F, -32.7F, -16.4F, 6, 4, 1, -0.2F, false));
		bone4.cubeList.add(new ModelBox(bone4, 236, 62, -4.7F, -33.9F, -18.0641F, 5, 1, 2, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 282, 237, -4.7F, -31.9F, -17.6641F, 5, 3, 2, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 106, 179, -5.0F, -33.1F, -16.4F, 6, 1, 1, -0.2F, false));
		bone4.cubeList.add(new ModelBox(bone4, 35, 232, -5.4F, -32.7F, -16.4F, 1, 4, 1, -0.2F, false));
		bone4.cubeList.add(new ModelBox(bone4, 300, 288, -5.4F, -33.1F, -16.4F, 1, 1, 1, -0.2F, false));

		handguard_r1 = new ModelRenderer(this);
		handguard_r1.setRotationPoint(-4.3881F, -32.8513F, -16.8477F);
		bone4.addChild(handguard_r1);
		setRotationAngle(handguard_r1, -0.5387F, -0.2261F, 0.1332F);
		handguard_r1.cubeList.add(new ModelBox(handguard_r1, 298, 125, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

		handguard_r2 = new ModelRenderer(this);
		handguard_r2.setRotationPoint(-0.0119F, -32.8513F, -16.8477F);
		bone4.addChild(handguard_r2);
		setRotationAngle(handguard_r2, -0.5387F, 0.2261F, -0.1332F);
		handguard_r2.cubeList.add(new ModelBox(handguard_r2, 298, 121, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

		handguard_r3 = new ModelRenderer(this);
		handguard_r3.setRotationPoint(-4.2171F, -30.7F, -17.4385F);
		bone4.addChild(handguard_r3);
		setRotationAngle(handguard_r3, 0.0F, -0.3491F, 0.0F);
		handguard_r3.cubeList.add(new ModelBox(handguard_r3, 122, 295, -0.5F, -2.0F, -1.5F, 1, 1, 3, 0.0F, false));
		handguard_r3.cubeList.add(new ModelBox(handguard_r3, 199, 290, -0.5F, -1.2F, -1.5F, 1, 3, 3, 0.0F, false));

		handguard_r4 = new ModelRenderer(this);
		handguard_r4.setRotationPoint(-0.1829F, -30.7F, -17.4385F);
		bone4.addChild(handguard_r4);
		setRotationAngle(handguard_r4, 0.0F, 0.3491F, 0.0F);
		handguard_r4.cubeList.add(new ModelBox(handguard_r4, 7, 295, -0.5F, -2.0F, -1.5F, 1, 1, 3, 0.0F, false));
		handguard_r4.cubeList.add(new ModelBox(handguard_r4, 122, 288, -0.5F, -1.2F, -1.5F, 1, 3, 3, 0.0F, false));

		handguard_r5 = new ModelRenderer(this);
		handguard_r5.setRotationPoint(-1.7058F, -31.1698F, -41.2417F);
		bone4.addChild(handguard_r5);
		setRotationAngle(handguard_r5, -0.0873F, 0.0F, 0.0F);
		handguard_r5.cubeList.add(new ModelBox(handguard_r5, 256, 288, -3.9234F, -1.0781F, -6.5F, 1, 1, 1, 0.1F, false));
		handguard_r5.cubeList.add(new ModelBox(handguard_r5, 90, 302, 1.9687F, -1.0781F, -6.5F, 1, 1, 1, 0.1F, false));

		handguard_r6 = new ModelRenderer(this);
		handguard_r6.setRotationPoint(-6.69F, -29.2258F, -41.4117F);
		bone4.addChild(handguard_r6);
		setRotationAngle(handguard_r6, -0.0873F, 0.0F, 0.0F);
		handguard_r6.cubeList.add(new ModelBox(handguard_r6, 85, 302, 2.0767F, -1.0781F, -6.5F, 1, 1, 1, 0.1F, false));
		handguard_r6.cubeList.add(new ModelBox(handguard_r6, 295, 281, 2.9371F, -1.0781F, -6.5F, 4, 1, 1, 0.1F, false));

		handguard_r7 = new ModelRenderer(this);
		handguard_r7.setRotationPoint(-2.1124F, -31.0278F, -41.2541F);
		bone4.addChild(handguard_r7);
		setRotationAngle(handguard_r7, -0.0774F, -0.0403F, -0.4784F);
		handguard_r7.cubeList.add(new ModelBox(handguard_r7, 17, 282, -3.0524F, -1.677F, -6.5F, 1, 2, 1, 0.1F, false));

		handguard_r8 = new ModelRenderer(this);
		handguard_r8.setRotationPoint(-1.8486F, -31.0278F, -41.2541F);
		bone4.addChild(handguard_r8);
		setRotationAngle(handguard_r8, -0.0774F, 0.0403F, 0.4784F);
		handguard_r8.cubeList.add(new ModelBox(handguard_r8, 300, 161, 1.693F, -1.4899F, -6.5F, 1, 2, 1, 0.1F, false));

		handguard_r9 = new ModelRenderer(this);
		handguard_r9.setRotationPoint(-2.915F, -31.5433F, -41.1641F);
		bone4.addChild(handguard_r9);
		setRotationAngle(handguard_r9, 0.0F, 0.0F, 0.48F);
		handguard_r9.cubeList.add(new ModelBox(handguard_r9, 188, 286, -2.5F, -1.0F, -6.5F, 1, 2, 1, 0.1F, false));

		handguard_r10 = new ModelRenderer(this);
		handguard_r10.setRotationPoint(-1.4512F, -31.5433F, -41.1641F);
		bone4.addChild(handguard_r10);
		setRotationAngle(handguard_r10, 0.0F, 0.0F, -0.48F);
		handguard_r10.cubeList.add(new ModelBox(handguard_r10, 300, 196, 1.5F, -1.0F, -6.5F, 1, 2, 1, 0.1F, false));

		handguard_r11 = new ModelRenderer(this);
		handguard_r11.setRotationPoint(-1.9974F, -31.1561F, -41.1462F);
		bone4.addChild(handguard_r11);
		setRotationAngle(handguard_r11, -0.0774F, 0.0403F, 0.4784F);
		handguard_r11.cubeList.add(new ModelBox(handguard_r11, 252, 78, 1.693F, -1.4899F, -6.5F, 1, 2, 13, 0.0F, false));

		handguard_r12 = new ModelRenderer(this);
		handguard_r12.setRotationPoint(-1.9974F, -31.1561F, -41.1462F);
		bone4.addChild(handguard_r12);
		setRotationAngle(handguard_r12, -0.0774F, -0.0403F, -0.4784F);
		handguard_r12.cubeList.add(new ModelBox(handguard_r12, 252, 94, -3.0524F, -1.677F, -6.5F, 1, 2, 13, 0.0F, false));

		handguard_r13 = new ModelRenderer(this);
		handguard_r13.setRotationPoint(-1.6F, -31.4F, -41.1641F);
		bone4.addChild(handguard_r13);
		setRotationAngle(handguard_r13, 0.0F, 0.0F, -0.48F);
		handguard_r13.cubeList.add(new ModelBox(handguard_r13, 29, 251, 1.5F, -1.0F, -6.5F, 1, 2, 13, 0.0F, false));

		handguard_r14 = new ModelRenderer(this);
		handguard_r14.setRotationPoint(-2.8F, -31.4F, -41.1641F);
		bone4.addChild(handguard_r14);
		setRotationAngle(handguard_r14, 0.0F, 0.0F, 0.48F);
		handguard_r14.cubeList.add(new ModelBox(handguard_r14, 252, 62, -2.5F, -1.0F, -6.5F, 1, 2, 13, 0.0F, false));

		handguard_r15 = new ModelRenderer(this);
		handguard_r15.setRotationPoint(-6.6324F, -29.3888F, -41.3008F);
		bone4.addChild(handguard_r15);
		setRotationAngle(handguard_r15, -0.0873F, 0.0F, 0.0F);
		handguard_r15.cubeList.add(new ModelBox(handguard_r15, 252, 125, 2.0766F, -1.0781F, -6.5F, 1, 1, 13, 0.0F, false));
		handguard_r15.cubeList.add(new ModelBox(handguard_r15, 212, 250, 2.7882F, -1.0781F, -6.5F, 4, 1, 13, 0.0F, false));

		handguard_r16 = new ModelRenderer(this);
		handguard_r16.setRotationPoint(-1.5559F, -31.1561F, -41.1462F);
		bone4.addChild(handguard_r16);
		setRotationAngle(handguard_r16, -0.0873F, 0.0F, 0.0F);
		handguard_r16.cubeList.add(new ModelBox(handguard_r16, 252, 140, -3.9234F, -1.0781F, -6.5F, 1, 1, 13, 0.0F, false));
		handguard_r16.cubeList.add(new ModelBox(handguard_r16, 252, 110, 1.6352F, -1.0781F, -6.5F, 1, 1, 13, 0.0F, false));

		grip = new ModelRenderer(this);
		grip.setRotationPoint(0.5F, -33.6F, -8.4F);
		body.addChild(grip);
		grip.cubeList.add(new ModelBox(grip, 23, 267, -3.9F, 1.5F, 1.7F, 4, 1, 7, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 176, 268, -3.9F, 2.3F, 1.7F, 4, 1, 6, -0.001F, false));
		grip.cubeList.add(new ModelBox(grip, 136, 179, -3.9F, 3.3F, 5.6F, 4, 1, 1, -0.001F, false));
		grip.cubeList.add(new ModelBox(grip, 280, 190, -3.9F, 14.8F, 3.3F, 4, 1, 4, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 63, 275, -3.9F, 1.5F, 1.375F, 4, 1, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 285, 178, -3.898F, 2.1263F, 1.3761F, 4, 1, 1, -0.001F, false));
		grip.cubeList.add(new ModelBox(grip, 254, 298, -2.898F, 1.1263F, 0.3761F, 2, 2, 1, -0.001F, false));

		cube_r80 = new ModelRenderer(this);
		cube_r80.setRotationPoint(-4.1F, 9.65F, 9.0F);
		grip.addChild(cube_r80);
		setRotationAngle(cube_r80, -1.2392F, 0.0F, 0.0F);
		cube_r80.cubeList.add(new ModelBox(cube_r80, 268, 196, 0.2F, 0.0F, -6.0F, 4, 1, 6, -0.001F, false));

		cube_r81 = new ModelRenderer(this);
		cube_r81.setRotationPoint(-4.1F, 9.65F, 9.0F);
		grip.addChild(cube_r81);
		setRotationAngle(cube_r81, -1.4312F, 0.0F, 0.0F);
		cube_r81.cubeList.add(new ModelBox(cube_r81, 268, 213, 0.2F, 0.0F, 0.0F, 4, 1, 5, 0.0F, false));

		cube_r82 = new ModelRenderer(this);
		cube_r82.setRotationPoint(-4.1F, 14.8F, 3.3F);
		grip.addChild(cube_r82);
		setRotationAngle(cube_r82, 0.7854F, 0.0F, 0.0F);
		cube_r82.cubeList.add(new ModelBox(cube_r82, 162, 295, 0.2F, 0.0F, 0.0F, 4, 1, 1, -0.001F, false));

		cube_r83 = new ModelRenderer(this);
		cube_r83.setRotationPoint(-4.1F, 15.8F, 7.3F);
		grip.addChild(cube_r83);
		setRotationAngle(cube_r83, 0.4712F, 0.0F, 0.0F);
		cube_r83.cubeList.add(new ModelBox(cube_r83, 186, 295, 0.2F, -1.0F, 0.0F, 4, 1, 1, -0.001F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 287, 14, 0.2F, -1.0F, 0.7F, 4, 1, 2, -0.002F, false));

		cube_r84 = new ModelRenderer(this);
		cube_r84.setRotationPoint(-4.1F, 3.95F, 6.7F);
		grip.addChild(cube_r84);
		setRotationAngle(cube_r84, -1.3439F, 0.0F, 0.0F);
		cube_r84.cubeList.add(new ModelBox(cube_r84, 117, 231, 0.2F, 0.0F, -2.0F, 4, 5, 13, 0.001F, false));
		cube_r84.cubeList.add(new ModelBox(cube_r84, 285, 172, 1.2F, 4.9744F, -2.2249F, 2, 1, 4, 0.001F, false));
		cube_r84.cubeList.add(new ModelBox(cube_r84, 16, 299, 1.2F, 5.9744F, -0.2249F, 2, 1, 1, 0.001F, false));

		cube_r88_r1 = new ModelRenderer(this);
		cube_r88_r1.setRotationPoint(2.2F, 7.3046F, -0.6753F);
		cube_r84.addChild(cube_r88_r1);
		setRotationAngle(cube_r88_r1, -0.0436F, 0.0F, 0.0F);
		cube_r88_r1.cubeList.add(new ModelBox(cube_r88_r1, 281, 126, -1.0F, 4.4665F, -5.8645F, 2, 1, 6, 0.001F, false));

		cube_r87_r1 = new ModelRenderer(this);
		cube_r87_r1.setRotationPoint(2.2F, 7.3296F, 0.1625F);
		cube_r84.addChild(cube_r87_r1);
		setRotationAngle(cube_r87_r1, -0.2618F, 0.0F, 0.0F);
		cube_r87_r1.cubeList.add(new ModelBox(cube_r87_r1, 228, 291, -1.0F, -0.5F, -0.5F, 2, 6, 1, 0.001F, false));

		cube_r85 = new ModelRenderer(this);
		cube_r85.setRotationPoint(-4.1F, 2.5F, 9.0F);
		grip.addChild(cube_r85);
		setRotationAngle(cube_r85, -0.8378F, 0.0F, 0.0F);
		cube_r85.cubeList.add(new ModelBox(cube_r85, 289, 223, 0.2F, 0.223F, -1.2007F, 4, 3, 1, -0.002F, false));

		bone30 = new ModelRenderer(this);
		bone30.setRotationPoint(-2.0F, -3.7F, 11.0F);
		grip.addChild(bone30);
		

		cube_r86 = new ModelRenderer(this);
		cube_r86.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone30.addChild(cube_r86);
		setRotationAngle(cube_r86, 0.0F, 0.0F, -0.4363F);
		

		cube_r87 = new ModelRenderer(this);
		cube_r87.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone30.addChild(cube_r87);
		setRotationAngle(cube_r87, 0.0F, 0.0F, 0.4363F);
		

		bone33 = new ModelRenderer(this);
		bone33.setRotationPoint(-2.0F, -0.3F, 11.0F);
		grip.addChild(bone33);
		

		cube_r88 = new ModelRenderer(this);
		cube_r88.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone33.addChild(cube_r88);
		setRotationAngle(cube_r88, 0.0F, 0.0F, 0.4363F);
		

		cube_r89 = new ModelRenderer(this);
		cube_r89.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone33.addChild(cube_r89);
		setRotationAngle(cube_r89, 0.0F, 0.0F, -0.4363F);
		

		bone31 = new ModelRenderer(this);
		bone31.setRotationPoint(-3.7F, -2.0F, 11.0F);
		grip.addChild(bone31);
		

		cube_r90 = new ModelRenderer(this);
		cube_r90.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone31.addChild(cube_r90);
		setRotationAngle(cube_r90, 0.0F, 0.0F, -0.4363F);
		

		cube_r91 = new ModelRenderer(this);
		cube_r91.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone31.addChild(cube_r91);
		setRotationAngle(cube_r91, 0.0F, 0.0F, 0.4363F);
		

		bone32 = new ModelRenderer(this);
		bone32.setRotationPoint(-0.3F, -2.0F, 11.0F);
		grip.addChild(bone32);
		

		cube_r92 = new ModelRenderer(this);
		cube_r92.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone32.addChild(cube_r92);
		setRotationAngle(cube_r92, 0.0F, 0.0F, 0.4363F);
		

		cube_r93 = new ModelRenderer(this);
		cube_r93.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone32.addChild(cube_r93);
		setRotationAngle(cube_r93, 0.0F, 0.0F, -0.4363F);
		
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		body.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}