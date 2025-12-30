package com.paneedah.mwc.proxies;

import com.paneedah.mwc.*;
import com.paneedah.mwc.entities.Entities;
import com.paneedah.mwc.init.MWCItems;
import com.paneedah.mwc.items.melee.BaseballBatFactory;
import com.paneedah.mwc.items.melee.BaseballBatNailsFactory;
import com.paneedah.mwc.items.melee.NightStickFactory;
import com.paneedah.mwc.items.melee.TacticalTomahawkFactory;
import com.paneedah.mwc.skins.GunSkins;
import com.paneedah.mwc.tileentities.TileEntities;
import com.paneedah.mwc.vehicle.Vehicles;
import com.paneedah.mwc.weapons.*;
import com.paneedah.mwc.wearables.Armors;
import com.paneedah.mwc.wearables.Backpacks;
import com.paneedah.mwc.wearables.Bullets;
import com.paneedah.mwc.wearables.Vests;
import com.paneedah.weaponlib2.UniversalSoundLookup;
import com.paneedah.weaponlib2.animation.SpecialAttachments;
import com.paneedah.weaponlib2.vehicle.network.VehicleDataSerializer;
import com.paneedah.weaponlib2.vehicle.network.VehiclePhysSerializer;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

    /*
    public static Item ElectronicCircuitBoard;
    public static Item OpticGlass;
    public static Item Cloth;
    public static Item TanCloth;
    public static Item GreenCloth;
    public static Item Inductor;
    public static Item Transistor;
    public static Item Resistor;
    public static Item Diode;
    public static Item Capacitor;
    public static Item CopperWiring;
    public static Item Piston;
    public static Item LaserPointer;
    public static Item AluminumPlate;
    public static Item SteelPlate;
    public static Item BigSteelPlate;
    public static Item MiniSteelPlate;
    public static Item MetalComponents;
    public static Item Plastic;
    public static Item Backpack;
    */

    public ModelBiped getArmorModel(int id) {
        return null;
    }

    protected boolean isClient() {
        return false;
    }


    // I cannot figure out for the life of me why moving the init classes to the init() instead of the preInit() makes the game die, but I have no choice but to leave it here for now.
    public void preInit(final ModernWarfareMod mod) {
        ModernWarfareMod.MOD_CONTEXT.preInit(mod, ModernWarfareMod.CHANNEL);

        // Sounds
        ModernWarfareMod.MOD_CONTEXT.setChangeZoomSound("OpticZoom");
        ModernWarfareMod.MOD_CONTEXT.setNightVisionOnSound("nightvision_on");
        ModernWarfareMod.MOD_CONTEXT.setNightVisionOffSound("nightvision_off");
        ModernWarfareMod.MOD_CONTEXT.setChangeFireModeSound("firerate_toggle");
        ModernWarfareMod.MOD_CONTEXT.setNoAmmoSound("dry_fire");
        ModernWarfareMod.MOD_CONTEXT.setExplosionSound("grenadeexplosion");
        ModernWarfareMod.MOD_CONTEXT.setFlashExplosionSound("flashbang");

        ModernWarfareMod.MOD_CONTEXT.setMaterialImpactSounds(Material.ROCK, 1.5f, "impact_rock1", "impact_rock2", "impact_rock3");
        ModernWarfareMod.MOD_CONTEXT.setMaterialImpactSounds(Material.WOOD, 1.5f, "impact_wood1", "impact_wood2", "impact_wood3");
        ModernWarfareMod.MOD_CONTEXT.setMaterialImpactSounds(Material.GRASS, 1.5f, "impact_dirt1", "impact_dirt2", "impact_dirt3");
        ModernWarfareMod.MOD_CONTEXT.setMaterialImpactSounds(Material.GROUND, 1.5f, "impact_dirt1", "impact_dirt2", "impact_dirt3");
        ModernWarfareMod.MOD_CONTEXT.setMaterialImpactSounds(Material.SAND, 1.5f, "impact_dirt1", "impact_dirt2", "impact_dirt3");
        ModernWarfareMod.MOD_CONTEXT.setMaterialImpactSounds(Material.SNOW, 1.5f, "impact_dirt1", "impact_dirt2", "impact_dirt3");
        ModernWarfareMod.MOD_CONTEXT.setMaterialImpactSounds(Material.IRON, 1.5f, "impact_metal1", "impact_metal2", "impact_metal3");
        UniversalSoundRegistry.init();
        UniversalSoundLookup.initialize(ModernWarfareMod.MOD_CONTEXT);

        // Forcing Item Initialization here, at the very least the variables, before they get registered normally on the init() (@SubscribeEvent) phase.
        MWCItems.init();

        // Idk? Deprecated too.
        DataSerializers.registerSerializer(VehicleDataSerializer.SERIALIZER);
        DataSerializers.registerSerializer(VehiclePhysSerializer.SERIALIZER);

        // Special object initialization
        SpecialAttachments.init(mod, ModernWarfareMod.MOD_CONTEXT);
        Backpacks.init(mod);
        Vests.init(mod);
        Armors.init(mod, ModernWarfareMod.MOD_CONTEXT);
        Attachments.init(mod);
        Attachments2.init(mod);
        ARParts.init(mod);
		GlockParts.init(mod);
        Attachments3.init(mod);
        AuxiliaryAttachments.init(mod);
        GunSkins.init(mod);
        Bullets.init(mod);
        Magazines.init(mod);
        STANAGMagazines.init(mod);
        Guns.init(mod, this);
        Electronics.init(mod);
        Grenades.init(mod, this);
        CustomSpawnEggs.init(mod, this);
        TileEntities.init(this);

        new TacticalTomahawkFactory().createMelee(this);
        new BaseballBatFactory().createMelee(this);
        new BaseballBatNailsFactory().createMelee(this);
        new NightStickFactory().createMelee(this);

        ModernWarfareMod.MOD_CONTEXT.preInitEnd(mod, ModernWarfareMod.MOD_CONTEXT.getChannel());
    }

    public void init(final ModernWarfareMod mod) {
        ModernWarfareMod.MOD_CONTEXT.init(mod);

        Entities.init(this);
        Vehicles.init(this);

        GameRegistry.registerWorldGenerator(new WorldGeneratorEventHandler(), 0);
    }

    public void postInit(final ModernWarfareMod mod, final FMLPostInitializationEvent initializationEvent) {
    }
}
