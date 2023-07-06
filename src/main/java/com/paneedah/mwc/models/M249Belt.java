package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M249Belt extends ModelWithAttachments {
	private final ModelRenderer belt;
	private final ModelRenderer Belt10;
	private final ModelRenderer Belt9;
	private final ModelRenderer Belt11_r1;
	private final ModelRenderer Belt8;
	private final ModelRenderer Belt7;
	private final ModelRenderer Belt6;
	private final ModelRenderer Belt5;
	private final ModelRenderer Belt4;
	private final ModelRenderer Belt3;
	private final ModelRenderer Belt2;
	private final ModelRenderer Belt1;

	public M249Belt() {
		textureWidth = 350;
		textureHeight = 350;

		belt = new ModelRenderer(this);
		belt.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		Belt10 = new ModelRenderer(this);
		Belt10.setRotationPoint(7.6F, -37.3F, 43.5F);
		belt.addChild(Belt10);
		Belt10.cubeList.add(new ModelBox(Belt10, 118, 108, -8.889F, -4.1407F, -67.0F, 1, 1, 5, 0.0F, false));
		Belt10.cubeList.add(new ModelBox(Belt10, 93, 87, -8.889F, -4.1407F, -68.9F, 1, 1, 2, -0.1F, false));
		Belt10.cubeList.add(new ModelBox(Belt10, 87, 103, -8.889F, -4.1407F, -66.0F, 1, 1, 3, 0.1F, false));

		Belt9 = new ModelRenderer(this);
		Belt9.setRotationPoint(2.2F, -31.7F, 43.5F);
		belt.addChild(Belt9);
		Belt9.cubeList.add(new ModelBox(Belt9, 84, 119, -2.0F, -9.6F, -67.0F, 1, 1, 5, 0.0F, false));
		Belt9.cubeList.add(new ModelBox(Belt9, 93, 84, -2.0F, -9.6F, -68.9F, 1, 1, 2, -0.1F, false));
		Belt9.cubeList.add(new ModelBox(Belt9, 103, 89, -2.0F, -9.6F, -66.0F, 1, 1, 3, 0.1F, false));

		Belt11_r1 = new ModelRenderer(this);
		Belt11_r1.setRotationPoint(-4.2F, 22.1F, -112.5F);
		Belt9.addChild(Belt11_r1);
		setRotationAngle(Belt11_r1, 0.0F, 0.0F, -0.2269F);
		Belt11_r1.cubeList.add(new ModelBox(Belt11_r1, 34, 91, 8.0F, -30.4F, 46.5F, 2, 1, 3, -0.2F, false));

		Belt8 = new ModelRenderer(this);
		Belt8.setRotationPoint(4.8F, -31.6F, 43.5F);
		belt.addChild(Belt8);
		setRotationAngle(Belt8, 0.0F, 0.0F, 1.673F);
		Belt8.cubeList.add(new ModelBox(Belt8, 15, 121, -9.3457F, 2.9694F, -67.0F, 1, 1, 5, 0.0F, false));
		Belt8.cubeList.add(new ModelBox(Belt8, 24, 86, -9.3457F, 2.9694F, -68.9F, 1, 1, 2, -0.1F, false));
		Belt8.cubeList.add(new ModelBox(Belt8, 60, 103, -9.3457F, 2.9694F, -66.0F, 1, 1, 3, 0.1F, false));
		Belt8.cubeList.add(new ModelBox(Belt8, 71, 69, -9.3457F, 2.9694F, -66.0F, 1, 2, 3, -0.2F, false));

		Belt7 = new ModelRenderer(this);
		Belt7.setRotationPoint(6.3F, -30.9F, 43.5F);
		belt.addChild(Belt7);
		setRotationAngle(Belt7, 0.0F, 0.0F, 2.1564F);
		Belt7.cubeList.add(new ModelBox(Belt7, 122, 124, -6.8953F, 6.9724F, -67.0F, 1, 1, 5, 0.0F, false));
		Belt7.cubeList.add(new ModelBox(Belt7, 78, 46, -6.8953F, 6.9724F, -68.9F, 1, 1, 2, -0.1F, false));
		Belt7.cubeList.add(new ModelBox(Belt7, 50, 103, -6.8953F, 6.9724F, -66.0F, 1, 1, 3, 0.1F, false));

		Belt6 = new ModelRenderer(this);
		Belt6.setRotationPoint(7.3F, -30.0F, 43.5F);
		belt.addChild(Belt6);
		setRotationAngle(Belt6, 0.0F, 0.0F, 2.1564F);
		Belt6.cubeList.add(new ModelBox(Belt6, 71, 126, -6.8953F, 6.9724F, -67.0F, 1, 1, 5, 0.0F, false));
		Belt6.cubeList.add(new ModelBox(Belt6, 78, 23, -6.8953F, 6.9724F, -68.9F, 1, 1, 2, -0.1F, false));
		Belt6.cubeList.add(new ModelBox(Belt6, 98, 12, -6.8953F, 6.9724F, -66.0F, 1, 1, 3, 0.1F, false));
		Belt6.cubeList.add(new ModelBox(Belt6, 24, 23, -6.8953F, 6.9724F, -66.0F, 1, 3, 3, -0.2F, false));

		Belt5 = new ModelRenderer(this);
		Belt5.setRotationPoint(8.3F, -28.5F, 43.5F);
		belt.addChild(Belt5);
		setRotationAngle(Belt5, 0.0F, 0.0F, 2.6025F);
		Belt5.cubeList.add(new ModelBox(Belt5, 83, 126, -3.2119F, 9.2652F, -67.0F, 1, 1, 5, 0.0F, false));
		Belt5.cubeList.add(new ModelBox(Belt5, 78, 5, -3.2119F, 9.2652F, -68.9F, 1, 1, 2, -0.1F, false));
		Belt5.cubeList.add(new ModelBox(Belt5, 98, 8, -3.2119F, 9.2652F, -66.0F, 1, 1, 3, 0.1F, false));

		Belt4 = new ModelRenderer(this);
		Belt4.setRotationPoint(9.0F, -27.0F, 43.5F);
		belt.addChild(Belt4);
		setRotationAngle(Belt4, 0.0F, 0.0F, 2.6025F);
		Belt4.cubeList.add(new ModelBox(Belt4, 95, 126, -3.2119F, 9.2652F, -67.0F, 1, 1, 5, 0.0F, false));
		Belt4.cubeList.add(new ModelBox(Belt4, 71, 74, -3.2119F, 9.2652F, -68.9F, 1, 1, 2, -0.1F, false));
		Belt4.cubeList.add(new ModelBox(Belt4, 97, 42, -3.2119F, 9.2652F, -66.0F, 1, 1, 3, 0.1F, false));
		Belt4.cubeList.add(new ModelBox(Belt4, 12, 0, -3.2119F, 9.2652F, -66.0F, 1, 4, 3, -0.2F, false));

		Belt3 = new ModelRenderer(this);
		Belt3.setRotationPoint(9.5F, -25.5F, 43.5F);
		belt.addChild(Belt3);
		setRotationAngle(Belt3, 0.0F, 0.0F, 2.7884F);
		Belt3.cubeList.add(new ModelBox(Belt3, 107, 126, -1.4441F, 9.6992F, -67.0F, 1, 1, 5, 0.0F, false));
		Belt3.cubeList.add(new ModelBox(Belt3, 62, 54, -1.4441F, 9.6992F, -68.9F, 1, 1, 2, -0.1F, false));
		Belt3.cubeList.add(new ModelBox(Belt3, 97, 20, -1.4441F, 9.6992F, -66.0F, 1, 1, 3, 0.1F, false));

		Belt2 = new ModelRenderer(this);
		Belt2.setRotationPoint(10.0F, -24.0F, 43.5F);
		belt.addChild(Belt2);
		setRotationAngle(Belt2, 0.0F, 0.0F, 2.6769F);
		Belt2.cubeList.add(new ModelBox(Belt2, 36, 131, -2.5147F, 9.4782F, -67.0F, 1, 1, 5, 0.0F, false));
		Belt2.cubeList.add(new ModelBox(Belt2, 54, 40, -2.5147F, 9.4782F, -68.9F, 1, 1, 2, -0.1F, false));
		Belt2.cubeList.add(new ModelBox(Belt2, 97, 16, -2.5147F, 9.4782F, -66.0F, 1, 1, 3, 0.1F, false));

		Belt1 = new ModelRenderer(this);
		Belt1.setRotationPoint(10.5F, -22.5F, 43.5F);
		belt.addChild(Belt1);
		setRotationAngle(Belt1, 0.0F, 0.0F, 2.7884F);
		Belt1.cubeList.add(new ModelBox(Belt1, 136, 110, -1.4441F, 9.6992F, -67.0F, 1, 1, 5, 0.0F, false));
		Belt1.cubeList.add(new ModelBox(Belt1, 35, 40, -1.4441F, 9.6992F, -68.9F, 1, 1, 2, -0.1F, false));
		Belt1.cubeList.add(new ModelBox(Belt1, 25, 63, -1.4441F, 9.6992F, -66.0F, 1, 1, 3, 0.1F, false));
		Belt1.cubeList.add(new ModelBox(Belt1, 0, 0, -1.4441F, 8.4992F, -66.0F, 1, 6, 3, -0.2F, false));
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