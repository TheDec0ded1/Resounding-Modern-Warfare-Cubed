package com.paneedah.mwc.items.guns;
// Package

// IMPORT LIST START

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.instancing.PlayerWeaponInstance;
import com.paneedah.mwc.init.MWCItems;
import com.paneedah.mwc.models.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.*;
import com.paneedah.weaponlib.*;
import com.paneedah.mwc.rendering.Transform;
import com.paneedah.weaponlib.animation.Transition;
import com.paneedah.weaponlib.compatibility.RecoilParam;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import net.minecraft.item.Item;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

import java.util.Arrays;
// IMPORT LIST END

public class FNFALFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
        
        .withName("fnfal")
        .withFireRate(0.6f)
        .withRecoil(5f)
        .withZoom(0.9f)
        .withConfigGroup(GunConfigurationGroup.BR)
        .withMuzzlePosition(new Vec3d(-0.13600000405311594, -0.9239999977350232, -8.896000071406363))
        .withMaxShots(1, Integer.MAX_VALUE)
        //.withMaxShots(5)
        .withShootSound("fnfal")
        .withSilencedShootSound("fal_silenced")
        .withReloadSound("fnfal_reload")
        .withUnloadSound("fnfal_unload")
        .withInspectSound("inspection")
        .withDrawSound("noaction_draw")
        .withReloadingTime(45)
        .withFlashIntensity(0.6f)
        .withFlashScale(() -> 0.5f)
        .withFlashOffsetX(() -> 0.09f)
        .withFlashOffsetY(() -> 0.11f)
        .withCreativeTab(MWC.AssaultRiflesTab)
        .useNewSystem()
        .withRecoilParam(new RecoilParam(
		// The weapon power
		62.5,
		// Muzzle climb divisor
		26.625,
		// "Stock Length"
		100.0,
		// Recovery rate from initial shot
		0.5875,
		// Recovery rate @ "stock"
		0.5875,
		// Recoil rotation (Y)
		0.0,
		// Recoil rotation (Z)
		0.0,
		// Ads similarity divisor
		1.0
))
        
        .withScreenShaking(RenderableState.SHOOTING, 
                2f, // x 
                1f, // y
                4.5f) // z

        .withModernRecipe( new
	        CraftingEntry(MWCItems.carbonComposite, 6), new
	        CraftingEntry(MWCItems.gunmetalPlate, 10), new
	        CraftingEntry(MWCItems.steelIngot, 3))


        
        .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
        .withUnremovableAttachmentCategories(AttachmentCategory.BACKGRIP)
        .withUnremovableAttachmentCategories(AttachmentCategory.RECEIVER)
        .withUnremovableAttachmentCategories(AttachmentCategory.RECEIVER2)
        .withUnremovableAttachmentCategories(AttachmentCategory.STOCKADAPTER)
        .withUnremovableAttachmentCategories(AttachmentCategory.BARREL)
        .withUnremovableAttachmentCategories(AttachmentCategory.HANDLE)
        .withUnremovableAttachmentCategories(AttachmentCategory.ACTION)
        
        .withCompatibleAttachment(FALParts.FALupperT2, (model) -> {})
        .withCompatibleAttachment(FALParts.FALbarrelAUS, (model) -> {})
        .withCompatibleAttachment(FALParts.FALbarrelSTG58, true, (model) -> {})
        .withCompatibleAttachment(FALParts.FALbarrelR1, (model) -> {})
        .withCompatibleAttachment(FALParts.FALdustcoverSmooth, (model) -> {})
        .withCompatibleAttachment(FALParts.FALironsL1A1, (model) -> {})
        .withCompatibleAttachment(FALParts.FALgripWooden, true, (model) -> {})
        .withCompatibleAttachment(FALParts.FALstockSlickback, (model) -> {})
        .withCompatibleAttachment(FALParts.FALhandguardR1, (model) -> {})
        .withCompatibleAttachment(FALParts.FALcarryhandlePoly, (model) -> {})
        .withCompatibleAttachment(FALParts.FALstockPara, (model) -> {})
        .withCompatibleAttachment(FALParts.FALhandguardWide, (model) -> {})
        .withCompatibleAttachment(FALParts.FALironsPara, (model) -> {})
        .withCompatibleAttachment(FALParts.FALhandguardSTG58, true, (model) -> {})
        .withCompatibleAttachment(FALParts.FALbipodG1, true, (model) -> {})
        .withCompatibleAttachment(FALParts.FALbarrelPara, (model) -> {})
        .withCompatibleAttachment(FALParts.FALbarrelG1, (model) -> {})
        .withCompatibleAttachment(FALParts.FALhandguardIsraeli, (model) -> {})
        .withCompatibleAttachment(FALParts.FALstockPoly, (model) -> {})
        .withCompatibleAttachment(FALParts.FALgripPoly, (model) -> {})
        .withCompatibleAttachment(FALParts.FALObarrel, (model) -> {})
        .withCompatibleAttachment(FALParts.FALOcarryhandle, (model) -> {})
        .withCompatibleAttachment(FALParts.FALOhandguard, (model) -> {})
        .withCompatibleAttachment(FALParts.FALupperT1, true, (model) -> {})
        .withCompatibleAttachment(FALParts.FALironsSTG58, true, (model) -> {})
        .withCompatibleAttachment(FALParts.FALgripT48, (model) -> {})
        .withCompatibleAttachment(FALParts.FALstockT48, true, (model) -> {})
        .withCompatibleAttachment(FALParts.FALhandguardT48, (model) -> {})
        .withCompatibleAttachment(FALParts.FALbarrelT48, (model) -> {})
        .withCompatibleAttachment(FALParts.FALdustcoverDeflector, true, (model) -> {})
        .withCompatibleAttachment(FALParts.FALupperC2, (model) -> {})
        .withCompatibleAttachment(FALParts.FALlowerT2, (model) -> {})
        .withCompatibleAttachment(FALParts.FALhandleL1A1, (model) -> {})
        .withCompatibleAttachment(FALParts.FALlowerT1, true, (model) -> {})
        .withCompatibleAttachment(FALParts.FALupperT3, (model) -> {})
        .withCompatibleAttachment(FALParts.FALbarrelC1A1, (model) -> {})
        .withCompatibleAttachment(FALParts.FALdustcoverC1A1, (model) -> {})
        .withCompatibleAttachment(FALParts.FALironsC1, (model) -> {})
        .withCompatibleAttachment(FALParts.FALstockPolyL1A1, (model) -> {})
        .withCompatibleAttachment(FALParts.FALgripPolyL1A1, (model) -> {})
        .withCompatibleAttachment(FALParts.FALhandguardPolyL1A1, (model) -> {})
        .withCompatibleAttachment(FALParts.FALhandguardAUS, (model) -> {})
        .withCompatibleAttachment(FALParts.FALhandguardWoodC1A1, (model) -> {})
        .withCompatibleAttachment(FALParts.FALhandguardWoodL1A1, (model) -> {})
        .withCompatibleAttachment(FALParts.FALgripWoodL1A1, (model) -> {})
        .withCompatibleAttachment(FALParts.FALstockWoodL1A1, (model) -> {})
        .withCompatibleAttachment(FALParts.FALcarryhandleWood, true, (model) -> {})
        .withCompatibleAttachment(FALParts.FALhandguardMLOK, (model) -> {})
        .withCompatibleAttachment(FALParts.FALstockACR, (model) -> {})
        .withCompatibleAttachment(FALParts.FALhandleOSW, (model) -> {})
        .withCompatibleAttachment(FALParts.FALactionOSW, (model) -> {})
        .withCompatibleAttachment(FALParts.FALmlokOSW, (model) -> {})
        .withCompatibleAttachment(FALParts.FALadapterOSW, (model) -> {})
        .withCompatibleAttachment(FALParts.FALhandguardOSW, (model) -> {})
        .withCompatibleAttachment(FALParts.FALgripOSW, (model) -> {})
        .withCompatibleAttachment(FALParts.FALdustcoverOSW, (model) -> {})
        .withCompatibleAttachment(FALParts.FALbarrelOSW, (model) -> {})
        .withCompatibleAttachment(FALParts.FALupperOSW, (model) -> {})
  
        .withCompatibleAttachment(FALParts.FALactionChromed, true, (model) -> {})
        .withCompatibleAttachment(FALParts.FALhandle, true, (model) -> {})
        .withCompatibleAttachment(Magazines.FNFALMag, (model) -> {})
        .withCompatibleAttachment(Magazines.FNFAL30Mag, (model) ->{})
        .withCompatibleAttachment(Magazines.FNFAL10Mag, (model) ->{})
        .withCompatibleAttachment(Magazines.FNFALL1A1Mag, (model) -> {})
        .withCompatibleAttachment(Attachments3.NightRaider, (player, stack) -> {
            GL11.glTranslatef(-0.21F, -1.5F, -2F);
            GL11.glScaled(0.75F, 0.75F, 0.75F);
        },(model) -> {
            if(model instanceof JPUreticle) {
                GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                GL11.glScaled(0.03F, 0.03F, 0.03F);
            }
        })
        .withCompatibleAttachment(Attachments3.ACOG, (player, stack) -> {
            GL11.glTranslatef(-0.295F, -1.52F, -0.7F);
            GL11.glScaled(0.73F, 0.73F, 0.73F);
        },(model) -> {
            if(model instanceof AcogScope2) {
                GL11.glTranslatef(-0.018F, -0.25F, 0.13F);
                GL11.glScaled(0.5F, 0.5F, 0.5F);
            }
            else if(model instanceof AcogReticle) {
                GL11.glTranslatef(0.243F, -0.23F, 0.68f);
                GL11.glScaled(0.03F, 0.03F, 0.03F);
            }
        })
        
        .withCompatibleAttachment(Attachments3.LeupoldRailScope, (player, stack) -> {
		            GL11.glTranslatef(-0.155F, -1.35F, -1.6F);
		            GL11.glScaled(0.43F, 0.43F, 0.43F);
		},(model) -> {
		     if(model instanceof JPUreticle) {
		        GL11.glTranslatef(0.076F, -0.67F, 4.0251F);
		        GL11.glScaled(0.04F, 0.04F, 0.04F);
		    }
		})
        
        .withCompatibleAttachment(Attachments3.Specter, (player, stack) -> {
		            GL11.glTranslatef(-0.185F, -1.22F, -1F);
		            GL11.glScaled(0.4F, 0.4F, 0.4F);
		},(model) -> {
		    if(model instanceof Acog2) {
		        GL11.glTranslatef(0.15F, -1.035F, 1.513F);
		        GL11.glScaled(0.1F, 0.1F, 0.1F);
		    }
		})
        
		.withCompatibleAttachment(Attachments3.MicroReflex, (player, stack) -> {
		    GL11.glTranslatef(-0.15F, -2.05F, -1F);
		    GL11.glScaled(0.35F, 0.35F, 0.35F);
		    },(model) -> {
		        if(model instanceof Reflex2) {
		            GL11.glTranslatef(0.08F, 0.97F, -0.4F);
		            GL11.glScaled(0.15F, 0.15F, 0.15F);
		        } else if (model instanceof SightMount) {
		//        	GL11.glTranslatef(-0.15F, -1.82F, -1F);
		//            GL11.glScaled(0.4F, 0.4F, 0.4F);
		        }
		    })
        
        .withCompatibleAttachment(Attachments3.MicroT1, (player, stack) -> {
        	GL11.glTranslatef(-0.177F, -1.52F, -1.2F);
            GL11.glScaled(0.36F, 0.36F, 0.36F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments3.AimpointCompM5, (player, stack) -> {
        	GL11.glTranslatef(-0.177F, -1.52F, -1.2F);
            GL11.glScaled(0.36F, 0.36F, 0.36F);
	    },(model) -> {
	        if(model instanceof Reflex2) {
	            GL11.glTranslatef(0.155F, -0.4F, -0.5F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
	    })
        .withCompatibleAttachment(Attachments3.Reflex, (player, stack) -> {
            GL11.glTranslatef(-0.065F, -1.34F, -1.2F);
            GL11.glScaled(0.45F, 0.45F, 0.45F);
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        .withCompatibleAttachment(Attachments3.BijiaReflex, (player, stack) -> {
            GL11.glTranslatef(-0.066F, -1.32F, -1.2F);
            GL11.glScaled(0.45F, 0.45F, 0.45F);
        },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
            GL11.glScaled(0.15F, 0.15F, 0.15F);
        }
        })
        .withCompatibleAttachment(Attachments3.Holographic, (player, stack) -> {
                GL11.glTranslatef(-0.042F, -1.38F, -1.2F);
                GL11.glScaled(0.65F, 0.65F, 0.65F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                    GL11.glScaled(0.1F, 0.1F, 0.1F);
                }
            })
        .withCompatibleAttachment(Attachments3.HolographicAlt, (player, stack) -> {
        	GL11.glTranslatef(-0.042F, -1.38F, -1.2F);
            GL11.glScaled(0.65F, 0.65F, 0.65F);
        },(model) -> {
            if(model instanceof Holo2) {
                GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        
        .withCompatibleAttachment(Attachments3.EotechHybrid2, (player, stack) -> {
        	GL11.glTranslatef(-0.042F, -1.38F, -1.2F);
            GL11.glScaled(0.65F, 0.65F, 0.65F);
		},(model) -> {
		    if(model instanceof EotechScopeRing) {
		        GL11.glTranslatef(-0.2F, -0.41F, 1.8F);
		        GL11.glScaled(0.5F, 0.5F, 0.5F);
		    }
		    if(model instanceof Holo2) {
		        GL11.glTranslatef(-0.118F, -0.535F, 1.9F);
		        GL11.glScaled(0.05F, 0.05F, 0.05F);
		    }
		})
        
        .withCompatibleAttachment(Attachments3.VortexRedux, (player, stack) -> {
            GL11.glTranslatef(-0.3F, -1.55F, -1.3F);
            GL11.glScaled(0.45F, 0.45F, 0.45F);
	    },(model) -> {
	        if(model instanceof Holo2) {
	            GL11.glTranslatef(0.395F, -0.33F, -0.1F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
	    })
        .withCompatibleAttachment(Attachments3.Kobra, (player, stack) -> {
        	GL11.glTranslatef(-0.044F, -1.39F, -1F);
            GL11.glScaled(0.65F, 0.65F, 0.65F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments3.KobraGen3, (player, stack) -> {
	            GL11.glTranslatef(-0.044F, -1.39F, -1F);
	            GL11.glScaled(0.65F, 0.65F, 0.65F);
	    },(model) -> {
	        if(model instanceof Reflex2) {
	            GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
	    })
        .withCompatibleAttachment(Attachments3.Bipod, (model) -> {
        	GL11.glTranslatef(-0.2F, -0.32F, -4F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments3.Grip2, (model) -> {
            GL11.glTranslatef(-0.2F, -0.32F, -3.5F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments3.StubbyGrip, (model) -> {
        	GL11.glTranslatef(-0.2F, -0.32F, -3.5F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments3.AngledGrip, (model) -> {
        	GL11.glTranslatef(-0.2F, -0.28F, -3.5F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments3.VGrip, (model) -> {
        	GL11.glTranslatef(-0.2F, -0.32F, -3.5F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments3.Silencer762x51, (model) -> {
        	GL11.glTranslatef(-0.2F, -1.18F, -7F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withTextureNames("glock19")
        .withRenderer(new WeaponRenderer.Builder()
            
            .withModel(new Glock18C())
            .withActionPiece(FALParts.FALactionChromed)
            .withActionTransform(new Transform().withPosition(0, 0, 1))
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
                GL11.glScaled(0.45F, 0.45F, 0.45F);
                GL11.glTranslatef(-2.1F, -1.1F, 2.2F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
            
            .withFirstPersonPositioning(
					new Transform()
					.withPosition(-1.225000f, 4.065000f, -2.845000f)
					.withRotation(0.000000f, 1.000000f, 6.300000f)
                    .withPivotPoint(-0.350000f, -2.900000f, -0.100000f)
                    .withScale(3.0f, 3.0f, 3.0f)
                )
                
                .withFirstPersonHandPositioning(
                        
                        // Left hand
                        new Transform()
                        .withPosition(1.210000f, 0.105000f, -0.820000f)
                        .withBBRotation(-7.1415f, -27.3003f, 52.6433f)
                        .withScale(2.8f, 2.8f, 4.0f)
                        .withPivotPoint(0, 0, 0),
                        
                        
                        
                        // Right hand
                        new Transform()
                        .withPosition(-0.200000f, 0.180000f, 1.640000f)
                        .withRotation(-5.4027f, -4.7805f, -1.6694f)
                        .withScale(3, 3, 3.5f)
                        .withPivotPoint(0, 0, 0)
                
                )
                
                .setupModernAnimations("fnfal", AuxiliaryAttachments.AKaction)
                .setupModernMagazineAnimations("fnfal", 
                		Magazines.FNFALMag, Magazines.FNFAL30Mag, Magazines.FNFAL10Mag, Magazines.FNFALL1A1Mag)
                    
            .withThirdPersonPositioningReloading(
//                    new Transition((renderContext) -> { // Reload position
//                        GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
//                        GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
//                        GL11.glRotatef(45.000000f, 0f, 1f, 0f);
//                        GL11.glRotatef(65.000000f, 0f, 0f, 1f);
//                        GL11.glTranslatef(0.150000f, 1.149999f, 0.175000f);
//                    }, 200, 200),
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
//                }, 100, 0)
            )
            
                    
            .withThirdPersonCustomPositioningReloading(FALParts.FALactionChromed.getRenderablePart(),
//                    new Transition((renderContext) -> {
//                    }, 500, 1000),
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
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.145f, 1.03f, -0.5f);

                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.NightRaider)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.15f, 0.6f);
                } 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(-0.003F, 0.17f, 0.8f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.LeupoldRailScope)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(-0.003F, 0.12f, 0.35f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.Specter)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(-0.003F, 0.09f, 0.8f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.MicroReflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.185f, 0.7f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.MicroT1)) {
                    //System.out.println("Position me for Acog");
                	GL11.glTranslatef(0F, 0.14f, 0.9f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.AimpointCompM5)) {
                    //System.out.println("Position me for Acog");
                	GL11.glTranslatef(0F, 0.14f, 0.9f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.Reflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.14f, 0.7f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.BijiaReflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.11f, 0.7f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.Holographic)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.19f, 0.7f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.HolographicAlt)) {
                    //System.out.println("Position me for Acog");
                	GL11.glTranslatef(0F, 0.19f, 0.7f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.EotechHybrid2)) {
                    //System.out.println("Position me for Acog");
                	 GL11.glTranslatef(-0.003F, 0.18f, 0.5f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.VortexRedux)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.19f, 0.7f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.Kobra)) {
                    //System.out.println("Position me for Acog");
                	GL11.glTranslatef(0F, 0.2f, 0.7f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.KobraGen3)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.2f, 0.7f);
                } 
                
                // Everything else
                else {
                }
            
                })
                
            .withFirstPersonPositioningModifying((renderContext) -> {
				 new Transform()
				 .withPosition(-1.905000f, 4.065000f, -3.645000f)
				 .withRotation(0.000000f, -30.514396f, -26.062789f)
				 .withPivotPoint(-0.350000f, -2.900000f, -0.100000f)
				 .withScale(3.000000f, 3.000000f, 3.000000f)
				 .applyTransformations();
			 })
			 .withFirstPersonPositioningModifyingAlt((renderContext) -> {
				 new Transform()
				 .withPosition(-1.425000f, 3.545000f, -5.685000f)
				 .withRotation(-0.187566f, -46.164037f, -11.869230f)
				 .withPivotPoint(-0.350000f, -2.900000f, -0.100000f)
				 .withScale(3.000000f, 3.000000f, 3.000000f)
				 .applyTransformations();
           })
					 
			.withFirstPersonHandPositioningModifying(
                   (renderContext) -> {
                  	 new Transform()
                  	 .withPosition(1.730000f, 0.065000f, -0.980000f)
                  	 .withRotation(93.414678f, 23.699100f, 15.553163f)
                       .withScale(2.6f, 2.6f, 4.0f)
                       .withPivotPoint(0.000000f, 0.000000f, 0.000000f)
                       .applyTransformations();
                   }, 
                   (renderContext) -> {
                  	 new Transform()
                       .withPosition(-0.2f, 0.1f, 2)
                       .withRotation(-5.4027f, -4.7805f, -1.6694f)
                       .withScale(3.5f, 3.5f, 3.5f)
                       .withPivotPoint(0, 0, 0)
                       .applyTransformations();
                   })
                   
          .withFirstPersonHandPositioningModifyingAlt(
          		(renderContext) -> {
                 	 new Transform()
                 	 	.withPosition(2.450000f, -0.335000f, -0.660000f)
                 	 	.withRotation(93.766422f, 50.841130f, 4.679372f)
                 	 	.withScale(2.600000f, 2.600000f, 4.000000f)
                      .withPivotPoint(0.000000f, 0.000000f, 0.000000f)
                      .applyTransformations();
                  }, 
                  (renderContext) -> {
                 	 new Transform()
                 	 	.withPosition(-0.600000f, 0.340000f, 1.880000f)
                 	 	.withRotation(-12.193518f, -4.780500f, 1.399459f)
                      .withScale(3.5f, 3.5f, 3.5f)
                      .withPivotPoint(0.000000f, 0.000000f, 0.000000f)
                      .applyTransformations();
                  })
                   
           .withThirdPersonLeftHandPositioningReloading(
//                   new Transition((renderContext) -> { // Reload position
//                       GL11.glScalef(3.5f, 3.5f, 3.5f);
//                       GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
//                       GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
//                       GL11.glRotatef(30.000000f, 0f, 0f, 1f);
//                       GL11.glTranslatef(0.250000f, -0.175000f, 0.225000f);
//                   }, 50, 200),
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
//                   new Transition((renderContext) -> { // Reload position
//                       GL11.glScalef(4f, 4f, 5f);
//                       GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
//                       GL11.glRotatef(10.000000f, 0f, 1f, 0f);
//                       GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
//                       GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
//                   }, 250, 1000),
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
        .withSpawnEntityDamage(10f)
        .withSpawnEntityGravityVelocity(0.0118f)
                
        .build(MWC.modContext);
    }
}

