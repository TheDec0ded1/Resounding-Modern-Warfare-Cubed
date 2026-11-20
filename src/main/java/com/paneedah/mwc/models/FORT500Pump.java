package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class FORT500Pump extends ModelWithAttachments {
	private final ModelRenderer pump;
	private final ModelRenderer pump28_r3;
	private final ModelRenderer pump27_r4;
	private final ModelRenderer pump26_r2;
	private final ModelRenderer pump25_r2;
	private final ModelRenderer pump24_r2;
	private final ModelRenderer pump23_r1;
	private final ModelRenderer pump22_r1;
	private final ModelRenderer pump21_r1;
	private final ModelRenderer pump19_r3;
	private final ModelRenderer pump14_r4;
	private final ModelRenderer pump11_r2;
	private final ModelRenderer pump10_r3;
	private final ModelRenderer pump9_r2;
	private final ModelRenderer pump7_r3;
	private final ModelRenderer pump6_r3;
	private final ModelRenderer pump3_r4;
	private final ModelRenderer pump1_r4;
	private final ModelRenderer pumpSawed;
	private final ModelRenderer pump27_r3;
	private final ModelRenderer pump20_r2;
	private final ModelRenderer pump19_r2;
	private final ModelRenderer pump14_r3;
	private final ModelRenderer pump11_r1;
	private final ModelRenderer pump10_r2;
	private final ModelRenderer pump9_r1;
	private final ModelRenderer pump7_r2;
	private final ModelRenderer pump6_r2;
	private final ModelRenderer pump3_r3;
	private final ModelRenderer pump1_r3;
	private final ModelRenderer pump28_r2;

	public FORT500Pump() {
		textureWidth = 410;
		textureHeight = 410;

		pump = new ModelRenderer(this);
		pump.setRotationPoint(18.9609F, -22.7134F, 0.0F);
		pump.cubeList.add(new ModelBox(pump, 114, 140, -21.6609F, 17.1134F, -12.0F, 1, 1, 8, 0.0F, false));
		pump.cubeList.add(new ModelBox(pump, 189, 312, -22.2609F, 21.1134F, -35.5F, 1, 1, 13, 0.0F, false));
		pump.cubeList.add(new ModelBox(pump, 143, 306, -18.6609F, 21.1134F, -35.5F, 1, 1, 13, 0.0F, false));
		pump.cubeList.add(new ModelBox(pump, 292, 25, -21.2081F, 22.7589F, -35.5F, 1, 1, 13, 0.0F, false));
		pump.cubeList.add(new ModelBox(pump, 259, 73, -20.7137F, 22.7589F, -35.5F, 2, 1, 13, 0.0F, false));
		pump.cubeList.add(new ModelBox(pump, 303, 36, -21.2081F, 21.7589F, -24.5F, 1, 1, 2, 0.0F, false));
		pump.cubeList.add(new ModelBox(pump, 270, 84, -20.7137F, 21.7589F, -24.5F, 2, 1, 2, 0.0F, false));

		pump28_r3 = new ModelRenderer(this);
		pump28_r3.setRotationPoint(-1.8765F, -8.4191F, 0.0F);
		pump.addChild(pump28_r3);
		setRotationAngle(pump28_r3, 0.0F, 0.0F, -2.2307F);
		

		pump27_r4 = new ModelRenderer(this);
		pump27_r4.setRotationPoint(-39.2715F, -6.8389F, 0.0F);
		pump.addChild(pump27_r4);
		setRotationAngle(pump27_r4, 0.0F, 0.0F, 2.2307F);
		

		pump26_r2 = new ModelRenderer(this);
		pump26_r2.setRotationPoint(-34.684F, -4.0739F, 0.0F);
		pump.addChild(pump26_r2);
		setRotationAngle(pump26_r2, 0.0F, 0.0F, 2.3562F);
		

		pump25_r2 = new ModelRenderer(this);
		pump25_r2.setRotationPoint(-6.652F, -5.4881F, 0.0F);
		pump.addChild(pump25_r2);
		setRotationAngle(pump25_r2, 0.0F, 0.0F, -2.3562F);
		

		pump24_r2 = new ModelRenderer(this);
		pump24_r2.setRotationPoint(-34.4062F, -9.7302F, 0.0F);
		pump.addChild(pump24_r2);
		setRotationAngle(pump24_r2, 0.0F, 0.0F, 2.7884F);
		

		pump23_r1 = new ModelRenderer(this);
		pump23_r1.setRotationPoint(-7.3922F, -10.422F, 0.0F);
		pump.addChild(pump23_r1);
		setRotationAngle(pump23_r1, 0.0F, 0.0F, -2.7884F);
		

		pump22_r1 = new ModelRenderer(this);
		pump22_r1.setRotationPoint(-19.0993F, -14.5034F, 0.0F);
		pump.addChild(pump22_r1);
		setRotationAngle(pump22_r1, 0.0F, 0.0F, -2.8999F);
		

		pump21_r1 = new ModelRenderer(this);
		pump21_r1.setRotationPoint(-22.7644F, -14.0248F, 0.0F);
		pump.addChild(pump21_r1);
		setRotationAngle(pump21_r1, 0.0F, 0.0F, 2.8999F);
		

		pump19_r3 = new ModelRenderer(this);
		pump19_r3.setRotationPoint(-19.0991F, -14.5034F, 0.0F);
		pump.addChild(pump19_r3);
		setRotationAngle(pump19_r3, 0.0F, 0.0F, -2.8999F);
		

		pump14_r4 = new ModelRenderer(this);
		pump14_r4.setRotationPoint(-12.3565F, -12.7935F, 0.0F);
		pump.addChild(pump14_r4);
		pump14_r4.cubeList.add(new ModelBox(pump14_r4, 8, 228, -6.3044F, 30.9069F, -26.5F, 1, 1, 4, 0.0F, false));

		pump11_r2 = new ModelRenderer(this);
		pump11_r2.setRotationPoint(-6.4813F, -5.4174F, 0.0F);
		pump.addChild(pump11_r2);
		setRotationAngle(pump11_r2, 0.0F, 0.0F, -2.3562F);
		pump11_r2.cubeList.add(new ModelBox(pump11_r2, 189, 293, -10.2172F, -31.0442F, -35.5F, 1, 1, 13, 0.0F, false));

		pump10_r3 = new ModelRenderer(this);
		pump10_r3.setRotationPoint(-34.2123F, -9.7648F, 0.0F);
		pump.addChild(pump10_r3);
		setRotationAngle(pump10_r3, 0.0F, 0.0F, 2.7884F);
		pump10_r3.cubeList.add(new ModelBox(pump10_r3, 5, 298, -1.1869F, -35.0445F, -35.5F, 1, 1, 13, 0.0F, false));

		pump9_r2 = new ModelRenderer(this);
		pump9_r2.setRotationPoint(-34.7693F, -4.0385F, 0.0F);
		pump.addChild(pump9_r2);
		setRotationAngle(pump9_r2, 0.0F, 0.0F, 2.3562F);
		pump9_r2.cubeList.add(new ModelBox(pump9_r2, 51, 301, 7.3025F, -31.0088F, -35.5F, 1, 1, 13, 0.0F, false));

		pump7_r3 = new ModelRenderer(this);
		pump7_r3.setRotationPoint(-7.586F, -10.4566F, 0.0F);
		pump.addChild(pump7_r3);
		setRotationAngle(pump7_r3, 0.0F, 0.0F, -2.7884F);
		pump7_r3.cubeList.add(new ModelBox(pump7_r3, 97, 301, -1.8131F, -35.0445F, -35.5F, 1, 1, 13, 0.0F, false));

		pump6_r3 = new ModelRenderer(this);
		pump6_r3.setRotationPoint(-29.3185F, -11.8313F, 0.0F);
		pump.addChild(pump6_r3);
		pump6_r3.cubeList.add(new ModelBox(pump6_r3, 36, 229, 7.0576F, 29.9447F, -26.5F, 1, 1, 4, 0.0F, false));

		pump3_r4 = new ModelRenderer(this);
		pump3_r4.setRotationPoint(-3.2946F, 32.2026F, 0.0F);
		pump.addChild(pump3_r4);
		pump3_r4.cubeList.add(new ModelBox(pump3_r4, 285, 232, -18.3663F, -14.0892F, -12.0F, 1, 2, 18, 0.0F, false));

		pump1_r4 = new ModelRenderer(this);
		pump1_r4.setRotationPoint(1.1787F, 28.1346F, 0.0F);
		pump.addChild(pump1_r4);
		setRotationAngle(pump1_r4, 0.0F, 0.0F, -0.7854F);
		pump1_r4.cubeList.add(new ModelBox(pump1_r4, 141, 129, -8.3569F, -23.9432F, -12.0F, 1, 1, 8, 0.0F, false));

		pumpSawed = new ModelRenderer(this);
		pumpSawed.setRotationPoint(-44.8689F, -14.3995F, 0.0F);
		pump.addChild(pumpSawed);
		pumpSawed.cubeList.add(new ModelBox(pumpSawed, 363, 149, 22.608F, 34.5129F, -38.5F, 1, 1, 14, 0.0F, false));
		pumpSawed.cubeList.add(new ModelBox(pumpSawed, 238, 379, 22.558F, 33.5129F, -33.5F, 1, 2, 10, 0.0F, false));
		pumpSawed.cubeList.add(new ModelBox(pumpSawed, 238, 379, 26.258F, 33.5129F, -33.5F, 1, 2, 10, 0.0F, false));
		pumpSawed.cubeList.add(new ModelBox(pumpSawed, 360, 349, 26.208F, 34.5129F, -38.5F, 1, 1, 14, 0.0F, false));
		pumpSawed.cubeList.add(new ModelBox(pumpSawed, 139, 252, 23.661F, 36.1583F, -38.5F, 1, 1, 14, 0.0F, false));
		pumpSawed.cubeList.add(new ModelBox(pumpSawed, 230, 318, 24.155F, 36.1583F, -38.5F, 2, 1, 14, 0.0F, false));

		pump27_r3 = new ModelRenderer(this);
		pump27_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		pumpSawed.addChild(pump27_r3);
		setRotationAngle(pump27_r3, 0.0F, 0.0F, 1.7846F);
		

		pump20_r2 = new ModelRenderer(this);
		pump20_r2.setRotationPoint(27.0234F, 49.8818F, 0.0F);
		pumpSawed.addChild(pump20_r2);
		pump20_r2.cubeList.add(new ModelBox(pump20_r2, 216, 164, -0.8154F, -16.3689F, -38.5F, 1, 1, 14, 0.0F, false));
		pump20_r2.cubeList.add(new ModelBox(pump20_r2, 9, 83, -0.8154F, -16.3689F, -24.5F, 1, 2, 2, 0.0F, false));

		pump19_r2 = new ModelRenderer(this);
		pump19_r2.setRotationPoint(20.796F, 49.7703F, 0.0F);
		pumpSawed.addChild(pump19_r2);
		pump19_r2.cubeList.add(new ModelBox(pump19_r2, 221, 45, 1.812F, -16.2574F, -38.5F, 1, 1, 14, 0.0F, false));
		pump19_r2.cubeList.add(new ModelBox(pump19_r2, 49, 83, 1.812F, -16.2574F, -24.5F, 1, 2, 2, 0.0F, false));

		pump14_r3 = new ModelRenderer(this);
		pump14_r3.setRotationPoint(25.7699F, -18.1038F, 0.0F);
		pumpSawed.addChild(pump14_r3);
		pump14_r3.cubeList.add(new ModelBox(pump14_r3, 142, 57, 0.4381F, 50.6167F, -38.5F, 1, 1, 12, 0.0F, false));

		pump11_r1 = new ModelRenderer(this);
		pump11_r1.setRotationPoint(38.3876F, -9.0178F, 0.0F);
		pumpSawed.addChild(pump11_r1);
		setRotationAngle(pump11_r1, 0.0F, 0.0F, -2.3562F);
		pump11_r1.cubeList.add(new ModelBox(pump11_r1, 226, 334, -22.2379F, -43.0648F, -38.5F, 1, 1, 14, 0.0F, false));

		pump10_r2 = new ModelRenderer(this);
		pump10_r2.setRotationPoint(10.6566F, -13.3653F, 0.0F);
		pumpSawed.addChild(pump10_r2);
		setRotationAngle(pump10_r2, 0.0F, 0.0F, 2.7884F);
		pump10_r2.cubeList.add(new ModelBox(pump10_r2, 337, 201, 4.6931F, -50.995F, -38.5F, 1, 1, 14, 0.0F, false));

		pump9_r1 = new ModelRenderer(this);
		pump9_r1.setRotationPoint(10.0996F, -7.639F, 0.0F);
		pumpSawed.addChild(pump9_r1);
		setRotationAngle(pump9_r1, 0.0F, 0.0F, 2.3562F);
		pump9_r1.cubeList.add(new ModelBox(pump9_r1, 348, 103, 19.3233F, -43.0294F, -38.5F, 1, 1, 14, 0.0F, false));

		pump7_r2 = new ModelRenderer(this);
		pump7_r2.setRotationPoint(37.283F, -14.0571F, 0.0F);
		pumpSawed.addChild(pump7_r2);
		setRotationAngle(pump7_r2, 0.0F, 0.0F, -2.7884F);
		pump7_r2.cubeList.add(new ModelBox(pump7_r2, 351, 26, -7.6929F, -50.9951F, -38.5F, 1, 1, 14, 0.0F, false));

		pump6_r2 = new ModelRenderer(this);
		pump6_r2.setRotationPoint(22.1045F, -17.6252F, 0.0F);
		pumpSawed.addChild(pump6_r2);
		pump6_r2.cubeList.add(new ModelBox(pump6_r2, 60, 197, 0.5035F, 50.1381F, -38.5F, 1, 1, 12, 0.0F, false));

		pump3_r3 = new ModelRenderer(this);
		pump3_r3.setRotationPoint(41.5743F, 28.6021F, 0.0F);
		pumpSawed.addChild(pump3_r3);
		

		pump1_r3 = new ModelRenderer(this);
		pump1_r3.setRotationPoint(46.0476F, 24.5341F, 0.0F);
		pumpSawed.addChild(pump1_r3);
		setRotationAngle(pump1_r3, 0.0F, 0.0F, -0.7854F);
		

		pump28_r2 = new ModelRenderer(this);
		pump28_r2.setRotationPoint(49.3917F, -1.9546F, 0.0F);
		pumpSawed.addChild(pump28_r2);
		setRotationAngle(pump28_r2, 0.0F, 0.0F, -1.7846F);
		
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		pump.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}