package com.paneedah.mwc.items.guns;

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
import org.lwjgl.opengl.GL11;

import java.util.Arrays;

public class HK237Factory implements GunFactory {

	public Item createGun(CommonProxy commonProxy) {
		return new Weapon.Builder()
		
		.withName("hk237")
		//.withAmmoCapacity(30)
		.withFireRate(0.8f)
		.withRecoil(4f)
		.withZoom(0.9f)
		.withConfigGroup(GunConfigurationGroup.AR)
		.hasFlashPedals()
		.withMaxShots(1, Integer.MAX_VALUE)
		.withShootSound("m38_dmr")
		.withSilencedShootSound("aac_honeybadger")
		.withReloadSound("m4a1_reload")
		.withUnloadSound("m4a1_unload")
		.withEndOfShootSound("gun_click")
		.withInspectSound("m4a1_inspection")
		.withDrawSound("m4_draw")
		.withReloadingTime(50)
		.withFlashIntensity(0.5f)
		.withFlashScale(() -> 0.6f)
		.withFlashOffsetX(() -> 0.11f)
		.withFlashOffsetY(() -> 0.16f)
		.withShellCasingForwardOffset(0.05f)
		.withShellCasingVerticalOffset(-0.03f)
//		.withShellCasingEjectEnabled(false)
		.withCreativeTab(MWC.AssaultRiflesTab)
		.useNewSystem()
		.withRecoilParam(new RecoilParam(
		// The weapon power
		30.0,
		// Muzzle climb divisor
		24.0,
		// "Stock Length"
		50.0,
		// Recovery rate from initial shot
		0.2125,
		// Recovery rate @ "stock"
		0.2125,
		// Recoil rotation (Y)
		0.0,
		// Recoil rotation (Z)
		0.0,
		// Ads similarity divisor
		1.0
))
		 
		 .withScreenShaking(RenderableState.SHOOTING, 
	                1f, // x 
	                2f, // y
	                4f) // z
		 
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

        .withCompatibleAttachment(ARParts.M4Action, true, (model) -> {})
        .withCompatibleAttachment(ARParts.M4ChargingHandle, true, (model) -> {})
        .withCompatibleAttachment(ARParts.M16Action, (model) -> {})
        .withCompatibleAttachment(ARParts.M16ChargingHandle, (model) -> {})
        .withCompatibleAttachment(ARParts.OversizeLatchChargingHandle, (model) -> {})
        .withCompatibleAttachment(ARParts.DDChargingHandle, (model) -> {})
        .withCompatibleAttachment(ARParts.N4Lower, (model) -> {})
        .withCompatibleAttachment(ARParts.N4LowerTan, (model) -> {})
        .withCompatibleAttachment(ARParts.N4LowerBlack, (model) -> {})
        .withCompatibleAttachment(ARParts.M4BufferTube, (model) -> {})
        .withCompatibleAttachment(ARParts.M4PistolGrip, (model) -> {})
        .withCompatibleAttachment(ARParts.M4Stock, (model) -> {})
        .withCompatibleAttachment(ARParts.DDStock, (model) -> {})
        .withCompatibleAttachment(ARParts.DDGrip, (model) -> {})
        .withCompatibleAttachment(ARParts.LMG68Grip, (model) -> {})
        .withCompatibleAttachment(ARParts.DDLower, (model) -> {})
        .withCompatibleAttachment(ARParts.M4Lower, (model) -> {})
        .withCompatibleAttachment(ARParts.M16A2Stock, (model) -> {})
        .withCompatibleAttachment(ARParts.M16A2BufferTube, (model) -> {})
        .withCompatibleAttachment(ARParts.M16A1Lower, (model) -> {})
        .withCompatibleAttachment(ARParts.XM16Stock, (model) -> {})
		.withCompatibleAttachment(ARParts.XM16Lower, (model) -> {})
        .withCompatibleAttachment(ARParts.M16PistolGrip, (model) -> {})
        .withCompatibleAttachment(ARParts.M16Lower, (model) -> {})
        .withCompatibleAttachment(ARParts.M16BufferTube, (model) -> {})
        .withCompatibleAttachment(ARParts.ARPistolBufferTube, (model) -> {})
        .withCompatibleAttachment(ARParts.AngstadtSCW_Stock, (model) -> {})
        .withCompatibleAttachment(ARParts.MaximSCW_Stock, (model) -> {})
        .withCompatibleAttachment(ARParts.MaximCCS_Stock, (model) -> {})
        .withCompatibleAttachment(ARParts.M4GripTan, (model) -> {})
        .withCompatibleAttachment(ARParts.M4GripGray, (model) -> {})
        .withCompatibleAttachment(ARParts.CQGrip, (model) -> {})
        .withCompatibleAttachment(ARParts.M110Grip, (model) -> {})
        .withCompatibleAttachment(ARParts.HK416Grip, (model) -> {})
        .withCompatibleAttachment(ARParts.HK416GripTan, true, (model) -> {})
        .withCompatibleAttachment(ARParts.HK416CGrip, (model) -> {})
        .withCompatibleAttachment(ARParts.HK416CGripTan, (model) -> {})
        .withCompatibleAttachment(ARParts.HK416A8Grip, (model) -> {})
        .withCompatibleAttachment(ARParts.HK416A8GripTan, (model) -> {})
        .withCompatibleAttachment(ARParts.HK433Grip, (model) -> {})
        .withCompatibleAttachment(ARParts.HK433GripTan, (model) -> {})
        .withCompatibleAttachment(ARParts.LMG68Grip, (model) -> {})
        .withCompatibleAttachment(ARParts.HKChunkyStock, (model) -> {})
        .withCompatibleAttachment(ARParts.HKSlimlineStock, (model) -> {})
        .withCompatibleAttachment(ARParts.HKCheekpieceStock, (model) -> {})
        .withCompatibleAttachment(ARParts.HKChunkyStockTan, (model) -> {})
        .withCompatibleAttachment(ARParts.HKSlimlineStockTan, true, (model) -> {})
        .withCompatibleAttachment(ARParts.HKCheekpieceStockTan, (model) -> {})
        .withCompatibleAttachment(ARParts.HK416DUpper, (model) -> {})
        .withCompatibleAttachment(ARParts.HK416DLower, (model) -> {})
        .withCompatibleAttachment(ARParts.M27IARUpper, (model) -> {})
        .withCompatibleAttachment(ARParts.M27IARLower, (model) -> {})
        .withCompatibleAttachment(ARParts.HK416CHandguard, (model) -> {})
        .withCompatibleAttachment(ARParts.HK416CBarrel, (model) -> {})
        .withCompatibleAttachment(ARParts.HK416C_Stock, (model) -> {})
        .withCompatibleAttachment(ARParts.M27IARBufferTube, (model) -> {})
        .withCompatibleAttachment(ARParts.HK416A5BufferTube, true, (model) -> {})
        .withCompatibleAttachment(ARParts.HK416A5UpperRAL, true, (model) -> {})
        .withCompatibleAttachment(ARParts.HK416A5Upper, (model) -> {})
        .withCompatibleAttachment(ARParts.HK416A5LowerRAL, true, (model) -> {})
        .withCompatibleAttachment(ARParts.HK416A5Lower, (model) -> {})
        .withCompatibleAttachment(ARParts.HK237HandguardRAL, true, (model) -> {})
        .withCompatibleAttachment(ARParts.HK237Handguard, (model) -> {})
        .withCompatibleAttachment(ARParts.HK237Barrel, true, (model) -> {})


        .withCompatibleAttachment(Attachments.HK416FrontSight, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.GUARD, instance);
                if(activeAttachment == Attachments.Mk18HandGuard) {
                    GL11.glTranslatef(0F, 0F, -0.35F);
                    GL11.glScaled(1F, 1F, 1F);
                } else if(activeAttachment == Attachments.M16A4HandGuard) {
                    GL11.glTranslatef(0F, 0F, -0.8F);
                    GL11.glScaled(1F, 1F, 1F);
                } else {
                    GL11.glTranslatef(0F, 0F, 0F);
                    GL11.glScaled(1F, 1F, 1F);
                }
            }
        },(model) -> {
            if(model instanceof G95_upright_frontsights) {
            	GL11.glTranslatef(-0.155F, -1.58F, -3.5F);
                GL11.glScaled(0.32F, 0.32F, 0.32F);
              }
        }, false, false)
        
        .withCompatibleAttachment(Attachments.MBUSFrontSight, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.GUARD, instance);
                if(activeAttachment == Attachments.Mk18HandGuard) {
                    GL11.glTranslatef(0F, 0F, -0.6F);
                    GL11.glScaled(1F, 1F, 1F);
                } else if(activeAttachment == Attachments.M38HandGuard) {
                    GL11.glTranslatef(0F, 0F, -0.4F);
                    GL11.glScaled(1F, 1F, 1F);
                } else if(activeAttachment == Attachments.M16A4HandGuard || 
                		activeAttachment == Attachments.AR15HandGuard) {
                    GL11.glTranslatef(0F, 0F, -1.2F);
                    GL11.glScaled(1F, 1F, 1F);
                } else {
                    GL11.glTranslatef(0F, 0F, 0F);
                    GL11.glScaled(1F, 1F, 1F);
                }
            }
        },(model) -> {
            if(model instanceof MBUSFrontSight) {
            	GL11.glTranslatef(-0.16F, -1.53F, -3.3F);
                GL11.glScaled(0.35F, 0.35F, 0.35F);
              }
        }, false, false)
        
        .withCompatibleAttachment(Attachments.M4Grip, (model) -> {
        })
        .withCompatibleAttachment(Attachments.HeraArmsGrip, (model) -> {
            GL11.glTranslatef(0F, -0.05F, 0F);
            GL11.glScaled(1F, 0.95F, 1F);
        })
        .withCompatibleAttachment(Magazines.HoneyBadgerMag, (model) -> {
		    GL11.glTranslatef(-0.335F, 0.4F, -1.25F);
            GL11.glScaled(1.05F, 1.2F, 1.15F);
        })
	   .withCompatibleAttachment(Attachments3.TritiumRearSights, (model) -> {
           if(model instanceof TritiumRearSights) {
           	 GL11.glTranslatef(-0.16F, -1.53F, -0.3F);
                GL11.glScaled(0.35F, 0.35F, 0.35F);
           }
       })
	   .withCompatibleAttachment(Attachments3.HK416RearSights, (model) -> {
           if(model instanceof G95_upright_rearsights) {
        	   GL11.glTranslatef(-0.158F, -1.56F, -0.2F);
               GL11.glScaled(0.32F, 0.32F, 0.32F);
           }
       })
	   .withCompatibleAttachment(Attachments3.MBUSRearSights, (model) -> {
           if(model instanceof MBUSRearSight) {
        	   GL11.glTranslatef(-0.16F, -1.53F, -0.3F);
               GL11.glScaled(0.35F, 0.35F, 0.35F);
           }
       })
        
        .withCompatibleAttachment(Attachments3.NightRaider, (player, stack) -> {
                    GL11.glTranslatef(-0.21F, -1.5F, -1.8F);
                    GL11.glScaled(0.75F, 0.75F, 0.75F);
        },(model) -> {
            if(model instanceof JPUreticle) {
                GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                GL11.glScaled(0.03F, 0.03F, 0.03F);
            }
        })
        
		.withCompatibleAttachment(Attachments3.ACOG, (player, stack) -> {
                    GL11.glTranslatef(-0.28F, -1.5F, -0.5F);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
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
		
		.withCompatibleAttachment(Attachments3.Specter, (player, stack) -> {
                    GL11.glTranslatef(-0.18F, -1.2F, -0.7F);
                    GL11.glScaled(0.4F, 0.4F, 0.4F);
        },(model) -> {
            if(model instanceof Acog2) {
                GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
		
		.withCompatibleAttachment(Attachments3.LeupoldRailScope, (player, stack) -> {
		            GL11.glTranslatef(-0.151F, -1.35F, -1.2F);
		            GL11.glScaled(0.4F, 0.4F, 0.4F);
        },(model) -> {
             if(model instanceof JPUreticle) {
                GL11.glTranslatef(0.076F, -0.67F, 4.0251F);
                GL11.glScaled(0.04F, 0.04F, 0.04F);
            }
        })
		
		.withCompatibleAttachment(Attachments3.MicroReflex, (player, stack) -> {
            GL11.glTranslatef(-0.15F, -2.03F, -1F);
            GL11.glScaled(0.35F, 0.35F, 0.35F);
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(0.08F, 0.97F, -0.4F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                } else if (model instanceof SightMount) {
//                	GL11.glTranslatef(-0.15F, -1.82F, -1F);
//                    GL11.glScaled(0.4F, 0.4F, 0.4F);
                }
            })
		
		.withCompatibleAttachment(Attachments3.Reflex, (player, stack) -> {
                    GL11.glTranslatef(-0.066F, -1.31F, -0.9F);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
		},(model) -> {
            if(model instanceof Reflex2) {
			    GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
			}
		})
		.withCompatibleAttachment(Attachments3.BijiaReflex, (player, stack) -> {
	                    GL11.glTranslatef(-0.062F, -1.3F, -1F);
	                    GL11.glScaled(0.48F, 0.48F, 0.48F);
			},(model) -> {
	        if(model instanceof Reflex2) {
	            GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
			})
		
		.withCompatibleAttachment(Attachments3.Holographic, (player, stack) -> {
                    GL11.glTranslatef(-0.041F, -1.35F, -0.7F);
                    GL11.glScaled(0.65F, 0.65F, 0.65F);
			},(model) -> {
	            if(model instanceof Holo2) {
	                GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
	                GL11.glScaled(0.1F, 0.1F, 0.1F);
	            }
	        })
		
		.withCompatibleAttachment(Attachments3.HolographicAlt, (player, stack) -> {
                    GL11.glTranslatef(-0.041F, -1.35F, -0.7F);
                    GL11.glScaled(0.65F, 0.65F, 0.65F);
        },(model) -> {
            if(model instanceof Holo2) {
                GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
		
		.withCompatibleAttachment(Attachments3.EotechHybrid2, (player, stack) -> {
                    GL11.glTranslatef(-0.041F, -1.35F, -1.3F);
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
            GL11.glTranslatef(-0.3F, -1.55F, -1.1F);
            GL11.glScaled(0.45F, 0.45F, 0.45F);
	    },(model) -> {
	        if(model instanceof Holo2) {
	            GL11.glTranslatef(0.395F, -0.33F, -0.1F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
	    })
	    
		.withCompatibleAttachment(Attachments3.Kobra, (player, stack) -> {
                    GL11.glTranslatef(-0.041F, -1.36F, -0.7F);
                    GL11.glScaled(0.65F, 0.65F, 0.65F);
		},(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
		
		.withCompatibleAttachment(Attachments3.KobraGen3, renderContext -> {
		    PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.GUARD, instance);
                if(activeAttachment == Attachments.AR57Handguard) {
                    GL11.glTranslatef(-0.041F, -1.47F, -0.7F);
                    GL11.glScaled(0.65F, 0.65F, 0.65F);
                } else {
                    GL11.glTranslatef(-0.041F, -1.36F, -0.7F);
                    GL11.glScaled(0.65F, 0.65F, 0.65F);
                    }
                }
		},(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        }, false, false)
		
		.withCompatibleAttachment(Attachments3.MicroT1, (player, stack) -> {
                    GL11.glTranslatef(-0.18F, -1.55F, -1F);
                    GL11.glScaled(0.38F, 0.38F, 0.38F);
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
		
		.withCompatibleAttachment(Attachments3.AimpointCompM5, (player, stack) -> {
                    GL11.glTranslatef(-0.18F, -1.55F, -1F);
                    GL11.glScaled(0.38F, 0.38F, 0.38F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
		.withCompatibleAttachment(Attachments3.Grip2, (model) -> {
			GL11.glTranslatef(-0.2F, -0.41F, -2.5F);
			GL11.glScaled(1F, 1F, 1F);
		})
		.withCompatibleAttachment(Attachments3.JunoGrip, (model) -> {
            GL11.glTranslatef(-0.23F, -0.7F, -2.81F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
        })
		.withCompatibleAttachment(Attachments3.StubbyGrip, (model) -> {
		    GL11.glTranslatef(-0.2F, -0.41F, -2.5F);
            GL11.glScaled(1F, 1F, 1F);
		})
		.withCompatibleAttachment(Attachments3.AngledGrip, (model) -> {
		    GL11.glTranslatef(-0.2F, -0.35F, -2.9F);
            GL11.glScaled(1F, 1F, 1F);
		})
		.withCompatibleAttachment(Attachments3.VGrip, (model) -> {
		    GL11.glTranslatef(-0.2F, -0.41F, -2.5F);
            GL11.glScaled(1F, 1F, 1F);
		})
		.withCompatibleAttachment(Attachments3.Bipod, (model) -> {
			GL11.glTranslatef(-0.18F, -0.38F, -3.5F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
		})
		.withCompatibleAttachment(Attachments3.Laser2, (p, s) -> {
		    GL11.glTranslatef(-0.22F, -1.18F, -3F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
            GL11.glRotatef(-90F, 0f, 0f, 1f);
		})
		.withCompatibleAttachment(Attachments3.Laser, (p, s) -> {
			GL11.glTranslatef(0.05F, -1.18F, -3.6F);
			GL11.glScaled(0.8F, 0.8F, 0.8F);
		})
		.withCompatibleAttachment(Attachments3.Silencer556x45, (model) -> {
			GL11.glTranslatef(-0.2F, -1.235F, -7.5F);
			GL11.glScaled(1F, 1F, 1F);
		})
        .withTextureNames("glock19")
        .withRenderer(new WeaponRenderer.Builder()

            .withModel(new Glock18C())
			.withEntityPositioning(itemStack -> {
				GL11.glScaled(0.5F, 0.5F, 0.5F);
				GL11.glTranslatef(0, 0f, 3f);
				GL11.glRotatef(-90F, 0f, 0f, 4f);
			})
			.withInventoryPositioning(itemStack -> {
			    GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glTranslatef(1, 2f, -1.2f);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
			})
			.withThirdPersonPositioning((renderContext) -> {
			    GL11.glScaled(0.6F, 0.6F, 0.6F);
                GL11.glTranslatef(-1.7F, -0.8F, 1.9F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
				})
				
			.withFirstPersonPositioning(
					new Transform()
					.withPosition(-1.425000f, 3.825000f, -2.525000f)
					.withRotation(0.000000f, 1.000000f, 6.300000f)
                    .withPivotPoint(-0.350000f, -2.900000f, -0.100000f)
                    .withScale(3.0f, 3.0f, 3.0f)
                )
                
                .withFirstPersonHandPositioning(
                        
                        // Left hand
                        new Transform()
                        .withPosition(1.050000f, 0.025000f, -0.500000f)
                        .withBBRotation(-8.1997f, -23.6991f, 57.7232f)
                        .withScale(2.6f, 2.6f, 4.0f)
                        .withPivotPoint(0, 0, 0),
                        
                        
                        
                        // Right hand
                        new Transform()
                        .withPosition(-0.2f, 0.1f, 2)
                        .withRotation(-5.4027f, -4.7805f, -1.6694f)
                        .withScale(3.5f, 3.5f, 3.5f)
                        .withPivotPoint(0, 0, 0)
                
                )
                
                .setupModernAnimations("m4a1", AuxiliaryAttachments.AKaction)
                .setupModernMagazineAnimations("m4a1", 
                		Magazines.HoneyBadgerMag)
		
			.withFirstPersonCustomPositioning(ARParts.M4Action.getRenderablePart(), (renderContext) -> {
//			    GL11.glTranslatef(0f, 0f, 0.5f);
                })
			
			.withFirstPersonPositioningCustomRecoiled(ARParts.M4Action.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 0.7f);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(ARParts.M4Action.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 0.7f);
                })
                    
            .withThirdPersonPositioningReloading(
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 180, 200),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 240, 50),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 170, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 170, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 260, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 240, 100),
                
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 200, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 170, 170),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 260, 10),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                        GL11.glTranslatef(-2F, -0.8F, 2.3F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 100, 50)
                    )
			
            .withFirstPersonPositioningZooming((renderContext) -> {
				GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
				GL11.glTranslatef(0.14f, 1.15f, -0.3f);
				
				// Standard Iron Sight Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), AuxiliaryAttachments.AR15Iron)) {
                        GL11.glTranslatef(0F, 0.028f, -0.3f);
				} 
				
				// Standard Iron Sight Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.TritiumRearSights)) {
                        GL11.glTranslatef(0F, 0f, 0f);
				} 
				
				// Standard Iron Sight Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.HK416RearSights)) {
                        GL11.glTranslatef(0F, 0.03f, 0f);
				} 
				
				// Standard Iron Sight Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.MicroReflex)) {
                        GL11.glTranslatef(0F, 0.035f, 0f);
				} 
				
				// Standard Iron Sight Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.NightRaider)) {
                	GL11.glTranslatef(0F, 0.025f, 0f);
                } 
				
				// Standard Iron Sight Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.AKMIron)) {
                        GL11.glTranslatef(0F, 0f, 0f);
				} 
				
				// ACOG Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.ACOG)) {
                        GL11.glTranslatef(-0.01F, 0.03f, 0.3f);
				} 
				
				// ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.Specter)) {
                        GL11.glTranslatef(-0.003F, -0.05f, 0.2f);
                } 

				// HP Zoomw
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.LeupoldRailScope)) {
                        GL11.glTranslatef(0.001F, -0.027f, -0.2f);
				} 
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.Reflex)) {
                        GL11.glTranslatef(0F, -0.015f, 0.1f);
				} 
				
				// Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.BijiaReflex)) {
                        GL11.glTranslatef(0F, -0.01f, 0f);
                } 
				
				// Holo Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.Holographic)) {
                        GL11.glTranslatef(0F, 0.03f, 0f);
				} 
				
				// Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.HolographicAlt)) {
                    	GL11.glTranslatef(0F, 0.03f, 0f);
                } 
                
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.EotechHybrid2)) {
                	GL11.glTranslatef(-0.004F, 0.025f, 0.25f);
                } 
				
             // Holo Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.VortexRedux)) {
                        GL11.glTranslatef(0F, 0.06f, 0f);
                } 
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.Kobra)) {
                        GL11.glTranslatef(0F, 0.035f, 0f);
				} 
				
				// Reflex Zoom
				if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.KobraGen3)) {
                        GL11.glTranslatef(0F, 0.035f, 0f);
				} 
				
				// Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.MicroT1)) {
                        GL11.glTranslatef(0F, 0.055f, 0.3f);
                } 
                
             // Reflex Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.AimpointCompM5)) {
                        GL11.glTranslatef(0F, 0.055f, 0.3f);
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
                   new Transition((renderContext) -> { // Reload position
                       GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                       GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.000000f, -0.075000f, 0.075000f);
                   }, 250, 1000),
                   new Transition((renderContext) -> { // Reload position
                       GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                       GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.000000f, -0.025000f, 0.125000f);
                   }, 250, 1000),
                   new Transition((renderContext) -> { // Reload position
                       GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                       GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(-0.025000f, -0.075000f, 0.000000f);
                   }, 250, 50),
                   new Transition((renderContext) -> { // Reload position
                       GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                       GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(-0.025000f, -0.075000f, 0.000000f);
                   }, 250, 50),
                   new Transition((renderContext) -> { // Reload position
                       GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                       GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(-0.025000f, -0.075000f, 0.000000f);
                   }, 250, 1000),
                   new Transition((renderContext) -> { // Reload position
                       GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                       GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.000000f, -0.025000f, 0.125000f);
                   }, 250, 50),
                   new Transition((renderContext) -> { // Reload position
                       GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                       GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.000000f, -0.025000f, 0.125000f);
                   }, 250, 50),
                   new Transition((renderContext) -> { // Reload position
                       GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                       GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.000000f, -0.025000f, 0.125000f);
                   }, 250, 0),
                   new Transition((renderContext) -> { // Reload position
                       GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                       GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(-0.050000f, -0.025000f, 0.000000f);
                   }, 250, 0),
                   new Transition((renderContext) -> { // Reload position
                       GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                       GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(-0.050000f, -0.025000f, 0.000000f);
                   }, 250, 0))
                   
           .withThirdPersonRightHandPositioningReloading(
                   new Transition((renderContext) -> { // Reload position
                       GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                       GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.325000f, -0.150000f, 0.375000f);
                   }, 250, 1000),
                   new Transition((renderContext) -> { // Reload position
                       GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                       GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(-26.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                   }, 250, 1000),
                   new Transition((renderContext) -> { // Reload position
                       GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                       GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(2.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(-26.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                   }, 250, 50),
                   new Transition((renderContext) -> { // Reload position
                       GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                       GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(1.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                   }, 250, 50),
                   new Transition((renderContext) -> { // Reload position
                       GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                       GL11.glRotatef(-53.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                   }, 250, 1000),
                   new Transition((renderContext) -> { // Reload position
                       GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                       GL11.glRotatef(-53.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                   }, 250, 50),
                   new Transition((renderContext) -> { // Reload position
                       GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                       GL11.glRotatef(-54.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                   }, 250, 50),
                   new Transition((renderContext) -> { // Reload position
                       GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                       GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(1.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(-24.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                   }, 250, 0),
                   new Transition((renderContext) -> { // Reload position
                       GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                       GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(-24.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                   }, 250, 0),
                   new Transition((renderContext) -> { // Reload position
                       GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                       GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                       GL11.glRotatef(2.000000f, 0f, 1f, 0f);
                       GL11.glRotatef(-26.000000f, 0f, 0f, 1f);
                       GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                   }, 250, 0))
					
			.build())
		.withSpawnEntityDamage(6f)
		.withSpawnEntityGravityVelocity(0.0118f)
				
		 
		.build(MWC.modContext);
	}
}
