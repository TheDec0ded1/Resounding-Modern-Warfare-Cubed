package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class LR300Rails extends ModelBase {
	private final ModelRenderer rails;
	private final ModelRenderer siderail;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer siderail2;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer siderail3;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;

	public LR300Rails() {
		textureWidth = 368;
		textureHeight = 368;

		rails = new ModelRenderer(this);
		rails.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		siderail = new ModelRenderer(this);
		siderail.setRotationPoint(-3.6217F, -38.0739F, -48.1435F);
		rails.addChild(siderail);
		setRotationAngle(siderail, 0.0F, 0.0F, -1.5708F);
		siderail.cubeList.add(new ModelBox(siderail, 348, 179, -0.9783F, -0.5261F, -1.7565F, 2, 1, 1, -0.199F, false));
		siderail.cubeList.add(new ModelBox(siderail, 348, 181, -0.9783F, -0.5261F, -1.6565F, 2, 1, 1, -0.199F, false));
		siderail.cubeList.add(new ModelBox(siderail, 348, 183, -0.9783F, -0.5261F, -0.4065F, 2, 1, 1, -0.199F, false));
		siderail.cubeList.add(new ModelBox(siderail, 348, 185, -0.9783F, -0.5261F, 0.8435F, 2, 1, 1, -0.199F, false));
		siderail.cubeList.add(new ModelBox(siderail, 348, 187, -0.9783F, -0.5261F, 2.0935F, 2, 1, 1, -0.199F, false));
		siderail.cubeList.add(new ModelBox(siderail, 208, 348, -0.9783F, -0.5261F, 3.3435F, 2, 1, 1, -0.199F, false));
		siderail.cubeList.add(new ModelBox(siderail, 250, 348, -0.9783F, -0.5261F, 4.5935F, 2, 1, 1, -0.199F, false));
		siderail.cubeList.add(new ModelBox(siderail, 326, 251, -1.0783F, 0.0739F, -1.5565F, 1, 1, 7, 0.0F, false));
		siderail.cubeList.add(new ModelBox(siderail, 326, 227, -0.8783F, 0.0739F, -1.5565F, 2, 1, 7, -0.001F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-0.7783F, -0.3261F, -40.5565F);
		siderail.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.8901F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 328, 259, -0.25F, -0.05F, 38.8F, 1, 1, 7, -0.35F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 300, 350, -0.2F, -0.2F, 45.15F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 350, 301, -0.2F, -0.2F, 43.9F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 350, 303, -0.2F, -0.2F, 42.65F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 350, 305, -0.2F, -0.2F, 41.4F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 350, 307, -0.2F, -0.2F, 40.15F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 350, 309, -0.2F, -0.2F, 38.9F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 350, 311, -0.2F, -0.2F, 38.8F, 1, 1, 1, -0.198F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.8217F, -0.3261F, -40.5565F);
		siderail.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.8901F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 328, 267, -0.75F, -0.05F, 38.8F, 1, 1, 7, -0.35F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 350, 209, -0.8F, -0.2F, 45.15F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 350, 211, -0.8F, -0.2F, 43.9F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 350, 213, -0.8F, -0.2F, 42.65F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 350, 215, -0.8F, -0.2F, 41.4F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 350, 217, -0.8F, -0.2F, 40.15F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 350, 219, -0.8F, -0.2F, 38.9F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 350, 221, -0.8F, -0.2F, 38.8F, 1, 1, 1, -0.198F, false));

		siderail2 = new ModelRenderer(this);
		siderail2.setRotationPoint(5.4567F, -38.0502F, -54.2045F);
		rails.addChild(siderail2);
		setRotationAngle(siderail2, 0.0F, 0.0F, 1.5708F);
		siderail2.cubeList.add(new ModelBox(siderail2, 348, 128, -1.0445F, 4.3555F, 4.3055F, 2, 1, 1, -0.199F, false));
		siderail2.cubeList.add(new ModelBox(siderail2, 348, 130, -1.0445F, 4.3555F, 4.4055F, 2, 1, 1, -0.199F, false));
		siderail2.cubeList.add(new ModelBox(siderail2, 348, 132, -1.0445F, 4.3555F, 5.6555F, 2, 1, 1, -0.199F, false));
		siderail2.cubeList.add(new ModelBox(siderail2, 348, 134, -1.0445F, 4.3555F, 6.9055F, 2, 1, 1, -0.199F, false));
		siderail2.cubeList.add(new ModelBox(siderail2, 348, 136, -1.0445F, 4.3555F, 8.1555F, 2, 1, 1, -0.199F, false));
		siderail2.cubeList.add(new ModelBox(siderail2, 348, 138, -1.0445F, 4.3555F, 9.4055F, 2, 1, 1, -0.199F, false));
		siderail2.cubeList.add(new ModelBox(siderail2, 348, 140, -1.0445F, 4.3555F, 10.6555F, 2, 1, 1, -0.199F, false));
		siderail2.cubeList.add(new ModelBox(siderail2, 328, 275, -1.1445F, 4.9555F, 4.5055F, 1, 1, 7, 0.0F, false));
		siderail2.cubeList.add(new ModelBox(siderail2, 326, 235, -0.9445F, 4.9555F, 4.5055F, 2, 1, 7, -0.001F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-0.7546F, -0.3545F, -34.4955F);
		siderail2.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.8901F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 78, 329, 3.5092F, 3.11F, 38.801F, 1, 1, 7, -0.35F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 350, 223, 3.5592F, 2.96F, 45.151F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 350, 225, 3.5592F, 2.96F, 43.901F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 350, 227, 3.5592F, 2.96F, 42.651F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 350, 229, 3.5592F, 2.96F, 41.401F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 350, 231, 3.5592F, 2.96F, 40.151F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 350, 233, 3.5592F, 2.96F, 38.901F, 1, 1, 1, -0.198F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 350, 235, 3.5592F, 2.96F, 38.801F, 1, 1, 1, -0.198F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.8455F, -0.3545F, -34.4955F);
		siderail2.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.8901F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 94, 329, -4.6224F, 2.9702F, 38.801F, 1, 1, 7, -0.35F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 350, 237, -4.6724F, 2.8202F, 45.151F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 350, 239, -4.6724F, 2.8202F, 43.901F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 350, 241, -4.6724F, 2.8202F, 42.651F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 350, 243, -4.6724F, 2.8202F, 41.401F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 350, 245, -4.6724F, 2.8202F, 40.151F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 350, 247, -4.6724F, 2.8202F, 38.901F, 1, 1, 1, -0.198F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 350, 249, -4.6724F, 2.8202F, 38.801F, 1, 1, 1, -0.198F, false));

		siderail3 = new ModelRenderer(this);
		siderail3.setRotationPoint(-1.4856F, -35.1238F, -54.2037F);
		rails.addChild(siderail3);
		setRotationAngle(siderail3, 0.0F, 0.0F, -3.1416F);
		siderail3.cubeList.add(new ModelBox(siderail3, 348, 142, -0.9709F, 0.3382F, 4.3047F, 2, 1, 1, -0.199F, false));
		siderail3.cubeList.add(new ModelBox(siderail3, 144, 348, -0.9709F, 0.3382F, 4.4047F, 2, 1, 1, -0.199F, false));
		siderail3.cubeList.add(new ModelBox(siderail3, 348, 144, -0.9709F, 0.3382F, 5.6547F, 2, 1, 1, -0.199F, false));
		siderail3.cubeList.add(new ModelBox(siderail3, 156, 348, -0.9709F, 0.3382F, 6.9047F, 2, 1, 1, -0.199F, false));
		siderail3.cubeList.add(new ModelBox(siderail3, 348, 173, -0.9709F, 0.3382F, 8.1547F, 2, 1, 1, -0.199F, false));
		siderail3.cubeList.add(new ModelBox(siderail3, 348, 175, -0.9709F, 0.3382F, 9.4047F, 2, 1, 1, -0.199F, false));
		siderail3.cubeList.add(new ModelBox(siderail3, 348, 177, -0.9709F, 0.3382F, 10.6547F, 2, 1, 1, -0.199F, false));
		siderail3.cubeList.add(new ModelBox(siderail3, 110, 329, -1.0709F, 0.9382F, 4.5047F, 1, 1, 7, 0.0F, false));
		siderail3.cubeList.add(new ModelBox(siderail3, 326, 243, -0.8709F, 0.9382F, 4.5047F, 2, 1, 7, -0.001F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-0.681F, -4.3719F, -34.4963F);
		siderail3.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.8901F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 330, 3.5092F, 3.11F, 38.801F, 1, 1, 7, -0.35F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 250, 350, 3.5592F, 2.96F, 45.151F, 1, 1, 1, -0.198F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 350, 251, 3.5592F, 2.96F, 43.901F, 1, 1, 1, -0.198F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 350, 253, 3.5592F, 2.96F, 42.651F, 1, 1, 1, -0.198F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 350, 255, 3.5592F, 2.96F, 41.401F, 1, 1, 1, -0.198F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 350, 257, 3.5592F, 2.96F, 40.151F, 1, 1, 1, -0.198F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 350, 259, 3.5592F, 2.96F, 38.901F, 1, 1, 1, -0.198F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 350, 261, 3.5592F, 2.96F, 38.801F, 1, 1, 1, -0.198F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.919F, -4.3719F, -34.4963F);
		siderail3.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -0.8901F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 330, 0, -4.6224F, 2.9702F, 38.801F, 1, 1, 7, -0.35F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 350, 263, -4.6724F, 2.8202F, 45.151F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 350, 265, -4.6724F, 2.8202F, 43.901F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 350, 267, -4.6724F, 2.8202F, 42.651F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 350, 269, -4.6724F, 2.8202F, 41.401F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 350, 271, -4.6724F, 2.8202F, 40.151F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 350, 273, -4.6724F, 2.8202F, 38.901F, 1, 1, 1, -0.198F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 350, 275, -4.6724F, 2.8202F, 38.801F, 1, 1, 1, -0.198F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		rails.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}