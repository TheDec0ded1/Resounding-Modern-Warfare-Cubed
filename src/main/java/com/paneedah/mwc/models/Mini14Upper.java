package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Mini14Upper extends ModelBase {
	private final ModelRenderer standard_cover;
	private final ModelRenderer standard_cover_r1;
	private final ModelRenderer gun203;
	private final ModelRenderer gun164;
	private final ModelRenderer gun163;
	private final ModelRenderer gun162;
	private final ModelRenderer gun161;
	private final ModelRenderer gun160;
	private final ModelRenderer gun159;
	private final ModelRenderer gun156;
	private final ModelRenderer gun154;
	private final ModelRenderer gun153;
	private final ModelRenderer gun152;
	private final ModelRenderer gun155_r1;
	private final ModelRenderer gun151;
	private final ModelRenderer gun149;
	private final ModelRenderer gun148;
	private final ModelRenderer gun147;
	private final ModelRenderer gun146;
	private final ModelRenderer gun145;
	private final ModelRenderer gun144;
	private final ModelRenderer gun143;
	private final ModelRenderer gun142;
	private final ModelRenderer gun141;
	private final ModelRenderer gun140;
	private final ModelRenderer gun139;
	private final ModelRenderer gun138;
	private final ModelRenderer gun137;
	private final ModelRenderer gun136;
	private final ModelRenderer gun135;
	private final ModelRenderer gun134;
	private final ModelRenderer gun133;
	private final ModelRenderer gun124;
	private final ModelRenderer gun123;

	public Mini14Upper() {
		textureWidth = 340;
		textureHeight = 340;

		standard_cover = new ModelRenderer(this);
		standard_cover.setRotationPoint(0.0F, 24.0F, 6.0F);
		standard_cover.cubeList.add(new ModelBox(standard_cover, 232, 251, -2.5F, -40.5F, -72.5F, 2, 1, 25, 0.0F, false));
		standard_cover.cubeList.add(new ModelBox(standard_cover, 256, 275, -2.5F, -40.5F, -73.0F, 2, 1, 1, 0.0F, false));
		standard_cover.cubeList.add(new ModelBox(standard_cover, 61, 271, -3.8F, -38.2F, -73.0F, 1, 1, 13, 0.0F, false));
		standard_cover.cubeList.add(new ModelBox(standard_cover, 61, 271, -3.8F, -37.2F, -73.0F, 1, 1, 13, 0.0F, false));
		standard_cover.cubeList.add(new ModelBox(standard_cover, 61, 271, -4.8321F, -38.9F, -59.4F, 1, 1, 13, 0.0F, false));
		standard_cover.cubeList.add(new ModelBox(standard_cover, 61, 271, -4.8321F, -37.9F, -59.4F, 1, 1, 13, 0.0F, false));
		standard_cover.cubeList.add(new ModelBox(standard_cover, 66, 276, -4.8321F, -38.9F, -47.0F, 1, 1, 8, 0.0F, false));
		standard_cover.cubeList.add(new ModelBox(standard_cover, 66, 276, -4.8321F, -37.9F, -47.0F, 1, 1, 8, 0.0F, false));
		standard_cover.cubeList.add(new ModelBox(standard_cover, 54, 192, -0.2F, -38.2F, -73.0F, 1, 1, 34, 0.0F, false));
		standard_cover.cubeList.add(new ModelBox(standard_cover, 54, 192, -0.2F, -37.2F, -73.0F, 1, 1, 34, 0.0F, false));
		standard_cover.cubeList.add(new ModelBox(standard_cover, 60, 214, -2.5F, -40.5F, -50.0F, 2, 1, 11, 0.0F, false));

		standard_cover_r1 = new ModelRenderer(this);
		standard_cover_r1.setRotationPoint(-6.7471F, -37.9F, -57.717F);
		standard_cover.addChild(standard_cover_r1);
		setRotationAngle(standard_cover_r1, 0.0F, -1.0472F, 0.0F);
		standard_cover_r1.cubeList.add(new ModelBox(standard_cover_r1, 72, 282, -0.5F, -1.0F, -4.5F, 1, 1, 2, 0.0F, false));
		standard_cover_r1.cubeList.add(new ModelBox(standard_cover_r1, 72, 282, -0.5F, 0.0F, -4.5F, 1, 1, 2, 0.0F, false));

		gun203 = new ModelRenderer(this);
		gun203.setRotationPoint(-2.3F, -40.4F, -79.5F);
		standard_cover.addChild(gun203);
		setRotationAngle(gun203, 0.0F, 0.0F, 1.083F);
		

		gun164 = new ModelRenderer(this);
		gun164.setRotationPoint(0.9F, -38.3F, -43.0F);
		standard_cover.addChild(gun164);
		setRotationAngle(gun164, 0.0F, 0.0F, 2.88F);
		

		gun163 = new ModelRenderer(this);
		gun163.setRotationPoint(0.25F, -40.0F, -43.0F);
		standard_cover.addChild(gun163);
		setRotationAngle(gun163, 0.0F, 0.0F, 1.122F);
		

		gun162 = new ModelRenderer(this);
		gun162.setRotationPoint(-0.5F, -40.7F, -43.0F);
		standard_cover.addChild(gun162);
		setRotationAngle(gun162, 0.0F, 0.0F, 0.748F);
		

		gun161 = new ModelRenderer(this);
		gun161.setRotationPoint(-2.5F, -40.7F, -43.0F);
		standard_cover.addChild(gun161);
		

		gun160 = new ModelRenderer(this);
		gun160.setRotationPoint(-2.5F, -40.7F, -43.0F);
		standard_cover.addChild(gun160);
		setRotationAngle(gun160, 0.0F, 0.0F, 0.8228F);
		

		gun159 = new ModelRenderer(this);
		gun159.setRotationPoint(-3.2F, -40.0F, -43.0F);
		standard_cover.addChild(gun159);
		setRotationAngle(gun159, 0.0F, 0.0F, 0.4114F);
		gun159.cubeList.add(new ModelBox(gun159, 113, 107, 0.1F, 0.1F, 0.0F, 1, 1, 2, 0.0F, false));

		gun156 = new ModelRenderer(this);
		gun156.setRotationPoint(-3.2F, -39.9F, -46.0F);
		standard_cover.addChild(gun156);
		setRotationAngle(gun156, 0.0F, 0.0F, 0.4114F);
		gun156.cubeList.add(new ModelBox(gun156, 102, 75, 0.1F, 0.0F, 0.0F, 1, 1, 7, 0.0F, false));

		gun154 = new ModelRenderer(this);
		gun154.setRotationPoint(-0.65F, -40.4F, -79.5F);
		standard_cover.addChild(gun154);
		setRotationAngle(gun154, 0.0F, 0.0F, 0.561F);
		

		gun153 = new ModelRenderer(this);
		gun153.setRotationPoint(-0.5F, -40.6F, -77.5F);
		standard_cover.addChild(gun153);
		setRotationAngle(gun153, 0.0F, 0.0F, 0.748F);
		

		gun152 = new ModelRenderer(this);
		gun152.setRotationPoint(-2.45F, -40.5F, -76.5F);
		standard_cover.addChild(gun152);
		setRotationAngle(gun152, 0.0F, 0.0F, 0.8228F);
		gun152.cubeList.add(new ModelBox(gun152, 174, 248, 0.0F, 0.0F, 17.0F, 1, 1, 11, 0.0F, false));
		gun152.cubeList.add(new ModelBox(gun152, 184, 258, 0.0F, 0.0F, 16.5F, 1, 1, 1, 0.0F, false));
		gun152.cubeList.add(new ModelBox(gun152, 183, 257, 0.0F, 0.0F, 12.5F, 1, 1, 2, 0.0F, false));
		gun152.cubeList.add(new ModelBox(gun152, 183, 257, 0.0F, 0.0F, 4.5F, 1, 1, 2, 0.0F, false));
		gun152.cubeList.add(new ModelBox(gun152, 183, 257, 0.0F, 0.0F, 8.5F, 1, 1, 2, 0.0F, false));
		gun152.cubeList.add(new ModelBox(gun152, 184, 258, 0.0F, 0.0F, 3.5F, 1, 1, 1, 0.0F, false));

		gun155_r1 = new ModelRenderer(this);
		gun155_r1.setRotationPoint(2.2544F, 1.4556F, 27.5F);
		gun152.addChild(gun155_r1);
		setRotationAngle(gun155_r1, 0.0F, 0.0F, 0.1745F);
		gun155_r1.cubeList.add(new ModelBox(gun155_r1, 165, 239, -2.5F, 0.8F, -10.0F, 1, 1, 20, 0.0F, false));
		gun155_r1.cubeList.add(new ModelBox(gun155_r1, 165, 239, -2.5F, 0.0F, -10.0F, 1, 1, 20, 0.0F, false));
		gun155_r1.cubeList.add(new ModelBox(gun155_r1, 165, 239, -2.5F, -1.0F, -10.0F, 1, 1, 20, 0.0F, false));

		gun151 = new ModelRenderer(this);
		gun151.setRotationPoint(-2.5F, -40.6F, -77.5F);
		standard_cover.addChild(gun151);
		setRotationAngle(gun151, 0.0F, 0.0F, 0.8228F);
		

		gun149 = new ModelRenderer(this);
		gun149.setRotationPoint(-3.1F, -39.9F, -82.0F);
		standard_cover.addChild(gun149);
		setRotationAngle(gun149, 0.0F, 0.0F, 0.4114F);
		gun149.cubeList.add(new ModelBox(gun149, 200, 205, 0.0F, 0.0F, 22.0F, 1, 1, 17, 0.0F, false));
		gun149.cubeList.add(new ModelBox(gun149, 215, 220, 0.0F, 0.0F, 18.0F, 1, 1, 2, 0.0F, false));
		gun149.cubeList.add(new ModelBox(gun149, 215, 220, 0.0F, 0.0F, 10.0F, 1, 1, 2, 0.0F, false));
		gun149.cubeList.add(new ModelBox(gun149, 215, 220, 0.0F, 0.0F, 14.0F, 1, 1, 2, 0.0F, false));

		gun148 = new ModelRenderer(this);
		gun148.setRotationPoint(-3.2F, -39.9F, -82.0F);
		standard_cover.addChild(gun148);
		setRotationAngle(gun148, 0.0F, 0.0F, 0.4114F);
		gun148.cubeList.add(new ModelBox(gun148, 116, 38, 0.0F, 0.0F, 9.0F, 1, 1, 1, 0.0F, false));

		gun147 = new ModelRenderer(this);
		gun147.setRotationPoint(-3.8F, -38.2F, -82.0F);
		standard_cover.addChild(gun147);
		setRotationAngle(gun147, 0.0F, 0.0F, -1.309F);
		gun147.cubeList.add(new ModelBox(gun147, 270, 257, 0.0F, 0.0F, 9.0F, 1, 1, 13, 0.0F, false));

		gun146 = new ModelRenderer(this);
		gun146.setRotationPoint(-2.5F, -40.6F, -75.0F);
		standard_cover.addChild(gun146);
		setRotationAngle(gun146, 0.0F, 0.0F, 0.8228F);
		

		gun145 = new ModelRenderer(this);
		gun145.setRotationPoint(-2.5F, -40.6F, -68.5F);
		standard_cover.addChild(gun145);
		setRotationAngle(gun145, 0.0F, 0.0F, 0.8228F);
		

		gun144 = new ModelRenderer(this);
		gun144.setRotationPoint(-2.5F, -40.6F, -62.0F);
		standard_cover.addChild(gun144);
		setRotationAngle(gun144, 0.0F, 0.0F, 0.8228F);
		

		gun143 = new ModelRenderer(this);
		gun143.setRotationPoint(-2.5F, -40.6F, -56.5F);
		standard_cover.addChild(gun143);
		setRotationAngle(gun143, 0.0F, 0.0F, 0.8228F);
		

		gun142 = new ModelRenderer(this);
		gun142.setRotationPoint(-2.5F, -40.6F, -50.0F);
		standard_cover.addChild(gun142);
		setRotationAngle(gun142, 0.0F, 0.0F, 0.8228F);
		

		gun141 = new ModelRenderer(this);
		gun141.setRotationPoint(-0.55F, -40.5F, -74.5F);
		standard_cover.addChild(gun141);
		setRotationAngle(gun141, 0.0F, 0.0F, 0.748F);
		gun141.cubeList.add(new ModelBox(gun141, 113, 276, 0.0F, 0.0F, 15.0F, 1, 1, 11, 0.0F, false));
		gun141.cubeList.add(new ModelBox(gun141, 123, 286, 0.0F, 0.0F, 14.5F, 1, 1, 1, 0.0F, false));
		gun141.cubeList.add(new ModelBox(gun141, 122, 285, 0.0F, 0.0F, 10.5F, 1, 1, 2, 0.0F, false));
		gun141.cubeList.add(new ModelBox(gun141, 122, 285, 0.0F, 0.0F, 6.5F, 1, 1, 2, 0.0F, false));
		gun141.cubeList.add(new ModelBox(gun141, 122, 285, 0.0F, 0.0F, 2.5F, 1, 1, 2, 0.0F, false));
		gun141.cubeList.add(new ModelBox(gun141, 123, 286, 0.0F, 0.0F, 1.5F, 1, 1, 1, 0.0F, false));

		gun140 = new ModelRenderer(this);
		gun140.setRotationPoint(0.1F, -39.9F, -82.0F);
		standard_cover.addChild(gun140);
		setRotationAngle(gun140, 0.0F, 0.0F, 1.122F);
		gun140.cubeList.add(new ModelBox(gun140, 207, 159, 0.0F, 0.0F, 22.0F, 1, 1, 17, 0.0F, false));
		gun140.cubeList.add(new ModelBox(gun140, 222, 174, 0.0F, 0.0F, 18.0F, 1, 1, 2, 0.0F, false));
		gun140.cubeList.add(new ModelBox(gun140, 222, 174, 0.0F, 0.0F, 14.0F, 1, 1, 2, 0.0F, false));
		gun140.cubeList.add(new ModelBox(gun140, 222, 174, 0.0F, 0.0F, 10.0F, 1, 1, 2, 0.0F, false));

		gun139 = new ModelRenderer(this);
		gun139.setRotationPoint(0.2F, -39.9F, -82.0F);
		standard_cover.addChild(gun139);
		setRotationAngle(gun139, 0.0F, 0.0F, 1.122F);
		gun139.cubeList.add(new ModelBox(gun139, 116, 48, 0.0F, 0.0F, 9.0F, 1, 1, 1, 0.0F, false));

		gun138 = new ModelRenderer(this);
		gun138.setRotationPoint(0.2F, -39.9F, -46.0F);
		standard_cover.addChild(gun138);
		setRotationAngle(gun138, 0.0F, 0.0F, 1.122F);
		gun138.cubeList.add(new ModelBox(gun138, 23, 105, 0.0F, 0.1F, 0.0F, 1, 1, 7, 0.0F, false));

		gun137 = new ModelRenderer(this);
		gun137.setRotationPoint(-0.5F, -40.6F, -75.0F);
		standard_cover.addChild(gun137);
		setRotationAngle(gun137, 0.0F, 0.0F, 0.748F);
		

		gun136 = new ModelRenderer(this);
		gun136.setRotationPoint(-0.5F, -40.6F, -68.5F);
		standard_cover.addChild(gun136);
		setRotationAngle(gun136, 0.0F, 0.0F, 0.748F);
		

		gun135 = new ModelRenderer(this);
		gun135.setRotationPoint(-0.5F, -40.6F, -62.0F);
		standard_cover.addChild(gun135);
		setRotationAngle(gun135, 0.0F, 0.0F, 0.748F);
		

		gun134 = new ModelRenderer(this);
		gun134.setRotationPoint(-0.5F, -40.6F, -56.5F);
		standard_cover.addChild(gun134);
		setRotationAngle(gun134, 0.0F, 0.0F, 0.748F);
		

		gun133 = new ModelRenderer(this);
		gun133.setRotationPoint(-2.5F, -40.6F, -77.5F);
		standard_cover.addChild(gun133);
		setRotationAngle(gun133, -1.4586F, 0.0F, 0.0F);
		

		gun124 = new ModelRenderer(this);
		gun124.setRotationPoint(-0.5F, -40.6F, -50.0F);
		standard_cover.addChild(gun124);
		setRotationAngle(gun124, 0.0F, 0.0F, 0.748F);
		gun124.cubeList.add(new ModelBox(gun124, 31, 228, 0.0F, 0.1F, 0.0F, 1, 1, 11, 0.0F, false));

		gun123 = new ModelRenderer(this);
		gun123.setRotationPoint(0.8F, -38.2F, -82.0F);
		standard_cover.addChild(gun123);
		setRotationAngle(gun123, 0.0F, 0.0F, 2.9172F);
		gun123.cubeList.add(new ModelBox(gun123, 156, 55, 0.0F, 0.0F, 9.0F, 1, 1, 34, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		standard_cover.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}