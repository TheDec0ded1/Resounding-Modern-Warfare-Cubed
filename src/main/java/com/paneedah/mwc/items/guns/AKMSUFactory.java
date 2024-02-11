package com.paneedah.mwc.items.guns;
// Package

// IMPORT LIST START

import com.paneedah.mwc.ModernWarfareMod;
import com.paneedah.mwc.init.MWCItems;
import com.paneedah.mwc.models.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.Attachments;
import com.paneedah.mwc.weapons.Attachments2;
import com.paneedah.mwc.weapons.Attachments3;
import com.paneedah.mwc.weapons.AuxiliaryAttachments;
import com.paneedah.mwc.weapons.Magazines;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.animation.Transform;
import com.paneedah.weaponlib.animation.Transition;
import com.paneedah.weaponlib.compatibility.RecoilParam;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import net.minecraft.item.Item;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

import java.util.Arrays;
// IMPORT LIST END

public class AKMSUFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
        
        .withName("akmsu")
//        .withAmmoCapacity(30)
        .withFireRate(0.6f)
        .withRecoil(3f)
        .withZoom(0.9f)
        .withConfigGroup(GunConfigurationGroup.RIFLES)
        .hasFlashPedals()
        .withMaxShots(1, Integer.MAX_VALUE)
        .withMuzzlePosition(new Vec3d(-0.16400000488758082, -1.0, -6.5))
        //.withMaxShots(5)
        .withShootSound("akmsu")
        .withSilencedShootSound("ak_silenced")
        .withReloadSound("ak_reload")
        .withUnloadSound("ak_unload")
        .withInspectSound("inspection")
        .withDrawSound("ak_draw")
        .withReloadingTime(45)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.6f)
        .withFlashScale(() -> 0.5f)
        .withFlashOffsetX(() -> 0.12f)
        .withFlashOffsetY(() -> 0.16f)
//        .withSpawnEntityModel(ammoModel)
//        .withSpawnEntityModelTexture(ammoModelTextureName)
        .withShellCasingVerticalOffset(-0.05f)
        .withCreativeTab(ModernWarfareMod.AssaultRiflesTab)
        .useNewSystem()
        .withRecoilParam(new RecoilParam(
				// The weapon power
				15.0,
				// Muzzle climb divisor
				15.75,
				// "Stock Length"
				50.0,
				// Recovery rate from initial shot
				0.4,
				// Recovery rate @ "stock"
				0.3125,
				// Recoil rotation (Y)
				0.0,
				// Recoil rotation (Z)
				0.0,
				// Ads similarity divisor
				1.0
		))
        .withInformationProvider(stack -> Arrays.asList(
        "Type: Assault Rifle/Carbine",
        "Damage: 6", 
        "Cartridge: 5.45x39mm",
        "Fire Rate: SEMI, AUTO",
        "Rate of Fire: 60/100",
        "Magazines:",
        "30rnd 7.62x39mm Magazine",
        "75rd 7.62x39mm Magazine"))
        
        .withScreenShaking(RenderableState.SHOOTING, 
                1.5f, // x 
                3f, // y
                3f) // z
        
        .withModernRecipe( new
        		CraftingEntry(MWCItems.carbonComposite, 8), new
        		CraftingEntry(MWCItems.gunmetalPlate, 12), new
        		CraftingEntry(MWCItems.steelIngot, 3))
        
        .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
        .withUnremovableAttachmentCategories(AttachmentCategory.BACKGRIP)
//        .withUnremovableAttachmentCategories(AttachmentCategory.RAILING)
        .withCompatibleAttachment(Attachments2.MPIKMStock, (model) -> {
      })
        .withCompatibleAttachment(Attachments2.MPIKMGrip, (model) -> {
      })
        .withCompatibleAttachment(Attachments2.AMD63Stock, (model) -> {
      })
        .withCompatibleAttachment(Attachments2.AMD63Grip, (model) -> {
      })
        .withCompatibleAttachment(Attachments2.AMD65Grip, (model) -> {
      })
        .withCompatibleAttachment(Attachments2.AK47BlondeStock, (model) -> {
      })
        .withCompatibleAttachment(Attachments2.AK47BlondeGrip, (model) -> {
      })
        .withCompatibleAttachment(Attachments2.Type562Stock, (model) -> {
      })
        .withCompatibleAttachment(Attachments2.Type562Grip, (model) -> {
      })
        .withCompatibleAttachment(Attachments2.Type562Grip2, (model) -> {
      })
      
        .withCompatibleAttachment(Attachments.AK47Stock, (model) -> {
//            GL11.glTranslatef(0f, 0f, 1f);
        })        .withCompatibleAttachment(Attachments2.PT1Stock, (model) -> {
//            GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments2.AKMStock, (model) -> {
//          GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.RPKStock, (model) -> {
//          GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments2.RPK74Stock, (model) -> {
//          GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments2.RPK74MStock, (model) -> {
//          GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments2.RPK74MPlumStock, (model) -> {
//          GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.AK101Stock, (model) -> {
//            GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.AK101GreenStock, (model) -> {
//            GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.AK101PearlStock, (model) -> {
//            GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.AK101PlumStock, (model) -> {
//            GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.AK101WhiteStock, (model) -> {
//            GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.AK74Stock, (model) -> {
//          GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.AK74GreenStock, (model) -> {
//          GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.AKSUStock, true, (model) -> {
//            GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.AKRStock, (model) -> {
//            GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.AKSUDustCover, true, (model) -> {
//          GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.AKSUHandguard, true, (model) -> {
//            GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.AKS74UHandguard, (model) -> {
//            GL11.glTranslatef(0f, 0f, 1f);
        })
                .withCompatibleAttachment(Attachments3.Laser2, (p, s) -> {
                    GL11.glTranslatef(-0.22F, -1.21F, -4F);
                    GL11.glScaled(0.8F, 0.8F, 0.8F);
                    GL11.glRotatef(-90F, 0f, 0f, 1f);
                })
                .withCompatibleAttachment(Attachments3.Laser, (p, s) -> {
                    GL11.glTranslatef(0.05F, -1.1F, -4.5F);
                    GL11.glScaled(0.8F, 0.8F, 0.8F);
                })
        .withCompatibleAttachment(Attachments.CollapsableMOEStock, (model) -> {
            GL11.glTranslatef(0.02f, 0.2f, -0.2f);
            GL11.glScaled(1.2F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.MagpulCTRStock, (model) -> {
            GL11.glTranslatef(0.02f, 0.2f, -0.4f);
            GL11.glScaled(1.2F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.MilSpecStock, (model) -> {
            GL11.glTranslatef(0.02f, 0.2f, -0.4f);
            GL11.glScaled(1.2F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.AK47Grip, (model) -> {
//            GL11.glTranslatef(0.02f, 0.2f, -0.4f);
//            GL11.glScaled(1.2F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.TantalGrip, (model) -> {
//            GL11.glTranslatef(0.02f, 0.2f, -0.4f);
//            GL11.glScaled(1.2F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.AK101Grip, true, (model) -> {
//            GL11.glTranslatef(0.02f, 0.2f, -0.4f);
//            GL11.glScaled(1.2F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.AK101GreenGrip, (model) -> {
//            GL11.glTranslatef(0.02f, 0.2f, -0.4f);
//            GL11.glScaled(1.2F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.AK101PearlGrip, (model) -> {
//            GL11.glTranslatef(0.02f, 0.2f, -0.4f);
//            GL11.glScaled(1.2F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.AK101PlumGrip, (model) -> {
//            GL11.glTranslatef(0.02f, 0.2f, -0.4f);
//            GL11.glScaled(1.2F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.AK101WhiteGrip, (model) -> {
//            GL11.glTranslatef(0.02f, 0.2f, -0.4f);
//            GL11.glScaled(1.2F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.AKErgoGrip, (model) -> {
//            GL11.glTranslatef(0.02f, 0.2f, -0.4f);
//            GL11.glScaled(1.2F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.AKErgoGripTan, (model) -> {
//          GL11.glTranslatef(0.02f, 0.2f, -0.4f);
//          GL11.glScaled(1.2F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.AK15action, true, (model) -> {
        })


        .withCompatibleAttachment(Magazines.AK15Mag, (model) -> {
        })
        .withCompatibleAttachment(Magazines.AK47PMAGTan, (model) -> {
        })
        .withCompatibleAttachment(Magazines.AK47Mag, (model) -> {
//        	GL11.glTranslatef(0F, 2F, 0.2F);
//            GL11.glRotatef(-10F, 1f, 0f, 0f);
        })
        .withCompatibleAttachment(Magazines.AKMMag, (model) -> {
//        	GL11.glTranslatef(0F, 2F, 0.2F);
//            GL11.glRotatef(-10F, 1f, 0f, 0f);
        })
        .withCompatibleAttachment(Magazines.AKMGreenMag, (model) -> {
//        	GL11.glTranslatef(0F, 2F, 0.2F);
//            GL11.glRotatef(-10F, 1f, 0f, 0f);
        })
        .withCompatibleAttachment(Magazines.AK103Mag, (model) -> {
//        	GL11.glTranslatef(0F, 2F, 0.2F);
//            GL11.glRotatef(-10F, 1f, 0f, 0f);
        })
        .withCompatibleAttachment(Magazines.AK50Mag, (model) -> {
            GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
            GL11.glTranslatef(0f, 0.35f, -0.21f);
        })
        .withCompatibleAttachment(Magazines.AK75Mag, (model) -> {
            GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
            GL11.glTranslatef(0f, 0.35f, 0.35f);
            GL11.glScaled(1.2F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Magazines.AK100Mag, (model) -> {
            GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
            GL11.glTranslatef(0f, 0.35f, -0.21f);
        })
        .withCompatibleAttachment(Attachments.AKIron, true, (model) -> {
            if(model instanceof AKiron3) {
                GL11.glTranslatef(-0.195F, -1.12F, -4.35F);
                GL11.glScaled(0.9F, 0.55F, 0.5F);
            } else if(model instanceof AKMiron2) {
                GL11.glTranslatef(-0.185F, -1.36F, -4.35F);
                GL11.glScaled(0.55F, 0.55F, 0.68F);
            }
        })
        .withCompatibleAttachment(Attachments3.PSO1, (player, stack) -> {
            
            GL11.glTranslatef(0.14F, -0.9F, -1.1F);
            GL11.glScaled(1.2F, 1.2F, 1.2F);
        },(model) -> {
            if(model instanceof PSO1reticle) {
                GL11.glTranslatef(-0.212F, -0.483F, 1.27F);
                GL11.glScaled(0.017F, 0.017F, 0.017F);
            }
             else if(model instanceof PSO12) {
                 GL11.glTranslatef(-0.27F, -0.6F, 1.21F);
                 GL11.glScaled(0.8F, 0.8F, 0.8F);
             }
        })
        .withCompatibleAttachment(Attachments3.OKP7, (player, stack) -> {
        	GL11.glTranslatef(-0.2F, -0.65F, -1F);
            GL11.glScaled(0.7F, 0.7F, 0.7F);
            },(model) -> {
                if(model instanceof Reflex2) {
            }
        })
        .withTextureNames("bareak")
        .withRenderer(new WeaponRenderer.Builder()
                
                .withModel(new AKSU())
                .withActionPiece(AuxiliaryAttachments.AK15action)
                .withActionTransform(new Transform().withPosition(0, 0, 1))
                .withADSBeizer(new Vec3d(0.2, 1.7, 0.5))
                //.withTextureName("AK47")
                //.withWeaponProximity(0.99F)
                //.withYOffsetZoom(5F)
                .withEntityPositioning(itemStack -> {
                    GL11.glScaled(0.35F, 0.35F, 0.35F);
                    GL11.glRotatef(-90F, 0f, 0f, 4f);
                })
                .withInventoryPositioning(itemStack -> {
                    GL11.glScaled(0.28F, 0.28F, 0.28F);
                    GL11.glTranslatef(1, 2f, -1.2f);
                    GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                })
                .withThirdPersonPositioning((renderContext) -> {
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                    GL11.glTranslatef(-1.8F, -1.1F, 2F);
                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                    GL11.glRotatef(70F, 1f, 0f, 0f);
                    })
                
                .withFirstPersonPositioning(
    					new Transform()
    					.withPosition(-1.225000f, 3.705000f, -2.525000f)
    					.withRotation(0.000000f, 1.000000f, 6.300000f)
                        .withRotationPoint(-0.350000f, -2.900000f, -0.100000f)
                        .withScale(3.0, 3.0, 3.0)
                    )
                    
                    .withFirstPersonHandPositioning(
                            
                            // Left hand
                            new Transform()
                            .withPosition(1.210000f, 0.265000f, -0.820000f)
                            .withBBRotation(-7.1415, -27.3003, 52.6433)
                            .withScale(2.8, 2.8, 4.0)
                            .withRotationPoint(0, 0, 0),
                            
                            
                            
                            // Right hand
                            new Transform()
                            .withPosition(-0.200000f, 0.180000f, 1.960000f)
                            .withRotation(-5.4027, -4.7805, -1.6694)
                            .withScale(3, 3, 3.5)
                            .withRotationPoint(0, 0, 0)
                    
                    )
                    
                    .setupModernAnimations("ak47", AuxiliaryAttachments.AK15action)
                    .setupModernMagazineAnimations("ak47", 
                    		Magazines.AK47Mag, 
                    		Magazines.AK15Mag, 
                    		Magazines.AK47PMAGTan,
                    		Magazines.AK50Mag,
                    		Magazines.AK75Mag,
                    		Magazines.AK100Mag)
                
                .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.AK15action.getRenderablePart(), (renderContext) -> {
                    GL11.glTranslatef(0f, 0f, 1f);
                    })
                    
                .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.AK15action.getRenderablePart(), (renderContext) -> {
                    GL11.glTranslatef(0f, 0f, 1f);
                    })
                        
                .withThirdPersonPositioningReloading(
//                        new Transition((renderContext) -> { // Reload position
//                            GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
//                            GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
//                            GL11.glRotatef(45.000000f, 0f, 1f, 0f);
//                            GL11.glRotatef(65.000000f, 0f, 0f, 1f);
//                            GL11.glTranslatef(0.150000f, 1.149999f, 0.175000f);
//                        }, 200, 200),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScaled(0.5F, 0.5F, 0.5F);
                            GL11.glTranslatef(-2.2F, -2F, 2.7F);
                            GL11.glRotatef(-45F, 0f, 1f, 0f);
                            GL11.glRotatef(90F, 1f, 0f, 0f);
                        }, 210, 100),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScaled(0.5F, 0.5F, 0.5F);
                            GL11.glTranslatef(-2.2F, -2F, 2.7F);
                            GL11.glRotatef(-45F, 0f, 1f, 0f);
                            GL11.glRotatef(90F, 1f, 0f, 0f);
                        }, 130, 0),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScaled(0.5F, 0.5F, 0.5F);
                            GL11.glTranslatef(-2.2F, -2F, 2.7F);
                            GL11.glRotatef(-45F, 0f, 1f, 0f);
                            GL11.glRotatef(90F, 1f, 0f, 0f);
                        }, 240, 0),
                        
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScaled(0.5F, 0.5F, 0.5F);
                            GL11.glTranslatef(-2.2F, -2F, 2.7F);
                            GL11.glRotatef(-45F, 0f, 1f, 0f);
                            GL11.glRotatef(90F, 1f, 0f, 0f);
                        }, 400, 150),
                        
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScaled(0.5F, 0.5F, 0.5F);
                            GL11.glTranslatef(-2.2F, -2F, 2.7F);
                            GL11.glRotatef(-45F, 0f, 1f, 0f);
                            GL11.glRotatef(90F, 1f, 0f, 0f);
                        }, 300, 60),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.2F, -2F, 2.7F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 120, 190),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.2F, -2.7F, 3.6F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                        GL11.glRotatef(12F, 0f, 0f, 1f);
                    }, 300, 100),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.2F, -2F, 3.6F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(95F, 1f, 0f, 0f);
                        GL11.glRotatef(12F, 0f, 0f, 1f);
                    }, 120, 100),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2.2F, -2.7F, 3.6F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                        GL11.glRotatef(12F, 0f, 0f, 1f);
                    }, 120, 0)
//                    }, 100, 0)
                )
                
                        
                .withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.AK15action.getRenderablePart(),
//                        new Transition((renderContext) -> {
//                        }, 500, 1000),
                        new Transition((renderContext) -> {
                        }, 500, 1000),
                        new Transition((renderContext) -> {
                        }, 500, 1000),
                        new Transition((renderContext) -> {
                        }, 500, 1000),
                        new Transition((renderContext) -> {
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                            GL11.glTranslatef(0f, 0f, 1f);
                        }, 250, 1000),
                        new Transition((renderContext) -> {
                        }, 250, 1000)
                            )
                
                .withFirstPersonPositioningZooming((renderContext) -> {
//                    GL11.glRotatef(45F, 0f, 1f, 0f);
//                    GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                	GL11.glTranslatef(0.18f, -0.23f, 0.7f);

                    
               // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.NightRaider)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.23f, 0.4f);
                } 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.26f, 0.6f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.LeupoldRailScope)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.18f, 0.2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.Specter)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.18f, 0.4f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.MicroReflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.22f, 0.4f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.MicroT1)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.25f, 0.4f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.AimpointCompM5)) {
                    //System.out.println("Position me for Acog");
                	 GL11.glTranslatef(0F, 0.25f, 0.4f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.Reflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.2f, 0.4f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.BijiaReflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.19f, 0.4f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.Holographic)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.26f, 0.4f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.HolographicAlt)) {
                    //System.out.println("Position me for Acog");
                	 GL11.glTranslatef(0F, 0.26f, 0.4f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.EotechHybrid2)) {
                    //System.out.println("Position me for Acog");
                	 GL11.glTranslatef(0F, 0.28f, 0.4f);
                } 
                    
                 // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.VortexRedux)) {
                        //System.out.println("Position me for Acog");
                        GL11.glTranslatef(0F, 0.28f, 0.7f);
                    } 
                    
                 // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.Kobra)) {
                        //System.out.println("Position me for Acog");
                        GL11.glTranslatef(0F, 0.24f, 0.7f);
                    } 
                    
                 // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.KobraGen3)) {
                        //System.out.println("Position me for Acog");
                    	 GL11.glTranslatef(0F, 0.24f, 0.7f);
                    } 
                    
                 // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.AK15ironsight)) {
                        //System.out.println("Position me for Acog");
                        GL11.glTranslatef(0F, 0.008f, 0f);
                    } 

                    // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.OKP7)) {
                        //System.out.println("Position me for Acog");
                        GL11.glTranslatef(0F, 0.15f, 0f);
                    }

                    // ACOG Zoom
                    if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.PSO1)) {
                        //System.out.println("Position me for Acog");
                        GL11.glTranslatef(-0.02F, 0.16f, -0.45f);
                    }
                    
                    // Everything else
                    else {
                        GL11.glTranslatef(0F, 0.075f, 0f);
                    }
                    
                
                    })
                
                .withFirstPersonPositioningModifying((renderContext) -> {
      				 new Transform()
      				 .withPosition(-1.905000f, 4.065000f, -3.645000f)
      				 .withRotation(0.000000f, -30.514396f, -26.062789f)
      				 .withRotationPoint(-0.350000f, -2.900000f, -0.100000f)
      				 .withScale(3.000000f, 3.000000f, 3.000000f)
      				 .doGLDirect();
      			 })
      			 .withFirstPersonPositioningModifyingAlt((renderContext) -> {
      				 new Transform()
      				 .withPosition(-1.425000f, 3.545000f, -5.685000f)
      				 .withRotation(-0.187566f, -46.164037f, -11.869230f)
      				 .withRotationPoint(-0.350000f, -2.900000f, -0.100000f)
      				 .withScale(3.000000f, 3.000000f, 3.000000f)
      				 .doGLDirect();
                  })
      					 
      			.withFirstPersonHandPositioningModifying(
                          (renderContext) -> {
                         	 new Transform()
                         	 .withPosition(1.730000f, 0.065000f, -0.980000f)
                         	 .withRotation(93.414678f, 23.699100f, 15.553163f)
                              .withScale(2.6, 2.6, 4.0)
                              .withRotationPoint(0.000000f, 0.000000f, 0.000000f)
                              .doGLDirect();
                          }, 
                          (renderContext) -> {
                         	 new Transform()
                              .withPosition(-0.2, 0.1, 2)
                              .withRotation(-5.4027, -4.7805, -1.6694)
                              .withScale(3.5, 3.5, 3.5)
                              .withRotationPoint(0, 0, 0)
                              .doGLDirect();
                          })
                          
                 .withFirstPersonHandPositioningModifyingAlt(
                 		(renderContext) -> {
                        	 new Transform()
                        	 	.withPosition(2.450000f, -0.335000f, -0.660000f)
                        	 	.withRotation(93.766422f, 50.841130f, 4.679372f)
                        	 	.withScale(2.600000f, 2.600000f, 4.000000f)
                             .withRotationPoint(0.000000f, 0.000000f, 0.000000f)
                             .doGLDirect();
                         }, 
                         (renderContext) -> {
                        	 new Transform()
                        	 	.withPosition(-0.600000f, 0.340000f, 1.880000f)
                        	 	.withRotation(-12.193518f, -4.780500f, 1.399459f)
                             .withScale(3.5, 3.5, 3.5)
                             .withRotationPoint(0.000000f, 0.000000f, 0.000000f)
                             .doGLDirect();
                         })
                        
                .withThirdPersonLeftHandPositioningReloading(
//                        new Transition((renderContext) -> { // Reload position
//                            GL11.glScalef(3.5f, 3.5f, 3.5f);
//                            GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
//                            GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
//                            GL11.glRotatef(30.000000f, 0f, 0f, 1f);
//                            GL11.glTranslatef(0.250000f, -0.175000f, 0.225000f);
//                        }, 50, 200),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                            GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                        }, 50, 200),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                            GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                        }, 50, 200),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                            GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.025000f, -0.075000f, -0.075000f);
                        }, 50, 200),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                            GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.025000f, -0.075000f, -0.075000f);
                        }, 50, 200),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                            GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                        }, 50, 200),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                            GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                        }, 250, 0),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                            GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                        }, 250, 100),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                            GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                        }, 280, 0),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                            GL11.glRotatef(-40.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(40.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.100000f, -0.025000f, 0.000000f);
                        }, 280, 0))
                        
                .withThirdPersonRightHandPositioningReloading(
//                        new Transition((renderContext) -> { // Reload position
//                            GL11.glScalef(4f, 4f, 5f);
//                            GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
//                            GL11.glRotatef(10.000000f, 0f, 1f, 0f);
//                            GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
//                            GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
//                        }, 250, 1000),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                            GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.000000f, -0.125000f, 0.100000f);
                        }, 250, 1000),
                        
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                            GL11.glRotatef(-49.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(-1.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.000000f, -0.125000f, 0.100000f);
                        }, 250, 50),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                            GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(3.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.000000f, -0.125000f, 0.100000f);
                        }, 250, 50),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                            GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(2.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.000000f, -0.125000f, 0.100000f);
                        }, 250, 1000),
                        
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                            GL11.glRotatef(-50.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.000000f, -0.125000f, 0.100000f);
                        }, 250, 50),
                        
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                            GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(14.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.000000f, -0.125000f, 0.100000f);
                        }, 260, 0),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                            GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.050000f, 0.050000f, 0.000000f);
                        }, 250, 0),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                            GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.075000f, -0.075000f, 0.025000f);
                        }, 250, 0),
                        new Transition((renderContext) -> { // Reload position
                            GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                            GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(15.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(10.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(0.050000f, 0.050000f, 0.000000f);
                        }, 300, 0))
                 
                .build())
            .withSpawnEntityDamage(6f)
            .withSpawnEntityGravityVelocity(0.0118f)
                    
            .build(ModernWarfareMod.MOD_CONTEXT);
        }
    }

