package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AK15HandleGuard extends ModelBase {
	private final ModelRenderer handguard;
	private final ModelRenderer gun603;
	private final ModelRenderer gun602;
	private final ModelRenderer gun601;
	private final ModelRenderer gun600;
	private final ModelRenderer gun599;
	private final ModelRenderer gun506;
	private final ModelRenderer gun505;
	private final ModelRenderer gun504;
	private final ModelRenderer gun503;
	private final ModelRenderer gun502;
	private final ModelRenderer gun501;
	private final ModelRenderer gun500;
	private final ModelRenderer gun499;
	private final ModelRenderer gun498;
	private final ModelRenderer gun497;
	private final ModelRenderer gun496;
	private final ModelRenderer gun495;
	private final ModelRenderer gun494;
	private final ModelRenderer gun493;
	private final ModelRenderer gun492;
	private final ModelRenderer gun491;
	private final ModelRenderer gun490;
	private final ModelRenderer gun489;
	private final ModelRenderer gun488;
	private final ModelRenderer gun487;
	private final ModelRenderer gun486;
	private final ModelRenderer gun485;
	private final ModelRenderer gun484;
	private final ModelRenderer gun483;
	private final ModelRenderer gun482;
	private final ModelRenderer gun481;
	private final ModelRenderer gun480;
	private final ModelRenderer gun479;
	private final ModelRenderer gun478;
	private final ModelRenderer gun477;
	private final ModelRenderer gun476;
	private final ModelRenderer gun475;
	private final ModelRenderer gun474;
	private final ModelRenderer gun473;
	private final ModelRenderer gun472;
	private final ModelRenderer gun471;
	private final ModelRenderer gun470;
	private final ModelRenderer gun469;
	private final ModelRenderer gun468;
	private final ModelRenderer gun467;
	private final ModelRenderer gun466;
	private final ModelRenderer gun465;
	private final ModelRenderer gun464;
	private final ModelRenderer gun463;
	private final ModelRenderer gun462;
	private final ModelRenderer gun461;
	private final ModelRenderer gun460;
	private final ModelRenderer gun459;
	private final ModelRenderer gun458;
	private final ModelRenderer gun457;
	private final ModelRenderer gun456;
	private final ModelRenderer gun455;
	private final ModelRenderer gun454;
	private final ModelRenderer gun453;
	private final ModelRenderer gun452;
	private final ModelRenderer gun451;
	private final ModelRenderer gun450;
	private final ModelRenderer gun449;
	private final ModelRenderer gun448;
	private final ModelRenderer gun447;
	private final ModelRenderer gun446;
	private final ModelRenderer gun445;
	private final ModelRenderer gun444;
	private final ModelRenderer gun443;
	private final ModelRenderer gun442;
	private final ModelRenderer gun441;
	private final ModelRenderer gun440;
	private final ModelRenderer gun439;
	private final ModelRenderer gun438;
	private final ModelRenderer gun437;
	private final ModelRenderer gun436;
	private final ModelRenderer gun435;
	private final ModelRenderer gun434;
	private final ModelRenderer gun433;
	private final ModelRenderer gun432;
	private final ModelRenderer gun431;
	private final ModelRenderer gun430;
	private final ModelRenderer gun429;
	private final ModelRenderer gun428;
	private final ModelRenderer gun427;
	private final ModelRenderer gun426;
	private final ModelRenderer gun425;
	private final ModelRenderer gun424;
	private final ModelRenderer gun423;
	private final ModelRenderer gun152;
	private final ModelRenderer gun2;
	private final ModelRenderer bone6;
	private final ModelRenderer cube_r62;
	private final ModelRenderer cube_r63;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;

	public AK15HandleGuard() {
		textureWidth = 416;
		textureHeight = 416;

		handguard = new ModelRenderer(this);
		handguard.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		gun603 = new ModelRenderer(this);
		gun603.setRotationPoint(-1.6F, -39.7F, -53.5F);
		handguard.addChild(gun603);
		gun603.cubeList.add(new ModelBox(gun603, 39, 308, 0.0F, 0.0F, 0.0F, 1, 1, 17, 0.0F, false));

		gun602 = new ModelRenderer(this);
		gun602.setRotationPoint(-0.4F, -37.6F, -50.5F);
		handguard.addChild(gun602);
		gun602.cubeList.add(new ModelBox(gun602, 244, 399, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun601 = new ModelRenderer(this);
		gun601.setRotationPoint(-3.6F, -37.6F, -50.5F);
		handguard.addChild(gun601);
		gun601.cubeList.add(new ModelBox(gun601, 256, 399, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun600 = new ModelRenderer(this);
		gun600.setRotationPoint(-3.6F, -37.6F, -53.0F);
		handguard.addChild(gun600);
		gun600.cubeList.add(new ModelBox(gun600, 261, 399, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun599 = new ModelRenderer(this);
		gun599.setRotationPoint(-0.4F, -37.6F, -53.0F);
		handguard.addChild(gun599);
		gun599.cubeList.add(new ModelBox(gun599, 296, 399, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun506 = new ModelRenderer(this);
		gun506.setRotationPoint(1.2F, -34.8F, -50.5F);
		handguard.addChild(gun506);
		setRotationAngle(gun506, 0.0F, 0.0F, 2.0076F);
		gun506.cubeList.add(new ModelBox(gun506, 348, 340, 0.0F, 0.0F, 0.0F, 1, 1, 10, 0.0F, false));

		gun505 = new ModelRenderer(this);
		gun505.setRotationPoint(-4.2F, -34.8F, -50.5F);
		handguard.addChild(gun505);
		setRotationAngle(gun505, 0.0F, 0.0F, -0.3149F);
		gun505.cubeList.add(new ModelBox(gun505, 350, 203, 0.0F, 0.0F, 0.0F, 1, 1, 10, 0.0F, false));

		gun504 = new ModelRenderer(this);
		gun504.setRotationPoint(1.5F, -33.2F, -50.5F);
		handguard.addChild(gun504);
		setRotationAngle(gun504, 0.0F, 0.0F, 2.3562F);
		gun504.cubeList.add(new ModelBox(gun504, 350, 215, 0.0F, 0.0F, 0.0F, 1, 1, 10, 0.0F, false));

		gun503 = new ModelRenderer(this);
		gun503.setRotationPoint(-4.5F, -33.2F, -50.5F);
		handguard.addChild(gun503);
		setRotationAngle(gun503, 0.0F, 0.0F, -0.7854F);
		gun503.cubeList.add(new ModelBox(gun503, 350, 227, 0.0F, 0.0F, 0.0F, 1, 1, 10, 0.0F, false));

		gun502 = new ModelRenderer(this);
		gun502.setRotationPoint(-4.2F, -34.8F, -40.5F);
		handguard.addChild(gun502);
		setRotationAngle(gun502, 0.0F, 0.1115F, 0.0F);
		gun502.cubeList.add(new ModelBox(gun502, 69, 381, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		gun501 = new ModelRenderer(this);
		gun501.setRotationPoint(-4.5F, -34.2F, -40.5F);
		handguard.addChild(gun501);
		setRotationAngle(gun501, 0.0F, 0.1859F, 0.0F);
		gun501.cubeList.add(new ModelBox(gun501, 381, 75, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		gun500 = new ModelRenderer(this);
		gun500.setRotationPoint(1.2F, -34.8F, -40.5F);
		handguard.addChild(gun500);
		setRotationAngle(gun500, 0.0F, -1.7102F, 0.0F);
		gun500.cubeList.add(new ModelBox(gun500, 295, 387, 0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));

		gun499 = new ModelRenderer(this);
		gun499.setRotationPoint(1.5F, -34.2F, -40.5F);
		handguard.addChild(gun499);
		setRotationAngle(gun499, 0.0F, -1.7846F, 0.0F);
		gun499.cubeList.add(new ModelBox(gun499, 387, 298, 0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));

		gun498 = new ModelRenderer(this);
		gun498.setRotationPoint(1.2F, -34.8F, -50.5F);
		handguard.addChild(gun498);
		setRotationAngle(gun498, 0.0F, -2.9743F, 0.0F);
		gun498.cubeList.add(new ModelBox(gun498, 306, 387, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		gun497 = new ModelRenderer(this);
		gun497.setRotationPoint(1.5F, -34.2F, -50.5F);
		handguard.addChild(gun497);
		setRotationAngle(gun497, 0.0F, -2.8999F, 0.0F);
		gun497.cubeList.add(new ModelBox(gun497, 337, 387, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		gun496 = new ModelRenderer(this);
		gun496.setRotationPoint(-4.2F, -34.8F, -50.5F);
		handguard.addChild(gun496);
		setRotationAngle(gun496, 0.0F, 1.4128F, 0.0F);
		gun496.cubeList.add(new ModelBox(gun496, 392, 60, 0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun495 = new ModelRenderer(this);
		gun495.setRotationPoint(-4.5F, -34.2F, -50.5F);
		handguard.addChild(gun495);
		setRotationAngle(gun495, 0.0F, 1.3384F, 0.0F);
		gun495.cubeList.add(new ModelBox(gun495, 392, 63, 0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun494 = new ModelRenderer(this);
		gun494.setRotationPoint(0.2F, -34.8F, -50.5F);
		handguard.addChild(gun494);
		gun494.cubeList.add(new ModelBox(gun494, 351, 291, 0.0F, 0.0F, 0.0F, 1, 1, 10, 0.0F, false));

		gun493 = new ModelRenderer(this);
		gun493.setRotationPoint(-4.2F, -34.8F, -50.5F);
		handguard.addChild(gun493);
		gun493.cubeList.add(new ModelBox(gun493, 352, 178, 0.0F, 0.0F, 0.0F, 1, 1, 10, 0.0F, false));

		gun492 = new ModelRenderer(this);
		gun492.setRotationPoint(-4.5F, -34.2F, -50.5F);
		handguard.addChild(gun492);
		gun492.cubeList.add(new ModelBox(gun492, 292, 66, 0.0F, 0.0F, 0.0F, 6, 1, 10, 0.0F, false));

		gun491 = new ModelRenderer(this);
		gun491.setRotationPoint(-3.3F, -37.8F, -49.0F);
		handguard.addChild(gun491);
		setRotationAngle(gun491, 0.0F, 0.0F, -0.7854F);
		gun491.cubeList.add(new ModelBox(gun491, 357, 280, 0.0F, 0.0F, 0.0F, 2, 1, 8, 0.0F, false));

		gun490 = new ModelRenderer(this);
		gun490.setRotationPoint(0.3F, -37.8F, -49.0F);
		handguard.addChild(gun490);
		setRotationAngle(gun490, 0.0F, 0.0F, 2.3562F);
		gun490.cubeList.add(new ModelBox(gun490, 216, 359, 0.0F, 0.0F, 0.0F, 1, 2, 8, 0.0F, false));

		gun489 = new ModelRenderer(this);
		gun489.setRotationPoint(-0.5F, -39.2F, -41.5F);
		handguard.addChild(gun489);
		setRotationAngle(gun489, 0.0F, 0.0F, 1.1897F);
		gun489.cubeList.add(new ModelBox(gun489, 392, 369, 0.0F, 0.0F, -0.001F, 1, 1, 2, 0.0F, false));

		gun488 = new ModelRenderer(this);
		gun488.setRotationPoint(-0.5F, -39.2F, -46.0F);
		handguard.addChild(gun488);
		setRotationAngle(gun488, 0.0F, 0.0F, 1.1897F);
		gun488.cubeList.add(new ModelBox(gun488, 399, 316, 0.0F, 0.0F, -0.001F, 1, 1, 1, 0.0F, false));

		gun487 = new ModelRenderer(this);
		gun487.setRotationPoint(-0.5F, -39.2F, -43.0F);
		handguard.addChild(gun487);
		setRotationAngle(gun487, 0.0F, 0.0F, 1.1897F);
		gun487.cubeList.add(new ModelBox(gun487, 399, 319, 0.0F, 0.0F, -0.001F, 1, 1, 1, 0.0F, false));

		gun486 = new ModelRenderer(this);
		gun486.setRotationPoint(-0.5F, -39.2F, -50.0F);
		handguard.addChild(gun486);
		setRotationAngle(gun486, 0.0F, 0.0F, 1.1897F);
		gun486.cubeList.add(new ModelBox(gun486, 29, 393, 0.0F, 0.0F, -0.001F, 1, 1, 2, 0.0F, false));

		gun485 = new ModelRenderer(this);
		gun485.setRotationPoint(-0.5F, -39.2F, -47.5F);
		handguard.addChild(gun485);
		setRotationAngle(gun485, 0.0F, 0.0F, 1.1897F);
		gun485.cubeList.add(new ModelBox(gun485, 399, 322, 0.0F, 0.0F, -0.001F, 1, 1, 1, 0.0F, false));

		gun484 = new ModelRenderer(this);
		gun484.setRotationPoint(-0.5F, -39.2F, -44.5F);
		handguard.addChild(gun484);
		setRotationAngle(gun484, 0.0F, 0.0F, 1.1897F);
		gun484.cubeList.add(new ModelBox(gun484, 399, 325, 0.0F, 0.0F, -0.001F, 1, 1, 1, 0.0F, false));

		gun483 = new ModelRenderer(this);
		gun483.setRotationPoint(-2.5F, -39.2F, -41.5F);
		handguard.addChild(gun483);
		setRotationAngle(gun483, 0.0F, 0.0F, 0.3718F);
		gun483.cubeList.add(new ModelBox(gun483, 69, 393, 0.0F, 0.0F, -0.001F, 1, 1, 2, 0.0F, false));

		gun482 = new ModelRenderer(this);
		gun482.setRotationPoint(-2.5F, -39.2F, -44.5F);
		handguard.addChild(gun482);
		setRotationAngle(gun482, 0.0F, 0.0F, 0.3718F);
		gun482.cubeList.add(new ModelBox(gun482, 399, 328, 0.0F, 0.0F, -0.001F, 1, 1, 1, 0.0F, false));

		gun481 = new ModelRenderer(this);
		gun481.setRotationPoint(-2.5F, -39.2F, -43.0F);
		handguard.addChild(gun481);
		setRotationAngle(gun481, 0.0F, 0.0F, 0.3718F);
		gun481.cubeList.add(new ModelBox(gun481, 331, 399, 0.0F, 0.0F, -0.001F, 1, 1, 1, 0.0F, false));

		gun480 = new ModelRenderer(this);
		gun480.setRotationPoint(-2.5F, -39.2F, -46.0F);
		handguard.addChild(gun480);
		setRotationAngle(gun480, 0.0F, 0.0F, 0.3718F);
		gun480.cubeList.add(new ModelBox(gun480, 352, 399, 0.0F, 0.0F, -0.001F, 1, 1, 1, 0.0F, false));

		gun479 = new ModelRenderer(this);
		gun479.setRotationPoint(-2.5F, -39.2F, -47.5F);
		handguard.addChild(gun479);
		setRotationAngle(gun479, 0.0F, 0.0F, 0.3718F);
		gun479.cubeList.add(new ModelBox(gun479, 399, 369, 0.0F, 0.0F, -0.001F, 1, 1, 1, 0.0F, false));

		gun478 = new ModelRenderer(this);
		gun478.setRotationPoint(-2.5F, -39.2F, -50.0F);
		handguard.addChild(gun478);
		setRotationAngle(gun478, 0.0F, 0.0F, 0.3718F);
		gun478.cubeList.add(new ModelBox(gun478, 120, 393, 0.0F, 0.0F, -0.001F, 1, 1, 2, 0.0F, false));

		gun477 = new ModelRenderer(this);
		gun477.setRotationPoint(-3.5F, -37.8F, -41.5F);
		handguard.addChild(gun477);
		setRotationAngle(gun477, 0.0F, 0.0F, -0.7854F);
		gun477.cubeList.add(new ModelBox(gun477, 227, 391, 0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

		gun476 = new ModelRenderer(this);
		gun476.setRotationPoint(-3.5F, -37.8F, -44.5F);
		handguard.addChild(gun476);
		setRotationAngle(gun476, 0.0F, 0.0F, -0.7854F);
		gun476.cubeList.add(new ModelBox(gun476, 394, 304, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		gun475 = new ModelRenderer(this);
		gun475.setRotationPoint(-3.5F, -37.8F, -47.5F);
		handguard.addChild(gun475);
		setRotationAngle(gun475, 0.0F, 0.0F, -0.7854F);
		gun475.cubeList.add(new ModelBox(gun475, 394, 307, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		gun474 = new ModelRenderer(this);
		gun474.setRotationPoint(-3.5F, -37.8F, -50.0F);
		handguard.addChild(gun474);
		setRotationAngle(gun474, 0.0F, 0.0F, -0.7854F);
		gun474.cubeList.add(new ModelBox(gun474, 236, 391, 0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

		gun473 = new ModelRenderer(this);
		gun473.setRotationPoint(-3.5F, -37.8F, -46.0F);
		handguard.addChild(gun473);
		setRotationAngle(gun473, 0.0F, 0.0F, -0.7854F);
		gun473.cubeList.add(new ModelBox(gun473, 394, 310, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		gun472 = new ModelRenderer(this);
		gun472.setRotationPoint(-3.5F, -37.8F, -43.0F);
		handguard.addChild(gun472);
		setRotationAngle(gun472, 0.0F, 0.0F, -0.7854F);
		gun472.cubeList.add(new ModelBox(gun472, 394, 313, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		gun471 = new ModelRenderer(this);
		gun471.setRotationPoint(0.5F, -37.8F, -46.0F);
		handguard.addChild(gun471);
		setRotationAngle(gun471, 0.0F, 0.0F, 2.3562F);
		gun471.cubeList.add(new ModelBox(gun471, 53, 387, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun470 = new ModelRenderer(this);
		gun470.setRotationPoint(0.5F, -37.8F, -44.5F);
		handguard.addChild(gun470);
		setRotationAngle(gun470, 0.0F, 0.0F, 2.3562F);
		gun470.cubeList.add(new ModelBox(gun470, 107, 391, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun469 = new ModelRenderer(this);
		gun469.setRotationPoint(0.5F, -37.8F, -47.5F);
		handguard.addChild(gun469);
		setRotationAngle(gun469, 0.0F, 0.0F, 2.3562F);
		gun469.cubeList.add(new ModelBox(gun469, 108, 398, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun468 = new ModelRenderer(this);
		gun468.setRotationPoint(0.5F, -37.8F, -43.0F);
		handguard.addChild(gun468);
		setRotationAngle(gun468, 0.0F, 0.0F, 2.3562F);
		gun468.cubeList.add(new ModelBox(gun468, 184, 398, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun467 = new ModelRenderer(this);
		gun467.setRotationPoint(0.5F, -37.8F, -41.5F);
		handguard.addChild(gun467);
		setRotationAngle(gun467, 0.0F, 0.0F, 2.3562F);
		gun467.cubeList.add(new ModelBox(gun467, 262, 192, 0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));

		gun466 = new ModelRenderer(this);
		gun466.setRotationPoint(0.5F, -37.8F, -50.0F);
		handguard.addChild(gun466);
		setRotationAngle(gun466, 0.0F, 0.0F, 2.3562F);
		gun466.cubeList.add(new ModelBox(gun466, 364, 335, 0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));

		gun465 = new ModelRenderer(this);
		gun465.setRotationPoint(0.5F, -38.5F, -39.5F);
		handguard.addChild(gun465);
		setRotationAngle(gun465, 0.0F, 0.0F, 2.2515F);
		gun465.cubeList.add(new ModelBox(gun465, 214, 379, 0.0F, 0.0F, -0.001F, 1, 2, 4, 0.0F, false));

		gun464 = new ModelRenderer(this);
		gun464.setRotationPoint(0.5F, -38.5F, -53.5F);
		handguard.addChild(gun464);
		setRotationAngle(gun464, 0.0F, 0.0F, 2.2515F);
		gun464.cubeList.add(new ModelBox(gun464, 234, 379, 0.0F, 0.0F, 0.001F, 1, 2, 4, 0.0F, false));

		gun463 = new ModelRenderer(this);
		gun463.setRotationPoint(-3.5F, -38.5F, -53.5F);
		handguard.addChild(gun463);
		setRotationAngle(gun463, 0.0F, 0.0F, -0.6692F);
		gun463.cubeList.add(new ModelBox(gun463, 374, 297, 0.0F, 0.0F, 0.001F, 2, 1, 4, 0.0F, false));

		gun462 = new ModelRenderer(this);
		gun462.setRotationPoint(-3.5F, -38.5F, -39.5F);
		handguard.addChild(gun462);
		setRotationAngle(gun462, 0.0F, 0.0F, -0.6692F);
		gun462.cubeList.add(new ModelBox(gun462, 376, 243, 0.0F, 0.0F, -0.001F, 2, 1, 4, 0.0F, false));

		gun461 = new ModelRenderer(this);
		gun461.setRotationPoint(-3.5F, -38.5F, -49.5F);
		handguard.addChild(gun461);
		setRotationAngle(gun461, -0.4461F, 0.0F, 0.0F);
		gun461.cubeList.add(new ModelBox(gun461, 220, 36, -0.001F, 0.0F, 0.0F, 4, 1, 2, 0.0F, false));

		gun460 = new ModelRenderer(this);
		gun460.setRotationPoint(-3.5F, -38.5F, -39.5F);
		handguard.addChild(gun460);
		setRotationAngle(gun460, -1.12F, 0.0F, 0.0F);
		gun460.cubeList.add(new ModelBox(gun460, 11, 387, -0.001F, 0.0F, 0.0F, 4, 2, 1, 0.0F, false));

		gun459 = new ModelRenderer(this);
		gun459.setRotationPoint(-3.5F, -38.5F, -39.5F);
		handguard.addChild(gun459);
		gun459.cubeList.add(new ModelBox(gun459, 321, 178, 0.001F, 0.0F, 0.002F, 4, 1, 4, 0.0F, false));

		gun458 = new ModelRenderer(this);
		gun458.setRotationPoint(-3.5F, -38.5F, -53.5F);
		handguard.addChild(gun458);
		gun458.cubeList.add(new ModelBox(gun458, 362, 36, 0.001F, 0.0F, -0.001F, 4, 1, 4, 0.0F, false));

		gun457 = new ModelRenderer(this);
		gun457.setRotationPoint(-3.0F, -36.3F, -45.7F);
		handguard.addChild(gun457);
		gun457.cubeList.add(new ModelBox(gun457, 392, 66, -0.001F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun456 = new ModelRenderer(this);
		gun456.setRotationPoint(-3.0F, -36.3F, -45.3F);
		handguard.addChild(gun456);
		gun456.cubeList.add(new ModelBox(gun456, 392, 69, 0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun455 = new ModelRenderer(this);
		gun455.setRotationPoint(-3.0F, -36.3F, -41.5F);
		handguard.addChild(gun455);
		gun455.cubeList.add(new ModelBox(gun455, 335, 58, 0.0F, 0.0F, -0.001F, 3, 1, 6, 0.0F, false));

		gun454 = new ModelRenderer(this);
		gun454.setRotationPoint(-3.0F, -36.3F, -53.5F);
		handguard.addChild(gun454);
		gun454.cubeList.add(new ModelBox(gun454, 0, 366, 0.0F, 0.0F, 0.001F, 3, 1, 5, 0.0F, false));

		gun453 = new ModelRenderer(this);
		gun453.setRotationPoint(-3.0F, -35.3F, -48.5F);
		handguard.addChild(gun453);
		gun453.cubeList.add(new ModelBox(gun453, 360, 76, 0.0F, 0.0F, 0.0F, 3, 1, 7, 0.0F, false));

		gun452 = new ModelRenderer(this);
		gun452.setRotationPoint(-3.8F, -35.5F, -41.5F);
		handguard.addChild(gun452);
		setRotationAngle(gun452, -0.7854F, 0.0F, 0.0F);
		gun452.cubeList.add(new ModelBox(gun452, 27, 400, -0.001F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun451 = new ModelRenderer(this);
		gun451.setRotationPoint(-0.2F, -35.5F, -41.5F);
		handguard.addChild(gun451);
		setRotationAngle(gun451, -0.7854F, 0.0F, 0.0F);
		gun451.cubeList.add(new ModelBox(gun451, 50, 400, 0.001F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun450 = new ModelRenderer(this);
		gun450.setRotationPoint(-0.2F, -35.5F, -48.5F);
		handguard.addChild(gun450);
		setRotationAngle(gun450, -0.7854F, 0.0F, 0.0F);
		gun450.cubeList.add(new ModelBox(gun450, 64, 400, 0.001F, -0.001F, 0.0F, 1, 1, 1, 0.0F, false));

		gun449 = new ModelRenderer(this);
		gun449.setRotationPoint(-3.8F, -35.5F, -48.5F);
		handguard.addChild(gun449);
		setRotationAngle(gun449, -0.7854F, 0.0F, 0.0F);
		gun449.cubeList.add(new ModelBox(gun449, 346, 387, 0.001F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));

		gun448 = new ModelRenderer(this);
		gun448.setRotationPoint(-3.8F, -34.9F, -48.5F);
		handguard.addChild(gun448);
		gun448.cubeList.add(new ModelBox(gun448, 364, 326, 0.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F, false));

		gun447 = new ModelRenderer(this);
		gun447.setRotationPoint(-0.2F, -34.9F, -48.5F);
		handguard.addChild(gun447);
		gun447.cubeList.add(new ModelBox(gun447, 348, 364, 0.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F, false));

		gun446 = new ModelRenderer(this);
		gun446.setRotationPoint(-0.2F, -35.5F, -53.5F);
		handguard.addChild(gun446);
		gun446.cubeList.add(new ModelBox(gun446, 72, 374, 0.0F, 0.0F, -0.001F, 1, 1, 5, 0.0F, false));

		gun445 = new ModelRenderer(this);
		gun445.setRotationPoint(-0.2F, -35.5F, -41.5F);
		handguard.addChild(gun445);
		gun445.cubeList.add(new ModelBox(gun445, 299, 184, 0.0F, -0.001F, -0.001F, 1, 1, 6, 0.0F, false));

		gun444 = new ModelRenderer(this);
		gun444.setRotationPoint(-3.8F, -35.5F, -41.5F);
		handguard.addChild(gun444);
		gun444.cubeList.add(new ModelBox(gun444, 362, 8, 0.0F, 0.0F, 0.0F, 4, 1, 6, 0.0F, false));

		gun443 = new ModelRenderer(this);
		gun443.setRotationPoint(-3.8F, -35.5F, -53.5F);
		handguard.addChild(gun443);
		gun443.cubeList.add(new ModelBox(gun443, 94, 277, 0.0F, 0.0F, 0.0F, 4, 1, 5, 0.0F, false));

		gun442 = new ModelRenderer(this);
		gun442.setRotationPoint(-3.0F, -37.0F, -48.5F);
		handguard.addChild(gun442);
		gun442.cubeList.add(new ModelBox(gun442, 360, 85, 0.001F, 0.0F, 0.0F, 3, 1, 7, 0.0F, false));

		gun441 = new ModelRenderer(this);
		gun441.setRotationPoint(-2.4F, -39.7F, -53.5F);
		handguard.addChild(gun441);
		gun441.cubeList.add(new ModelBox(gun441, 76, 308, 0.0F, -0.001F, -0.001F, 1, 1, 17, 0.0F, false));

		gun440 = new ModelRenderer(this);
		gun440.setRotationPoint(-0.5F, -37.8F, -53.5F);
		handguard.addChild(gun440);
		gun440.cubeList.add(new ModelBox(gun440, 362, 16, 0.001F, 0.0F, 5.0F, 1, 1, 8, 0.0F, false));

		gun439 = new ModelRenderer(this);
		gun439.setRotationPoint(-3.5F, -37.8F, -53.5F);
		handguard.addChild(gun439);
		gun439.cubeList.add(new ModelBox(gun439, 362, 26, 0.0F, 0.0F, 5.0F, 1, 1, 8, 0.0F, false));

		gun438 = new ModelRenderer(this);
		gun438.setRotationPoint(-0.5F, -37.6F, -53.5F);
		handguard.addChild(gun438);
		gun438.cubeList.add(new ModelBox(gun438, 373, 226, 0.0F, 0.0F, -0.001F, 1, 2, 5, 0.0F, false));

		gun437 = new ModelRenderer(this);
		gun437.setRotationPoint(-3.5F, -37.6F, -53.5F);
		handguard.addChild(gun437);
		gun437.cubeList.add(new ModelBox(gun437, 271, 365, 0.0F, 0.0F, 0.0F, 3, 2, 5, 0.0F, false));

		gun436 = new ModelRenderer(this);
		gun436.setRotationPoint(-3.5F, -37.6F, -41.5F);
		handguard.addChild(gun436);
		gun436.cubeList.add(new ModelBox(gun436, 327, 366, -0.002F, 0.0F, 0.0F, 1, 2, 6, 0.0F, false));

		gun435 = new ModelRenderer(this);
		gun435.setRotationPoint(-0.5F, -37.6F, -41.5F);
		handguard.addChild(gun435);
		gun435.cubeList.add(new ModelBox(gun435, 57, 367, 0.0F, 0.0F, 0.0F, 1, 2, 6, 0.0F, false));

		gun434 = new ModelRenderer(this);
		gun434.setRotationPoint(-0.2F, -34.5F, -53.5F);
		handguard.addChild(gun434);
		gun434.cubeList.add(new ModelBox(gun434, 137, 284, 0.0F, 0.0F, -0.001F, 1, 2, 18, 0.0F, false));

		gun433 = new ModelRenderer(this);
		gun433.setRotationPoint(-3.8F, -34.5F, -53.5F);
		handguard.addChild(gun433);
		gun433.cubeList.add(new ModelBox(gun433, 286, 79, 0.0F, 0.0F, 0.0F, 4, 2, 18, 0.0F, false));

		gun432 = new ModelRenderer(this);
		gun432.setRotationPoint(-3.5F, -33.25F, -38.4F);
		handguard.addChild(gun432);
		setRotationAngle(gun432, -0.0744F, 0.0F, 0.0F);
		gun432.cubeList.add(new ModelBox(gun432, 268, 250, 0.0F, 0.0F, 0.0F, 4, 2, 3, 0.0F, false));

		gun431 = new ModelRenderer(this);
		gun431.setRotationPoint(-2.0F, -32.4F, -49.5F);
		handguard.addChild(gun431);
		

		gun430 = new ModelRenderer(this);
		gun430.setRotationPoint(-2.0F, -32.4F, -46.5F);
		handguard.addChild(gun430);
		

		gun429 = new ModelRenderer(this);
		gun429.setRotationPoint(-2.0F, -32.4F, -43.5F);
		handguard.addChild(gun429);
		

		gun428 = new ModelRenderer(this);
		gun428.setRotationPoint(-3.0F, -32.4F, -42.0F);
		handguard.addChild(gun428);
		gun428.cubeList.add(new ModelBox(gun428, 22, 387, 0.0F, 0.0F, 0.0F, 3, 1, 2, 0.0F, false));

		gun427 = new ModelRenderer(this);
		gun427.setRotationPoint(-2.0F, -32.4F, -45.0F);
		handguard.addChild(gun427);
		

		gun426 = new ModelRenderer(this);
		gun426.setRotationPoint(-2.0F, -32.4F, -48.0F);
		handguard.addChild(gun426);
		

		gun425 = new ModelRenderer(this);
		gun425.setRotationPoint(-2.0F, -32.4F, -51.0F);
		handguard.addChild(gun425);
		

		gun424 = new ModelRenderer(this);
		gun424.setRotationPoint(-2.0F, -32.4F, -53.5F);
		handguard.addChild(gun424);
		

		gun423 = new ModelRenderer(this);
		gun423.setRotationPoint(-3.0F, -32.8F, -53.5F);
		handguard.addChild(gun423);
		gun423.cubeList.add(new ModelBox(gun423, 265, 305, 0.001F, 0.0F, -0.002F, 3, 1, 18, 0.0F, false));

		gun152 = new ModelRenderer(this);
		gun152.setRotationPoint(-3.0F, -32.4F, -40.5F);
		handguard.addChild(gun152);
		setRotationAngle(gun152, -0.0744F, 0.0F, 0.0F);
		gun152.cubeList.add(new ModelBox(gun152, 72, 367, -0.001F, 0.0F, 0.0F, 3, 1, 5, 0.0F, false));

		gun2 = new ModelRenderer(this);
		gun2.setRotationPoint(-3.0F, -40.0F, -36.5F);
		handguard.addChild(gun2);
		gun2.cubeList.add(new ModelBox(gun2, 33, 387, 0.0F, 0.0F, 0.001F, 3, 4, 1, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(11.7F, -28.0F, -54.25F);
		handguard.addChild(bone6);
		setRotationAngle(bone6, 0.0F, 0.0F, -3.1416F);
		bone6.cubeList.add(new ModelBox(bone6, 148, 395, 12.2F, 2.8F, 3.3F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 155, 395, 12.2F, 2.8F, 2.1F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 162, 395, 12.2F, 2.8F, 4.55F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 169, 395, 12.2F, 2.8F, 5.8F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 176, 395, 12.2F, 2.8F, 7.05F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 183, 395, 12.2F, 2.8F, 8.3F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 207, 395, 12.2F, 2.8F, 9.55F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 214, 395, 12.2F, 2.8F, 12.05F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 395, 219, 12.2F, 2.8F, 10.8F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 0, 327, 12.3F, 3.4F, 0.75F, 2, 1, 13, -0.001F, false));
		bone6.cubeList.add(new ModelBox(bone6, 60, 327, 12.1F, 3.4F, 0.75F, 1, 1, 13, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 391, 277, 12.2F, 2.8F, 0.55F, 2, 1, 2, -0.199F, false));

		cube_r62 = new ModelRenderer(this);
		cube_r62.setRotationPoint(-1.6F, 0.0F, -1.25F);
		bone6.addChild(cube_r62);
		setRotationAngle(cube_r62, 0.0F, 0.0F, 0.8901F);
		cube_r62.cubeList.add(new ModelBox(cube_r62, 393, 377, 10.9419F, -9.192F, 1.8F, 1, 1, 2, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 333, 106, 10.8919F, -9.042F, 2.4F, 1, 1, 12, -0.35F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 400, 270, 10.9419F, -9.192F, 12.05F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 400, 273, 10.9419F, -9.192F, 13.3F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 400, 276, 10.9419F, -9.192F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 400, 279, 10.9419F, -9.192F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 281, 400, 10.9419F, -9.192F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 400, 282, 10.9419F, -9.192F, 7.05F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 400, 285, 10.9419F, -9.192F, 5.8F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 286, 400, 10.9419F, -9.192F, 4.55F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 301, 400, 10.9419F, -9.192F, 3.35F, 1, 1, 1, -0.198F, false));

		cube_r63 = new ModelRenderer(this);
		cube_r63.setRotationPoint(0.0F, 0.0F, -1.25F);
		bone6.addChild(cube_r63);
		setRotationAngle(cube_r63, 0.0F, 0.0F, -0.8901F);
		cube_r63.cubeList.add(new ModelBox(cube_r63, 384, 393, 5.6791F, 12.568F, 1.8F, 1, 1, 2, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 333, 120, 5.7291F, 12.718F, 2.4F, 1, 1, 12, -0.35F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 306, 400, 5.6791F, 12.568F, 12.05F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 311, 400, 5.6791F, 12.568F, 13.3F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 316, 400, 5.6791F, 12.568F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 321, 400, 5.6791F, 12.568F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 336, 400, 5.6791F, 12.568F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 341, 400, 5.6791F, 12.568F, 7.05F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 346, 400, 5.6791F, 12.568F, 5.8F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 400, 359, 5.6791F, 12.568F, 4.55F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 400, 362, 5.6791F, 12.568F, 3.35F, 1, 1, 1, -0.198F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-1.4737F, -39.8631F, -46.0368F);
		handguard.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.0F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 221, 395, -0.9737F, -0.5632F, -5.4132F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 395, 222, -0.9737F, -0.5632F, -4.1632F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 228, 395, -0.9737F, -0.5632F, -2.9132F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 235, 395, -0.9737F, -0.5632F, -1.6632F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 291, 395, -0.9737F, -0.5632F, 0.8368F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 395, 353, -0.9737F, -0.5632F, -0.4132F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 395, 356, -0.9737F, -0.5632F, 3.3368F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 364, 395, -0.9737F, -0.5632F, 2.0868F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 371, 395, -0.9737F, -0.5632F, 5.8368F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 395, 381, -0.9737F, -0.5632F, 4.5868F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 395, 390, -0.9737F, -0.5632F, 8.3368F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 396, 0, -0.9737F, -0.5632F, 8.7368F, 2, 1, 1, -0.198F, false));
		bone2.cubeList.add(new ModelBox(bone2, 396, 3, -0.9737F, -0.5632F, 7.0868F, 2, 1, 1, -0.199F, false));
		bone2.cubeList.add(new ModelBox(bone2, 176, 306, -0.8737F, 0.0368F, -7.4632F, 2, 1, 17, -0.001F, false));
		bone2.cubeList.add(new ModelBox(bone2, 308, 305, -1.0737F, 0.0368F, -7.4632F, 1, 1, 17, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 391, 281, -0.9737F, -0.5632F, -7.6632F, 2, 1, 2, -0.199F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-14.7737F, -0.3632F, -12.4632F);
		bone2.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.8901F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 393, 386, 8.6105F, -11.08F, 4.8F, 1, 1, 2, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 315, 203, 8.5605F, -10.93F, 5.4F, 1, 1, 16, -0.35F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 400, 365, 8.6105F, -11.08F, 19.55F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 400, 372, 8.6105F, -11.08F, 21.2F, 1, 1, 1, -0.197F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 400, 375, 8.6105F, -11.08F, 20.8F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 376, 400, 8.6105F, -11.08F, 17.05F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 400, 378, 8.6105F, -11.08F, 18.3F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 381, 400, 8.6105F, -11.08F, 14.55F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 400, 384, 8.6105F, -11.08F, 15.8F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 386, 400, 8.6105F, -11.08F, 12.05F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 400, 387, 8.6105F, -11.08F, 13.3F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 391, 400, 8.6105F, -11.08F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 396, 400, 8.6105F, -11.08F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 401, 8.6105F, -11.08F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 401, 21, 8.6105F, -11.08F, 7.05F, 1, 1, 1, -0.198F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-13.1737F, -0.3632F, -12.4632F);
		bone2.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.8901F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 391, 393, 8.0105F, 10.68F, 4.8F, 1, 1, 2, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 315, 221, 8.0605F, 10.83F, 5.4F, 1, 1, 16, -0.35F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 401, 24, 8.0105F, 10.68F, 19.55F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 401, 27, 8.0105F, 10.68F, 21.2F, 1, 1, 1, -0.197F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 401, 30, 8.0105F, 10.68F, 20.8F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 401, 33, 8.0105F, 10.68F, 17.05F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 401, 36, 8.0105F, 10.68F, 18.3F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 401, 39, 8.0105F, 10.68F, 14.55F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 401, 42, 8.0105F, 10.68F, 15.8F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 401, 45, 8.0105F, 10.68F, 12.05F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 401, 48, 8.0105F, 10.68F, 13.3F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 401, 51, 8.0105F, 10.68F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 401, 54, 8.0105F, 10.68F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 55, 401, 8.0105F, 10.68F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 401, 57, 8.0105F, 10.68F, 7.05F, 1, 1, 1, -0.198F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		handguard.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}