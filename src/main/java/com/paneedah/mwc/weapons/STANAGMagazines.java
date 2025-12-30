package com.paneedah.mwc.weapons;

import com.paneedah.mwc.ModernWarfareMod;
import com.paneedah.mwc.init.MWCItems;
import com.paneedah.mwc.models.UMP45mag;
import com.paneedah.mwc.models.UMP9Mag;
import com.paneedah.mwc.wearables.Bullets;
import com.paneedah.weaponlib2.ItemMagazine;
import com.paneedah.weaponlib2.crafting.CraftingComplexity;
import org.lwjgl.opengl.GL11;

public class STANAGMagazines {

    public static ItemMagazine M4A1Mag;
    public static ItemMagazine M16Mag;
    public static ItemMagazine M4AsiimovMag;
    public static ItemMagazine M38Mag;
    public static ItemMagazine SOCOM_Mag;
    public static ItemMagazine C8Mag;
    public static ItemMagazine SA80Mag;
    public static ItemMagazine Stanag50;
    public static ItemMagazine Stanag60;
    public static ItemMagazine Stanag100;

    public static ItemMagazine LancerMag30ClearGrey;
    public static ItemMagazine LancerMag20ClearGrey;
    public static ItemMagazine LancerMag10ClearGrey;
    public static ItemMagazine LancerMag30ClearGreen;
    public static ItemMagazine LancerMag20ClearGreen;
    public static ItemMagazine LancerMag10ClearGreen;
    public static ItemMagazine LancerMag30ClearBlue;
    public static ItemMagazine LancerMag20ClearBlue;
    public static ItemMagazine LancerMag10ClearBlue;

    public static void init(Object mod) {
        STANAGMagazines.M4A1Mag = new ItemMagazine.Builder()
        		.withAmmo(30)
        		.withCompatibleBullet(Bullets.Bullet556x45)
        		.withName("M4A1Mag_2")
        		.withRotationPoint(-0.16000000476837162, -0.16000000476837162, -1.5200000452995304)
                
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.paneedah.mwc.models.M4A1Mag(), "M4A1Magazine.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.6F, -0.6F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1.1F, 1.1F, 1.1f);
                })
                .withMaxStackSize(5)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        STANAGMagazines.C8Mag = new ItemMagazine.Builder()
        		.withAmmo(30)
        		.withCompatibleBullet(Bullets.Bullet556x45)
        		.withName("C8Mag")
        		.withRotationPoint(-0.16000000476837162, -0.16000000476837162, -1.5200000452995304)
                
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.paneedah.mwc.models.C8Mag(), "c8magazine.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.6F, -0.6F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1.1F, 1.1F, 1.1f);
                })
                .withMaxStackSize(5)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        STANAGMagazines.M16Mag = new ItemMagazine.Builder()
        		.withAmmo(20)
        		.withCompatibleBullet(Bullets.Bullet556x45)
        		.withName("M16Mag_2")
        		.withRotationPoint(-0.16000000476837162, -0.16000000476837162, -1.5200000452995304)
                
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.paneedah.mwc.models.M16Mag(), "M4A1Magazine.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.6F, -0.6F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1.1F, 1.1F, 1.1f);
                })
                .withMaxStackSize(8)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        STANAGMagazines.M38Mag = new ItemMagazine.Builder()
        		
        		.withAmmo(30)
        		.withCompatibleBullet(Bullets.Bullet556x45)
        		.withName("M38Mag_2")
        		.withRotationPoint(-0.16000000476837162, -0.16000000476837162, -1.5200000452995304)
                
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.paneedah.mwc.models.M38Mag(), "M38Mag.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.6F, -0.6F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1.1F, 1.1F, 1.1f);
                })
                .withMaxStackSize(5)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        STANAGMagazines.SOCOM_Mag = new ItemMagazine.Builder()
        		.withAmmo(30)
        		.withCompatibleBullet(Bullets.Bullet556x45)
        		.withName("socom_mag")
        		.withRotationPoint(-0.16000000476837162, -0.16000000476837162, -1.5200000452995304)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.paneedah.mwc.models.SOCOM_Mag(), "socom_mag.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.6F, -0.6F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1.1F, 1.1F, 1.1f);
                })
                .withMaxStackSize(5)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        STANAGMagazines.Stanag50 = new ItemMagazine.Builder()
        		.withAmmo(50)
        		.withCompatibleBullet(Bullets.Bullet556x45)
        		.withName("Stanag50")
        		.withRotationPoint(-0.16000000476837162, -0.16000000476837162, -1.5200000452995304)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.paneedah.mwc.models.Stanag50(), "gun.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 1.2F, -2.6F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                })
                .withMaxStackSize(2)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        STANAGMagazines.Stanag60 = new ItemMagazine.Builder()
        		.withAmmo(60)
        		.withCompatibleBullet(Bullets.Bullet556x45)
        		.withName("Stanag60")
        		.withRotationPoint(-0.16000000476837162, -0.16000000476837162, -1.5200000452995304)
                
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.paneedah.mwc.models.Stanag60(), "gun.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 1.2F, -2.6F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                })
                .withMaxStackSize(2)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);
        
        STANAGMagazines.Stanag100 = new ItemMagazine.Builder()
        		.withAmmo(100)
        		.withCompatibleBullet(Bullets.Bullet556x45)
        		.withName("Stanag100")
        		.withRotationPoint(-0.16000000476837162, -0.16000000476837162, -1.5200000452995304)
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.paneedah.mwc.models.NATODrum100(), "drum100rndmag.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 1.2F, -0.6F);
                    GL11.glRotatef(-160F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1.2F, 1.2F, 1.2f);
                })
                .withMaxStackSize(1)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        STANAGMagazines.SA80Mag = new ItemMagazine.Builder()
        		.withAmmo(60)
        		.withCompatibleBullet(Bullets.Bullet556x45)
        		.withName("SA80Mag")
                
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.paneedah.mwc.models.NATOMag60rnd(), "M4A1Mag.png")
                .withRequiredAttachments(Attachments.Placeholder, Attachments.M4Receiver, Attachments.VLTORReceiver, 
                        Attachments.AUGDefaultKit, Attachments.Vector556Handguard)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.6F, -0.6F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1.1F, 1.1F, 1.1f);
                })
                .withMaxStackSize(1)
                .withCrafting(CraftingComplexity.MEDIUM,
                          MWCItems.steelIngot,
                          MWCItems.gunmetalIngot)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        STANAGMagazines.LancerMag30ClearGrey = new ItemMagazine.Builder()
        		.withAmmo(30)
        		.withCompatibleBullet(Bullets.Bullet556x45)
        		.withName("LancerMag30ClearGrey")
        		.withRotationPoint(-0.16000000476837162, -0.16000000476837162, -1.5200000452995304)
                
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.paneedah.mwc.models.LancerMag30(), "lancermag_cleargrey.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.6F, -0.6F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1.1F, 1.1F, 1.1f);
                })
                .withMaxStackSize(5)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        STANAGMagazines.LancerMag20ClearGrey = new ItemMagazine.Builder()
        		.withAmmo(20)
        		.withCompatibleBullet(Bullets.Bullet556x45)
        		.withName("LancerMag20ClearGrey")
        		.withRotationPoint(-0.16000000476837162, -0.16000000476837162, -1.5200000452995304)
                
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.paneedah.mwc.models.LancerMag20(), "lancermag_cleargrey.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.6F, -0.6F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1.1F, 1.1F, 1.1f);
                })
                .withMaxStackSize(8)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        STANAGMagazines.LancerMag10ClearGrey = new ItemMagazine.Builder()
        		.withAmmo(10)
        		.withCompatibleBullet(Bullets.Bullet556x45)
        		.withName("LancerMag10ClearGrey")
        		.withRotationPoint(-0.16000000476837162, -0.16000000476837162, -1.5200000452995304)
                
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.paneedah.mwc.models.LancerMag10(), "lancermag_cleargrey.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.6F, -0.6F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1.1F, 1.1F, 1.1f);
                })
                .withMaxStackSize(12)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        STANAGMagazines.LancerMag30ClearGreen = new ItemMagazine.Builder()
        		.withAmmo(30)
        		.withCompatibleBullet(Bullets.Bullet556x45)
        		.withName("LancerMag30ClearGreen")
        		.withRotationPoint(-0.16000000476837162, -0.16000000476837162, -1.5200000452995304)
                
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.paneedah.mwc.models.LancerMag30(), "lancermag_cleargreen.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.6F, -0.6F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1.1F, 1.1F, 1.1f);
                })
                .withMaxStackSize(5)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        STANAGMagazines.LancerMag20ClearGreen = new ItemMagazine.Builder()
        		.withAmmo(20)
        		.withCompatibleBullet(Bullets.Bullet556x45)
        		.withName("LancerMag20ClearGreen")
        		.withRotationPoint(-0.16000000476837162, -0.16000000476837162, -1.5200000452995304)
                
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.paneedah.mwc.models.LancerMag20(), "lancermag_cleargreen.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.6F, -0.6F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1.1F, 1.1F, 1.1f);
                })
                .withMaxStackSize(8)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        STANAGMagazines.LancerMag10ClearGreen = new ItemMagazine.Builder()
        		.withAmmo(10)
        		.withCompatibleBullet(Bullets.Bullet556x45)
        		.withName("LancerMag10ClearGreen")
        		.withRotationPoint(-0.16000000476837162, -0.16000000476837162, -1.5200000452995304)
                
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.paneedah.mwc.models.LancerMag10(), "lancermag_cleargreen.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.6F, -0.6F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1.1F, 1.1F, 1.1f);
                })
                .withMaxStackSize(12)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        STANAGMagazines.LancerMag30ClearBlue = new ItemMagazine.Builder()
        		.withAmmo(30)
        		.withCompatibleBullet(Bullets.Bullet556x45)
        		.withName("LancerMag30ClearBlue")
        		.withRotationPoint(-0.16000000476837162, -0.16000000476837162, -1.5200000452995304)
                
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.paneedah.mwc.models.LancerMag30(), "lancermag_clearblue.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.6F, -0.6F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1.1F, 1.1F, 1.1f);
                })
                .withMaxStackSize(5)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        STANAGMagazines.LancerMag20ClearBlue = new ItemMagazine.Builder()
        		.withAmmo(20)
        		.withCompatibleBullet(Bullets.Bullet556x45)
        		.withName("LancerMag20ClearBlue")
        		.withRotationPoint(-0.16000000476837162, -0.16000000476837162, -1.5200000452995304)
                
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.paneedah.mwc.models.LancerMag20(), "lancermag_clearblue.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.6F, -0.6F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1.1F, 1.1F, 1.1f);
                })
                .withMaxStackSize(8)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

        STANAGMagazines.LancerMag10ClearBlue = new ItemMagazine.Builder()
        		.withAmmo(10)
        		.withCompatibleBullet(Bullets.Bullet556x45)
        		.withName("LancerMag10ClearBlue")
        		.withRotationPoint(-0.16000000476837162, -0.16000000476837162, -1.5200000452995304)
                
                .withCreativeTab(ModernWarfareMod.AmmoTab)
                .withModel(new com.paneedah.mwc.models.LancerMag10(), "lancermag_clearblue.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.6F, -0.6F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1.1F, 1.1F, 1.1f);
                })
                .withMaxStackSize(12)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT, ItemMagazine.class);

    }


}
