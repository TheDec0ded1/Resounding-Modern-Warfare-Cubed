package com.paneedah.mwc.models;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QBZ191Barrel extends ModelBase {
	private final ModelRenderer barrelQBZ191;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
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

	public QBZ191Barrel() {
		textureWidth = 400;
		textureHeight = 400;

		barrelQBZ191 = new ModelRenderer(this);
		barrelQBZ191.setRotationPoint(0.0F, 23.5F, -45.5F);
		barrelQBZ191.cubeList.add(new ModelBox(barrelQBZ191, 0, 0, -2.0F, -35.0F, -30.4F, 1, 1, 49, -0.1F, false));
		barrelQBZ191.cubeList.add(new ModelBox(barrelQBZ191, 100, 0, -2.5657F, -35.5657F, -30.4F, 1, 1, 49, -0.1F, false));
		barrelQBZ191.cubeList.add(new ModelBox(barrelQBZ191, 100, 50, -1.4343F, -35.5657F, -30.4F, 1, 1, 49, -0.1F, false));
		barrelQBZ191.cubeList.add(new ModelBox(barrelQBZ191, 100, 150, -2.0F, -36.1314F, -30.4F, 1, 1, 49, -0.1F, false));
		barrelQBZ191.cubeList.add(new ModelBox(barrelQBZ191, 200, 164, -2.0F, -37.7314F, -13.4F, 1, 1, 32, -0.1F, false));
		barrelQBZ191.cubeList.add(new ModelBox(barrelQBZ191, 166, 393, -2.0F, -38.5314F, -14.1F, 1, 2, 1, -0.1F, false));
		barrelQBZ191.cubeList.add(new ModelBox(barrelQBZ191, 394, 376, -2.0F, -34.8422F, -28.2F, 1, 1, 1, 0.0F, false));
		barrelQBZ191.cubeList.add(new ModelBox(barrelQBZ191, 62, 395, -2.7071F, -35.5493F, -28.2F, 1, 1, 1, 0.0F, false));
		barrelQBZ191.cubeList.add(new ModelBox(barrelQBZ191, 78, 395, -2.0F, -36.2564F, -28.2F, 1, 1, 1, 0.0F, false));
		barrelQBZ191.cubeList.add(new ModelBox(barrelQBZ191, 82, 395, -2.0F, -34.8422F, -29.45F, 1, 1, 1, 0.0F, false));
		barrelQBZ191.cubeList.add(new ModelBox(barrelQBZ191, 94, 395, -2.7071F, -35.5493F, -29.45F, 1, 1, 1, 0.0F, false));
		barrelQBZ191.cubeList.add(new ModelBox(barrelQBZ191, 142, 395, -2.0F, -36.2564F, -29.45F, 1, 1, 1, 0.0F, false));
		barrelQBZ191.cubeList.add(new ModelBox(barrelQBZ191, 146, 395, -2.0F, -36.2564F, -30.7F, 1, 1, 1, 0.0F, false));
		barrelQBZ191.cubeList.add(new ModelBox(barrelQBZ191, 150, 395, -2.7071F, -35.5493F, -30.7F, 1, 1, 1, 0.0F, false));
		barrelQBZ191.cubeList.add(new ModelBox(barrelQBZ191, 208, 395, -1.2929F, -35.5493F, -30.7F, 1, 1, 1, 0.0F, false));
		barrelQBZ191.cubeList.add(new ModelBox(barrelQBZ191, 234, 395, -1.2929F, -35.5493F, -29.45F, 1, 1, 1, 0.0F, false));
		barrelQBZ191.cubeList.add(new ModelBox(barrelQBZ191, 238, 395, -1.2929F, -35.5493F, -28.2F, 1, 1, 1, 0.0F, false));
		barrelQBZ191.cubeList.add(new ModelBox(barrelQBZ191, 242, 395, -2.0F, -34.8422F, -30.7F, 1, 1, 1, 0.0F, false));
		barrelQBZ191.cubeList.add(new ModelBox(barrelQBZ191, 246, 395, -2.0F, -36.2564F, -34.7F, 1, 1, 1, 0.0F, false));
		barrelQBZ191.cubeList.add(new ModelBox(barrelQBZ191, 292, 395, -2.7071F, -35.5493F, -34.7F, 1, 1, 1, 0.0F, false));
		barrelQBZ191.cubeList.add(new ModelBox(barrelQBZ191, 318, 395, -1.2929F, -35.5493F, -34.7F, 1, 1, 1, 0.0F, false));
		barrelQBZ191.cubeList.add(new ModelBox(barrelQBZ191, 322, 395, -2.0F, -34.8422F, -34.7F, 1, 1, 1, 0.0F, false));
		barrelQBZ191.cubeList.add(new ModelBox(barrelQBZ191, 342, 373, -1.5757F, -37.7321F, -13.5F, 1, 1, 7, -0.2F, false));
		barrelQBZ191.cubeList.add(new ModelBox(barrelQBZ191, 0, 375, -2.0F, -38.1564F, -13.5F, 1, 1, 7, -0.2F, false));
		barrelQBZ191.cubeList.add(new ModelBox(barrelQBZ191, 374, 376, -2.4243F, -37.7321F, -13.5F, 1, 1, 7, -0.2F, false));
		barrelQBZ191.cubeList.add(new ModelBox(barrelQBZ191, 186, 379, -2.0F, -37.3078F, -13.5F, 1, 1, 7, -0.2F, false));
		barrelQBZ191.cubeList.add(new ModelBox(barrelQBZ191, 90, 381, -2.0F, -36.2564F, -15.8F, 1, 1, 7, 0.0F, false));
		barrelQBZ191.cubeList.add(new ModelBox(barrelQBZ191, 168, 342, -2.5F, -37.2564F, -12.8F, 2, 2, 4, 0.0F, false));
		barrelQBZ191.cubeList.add(new ModelBox(barrelQBZ191, 240, 381, -1.2929F, -35.5493F, -15.8F, 1, 1, 7, 0.0F, false));
		barrelQBZ191.cubeList.add(new ModelBox(barrelQBZ191, 288, 381, -2.7071F, -35.5493F, -15.8F, 1, 1, 7, 0.0F, false));
		barrelQBZ191.cubeList.add(new ModelBox(barrelQBZ191, 336, 381, -2.0F, -34.8422F, -15.8F, 1, 1, 7, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-1.2929F, -34.5493F, -58.8F);
		barrelQBZ191.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.7854F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 320, 381, -1.0F, -1.0F, 43.0F, 1, 1, 7, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 156, 342, -1.0F, -1.0F, 24.1F, 1, 1, 5, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 86, 395, -1.0F, -1.0F, 29.35F, 1, 1, 1, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 394, 378, -1.0F, -1.0F, 30.6F, 1, 1, 1, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-0.2929F, -34.5493F, -58.8F);
		barrelQBZ191.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.7854F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 304, 381, -1.0F, -1.0F, 43.0F, 1, 1, 7, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 338, 186, -1.0F, -1.0F, 24.1F, 1, 1, 5, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 90, 395, -1.0F, -1.0F, 29.35F, 1, 1, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 392, 394, -1.0F, -1.0F, 30.6F, 1, 1, 1, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-1.2929F, -35.5493F, -58.8F);
		barrelQBZ191.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -0.7854F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 122, 381, -1.0F, -1.0F, 43.0F, 1, 1, 7, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 336, 100, -1.0F, -1.0F, 24.1F, 1, 1, 5, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 128, 395, -1.0F, -1.0F, 29.35F, 1, 1, 1, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 66, 395, -1.0F, -1.0F, 30.6F, 1, 1, 1, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-0.2929F, -35.5493F, -58.8F);
		barrelQBZ191.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.7854F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 106, 381, -1.0F, -1.0F, 43.0F, 1, 1, 7, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 190, 317, -1.0F, -1.0F, 24.1F, 1, 1, 5, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 132, 395, -1.0F, -1.0F, 29.35F, 1, 1, 1, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 70, 395, -1.0F, -1.0F, 30.6F, 1, 1, 1, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-1.0929F, -36.9321F, -58.5F);
		barrelQBZ191.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -0.7854F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 202, 378, -1.0F, -1.0F, 45.0F, 1, 1, 7, -0.2F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-1.0929F, -37.5321F, -58.5F);
		barrelQBZ191.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, -0.7854F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 358, 376, -1.0F, -1.0F, 45.0F, 1, 1, 7, -0.2F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-0.4929F, -36.9321F, -58.5F);
		barrelQBZ191.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -0.7854F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 272, 374, -1.0F, -1.0F, 45.0F, 1, 1, 7, -0.2F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-0.4929F, -37.5321F, -58.5F);
		barrelQBZ191.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, -0.7854F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 256, 374, -1.0F, -1.0F, 45.0F, 1, 1, 7, -0.2F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-0.3929F, -35.4657F, -13.4F);
		barrelQBZ191.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, -0.7854F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 150, -1.0F, -1.0F, -17.0F, 1, 1, 49, -0.1F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-1.1929F, -35.4657F, -13.4F);
		barrelQBZ191.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, -0.7854F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 100, 100, -1.0F, -1.0F, -17.0F, 1, 1, 49, -0.1F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-0.3929F, -34.6657F, -13.4F);
		barrelQBZ191.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, -0.7854F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 100, -1.0F, -1.0F, -17.0F, 1, 1, 49, -0.1F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-1.1929F, -34.6657F, -13.4F);
		barrelQBZ191.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, -0.7854F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 50, -1.0F, -1.0F, -17.0F, 1, 1, 49, -0.1F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		barrelQBZ191.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}