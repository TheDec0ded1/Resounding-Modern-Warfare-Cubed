package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AA12 extends ModelWithAttachments {
	private final ModelRenderer gun;
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
	private final ModelRenderer gas_system;
	private final ModelRenderer gun250_r1;
	private final ModelRenderer gun249_r1;
	private final ModelRenderer gun249_r2;
	private final ModelRenderer gun248_r1;
	private final ModelRenderer gun251_r1;
	private final ModelRenderer gun252_r1;
	private final ModelRenderer gun250_r2;
	private final ModelRenderer gun251_r2;
	private final ModelRenderer gun249_r3;
	private final ModelRenderer gun250_r3;
	private final ModelRenderer gun251_r3;
	private final ModelRenderer gun250_r4;
	private final ModelRenderer gun250_r5;
	private final ModelRenderer gun250_r6;
	private final ModelRenderer gun251_r4;
	private final ModelRenderer gun251_r5;
	private final ModelRenderer gun250_r7;
	private final ModelRenderer gun252_r2;
	private final ModelRenderer gun251_r6;
	private final ModelRenderer gun249_r4;
	private final ModelRenderer gun248_r2;
	private final ModelRenderer gun249_r5;
	private final ModelRenderer gun248_r3;
	private final ModelRenderer gun247_r1;
	private final ModelRenderer gun248_r4;
	private final ModelRenderer gun247_r2;

	public AA12() {
		textureWidth = 512;
		textureHeight = 512;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.0F, 24.0F, 0.0F);
		gun.cubeList.add(new ModelBox(gun, 90, 12, -3.0F, -27.5F, -14.0F, 3, 1, 9, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 13, 109, 0.2F, -42.5F, 28.6F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 68, 22, -4.2F, -42.5F, 28.6F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 124, 0.2F, -43.5F, -56.6F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 104, 53, -4.2F, -43.5F, -56.6F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 78, 50, 0.0F, -41.075F, -29.1F, 1, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 44, 77, -4.0F, -41.075F, -29.1F, 1, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 27, 108, -4.3F, -41.075F, -27.1F, 1, 1, 1, -0.1F, false));
		gun.cubeList.add(new ModelBox(gun, 114, 0, 0.3F, -41.075F, -27.1F, 1, 1, 1, -0.1F, false));
		gun.cubeList.add(new ModelBox(gun, 104, 56, -4.3F, -41.075F, -29.1F, 1, 1, 1, -0.1F, false));
		gun.cubeList.add(new ModelBox(gun, 113, 98, 0.3F, -41.075F, -29.1F, 1, 1, 1, -0.1F, false));
		gun.cubeList.add(new ModelBox(gun, 47, 90, -2.5F, -44.3F, -58.6F, 2, 2, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 106, 16, -1.5431F, -31.5035F, 29.1F, 1, 1, 2, -0.1F, false));
		gun.cubeList.add(new ModelBox(gun, 107, 0, -2.4569F, -31.5035F, 29.1F, 1, 1, 2, -0.1F, false));
		gun.cubeList.add(new ModelBox(gun, 101, 96, -2.0569F, -31.5035F, 29.1F, 1, 1, 2, -0.1F, false));
		gun.cubeList.add(new ModelBox(gun, 16, 0, -4.0F, -44.6F, 29.1F, 5, 9, 2, -0.1F, false));
		gun.cubeList.add(new ModelBox(gun, 101, 38, -3.4343F, -45.1657F, 29.1F, 2, 1, 2, -0.1F, false));
		gun.cubeList.add(new ModelBox(gun, 21, 77, -2.5657F, -45.1657F, 29.1F, 3, 1, 2, -0.1F, false));
		gun.cubeList.add(new ModelBox(gun, 90, 68, -4.0F, -44.6F, -57.3F, 5, 6, 2, -0.1F, false));
		gun.cubeList.add(new ModelBox(gun, 101, 34, -3.4343F, -45.1657F, -57.3F, 2, 1, 2, -0.1F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 77, -2.5657F, -45.1657F, -57.3F, 3, 1, 2, -0.1F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 97, -3.4343F, -39.0343F, -57.3F, 2, 1, 2, -0.1F, false));
		gun.cubeList.add(new ModelBox(gun, 75, 76, -2.5657F, -39.0343F, -57.3F, 3, 1, 2, -0.1F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.2012F, -35.1645F, -111.8F);
		gun.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 7, 71, -0.5F, -5.5F, 54.5F, 1, 1, 2, -0.1F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.3343F, -38.7F, -111.8F);
		gun.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.7854F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 68, 28, -0.5F, -0.5F, 54.5F, 1, 1, 2, -0.1F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.3343F, -44.5F, -111.8F);
		gun.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.7854F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 101, 92, -0.5F, -0.5F, 54.5F, 1, 1, 2, -0.1F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 109, -0.5F, -0.5F, 140.9F, 1, 1, 2, -0.1F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.2012F, -40.9645F, -111.8F);
		gun.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.7854F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 101, 45, -0.5F, -5.5F, 54.5F, 1, 1, 2, -0.1F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 104, 108, -0.5F, -5.5F, 140.9F, 1, 1, 2, -0.1F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-0.5221F, -30.663F, 30.1F);
		gun.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -1.0908F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 107, 4, -1.0F, -2.5F, -1.0F, 1, 1, 2, -0.1F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-2.4779F, -30.663F, 30.1F);
		gun.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 1.0908F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 105, 0.0F, -2.5F, -1.0F, 1, 1, 2, -0.1F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-0.4031F, -33.4927F, 30.1F);
		gun.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 0.1745F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 36, -2.0F, -2.5F, -1.0F, 3, 5, 2, -0.1F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-2.5969F, -33.4927F, 30.1F);
		gun.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.1745F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 18, -1.0F, -2.5F, -1.0F, 3, 5, 2, -0.1F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-1.5F, -26.5F, -14.75F);
		gun.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.0873F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 90, 92, -2.0F, -10.0F, 0.0F, 4, 23, 1, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-1.0F, -16.825F, -7.0F);
		gun.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.2182F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 126, 126, -2.0F, 0.5F, -8.55F, 3, 1, 17, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-1.5F, -31.4049F, -7.6107F);
		gun.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.3491F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 66, 11, -0.5F, -1.2278F, -0.3608F, 1, 2, 1, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-1.5F, -31.4049F, -7.6107F);
		gun.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0873F, 0.0F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 5, 124, -0.5F, 0.5805F, -0.1827F, 1, 1, 1, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-1.5F, -30.813F, -7.0763F);
		gun.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.5236F, 0.0F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 28, 71, -0.5F, 0.5805F, -0.1827F, 1, 2, 1, 0.0F, false));

		gas_system = new ModelRenderer(this);
		gas_system.setRotationPoint(-2.0F, -39.0F, -61.0F);
		gun.addChild(gas_system);
		gas_system.cubeList.add(new ModelBox(gas_system, 145, 184, -0.5F, -3.0F, -13.1F, 2, 1, 50, -0.3F, false));
		gas_system.cubeList.add(new ModelBox(gas_system, 90, 182, -0.5F, -0.0201F, -13.1F, 2, 1, 50, -0.3F, false));
		gas_system.cubeList.add(new ModelBox(gas_system, 235, 108, 1.49F, -2.0101F, -13.1F, 1, 2, 50, -0.3F, false));
		gas_system.cubeList.add(new ModelBox(gas_system, 235, 55, -1.4899F, -2.01F, -13.1F, 1, 2, 50, -0.3F, false));

		gun250_r1 = new ModelRenderer(this);
		gun250_r1.setRotationPoint(0.9F, 3.9657F, 12.5F);
		gas_system.addChild(gun250_r1);
		setRotationAngle(gun250_r1, 0.0F, 0.0F, -0.7854F);
		

		gun249_r1 = new ModelRenderer(this);
		gun249_r1.setRotationPoint(0.1F, 3.9657F, 12.5F);
		gas_system.addChild(gun249_r1);
		setRotationAngle(gun249_r1, 0.0F, 0.0F, -0.7854F);
		

		gun249_r2 = new ModelRenderer(this);
		gun249_r2.setRotationPoint(0.9F, 3.1657F, 12.5F);
		gas_system.addChild(gun249_r2);
		setRotationAngle(gun249_r2, 0.0F, 0.0F, -0.7854F);
		

		gun248_r1 = new ModelRenderer(this);
		gun248_r1.setRotationPoint(0.1F, 3.1657F, 12.5F);
		gas_system.addChild(gun248_r1);
		setRotationAngle(gun248_r1, 0.0F, 0.0F, -0.7854F);
		

		gun251_r1 = new ModelRenderer(this);
		gun251_r1.setRotationPoint(0.6918F, 0.6703F, -1.1F);
		gas_system.addChild(gun251_r1);
		setRotationAngle(gun251_r1, 0.0F, 0.0F, -1.1781F);
		

		gun252_r1 = new ModelRenderer(this);
		gun252_r1.setRotationPoint(-0.8453F, -0.024F, -1.1F);
		gas_system.addChild(gun252_r1);
		setRotationAngle(gun252_r1, 0.0F, 0.0F, -1.1781F);
		

		gun250_r2 = new ModelRenderer(this);
		gun250_r2.setRotationPoint(0.6909F, 1.6715F, -1.1F);
		gas_system.addChild(gun250_r2);
		setRotationAngle(gun250_r2, 0.0F, 0.0F, -1.1781F);
		

		gun251_r2 = new ModelRenderer(this);
		gun251_r2.setRotationPoint(1.4626F, 0.518F, -1.1F);
		gas_system.addChild(gun251_r2);
		setRotationAngle(gun251_r2, 0.0F, 0.0F, -1.1781F);
		

		gun249_r3 = new ModelRenderer(this);
		gun249_r3.setRotationPoint(0.3082F, 0.6703F, -1.1F);
		gas_system.addChild(gun249_r3);
		setRotationAngle(gun249_r3, 0.0F, 0.0F, -0.3927F);
		

		gun250_r3 = new ModelRenderer(this);
		gun250_r3.setRotationPoint(0.5387F, 0.5172F, -1.1F);
		gas_system.addChild(gun250_r3);
		setRotationAngle(gun250_r3, 0.0F, 0.0F, -0.3927F);
		

		gun251_r3 = new ModelRenderer(this);
		gun251_r3.setRotationPoint(0.6918F, 0.7476F, -1.1F);
		gas_system.addChild(gun251_r3);
		setRotationAngle(gun251_r3, 0.0F, 0.0F, -0.3927F);
		

		gun250_r4 = new ModelRenderer(this);
		gun250_r4.setRotationPoint(0.4613F, 0.9007F, -1.1F);
		gas_system.addChild(gun250_r4);
		setRotationAngle(gun250_r4, 0.0F, 0.0F, -0.3927F);
		

		gun250_r5 = new ModelRenderer(this);
		gun250_r5.setRotationPoint(0.4613F, 3.7757F, -27.7F);
		gas_system.addChild(gun250_r5);
		setRotationAngle(gun250_r5, 0.0F, 0.0F, -0.3927F);
		

		gun250_r6 = new ModelRenderer(this);
		gun250_r6.setRotationPoint(0.6909F, 4.5465F, -27.7F);
		gas_system.addChild(gun250_r6);
		setRotationAngle(gun250_r6, 0.0F, 0.0F, -1.1781F);
		

		gun251_r4 = new ModelRenderer(this);
		gun251_r4.setRotationPoint(0.6918F, 3.6226F, -27.7F);
		gas_system.addChild(gun251_r4);
		setRotationAngle(gun251_r4, 0.0F, 0.0F, -0.3927F);
		

		gun251_r5 = new ModelRenderer(this);
		gun251_r5.setRotationPoint(1.4626F, 3.393F, -27.7F);
		gas_system.addChild(gun251_r5);
		setRotationAngle(gun251_r5, 0.0F, 0.0F, -1.1781F);
		

		gun250_r7 = new ModelRenderer(this);
		gun250_r7.setRotationPoint(0.5387F, 3.3922F, -27.7F);
		gas_system.addChild(gun250_r7);
		setRotationAngle(gun250_r7, 0.0F, 0.0F, -0.3927F);
		

		gun252_r2 = new ModelRenderer(this);
		gun252_r2.setRotationPoint(-0.8453F, 2.851F, -27.7F);
		gas_system.addChild(gun252_r2);
		setRotationAngle(gun252_r2, 0.0F, 0.0F, -1.1781F);
		

		gun251_r6 = new ModelRenderer(this);
		gun251_r6.setRotationPoint(0.6918F, 3.5453F, -27.7F);
		gas_system.addChild(gun251_r6);
		setRotationAngle(gun251_r6, 0.0F, 0.0F, -1.1781F);
		

		gun249_r4 = new ModelRenderer(this);
		gun249_r4.setRotationPoint(0.3082F, 3.5453F, -27.7F);
		gas_system.addChild(gun249_r4);
		setRotationAngle(gun249_r4, 0.0F, 0.0F, -0.3927F);
		

		gun248_r2 = new ModelRenderer(this);
		gun248_r2.setRotationPoint(0.0F, 1.2071F, 8.4F);
		gas_system.addChild(gun248_r2);
		setRotationAngle(gun248_r2, 0.0F, 0.0F, -0.7854F);
		gun248_r2.cubeList.add(new ModelBox(gun248_r2, 235, 2, -0.0686F, -2.2142F, -21.5F, 1, 2, 50, -0.3F, false));

		gun249_r5 = new ModelRenderer(this);
		gun249_r5.setRotationPoint(1.0F, 1.2071F, 8.4F);
		gas_system.addChild(gun249_r5);
		setRotationAngle(gun249_r5, 0.0F, 0.0F, -0.7854F);
		gun249_r5.cubeList.add(new ModelBox(gun249_r5, 180, 92, 0.2142F, -0.9314F, -21.5F, 2, 1, 50, -0.3F, false));

		gun248_r3 = new ModelRenderer(this);
		gun248_r3.setRotationPoint(1.0F, 0.2071F, 8.4F);
		gas_system.addChild(gun248_r3);
		setRotationAngle(gun248_r3, 0.0F, 0.0F, -0.7854F);
		gun248_r3.cubeList.add(new ModelBox(gun248_r3, 200, 186, 1.4971F, -2.2142F, -21.5F, 1, 2, 50, -0.3F, false));

		gun247_r1 = new ModelRenderer(this);
		gun247_r1.setRotationPoint(0.0F, 0.2071F, 8.4F);
		gas_system.addChild(gun247_r1);
		setRotationAngle(gun247_r1, 0.0F, 0.0F, -0.7854F);
		gun247_r1.cubeList.add(new ModelBox(gun247_r1, 180, 0, 0.2142F, -2.497F, -21.5F, 2, 1, 50, -0.3F, false));

		gun248_r4 = new ModelRenderer(this);
		gun248_r4.setRotationPoint(0.5F, 2.1F, -1.75F);
		gas_system.addChild(gun248_r4);
		setRotationAngle(gun248_r4, -0.2618F, 0.0F, 0.0F);
		

		gun247_r2 = new ModelRenderer(this);
		gun247_r2.setRotationPoint(0.5F, 2.1F, -2.75F);
		gas_system.addChild(gun247_r2);
		setRotationAngle(gun247_r2, -0.2618F, 0.0F, 0.0F);
		
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		gun.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}