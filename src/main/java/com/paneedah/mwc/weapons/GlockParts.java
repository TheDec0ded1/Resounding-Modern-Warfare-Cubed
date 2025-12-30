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

public class GlockParts {
    public static ItemAttachment<Weapon> Glock26Body;
	public static ItemAttachment<Weapon> Glock26Barrel;
	public static ItemAttachment<Weapon> Glock26Slide;
	public static ItemAttachment<Weapon> Glock26TTBody;
	public static ItemAttachment<Weapon> Glock26TTBarrel;
	public static ItemAttachment<Weapon> Glock26TTSlide;
	public static ItemAttachment<Weapon> Glock17Body;
	public static ItemAttachment<Weapon> Glock17Barrel;
	public static ItemAttachment<Weapon> Glock17Slide;
	public static ItemAttachment<Weapon> Glock17TTBody;
	public static ItemAttachment<Weapon> Glock17TTBarrel;
	public static ItemAttachment<Weapon> Glock17TTSlide;
	public static ItemAttachment<Weapon> Glock19Body;
	public static ItemAttachment<Weapon> Glock19Barrel;
	public static ItemAttachment<Weapon> Glock19Slide;
	public static ItemAttachment<Weapon> Glock19TTBody;
	public static ItemAttachment<Weapon> Glock19TTBarrel;
	public static ItemAttachment<Weapon> Glock19TTSlide;
    public static ItemAttachment<Weapon> Glock34TTBarrel;
    public static ItemAttachment<Weapon> Glock34TTSlide;
    public static ItemAttachment<Weapon> Glock34Barrel;
    public static ItemAttachment<Weapon> Glock34Slide;
    public static ItemAttachment<Weapon> Maxim9Slide;
    public static ItemAttachment<Weapon> Glock26BodyG;
    public static ItemAttachment<Weapon> Glock26SlideG;
    public static ItemAttachment<Weapon> Glock26TTBodyG;
    public static ItemAttachment<Weapon> Glock26TTBarrelG;
    public static ItemAttachment<Weapon> Glock26TTSlideG;
    public static ItemAttachment<Weapon> Glock17BodyG;
    public static ItemAttachment<Weapon> Glock17SlideG;
    public static ItemAttachment<Weapon> Glock17TTBodyG;
    public static ItemAttachment<Weapon> Glock17TTBarrelG;
    public static ItemAttachment<Weapon> Glock17TTSlideG;
    public static ItemAttachment<Weapon> Glock19BodyG;
    public static ItemAttachment<Weapon> Glock19SlideG;
    public static ItemAttachment<Weapon> Glock19TTBodyG;
    public static ItemAttachment<Weapon> Glock19TTBarrelG;
    public static ItemAttachment<Weapon> Glock19TTSlideG;
    public static ItemAttachment<Weapon> Glock34TTBarrelG;
    public static ItemAttachment<Weapon> Glock34TTSlideG;
    public static ItemAttachment<Weapon> Glock34SlideG;
    public static ItemAttachment<Weapon> Glock26BodyB;
    public static ItemAttachment<Weapon> Glock26SlideB;
    public static ItemAttachment<Weapon> Glock26TTBodyB;
    public static ItemAttachment<Weapon> Glock26TTBarrelB;
    public static ItemAttachment<Weapon> Glock26TTSlideB;
    public static ItemAttachment<Weapon> Glock17BodyB;
    public static ItemAttachment<Weapon> Glock17SlideB;
    public static ItemAttachment<Weapon> Glock17TTBodyB;
    public static ItemAttachment<Weapon> Glock17TTBarrelB;
    public static ItemAttachment<Weapon> Glock17TTSlideB;
    public static ItemAttachment<Weapon> Glock19BodyB;
    public static ItemAttachment<Weapon> Glock19SlideB;
    public static ItemAttachment<Weapon> Glock19TTBodyB;
    public static ItemAttachment<Weapon> Glock19TTBarrelB;
    public static ItemAttachment<Weapon> Glock19TTSlideB;
    public static ItemAttachment<Weapon> Glock34TTBarrelB;
    public static ItemAttachment<Weapon> Glock34TTSlideB;
    public static ItemAttachment<Weapon> Glock34SlideB;

    public static void init(Object mod) {
		
		Maxim9Slide = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Maxim9Slide(), "maxim9.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Maxim9Slide) {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glTranslatef(0, 0.8f, 0);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Maxim9Slide) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Maxim9Slide) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Maxim9Slide").withRenderablePart().withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Glock26Body = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Glock26Body(), "glock26b.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock26Body) {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glTranslatef(0, 0.8f, 0);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock26Body) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock26Body) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock26Body").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

				Glock26Barrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Glock26Barrel(), "glock26b.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock26Barrel) {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glTranslatef(0, 0.8f, 0);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock26Barrel) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock26Barrel) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock26Barrel").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

				Glock26Slide = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Glock26Slide(), "glock26b.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock26Slide) {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glTranslatef(0, 0.8f, 0);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock26Slide) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock26Slide) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock26Slide").withRenderablePart().withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

				Glock26TTBody = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Glock26TTBody(), "glock26.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock26TTBody) {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glTranslatef(0, 0.8f, 0);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock26TTBody) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock26TTBody) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock26TTBody").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

				Glock26TTBarrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Glock26TTBarrel(), "glock26.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock26TTBarrel) {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glTranslatef(0, 0.8f, 0);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock26TTBarrel) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock26TTBarrel) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock26TTBarrel").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

				Glock26TTSlide = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Glock26TTSlide(), "glock26.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock26TTSlide) {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glTranslatef(0, 0.8f, 0);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock26TTSlide) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock26TTSlide) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock26TTSlide").withRenderablePart().withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

				 Glock17Body = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Glock17Body(), "glock17B.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock17Body) {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glTranslatef(0, 0.8f, 0);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock17Body) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock17Body) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock17Body").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

				Glock17Barrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Glock17Barrel(), "glock17b.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock17Barrel) {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glTranslatef(0, 0.8f, 0);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock17Barrel) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock17Barrel) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock17Barrel").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

				Glock17Slide = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Glock17Slide(), "glock17b.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock17Slide) {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glTranslatef(0, 0.8f, 0);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock17Slide) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock17Slide) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock17Slide").withRenderablePart().withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

				Glock17TTBody = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Glock17TTBody(), "glock17.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock17TTBody) {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glTranslatef(0, 0.8f, 0);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock17TTBody) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock17TTBody) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock17TTBody").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

				Glock17TTBarrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Glock17TTBarrel(), "glock17.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock17TTBarrel) {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glTranslatef(0, 0.8f, 0);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock17TTBarrel) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock17TTBarrel) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock17TTBarrel").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

				Glock17TTSlide = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Glock17TTSlide(), "glock17.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock17TTSlide) {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glTranslatef(0, 0.8f, 0);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock17TTSlide) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock17TTSlide) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock17TTSlide").withRenderablePart().withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

				Glock19Body = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Glock19Body(), "glock19B.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19Body) {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glTranslatef(0, 0.8f, 0);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19Body) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19Body) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock19Body").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

				Glock19Barrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Glock19Barrel(), "glock19b.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19Barrel) {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glTranslatef(0, 0.8f, 0);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19Barrel) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19Barrel) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock19Barrel").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

				Glock19Slide = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Glock19Slide(), "glock19b.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19Slide) {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glTranslatef(0, 0.8f, 0);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19Slide) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19Slide) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock19Slide").withRenderablePart().withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

				Glock19TTBody = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Glock19TTBody(), "glock19.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19TTBody) {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glTranslatef(0, 0.8f, 0);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19TTBody) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19TTBody) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock19TTBody").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

				Glock19TTBarrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Glock19TTBarrel(), "glock19.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19TTBarrel) {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glTranslatef(0, 0.8f, 0);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19TTBarrel) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19TTBarrel) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock19TTBarrel").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

				Glock19TTSlide = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Glock19TTSlide(), "glock19.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19TTSlide) {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glTranslatef(0, 0.8f, 0);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19TTSlide) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19TTSlide) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock19TTSlide").withRenderablePart().withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

				Glock34TTBarrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Glock34TTBarrel(), "glock34.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock34TTBarrel) {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glTranslatef(0, 0.8f, 0);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock34TTBarrel) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock34TTBarrel) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock34TTBarrel").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

				Glock34TTSlide = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Glock34TTSlide(), "glock34.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock34TTSlide) {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glTranslatef(0, 0.8f, 0);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock34TTSlide) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock34TTSlide) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock34TTSlide").withRenderablePart().withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

				Glock34Barrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Glock34Barrel(), "glock34b.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock34Barrel) {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glTranslatef(0, 0.8f, 0);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock34Barrel) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock34Barrel) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock34Barrel").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

				Glock34Slide = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Glock34Slide(), "glock34b.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock34Slide) {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glTranslatef(0, 0.8f, 0);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock34Slide) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock34Slide) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock34Slide").withRenderablePart().withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Glock26BodyG = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Glock26Body(), "glock26g.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock26Body) {
                        GL11.glScaled(0.35F, 0.35F, 0.35F);
                        GL11.glTranslatef(0, 0.8f, 0);
                        GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock26Body) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock26Body) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock26BodyG").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Glock26SlideG = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Glock26Slide(), "glock26g.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock26Slide) {
                        GL11.glScaled(0.35F, 0.35F, 0.35F);
                        GL11.glTranslatef(0, 0.8f, 0);
                        GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock26Slide) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock26Slide) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock26SlideG").withRenderablePart().withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Glock26TTBodyG = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Glock26TTBody(), "glock26g.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock26TTBody) {
                        GL11.glScaled(0.35F, 0.35F, 0.35F);
                        GL11.glTranslatef(0, 0.8f, 0);
                        GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock26TTBody) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock26TTBody) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock26TTBodyG").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Glock26TTBarrelG = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Glock26TTBarrel(), "glock26g.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock26TTBarrel) {
                        GL11.glScaled(0.35F, 0.35F, 0.35F);
                        GL11.glTranslatef(0, 0.8f, 0);
                        GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock26TTBarrel) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock26TTBarrel) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock26TTBarrelG").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Glock26TTSlideG = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Glock26TTSlide(), "glock26g.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock26TTSlide) {
                        GL11.glScaled(0.35F, 0.35F, 0.35F);
                        GL11.glTranslatef(0, 0.8f, 0);
                        GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock26TTSlide) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock26TTSlide) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock26TTSlideG").withRenderablePart().withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Glock17BodyG = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Glock17Body(), "glock17g.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock17Body) {
                        GL11.glScaled(0.35F, 0.35F, 0.35F);
                        GL11.glTranslatef(0, 0.8f, 0);
                        GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock17Body) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock17Body) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock17BodyG").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Glock17SlideG = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Glock17Slide(), "glock17g.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock17Slide) {
                        GL11.glScaled(0.35F, 0.35F, 0.35F);
                        GL11.glTranslatef(0, 0.8f, 0);
                        GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock17Slide) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock17Slide) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock17SlideG").withRenderablePart().withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Glock17TTBodyG = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Glock17TTBody(), "glock17g.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock17TTBody) {
                        GL11.glScaled(0.35F, 0.35F, 0.35F);
                        GL11.glTranslatef(0, 0.8f, 0);
                        GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock17TTBody) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock17TTBody) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock17TTBodyG").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Glock17TTBarrelG = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Glock17TTBarrel(), "glock17g.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock17TTBarrel) {
                        GL11.glScaled(0.35F, 0.35F, 0.35F);
                        GL11.glTranslatef(0, 0.8f, 0);
                        GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock17TTBarrel) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock17TTBarrel) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock17TTBarrelG").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Glock17TTSlideG = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Glock17TTSlide(), "glock17g.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock17TTSlide) {
                        GL11.glScaled(0.35F, 0.35F, 0.35F);
                        GL11.glTranslatef(0, 0.8f, 0);
                        GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock17TTSlide) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock17TTSlide) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock17TTSlideG").withRenderablePart().withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Glock19BodyG = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Glock19Body(), "glock19g.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19Body) {
                        GL11.glScaled(0.35F, 0.35F, 0.35F);
                        GL11.glTranslatef(0, 0.8f, 0);
                        GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19Body) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19Body) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock19BodyG").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Glock19SlideG = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Glock19Slide(), "glock19g.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19Slide) {
                        GL11.glScaled(0.35F, 0.35F, 0.35F);
                        GL11.glTranslatef(0, 0.8f, 0);
                        GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19Slide) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19Slide) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock19SlideG").withRenderablePart().withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Glock19TTBodyG = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Glock19TTBody(), "glock19g.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19TTBody) {
                        GL11.glScaled(0.35F, 0.35F, 0.35F);
                        GL11.glTranslatef(0, 0.8f, 0);
                        GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19TTBody) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19TTBody) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock19TTBodyG").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Glock19TTBarrelG = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Glock19TTBarrel(), "glock19g.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19TTBarrel) {
                        GL11.glScaled(0.35F, 0.35F, 0.35F);
                        GL11.glTranslatef(0, 0.8f, 0);
                        GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19TTBarrel) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19TTBarrel) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock19TTBarrelG").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Glock19TTSlideG = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Glock19TTSlide(), "glock19g.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19TTSlide) {
                        GL11.glScaled(0.35F, 0.35F, 0.35F);
                        GL11.glTranslatef(0, 0.8f, 0);
                        GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19TTSlide) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19TTSlide) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock19TTSlideG").withRenderablePart().withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Glock34TTBarrelG = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Glock34TTBarrel(), "glock34g.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock34TTBarrel) {
                        GL11.glScaled(0.35F, 0.35F, 0.35F);
                        GL11.glTranslatef(0, 0.8f, 0);
                        GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock34TTBarrel) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock34TTBarrel) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock34TTBarrelG").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Glock34TTSlideG = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Glock34TTSlide(), "glock34g.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock34TTSlide) {
                        GL11.glScaled(0.35F, 0.35F, 0.35F);
                        GL11.glTranslatef(0, 0.8f, 0);
                        GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock34TTSlide) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock34TTSlide) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock34TTSlideG").withRenderablePart().withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Glock34SlideG = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Glock34Slide(), "glock34g.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock34Slide) {
                        GL11.glScaled(0.35F, 0.35F, 0.35F);
                        GL11.glTranslatef(0, 0.8f, 0);
                        GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock34Slide) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock34Slide) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock34SlideG").withRenderablePart().withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Glock26BodyB = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Glock26Body(), "glock26.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock26Body) {
                        GL11.glScaled(0.35F, 0.35F, 0.35F);
                        GL11.glTranslatef(0, 0.8f, 0);
                        GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock26Body) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock26Body) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock26BodyB").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Glock26SlideB = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Glock26Slide(), "glock26.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock26Slide) {
                        GL11.glScaled(0.35F, 0.35F, 0.35F);
                        GL11.glTranslatef(0, 0.8f, 0);
                        GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock26Slide) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock26Slide) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock26SlideB").withRenderablePart().withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Glock26TTBodyB = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Glock26TTBody(), "glock26b.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock26TTBody) {
                        GL11.glScaled(0.35F, 0.35F, 0.35F);
                        GL11.glTranslatef(0, 0.8f, 0);
                        GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock26TTBody) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock26TTBody) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock26TTBodyB").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Glock26TTBarrelB = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Glock26TTBarrel(), "glock26b.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock26TTBarrel) {
                        GL11.glScaled(0.35F, 0.35F, 0.35F);
                        GL11.glTranslatef(0, 0.8f, 0);
                        GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock26TTBarrel) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock26TTBarrel) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock26TTBarrelB").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Glock26TTSlideB = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Glock26TTSlide(), "glock26b.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock26TTSlide) {
                        GL11.glScaled(0.35F, 0.35F, 0.35F);
                        GL11.glTranslatef(0, 0.8f, 0);
                        GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock26TTSlide) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock26TTSlide) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock26TTSlideB").withRenderablePart().withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Glock17BodyB = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Glock17Body(), "glock17.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock17Body) {
                        GL11.glScaled(0.35F, 0.35F, 0.35F);
                        GL11.glTranslatef(0, 0.8f, 0);
                        GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock17Body) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock17Body) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock17BodyB").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Glock17SlideB = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Glock17Slide(), "glock17.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock17Slide) {
                        GL11.glScaled(0.35F, 0.35F, 0.35F);
                        GL11.glTranslatef(0, 0.8f, 0);
                        GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock17Slide) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock17Slide) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock17SlideB").withRenderablePart().withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Glock17TTBodyB = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Glock17TTBody(), "glock17b.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock17TTBody) {
                        GL11.glScaled(0.35F, 0.35F, 0.35F);
                        GL11.glTranslatef(0, 0.8f, 0);
                        GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock17TTBody) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock17TTBody) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock17TTBodyB").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Glock17TTBarrelB = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Glock17TTBarrel(), "glock17b.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock17TTBarrel) {
                        GL11.glScaled(0.35F, 0.35F, 0.35F);
                        GL11.glTranslatef(0, 0.8f, 0);
                        GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock17TTBarrel) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock17TTBarrel) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock17TTBarrelB").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Glock17TTSlideB = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Glock17TTSlide(), "glock17b.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock17TTSlide) {
                        GL11.glScaled(0.35F, 0.35F, 0.35F);
                        GL11.glTranslatef(0, 0.8f, 0);
                        GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock17TTSlide) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock17TTSlide) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock17TTSlideB").withRenderablePart().withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Glock19BodyB = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Glock19Body(), "glock19.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19Body) {
                        GL11.glScaled(0.35F, 0.35F, 0.35F);
                        GL11.glTranslatef(0, 0.8f, 0);
                        GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19Body) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19Body) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock19BodyB").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Glock19SlideB = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Glock19Slide(), "glock19.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19Slide) {
                        GL11.glScaled(0.35F, 0.35F, 0.35F);
                        GL11.glTranslatef(0, 0.8f, 0);
                        GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19Slide) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19Slide) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock19SlideB").withRenderablePart().withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Glock19TTBodyB = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Glock19TTBody(), "glock19b.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19TTBody) {
                        GL11.glScaled(0.35F, 0.35F, 0.35F);
                        GL11.glTranslatef(0, 0.8f, 0);
                        GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19TTBody) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19TTBody) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock19TTBodyB").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Glock19TTBarrelB = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Glock19TTBarrel(), "glock19b.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19TTBarrel) {
                        GL11.glScaled(0.35F, 0.35F, 0.35F);
                        GL11.glTranslatef(0, 0.8f, 0);
                        GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19TTBarrel) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19TTBarrel) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock19TTBarrelB").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Glock19TTSlideB = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Glock19TTSlide(), "glock19b.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19TTSlide) {
                        GL11.glScaled(0.35F, 0.35F, 0.35F);
                        GL11.glTranslatef(0, 0.8f, 0);
                        GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19TTSlide) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19TTSlide) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock19TTSlideB").withRenderablePart().withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Glock34TTBarrelB = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Glock34TTBarrel(), "glock34b.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock34TTBarrel) {
                        GL11.glScaled(0.35F, 0.35F, 0.35F);
                        GL11.glTranslatef(0, 0.8f, 0);
                        GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock34TTBarrel) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock34TTBarrel) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock34TTBarrelB").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Glock34TTSlideB = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Glock34TTSlide(), "glock34b.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock34TTSlide) {
                        GL11.glScaled(0.35F, 0.35F, 0.35F);
                        GL11.glTranslatef(0, 0.8f, 0);
                        GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock34TTSlide) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock34TTSlide) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock34TTSlideB").withRenderablePart().withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Glock34SlideB = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Glock34Slide(), "glock34.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock34Slide) {
                        GL11.glScaled(0.35F, 0.35F, 0.35F);
                        GL11.glTranslatef(0, 0.8f, 0);
                        GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock34Slide) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock34Slide) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock34SlideB").withRenderablePart().withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

    }
}