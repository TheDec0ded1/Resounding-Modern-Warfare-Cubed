package com.paneedah.mwc.items.guns;

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

public class Mini14Factory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

        .withName("mini_14")
        .withFireRate(0.7f)
        .withRecoil(3.5f)
        .withZoom(0.9f)
        .withConfigGroup(GunConfigurationGroup.MSR)
        .withMuzzlePosition(new Vec3d(-0.13600000405311582, -1.0, -9.12400007820129))
        .withMaxShots(1)
        //.withMaxShots(5)
        .withShootSound("mini14")
        .withSilencedShootSound("mk14ebr_silenced")
        .withReloadSound("mk14ebr_reload")
        .withUnloadSound("mk14_unload")
        .withInspectSound("inspection")
        .withDrawSound("mk14_draw")
        .withReloadingTime(45)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.5f)
        .withFlashScale(() -> 0.6f)
        .withFlashOffsetX(() -> 0.08f)
        .withFlashOffsetY(() -> 0.10f)
        .withCreativeTab(ModernWarfareMod.PrecisionRiflesTab)
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
        "Type: Battle Rifle/Designated Marksmen Rifle",
        "Damage: 10", 
        "Cartridge: 7.62x51mm",
        "Fire Rate: SEMI, AUTO",
        "Rate of Fire: 75/100",
        "Magazines:",
        "20rnd 7.62x51mm NATO EBR Magazine",
        "50rnd 7.62x51mm NATO EBR Drum Magazine"))
         
         .withScreenShaking(RenderableState.SHOOTING, 
                 2f, // x 
                 1f, // y
                 6f) // z
         
         .withModernRecipe( new
	        		CraftingEntry(MWCItems.carbonComposite, 8), new
	        		CraftingEntry(MWCItems.gunmetalPlate, 15), new
	        		CraftingEntry(MWCItems.steelIngot, 8))
         
//        .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
        .withUnremovableAttachmentCategories(AttachmentCategory.BACKGRIP)
        .withCompatibleAttachment(AuxiliaryAttachments.Mini14Action, true, (model) -> {
//        	GL11.glTranslatef(0f, 0f, 0.73f);
        })
        .withCompatibleAttachment(Attachments2.Mini14GreenStock, (model) -> {
          })
        .withCompatibleAttachment(Attachments2.Mini14GreenPRStock, (model) -> {
          })
        .withCompatibleAttachment(Attachments2.Mini14GreenALTStock, (model) -> {
          })
        .withCompatibleAttachment(Attachments2.Mini14Stock, true, (model) -> {
          })
        .withCompatibleAttachment(Attachments2.Mini14PRStock, (model) -> {
          })
        .withCompatibleAttachment(Attachments2.Mini14ALTStock, (model) -> {
          })
        .withCompatibleAttachment(Attachments2.Mini14WoodStock, (model) -> {
          })
        .withCompatibleAttachment(Attachments2.Mini14WoodPRStock, (model) -> {
          })
        .withCompatibleAttachment(Attachments2.Mini14WoodALTStock, (model) -> {
          })
        .withCompatibleAttachment(Attachments2.Mini14Upper, true, (model) -> {
        })
        .withCompatibleAttachment(Magazines.Mini14Mag5, (model) -> {
        })
        .withCompatibleAttachment(Magazines.Mini14Mag20, (model) -> {
        })
        .withCompatibleAttachment(Magazines.Mini14Mag30, (model) -> {
        })
        .withCompatibleAttachment(Magazines.Mini14Mag5B, (model) -> {
        })
        .withCompatibleAttachment(Magazines.Mini14Mag20B, (model) -> {
        })
        .withCompatibleAttachment(Magazines.Mini14Mag30B, (model) -> {
        })

        .withTextureNames("mini14")
        .withRenderer(new WeaponRenderer.Builder()
    
            .withModel(new Mini14())
            .withActionPiece(AuxiliaryAttachments.Mini14Action)
            .withActionTransform(new Transform().withPosition(0, 0, 0.5))
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
                GL11.glTranslatef(-2.2F, -1.8F, 2.4F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
            
            .withFirstPersonPositioning(
					new Transform()
					.withPosition(-1.225000f, 4.065000f, -0.485000f)
					.withRotation(0.000000f, 1.000000f, 6.300000f)
					.withRotationPoint(-0.350000f, -2.100000f, -1.300000f)
                    .withScale(3.0, 3.0, 3.0)
                )
                
                .withFirstPersonHandPositioning(
                        
                        // Left hand
                        new Transform()
                        .withPosition(1.210000f, 0.305000f, -1.380000f)
                        .withBBRotation(-7.1415, -27.3003, 52.6433)
                        .withScale(2.8, 2.8, 4.0)
                        .withRotationPoint(0, 0, 0),
                        
                        
                        
                        // Right hand
                        new Transform()
                        .withPosition(-0.200000f, 0.180000f, 1.640000f)
                        .withRotation(-5.4027, -4.7805, -1.6694)
                        .withScale(3, 3, 3.5)
                        .withRotationPoint(0, 0, 0)
                
                )
                
                .setupModernAnimations("m14", AuxiliaryAttachments.Mini14Action)
                .setupModernMagazineAnimations("m14", 
                		Magazines.Mini14Mag5,
                		Magazines.Mini14Mag20,
                		Magazines.Mini14Mag30,
                		Magazines.Mini14Mag5B,
                		Magazines.Mini14Mag20B,
                		Magazines.Mini14Mag30B)
            
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.Mini14Action.getRenderablePart(), (renderContext) -> {
                if(renderContext.getWeaponInstance().getAmmo() == 0) {
                	GL11.glTranslatef(0f, 0f, 0.5f);
                }
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
                        GL11.glTranslatef(-2F, -2.5F, 2.7F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 210, 100),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2F, -2.5F, 2.7F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 130, 0),
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2F, -2.5F, 2.7F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 240, 0),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2F, -2.5F, 2.7F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 400, 150),
                    
                    new Transition((renderContext) -> { // Reload position
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                        GL11.glTranslatef(-2F, -2.5F, 2.7F);
                        GL11.glRotatef(-45F, 0f, 1f, 0f);
                        GL11.glRotatef(90F, 1f, 0f, 0f);
                    }, 300, 60),
                
                new Transition((renderContext) -> { // Reload position
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                    GL11.glTranslatef(-2F, -2.5F, 2.7F);
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
            
            .withThirdPersonCustomPositioningReloading(AuxiliaryAttachments.Mk14EBRaction.getRenderablePart(),
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
                        GL11.glTranslatef(0f, 0f, 0.73f);
                    }, 250, 1000),
                    new Transition((renderContext) -> {
                    }, 250, 1000)
                        )
            
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.142f, 0.825f, 0.7f);

                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.NightRaider)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.34f, 0.4f);
                } 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.ACOG)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.35f, 0.4f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.MicroT1)) {
                    //System.out.println("Position me for Acog");
                	GL11.glTranslatef(0F, 0.305f, 2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.AimpointCompM5)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.305f, 2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.AimpointCompM2)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.36f, 2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.LeupoldRailScope)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.35f, 0.2f);
                } 
                
                // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.Specter)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.28f, 0.6f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.MicroReflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.338f, 2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.Reflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.355f, 2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.BijiaReflex)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.345f, 2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.Holographic)) {
                    //System.out.println("Position me for Acog");
                	GL11.glTranslatef(0F, 0.383f, 2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.HolographicAlt)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.383f, 2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.EotechHybrid2)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.38f, 0.2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.VortexRedux)) {
                    //System.out.println("Position me for Acog");
                	GL11.glTranslatef(0F, 0.37f, 2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.Kobra)) {
                    //System.out.println("Position me for Acog");
                	GL11.glTranslatef(0F, 0.37f, 2f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.KobraGen3)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.37f, 2f);
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
//                  new Transition((renderContext) -> { // Reload position
//                      GL11.glScalef(3.5f, 3.5f, 3.5f);
//                      GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
//                      GL11.glRotatef(-45.000000f, 0f, 1f, 0f);
//                      GL11.glRotatef(30.000000f, 0f, 0f, 1f);
//                      GL11.glTranslatef(0.250000f, -0.175000f, 0.225000f);
//                  }, 50, 200),
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
//                  new Transition((renderContext) -> { // Reload position
//                      GL11.glScalef(4f, 4f, 5f);
//                      GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
//                      GL11.glRotatef(10.000000f, 0f, 1f, 0f);
//                      GL11.glRotatef(-55.000000f, 0f, 0f, 1f);
//                      GL11.glTranslatef(0.375000f, -0.500000f, 0.150000f);
//                  }, 250, 1000),
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

