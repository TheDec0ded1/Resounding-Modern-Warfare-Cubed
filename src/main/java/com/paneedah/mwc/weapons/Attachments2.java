package com.paneedah.mwc.weapons;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.init.MWCItems;
import com.paneedah.mwc.models.*;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import com.paneedah.weaponlib.crafting.CraftingGroup;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import org.lwjgl.opengl.GL11;

public class Attachments2 {
    public static ItemAttachment<Weapon> MinimiHandguard;
    public static ItemAttachment<Weapon> MinimiStock;
    public static ItemAttachment<Weapon> MinimiStockB;
    public static ItemAttachment<Weapon> Type56Iron;
    public static ItemAttachment<Weapon> Mk17Upper;
    public static ItemAttachment<Weapon> Mk20Upper;
    public static ItemAttachment<Weapon> Mk20Handguard;
    public static ItemAttachment<Weapon> SCARSCUpper;
    public static ItemAttachment<Weapon> SCARSCHandguard;
    public static ItemAttachment<Weapon> MakarovBodyPearl;
    public static ItemAttachment<Weapon> AN94Stock;
    public static ItemAttachment<Weapon> AN94GreenStock;
    public static ItemAttachment<Weapon> AN94;
    public static ItemAttachment<Weapon> AN94Green;
    public static ItemAttachment<Weapon> M93RStock;
    public static ItemAttachment<Weapon> M93RSlide;
    public static ItemAttachment<Weapon> M93RBody;
    public static ItemAttachment<Weapon> MK20Stock;
    public static ItemAttachment<Weapon> SilencerGroza;
    public static ItemAttachment<Weapon> SR3MHGB;
    public static ItemAttachment<Weapon> SR3MHGFB;
    public static ItemAttachment<Weapon> SR3VikhrHGB;
    public static ItemAttachment<Weapon> SR3VikhrHGRetroB;
    public static ItemAttachment<Weapon> SR3VikhrHGRetro;
    public static ItemAttachment<Weapon> ASValStockB;
    public static ItemAttachment<Weapon> SilencerSR2M;
    public static ItemAttachment<Weapon> SR2MGB;
    public static ItemAttachment<Weapon> SR2MHGB;
    public static ItemAttachment<Weapon> SR2MHGFB;
    public static ItemAttachment<Weapon> SR2MG;
    public static ItemAttachment<Weapon> SR2MHG;
    public static ItemAttachment<Weapon> SR2MHGF;
    public static ItemAttachment<Weapon> SR2MStock;
    public static ItemAttachment<Weapon> VSSMStockB;
    public static ItemAttachment<Weapon> PPShStock;
    public static ItemAttachment<Weapon> M16A2Receiver;
    public static ItemAttachment<Weapon> MP5A1HandGuard;
    public static ItemAttachment<Weapon> MP5kHandGuard;
    public static ItemAttachment<Weapon> MP5kNavyHandGuard;
    public static ItemAttachment<Weapon> MP5kStock;
    public static ItemAttachment<Weapon> MP5kBackplate;
    public static ItemAttachment<Weapon> Type81BlondeStock;
    public static ItemAttachment<Weapon> Type81BlondeStock2;
    public static ItemAttachment<Weapon> Type81BlondeGrip;
    public static ItemAttachment<Weapon> Type81BlondeHandguard;
    public static ItemAttachment<Weapon> Type81Stock;
    public static ItemAttachment<Weapon> Type81Stock2;
    public static ItemAttachment<Weapon> Type81Grip;
    public static ItemAttachment<Weapon> Type81Handguard;
    public static ItemAttachment<Weapon> Mk17UpperB;
    public static ItemAttachment<Weapon> Mk20UpperB;
    public static ItemAttachment<Weapon> SCARSCUpperB;
    public static ItemAttachment<Weapon> ScarLReceiverB;
    public static ItemAttachment<Weapon> ScarRetractableStockB;
    public static ItemAttachment<Weapon> MK20StockB;
    public static ItemAttachment<Weapon> ScarLCQCBody;
    public static ItemAttachment<Weapon> ScarLBody;
    public static ItemAttachment<Weapon> SCARSCBody;
    public static ItemAttachment<Weapon> Mk20Body;
    public static ItemAttachment<Weapon> Mk17CQCBody;
    public static ItemAttachment<Weapon> Mk17Body;
    public static ItemAttachment<Weapon> ScarLCQCBodyB;
    public static ItemAttachment<Weapon> ScarLBodyB;
    public static ItemAttachment<Weapon> SCARSCBodyB;
    public static ItemAttachment<Weapon> Mk20BodyB;
    public static ItemAttachment<Weapon> Mk17CQCBodyB;
    public static ItemAttachment<Weapon> Mk17BodyB;
    public static ItemAttachment<Weapon> FORT500Barrel;
    public static ItemAttachment<Weapon> FORT500Pump;
    public static ItemAttachment<Weapon> FORT500Stock;
    public static ItemAttachment<Weapon> FORT500Grip;
    public static ItemAttachment<Weapon> FORT500MBarrel;
    public static ItemAttachment<Weapon> GalilARMDustCover;
    public static ItemAttachment<Weapon> GalilARMHandGuard;
    public static ItemAttachment<Weapon> GalilARMGrip;
    public static ItemAttachment<Weapon> GalilStock;
    public static ItemAttachment<Weapon> SR3MPStock;
    public static ItemAttachment<Weapon> Mini14Stock;
    public static ItemAttachment<Weapon> Mini14PRStock;
    public static ItemAttachment<Weapon> Mini14ALTStock;
    public static ItemAttachment<Weapon> Mini14GreenStock;
    public static ItemAttachment<Weapon> Mini14GreenPRStock;
    public static ItemAttachment<Weapon> Mini14GreenALTStock;
    public static ItemAttachment<Weapon> Mini14WoodStock;
    public static ItemAttachment<Weapon> Mini14WoodPRStock;
    public static ItemAttachment<Weapon> Mini14WoodALTStock;
    public static ItemAttachment<Weapon> Mini14Upper;
    public static ItemAttachment<Weapon> Remington1100Handguard;
    public static ItemAttachment<Weapon> SVUStock;
    public static ItemAttachment<Weapon> SVUGrip;
    public static ItemAttachment<Weapon> SVUHG;
    public static ItemAttachment<Weapon> SVUSightsUp;
    public static ItemAttachment<Weapon> SVUSightsDown;
    public static ItemAttachment<Weapon> SVUSuppressor;
    public static ItemAttachment<Weapon> SilencerBizon;
    public static ItemAttachment<Weapon> ASh_12Silencer;
    public static ItemAttachment<Weapon> ShAK_12Silencer;
    public static ItemAttachment<Weapon> ASh_12Upper;
    public static ItemAttachment<Weapon> ASh_12Lower;
    public static ItemAttachment<Weapon> ASh_12Handguard;
    public static ItemAttachment<Weapon> ASh_12MuzzleBrake;
    public static ItemAttachment<Weapon> ASh_12Irons;
    public static ItemAttachment<Weapon> PKPBipod;
    public static ItemAttachment<Weapon> PKMBipod;
    public static ItemAttachment<Weapon> PKPBarrel;
    public static ItemAttachment<Weapon> PKMBarrel;
    public static ItemAttachment<Weapon> M84Barrel;
    public static ItemAttachment<Weapon> PKMGrip;
    public static ItemAttachment<Weapon> PKMStock;
    public static ItemAttachment<Weapon> PKPStock;
    public static ItemAttachment<Weapon> QBZ95Body;
    public static ItemAttachment<Weapon> QBZ97Body;
    public static ItemAttachment<Weapon> QBZ95Longbow;
    public static ItemAttachment<Weapon> QBZ95BLongbow;
    public static ItemAttachment<Weapon> QBZ95Defender;
    public static ItemAttachment<Weapon> QBZ95Dustcover;
    public static ItemAttachment<Weapon> QBZ95BDustcover;
    public static ItemAttachment<Weapon> QBB95Dustcover;
    public static ItemAttachment<Weapon> QBZ95Upper;
    public static ItemAttachment<Weapon> QBZ95BUpper;
    public static ItemAttachment<Weapon> QBZ95BBody;
    public static ItemAttachment<Weapon> QBZ95BMuzzle;
    public static ItemAttachment<Weapon> QBB95Upper;
    public static ItemAttachment<Weapon> QBB95Body;
    public static ItemAttachment<Weapon> QBB95Bipod;
    public static ItemAttachment<Weapon> AS_Stock;
    public static ItemAttachment<Weapon> ASM_ValStock;
    public static ItemAttachment<Weapon> AS_Grip;
    public static ItemAttachment<Weapon> AS_GripPale;
    public static ItemAttachment<Weapon> AS_GripBlack;
    public static ItemAttachment<Weapon> AS_Handguard;
    public static ItemAttachment<Weapon> ASM_Handguard;
    public static ItemAttachment<Weapon> VSS_Handguard;
    public static ItemAttachment<Weapon> VSS_Dustcover;
    public static ItemAttachment<Weapon> SR3M_Dustcover;
    public static ItemAttachment<Weapon> AS_Dustcover;
    public static ItemAttachment<Weapon> VSS_Stock;
    public static ItemAttachment<Weapon> VSSKO_Stock;
    public static ItemAttachment<Weapon> VSSM_Stock;
    public static ItemAttachment<Weapon> VSSM_StockM;
    public static ItemAttachment<Weapon> VSSM_VintorezDustcover;
    public static ItemAttachment<Weapon> VSSM_VintorezRails;
    public static ItemAttachment<Weapon> AA12Body;
    public static ItemAttachment<Weapon> AA12Irons;
    public static ItemAttachment<Weapon> AA12RailMount;
    public static ItemAttachment<Weapon> MicroUziGrip;
    public static ItemAttachment<Weapon> MicroUziStock;
    public static ItemAttachment<Weapon> MiniUziGrip;
    public static ItemAttachment<Weapon> MiniUziStock;
    public static ItemAttachment<Weapon> MiniUziHandguard;
    public static ItemAttachment<Weapon> UziGrip;
    public static ItemAttachment<Weapon> UziStock;
    public static ItemAttachment<Weapon> UziStockFolded;
    public static ItemAttachment<Weapon> UziWoodStock;
    public static ItemAttachment<Weapon> UziHandguard;
    public static ItemAttachment<Weapon> UziHandguardVert;
    public static ItemAttachment<Weapon> UziSuppressor;
    public static ItemAttachment<Weapon> QBZ03Handguard;
    public static ItemAttachment<Weapon> QBZ03Grip;
    public static ItemAttachment<Weapon> QBZ03Stock;
    public static ItemAttachment<Weapon> QBZ03Upper;
    public static ItemAttachment<Weapon> QBZ03_556Handguard;
    public static ItemAttachment<Weapon> QBZ03_556Upper;
    public static ItemAttachment<Weapon> QBU88Body;
    public static ItemAttachment<Weapon> QBU88Dustcover;
    public static ItemAttachment<Weapon> QBU97Body;
    public static ItemAttachment<Weapon> QBU88IronsUpright;
    public static ItemAttachment<Weapon> QBU88IronsFolded;
    public static ItemAttachment<Weapon> QBU88Bipod;
    public static ItemAttachment<Weapon> QBU88Upper;
    public static ItemAttachment<Weapon> Stoner63LMGBarrel;
    public static ItemAttachment<Weapon> Stoner63Grip;
    public static ItemAttachment<Weapon> Stoner63Handguard;
    public static ItemAttachment<Weapon> Stoner63Stock;
    public static ItemAttachment<Weapon> Stoner63AutoRifleBarrel;
    public static ItemAttachment<Weapon> Stoner63PaintedGrip;
    public static ItemAttachment<Weapon> Stoner63PaintedStock;
    public static ItemAttachment<Weapon> Stoner63PaintedHandguard;
    public static ItemAttachment<Weapon> Stoner63RifleHandguard;
    public static ItemAttachment<Weapon> Stoner63StockFolding;
    public static ItemAttachment<Weapon> Stoner63RifleBarrel;
    public static ItemAttachment<Weapon> Stoner63CarbineBarrel;
    public static ItemAttachment<Weapon> QBZ97NSR_Body;
	public static ItemAttachment<Weapon> QBZ97NSRDustcover;
	public static ItemAttachment<Weapon> QBZ97NSRUpper;
	public static ItemAttachment<Weapon> QBU191Upper;
	public static ItemAttachment<Weapon> QBU191Barrel;
	public static ItemAttachment<Weapon> QBU191Handguard;
	public static ItemAttachment<Weapon> QCW05Body;
	public static ItemAttachment<Weapon> QCW05Dustcover;
	public static ItemAttachment<Weapon> QCW05Upper;
	public static ItemAttachment<Weapon> QCW05Suppressor;
	public static ItemAttachment<Weapon> QSZ92Barrel;
    public static ItemAttachment<Weapon> QSZ92Slide;
    public static ItemAttachment<Weapon> QSZ92Body;
	public static ItemAttachment<Weapon> QSW06Slide;
	public static ItemAttachment<Weapon> QSW06Barrel;
	public static ItemAttachment<Weapon> QSW06Silencer;
	public static ItemAttachment<Weapon> QSZ92GBody;
	public static ItemAttachment<Weapon> QSZ92GSlide;
	public static ItemAttachment<Weapon> QSZ92GBarrel;
	public static ItemAttachment<Weapon> QBZ191Upper;
	public static ItemAttachment<Weapon> QBZ191Barrel;
	public static ItemAttachment<Weapon> QBZ192Barrel;
	public static ItemAttachment<Weapon> QBZ191Handguard;
	public static ItemAttachment<Weapon> QBZ191Grip;
	public static ItemAttachment<Weapon> QBZ191Lower;
	public static ItemAttachment<Weapon> QBU191Lower;
	public static ItemAttachment<Weapon> QBZ191Stock;
	public static ItemAttachment<Weapon> QJY88Handguard;
	public static ItemAttachment<Weapon> QJY88HandguardCustom;
	public static ItemAttachment<Weapon> QJY88Barrel;
	public static ItemAttachment<Weapon> QJY88BarrelCustom;
	public static ItemAttachment<Weapon> QJY88Stock;
	public static ItemAttachment<Weapon> QJY88Grip;
	public static ItemAttachment<Weapon> QBU88RailKit;
	public static ItemAttachment<Weapon> QBU88IronsRailKit;
	public static ItemAttachment<Weapon> LMG68Lower;
	public static ItemAttachment<Weapon> LMG68Upper;
	public static ItemAttachment<Weapon> LMG68Bracket;
	public static ItemAttachment<Weapon> LMG68Barrel;
	public static ItemAttachment<Weapon> LMG68Tray;
	public static ItemAttachment<Weapon> LMG68Adapter;
	public static ItemAttachment<Weapon> LMG68Stock;
	public static ItemAttachment<Weapon> LMG68Suppressor;
	public static ItemAttachment<Weapon> TavorX95BarrelAR;
	public static ItemAttachment<Weapon> TavorX95BarrelCarbine;
	public static ItemAttachment<Weapon> TavorX95BarrelSBR;
	public static ItemAttachment<Weapon> TavorX95BarrelSBRBayonet;
	public static ItemAttachment<Weapon> TavorMTAR21Barrel;
	public static ItemAttachment<Weapon> TavorX95Upper;
	public static ItemAttachment<Weapon> TavorX95UpperSBR;
	public static ItemAttachment<Weapon> TavorMTAR21Handguard;
	public static ItemAttachment<Weapon> TavorX95RCS_AR;
	public static ItemAttachment<Weapon> TavorX95RCS_SBR;
	public static ItemAttachment<Weapon> TavorX95RCS_ARTan;
	public static ItemAttachment<Weapon> TavorX95RCS_SBRTan;
	public static ItemAttachment<Weapon> TavorMTAR21RailMount;
	public static ItemAttachment<Weapon> TavorX95RCB_AR;
	public static ItemAttachment<Weapon> TavorX95RCB_SBR;
	public static ItemAttachment<Weapon> TavorX95RCB_ARTan;
	public static ItemAttachment<Weapon> TavorX95RCB_SBRTan;
	public static ItemAttachment<Weapon> TavorMTAR21LowerRail;
	public static ItemAttachment<Weapon> TavorX95GripAR;
	public static ItemAttachment<Weapon> TavorX95GripSBR;
	public static ItemAttachment<Weapon> TavorX95GripARTan;
	public static ItemAttachment<Weapon> TavorX95GripSBRTan;
	public static ItemAttachment<Weapon> TavorMTAR21Grip;
	public static ItemAttachment<Weapon> TavorX95Body;
	public static ItemAttachment<Weapon> TavorX95BodyTan;
	public static ItemAttachment<Weapon> TavorMTAR21Body;
	public static ItemAttachment<Weapon> TavorMTAR21SightBase;
	public static ItemAttachment<Weapon> TavorMTAR21Sights;
	public static ItemAttachment<Weapon> Type20Handguard;
	public static ItemAttachment<Weapon> Type20HandguardTan;
	public static ItemAttachment<Weapon> Type20Receiver;
	public static ItemAttachment<Weapon> Type20ReceiverTan;
	public static ItemAttachment<Weapon> Type20Stock;
	public static ItemAttachment<Weapon> Type20StockTan;
	public static ItemAttachment<Weapon> Type20Lower;
	public static ItemAttachment<Weapon> Type20LowerTan;
    public static ItemAttachment<Weapon> Type20Cover;
    public static ItemAttachment<Weapon> SteyrTMPOpticRail;
    public static ItemAttachment<Weapon> SteyrTMPSuppressor;
    public static ItemAttachment<Weapon> SteyrTMPStock;
    public static ItemAttachment<Weapon> SteyrTMPUpper;
    public static ItemAttachment<Weapon> SteyrSPPGrip;
    public static ItemAttachment<Weapon> SteyrTMPGrip;
    public static ItemAttachment<Weapon> BundT_MP9Lower;
    public static ItemAttachment<Weapon> BundT_MP9Upper;
    public static ItemAttachment<Weapon> BundT_MP9VertGrip;
    public static ItemAttachment<Weapon> BundT_MP9SDLong;
    public static ItemAttachment<Weapon> BundT_MP9SDShort;
    public static ItemAttachment<Weapon> BundT_MP9Stock;
    public static ItemAttachment<Weapon> BundT_MP9SideRail;
    public static ItemAttachment<Weapon> BundT_MP9LowerST;
    public static ItemAttachment<Weapon> BundT_MP9UpperST;
    public static ItemAttachment<Weapon> BundT_MP9VertGripST;
    public static ItemAttachment<Weapon> BundT_MP9SDLongST;
    public static ItemAttachment<Weapon> BundT_MP9SDShortST;
    public static ItemAttachment<Weapon> BundT_MP9LowerAG;
    public static ItemAttachment<Weapon> BundT_MP9UpperAG;
    public static ItemAttachment<Weapon> BundT_MP9VertGripAG;
    public static ItemAttachment<Weapon> BundT_MP9SDLongAG;
    public static ItemAttachment<Weapon> BundT_MP9SDShortAG;
    public static ItemAttachment<Weapon> OSV96Grip;
    public static ItemAttachment<Weapon> OSV96Stock;
    public static ItemAttachment<Weapon> OSV96SightsUp;
    public static ItemAttachment<Weapon> OSV96SightsDown;
    public static ItemAttachment<Weapon> Tavor21BarrelSBR;
    public static ItemAttachment<Weapon> Tavor21BarrelAR;
    public static ItemAttachment<Weapon> Tavor21Stock;
    public static ItemAttachment<Weapon> Tavor21SightBase;
    public static ItemAttachment<Weapon> Tavor21SightsUpright;
    public static ItemAttachment<Weapon> Tavor21SightsFolded;
    public static ItemAttachment<Weapon> Tavor21Cover;
    public static ItemAttachment<Weapon> Tavor21Handguard;
    public static ItemAttachment<Weapon> Tavor21RailedUpper;
    public static ItemAttachment<Weapon> Tavor21LowerRail;
    public static ItemAttachment<Weapon> Tavor21SideRail;
    public static ItemAttachment<Weapon> M1GarandStock;
    public static ItemAttachment<Weapon> M1GarandStockT26;


    public static void init(Object mod) {

        MinimiHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.MinimiHandguard(), "m249.png")
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.MinimiHandguard) {
                        GL11.glTranslatef(-0.6F, -0.6F, 1.8F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.MinimiHandguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.MinimiHandguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MinimiHandguard").withTextureName("Dummy.png")
                .build(MWC.modContext);

        MinimiStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.MinimiStock(), "m249.png")
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.MinimiStock) {
                        GL11.glTranslatef(-0.6F, -0.7F, 5.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.MinimiStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.MinimiStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MinimiStock").withTextureName("Dummy.png")
                .build(MWC.modContext);

        MinimiStockB = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.MinimiStockB(), "m249.png")
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.MinimiStockB) {
                        GL11.glTranslatef(-0.6F, -0.7F, 5.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.MinimiStockB) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.MinimiStockB) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MinimiStockB").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Type56Iron = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA3)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.AKiron3(), "gun")
                .withModel(new com.paneedah.mwc.models.Type56iron2(), "gun")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.AKiron3) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.AKiron3) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.AKiron3) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    } else if (model instanceof com.paneedah.mwc.models.Type56iron2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.AKiron3) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("Type56Iron")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        Mk17Upper = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Mk17Upper(), "scarl.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mk17Upper) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mk17Upper) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mk17Upper) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Mk17Upper").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Mk20Upper = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Mk20Upper(), "scarl.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mk20Upper) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mk20Upper) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mk20Upper) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Mk20Upper").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Mk20Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Mk20Handguard(), "scarl.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mk20Handguard) {
                    	 GL11.glTranslatef(-0.6F, 0.1F, -1.6F);
                         GL11.glRotatef(10F, 1f, 0f, 0f);
                         GL11.glRotatef(-190F, 0f, 1f, 0f);
                         GL11.glRotatef(0F, 0f, 0f, 1f);
                         GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mk20Handguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mk20Handguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Mk20Handguard").withTextureName("Dummy.png")
                .build(MWC.modContext);


        SCARSCUpper = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.SCARSCUpper(), "scarl.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SCARSCUpper) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SCARSCUpper) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SCARSCUpper) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SCARSCUpper").withTextureName("Dummy.png")
                .build(MWC.modContext);

        SCARSCHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.SCARSCHandguard(), "scarl.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SCARSCHandguard) {
                    	 GL11.glTranslatef(-0.6F, 0.1F, -1.6F);
                         GL11.glRotatef(10F, 1f, 0f, 0f);
                         GL11.glRotatef(-190F, 0f, 1f, 0f);
                         GL11.glRotatef(0F, 0f, 0f, 1f);
                         GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SCARSCHandguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SCARSCHandguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SCARSCHandguard").withTextureName("Dummy.png")
                .build(MWC.modContext);       

        MakarovBodyPearl = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.MakarovPM(), "makarovpmpearl.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.MakarovPM) {
                        GL11.glTranslatef(-0.6F, -0.1F, -0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.MakarovPM) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.MakarovPM) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MakarovBodyPearl")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);

        AN94Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.AN94Stock(), "an94.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 4))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.AN94Stock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.6F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.AN94Stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.AN94Stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AN94Stock").withTextureName("Dummy.png")
                .build(MWC.modContext);

        AN94GreenStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.AN94Stock(), "an94green.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 4))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.AN94Stock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.6F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.AN94Stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.AN94Stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AN94GreenStock").withTextureName("Dummy.png")
                .build(MWC.modContext);

        AN94 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.AN94(), "an94.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.AN94) {
                        GL11.glTranslatef(-0.6F, 0.4F, -2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.AN94) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.AN94) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AN94").withTextureName("Dummy.png")
                .build(MWC.modContext);

 AN94Green = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.AN94(), "an94green.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.AN94) {
                        GL11.glTranslatef(-0.6F, 0.4F, -2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.AN94) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.AN94) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AN94Green").withTextureName("Dummy.png")
                .build(MWC.modContext);

        M93RStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withRenderablePart()
                .withCreativeTab(MWC.AttachmentsTab).withModel(new com.paneedah.mwc.models.M93RStock(), "bareak.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.4f);
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M93RStock) {
                        GL11.glTranslatef(0.7F, -1.2F, 0.5F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M93RStock) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M93RStock) {
                        GL11.glTranslatef(0.6F, 0.3F, 0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);

                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M93RStock) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                })
                .withName("M93RStock").withTextureName("Dummy.png")
                .build(MWC.modContext);

        M93RSlide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M93RSlide(), "m93r.png")
                .withModel(new com.paneedah.mwc.models.M9A1frontsight(), "M9A1frontsight")
                .withModel(new com.paneedah.mwc.models.M93Rrearsight(), "M9A1rearsight")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M93RSlide) {
                        GL11.glTranslatef(-0.6F, 0.2F, -0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M93RSlide) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M93RSlide) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M93RSlide")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M93RBody = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M93R(), "m93r.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M93R) {
                        GL11.glTranslatef(-0.6F, -0.1F, -0.1F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M93R) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M93R) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M93RBody")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);

        MK20Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withRenderablePart()
                .withCreativeTab(MWC.AttachmentsTab).withModel(new com.paneedah.mwc.models.MK20Stock(), "scarl.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.MK20Stock) {
                        GL11.glTranslatef(0.7F, -1.2F, 0.5F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.MK20Stock) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.MK20Stock) {
                        GL11.glTranslatef(0.6F, 0.3F, 0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);

                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.MK20Stock) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                })
                .withName("MK20Stock").withTextureName("Dummy.png")
                .build(MWC.modContext);

        SilencerGroza = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.grozaSilencer(), "groza.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2), 
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.grozaSilencer) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.grozaSilencer) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.grozaSilencer) {
                        GL11.glTranslatef(0.6F, 1.3F, -5.3F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);

                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.grozaSilencer) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("SilencerGroza")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        ASValStockB = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.ASValStock(), "sr3m.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3), 
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ASValStock) {
                    	GL11.glTranslatef(-0.6F, -0.6F, 1.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ASValStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ASValStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("ASValStockB").withTextureName("Dummy.png")
                .build(MWC.modContext);

        SR3MHGB = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.SR3MHG(), "sr3m.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SR3MHG) {
                    	GL11.glTranslatef(-0.6F, 0.3F, -1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SR3MHG) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SR3MHG) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SR3MHGB").withTextureName("Dummy.png")

                .build(MWC.modContext);
        
        SR3MHGFB = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.SR3MHGF(), "sr3m.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SR3MHGF) {
                    	GL11.glTranslatef(-0.6F, 0.3F, -1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SR3MHGF) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SR3MHGF) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SR3MHGFB").withTextureName("Dummy.png")
                .build(MWC.modContext);

        SR3VikhrHGB = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.SR3VikhrHG(), "vssplastic.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SR3VikhrHG) {
                    	GL11.glTranslatef(-0.6F, 0.3F, -1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SR3VikhrHG) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SR3VikhrHG) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SR3VikhrHGB").withTextureName("Dummy.png")

                .build(MWC.modContext);

        SR3VikhrHGRetroB = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.SR3VikhrHGRetro(), "vssplastic.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SR3VikhrHGRetro) {
                    	GL11.glTranslatef(-0.6F, 0.3F, -1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SR3VikhrHGRetro) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SR3VikhrHGRetro) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SR3VikhrHGRetroB").withTextureName("Dummy.png")

                .build(MWC.modContext);

        SR3VikhrHGRetro = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.SR3VikhrHGRetro(), "valplastic.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SR3VikhrHGRetro) {
                    	GL11.glTranslatef(-0.6F, 0.3F, -1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SR3VikhrHGRetro) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SR3VikhrHGRetro) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SR3VikhrHGRetro").withTextureName("Dummy.png")

                .build(MWC.modContext);

        SilencerSR2M = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.SR2Msilencer(), "vssvintorez.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2), 
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SR2Msilencer) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SR2Msilencer) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SR2Msilencer) {
                        GL11.glTranslatef(0.6F, 1.3F, -5.3F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);

                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SR2Msilencer) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("SilencerSR2M")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        SR2MHGB = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.SR2MHG(), "sr3m.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SR2MHG) {
                    	GL11.glTranslatef(-0.6F, 0.3F, -1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SR2MHG) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SR2MHG) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SR2MHGB").withTextureName("Dummy.png")

                .build(MWC.modContext);
        
        SR2MHGFB = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.SR2MHGF(), "sr3m.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SR2MHGF) {
                    	GL11.glTranslatef(-0.6F, 0.3F, -1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SR2MHGF) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SR2MHGF) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SR2MHGFB").withTextureName("Dummy.png")
                .build(MWC.modContext);

        SR2MHG = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.SR2MHG(), "vssvintorez.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SR2MHG) {
                    	GL11.glTranslatef(-0.6F, 0.3F, -1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SR2MHG) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SR2MHG) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SR2MHG").withTextureName("Dummy.png")

                .build(MWC.modContext);
        
        SR2MHGF = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.SR2MHGF(), "vssvintorez.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SR2MHGF) {
                    	GL11.glTranslatef(-0.6F, 0.3F, -1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SR2MHGF) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SR2MHGF) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SR2MHGF").withTextureName("Dummy.png")
                .build(MWC.modContext);

        SR2MStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.SR2MStock(), "vssvintorez.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3), 
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SR2MStock) {
                    	GL11.glTranslatef(-0.6F, -0.6F, 1.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SR2MStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SR2MStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SR2MStock").withTextureName("Dummy.png")
                .build(MWC.modContext);

        SR2MGB = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.SR2MG(), "sr3m.png")
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SR2MG) {
                        GL11.glTranslatef(-0.6F, -0.3F, 0.1F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SR2MG) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SR2MG) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SR2MGB").withTextureName("Dummy.png")
                .build(MWC.modContext);

        SR2MG = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.SR2MG(), "vssvintorez.png")
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SR2MG) {
                        GL11.glTranslatef(-0.6F, -0.3F, 0.1F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SR2MG) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SR2MG) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SR2MG").withTextureName("Dummy.png")
                .build(MWC.modContext);

        VSSMStockB = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.VSSMStockB(), "sr3m.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3), 
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.VSSMStockB) {
                    	GL11.glTranslatef(-0.6F, -0.6F, 1.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.VSSMStockB) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.VSSMStockB) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("VSSMStockB").withTextureName("Dummy.png")
                .build(MWC.modContext);

        PPShStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.PPShStock(), "ppsh.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2), 
                    	new CraftingEntry(Blocks.PLANKS, 1))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.PPShStock) {
                        GL11.glTranslatef(-0.6F, -0.6F, 0.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.PPShStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.PPShStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("PPShStock").withTextureName("Dummy.png")
                .build(MWC.modContext);

        M16A2Receiver = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M16A2CH(), "m4a1.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16A2CH) {
                        GL11.glTranslatef(-0.6F, 0.3F, 0F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16A2CH) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M16A2CH) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M16A2Receiver").withTextureName("Dummy.png")
                .build(MWC.modContext);

        MP5A1HandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.mp5a1hg(), "mp5.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.mp5a1hg) {
                        GL11.glTranslatef(-0.6F, 0.2F, -1.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.mp5a1hg) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.mp5a1hg) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MP5A1HandGuard").withTextureName("Dummy.png")
                .build(MWC.modContext);

        MP5kHandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.mp5khg(), "mp5.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.mp5khg) {
                        GL11.glTranslatef(-0.6F, 0.2F, -1.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.mp5khg) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.mp5khg) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MP5kHandGuard").withTextureName("Dummy.png")
                .build(MWC.modContext);

        MP5kNavyHandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.mp5knhg(), "mp5.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.mp5knhg) {
                        GL11.glTranslatef(-0.6F, 0.2F, -1.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.mp5knhg) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.mp5knhg) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MP5kNavyHandGuard").withTextureName("Dummy.png")
                .build(MWC.modContext);

        MP5kStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.mp5kstock(), "mp5.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.mp5kstock) {
                        GL11.glTranslatef(-0.6F, 0.2F, 1.6F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.mp5kstock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.mp5kstock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MP5kStock").withTextureName("Dummy.png")
                .build(MWC.modContext);

        MP5kBackplate = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.mp5kbp(), "mp5.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.mp5kbp) {
                        GL11.glTranslatef(-0.6F, 0.2F, 1.6F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.mp5kbp) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.mp5kbp) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MP5kBackplate").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Type81BlondeGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.type81grip(), "amd63.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2), 
                    	new CraftingEntry(Blocks.PLANKS, 1))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.type81grip) {
                        GL11.glTranslatef(-0.6F, -0.6F, 0.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.type81grip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.type81grip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Type81BlondeGrip").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Type81BlondeStock2 = new AttachmentBuilder<Weapon>()
        		.withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.type81stock2(), "amd63.png")
                .withModernRecipe(
                	CraftingGroup.ATTACHMENT_MODIFICATION,
                	new CraftingEntry(MWCItems.gunmetalIngot, 3), 
                	new CraftingEntry(Blocks.PLANKS, 2))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.type81stock2) {
                        GL11.glTranslatef(-0.6F, 0F, 1.6F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.type81stock2) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.type81stock2) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Type81BlondeStock2").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Type81BlondeStock = new AttachmentBuilder<Weapon>()
        		.withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.type81stock(), "amd63.png")
                .withModernRecipe(
                	CraftingGroup.ATTACHMENT_MODIFICATION,
                	new CraftingEntry(MWCItems.gunmetalIngot, 3), 
                	new CraftingEntry(Blocks.PLANKS, 2))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.type81stock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.6F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.type81stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.type81stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Type81BlondeStock").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Type81BlondeHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.type81handguard(), "amd63.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3), 
                    	new CraftingEntry(Blocks.PLANKS, 2))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.type81handguard) {
                        GL11.glTranslatef(-0.6F, 0.4F, -2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.type81handguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.type81handguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Type81BlondeHandguard").withTextureName("Dummy.png")
              .build(MWC.modContext);

        Type81Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.type81grip(), "ak47.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2), 
                    	new CraftingEntry(Blocks.PLANKS, 1))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.type81grip) {
                        GL11.glTranslatef(-0.6F, -0.6F, 0.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.type81grip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.type81grip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Type81Grip").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Type81Stock2 = new AttachmentBuilder<Weapon>()
        		.withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.type81stock2(), "ak47.png")
                .withModernRecipe(
                	CraftingGroup.ATTACHMENT_MODIFICATION,
                	new CraftingEntry(MWCItems.gunmetalIngot, 3), 
                	new CraftingEntry(Blocks.PLANKS, 2))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.type81stock2) {
                        GL11.glTranslatef(-0.6F, 0F, 1.6F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.type81stock2) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.type81stock2) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Type81Stock2").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Type81Stock = new AttachmentBuilder<Weapon>()
        		.withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.type81stock(), "ak47.png")
                .withModernRecipe(
                	CraftingGroup.ATTACHMENT_MODIFICATION,
                	new CraftingEntry(MWCItems.gunmetalIngot, 3), 
                	new CraftingEntry(Blocks.PLANKS, 2))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.type81stock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.6F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.type81stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.type81stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Type81Stock").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Type81Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.type81handguard(), "ak47.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3), 
                    	new CraftingEntry(Blocks.PLANKS, 2))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.type81handguard) {
                        GL11.glTranslatef(-0.6F, 0.4F, -2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.type81handguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.type81handguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Type81Handguard").withTextureName("Dummy.png")
              .build(MWC.modContext);

        ScarLReceiverB = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.ScarReceiver(), "scarh.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ScarReceiver) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ScarReceiver) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ScarReceiver) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("ScarLReceiverB").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        ScarRetractableStockB = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.ScarShortStock(), "scarh.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ScarShortStock) {
                        GL11.glTranslatef(-0.6F, 0.3F, 0.8F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ScarShortStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ScarShortStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("ScarRetractableStockB").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Mk17UpperB = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Mk17Upper(), "scarh.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mk17Upper) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mk17Upper) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mk17Upper) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Mk17UpperB").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Mk20UpperB = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Mk20Upper(), "scarh.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mk20Upper) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mk20Upper) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mk20Upper) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Mk20UpperB").withTextureName("Dummy.png")
                .build(MWC.modContext);

        SCARSCUpperB = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.SCARSCUpper(), "scarh.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SCARSCUpper) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SCARSCUpper) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SCARSCUpper) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SCARSCUpperB").withTextureName("Dummy.png")
                .build(MWC.modContext);

        MK20StockB = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withRenderablePart()
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.MK20Stock(), "scarh.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.MK20Stock) {
                        GL11.glTranslatef(0.7F, -1.2F, 0.5F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.MK20Stock) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.MK20Stock) {
                        GL11.glTranslatef(0.6F, 0.3F, 0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);

                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.MK20Stock) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                })
                .withName("MK20StockB").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Mk17BodyB = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Mk17Body(), "scarh.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mk17Body) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mk17Body) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mk17Body) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Mk17BodyB").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Mk17CQCBodyB = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.ScarHCQC(), "scarh.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ScarHCQC) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ScarHCQC) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ScarHCQC) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Mk17CQCBodyB").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Mk20BodyB = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Mk20(), "scarh.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mk20) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mk20) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mk20) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Mk20BodyB").withTextureName("Dummy.png")
                .build(MWC.modContext);

        SCARSCBodyB = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.SCARSC(), "scarh.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SCARSC) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SCARSC) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SCARSC) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SCARSCBodyB").withTextureName("Dummy.png")
                .build(MWC.modContext);

        ScarLBodyB = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.ScarL(), "scarh.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ScarL) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ScarL) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ScarL) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("ScarLBodyB").withTextureName("Dummy.png")
                .build(MWC.modContext);

        ScarLCQCBodyB = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.ScarLCQC(), "scarh.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ScarLCQC) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ScarLCQC) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ScarLCQC) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("ScarLCQCBodyB").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Mk17Body = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Mk17Body(), "scarl.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mk17Body) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mk17Body) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mk17Body) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Mk17Body").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Mk17CQCBody = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.ScarHCQC(), "scarl.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ScarHCQC) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ScarHCQC) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ScarHCQC) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Mk17CQCBody").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Mk20Body = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Mk20(), "scarl.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mk20) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mk20) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mk20) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Mk20Body").withTextureName("Dummy.png")
                .build(MWC.modContext);

        SCARSCBody = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.SCARSC(), "scarl.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SCARSC) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SCARSC) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SCARSC) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SCARSCBody").withTextureName("Dummy.png")
                .build(MWC.modContext);

        ScarLBody = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.ScarL(), "scarl.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ScarL) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ScarL) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ScarL) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("ScarLBody").withTextureName("Dummy.png")
                .build(MWC.modContext);

        ScarLCQCBody = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.ScarLCQC(), "scarl.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ScarLCQC) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ScarLCQC) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ScarLCQC) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("ScarLCQCBody").withTextureName("Dummy.png")
                .build(MWC.modContext);

        FORT500Pump = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withRenderablePart()
                .withModel(new com.paneedah.mwc.models.FORT500Pump(), "fort500.png")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FORT500Pump) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FORT500Pump) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FORT500Pump) {
                        GL11.glTranslatef(0.6F, 0.6F, -2F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.75F, 0.75F, 0.75f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FORT500Pump) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FORT500Pump")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        FORT500Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FORT500Stock(), "fort500.png")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FORT500Stock) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FORT500Stock) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FORT500Stock) {
                        GL11.glTranslatef(0.6F, 0.5F, 1F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FORT500Stock) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FORT500Stock")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        FORT500Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FORT500Grip(), "fort500.png")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FORT500Grip) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FORT500Grip) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FORT500Grip) {
                        GL11.glTranslatef(0.6F, 0.2F, 0.2F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FORT500Grip) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("FORT500Grip")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        FORT500Barrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FORT500Barrel(), "fort500.png")
                .withModel(new com.paneedah.mwc.models.M9A1frontsight(), "gun.png")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FORT500Barrel) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    } else if (model instanceof com.paneedah.mwc.models.M9A1frontsight) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FORT500Barrel) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.paneedah.mwc.models.M9A1frontsight) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FORT500Barrel) {
                        GL11.glTranslatef(0.6F, 0.8F, -2.8F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.55F, 0.55F, 0.55f);
                    } else if (model instanceof com.paneedah.mwc.models.M9A1frontsight) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FORT500Barrel) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.M9A1frontsight) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withName("FORT500Barrel")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        FORT500MBarrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.FORT500MBarrel(), "fort500.png")
                .withModel(new com.paneedah.mwc.models.M9A1frontsight(), "gun.png")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FORT500MBarrel) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    } else if (model instanceof com.paneedah.mwc.models.M9A1frontsight) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FORT500MBarrel) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.paneedah.mwc.models.M9A1frontsight) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FORT500MBarrel) {
                        GL11.glTranslatef(0.6F, 0.8F, -2.8F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.55F, 0.55F, 0.55f);
                    } else if (model instanceof com.paneedah.mwc.models.M9A1frontsight) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.FORT500MBarrel) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.M9A1frontsight) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withName("FORT500MBarrel")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        GalilARMHandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.GalilHandGuard(), "ak47.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3), 
                    	new CraftingEntry(Blocks.PLANKS, 2))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.GalilHandGuard) {
                        GL11.glTranslatef(-0.6F, 0.4F, -2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.GalilHandGuard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.GalilHandGuard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("GalilARMHandGuard").withTextureName("Dummy.png")
              .build(MWC.modContext);

        GalilARMGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.GalilGrip(), "amd65.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2), 
                    	new CraftingEntry(Blocks.PLANKS, 1))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.GalilGrip) {
                        GL11.glTranslatef(-0.6F, -0.6F, 0.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.GalilGrip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.GalilGrip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("GalilARMGrip").withTextureName("Dummy.png")
                .build(MWC.modContext);

        GalilARMDustCover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.GalilDustCover(), "ak47.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.GalilDustCover) {
                        GL11.glTranslatef(-0.6F, 0.4F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.GalilDustCover) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.GalilDustCover) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("GalilARMDustCover").withTextureName("Dummy.png")
                .build(MWC.modContext);

        GalilStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.GalilStock(), "ak47.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 4))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.GalilStock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.6F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.GalilStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.GalilStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("GalilStock").withTextureName("Dummy.png")
                .build(MWC.modContext);

        SR3MPStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.SR3MPStock(), "sr3m.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3), 
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SR3MPStock) {
                    	GL11.glTranslatef(-0.6F, -0.6F, 1.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SR3MPStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SR3MPStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SR3MPStock").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Mini14WoodStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Mini14Stock(), "m14dmrwood.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 4), 
                    	new CraftingEntry(MWCItems.steelIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mini14Stock) {
                        GL11.glTranslatef(-0.6F, -0.2F, -0F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mini14Stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mini14Stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Mini14WoodStock").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Mini14WoodPRStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Mini14PRStock(), "m14dmrwood.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 4), 
                    	new CraftingEntry(MWCItems.steelIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mini14PRStock) {
                        GL11.glTranslatef(-0.6F, -0.2F, -0F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mini14PRStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mini14PRStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Mini14WoodPRStock").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Mini14WoodALTStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Mini14ALTStock(), "m14dmrwood.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 4), 
                    	new CraftingEntry(MWCItems.steelIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mini14ALTStock) {
                        GL11.glTranslatef(-0.6F, -0.2F, -0F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mini14ALTStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mini14ALTStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Mini14WoodALTStock").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Mini14GreenStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Mini14Stock(), "m14dmr.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 4), 
                    	new CraftingEntry(MWCItems.steelIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mini14Stock) {
                        GL11.glTranslatef(-0.6F, -0.2F, -0F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mini14Stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mini14Stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Mini14GreenStock").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Mini14GreenPRStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Mini14PRStock(), "m14dmr.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 4), 
                    	new CraftingEntry(MWCItems.steelIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mini14PRStock) {
                        GL11.glTranslatef(-0.6F, -0.2F, -0F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mini14PRStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mini14PRStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Mini14GreenPRStock").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Mini14GreenALTStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Mini14ALTStock(), "m14dmr.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 4), 
                    	new CraftingEntry(MWCItems.steelIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mini14ALTStock) {
                        GL11.glTranslatef(-0.6F, -0.2F, -0F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mini14ALTStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mini14ALTStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Mini14GreenALTStock").withTextureName("Dummy.png")
                .build(MWC.modContext);


        Mini14Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Mini14Stock(), "m14dmrblack.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 4), 
                    	new CraftingEntry(MWCItems.steelIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mini14Stock) {
                        GL11.glTranslatef(-0.6F, -0.2F, -0F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mini14Stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mini14Stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Mini14Stock").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Mini14PRStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Mini14PRStock(), "m14dmrblack.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 4), 
                    	new CraftingEntry(MWCItems.steelIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mini14PRStock) {
                        GL11.glTranslatef(-0.6F, -0.2F, -0F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mini14PRStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mini14PRStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Mini14PRStock").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Mini14ALTStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Mini14ALTStock(), "m14dmrblack.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 4), 
                    	new CraftingEntry(MWCItems.steelIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mini14ALTStock) {
                        GL11.glTranslatef(-0.6F, -0.2F, -0F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mini14ALTStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mini14ALTStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Mini14ALTStock").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Mini14Upper = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Mini14Upper(), "m14dmrblack.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3), 
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mini14Upper) {
                        GL11.glTranslatef(-0.6F, 0.4F, -2.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mini14Upper) {
                        GL11.glTranslatef(1.5F, -0.2F, 3F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Mini14Upper) {
                        GL11.glTranslatef(-1.5F, -2F, 1.5F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Mini14Upper").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Remington1100Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withRenderablePart()
                .withModel(new com.paneedah.mwc.models.Remington1100Handguard(), "remington870.png")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Remington1100Handguard) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Remington1100Handguard) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Remington1100Handguard) {
                        GL11.glTranslatef(0.6F, 0.6F, -2F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.75F, 0.75F, 0.75f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Remington1100Handguard) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("Remington1100Handguard")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        SVUStock = new AttachmentBuilder<Weapon>()
        		.withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.SVUStock(), "svustock.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 5), 
                    	new CraftingEntry(Blocks.PLANKS, 4))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SVUStock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.6F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SVUStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SVUStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SVUStock").withTextureName("Dummy.png")
                .build(MWC.modContext);
        

        SVUHG = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.SVUHG(), "svustock.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 5), 
                    	new CraftingEntry(Blocks.PLANKS, 4))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SVUHG) {
                        GL11.glTranslatef(-0.6F, 0.4F, -2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SVUHG) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SVUHG) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SVUHG").withTextureName("Dummy.png")
                .build(MWC.modContext);

        SVUGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.SVUGrip(), "svustock.png")
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SVUGrip) {
                        GL11.glTranslatef(-0.6F, -0.3F, 0.1F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SVUGrip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SVUGrip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SVUGrip").withTextureName("Dummy.png")
                .build(MWC.modContext);

        SVUSightsDown = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.SVUSightsDown(), "svustock")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SVUSightsDown) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SVUSightsDown) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SVUSightsDown) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    } 
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SVUSightsDown) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("SVUSightsDown")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        SVUSightsUp = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.SVUSightsUp(), "dragunovsvu")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SVUSightsUp) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SVUSightsUp) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SVUSightsUp) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    } 
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SVUSightsUp) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("SVUSightsUp")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        SVUSuppressor = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.SVUSuppressor(), "vssvintorez.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2), 
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SVUSuppressor) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SVUSuppressor) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SVUSuppressor) {
                        GL11.glTranslatef(0.6F, 1.3F, -5.3F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);

                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SVUSuppressor) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("SVUSuppressor")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        SilencerBizon = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Bizonsilencer(), "vssvintorez.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2), 
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Bizonsilencer) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Bizonsilencer) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Bizonsilencer) {
                        GL11.glTranslatef(0.6F, 1.3F, -5.3F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);

                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Bizonsilencer) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("SilencerBizon")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        ASh_12Lower = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.ASh_12Lower(), "ash12.png")
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ASh_12Lower) {
                        GL11.glTranslatef(-0.6F, 0.1F, 1.7F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ASh_12Lower) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ASh_12Lower) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("ASh_12Lower").withTextureName("Dummy.png")
                .build(MWC.modContext);


        ASh_12Silencer = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.ASh_12Silencer(), "ash12.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2), 
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ASh_12Silencer) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ASh_12Silencer) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ASh_12Silencer) {
                        GL11.glTranslatef(0.6F, 1.3F, -5.3F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);

                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ASh_12Silencer) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("ASh_12Silencer")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);


        ShAK_12Silencer = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.ShAK_12Silencer(), "ash12.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2), 
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ShAK_12Silencer) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ShAK_12Silencer) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ShAK_12Silencer) {
                        GL11.glTranslatef(0.6F, 1.3F, -5.3F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);

                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ShAK_12Silencer) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("ShAK_12Silencer")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);


        ASh_12MuzzleBrake = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.ASh_12MuzzleBrake(), "ash12")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ASh_12MuzzleBrake) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ASh_12MuzzleBrake) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ASh_12MuzzleBrake) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    } 
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ASh_12MuzzleBrake) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("ASh_12MuzzleBrake")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);


        ASh_12Upper = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.ASh_12Upper(), "ash12.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ASh_12Upper) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ASh_12Upper) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ASh_12Upper) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("ASh_12Upper").withTextureName("Dummy.png")
                .build(MWC.modContext);

        ASh_12Irons = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.ASh_12Irons(), "ash12.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ASh_12Irons) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ASh_12Irons) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ASh_12Irons) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("ASh_12Irons").withTextureName("Dummy.png")
                .build(MWC.modContext);

        ASh_12Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.ASh_12Handguard(), "ash12.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ASh_12Handguard) {
                        GL11.glTranslatef(-0.6F, 0.4F, -2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ASh_12Handguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ASh_12Handguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("ASh_12Handguard").withTextureName("Dummy.png")
                .build(MWC.modContext);

        PKMBarrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.PKMBarrel(), "pkm")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.PKMBarrel) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.PKMBarrel) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.PKMBarrel) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.PKMBarrel) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("PKMBarrel")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        PKMBipod = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.PKMBipod(), "pkm")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.PKMBipod) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.PKMBipod) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.PKMBipod) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.PKMBipod) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("PKMBipod")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        PKMStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.PKMStock(), "pkm")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.PKMStock) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.PKMStock) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.PKMStock) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.PKMStock) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("PKMStock")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);


        PKMGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.PKMGrip(), "pkm")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.PKMGrip) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.PKMGrip) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.PKMGrip) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.PKMGrip) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("PKMGrip")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);


        M84Barrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M84Barrel(), "pkm")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M84Barrel) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M84Barrel) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M84Barrel) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M84Barrel) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M84Barrel")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        PKPBarrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.PKPBarrel(), "pkm")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.PKPBarrel) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.PKPBarrel) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.PKPBarrel) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.PKPBarrel) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("PKPBarrel")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        PKPBipod = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.PKPBipod(), "pkm")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.PKPBipod) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.PKPBipod) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.PKPBipod) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.PKPBipod) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("PKPBipod")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        PKPStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.PKPStock(), "pkm")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.PKPStock) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.PKPStock) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.PKPStock) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.PKPStock) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("PKPStock")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        QBZ95Body = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QBZ95Body(), "qbz95")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ95Body) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ95Body) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ95Body) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ95Body) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QBZ95Body")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        QBZ97Body = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QBZ97Body(), "qbz97")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ97Body) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ97Body) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ97Body) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ97Body) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QBZ97Body")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        QBZ95Upper = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QBZ95Upper(), "qbz95")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ95Upper) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ95Upper) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ95Upper) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ95Upper) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QBZ95Upper")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        QBZ95Defender = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QBZ95Defender(), "qbz97")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ95Defender) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ95Defender) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ95Defender) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ95Defender) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QBZ95Defender")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        QBZ95Longbow = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QBZ95Longbow(), "qbz95")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ95Longbow) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ95Longbow) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ95Longbow) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ95Longbow) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QBZ95Longbow")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        QBZ95BLongbow = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QBZ95BLongbow(), "qbz95b")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ95BLongbow) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ95BLongbow) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ95BLongbow) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ95BLongbow) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QBZ95BLongbow")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        QBZ95Dustcover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QBZ95Dustcover (), "qbz95")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ95Dustcover ) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ95Dustcover ) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ95Dustcover ) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ95Dustcover ) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QBZ95Dustcover")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        QBZ95BDustcover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QBZ95BDustcover (), "qbz95b")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ95BDustcover ) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ95BDustcover ) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ95BDustcover ) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ95BDustcover ) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QBZ95BDustcover")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        QBB95Dustcover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QBB95Dustcover (), "qbb95")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBB95Dustcover ) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBB95Dustcover ) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBB95Dustcover ) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBB95Dustcover ) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QBB95Dustcover")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        QBZ95BBody = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QBZ95BBody(), "qbz95b")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ95BBody) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ95BBody) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ95BBody) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ95BBody) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QBZ95BBody")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        QBZ95BUpper = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QBZ95BUpper(), "qbz95b")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ95BUpper) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ95BUpper) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ95BUpper) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ95BUpper) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QBZ95BUpper")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        QBZ95BMuzzle = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QBZ95BMuzzle(), "qbz95b")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ95BMuzzle) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ95BMuzzle) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ95BMuzzle) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ95BMuzzle) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QBZ95BMuzzle")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        QBB95Body = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QBB95Body(), "qbb95")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBB95Body) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBB95Body) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBB95Body) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBB95Body) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QBB95Body")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        QBB95Upper = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QBB95Upper(), "qbb95")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBB95Upper) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBB95Upper) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBB95Upper) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBB95Upper) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QBB95Upper")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        QBB95Bipod = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QBB95Bipod(), "qbb95")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBB95Bipod) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBB95Bipod) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBB95Bipod) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBB95Bipod) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QBB95Bipod")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        AS_Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.AS_Stock(), "asval.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3), 
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.AS_Stock) {
                    	GL11.glTranslatef(-0.6F, -0.6F, 1.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.AS_Stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.AS_Stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AS_Stock").withTextureName("Dummy.png")
                .build(MWC.modContext);

        ASM_ValStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.ASM_ValStock(), "vssmmetal.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3), 
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ASM_ValStock) {
                    	GL11.glTranslatef(-0.6F, -0.6F, 1.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ASM_ValStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.ASM_ValStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("ASM_ValStock").withTextureName("Dummy.png")
                .build(MWC.modContext);

        AS_Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.AS_Grip(), "valplastic.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3), 
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.AS_Grip) {
                    	GL11.glTranslatef(-0.6F, -0.6F, 1.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.AS_Grip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.AS_Grip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AS_Grip").withTextureName("Dummy.png")
                .build(MWC.modContext);

        AS_GripPale = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.AS_Grip(), "vssmplastic.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3), 
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.AS_Grip) {
                    	GL11.glTranslatef(-0.6F, -0.6F, 1.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.AS_Grip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.AS_Grip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AS_GripPale").withTextureName("Dummy.png")
                .build(MWC.modContext);


        AS_GripBlack = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.AS_Grip(), "vssplastic.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3), 
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.AS_Grip) {
                    	GL11.glTranslatef(-0.6F, -0.6F, 1.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.AS_Grip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.AS_Grip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AS_GripBlack").withTextureName("Dummy.png")
                .build(MWC.modContext);

	AS_Dustcover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.AS_Dustcover(), "asval.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.AS_Dustcover) {
                        GL11.glTranslatef(-0.6F, 0.4F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.AS_Dustcover) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.AS_Dustcover) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AS_Dustcover").withTextureName("Dummy.png")
                .build(MWC.modContext);

	VSS_Dustcover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.VSS_Dustcover(), "vssmetal.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.VSS_Dustcover) {
                        GL11.glTranslatef(-0.6F, 0.4F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.VSS_Dustcover) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.VSS_Dustcover) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("VSS_Dustcover").withTextureName("Dummy.png")
                .build(MWC.modContext);

	SR3M_Dustcover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.SR3M_Dustcover(), "vssmetal.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SR3M_Dustcover) {
                        GL11.glTranslatef(-0.6F, 0.4F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SR3M_Dustcover) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SR3M_Dustcover) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SR3M_Dustcover").withTextureName("Dummy.png")
                .build(MWC.modContext);

        VSS_Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.VSS_Handguard(), "vssplastic.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.VSS_Handguard) {
                    	GL11.glTranslatef(-0.6F, 0.3F, -1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.VSS_Handguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.VSS_Handguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("VSS_Handguard").withTextureName("Dummy.png")
		.build(MWC.modContext);


        AS_Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.VSS_Handguard(), "valplastic.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.VSS_Handguard) {
                    	GL11.glTranslatef(-0.6F, 0.3F, -1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.VSS_Handguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.VSS_Handguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AS_Handguard").withTextureName("Dummy.png")
		.build(MWC.modContext);

        ASM_Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.VSS_Handguard(), "vssmplastic.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.VSS_Handguard) {
                    	GL11.glTranslatef(-0.6F, 0.3F, -1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.VSS_Handguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.VSS_Handguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("ASM_Handguard").withTextureName("Dummy.png")
		.build(MWC.modContext);

        VSS_Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.VSS_Stock(), "vssstocks.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3), 
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.VSS_Stock) {
                    	GL11.glTranslatef(-0.6F, -0.6F, 1.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.VSS_Stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.VSS_Stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("VSS_Stock").withTextureName("Dummy.png")
                .build(MWC.modContext);

        VSSKO_Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.VSSKO_Stock(), "vssstocks.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3), 
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.VSSKO_Stock) {
                    	GL11.glTranslatef(-0.6F, -0.6F, 1.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.VSSKO_Stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.VSSKO_Stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("VSSKO_Stock").withTextureName("Dummy.png")
                .build(MWC.modContext);

        VSSM_Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.VSSM_Stock(), "vssstocks.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3), 
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.VSSM_Stock) {
                    	GL11.glTranslatef(-0.6F, -0.6F, 1.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.VSSM_Stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.VSSM_Stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("VSSM_Stock").withTextureName("Dummy.png")
                .build(MWC.modContext);

        VSSM_StockM = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.VSSM_StockM(), "vssstocks.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3), 
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.VSSM_StockM) {
                    	GL11.glTranslatef(-0.6F, -0.6F, 1.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.VSSM_StockM) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.VSSM_StockM) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("VSSM_StockM").withTextureName("Dummy.png")
                .build(MWC.modContext);

	VSSM_VintorezDustcover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.VSSM_VintorezDustcover(), "vssmmetal.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.VSSM_VintorezDustcover) {
                        GL11.glTranslatef(-0.6F, 0.4F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.VSSM_VintorezDustcover) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.VSSM_VintorezDustcover) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("VSSM_VintorezDustcover").withTextureName("Dummy.png")
                .build(MWC.modContext);

        VSSM_VintorezRails = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.VSSM_VintorezRails(), "vssmmetal.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 4))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.VSSM_VintorezRails) {
                        GL11.glTranslatef(-0.6F, 0.4F, -2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.VSSM_VintorezRails) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.VSSM_VintorezRails) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("VSSM_VintorezRails").withTextureName("Dummy.png")
                .build(MWC.modContext);

        AA12Body = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.AA12Body(), "aa12.png")
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.AA12Body) {
                        GL11.glTranslatef(-0.6F, 0.1F, 1.7F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.AA12Body) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.AA12Body) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AA12Body").withTextureName("Dummy.png")
                .build(MWC.modContext);

        AA12Irons = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.AA12Irons(), "aa12.png")
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.AA12Irons) {
                        GL11.glTranslatef(-0.6F, 0.1F, 1.7F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.AA12Irons) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.AA12Irons) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AA12Irons").withTextureName("Dummy.png")
                .build(MWC.modContext);

        AA12RailMount = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.AA12RailMount(), "aa12.png")
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.AA12RailMount) {
                        GL11.glTranslatef(-0.6F, 0.1F, 1.7F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.AA12RailMount) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.AA12RailMount) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AA12RailMount").withTextureName("Dummy.png")
                .build(MWC.modContext);

        MicroUziGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.MicroUziGrip(), "microuzi.png")
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.MicroUziGrip) {
                        GL11.glTranslatef(-0.6F, -0.3F, 0.1F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.MicroUziGrip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.MicroUziGrip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MicroUziGrip").withTextureName("Dummy.png")
                .build(MWC.modContext);

        MicroUziStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.MicroUziStock(), "microuzi.png")
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.MicroUziStock) {
                        GL11.glTranslatef(-0.6F, 0.1F, 1.7F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.MicroUziStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.MicroUziStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MicroUziStock").withTextureName("Dummy.png")
                .build(MWC.modContext);

        MiniUziHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.MiniUziHandguard(), "miniuzi.png")
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.MiniUziHandguard) {
                        GL11.glTranslatef(-0.6F, 0.5F, -2.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.MiniUziHandguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.MiniUziHandguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })	
                .withName("MiniUziHandguard").withTextureName("Dummy.png")
                .build(MWC.modContext);

        MiniUziGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.MiniUziGrip(), "miniuzi.png")
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.MiniUziGrip) {
                        GL11.glTranslatef(-0.6F, -0.3F, 0.1F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.MiniUziGrip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.MiniUziGrip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MiniUziGrip").withTextureName("Dummy.png")
                .build(MWC.modContext);

        MiniUziStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.MiniUziStock(), "miniuzi.png")
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.MiniUziStock) {
                        GL11.glTranslatef(-0.6F, 0.1F, 1.7F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.MiniUziStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.MiniUziStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MiniUziStock").withTextureName("Dummy.png")
                .build(MWC.modContext);

        UziHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.UziHandguard(), "uzi.png")
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.UziHandguard) {
                        GL11.glTranslatef(-0.6F, 0.5F, -2.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.UziHandguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.UziHandguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })	
                .withName("UziHandguard").withTextureName("Dummy.png")
                .build(MWC.modContext);

        UziHandguardVert = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.UziHandguardVert(), "uzi.png")
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.UziHandguardVert) {
                        GL11.glTranslatef(-0.6F, 0.5F, -2.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.UziHandguardVert) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.UziHandguardVert) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })	
                .withName("UziHandguardVert").withTextureName("Dummy.png")
                .build(MWC.modContext);

        UziGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.UziGrip(), "uzi.png")
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.UziGrip) {
                        GL11.glTranslatef(-0.6F, -0.3F, 0.1F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.UziGrip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.UziGrip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("UziGrip").withTextureName("Dummy.png")
                .build(MWC.modContext);

        UziStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.UziStock(), "uzi.png")
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.UziStock) {
                        GL11.glTranslatef(-0.6F, 0.1F, 1.7F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.UziStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.UziStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("UziStock").withTextureName("Dummy.png")
                .build(MWC.modContext);

        UziStockFolded = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.UziStockFolded(), "uzi.png")
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.UziStockFolded) {
                        GL11.glTranslatef(-0.6F, 0.1F, 1.7F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.UziStockFolded) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.UziStockFolded) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("UziStockFolded").withTextureName("Dummy.png")
                .build(MWC.modContext);

        UziWoodStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.UziWoodStock(), "uzi.png")
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.UziWoodStock) {
                        GL11.glTranslatef(-0.6F, 0.1F, 1.7F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.UziWoodStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.UziWoodStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("UziWoodStock").withTextureName("Dummy.png")
                .build(MWC.modContext);

        UziSuppressor = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.UziSuppressor(), "uzi.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2), 
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.UziSuppressor) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.UziSuppressor) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.UziSuppressor) {
                        GL11.glTranslatef(0.6F, 1.3F, -5.3F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);

                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.UziSuppressor) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("UziSuppressor")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

QBZ03Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QBZ03_Handguard(), "qbz03.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3), 
                    	new CraftingEntry(Blocks.PLANKS, 2))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ03_Handguard) {
                        GL11.glTranslatef(-0.6F, 0.4F, -2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ03_Handguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ03_Handguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("QBZ03Handguard").withTextureName("Dummy.png")
              .build(MWC.modContext);

        QBZ03Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QBZ03_Grip(), "qbz03.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2), 
                    	new CraftingEntry(Blocks.PLANKS, 1))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ03_Grip) {
                        GL11.glTranslatef(-0.6F, -0.6F, 0.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ03_Grip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ03_Grip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("QBZ03Grip").withTextureName("Dummy.png")
                .build(MWC.modContext);

        QBZ03Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QBZ03_Stock(), "qbz03.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 4))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ03_Stock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.6F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ03_Stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ03_Stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("QBZ03Stock").withTextureName("Dummy.png")
                .build(MWC.modContext);

        QBZ03Upper = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QBZ03Upper(), "qbz03.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ03Upper) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ03Upper) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ03Upper) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("QBZ03Upper").withTextureName("Dummy.png")
                .build(MWC.modContext);

QBZ03_556Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QBZ03_556Handguard(), "qbz03_556.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3), 
                    	new CraftingEntry(Blocks.PLANKS, 2))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ03_556Handguard) {
                        GL11.glTranslatef(-0.6F, 0.4F, -2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ03_556Handguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ03_556Handguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("QBZ03_556Handguard").withTextureName("Dummy.png")
              .build(MWC.modContext);

        QBZ03_556Upper = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QBZ03_556Upper(), "qbz03_556.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ03_556Upper) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ03_556Upper) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ03_556Upper) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("QBZ03_556Upper").withTextureName("Dummy.png")
                .build(MWC.modContext);

        QBU88Body = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QBU88Body(), "qbu88.png")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBU88Body) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBU88Body) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBU88Body) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBU88Body) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QBU88Body")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        QBU97Body = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QBU97Body(), "qbu88.png")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBU97Body) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBU97Body) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBU97Body) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBU97Body) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QBU97Body")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        QBU88Dustcover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QBU88Dustcover(), "qbu88.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 4))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBU88Dustcover) {
                        GL11.glTranslatef(-0.6F, 0F, 1.6F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBU88Dustcover) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBU88Dustcover) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("QBU88Dustcover").withTextureName("Dummy.png")
                .build(MWC.modContext);

        QBU88Bipod = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QBU88Bipod(), "qbu88.png")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBU88Bipod) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBU88Bipod) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBU88Bipod) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBU88Bipod) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QBU88Bipod")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        QBU88IronsUpright = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QBU88IronsUpright(), "qbu88.png")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBU88IronsUpright) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBU88IronsUpright) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBU88IronsUpright) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBU88IronsUpright) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QBU88IronsUpright")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        QBU88IronsFolded = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QBU88IronsFolded(), "qbu88.png")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBU88IronsFolded) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBU88IronsFolded) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBU88IronsFolded) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBU88IronsFolded) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QBU88IronsFolded")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        QBU88IronsRailKit = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QBU88IronsRailKit(), "qbu88.png")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBU88IronsRailKit) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBU88IronsRailKit) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBU88IronsRailKit) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBU88IronsRailKit) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QBU88IronsRailKit")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        QBU88Upper = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QBU88Upper(), "qbu88.png")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBU88Upper) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBU88Upper) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBU88Upper) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBU88Upper) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QBU88Upper")

                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        QBU88RailKit = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
				.withRequiredAttachments(Attachments2.QBU88IronsRailKit)
                .withModel(new com.paneedah.mwc.models.QBU88RailKit(), "qbu88.png")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBU88RailKit) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBU88RailKit) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBU88RailKit) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBU88RailKit) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QBU88RailKit")

                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        Stoner63LMGBarrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Stoner63LMGBarrel(), "stoner63lmg.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Stoner63LMGBarrel) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Stoner63LMGBarrel) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Stoner63LMGBarrel) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Stoner63LMGBarrel").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Stoner63Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Stoner63Grip(), "stoner63lmg.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Stoner63Grip) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Stoner63Grip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Stoner63Grip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Stoner63Grip").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Stoner63Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Stoner63Handguard(), "stoner63lmg.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Stoner63Handguard) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Stoner63Handguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Stoner63Handguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Stoner63Handguard").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Stoner63Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Stoner63Stock(), "stoner63lmg.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Stoner63Stock) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Stoner63Stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Stoner63Stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Stoner63Stock").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Stoner63AutoRifleBarrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Stoner63AutoRifleBarrel(), "stoner63ar.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Stoner63AutoRifleBarrel) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Stoner63AutoRifleBarrel) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Stoner63AutoRifleBarrel) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Stoner63AutoRifleBarrel").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Stoner63PaintedGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Stoner63PaintedGrip(), "stoner63ar.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Stoner63PaintedGrip) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Stoner63PaintedGrip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Stoner63PaintedGrip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Stoner63PaintedGrip").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Stoner63PaintedHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Stoner63PaintedHandguard(), "stoner63ar.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Stoner63PaintedHandguard) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Stoner63PaintedHandguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Stoner63PaintedHandguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Stoner63PaintedHandguard").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Stoner63PaintedStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Stoner63PaintedStock(), "stoner63ar.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Stoner63PaintedStock) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Stoner63PaintedStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Stoner63PaintedStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Stoner63PaintedStock").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Stoner63RifleBarrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Stoner63RifleBarrel(), "stoner63r.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Stoner63RifleBarrel) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Stoner63RifleBarrel) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Stoner63RifleBarrel) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Stoner63RifleBarrel").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Stoner63CarbineBarrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Stoner63CarbineBarrel(), "stoner63r.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Stoner63CarbineBarrel) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Stoner63CarbineBarrel) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Stoner63CarbineBarrel) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Stoner63CarbineBarrel").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Stoner63RifleHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Stoner63RifleHandguard(), "stoner63r.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Stoner63RifleHandguard) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Stoner63RifleHandguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Stoner63RifleHandguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Stoner63RifleHandguard").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Stoner63StockFolding = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Stoner63StockFolding(), "stoner63r.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Stoner63StockFolding) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Stoner63StockFolding) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Stoner63StockFolding) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Stoner63StockFolding").withTextureName("Dummy.png")
                .build(MWC.modContext);
				
		QBZ97NSR_Body = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QBZ97NSR_Body(), "qbz97nsr")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ97NSR_Body) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ97NSR_Body) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ97NSR_Body) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ97NSR_Body) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QBZ97NSR_Body")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

		QBZ97NSRDustcover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QBZ97NSRDustcover(), "qbz97nsr")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ97NSRDustcover) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ97NSRDustcover) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ97NSRDustcover) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ97NSRDustcover) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QBZ97NSRDustcover")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

		QBZ97NSRUpper = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QBZ97NSRUpper(), "qbz97nsr")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ97NSRUpper) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ97NSRUpper) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ97NSRUpper) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ97NSRUpper) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QBZ97NSRUpper")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        QBU191Barrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QBU191Barrel(), "qbu191")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBU191Barrel) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBU191Barrel) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBU191Barrel) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBU191Barrel) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QBU191Barrel")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        QBZ191Barrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QBZ191Barrel(), "qbz191")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ191Barrel) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ191Barrel) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ191Barrel) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ191Barrel) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QBZ191Barrel")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        QBZ192Barrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QBZ192Barrel(), "qbz191")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ192Barrel) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ192Barrel) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ192Barrel) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ192Barrel) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QBZ192Barrel")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        QBU191Upper = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER2)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QBU191Upper(), "qbu191")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBU191Upper) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBU191Upper) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBU191Upper) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBU191Upper) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QBU191Upper")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        QBZ191Upper = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER2)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QBZ191Upper(), "qbz191")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ191Upper) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ191Upper) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ191Upper) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ191Upper) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QBZ191Upper")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        QBU191Lower = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QBU191(), "qbu191")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBU191) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBU191) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBU191) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBU191) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QBU191Lower")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        QBZ191Lower = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QBZ191(), "qbz191")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ191) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ191) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ191) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ191) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QBZ191Lower")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        QBU191Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QBU191Handguard(), "qbu191")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBU191Handguard) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBU191Handguard) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBU191Handguard) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBU191Handguard) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QBU191Handguard")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        QBZ191Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QBZ191Handguard(), "qbz191")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ191Handguard) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ191Handguard) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ191Handguard) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ191Handguard) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QBZ191Handguard")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        QBZ191Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QBZ191Stock(), "qbz191")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ191Stock) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ191Stock) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ191Stock) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ191Stock) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QBZ191Stock")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        QBZ191Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QBZ191Grip(), "qbz191")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ191Grip) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ191Grip) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ191Grip) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QBZ191Grip) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QBZ191Grip")
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

		QCW05Body = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QCW05Body(), "qcw05")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QCW05Body) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QCW05Body) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QCW05Body) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QCW05Body) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QCW05Body")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

		QCW05Dustcover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QCW05Dustcover(), "qcw05")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QCW05Dustcover) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QCW05Dustcover) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QCW05Dustcover) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QCW05Dustcover) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QCW05Dustcover")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

		QCW05Upper = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QCW05Upper(), "qcw05")
                .withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QCW05Upper) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QCW05Upper) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QCW05Upper) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    }
                }).withEntityModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QCW05Upper) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("QCW05Upper")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        QSZ92Slide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.ACTION)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QZS92Slide(), "qsz92.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QZS92Slide) {
                        GL11.glTranslatef(-0.6F, 0.2F, -0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QZS92Slide) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QZS92Slide) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("QSZ92Slide")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);

        QSW06Slide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.ACTION)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QSW06Slide(), "qsz92.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QSW06Slide) {
                        GL11.glTranslatef(-0.6F, 0.2F, -0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QSW06Slide) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QSW06Slide) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("QSW06Slide")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);

        QSZ92GSlide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.ACTION)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QSZ92GSlide(), "qsz92.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QSZ92GSlide) {
                        GL11.glTranslatef(-0.6F, 0.2F, -0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QSZ92GSlide) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QSZ92GSlide) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("QSZ92GSlide")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        QSZ92Body = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QSZ92Body(), "qsz92.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QSZ92Body) {
                        GL11.glTranslatef(-0.6F, -0.1F, -0.1F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QSZ92Body) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QSZ92Body) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("QSZ92Body")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);

        QSZ92GBody = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QSZ92GBody(), "qsz92.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QSZ92GBody) {
                        GL11.glTranslatef(-0.6F, -0.1F, -0.1F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QSZ92GBody) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QSZ92GBody) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("QSZ92GBody")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);

        QSW06Silencer = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QSW06Silencer(), "qsz92.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QSW06Silencer) {
                        GL11.glTranslatef(-0.6F, 0.2F, -0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QSW06Silencer) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QSW06Silencer) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("QSW06Silencer")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);

        QSW06Barrel = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QSW06Barrel(), "qsz92.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QSW06Barrel) {
                        GL11.glTranslatef(-0.6F, 0.2F, -0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QSW06Barrel) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QSW06Barrel) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("QSW06Barrel")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);

        QSZ92GBarrel = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QSZ92GBarrel(), "qsz92.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QSZ92GBarrel) {
                        GL11.glTranslatef(-0.6F, 0.2F, -0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QSZ92GBarrel) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QSZ92GBarrel) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("QSZ92GBarrel")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);

        QSZ92Barrel = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QZS92Barrel(), "qsz92.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QZS92Barrel) {
                        GL11.glTranslatef(-0.6F, 0.2F, -0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QZS92Barrel) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QZS92Barrel) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("QSZ92Barrel")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);

        QCW05Suppressor = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QCW05Suppressor(), "qcw05.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QCW05Suppressor) {
                        GL11.glTranslatef(-0.6F, 0.2F, -0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QCW05Suppressor) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QCW05Suppressor) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("QCW05Suppressor")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);

        QJY88Barrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QJY88Barrel(), "qjy88.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QJY88Barrel) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QJY88Barrel) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QJY88Barrel) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("QJY88Barrel").withTextureName("Dummy.png")
                .build(MWC.modContext);

        QJY88BarrelCustom = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QJY88BarrelCustom(), "qjy88.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QJY88BarrelCustom) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QJY88BarrelCustom) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QJY88BarrelCustom) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("QJY88BarrelCustom").withTextureName("Dummy.png")
                .build(MWC.modContext);

        QJY88Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QJY88Grip(), "qjy88.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QJY88Grip) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QJY88Grip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QJY88Grip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("QJY88Grip").withTextureName("Dummy.png")
                .build(MWC.modContext);

        QJY88Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QJY88Stock(), "qjy88.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QJY88Stock) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QJY88Stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QJY88Stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("QJY88Stock").withTextureName("Dummy.png")
                .build(MWC.modContext);

        QJY88Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QJY88Handguard(), "qjy88.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QJY88Handguard) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QJY88Handguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QJY88Handguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("QJY88Handguard").withTextureName("Dummy.png")
                .build(MWC.modContext);

        QJY88HandguardCustom = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.QJY88HandguardCustom(), "qjy88.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QJY88HandguardCustom) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QJY88HandguardCustom) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.QJY88HandguardCustom) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("QJY88HandguardCustom").withTextureName("Dummy.png")
                .build(MWC.modContext);

        LMG68Bracket = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.LMG68Bracket(), "lmg68.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LMG68Bracket) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LMG68Bracket) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LMG68Bracket) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("LMG68Bracket").withTextureName("Dummy.png")
                .build(MWC.modContext);

        LMG68Barrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.LMG68Barrel(), "lmg68.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LMG68Barrel) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LMG68Barrel) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LMG68Barrel) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("LMG68Barrel").withTextureName("Dummy.png")
                .build(MWC.modContext);

        LMG68Adapter = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCKADAPTER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.LMG68Adapter(), "lmg68.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LMG68Adapter) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LMG68Adapter) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LMG68Adapter) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("LMG68Adapter").withTextureName("Dummy.png")
                .build(MWC.modContext);

		LMG68Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.LMG68Stock(), "lmg68.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LMG68Stock) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LMG68Stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LMG68Stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("LMG68Stock").withTextureName("Dummy.png")
                .build(MWC.modContext);

		LMG68Lower = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.LMG68Lower(), "lmg68.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LMG68Lower) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LMG68Lower) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LMG68Lower) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("LMG68Lower").withTextureName("Dummy.png")
                .build(MWC.modContext);

		LMG68Upper = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER2)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.LMG68Upper(), "lmg68.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LMG68Upper) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LMG68Upper) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LMG68Upper) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("LMG68Upper").withTextureName("Dummy.png")
                .build(MWC.modContext);

		LMG68Tray = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILADAPTER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.LMG68Tray(), "lmg68.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LMG68Tray) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LMG68Tray) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LMG68Tray) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("LMG68Tray").withTextureName("Dummy.png")
                .build(MWC.modContext);

		LMG68Suppressor = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.LMG68Suppressor(), "lmg68.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LMG68Suppressor) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LMG68Suppressor) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.LMG68Suppressor) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("LMG68Suppressor").withTextureName("Dummy.png")
                .build(MWC.modContext);

        TavorX95Body = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.TavorX95Body(), "x95blk.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95Body) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95Body) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95Body) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("TavorX95Body").withTextureName("Dummy.png")
                .build(MWC.modContext);

        TavorX95BodyTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.TavorX95Body(), "x95tan.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95Body) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95Body) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95Body) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("TavorX95BodyTan").withTextureName("Dummy.png")
                .build(MWC.modContext);

        TavorMTAR21Body = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.TavorMTAR21Body(), "mtar21.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorMTAR21Body) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorMTAR21Body) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorMTAR21Body) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("TavorMTAR21Body").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Tavor21Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Tavor21Stock(), "tar21.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Tavor21Stock) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Tavor21Stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Tavor21Stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Tavor21Stock").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Tavor21Cover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER2)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Tavor21Cover(), "tar21.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Tavor21Cover) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Tavor21Cover) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Tavor21Cover) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Tavor21Cover").withTextureName("Dummy.png")
                .build(MWC.modContext);

        TavorX95Upper = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.TavorX95Upper(), "x95blk.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95Upper) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95Upper) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95Upper) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("TavorX95Upper").withTextureName("Dummy.png")
                .build(MWC.modContext);

        TavorX95UpperSBR = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.TavorX95UpperSBR(), "x95blk.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95UpperSBR) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95UpperSBR) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95UpperSBR) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("TavorX95UpperSBR").withTextureName("Dummy.png")
                .build(MWC.modContext);

        TavorMTAR21Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
				.withRequiredAttachments(Attachments2.TavorMTAR21Body)
                .withModel(new com.paneedah.mwc.models.TavorMTAR21Handguard(), "mtar21.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorMTAR21Handguard) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorMTAR21Handguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorMTAR21Handguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("TavorMTAR21Handguard").withTextureName("Dummy.png")
                .build(MWC.modContext);

        TavorX95BarrelAR = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.TavorX95BarrelAR(), "x95blk.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95BarrelAR) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95BarrelAR) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95BarrelAR) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("TavorX95BarrelAR").withTextureName("Dummy.png")
                .build(MWC.modContext);

        TavorX95BarrelCarbine = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.TavorX95BarrelCarbine(), "x95blk.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95BarrelCarbine) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95BarrelCarbine) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95BarrelCarbine) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("TavorX95BarrelCarbine").withTextureName("Dummy.png")
                .build(MWC.modContext);

        TavorX95BarrelSBR = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(MWC.AttachmentsTab)
				.withRequiredAttachments(Attachments2.TavorX95UpperSBR)
                .withModel(new com.paneedah.mwc.models.TavorX95BarrelSBR(), "x95blk.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95BarrelSBR) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95BarrelSBR) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95BarrelSBR) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("TavorX95BarrelSBR").withTextureName("Dummy.png")
                .build(MWC.modContext);

        TavorX95BarrelSBRBayonet = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(MWC.AttachmentsTab)
				.withRequiredAttachments(Attachments2.TavorX95UpperSBR)
                .withModel(new com.paneedah.mwc.models.TavorX95BarrelSBRBayonet(), "x95blk.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95BarrelSBRBayonet) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95BarrelSBRBayonet) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95BarrelSBRBayonet) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("TavorX95BarrelSBRBayonet").withTextureName("Dummy.png")
                .build(MWC.modContext);

        TavorMTAR21Barrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(MWC.AttachmentsTab)
				.withRequiredAttachments(Attachments2.TavorMTAR21Handguard)
                .withModel(new com.paneedah.mwc.models.TavorMTAR21Barrel(), "mtar21.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorMTAR21Barrel) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorMTAR21Barrel) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorMTAR21Barrel) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("TavorMTAR21Barrel").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Tavor21BarrelAR = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Tavor21BarrelAR(), "tar21.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Tavor21BarrelAR) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Tavor21BarrelAR) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Tavor21BarrelAR) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Tavor21BarrelAR").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Tavor21BarrelSBR = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BARREL)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Tavor21BarrelSBR(), "tar21.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Tavor21BarrelSBR) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Tavor21BarrelSBR) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Tavor21BarrelSBR) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Tavor21BarrelSBR").withTextureName("Dummy.png")
                .build(MWC.modContext);

        TavorX95RCB_AR = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.TavorX95RCB_AR(), "x95blk.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95RCB_AR) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95RCB_AR) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95RCB_AR) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("TavorX95RCB_AR").withTextureName("Dummy.png")
                .build(MWC.modContext);

        TavorX95RCS_AR = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.TavorX95RCS_AR(), "x95blk.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95RCS_AR) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95RCS_AR) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95RCS_AR) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("TavorX95RCS_AR").withTextureName("Dummy.png")
                .build(MWC.modContext);

        TavorX95RCB_SBR = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.TavorX95RCB_SBR(), "x95blk.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95RCB_SBR) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95RCB_SBR) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95RCB_SBR) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("TavorX95RCB_SBR").withTextureName("Dummy.png")
                .build(MWC.modContext);

        TavorX95RCS_SBR = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.TavorX95RCS_SBR(), "x95blk.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95RCS_SBR) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95RCS_SBR) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95RCS_SBR) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("TavorX95RCS_SBR").withTextureName("Dummy.png")
                .build(MWC.modContext);

        TavorX95RCB_ARTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.TavorX95RCB_AR(), "x95tan.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95RCB_AR) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95RCB_AR) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95RCB_AR) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("TavorX95RCB_ARTan").withTextureName("Dummy.png")
                .build(MWC.modContext);

        TavorX95RCS_ARTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.TavorX95RCS_AR(), "x95tan.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95RCS_AR) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95RCS_AR) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95RCS_AR) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("TavorX95RCS_ARTan").withTextureName("Dummy.png")
                .build(MWC.modContext);

        TavorX95RCB_SBRTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.TavorX95RCB_SBR(), "x95tan.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95RCB_SBR) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95RCB_SBR) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95RCB_SBR) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("TavorX95RCB_SBRTan").withTextureName("Dummy.png")
                .build(MWC.modContext);

        TavorX95RCS_SBRTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.TavorX95RCS_SBR(), "x95tan.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95RCS_SBR) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95RCS_SBR) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95RCS_SBR) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("TavorX95RCS_SBRTan").withTextureName("Dummy.png")
                .build(MWC.modContext);

        TavorMTAR21LowerRail = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
				.withRequiredAttachments(Attachments2.TavorMTAR21Handguard)
                .withModel(new com.paneedah.mwc.models.TavorMTAR21LowerRail(), "mtar21.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorMTAR21LowerRail) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorMTAR21LowerRail) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorMTAR21LowerRail) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("TavorMTAR21LowerRail").withTextureName("Dummy.png")
                .build(MWC.modContext);

        TavorMTAR21RailMount = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(MWC.AttachmentsTab)
				.withRequiredAttachments(Attachments2.TavorMTAR21Handguard)
                .withModel(new com.paneedah.mwc.models.TavorMTAR21RailMount(), "mtar21.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorMTAR21RailMount) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorMTAR21RailMount) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorMTAR21RailMount) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("TavorMTAR21RailMount").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Tavor21Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Tavor21Handguard(), "tar21.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Tavor21Handguard) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Tavor21Handguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Tavor21Handguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Tavor21Handguard").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Tavor21LowerRail = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(MWC.AttachmentsTab)
				.withRequiredAttachments(Attachments2.Tavor21Handguard)
                .withModel(new com.paneedah.mwc.models.Tavor21LowerRail(), "tar21.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Tavor21LowerRail) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Tavor21LowerRail) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Tavor21LowerRail) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Tavor21LowerRail").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Tavor21SideRail = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Tavor21SideRail(), "tar21.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Tavor21SideRail) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Tavor21SideRail) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Tavor21SideRail) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Tavor21SideRail").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Tavor21SightBase = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILADAPTER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Tavor21Sightbase(), "tar21.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Tavor21Sightbase) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Tavor21Sightbase) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Tavor21Sightbase) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Tavor21SightBase").withTextureName("Dummy.png")
                .build(MWC.modContext);

        TavorX95GripAR = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.TavorX95GripAR(), "x95blk.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95GripAR) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95GripAR) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95GripAR) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("TavorX95GripAR").withTextureName("Dummy.png")
                .build(MWC.modContext);

        TavorX95GripSBR = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.TavorX95GripSBR(), "x95blk.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95GripSBR) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95GripSBR) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95GripSBR) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("TavorX95GripSBR").withTextureName("Dummy.png")
                .build(MWC.modContext);

        TavorMTAR21Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.TavorMTAR21Grip(), "mtar21.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorMTAR21Grip) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorMTAR21Grip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorMTAR21Grip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("TavorMTAR21Grip").withTextureName("Dummy.png")
                .build(MWC.modContext);

        TavorX95GripARTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.TavorX95GripAR(), "x95tan.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95GripAR) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95GripAR) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95GripAR) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("TavorX95GripARTan").withTextureName("Dummy.png")
                .build(MWC.modContext);

        TavorX95GripSBRTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.TavorX95GripSBR(), "x95tan.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95GripSBR) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95GripSBR) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorX95GripSBR) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("TavorX95GripSBRTan").withTextureName("Dummy.png")
                .build(MWC.modContext);

        TavorMTAR21SightBase = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(MWC.AttachmentsTab)
				.withRequiredAttachments(Attachments2.TavorMTAR21Handguard)
                .withModel(new com.paneedah.mwc.models.TavorMTAR21SightBase(), "mtar21.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorMTAR21SightBase) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorMTAR21SightBase) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorMTAR21SightBase) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("TavorMTAR21SightBase").withTextureName("Dummy.png")
                .build(MWC.modContext);

        TavorMTAR21Sights = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.AttachmentsTab)
				.withRequiredAttachments(Attachments2.TavorMTAR21SightBase)
                .withModel(new com.paneedah.mwc.models.TavorMTAR21Sights(), "mtar21.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorMTAR21Sights) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorMTAR21Sights) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.TavorMTAR21Sights) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("TavorMTAR21Sights").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Tavor21SightsUpright = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.AttachmentsTab)
				.withRequiredAttachments(Attachments2.Tavor21SightBase)
                .withModel(new com.paneedah.mwc.models.Tavor21SightsUpright(), "tar21.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Tavor21SightsUpright) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Tavor21SightsUpright) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Tavor21SightsUpright) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Tavor21SightsUpright").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Tavor21SightsFolded = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Tavor21SightsFolded(), "tar21.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Tavor21SightsFolded) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Tavor21SightsFolded) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Tavor21SightsFolded) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Tavor21SightsFolded").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Tavor21RailedUpper = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILADAPTER)
                .withCreativeTab(MWC.AttachmentsTab)
				.withRequiredAttachments(Attachments2.Tavor21SightsFolded)
                .withModel(new com.paneedah.mwc.models.Tavor21RailedUpper(), "tar21.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Tavor21RailedUpper) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Tavor21RailedUpper) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Tavor21RailedUpper) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Tavor21RailedUpper").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Type20Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Type20Handguard(), "type20.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Type20Handguard) {
                        GL11.glTranslatef(-0.6F, 0.5F, -1.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Type20Handguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Type20Handguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Type20Handguard").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Type20HandguardTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Type20Handguard(), "type20tan.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Type20Handguard) {
                        GL11.glTranslatef(-0.6F, 0.5F, -1.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Type20Handguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Type20Handguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Type20HandguardTan").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Type20Cover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Type20Cover(), "type20.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Type20Cover) {
                        GL11.glTranslatef(-0.6F, 0.5F, -1.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Type20Cover) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Type20Cover) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Type20Cover").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Type20Receiver = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Type20Upper(), "type20.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Type20Upper) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Type20Upper) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Type20Upper) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Type20Receiver").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Type20ReceiverTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Type20Upper(), "type20tan.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Type20Upper) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Type20Upper) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Type20Upper) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Type20ReceiverTan").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Type20Lower = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER2)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Type20Lower(), "type20.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Type20Lower) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Type20Lower) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Type20Lower) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Type20Lower").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Type20LowerTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER2)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Type20Lower(), "type20tan.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Type20Lower) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Type20Lower) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Type20Lower) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Type20LowerTan").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Type20Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Type20Stock(), "type20.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Type20Stock) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Type20Stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Type20Stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Type20Stock").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Type20StockTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.Type20Stock(), "type20tan.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Type20Stock) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Type20Stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.Type20Stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Type20StockTan").withTextureName("Dummy.png")
                .build(MWC.modContext);

        SteyrSPPGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER2)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.SteyrSPPGrip(), "steyr_spp.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SteyrSPPGrip) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SteyrSPPGrip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SteyrSPPGrip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SteyrSPPGrip").withTextureName("Dummy.png")
                .build(MWC.modContext);

        SteyrTMPGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER2)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.SteyrTMPGrip(), "steyr_spp.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SteyrTMPGrip) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SteyrTMPGrip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SteyrTMPGrip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SteyrTMPGrip").withTextureName("Dummy.png")
                .build(MWC.modContext);

        SteyrTMPUpper = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.SteyrTMPUpper(), "steyr_spp.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SteyrTMPUpper) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SteyrTMPUpper) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SteyrTMPUpper) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SteyrTMPUpper").withTextureName("Dummy.png")
                .build(MWC.modContext);

        SteyrTMPStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.SteyrTMPStock(), "steyr_spp.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SteyrTMPStock) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SteyrTMPStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SteyrTMPStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SteyrTMPStock").withTextureName("Dummy.png")
                .build(MWC.modContext);

        SteyrTMPOpticRail = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.SteyrTMPOpticRail(), "steyr_spp.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SteyrTMPOpticRail) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SteyrTMPOpticRail) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SteyrTMPOpticRail) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SteyrTMPOpticRail").withTextureName("Dummy.png")
                .build(MWC.modContext);

        SteyrTMPSuppressor = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.SteyrTMPSuppressor(), "steyr_spp.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SteyrTMPSuppressor) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SteyrTMPSuppressor) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.SteyrTMPSuppressor) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SteyrTMPSuppressor").withTextureName("Dummy.png")
                .build(MWC.modContext);

        BundT_MP9SDLong = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.BundT_MP9SDLong(), "mp9black.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.BundT_MP9SDLong) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.BundT_MP9SDLong) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.BundT_MP9SDLong) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("BundT_MP9SDLong").withTextureName("Dummy.png")
                .build(MWC.modContext);

        BundT_MP9SDShort = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.BundT_MP9SDShort(), "mp9black.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.BundT_MP9SDShort) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.BundT_MP9SDShort) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.BundT_MP9SDShort) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("BundT_MP9SDShort").withTextureName("Dummy.png")
                .build(MWC.modContext);

        BundT_MP9Lower = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER2)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.BundT_MP9Lower(), "mp9black.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.BundT_MP9Lower) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.BundT_MP9Lower) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.BundT_MP9Lower) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("BundT_MP9Lower").withTextureName("Dummy.png")
                .build(MWC.modContext);

        BundT_MP9Upper = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.BundT_MP9Upper(), "mp9black.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.BundT_MP9Upper) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.BundT_MP9Upper) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.BundT_MP9Upper) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("BundT_MP9Upper").withTextureName("Dummy.png")
                .build(MWC.modContext);

        BundT_MP9VertGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.BundT_MP9VertGrip(), "mp9black.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.BundT_MP9VertGrip) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.BundT_MP9VertGrip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.BundT_MP9VertGrip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("BundT_MP9VertGrip").withTextureName("Dummy.png")
                .build(MWC.modContext);

        BundT_MP9Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCKADAPTER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.BundT_MP9Stock(), "mp9black.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.BundT_MP9Stock) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.BundT_MP9Stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.BundT_MP9Stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("BundT_MP9Stock").withTextureName("Dummy.png")
                .build(MWC.modContext);

        BundT_MP9SideRail = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.BundT_MP9SideRail(), "mp9black.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.BundT_MP9SideRail) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.BundT_MP9SideRail) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.BundT_MP9SideRail) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("BundT_MP9SideRail").withTextureName("Dummy.png")
                .build(MWC.modContext);

        BundT_MP9SDLongST = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.BundT_MP9SDLong(), "mp9stormtrooper.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.BundT_MP9SDLong) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.BundT_MP9SDLong) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.BundT_MP9SDLong) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("BundT_MP9SDLongST").withTextureName("Dummy.png")
                .build(MWC.modContext);

        BundT_MP9SDShortST = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.BundT_MP9SDShort(), "mp9stormtrooper.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.BundT_MP9SDShort) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.BundT_MP9SDShort) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.BundT_MP9SDShort) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("BundT_MP9SDShortST").withTextureName("Dummy.png")
                .build(MWC.modContext);

        BundT_MP9LowerST = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER2)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.BundT_MP9Lower(), "mp9stormtrooper.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.BundT_MP9Lower) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.BundT_MP9Lower) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.BundT_MP9Lower) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("BundT_MP9LowerST").withTextureName("Dummy.png")
                .build(MWC.modContext);

        BundT_MP9UpperST = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.BundT_MP9Upper(), "mp9stormtrooper.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.BundT_MP9Upper) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.BundT_MP9Upper) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.BundT_MP9Upper) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("BundT_MP9UpperST").withTextureName("Dummy.png")
                .build(MWC.modContext);

        BundT_MP9VertGripST = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.BundT_MP9VertGrip(), "mp9stormtrooper.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.BundT_MP9VertGrip) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.BundT_MP9VertGrip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.BundT_MP9VertGrip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("BundT_MP9VertGripST").withTextureName("Dummy.png")
                .build(MWC.modContext);

        BundT_MP9SDLongAG = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.BundT_MP9SDLong(), "mp9alpgreen.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.BundT_MP9SDLong) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.BundT_MP9SDLong) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.BundT_MP9SDLong) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("BundT_MP9SDLongAG").withTextureName("Dummy.png")
                .build(MWC.modContext);

        BundT_MP9SDShortAG = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.BundT_MP9SDShort(), "mp9alpgreen.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.BundT_MP9SDShort) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.BundT_MP9SDShort) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.BundT_MP9SDShort) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("BundT_MP9SDShortAG").withTextureName("Dummy.png")
                .build(MWC.modContext);

        BundT_MP9LowerAG = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER2)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.BundT_MP9Lower(), "mp9alpgreen.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.BundT_MP9Lower) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.BundT_MP9Lower) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.BundT_MP9Lower) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("BundT_MP9LowerAG").withTextureName("Dummy.png")
                .build(MWC.modContext);

        BundT_MP9UpperAG = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.BundT_MP9Upper(), "mp9alpgreen.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.BundT_MP9Upper) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.BundT_MP9Upper) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.BundT_MP9Upper) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("BundT_MP9UpperAG").withTextureName("Dummy.png")
                .build(MWC.modContext);

        BundT_MP9VertGripAG = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.BundT_MP9VertGrip(), "mp9alpgreen.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.BundT_MP9VertGrip) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.BundT_MP9VertGrip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.BundT_MP9VertGrip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("BundT_MP9VertGripAG").withTextureName("Dummy.png")
                .build(MWC.modContext);

        OSV96Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCKADAPTER)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.OSV96Stock(), "osv96.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.OSV96Stock) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.OSV96Stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.OSV96Stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("OSV96Stock").withTextureName("Dummy.png")
                .build(MWC.modContext);

        OSV96Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.OSV96Grip(), "osv96.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.OSV96Grip) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.OSV96Grip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.OSV96Grip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("OSV96Grip").withTextureName("Dummy.png")
                .build(MWC.modContext);

        OSV96SightsDown = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.OSV96SightsDown(), "osv96.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.OSV96SightsDown) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.OSV96SightsDown) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.OSV96SightsDown) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("OSV96SightsDown").withTextureName("Dummy.png")
                .build(MWC.modContext);

        OSV96SightsUp = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.OSV96SightsUp(), "osv96.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.OSV96SightsUp) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.OSV96SightsUp) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.OSV96SightsUp) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("OSV96SightsUp").withTextureName("Dummy.png")
                .build(MWC.modContext);

        M1GarandStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M1GarandStock(), "m1garand.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 4), 
                    	new CraftingEntry(MWCItems.steelIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M1GarandStock) {
                        GL11.glTranslatef(-0.6F, -0.2F, -0F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M1GarandStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M1GarandStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M1GarandStock").withTextureName("Dummy.png")
                .build(MWC.modContext);

        M1GarandStockT26 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M1GarandStockT26(), "m1garand.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 4), 
                    	new CraftingEntry(MWCItems.steelIngot, 3))
                .withInventoryModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M1GarandStockT26) {
                        GL11.glTranslatef(-0.6F, -0.2F, -0F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M1GarandStockT26) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning(model -> {
                    if (model instanceof com.paneedah.mwc.models.M1GarandStockT26) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M1GarandStockT26").withTextureName("Dummy.png")
                .build(MWC.modContext);
    }
}