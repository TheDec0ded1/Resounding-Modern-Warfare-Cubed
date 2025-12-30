package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.ModernWarfareMod;
import com.paneedah.mwc.init.MWCItems;
import com.paneedah.mwc.models.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.Attachments;
import com.paneedah.mwc.weapons.Attachments2;
import com.paneedah.mwc.weapons.Attachments3;
import com.paneedah.mwc.weapons.AuxiliaryAttachments;
import com.paneedah.mwc.weapons.STANAGMagazines;
import com.paneedah.weaponlib2.AttachmentCategory;
import com.paneedah.weaponlib2.RenderableState;
import com.paneedah.weaponlib2.Weapon;
import com.paneedah.weaponlib2.WeaponRenderer;
import com.paneedah.weaponlib2.animation.Transform;
import com.paneedah.weaponlib2.animation.Transition;
import com.paneedah.weaponlib2.compatibility.RecoilParam;
import com.paneedah.weaponlib2.config.BalancePackManager.GunConfigurationGroup;
import com.paneedah.weaponlib2.crafting.CraftingEntry;
import net.minecraft.item.Item;
import org.lwjgl.opengl.GL11;

import java.util.Arrays;

public class QBZ97Factory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

        .withName("qbz97")
        .withFireRate(0.75f)
        .withRecoil(2.5f)
        .withZoom(0.9f)
        .withConfigGroup(GunConfigurationGroup.AR)
        .hasFlashPedals()
        .withMaxShots(1, Integer.MAX_VALUE)
        //.withMaxShots(5)
        .withShootSound("qbz97")
        .withSilencedShootSound("qbz95_silenced")
        .withReloadSound("fnfal_reload")
        .withUnloadSound("fnfal_unload")
        .withInspectSound("inspection")
        .withDrawSound("noaction_draw")
        .withReloadingTime(45)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.6f)
        .withFlashScale(() -> 0.5f)
        .withFlashOffsetX(() -> 0.09f)
        .withFlashOffsetY(() -> 0.2f)
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
        "Type: Bullpup Assault Rifle",
        "Damage: 6", 
        "Cartridge: 5.56x45mm NATO",
        "Fire Rate: SEMI, BURST",
        "Rate of Fire: 60/100",
        "Magazines:",
        "20rnd 7.62x51mm Magazine"))
        
        .withScreenShaking(RenderableState.SHOOTING, 
                2.5f, // x 
                1f, // y
                2f) // z
        
        .withModernRecipe( new
        		CraftingEntry(MWCItems.carbonComposite, 6), new
        		CraftingEntry(MWCItems.gunmetalPlate, 10), new
        		CraftingEntry(MWCItems.steelIngot, 3))
        
        .withUnremovableAttachmentCategories(AttachmentCategory.STOCK)
       .withUnremovableAttachmentCategories(AttachmentCategory.RECEIVER)
        .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
        

        .withCompatibleAttachment(AuxiliaryAttachments.QBZ95Action, true, (model) -> {
        })
        .withCompatibleAttachment(Attachments2.QBZ95Body, (model) -> {
        })
        .withCompatibleAttachment(Attachments2.QBZ97Body, true, (model) -> {
        })
        .withCompatibleAttachment(Attachments2.QBZ95Dustcover, true, (model) -> {
        })
        .withCompatibleAttachment(Attachments2.QBZ95BDustcover, (model) -> {
        })
        .withCompatibleAttachment(Attachments2.QBB95Dustcover, (model) -> {
        })
        .withCompatibleAttachment(Attachments2.QBZ95Upper, true, (model) -> {
        })
        .withCompatibleAttachment(Attachments2.QBZ95Longbow, (model) -> {
        })
        .withCompatibleAttachment(Attachments2.QBZ95Defender, (model) -> {
        })
        .withCompatibleAttachment(STANAGMagazines.M4A1Mag, (model) -> {
		    GL11.glTranslatef(-0.335F, 0.4F, 1.65F);
            GL11.glScaled(1.05F, 1.2F, 1.15F);
            
//            GL11.glTranslatef(0F, 0.35F, 0F);
        })
        .withCompatibleAttachment(STANAGMagazines.M16Mag, (model) -> {
		    GL11.glTranslatef(-0.335F, 0.4F, 1.65F);
            GL11.glScaled(1.05F, 1.2F, 1.15F);
            
//            GL11.glTranslatef(0F, 0.35F, 0F);
        })
		.withCompatibleAttachment(STANAGMagazines.SOCOM_Mag, (model) -> {
		    GL11.glTranslatef(-0.335F, 0.4F, 1.65F);
            GL11.glScaled(1.05F, 1.2F, 1.15F);
        })
        .withCompatibleAttachment(STANAGMagazines.M38Mag, (model) -> {
          GL11.glTranslatef(-0.335F, 0.4F, 1.65F);
            GL11.glScaled(1.05F, 1.2F, 1.15F);
        })
                .withCompatibleAttachment(STANAGMagazines.LancerMag10ClearGrey, (model) -> {
                    GL11.glTranslatef(-0.335F, 0.4F, 1.65F);
                    GL11.glScaled(1.05F, 1.2F, 1.15F);
                })
                .withCompatibleAttachment(STANAGMagazines.LancerMag20ClearGrey, (model) -> {
                    GL11.glTranslatef(-0.335F, 0.4F, 1.65F);
                    GL11.glScaled(1.05F, 1.2F, 1.15F);
                })
                .withCompatibleAttachment(STANAGMagazines.LancerMag30ClearGrey, (model) -> {
                    GL11.glTranslatef(-0.335F, 0.4F, 1.65F);
                    GL11.glScaled(1.05F, 1.2F, 1.15F);
                })
                .withCompatibleAttachment(STANAGMagazines.LancerMag10ClearGreen, (model) -> {
                    GL11.glTranslatef(-0.335F, 0.4F, 1.65F);
                    GL11.glScaled(1.05F, 1.2F, 1.15F);
                })
                .withCompatibleAttachment(STANAGMagazines.LancerMag20ClearGreen, (model) -> {
                    GL11.glTranslatef(-0.335F, 0.4F, 1.65F);
                    GL11.glScaled(1.05F, 1.2F, 1.15F);
                })
                .withCompatibleAttachment(STANAGMagazines.LancerMag30ClearGreen, (model) -> {
                    GL11.glTranslatef(-0.335F, 0.4F, 1.65F);
                    GL11.glScaled(1.05F, 1.2F, 1.15F);
                })
                .withCompatibleAttachment(STANAGMagazines.LancerMag10ClearBlue, (model) -> {
                    GL11.glTranslatef(-0.335F, 0.4F, 1.65F);
                    GL11.glScaled(1.05F, 1.2F, 1.15F);
                })
                .withCompatibleAttachment(STANAGMagazines.LancerMag20ClearBlue, (model) -> {
                    GL11.glTranslatef(-0.335F, 0.4F, 1.65F);
                    GL11.glScaled(1.05F, 1.2F, 1.15F);
                })
                .withCompatibleAttachment(STANAGMagazines.LancerMag30ClearBlue, (model) -> {
                    GL11.glTranslatef(-0.335F, 0.4F, 1.65F);
                    GL11.glScaled(1.05F, 1.2F, 1.15F);
                })
        .withCompatibleAttachment(STANAGMagazines.Stanag50, (model) -> {
            GL11.glTranslatef(0F, 0.05F, 2.3F);
//            GL11.glScaled(1.15F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(STANAGMagazines.Stanag60, (model) -> {
            GL11.glRotatef(-10F, 1f, 0f, 0f);
            GL11.glTranslatef(0F, 0.25F, 2.3F);
//            GL11.glScaled(1.15F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(STANAGMagazines.Stanag100, (model) -> {
            GL11.glTranslatef(-0.35F, 0.69F, 2.3F);
            GL11.glScaled(1.15F, 1.2F, 1.15F);
        })
        .withCompatibleAttachment(Attachments3.NightRaider, (player, stack) -> {
            GL11.glTranslatef(-0.21F, -1.87F, -1.4F);
            GL11.glScaled(0.75F, 0.75F, 0.75F);
        },(model) -> {
            if(model instanceof JPUreticle) {
                GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                GL11.glScaled(0.03F, 0.03F, 0.03F);
            }
        })
        .withCompatibleAttachment(Attachments3.ACOG, (player, stack) -> {
            GL11.glTranslatef(-0.295F, -1.92F, 0.2F);
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
		            GL11.glTranslatef(-0.155F, -1.75F, -1F);
		            GL11.glScaled(0.43F, 0.43F, 0.43F);
		},(model) -> {
		     if(model instanceof JPUreticle) {
		        GL11.glTranslatef(0.076F, -0.67F, 4.0251F);
		        GL11.glScaled(0.04F, 0.04F, 0.04F);
		    }
		})
        
        .withCompatibleAttachment(Attachments3.Specter, (player, stack) -> {
		            GL11.glTranslatef(-0.185F, -1.6F, -0.4F);
		            GL11.glScaled(0.4F, 0.4F, 0.4F);
		},(model) -> {
		    if(model instanceof Acog2) {
		        GL11.glTranslatef(0.15F, -1.035F, 1.513F);
		        GL11.glScaled(0.1F, 0.1F, 0.1F);
		    }
		})
        
		.withCompatibleAttachment(Attachments3.MicroReflex, (player, stack) -> {
		    GL11.glTranslatef(-0.15F, -2.41F, -0F);
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
        	GL11.glTranslatef(-0.177F, -1.89F, -0.6F);
            GL11.glScaled(0.36F, 0.36F, 0.36F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments3.AimpointCompM5, (player, stack) -> {
        	GL11.glTranslatef(-0.177F, -1.89F, -0.6F);
            GL11.glScaled(0.36F, 0.36F, 0.36F);
	    },(model) -> {
	        if(model instanceof Reflex2) {
	            GL11.glTranslatef(0.155F, -0.4F, -0.5F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
	    })
        .withCompatibleAttachment(Attachments3.Reflex, (player, stack) -> {
            GL11.glTranslatef(-0.065F, -1.69F, -0.3F);
            GL11.glScaled(0.45F, 0.45F, 0.45F);
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        .withCompatibleAttachment(Attachments3.BijiaReflex, (player, stack) -> {
            GL11.glTranslatef(-0.066F, -1.69F, -0.3F);
            GL11.glScaled(0.45F, 0.45F, 0.45F);
        },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
            GL11.glScaled(0.15F, 0.15F, 0.15F);
        }
        })
        .withCompatibleAttachment(Attachments3.Holographic, (player, stack) -> {
        	GL11.glTranslatef(-0.042F, -1.75F, -0.5F);
            GL11.glScaled(0.65F, 0.65F, 0.65F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                    GL11.glScaled(0.1F, 0.1F, 0.1F);
                }
            })
        .withCompatibleAttachment(Attachments3.HolographicAlt, (player, stack) -> {
        	GL11.glTranslatef(-0.042F, -1.75F, -0.5F);
            GL11.glScaled(0.65F, 0.65F, 0.65F);
        },(model) -> {
            if(model instanceof Holo2) {
                GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        
        .withCompatibleAttachment(Attachments3.EotechHybrid2, (player, stack) -> {
        	GL11.glTranslatef(-0.042F, -1.75F, -0.6F);
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
            GL11.glTranslatef(-0.3F, -1.92F, -0.7F);
            GL11.glScaled(0.45F, 0.45F, 0.45F);
	    },(model) -> {
	        if(model instanceof Holo2) {
	            GL11.glTranslatef(0.395F, -0.33F, -0.1F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
	    })
        .withCompatibleAttachment(Attachments3.Kobra, (player, stack) -> {
        	GL11.glTranslatef(-0.044F, -1.74F, -0.1F);
            GL11.glScaled(0.65F, 0.65F, 0.65F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments3.KobraGen3, (player, stack) -> {
        	GL11.glTranslatef(-0.044F, -1.74F, -0.1F);
            GL11.glScaled(0.65F, 0.65F, 0.65F);
	    },(model) -> {
	        if(model instanceof Reflex2) {
	            GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
	    })
        .withCompatibleAttachment(Attachments3.Grip2, (model) -> {
            GL11.glTranslatef(-0.2F, -0.1F, -2.5F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments3.StubbyGrip, (model) -> {
        	GL11.glTranslatef(-0.2F, -0.1F, -2.5F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments3.AngledGrip, (model) -> {
        	GL11.glTranslatef(-0.2F, -0.05F, -2.5F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments3.VGrip, (model) -> {
        	GL11.glTranslatef(-0.2F, -0.1F, -2.5F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments3.Laser2, (p, s) -> {
		    GL11.glTranslatef(-0.22F, -1.35F, -2.5F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
            GL11.glRotatef(-90F, 0f, 0f, 1f);
		})
		.withCompatibleAttachment(Attachments3.Laser, (p, s) -> {
			GL11.glTranslatef(0.15F, -1F, -3.3F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
		})
        .withCompatibleAttachment(Attachments3.Silencer556x45, (model) -> {
        	GL11.glTranslatef(-0.2F, -1.15F, -5.8F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withTextureNames("qbz97")
        .withRenderer(new WeaponRenderer.Builder()

            .withModel(new QBZ97())
            .withActionPiece(AuxiliaryAttachments.QBZ95Action)
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
            .withFirstPersonPositioning(
					new Transform()
					.withPosition(-1.425000f, 5.185000f, -4.205000f)
					.withRotation(0.000000f, 1.000000f, 6.821898f)
					.withRotationPoint(-0.350000f, -2.900000f, -0.100000f)
                    .withScale(3.0, 3.0, 3.0)
                )
                
                .withFirstPersonHandPositioning(
                        
                        // Left hand
                        new Transform()
                        .withPosition(1.170000f, 0.025000f, 0.060000f)
                        .withBBRotation(-8.1997, -23.6991, 57.7232)
                        .withScale(2.6, 2.6, 4.0)
                        .withRotationPoint(0, 0, 0),
                        
                        
                        
                        // Right hand
                        new Transform()
                        .withPosition(-0.200000f, -0.020000f, 1.560000f)
                        .withRotation(-5.4027, -4.7805, -1.6694)
                        .withScale(3, 3, 3)
                        .withRotationPoint(0, 0, 0)
                
                )
                
                .setupModernAnimations("qbz97", AuxiliaryAttachments.QBZ95Action)
                .setupModernMagazineAnimations("qbz97", 
                		STANAGMagazines.M4A1Mag, 
                		STANAGMagazines.M16Mag,
                		STANAGMagazines.M38Mag, 
                		STANAGMagazines.Stanag100,
                		STANAGMagazines.Stanag50,
                		STANAGMagazines.Stanag60,
                        	STANAGMagazines.LancerMag10ClearBlue,
                        	STANAGMagazines.LancerMag20ClearBlue,
                        	STANAGMagazines.LancerMag30ClearBlue,
                        	STANAGMagazines.LancerMag10ClearGreen,
                       		STANAGMagazines.LancerMag20ClearGreen,
                        	STANAGMagazines.LancerMag30ClearGreen,
                        	STANAGMagazines.LancerMag10ClearGrey,
                        	STANAGMagazines.LancerMag20ClearGrey,
                        	STANAGMagazines.LancerMag30ClearGrey,
                		STANAGMagazines.SOCOM_Mag)
            
            .withThirdPersonPositioning((renderContext) -> {
                GL11.glScaled(0.45F, 0.45F, 0.45F);
                GL11.glTranslatef(-2.1F, -1.1F, 2.2F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
            
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.QBZ95Action.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 1f);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.QBZ95Action.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 1f);
                })
                    
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
            
                    
            .withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.QBZ95Action.getRenderablePart(),
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
//                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.14f, 1.30f, -1.1f);

                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.NightRaider)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.45f, 0.95f);
                } 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.5f, 1.15f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.LeupoldRailScope)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.45f, 0.75f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.Specter)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.41f, 1.2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.MicroReflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.48f, 0.7f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.MicroT1)) {
                    //System.out.println("Position me for Acog");
                	GL11.glTranslatef(0F, 0.445f, 0.9f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.AimpointCompM5)) {
                    //System.out.println("Position me for Acog");
                	GL11.glTranslatef(0F, 0.445f, 0.9f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.Reflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.435f, 0.7f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.BijiaReflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.42f, 0.7f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.Holographic)) {
                    //System.out.println("Position me for Acog");
                	GL11.glTranslatef(0F, 0.50f, 0.7f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.HolographicAlt)) {
                    //System.out.println("Position me for Acog");
                	GL11.glTranslatef(0F, 0.50f, 0.7f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.EotechHybrid2)) {
                    //System.out.println("Position me for Acog");
                	GL11.glTranslatef(0F, 0.50f, 0.85f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.VortexRedux)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.49f, 0.7f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.Kobra)) {
                    //System.out.println("Position me for Acog");
                	GL11.glTranslatef(0F, 0.48f, 0.7f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.KobraGen3)) {
                    //System.out.println("Position me for Acog");
                	GL11.glTranslatef(0F, 0.48f, 0.7f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
            
            .withFirstPersonPositioningModifying((renderContext) -> {
				 new Transform()
				 .withPosition(-1.225000f, 5.185000f, -6.685000f)
				 .withRotation(0.000000f, -30.514396f, -26.062789f)
				 .withRotationPoint(-0.350000f, -2.900000f, -0.100000f)
				 .withScale(3.000000f, 3.000000f, 3.000000f)
				 .doGLDirect();
			 })
			 .withFirstPersonPositioningModifyingAlt((renderContext) -> {
				 new Transform()
				 .withPosition(-1.225000f, 5.185000f, -8.805000f)
				 .withRotation(-0.187566f, -46.164037f, -11.869230f)
				 .withRotationPoint(-0.350000f, -2.900000f, -0.100000f)
				 .withScale(3.000000f, 3.000000f, 3.000000f)
				 .doGLDirect();
            })
					 
			.withFirstPersonHandPositioningModifying(
                    (renderContext) -> {
                   	 new Transform()
                   	.withPosition(3.690000f, 0.025000f, -0.220000f)
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
//                    new Transition((renderContext) -> { // Reload position
//                        GL11.glScalef(3.5f, 3.5f, 3.5f);
//                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
//                        GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
//                        GL11.glRotatef(30.000000f, 0f, 0f, 1f);
//                        GL11.glTranslatef(0.250000f, -0.175000f, 0.225000f);
//                    }, 50, 200),
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
//                    new Transition((renderContext) -> { // Reload position
//                        GL11.glScalef(4f, 4f, 5f);
//                        GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
//                        GL11.glRotatef(10.000000f, 0f, 1f, 0f);
//                        GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
//                        GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
//                    }, 250, 1000),
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

