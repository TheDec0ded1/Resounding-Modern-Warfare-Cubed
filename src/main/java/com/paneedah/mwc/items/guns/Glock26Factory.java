package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.ModernWarfareMod;
import com.paneedah.mwc.init.MWCItems;
import com.paneedah.mwc.models.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.*;
import com.paneedah.weaponlib2.AttachmentCategory;
import com.paneedah.weaponlib2.RenderableState;
import com.paneedah.weaponlib2.Weapon;
import com.paneedah.weaponlib2.WeaponRenderer;
import com.paneedah.weaponlib2.animation.Transform;
import com.paneedah.weaponlib2.animation.Transition;
import com.paneedah.weaponlib2.compatibility.RecoilParam;
import com.paneedah.weaponlib2.config.BalancePackManager.GunConfigurationGroup;
import com.paneedah.weaponlib2.crafting.CraftingEntry;
import com.paneedah.weaponlib2.render.shells.ShellParticleSimulator.Shell.Type;
import net.minecraft.item.Item;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.opengl.GL11;

import java.util.Arrays;

public class Glock26Factory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

        .withName("glock_26")
        .withFireRate(0.999f)
        .withRecoil(2f)
        .withZoom(0.9f)
        .withConfigGroup(GunConfigurationGroup.SIDEARM)
        .withMuzzlePosition(new Vec3d(-0.14400000429153445, -0.8639999959468836, -2.355999876499175))
        .withShellType(Type.PISTOL)
        .withMaxShots(1)
        .withShootSound("glock")
        .withSilencedShootSound("colt_m45a1_silenced")
        .withReloadSound("glock18c_reload")
        .withUnloadSound("pistol_unload")
        .withInspectSound("inspection")
        .withDrawSound("handgun_draw")
        .withReloadingTime(50)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.5f)
        .withFlashScale(() -> 0.6f)
        .withFlashOffsetX(() -> 0.14f)
        .withFlashOffsetY(() -> 0.18f)
        .withCreativeTab(ModernWarfareMod.PistolsTab)
        .useNewSystem()
        .withRecoilParam(new RecoilParam(
        		// The weapon power
        		45.0,
        		// Muzzle climb divisor
        		13.5,
        		// "Stock Length"
        		37.5,
        		// Recovery rate from initial shot
        		0.425,
        		// Recovery rate @ "stock"
        		0.2125,
        		// Recoil rotation (Y)
        		0.0,
        		// Recoil rotation (Z)
        		0.0,
        		// Ads similarity divisor
        		1.0
        ))
        .withInformationProvider(stack -> Arrays.asList(
        "Type: Semi-Automatic Pistol", 
        "Damage: 5", 
        "Cartridge: 9x19mm",
        "Fire Rate: SEMI",
        "Rate of Fire: 99/100",
        "Magazines:",
        "13rnd 9x19mm Glock Magazine",
        "20rnd 9x19mm Magazine",
        "50rnd 9x19mm Drum Magazine"))
        .withModernRecipe( new
        		CraftingEntry(MWCItems.carbonComposite, 7), new
        		CraftingEntry(MWCItems.gunmetalPlate, 3), new
        		CraftingEntry(MWCItems.steelIngot, 3))
        
        .withScreenShaking(RenderableState.SHOOTING, 
                2.5f, // x 
                0.1f, // y
                1f) // z
        
        .withUnremovableAttachmentCategories(AttachmentCategory.FRONTSIGHT)
        .withUnremovableAttachmentCategories(AttachmentCategory.BACKGRIP)
        .withUnremovableAttachmentCategories(AttachmentCategory.RECEIVER)
        .withCompatibleAttachment(GlockParts.Glock26Body, true, (model) -> {
        })
		.withCompatibleAttachment(GlockParts.Glock26Barrel, true, (model) -> {
        })
		.withCompatibleAttachment(GlockParts.Glock26Slide, true, (model) -> {
        })
		.withCompatibleAttachment(GlockParts.Glock19Body, (model) -> {
        })
		.withCompatibleAttachment(GlockParts.Glock19Barrel, (model) -> {
        })
		.withCompatibleAttachment(GlockParts.Glock19Slide, (model) -> {
        })
		.withCompatibleAttachment(GlockParts.Glock17Body, (model) -> {
        })
		.withCompatibleAttachment(GlockParts.Glock17Barrel, (model) -> {
        })
		.withCompatibleAttachment(GlockParts.Glock17Slide, (model) -> {
        })
		.withCompatibleAttachment(GlockParts.Glock34Barrel, (model) -> {
        })
		.withCompatibleAttachment(GlockParts.Glock34Slide, (model) -> {
        })
		.withCompatibleAttachment(GlockParts.Glock26TTBody, (model) -> {
        })
		.withCompatibleAttachment(GlockParts.Glock26TTBarrel, (model) -> {
        })
		.withCompatibleAttachment(GlockParts.Glock26TTSlide, (model) -> {
        })
		.withCompatibleAttachment(GlockParts.Glock19TTBody, (model) -> {
        })
		.withCompatibleAttachment(GlockParts.Glock19TTBarrel, (model) -> {
        })
		.withCompatibleAttachment(GlockParts.Glock19TTSlide, (model) -> {
        })
		.withCompatibleAttachment(GlockParts.Glock17TTBody, (model) -> {
        })
		.withCompatibleAttachment(GlockParts.Glock17TTBarrel, (model) -> {
        })
		.withCompatibleAttachment(GlockParts.Glock17TTSlide, (model) -> {
        })
		.withCompatibleAttachment(GlockParts.Glock34TTBarrel, (model) -> {
        })
		.withCompatibleAttachment(GlockParts.Glock34TTSlide, (model) -> {
        })
                .withCompatibleAttachment(GlockParts.Glock26BodyB, (model) -> {
                })
                .withCompatibleAttachment(GlockParts.Glock26SlideB,  (model) -> {
                })
                .withCompatibleAttachment(GlockParts.Glock19BodyB, (model) -> {
                })
                .withCompatibleAttachment(GlockParts.Glock19SlideB, (model) -> {
                })
                .withCompatibleAttachment(GlockParts.Glock17BodyB, (model) -> {
                })
                .withCompatibleAttachment(GlockParts.Glock17SlideB, (model) -> {
                })
                .withCompatibleAttachment(GlockParts.Glock34SlideB, (model) -> {
                })
                .withCompatibleAttachment(GlockParts.Glock26TTBodyB, (model) -> {
                })
                .withCompatibleAttachment(GlockParts.Glock26TTBarrelB, (model) -> {
                })
                .withCompatibleAttachment(GlockParts.Glock26TTSlideB, (model) -> {
                })
                .withCompatibleAttachment(GlockParts.Glock19TTBodyB, (model) -> {
                })
                .withCompatibleAttachment(GlockParts.Glock19TTBarrelB, (model) -> {
                })
                .withCompatibleAttachment(GlockParts.Glock19TTSlideB, (model) -> {
                })
                .withCompatibleAttachment(GlockParts.Glock17TTBodyB, (model) -> {
                })
                .withCompatibleAttachment(GlockParts.Glock17TTBarrelB, (model) -> {
                })
                .withCompatibleAttachment(GlockParts.Glock17TTSlideB, (model) -> {
                })
                .withCompatibleAttachment(GlockParts.Glock34TTBarrelB, (model) -> {
                })
                .withCompatibleAttachment(GlockParts.Glock34TTSlideB, (model) -> {
                })
                .withCompatibleAttachment(GlockParts.Glock26BodyG, (model) -> {
                })
                .withCompatibleAttachment(GlockParts.Glock26SlideG,  (model) -> {
                })
                .withCompatibleAttachment(GlockParts.Glock19BodyG, (model) -> {
                })
                .withCompatibleAttachment(GlockParts.Glock19SlideG, (model) -> {
                })
                .withCompatibleAttachment(GlockParts.Glock17BodyG, (model) -> {
                })
                .withCompatibleAttachment(GlockParts.Glock17SlideG, (model) -> {
                })
                .withCompatibleAttachment(GlockParts.Glock34SlideG, (model) -> {
                })
                .withCompatibleAttachment(GlockParts.Glock26TTBodyG, (model) -> {
                })
                .withCompatibleAttachment(GlockParts.Glock26TTBarrelG, (model) -> {
                })
                .withCompatibleAttachment(GlockParts.Glock26TTSlideG, (model) -> {
                })
                .withCompatibleAttachment(GlockParts.Glock19TTBodyG, (model) -> {
                })
                .withCompatibleAttachment(GlockParts.Glock19TTBarrelG, (model) -> {
                })
                .withCompatibleAttachment(GlockParts.Glock19TTSlideG, (model) -> {
                })
                .withCompatibleAttachment(GlockParts.Glock17TTBodyG, (model) -> {
                })
                .withCompatibleAttachment(GlockParts.Glock17TTBarrelG, (model) -> {
                })
                .withCompatibleAttachment(GlockParts.Glock17TTSlideG, (model) -> {
                })
                .withCompatibleAttachment(GlockParts.Glock34TTBarrelG, (model) -> {
                })
                .withCompatibleAttachment(GlockParts.Glock34TTSlideG, (model) -> {
                })

                .withCompatibleAttachment(Magazines.Glock26Mag, (model) -> {
        })
		.withCompatibleAttachment(Magazines.Glock19Mag, (model) -> {
        })
		.withCompatibleAttachment(Magazines.Glock17Mag, (model) -> {
        })
        .withCompatibleAttachment(Magazines.Glock18Mag, (model) -> {
        })
        .withCompatibleAttachment(Attachments3.Laser, (p, s) -> {
            GL11.glTranslatef(0.05F, -0.65F, -2.3F);
            GL11.glScaled(1.1F, 1.1F, 1.1F);
            GL11.glRotatef(-90F, 0f, 0f, -4f);
        })
        .withCompatibleAttachment(Attachments.GlockStock, (model) -> {
        	GL11.glTranslatef(0.03F, 0F, 0F);
            GL11.glScaled(0.9F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments3.Silencer9mm, (model) -> {
        	GL11.glTranslatef(-0.18F, -1.19F, -4.36F);
            GL11.glScaled(1.3F, 1.3F, 1.3F);
        })
        .withTextureNames("glock19")
        .withRenderer(new WeaponRenderer.Builder()
    
            .withModel(new Glock18C())
            .withActionPiece(
            		GlockParts.Glock19Slide,
                    GlockParts.Glock19TTSlide,
                    GlockParts.Glock26Slide,
                    GlockParts.Glock26TTSlide,
                    GlockParts.Glock17Slide,
                    GlockParts.Glock17TTSlide,
                    GlockParts.Glock34Slide,
                    GlockParts.Glock34TTSlide,
                    GlockParts.Glock19SlideG,
                    GlockParts.Glock19TTSlideG,
                    GlockParts.Glock26SlideG,
                    GlockParts.Glock26TTSlideG,
                    GlockParts.Glock17SlideG,
                    GlockParts.Glock17TTSlideG,
                    GlockParts.Glock34SlideG,
                    GlockParts.Glock34TTSlideG,
                    GlockParts.Glock19SlideB,
                    GlockParts.Glock19TTSlideB,
                    GlockParts.Glock26SlideB,
                    GlockParts.Glock26TTSlideB,
                    GlockParts.Glock17SlideB,
                    GlockParts.Glock17TTSlideB,
                    GlockParts.Glock34SlideB,
                    GlockParts.Glock34TTSlideB)
            .withActionTransform(new Transform().withPosition(0, 0, 0.5))
            .withEntityPositioning(itemStack -> {
                GL11.glScaled(0.4F, 0.4F, 0.4F);
                GL11.glRotatef(-90F, 0f, 0f, 4f);
            })
            .withInventoryPositioning(itemStack -> {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glTranslatef(0, 0.8f, 0);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
            })
            .withThirdPersonPositioning((renderContext) -> {
                GL11.glScaled(0.5F, 0.5F, 0.5F);
                GL11.glTranslatef(-1.8F, -1F, 2F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioning(
					new Transform()
					.withPosition(-0.945000f, 4.065000f, -7.845000f)
					.withRotation(0.000000f, 1.000000f, 10.681469f)
					.withRotationPoint(-0.12000000357627871, -0.36000001072883614, 0.040000001192092904)
                    .withScale(3.0, 3.0, 3.0)
                )
                
                .withFirstPersonHandPositioning(
                        
                        // Left hand
                        new Transform()
                        .withPosition(1.370000f, 0.865000f, 2.020000f)
                        .withBBRotation(-12.9672, -29.0825, 67.8433)
                        .withScale(3, 3, 4)
                        .withRotationPoint(0, 0, 0),
                        
                        
                        
                        // Right hand
                        new Transform()
                        .withPosition(-0.320000f, 0.140000f, 2.040000f)
                        .withBBRotation(10.0931, 10.9576, -10.0294)
                        .withScale(3, 3, 3.5)
                        .withRotationPoint(0, 0, 0)
                
                )
                
                .setupModernAnimations("glock", GlockParts.Glock26Slide)
                .setupModernMagazineAnimations("glock", 
                		Magazines.Glock26Mag,
                		Magazines.Glock19Mag,
                		Magazines.Glock17Mag,
                		Magazines.Glock18Mag)
                .withFirstPersonCustomPositioning(GlockParts.Glock26Slide.getRenderablePart(), (renderContext) -> {
                    if(renderContext.getWeaponInstance().getAmmo() == 0) {
                        GL11.glTranslatef(0F, 0F, 0.7F);
                    }
                })
                .withFirstPersonCustomPositioning(GlockParts.Glock26TTSlide.getRenderablePart(), (renderContext) -> {
                    if(renderContext.getWeaponInstance().getAmmo() == 0) {
                        GL11.glTranslatef(0F, 0F, 0.7F);
                    }
                })
                .withFirstPersonCustomPositioning(GlockParts.Glock17Slide.getRenderablePart(), (renderContext) -> {
                    if(renderContext.getWeaponInstance().getAmmo() == 0) {
                        GL11.glTranslatef(0F, 0F, 0.7F);
                    }
                })
                .withFirstPersonCustomPositioning(GlockParts.Glock17TTSlide.getRenderablePart(), (renderContext) -> {
                    if(renderContext.getWeaponInstance().getAmmo() == 0) {
                        GL11.glTranslatef(0F, 0F, 0.7F);
                    }
                })
                .withFirstPersonCustomPositioning(GlockParts.Glock19Slide.getRenderablePart(), (renderContext) -> {
                    if(renderContext.getWeaponInstance().getAmmo() == 0) {
                        GL11.glTranslatef(0F, 0F, 0.7F);
                    }
                })
                .withFirstPersonCustomPositioning(GlockParts.Glock19TTSlide.getRenderablePart(), (renderContext) -> {
                    if(renderContext.getWeaponInstance().getAmmo() == 0) {
                        GL11.glTranslatef(0F, 0F, 0.7F);
                    }
                })
                .withFirstPersonCustomPositioning(GlockParts.Glock34Slide.getRenderablePart(), (renderContext) -> {
                    if(renderContext.getWeaponInstance().getAmmo() == 0) {
                        GL11.glTranslatef(0F, 0F, 0.7F);
                    }
                })
                .withFirstPersonCustomPositioning(GlockParts.Glock34TTSlide.getRenderablePart(), (renderContext) -> {
                    if(renderContext.getWeaponInstance().getAmmo() == 0) {
                        GL11.glTranslatef(0F, 0F, 0.7F);
                    }
                })
                .withFirstPersonCustomPositioning(GlockParts.Glock26SlideB.getRenderablePart(), (renderContext) -> {
                    if(renderContext.getWeaponInstance().getAmmo() == 0) {
                        GL11.glTranslatef(0F, 0F, 0.7F);
                    }
                })
                .withFirstPersonCustomPositioning(GlockParts.Glock26TTSlideB.getRenderablePart(), (renderContext) -> {
                    if(renderContext.getWeaponInstance().getAmmo() == 0) {
                        GL11.glTranslatef(0F, 0F, 0.7F);
                    }
                })
                .withFirstPersonCustomPositioning(GlockParts.Glock17SlideB.getRenderablePart(), (renderContext) -> {
                    if(renderContext.getWeaponInstance().getAmmo() == 0) {
                        GL11.glTranslatef(0F, 0F, 0.7F);
                    }
                })
                .withFirstPersonCustomPositioning(GlockParts.Glock17TTSlideB.getRenderablePart(), (renderContext) -> {
                    if(renderContext.getWeaponInstance().getAmmo() == 0) {
                        GL11.glTranslatef(0F, 0F, 0.7F);
                    }
                })
                .withFirstPersonCustomPositioning(GlockParts.Glock19SlideB.getRenderablePart(), (renderContext) -> {
                    if(renderContext.getWeaponInstance().getAmmo() == 0) {
                        GL11.glTranslatef(0F, 0F, 0.7F);
                    }
                })
                .withFirstPersonCustomPositioning(GlockParts.Glock19TTSlideB.getRenderablePart(), (renderContext) -> {
                    if(renderContext.getWeaponInstance().getAmmo() == 0) {
                        GL11.glTranslatef(0F, 0F, 0.7F);
                    }
                })
                .withFirstPersonCustomPositioning(GlockParts.Glock34SlideB.getRenderablePart(), (renderContext) -> {
                    if(renderContext.getWeaponInstance().getAmmo() == 0) {
                        GL11.glTranslatef(0F, 0F, 0.7F);
                    }
                })
                .withFirstPersonCustomPositioning(GlockParts.Glock34TTSlideB.getRenderablePart(), (renderContext) -> {
                    if(renderContext.getWeaponInstance().getAmmo() == 0) {
                        GL11.glTranslatef(0F, 0F, 0.7F);
                    }
                })
                .withFirstPersonCustomPositioning(GlockParts.Glock26SlideG.getRenderablePart(), (renderContext) -> {
                    if(renderContext.getWeaponInstance().getAmmo() == 0) {
                        GL11.glTranslatef(0F, 0F, 0.7F);
                    }
                })
                .withFirstPersonCustomPositioning(GlockParts.Glock26TTSlideG.getRenderablePart(), (renderContext) -> {
                    if(renderContext.getWeaponInstance().getAmmo() == 0) {
                        GL11.glTranslatef(0F, 0F, 0.7F);
                    }
                })
                .withFirstPersonCustomPositioning(GlockParts.Glock17SlideG.getRenderablePart(), (renderContext) -> {
                    if(renderContext.getWeaponInstance().getAmmo() == 0) {
                        GL11.glTranslatef(0F, 0F, 0.7F);
                    }
                })
                .withFirstPersonCustomPositioning(GlockParts.Glock17TTSlideG.getRenderablePart(), (renderContext) -> {
                    if(renderContext.getWeaponInstance().getAmmo() == 0) {
                        GL11.glTranslatef(0F, 0F, 0.7F);
                    }
                })
                .withFirstPersonCustomPositioning(GlockParts.Glock19SlideG.getRenderablePart(), (renderContext) -> {
                    if(renderContext.getWeaponInstance().getAmmo() == 0) {
                        GL11.glTranslatef(0F, 0F, 0.7F);
                    }
                })
                .withFirstPersonCustomPositioning(GlockParts.Glock19TTSlideG.getRenderablePart(), (renderContext) -> {
                    if(renderContext.getWeaponInstance().getAmmo() == 0) {
                        GL11.glTranslatef(0F, 0F, 0.7F);
                    }
                })
                .withFirstPersonCustomPositioning(GlockParts.Glock34SlideG.getRenderablePart(), (renderContext) -> {
                    if(renderContext.getWeaponInstance().getAmmo() == 0) {
                        GL11.glTranslatef(0F, 0F, 0.7F);
                    }
                })
                .withFirstPersonCustomPositioning(GlockParts.Glock34TTSlideG.getRenderablePart(), (renderContext) -> {
                    if(renderContext.getWeaponInstance().getAmmo() == 0) {
                        GL11.glTranslatef(0F, 0F, 0.7F);
                    }
                })

            
                    
            .withThirdPersonPositioningReloading(
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.3F, -1F, 3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 200, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.3F, -1F, 3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 250, 0),
                
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.3F, -1F, 3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 130, 10),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.3F, -1F, 3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 300, 100),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.3F, -1F, 3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 200, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.3F, -1F, 3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 200, 0),
                
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.3F, -1F, 3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 270, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.3F, -1F, 3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 70, 50)
                )
                    
                    
            .withThirdPersonCustomPositioningReloading(GlockParts.Glock19Slide.getRenderablePart(),
                    new Transition((renderContext) -> {
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.5F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.5F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.5F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.5F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.5F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0.5F);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                        GL11.glTranslatef(0F, 0F, 0F);
                    }, 250, 1000)
                    )
                
            .withFirstPersonPositioningZooming((renderContext) -> {
//                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScaled(3F, 3F, 3F);
                GL11.glTranslatef(0.105f, 0.67f, -1.9f);
                
             //   if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), GlockParts.Glock26TTSlide)) {
                    //System.out.println("Position me for Holo");
             //       GL11.glTranslatef(0f, 0.26f, 1.4f);
             //   }
                
                // Everything else
               // else {
               // }
                
            
                })
            
            .withFirstPersonPositioningModifying((renderContext) -> {
				 new Transform()
				 .withPosition(-0.945000f, 3.625000f, -7.165000f)
				 .withRotation(-4.041486f, -30.854630f, -19.420376f)
				 .withRotationPoint(-0.120000f, -0.360000f, 0.040000f)
				 .withScale(3.000000f, 3.000000f, 3.000000f)
				 .doGLDirect();
			 })
			 .withFirstPersonPositioningModifyingAlt((renderContext) -> {
				 new Transform()
				 .withPosition(-0.945000f, 3.625000f, -7.885000f)
				 .withRotation(-4.041486f, -45.595835f, -21.768277f)
				 .withRotationPoint(-0.350000f, -2.900000f, -0.100000f)
				 .withScale(3.000000f, 3.000000f, 3.000000f)
				 .doGLDirect();
           })
           
			 .withFirstPersonHandPositioningModifying(
                    (renderContext) -> {
                   	 new Transform()
                   	 .withPosition(2.770000f, 1.225000f, 0.140000f)
                   	 .withRotation(73.670132f, -70.659155f, 41.991085f)
                        .withScale(2.6, 2.6, 4.0)
                        .withRotationPoint(0.000000f, 0.000000f, 0.000000f)
                        .doGLDirect();
                    }, 
                    (renderContext) -> {
                   	 new Transform()
                   	 .withPosition(-0.320000f, 0.140000f, 2.040000f)
                        .withBBRotation(10.0931, 10.9576, -10.0294)
                        .withScale(3, 3, 3.5)
                        .withRotationPoint(0, 0, 0)
                        .doGLDirect();
                    })
                    
           .withFirstPersonHandPositioningModifyingAlt(
           		(renderContext) -> {
                  	 new Transform()
	                   	 .withPosition(2.770000f, 1.225000f, 0.140000f)
	                   	 .withRotation(73.670132f, -70.659155f, 41.991085f)
                       .withScale(2.6, 2.6, 4.0)
                       .withRotationPoint(0.000000f, 0.000000f, 0.000000f)
                       .doGLDirect();
                   }, 
                   (renderContext) -> {
                  	 new Transform()
                  	 .withPosition(-0.320000f, 0.140000f, 2.040000f)
                       .withBBRotation(10.0931, 10.9576, -10.0294)
                       .withScale(3, 3, 3.5)
                       .withRotationPoint(0, 0, 0)
                       .doGLDirect();
                   })
                    
            .withThirdPersonLeftHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.100000f, 0.100000f);
                    }, 330, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, -0.100000f, 0.125000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.075000f, -0.050000f, 0.025000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.075000f, -0.050000f, 0.025000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(5.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.125000f, -0.100000f, 0.125000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.100000f, 0.100000f);
                    }, 50, 200),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.100000f, 0.100000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(-0.100000f, -0.100000f, 0.100000f);
                    }, 250, 0))
                    
            .withThirdPersonRightHandPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-67.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-11.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-67.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-66.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-9.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 1000),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-62.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                    }, 250, 50),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.050000f, -0.150000f, 0.150000f);
                    }, 250, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                        GL11.glRotatef(-62.000000f, 1f, 0f, 0f);
                        GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                        GL11.glRotatef(-5.000000f, 0f, 0f, 1f);
                        GL11.glTranslatef(0.050000f, -0.150000f, 0.150000f);
                    }, 250, 0))
                          
            .build())
        .withSpawnEntityDamage(5f)
        .withSpawnEntityGravityVelocity(0.02f)
        
         
        .build(ModernWarfareMod.MOD_CONTEXT);
    }
    
    @SubscribeEvent
    public void lootLoad(LootTableLoadEvent evt) {
        if (evt.getName().toString().equals("minecraft:chests/simple_dungeon")) {
            // do stuff with evt.getTable()
        }
    }
}
