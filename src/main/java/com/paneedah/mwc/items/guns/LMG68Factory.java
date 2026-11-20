package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.instancing.PlayerWeaponInstance;
import com.paneedah.mwc.models.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.Attachments;
import com.paneedah.mwc.weapons.Attachments2;
import com.paneedah.mwc.weapons.Attachments3;
import com.paneedah.mwc.weapons.ARParts;
import com.paneedah.mwc.weapons.AuxiliaryAttachments;
import com.paneedah.mwc.weapons.Magazines;
import com.paneedah.weaponlib.AttachmentCategory;
import com.paneedah.weaponlib.Weapon;
import com.paneedah.weaponlib.WeaponRenderer;
import com.paneedah.mwc.rendering.Transform;
import com.paneedah.weaponlib.compatibility.RecoilParam;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import net.minecraft.item.Item;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

public class LMG68Factory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

        .withName("LMG68")
        .withFireRate(0.6f)
        .withRecoil(2f)
        .withZoom(0.9f)
        .withConfigGroup(GunConfigurationGroup.LMG)
        .withMuzzlePosition(new Vec3d(-0.148000004410744, -1.0, -6.900000011920938))
        .withMaxShots(Integer.MAX_VALUE, 1)
        //.withMaxShots(5)
        .withShootSound("lmg68")
        .withSilencedShootSound("lmg68_silenced")
        .withReloadSound("mg42_reload")
        .withUnloadSound("mg42_unload")
        .withInspectSound("inspection")
        .withDrawSound("mg42_draw")
//        .withDrawSound("mg42_reload")
        .withReloadingTime(45)
        .withFlashIntensity(0.5f)
        .withFlashScale(() -> 0.6f)
        .withFlashOffsetX(() -> 0.1f)
        .withFlashOffsetY(() -> 0.15f)
        .withCreativeTab(MWC.LMGsTab)
        .useNewSystem()
        .withRecoilParam(new RecoilParam(
		// The weapon power
		40.0,
		// Muzzle climb divisor
		27.0,
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
         
        .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
        .withUnremovableAttachmentCategories(AttachmentCategory.BARREL)
        .withUnremovableAttachmentCategories(AttachmentCategory.RECEIVER)
        .withUnremovableAttachmentCategories(AttachmentCategory.RECEIVER2)
		.withUnremovableAttachmentCategories(AttachmentCategory.STOCKADAPTER)
		.withUnremovableAttachmentCategories(AttachmentCategory.RAILADAPTER)
		.withUnremovableAttachmentCategories(AttachmentCategory.BACKGRIP)
        .withCompatibleAttachment(Attachments2.LMG68Lower, true, (model) -> {
        })
        .withCompatibleAttachment(Attachments2.LMG68Upper, true, (model) -> {
        })
        .withCompatibleAttachment(Attachments2.LMG68Stock, true, (model) -> {
        })
        .withCompatibleAttachment(Attachments2.LMG68Adapter, true, (model) -> {
        })
        .withCompatibleAttachment(Attachments2.LMG68Bracket, true, (model) -> {
        })
		.withCompatibleAttachment(Attachments2.LMG68Barrel, true, (model) -> {
        })
        .withCompatibleAttachment(Attachments2.LMG68Tray, true, (model) -> {
        })
        .withCompatibleAttachment(Attachments2.LMG68Suppressor, (model) -> {
        })
        .withCompatibleAttachment(AuxiliaryAttachments.LMG68Handle, true, (model) -> {
        })
        .withCompatibleAttachment(AuxiliaryAttachments.LMG68Track, true, (model) -> {
        })
		.withCompatibleAttachment(AuxiliaryAttachments.LMG68Bolt, true, (model) -> {
        })
        .withCompatibleAttachment(AuxiliaryAttachments.LMG68Cover, true, (model) -> {
        })
        .withCompatibleAttachment(AuxiliaryAttachments.LMG68Belt, true, (model) -> {
        })
        .withCompatibleAttachment(AuxiliaryAttachments.LMG68Belt2, true, (model) -> {
        })
        .withCompatibleAttachment(AuxiliaryAttachments.LMG68Belt3, true, (model) -> {
        })
        .withCompatibleAttachment(ARParts.M4PistolGrip, (model) -> {})
        .withCompatibleAttachment(ARParts.DDGrip, (model) -> {})
        .withCompatibleAttachment(ARParts.LMG68Grip, (model) -> {})
        .withCompatibleAttachment(ARParts.M4GripTan, (model) -> {})
        .withCompatibleAttachment(ARParts.M4GripGray, (model) -> {})
        .withCompatibleAttachment(ARParts.CQGrip, (model) -> {})
        .withCompatibleAttachment(ARParts.M110Grip, (model) -> {})
        .withCompatibleAttachment(ARParts.HK416Grip, (model) -> {})
        .withCompatibleAttachment(ARParts.HK416GripTan, (model) -> {})
        .withCompatibleAttachment(ARParts.HK416CGrip, (model) -> {})
        .withCompatibleAttachment(ARParts.HK416CGripTan, (model) -> {})
        .withCompatibleAttachment(ARParts.HK416A8Grip, (model) -> {})
        .withCompatibleAttachment(ARParts.HK416A8GripTan, (model) -> {})
        .withCompatibleAttachment(ARParts.HK433Grip, (model) -> {})
        .withCompatibleAttachment(ARParts.HK433GripTan, (model) -> {})
        .withCompatibleAttachment(ARParts.LMG68Grip, true, (model) -> {})
		.withCompatibleAttachment(Attachments3.NightRaider, (player, stack) -> {
            GL11.glTranslatef(-0.218F, -1.92F, -1.4F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
        },(model) -> {
            if(model instanceof JPUreticle) {
                GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                GL11.glScaled(0.03F, 0.03F, 0.03F);
            }
        })
        .withCompatibleAttachment(Attachments3.ACOG, (player, stack) -> {
            GL11.glTranslatef(-0.335F, -1.94F, -0.5F);
            GL11.glScaled(0.9F, 0.9F, 0.9F);
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
            GL11.glTranslatef(-0.2F, -1.57F, -0.7F);
            GL11.glScaled(0.5F, 0.5F, 0.5F);
        },(model) -> {
             if(model instanceof Acog2) {
                 GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                 GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments3.Reflex, (player, stack) -> {
            GL11.glTranslatef(-0.06F, -1.73F, -1.4F);
            GL11.glScaled(0.5F, 0.5F, 0.5F);
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        .withCompatibleAttachment(Attachments3.BijiaReflex, (player, stack) -> {
            GL11.glTranslatef(-0.06F, -1.72F, -1F);
            GL11.glScaled(0.5F, 0.5F, 0.5F);
        },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
            GL11.glScaled(0.15F, 0.15F, 0.15F);
        }
        })
        .withCompatibleAttachment(Attachments3.Holographic, (player, stack) -> {
                GL11.glTranslatef(-0.035F, -1.77F, -1.2F);
                GL11.glScaled(0.75F, 0.75F, 0.75F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                    GL11.glScaled(0.1F, 0.1F, 0.1F);
                }
            })
        .withCompatibleAttachment(Attachments3.HolographicAlt, (player, stack) -> {
        	GL11.glTranslatef(-0.035F, -1.77F, -1.1F);
            GL11.glScaled(0.75F, 0.75F, 0.75F);
        },(model) -> {
            if(model instanceof Holo2) {
                GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments3.VortexRedux, (player, stack) -> {
                GL11.glTranslatef(-0.335F, -2.0F, -1.3F);
                GL11.glScaled(0.54F, 0.54F, 0.54F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(0.395F, -0.33F, -0.1F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        .withCompatibleAttachment(Attachments3.Kobra, (player, stack) -> {
                GL11.glTranslatef(-0.024F, -1.78F, -1F);
                GL11.glScaled(0.75F, 0.75F, 0.75F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments3.KobraGen3, (player, stack) -> {
            GL11.glTranslatef(-0.024F, -1.78F, -1F);
            GL11.glScaled(0.75F, 0.75F, 0.75F);
	    },(model) -> {
	        if(model instanceof Reflex2) {
	            GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
	    })
        .withCompatibleAttachment(Attachments3.MicroReflex, (player, stack) -> {
            GL11.glTranslatef(-0.154F, -2.55F, -1.1F);
            GL11.glScaled(0.4F, 0.4F, 0.4F);
	    })
        .withCompatibleAttachment(Attachments3.MicroT1, (player, stack) -> {
                GL11.glTranslatef(-0.19F, -1.98F, -1.1F);
                GL11.glScaled(0.47F, 0.47F, 0.47F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(0.15F, -0.4F, -0.35F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments3.AimpointCompM5, (player, stack) -> {
        	GL11.glTranslatef(-0.19F, -1.98F, -1.1F);
            GL11.glScaled(0.47F, 0.47F, 0.47F);
	    },(model) -> {
	        if(model instanceof Reflex2) {
	            GL11.glTranslatef(0.15F, -0.4F, -0.35F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
	    })
        .withCompatibleAttachment(Magazines.LMG68Box50, (model) -> {
        })
		.withCompatibleAttachment(Magazines.LMG68Box100, (model) -> {
        })
        .withTextureNames("M9A1")
        .withRenderer(new WeaponRenderer.Builder()
    
            .withModel(new M9A1())
			.withActionPiece(AuxiliaryAttachments.LMG68Bolt)
            .withActionTransform(new Transform().withPosition(0, 0, -1.3f))
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
					.withPosition(-1.505000f, 5.065000f, -2.525000f)
					.withRotation(0.000000f, 1.000000f, 6.300000f)
					.withPivotPoint(-0.350000f, -2.900000f, -0.100000f)
					.withScale(3.000000f, 3.000000f, 3.000000f)
                )
                    
                    .withFirstPersonHandPositioning(
                            
                            // Left hand
                            new Transform()
                            .withPosition(1.210000f, 0.265000f, -0.820000f)
                            .withBBRotation(-7.1415f, -27.3003f, 52.6433f)
                            .withScale(2.8f, 2.8f, 4.0f)
                            .withPivotPoint(0, 0, 0),
                            
                            
                            
                            // Right hand
                            new Transform()
                            .withPosition(-0.200000f, 0.180000f, 1.960000f)
                            .withRotation(-5.4027f, -4.7805f, -1.6694f)
                            .withScale(3, 3, 3.5f)
                            .withPivotPoint(0, 0, 0)
                    
                    )
                
                .setupModernAnimations("lmg68", AuxiliaryAttachments.LMG68Bolt)
                .setupCustomKeyedPart(AuxiliaryAttachments.LMG68Belt, "lmg68", "belt")
                .setupCustomKeyedPart(AuxiliaryAttachments.LMG68Belt2, "lmg68", "belt2")
                .setupCustomKeyedPart(AuxiliaryAttachments.LMG68Belt3, "lmg68", "belt3")
                .setupCustomKeyedPart(AuxiliaryAttachments.LMG68Handle, "lmg68", "handle")
                .setupCustomKeyedPart(AuxiliaryAttachments.LMG68Track, "lmg68", "track")
                .setupCustomKeyedPart(AuxiliaryAttachments.LMG68Cover, "lmg68", "cover")
                .setupModernMagazineAnimations("lmg68", 
                		Magazines.LMG68Box50,
						Magazines.LMG68Box100)
            
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.LMG68Belt.getRenderablePart(), (renderContext) -> {
                if(renderContext.getWeaponInstance().getAmmo() == 0) {
                    GL11.glTranslatef(0F, 0F, 20F);
                }
            })
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.LMG68Belt2.getRenderablePart(), (renderContext) -> {
                if(renderContext.getWeaponInstance().getAmmo() == 0) {
                    GL11.glTranslatef(0F, 0F, 20F);
                }
            })
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.LMG68Belt3.getRenderablePart(), (renderContext) -> {
                if(renderContext.getWeaponInstance().getAmmo() == 0) {
                    GL11.glTranslatef(0F, 0F, 20F);
                }
            })
            
                .withFirstPersonPositioningZooming((renderContext) -> {
                	GL11.glTranslatef(0.18f, 0.27f, 0.5f);
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.Kobra)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.325f, 0.3f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.KobraGen3)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.325f, 0.3f);
                } 

             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.BijiaReflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.26f, 0.3f);
                } 

             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.Reflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.27f, 0.3f);
                } 

             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.MicroReflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.33f, 0.3f);
                } 

             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.MicroT1)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.33f, 0.3f);
                } 

             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.AimpointCompM5)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.33f, 0.3f);
                } 

             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.Holographic)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.32f, 0.3f);
                } 

             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.HolographicAlt)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.32f, 0.3f);
                } 

             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.VortexRedux)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.33f, 0.3f);
                } 

             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.32f, 0.3f);
                } 

             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.NightRaider)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.28f, 0.0f);
                } 

             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.Specter)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.25f, 0.2f);
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
             
            .build())
        .withSpawnEntityDamage(10f)
        .withSpawnEntityGravityVelocity(0.0118f)
                
        .build(MWC.modContext);
    }
}

