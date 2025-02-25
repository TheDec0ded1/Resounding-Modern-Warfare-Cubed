package com.paneedah.mwc.equipment;

import com.paneedah.mwc.MWC;
import com.paneedah.weaponlib.ItemVest;
import com.paneedah.weaponlib.ModContext;
import com.paneedah.mwc.rendering.Transform;
import org.lwjgl.opengl.GL11;

public class Vests {

    public static void createEquipment(ModContext modContext) {

        new ItemVest.Builder()
                .withName("m43a_chest_harness")
                .withPercentDamageBlocked(0.1)
                .withDurability(150)
                .withTab(MWC.EQUIPMENT_TAB)
                .withProperModel("com.paneedah.mwc.models.M43AChestHarness", "m43achestharness.png")
//        .withCustomEquippedPositioning(() -> {
//            GL11.glScalef(0.8f, 0.8f, 0.8f);
//            GL11.glTranslatef(0f, 0f, 0f);
//            GL11.glRotatef(0F, 0f, 0f, 1f);
//        })
                .withInventoryPositioning(() -> {
                    new Transform()
                            .withPosition(-0.15F, -4, -0.25F)
                            .withRotation(-15, 150, 0)
                            .withScale(3, 3, 3)
                            .applyTransformations();
                })
                .build(modContext);

        new ItemVest.Builder()
                .withName("flyye_field_compact_plate_carrier")
                .withPercentDamageBlocked(0.2)
                .withDurability(175)
                .withTab(MWC.EQUIPMENT_TAB)
                .withProperModel("com.paneedah.mwc.models.MollePlateCarrier", "molleplatecarrier.png")
//        .withCustomEquippedPositioning(() -> {
//            GL11.glScalef(0.8f, 0.8f, 0.8f);
//            GL11.glTranslatef(0f, 0f, 0f);
//            GL11.glRotatef(0F, 0f, 0f, 1f);
//        })
                .withInventoryPositioning(() -> {
                    new Transform()
                            .withPosition(-0.15F, -3.9F, -0.25F)
                            .withRotation(-15, 150, 0)
                            .withScale(3, 3, 3)
                            .applyTransformations();
                })
                .build(MWC.modContext);

        new ItemVest.Builder()
                .withName("molle_black")
                .withPercentDamageBlocked(0.2)
                .withDurability(175)
                .withTab(MWC.EQUIPMENT_TAB)
                .withProperModel("com.paneedah.mwc.models.MollePlateCarrier", "molleplatecarrier_black.png")
//        .withCustomEquippedPositioning(() -> {
//            GL11.glScalef(0.8f, 0.8f, 0.8f);
//            GL11.glTranslatef(0f, 0f, 0f);
//            GL11.glRotatef(0F, 0f, 0f, 1f);
//        })
                .withInventoryPositioning(() -> {
                    new Transform()
                            .withPosition(-0.15F, -3.9F, -0.25F)
                            .withRotation(-15, 150, 0)
                            .withScale(3, 3, 3)
                            .applyTransformations();
                })
                .build(modContext);

        new ItemVest.Builder()
                .withName("molle_green")
                .withPercentDamageBlocked(0.2)
                .withDurability(175)
                .withTab(MWC.EQUIPMENT_TAB)
                .withProperModel("com.paneedah.mwc.models.MollePlateCarrier", "molleplatecarrier_green.png")
//        .withCustomEquippedPositioning(() -> {
//            GL11.glScalef(0.8f, 0.8f, 0.8f);
//            GL11.glTranslatef(0f, 0f, 0f);
//            GL11.glRotatef(0F, 0f, 0f, 1f);
//        })
                .withInventoryPositioning(() -> {
                    new Transform()
                            .withPosition(-0.15F, -3.9F, -0.25F)
                            .withRotation(-15, 150, 0)
                            .withScale(3, 3, 3)
                            .applyTransformations();
                })
                .build(modContext);

        new ItemVest.Builder()
                .withName("molle_urban")
                .withPercentDamageBlocked(0.2)
                .withDurability(175)
                .withTab(MWC.EQUIPMENT_TAB)
                .withProperModel("com.paneedah.mwc.models.MollePlateCarrier", "molleplatecarrier_urban.png")
//        .withCustomEquippedPositioning(() -> {
//            GL11.glScalef(0.8f, 0.8f, 0.8f);
//            GL11.glTranslatef(0f, 0f, 0f);
//            GL11.glRotatef(0F, 0f, 0f, 1f);
//        })
                .withInventoryPositioning(() -> {
                    new Transform()
                            .withPosition(-0.15F, -3.9F, -0.25F)
                            .withRotation(-15, 150, 0)
                            .withScale(3, 3, 3)
                            .applyTransformations();
                })
                .build(modContext);

        new ItemVest.Builder()
                .withName("swat_vest")
                .withPercentDamageBlocked(0.3)
                .withDurability(250)
                .withTab(MWC.EQUIPMENT_TAB)
                .withProperModel("com.paneedah.mwc.models.UTG547Vest", "utg547vest.png")
                .withCustomEquippedPositioning(() -> {
                    GL11.glScalef(0.8f, 0.8f, 0.8f);
                    GL11.glTranslatef(0f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                })
                .withInventoryPositioning(() -> {
                    new Transform()
                            .withPosition(-0.15F, -3.9F, -0.25F)
                            .withRotation(-15, 150, 0)
                            .withScale(3, 3, 3)
                            .applyTransformations();
                })
                .build(modContext);

        new ItemVest.Builder()
                .withName("usMC_vest")
                .withPercentDamageBlocked(0.4)
                .withDurability(250)
                .withTab(MWC.EQUIPMENT_TAB)
                .withProperModel("com.paneedah.mwc.models.USMCVest", "usMC.png")
//        .withModelTextureName("usMC.png")
//        .withCustomEquippedPositioning(() -> {
//            GL11.glScalef(0.8f, 0.8f, 0.8f);
//            GL11.glTranslatef(0f, 0f, 0f);
//            GL11.glRotatef(0F, 0f, 0f, 1f);
//        })
                .withEntityPositioning(() -> new Transform()
                        .withPosition(-0.5F, -1.9F, 0.5F)
                        .withScale(1, 1, 1)
                        .applyTransformations())
                .withInventoryPositioning(() -> {
                    new Transform()
                            .withPosition(-0.15F, -3.6F, -0.25F)
                            .withRotation(-15, 150, 0)
                            .withScale(2.6F, 2.6F, 2.6F)
                            .applyTransformations();
                })
                .build(modContext);

        new ItemVest.Builder()
                .withName("usMC_vest_black")
//        .withDamageReduceAmount(8) // use numbers from 1 to 8
                .withPercentDamageBlocked(0.4)
                .withDurability(250) // works the same way as shield's max capacity
                .withTab(MWC.EQUIPMENT_TAB)
                .withProperModel("com.paneedah.mwc.models.USMCVest", "usMCvestblack.png")
//        .withModelTextureName("usMC.png")
//        .withCustomEquippedPositioning(() -> {
//            GL11.glScalef(0.8f, 0.8f, 0.8f);
//            GL11.glTranslatef(0f, 0f, 0f);
//            GL11.glRotatef(0F, 0f, 0f, 1f);
//        })
                .withEntityPositioning(() -> new Transform()
                        .withPosition(-0.5F, -1.9F, 0.5F)
                        .withScale(1, 1, 1)
                        .applyTransformations())
                .withInventoryPositioning(() -> {
                    new Transform()
                            .withPosition(-0.15F, -3.6F, -0.25F)
                            .withRotation(-15, 150, 0)
                            .withScale(2.6F, 2.6F, 2.6F)
                            .applyTransformations();
                })
                .build(modContext);

        new ItemVest.Builder()
                .withName("usMC_vest_green")
//        .withDamageReduceAmount(8) // use numbers from 1 to 8
                .withPercentDamageBlocked(0.4)
                .withDurability(250) // works the same way as shield's max capacity
                .withTab(MWC.EQUIPMENT_TAB)
                .withProperModel("com.paneedah.mwc.models.USMCVest", "militaryuniformforest.png")
//        .withModelTextureName("usMC.png")
//        .withCustomEquippedPositioning(() -> {
//            GL11.glScalef(0.8f, 0.8f, 0.8f);
//            GL11.glTranslatef(0f, 0f, 0f);
//            GL11.glRotatef(0F, 0f, 0f, 1f);
//        })
                .withEntityPositioning(() -> new Transform()
                        .withPosition(-0.5F, -1.9F, 0.5F)
                        .withScale(1, 1, 1)
                        .applyTransformations())
                .withInventoryPositioning(() -> {
                    new Transform()
                            .withPosition(-0.15F, -3.6F, -0.25F)
                            .withRotation(-15, 150, 0)
                            .withScale(2.6F, 2.6F, 2.6F)
                            .applyTransformations();
                })
                .build(modContext);

        new ItemVest.Builder()
                .withName("usMC_vest_urban")
//        .withDamageReduceAmount(8) // use numbers from 1 to 8
                .withPercentDamageBlocked(0.4)
                .withDurability(250) // works the same way as shield's max capacity
                .withTab(MWC.EQUIPMENT_TAB)
                .withProperModel("com.paneedah.mwc.models.USMCVest", "militaryuniformurban.png")
//        .withModelTextureName("usMC.png")
//        .withCustomEquippedPositioning(() -> {
//            GL11.glScalef(0.8f, 0.8f, 0.8f);
//            GL11.glTranslatef(0f, 0f, 0f);
//            GL11.glRotatef(0F, 0f, 0f, 1f);
//        })
                .withEntityPositioning(() -> new Transform()
                        .withPosition(-0.5F, -1.9F, 0.5F)
                        .withScale(1, 1, 1)
                        .applyTransformations())
                .withInventoryPositioning(() -> {
                    new Transform()
                            .withPosition(-0.15F, -3.6F, -0.25F)
                            .withRotation(-15, 150, 0)
                            .withScale(2.6F, 2.6F, 2.6F)
                            .applyTransformations();
                })
                .build(modContext);
    }
}
