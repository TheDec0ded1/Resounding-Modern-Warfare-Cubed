package com.paneedah.mwc.weapons;

import com.paneedah.mwc.ModernWarfareMod;
import com.paneedah.mwc.init.MWCItems;
import com.paneedah.mwc.models.*;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import com.paneedah.weaponlib.crafting.CraftingGroup;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import org.lwjgl.opengl.GL11;

public class Attachments2 {
    public static ItemAttachment<Weapon> FNFALGripWood;
    public static ItemAttachment<Weapon> FNFALPolymerStock;
    public static ItemAttachment<Weapon> FNFALParaStock;
    public static ItemAttachment<Weapon> FNFALBHandguard;
    public static ItemAttachment<Weapon> FNFALIsraeliHandguard;
    public static ItemAttachment<Weapon> FNFALG1Handguard;
    public static ItemAttachment<Weapon> FNFALPHandguard;
    public static ItemAttachment<Weapon> I1A1Grip;
    public static ItemAttachment<Weapon> I1A1Stock;
    public static ItemAttachment<Weapon> I1A1Handguard;
    public static ItemAttachment<Weapon> MinimiHandguard;
    public static ItemAttachment<Weapon> MinimiStock;
    public static ItemAttachment<Weapon> MinimiStockB;
    public static ItemAttachment<Weapon> Type56Iron;
    public static ItemAttachment<Weapon> Type56Handguard;
    public static ItemAttachment<Weapon> RPK74MHandguard;
    public static ItemAttachment<Weapon> RPK74MPlumHandguard;
    public static ItemAttachment<Weapon> RPK74MStock;
    public static ItemAttachment<Weapon> RPK74MPlumStock;
    public static ItemAttachment<Weapon> RPK74Handguard;
    public static ItemAttachment<Weapon> RPK74Stock;
    public static ItemAttachment<Weapon> Mk17Upper;
    public static ItemAttachment<Weapon> Mk20Upper;
    public static ItemAttachment<Weapon> Mk20Handguard;
    public static ItemAttachment<Weapon> SCARSCUpper;
    public static ItemAttachment<Weapon> SCARSCHandguard;
    public static ItemAttachment<Weapon> RPK74MGreenHandguard;
    public static ItemAttachment<Weapon> RPK74MPearlHandguard;
    public static ItemAttachment<Weapon> RPK74MGreenStock;
    public static ItemAttachment<Weapon> RPK74MPearlStock;
    public static ItemAttachment<Weapon> RPK74MWhiteHandguard;
    public static ItemAttachment<Weapon> RPK74MWhiteStock;
    public static ItemAttachment<Weapon> AKMSStock;
    public static ItemAttachment<Weapon> MakarovBodyGreen;
    public static ItemAttachment<Weapon> MakarovBodyPearl;
    public static ItemAttachment<Weapon> MakarovPBBodyGreen;
    public static ItemAttachment<Weapon> MakarovPBBodyPearl;
    public static ItemAttachment<Weapon> AK19Grip;
    public static ItemAttachment<Weapon> AK19GripGreen;
    public static ItemAttachment<Weapon> AK19GripTan;
    public static ItemAttachment<Weapon> AK19Stock;
    public static ItemAttachment<Weapon> AK19StockGreen;
    public static ItemAttachment<Weapon> AK19StockTan;
    public static ItemAttachment<Weapon> AN94Stock;
    public static ItemAttachment<Weapon> AN94GreenStock;
    public static ItemAttachment<Weapon> AN94;
    public static ItemAttachment<Weapon> AN94Green;
    public static ItemAttachment<Weapon> M93RStock;
    public static ItemAttachment<Weapon> M93RSlide;
    public static ItemAttachment<Weapon> M93RBody;
    public static ItemAttachment<Weapon> MK20Stock;
    public static ItemAttachment<Weapon> SilencerGroza;
    public static ItemAttachment<Weapon> SR3MHGB;
    public static ItemAttachment<Weapon> SR3MHGFB;
    public static ItemAttachment<Weapon> SR3VikhrHGB;
    public static ItemAttachment<Weapon> ASValStockB;
    public static ItemAttachment<Weapon> SR3VikhrStockB;
    public static ItemAttachment<Weapon> SilencerSR2M;
    public static ItemAttachment<Weapon> SR2MGB;
    public static ItemAttachment<Weapon> SR2MHGB;
    public static ItemAttachment<Weapon> SR2MHGFB;
    public static ItemAttachment<Weapon> SR2MG;
    public static ItemAttachment<Weapon> SR2MHG;
    public static ItemAttachment<Weapon> SR2MHGF;
    public static ItemAttachment<Weapon> SR2MStock;




    public static void init(Object mod) {

        FNFALGripWood = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FALGripWood(), "fnfal.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.FALGripWood) {
                        GL11.glTranslatef(-0.6F, -0.3F, 0.1F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.FALGripWood) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.FALGripWood) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("FNFALGripWood").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        FNFALParaStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FNFALParaStock(), "fnfal.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.FNFALParaStock) {
                        GL11.glTranslatef(-0.6F, 0.1F, 1.7F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.FNFALParaStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.FNFALParaStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("FNFALParaStock").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        FNFALPolymerStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FNFALStock(), "fnfalpara.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.FNFALStock) {
                        GL11.glTranslatef(-0.6F, 0.1F, 1.7F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.FNFALStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.FNFALStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("FNFALPolymerStock").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        FNFALBHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FNFALHandguard(), "fnfalpara.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.FNFALHandguard) {
                        GL11.glTranslatef(-0.6F, 0.5F, -2.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.FNFALHandguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.FNFALHandguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })	
                .withName("FNFALBHandguard").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        FNFALG1Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FNFALG1Handguard(), "falg1.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.FNFALG1Handguard) {
                        GL11.glTranslatef(-0.6F, 0.5F, -2.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.FNFALG1Handguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.FNFALG1Handguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })	
                .withName("FNFALG1Handguard").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        FNFALIsraeliHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FNFALIsraeliHandguard(), "fnfal.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.FNFALIsraeliHandguard) {
                        GL11.glTranslatef(-0.6F, 0.5F, -2.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.FNFALIsraeliHandguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.FNFALIsraeliHandguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })	
                .withName("FNFALIsraeliHandguard").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        FNFALPHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FNFALPARAHandguard(), "fnfalparahandguard.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.FNFALPARAHandguard) {
                    	GL11.glTranslatef(-0.6F, 0.5F, -2.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.FNFALPARAHandguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.FNFALPARAHandguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })	
                .withName("FNFALPHandguard").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        I1A1Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.I1A1Grip(), "bareak.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.I1A1Grip) {
                        GL11.glTranslatef(-0.6F, -0.3F, 0.1F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.I1A1Grip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.I1A1Grip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("I1A1Grip").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        I1A1Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.I1A1Stock(), "bareak.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.I1A1Stock) {
                        GL11.glTranslatef(-0.6F, 0.1F, 1.7F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.I1A1Stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.I1A1Stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("I1A1Stock").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        I1A1Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.I1A1Handguard(), "bareak.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.I1A1Handguard) {
                    	GL11.glTranslatef(-0.6F, 0.5F, -2.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.I1A1Handguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.I1A1Handguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })	
                .withName("I1A1Handguard").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        MinimiHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.MinimiHandguard(), "m249.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.MinimiHandguard) {
                        GL11.glTranslatef(-0.6F, -0.6F, 1.8F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MinimiHandguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MinimiHandguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MinimiHandguard").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        MinimiStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.MinimiStock(), "m249.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.MinimiStock) {
                        GL11.glTranslatef(-0.6F, -0.7F, 5.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MinimiStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MinimiStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MinimiStock").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        MinimiStockB = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.MinimiStockB(), "m249.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.MinimiStockB) {
                        GL11.glTranslatef(-0.6F, -0.7F, 5.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MinimiStockB) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MinimiStockB) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MinimiStockB").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Type56Iron = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.AKiron3(), "gun")
                .withModel(new com.paneedah.mwc.models.Type56iron2(), "gun")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AKiron3) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AKiron3) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AKiron3) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    } else if (model instanceof com.paneedah.mwc.models.Type56iron2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AKiron3) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("Type56Iron")
                
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Type56Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Type56Handguard(), "ak47.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3), 
                    	new CraftingEntry(Blocks.PLANKS, 2))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Type56Handguard) {
                        GL11.glTranslatef(-0.6F, 0.4F, -2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Type56Handguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Type56Handguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Type56Handguard").withTextureName("Dummy.png")
              .build(ModernWarfareMod.MOD_CONTEXT);

        RPK74MStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.RPK74MStock(), "ak101stock.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 4))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.RPK74MStock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.6F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.RPK74MStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.RPK74MStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("RPK74MStock").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        RPK74MPlumStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.RPK74MStock(), "ak101plumstock.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 4))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.RPK74MStock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.6F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.RPK74MStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.RPK74MStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("RPK74MPlumStock").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        RPK74MHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.RPK74MHandguard(), "ak101handguard.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.RPK74MHandguard) {
                        GL11.glTranslatef(-0.6F, 0.4F, -2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.RPK74MHandguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.RPK74MHandguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("RPK74MHandguard").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

 RPK74MPlumHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.RPK74MHandguard(), "ak101plumhandguard.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.RPK74MHandguard) {
                        GL11.glTranslatef(-0.6F, 0.4F, -2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.RPK74MHandguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.RPK74MHandguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("RPK74MPlumHandguard").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        RPK74Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.RPK74Stock(), "AK74Stock.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 4))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.RPK74Stock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.6F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.RPK74Stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.RPK74Stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("RPK74Stock").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        RPK74Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.RPK74Handguard(), "AK74Handguard.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.RPK74Handguard) {
                        GL11.glTranslatef(-0.6F, 0.4F, -2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.RPK74Handguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.RPK74Handguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("RPK74Handguard").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Mk17Upper = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Mk17Upper(), "scarl.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Mk17Upper) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Mk17Upper) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Mk17Upper) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Mk17Upper").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Mk20Upper = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Mk20Upper(), "scarl.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Mk20Upper) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Mk20Upper) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Mk20Upper) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Mk20Upper").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Mk20Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Mk20Handguard(), "scarl.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Mk20Handguard) {
                    	 GL11.glTranslatef(-0.6F, 0.1F, -1.6F);
                         GL11.glRotatef(10F, 1f, 0f, 0f);
                         GL11.glRotatef(-190F, 0f, 1f, 0f);
                         GL11.glRotatef(0F, 0f, 0f, 1f);
                         GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Mk20Handguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Mk20Handguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Mk20Handguard").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);


        SCARSCUpper = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.SCARSCUpper(), "scarl.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.SCARSCUpper) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SCARSCUpper) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SCARSCUpper) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SCARSCUpper").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        SCARSCHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.SCARSCHandguard(), "scarl.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.SCARSCHandguard) {
                    	 GL11.glTranslatef(-0.6F, 0.1F, -1.6F);
                         GL11.glRotatef(10F, 1f, 0f, 0f);
                         GL11.glRotatef(-190F, 0f, 1f, 0f);
                         GL11.glRotatef(0F, 0f, 0f, 1f);
                         GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SCARSCHandguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SCARSCHandguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SCARSCHandguard").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);       

        RPK74MGreenStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.RPK74MStock(), "ak101greenstock.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 4))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.RPK74MStock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.6F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.RPK74MStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.RPK74MStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("RPK74MGreenStock").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        RPK74MPearlStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.RPK74MStock(), "ak101pearlstock.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 4))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.RPK74MStock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.6F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.RPK74MStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.RPK74MStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("RPK74MPearlStock").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        RPK74MGreenHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.RPK74MHandguard(), "ak101greenhandguard.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.RPK74MHandguard) {
                        GL11.glTranslatef(-0.6F, 0.4F, -2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.RPK74MHandguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.RPK74MHandguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("RPK74MGreenHandguard").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

 RPK74MPearlHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.RPK74MHandguard(), "ak101pearlhandguard.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.RPK74MHandguard) {
                        GL11.glTranslatef(-0.6F, 0.4F, -2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.RPK74MHandguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.RPK74MHandguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("RPK74MPearlHandguard").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        RPK74MWhiteStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.RPK74MStock(), "ak101whitestock.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 4))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.RPK74MStock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.6F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.RPK74MStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.RPK74MStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("RPK74MWhiteStock").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        RPK74MWhiteHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.RPK74MHandguard(), "ak101whitehandguard.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.RPK74MHandguard) {
                        GL11.glTranslatef(-0.6F, 0.4F, -2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.RPK74MHandguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.RPK74MHandguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("RPK74MWhiteHandguard").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        AKMSStock = new AttachmentBuilder<Weapon>()
        		.withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.AKMSStock(), "ak47.png")
                .withModernRecipe(
                	CraftingGroup.ATTACHMENT_MODIFICATION,
                	new CraftingEntry(MWCItems.gunmetalIngot, 3), 
                	new CraftingEntry(Blocks.PLANKS, 2))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AKMSStock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.6F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AKMSStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AKMSStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AKMSStock").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        MakarovBodyGreen = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.MakarovPM(), "makarovpmgreen.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.MakarovPM) {
                        GL11.glTranslatef(-0.6F, -0.1F, -0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MakarovPM) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MakarovPM) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MakarovBodyGreen")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        MakarovBodyPearl = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.MakarovPM(), "makarovpmpearl.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.MakarovPM) {
                        GL11.glTranslatef(-0.6F, -0.1F, -0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MakarovPM) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MakarovPM) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MakarovBodyPearl")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        MakarovPBBodyGreen = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withRequiredAttachments(Attachments.MakarovPBSlide)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.MakarovPBBody(), "makarovpmgreen.png")
                .withModel(new com.paneedah.mwc.models.makarovfrontsight(), "gun.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3), 
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.MakarovPBBody) {
                        GL11.glTranslatef(-0.6F, -0.1F, -0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MakarovPBBody) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MakarovPBBody) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MakarovPBBodyGreen")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        MakarovPBBodyPearl = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withRequiredAttachments(Attachments.MakarovPBSlide)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.MakarovPBBody(), "makarovpmpearl.png")
                .withModel(new com.paneedah.mwc.models.makarovfrontsight(), "gun.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3), 
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.MakarovPBBody) {
                        GL11.glTranslatef(-0.6F, -0.1F, -0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MakarovPBBody) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MakarovPBBody) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MakarovPBBodyPearl")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

               AK19Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.AK19Grip(), "akergogrip.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AK19Grip) {
                        GL11.glTranslatef(-0.6F, -0.6F, 0.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK19Grip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK19Grip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AK19Grip").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        AK19GripGreen = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.AK19Grip(), "ak12grip.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AK19Grip) {
                        GL11.glTranslatef(-0.6F, -0.6F, 0.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK19Grip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK19Grip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AK19GripGreen").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        AK19GripTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.AK19Grip(), "ak12tangrip.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AK19Grip) {
                        GL11.glTranslatef(-0.6F, -0.6F, 0.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK19Grip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK19Grip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AK19GripTan").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);


        AK19Stock = new AttachmentBuilder<Weapon>()
                .withRenderablePart()
                .withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.AK19Stock(), "ak15handleguard.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AK19Stock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK19Stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK19Stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AK19Stock").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        AK19StockGreen = new AttachmentBuilder<Weapon>()
                .withRenderablePart()
                .withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.AK19Stock(), "ak12handguard.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AK19Stock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK19Stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK19Stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AK19StockGreen").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        AK19StockTan = new AttachmentBuilder<Weapon>()
                .withRenderablePart()
                .withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.AK19Stock(), "ak12tanhandguard.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AK19Stock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK19Stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK19Stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AK19StockTan").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        AN94Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.AN94Stock(), "an94.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 4))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AN94Stock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.6F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AN94Stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AN94Stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AN94Stock").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        AN94GreenStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.AN94Stock(), "an94green.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 4))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AN94Stock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.6F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AN94Stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AN94Stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AN94GreenStock").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        AN94 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.AN94(), "an94.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AN94) {
                        GL11.glTranslatef(-0.6F, 0.4F, -2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AN94) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AN94) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AN94").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

 AN94Green = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.AN94(), "an94green.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AN94) {
                        GL11.glTranslatef(-0.6F, 0.4F, -2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AN94) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AN94) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AN94Green").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        M93RStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withRenderablePart()
                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new com.paneedah.mwc.models.M93RStock(), "bareak.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.4f);
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M93RStock) {
                        GL11.glTranslatef(0.7F, -1.2F, 0.5F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M93RStock) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M93RStock) {
                        GL11.glTranslatef(0.6F, 0.3F, 0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M93RStock) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                })
                .withName("M93RStock").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        M93RSlide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M93RSlide(), "m93r.png")
                .withModel(new com.paneedah.mwc.models.M9A1frontsight(), "M9A1frontsight")
                .withModel(new com.paneedah.mwc.models.M93Rrearsight(), "M9A1rearsight")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M93RSlide) {
                        GL11.glTranslatef(-0.6F, 0.2F, -0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M93RSlide) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M93RSlide) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M93RSlide")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M93RBody = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M93R(), "m93r.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M93R) {
                        GL11.glTranslatef(-0.6F, -0.1F, -0.1F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M93R) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M93R) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M93RBody")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        MK20Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withRenderablePart()
                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new com.paneedah.mwc.models.MK20Stock(), "scarl.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MK20Stock) {
                        GL11.glTranslatef(0.7F, -1.2F, 0.5F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MK20Stock) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MK20Stock) {
                        GL11.glTranslatef(0.6F, 0.3F, 0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MK20Stock) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                })
                .withName("MK20Stock").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        SilencerGroza = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.grozaSilencer(), "groza.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2), 
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.grozaSilencer) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.grozaSilencer) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.grozaSilencer) {
                        GL11.glTranslatef(0.6F, 1.3F, -5.3F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.grozaSilencer) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("SilencerGroza")
                
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        ASValStockB = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.ASValStock(), "sr3m.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3), 
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.ASValStock) {
                    	GL11.glTranslatef(-0.6F, -0.6F, 1.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ASValStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ASValStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("ASValStockB").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        SR3VikhrStockB = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.SR3VikhrStock(), "sr3m.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3), 
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.SR3VikhrStock) {
                    	GL11.glTranslatef(-0.6F, -0.6F, 1.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SR3VikhrStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SR3VikhrStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SR3VikhrStockB").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        SR3MHGB = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.SR3MHG(), "sr3m.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.SR3MHG) {
                    	GL11.glTranslatef(-0.6F, 0.3F, -1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SR3MHG) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SR3MHG) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SR3MHGB").withTextureName("Dummy.png")

                .build(ModernWarfareMod.MOD_CONTEXT);
        
        SR3MHGFB = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.SR3MHGF(), "sr3m.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.SR3MHGF) {
                    	GL11.glTranslatef(-0.6F, 0.3F, -1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SR3MHGF) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SR3MHGF) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SR3MHGFB").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        SR3VikhrHGB = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.SR3VikhrHG(), "sr3m.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.SR3VikhrHG) {
                    	GL11.glTranslatef(-0.6F, 0.3F, -1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SR3VikhrHG) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SR3VikhrHG) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SR3VikhrHGB").withTextureName("Dummy.png")

                .build(ModernWarfareMod.MOD_CONTEXT);

        SilencerSR2M = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.SR2Msilencer(), "vssvintorez.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2), 
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SR2Msilencer) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SR2Msilencer) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SR2Msilencer) {
                        GL11.glTranslatef(0.6F, 1.3F, -5.3F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SR2Msilencer) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("SilencerSR2M")
                
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        SR2MHGB = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.SR2MHG(), "sr3m.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.SR2MHG) {
                    	GL11.glTranslatef(-0.6F, 0.3F, -1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SR2MHG) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SR2MHG) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SR2MHGB").withTextureName("Dummy.png")

                .build(ModernWarfareMod.MOD_CONTEXT);
        
        SR2MHGFB = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.SR2MHGF(), "sr3m.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.SR2MHGF) {
                    	GL11.glTranslatef(-0.6F, 0.3F, -1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SR2MHGF) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SR2MHGF) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SR2MHGFB").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        SR2MHG = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.SR2MHG(), "vssvintorez.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.SR2MHG) {
                    	GL11.glTranslatef(-0.6F, 0.3F, -1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SR2MHG) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SR2MHG) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SR2MHG").withTextureName("Dummy.png")

                .build(ModernWarfareMod.MOD_CONTEXT);
        
        SR2MHGF = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.SR2MHGF(), "vssvintorez.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.SR2MHGF) {
                    	GL11.glTranslatef(-0.6F, 0.3F, -1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SR2MHGF) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SR2MHGF) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SR2MHGF").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        SR2MStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.SR2MStock(), "vssvintorez.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3), 
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.SR2MStock) {
                    	GL11.glTranslatef(-0.6F, -0.6F, 1.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SR2MStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SR2MStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SR2MStock").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        SR2MGB = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.SR2MG(), "sr3m.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.SR2MG) {
                        GL11.glTranslatef(-0.6F, -0.3F, 0.1F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SR2MG) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SR2MG) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SR2MGB").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        SR2MG = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.SR2MG(), "vssvintorez.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.SR2MG) {
                        GL11.glTranslatef(-0.6F, -0.3F, 0.1F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SR2MG) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SR2MG) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SR2MG").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
    }
}
