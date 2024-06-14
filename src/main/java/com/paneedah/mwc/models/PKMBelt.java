package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.10.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class PKMBelt extends ModelWithAttachments {
	private final ModelRenderer belt;
	private final ModelRenderer cartridge;
	private final ModelRenderer cartridge2;
	private final ModelRenderer cartridge3;
	private final ModelRenderer cartridge4;
	private final ModelRenderer cartridge5;
	private final ModelRenderer cartridge6;
	private final ModelRenderer cartridge7;
	private final ModelRenderer cartridge8;
	private final ModelRenderer cartridge9;
	private final ModelRenderer cartridge10;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;

	public PKMBelt() {
		textureWidth = 512;
		textureHeight = 512;

		belt = new ModelRenderer(this);
		belt.setRotationPoint(-10.2F, -3.5F, -29.7F);
		

		cartridge = new ModelRenderer(this);
		cartridge.setRotationPoint(1.2F, -1.5F, 1.7F);
		belt.addChild(cartridge);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		cartridge.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.4363F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 18, 156, -1.0F, -1.0F, 0.8F, 2, 2, 1, -0.4F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 181, 9, -1.0F, -1.0F, -5.8F, 2, 2, 3, -0.8F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 193, 0, -1.0F, -1.0F, -5.0F, 2, 2, 4, -0.7F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 38, 146, -1.0F, -1.0F, -3.7F, 2, 2, 2, -0.5F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 111, 147, -1.0F, -1.0F, -1.7F, 2, 2, 2, -0.5F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 153, 179, -1.0F, -1.0F, -3.0F, 2, 2, 5, -0.6F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-0.8F, 0.1F, -0.6F);
		cartridge.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.4363F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 193, 101, -0.3F, -0.6F, -3.0F, 2, 2, 4, -0.6F, false));

		cartridge2 = new ModelRenderer(this);
		cartridge2.setRotationPoint(1.4F, -3.1F, 1.7F);
		belt.addChild(cartridge2);
		

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		cartridge2.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.4363F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 155, 13, -1.0F, -1.0F, 0.8F, 2, 2, 1, -0.4F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 181, 0, -1.0F, -1.0F, -5.8F, 2, 2, 3, -0.8F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 193, -1.0F, -1.0F, -5.0F, 2, 2, 4, -0.7F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 27, 146, -1.0F, -1.0F, -3.7F, 2, 2, 2, -0.5F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 99, 147, -1.0F, -1.0F, -1.7F, 2, 2, 2, -0.5F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 9, 179, -1.0F, -1.0F, -3.0F, 2, 2, 5, -0.6F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-0.8F, 0.1F, -0.6F);
		cartridge2.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.4363F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 193, 95, -0.1F, -0.7F, -3.0F, 2, 2, 4, -0.6F, false));

		cartridge3 = new ModelRenderer(this);
		cartridge3.setRotationPoint(1.8168F, -4.7115F, 1.7F);
		belt.addChild(cartridge3);
		setRotationAngle(cartridge3, 0.0F, 0.0F, 0.3665F);
		

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		cartridge3.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.4363F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 86, 18, -1.0F, -1.0F, 0.8F, 2, 2, 1, -0.4F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 85, -1.0F, -1.0F, -5.8F, 2, 2, 3, -0.8F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 155, 106, -1.0F, -1.0F, -5.0F, 2, 2, 4, -0.7F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 84, 64, -1.0F, -1.0F, -3.7F, 2, 2, 2, -0.5F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 52, 103, -1.0F, -1.0F, -1.7F, 2, 2, 2, -0.5F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 155, 96, -0.6838F, -0.3551F, -3.6F, 2, 2, 4, -0.6F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 17, 30, -1.0F, -1.0F, -3.0F, 2, 2, 5, -0.6F, false));

		cartridge4 = new ModelRenderer(this);
		cartridge4.setRotationPoint(1.9592F, -6.4778F, 1.7F);
		belt.addChild(cartridge4);
		setRotationAngle(cartridge4, 0.0F, 0.0F, -0.1571F);
		

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		cartridge4.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.4363F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 86, 36, -1.0F, -1.0F, 0.8F, 2, 2, 1, -0.4F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 90, -1.0F, -1.0F, -5.8F, 2, 2, 3, -0.8F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 156, 26, -1.0F, -1.0F, -5.0F, 2, 2, 4, -0.7F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 105, 22, -1.0F, -1.0F, -3.7F, 2, 2, 2, -0.5F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 105, 50, -1.0F, -1.0F, -1.7F, 2, 2, 2, -0.5F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 49, 121, -0.8414F, -0.0834F, -3.6F, 2, 2, 4, -0.6F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 17, 48, -1.0F, -1.0F, -3.0F, 2, 2, 5, -0.6F, false));

		cartridge5 = new ModelRenderer(this);
		cartridge5.setRotationPoint(2.4003F, -8.1676F, 1.7F);
		belt.addChild(cartridge5);
		setRotationAngle(cartridge5, 0.0F, 0.0F, 0.1047F);
		

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
		cartridge5.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 0.4363F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 155, 10, -1.0F, -1.0F, 0.8F, 2, 2, 1, -0.4F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 180, 168, -1.0F, -1.0F, -5.8F, 2, 2, 3, -0.8F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 124, 192, -1.0F, -1.0F, -5.0F, 2, 2, 4, -0.7F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 146, -1.0F, -1.0F, -3.7F, 2, 2, 2, -0.5F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 121, 147, -1.0F, -1.0F, -1.7F, 2, 2, 2, -0.5F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 129, 50, -0.5342F, -0.5023F, -3.6F, 2, 3, 4, -0.6F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 98, 178, -1.0F, -1.0F, -3.0F, 2, 2, 5, -0.6F, false));

		cartridge6 = new ModelRenderer(this);
		cartridge6.setRotationPoint(3.1066F, -10.1044F, 1.7F);
		belt.addChild(cartridge6);
		setRotationAngle(cartridge6, 0.0F, 0.0F, 0.1047F);
		

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
		cartridge6.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.4363F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 124, 115, -1.0F, -1.0F, 0.8F, 2, 2, 1, -0.4F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 111, 64, -1.0F, -1.0F, -5.8F, 2, 2, 3, -0.8F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 192, 61, -1.0F, -1.0F, -5.0F, 2, 2, 4, -0.7F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 124, 0, -1.0F, -1.0F, -3.7F, 2, 2, 2, -0.5F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 124, 4, -1.0F, -1.0F, -1.7F, 2, 2, 2, -0.5F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 130, 120, -0.5342F, -0.5023F, -3.6F, 2, 3, 4, -0.6F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 72, 178, -1.0F, -1.0F, -3.0F, 2, 2, 5, -0.6F, false));

		cartridge7 = new ModelRenderer(this);
		cartridge7.setRotationPoint(4.792F, -10.8322F, 1.7F);
		belt.addChild(cartridge7);
		setRotationAngle(cartridge7, 0.0F, 0.0F, 0.1047F);
		

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
		cartridge7.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, 0.4363F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 124, 45, -1.0F, -1.0F, 0.8F, 2, 2, 1, -0.4F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 109, 93, -1.0F, -1.0F, -5.8F, 2, 2, 3, -0.8F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 49, 183, -1.0F, -1.0F, -5.0F, 2, 2, 4, -0.7F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 21, 123, -1.0F, -1.0F, -3.7F, 2, 2, 2, -0.5F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 124, 32, -1.0F, -1.0F, -1.7F, 2, 2, 2, -0.5F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 129, 18, -1.6342F, -0.5023F, -3.6F, 2, 3, 4, -0.6F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 170, 177, -1.0F, -1.0F, -3.0F, 2, 2, 5, -0.6F, false));

		cartridge8 = new ModelRenderer(this);
		cartridge8.setRotationPoint(6.4826F, -10.6545F, 1.7F);
		belt.addChild(cartridge8);
		setRotationAngle(cartridge8, 0.0F, 0.0F, -0.2443F);
		

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
		cartridge8.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, 0.4363F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 13, 118, -1.0F, -1.0F, 0.8F, 2, 2, 1, -0.4F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 109, 88, -1.0F, -1.0F, -5.8F, 2, 2, 3, -0.8F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 129, 180, -1.0F, -1.0F, -5.0F, 2, 2, 4, -0.7F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 121, 92, -1.0F, -1.0F, -3.7F, 2, 2, 2, -0.5F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 124, 36, -1.0F, -1.0F, -1.7F, 2, 2, 2, -0.5F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 156, 0, -1.7662F, -0.7492F, -3.6F, 2, 2, 4, -0.6F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 144, 177, -1.0F, -1.0F, -3.0F, 2, 2, 5, -0.6F, false));

		cartridge9 = new ModelRenderer(this);
		cartridge9.setRotationPoint(8.6351F, -10.7372F, 1.7F);
		belt.addChild(cartridge9);
		setRotationAngle(cartridge9, 0.0F, 0.0F, -0.4189F);
		

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
		cartridge9.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, 0.4363F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 96, 53, -1.0F, -1.0F, 0.8F, 2, 2, 1, -0.4F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 60, 90, -1.0F, -1.0F, -5.8F, 2, 2, 3, -0.8F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 156, 152, -1.0F, -1.0F, -5.0F, 2, 2, 4, -0.7F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 72, 116, -1.0F, -1.0F, -3.7F, 2, 2, 2, -0.5F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 118, -1.0F, -1.0F, -1.7F, 2, 2, 2, -0.5F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 17, 37, -2.7981F, -0.8861F, -3.6F, 3, 2, 4, -0.6F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 11, 142, -1.0F, -1.0F, -3.0F, 2, 2, 5, -0.6F, false));

		cartridge10 = new ModelRenderer(this);
		cartridge10.setRotationPoint(0.4F, -0.1F, 1.7F);
		belt.addChild(cartridge10);
		

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
		cartridge10.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, 0.4363F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 10, 155, -1.0F, -1.0F, 0.8F, 2, 2, 1, -0.4F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 180, 152, -1.0F, -1.0F, -5.8F, 2, 2, 3, -0.8F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 57, 176, -1.0F, -1.0F, -5.0F, 2, 2, 4, -0.7F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 49, 146, -1.0F, -1.0F, -3.7F, 2, 2, 2, -0.5F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 61, 146, -1.0F, -1.0F, -1.7F, 2, 2, 2, -0.5F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 26, 177, -1.0F, -1.0F, -3.0F, 2, 2, 5, -0.6F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-0.8F, 0.1F, -0.6F);
		cartridge10.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, 0.4363F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 193, 84, -1.0F, -1.0F, -3.0F, 2, 2, 4, -0.6F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		belt.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}