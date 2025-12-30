package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.ModernWarfareMod;
import com.paneedah.mwc.models.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.Attachments;
import com.paneedah.mwc.weapons.Attachments2;
import com.paneedah.mwc.weapons.Attachments3;
import com.paneedah.mwc.weapons.AuxiliaryAttachments;
import com.paneedah.mwc.weapons.Magazines;
import com.paneedah.weaponlib2.AttachmentCategory;
import com.paneedah.weaponlib2.Weapon;
import com.paneedah.weaponlib2.WeaponRenderer;
import com.paneedah.weaponlib2.animation.Transform;
import com.paneedah.weaponlib2.compatibility.RecoilParam;
import com.paneedah.weaponlib2.config.BalancePackManager.GunConfigurationGroup;
import net.minecraft.item.Item;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

public class Stoner63RifleFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

        .withName("stoner63rifle")
        .withFireRate(0.6f)
        .withRecoil(2f)
        .withZoom(0.9f)
        .withConfigGroup(GunConfigurationGroup.AR)
        .withMuzzlePosition(new Vec3d(-0.16400000488758082, -1.0, -6.5))
        .withMaxShots(1, Integer.MAX_VALUE)
        //.withMaxShots(5)
        .withShootSound("stoner63r")
        .withSilencedShootSound("ak15_silenced")
        .withReloadSound("mg42_reload")
        .withUnloadSound("mg42_unload")
        .withInspectSound("inspection")
        .withDrawSound("mg42_draw")
//        .withDrawSound("mg42_reload")
        .withReloadingTime(45)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.5f)
        .withFlashScale(() -> 0.6f)
        .withFlashOffsetX(() -> 0.1f)
        .withFlashOffsetY(() -> 0.15f)
        .withCreativeTab(ModernWarfareMod.LMGsTab)
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
         
         .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
         .withUnremovableAttachmentCategories(AttachmentCategory.FRONTSIGHT)
		 .withUnremovableAttachmentCategories(AttachmentCategory.STOCK)
		 .withUnremovableAttachmentCategories(AttachmentCategory.BACKGRIP)
         .withCompatibleAttachment(Attachments2.Stoner63RifleHandguard, true, (model) -> {
         })
         .withCompatibleAttachment(Attachments2.Stoner63Grip, true, (model) -> {
         })
		.withCompatibleAttachment(Attachments2.Stoner63PaintedGrip, (model) -> {
         })
         .withCompatibleAttachment(Attachments2.Stoner63Stock, true, (model) -> {
         })
		 .withCompatibleAttachment(Attachments2.Stoner63PaintedStock, (model) -> {
         })
         .withCompatibleAttachment(Attachments2.Stoner63StockFolding, (model) -> {
         })
		 .withCompatibleAttachment(Attachments2.Stoner63RifleBarrel, true, (model) -> {
         })
		 .withCompatibleAttachment(Attachments2.Stoner63CarbineBarrel, (model) -> {
         })
        .withCompatibleAttachment(AuxiliaryAttachments.Stoner63RifleHandle, true, (model) -> {
        })
		.withCompatibleAttachment(AuxiliaryAttachments.Stoner63RifleAction, true, (model) -> {
        })
        .withCompatibleAttachment(Magazines.Stoner63RifleMag, (model) -> {
        })
        .withTextureNames("stoner63r")
        .withRenderer(new WeaponRenderer.Builder()
    
            .withModel(new Stoner63Rifle())
            //.withTextureName("AK47")
            //.withWeaponProximity(0.99F)
            //.withYOffsetZoom(5F)
			.withActionPiece(AuxiliaryAttachments.Stoner63RifleAction)
            .withActionTransform(new Transform().withPosition(0, 0, 1.3))
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
                
                .setupModernAnimations("s63r", AuxiliaryAttachments.Stoner63RifleAction)
                .setupCustomKeyedPart(AuxiliaryAttachments.Stoner63RifleHandle, "s63r", "handle")
                .setupModernMagazineAnimations("s63r", 
                		Magazines.Stoner63RifleMag)
          
            
                .withFirstPersonPositioningZooming((renderContext) -> {
                	GL11.glTranslatef(0.18f, -0.23f, 0.7f);
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments3.Kobra)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.29f, 0.3f);
                } 
                
             // ACOG Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), AuxiliaryAttachments.Stoner63RifleAction)) {
                    //System.out.println("Position me for Acog");
                    GL11.glTranslatef(0F, 0.29f, 0.3f);
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
             
            .build())
        .withSpawnEntityDamage(6f)
        .withSpawnEntityGravityVelocity(0.0118f)
                
        .build(ModernWarfareMod.MOD_CONTEXT);
    }
}

