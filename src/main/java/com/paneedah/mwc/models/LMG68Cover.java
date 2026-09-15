package com.paneedah.mwc.models;

import com.paneedah.weaponlib2.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class LMG68Cover extends ModelWithAttachments {
	private final ModelRenderer cover;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer Rails2;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;

	public LMG68Cover() {
		textureWidth = 416;
		textureHeight = 416;

		cover = new ModelRenderer(this);
		cover.setRotationPoint(-4.3632F, -17.5553F, -23.1631F);
		cover.cubeList.add(new ModelBox(cover, 386, 84, -0.2011F, -1.8617F, -2.8379F, 1, 2, 3, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 64, 377, -0.2011F, -0.8617F, -14.8129F, 1, 1, 5, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 70, 257, -0.1988F, -3.8617F, -4.0129F, 1, 2, 1, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 382, 51, -0.2011F, -2.8617F, -3.2629F, 1, 1, 1, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 282, 392, -0.1998F, -2.8617F, -8.9129F, 1, 3, 1, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 346, 394, -0.1988F, -1.8617F, -9.9129F, 1, 2, 1, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 322, 380, -0.1988F, -3.8617F, -8.0629F, 1, 2, 1, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 374, 313, -0.2011F, -4.442F, -8.1447F, 3, 1, 5, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 332, 53, 2.3989F, -4.467F, -11.8447F, 4, 1, 12, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 392, 205, 5.3989F, -3.467F, -1.8447F, 1, 1, 2, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 382, 154, 2.6282F, -4.4671F, -16.8271F, 2, 1, 4, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 6, 393, 3.2282F, -4.4671F, -12.8271F, 2, 1, 1, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 396, 315, 6.0739F, -3.467F, -3.1447F, 1, 1, 1, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 398, 78, 6.0738F, -3.467F, -3.4447F, 1, 1, 1, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 80, 398, 6.0738F, -3.467F, -8.4447F, 1, 1, 1, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 30, 384, 6.0739F, -3.467F, -12.1447F, 1, 1, 4, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 364, 86, 6.0739F, -4.4677F, -12.1447F, 1, 1, 10, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 398, 80, 6.0732F, -3.4671F, -3.6447F, 1, 1, 1, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 398, 82, 6.0732F, -3.4671F, -8.2447F, 1, 1, 1, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 384, 25, 6.0732F, -4.267F, -7.2447F, 1, 1, 4, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 64, 388, 1.2989F, -4.4598F, -2.8379F, 1, 1, 3, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 394, 349, -0.1988F, -1.8617F, -3.2379F, 1, 2, 1, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 332, 396, 1.2989F, -4.4598F, -3.2379F, 1, 1, 1, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 164, 366, 1.2989F, -4.4598F, -15.8129F, 1, 1, 8, 0.0F, false));
		cover.cubeList.add(new ModelBox(cover, 320, 396, 1.6739F, -4.4598F, -16.8379F, 1, 1, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(4.5884F, -3.5447F, -1.1945F);
		cover.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.2618F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 392, 299, -2.9754F, 0.0F, -1.4867F, 1, 1, 2, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(3.5203F, -3.2447F, -1.7122F);
		cover.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.2618F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 390, 162, -1.0776F, -1.0F, -0.7102F, 2, 1, 2, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(4.4862F, -4.5447F, -1.971F);
		cover.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.2618F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 392, 296, -0.0776F, 1.0F, -0.7102F, 1, 1, 2, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(12.6952F, -1.2698F, -9.9369F);
		cover.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.7854F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 384, 20, -8.8083F, 4.5912F, 2.5F, 1, 1, 4, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 398, 76, -6.687F, 3.4698F, 2.5F, 1, 1, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 76, 398, -6.687F, 3.4698F, 5.5F, 1, 1, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 20, 384, -6.687F, 2.4698F, 2.5F, 1, 1, 4, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(14.1094F, -1.2698F, -10.9369F);
		cover.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, 0.7854F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 294, 392, -8.8083F, 5.5912F, 4.5F, 1, 1, 2, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(3.1003F, -3.9598F, -18.8551F);
		cover.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, -0.3927F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 396, 317, -0.5F, -0.5F, 2.5F, 1, 1, 1, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(1.4527F, -2.639F, -2.9138F);
		cover.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, 0.5236F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 300, 392, -1.0435F, -1.5F, -0.3241F, 1, 3, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 162, 384, -1.0435F, -1.5F, 0.0759F, 1, 3, 3, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(1.7356F, -2.6854F, -0.4888F);
		cover.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, 0.3665F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 278, 366, -1.0435F, -1.5F, -14.3241F, 1, 4, 7, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.7989F, -2.2301F, -8.4727F);
		cover.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.9599F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 278, 389, -0.9998F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 32, 389, -1.0008F, -1.0F, -2.45F, 1, 1, 3, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.7989F, -2.9264F, -3.3042F);
		cover.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.9599F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 392, 366, -0.9998F, -1.0F, -1.15F, 2, 1, 1, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 72, 388, -0.9988F, -1.0F, -1.0F, 1, 1, 3, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(3.01F, -3.9671F, -0.1485F);
		cover.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, -1.0036F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 358, 394, -0.5F, -0.4995F, -4.5F, 1, 2, 1, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(1.8999F, 0.5579F, -3.2886F);
		cover.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.3491F, 0.0F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 392, 202, 5.6F, -5.0249F, -10.2F, 1, 1, 2, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(6.7209F, 0.8578F, 10.158F);
		cover.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.6109F, 0.0F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 244, 392, 5.6F, -5.0249F, -10.2F, 1, 1, 2, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(5.6209F, 0.5579F, -1.342F);
		cover.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.6109F, 0.0F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 194, 392, 5.6F, -5.0245F, -10.2F, 1, 1, 2, 0.0F, false));

		Rails2 = new ModelRenderer(this);
		Rails2.setRotationPoint(2.8395F, -15.5827F, -9.5237F);
		cover.addChild(Rails2);
		Rails2.cubeList.add(new ModelBox(Rails2, 392, 341, -0.9737F, 9.9368F, -6.2132F, 2, 1, 1, -0.199F, false));
		Rails2.cubeList.add(new ModelBox(Rails2, 0, 393, -0.9737F, 9.9368F, -7.4382F, 2, 1, 1, -0.199F, false));
		Rails2.cubeList.add(new ModelBox(Rails2, 392, 343, -0.9737F, 9.9368F, -4.9632F, 2, 1, 1, -0.199F, false));
		Rails2.cubeList.add(new ModelBox(Rails2, 392, 345, -0.9737F, 9.9368F, -3.7132F, 2, 1, 1, -0.199F, false));
		Rails2.cubeList.add(new ModelBox(Rails2, 346, 392, -0.9737F, 9.9368F, -2.4632F, 2, 1, 1, -0.199F, false));
		Rails2.cubeList.add(new ModelBox(Rails2, 392, 347, -0.9737F, 9.9368F, 0.0368F, 2, 1, 1, -0.199F, false));
		Rails2.cubeList.add(new ModelBox(Rails2, 352, 392, -0.9737F, 9.9368F, -1.2132F, 2, 1, 1, -0.199F, false));
		Rails2.cubeList.add(new ModelBox(Rails2, 392, 356, -0.9737F, 9.9368F, 2.5368F, 2, 1, 1, -0.199F, false));
		Rails2.cubeList.add(new ModelBox(Rails2, 358, 392, -0.9737F, 9.9368F, 1.2868F, 2, 1, 1, -0.199F, false));
		Rails2.cubeList.add(new ModelBox(Rails2, 392, 358, -0.9737F, 9.9368F, 5.0368F, 2, 1, 1, -0.199F, false));
		Rails2.cubeList.add(new ModelBox(Rails2, 392, 360, -0.9737F, 9.9368F, 3.7868F, 2, 1, 1, -0.199F, false));
		Rails2.cubeList.add(new ModelBox(Rails2, 392, 362, -0.9737F, 9.9368F, 7.5368F, 2, 1, 1, -0.199F, false));
		Rails2.cubeList.add(new ModelBox(Rails2, 364, 392, -0.9737F, 9.9368F, 8.7368F, 2, 1, 1, -0.198F, false));
		Rails2.cubeList.add(new ModelBox(Rails2, 392, 364, -0.9737F, 9.9368F, 6.2868F, 2, 1, 1, -0.199F, false));
		Rails2.cubeList.add(new ModelBox(Rails2, 308, 214, -0.9753F, 10.4131F, -7.3132F, 2, 1, 17, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-14.7737F, -0.3632F, -12.4632F);
		Rails2.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.8901F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 330, 87, 16.7204F, -4.322F, 6.5F, 1, 1, 16, -0.35F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 392, 168, 16.7204F, -4.322F, 4.8F, 1, 1, 2, -0.35F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 396, 99, 16.7704F, -4.472F, 18.75F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 396, 171, 16.7704F, -4.472F, 21.2F, 1, 1, 1, -0.197F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 396, 173, 16.7704F, -4.472F, 20.0F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 396, 175, 16.7704F, -4.472F, 16.25F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 396, 177, 16.7704F, -4.472F, 17.5F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 396, 179, 16.7704F, -4.472F, 13.75F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 396, 181, 16.7704F, -4.472F, 15.0F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 396, 183, 16.7704F, -4.472F, 11.25F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 396, 214, 16.7704F, -4.472F, 12.5F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 396, 216, 16.7704F, -4.472F, 10.0F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 396, 218, 16.7704F, -4.472F, 8.75F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 396, 220, 16.7704F, -4.472F, 7.5F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 396, 222, 16.7704F, -4.472F, 6.25F, 1, 1, 1, -0.198F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 328, 396, 16.7704F, -4.472F, 5.025F, 1, 1, 1, -0.198F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-13.1737F, -0.3632F, -12.4632F);
		Rails2.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.8901F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 330, 127, -0.0994F, 17.438F, 6.5F, 1, 1, 16, -0.35F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 170, 392, -0.0994F, 17.438F, 4.8F, 1, 1, 2, -0.35F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 396, 228, -0.1494F, 17.288F, 18.75F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 396, 230, -0.1494F, 17.288F, 21.2F, 1, 1, 1, -0.197F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 396, 232, -0.1494F, 17.288F, 20.0F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 396, 234, -0.1494F, 17.288F, 16.25F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 396, 236, -0.1494F, 17.288F, 17.5F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 396, 238, -0.1494F, 17.288F, 13.75F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 396, 240, -0.1494F, 17.288F, 15.0F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 396, 242, -0.1494F, 17.288F, 11.25F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 396, 244, -0.1494F, 17.288F, 12.5F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 396, 246, -0.1494F, 17.288F, 10.0F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 250, 396, -0.1494F, 17.288F, 8.75F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 282, 396, -0.1494F, 17.288F, 7.5F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 298, 396, -0.1494F, 17.288F, 6.25F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 324, 396, -0.1494F, 17.288F, 5.025F, 1, 1, 1, -0.198F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		cover.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}