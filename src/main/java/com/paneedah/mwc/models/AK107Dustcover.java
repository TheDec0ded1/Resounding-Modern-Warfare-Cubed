package com.paneedah.mwc.models;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AK107Dustcover extends ModelBase {
	private final ModelRenderer dustcoverBARS2;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer bone4;
	private final ModelRenderer DustCover2;
	private final ModelRenderer DustCover3;
	private final ModelRenderer DustCover4;
	private final ModelRenderer bone5;
	private final ModelRenderer DustCover5;
	private final ModelRenderer DustCover6;
	private final ModelRenderer DustCover7;
	private final ModelRenderer DustCover13;
	private final ModelRenderer DustCover14;
	private final ModelRenderer DustCover15;
	private final ModelRenderer DustCover16;
	private final ModelRenderer DustCover20;
	private final ModelRenderer DustCover21;
	private final ModelRenderer DustCover22;
	private final ModelRenderer sights2;
	private final ModelRenderer ironsights_r1;
	private final ModelRenderer ironsights_r2;
	private final ModelRenderer ironsights_r3;
	private final ModelRenderer ironsights_r4;
	private final ModelRenderer ironsights_r5;
	private final ModelRenderer ironsights_r6;
	private final ModelRenderer cube_r3;

	public AK107Dustcover() {
		textureWidth = 400;
		textureHeight = 400;

		dustcoverBARS2 = new ModelRenderer(this);
		dustcoverBARS2.setRotationPoint(0.0F, 24.0F, 0.0F);
		dustcoverBARS2.cubeList.add(new ModelBox(dustcoverBARS2, 60, 376, -3.8F, -37.65F, -34.5F, 1, 2, 2, 0.0F, false));
		dustcoverBARS2.cubeList.add(new ModelBox(dustcoverBARS2, 362, 314, -3.8F, -37.65F, -8.5F, 1, 2, 10, 0.0F, false));
		dustcoverBARS2.cubeList.add(new ModelBox(dustcoverBARS2, 382, 300, -3.8F, -37.65F, -9.5F, 1, 1, 1, 0.0F, false));
		dustcoverBARS2.cubeList.add(new ModelBox(dustcoverBARS2, 164, 193, -0.2F, -37.65F, -34.5F, 1, 2, 36, 0.0F, false));
		dustcoverBARS2.cubeList.add(new ModelBox(dustcoverBARS2, 218, 303, -1.8524F, -39.9595F, -34.2F, 1, 1, 35, 0.0F, false));
		dustcoverBARS2.cubeList.add(new ModelBox(dustcoverBARS2, 290, 303, -2.1476F, -39.959F, -34.2F, 1, 1, 35, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-2.9554F, -38.3825F, -15.5F);
		dustcoverBARS2.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.3927F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 330, 382, -0.4996F, 0.0F, 16.0F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 66, 376, -0.5F, -1.0F, -19.0F, 1, 2, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 216, 339, -0.5F, -1.0F, -5.7F, 1, 2, 22, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-0.0446F, -38.3825F, -15.5F);
		dustcoverBARS2.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.3927F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 326, 382, -0.5004F, 0.0F, 16.0F, 1, 1, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 254, 117, -0.5F, -1.0F, -18.7F, 1, 2, 35, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-3.0804F, -38.4074F, -22.1058F);
		dustcoverBARS2.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.6545F, 0.0F, 0.3927F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 222, 380, -0.5F, -0.4F, 0.5F, 1, 2, 1, -0.125F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-3.5004F, -37.0668F, -30.3045F);
		dustcoverBARS2.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.6545F, 0.0F, 0.3927F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 218, 380, -0.5F, -0.8F, -3.0F, 1, 2, 1, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-2.1712F, -38.3811F, -30.3523F);
		dustcoverBARS2.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 0.3927F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 124, 379, -1.5F, -1.0F, 8.3F, 1, 1, 2, -0.275F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-2.129F, -38.2871F, -30.5042F);
		dustcoverBARS2.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.3927F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 66, 355, -1.5F, -1.0F, -2.7F, 1, 1, 2, -0.2F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-1.0833F, -39.516F, -16.2F);
		dustcoverBARS2.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -1.0908F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 298, -0.5F, 0.0F, -18.0F, 1, 1, 35, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-1.9167F, -39.516F, -16.2F);
		dustcoverBARS2.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, 1.0908F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 72, 291, -0.5F, 0.0F, -18.0F, 1, 1, 35, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-3.8F, -37.0F, 2.5F);
		dustcoverBARS2.addChild(bone4);
		

		DustCover2 = new ModelRenderer(this);
		DustCover2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone4.addChild(DustCover2);
		DustCover2.cubeList.add(new ModelBox(DustCover2, 278, 36, 0.0F, 0.349F, -0.999F, 4, 1, 2, 0.0F, false));

		DustCover3 = new ModelRenderer(this);
		DustCover3.setRotationPoint(0.0F, 0.0F, -12.0F);
		bone4.addChild(DustCover3);
		

		DustCover4 = new ModelRenderer(this);
		DustCover4.setRotationPoint(3.6F, 0.0F, -27.0F);
		bone4.addChild(DustCover4);
		DustCover4.cubeList.add(new ModelBox(DustCover4, 176, 378, 0.0F, 0.35F, 26.0F, 1, 1, 2, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-1.3F, -37.7F, 2.2F);
		dustcoverBARS2.addChild(bone5);
		

		DustCover5 = new ModelRenderer(this);
		DustCover5.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone5.addChild(DustCover5);
		setRotationAngle(DustCover5, -0.9295F, 0.0F, 0.0F);
		DustCover5.cubeList.add(new ModelBox(DustCover5, 338, 373, -0.001F, -0.2393F, -0.3205F, 2, 2, 2, 0.0F, false));

		DustCover6 = new ModelRenderer(this);
		DustCover6.setRotationPoint(0.1F, -1.8F, -1.32F);
		bone5.addChild(DustCover6);
		setRotationAngle(DustCover6, -0.9295F, 0.0F, 0.0F);
		DustCover6.cubeList.add(new ModelBox(DustCover6, 284, 368, 0.0F, -0.2393F, -0.0205F, 1, 1, 4, 0.0F, false));

		DustCover7 = new ModelRenderer(this);
		DustCover7.setRotationPoint(-0.7F, -2.3F, -1.7F);
		bone5.addChild(DustCover7);
		setRotationAngle(DustCover7, -0.9295F, 0.0F, 0.0F);
		DustCover7.cubeList.add(new ModelBox(DustCover7, 294, 368, 0.0F, -0.2393F, 0.2795F, 1, 1, 4, 0.0F, false));

		DustCover13 = new ModelRenderer(this);
		DustCover13.setRotationPoint(-1.5F, -1.8F, -1.32F);
		bone5.addChild(DustCover13);
		setRotationAngle(DustCover13, -0.9295F, 0.0F, 0.0F);
		DustCover13.cubeList.add(new ModelBox(DustCover13, 370, 66, 0.0F, -0.2393F, -0.0205F, 1, 1, 4, 0.0F, false));

		DustCover14 = new ModelRenderer(this);
		DustCover14.setRotationPoint(-2.4F, 0.0F, 0.0F);
		bone5.addChild(DustCover14);
		setRotationAngle(DustCover14, -0.9295F, 0.0F, 0.0F);
		DustCover14.cubeList.add(new ModelBox(DustCover14, 176, 374, 0.001F, -0.2393F, -0.3205F, 2, 2, 2, 0.0F, false));

		DustCover15 = new ModelRenderer(this);
		DustCover15.setRotationPoint(-3.9F, -52.5F, -21.5F);
		dustcoverBARS2.addChild(DustCover15);
		setRotationAngle(DustCover15, 0.0F, 0.0F, -0.7808F);
		DustCover15.cubeList.add(new ModelBox(DustCover15, 346, 73, -10.4176F, 10.3718F, 0.3F, 2, 1, 2, 0.0F, false));

		DustCover16 = new ModelRenderer(this);
		DustCover16.setRotationPoint(-3.9F, -52.5F, -21.5F);
		dustcoverBARS2.addChild(DustCover16);
		DustCover16.cubeList.add(new ModelBox(DustCover16, 304, 378, -0.1F, 14.7F, 0.3F, 1, 1, 2, 0.0F, false));

		DustCover20 = new ModelRenderer(this);
		DustCover20.setRotationPoint(-3.8F, -52.5F, -19.1F);
		dustcoverBARS2.addChild(DustCover20);
		setRotationAngle(DustCover20, 0.0F, 0.0F, -0.7436F);
		DustCover20.cubeList.add(new ModelBox(DustCover20, 24, 361, -10.0247F, 10.752F, -1.0F, 1, 1, 11, 0.0F, false));

		DustCover21 = new ModelRenderer(this);
		DustCover21.setRotationPoint(-3.8F, -52.5F, -10.1F);
		dustcoverBARS2.addChild(DustCover21);
		setRotationAngle(DustCover21, -0.8923F, 0.0F, 0.0F);
		DustCover21.cubeList.add(new ModelBox(DustCover21, 310, 378, -0.1F, 8.4475F, 12.0718F, 1, 1, 2, 0.0F, false));

		DustCover22 = new ModelRenderer(this);
		DustCover22.setRotationPoint(-3.8F, -52.5F, -19.1F);
		dustcoverBARS2.addChild(DustCover22);
		DustCover22.cubeList.add(new ModelBox(DustCover22, 0, 361, -0.099F, 14.7F, -1.0F, 1, 1, 11, 0.0F, false));

		sights2 = new ModelRenderer(this);
		sights2.setRotationPoint(0.0F, -39.5F, -126.9F);
		dustcoverBARS2.addChild(sights2);
		sights2.cubeList.add(new ModelBox(sights2, 326, 181, -2.5F, -1.76F, 91.22F, 2, 1, 7, -0.301F, false));
		sights2.cubeList.add(new ModelBox(sights2, 334, 189, -3.1F, -1.56F, 97.52F, 3, 1, 1, -0.4F, false));
		sights2.cubeList.add(new ModelBox(sights2, 134, 338, -3.1F, -1.76F, 97.52F, 3, 1, 1, -0.4F, false));
		sights2.cubeList.add(new ModelBox(sights2, 356, 113, -3.1F, -1.96F, 97.52F, 3, 1, 1, -0.4F, false));
		sights2.cubeList.add(new ModelBox(sights2, 334, 382, -0.9F, -1.96F, 97.52F, 1, 1, 1, -0.4F, false));
		sights2.cubeList.add(new ModelBox(sights2, 348, 382, -0.9F, -1.76F, 97.52F, 1, 1, 1, -0.4F, false));
		sights2.cubeList.add(new ModelBox(sights2, 382, 370, -0.9F, -1.56F, 97.52F, 1, 1, 1, -0.4F, false));
		sights2.cubeList.add(new ModelBox(sights2, 382, 372, -0.9F, -2.16F, 97.52F, 1, 1, 1, -0.4F, false));
		sights2.cubeList.add(new ModelBox(sights2, 382, 374, -1.1F, -2.16F, 97.52F, 1, 1, 1, -0.4F, false));
		sights2.cubeList.add(new ModelBox(sights2, 382, 376, -1.3F, -2.16F, 97.52F, 1, 1, 1, -0.4F, false));
		sights2.cubeList.add(new ModelBox(sights2, 382, 381, -1.5F, -2.16F, 97.52F, 1, 1, 1, -0.4F, false));
		sights2.cubeList.add(new ModelBox(sights2, 84, 383, -1.7F, -2.16F, 97.52F, 1, 1, 1, -0.401F, false));
		sights2.cubeList.add(new ModelBox(sights2, 92, 383, -1.7F, -2.26F, 97.52F, 1, 1, 1, -0.402F, false));
		sights2.cubeList.add(new ModelBox(sights2, 96, 383, -1.5F, -2.26F, 97.52F, 1, 1, 1, -0.401F, false));
		sights2.cubeList.add(new ModelBox(sights2, 100, 383, -1.3F, -2.26F, 97.52F, 1, 1, 1, -0.401F, false));
		sights2.cubeList.add(new ModelBox(sights2, 104, 383, -1.1F, -2.26F, 97.52F, 1, 1, 1, -0.401F, false));
		sights2.cubeList.add(new ModelBox(sights2, 108, 383, -0.9F, -2.26F, 97.52F, 1, 1, 1, -0.401F, false));
		sights2.cubeList.add(new ModelBox(sights2, 112, 383, -2.3F, -2.26F, 97.52F, 1, 1, 1, -0.402F, false));
		sights2.cubeList.add(new ModelBox(sights2, 148, 383, -2.5F, -2.26F, 97.52F, 1, 1, 1, -0.401F, false));
		sights2.cubeList.add(new ModelBox(sights2, 152, 383, -2.7F, -2.26F, 97.52F, 1, 1, 1, -0.401F, false));
		sights2.cubeList.add(new ModelBox(sights2, 156, 383, -2.9F, -2.26F, 97.52F, 1, 1, 1, -0.401F, false));
		sights2.cubeList.add(new ModelBox(sights2, 160, 383, -3.1F, -2.26F, 97.52F, 1, 1, 1, -0.401F, false));
		sights2.cubeList.add(new ModelBox(sights2, 164, 383, -2.3F, -2.16F, 97.52F, 1, 1, 1, -0.401F, false));
		sights2.cubeList.add(new ModelBox(sights2, 176, 383, -2.5F, -2.16F, 97.52F, 1, 1, 1, -0.4F, false));
		sights2.cubeList.add(new ModelBox(sights2, 204, 383, -2.9F, -2.16F, 97.52F, 1, 1, 1, -0.4F, false));
		sights2.cubeList.add(new ModelBox(sights2, 208, 383, -3.1F, -2.16F, 97.52F, 1, 1, 1, -0.4F, false));
		sights2.cubeList.add(new ModelBox(sights2, 212, 383, -2.7F, -2.16F, 97.52F, 1, 1, 1, -0.4F, false));

		ironsights_r1 = new ModelRenderer(this);
		ironsights_r1.setRotationPoint(-1.5F, -0.4499F, 93.8307F);
		sights2.addChild(ironsights_r1);
		setRotationAngle(ironsights_r1, -1.5708F, -1.3526F, 1.5708F);
		ironsights_r1.cubeList.add(new ModelBox(ironsights_r1, 146, 264, -1.5F, -1.0F, 0.45F, 5, 2, 1, -0.2F, false));
		ironsights_r1.cubeList.add(new ModelBox(ironsights_r1, 284, 76, -1.5F, -1.0F, -1.45F, 5, 2, 1, -0.2F, false));

		ironsights_r2 = new ModelRenderer(this);
		ironsights_r2.setRotationPoint(-1.95F, -1.9123F, 97.3347F);
		sights2.addChild(ironsights_r2);
		setRotationAngle(ironsights_r2, 0.0F, -1.5708F, 0.0F);
		ironsights_r2.cubeList.add(new ModelBox(ironsights_r2, 118, 379, -0.4F, 1.0F, 0.0F, 2, 2, 1, -0.2F, false));

		ironsights_r3 = new ModelRenderer(this);
		ironsights_r3.setRotationPoint(-0.05F, -1.9123F, 97.3347F);
		sights2.addChild(ironsights_r3);
		setRotationAngle(ironsights_r3, 0.0F, -1.5708F, 0.0F);
		ironsights_r3.cubeList.add(new ModelBox(ironsights_r3, 78, 379, -0.4F, 1.0F, 0.0F, 2, 2, 1, -0.2F, false));

		ironsights_r4 = new ModelRenderer(this);
		ironsights_r4.setRotationPoint(-0.05F, -2.7123F, 91.3347F);
		sights2.addChild(ironsights_r4);
		setRotationAngle(ironsights_r4, 0.0F, -1.5708F, 0.0F);
		ironsights_r4.cubeList.add(new ModelBox(ironsights_r4, 342, 378, -0.4F, 1.0F, 0.0F, 2, 2, 1, -0.2F, false));

		ironsights_r5 = new ModelRenderer(this);
		ironsights_r5.setRotationPoint(-1.55F, -2.3123F, 91.5347F);
		sights2.addChild(ironsights_r5);
		setRotationAngle(ironsights_r5, 0.0F, -1.5708F, 0.0F);
		ironsights_r5.cubeList.add(new ModelBox(ironsights_r5, 322, 378, -0.4F, 1.0F, -1.0F, 1, 1, 2, -0.1F, false));

		ironsights_r6 = new ModelRenderer(this);
		ironsights_r6.setRotationPoint(-1.95F, -2.7123F, 91.3347F);
		sights2.addChild(ironsights_r6);
		setRotationAngle(ironsights_r6, 0.0F, -1.5708F, 0.0F);
		ironsights_r6.cubeList.add(new ModelBox(ironsights_r6, 316, 378, -0.4F, 1.0F, 0.0F, 2, 2, 1, -0.2F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-2.7F, -1.36F, 40.72F);
		sights2.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.3665F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 216, 383, -0.8F, 19.8968F, 52.0384F, 1, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 220, 383, 2.2F, 19.8968F, 52.0384F, 1, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 224, 383, 1.7F, 19.8968F, 52.0384F, 1, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 228, 383, -0.3F, 19.8968F, 52.0384F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		dustcoverBARS2.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}