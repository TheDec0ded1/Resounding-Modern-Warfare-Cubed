package com.paneedah.mwc.items.guns;
// Package

// IMPORT LIST START

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.instancing.PlayerWeaponInstance;
import com.paneedah.mwc.models.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.Attachments;
import com.paneedah.mwc.weapons.AuxiliaryAttachments;
import com.paneedah.mwc.weapons.Magazines;
import com.paneedah.weaponlib.*;
import com.paneedah.mwc.rendering.Transform;
import com.paneedah.weaponlib.animation.Transition;
import com.paneedah.weaponlib.compatibility.RecoilParam;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import net.minecraft.item.Item;
import org.lwjgl.opengl.GL11;
// IMPORT LIST END


public class AACHoneyBadgerFactory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

                .withName("aac_honey_badger") // Name of the item and model
                .withFireRate(0.80f) // Fire rate in rounds per minute
                .withRecoil(3f) // Recoil in degrees
                .withZoom(0.9f) // Zoom factor
                .withConfigGroup(GunConfigurationGroup.RIFLE) // Config group
                .withMaxShots(1, Integer.MAX_VALUE) // Max shots per reload
                .withShootSound("aac_honeybadger") // Shoot sound
                .withSilencedShootSound("aac_honeybadger") // Silenced shoot sound
                .withReloadSound("honeybadger_reload") // Reload sound
                .withUnloadSound("honeybadger_unload") // Unload sound
                .withEndOfShootSound("gun_click") // End of shoot sound
                .withInspectSound("m4a1_inspection") // Inspection sound
                .withDrawSound("m4_draw") // Draw sound
                .withReloadingTime(50)  // Reloading time in ticks
                .withFlashIntensity(0.5f) // Flash intensity
                .withFlashScale(() -> 0.6f) // Flash scale
                .withFlashOffsetX(() -> 0.13f) // Flash offset X
                .withFlashOffsetY(() -> 0.17f) // Flash offset Y
//        .withShootSoundVolume(1f)
                .withShellCasingForwardOffset(0.1f) // Shell casing forward offset
                .withShellCasingVerticalOffset(-0.05f) // Shell casing vertical offset
                .withCreativeTab(MWC.WEAPONS_TAB) // Creative tab
                .useNewSystem() // Use new system
                .withRecoilParam(new RecoilParam( // Recoil param
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


                .withScreenShaking(RenderableState.SHOOTING,  // Screen shaking
                        1.5f, // x
                        1.5f, // y
                        4f) // z

                // Unremovable attachment categories
                .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
                .withUnremovableAttachmentCategories(AttachmentCategory.STOCK)
                .withUnremovableAttachmentCategories(AttachmentCategory.RECEIVER)
                .withUnremovableAttachmentCategories(AttachmentCategory.RAILING)
                .withUnremovableAttachmentCategories(AttachmentCategory.SILENCER)
                .withUnremovableAttachmentCategories(AttachmentCategory.BACKGRIP)

                // Compatible attachment placeholder
                .withCompatibleAttachment(Attachments.Placeholder, true, (model) -> {
                    GL11.glTranslatef(0.01f, -0.19f, -0.4f);
                    GL11.glScaled(0F, 0F, 0F);
                })

                // Compatible attachment honeybadger handguard
                .withCompatibleAttachment(Attachments.HoneyBadgerHandguard, true, (model) -> {
                    if (model instanceof AKRail) {
                        GL11.glTranslatef(-0.2F, -1.32F, -3.4f);
                        GL11.glScaled(0.6F, 0.8F, 0.65F);
                    }
                })

                // Compatible attachment honeybadger Matrix Arms handguard
                .withCompatibleAttachment(Attachments.HoneyBadgerMatrixArmsHandguard, (model) -> {
                    if (model instanceof AKRail) {
                        GL11.glTranslatef(-0.2F, -1.325F, -3.8f);
                        GL11.glScaled(0.6F, 0.8F, 0.6F);
                    } else if (model instanceof AKRail2) {
                        GL11.glTranslatef(0.15F, -1.16F, -3.5f);
                        GL11.glScaled(0.6F, 0.8F, 0.65F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                    } else if (model instanceof AKRail3) {
                        GL11.glTranslatef(-0.03F, -0.81F, -4.03F);
                        GL11.glScaled(0.6F, 0.6F, 0.88F);
                        GL11.glRotatef(180F, 0f, 0f, 1f);
                    }
                })

                // Compatible attachment honeybadger Stock
                .withCompatibleAttachment(Attachments.HoneyBadgerStock, true, (model) -> {
//          GL11.glTranslatef(0f, 0f, 1f);
                })

                // Compatible attachment honeybadger Stock Black
                .withCompatibleAttachment(Attachments.HoneyBadgerStockBlack, (model) -> {
//          GL11.glTranslatef(0f, 0f, 1f);
                })

                // Compatible attachment honeybadger Reciever
                .withCompatibleAttachment(Attachments.HoneyBadgerReceiver, true, (model) -> {
                    if (model instanceof AKRail) {
                        GL11.glTranslatef(-0.2F, -1.32F, -1.82f);
                        GL11.glScaled(0.6F, 0.8F, 0.78F);
                    }
                })

                // Compatible attachment honeybadger Reciever Black
                .withCompatibleAttachment(Attachments.HoneyBadgerReceiverBlack, (model) -> {
                    if (model instanceof AKRail) {
                        GL11.glTranslatef(-0.2F, -1.32F, -1.82f);
                        GL11.glScaled(0.6F, 0.8F, 0.78F);
                    }
                })

                // Compatible attachment honeybadger Knights Reciever
                .withCompatibleAttachment(Attachments.HoneyBadgerKnightsReceiver, (model) -> {
                    if (model instanceof AKRail) {
                        GL11.glTranslatef(-0.2F, -1.32F, -1.82f);
                        GL11.glScaled(0.6F, 0.8F, 0.78F);
                    }
                })

                // Compatible attachment honeybadger Knights Reciever Black
                .withCompatibleAttachment(Attachments.HoneyBadgerKnightsReceiverBlack, (model) -> {
                    if (model instanceof AKRail) {
                        GL11.glTranslatef(-0.2F, -1.32F, -1.82f);
                        GL11.glScaled(0.6F, 0.8F, 0.78F);
                    }
                })

                // Compatible attachment honeybadger M4 Grip
                .withCompatibleAttachment(Attachments.M4Grip, true, (model) -> {
                    GL11.glTranslatef(0.001f, 0f, 0f);
                })

                // Compatible attachment honeybadger M4 Grip Tan
                .withCompatibleAttachment(Attachments.M4GripTan, (model) -> {
                    GL11.glTranslatef(0.001f, 0f, 0f);
                })

                // Compatible attachment honeybadger M4 Grip Gray
                .withCompatibleAttachment(Attachments.M4GripGray, (model) -> {
                    GL11.glTranslatef(0.001f, 0f, 0f);
                })

                // Compatible attachment honeybadger Mag
                .withCompatibleAttachment(Magazines.HoneyBadgerMag, (model) -> {
                    GL11.glTranslatef(-0.35F, 0.5F, -1.25F);
                    GL11.glScaled(1.05F, 1.2F, 1.15F);
                })

                // Compatible attachment honeybadger AR15
                .withCompatibleAttachment(AuxiliaryAttachments.AR15Action, true, (model) -> {
                    GL11.glTranslatef(-0.175F, -1.28F, -0.67F);
                    GL11.glScaled(0.7F, 0.4F, 0.7F);
                })

                // Compatible attachment honeybadger FrontSights
                .withCompatibleAttachment(Attachments.HK416FrontSight, renderContext -> {
                    PlayerWeaponInstance instance = renderContext.getWeaponInstance();
                    if (instance != null) {
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.GUARD, instance);
                        if (activeAttachment == Attachments.HoneyBadgerMatrixArmsHandguard) {
                            GL11.glTranslatef(0F, 0F, -0.35F);
                            GL11.glScaled(1F, 1F, 1F);
                        } else {
                            GL11.glTranslatef(0F, 0F, 0F);
                            GL11.glScaled(1F, 1F, 1F);
                        }
                    }
                }, (model) -> {
                    if (model instanceof G95_upright_frontsights) {
                        GL11.glTranslatef(-0.155F, -1.55F, -2.8F);
                        GL11.glScaled(0.32F, 0.32F, 0.32F);
                    }
                }, false, false)

                // Compatible attachment honeybadger MBUSFrontSight
                .withCompatibleAttachment(Attachments.MBUSFrontSight, renderContext -> {
                    PlayerWeaponInstance instance = renderContext.getWeaponInstance();
                    if (instance != null) {
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.GUARD, instance);
                        if (activeAttachment == Attachments.HoneyBadgerMatrixArmsHandguard) {
                            GL11.glTranslatef(0F, 0F, -0.3F);
                            GL11.glScaled(1F, 1F, 1F);
                        } else {
                            GL11.glTranslatef(0F, 0F, 0F);
                            GL11.glScaled(1F, 1F, 1F);
                        }
                    }
                }, (model) -> {
                    if (model instanceof MBUSFrontSight) {
                        GL11.glTranslatef(-0.16F, -1.5F, -3F);
                        GL11.glScaled(0.35F, 0.35F, 0.35F);
                    }
                }, true, false)

                // Compatible attachment honeybadger tritium RearSights
                .withCompatibleAttachment(Attachments.TritiumRearSights, (model) -> {
                    if (model instanceof TritiumRearSights) {
                        GL11.glTranslatef(-0.16F, -1.5F, -0.3F);
                        GL11.glScaled(0.35F, 0.35F, 0.35F);
                    }
                })

                // Compatible attachment honeybadger HK416RearSights
                .withCompatibleAttachment(Attachments.HK416RearSights, (model) -> {
                    if (model instanceof G95_upright_rearsights) {
                        GL11.glTranslatef(-0.158F, -1.53F, -0.2F);
                        GL11.glScaled(0.32F, 0.32F, 0.32F);
                    }
                })

                // Compatible attachment honeybadger MBUSRearSights
                .withCompatibleAttachment(Attachments.MBUSRearSights, true, (model) -> {
                    if (model instanceof MBUSRearSight) {
                        GL11.glTranslatef(-0.16F, -1.5F, -0.3F);
                        GL11.glScaled(0.35F, 0.35F, 0.35F);
                    }
                })

                // Compatible attachment honeybadger AKM IronSights
                .withCompatibleAttachment(Attachments.AKMIron, (model) -> {
                    if (model instanceof M4Iron1) {
                        GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof M4Iron2) {
                        GL11.glTranslatef(0.255F, -1.55F, -2.25F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof P90iron) {
                        GL11.glTranslatef(0.26F, -1.55F, -2.35F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof AKMiron1) {
                        GL11.glTranslatef(0.125F, -1.8F, -0.5F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof AKMiron2) {
                        GL11.glTranslatef(0.13F, -1.55F, -3.05F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof AK47iron) {
                        GL11.glTranslatef(0.092F, -1.91F, -0.9F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof G36CIron1) {
                        GL11.glTranslatef(-0.22F, -1.94F, 0.13F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof G36CIron2) {
                        GL11.glTranslatef(-0.205F, -1.9F, -3.15F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof ScarIron1) {
                        GL11.glTranslatef(0.165F, -1.65F, 1F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof ScarIron2) {
                        GL11.glTranslatef(0.25F, -1.55F, -2F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof FALIron) {
                        GL11.glTranslatef(0.127F, -1.77F, -2.22F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof M14Iron) {
                        GL11.glTranslatef(0.129F, -1.63F, -2.08F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof MP5Iron) {
                        GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof M27rearsight) {
                        GL11.glTranslatef(-0.16F, -1.5F, -0.3F);
                        GL11.glScaled(0.35F, 0.35F, 0.35F);
                    } else if (model instanceof MBUSiron) {
                        GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })

                // Compatible attachment honeybadger AR15 IronSights
                .withCompatibleAttachment(AuxiliaryAttachments.AR15Iron, (model) -> {
                    if (model instanceof M4Iron1) {
                        GL11.glTranslatef(-0.145F, -1.55F, -0.35F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof M4Iron2) {
                        GL11.glTranslatef(-0.055F, -1.35F, -4.05F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof FALIron) {
                        GL11.glTranslatef(-0.185F, -1.53F, -4.05F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof ARCarryHandle) {
                        GL11.glTranslatef(-0.1425F, -1.534F, -0.12F);
                        GL11.glScaled(0.29F, 0.29F, 0.29F);
                    } else if (model instanceof MP5Iron) {
                        GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })

                // Compatible attachment honeybadger NightRaider
                .withCompatibleAttachment(Attachments.NightRaider, (player, stack) -> {
                    GL11.glTranslatef(-0.21F, -1.4F, -1.8F);
                    GL11.glScaled(0.75F, 0.75F, 0.75F);
                }, (model) -> {
                    if (model instanceof JPUreticle) {
                        GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                        GL11.glScaled(0.03F, 0.03F, 0.03F);
                    }
                })

                // Compatible attachment honeybadger ACOG
                .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
                    GL11.glTranslatef(-0.28F, -1.41F, -0.5F);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }, (model) -> {
                    if (model instanceof AcogScope2) {
                        GL11.glTranslatef(-0.018F, -0.25F, 0.13F);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof AcogReticle) {
                        GL11.glTranslatef(0.243F, -0.23F, 0.68f);
                        GL11.glScaled(0.03F, 0.03F, 0.03F);
                    }
                })

                // Compatible attachment honeybadger Specter
                .withCompatibleAttachment(Attachments.Specter, (player, stack) -> {
                    GL11.glTranslatef(-0.18F, -1.1F, -0.7F);
                    GL11.glScaled(0.4F, 0.4F, 0.4F);
                }, (model) -> {
                    if (model instanceof Acog2) {
                        GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                        GL11.glScaled(0.1F, 0.1F, 0.1F);
                    }
                })

                // Compatible attachment honeybadger Leupold Rail Scope
                .withCompatibleAttachment(Attachments.LeupoldRailScope, (player, stack) -> {
                    GL11.glTranslatef(-0.151F, -1.25F, -1.2F);
                    GL11.glScaled(0.4F, 0.4F, 0.4F);
                }, (model) -> {
                    if (model instanceof JPUreticle) {
                        GL11.glTranslatef(0.076F, -0.67F, 4.0251F);
                        GL11.glScaled(0.04F, 0.04F, 0.04F);
                    }
                })

                // Compatible attachment honeybadger MicroReflex
                .withCompatibleAttachment(Attachments.MicroReflex, (player, stack) -> {
                    GL11.glTranslatef(-0.15F, -1.93F, -1F);
                    GL11.glScaled(0.35F, 0.35F, 0.35F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(0.08F, 0.97F, -0.4F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    } else if (model instanceof SightMount) {
//                 	GL11.glTranslatef(-0.15F, -1.82F, -1F);
//                     GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })

                // Compatible attachment honeybadger Reflex
                .withCompatibleAttachment(Attachments.Reflex, (player, stack) -> {
                    GL11.glTranslatef(-0.066F, -1.21F, -0.9F);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })

                // Compatible attachment honeybadger BijiaReflex
                .withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
                    GL11.glTranslatef(-0.062F, -1.2F, -1F);
                    GL11.glScaled(0.48F, 0.48F, 0.48F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })

                // Compatible attachment honeybadger Holographic
                .withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
                    GL11.glTranslatef(-0.041F, -1.25F, -0.7F);
                    GL11.glScaled(0.65F, 0.65F, 0.65F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                        GL11.glScaled(0.1F, 0.1F, 0.1F);
                    }
                })


                // Compatible attachment honeybadger HolographicAlt
                .withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
                    GL11.glTranslatef(-0.041F, -1.25F, -0.7F);
                    GL11.glScaled(0.65F, 0.65F, 0.65F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                        GL11.glScaled(0.1F, 0.1F, 0.1F);
                    }
                })

                // Compatible attachment honeybadger EotechHybrid
                .withCompatibleAttachment(Attachments.EotechHybrid2, (player, stack) -> {
                    GL11.glTranslatef(-0.041F, -1.25F, -1.3F);
                    GL11.glScaled(0.65F, 0.65F, 0.65F);
                }, (model) -> {
                    if (model instanceof EotechScopeRing) {
                        GL11.glTranslatef(-0.2F, -0.41F, 1.8F);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                    if (model instanceof Holo2) {
                        GL11.glTranslatef(-0.118F, -0.535F, 1.9F);
                        GL11.glScaled(0.05F, 0.05F, 0.05F);
                    }
                })

                // Compatible attachment honeybadger VortexRedux
                .withCompatibleAttachment(Attachments.VortexRedux, (player, stack) -> {
                    GL11.glTranslatef(-0.3F, -1.45F, -1.1F);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GL11.glTranslatef(0.395F, -0.33F, -0.1F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })

                // Compatible attachment honeybadger Kobra
                .withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
                    GL11.glTranslatef(-0.041F, -1.26F, -0.7F);
                    GL11.glScaled(0.65F, 0.65F, 0.65F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })

                // Compatible attachment honeybadger KobraGen3
                .withCompatibleAttachment(Attachments.KobraGen3, renderContext -> {
                    PlayerWeaponInstance instance = renderContext.getWeaponInstance();
                    if (instance != null) {
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.GUARD, instance);
                        if (activeAttachment == Attachments.AR57Handguard) {
                            GL11.glTranslatef(-0.041F, -1.37F, -0.7F);
                            GL11.glScaled(0.65F, 0.65F, 0.65F);
                        } else {
                            GL11.glTranslatef(-0.041F, -1.26F, -0.7F);
                            GL11.glScaled(0.65F, 0.65F, 0.65F);
                        }
                    }
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                }, false, false)

                // Compatible attachment honeybadger MicroT1
                .withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
                    GL11.glTranslatef(-0.18F, -1.45F, -1F);
                    GL11.glScaled(0.38F, 0.38F, 0.38F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })

                // Compatible attachment honeybadger AimpointCompM5
                .withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
                    GL11.glTranslatef(-0.18F, -1.45F, -1F);
                    GL11.glScaled(0.38F, 0.38F, 0.38F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })

                // Compatible attachment honeybadger Grip2
                .withCompatibleAttachment(Attachments.Grip2, (model) -> {
                    GL11.glTranslatef(-0.2F, -0.41F, -2.5F);
                    GL11.glScaled(1F, 1F, 1F);
                })

                // Compatible attachment honeybadger JunoGrip
                .withCompatibleAttachment(Attachments.JunoGrip, (model) -> {
                    GL11.glTranslatef(-0.23F, -0.7F, -2.81F);
                    GL11.glScaled(0.8F, 0.8F, 0.8F);
                })

                // Compatible attachment honeybadger StubbyGrip
                .withCompatibleAttachment(Attachments.StubbyGrip, (model) -> {
                    GL11.glTranslatef(-0.2F, -0.41F, -2.5F);
                    GL11.glScaled(1F, 1F, 1F);
                })

                // Compatible attachment honeybadger AngledGrip
                .withCompatibleAttachment(Attachments.AngledGrip, (model) -> {
                    GL11.glTranslatef(-0.2F, -0.35F, -2.9F);
                    GL11.glScaled(1F, 1F, 1F);
                })

                // Compatible attachment honeybadger VGrip
                .withCompatibleAttachment(Attachments.VGrip, (model) -> {
                    GL11.glTranslatef(-0.2F, -0.41F, -2.5F);
                    GL11.glScaled(1F, 1F, 1F);
                })

                .withCompatibleAttachment(Attachments.Bipod, (model) -> {
                    GL11.glTranslatef(-0.18F, -0.33F, -3.5F);
                    GL11.glScaled(0.8F, 0.8F, 0.8F);
                })

                .withCompatibleAttachment(Attachments.Laser2, (p, s) -> {
                    GL11.glTranslatef(0.05F, -1.18F, -3.6F);
                    GL11.glScaled(0.8F, 0.8F, 0.8F);
                })

                .withCompatibleAttachment(Attachments.Laser, (p, s) -> {
                    GL11.glTranslatef(0.05F, -1.18F, -3.6F);
                    GL11.glScaled(0.8F, 0.8F, 0.8F);
                })

                .withCompatibleAttachment(Attachments.HoneyBadgerSilencer, renderContext -> {
                    PlayerWeaponInstance instance = renderContext.getWeaponInstance();
                    if (instance != null) {
                        ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                                AttachmentCategory.GUARD, instance);
                        if (activeAttachment == Attachments.HoneyBadgerMatrixArmsHandguard) {
                            GL11.glTranslatef(0F, 0F, -0.5F);
                            GL11.glScaled(1F, 1F, 1F);
                        } else {
                            GL11.glTranslatef(0F, 0F, 0F);
                            GL11.glScaled(1F, 1F, 1F);
                        }
                    }
                }, (model) -> {
                    if (model instanceof AACHoneyBadgerSilencer) {
//            	GL11.glTranslatef(-0.16F, -1.5F, -3F);
//                GL11.glScaled(0.35F, 0.35F, 0.35F);
                    }
                }, true, false)

                // BUILDS THE GUN
                .withTextureNames("aachoneybadger")
                .withRenderer(new WeaponRenderer.Builder()

                        .withModel(new AACHoneyBadger())
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
                                        .withPosition(-1.265000f, 4.065000f, -3.085000f)
                                        .withRotation(0.000000f, 1.000000f, 6.300000f)
                                        .withPivotPoint(-0.350000f, -2.900000f, -0.100000f)
                                        .withScale(3.0F, 3.0F, 3.0F)
                        )

                        .withFirstPersonHandPositioning(

                                // Left hand
                                new Transform()
                                        .withPosition(1.050000f, 0.065000f, -0.500000f)
                                        .withBBRotation(-8.1997F, -23.6991F, 57.7232F)
                                        .withScale(2.6F, 2.6F, 4.0F)
                                        .withPivotPoint(0, 0, 0),


                                // Right hand
                                new Transform()
                                        .withPosition(-0.2F, 0.1F, 2)
                                        .withRotation(-5.4027F, -4.7805F, -1.6694F)
                                        .withScale(3.5F, 3.5F, 3.5F)
                                        .withPivotPoint(0, 0, 0)

                        )

                        .setupModernAnimations("honeybadger", AuxiliaryAttachments.ScarAction)
                        .setupModernMagazineAnimations("honeybadger",
                                Magazines.HoneyBadgerMag)


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
                            GL11.glTranslatef(0.14f, 1.05f, -0.3f);

                            // Standard Iron Sight Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), AuxiliaryAttachments.AR15Iron)) {
                                GL11.glTranslatef(0F, 0.028f, -0.3f);
                            }

                            // Standard Iron Sight Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.TritiumRearSights)) {
                                GL11.glTranslatef(0F, 0f, 0f);
                            }

                            // Standard Iron Sight Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HK416RearSights)) {
                                GL11.glTranslatef(0F, 0.03f, 0f);
                            }

                            // Standard Iron Sight Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                                GL11.glTranslatef(0F, 0.035f, 0f);
                            }

                            // Standard Iron Sight Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                                GL11.glTranslatef(0F, 0.025f, 0f);
                            }

                            // Standard Iron Sight Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AKMIron)) {
                                GL11.glTranslatef(0F, 0f, 0f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                                GL11.glTranslatef(-0.01F, 0.03f, 0.3f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                                GL11.glTranslatef(-0.003F, -0.05f, 0.2f);
                            }

                            // HP Zoomw
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                                GL11.glTranslatef(0.001F, -0.027f, -0.2f);
                            }

                            // Reflex Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                                GL11.glTranslatef(0F, -0.015f, 0.1f);
                            }

                            // Reflex Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                                GL11.glTranslatef(0F, -0.01f, 0f);
                            }

                            // Holo Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                                GL11.glTranslatef(0F, 0.03f, 0f);
                            }

                            // Holo Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                                GL11.glTranslatef(0F, 0.03f, 0f);
                            }

                            // Holo Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                                GL11.glTranslatef(-0.004F, 0.025f, 0.25f);
                            }

                            // Holo Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                                GL11.glTranslatef(0F, 0.06f, 0f);
                            }

                            // Reflex Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                                GL11.glTranslatef(0F, 0.035f, 0f);
                            }

                            // Reflex Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                                GL11.glTranslatef(0F, 0.035f, 0f);
                            }

                            // Reflex Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                                GL11.glTranslatef(0F, 0.055f, 0.3f);
                            }

                            // Reflex Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
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
                                            .withScale(2.6F, 2.6F, 4.0F)
                                            .withPivotPoint(0.000000f, 0.000000f, 0.000000f)
                                            .applyTransformations();
                                },
                                (renderContext) -> {
                                    new Transform()
                                            .withPosition(-0.2F, 0.1F, 2)
                                            .withRotation(-5.4027F, -4.7805F, -1.6694F)
                                            .withScale(3.5F, 3.5F, 3.5F)
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
                                            .withScale(3.5F, 3.5F, 3.5F)
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
                .withSpawnEntityDamage(5.4f)
                .withSpawnEntityGravityVelocity(0.0118f)


                .build(MWC.modContext);
    }
}
