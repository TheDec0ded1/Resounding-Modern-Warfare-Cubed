package com.paneedah.mwc.weapons;

import com.paneedah.mwc.ModernWarfareMod;
import com.paneedah.mwc.init.MWCItems;
import com.paneedah.mwc.models.*;
import com.paneedah.mwc.weapons.Attachments;
import com.paneedah.mwc.weapons.Attachments2;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import com.paneedah.weaponlib.crafting.CraftingGroup;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import org.lwjgl.opengl.GL11;

public class Attachments3 {

   public static ItemAttachment<Weapon> OKP7;
    public static ItemAttachment<Weapon> PSO1;
    public static ItemAttachment<Weapon> NSPU;
    public static ItemAttachment<Weapon> PKAA;
    public static ItemAttachment<Weapon> FMG9Sight;
    public static ItemAttachment<Weapon> Reflex;
    public static ItemAttachment<Weapon> BijiaReflex;
    public static ItemAttachment<Weapon> Holographic;
    public static ItemAttachment<Weapon> HolographicAlt;
    public static ItemAttachment<Weapon> PK120;
    public static ItemAttachment<Weapon> EotechHybrid2;
    public static ItemAttachment<Weapon> VortexRedux;
    public static ItemAttachment<Weapon> Kobra;
    public static ItemAttachment<Weapon> KobraGen3;
    public static ItemAttachment<Weapon> KobraMount;
    public static ItemAttachment<Weapon> MicroReflex;
    public static ItemAttachment<Weapon> ACOG;
    public static ItemAttachment<Weapon> Specter; 
    public static ItemAttachment<Weapon> HKV; 
    public static ItemAttachment<Weapon> HP;
    public static ItemAttachment<Weapon> LeupoldRailScope;
    public static ItemAttachment<Weapon> VuduScope;
    public static ItemAttachment<Weapon> NightRaider;
    public static ItemAttachment<Weapon> M2A1sight;
    public static ItemAttachment<Weapon> F2000Scope;
    public static ItemAttachment<Weapon> Silencer556x45;
    public static ItemAttachment<Weapon> Silencer762x39;
    public static ItemAttachment<Weapon> Silencer556x39;
    public static ItemAttachment<Weapon> Silencer545x39;
    public static ItemAttachment<Weapon> Silencer50BMG;
    public static ItemAttachment<Weapon> SilencerPBS;
    public static ItemAttachment<Weapon> Silencer9mm;
    public static ItemAttachment<Weapon> SamuraiEdgeSuppressor;
    public static ItemAttachment<Weapon> Silencer762x54;
    public static ItemAttachment<Weapon> Silencer762x51;
    public static ItemAttachment<Weapon> Silencer45ACP;
    public static ItemAttachment<Weapon> SilencerEABH;
    public static ItemAttachment<Weapon> Silencer12Gauge;
    public static ItemAttachment<Weapon> Silencer65x39;
    public static ItemAttachment<Weapon> Silencer57x38;
    public static ItemAttachment<Weapon> Silencer300AACBlackout;
    public static ItemAttachment<Weapon> HoneyBadgerSilencer;
    public static ItemAttachment<Weapon> Silencer357;
    public static ItemAttachment<Weapon> SilencerMP7;
    public static ItemAttachment<Weapon> Silencer9x39mm;
    public static ItemAttachment<Weapon> SuppressorKBP9A91;
    public static ItemAttachment<Weapon> SuppressorSR3M;
    public static ItemAttachment<Weapon> APBSuppressor;
    public static ItemAttachment<Weapon> NGSWRSuppressor;
    public static ItemAttachment<Weapon> QCW05Suppressor;
    public static ItemAttachment<Weapon> Laser;
    public static ItemAttachment<Weapon> Laser2;
    public static ItemAttachment<Weapon> SCCYCPX2Laser;
    public static ItemAttachment<Weapon> DanWessonLaser;
    public static ItemAttachment<Weapon> Grip2;
    public static ItemAttachment<Weapon> AngledGrip;
    public static ItemAttachment<Weapon> JunoGrip;
    public static ItemAttachment<Weapon> StubbyGrip;
    public static ItemAttachment<Weapon> VGrip;
    public static ItemAttachment<Weapon> Bipod;
    public static ItemAttachment<Weapon> M14Bipod;
    public static ItemAttachment<Weapon> GalilARMBipod;
    public static ItemAttachment<Weapon> AUGgrip;
    public static ItemAttachment<Weapon> USPMatchCompensator;
    public static ItemAttachment<Weapon> AKMIron;
    public static ItemAttachment<Weapon> MicroT1;
    public static ItemAttachment<Weapon> AimpointCompM2;
    public static ItemAttachment<Weapon> AimpointCompM5;
    public static ItemAttachment<Weapon> RMR; 
    public static ItemAttachment<Weapon> AK15ironsight;
    public static ItemAttachment<Weapon> AK12ironsight;
    public static ItemAttachment<Weapon> M202scope;
    public static ItemAttachment<Weapon> AUGscope;
    public static ItemAttachment<Weapon> M1928Grip;
    public static ItemAttachment<Weapon> M1A1Grip;
    public static ItemAttachment<Weapon> LeupoldScope;
    public static ItemAttachment<Weapon> TritiumRearSights;
    public static ItemAttachment<Weapon> MBUSRearSights;
    public static ItemAttachment<Weapon> HK416RearSights;
    public static ItemAttachment<Weapon> FNFALRearSights;
    public static ItemAttachment<Weapon> M16A1RearSights;
    public static ItemAttachment<Weapon> K2C1RearSights;
    public static ItemAttachment<Weapon> ScorpionRearSight;
    public static ItemAttachment<Weapon> ScorpionFrontSight;
    public static ItemAttachment<Weapon> MP7IronSights;
    public static ItemAttachment<Weapon> MP7IronSightsStanding;
    public static ItemAttachment<Weapon> M4RearIron;
    public static ItemAttachment<Weapon> LR300FrontSight;

    public static void init(Object mod) {

        AngledGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withRenderablePart()
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.AngledGrip(), "angledgrip.png")
                .withRequiredAttachments(Attachments.MLOKExtendedHandguard, Attachments.M4CarbineHandGuard,
                        Attachments.LVOAVHandGuard, Attachments.M38HandGuard, Attachments.GripPlaceholder, Attachments.UTGTriRailHandGuard, Attachments.Mk18HandGuard,
                        Attachments.M60E4HandGuard, Attachments.AUGA3extGuard, Attachments.AR57Handguard, 
                        Attachments.StonerHANDGUARD, Attachments.KrissVectorReceiver, Attachments.KrissVectorReceiverBlack, Attachments.Vector556Handguard,
                        Attachments.Origin12Handguard, Attachments.HKS20Handguard, Attachments.M16A4HandGuard, Attachments.ACRHandGuard, Attachments.ACRHandGuardBlack,
                        Attachments.ACRWEMSKHandGuard, Attachments.ACRWEMSKHandGuardTan,
                        Attachments.HoneyBadgerMatrixArmsHandguard, Attachments.FNFALPARAHandguard, Attachments.M16A1PicatinnyRail,
                        Attachments.AR10SuperSASSHandguard, Attachments.ARX160Chassis, Attachments.FamasF1PicatinnyRail,
                        Attachments.HK417Handguard, Attachments.HK417HandguardTan, Attachments.AK12Handguard, Attachments.AK12BHandguard, Attachments.CZ805BrenReceiver, Attachments.M14SOCOMChassis,
                        Attachments.Block2SOCOMHandguard, Attachments.FSSTacLiteHandguard, Attachments.Mk18HandGuardBlack, Attachments.M110Handguard, Attachments.Mk48HandGuard,
                        Attachments.KBP9A91KulaTacHandguard, Attachments.VSSVintorezTriRailMount, Attachments.MP5BMHandguard, Attachments.HK416HandGuardBlackAndTan,
                        Attachments.ScarHandGuard, Attachments.ScarMidWestIndustriesHandGuard, Attachments.SIGMCXHandguard, Attachments.SIGMCXHandguardShort, Attachments.Z10Handguard,
                        Attachments.NGSWRRail, Attachments.G3HandguardRailed, Attachments.ScarHHandGuard, Attachments.MPXHandguardRailed, Attachments.MPXHandguardExtended,
                        Attachments.SIG556HandguardKA, Attachments.SIG556HandguardRailed, Attachments.Type20Handguard)
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.6f);
                })
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AngledGrip) {
                        GL11.glTranslatef(0.7F, -1.1F, 0.5F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AngledGrip) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AngledGrip) {
                        GL11.glTranslatef(0.6F, 0.8F, -0.45F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AngledGrip) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                })
                .withRenderablePart()
                .withName("AngledGrip").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        StubbyGrip = new AttachmentBuilder<Weapon>()
                .withRenderablePart()
                .withCategory(AttachmentCategory.GRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.StubbyGrip(), "gun.png")
                .withRequiredAttachments(Attachments.MLOKExtendedHandguard, Attachments.MLOKHandguard, Attachments2.AK200HandGuard,  Attachments2.B30HandGuard, Attachments2.SportRifleHandGuard, Attachments2.SportCarbineHandGuard, Attachments.AK15HandleGuard,
                        Attachments.M4CarbineHandGuard, Attachments.LVOAVHandGuard, Attachments.M38HandGuard, Attachments.UTGTriRailHandGuard,
                        Attachments.GripPlaceholder, Attachments.Mk18HandGuard, Attachments.M60E4HandGuard, Attachments.P90Swordfish, Attachments.AUGA3extGuard,
                        Attachments.AR57Handguard,  Attachments.StonerHANDGUARD, Attachments.KrissVectorReceiver, Attachments.KrissVectorReceiverBlack,
                        Attachments.Vector556Handguard, Attachments.Remington870FABDefensePump,
                        Attachments.Origin12Handguard, Attachments.HKS20Handguard, Attachments.M16A4HandGuard, Attachments.ACRHandGuard, Attachments.ACRHandGuardBlack,
                        Attachments.ACRWEMSKHandGuard, Attachments.ACRWEMSKHandGuardTan,
                        Attachments.HoneyBadgerMatrixArmsHandguard, Attachments.Mk14TanBody, Attachments.Mk14SnowBody, Attachments.Mk14BlackBody,
                        Attachments.FNFALPARAHandguard, Attachments.M16A1PicatinnyRail, Attachments.K2C1Handguard, Attachments.AR10SuperSASSHandguard,
                        Attachments.ScorpionHandguardShort, Attachments.APC9Placeholder, Attachments.ARX160Chassis,
                        Attachments.FamasF1PicatinnyRail,
                        Attachments.HK417Handguard, Attachments.HK417HandguardTan, Attachments.AK12Handguard, Attachments.AK12BHandguard, Attachments.CZ805BrenReceiver, Attachments.M14SOCOMChassis,
                        Attachments.Block2SOCOMHandguard, Attachments.FSSTacLiteHandguard, Attachments.Mk18HandGuardBlack, Attachments.M110Handguard, Attachments.Mk48HandGuard,
                        Attachments.KBP9A91KulaTacHandguard, Attachments.VSSVintorezTriRailMount, Attachments.MP5BMHandguard, Attachments.HK416HandGuardBlackAndTan,
                        Attachments.ScarHandGuard, Attachments.ScarMidWestIndustriesHandGuard, Attachments.SIGMCXHandguard, Attachments.SIGMCXHandguardShort, Attachments.Z10Handguard,
                        Attachments.NGSWRRail, Attachments.G3HandguardRailed, Attachments.ScarHHandGuard, Attachments.MPXHandguardRailed, Attachments.MPXHandguardExtended,
                        Attachments.SIG556HandguardKA, Attachments.SIG556HandguardRailed, Attachments.Type20Handguard, Attachments.AK12kalHandguard, Attachments.AK12kalTanHandguard)
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.6f);
                })
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.StubbyGrip) {
                        GL11.glTranslatef(0.7F, -1.2F, 0.5F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.StubbyGrip) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.StubbyGrip) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.6F, 1.6F, 1.6f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.StubbyGrip) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                })
                .withName("StubbyGrip").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        VGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withRenderablePart()
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.VGrip(), "gun.png")
                .withRequiredAttachments(Attachments.MLOKExtendedHandguard, Attachments.MLOKHandguard, Attachments2.AK200HandGuard,  Attachments2.B30HandGuard, Attachments2.SportRifleHandGuard, Attachments2.SportCarbineHandGuard, Attachments.AK15HandleGuard,
                        Attachments.M4CarbineHandGuard, Attachments.LVOAVHandGuard, Attachments.M38HandGuard, Attachments.UTGTriRailHandGuard,
                        Attachments.GripPlaceholder, Attachments.Mk18HandGuard, Attachments.M60E4HandGuard, Attachments.P90Swordfish, Attachments.AUGA3extGuard,
                        Attachments.AR57Handguard,  Attachments.StonerHANDGUARD, Attachments.KrissVectorReceiver, Attachments.KrissVectorReceiverBlack,
                        Attachments.Vector556Handguard, Attachments.Remington870FABDefensePump,
                        Attachments.Origin12Handguard, Attachments.HKS20Handguard, Attachments.M16A4HandGuard, Attachments.ACRHandGuard, Attachments.ACRHandGuardBlack,
                        Attachments.ACRWEMSKHandGuard, Attachments.ACRWEMSKHandGuardTan,
                        Attachments.HoneyBadgerMatrixArmsHandguard, Attachments.Mk14TanBody, Attachments.Mk14SnowBody, Attachments.Mk14BlackBody,
                        Attachments.FNFALPARAHandguard, Attachments.M16A1PicatinnyRail, Attachments.K2C1Handguard, Attachments.AR10SuperSASSHandguard,
                        Attachments.ScorpionHandguardShort, Attachments.APC9Placeholder, Attachments.ARX160Chassis,
                        Attachments.FamasF1PicatinnyRail,
                        Attachments.HK417Handguard, Attachments.HK417HandguardTan, Attachments.AK12Handguard, Attachments.AK12BHandguard, Attachments.CZ805BrenReceiver, Attachments.M14SOCOMChassis,
                        Attachments.Block2SOCOMHandguard, Attachments.FSSTacLiteHandguard, Attachments.Mk18HandGuardBlack, Attachments.M110Handguard, Attachments.Mk48HandGuard,
                        Attachments.KBP9A91KulaTacHandguard, Attachments.VSSVintorezTriRailMount, Attachments.MP5BMHandguard, Attachments.HK416HandGuardBlackAndTan,
                        Attachments.ScarHandGuard, Attachments.ScarMidWestIndustriesHandGuard, Attachments.SIGMCXHandguard, Attachments.SIGMCXHandguardShort, Attachments.Z10Handguard,
                        Attachments.NGSWRRail, Attachments.G3HandguardRailed, Attachments.ScarHHandGuard, Attachments.MPXHandguardRailed, Attachments.MPXHandguardExtended,
                        Attachments.SIG556HandguardKA, Attachments.SIG556HandguardRailed, Attachments.Type20Handguard, Attachments.AK12kalHandguard, Attachments.AK12kalTanHandguard)
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.6f);
                })
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.VGrip) {
                        GL11.glTranslatef(0.7F, -1.1F, 0.5F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.VGrip) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.VGrip) {
                        GL11.glTranslatef(0.6F, 0.3F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.3F, 1.3F, 1.3f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.VGrip) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                })
                .withRenderablePart()
                .withName("VGrip").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Bipod = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new com.paneedah.mwc.models.Bipod(), "bipod.png")
                .withRequiredAttachments(Attachments.MLOKExtendedHandguard, Attachments.MLOKHandguard, Attachments2.AK200HandGuard,  Attachments2.B30HandGuard, Attachments2.SportRifleHandGuard, Attachments2.SportCarbineHandGuard, Attachments.AK15HandleGuard,
                        Attachments.M4CarbineHandGuard, Attachments.LVOAVHandGuard, Attachments.M38HandGuard, Attachments.UTGTriRailHandGuard, Attachments.GripPlaceholder,
                        Attachments.Mk18HandGuard, Attachments.AUGA3extGuard, Attachments.AR57Handguard,  Attachments.StonerHANDGUARD,
                        Attachments.StonerHANDGUARD, Attachments.KrissVectorReceiver, Attachments.KrissVectorReceiverBlack, Attachments.Vector556Handguard, Attachments.M16A4HandGuard, Attachments.ACRPrecisionHandGuard, Attachments.ACRHandGuard,
                        Attachments.ACRPrecisionHandGuardTan, Attachments.ACRHandGuardBlack, Attachments.ACRWEMSKHandGuard, Attachments.ACRWEMSKHandGuardTan,
                        Attachments.HoneyBadgerMatrixArmsHandguard, Attachments.Mk14TanBody, Attachments.Mk14SnowBody, Attachments.Mk14BlackBody, Attachments.SSG08Chassis,
                        Attachments.FNFALPARAHandguard, Attachments.M16A1PicatinnyRail, Attachments.K2C1Handguard, Attachments.AR10SuperSASSHandguard, Attachments.ARX160Chassis,
                        Attachments.HK417Handguard, Attachments.HK417HandguardTan, Attachments.AK12Handguard, Attachments.AK12BHandguard, Attachments.CZ805BrenReceiver, Attachments.M14SOCOMChassis,
                        Attachments.Block2SOCOMHandguard, Attachments.FSSTacLiteHandguard, Attachments.Mk18HandGuardBlack, Attachments.M110Handguard, Attachments.M249HandGuard, Attachments.Mk48HandGuard,
                        Attachments.M40A6GripPlaceholder, Attachments.VSSVintorezTriRailMount, Attachments.MP5BMHandguard, Attachments.HK416HandGuardBlackAndTan,
                        Attachments.ScarHandGuard, Attachments.ScarMidWestIndustriesHandGuard, Attachments.SIGMCXHandguard, Attachments.SIGMCXHandguardShort,
                        Attachments.DSR1HandguardRailed, Attachments.Z10Handguard, Attachments.NGSWRRail, Attachments.G3HandguardRailed, Attachments.ScarHHandGuard,
                        Attachments.MPXHandguardRailed, Attachments.MPXHandguardExtended,
                        Attachments.SIG556HandguardKA, Attachments.SIG556HandguardRailed, Attachments.Type20Handguard, Attachments.AK12kalHandguard, Attachments.AK12kalTanHandguard)
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.4f);
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Bipod) {
                        GL11.glTranslatef(0.7F, -1.1F, 0.5F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Bipod) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Bipod) {
                        GL11.glTranslatef(0.6F, 0.05F, -0.85F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Bipod) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                })
                .withName("Bipod").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

 M14Bipod = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new com.paneedah.mwc.models.M14Bipod(), "bipod.png")
                .withRequiredAttachments(Attachments.M14SOCOMChassis, Attachments.M14Body, Attachments.M14WoodBody, Attachments.M14WoodChassis, Attachments.M14ClassicBody, Attachments.M14A1Body)
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.4f);
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M14Bipod) {
                        GL11.glTranslatef(0.7F, -1.1F, 0.5F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M14Bipod) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M14Bipod) {
                        GL11.glTranslatef(0.6F, 0.05F, -0.85F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M14Bipod) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                })
                .withName("M14Bipod").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

 GalilARMBipod = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new com.paneedah.mwc.models.GalilBipod(), "ak47.png")
                .withRequiredAttachments(Attachments2.GalilARMHandGuard)
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.4f);
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.GalilBipod) {
                        GL11.glTranslatef(0.7F, -1.1F, 0.5F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.GalilBipod) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.GalilBipod) {
                        GL11.glTranslatef(0.6F, 0.05F, -0.85F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.GalilBipod) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                })
                .withName("GalilARMBipod").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        AUGgrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withRenderablePart()
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.AUGGrip(), "aug.png")
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.6f);
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AUGGrip) {
                        GL11.glTranslatef(0.7F, -1.1F, 0.5F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AUGGrip) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AUGGrip) {
                        GL11.glTranslatef(0.6F, 0.6F, -3.7F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.3F, 1.3F, 1.3f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AUGGrip) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                })
                .withRenderablePart()
                .withName("AUGgrip").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        USPMatchCompensator = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withRenderablePart()
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.USPMatchCompensator(), "gun.png")
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.4f);
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.USPMatchCompensator) {
                        GL11.glTranslatef(0.7F, -1.1F, 0.5F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.USPMatchCompensator) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.USPMatchCompensator) {
                        GL11.glTranslatef(0.6F, 0.6F, -3.7F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.3F, 1.3F, 1.3f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.USPMatchCompensator) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                })
                .withRenderablePart()
                .withName("USPMatchCompensator").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        AK15ironsight = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.KA_AK12_Ironsight(), "gun.png")
                .withModel(new com.paneedah.mwc.models.AKMiron2(), "gun.png")
                .withRequiredAttachments(Attachments.VeprDustCover, Attachments.AK200DustCover, Attachments2.PP19VityazSNDC, Attachments2.B33DustCover, Attachments.AK15DustCover, Attachments.Placeholder)
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.KA_AK12_Ironsight) {
                        GL11.glTranslatef(-0.6F, -1F, 0.7F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KA_AK12_Ironsight) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KA_AK12_Ironsight) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AK15ironsight")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        AK12ironsight = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.AK15ironsight(), "gun.png")
                .withModel(new com.paneedah.mwc.models.AKMiron2(), "gun.png")
                .withRequiredAttachments(Attachments.VeprDustCover, Attachments.AK200DustCover, Attachments2.PP19VityazSNDC, Attachments2.B33DustCover, Attachments.AK15DustCover, Attachments.Placeholder)
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AK15ironsight) {
                        GL11.glTranslatef(-0.6F, -1F, 0.7F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK15ironsight) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK15ironsight) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AK12ironsight")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        SilencerMP7 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Suppressor(), "gun.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2), 
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("SilencerMP7").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Silencer357 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Suppressor(), "GunmetalTexture.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("Silencer357").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Silencer57x38 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Suppressor(), "gun.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 1), 
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("Silencer57x38").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);


        Silencer12Gauge = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Suppressor45ACP(), "GunmetalTexture.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3), 
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor45ACP) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor45ACP) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor45ACP) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor45ACP) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("Silencer12Gauge").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);


        Silencer300AACBlackout = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Suppressor300AACBlackout(), "gun.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2), 
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor300AACBlackout) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor300AACBlackout) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor300AACBlackout) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor300AACBlackout) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })
                .withName("Silencer300AACBlackout").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        HoneyBadgerSilencer = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withModel(new com.paneedah.mwc.models.AACHoneyBadgerSilencer(), "gun.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AACHoneyBadgerSilencer) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AACHoneyBadgerSilencer) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AACHoneyBadgerSilencer) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor300AACBlackout) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })
                .withName("HoneyBadgerSilencer").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Silencer65x39 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Suppressor556x39(), "gun.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 1), 
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor556x39) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor556x39) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor556x39) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor556x39) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })
                .withName("Silencer65x39").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Laser = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.LASER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withRequiredAttachments(Attachments.M4CarbineHandGuard, Attachments.M38HandGuard, Attachments.UTGTriRailHandGuard, Attachments.PistolPlaceholder,
                        Attachments.FABDefenseMount, Attachments.LaserPlaceholder, Attachments.Mk18HandGuard, Attachments.M60E4HandGuard,
                        Attachments.P90Swordfish, Attachments.AUGA3extGuard, Attachments.StonerHANDGUARD, Attachments.SamuraiEdgeBody,
                        Attachments.M16A4HandGuard, Attachments.ACRHandGuard, Attachments.ACRHandGuardBlack,
                        Attachments.HoneyBadgerMatrixArmsHandguard,
                        Attachments.ScorpionHandguardShort, Attachments.APC9Placeholder, Attachments.ARX160Chassis,
                        Attachments.FamasF1PicatinnyRail,
                        Attachments.HK417Handguard, Attachments.HK417HandguardTan, Attachments.AK12Handguard, Attachments.AK12BHandguard, Attachments.CZ805BrenReceiver, Attachments.Block2SOCOMHandguard,
                        Attachments.FSSTacLiteHandguard, Attachments.Mk18HandGuardBlack, Attachments.M110Handguard, Attachments.Mk48UpperHandGuard,
                        Attachments.M9A1Body, Attachments.SamuraiEdgeMount, Attachments.KBP9A91KulaTacHandguard, Attachments.VSSVintorezTriRailMount, Attachments.SR3MPRail, Attachments.M14TriRailCover,
                        Attachments.MP5BMHandguard, Attachments.HK416HandGuardBlackAndTan, Attachments2.AK200HandGuard,
                        Attachments.ScarHandGuard, Attachments.ScarMidWestIndustriesHandGuard, Attachments.NGSWRRail, Attachments.K2C1Handguard, Attachments.G3HandguardRailed,
                        Attachments.ScarHHandGuard, Attachments.MPXHandguardRailed, Attachments.MPXHandguardExtended,
                        Attachments.SIG556HandguardKA, Attachments.SIG556HandguardRailed, Attachments.Type20Handguard)
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2), 
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withModel(new com.paneedah.mwc.models.Laser(), "gun.png")
                .withPostRender(new LaserBeamRenderer((p, s) -> {
                    GL11.glTranslatef(-0.2F, 1.4F, 1.8F);
                }))
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Laser) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Laser) {

                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Laser) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Laser) {
                        GL11.glTranslatef(0.6F, -0.3F, 0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.8F, 1.8F, 1.8f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Laser) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })
                .withRenderablePart()
                .withName("Laser").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Laser2 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.LASER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Laser3(), "laser2.png")
                .withRequiredAttachments(Attachments.MLOKExtendedHandguard, Attachments.MLOKHandguard, Attachments2.AK200HandGuard,  Attachments2.B30HandGuard, Attachments2.SportRifleHandGuard, Attachments2.SportCarbineHandGuard, Attachments.AK15HandleGuard, Attachments.AK12kalHandguard,
                        Attachments.M4CarbineHandGuard, Attachments.M38HandGuard, Attachments.UTGTriRailHandGuard, Attachments.PistolPlaceholder, Attachments.AK12kalTanHandguard, 
                        Attachments.LaserPlaceholder, Attachments.Mk18HandGuard, Attachments.M60E4HandGuard, Attachments.P90Swordfish,
                        Attachments.AUGA3extGuard, Attachments.StonerHANDGUARD, Attachments.AR57Handguard, Attachments.M16A4HandGuard, Attachments.ACRHandGuard, Attachments.ACRHandGuardBlack,
                        Attachments.HoneyBadgerMatrixArmsHandguard, Attachments.AR10SuperSASSHandguard,
                        Attachments.ScorpionHandguardShort, Attachments.APC9Placeholder, Attachments.ARX160Chassis, Attachments.FamasF1PicatinnyRail,
                        Attachments.HK417Handguard, Attachments.HK417HandguardTan, Attachments.AK12BHandguard, Attachments.CZ805BrenReceiver, Attachments.Block2SOCOMHandguard,
                        Attachments.LVOAVHandGuard, Attachments.FSSTacLiteHandguard, Attachments.Mk18HandGuardBlack, Attachments.M110Handguard, Attachments.Mk48UpperHandGuard,
                        Attachments.KBP9A91KulaTacHandguard, Attachments.VSSVintorezTriRailMount, Attachments.SR3MPRail, Attachments.M14TriRailCover, Attachments.MP5BMHandguard,
                        Attachments.HK416HandGuardBlackAndTan, Attachments.ScarHandGuard, Attachments.ScarMidWestIndustriesHandGuard,
                        Attachments.Z10Handguard, Attachments.SIGMCXHandguard, Attachments.SIGMCXHandguardShort, Attachments.NGSWRRail, Attachments.K2C1Handguard, Attachments.G3HandguardRailed,
                        Attachments.ScarHHandGuard, Attachments.MPXHandguardRailed, Attachments.MPXHandguardExtended,
                        Attachments.SIG556HandguardKA, Attachments.SIG556HandguardRailed, Attachments.Type20Handguard)
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2), 
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withPostRender(new LaserBeamRenderer((p, s) -> {
                    GL11.glTranslatef(-0.2F, 1.3F, 1.8F);
                })).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Laser3) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Laser3) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Laser3) {
                        GL11.glTranslatef(0.6F, -0.3F, 0.4F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.8F, 1.8F, 1.8f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Laser3) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })
                .withRenderablePart()
                .withName("Laser2").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        SCCYCPX2Laser = new AttachmentBuilder<Weapon>()
        		.withCategory(AttachmentCategory.LASER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.SCCYCPX2Laser(), "sccycpx2.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2), 
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withPostRender(new LaserBeamRenderer((p, s) -> {
                    GL11.glTranslatef(-0.62F, 0.82F, 0.5F);
                }))
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SCCYCPX2Laser) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                })
                .withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SCCYCPX2Laser) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                })
                .withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SCCYCPX2Laser) {
                        GL11.glTranslatef(0.6F, 1.4F, -3.6F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.8F, 1.8F, 1.8f);

                    }
                })
                .withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SCCYCPX2Laser) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })
                .withRenderablePart()
                .withName("SCCYCPX2Laser")
                
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        DanWessonLaser = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.LASER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.DanWessonLaser(), "DanWessonLaser.png")
                .withPostRender(new LaserBeamRenderer((p, s) -> {
                    GL11.glTranslatef(-0.2F, 1.4F, 1.8F);
                })).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.DanWessonLaser) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.DanWessonLaser) {

                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.DanWessonLaser) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.DanWessonLaser) {
                        GL11.glTranslatef(0.6F, -0F, 0.2F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.1F, 1.1F, 1.1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.DanWessonLaser) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })
                .withRenderablePart()
                .withName("DanWessonLaser").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        
        M1928Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withRenderablePart()
                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new com.paneedah.mwc.models.M1928Grip(), "m1a1thompson.png")
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.6f);
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M1928Grip) {
                        GL11.glTranslatef(0.7F, -1.2F, 0.5F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M1928Grip) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M1928Grip) {
                        GL11.glTranslatef(0.6F, 0.5F, -3.2F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.1F, 1.1F, 1.1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M1928Grip) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                })
                .withName("M1928Grip").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M1A1Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withRenderablePart()
                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new com.paneedah.mwc.models.M1A1Grip(), "m1a1thompson.png")
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 1.0f);
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M1A1Grip) {
                        GL11.glTranslatef(0.7F, -1.2F, 0.5F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M1A1Grip) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M1A1Grip) {
                        GL11.glTranslatef(0.6F, 1.1F, -3.6F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.1F, 1.1F, 1.1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M1A1Grip) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                })
                .withName("M1A1Grip").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Grip2 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withRenderablePart()
                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new com.paneedah.mwc.models.Grip2(), "gun.png")
                .withRequiredAttachments(Attachments.MLOKExtendedHandguard, Attachments.MLOKHandguard, Attachments2.AK200HandGuard,  Attachments2.B30HandGuard, Attachments2.SportRifleHandGuard, Attachments2.SportCarbineHandGuard,
                        Attachments.AK15HandleGuard, Attachments.M4CarbineHandGuard, Attachments.LVOAVHandGuard,
                        Attachments.M38HandGuard, Attachments.UTGTriRailHandGuard, Attachments.GripPlaceholder,
                        Attachments.Mk18HandGuard, Attachments.M60E4HandGuard, Attachments.P90Swordfish, Attachments.AUGA3extGuard,
                        Attachments.AR57Handguard,  Attachments.StonerHANDGUARD, Attachments.KrissVectorReceiver, Attachments.KrissVectorReceiverBlack,
                        Attachments.Vector556Handguard, Attachments.Remington870FABDefensePump,
                        Attachments.Origin12Handguard, Attachments.HKS20Handguard, Attachments.M16A4HandGuard, Attachments.ACRHandGuard,
                        Attachments.ACRHandGuardBlack, Attachments.ACRWEMSKHandGuard, Attachments.ACRWEMSKHandGuardTan,
                        Attachments.HoneyBadgerMatrixArmsHandguard, Attachments.Mk14TanBody, Attachments.Mk14SnowBody, Attachments.Mk14BlackBody,
                        Attachments.FNFALPARAHandguard, Attachments.M16A1PicatinnyRail, Attachments.K2C1Handguard, Attachments.AR10SuperSASSHandguard,
                        Attachments.ScorpionHandguardShort, Attachments.APC9Placeholder, Attachments.ARX160Chassis,
                        Attachments.FamasF1PicatinnyRail,
                        Attachments.HK417Handguard, Attachments.HK417HandguardTan, Attachments.AK12Handguard, Attachments.AK12BHandguard, Attachments.CZ805BrenReceiver, Attachments.M14SOCOMChassis,
                        Attachments.Block2SOCOMHandguard, Attachments.FSSTacLiteHandguard, Attachments.Mk18HandGuardBlack, Attachments.M110Handguard, Attachments.Mk48HandGuard,
                        Attachments.KBP9A91KulaTacHandguard, Attachments.VSSVintorezTriRailMount, Attachments.MP5BMHandguard, Attachments.HK416HandGuardBlackAndTan,
                        Attachments.ScarHandGuard, Attachments.ScarMidWestIndustriesHandGuard, Attachments.SIGMCXHandguard, Attachments.SIGMCXHandguardShort, Attachments.Z10Handguard,
                        Attachments.NGSWRRail, Attachments.G3HandguardRailed, Attachments.ScarHHandGuard, Attachments.MPXHandguardRailed, Attachments.MPXHandguardExtended,
                        Attachments.SIG556HandguardKA, Attachments.SIG556HandguardRailed, Attachments.Type20Handguard, Attachments.AK12kalHandguard, Attachments.AK12kalTanHandguard)
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.6f);
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Grip2) {
                        GL11.glTranslatef(0.7F, -1.2F, 0.5F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Grip2) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Grip2) {
                        GL11.glTranslatef(0.6F, 0.3F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.3F, 1.3F, 1.3f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Grip2) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                })
                .withName("Grip2").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        JunoGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withRenderablePart()
                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withModel(new com.paneedah.mwc.models.JunoGrip(), "gun.png")
                .withRequiredAttachments(Attachments.MLOKExtendedHandguard, Attachments.M4CarbineHandGuard, Attachments.LVOAVHandGuard,
                        Attachments.M38HandGuard, Attachments.Mk18HandGuard, Attachments.AR57Handguard,  Attachments.M16A4HandGuard,
                        Attachments.HoneyBadgerMatrixArmsHandguard, Attachments.AR10SuperSASSHandguard,
                        Attachments.HK417Handguard, Attachments.HK417HandguardTan, Attachments.Block2SOCOMHandguard, Attachments.FSSTacLiteHandguard,
                        Attachments.Mk18HandGuardBlack, Attachments.M110Handguard, Attachments.HK416HandGuardBlackAndTan,
                        Attachments.ScarHandGuard, Attachments.ScarMidWestIndustriesHandGuard, Attachments.SIGMCXHandguard, Attachments.SIGMCXHandguardShort, Attachments.Z10Handguard,
                        Attachments.NGSWRRail, Attachments.G3HandguardRailed, Attachments.ScarHHandGuard,
                        Attachments.SIG556HandguardKA, Attachments.SIG556HandguardRailed)
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.6f);
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.JunoGrip) {
                        GL11.glTranslatef(0.7F, -1.2F, 0.5F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.JunoGrip) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.JunoGrip) {
                        GL11.glTranslatef(0.6F, 0F, -0.1F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.JunoGrip) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                })
                .withName("JunoGrip").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        
        SilencerPBS = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withRequiredAttachments(Attachments.MakarovPBBody)
                .withModel(new com.paneedah.mwc.models.MakarovPBSSilencer(), "MakarovPBSSilencer.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2), 
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MakarovPBSSilencer) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MakarovPBSSilencer) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MakarovPBSSilencer) {
                        GL11.glTranslatef(0.6F, 1.4F, -3.8F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MakarovPBSSilencer) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("SilencerPBS")
                
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Silencer9mm = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withRequiredAttachments(Attachments.M9A1Body, Attachments.ScorpionHandguardShort, Attachments.ScorpionHandguardLong, Attachments.Glock19Body, Attachments.Glock19XBody,
                        Attachments.Glock19RazorbackBody, Attachments.P226Slide, Attachments.APC9Placeholder, Attachments.MP443Slide, Attachments.SCCYCPX2Body, Attachments.SCCYCPX2BodyTan)
                .withModel(new com.paneedah.mwc.models.Suppressor(), "GunmetalTexture.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2), 
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("Silencer9mm")
                
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        SamuraiEdgeSuppressor = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withRequiredAttachments(Attachments.SamuraiEdgeMount)
                .withModel(new com.paneedah.mwc.models.SamuraiEdgeSuppressor(), "samuraiedge.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2), 
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SamuraiEdgeSuppressor) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SamuraiEdgeSuppressor) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SamuraiEdgeSuppressor) {
                        GL11.glTranslatef(0.6F, 1.2F, -4F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SamuraiEdgeSuppressor) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("SamuraiEdgeSuppressor")
                
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Silencer9x39mm = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Suppressor(), "GunmetalTexture.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2), 
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("Silencer9x39mm")
                
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        SuppressorKBP9A91 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.KBP9A91Suppressor(), "kbp9a91.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2), 
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KBP9A91Suppressor) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KBP9A91Suppressor) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KBP9A91Suppressor) {
                        GL11.glTranslatef(0.6F, 1.3F, -5.3F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KBP9A91Suppressor) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("KBP9A91Suppressor")
                
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        SuppressorSR3M = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.SR3MSilencer(), "vssvintorez.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2), 
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SR3MSilencer) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SR3MSilencer) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SR3MSilencer) {
                        GL11.glTranslatef(0.6F, 1.3F, -5.3F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SR3MSilencer) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("SR3MSuppressor")
                
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        APBSuppressor = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.APBSilencer(), "vssvintorez.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2), 
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.APBSilencer) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.APBSilencer) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.APBSilencer) {
                        GL11.glTranslatef(0.6F, 1.3F, -5.3F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.APBSilencer) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("APBSuppressor")
                
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        NGSWRSuppressor = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.NGSWRSilencer(), "ngswr.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2), 
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.NGSWRSilencer) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.NGSWRSilencer) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.NGSWRSilencer) {
                        GL11.glTranslatef(0.6F, 1.3F, -5.3F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.NGSWRSilencer) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("NGSWRSuppressor")
                
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        QCW05Suppressor = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QCW05Suppressor(), "aek971.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2), 
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.QCW05Suppressor) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.QCW05Suppressor) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.QCW05Suppressor) {
                        GL11.glTranslatef(0.6F, 1.3F, -5.3F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.QCW05Suppressor) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QCW05Suppressor")
                
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Silencer45ACP = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withRequiredAttachments(Attachments.KrissVectorReceiver, Attachments.KrissVectorReceiverBlack, Attachments.M1911Body)
                .withModel(new com.paneedah.mwc.models.Suppressor45ACP(), "gun.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2), 
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor45ACP) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor45ACP) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor45ACP) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor45ACP) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("Silencer45ACP").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        SilencerEABH = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Suppressor45ACP(), "gun.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor45ACP) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor45ACP) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor45ACP) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor45ACP) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("silencer_eabh").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Silencer762x54 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Suppressor(), "gun.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3), 
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })
                .withName("Silencer762x54").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Silencer762x51 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Suppressor762x51(), "gun.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3), 
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor762x51) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor762x51) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor762x51) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor762x51) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })
                .withName("Silencer762x51").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Silencer50BMG = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Suppressor(), "GunmetalTexture.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 4), 
                    	new CraftingEntry(MWCItems.steelIngot, 4))
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })
                .withName("Silencer50BMG").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);


        Silencer556x39 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Suppressor556x39(), "gun.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2), 
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor556x39) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor556x39) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor556x39) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor556x39) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })
                .withName("Silencer556x39").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);


        AKMIron = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new AKMiron1(), "gun.png")
                .withModel(new AKMiron2(), "gun.png").withModel(new AK47iron(), "gun.png")
                .withModel(new M4Iron1(), "gun.png").withModel(new M4Iron2(), "gun.png")
                .withModel(new P90iron(), "gun.png").withModel(new G36CIron1(), "gun.png")
                .withModel(new G36CIron2(), "gun.png").withModel(new ScarIron1(), "gun.png")
                .withModel(new ScarIron2(), "gun.png").withModel(new FALIron(), "gun.png")
                .withModel(new M14Iron(), "gun.png").withModel(new MP5Iron(), "gun.png")
                .withModel(new MP5Iron(), "gun.png")
                .withModel(new M27rearsight(), "gun.png")
                .withModel(new MBUSiron(), "gun.png")
                .withRequiredAttachments(Attachments.VeprDustCover, Attachments.AK200DustCover, Attachments2.PP19VityazSNDC, Attachments2.B33DustCover, Attachments.AK15DustCover, Attachments.Placeholder,
                        Attachments.MIMP5TRRail, Attachments.MIMP5MRail, Attachments.ShotgunRail, Attachments.Kar98Krail, Attachments.M60Rail,
                        Attachments.P90Placeholder, Attachments.AUGA2handguard, Attachments.AUGA3handguard, Attachments.M4Receiver,
                        Attachments.VLTORReceiver, Attachments.AR57Receiver, Attachments.EF88Handguard,
                        Attachments.KrissVectorReceiver, Attachments.KrissVectorReceiverBlack, Attachments.Vector556Handguard, Attachments.Origin12Grip, Attachments.HKS20Grip)
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M27rearsight) {
                        GL11.glTranslatef(-0.6F, -1F, 0.5F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M27rearsight) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M27rearsight) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AKMIron").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        TritiumRearSights = new AttachmentBuilder<Weapon>()
        		.withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.TritiumRearSights(), "gun.png")
                .withRequiredAttachments(Attachments.VeprDustCover, Attachments.AK200DustCover, Attachments2.PP19VityazSNDC, Attachments2.B33DustCover, Attachments.AK15DustCover, Attachments.Placeholder,
                        Attachments.MIMP5TRRail, Attachments.MIMP5MRail, Attachments.ShotgunRail, Attachments.Kar98Krail, Attachments.M60Rail,
                        Attachments.P90Placeholder, Attachments.AUGA2handguard, Attachments.AUGA3handguard, Attachments.M4Receiver,
                        Attachments.VLTORReceiver, Attachments.AR57Receiver, Attachments.EF88Handguard,
                        Attachments.KrissVectorReceiver, Attachments.KrissVectorReceiverBlack, Attachments.Vector556Handguard, Attachments.Origin12Grip, Attachments.HKS20Grip,
                        Attachments.Beowulf50CalReceiver, Attachments.HK417Receiver, Attachments.HK417ReceiverTan, Attachments.HK416Receiver,
                        Attachments.M110Receiver, Attachments.Z10Receiver)
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2), 
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.TritiumRearSights) {
                        GL11.glTranslatef(-0.6F, -0.9F, 0.45F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.1F, 1.1F, 1.1f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.TritiumRearSights) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.TritiumRearSights) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("TritiumRearSights").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        MBUSRearSights = new AttachmentBuilder<Weapon>()
        		.withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new MBUSRearSight(), "gun.png")
                .withRequiredAttachments(Attachments.VeprDustCover, Attachments.AK200DustCover, Attachments2.PP19VityazSNDC, Attachments2.B33DustCover, Attachments.AK15DustCover, Attachments.Placeholder,
                        Attachments.MIMP5TRRail, Attachments.MIMP5MRail, Attachments.ShotgunRail, Attachments.Kar98Krail, Attachments.M60Rail,
                        Attachments.P90Placeholder, Attachments.AUGA2handguard, Attachments.AUGA3handguard, Attachments.M4Receiver,
                        Attachments.VLTORReceiver, Attachments.AR57Receiver, Attachments.EF88Handguard,
                        Attachments.KrissVectorReceiver, Attachments.KrissVectorReceiverBlack, Attachments.Vector556Handguard, Attachments.Origin12Grip, Attachments.HKS20Grip,
                        Attachments.Beowulf50CalReceiver, Attachments.HK417Receiver, Attachments.HK417ReceiverTan, Attachments.HK416Receiver,
                        Attachments.M110Receiver, Attachments.Z10Receiver)
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2), 
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.MBUSRearSight) {
                    	 GL11.glTranslatef(-0.6F, -0.9F, 0.45F);
                         GL11.glRotatef(10F, 1f, 0f, 0f);
                         GL11.glRotatef(-190F, 0f, 1f, 0f);
                         GL11.glRotatef(0F, 0f, 0f, 1f);
                         GL11.glScaled(1.1F, 1.1F, 1.1f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MBUSRearSight) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MBUSRearSight) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MBUSRearSights").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        HK416RearSights = new AttachmentBuilder<Weapon>()
        		.withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.G95_upright_rearsights(), "gun.png")
                .withRequiredAttachments(Attachments.VeprDustCover, Attachments.AK200DustCover, Attachments2.PP19VityazSNDC, Attachments2.B33DustCover, Attachments.AK15DustCover, Attachments.Placeholder,
                        Attachments.MIMP5TRRail, Attachments.MIMP5MRail, Attachments.ShotgunRail, Attachments.Kar98Krail, Attachments.M60Rail,
                        Attachments.P90Placeholder, Attachments.AUGA2handguard, Attachments.AUGA3handguard, Attachments.M4Receiver,
                        Attachments.VLTORReceiver, Attachments.AR57Receiver, Attachments.EF88Handguard,
                        Attachments.KrissVectorReceiver, Attachments.KrissVectorReceiverBlack, Attachments.Vector556Handguard, Attachments.Origin12Grip, Attachments.HKS20Grip,
                        Attachments.Beowulf50CalReceiver, Attachments.HK417Receiver, Attachments.HK417ReceiverTan, Attachments.HK416Receiver,
                        Attachments.M110Receiver, Attachments.Z10Receiver)
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2), 
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.G95_upright_rearsights) {
                    	 GL11.glTranslatef(-0.6F, -0.9F, 0.45F);
                         GL11.glRotatef(10F, 1f, 0f, 0f);
                         GL11.glRotatef(-190F, 0f, 1f, 0f);
                         GL11.glRotatef(0F, 0f, 0f, 1f);
                         GL11.glScaled(1F, 1F, 1f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.G95_upright_rearsights) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.G95_upright_rearsights) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("HK416RearSights").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        FNFALRearSights = new AttachmentBuilder<Weapon>()
        		.withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FNFALRearSight(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.FNFALRearSight) {
                        GL11.glTranslatef(-0.6F, -0.7F, 0.65F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.FNFALRearSight) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.FNFALRearSight) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("FNFALRearSights").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M16A1RearSights = new AttachmentBuilder<Weapon>()
        		.withCategory(AttachmentCategory.EXTRA3)
                .withModel(new com.paneedah.mwc.models.M16A1RearSight(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M16A1RearSight) {
                        GL11.glTranslatef(-0.6F, -0.7F, 0.65F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16A1RearSight) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16A1RearSight) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M16A1RearSight").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        K2C1RearSights = new AttachmentBuilder<Weapon>()
        		.withCategory(AttachmentCategory.SCOPE)
        		.withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.K2C1RearSight(), "gun.png")
                .withModel(new com.paneedah.mwc.models.ScarIron2(), "gun.png")
                .withModel(new com.paneedah.mwc.models.FALIron(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.K2C1RearSight) {
                        GL11.glTranslatef(-0.6F, -0.7F, 0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.K2C1RearSight) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.K2C1RearSight) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("K2C1RearSight").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        ScorpionRearSight = new AttachmentBuilder<Weapon>()
        		.withCategory(AttachmentCategory.SCOPE)
        		.withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.ScorpionRearSight(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.ScorpionRearSight) {
                        GL11.glTranslatef(-0.6F, -0.7F, 0.65F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ScorpionRearSight) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ScorpionRearSight) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("ScorpionRearSight").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        ScorpionFrontSight = new AttachmentBuilder<Weapon>()
        		.withCategory(AttachmentCategory.FRONTSIGHT)
        		.withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.ScorpionFrontSight(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.ScorpionFrontSight) {
                        GL11.glTranslatef(-0.6F, -0.7F, 0.65F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ScorpionFrontSight) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ScorpionFrontSight) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("ScorpionFrontSight").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        MP7IronSights = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.MP7RearSights(), "MP7IronSights.png")
                .withModel(new com.paneedah.mwc.models.MP7FrontSights(), "MP7IronSights.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.MP7RearSights) {
                        GL11.glTranslatef(-0.6F, -0F, 0.95F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                })
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MP7RearSights) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0F, 0F, 0F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MP7RearSights) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0F, 0F, 0F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MP7IronSights")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        MP7IronSightsStanding = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.MP7RearSightFlipped(), "MP7IronSights.png")
                .withModel(new com.paneedah.mwc.models.MP7FrontSightFlipped(), "MP7IronSights.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.MP7RearSightFlipped) {
                    	GL11.glTranslatef(-0.6F, 0.4F, 0.95F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                })
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MP7RearSightFlipped) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0F, 0F, 0F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MP7RearSightFlipped) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0F, 0F, 0F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MP7IronSightsStanding")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        LeupoldScope = new ItemScope.Builder()
        		.withOpticalZoom()
        		.withZoomRange(0.22f, 0.06f)
        		.withViewfinderPositioning((p, s) -> {
                    GL11.glScalef(2.3f, 2.3f, 2.3f);
                    GL11.glTranslatef(-0.085f, 0.33f, 1.75f);
                })
        		.withCategory(AttachmentCategory.SCOPE)
        		.withCreativeTab(ModernWarfareMod.AttachmentsTab)
        		.withRequiredAttachments(Attachments.VeprDustCover, Attachments.AK200DustCover, Attachments2.PP19VityazSNDC, Attachments2.B33DustCover, Attachments.AK15DustCover, Attachments.Placeholder,
                        Attachments.MIMP5TRRail, Attachments.MIMP5MRail, Attachments.ShotgunRail, Attachments.Kar98Krail, Attachments.M60Rail,
                        Attachments.P90Placeholder, Attachments.AUGA2handguard, Attachments.AUGA3handguard, Attachments.M4Receiver,
                        Attachments.VLTORReceiver, Attachments.AR57Receiver, Attachments.EF88Handguard,
                        Attachments.KrissVectorReceiver, Attachments.KrissVectorReceiverBlack, Attachments.Vector556Handguard, Attachments.Origin12Grip, Attachments.HKS20Grip,
                        Attachments.Beowulf50CalReceiver, Attachments.HK417Receiver, Attachments.HK417ReceiverTan, Attachments.HK416Receiver,
                        Attachments.M110Receiver, Attachments.Z10Receiver)
        		.withCrosshair("LP")
                .withModel(new com.paneedah.mwc.models.Leupold(), "leupold.png")
                .withModel(new com.paneedah.mwc.models.JPUreticle(), "black.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Leupold) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else if (model instanceof com.paneedah.mwc.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Leupold) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.paneedah.mwc.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Leupold) {
                    	GL11.glTranslatef(-0.6F, -0.3F, 0.9F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.45F, 0.45F, 0.45f);
                    } else if (model instanceof com.paneedah.mwc.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Leupold) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Leupold")
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        PSO1 = new ItemScope.Builder()
        		.withSniperReticle(Reticles.RETICLE_PSO1)
        		.withOpticalZoom()
        		.withZoomRange(0.22f, 0.06f)
                .withViewfinderPositioning((p, s) -> {
                    GL11.glScalef(1.15f, 1.15f, 1.1f);
                    GL11.glTranslatef(-0.299f, 0.215f, 1.15f);
                }).withCategory(AttachmentCategory.SCOPE).withCreativeTab(ModernWarfareMod.AttachmentsTab).withCrosshair("LP")
                .withModel(new com.paneedah.mwc.models.PSO1(), "dsr1.png")
                .withModel(new com.paneedah.mwc.models.PSO12(), "gun.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 4), 
                    	new CraftingEntry(MWCItems.steelIngot, 5))
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.PSO1) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else if (model instanceof com.paneedah.mwc.models.PSO1reticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.paneedah.mwc.models.PSO12) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.PSO1) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.paneedah.mwc.models.PSO1reticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.paneedah.mwc.models.PSO12) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.PSO1) {
                        GL11.glTranslatef(-0.6F, -0.3F, 0.7F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    } else if (model instanceof com.paneedah.mwc.models.PSO1reticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.paneedah.mwc.models.PSO12) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.PSO1) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.PSO1reticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.paneedah.mwc.models.PSO12) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("PSO1")
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
    

        NSPU = new ItemScope.Builder()
                .withSniperReticle(Reticles.RETICLE_NSPU)
        		.withOpticalZoom()
                        .withNightVision()
        		.withZoomRange(0.22f, 0.06f)
                .withViewfinderPositioning((p, s) -> {
                    GL11.glScalef(1.15f, 1.15f, 1.1f);
                    GL11.glTranslatef(-0.299f, 0.215f, 1.15f);
                }).withCategory(AttachmentCategory.SCOPE).withCreativeTab(ModernWarfareMod.AttachmentsTab).withCrosshair("LP")
                .withModel(new com.paneedah.mwc.models.NSPU(), "vssm.png")
                .withModel(new com.paneedah.mwc.models.PSO12(), "gun.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 4), 
                    	new CraftingEntry(MWCItems.steelIngot, 5))
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.NSPU) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else if (model instanceof com.paneedah.mwc.models.PSO1reticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.paneedah.mwc.models.PSO12) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.NSPU) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.paneedah.mwc.models.PSO1reticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.paneedah.mwc.models.PSO12) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.NSPU) {
                        GL11.glTranslatef(-0.6F, -0.3F, 0.7F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    } else if (model instanceof com.paneedah.mwc.models.PSO1reticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.paneedah.mwc.models.PSO12) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.NSPU) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.PSO1reticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.paneedah.mwc.models.PSO12) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("NSPU")
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        PKAA = new ItemScope.Builder()
          .withHolographicReticles(Reticles.REFLEX)
        .withReticlePositioning((model, itemStack) -> {
        	GlStateManager.translate(-0.299, 0.215,  2.15);
       		GlStateManager.scale(1, 1, 1);
                }).withCategory(AttachmentCategory.SCOPE).withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.PKAA(), "dsr1.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 4), 
                    	new CraftingEntry(MWCItems.steelIngot, 5))
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.PKAA) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.PKAA) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }

                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.PKAA) {
                        GL11.glTranslatef(-0.6F, -0.3F, 0.7F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.PKAA) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })
                .withName("PKAA")
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);        
    
        OKP7 = new ItemScope.Builder()
        		.withHolographicReticles(Reticles.OKP)
        		.withRadialCut(0.1f)
        		.withReticlePositioning((model, itemStack) -> {
        			GlStateManager.translate(0.23, -4.4, -0.2);
        			GlStateManager.scale(2.05, 2.05, 2.05);
        		})
        		.withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.OKP7(), "okp7.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3), 
                    	new CraftingEntry(MWCItems.steelIngot, 3))
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.OKP7) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.2F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.paneedah.mwc.models.OKP7reticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.OKP7) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.3F, 0.3F, 0.3F);
                    } else if (model instanceof com.paneedah.mwc.models.OKP7reticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.OKP7) {
                        GL11.glTranslatef(-0.6F, -0.1F, 1.15F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    } else if (model instanceof com.paneedah.mwc.models.OKP7reticle) {
                        GL11.glScaled(0F, 0F, 0F);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.OKP7) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.OKP7reticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("okp7").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        FMG9Sight = new ItemScope.Builder()
        		.withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withRenderablePart()
                .withModel(new com.paneedah.mwc.models.FMG9Carryhandle(), "fmg9.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2), 
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.FMG9Carryhandle) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.2F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.FMG9Carryhandle) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.3F, 0.3F, 0.3F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.FMG9Carryhandle) {
                        GL11.glTranslatef(-0.6F, 1.1F, -0.7F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.FMG9Carryhandle) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("fmg9carryhandle").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Reflex = new ItemScope.Builder()
        		.withHolographicReticles(Reticles.REFLEX)
        		.withReticlePositioning((model, itemStack) -> {
        			GlStateManager.translate(-0.08, -3, 0);
        			GlStateManager.scale(1.4, 1.4, 1.4);
        		})
        		.withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withRenderablePart()
                .withModel(new com.paneedah.mwc.models.Reflex(), "Reflex.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2), 
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withRequiredAttachments(Attachments.VeprDustCover, Attachments.AK200DustCover, Attachments2.PP19VityazSNDC, Attachments2.B33DustCover, Attachments.AK15DustCover, Attachments.Placeholder,
                        Attachments.MIMP5TRRail, Attachments.MIMP5MRail, Attachments.ShotgunRail, Attachments.Kar98Krail,
                        Attachments.M60Rail, Attachments.P90Placeholder, Attachments.AUGA2handguard, Attachments.AUGA3handguard,
                        Attachments.M4Receiver, Attachments.VLTORReceiver, Attachments.AR57Receiver, Attachments.EF88Handguard, Attachments.KrissVectorReceiver, Attachments.KrissVectorReceiverBlack,
                        Attachments.Vector556Handguard, Attachments.M1CarbineScoutHandguard, Attachments.Origin12Grip, Attachments.HKS20Grip,
                        Attachments.HoneyBadgerKnightsReceiver, Attachments.HoneyBadgerKnightsReceiverBlack, Attachments.M14TriRailCover,
                        Attachments.M14TriRailCover, Attachments.Mk14TanBody, Attachments.Mk14SnowBody, Attachments.Mk14BlackBody, Attachments.SSG08Chassis, Attachments.SA58DustCover,
                        Attachments.M16A1ScopeMount, Attachments.G2ContenderBarrelLong, Attachments.S710Receiver,
                        Attachments.Beowulf50CalReceiver, Attachments.FamasF1ScopeMount,
                        Attachments.HK417Receiver, Attachments.HK417ReceiverTan, Attachments.AK12DustCover, Attachments.AK12BDustCover, Attachments.CZ805BrenReceiver, Attachments.HK416Receiver,
                        Attachments.M110Receiver, Attachments.Remington700Chassis, Attachments.Remington700APACChassis,
                        Attachments.Remington700MDTXRSChassis, Attachments.DSR1Handguard, Attachments.DSR1HandguardRailed, Attachments.Z10Receiver, Attachments.MAC21Stock,
                        Attachments.VSSMDustCover, Attachments.SR3MPDustCover, Attachments.Dragunov98DustCover)
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Reflex) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.2F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Reflex) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.3F, 0.3F, 0.3F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Reflex) {
                        GL11.glTranslatef(-0.6F, -0.1F, 1.15F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Reflex) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Reflex").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        BijiaReflex = new ItemScope.Builder()
        		.withHolographicReticles(Reticles.BIJIA)
        		.withReticlePositioning((model, itemStack) -> {
        			GlStateManager.translate(-0.08, -2.95, 0.1);
        			GlStateManager.scale(1.4, 1.4, 1.4);
        		})
        		.withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withRenderablePart()
                .withModel(new com.paneedah.mwc.models.BijiaReflex(), "bijiareflex.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2), 
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withRequiredAttachments(Attachments.VeprDustCover, Attachments.AK200DustCover, Attachments2.PP19VityazSNDC, Attachments2.B33DustCover, Attachments.AK15DustCover, Attachments.Placeholder,
                        Attachments.MIMP5TRRail, Attachments.MIMP5MRail, Attachments.ShotgunRail, Attachments.Kar98Krail,
                        Attachments.M60Rail, Attachments.P90Placeholder, Attachments.AUGA2handguard, Attachments.AUGA3handguard,
                        Attachments.M4Receiver, Attachments.VLTORReceiver, Attachments.AR57Receiver, Attachments.EF88Handguard, Attachments.KrissVectorReceiver, Attachments.KrissVectorReceiverBlack,
                        Attachments.Vector556Handguard, Attachments.M1CarbineScoutHandguard, Attachments.Origin12Grip, Attachments.HKS20Grip,
                        Attachments.HoneyBadgerKnightsReceiver, Attachments.HoneyBadgerKnightsReceiverBlack, Attachments.M14TriRailCover,
                        Attachments.M14TriRailCover, Attachments.Mk14TanBody, Attachments.Mk14SnowBody, Attachments.Mk14BlackBody, Attachments.SSG08Chassis, Attachments.SA58DustCover,
                        Attachments.M16A1ScopeMount, Attachments.G2ContenderBarrelLong, Attachments.S710Receiver,
                        Attachments.Beowulf50CalReceiver, Attachments.FamasF1ScopeMount,
                        Attachments.HK417Receiver, Attachments.HK417ReceiverTan, Attachments.AK12DustCover, Attachments.AK12BDustCover, Attachments.CZ805BrenReceiver, Attachments.HK416Receiver,
                        Attachments.M110Receiver, Attachments.Remington700Chassis, Attachments.Remington700APACChassis,
                        Attachments.Remington700MDTXRSChassis, Attachments.DSR1Handguard, Attachments.DSR1HandguardRailed, Attachments.Z10Receiver, Attachments.MAC21Stock,
                        Attachments.VSSMDustCover, Attachments.SR3MPDustCover, Attachments.Dragunov98DustCover)
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.BijiaReflex) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.2F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.BijiaReflex) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.3F, 0.3F, 0.3F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.BijiaReflex) {
                        GL11.glTranslatef(-0.6F, -0.1F, 0.95F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.BijiaReflex) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("BijiaReflex").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        MicroReflex = new ItemScope.Builder()
        		.withHolographicReticles(Reticles.MICROREFLEX)
        		.withReticlePositioning((model, itemStack) -> {
        			GlStateManager.translate(0.13, -1.62, -0.1);
        			GlStateManager.scale(1.6, 1.6, 1.6);
        		})
        		.withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withRenderablePart()
                .withModel(new com.paneedah.mwc.models.MicroReflexSight(), "gun.png")
                .withModel(new com.paneedah.mwc.models.SightMount(), "gun.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2), 
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withPostRender(new LaserBeamRenderer((p, s) -> {
                    GL11.glTranslatef(-0F, 2.3F, 1.8F);
                }))
                .withRequiredAttachments(Attachments.VeprDustCover, Attachments.AK200DustCover, Attachments2.PP19VityazSNDC, Attachments2.B33DustCover, Attachments.AK15DustCover, Attachments.Placeholder,
                        Attachments.MIMP5TRRail, Attachments.MIMP5MRail, Attachments.ShotgunRail, Attachments.Kar98Krail,
                        Attachments.M60Rail, Attachments.P90Placeholder, Attachments.AUGA2handguard, Attachments.AUGA3handguard,
                        Attachments.M4Receiver, Attachments.VLTORReceiver, Attachments.AR57Receiver, Attachments.EF88Handguard, Attachments.KrissVectorReceiver, Attachments.KrissVectorReceiverBlack,
                        Attachments.Vector556Handguard, Attachments.M1CarbineScoutHandguard, Attachments.Origin12Grip, Attachments.HKS20Grip,
                        Attachments.HoneyBadgerKnightsReceiver, Attachments.HoneyBadgerKnightsReceiverBlack, Attachments.M14TriRailCover,
                        Attachments.M14TriRailCover, Attachments.Mk14TanBody, Attachments.Mk14SnowBody, Attachments.Mk14BlackBody, Attachments.SSG08Chassis, Attachments.SA58DustCover,
                        Attachments.M16A1ScopeMount, Attachments.G2ContenderBarrelLong, Attachments.S710Receiver,
                        Attachments.Beowulf50CalReceiver, Attachments.FamasF1ScopeMount,
                        Attachments.HK417Receiver, Attachments.HK417ReceiverTan, Attachments.AK12DustCover, Attachments.AK12BDustCover, Attachments.CZ805BrenReceiver, Attachments.HK416Receiver,
                        Attachments.M110Receiver, Attachments.Remington700Chassis, Attachments.Remington700APACChassis,
                        Attachments.Remington700MDTXRSChassis, Attachments.DSR1Handguard, Attachments.DSR1HandguardRailed, Attachments.Z10Receiver, Attachments.MAC21Stock,
                        Attachments.VSSMDustCover, Attachments.SR3MPDustCover, Attachments.Dragunov98DustCover)
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MicroReflexSight) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.2F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MicroReflexSight) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.3F, 0.3F, 0.3F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MicroReflexSight) {
                        GL11.glTranslatef(-0.6F, -1.9F, 0.7F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MicroReflexSight) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MicroReflex").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        ACOG = new ItemScope.Builder()
        		.withSniperReticle(Reticles.RETICLE_ACOG)
        		.withOpticalZoom()
        		.withZoomRange(0.22f, 0.1f)
                .withViewfinderPositioning((p, s) -> {
                    GL11.glScalef(1.52f, 1.52f, 1.52f);
                    GL11.glTranslatef(0.038f, 0.485f, 0.37f);
                })
                .withRenderablePart()
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.ACOG(), "Acog.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 4), 
                    	new CraftingEntry(MWCItems.steelIngot, 3))
                .withRequiredAttachments(Attachments.VeprDustCover, Attachments.AK200DustCover, Attachments2.PP19VityazSNDC, Attachments2.B33DustCover, Attachments.AK15DustCover, Attachments.Placeholder,
                        Attachments.MIMP5TRRail, Attachments.MIMP5MRail, Attachments.ShotgunRail, Attachments.Kar98Krail,
                        Attachments.M60Rail, Attachments.P90Placeholder, Attachments.AUGA2handguard, Attachments.AUGA3handguard,
                        Attachments.M4Receiver, Attachments.VLTORReceiver, Attachments.AR57Receiver, Attachments.EF88Handguard, Attachments.KrissVectorReceiver, Attachments.KrissVectorReceiverBlack,
                        Attachments.Vector556Handguard, Attachments.M1CarbineScoutHandguard, Attachments.Origin12Grip, Attachments.HKS20Grip,
                        Attachments.HoneyBadgerKnightsReceiver, Attachments.HoneyBadgerKnightsReceiverBlack, Attachments.M14TriRailCover,
                        Attachments.M14TriRailCover, Attachments.Mk14TanBody, Attachments.Mk14SnowBody, Attachments.Mk14BlackBody, Attachments.SSG08Chassis, Attachments.SA58DustCover,
                        Attachments.M16A1ScopeMount, Attachments.G2ContenderBarrelLong, Attachments.S710Receiver,
                        Attachments.Beowulf50CalReceiver, Attachments.FamasF1ScopeMount,
                        Attachments.HK417Receiver, Attachments.HK417ReceiverTan, Attachments.AK12DustCover, Attachments.AK12BDustCover, Attachments.CZ805BrenReceiver, Attachments.HK416Receiver,
                        Attachments.M110Receiver, Attachments.Remington700Chassis, Attachments.Remington700APACChassis,
                        Attachments.Remington700MDTXRSChassis, Attachments.DSR1Handguard, Attachments.DSR1HandguardRailed, Attachments.Z10Receiver, Attachments.MAC21Stock,
                        Attachments.VSSMDustCover, Attachments.SR3MPDustCover, Attachments.Dragunov98DustCover)
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ACOG) {
                        GL11.glTranslatef(0.1F, -0.8F, 1.2F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else if (model instanceof com.paneedah.mwc.models.AcogReticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.paneedah.mwc.models.AcogScope2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ACOG) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.paneedah.mwc.models.AcogReticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.paneedah.mwc.models.AcogScope2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ACOG) {
                        GL11.glTranslatef(-0.6F, -0.7F, 0.9F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    } else if (model instanceof com.paneedah.mwc.models.AcogReticle) {
                        GL11.glScaled(0F, 0F, 0F);

                    } else if (model instanceof com.paneedah.mwc.models.AcogScope2) {
                        GL11.glScaled(0.55F, 0.55F, 0.55F);
                        GL11.glTranslatef(1F, 0F, -1F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ACOG) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.AcogReticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.paneedah.mwc.models.AcogScope2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Acog")
                .withRotationPoint(-0.12079999459981924, -1.4240000168085098, -2.392400065904859)
                
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Specter = new ItemScope.Builder()
        		.withSniperReticle(Reticles.RETICLE_SPECTRE)
        		.withOpticalZoom()
        		.withZoomRange(0.22f, 0.1f)
                .withViewfinderPositioning((p, s) -> {
                    GL11.glScalef(3.7f, 3.7f, 3.7f);
                    GL11.glTranslatef(-0.075f, 0.38f, 0.42f);
                })
                .withRenderablePart()
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.SpecterSight(), "SpecterSight.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 4), 
                    	new CraftingEntry(MWCItems.steelIngot, 3))
                .withRequiredAttachments(Attachments.VeprDustCover, Attachments.AK200DustCover, Attachments2.PP19VityazSNDC, Attachments2.B33DustCover, Attachments.AK15DustCover, Attachments.Placeholder,
                        Attachments.MIMP5TRRail, Attachments.MIMP5MRail, Attachments.ShotgunRail, Attachments.Kar98Krail,
                        Attachments.M60Rail, Attachments.P90Placeholder, Attachments.AUGA2handguard, Attachments.AUGA3handguard,
                        Attachments.M4Receiver, Attachments.VLTORReceiver, Attachments.AR57Receiver, Attachments.EF88Handguard, Attachments.KrissVectorReceiver, Attachments.KrissVectorReceiverBlack,
                        Attachments.Vector556Handguard, Attachments.M1CarbineScoutHandguard, Attachments.Origin12Grip, Attachments.HKS20Grip,
                        Attachments.HoneyBadgerKnightsReceiver, Attachments.HoneyBadgerKnightsReceiverBlack, Attachments.M14TriRailCover,
                        Attachments.M14TriRailCover, Attachments.Mk14TanBody, Attachments.Mk14SnowBody, Attachments.Mk14BlackBody, Attachments.SSG08Chassis, Attachments.SA58DustCover,
                        Attachments.M16A1ScopeMount, Attachments.G2ContenderBarrelLong, Attachments.S710Receiver,
                        Attachments.Beowulf50CalReceiver, Attachments.FamasF1ScopeMount,
                        Attachments.HK417Receiver, Attachments.HK417ReceiverTan, Attachments.AK12DustCover, Attachments.AK12BDustCover, Attachments.CZ805BrenReceiver, Attachments.HK416Receiver,
                        Attachments.M110Receiver, Attachments.Remington700Chassis, Attachments.Remington700APACChassis,
                        Attachments.Remington700MDTXRSChassis, Attachments.DSR1Handguard, Attachments.DSR1HandguardRailed, Attachments.Z10Receiver, Attachments.MAC21Stock,
                        Attachments.VSSMDustCover, Attachments.SR3MPDustCover, Attachments.Dragunov98DustCover)
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SpecterSight) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.35F, 0.35F, 0.35F);
                    } else if (model instanceof com.paneedah.mwc.models.Acog2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SpecterSight) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.25F, 0.25F, 0.25F);
                    } else if (model instanceof com.paneedah.mwc.models.Acog2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SpecterSight) {
                        GL11.glTranslatef(-0.6F, -0.1F, 0.95F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6f);
                    } else if (model instanceof com.paneedah.mwc.models.Acog2) {
                        GL11.glScaled(0F, 0F, 0F);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SpecterSight) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.Acog2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Specter").withTextureName("Dummy.png")
                .withRotationPoint(-0.12079999459981924, -1.4240000168085098, -2.392400065904859)
                .build(ModernWarfareMod.MOD_CONTEXT);

        HKV = new ItemScope.Builder()
        		.withSniperReticle(Reticles.RETICLE_HKV)
        		.withOpticalZoom()
        		.withZoomRange(0.22f, 0.1f)
                .withViewfinderPositioning((p, s) -> {
                    GL11.glScalef(3.7f, 3.7f, 3.7f);
                    GL11.glTranslatef(-0.075f, 0.38f, 0.42f);
                })
                .withRenderablePart()
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 4), 
                    	new CraftingEntry(MWCItems.steelIngot, 3))
                .withRequiredAttachments(Attachments.G36CH, Attachments.G36CHRAL)
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SpecterSight) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.paneedah.mwc.models.Acog2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SpecterSight) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.paneedah.mwc.models.Acog2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SpecterSight) {
                        GL11.glTranslatef(-0.6F, -0.1F, 0.95F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glScaled(0F, 0F, 0f);
                    } else if (model instanceof com.paneedah.mwc.models.Acog2) {
                        GL11.glScaled(0F, 0F, 0F);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SpecterSight) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.paneedah.mwc.models.Acog2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("HKV").withTextureName("Dummy.png")
                .withRotationPoint(-0.12079999459981924, -1.4240000168085098, -2.392400065904859)
                .build(ModernWarfareMod.MOD_CONTEXT);

        Holographic = new ItemScope.Builder()
        		.withHolographicReticles(Reticles.HOLO_ONE)
        		.withReticlePositioning((model, itemStack) -> {
        			GlStateManager.translate(-0.1, -2.7, 0.3);
        			GlStateManager.scale(1.4, 1.4, 1.4);
        		})
        		.withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withRenderablePart()
                .withModel(new com.paneedah.mwc.models.Holographic2(), "eotechhybrid.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2), 
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withRequiredAttachments(Attachments.VeprDustCover, Attachments.AK200DustCover, Attachments2.PP19VityazSNDC, Attachments2.B33DustCover, Attachments.AK15DustCover, Attachments.Placeholder,
                        Attachments.MIMP5TRRail, Attachments.MIMP5MRail, Attachments.ShotgunRail, Attachments.Kar98Krail,
                        Attachments.M60Rail, Attachments.P90Placeholder, Attachments.AUGA2handguard, Attachments.AUGA3handguard,
                        Attachments.M4Receiver, Attachments.VLTORReceiver, Attachments.AR57Receiver, Attachments.EF88Handguard, Attachments.KrissVectorReceiver, Attachments.KrissVectorReceiverBlack,
                        Attachments.Vector556Handguard, Attachments.M1CarbineScoutHandguard, Attachments.Origin12Grip, Attachments.HKS20Grip,
                        Attachments.HoneyBadgerKnightsReceiver, Attachments.HoneyBadgerKnightsReceiverBlack, Attachments.M14TriRailCover,
                        Attachments.M14TriRailCover, Attachments.Mk14TanBody, Attachments.Mk14SnowBody, Attachments.Mk14BlackBody, Attachments.SSG08Chassis, Attachments.SA58DustCover,
                        Attachments.M16A1ScopeMount, Attachments.G2ContenderBarrelLong, Attachments.S710Receiver,
                        Attachments.Beowulf50CalReceiver, Attachments.FamasF1ScopeMount,
                        Attachments.HK417Receiver, Attachments.HK417ReceiverTan, Attachments.AK12DustCover, Attachments.AK12BDustCover, Attachments.CZ805BrenReceiver, Attachments.HK416Receiver,
                        Attachments.M110Receiver, Attachments.Remington700Chassis, Attachments.Remington700APACChassis,
                        Attachments.Remington700MDTXRSChassis, Attachments.DSR1Handguard, Attachments.DSR1HandguardRailed, Attachments.Z10Receiver, Attachments.MAC21Stock,
                        Attachments.VSSMDustCover, Attachments.SR3MPDustCover, Attachments.Dragunov98DustCover)
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Holographic2) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.2F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    } else if (model instanceof com.paneedah.mwc.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Holographic2) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.paneedah.mwc.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Holographic2) {
                        GL11.glTranslatef(-0.6F, -0.1F, 0.7F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    } else if (model instanceof com.paneedah.mwc.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Holographic2) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Holographic2").withTextureName("Dummy.png")
                .withRotationPoint(-0.12079999459981924, -1.4240000168085098, -2.392400065904859)
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        HolographicAlt = new ItemScope.Builder()
        		.withHolographicReticles(Reticles.HOLO_ONE)
        		.withReticlePositioning((model, itemStack) -> {
        			GlStateManager.translate(-0.1, -2.7, 0.3);
        			GlStateManager.scale(1.4, 1.4, 1.4);
        		})
        		.withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withRenderablePart()
                .withModel(new com.paneedah.mwc.models.Holographic(), "holographic.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2), 
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withRequiredAttachments(Attachments.VeprDustCover, Attachments.AK200DustCover, Attachments2.PP19VityazSNDC, Attachments2.B33DustCover, Attachments.AK15DustCover, Attachments.Placeholder,
                        Attachments.MIMP5TRRail, Attachments.MIMP5MRail, Attachments.ShotgunRail, Attachments.Kar98Krail,
                        Attachments.M60Rail, Attachments.P90Placeholder, Attachments.AUGA2handguard, Attachments.AUGA3handguard,
                        Attachments.M4Receiver, Attachments.VLTORReceiver, Attachments.AR57Receiver, Attachments.EF88Handguard, Attachments.KrissVectorReceiver, Attachments.KrissVectorReceiverBlack,
                        Attachments.Vector556Handguard, Attachments.M1CarbineScoutHandguard, Attachments.Origin12Grip, Attachments.HKS20Grip,
                        Attachments.HoneyBadgerKnightsReceiver, Attachments.HoneyBadgerKnightsReceiverBlack, Attachments.M14TriRailCover,
                        Attachments.M14TriRailCover, Attachments.Mk14TanBody, Attachments.Mk14SnowBody, Attachments.Mk14BlackBody, Attachments.SSG08Chassis, Attachments.SA58DustCover,
                        Attachments.M16A1ScopeMount, Attachments.G2ContenderBarrelLong, Attachments.S710Receiver,
                        Attachments.Beowulf50CalReceiver, Attachments.FamasF1ScopeMount,
                        Attachments.HK417Receiver, Attachments.HK417ReceiverTan, Attachments.AK12DustCover, Attachments.AK12BDustCover, Attachments.CZ805BrenReceiver, Attachments.HK416Receiver,
                        Attachments.M110Receiver, Attachments.Remington700Chassis, Attachments.Remington700APACChassis,
                        Attachments.Remington700MDTXRSChassis, Attachments.DSR1Handguard, Attachments.DSR1HandguardRailed, Attachments.Z10Receiver, Attachments.MAC21Stock,
                        Attachments.VSSMDustCover, Attachments.SR3MPDustCover, Attachments.Dragunov98DustCover)
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Holographic) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.2F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    } else if (model instanceof com.paneedah.mwc.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Holographic) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.paneedah.mwc.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Holographic) {
                        GL11.glTranslatef(-0.6F, -0.1F, 0.4F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else if (model instanceof com.paneedah.mwc.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Holographic) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("HolographicAlt").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        PK120 = new ItemScope.Builder()
        		.withHolographicReticles(Reticles.PK120)
        		.withReticlePositioning((model, itemStack) -> {
        			GlStateManager.translate(-0.1, -2.7, 0.3);
        			GlStateManager.scale(1.4, 1.4, 1.4);
        		})
        		.withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withRenderablePart()
                .withModel(new com.paneedah.mwc.models.PK120(), "PK120.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2), 
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withRequiredAttachments(Attachments.VeprDustCover, Attachments.AK200DustCover, Attachments2.PP19VityazSNDC, Attachments2.B33DustCover, Attachments.AK15DustCover, Attachments.Placeholder,
                        Attachments.MIMP5TRRail, Attachments.MIMP5MRail, Attachments.ShotgunRail, Attachments.Kar98Krail,
                        Attachments.M60Rail, Attachments.P90Placeholder, Attachments.AUGA2handguard, Attachments.AUGA3handguard,
                        Attachments.M4Receiver, Attachments.VLTORReceiver, Attachments.AR57Receiver, Attachments.EF88Handguard, Attachments.KrissVectorReceiver, Attachments.KrissVectorReceiverBlack,
                        Attachments.Vector556Handguard, Attachments.M1CarbineScoutHandguard, Attachments.Origin12Grip, Attachments.HKS20Grip,
                        Attachments.HoneyBadgerKnightsReceiver, Attachments.HoneyBadgerKnightsReceiverBlack, Attachments.M14TriRailCover,
                        Attachments.M14TriRailCover, Attachments.Mk14TanBody, Attachments.Mk14SnowBody, Attachments.Mk14BlackBody, Attachments.SSG08Chassis, Attachments.SA58DustCover,
                        Attachments.M16A1ScopeMount, Attachments.G2ContenderBarrelLong, Attachments.S710Receiver,
                        Attachments.Beowulf50CalReceiver, Attachments.FamasF1ScopeMount,
                        Attachments.HK417Receiver, Attachments.HK417ReceiverTan, Attachments.AK12DustCover, Attachments.AK12BDustCover, Attachments.CZ805BrenReceiver, Attachments.HK416Receiver,
                        Attachments.M110Receiver, Attachments.Remington700Chassis, Attachments.Remington700APACChassis,
                        Attachments.Remington700MDTXRSChassis, Attachments.DSR1Handguard, Attachments.DSR1HandguardRailed, Attachments.Z10Receiver, Attachments.MAC21Stock,
                        Attachments.VSSMDustCover, Attachments.SR3MPDustCover, Attachments.Dragunov98DustCover)
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.PK120) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.2F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    } else if (model instanceof com.paneedah.mwc.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.PK120) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.paneedah.mwc.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.PK120) {
                        GL11.glTranslatef(-0.6F, -0.1F, 0.7F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    } else if (model instanceof com.paneedah.mwc.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.PK120) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("PK120").withTextureName("Dummy.png")
                .withRotationPoint(-0.12079999459981924, -1.4240000168085098, -2.392400065904859)
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        EotechHybrid2 = new ItemScope.Builder()
        		.withSniperReticle(Reticles.RETICLE_HOLO)
        		.withOpticalZoom()
        		.withZoomRange(0.22f, 0.1f)
                .withViewfinderPositioning((p, s) -> {
                	GL11.glScalef(1.41f, 1.41f, 1.35f);
                    GL11.glTranslatef(-0.204f, 0.28f, 1.35f);
                })
                .withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withRenderablePart()
                .withModel(new com.paneedah.mwc.models.EotechHybrid2(), "eotechhybrid.png")
                .withModel(new com.paneedah.mwc.models.EotechScopeRing(), "gun.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3), 
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withRequiredAttachments(Attachments.VeprDustCover, Attachments.AK200DustCover, Attachments2.PP19VityazSNDC, Attachments2.B33DustCover, Attachments.AK15DustCover, Attachments.Placeholder,
                        Attachments.MIMP5TRRail, Attachments.MIMP5MRail, Attachments.ShotgunRail, Attachments.Kar98Krail,
                        Attachments.M60Rail, Attachments.P90Placeholder, Attachments.AUGA2handguard, Attachments.AUGA3handguard,
                        Attachments.M4Receiver, Attachments.VLTORReceiver, Attachments.AR57Receiver, Attachments.EF88Handguard, Attachments.KrissVectorReceiver, Attachments.KrissVectorReceiverBlack,
                        Attachments.Vector556Handguard, Attachments.M1CarbineScoutHandguard, Attachments.Origin12Grip, Attachments.HKS20Grip,
                        Attachments.HoneyBadgerKnightsReceiver, Attachments.HoneyBadgerKnightsReceiverBlack, Attachments.M14TriRailCover,
                        Attachments.M14TriRailCover, Attachments.Mk14TanBody, Attachments.Mk14SnowBody, Attachments.Mk14BlackBody, Attachments.SSG08Chassis, Attachments.SA58DustCover,
                        Attachments.M16A1ScopeMount, Attachments.G2ContenderBarrelLong, Attachments.S710Receiver,
                        Attachments.Beowulf50CalReceiver, Attachments.FamasF1ScopeMount,
                        Attachments.HK417Receiver, Attachments.HK417ReceiverTan, Attachments.AK12DustCover, Attachments.AK12BDustCover, Attachments.CZ805BrenReceiver, Attachments.HK416Receiver,
                        Attachments.M110Receiver, Attachments.Remington700Chassis, Attachments.Remington700APACChassis,
                        Attachments.Remington700MDTXRSChassis, Attachments.DSR1Handguard, Attachments.DSR1HandguardRailed, Attachments.Z10Receiver, Attachments.MAC21Stock,
                        Attachments.VSSMDustCover, Attachments.SR3MPDustCover, Attachments.Dragunov98DustCover)
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.EotechHybrid2) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.2F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    } else if (model instanceof com.paneedah.mwc.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.paneedah.mwc.models.EotechScopeRing) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.EotechHybrid2) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.paneedah.mwc.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.paneedah.mwc.models.EotechScopeRing) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.EotechHybrid2) {
                        GL11.glTranslatef(-0.6F, -0.1F, 1F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else if (model instanceof com.paneedah.mwc.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.paneedah.mwc.models.EotechScopeRing) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.EotechHybrid2) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.paneedah.mwc.models.EotechScopeRing) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("EotechHybrid2").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        VortexRedux = new ItemScope.Builder()
        		.withHolographicReticles(Reticles.VORTEX)
        		.withReticlePositioning((model, itemStack) -> {
        			GlStateManager.translate(0.45, -3.15, 0.5);
        			GlStateManager.scale(1.73, 1.73, 1.4);
        		})
        		.withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withRenderablePart()
                .withModel(new com.paneedah.mwc.models.VortexSight(), "vortexsight.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2), 
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withRequiredAttachments(Attachments.VeprDustCover, Attachments.AK200DustCover, Attachments2.PP19VityazSNDC, Attachments2.B33DustCover, Attachments.AK15DustCover, Attachments.Placeholder,
                        Attachments.MIMP5TRRail, Attachments.MIMP5MRail, Attachments.ShotgunRail, Attachments.Kar98Krail,
                        Attachments.M60Rail, Attachments.P90Placeholder, Attachments.AUGA2handguard, Attachments.AUGA3handguard,
                        Attachments.M4Receiver, Attachments.VLTORReceiver, Attachments.AR57Receiver, Attachments.EF88Handguard, Attachments.KrissVectorReceiver, Attachments.KrissVectorReceiverBlack,
                        Attachments.Vector556Handguard, Attachments.M1CarbineScoutHandguard, Attachments.Origin12Grip, Attachments.HKS20Grip,
                        Attachments.HoneyBadgerKnightsReceiver, Attachments.HoneyBadgerKnightsReceiverBlack, Attachments.M14TriRailCover,
                        Attachments.M14TriRailCover, Attachments.Mk14TanBody, Attachments.Mk14SnowBody, Attachments.Mk14BlackBody, Attachments.SSG08Chassis, Attachments.SA58DustCover,
                        Attachments.M16A1ScopeMount, Attachments.G2ContenderBarrelLong, Attachments.S710Receiver,
                        Attachments.Beowulf50CalReceiver, Attachments.FamasF1ScopeMount,
                        Attachments.HK417Receiver, Attachments.HK417ReceiverTan, Attachments.AK12DustCover, Attachments.AK12BDustCover, Attachments.CZ805BrenReceiver, Attachments.HK416Receiver,
                        Attachments.M110Receiver, Attachments.Remington700Chassis, Attachments.Remington700APACChassis,
                        Attachments.Remington700MDTXRSChassis, Attachments.DSR1Handguard, Attachments.DSR1HandguardRailed, Attachments.Z10Receiver, Attachments.MAC21Stock,
                        Attachments.VSSMDustCover, Attachments.SR3MPDustCover, Attachments.Dragunov98DustCover)
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.VortexSight) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.2F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    } else if (model instanceof com.paneedah.mwc.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.VortexSight) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.paneedah.mwc.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.VortexSight) {
                        GL11.glTranslatef(-0.6F, -0.8F, 1.6F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else if (model instanceof com.paneedah.mwc.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.VortexSight) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("VortexSight").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        MicroT1 = new ItemScope.Builder()
        		.withHolographicReticles(Reticles.REFLEX)
        		.withRadialCut(0.1f)
        		.withReticlePositioning((model, itemStack) -> {
        			GlStateManager.translate(0.3, -6, -0.2);
        			GlStateManager.scale(3.5, 3.5, 1.4);
        		})
        		.withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withRenderablePart()
                .withModel(new com.paneedah.mwc.models.MicroT1(), "gun.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2), 
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withRequiredAttachments(Attachments.VeprDustCover, Attachments.AK200DustCover, Attachments2.PP19VityazSNDC, Attachments2.B33DustCover, Attachments.AK15DustCover, Attachments.Placeholder,
                        Attachments.MIMP5TRRail, Attachments.MIMP5MRail, Attachments.ShotgunRail, Attachments.Kar98Krail,
                        Attachments.M60Rail, Attachments.P90Placeholder, Attachments.AUGA2handguard, Attachments.AUGA3handguard,
                        Attachments.M4Receiver, Attachments.VLTORReceiver, Attachments.AR57Receiver, Attachments.EF88Handguard, Attachments.KrissVectorReceiver, Attachments.KrissVectorReceiverBlack,
                        Attachments.Vector556Handguard, Attachments.M1CarbineScoutHandguard, Attachments.Origin12Grip, Attachments.HKS20Grip,
                        Attachments.HoneyBadgerKnightsReceiver, Attachments.HoneyBadgerKnightsReceiverBlack, Attachments.M14TriRailCover,
                        Attachments.M14TriRailCover, Attachments.Mk14TanBody, Attachments.Mk14SnowBody, Attachments.Mk14BlackBody, Attachments.SSG08Chassis, Attachments.SA58DustCover,
                        Attachments.M16A1ScopeMount, Attachments.G2ContenderBarrelLong, Attachments.S710Receiver,
                        Attachments.Beowulf50CalReceiver, Attachments.FamasF1ScopeMount,
                        Attachments.HK417Receiver, Attachments.HK417ReceiverTan, Attachments.AK12DustCover, Attachments.AK12BDustCover, Attachments.CZ805BrenReceiver, Attachments.HK416Receiver,
                        Attachments.M110Receiver, Attachments.Remington700Chassis, Attachments.Remington700APACChassis,
                        Attachments.Remington700MDTXRSChassis, Attachments.DSR1Handguard, Attachments.DSR1HandguardRailed, Attachments.Z10Receiver, Attachments.MAC21Stock,
                        Attachments.VSSMDustCover, Attachments.SR3MPDustCover, Attachments.Dragunov98DustCover)
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MicroT1) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.2F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MicroT1) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MicroT1) {
                        GL11.glTranslatef(-0.6F, -0.5F, 0.6F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.75F, 0.75F, 0.75f);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MicroT1) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MicroT1").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        AimpointCompM2 = new ItemScope.Builder()
        		.withHolographicReticles(Reticles.REFLEX)
        		.withRadialCut(0.1f)
        		.withReticlePositioning((model, itemStack) -> {
        			GlStateManager.translate(0.06, -3.8, -0.4);
        			GlStateManager.scale(1.8, 1.8, 1.4);
        		})
        		.withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withRenderablePart()
                .withModel(new com.paneedah.mwc.models.AimpointCompM2(), "AimpointCompM2.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2), 
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withRequiredAttachments(Attachments.VeprDustCover, Attachments.AK200DustCover, Attachments2.PP19VityazSNDC, Attachments2.B33DustCover, Attachments.AK15DustCover, Attachments.Placeholder,
                        Attachments.MIMP5TRRail, Attachments.MIMP5MRail, Attachments.ShotgunRail, Attachments.Kar98Krail,
                        Attachments.M60Rail, Attachments.P90Placeholder, Attachments.AUGA2handguard, Attachments.AUGA3handguard,
                        Attachments.M4Receiver, Attachments.VLTORReceiver, Attachments.AR57Receiver, Attachments.EF88Handguard, Attachments.KrissVectorReceiver, Attachments.KrissVectorReceiverBlack,
                        Attachments.Vector556Handguard, Attachments.M1CarbineScoutHandguard, Attachments.Origin12Grip, Attachments.HKS20Grip,
                        Attachments.HoneyBadgerKnightsReceiver, Attachments.HoneyBadgerKnightsReceiverBlack, Attachments.M14TriRailCover,
                        Attachments.M14TriRailCover, Attachments.Mk14TanBody, Attachments.Mk14SnowBody, Attachments.Mk14BlackBody, Attachments.SSG08Chassis, Attachments.SA58DustCover,
                        Attachments.M16A1ScopeMount, Attachments.G2ContenderBarrelLong, Attachments.S710Receiver,
                        Attachments.Beowulf50CalReceiver, Attachments.FamasF1ScopeMount,
                        Attachments.HK417Receiver, Attachments.HK417ReceiverTan, Attachments.AK12DustCover, Attachments.AK12BDustCover, Attachments.CZ805BrenReceiver, Attachments.HK416Receiver,
                        Attachments.M110Receiver, Attachments.Remington700Chassis, Attachments.Remington700APACChassis,
                        Attachments.Remington700MDTXRSChassis, Attachments.DSR1Handguard, Attachments.DSR1HandguardRailed, Attachments.Z10Receiver, Attachments.MAC21Stock,
                        Attachments.VSSMDustCover, Attachments.SR3MPDustCover, Attachments.Dragunov98DustCover)
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AimpointCompM2) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.2F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AimpointCompM2) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AimpointCompM2) {
                        GL11.glTranslatef(-0.6F, 0.3F, 0F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.95F, 0.95F, 0.95f);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AimpointCompM2) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AimpointCompM2").withTextureName("Dummy.png")
                .withRotationPoint(-0.12079999459981924, -1.4240000168085098, -2.392400065904859)
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        AimpointCompM5 = new ItemScope.Builder()
        		.withHolographicReticles(Reticles.REFLEX)
        		.withRadialCut(0.1f)
        		.withReticlePositioning((model, itemStack) -> {
        			GlStateManager.translate(0.3, -6, -0.2);
        			GlStateManager.scale(3.5, 3.5, 1.4);
        		})
        		.withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withRenderablePart()
                .withModel(new com.paneedah.mwc.models.AimpointCompM5(), "aimpointcompm5.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2), 
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withRequiredAttachments(Attachments.VeprDustCover, Attachments.AK200DustCover, Attachments2.PP19VityazSNDC, Attachments2.B33DustCover, Attachments.AK15DustCover, Attachments.Placeholder,
                        Attachments.MIMP5TRRail, Attachments.MIMP5MRail, Attachments.ShotgunRail, Attachments.Kar98Krail,
                        Attachments.M60Rail, Attachments.P90Placeholder, Attachments.AUGA2handguard, Attachments.AUGA3handguard,
                        Attachments.M4Receiver, Attachments.VLTORReceiver, Attachments.AR57Receiver, Attachments.EF88Handguard, Attachments.KrissVectorReceiver, Attachments.KrissVectorReceiverBlack,
                        Attachments.Vector556Handguard, Attachments.M1CarbineScoutHandguard, Attachments.Origin12Grip, Attachments.HKS20Grip,
                        Attachments.HoneyBadgerKnightsReceiver, Attachments.HoneyBadgerKnightsReceiverBlack, Attachments.M14TriRailCover,
                        Attachments.M14TriRailCover, Attachments.Mk14TanBody, Attachments.Mk14SnowBody, Attachments.Mk14BlackBody, Attachments.SSG08Chassis, Attachments.SA58DustCover,
                        Attachments.M16A1ScopeMount, Attachments.G2ContenderBarrelLong, Attachments.S710Receiver,
                        Attachments.Beowulf50CalReceiver, Attachments.FamasF1ScopeMount,
                        Attachments.HK417Receiver, Attachments.HK417ReceiverTan, Attachments.AK12DustCover, Attachments.AK12BDustCover, Attachments.CZ805BrenReceiver, Attachments.HK416Receiver,
                        Attachments.M110Receiver, Attachments.Remington700Chassis, Attachments.Remington700APACChassis,
                        Attachments.Remington700MDTXRSChassis, Attachments.DSR1Handguard, Attachments.DSR1HandguardRailed, Attachments.Z10Receiver, Attachments.MAC21Stock,
                        Attachments.VSSMDustCover, Attachments.SR3MPDustCover, Attachments.Dragunov98DustCover)
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AimpointCompM5) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.2F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AimpointCompM5) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AimpointCompM5) {
                        GL11.glTranslatef(-0.6F, -0.5F, 0.6F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.65F, 0.65F, 0.65f);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AimpointCompM5) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AimpointCompM5").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        RMR = new ItemScope.Builder()
        		.withHolographicReticles(Reticles.RMR)
        		.withReticlePositioning((model, itemStack) -> {
        			GlStateManager.translate(0.22, -2.75, -0.53);
        			GlStateManager.scale(1.7, 1.6, 1.6);
        		})
        		.withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withRenderablePart()
                .withModel(new com.paneedah.mwc.models.RMRsight(), "rmrsight.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 1), 
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withRequiredAttachments(Attachments.FABDefenseMount, Attachments.VeprDustCover, Attachments.AK200DustCover, Attachments2.PP19VityazSNDC, Attachments2.B33DustCover, Attachments.AK15DustCover,
                        Attachments.Placeholder, Attachments.MIMP5TRRail, Attachments.MIMP5MRail, Attachments.ShotgunRail, Attachments.Kar98Krail,
                        Attachments.P90Placeholder, Attachments.AUGA2handguard, Attachments.AUGA3handguard,
                        Attachments.M4Receiver, Attachments.VLTORReceiver, Attachments.AR57Receiver,
                        Attachments.EF88Handguard, Attachments.KrissVectorReceiver, Attachments.KrissVectorReceiverBlack,
                        Attachments.Vector556Handguard, Attachments.DesertEagleSlide, Attachments.M1CarbineScoutHandguard, Attachments.Origin12Grip, Attachments.HKS20Grip,
                        Attachments.M14TriRailCover, Attachments.Mk14TanBody, Attachments.Mk14SnowBody, Attachments.Mk14BlackBody, Attachments.MAS21Mount, Attachments.APC9Placeholder,
                        Attachments.MAC21Stock, Attachments.VSSMDustCover, Attachments.SR3MPDustCover, Attachments.Dragunov98DustCover)
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.RMRsight) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.2F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.RMRsight) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.RMRsight) {
                        GL11.glTranslatef(-0.6F, -0.9F, 0.6F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.RMRsight) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("RMRsight").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Kobra = new ItemScope.Builder()
        		.withHolographicReticles(Reticles.KOBRA)
        		.withRadialCut(0.1f)
        		.withReticlePositioning((model, itemStack) -> {
        			GlStateManager.translate(-0.05, -3.35, -0.8);
        			GlStateManager.scale(1.8, 1.8, 1.4);
        		})
        		.withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Kobra(), "gunmetaltexture.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2), 
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withRequiredAttachments(Attachments.VeprDustCover, Attachments.AK200DustCover, Attachments2.PP19VityazSNDC, Attachments2.B33DustCover, Attachments.AK15DustCover, Attachments.Placeholder,
                        Attachments.MIMP5TRRail, Attachments.MIMP5MRail, Attachments.ShotgunRail, Attachments.Kar98Krail,
                        Attachments.M60Rail, Attachments.P90Placeholder, Attachments.AUGA2handguard, Attachments.AUGA3handguard,
                        Attachments.M4Receiver, Attachments.VLTORReceiver, Attachments.AR57Receiver, Attachments.EF88Handguard, Attachments.KrissVectorReceiver, Attachments.KrissVectorReceiverBlack,
                        Attachments.Vector556Handguard, Attachments.M1CarbineScoutHandguard, Attachments.Origin12Grip, Attachments.HKS20Grip,
                        Attachments.HoneyBadgerKnightsReceiver, Attachments.HoneyBadgerKnightsReceiverBlack, Attachments.M14TriRailCover,
                        Attachments.M14TriRailCover, Attachments.Mk14TanBody, Attachments.Mk14SnowBody, Attachments.Mk14BlackBody, Attachments.SSG08Chassis, Attachments.SA58DustCover,
                        Attachments.M16A1ScopeMount, Attachments.G2ContenderBarrelLong, Attachments.S710Receiver,
                        Attachments.Beowulf50CalReceiver, Attachments.FamasF1ScopeMount,
                        Attachments.HK417Receiver, Attachments.HK417ReceiverTan, Attachments.AK12DustCover, Attachments.AK12BDustCover, Attachments.CZ805BrenReceiver, Attachments.HK416Receiver,
                        Attachments.M110Receiver, Attachments.Remington700Chassis, Attachments.Remington700APACChassis,
                        Attachments.Remington700MDTXRSChassis, Attachments.DSR1Handguard, Attachments.DSR1HandguardRailed, Attachments.Z10Receiver, Attachments.MAC21Stock,
                        Attachments.VSSMDustCover, Attachments.SR3MPDustCover, Attachments.Dragunov98DustCover)
                .withRenderablePart()
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Kobra) {
                        GL11.glTranslatef(0.4F, -0.8F, 0.5F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Kobra) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Kobra) {
                        GL11.glTranslatef(-0.6F, -0.1F, 0.3F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Kobra) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Kobra").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        KobraGen3 = new ItemScope.Builder()
        		.withHolographicReticles(Reticles.KOBRA)
        		.withRadialCut(0.1f)
        		.withReticlePositioning((model, itemStack) -> {
        			GlStateManager.translate(-0.05, -3.35, -0.9);
        			GlStateManager.scale(1.8, 1.8, 1.4);
        		})
        		.withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.KobraGen3(), "gun.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2), 
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withRequiredAttachments(Attachments.VeprDustCover, Attachments.AK200DustCover, Attachments2.PP19VityazSNDC, Attachments2.B33DustCover, Attachments.AK15DustCover, Attachments.Placeholder,
                        Attachments.MIMP5TRRail, Attachments.MIMP5MRail, Attachments.ShotgunRail, Attachments.Kar98Krail,
                        Attachments.M60Rail, Attachments.P90Placeholder, Attachments.AUGA2handguard, Attachments.AUGA3handguard,
                        Attachments.M4Receiver, Attachments.VLTORReceiver, Attachments.AR57Receiver, Attachments.EF88Handguard, Attachments.KrissVectorReceiver, Attachments.KrissVectorReceiverBlack,
                        Attachments.Vector556Handguard, Attachments.M1CarbineScoutHandguard, Attachments.Origin12Grip, Attachments.HKS20Grip,
                        Attachments.HoneyBadgerKnightsReceiver, Attachments.HoneyBadgerKnightsReceiverBlack, Attachments.M14TriRailCover,
                        Attachments.M14TriRailCover, Attachments.Mk14TanBody, Attachments.Mk14SnowBody, Attachments.Mk14BlackBody, Attachments.SSG08Chassis, Attachments.SA58DustCover,
                        Attachments.M16A1ScopeMount, Attachments.G2ContenderBarrelLong, Attachments.S710Receiver,
                        Attachments.Beowulf50CalReceiver, Attachments.FamasF1ScopeMount,
                        Attachments.HK417Receiver, Attachments.HK417ReceiverTan, Attachments.AK12DustCover, Attachments.AK12BDustCover, Attachments.CZ805BrenReceiver, Attachments.HK416Receiver,
                        Attachments.M110Receiver, Attachments.Remington700Chassis, Attachments.Remington700APACChassis,
                        Attachments.Remington700MDTXRSChassis, Attachments.DSR1Handguard, Attachments.DSR1HandguardRailed, Attachments.Z10Receiver, Attachments.MAC21Stock,
                        Attachments.VSSMDustCover, Attachments.SR3MPDustCover, Attachments.Dragunov98DustCover)
                .withRenderablePart()
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KobraGen3) {
                        GL11.glTranslatef(0.4F, -0.8F, 0.5F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KobraGen3) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KobraGen3) {
                        GL11.glTranslatef(-0.6F, -0.1F, -0.1F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KobraGen3) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("KobraGen3").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        KobraMount = new ItemScope.Builder()
        		.withHolographicReticles(Reticles.KOBRA)
        		.withRadialCut(0.1f)
        		.withReticlePositioning((model, itemStack) -> {
        			GlStateManager.translate(-0.05, -3.35, -0.8);
        			GlStateManager.scale(1.8, 1.8, 1.4);
        		})
        		.withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.KobraMount(), "kobramount.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2), 
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withRenderablePart()
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KobraMount) {
                        GL11.glTranslatef(0.4F, -0.8F, 0.5F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KobraMount) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KobraMount) {
                        GL11.glTranslatef(-0.6F, -0.1F, -0.1F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KobraMount) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("KobraMount").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        HP = new ItemScope.Builder()
                .withOpticalZoom()
                .withZoomRange(0.22f, 0.02f)
                .withViewfinderPositioning((p, s) -> {
                    GL11.glScalef(1.65f, 1.65f, 1.65f);
                    GL11.glTranslatef(0.0285f, 0.492f, 0.7f);
                })
                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withCrosshair("HP")
                .withModel(new com.paneedah.mwc.models.HP(), "gun.png")
                .withModel(new com.paneedah.mwc.models.JPUreticle(), "black.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.HP) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else if (model instanceof com.paneedah.mwc.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.HP) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.paneedah.mwc.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.HP) {
                        GL11.glTranslatef(-0.6F, -0.6F, 0.6F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.65F, 0.65F, 0.65f);
                    } else if (model instanceof com.paneedah.mwc.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.HP) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("HPScope").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        LeupoldRailScope = new ItemScope.Builder()
        		.withSniperReticle(Reticles.RETICLE_1)
        		.withOpticalZoom()
        		.withZoomRange(0.22f, 0.06f)
        		.withViewfinderPositioning((p, s) -> {
                    GL11.glScalef(2.9f, 2.9f, 2.9f);
                    GL11.glTranslatef(-0.09f, 0.405f, 1.43f);
                })
        		.withCategory(AttachmentCategory.SCOPE)
        		.withCreativeTab(ModernWarfareMod.AttachmentsTab)
        		.withRequiredAttachments(Attachments.VeprDustCover, Attachments.AK200DustCover, Attachments2.PP19VityazSNDC, Attachments2.B33DustCover, Attachments.AK15DustCover, Attachments.Placeholder, Attachments.Kar98Krail,
                        Attachments.M4Receiver, Attachments.VLTORReceiver, Attachments.AR57Receiver,
                        Attachments.HoneyBadgerKnightsReceiver, Attachments.HoneyBadgerKnightsReceiverBlack, Attachments.M14Rail,
                        Attachments.SSG08Chassis, Attachments.SA58DustCover, Attachments.M16A1ScopeMount, Attachments.G2ContenderBarrelLong,  Attachments.S710Receiver,
                        Attachments.Beowulf50CalReceiver, Attachments.FamasF1ScopeMount,
                        Attachments.HK417Receiver, Attachments.HK417ReceiverTan, Attachments.AK12DustCover, Attachments.AK12BDustCover,  Attachments.MIMP5TRRail, Attachments.MIMP5MRail,
                        Attachments.CZ805BrenReceiver, Attachments.HK416Receiver, Attachments.M110Receiver, Attachments.Remington700Chassis,  Attachments.Remington700APACChassis,
                        Attachments.Remington700MDTXRSChassis, Attachments.DSR1Handguard, Attachments.DSR1HandguardRailed, Attachments.Z10Receiver,
                        Attachments.VSSMDustCover, Attachments.SR3MPDustCover, Attachments.Dragunov98DustCover)
        		.withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 5), 
                    	new CraftingEntry(MWCItems.steelIngot, 5))
        		.withCrosshair("LP")
        		.withRenderablePart()
                .withModel(new com.paneedah.mwc.models.LeupoldRail(), "leupold.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.LeupoldRail) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else if (model instanceof com.paneedah.mwc.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.LeupoldRail) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.paneedah.mwc.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.LeupoldRail) {
                        GL11.glTranslatef(-0.6F, -0.3F, 0.9F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.45F, 0.45F, 0.45f);
                    } else if (model instanceof com.paneedah.mwc.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.LeupoldRail) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("LeupoldRailScope")
                .withRotationPoint(-0.12079999459981924, -1.4240000168085098, -2.392400065904859)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);

        VuduScope = new ItemScope.Builder()
        		.withSniperReticle(Reticles.RETICLE_VUDU)
        		.withOpticalZoom()
        		.withZoomRange(0.15f, 0f)
        		.withViewfinderPositioning((p, s) -> {
                    GL11.glScalef(2.9f, 2.9f, 2.9f);
                    GL11.glTranslatef(-0.09f, 0.405f, 1.43f);
                })
        		.withCategory(AttachmentCategory.SCOPE)
        		.withCreativeTab(ModernWarfareMod.AttachmentsTab)
        		.withRequiredAttachments(Attachments.VeprDustCover, Attachments.AK200DustCover, Attachments2.PP19VityazSNDC, Attachments2.B33DustCover, Attachments.AK15DustCover, Attachments.Placeholder, Attachments.Kar98Krail,
                        Attachments.M4Receiver, Attachments.VLTORReceiver, Attachments.AR57Receiver,
                        Attachments.HoneyBadgerKnightsReceiver, Attachments.HoneyBadgerKnightsReceiverBlack, Attachments.M14Rail,
                        Attachments.SSG08Chassis, Attachments.SA58DustCover, Attachments.M16A1ScopeMount, Attachments.G2ContenderBarrelLong,  Attachments.S710Receiver,
                        Attachments.Beowulf50CalReceiver, Attachments.FamasF1ScopeMount,
                        Attachments.HK417Receiver, Attachments.HK417ReceiverTan, Attachments.AK12DustCover, Attachments.AK12BDustCover,  Attachments.MIMP5TRRail, Attachments.MIMP5MRail,
                        Attachments.CZ805BrenReceiver, Attachments.HK416Receiver, Attachments.M110Receiver, Attachments.Remington700Chassis,  Attachments.Remington700APACChassis,
                        Attachments.Remington700MDTXRSChassis, Attachments.DSR1Handguard, Attachments.DSR1HandguardRailed, Attachments.Z10Receiver,
                        Attachments.VSSMDustCover, Attachments.SR3MPDustCover, Attachments.Dragunov98DustCover)
        		.withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 5), 
                    	new CraftingEntry(MWCItems.steelIngot, 5))
        		.withCrosshair("LP")
        		.withRenderablePart()
                .withModel(new com.paneedah.mwc.models.EOTechVudu(), "vudu.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.EOTechVudu) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else if (model instanceof com.paneedah.mwc.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.EOTechVudu) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.paneedah.mwc.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.EOTechVudu) {
                        GL11.glTranslatef(-0.6F, -0.3F, 0.9F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.45F, 0.45F, 0.45f);
                    } else if (model instanceof com.paneedah.mwc.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.EOTechVudu) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("VuduScope")
                .withRotationPoint(-0.12079999459981924, -1.4240000168085098, -2.392400065904859)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);

        
        NightRaider = new ItemScope.Builder()
                .withNightVision()
                .withOpticalZoom()
                .withSniperReticle(Reticles.RETICLE_NIGHTRAIDER)
                .withZoomRange(0.22f, 0.02f)
                .withViewfinderPositioning((p, s) -> {
                    GL11.glScalef(1.6f, 1.6f, 1.6f);
                    GL11.glTranslatef(-0.045f, 0.495f, 1.551f);
                })
                .withRenderablePart()
                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withCrosshair("HP")
                .withModel(new com.paneedah.mwc.models.NightRaiderScope(), "gun.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 6), 
                    	new CraftingEntry(MWCItems.steelIngot, 5))
                .withRequiredAttachments(Attachments.VeprDustCover, Attachments.AK200DustCover, Attachments2.PP19VityazSNDC, Attachments2.B33DustCover, Attachments.AK15DustCover, Attachments.Placeholder,
                        Attachments.MIMP5TRRail, Attachments.MIMP5MRail, Attachments.ShotgunRail, Attachments.Kar98Krail,
                        Attachments.M60Rail, Attachments.P90Placeholder, Attachments.AUGA2handguard, Attachments.AUGA3handguard,
                        Attachments.M4Receiver, Attachments.VLTORReceiver, Attachments.AR57Receiver, Attachments.EF88Handguard, Attachments.KrissVectorReceiver, Attachments.KrissVectorReceiverBlack,
                        Attachments.Vector556Handguard, Attachments.M1CarbineScoutHandguard, Attachments.Origin12Grip, Attachments.HKS20Grip,
                        Attachments.HoneyBadgerKnightsReceiver, Attachments.HoneyBadgerKnightsReceiverBlack, Attachments.M14TriRailCover,
                        Attachments.M14TriRailCover, Attachments.Mk14TanBody, Attachments.Mk14SnowBody, Attachments.Mk14BlackBody, Attachments.SSG08Chassis, Attachments.SA58DustCover,
                        Attachments.M16A1ScopeMount, Attachments.G2ContenderBarrelLong, Attachments.S710Receiver,
                        Attachments.Beowulf50CalReceiver, Attachments.FamasF1ScopeMount,
                        Attachments.HK417Receiver, Attachments.HK417ReceiverTan, Attachments.AK12DustCover, Attachments.AK12BDustCover, Attachments.CZ805BrenReceiver, Attachments.HK416Receiver,
                        Attachments.M110Receiver, Attachments.Remington700Chassis, Attachments.Remington700APACChassis,
                        Attachments.Remington700MDTXRSChassis, Attachments.DSR1Handguard, Attachments.DSR1HandguardRailed, Attachments.Z10Receiver, Attachments.MAC21Stock,
                        Attachments.VSSMDustCover, Attachments.SR3MPDustCover, Attachments.Dragunov98DustCover)
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.NightRaiderScope) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else if (model instanceof com.paneedah.mwc.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.NightRaiderScope) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.paneedah.mwc.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.NightRaiderScope) {
                        GL11.glTranslatef(-0.6F, -0.6F, 1.5F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.75F, 0.75F, 0.75f);
                    } else if (model instanceof com.paneedah.mwc.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.NightRaiderScope) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("NightRaiderScope")
                
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M2A1sight = new ItemScope.Builder()
                .withOpticalZoom()
                .withZoomRange(0.22f, 0.2f)
                .withViewfinderPositioning((p, s) -> {
                    GL11.glScalef(1.54f, 1.54f, 1.54f);
                    GL11.glTranslatef(-0.09f, -0.265f, -0.7f);
                })
                .withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withRenderablePart()
                .withModel(new com.paneedah.mwc.models.M2A1(), "gun.png")
                .withModel(new com.paneedah.mwc.models.M2A1reticle(), "red.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M2A1) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.2F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    } else if (model instanceof com.paneedah.mwc.models.M2A1reticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M2A1) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.paneedah.mwc.models.M2A1reticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M2A1) {
                        GL11.glTranslatef(-0.6F, -0.6F, 1.3F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else if (model instanceof com.paneedah.mwc.models.M2A1reticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M2A1) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.M2A1reticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("m2a1_sight").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        F2000Scope = new ItemScope.Builder()
                .withOpticalZoom()
                .withZoomRange(0.22f, 0.02f)
                .withViewfinderPositioning((p, s) -> {
                    GL11.glScalef(0.54f, 0.56f, 0.55f);
                    GL11.glTranslatef(-0.125f, -0.923f, 1.621f);
                })
                .withCreativeTab(ModernWarfareMod.AttachmentsTab).withCrosshair("HP")
                .withModel(new com.paneedah.mwc.models.F2000Scope(), "f2000.png")
                .withModel(new com.paneedah.mwc.models.F2000Scope2(), "gun.png")
                .withModel(new com.paneedah.mwc.models.F2000Reticle(), "black.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.F2000Scope) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else if (model instanceof com.paneedah.mwc.models.F2000Reticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.paneedah.mwc.models.F2000Scope2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.F2000Scope) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.paneedah.mwc.models.F2000Reticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.paneedah.mwc.models.F2000Scope2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.F2000Scope) {
                        GL11.glTranslatef(-0.6F, -0F, 0.45F);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glRotatef(-190F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(0.85F, 0.85F, 0.85f);
                    } else if (model instanceof com.paneedah.mwc.models.F2000Reticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.paneedah.mwc.models.F2000Scope2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.F2000Scope) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.F2000Reticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.paneedah.mwc.models.F2000Scope2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("F2000Scope")
                
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M202scope = new ItemScope.Builder()
                .withOpticalZoom()
                .withZoomRange(0.22f, 0.02f)
                .withViewfinderPositioning((p, s) -> {
                    GL11.glScalef(1.7f, 1.7f, 1.7f);
                    GL11.glTranslatef(0.375f, 0.185f, 0.34f);
                })
                .withCrosshair("HP")
                .withModel(new com.paneedah.mwc.models.JPUreticle(), "black.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.JPUreticle) {
                        GL11.glTranslatef(-0.6F, -0.6F, 0.6F);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glRotatef(-190F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(0.65F, 0.65F, 0.65f);
                    } 
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.JPUreticle) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } 
                })
                .withName("M202scope")
                
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        AUGscope = new ItemScope.Builder()
                .withOpticalZoom()
                .withZoomRange(0.22f, 0.02f)
                .withViewfinderPositioning((p, s) -> {
                    GL11.glScalef(1.05f, 1.05f, 1.05f);
                    GL11.glTranslatef(-0.23f, -0.77f, 0.65f);
                })
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.AUGScope_scope(), "gun.png")
                .withModel(new com.paneedah.mwc.models.JPUreticle(), "black.png")
                .withModel(new com.paneedah.mwc.models.AUGScope(), "gun.png")
                .withRequiredAttachments(Attachments.AUGA1handguard)
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AUGScope_scope) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else if (model instanceof com.paneedah.mwc.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.paneedah.mwc.models.AUGScope) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AUGScope_scope) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.paneedah.mwc.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.paneedah.mwc.models.AUGScope) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AUGScope_scope) {
                        GL11.glTranslatef(-0.6F, -0.5F, 1.3F);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glRotatef(-190F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(0.65F, 0.65F, 0.65f);
                    } else if (model instanceof com.paneedah.mwc.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.paneedah.mwc.models.AUGScope) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AUGScope_scope) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.paneedah.mwc.models.AUGScope) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AUGscope")
                
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        

        
        Silencer556x45 = new AttachmentBuilder<Weapon>()
        		.withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Suppressor556x45(), "gun.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2), 
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor556x45) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor556x45) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor556x45) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor556x45) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })
                .withName("Silencer556x45").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Silencer545x39 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Suppressor556x39(), "gun.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2), 
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor556x39) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor556x39) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor556x39) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor556x39) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })
                .withName("Silencer545x39").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Silencer762x39 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Suppressor762x39(), "gun.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2), 
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor762x39) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor762x39) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor762x39) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor762x39) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })
                .withName("Silencer762x39").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        M4RearIron = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new M4RearSight(), "arcarryhandle.png")
                .withRequiredAttachments(Attachments.M4Receiver, Attachments.VLTORReceiver, Attachments.HoneyBadgerReceiver,
                		Attachments.HoneyBadgerReceiverBlack)
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M4RearSight) {
                        GL11.glTranslatef(-0.6F, -0.7F, -0.25F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.45F, 0.45F, 0.45f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4RearSight) {
                        GL11.glTranslatef(0.1F, 0F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.5F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4RearSight) {
                        GL11.glTranslatef(-1.6F, -0.5F, 1.2F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.3F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M4RearIron").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        LR300FrontSight = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.LR300Iron(), "gun.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.LR300Iron) {
                        GL11.glTranslatef(-0.6F, -0.5F, 0.5F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.6F, 1.6F, 1.6f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.LR300Iron) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.LR300Iron) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("LR300FrontSight").withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

    }
}