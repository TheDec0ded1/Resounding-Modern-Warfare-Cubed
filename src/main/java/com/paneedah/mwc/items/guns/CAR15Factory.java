package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.ModernWarfareMod;
import com.paneedah.mwc.init.MWCItems;
import com.paneedah.mwc.models.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.*;
import com.paneedah.weaponlib2.*;
import com.paneedah.weaponlib2.animation.Transform;
import com.paneedah.weaponlib2.animation.Transition;
import com.paneedah.weaponlib2.compatibility.RecoilParam;
import com.paneedah.weaponlib2.config.BalancePackManager.GunConfigurationGroup;
import com.paneedah.weaponlib2.crafting.CraftingEntry;
import net.minecraft.item.Item;
import org.lwjgl.opengl.GL11;

import java.util.Arrays;

public class CAR15Factory implements GunFactory {

	public Item createGun(CommonProxy commonProxy) {
		return new Weapon.Builder()
		
		.withName("xm177")
		//.withAmmoCapacity(30)
		.withFireRate(0.8f)
		.withRecoil(4f)
		.withZoom(0.9f)
		.withConfigGroup(GunConfigurationGroup.AR)
		.hasFlashPedals()
		.withMaxShots(1, Integer.MAX_VALUE)
		.withShootSound("m4a1")
		.withSilencedShootSound("m4a1_silenced")
		.withReloadSound("m4a1_reload")
		.withUnloadSound("m4a1_unload")
		.withEndOfShootSound("gun_click")
		.withInspectSound("m4a1_inspection")
		.withDrawSound("m4_draw")
		.withReloadingTime(50)
		.withCrosshair("gun")
		.withCrosshairRunning("Running")
		.withCrosshairZoomed("Sight")
		.withFlashIntensity(0.5f)
		.withFlashScale(() -> 0.6f)
		.withFlashOffsetX(() -> 0.11f)
		.withFlashOffsetY(() -> 0.16f)
		.withShellCasingForwardOffset(0.05f)
		.withShellCasingVerticalOffset(-0.03f)
//		.withShellCasingEjectEnabled(false)
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
		"Type: Semi-Automatic Rifle", 
		"Damage: 6", 
		"Cartridge: 5.56x45mm NATO",
		"Fire Rate: SEMI, BURST",
		"Rate of Fire: 80/100",
		"Magazines:",
        "30rnd 5.56x45mm NATO STANAG Magazine",
        "30rnd 5.56x45mm NATO PMAG Magazine",
        "50rnd 5.56x45mm NATO STANAG Drum Magazine",
		"60rnd 5.56x45mm NATO STANAG Drum Magazine",
		"100rnd 5.56x45mm NATO STANAG Drum Magazine"))
		 
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
        .withCompatibleAttachment(ARParts.N4Upper, true, (model) -> {})
        .withCompatibleAttachment(ARParts.N4Lower, true, (model) -> {})
        .withCompatibleAttachment(ARParts.N4Handguard795, true, (model) -> {})
        .withCompatibleAttachment(ARParts.ARBarrel795, true, (model) -> {})
        .withCompatibleAttachment(ARParts.M4BufferTube, true, (model) -> {})
        .withCompatibleAttachment(ARParts.M4PistolGrip, true, (model) -> {})
        .withCompatibleAttachment(ARParts.M4Stock, true, (model) -> {})
        .withCompatibleAttachment(ARParts.DDStock, (model) -> {})
        .withCompatibleAttachment(ARParts.DDGrip, (model) -> {})
        .withCompatibleAttachment(ARParts.DDUpper, (model) -> {})
        .withCompatibleAttachment(ARParts.DDLower, (model) -> {})
        .withCompatibleAttachment(ARParts.RIS2_115, (model) -> {})
        .withCompatibleAttachment(ARParts.RIS3_145, (model) -> {})
        .withCompatibleAttachment(ARParts.M4RIS, (model) -> {})
        .withCompatibleAttachment(ARParts.M4Barrel103, (model) -> {})
        .withCompatibleAttachment(ARParts.M4Barrel145, (model) -> {})
        .withCompatibleAttachment(ARParts.M4A1Handguard, (model) -> {})
        .withCompatibleAttachment(ARParts.N4Handguard115,  (model) -> {})
        .withCompatibleAttachment(ARParts.ARBarrel115,  (model) -> {})
        .withCompatibleAttachment(ARParts.N4Handguard145,  (model) -> {})
        .withCompatibleAttachment(ARParts.ARBarrel145,  (model) -> {})
        .withCompatibleAttachment(ARParts.M4Lower,  (model) -> {})
        .withCompatibleAttachment(ARParts.M4Upper,  (model) -> {})
        .withCompatibleAttachment(ARParts.M16A2Stock,  (model) -> {})
        .withCompatibleAttachment(ARParts.M16A2BufferTube,  (model) -> {})
        .withCompatibleAttachment(ARParts.M16A2Barrel701,  (model) -> {})
        .withCompatibleAttachment(ARParts.M16A2Handguard,  (model) -> {})
        .withCompatibleAttachment(ARParts.M16A1Lower,  (model) -> {})
        .withCompatibleAttachment(ARParts.M16A1Barrel613,  (model) -> {})
        .withCompatibleAttachment(ARParts.XM16Handguard,  (model) -> {})
        .withCompatibleAttachment(ARParts.XM16Stock,  (model) -> {})
		.withCompatibleAttachment(ARParts.XM16Lower,  (model) -> {})
        .withCompatibleAttachment(ARParts.M16PistolGrip,  (model) -> {})
        .withCompatibleAttachment(ARParts.M16Lower,  (model) -> {})
        .withCompatibleAttachment(ARParts.M16Barrel602,  (model) -> {})
        .withCompatibleAttachment(ARParts.M16Barrel605,  (model) -> {})
        .withCompatibleAttachment(ARParts.M16Barrel606,  (model) -> {})
        .withCompatibleAttachment(ARParts.M16BufferTube,  (model) -> {})
        .withCompatibleAttachment(ARParts.ARPistolBufferTube,  (model) -> {})
        .withCompatibleAttachment(ARParts.AngstadtSCW_Stock,  (model) -> {})
        .withCompatibleAttachment(ARParts.MaximSCW_Stock,  (model) -> {})
        .withCompatibleAttachment(ARParts.MaximCCS_Stock,  (model) -> {})

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
            	GL11.glTranslatef(-0.155F, -1.55F, -3.5F);
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
            	GL11.glTranslatef(-0.16F, -1.5F, -3.3F);
                GL11.glScaled(0.35F, 0.35F, 0.35F);
              }
        }, true, false)
        
        .withCompatibleAttachment(Attachments.M38FrontSight, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.GUARD, instance);
                if(activeAttachment == Attachments.Mk18HandGuard) {
                    GL11.glTranslatef(-0.004F, -0.1F, 2.5F);
                    GL11.glScaled(1F, 1F, 1F);
                } else {
                    GL11.glTranslatef(0F, 0F, 0F);
                    GL11.glScaled(1F, 1F, 1F);
                }
            }
        },(model) -> {
            if(model instanceof AKMiron2) {
                GL11.glTranslatef(-0.18F, -1.5F, -3.73F);
                GL11.glScaled(0.55F, 0.55F, 1F);
          } else if(model instanceof FALIron) {
              GL11.glTranslatef(-0.1F, -1.34F, -3.7F);
              GL11.glScaled(0.1F, 0.9F, 0.3F);
              GL11.glRotatef(180F, 0f, 0f, 1f);
          } else if(model instanceof AK47iron) {
              GL11.glTranslatef(-0.235F, -1.85F, -3.7F);
              GL11.glScaled(0.75F, 0.95F, 0.3F);
          }
        }, false, false)
        .withCompatibleAttachment(Attachments.M4Grip, true, (model) -> {
//            GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.M4GripTan, (model) -> {
//            GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.M4GripGray, (model) -> {
//            GL11.glTranslatef(0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.HeraArmsGrip, (model) -> {
            GL11.glTranslatef(0F, -0.05F, 0F);
            GL11.glScaled(1F, 0.95F, 1F);
        })
        .withCompatibleAttachment(STANAGMagazines.M4A1Mag, (model) -> {
		    GL11.glTranslatef(-0.335F, 0.4F, -1.25F);
            GL11.glScaled(1.05F, 1.2F, 1.15F);
            
//            GL11.glTranslatef(0F, 0.35F, 0F);
        })
        .withCompatibleAttachment(STANAGMagazines.M16Mag, (model) -> {
		    GL11.glTranslatef(-0.335F, 0.4F, -1.25F);
            GL11.glScaled(1.05F, 1.2F, 1.15F);
            
//            GL11.glTranslatef(0F, 0.35F, 0F);
        })
		.withCompatibleAttachment(STANAGMagazines.SOCOM_Mag, (model) -> {
		    GL11.glTranslatef(-0.335F, 0.4F, -1.25F);
            GL11.glScaled(1.05F, 1.2F, 1.15F);
        })
        .withCompatibleAttachment(STANAGMagazines.M38Mag, (model) -> {
          GL11.glTranslatef(-0.335F, 0.4F, -1.25F);
            GL11.glScaled(1.05F, 1.2F, 1.15F);
        })
                .withCompatibleAttachment(STANAGMagazines.LancerMag10ClearGrey, (model) -> {
                    GL11.glTranslatef(-0.335F, 0.4F, -1.25F);
                    GL11.glScaled(1.05F, 1.2F, 1.15F);
                })
                .withCompatibleAttachment(STANAGMagazines.LancerMag20ClearGrey, (model) -> {
                    GL11.glTranslatef(-0.335F, 0.4F, -1.25F);
                    GL11.glScaled(1.05F, 1.2F, 1.15F);
                })
                .withCompatibleAttachment(STANAGMagazines.LancerMag30ClearGrey, (model) -> {
                    GL11.glTranslatef(-0.335F, 0.4F, -1.25F);
                    GL11.glScaled(1.05F, 1.2F, 1.15F);
                })
                .withCompatibleAttachment(STANAGMagazines.LancerMag10ClearGreen, (model) -> {
                    GL11.glTranslatef(-0.335F, 0.4F, -1.25F);
                    GL11.glScaled(1.05F, 1.2F, 1.15F);
                })
                .withCompatibleAttachment(STANAGMagazines.LancerMag20ClearGreen, (model) -> {
                    GL11.glTranslatef(-0.335F, 0.4F, -1.25F);
                    GL11.glScaled(1.05F, 1.2F, 1.15F);
                })
                .withCompatibleAttachment(STANAGMagazines.LancerMag30ClearGreen, (model) -> {
                    GL11.glTranslatef(-0.335F, 0.4F, -1.25F);
                    GL11.glScaled(1.05F, 1.2F, 1.15F);
                })
                .withCompatibleAttachment(STANAGMagazines.LancerMag10ClearBlue, (model) -> {
                    GL11.glTranslatef(-0.335F, 0.4F, -1.25F);
                    GL11.glScaled(1.05F, 1.2F, 1.15F);
                })
                .withCompatibleAttachment(STANAGMagazines.LancerMag20ClearBlue, (model) -> {
                    GL11.glTranslatef(-0.335F, 0.4F, -1.25F);
                    GL11.glScaled(1.05F, 1.2F, 1.15F);
                })
                .withCompatibleAttachment(STANAGMagazines.LancerMag30ClearBlue, (model) -> {
                    GL11.glTranslatef(-0.335F, 0.4F, -1.25F);
                    GL11.glScaled(1.05F, 1.2F, 1.15F);
                })
        .withCompatibleAttachment(STANAGMagazines.Stanag50, (model) -> {
            GL11.glTranslatef(0F, 0.05F, 0F);
//            GL11.glScaled(1.15F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(STANAGMagazines.Stanag60, (model) -> {
            GL11.glRotatef(-10F, 1f, 0f, 0f);
            GL11.glTranslatef(0F, 0.25F, -0F);
//            GL11.glScaled(1.15F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(STANAGMagazines.Stanag100, (model) -> {
            GL11.glTranslatef(-0.35F, 0.69F, -1.25F);
            GL11.glScaled(1.15F, 1.2F, 1.15F);
        })
	   .withCompatibleAttachment(AuxiliaryAttachments.AR15Iron, (model) -> {
            if(model instanceof M4Iron1) {
                GL11.glTranslatef(-0.145F, -1.55F, -0.35F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof M4Iron2) {
                GL11.glTranslatef(-0.055F, -1.35F, -4.05F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof FALIron) {
                GL11.glTranslatef(-0.185F, -1.53F, -4.05F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof ARCarryHandle) {
                GL11.glTranslatef(-0.1425F, -1.533F, -0.12F);
                GL11.glScaled(0.29F, 0.29F, 0.29F);
            } else if(model instanceof MP5Iron) {
                GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                GL11.glScaled(0F, 0F, 0F);
            }
        })
	   .withCompatibleAttachment(Attachments3.TritiumRearSights, (model) -> {
           if(model instanceof TritiumRearSights) {
           	 GL11.glTranslatef(-0.16F, -1.5F, -0.3F);
                GL11.glScaled(0.35F, 0.35F, 0.35F);
           }
       })
	   .withCompatibleAttachment(Attachments3.HK416RearSights, (model) -> {
           if(model instanceof G95_upright_rearsights) {
        	   GL11.glTranslatef(-0.158F, -1.53F, -0.2F);
               GL11.glScaled(0.32F, 0.32F, 0.32F);
           }
       })
	   .withCompatibleAttachment(Attachments3.MBUSRearSights, true, (model) -> {
           if(model instanceof MBUSRearSight) {
        	   GL11.glTranslatef(-0.16F, -1.5F, -0.3F);
               GL11.glScaled(0.35F, 0.35F, 0.35F);
           }
       })
		 .withCompatibleAttachment(Attachments3.AKMIron, (model) -> {
            if(model instanceof M4Iron1) {
                GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                GL11.glScaled(0F, 0F, 0F); 
            } else if(model instanceof M4Iron2) {
                GL11.glTranslatef(0.255F, -1.55F, -2.25F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof P90iron) {
                GL11.glTranslatef(0.26F, -1.55F, -2.35F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AKMiron1) {
                GL11.glTranslatef(0.125F, -1.8F, -0.5F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AKMiron2) {
                GL11.glTranslatef(0.13F, -1.55F, -3.05F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AK47iron) {
                GL11.glTranslatef(0.092F, -1.91F, -0.9F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof G36CIron1) {
                GL11.glTranslatef(-0.22F, -1.94F, 0.13F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof G36CIron2) {
                GL11.glTranslatef(-0.205F, -1.9F, -3.15F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof ScarIron1) {
                GL11.glTranslatef(0.165F, -1.65F, 1F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof ScarIron2) {
                GL11.glTranslatef(0.25F, -1.55F, -2F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof FALIron) {
                GL11.glTranslatef(0.127F, -1.77F, -2.22F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof M14Iron) {
                GL11.glTranslatef(0.129F, -1.63F, -2.08F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof MP5Iron) {
                GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                GL11.glScaled(0F, 0F, 0F); 
            } else if(model instanceof M27rearsight) {
                GL11.glTranslatef(-0.16F, -1.5F, -0.3F);
                GL11.glScaled(0.35F, 0.35F, 0.35F);
            } else if(model instanceof MBUSiron) {
                GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                GL11.glScaled(0F, 0F, 0F); 
            }
        })
        
        .withCompatibleAttachment(Attachments3.NightRaider, (player, stack) -> {
                    GL11.glTranslatef(-0.21F, -1.4F, -1.8F);
                    GL11.glScaled(0.75F, 0.75F, 0.75F);
        },(model) -> {
            if(model instanceof JPUreticle) {
                GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                GL11.glScaled(0.03F, 0.03F, 0.03F);
            }
        })
        
		.withCompatibleAttachment(Attachments3.ACOG, (player, stack) -> {
                    GL11.glTranslatef(-0.28F, -1.41F, -0.5F);
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
                    GL11.glTranslatef(-0.18F, -1.1F, -0.7F);
                    GL11.glScaled(0.4F, 0.4F, 0.4F);
        },(model) -> {
            if(model instanceof Acog2) {
                GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
		
		.withCompatibleAttachment(Attachments3.LeupoldRailScope, (player, stack) -> {
		            GL11.glTranslatef(-0.151F, -1.25F, -1.2F);
		            GL11.glScaled(0.4F, 0.4F, 0.4F);
        },(model) -> {
             if(model instanceof JPUreticle) {
                GL11.glTranslatef(0.076F, -0.67F, 4.0251F);
                GL11.glScaled(0.04F, 0.04F, 0.04F);
            }
        })
		
		.withCompatibleAttachment(Attachments3.MicroReflex, (player, stack) -> {
            GL11.glTranslatef(-0.15F, -1.93F, -1F);
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
                    GL11.glTranslatef(-0.066F, -1.21F, -0.9F);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
		},(model) -> {
            if(model instanceof Reflex2) {
			    GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
			}
		})
		.withCompatibleAttachment(Attachments3.BijiaReflex, (player, stack) -> {
	                    GL11.glTranslatef(-0.062F, -1.2F, -1F);
	                    GL11.glScaled(0.48F, 0.48F, 0.48F);
			},(model) -> {
	        if(model instanceof Reflex2) {
	            GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
			})
		
		.withCompatibleAttachment(Attachments3.Holographic, (player, stack) -> {
                    GL11.glTranslatef(-0.041F, -1.25F, -0.7F);
                    GL11.glScaled(0.65F, 0.65F, 0.65F);
			},(model) -> {
	            if(model instanceof Holo2) {
	                GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
	                GL11.glScaled(0.1F, 0.1F, 0.1F);
	            }
	        })
		
		.withCompatibleAttachment(Attachments3.HolographicAlt, (player, stack) -> {
                    GL11.glTranslatef(-0.041F, -1.25F, -0.7F);
                    GL11.glScaled(0.65F, 0.65F, 0.65F);
        },(model) -> {
            if(model instanceof Holo2) {
                GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
		
		.withCompatibleAttachment(Attachments3.EotechHybrid2, (player, stack) -> {
                    GL11.glTranslatef(-0.041F, -1.25F, -1.3F);
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
            GL11.glTranslatef(-0.3F, -1.45F, -1.1F);
            GL11.glScaled(0.45F, 0.45F, 0.45F);
	    },(model) -> {
	        if(model instanceof Holo2) {
	            GL11.glTranslatef(0.395F, -0.33F, -0.1F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
	    })
	    
		.withCompatibleAttachment(Attachments3.Kobra, (player, stack) -> {
                    GL11.glTranslatef(-0.041F, -1.26F, -0.7F);
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
                    GL11.glTranslatef(-0.041F, -1.37F, -0.7F);
                    GL11.glScaled(0.65F, 0.65F, 0.65F);
                } else {
                    GL11.glTranslatef(-0.041F, -1.26F, -0.7F);
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
                    GL11.glTranslatef(-0.18F, -1.45F, -1F);
                    GL11.glScaled(0.38F, 0.38F, 0.38F);
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
		
		.withCompatibleAttachment(Attachments3.AimpointCompM5, (player, stack) -> {
                    GL11.glTranslatef(-0.18F, -1.45F, -1F);
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
                    .withRotationPoint(-0.350000f, -2.900000f, -0.100000f)
                    .withScale(3.0, 3.0, 3.0)
                )
                
                .withFirstPersonHandPositioning(
                        
                        // Left hand
                        new Transform()
                        .withPosition(1.050000f, 0.025000f, -0.500000f)
                        .withBBRotation(-8.1997, -23.6991, 57.7232)
                        .withScale(2.6, 2.6, 4.0)
                        .withRotationPoint(0, 0, 0),
                        
                        
                        
                        // Right hand
                        new Transform()
                        .withPosition(-0.2, 0.1, 2)
                        .withRotation(-5.4027, -4.7805, -1.6694)
                        .withScale(3.5, 3.5, 3.5)
                        .withRotationPoint(0, 0, 0)
                
                )
                
                .setupModernAnimations("m4a1", AuxiliaryAttachments.AKaction)
                .setupModernMagazineAnimations("m4a1", 
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
				GL11.glTranslatef(0.14f, 1.06f, -0.3f);
				
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
				
		 
		.build(ModernWarfareMod.MOD_CONTEXT);
	}
}
