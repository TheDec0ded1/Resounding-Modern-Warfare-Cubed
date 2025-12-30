package com.paneedah.mwc.wearables;

import com.paneedah.mwc.ModernWarfareMod;
import com.paneedah.weaponlib2.CustomArmor;
import com.paneedah.weaponlib2.CustomArmor.Builder;
import com.paneedah.weaponlib2.ModContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class Armors {
	
	// realistic armors
	public static Item JPNVG18helmet;
	
	// armors

    public static Item Marinechest;
    public static Item Marineboots;
    public static Item Marinehelmet;
    
    public static Item Urbanchest;
    public static Item Urbanboots;
    public static Item Urbanhelmet;

    public static Item ForestAltchest;
    public static Item ForestAltboots;
    public static Item ForestAlthelmet;
    
    public static Item Blackcamochest;
    
    public static Item Forestchest;
    
    public static Item BlackJeansboots;
    public static Item KhakiJeansboots;
    
    public static Item Ghilliechest;
    public static Item Ghillieboots;
    public static Item Ghilliehelmet;
    
    public static CustomArmor GasMaskM40;
    
    public static Item Spetznazchest;
    public static Item Spetznazboots;
    public static Item Spetznazhelmet;
    
    public static Item Swatchest;
    public static Item Swatboots;
    public static Item Swathelmet;
    
    public static Item Tacticalhelmet;
    
    public static Item SpecOpschest;
    public static Item SpecOpsboots;
    public static Item SpecOpshelmet;
    
    public static Item Juggernautchest;
    public static Item Juggernautboots;
    public static Item Juggernauthelmet;
    
    public static Item Santachest;
    public static Item Santaboots;
    public static Item Santahelmet;

    public static Item OldUniformchest;
    public static Item OldUniformboots;

    public static Item dClasschest;
    public static Item dClassboots;

    public static Item scpGuardchest;
    public static Item scpGuardboots;
    public static Item scpGuardhelmet;

    public static Item flecktarnchest;
    public static Item flecktarnboots;
    public static Item flecktarnhelmet;

    public static Item ratnikAridchest;
    public static Item ratnikAridboots;
    public static Item ratnikAridhelmet;

    public static Item ratnikMountainchest;
    public static Item ratnikMountainboots;
    public static Item ratnikMountainhelmet;

    public static Item ratnikArcticchest;
    public static Item ratnikArcticboots;
    public static Item ratnikArctichelmet;

    public static Item ratnikDesertchest;
    public static Item ratnikDesertboots;
    public static Item ratnikDeserthelmet;

    public static Item ratnikSteppechest;
    public static Item ratnikSteppeboots;
    public static Item ratnikSteppehelmet;

    public static Item SOBRchest;
    public static Item SOBRboots;
    public static Item SOBRhelmet;
    
    static ArmorMaterial Juggernaut = EnumHelper.addArmorMaterial("Juggernaut", "Juggernaut", 20, new int[] { 5, 6, 2, 5}, 20, null, 0);
    static ArmorMaterial Marine = EnumHelper.addArmorMaterial("Marine", "Marine", 60, new int[] { 2, 3, 3, 3 }, 15, null, 0);

    public static void init(Object mod, ModContext modContext) {
        Builder marineArmorBuilder = new CustomArmor.Builder()
    			.withMaterial(Armors.Marine)
                .withUnlocalizedName("Marine")
                .withTextureName("USMC")
                .withModelClass("com.paneedah.mwc.models.USMC")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.Marinehelmet = marineArmorBuilder.buildHelmet(modContext);
        Armors.Marinechest = marineArmorBuilder.buildChest(modContext.isClient());
        Armors.Marineboots = marineArmorBuilder.buildBoots(modContext.isClient());
        
        Builder specopsArmorBuilder = new CustomArmor.Builder()
        		.withMaterial(Armors.Marine)
                .withUnlocalizedName("Spec_Ops")
                .withTextureName("militaryuniformblack")
                .withModelClass("com.paneedah.mwc.models.SpecOps")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.SpecOpshelmet = specopsArmorBuilder.buildHelmet(modContext);
        Armors.SpecOpschest = specopsArmorBuilder.buildChest(modContext.isClient());
        Armors.SpecOpsboots = specopsArmorBuilder.buildBoots(modContext.isClient());
        
        Builder spetznazArmorBuilder = new CustomArmor.Builder()
        		.withMaterial(Armors.Marine)
                .withCreativeTab(ModernWarfareMod.ArmorTab)
                .withUnlocalizedName("Spetznaz")
                .withTextureName("militaryuniformforest")
                .withModelClass("com.paneedah.mwc.models.USMC")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.Spetznazhelmet = spetznazArmorBuilder.buildHelmet(modContext);
        Armors.Spetznazchest = spetznazArmorBuilder.buildChest(modContext.isClient());
        Armors.Spetznazboots = spetznazArmorBuilder.buildBoots(modContext.isClient());
        
        Builder urbanArmorBuilder = new CustomArmor.Builder()
        		.withMaterial(Armors.Marine)
                .withCreativeTab(ModernWarfareMod.ArmorTab)
                .withUnlocalizedName("Urban")
                .withTextureName("militaryuniformurban")
                .withModelClass("com.paneedah.mwc.models.USMC")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.Urbanhelmet = urbanArmorBuilder.buildHelmet(modContext);
        Armors.Urbanchest = urbanArmorBuilder.buildChest(modContext.isClient());
        Armors.Urbanboots = urbanArmorBuilder.buildBoots(modContext.isClient());

        Builder forestaltArmorBuilder = new CustomArmor.Builder()
        		.withMaterial(Armors.Marine)
                .withCreativeTab(ModernWarfareMod.ArmorTab)
                .withUnlocalizedName("ForestAlt")
                .withTextureName("militaryuniformforestalt")
                .withModelClass("com.paneedah.mwc.models.USMC")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.ForestAlthelmet = forestaltArmorBuilder.buildHelmet(modContext);
        Armors.ForestAltchest = forestaltArmorBuilder.buildChest(modContext.isClient());
        Armors.ForestAltboots = forestaltArmorBuilder.buildBoots(modContext.isClient());
        
        Builder multicamoblackArmorBuilder = new CustomArmor.Builder()
        		.withMaterial(Armors.Marine)
                .withCreativeTab(ModernWarfareMod.ArmorTab)
                .withUnlocalizedName("blackcamo")
                .withTextureName("multicamoblackshirt")
                .withModelClass("com.paneedah.mwc.models.MultiCamoBlackShirt")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.Blackcamochest = multicamoblackArmorBuilder.buildChest(modContext.isClient());
        
        Builder forestArmorBuilder = new CustomArmor.Builder()
        		.withMaterial(Armors.Marine)
                .withCreativeTab(ModernWarfareMod.ArmorTab)
                .withUnlocalizedName("forest")
                .withTextureName("militaryshirtforest")
                .withModelClass("com.paneedah.mwc.models.MultiCamoBlackShirt")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.Forestchest = forestArmorBuilder.buildChest(modContext.isClient());
        
        Builder blackjeansArmorBuilder = new CustomArmor.Builder()
        		.withMaterial(Armors.Marine)
                .withCreativeTab(ModernWarfareMod.ArmorTab)
                .withUnlocalizedName("blackjeans")
                .withTextureName("blackjeans")
                .withModelClass("com.paneedah.mwc.models.Jeans")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.BlackJeansboots = blackjeansArmorBuilder.buildBoots(modContext.isClient());
        
        Builder khakijeansArmorBuilder = new CustomArmor.Builder()
        		.withMaterial(Armors.Marine)
                .withCreativeTab(ModernWarfareMod.ArmorTab)
                .withUnlocalizedName("khakijeans")
                .withTextureName("khakijeans")
                .withModelClass("com.paneedah.mwc.models.Jeans")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.KhakiJeansboots = khakijeansArmorBuilder.buildBoots(modContext.isClient());
        
        Builder santaArmorBuilder = new CustomArmor.Builder()
        		.withMaterial(Armors.Marine)
                .withUnlocalizedName("Santa")
                .withTextureName("santasuit_normal")
                .withModelClass("com.paneedah.mwc.models.SantasuitNormal")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.Santahelmet = santaArmorBuilder.buildHelmet(modContext);
        Armors.Santachest = santaArmorBuilder.buildChest(modContext.isClient());
        Armors.Santaboots = santaArmorBuilder.buildBoots(modContext.isClient());
        
        
        Builder juggernautsuitArmorBuilder = new CustomArmor.Builder().withMaterial(Armors.Juggernaut)
                .withUnlocalizedName("Juggernaut")
                .withTextureName("JuggernautSuit")
                .withModelClass("com.paneedah.mwc.models.JuggernautSuit")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.Juggernauthelmet = juggernautsuitArmorBuilder.buildHelmet(modContext);
        Armors.Juggernautchest = juggernautsuitArmorBuilder.buildChest(modContext.isClient());
        Armors.Juggernautboots = juggernautsuitArmorBuilder.buildBoots(modContext.isClient());
        
        Builder ghillieArmorBuilder = new CustomArmor.Builder()
        		.withMaterial(Armors.Marine)
                .withUnlocalizedName("ghillie")
                .withTextureName("ghillie")
                .withModelClass("com.paneedah.mwc.models.Ghillie")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.Ghilliehelmet = ghillieArmorBuilder.buildHelmet(modContext);
        Armors.Ghilliechest = ghillieArmorBuilder.buildChest(modContext.isClient());
        Armors.Ghillieboots = ghillieArmorBuilder.buildBoots(modContext.isClient());

        Builder swatArmorBuilder = new CustomArmor.Builder().withMaterial(Armors.Marine)
                .withUnlocalizedName("Swat")
                .withTextureName("Swat")
                .withModelClass("com.paneedah.mwc.models.Swat")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.Swathelmet = swatArmorBuilder.buildHelmet(modContext);
        Armors.Swatchest = swatArmorBuilder.buildChest(modContext.isClient());
        Armors.Swatboots = swatArmorBuilder.buildBoots(modContext.isClient());

        Builder tacticalArmorBuilder = new CustomArmor.Builder()
        		.withMaterial(Armors.Marine)
                .withUnlocalizedName("Tactical")
                .withTextureName("Tactical")
                .withModelClass("com.paneedah.mwc.models.Tactical")
                .withNightVision(true)
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.Tacticalhelmet = tacticalArmorBuilder.buildHelmet(modContext);
        
        Builder jpnvg18ArmorBuilder = new CustomArmor.Builder().withMaterial(Armors.Marine)
                .withUnlocalizedName("JPNVG18")
                .withTextureName("jpnvg18")
                .withModelClass("com.paneedah.mwc.models.JPNVG18")
                .withNightVision(true)
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.JPNVG18helmet = jpnvg18ArmorBuilder.buildHelmet(modContext);

        Builder gasSuitArmorBuilder = new CustomArmor.Builder().withMaterial(Armors.Marine)
                .withUnlocalizedName("m40gasmask")
                .withTextureName("m40gasmask")
                .withExposureReductionFactor(0.99f)
                .withModelClass("com.paneedah.mwc.models.M40GasMask")
                .withHudTextureName("goggles_overlay")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.GasMaskM40 = gasSuitArmorBuilder.buildHelmet(modContext);

        Builder oldUniformArmorBuilder = new CustomArmor.Builder()
        		.withMaterial(Armors.Marine)
                .withCreativeTab(ModernWarfareMod.ArmorTab)
                .withUnlocalizedName("olduniform")
                .withTextureName("olduniform")
                .withModelClass("com.paneedah.mwc.models.OldUniform")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.OldUniformchest = oldUniformArmorBuilder.buildChest(modContext.isClient());
        Armors.OldUniformboots = oldUniformArmorBuilder.buildBoots(modContext.isClient());

        Builder dClassArmorBuilder = new CustomArmor.Builder()
                .withMaterial(Armors.Marine)
                .withCreativeTab(ModernWarfareMod.ArmorTab)
                .withUnlocalizedName("dclass")
                .withTextureName("dclass")
                .withModelClass("com.paneedah.mwc.models.Dclass")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.dClasschest = dClassArmorBuilder.buildChest(modContext.isClient());
        Armors.dClassboots = dClassArmorBuilder.buildBoots(modContext.isClient());

        Builder scpGuardArmorBuilder = new CustomArmor.Builder()
        		.withMaterial(Armors.Marine)
                .withUnlocalizedName("scpguard")
                .withTextureName("scpguard")
                .withModelClass("com.paneedah.mwc.models.SCPGuard")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.scpGuardhelmet = scpGuardArmorBuilder.buildHelmet(modContext);
        Armors.scpGuardchest = scpGuardArmorBuilder.buildChest(modContext.isClient());
        Armors.scpGuardboots = scpGuardArmorBuilder.buildBoots(modContext.isClient());

       Builder flecktarnArmorBuilder = new CustomArmor.Builder()
        		.withMaterial(Armors.Marine)
                .withUnlocalizedName("FlecktarnArmor")
                .withTextureName("militaryuniformflecktarn")
                .withModelClass("com.paneedah.mwc.models.USMC")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.flecktarnhelmet = flecktarnArmorBuilder.buildHelmet(modContext);
        Armors.flecktarnchest = flecktarnArmorBuilder.buildChest(modContext.isClient());
        Armors.flecktarnboots = flecktarnArmorBuilder.buildBoots(modContext.isClient());

       Builder ratnikSteppeArmorBuilder = new CustomArmor.Builder()
        		.withMaterial(Armors.Marine)
                .withUnlocalizedName("Ratnik_Steppe")
                .withTextureName("steppe_emr")
                .withModelClass("com.paneedah.mwc.models.Ratnik_Uniform")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.ratnikSteppehelmet = ratnikSteppeArmorBuilder.buildHelmet(modContext);
        Armors.ratnikSteppechest = ratnikSteppeArmorBuilder.buildChest(modContext.isClient());
        Armors.ratnikSteppeboots = ratnikSteppeArmorBuilder.buildBoots(modContext.isClient());

       Builder ratnikArcticArmorBuilder = new CustomArmor.Builder()
        		.withMaterial(Armors.Marine)
                .withUnlocalizedName("Ratnik_Arctic")
                .withTextureName("arctic_emr")
                .withModelClass("com.paneedah.mwc.models.Ratnik_Uniform")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.ratnikArctichelmet = ratnikArcticArmorBuilder.buildHelmet(modContext);
        Armors.ratnikArcticchest = ratnikArcticArmorBuilder.buildChest(modContext.isClient());
        Armors.ratnikArcticboots = ratnikArcticArmorBuilder.buildBoots(modContext.isClient());

       Builder ratnikDesertArmorBuilder = new CustomArmor.Builder()
        		.withMaterial(Armors.Marine)
                .withUnlocalizedName("Ratnik_Desert")
                .withTextureName("desert_emr")
                .withModelClass("com.paneedah.mwc.models.Ratnik_Uniform")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.ratnikDeserthelmet = ratnikDesertArmorBuilder.buildHelmet(modContext);
        Armors.ratnikDesertchest = ratnikDesertArmorBuilder.buildChest(modContext.isClient());
        Armors.ratnikDesertboots = ratnikDesertArmorBuilder.buildBoots(modContext.isClient());

       Builder ratnikAridArmorBuilder = new CustomArmor.Builder()
        		.withMaterial(Armors.Marine)
                .withUnlocalizedName("Ratnik_Arid")
                .withTextureName("arid_emr")
                .withModelClass("com.paneedah.mwc.models.Ratnik_Uniform")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.ratnikAridhelmet = ratnikAridArmorBuilder.buildHelmet(modContext);
        Armors.ratnikAridchest = ratnikAridArmorBuilder.buildChest(modContext.isClient());
        Armors.ratnikAridboots = ratnikAridArmorBuilder.buildBoots(modContext.isClient());

       Builder ratnikMountainArmorBuilder = new CustomArmor.Builder()
        		.withMaterial(Armors.Marine)
                .withUnlocalizedName("Ratnik_Mountain")
                .withTextureName("mountain_emr")
                .withModelClass("com.paneedah.mwc.models.Ratnik_Uniform")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.ratnikMountainhelmet = ratnikMountainArmorBuilder.buildHelmet(modContext);
        Armors.ratnikMountainchest = ratnikMountainArmorBuilder.buildChest(modContext.isClient());
        Armors.ratnikMountainboots = ratnikMountainArmorBuilder.buildBoots(modContext.isClient());

        Builder sobrArmorBuilder = new CustomArmor.Builder()
    			.withMaterial(Armors.Marine)
                .withUnlocalizedName("SOBR")
                .withTextureName("vestsobr")
                .withModelClass("com.paneedah.mwc.models.SOBRUniform")
                .withCreativeTab(ModernWarfareMod.ArmorTab);

        Armors.SOBRhelmet = sobrArmorBuilder.buildHelmet(modContext);
        Armors.SOBRchest = sobrArmorBuilder.buildChest(modContext.isClient());
        Armors.SOBRboots = sobrArmorBuilder.buildBoots(modContext.isClient());
    }
}
