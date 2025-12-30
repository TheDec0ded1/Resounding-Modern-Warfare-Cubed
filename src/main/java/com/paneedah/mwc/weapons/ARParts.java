package com.paneedah.mwc.weapons;

import com.paneedah.mwc.ModernWarfareMod;
import com.paneedah.mwc.init.MWCItems;
import com.paneedah.mwc.models.*;
import com.paneedah.weaponlib2.*;
import com.paneedah.weaponlib2.crafting.CraftingEntry;
import com.paneedah.weaponlib2.crafting.CraftingGroup;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import org.lwjgl.opengl.GL11;

public class ARParts {
    //Lower Recievers
    public static ItemAttachment<Weapon> N4Lower;
    public static ItemAttachment<Weapon> DDLower;
    public static ItemAttachment<Weapon> M4Lower;
    public static ItemAttachment<Weapon> M16A1Lower;
    public static ItemAttachment<Weapon> M16Lower;
    public static ItemAttachment<Weapon> XM16Lower;
    //Upper Recievers
    public static ItemAttachment<Weapon> N4Upper;
    public static ItemAttachment<Weapon> DDUpper;
    public static ItemAttachment<Weapon> M4Upper;
    public static ItemAttachment<Weapon> M16A2Upper;
    public static ItemAttachment<Weapon> C7Upper;
    public static ItemAttachment<Weapon> M16A1Upper;
    public static ItemAttachment<Weapon> M16Upper;
    //Barrels
    public static ItemAttachment<Weapon> ARBarrel795;
    public static ItemAttachment<Weapon> ARBarrel115;
    public static ItemAttachment<Weapon> ARBarrel145;
    public static ItemAttachment<Weapon> M4Barrel145;
    public static ItemAttachment<Weapon> M4Barrel103;
    public static ItemAttachment<Weapon> M16A2Barrel701;
    public static ItemAttachment<Weapon> M16Barrel602;
    public static ItemAttachment<Weapon> M16Barrel605;
    public static ItemAttachment<Weapon> M16Barrel606;
    public static ItemAttachment<Weapon> M16A1Barrel613;
    //Handguards
    public static ItemAttachment<Weapon> N4Handguard795;
    public static ItemAttachment<Weapon> N4Handguard115;
    public static ItemAttachment<Weapon> N4Handguard145;
    public static ItemAttachment<Weapon> RIS3_145;
    public static ItemAttachment<Weapon> RIS2_115;
    public static ItemAttachment<Weapon> M4RIS;
    public static ItemAttachment<Weapon> M4A1Handguard;
    public static ItemAttachment<Weapon> M16A2Handguard;
    public static ItemAttachment<Weapon> XM16Handguard;
    //Extensions & One-Piece Stocks
    public static ItemAttachment<Weapon> M4BufferTube;
    public static ItemAttachment<Weapon> M16BufferTube;
    public static ItemAttachment<Weapon> M16A2BufferTube;
	public static ItemAttachment<Weapon> ARPistolBufferTube;
    public static ItemAttachment<Weapon> AngstadtSCW_Stock;
    public static ItemAttachment<Weapon> MaximSCW_Stock;
    public static ItemAttachment<Weapon> MaximCCS_Stock;
    //Grips
    public static ItemAttachment<Weapon> DDGrip;
    public static ItemAttachment<Weapon> M4PistolGrip;
    public static ItemAttachment<Weapon> M16PistolGrip;
    //Stocks
    public static ItemAttachment<Weapon> DDStock;
    public static ItemAttachment<Weapon> M4Stock;
    public static ItemAttachment<Weapon> M16A2Stock;
    public static ItemAttachment<Weapon> XM16Stock;
    //Bolts & Charging Handles
    public static ItemAttachment<Weapon> M4ChargingHandle;
    public static ItemAttachment<Weapon> DDChargingHandle;
    public static ItemAttachment<Weapon> M16ChargingHandle;
    public static ItemAttachment<Weapon> M4Action;
    public static ItemAttachment<Weapon> M16Action;


    public static void init(Object mod) {
        //Lower Receivers
	    N4Lower = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.N4Lower(), "novesken4green")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.N4Lower) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.N4Lower) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.N4Lower) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.N4Lower) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("N4Lower")
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);


        DDLower = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.DDLower(), "mk18")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.DDLower) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.DDLower) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.DDLower) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.DDLower) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("DDLower")
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        M4Lower = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M4Lower(), "m4new")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Lower) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Lower) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Lower) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Lower) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M4Lower")
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        M16Lower = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M16Lower(), "m16")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16Lower) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16Lower) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16Lower) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16Lower) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M16Lower")
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        M16A1Lower = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M16A1Lower(), "m16")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16A1Lower) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16A1Lower) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16A1Lower) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16A1Lower) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M16A1Lower")
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        XM16Lower = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.XM16Lower(), "m16")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.XM16Lower) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.XM16Lower) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.XM16Lower) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.XM16Lower) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("XM16Lower")
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        //Upper Receivers
	    M4Upper = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER2)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M4Upper(), "m4new")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Upper) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Upper) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Upper) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Upper) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M4Upper")
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        N4Upper = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER2)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.N4Upper(), "novesken4green")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.N4Upper) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.N4Upper) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.N4Upper) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.N4Upper) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("N4Upper")
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        DDUpper = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER2)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.DDUpper(), "mk18")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.DDUpper) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.DDUpper) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.DDUpper) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.DDUpper) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("DDUpper")
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        M16A2Upper = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER2)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M16A2Upper(), "m16a2")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16A2Upper) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16A2Upper) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16A2Upper) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16A2Upper) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M16A2Upper")
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        M16A1Upper = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER2)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M16A1Upper(), "m16")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16A1Upper) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16A1Upper) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16A1Upper) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16A1Upper) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M16A1Upper")
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        M16Upper = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER2)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M16Upper(), "m16")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16Upper) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16Upper) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16Upper) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16Upper) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M16Upper")
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        C7Upper = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER2)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.C7Upper(), "m16")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.C7Upper) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.C7Upper) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.C7Upper) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.C7Upper) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("C7Upper")
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        //Barrels
        ARBarrel795 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.ARBarrel795(), "novesken4green")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ARBarrel795) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ARBarrel795) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ARBarrel795) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ARBarrel795) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("ARBarrel795")
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        ARBarrel115 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.ARBarrel115(), "mk18")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ARBarrel115) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ARBarrel115) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ARBarrel115) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ARBarrel115) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("ARBarrel115")
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        ARBarrel145 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.ARBarrel145(), "mk18")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ARBarrel145) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ARBarrel145) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ARBarrel145) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ARBarrel145) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("ARBarrel145")
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        M4Barrel145 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M4Barrel145(), "m4new")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Barrel145) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Barrel145) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Barrel145) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Barrel145) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M4Barrel145")
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        M4Barrel103 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M4Barrel103(), "m4new")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Barrel103) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Barrel103) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Barrel103) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Barrel103) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M4Barrel103")
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        M16Barrel602= new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M16Barrel602(), "m16")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16Barrel602) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16Barrel602) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16Barrel602) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16Barrel602) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M16Barrel602")
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        M16Barrel605= new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M16Barrel605(), "m16")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16Barrel605) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16Barrel605) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16Barrel605) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16Barrel605) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M16Barrel605")
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        M16Barrel606= new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M16Barrel606(), "m16")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16Barrel606) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16Barrel606) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16Barrel606) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16Barrel606) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M16Barrel606")
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        M16A1Barrel613= new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M16A1Barrel613(), "m16")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16A1Barrel613) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16A1Barrel613) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16A1Barrel613) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16A1Barrel613) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M16A1Barrel613")
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        M16A2Barrel701= new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M16A2Barrel701(), "m16a2")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16A2Barrel701) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16A2Barrel701) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16A2Barrel701) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16A2Barrel701) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M16A2Barrel701")
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        //Handguards
        N4Handguard795 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.N4Handguard795(), "novesken4green")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.N4Handguard795) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.N4Handguard795) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.N4Handguard795) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.N4Handguard795) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("N4Handguard795")
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        N4Handguard115 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.N4Handguard115(), "novesken4green")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.N4Handguard115) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.N4Handguard115) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.N4Handguard115) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.N4Handguard115) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("N4Handguard115")
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        N4Handguard145 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.N4Handguard145(), "novesken4green")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.N4Handguard145) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.N4Handguard145) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.N4Handguard145) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.N4Handguard145) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("N4Handguard145")
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        RIS3_145 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.RIS3_145(), "mk18")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.RIS3_145) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.RIS3_145) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.RIS3_145) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.RIS3_145) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("RIS3_145")
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        RIS2_115 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.RIS2_115(), "mk18")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.RIS2_115) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.RIS2_115) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.RIS2_115) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.RIS2_115) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("RIS2_115")
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        M4A1Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M4A1Handguard(), "m4new")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4A1Handguard) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4A1Handguard) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4A1Handguard) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4A1Handguard) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M4A1Handguard")
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        M4RIS = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M4RIS(), "m4new")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4RIS) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4RIS) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4RIS) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4RIS) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M4RIS")
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        M16A2Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M16A2Handguard(), "m16a2")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16A2Handguard) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16A2Handguard) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16A2Handguard) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16A2Handguard) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M16A2Handguard")
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        XM16Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.XM16Handguard(), "m16")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.XM16Handguard) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.XM16Handguard) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.XM16Handguard) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.XM16Handguard) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("XM16Handguard")
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        //Receiver Extensions
        M4BufferTube = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCKADAPTER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M4BufferTube(), "m4new")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4BufferTube) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4BufferTube) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4BufferTube) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4BufferTube) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M4BufferTube")
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        M16BufferTube = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCKADAPTER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M16BufferTube(), "m16")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16BufferTube) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16BufferTube) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16BufferTube) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16BufferTube) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M16BufferTube")
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        M16A2BufferTube = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCKADAPTER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M16A2BufferTube(), "m16a2")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16A2BufferTube) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16A2BufferTube) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16A2BufferTube) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16A2BufferTube) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M16A2BufferTube")
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        ARPistolBufferTube = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCKADAPTER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.ARPistolBufferTube(), "arcompact_stocks")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ARPistolBufferTube) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ARPistolBufferTube) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ARPistolBufferTube) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ARPistolBufferTube) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("ARPistolBufferTube")
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        AngstadtSCW_Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCKADAPTER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.AngstadtSCW_Stock(), "arcompact_stocks")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AngstadtSCW_Stock) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AngstadtSCW_Stock) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AngstadtSCW_Stock) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AngstadtSCW_Stock) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("AngstadtSCW_Stock")
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        MaximSCW_Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCKADAPTER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.MaximSCW_Stock(), "arcompact_stocks")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MaximSCW_Stock) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MaximSCW_Stock) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MaximSCW_Stock) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MaximSCW_Stock) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("MaximSCW_Stock")
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        MaximCCS_Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCKADAPTER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.MaximCCS_Stock(), "arcompact_stocks")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MaximCCS_Stock) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MaximCCS_Stock) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MaximCCS_Stock) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MaximCCS_Stock) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("MaximCCS_Stock")
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        //Stocks
        M4Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M4Stock(), "m4new")
                .withRequiredAttachments(ARParts.M4BufferTube)
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Stock) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Stock) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Stock) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Stock) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M4Stock")
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        DDStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.DDStock(), "mk18")
                .withRequiredAttachments(ARParts.M4BufferTube)
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.DDStock) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.DDStock) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.DDStock) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.DDStock) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("DDStock")
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        M16A2Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M16A2Stock (), "m16a2")
                .withRequiredAttachments(ARParts.M16BufferTube, ARParts.M16A2BufferTube)
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16A2Stock ) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16A2Stock ) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16A2Stock ) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16A2Stock ) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M16A2Stock")
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        XM16Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.XM16Stock (), "m16")
                .withRequiredAttachments(ARParts.M16BufferTube, ARParts.M16A2BufferTube)
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.XM16Stock ) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.XM16Stock ) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.XM16Stock ) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.XM16Stock ) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("XM16Stock")
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        //Pistol Grips
        DDGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.DDGrip(), "mk18")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.DDGrip) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.DDGrip) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.DDGrip) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.DDGrip) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("DDGrip")
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        M4PistolGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M4PistolGrip(), "m4new")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4PistolGrip) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4PistolGrip) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4PistolGrip) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4PistolGrip) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M4PistolGrip")
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        M16PistolGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M16PistolGrip(), "m16")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16PistolGrip) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16PistolGrip) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16PistolGrip) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16PistolGrip) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M16PistolGrip")
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        //Bolts & Charging Handles
        M4Action = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.ACTION)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M4Action(), "m4new")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Action) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Action) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Action) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Action) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M4Action")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        M16Action = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.ACTION)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M16Action(), "m16")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16Action) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16Action) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16Action) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16Action) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M16Action")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        M4ChargingHandle = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.HANDLE)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M4ChargingHandle(), "m4new")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4ChargingHandle) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4ChargingHandle) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4ChargingHandle) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4ChargingHandle) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M4ChargingHandle")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        M16ChargingHandle = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.HANDLE)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M16ChargingHandle(), "m16")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16ChargingHandle) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16ChargingHandle) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16ChargingHandle) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16ChargingHandle) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M16ChargingHandle")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        DDChargingHandle = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.HANDLE)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.DDChargingHandle(), "mk18")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.DDChargingHandle) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.DDChargingHandle) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.DDChargingHandle) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.DDChargingHandle) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("DDChargingHandle")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
    }
}