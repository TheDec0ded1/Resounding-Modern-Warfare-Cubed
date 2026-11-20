package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class SR3M_Suppressor extends ModelBase {
	private final ModelRenderer sr3m_suppressor;
	private final ModelRenderer barrel7;
	private final ModelRenderer bone49;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r132;
	private final ModelRenderer bone50;
	private final ModelRenderer cube_r133;
	private final ModelRenderer cube_r134;
	private final ModelRenderer bone51;
	private final ModelRenderer cube_r135;
	private final ModelRenderer cube_r136;
	private final ModelRenderer cube_r137;
	private final ModelRenderer bone52;
	private final ModelRenderer cube_r138;
	private final ModelRenderer cube_r139;
	private final ModelRenderer barrelouter;
	private final ModelRenderer bone53;
	private final ModelRenderer cube_r140;
	private final ModelRenderer cube_r141;
	private final ModelRenderer bone56;
	private final ModelRenderer cube_r142;
	private final ModelRenderer cube_r143;
	private final ModelRenderer bone57;
	private final ModelRenderer cube_r144;
	private final ModelRenderer cube_r145;
	private final ModelRenderer bone58;
	private final ModelRenderer cube_r146;
	private final ModelRenderer cube_r147;
	private final ModelRenderer barrelouter10;
	private final ModelRenderer bone59;
	private final ModelRenderer cube_r148;
	private final ModelRenderer cube_r149;
	private final ModelRenderer bone60;
	private final ModelRenderer cube_r150;
	private final ModelRenderer cube_r151;
	private final ModelRenderer bone61;
	private final ModelRenderer cube_r152;
	private final ModelRenderer cube_r153;
	private final ModelRenderer bone62;
	private final ModelRenderer cube_r154;
	private final ModelRenderer cube_r155;
	private final ModelRenderer barrelouter11;
	private final ModelRenderer bone63;
	private final ModelRenderer cube_r156;
	private final ModelRenderer cube_r157;
	private final ModelRenderer bone64;
	private final ModelRenderer cube_r158;
	private final ModelRenderer cube_r159;
	private final ModelRenderer bone65;
	private final ModelRenderer cube_r160;
	private final ModelRenderer cube_r161;
	private final ModelRenderer bone66;
	private final ModelRenderer cube_r162;
	private final ModelRenderer cube_r163;
	private final ModelRenderer barrelouter12;
	private final ModelRenderer bone67;
	private final ModelRenderer cube_r164;
	private final ModelRenderer cube_r165;
	private final ModelRenderer bone68;
	private final ModelRenderer cube_r166;
	private final ModelRenderer cube_r167;
	private final ModelRenderer bone69;
	private final ModelRenderer cube_r168;
	private final ModelRenderer cube_r169;
	private final ModelRenderer bone70;
	private final ModelRenderer cube_r170;
	private final ModelRenderer cube_r171;

	public SR3M_Suppressor() {
		textureWidth = 512;
		textureHeight = 512;

		sr3m_suppressor = new ModelRenderer(this);
		sr3m_suppressor.setRotationPoint(-1.0F, -12.8F, -81.5F);
		

		barrel7 = new ModelRenderer(this);
		barrel7.setRotationPoint(1.0F, 36.8F, 85.5F);
		sr3m_suppressor.addChild(barrel7);
		

		bone49 = new ModelRenderer(this);
		bone49.setRotationPoint(-1.5F, -37.8F, -85.5F);
		barrel7.addChild(bone49);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone49.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.4363F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 120, 0.0F, 0.0F, -4.0F, 2, 1, 38, 0.0F, false));

		cube_r132 = new ModelRenderer(this);
		cube_r132.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone49.addChild(cube_r132);
		setRotationAngle(cube_r132, 0.0F, 0.0F, -0.4363F);
		cube_r132.cubeList.add(new ModelBox(cube_r132, 86, 80, -2.0F, 0.0F, -4.0F, 2, 1, 38, 0.0F, false));

		bone50 = new ModelRenderer(this);
		bone50.setRotationPoint(-1.5F, -32.4F, -85.5F);
		barrel7.addChild(bone50);
		

		cube_r133 = new ModelRenderer(this);
		cube_r133.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone50.addChild(cube_r133);
		setRotationAngle(cube_r133, 0.0F, 0.0F, -0.4363F);
		cube_r133.cubeList.add(new ModelBox(cube_r133, 86, 40, 0.0F, -1.0F, -4.0F, 2, 1, 38, 0.0F, false));

		cube_r134 = new ModelRenderer(this);
		cube_r134.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone50.addChild(cube_r134);
		setRotationAngle(cube_r134, 0.0F, 0.0F, 0.4363F);
		cube_r134.cubeList.add(new ModelBox(cube_r134, 86, 0, -2.0F, -1.0F, -4.0F, 2, 1, 38, 0.0F, false));

		bone51 = new ModelRenderer(this);
		bone51.setRotationPoint(1.2F, -35.1F, -85.5F);
		barrel7.addChild(bone51);
		setRotationAngle(bone51, 0.0F, 0.0F, 1.5708F);
		

		cube_r135 = new ModelRenderer(this);
		cube_r135.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone51.addChild(cube_r135);
		setRotationAngle(cube_r135, 0.0F, 0.0F, 0.4363F);
		cube_r135.cubeList.add(new ModelBox(cube_r135, 43, 82, 0.0F, 0.0F, -4.0F, 2, 1, 38, 0.0F, false));

		cube_r136 = new ModelRenderer(this);
		cube_r136.setRotationPoint(0.0F, 70.2F, 0.0F);
		bone51.addChild(cube_r136);
		setRotationAngle(cube_r136, 0.0F, 0.0F, 0.4363F);
		

		cube_r137 = new ModelRenderer(this);
		cube_r137.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone51.addChild(cube_r137);
		setRotationAngle(cube_r137, 0.0F, 0.0F, -0.4363F);
		cube_r137.cubeList.add(new ModelBox(cube_r137, 0, 80, -2.0F, 0.0F, -4.0F, 2, 1, 38, 0.0F, false));

		bone52 = new ModelRenderer(this);
		bone52.setRotationPoint(-4.2F, -35.1F, -85.5F);
		barrel7.addChild(bone52);
		setRotationAngle(bone52, 0.0F, 0.0F, -1.5708F);
		

		cube_r138 = new ModelRenderer(this);
		cube_r138.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone52.addChild(cube_r138);
		setRotationAngle(cube_r138, 0.0F, 0.0F, -0.4363F);
		cube_r138.cubeList.add(new ModelBox(cube_r138, 43, 42, -2.0F, 0.0F, -4.0F, 2, 1, 38, 0.0F, false));

		cube_r139 = new ModelRenderer(this);
		cube_r139.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone52.addChild(cube_r139);
		setRotationAngle(cube_r139, 0.0F, 0.0F, 0.4363F);
		cube_r139.cubeList.add(new ModelBox(cube_r139, 43, 2, 0.0F, 0.0F, -4.0F, 2, 1, 38, 0.0F, false));

		barrelouter = new ModelRenderer(this);
		barrelouter.setRotationPoint(0.0F, 0.0F, 0.0F);
		sr3m_suppressor.addChild(barrelouter);
		

		bone53 = new ModelRenderer(this);
		bone53.setRotationPoint(-0.5F, 4.4F, 0.0F);
		barrelouter.addChild(bone53);
		

		cube_r140 = new ModelRenderer(this);
		cube_r140.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone53.addChild(cube_r140);
		setRotationAngle(cube_r140, 0.0F, 0.0F, -0.4363F);
		cube_r140.cubeList.add(new ModelBox(cube_r140, 172, 25, 0.0F, -2.0F, -6.6F, 2, 2, 2, 0.05F, false));

		cube_r141 = new ModelRenderer(this);
		cube_r141.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone53.addChild(cube_r141);
		setRotationAngle(cube_r141, 0.0F, 0.0F, 0.4363F);
		cube_r141.cubeList.add(new ModelBox(cube_r141, 172, 20, -2.0F, -2.0F, -6.6F, 2, 2, 2, 0.051F, false));

		bone56 = new ModelRenderer(this);
		bone56.setRotationPoint(2.2F, 1.7F, 0.0F);
		barrelouter.addChild(bone56);
		setRotationAngle(bone56, 0.0F, 0.0F, 1.5708F);
		

		cube_r142 = new ModelRenderer(this);
		cube_r142.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone56.addChild(cube_r142);
		setRotationAngle(cube_r142, 0.0F, 0.0F, 0.4363F);
		cube_r142.cubeList.add(new ModelBox(cube_r142, 18, 172, 0.0F, 0.0F, -6.6F, 2, 2, 2, 0.052F, false));

		cube_r143 = new ModelRenderer(this);
		cube_r143.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone56.addChild(cube_r143);
		setRotationAngle(cube_r143, 0.0F, 0.0F, -0.4363F);
		cube_r143.cubeList.add(new ModelBox(cube_r143, 172, 15, -2.0F, 0.0F, -6.6F, 2, 2, 2, 0.05F, false));

		bone57 = new ModelRenderer(this);
		bone57.setRotationPoint(-3.2F, 1.7F, 0.0F);
		barrelouter.addChild(bone57);
		setRotationAngle(bone57, 0.0F, 0.0F, -1.5708F);
		

		cube_r144 = new ModelRenderer(this);
		cube_r144.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone57.addChild(cube_r144);
		setRotationAngle(cube_r144, 0.0F, 0.0F, -0.4363F);
		cube_r144.cubeList.add(new ModelBox(cube_r144, 172, 10, -2.0F, 0.0F, -6.6F, 2, 2, 2, 0.05F, false));

		cube_r145 = new ModelRenderer(this);
		cube_r145.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone57.addChild(cube_r145);
		setRotationAngle(cube_r145, 0.0F, 0.0F, 0.4363F);
		cube_r145.cubeList.add(new ModelBox(cube_r145, 9, 172, 0.0F, 0.0F, -6.6F, 2, 2, 2, 0.052F, false));

		bone58 = new ModelRenderer(this);
		bone58.setRotationPoint(-0.5F, -1.0F, 0.0F);
		barrelouter.addChild(bone58);
		

		cube_r146 = new ModelRenderer(this);
		cube_r146.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone58.addChild(cube_r146);
		setRotationAngle(cube_r146, 0.0F, 0.0F, 0.4363F);
		cube_r146.cubeList.add(new ModelBox(cube_r146, 172, 5, 0.0F, 0.0F, -6.6F, 2, 2, 2, 0.051F, false));

		cube_r147 = new ModelRenderer(this);
		cube_r147.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone58.addChild(cube_r147);
		setRotationAngle(cube_r147, 0.0F, 0.0F, -0.4363F);
		cube_r147.cubeList.add(new ModelBox(cube_r147, 172, 0, -2.0F, 0.0F, -6.6F, 2, 2, 2, 0.05F, false));

		barrelouter10 = new ModelRenderer(this);
		barrelouter10.setRotationPoint(0.0F, 0.0F, 26.0F);
		sr3m_suppressor.addChild(barrelouter10);
		

		bone59 = new ModelRenderer(this);
		bone59.setRotationPoint(-0.5F, 4.4F, 0.0F);
		barrelouter10.addChild(bone59);
		

		cube_r148 = new ModelRenderer(this);
		cube_r148.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone59.addChild(cube_r148);
		setRotationAngle(cube_r148, 0.0F, 0.0F, -0.4363F);
		cube_r148.cubeList.add(new ModelBox(cube_r148, 97, 29, 0.0F, -1.0F, -32.6F, 2, 1, 4, 0.2F, false));

		cube_r149 = new ModelRenderer(this);
		cube_r149.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone59.addChild(cube_r149);
		setRotationAngle(cube_r149, 0.0F, 0.0F, 0.4363F);
		cube_r149.cubeList.add(new ModelBox(cube_r149, 43, 90, -2.0F, -1.0F, -32.6F, 2, 1, 4, 0.2F, false));

		bone60 = new ModelRenderer(this);
		bone60.setRotationPoint(2.2F, 1.7F, 0.0F);
		barrelouter10.addChild(bone60);
		setRotationAngle(bone60, 0.0F, 0.0F, 1.5708F);
		

		cube_r150 = new ModelRenderer(this);
		cube_r150.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone60.addChild(cube_r150);
		setRotationAngle(cube_r150, 0.0F, 0.0F, 0.4363F);
		cube_r150.cubeList.add(new ModelBox(cube_r150, 0, 88, 0.0F, 0.0F, -32.6F, 2, 1, 4, 0.2F, false));

		cube_r151 = new ModelRenderer(this);
		cube_r151.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone60.addChild(cube_r151);
		setRotationAngle(cube_r151, 0.0F, 0.0F, -0.4363F);
		cube_r151.cubeList.add(new ModelBox(cube_r151, 86, 72, -2.0F, 0.0F, -32.6F, 2, 1, 4, 0.2F, false));

		bone61 = new ModelRenderer(this);
		bone61.setRotationPoint(-3.2F, 1.7F, 0.0F);
		barrelouter10.addChild(bone61);
		setRotationAngle(bone61, 0.0F, 0.0F, -1.5708F);
		

		cube_r152 = new ModelRenderer(this);
		cube_r152.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone61.addChild(cube_r152);
		setRotationAngle(cube_r152, 0.0F, 0.0F, -0.4363F);
		cube_r152.cubeList.add(new ModelBox(cube_r152, 43, 66, -2.0F, 0.0F, -32.6F, 2, 1, 4, 0.2F, false));

		cube_r153 = new ModelRenderer(this);
		cube_r153.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone61.addChild(cube_r153);
		setRotationAngle(cube_r153, 0.0F, 0.0F, 0.4363F);
		cube_r153.cubeList.add(new ModelBox(cube_r153, 0, 66, 0.0F, 0.0F, -32.6F, 2, 1, 4, 0.2F, false));

		bone62 = new ModelRenderer(this);
		bone62.setRotationPoint(-0.5F, -1.0F, 0.0F);
		barrelouter10.addChild(bone62);
		

		cube_r154 = new ModelRenderer(this);
		cube_r154.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone62.addChild(cube_r154);
		setRotationAngle(cube_r154, 0.0F, 0.0F, 0.4363F);
		cube_r154.cubeList.add(new ModelBox(cube_r154, 21, 28, 0.0F, 0.0F, -32.6F, 2, 1, 4, 0.2F, false));

		cube_r155 = new ModelRenderer(this);
		cube_r155.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone62.addChild(cube_r155);
		setRotationAngle(cube_r155, 0.0F, 0.0F, -0.4363F);
		cube_r155.cubeList.add(new ModelBox(cube_r155, 21, 10, -2.0F, 0.0F, -32.6F, 2, 1, 4, 0.2F, false));

		barrelouter11 = new ModelRenderer(this);
		barrelouter11.setRotationPoint(0.0F, 0.0F, 42.9F);
		sr3m_suppressor.addChild(barrelouter11);
		

		bone63 = new ModelRenderer(this);
		bone63.setRotationPoint(-0.5F, 4.4F, 0.0F);
		barrelouter11.addChild(bone63);
		

		cube_r156 = new ModelRenderer(this);
		cube_r156.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone63.addChild(cube_r156);
		setRotationAngle(cube_r156, 0.0F, 0.0F, -0.4363F);
		

		cube_r157 = new ModelRenderer(this);
		cube_r157.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone63.addChild(cube_r157);
		setRotationAngle(cube_r157, 0.0F, 0.0F, 0.4363F);
		

		bone64 = new ModelRenderer(this);
		bone64.setRotationPoint(2.2F, 1.7F, 0.0F);
		barrelouter11.addChild(bone64);
		setRotationAngle(bone64, 0.0F, 0.0F, 1.5708F);
		bone64.cubeList.add(new ModelBox(bone64, 57, 148, -0.5F, 0.3F, -9.0F, 1, 1, 2, 0.0F, false));

		cube_r158 = new ModelRenderer(this);
		cube_r158.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone64.addChild(cube_r158);
		setRotationAngle(cube_r158, 0.0F, 0.0F, 0.4363F);
		

		cube_r159 = new ModelRenderer(this);
		cube_r159.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone64.addChild(cube_r159);
		setRotationAngle(cube_r159, 0.0F, 0.0F, -0.4363F);
		

		bone65 = new ModelRenderer(this);
		bone65.setRotationPoint(-3.2F, 1.7F, 0.0F);
		barrelouter11.addChild(bone65);
		setRotationAngle(bone65, 0.0F, 0.0F, -1.5708F);
		

		cube_r160 = new ModelRenderer(this);
		cube_r160.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone65.addChild(cube_r160);
		setRotationAngle(cube_r160, 0.0F, 0.0F, -0.4363F);
		

		cube_r161 = new ModelRenderer(this);
		cube_r161.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone65.addChild(cube_r161);
		setRotationAngle(cube_r161, 0.0F, 0.0F, 0.4363F);
		

		bone66 = new ModelRenderer(this);
		bone66.setRotationPoint(-0.5F, -1.0F, 0.0F);
		barrelouter11.addChild(bone66);
		

		cube_r162 = new ModelRenderer(this);
		cube_r162.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone66.addChild(cube_r162);
		setRotationAngle(cube_r162, 0.0F, 0.0F, 0.4363F);
		

		cube_r163 = new ModelRenderer(this);
		cube_r163.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone66.addChild(cube_r163);
		setRotationAngle(cube_r163, 0.0F, 0.0F, -0.4363F);
		

		barrelouter12 = new ModelRenderer(this);
		barrelouter12.setRotationPoint(0.0F, 0.0F, 4.0F);
		sr3m_suppressor.addChild(barrelouter12);
		

		bone67 = new ModelRenderer(this);
		bone67.setRotationPoint(-0.5F, 4.4F, 0.0F);
		barrelouter12.addChild(bone67);
		

		cube_r164 = new ModelRenderer(this);
		cube_r164.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone67.addChild(cube_r164);
		setRotationAngle(cube_r164, 0.0F, 0.0F, -0.4363F);
		

		cube_r165 = new ModelRenderer(this);
		cube_r165.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone67.addChild(cube_r165);
		setRotationAngle(cube_r165, 0.0F, 0.0F, 0.4363F);
		

		bone68 = new ModelRenderer(this);
		bone68.setRotationPoint(2.2F, 1.7F, 0.0F);
		barrelouter12.addChild(bone68);
		setRotationAngle(bone68, 0.0F, 0.0F, 1.5708F);
		

		cube_r166 = new ModelRenderer(this);
		cube_r166.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone68.addChild(cube_r166);
		setRotationAngle(cube_r166, 0.0F, 0.0F, 0.4363F);
		

		cube_r167 = new ModelRenderer(this);
		cube_r167.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone68.addChild(cube_r167);
		setRotationAngle(cube_r167, 0.0F, 0.0F, -0.4363F);
		

		bone69 = new ModelRenderer(this);
		bone69.setRotationPoint(-3.2F, 1.7F, 0.0F);
		barrelouter12.addChild(bone69);
		setRotationAngle(bone69, 0.0F, 0.0F, -1.5708F);
		

		cube_r168 = new ModelRenderer(this);
		cube_r168.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone69.addChild(cube_r168);
		setRotationAngle(cube_r168, 0.0F, 0.0F, -0.4363F);
		

		cube_r169 = new ModelRenderer(this);
		cube_r169.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone69.addChild(cube_r169);
		setRotationAngle(cube_r169, 0.0F, 0.0F, 0.4363F);
		

		bone70 = new ModelRenderer(this);
		bone70.setRotationPoint(-0.5F, -1.0F, 0.0F);
		barrelouter12.addChild(bone70);
		

		cube_r170 = new ModelRenderer(this);
		cube_r170.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone70.addChild(cube_r170);
		setRotationAngle(cube_r170, 0.0F, 0.0F, 0.4363F);
		

		cube_r171 = new ModelRenderer(this);
		cube_r171.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone70.addChild(cube_r171);
		setRotationAngle(cube_r171, 0.0F, 0.0F, -0.4363F);
		
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		sr3m_suppressor.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}