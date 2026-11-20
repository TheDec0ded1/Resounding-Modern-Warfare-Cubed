package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AEK971Action extends ModelWithAttachments {
	private final ModelRenderer action;
	private final ModelRenderer action7;
	private final ModelRenderer action6;
	private final ModelRenderer action4;
	private final ModelRenderer action5_r1;
	private final ModelRenderer action5;
	private final ModelRenderer action6_r1;
	private final ModelRenderer action2;
	private final ModelRenderer action21;
	private final ModelRenderer action22_r1;
	private final ModelRenderer action23_r1;
	private final ModelRenderer charging_handle;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;

	public AEK971Action() {
		textureWidth = 416;
		textureHeight = 416;

		action = new ModelRenderer(this);
		action.setRotationPoint(-2.0878F, -8.6001F, -26.6574F);
		

		action7 = new ModelRenderer(this);
		action7.setRotationPoint(-0.3121F, -5.8999F, -2.8426F);
		action.addChild(action7);
		setRotationAngle(action7, 0.0F, 0.0F, 0.2974F);
		action7.cubeList.add(new ModelBox(action7, 124, 372, -0.155F, -0.5123F, 0.0F, 1, 2, 13, 0.0F, false));

		action6 = new ModelRenderer(this);
		action6.setRotationPoint(1.4878F, -5.8999F, -2.8426F);
		action.addChild(action6);
		setRotationAngle(action6, 0.0F, 0.0F, -0.2974F);
		action6.cubeList.add(new ModelBox(action6, 372, 145, -0.845F, -0.5123F, 0.0F, 1, 2, 13, 0.0F, false));

		action4 = new ModelRenderer(this);
		action4.setRotationPoint(0.5878F, -6.3999F, -8.8426F);
		action.addChild(action4);
		setRotationAngle(action4, 0.0F, 0.0F, -1.1154F);
		action4.cubeList.add(new ModelBox(action4, 84, 224, -0.5734F, -0.2089F, -17.0F, 1, 1, 36, 0.0F, false));

		action5_r1 = new ModelRenderer(this);
		action5_r1.setRotationPoint(-1.6293F, 2.2394F, 12.0F);
		action4.addChild(action5_r1);
		setRotationAngle(action5_r1, 0.0F, 0.0F, 0.2618F);
		action5_r1.cubeList.add(new ModelBox(action5_r1, 344, 374, -0.4246F, -0.5657F, -6.0F, 1, 1, 13, 0.0F, false));

		action5 = new ModelRenderer(this);
		action5.setRotationPoint(0.5878F, -6.3999F, -8.8426F);
		action.addChild(action5);
		setRotationAngle(action5, 0.0F, 0.0F, 1.1154F);
		action5.cubeList.add(new ModelBox(action5, 252, 216, -0.4266F, -0.2089F, -17.0F, 1, 1, 36, 0.0F, false));

		action6_r1 = new ModelRenderer(this);
		action6_r1.setRotationPoint(1.6293F, 2.2394F, 12.0F);
		action5.addChild(action6_r1);
		setRotationAngle(action6_r1, 0.0F, 0.0F, -0.2618F);
		action6_r1.cubeList.add(new ModelBox(action6_r1, 372, 374, -0.5754F, -0.5657F, -6.0F, 1, 1, 13, 0.0F, false));

		action2 = new ModelRenderer(this);
		action2.setRotationPoint(-1.4122F, -4.3999F, -2.8426F);
		action.addChild(action2);
		action2.cubeList.add(new ModelBox(action2, 0, 358, 0.0F, 0.3F, 0.0F, 4, 1, 13, 0.0F, false));

		action21 = new ModelRenderer(this);
		action21.setRotationPoint(-4.615F, 0.7991F, -1.6021F);
		action.addChild(action21);
		

		action22_r1 = new ModelRenderer(this);
		action22_r1.setRotationPoint(1.7956F, -5.0419F, 0.242F);
		action21.addChild(action22_r1);
		setRotationAngle(action22_r1, 0.0F, 0.0F, 0.1745F);
		action22_r1.cubeList.add(new ModelBox(action22_r1, 270, 88, -0.0428F, -0.2081F, -0.5075F, 3, 1, 1, -0.2F, false));
		action22_r1.cubeList.add(new ModelBox(action22_r1, 172, 45, -0.1428F, -0.2081F, -1.0826F, 3, 1, 1, -0.2F, false));
		action22_r1.cubeList.add(new ModelBox(action22_r1, 400, 231, 0.5572F, -0.2071F, -1.6325F, 2, 1, 1, -0.2F, false));

		action23_r1 = new ModelRenderer(this);
		action23_r1.setRotationPoint(1.7956F, -5.0419F, 0.242F);
		action21.addChild(action23_r1);
		setRotationAngle(action23_r1, 0.0F, 0.4363F, 0.1745F);
		action23_r1.cubeList.add(new ModelBox(action23_r1, 204, 346, 0.1814F, -0.2071F, 0.3006F, 2, 1, 3, -0.2F, false));
		action23_r1.cubeList.add(new ModelBox(action23_r1, 304, 387, -0.5083F, -0.2071F, -1.1783F, 2, 1, 1, -0.2F, false));

		charging_handle = new ModelRenderer(this);
		charging_handle.setRotationPoint(2.0878F, 32.6001F, 30.6574F);
		action.addChild(charging_handle);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-4.9752F, -36.3283F, -32.0174F);
		charging_handle.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 1.1781F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 402, 395, -0.3044F, -0.8812F, -0.9076F, 1, 1, 1, -0.2F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 403, -0.3044F, -0.8812F, -0.5085F, 1, 1, 1, -0.2F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-5.0741F, -36.8246F, -32.0174F);
		charging_handle.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 1.1781F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 30, 402, -0.3044F, -0.8812F, -0.9076F, 1, 1, 1, -0.2F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 26, 402, -0.3044F, -0.8812F, -0.5085F, 1, 1, 1, -0.2F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-4.9072F, -36.8429F, -32.0174F);
		charging_handle.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.1745F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 22, 402, -0.6428F, -0.1071F, -0.7076F, 1, 1, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 396, 401, -0.6428F, -0.4071F, -0.7066F, 1, 1, 1, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-4.9072F, -36.8429F, -32.0174F);
		charging_handle.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, -0.2182F, 0.1745F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 18, 402, -1.5642F, -0.1071F, -0.5754F, 1, 1, 1, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 6, 402, -1.5642F, -0.4071F, -0.5745F, 1, 1, 1, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-4.9072F, -36.8429F, -32.0174F);
		charging_handle.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, -0.48F, 0.1745F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 14, 402, -2.401F, -0.1071F, -0.185F, 1, 1, 1, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 10, 402, -2.401F, -0.4071F, -0.1846F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		action.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}