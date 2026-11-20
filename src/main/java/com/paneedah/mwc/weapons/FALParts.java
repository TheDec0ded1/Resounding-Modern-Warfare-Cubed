package com.paneedah.mwc.weapons;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.init.MWCItems;
import com.paneedah.mwc.models.*;
import com.paneedah.weaponlib.*;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import org.lwjgl.opengl.GL11;

public class FALParts {
    public static ItemAttachment<Weapon> FALupperOSW;
    public static ItemAttachment<Weapon> FALbarrelOSW;
    public static ItemAttachment<Weapon> FALdustcoverOSW;
    public static ItemAttachment<Weapon> FALgripOSW;
    public static ItemAttachment<Weapon> FALhandguardOSW;
    public static ItemAttachment<Weapon> FALadapterOSW;
    public static ItemAttachment<Weapon> FALmlokOSW;
    public static ItemAttachment<Weapon> FALactionOSW;
    public static ItemAttachment<Weapon> FALhandleOSW;

    public static ItemAttachment<Weapon> FALstockACR;
    public static ItemAttachment<Weapon> FALhandguardMLOK;
    public static ItemAttachment<Weapon> FALcarryhandleWood;
    public static ItemAttachment<Weapon> FALstockWoodL1A1;
    public static ItemAttachment<Weapon> FALgripWoodL1A1;
    public static ItemAttachment<Weapon> FALhandguardWoodL1A1;
    public static ItemAttachment<Weapon> FALhandguardWoodC1A1;
    public static ItemAttachment<Weapon> FALhandguardAUS;
    public static ItemAttachment<Weapon> FALhandguardPolyL1A1;
    public static ItemAttachment<Weapon> FALgripPolyL1A1;
    public static ItemAttachment<Weapon> FALstockPolyL1A1;
    public static ItemAttachment<Weapon> FALironsC1;
    public static ItemAttachment<Weapon> FALdustcoverC1A1;
    public static ItemAttachment<Weapon> FALbarrelC1A1;
    public static ItemAttachment<Weapon> FALupperT3;
    public static ItemAttachment<Weapon> FALlowerT1;
    public static ItemAttachment<Weapon> FALhandleL1A1;

    public static ItemAttachment<Weapon> FALlowerT2;
    public static ItemAttachment<Weapon> FALupperC2;
    public static ItemAttachment<Weapon> FALdustcoverDeflector;
    public static ItemAttachment<Weapon> FALhandguardT48;
    public static ItemAttachment<Weapon> FALbarrelT48;
    public static ItemAttachment<Weapon> FALstockT48;
    public static ItemAttachment<Weapon> FALgripT48;
    public static ItemAttachment<Weapon> FALironsSTG58;
    public static ItemAttachment<Weapon> FALactionChromed;

    public static ItemAttachment<Weapon> FALupperT1;
    public static ItemAttachment<Weapon> FALOhandguard;
    public static ItemAttachment<Weapon> FALOcarryhandle;
    public static ItemAttachment<Weapon> FALObarrel;
    public static ItemAttachment<Weapon> FALgripPoly;
    public static ItemAttachment<Weapon> FALstockPoly;
    public static ItemAttachment<Weapon> FALhandguardIsraeli;
    public static ItemAttachment<Weapon> FALbarrelG1;
    public static ItemAttachment<Weapon> FALbarrelPara;
    public static ItemAttachment<Weapon> FALbipodG1;
    public static ItemAttachment<Weapon> FALhandguardSTG58;
    public static ItemAttachment<Weapon> FALironsPara;
    public static ItemAttachment<Weapon> FALhandguardWide;
    public static ItemAttachment<Weapon> FALstockPara;
    public static ItemAttachment<Weapon> FALhandle;

    public static ItemAttachment<Weapon> FALupperT2;
    public static ItemAttachment<Weapon> FALbarrelAUS;
    public static ItemAttachment<Weapon> FALbarrelSTG58;
    public static ItemAttachment<Weapon> FALbarrelR1;
    public static ItemAttachment<Weapon> FALdustcoverSmooth;
    public static ItemAttachment<Weapon> FALironsL1A1;
    public static ItemAttachment<Weapon> FALgripWooden;
    public static ItemAttachment<Weapon> FALstockSlickback;
    public static ItemAttachment<Weapon> FALhandguardR1;
    public static ItemAttachment<Weapon> FALcarryhandlePoly;

    public static void init(Object mod) {
		//Lower Receivers
	    FALlowerT1 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER2)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALlowerT1(), "fnfal2")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALlowerT1) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALlowerT1) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALlowerT1) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALlowerT1) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALlowerT1")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

	    FALlowerT2 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER2)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALlowerT2(), "fnfal4")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALlowerT2) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALlowerT2) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALlowerT2) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALlowerT2) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALlowerT2")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

			//Upper Receivers
	    FALupperT1 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALupperT1(), "fnfal3")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALupperT1) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALupperT1) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALupperT1) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALupperT1) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALupperT1")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

	    FALupperT2 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALupperT2(), "fnfal1")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALupperT2) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALupperT2) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALupperT2) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALupperT2) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALupperT2")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);
	
	    FALupperT3 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALupperT3(), "fnfal2")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALupperT3) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALupperT3) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALupperT3) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALupperT3) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALupperT3")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

	    FALupperC2 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALupperC2(), "fnfal4")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALupperC2) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALupperC2) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALupperC2) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALupperC2) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALupperC2")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

	    FALupperOSW = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALupperOSW(), "sa58osw")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALupperOSW) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALupperOSW) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALupperOSW) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALupperOSW) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALupperOSW")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

		//Barrels
        FALbarrelAUS = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALbarrelAUS(), "fnfal1")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALbarrelAUS) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALbarrelAUS) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALbarrelAUS) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALbarrelAUS) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALbarrelAUS")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        FALbarrelC1A1 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALbarrelC1A1(), "fnfal2")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALbarrelC1A1) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALbarrelC1A1) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALbarrelC1A1) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALbarrelC1A1) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALbarrelC1A1")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        FALbarrelG1 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALbarrelG1(), "fnfal3")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALbarrelG1) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALbarrelG1) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALbarrelG1) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALbarrelG1) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALbarrelG1")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        FALbarrelOSW = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALbarrelOSW(), "sa58osw")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALbarrelOSW) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALbarrelOSW) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALbarrelOSW) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALbarrelOSW) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALbarrelOSW")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        FALbarrelPara = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALbarrelPara(), "fnfal3")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALbarrelPara) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALbarrelPara) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALbarrelPara) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALbarrelPara) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALbarrelPara")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        FALbarrelR1 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALbarrelR1(), "fnfal1")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALbarrelR1) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALbarrelR1) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALbarrelR1) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALbarrelR1) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALbarrelR1")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        FALbarrelSTG58 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALbarrelSTG58(), "fnfal1")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALbarrelSTG58) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALbarrelSTG58) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALbarrelSTG58) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALbarrelSTG58) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALbarrelSTG58")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        FALbarrelT48 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALbarrelT48(), "fnfal4")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALbarrelT48) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALbarrelT48) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALbarrelT48) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALbarrelT48) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALbarrelT48")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        FALObarrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALObarrel(), "fnfal3")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALObarrel) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALObarrel) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALObarrel) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALObarrel) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALObarrel")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);
		//Handguards
        FALOhandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALOhandguard(), "fnfal3")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALOhandguard) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALOhandguard) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALOhandguard) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALOhandguard) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALOhandguard")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        FALmlokOSW = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALmlokOSW(), "sa58osw")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALmlokOSW) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALmlokOSW) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALmlokOSW) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALmlokOSW) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALmlokOSW")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        FALhandguardAUS = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALhandguardAUS(), "fnfal2")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALhandguardAUS) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALhandguardAUS) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALhandguardAUS) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALhandguardAUS) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALhandguardAUS")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        FALhandguardIsraeli = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALhandguardIsraeli(), "fnfal3")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALhandguardIsraeli) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALhandguardIsraeli) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALhandguardIsraeli) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALhandguardIsraeli) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALhandguardIsraeli")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        FALhandguardMLOK = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALhandguardMLOK(), "fnfal2")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALhandguardMLOK) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALhandguardMLOK) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALhandguardMLOK) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALhandguardMLOK) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALhandguardMLOK")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        FALhandguardOSW = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALhandguardOSW(), "sa58osw")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALhandguardOSW) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALhandguardOSW) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALhandguardOSW) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALhandguardOSW) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALhandguardOSW")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        FALhandguardPolyL1A1 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALhandguardPolyL1A1(), "fnfal2")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALhandguardPolyL1A1) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALhandguardPolyL1A1) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALhandguardPolyL1A1) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALhandguardPolyL1A1) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALhandguardPolyL1A1")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        FALhandguardR1 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALhandguardR1(), "fnfal1")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALhandguardR1) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALhandguardR1) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALhandguardR1) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALhandguardR1) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALhandguardR1")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        FALhandguardSTG58 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALhandguardSTG58(), "fnfal3")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALhandguardSTG58) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALhandguardSTG58) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALhandguardSTG58) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALhandguardSTG58) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALhandguardSTG58")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        FALhandguardT48 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALhandguardT48(), "fnfal4")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALhandguardT48) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALhandguardT48) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALhandguardT48) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALhandguardT48) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALhandguardT48")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        FALhandguardWoodC1A1 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALhandguardWoodC1A1(), "fnfal2")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALhandguardWoodC1A1) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALhandguardWoodC1A1) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALhandguardWoodC1A1) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALhandguardWoodC1A1) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALhandguardWoodC1A1")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        FALhandguardWoodL1A1 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALhandguardWoodL1A1(), "fnfal2")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALhandguardWoodL1A1) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALhandguardWoodL1A1) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALhandguardWoodL1A1) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALhandguardWoodL1A1) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALhandguardWoodL1A1")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        FALhandguardWide = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALhandguardWide(), "fnfal3")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALhandguardWide) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALhandguardWide) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALhandguardWide) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALhandguardWide) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALhandguardWide")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

		//Stocks
        FALstockACR = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCKADAPTER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALstockACR(), "fnfal2")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALstockACR) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALstockACR) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALstockACR) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALstockACR) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALstockACR")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        FALadapterOSW = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCKADAPTER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALadapterOSW(), "sa58osw")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALadapterOSW) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALadapterOSW) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALadapterOSW) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALadapterOSW) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALadapterOSW")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        FALstockPoly = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCKADAPTER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALstockPoly(), "fnfal3")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALstockPoly) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALstockPoly) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALstockPoly) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALstockPoly) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALstockPoly")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        FALstockPolyL1A1 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCKADAPTER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALstockPolyL1A1(), "fnfal2")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALstockPolyL1A1) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALstockPolyL1A1) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALstockPolyL1A1) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALstockPolyL1A1) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALstockPolyL1A1")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        FALstockSlickback = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCKADAPTER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALstockSlickback(), "fnfal1")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALstockSlickback) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALstockSlickback) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALstockSlickback) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALstockSlickback) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALstockSlickback")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        FALstockT48 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCKADAPTER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALstockT48(), "fnfal4")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALstockT48) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALstockT48) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALstockT48) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALstockT48) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALstockT48")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        FALstockWoodL1A1 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCKADAPTER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALstockWoodL1A1(), "fnfal2")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALstockWoodL1A1) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALstockWoodL1A1) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALstockWoodL1A1) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALstockWoodL1A1) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALstockWoodL1A1")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        FALstockPara = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCKADAPTER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALstockPara(), "fnfal3")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALstockPara) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALstockPara) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALstockPara) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALstockPara) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALstockPara")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

		//Dustcovers
	    FALdustcoverC1A1= new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALdustcoverC1A1(), "fnfal2")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALdustcoverC1A1) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALdustcoverC1A1) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALdustcoverC1A1) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALdustcoverC1A1) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALdustcoverC1A1")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

	    FALdustcoverDeflector= new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALdustcoverDeflector(), "fnfal4")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALdustcoverDeflector) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALdustcoverDeflector) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALdustcoverDeflector) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALdustcoverDeflector) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALdustcoverDeflector")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

	    FALdustcoverOSW= new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALdustcoverOSW(), "sa58osw")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALdustcoverOSW) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALdustcoverOSW) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALdustcoverOSW) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALdustcoverOSW) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALdustcoverOSW")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

	    FALdustcoverSmooth= new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALdustcoverSmooth(), "fnfal1")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALdustcoverSmooth) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALdustcoverSmooth) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALdustcoverSmooth) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALdustcoverSmooth) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALdustcoverSmooth")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

		//Carryhandles
	    FALOcarryhandle= new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALOcarryhandle(), "fnfal3")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALOcarryhandle) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALOcarryhandle) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALOcarryhandle) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALOcarryhandle) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALOcarryhandle")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

	    FALcarryhandlePoly= new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALcarryhandlePoly(), "fnfal1")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALcarryhandlePoly) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALcarryhandlePoly) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALcarryhandlePoly) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALcarryhandlePoly) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALcarryhandlePoly")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

	    FALcarryhandleWood= new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALcarryhandleWood(), "fnfal2")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALcarryhandleWood) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALcarryhandleWood) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALcarryhandleWood) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALcarryhandleWood) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALcarryhandleWood")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

		//Grips
        FALgripOSW = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALgripOSW(), "sa58osw")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALgripOSW) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALgripOSW) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALgripOSW) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALgripOSW) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALgripOSW")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        FALgripPoly = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALgripPoly(), "fnfal3")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALgripPoly) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALgripPoly) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALgripPoly) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALgripPoly) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALgripPoly")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        FALgripPolyL1A1 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALgripPolyL1A1(), "fnfal2")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALgripPolyL1A1) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALgripPolyL1A1) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALgripPolyL1A1) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALgripPolyL1A1) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALgripPolyL1A1")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        FALgripT48 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALgripT48(), "fnfal4")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALgripT48) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALgripT48) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALgripT48) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALgripT48) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALgripT48")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        FALgripWoodL1A1 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALgripWoodL1A1(), "fnfal2")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALgripWoodL1A1) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALgripWoodL1A1) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALgripWoodL1A1) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALgripWoodL1A1) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALgripWoodL1A1")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        FALgripWooden = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALgripWooden(), "fnfal1")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALgripWooden) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALgripWooden) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALgripWooden) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALgripWooden) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALgripWooden")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

		//Actions
        FALactionChromed = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.ACTION)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALactionChromed(), "fnfal4")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALactionChromed) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALactionChromed) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALactionChromed) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALactionChromed) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALactionChromed").withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);

        FALactionOSW = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.ACTION)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALactionOSW(), "sa58osw")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALactionOSW) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALactionOSW) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALactionOSW) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALactionOSW) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALactionOSW").withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);

		//Charging Handles
        FALhandle = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.HANDLE)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALhandle(), "fnfal3")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALhandle) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALhandle) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALhandle) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALhandle) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALhandle").withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);

        FALhandleL1A1 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.HANDLE)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALhandleL1A1(), "fnfal2")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALhandleL1A1) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALhandleL1A1) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALhandleL1A1) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALhandleL1A1) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALhandleL1A1").withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);

        FALhandleOSW = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.HANDLE)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALhandleOSW(), "sa58osw")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALhandleOSW) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALhandleOSW) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALhandleOSW) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALhandleOSW) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALhandleOSW").withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);

		//Rear Sights
	    FALironsC1= new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.REARSIGHT)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALironsC1(), "fnfal2")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALironsC1) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALironsC1) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALironsC1) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALironsC1) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALironsC1")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

	    FALironsL1A1= new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.REARSIGHT)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALironsL1A1(), "fnfal1")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALironsL1A1) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALironsL1A1) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALironsL1A1) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALironsL1A1) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALironsL1A1")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

	    FALironsPara= new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.REARSIGHT)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALironsPara(), "fnfal3")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALironsPara) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALironsPara) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALironsPara) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALironsPara) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALironsPara")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

	    FALironsSTG58= new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.REARSIGHT)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALironsSTG58(), "fnfal4")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALironsSTG58) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALironsSTG58) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALironsSTG58) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALironsSTG58) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALironsSTG58")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);
               
	    FALbipodG1= new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.DECOR)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALbipodG1(), "fnfal3")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALbipodG1) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALbipodG1) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALbipodG1) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FALbipodG1) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FALbipodG1")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

    }
}