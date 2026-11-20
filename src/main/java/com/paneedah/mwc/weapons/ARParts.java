package com.paneedah.mwc.weapons;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.init.MWCItems;
import com.paneedah.mwc.models.*;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import com.paneedah.weaponlib.crafting.CraftingGroup;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import org.lwjgl.opengl.GL11;

public class ARParts {
    //Lower Recievers
    public static ItemAttachment<Weapon> N4Lower;
    public static ItemAttachment<Weapon> N4LowerTan;
    public static ItemAttachment<Weapon> N4LowerBlack;
    public static ItemAttachment<Weapon> N4PDWLower;
    public static ItemAttachment<Weapon> N4PDWLowerTan;
    public static ItemAttachment<Weapon> N4PDWLowerBlack;
    public static ItemAttachment<Weapon> DDLower;
    public static ItemAttachment<Weapon> M4Lower;
    public static ItemAttachment<Weapon> M16A1Lower;
    public static ItemAttachment<Weapon> M16Lower;
    public static ItemAttachment<Weapon> XM16Lower;
    public static ItemAttachment<Weapon> M27IARLower;
    public static ItemAttachment<Weapon> HK416DLower;
    public static ItemAttachment<Weapon> HK416A5Lower;
    public static ItemAttachment<Weapon> HK416A5LowerRAL;
    public static ItemAttachment<Weapon> QHoneyBadgerLower;
    public static ItemAttachment<Weapon> QHoneyBadgerLowerBlu;
    public static ItemAttachment<Weapon> QHoneyBadgerLowerGry;
    public static ItemAttachment<Weapon> QHoneyBadgerLowerBlk;

    public static ItemAttachment<Weapon> M110Lower;
    public static ItemAttachment<Weapon> Mk11Lower;
    //Upper Recievers
    public static ItemAttachment<Weapon> N4Upper;
    public static ItemAttachment<Weapon> N4UpperTan;
    public static ItemAttachment<Weapon> N4UpperBlack;
    public static ItemAttachment<Weapon> N4PDWUpper;
    public static ItemAttachment<Weapon> N4PDWUpperTan;
    public static ItemAttachment<Weapon> N4PDWUpperBlack;
    public static ItemAttachment<Weapon> DDUpper;
    public static ItemAttachment<Weapon> M4Upper;
    public static ItemAttachment<Weapon> M16A2Upper;
    public static ItemAttachment<Weapon> C7Upper;
    public static ItemAttachment<Weapon> M16A1Upper;
    public static ItemAttachment<Weapon> M16Upper;
    public static ItemAttachment<Weapon> LR300Upper;
    public static ItemAttachment<Weapon> M27IARUpper;
    public static ItemAttachment<Weapon> HK416DUpper;
    public static ItemAttachment<Weapon> HK416A5Upper;
    public static ItemAttachment<Weapon> HK416A5UpperRAL;
    public static ItemAttachment<Weapon> QHoneyBadgerUpper;
    public static ItemAttachment<Weapon> QHoneyBadgerUpperBlu;
    public static ItemAttachment<Weapon> QHoneyBadgerUpperGry;
    public static ItemAttachment<Weapon> QHoneyBadgerUpperBlk;
    public static ItemAttachment<Weapon> QHoneyBadgerUpperSlick;
    public static ItemAttachment<Weapon> QHoneyBadgerUpperSlickBlu;
    public static ItemAttachment<Weapon> QHoneyBadgerUpperSlickGry;
    public static ItemAttachment<Weapon> QHoneyBadgerUpperSlickBlk;

    public static ItemAttachment<Weapon> M110Upper;
    public static ItemAttachment<Weapon> Mk11Upper;
    //Barrels
    public static ItemAttachment<Weapon> ARBarrel795;
    public static ItemAttachment<Weapon> ARBarrel115;
    public static ItemAttachment<Weapon> ARBarrel145;
    public static ItemAttachment<Weapon> N4PDWBarrel795;
    public static ItemAttachment<Weapon> N4PDWBarrel105;
    public static ItemAttachment<Weapon> M4Barrel145;
    public static ItemAttachment<Weapon> M4Barrel103;
    public static ItemAttachment<Weapon> M16A2Barrel701;
    public static ItemAttachment<Weapon> M16Barrel602;
    public static ItemAttachment<Weapon> M16Barrel605;
    public static ItemAttachment<Weapon> M16Barrel606;
    public static ItemAttachment<Weapon> M16A1Barrel613;
    public static ItemAttachment<Weapon> LR300Barrel115;
    public static ItemAttachment<Weapon> LR300Barrel16;
    public static ItemAttachment<Weapon> HK416CBarrel;
    public static ItemAttachment<Weapon> HK416Barrel145;
    public static ItemAttachment<Weapon> HK416Barrel115;
    public static ItemAttachment<Weapon> M27IARBarrel;
    public static ItemAttachment<Weapon> HK416A5Barrel115;
    public static ItemAttachment<Weapon> HK416A5Barrel125;
    public static ItemAttachment<Weapon> HK416A5Barrel16;
    public static ItemAttachment<Weapon> HK237Barrel;
    public static ItemAttachment<Weapon> QHoneyBadgerBarrel795;
    public static ItemAttachment<Weapon> QHoneyBadgerBarrel105;

    public static ItemAttachment<Weapon> SR25Barrel;
    public static ItemAttachment<Weapon> Mk11Barrel;
    public static ItemAttachment<Weapon> M110Barrel;
    //Handguards
    public static ItemAttachment<Weapon> N4Handguard795;
    public static ItemAttachment<Weapon> N4Handguard115;
    public static ItemAttachment<Weapon> N4Handguard145;
    public static ItemAttachment<Weapon> N4Handguard795Tan;
    public static ItemAttachment<Weapon> N4Handguard115Tan;
    public static ItemAttachment<Weapon> N4Handguard145Tan;
    public static ItemAttachment<Weapon> N4Handguard795Black;
    public static ItemAttachment<Weapon> N4Handguard115Black;
    public static ItemAttachment<Weapon> N4Handguard145Black;
    public static ItemAttachment<Weapon> N4PDWHandguard795;
    public static ItemAttachment<Weapon> N4PDWHandguard105;
    public static ItemAttachment<Weapon> N4PDWHandguard795Tan;
    public static ItemAttachment<Weapon> N4PDWHandguard105Tan;
    public static ItemAttachment<Weapon> N4PDWHandguard795Black;
    public static ItemAttachment<Weapon> N4PDWHandguard105Black;
    public static ItemAttachment<Weapon> RIS3_145;
    public static ItemAttachment<Weapon> RIS2_115;
    public static ItemAttachment<Weapon> M4RIS;
    public static ItemAttachment<Weapon> M4A1Handguard;
    public static ItemAttachment<Weapon> M16A2Handguard;
    public static ItemAttachment<Weapon> XM16Handguard;
    public static ItemAttachment<Weapon> LR300Handguard;
    public static ItemAttachment<Weapon> HK416CHandguard;
    public static ItemAttachment<Weapon> HK416DHandguard;
    public static ItemAttachment<Weapon> M27IARHandguard;
    public static ItemAttachment<Weapon> HK416A5Handguard;
    public static ItemAttachment<Weapon> HK416A5HandguardRAL;
    public static ItemAttachment<Weapon> HK416A5HKeyHandguard;
    public static ItemAttachment<Weapon> HK416A5HKeyHandguardRAL;
    public static ItemAttachment<Weapon> HK237Handguard;
    public static ItemAttachment<Weapon> HK237HandguardRAL;
    public static ItemAttachment<Weapon> QHoneyBadgerHG795;
    public static ItemAttachment<Weapon> QHoneyBadgerHG105;
    public static ItemAttachment<Weapon> QHoneyBadgerHGSD;
    public static ItemAttachment<Weapon> QHoneyBadgerHG795Blk;
    public static ItemAttachment<Weapon> QHoneyBadgerHG105Blk;
    public static ItemAttachment<Weapon> QHoneyBadgerHGSDBlk;

    public static ItemAttachment<Weapon> M110Handguard;
    public static ItemAttachment<Weapon> Mk11Handguard;
    public static ItemAttachment<Weapon> SR25Handguard;
    //Extensions & One-Piece Stocks
    public static ItemAttachment<Weapon> M4BufferTube;
    public static ItemAttachment<Weapon> M16BufferTube;
    public static ItemAttachment<Weapon> M16A2BufferTube;
	public static ItemAttachment<Weapon> ARPistolBufferTube;
    public static ItemAttachment<Weapon> AngstadtSCW_Stock;
    public static ItemAttachment<Weapon> MaximSCW_Stock;
    public static ItemAttachment<Weapon> MaximCCS_Stock;
    public static ItemAttachment<Weapon> LR300Adapter;
    public static ItemAttachment<Weapon> M27IARBufferTube;
    public static ItemAttachment<Weapon> HK416A5BufferTube;
    public static ItemAttachment<Weapon> HK416C_Stock;
    public static ItemAttachment<Weapon> QHoneyBadgerStockOpen;
    public static ItemAttachment<Weapon> QHoneyBadgerStockClosed;
    public static ItemAttachment<Weapon> QHoneyBadgerStockOpenBlkout;
    public static ItemAttachment<Weapon> QHoneyBadgerStockClosedBlkout;

    public static ItemAttachment<Weapon> M110Extension;
    //Grips
    public static ItemAttachment<Weapon> DDGrip;
    public static ItemAttachment<Weapon> M4PistolGrip;
    public static ItemAttachment<Weapon> M16PistolGrip;
	public static ItemAttachment<Weapon> LMG68Grip;
	public static ItemAttachment<Weapon> CQGrip;
	public static ItemAttachment<Weapon> M4GripTan;
	public static ItemAttachment<Weapon> M4GripGray;
	public static ItemAttachment<Weapon> HK416Grip;
	public static ItemAttachment<Weapon> HK416GripTan;
	public static ItemAttachment<Weapon> HK416CGripTan;
	public static ItemAttachment<Weapon> HK433GripTan;
	public static ItemAttachment<Weapon> HK416A8GripTan;
	public static ItemAttachment<Weapon> HK416CGrip;
	public static ItemAttachment<Weapon> HK433Grip;
	public static ItemAttachment<Weapon> HK416A8Grip;
	public static ItemAttachment<Weapon> M110Grip;
    public static ItemAttachment<Weapon> LR300Grip;
    //Stocks
    public static ItemAttachment<Weapon> DDStock;
    public static ItemAttachment<Weapon> M4Stock;
    public static ItemAttachment<Weapon> M16A2Stock;
    public static ItemAttachment<Weapon> XM16Stock;
    public static ItemAttachment<Weapon> HKChunkyStock;
    public static ItemAttachment<Weapon> HKSlimlineStock;
    public static ItemAttachment<Weapon> HKCheekpieceStock;
    public static ItemAttachment<Weapon> HKChunkyStockTan;
    public static ItemAttachment<Weapon> HKSlimlineStockTan;
    public static ItemAttachment<Weapon> HKCheekpieceStockTan;
    public static ItemAttachment<Weapon> LR300SkeleStock;
    public static ItemAttachment<Weapon> LR300GalilStock;

    public static ItemAttachment<Weapon> M110Stock;
    //Bolts & Charging Handles
    public static ItemAttachment<Weapon> M4ChargingHandle;
    public static ItemAttachment<Weapon> DDChargingHandle;
    public static ItemAttachment<Weapon> M16ChargingHandle;
    public static ItemAttachment<Weapon> OversizeLatchChargingHandle;
    public static ItemAttachment<Weapon> QHoneyBadgerHandle;
    public static ItemAttachment<Weapon> M4Action;
    public static ItemAttachment<Weapon> M16Action;
    public static ItemAttachment<Weapon> LR300Action;
    public static ItemAttachment<Weapon> QHoneyBadgerAction;

    public static ItemAttachment<Weapon> M110Handle;
    public static ItemAttachment<Weapon> M110Action;
	//Additional Parts
    public static ItemAttachment<Weapon> LR300Rails;
    public static ItemAttachment<Weapon> LR300Foregrip;
    public static ItemAttachment<Weapon> LR300Frontsight;
    public static ItemAttachment<Weapon> Mk11Frontsight;
    public static ItemAttachment<Weapon> Mk11FrontsightDown;

    public static ItemAttachment<Weapon> QHoneyBadgerSilencerSD;
    public static ItemAttachment<Weapon> M110Silencer;
    public static ItemAttachment<Weapon> M110SideCovers;
    public static ItemAttachment<Weapon> M110LowerCover;


    public static void init(Object mod) {
        //Lower Receivers
	    N4Lower = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.N4Lower(), "novesken4green")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Lower) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Lower) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Lower) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Lower) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("N4Lower")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

	    N4LowerTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.N4Lower(), "novesken4tan")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Lower) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Lower) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Lower) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Lower) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("N4LowerTan")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

	    N4LowerBlack = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.N4Lower(), "novesken4black")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Lower) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Lower) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Lower) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Lower) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("N4LowerBlack")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

	    N4PDWLower = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.N4PDWLower(), "novesken4pdwgreen")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4PDWLower) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4PDWLower) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4PDWLower) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4PDWLower) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("N4PDWLower")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

	    N4PDWLowerTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.N4PDWLower(), "novesken4pdwtan")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4PDWLower) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4PDWLower) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4PDWLower) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4PDWLower) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("N4PDWLowerTan")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

	    N4PDWLowerBlack = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.N4PDWLower(), "novesken4pdwblack")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4PDWLower) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4PDWLower) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4PDWLower) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4PDWLower) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("N4PDWLowerBlack")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        DDLower = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.DDLower(), "mk18")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.DDLower) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.DDLower) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.DDLower) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.DDLower) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("DDLower")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        M4Lower = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M4Lower(), "m4new")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M4Lower) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M4Lower) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M4Lower) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M4Lower) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M4Lower")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        M16Lower = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M16Lower(), "m16")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16Lower) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16Lower) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16Lower) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16Lower) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M16Lower")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        M16A1Lower = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M16A1Lower(), "m16")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16A1Lower) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16A1Lower) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16A1Lower) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16A1Lower) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M16A1Lower")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        XM16Lower = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.XM16Lower(), "m16")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.XM16Lower) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.XM16Lower) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.XM16Lower) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.XM16Lower) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("XM16Lower")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        M27IARLower = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M27IAR_Lower(), "m27iar")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M27IAR_Lower) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M27IAR_Lower) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M27IAR_Lower) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M27IAR_Lower) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M27IARLower")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        HK416DLower = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.HK416D_Lower(), "hk416d")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416D_Lower) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416D_Lower) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416D_Lower) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416D_Lower) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("HK416DLower")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        HK416A5Lower = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.HK416A5Lower(), "hk416a5")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416A5Lower) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416A5Lower) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416A5Lower) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416A5Lower) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("HK416A5Lower")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        HK416A5LowerRAL = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.HK416A5Lower(), "hk416a5ral")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416A5Lower) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416A5Lower) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416A5Lower) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416A5Lower) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("HK416A5LowerRAL")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        QHoneyBadgerLower = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QHoneyBadgerLower(), "qhoneybadger")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerLower) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerLower) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerLower) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerLower) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QHoneyBadgerLower")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        QHoneyBadgerLowerGry = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QHoneyBadgerLower(), "qhoneybadgergray")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerLower) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerLower) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerLower) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerLower) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QHoneyBadgerLowerGry")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        QHoneyBadgerLowerBlk = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QHoneyBadgerLower(), "qhoneybadgerblack")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerLower) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerLower) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerLower) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerLower) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QHoneyBadgerLowerBlk")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        QHoneyBadgerLowerBlu = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QHoneyBadgerLower(), "qhoneybadgerblue")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerLower) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerLower) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerLower) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerLower) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QHoneyBadgerLowerBlu")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

		//AR10 Divider
        M110Lower = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M110Lower(), "m110sass")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M110Lower) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M110Lower) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M110Lower) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M110Lower) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M110Lower")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        Mk11Lower = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Mk11Lower(), "mk11")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mk11Lower) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mk11Lower) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mk11Lower) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mk11Lower) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("Mk11Lower")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);
        //Upper Receivers
	    M4Upper = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER2)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M4Upper(), "m4new")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M4Upper) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M4Upper) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M4Upper) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M4Upper) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M4Upper")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        N4Upper = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER2)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.N4Upper(), "novesken4green")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Upper) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Upper) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Upper) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Upper) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("N4Upper")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        N4UpperTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER2)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.N4Upper(), "novesken4tan")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Upper) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Upper) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Upper) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Upper) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("N4UpperTan")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        N4UpperBlack = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER2)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.N4Upper(), "novesken4black")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Upper) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Upper) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Upper) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Upper) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("N4UpperBlack")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        N4PDWUpper = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER2)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.N4PDWUpper(), "novesken4pdwgreen")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4PDWUpper) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4PDWUpper) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4PDWUpper) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4PDWUpper) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("N4PDWUpper")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        N4PDWUpperTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER2)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.N4PDWUpper(), "novesken4pdwtan")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4PDWUpper) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4PDWUpper) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4PDWUpper) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4PDWUpper) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("N4PDWUpperTan")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        N4PDWUpperBlack = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER2)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.N4PDWUpper(), "novesken4pdwblack")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4PDWUpper) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4PDWUpper) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4PDWUpper) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4PDWUpper) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("N4PDWUpperBlack")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        DDUpper = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER2)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.DDUpper(), "mk18")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.DDUpper) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.DDUpper) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.DDUpper) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.DDUpper) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("DDUpper")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        M16A2Upper = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER2)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M16A2Upper(), "m16a2")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16A2Upper) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16A2Upper) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16A2Upper) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16A2Upper) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M16A2Upper")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        M16A1Upper = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER2)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M16A1Upper(), "m16")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16A1Upper) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16A1Upper) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16A1Upper) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16A1Upper) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M16A1Upper")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        M16Upper = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER2)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M16Upper(), "m16")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16Upper) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16Upper) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16Upper) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16Upper) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M16Upper")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        C7Upper = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER2)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.C7Upper(), "m16")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.C7Upper) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.C7Upper) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.C7Upper) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.C7Upper) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("C7Upper")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        LR300Upper = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER2)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.LR300Upper(), "zm_lr300")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LR300Upper) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LR300Upper) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LR300Upper) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LR300Upper) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("LR300Upper")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        M27IARUpper = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER2)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M27IAR_Upper(), "m27iar")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M27IAR_Upper) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M27IAR_Upper) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M27IAR_Upper) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M27IAR_Upper) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M27IARUpper")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        HK416DUpper = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER2)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.HK416D_Upper(), "hk416d")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416D_Upper) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416D_Upper) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416D_Upper) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416D_Upper) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("HK416DUpper")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        HK416A5Upper = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER2)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.HK416A5Upper(), "hk416a5")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416A5Upper) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416A5Upper) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416A5Upper) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416A5Upper) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("HK416A5Upper")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        HK416A5UpperRAL = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER2)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.HK416A5Upper(), "hk416a5ral")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416A5Upper) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416A5Upper) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416A5Upper) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416A5Upper) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("HK416A5UpperRAL")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        QHoneyBadgerUpper = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER2)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QHoneyBadgerUpper(), "qhoneybadger")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerUpper) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerUpper) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerUpper) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerUpper) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QHoneyBadgerUpper")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        QHoneyBadgerUpperSlick = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER2)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QHoneyBadgerUpperSlick(), "qhoneybadger")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerUpperSlick) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerUpperSlick) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerUpperSlick) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerUpperSlick) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QHoneyBadgerUpperSlick")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        QHoneyBadgerUpperBlk = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER2)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QHoneyBadgerUpper(), "qhoneybadgerblack")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerUpper) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerUpper) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerUpper) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerUpper) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QHoneyBadgerUpperBlk")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        QHoneyBadgerUpperSlickBlk = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER2)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QHoneyBadgerUpperSlick(), "qhoneybadgerblack")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerUpperSlick) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerUpperSlick) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerUpperSlick) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerUpperSlick) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QHoneyBadgerUpperSlickBlk")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        QHoneyBadgerUpperBlu = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER2)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QHoneyBadgerUpper(), "qhoneybadgerblue")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerUpper) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerUpper) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerUpper) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerUpper) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QHoneyBadgerUpperBlu")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        QHoneyBadgerUpperSlickBlu = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER2)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QHoneyBadgerUpperSlick(), "qhoneybadgerblue")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerUpperSlick) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerUpperSlick) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerUpperSlick) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerUpperSlick) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QHoneyBadgerUpperSlickBlu")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        QHoneyBadgerUpperGry = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER2)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QHoneyBadgerUpper(), "qhoneybadgergray")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerUpper) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerUpper) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerUpper) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerUpper) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QHoneyBadgerUpperGry")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        QHoneyBadgerUpperSlickGry = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER2)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QHoneyBadgerUpperSlick(), "qhoneybadgergray")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerUpperSlick) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerUpperSlick) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerUpperSlick) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerUpperSlick) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QHoneyBadgerUpperSlickGry")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

		//AR10 Divider
        M110Upper = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER2)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M110Upper(), "m110sass")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M110Upper) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M110Upper) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M110Upper) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M110Upper) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M110Upper")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        Mk11Upper = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER2)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Mk11Upper(), "mk11")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mk11Upper) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mk11Upper) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mk11Upper) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mk11Upper) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("Mk11Upper")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);
        //Barrels
        ARBarrel795 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.ARBarrel795(), "novesken4green")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ARBarrel795) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ARBarrel795) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ARBarrel795) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ARBarrel795) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("ARBarrel795")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        N4PDWBarrel795 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.N4PDWBarrel795(), "novesken4pdwgreen")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4PDWBarrel795) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4PDWBarrel795) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4PDWBarrel795) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4PDWBarrel795) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("N4PDWBarrel795")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        N4PDWBarrel105 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.N4PDWBarrel105(), "novesken4pdwgreen")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4PDWBarrel105) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4PDWBarrel105) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4PDWBarrel105) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4PDWBarrel105) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("N4PDWBarrel105")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        ARBarrel115 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.ARBarrel115(), "mk18")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ARBarrel115) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ARBarrel115) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ARBarrel115) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ARBarrel115) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("ARBarrel115")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        ARBarrel145 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.ARBarrel145(), "mk18")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ARBarrel145) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ARBarrel145) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ARBarrel145) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ARBarrel145) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("ARBarrel145")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        M4Barrel145 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M4Barrel145(), "m4new")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M4Barrel145) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M4Barrel145) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M4Barrel145) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M4Barrel145) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M4Barrel145")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        M4Barrel103 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M4Barrel103(), "m4new")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M4Barrel103) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M4Barrel103) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M4Barrel103) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M4Barrel103) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M4Barrel103")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        M16Barrel602= new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M16Barrel602(), "m16")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16Barrel602) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16Barrel602) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16Barrel602) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16Barrel602) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M16Barrel602")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        M16Barrel605= new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M16Barrel605(), "m16")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16Barrel605) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16Barrel605) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16Barrel605) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16Barrel605) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M16Barrel605")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        M16Barrel606= new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M16Barrel606(), "m16")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16Barrel606) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16Barrel606) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16Barrel606) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16Barrel606) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M16Barrel606")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        M16A1Barrel613= new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M16A1Barrel613(), "m16")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16A1Barrel613) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16A1Barrel613) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16A1Barrel613) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16A1Barrel613) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M16A1Barrel613")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        M16A2Barrel701= new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M16A2Barrel701(), "m16a2")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16A2Barrel701) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16A2Barrel701) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16A2Barrel701) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16A2Barrel701) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M16A2Barrel701")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        LR300Barrel115= new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.LR300Barrel115(), "zm_lr300")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LR300Barrel115) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LR300Barrel115) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LR300Barrel115) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LR300Barrel115) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("LR300Barrel115")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        LR300Barrel16= new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.LR300Barrel16(), "zm_lr300")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LR300Barrel16) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LR300Barrel16) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LR300Barrel16) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LR300Barrel16) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("LR300Barrel16")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        HK416Barrel115 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.HK416_Barrel115(), "hk416d")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416_Barrel115) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416_Barrel115) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416_Barrel115) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416_Barrel115) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("HK416Barrel115")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        HK416Barrel145 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.HK416_Barrel145(), "hk416d")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416_Barrel145) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416_Barrel145) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416_Barrel145) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416_Barrel145) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("HK416Barrel145")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        HK416CBarrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.HK416C_Barrel(), "hk416d")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416C_Barrel) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416C_Barrel) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416C_Barrel) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416C_Barrel) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("HK416CBarrel")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        M27IARBarrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M27IAR_Barrel(), "m27iar")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M27IAR_Barrel) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M27IAR_Barrel) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M27IAR_Barrel) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M27IAR_Barrel) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M27IARBarrel")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        HK416A5Barrel115 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.HK416A5Barrel115(), "hk416a5")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416A5Barrel115) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416A5Barrel115) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416A5Barrel115) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416A5Barrel115) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("HK416A5Barrel115")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        HK416A5Barrel125 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.HK416A5Barrel125(), "hk416a5")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416A5Barrel125) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416A5Barrel125) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416A5Barrel125) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416A5Barrel125) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("HK416A5Barrel125")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        HK416A5Barrel16 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.HK416A5Barrel16(), "hk416a5")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416A5Barrel16) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416A5Barrel16) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416A5Barrel16) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416A5Barrel16) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("HK416A5Barrel16")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        HK237Barrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.HK237Barrel(), "hk416a5")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK237Barrel) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK237Barrel) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK237Barrel) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK237Barrel) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("HK237Barrel")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        QHoneyBadgerBarrel105 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QHoneyBadgerBarrel105(), "qhoneybadger")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerBarrel105) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerBarrel105) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerBarrel105) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerBarrel105) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QHoneyBadgerBarrel105")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        QHoneyBadgerBarrel795 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QHoneyBadgerBarrel795(), "qhoneybadger")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerBarrel795) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerBarrel795) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerBarrel795) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerBarrel795) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QHoneyBadgerBarrel795")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);
		
		//AR10 Divider
        M110Barrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M110Barrel(), "m110sass")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M110Barrel) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M110Barrel) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M110Barrel) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M110Barrel) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M110Barrel")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        Mk11Barrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Mk11Barrel(), "mk11")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mk11Barrel) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mk11Barrel) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mk11Barrel) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mk11Barrel) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("Mk11Barrel")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        SR25Barrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.SR25Barrel(), "mk11")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SR25Barrel) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SR25Barrel) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SR25Barrel) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SR25Barrel) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("SR25Barrel")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);
        //Handguards
        N4Handguard795 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.N4Handguard795(), "novesken4green")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Handguard795) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Handguard795) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Handguard795) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Handguard795) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("N4Handguard795")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        N4Handguard115 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.N4Handguard115(), "novesken4green")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Handguard115) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Handguard115) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Handguard115) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Handguard115) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("N4Handguard115")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        N4Handguard145 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.N4Handguard145(), "novesken4green")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Handguard145) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Handguard145) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Handguard145) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Handguard145) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("N4Handguard145")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        N4Handguard795Tan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.N4Handguard795(), "novesken4tan")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Handguard795) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Handguard795) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Handguard795) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Handguard795) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("N4Handguard795Tan")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        N4Handguard115Tan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.N4Handguard115(), "novesken4tan")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Handguard115) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Handguard115) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Handguard115) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Handguard115) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("N4Handguard115Tan")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        N4Handguard145Tan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.N4Handguard145(), "novesken4tan")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Handguard145) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Handguard145) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Handguard145) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Handguard145) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("N4Handguard145Tan")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        N4Handguard795Black = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.N4Handguard795(), "novesken4black")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Handguard795) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Handguard795) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Handguard795) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Handguard795) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("N4Handguard795Black")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        N4Handguard115Black = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.N4Handguard115(), "novesken4black")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Handguard115) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Handguard115) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Handguard115) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Handguard115) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("N4Handguard115Black")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        N4Handguard145Black = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.N4Handguard145(), "novesken4black")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Handguard145) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Handguard145) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Handguard145) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4Handguard145) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("N4Handguard145Black")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        N4PDWHandguard795 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.N4PDWHandguard795(), "novesken4pdwgreen")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4PDWHandguard795) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4PDWHandguard795) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4PDWHandguard795) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4PDWHandguard795) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("N4PDWHandguard795")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        N4PDWHandguard105 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.N4PDWHandguard105(), "novesken4pdwgreen")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4PDWHandguard105) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4PDWHandguard105) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4PDWHandguard105) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4PDWHandguard105) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("N4PDWHandguard105")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        N4PDWHandguard795Tan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.N4PDWHandguard795(), "novesken4pdwtan")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4PDWHandguard795) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4PDWHandguard795) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4PDWHandguard795) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4PDWHandguard795) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("N4PDWHandguard795Tan")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        N4PDWHandguard105Tan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.N4PDWHandguard105(), "novesken4pdwtan")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4PDWHandguard105) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4PDWHandguard105) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4PDWHandguard105) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4PDWHandguard105) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("N4PDWHandguard105Tan")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        N4PDWHandguard795Black = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.N4PDWHandguard795(), "novesken4pdwblack")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4PDWHandguard795) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4PDWHandguard795) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4PDWHandguard795) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4PDWHandguard795) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("N4PDWHandguard795Black")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        N4PDWHandguard105Black = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.N4PDWHandguard105(), "novesken4pdwblack")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4PDWHandguard105) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4PDWHandguard105) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4PDWHandguard105) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.N4PDWHandguard105) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("N4PDWHandguard105Black")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        RIS3_145 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.RIS3_145(), "mk18")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.RIS3_145) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.RIS3_145) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.RIS3_145) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.RIS3_145) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("RIS3_145")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        RIS2_115 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.RIS2_115(), "mk18")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.RIS2_115) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.RIS2_115) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.RIS2_115) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.RIS2_115) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("RIS2_115")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        M4A1Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M4A1Handguard(), "m4new")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M4A1Handguard) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M4A1Handguard) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M4A1Handguard) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M4A1Handguard) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M4A1Handguard")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        M4RIS = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M4RIS(), "m4new")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M4RIS) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M4RIS) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M4RIS) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M4RIS) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M4RIS")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        M16A2Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M16A2Handguard(), "m16a2")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16A2Handguard) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16A2Handguard) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16A2Handguard) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16A2Handguard) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M16A2Handguard")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        XM16Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.XM16Handguard(), "m16")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.XM16Handguard) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.XM16Handguard) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.XM16Handguard) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.XM16Handguard) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("XM16Handguard")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        LR300Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.LR300Handguard(), "zm_lr300")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LR300Handguard) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LR300Handguard) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LR300Handguard) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LR300Handguard) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("LR300Handguard")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        HK416DHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.HK416D_Handguard(), "hk416d")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416D_Handguard) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416D_Handguard) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416D_Handguard) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416D_Handguard) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("HK416DHandguard")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        HK416CHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.HK416C_Handguard(), "hk416d")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416C_Handguard) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416C_Handguard) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416C_Handguard) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416C_Handguard) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("HK416CHandguard")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        M27IARHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M27IAR_Handguard(), "m27iar")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M27IAR_Handguard) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M27IAR_Handguard) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M27IAR_Handguard) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M27IAR_Handguard) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M27IARHandguard")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        HK416A5Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.HK416A5Handguard(), "hk416a5")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416A5Handguard) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416A5Handguard) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416A5Handguard) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416A5Handguard) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("HK416A5Handguard")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        HK416A5HandguardRAL = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.HK416A5Handguard(), "hk416a5ral")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416A5Handguard) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416A5Handguard) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416A5Handguard) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416A5Handguard) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("HK416A5HandguardRAL")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        HK416A5HKeyHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.HK416A5HKeyHandguard(), "hk416a5")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416A5HKeyHandguard) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416A5HKeyHandguard) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416A5HKeyHandguard) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416A5HKeyHandguard) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("HK416A5HKeyHandguard")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        HK416A5HKeyHandguardRAL = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.HK416A5HKeyHandguard(), "hk416a5ral")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416A5HKeyHandguard) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416A5HKeyHandguard) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416A5HKeyHandguard) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416A5HKeyHandguard) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("HK416A5HKeyHandguardRAL")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        HK237Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.HK237Handguard(), "hk416a5")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK237Handguard) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK237Handguard) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK237Handguard) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK237Handguard) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("HK237Handguard")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        HK237HandguardRAL = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.HK237Handguard(), "hk416a5ral")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK237Handguard) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK237Handguard) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK237Handguard) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK237Handguard) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("HK237HandguardRAL")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        QHoneyBadgerHG795 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QHoneyBadgerHG795(), "qhoneybadger")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerHG795) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerHG795) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerHG795) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerHG795) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QHoneyBadgerHG795")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        QHoneyBadgerHG105 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QHoneyBadgerHG105(), "qhoneybadger")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerHG105) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerHG105) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerHG105) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerHG105) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QHoneyBadgerHG105")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        QHoneyBadgerHGSD = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QHoneyBadgerHGSD(), "qhoneybadger")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerHGSD) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerHGSD) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerHGSD) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerHGSD) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QHoneyBadgerHGSD")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        QHoneyBadgerHG795Blk = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QHoneyBadgerHG795(), "qhoneybadgerblack")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerHG795) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerHG795) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerHG795) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerHG795) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QHoneyBadgerHG795Blk")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        QHoneyBadgerHG105Blk = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QHoneyBadgerHG105(), "qhoneybadgerblack")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerHG105) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerHG105) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerHG105) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerHG105) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QHoneyBadgerHG105Blk")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        QHoneyBadgerHGSDBlk = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QHoneyBadgerHGSD(), "qhoneybadgerblack")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerHGSD) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerHGSD) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerHGSD) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerHGSD) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QHoneyBadgerHGSDBlk")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

		//AR10 Divider
        M110Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M110Handguard(), "m110sass")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M110Handguard) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M110Handguard) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M110Handguard) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M110Handguard) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M110Handguard")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        Mk11Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Mk11Handguard(), "mk11")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mk11Handguard) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mk11Handguard) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mk11Handguard) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mk11Handguard) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("Mk11Handguard")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        SR25Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.SR25Handguard(), "mk11")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SR25Handguard) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SR25Handguard) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SR25Handguard) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SR25Handguard) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("SR25Handguard")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);
        //Receiver Extensions
        M4BufferTube = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCKADAPTER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M4BufferTube(), "m4new")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M4BufferTube) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M4BufferTube) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M4BufferTube) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M4BufferTube) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M4BufferTube")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        M16BufferTube = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCKADAPTER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M16BufferTube(), "m16")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16BufferTube) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16BufferTube) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16BufferTube) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16BufferTube) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M16BufferTube")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        M16A2BufferTube = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCKADAPTER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M16A2BufferTube(), "m16a2")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16A2BufferTube) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16A2BufferTube) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16A2BufferTube) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16A2BufferTube) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M16A2BufferTube")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        ARPistolBufferTube = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCKADAPTER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.ARPistolBufferTube(), "arcompact_stocks")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ARPistolBufferTube) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ARPistolBufferTube) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ARPistolBufferTube) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ARPistolBufferTube) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("ARPistolBufferTube")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        AngstadtSCW_Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCKADAPTER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.AngstadtSCW_Stock(), "arcompact_stocks")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.AngstadtSCW_Stock) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.AngstadtSCW_Stock) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.AngstadtSCW_Stock) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.AngstadtSCW_Stock) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("AngstadtSCW_Stock")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        MaximSCW_Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCKADAPTER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.MaximSCW_Stock(), "arcompact_stocks")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.MaximSCW_Stock) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.MaximSCW_Stock) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.MaximSCW_Stock) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.MaximSCW_Stock) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("MaximSCW_Stock")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        MaximCCS_Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCKADAPTER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.MaximCCS_Stock(), "arcompact_stocks")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.MaximCCS_Stock) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.MaximCCS_Stock) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.MaximCCS_Stock) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.MaximCCS_Stock) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("MaximCCS_Stock")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        LR300Adapter = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCKADAPTER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.LR300Adapter(), "zm_lr300")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LR300Adapter) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LR300Adapter) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LR300Adapter) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LR300Adapter) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("LR300Adapter")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        M27IARBufferTube = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCKADAPTER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M27IAR_BufferTube(), "m27iar")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M27IAR_BufferTube) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M27IAR_BufferTube) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M27IAR_BufferTube) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M27IAR_BufferTube) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M27IARBufferTube")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        HK416A5BufferTube = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCKADAPTER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.HK416A5BufferTube(), "hk416a5ral")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416A5BufferTube) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416A5BufferTube) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416A5BufferTube) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416A5BufferTube) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("HK416A5BufferTube")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        HK416C_Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCKADAPTER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.HK416C_Stock(), "hk416d")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416C_Stock) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416C_Stock) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416C_Stock) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HK416C_Stock) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("HK416C_Stock")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        QHoneyBadgerStockOpen = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCKADAPTER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QHoneyBadgerStockOpen(), "qhoneybadger")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerStockOpen) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerStockOpen) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerStockOpen) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerStockOpen) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QHoneyBadgerStockOpen")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        QHoneyBadgerStockClosed = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCKADAPTER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QHoneyBadgerStockClosed(), "qhoneybadger")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerStockClosed) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerStockClosed) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerStockClosed) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerStockClosed) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QHoneyBadgerStockClosed")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        QHoneyBadgerStockOpenBlkout = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCKADAPTER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QHoneyBadgerStockOpen(), "qhoneybadgerblue")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerStockOpen) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerStockOpen) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerStockOpen) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerStockOpen) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QHoneyBadgerStockOpenBlkout")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        QHoneyBadgerStockClosedBlkout = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCKADAPTER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QHoneyBadgerStockClosed(), "qhoneybadgerblue")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerStockClosed) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerStockClosed) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerStockClosed) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerStockClosed) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QHoneyBadgerStockClosedBlkout")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

		//AR10 Divider
        M110Extension = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCKADAPTER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M110Extension(), "m110sass")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M110Extension) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M110Extension) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M110Extension) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M110Extension) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M110Extension")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);
        //Stocks
        M4Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M4Stock(), "m4new")
                .withRequiredAttachments(ARParts.M4BufferTube, ARParts.M27IARBufferTube, ARParts.HK416A5BufferTube)
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M4Stock) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M4Stock) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M4Stock) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M4Stock) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M4Stock")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        DDStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.DDStock(), "mk18")
                .withRequiredAttachments(ARParts.M4BufferTube, ARParts.M27IARBufferTube, ARParts.HK416A5BufferTube)
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.DDStock) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.DDStock) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.DDStock) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.DDStock) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("DDStock")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        M16A2Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M16A2Stock (), "m16a2")
                .withRequiredAttachments(ARParts.M16BufferTube, ARParts.M16A2BufferTube)
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16A2Stock ) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16A2Stock ) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16A2Stock ) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16A2Stock ) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M16A2Stock")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        XM16Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.XM16Stock (), "m16")
                .withRequiredAttachments(ARParts.M16BufferTube, ARParts.M16A2BufferTube)
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.XM16Stock ) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.XM16Stock ) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.XM16Stock ) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.XM16Stock ) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("XM16Stock")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        LR300SkeleStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.LR300SkeleStock(), "zm_lr300")
                .withRequiredAttachments(ARParts.LR300Adapter)
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LR300SkeleStock) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LR300SkeleStock) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LR300SkeleStock) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LR300SkeleStock) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("LR300SkeleStock")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        LR300GalilStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.LR300GalilStock(), "zm_lr300")
                .withRequiredAttachments(ARParts.LR300Adapter)
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LR300GalilStock) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LR300GalilStock) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LR300GalilStock) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LR300GalilStock) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("LR300GalilStock")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        HKChunkyStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.HKStock_Chunky(), "hk416poly")
                .withRequiredAttachments(ARParts.M4BufferTube, ARParts.M27IARBufferTube, ARParts.HK416A5BufferTube)
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HKStock_Chunky) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HKStock_Chunky) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HKStock_Chunky) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HKStock_Chunky) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("HKChunkyStock")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        HKSlimlineStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.HKStock_Slimline(), "hk416poly")
                .withRequiredAttachments(ARParts.M4BufferTube, ARParts.M27IARBufferTube, ARParts.HK416A5BufferTube)
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HKStock_Slimline) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HKStock_Slimline) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HKStock_Slimline) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HKStock_Slimline) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("HKSlimlineStock")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        HKCheekpieceStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.HKStock_CheekRiser(), "hk416poly")
                .withRequiredAttachments(ARParts.M4BufferTube, ARParts.M27IARBufferTube, ARParts.HK416A5BufferTube)
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HKStock_CheekRiser) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HKStock_CheekRiser) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HKStock_CheekRiser) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HKStock_CheekRiser) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("HKCheekpieceStock")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        HKChunkyStockTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.HKStock_Chunky(), "hk416poly_ral")
                .withRequiredAttachments(ARParts.M4BufferTube, ARParts.M27IARBufferTube, ARParts.HK416A5BufferTube)
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HKStock_Chunky) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HKStock_Chunky) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HKStock_Chunky) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HKStock_Chunky) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("HKChunkyStockTan")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        HKSlimlineStockTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.HKStock_Slimline(), "hk416poly_ral")
                .withRequiredAttachments(ARParts.M4BufferTube, ARParts.M27IARBufferTube, ARParts.HK416A5BufferTube)
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HKStock_Slimline) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HKStock_Slimline) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HKStock_Slimline) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HKStock_Slimline) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("HKSlimlineStockTan")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        HKCheekpieceStockTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.HKStock_CheekRiser(), "hk416poly_ral")
                .withRequiredAttachments(ARParts.M4BufferTube, ARParts.M27IARBufferTube, ARParts.HK416A5BufferTube)
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HKStock_CheekRiser) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HKStock_CheekRiser) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HKStock_CheekRiser) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HKStock_CheekRiser) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("HKCheekpieceStockTan")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

		//AR10 Divider
        M110Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M110Stock(), "m110sass")
                .withRequiredAttachments(ARParts.M110Extension)
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M110Stock) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M110Stock) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M110Stock) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M110Stock) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M110Stock")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);
        //Pistol Grips
        DDGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.DDGrip(), "mk18")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.DDGrip) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.DDGrip) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.DDGrip) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.DDGrip) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("DDGrip")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        M4PistolGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M4PistolGrip(), "m4new")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M4PistolGrip) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M4PistolGrip) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M4PistolGrip) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M4PistolGrip) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M4PistolGrip")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        M16PistolGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M16PistolGrip(), "m16")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16PistolGrip) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16PistolGrip) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16PistolGrip) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16PistolGrip) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M16PistolGrip")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

		LMG68Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.LMG68Grip(), "lmg68.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LMG68Grip) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LMG68Grip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LMG68Grip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("LMG68Grip").withTextureName("Dummy.png")
                .build(MWC.modContext);

       CQGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.CQGrip(), "m4a1.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.CQGrip) {
                        GL11.glTranslatef(-0.6F, -0.6F, 0.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.CQGrip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.CQGrip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("CQGrip").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M4GripTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M4GripTan(), "m4griptan.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M4GripTan) {
                        GL11.glTranslatef(-0.6F, -0.6F, 0.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M4GripTan) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M4GripTan) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M4GripTan").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        
        M4GripGray = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M4Grip(), "gun2.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M4Grip) {
                        GL11.glTranslatef(-0.6F, -0.6F, 0.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M4Grip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M4Grip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M4GripGray").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        HK416Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.HKgrip(), "hk416poly.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HKgrip) {
                        GL11.glTranslatef(-0.6F, -0.6F, 0.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HKgrip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HKgrip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("HK416Grip").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        HK416GripTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.HKgrip(), "hk416poly_ral.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HKgrip) {
                        GL11.glTranslatef(-0.6F, -0.6F, 0.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HKgrip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HKgrip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("HK416GripTan").withTextureName("Dummy.png")
                .build(MWC.modContext);

        HK416CGripTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.HKGrip_Early(), "hk416poly_ral.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HKGrip_Early) {
                        GL11.glTranslatef(-0.6F, -0.6F, 0.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HKGrip_Early) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HKGrip_Early) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("HK416CGripTan").withTextureName("Dummy.png")
                .build(MWC.modContext);

        HK416A8GripTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.HKGrip_A8(), "hk416poly_ral.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HKGrip_A8) {
                        GL11.glTranslatef(-0.6F, -0.6F, 0.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HKGrip_A8) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HKGrip_A8) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("HK416A8GripTan").withTextureName("Dummy.png")
                .build(MWC.modContext);

        HK433GripTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.HKGrip_Grooved(), "hk416poly_ral.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HKGrip_Grooved) {
                        GL11.glTranslatef(-0.6F, -0.6F, 0.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HKGrip_Grooved) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HKGrip_Grooved) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("HK433GripTan").withTextureName("Dummy.png")
                .build(MWC.modContext);

        HK416CGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.HKGrip_Early(), "hk416poly.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HKGrip_Early) {
                        GL11.glTranslatef(-0.6F, -0.6F, 0.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HKGrip_Early) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HKGrip_Early) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("HK416CGrip").withTextureName("Dummy.png")
                .build(MWC.modContext);

        HK416A8Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.HKGrip_A8(), "hk416poly.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HKGrip_A8) {
                        GL11.glTranslatef(-0.6F, -0.6F, 0.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HKGrip_A8) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HKGrip_A8) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("HK416A8Grip").withTextureName("Dummy.png")
                .build(MWC.modContext);

        HK433Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.HKGrip_Grooved(), "hk416poly.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HKGrip_Grooved) {
                        GL11.glTranslatef(-0.6F, -0.6F, 0.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HKGrip_Grooved) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.HKGrip_Grooved) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("HK433Grip").withTextureName("Dummy.png")
                .build(MWC.modContext);

        LR300Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.LR300Grip(), "zm_lr300.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LR300Grip) {
                        GL11.glTranslatef(-0.6F, -0.6F, 0.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LR300Grip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LR300Grip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("LR300Grip").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M110Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M110Grip(), "M110.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M110Grip) {
                        GL11.glTranslatef(-0.6F, -0.6F, 0.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M110Grip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M110Grip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M110Grip").withTextureName("Dummy.png")
                .build(MWC.modContext);
        //Bolts & Charging Handles
        M4Action = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.ACTION)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M4Action(), "m4new")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M4Action) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M4Action) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M4Action) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M4Action) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M4Action")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);

        M16Action = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.ACTION)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M16Action(), "m16")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16Action) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16Action) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16Action) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16Action) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M16Action")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);

        LR300Action = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.ACTION)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.LR300Action(), "zm_lr300")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LR300Action) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LR300Action) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LR300Action) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LR300Action) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("LR300Action")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);

        QHoneyBadgerAction = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.ACTION)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QHoneyBadgerAction(), "qhoneybadger")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerAction) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerAction) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerAction) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerAction) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QHoneyBadgerAction")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);

        M4ChargingHandle = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.HANDLE)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M4ChargingHandle(), "m4new")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M4ChargingHandle) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M4ChargingHandle) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M4ChargingHandle) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M4ChargingHandle) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M4ChargingHandle")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);

        M16ChargingHandle = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.HANDLE)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M16ChargingHandle(), "m16")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16ChargingHandle) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16ChargingHandle) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16ChargingHandle) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16ChargingHandle) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M16ChargingHandle")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);

        DDChargingHandle = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.HANDLE)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.DDChargingHandle(), "mk18")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.DDChargingHandle) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.DDChargingHandle) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.DDChargingHandle) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.DDChargingHandle) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("DDChargingHandle")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);

        OversizeLatchChargingHandle = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.HANDLE)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.OversizeLatchChargingHandle(), "hk416d")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.OversizeLatchChargingHandle) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.OversizeLatchChargingHandle) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.OversizeLatchChargingHandle) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.OversizeLatchChargingHandle) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("OversizeLatchChargingHandle")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);

        QHoneyBadgerHandle = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.HANDLE)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QHoneyBadgerHandle(), "qhoneybadger")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerHandle) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerHandle) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerHandle) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerHandle) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QHoneyBadgerHandle")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);

	//AR10 Divider
        M110Action = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.ACTION)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M110Action(), "m110sass")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M110Action) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M110Action) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M110Action) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M110Action) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M110Action")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);

        M110Handle = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.HANDLE)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M110Handle(), "m110sass")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M110Handle) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M110Handle) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M110Handle) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M110Handle) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M110Handle")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);
	//Additional Parts
        LR300Rails = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.LR300Rails(), "zm_lr300")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LR300Rails) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LR300Rails) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LR300Rails) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LR300Rails) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("LR300Rails")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);

        LR300Frontsight = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.LR300Frontsight(), "zm_lr300")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LR300Frontsight) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LR300Frontsight) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LR300Frontsight) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LR300Frontsight) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("LR300Frontsight")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);

        LR300Foregrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withRenderablePart()
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.LR300Foregrip(), "zm_lr300")
                .withRequiredAttachments(ARParts.LR300Handguard, ARParts.M4A1Handguard, ARParts.M16A2Handguard)
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.6f);
                })
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LR300Foregrip) {
                        GL11.glTranslatef(0.7F, -1.1F, 0.5F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LR300Foregrip) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LR300Foregrip) {
                        GL11.glTranslatef(0.6F, 0.3F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.3F, 1.3F, 1.3f);

                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LR300Foregrip) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                })
                .withRenderablePart()
                .withName("LR300Foregrip").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Mk11Frontsight = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.AttachmentsTab)
                .withRequiredAttachments(ARParts.Mk11Handguard)
                .withModel(new com.paneedah.mwc.models.Mk11Frontsight(), "mk11")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mk11Frontsight) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mk11Frontsight) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mk11Frontsight) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mk11Frontsight) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("Mk11Frontsight")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);

        Mk11FrontsightDown = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.AttachmentsTab)
                .withRequiredAttachments(ARParts.Mk11Handguard)
                .withModel(new com.paneedah.mwc.models.Mk11FrontsightDown(), "mk11")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mk11FrontsightDown) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mk11FrontsightDown) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mk11FrontsightDown) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mk11FrontsightDown) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("Mk11FrontsightDown")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);

        QHoneyBadgerSilencerSD = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QHoneyBadgerSilencerSD(), "qhoneybadger.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2), 
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerSilencerSD) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerSilencerSD) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerSilencerSD) {
                        GL11.glTranslatef(0.6F, 1.3F, -5.3F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);

                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QHoneyBadgerSilencerSD) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QHoneyBadgerSilencerSD") 
				.withTextureName("Dummy.png")
                .build(MWC.modContext);

        M110Silencer = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M110Suppressor(), "m110sass.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2), 
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M110Suppressor) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M110Suppressor) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M110Suppressor) {
                        GL11.glTranslatef(0.6F, 1.3F, -5.3F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);

                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M110Suppressor) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M110Silencer") 
				.withTextureName("Dummy.png")
                .build(MWC.modContext);

        M110SideCovers = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.DECOR)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M110SideCovers(), "m110sass")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M110SideCovers) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M110SideCovers) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M110SideCovers) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M110SideCovers) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M110SideCovers")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);

        M110LowerCover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M110LowerCover(), "m110sass")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M110LowerCover) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M110LowerCover) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M110LowerCover) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M110LowerCover) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M110LowerCover")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);
    }
}