package com.paneedah.weaponlib2.perspective;

import com.paneedah.weaponlib2.ClientModContext;
import com.paneedah.weaponlib2.PlayerItemInstance;
import com.paneedah.weaponlib2.compatibility.CompatibleWorldRenderer;
import com.paneedah.weaponlib2.compatibility.MWCParticleManager;
import net.minecraft.client.multiplayer.WorldClient;

import static com.paneedah.mwc.proxies.ClientProxy.mc;
import static com.paneedah.mwc.utils.ModReference.log;

public class PerspectiveManager {

    private Perspective<?> currentPerspective;
    private ClientModContext clientModContext;
    private CompatibleWorldRenderer entityRenderer;
    private MWCParticleManager effectRenderer;
    //private DynamicShaderGroupManager shaderGroupManager;

    public PerspectiveManager(ClientModContext clientModContext) {
        this.clientModContext = clientModContext;
        //this.shaderGroupManager = new DynamicShaderGroupManager();
    }

    public Perspective<?> getPerspective(PlayerItemInstance<?> currentInstance, boolean init) {

        if(currentInstance == null || (currentPerspective == null && !init)) {
            return null;
        }

        Class<? extends Perspective<?>> perspectiveClass = currentInstance.getRequiredPerspectiveType();

        if (perspectiveClass != null) {
            if(currentPerspective == null) {
                currentPerspective = createActivePerspective(perspectiveClass);
            } else if(!perspectiveClass.isInstance(currentPerspective)) {
                currentPerspective.deactivate(clientModContext);
                currentPerspective = createActivePerspective(perspectiveClass);
            }
        } else if (currentPerspective != null) {
            if(init) {
                currentPerspective.deactivate(clientModContext);
                currentPerspective = null;
            }

        }

        return currentPerspective;
    }

    private Perspective<?> createActivePerspective(Class<? extends Perspective<?>> perspectiveClass) {
        Perspective<?> result = null;

        try {
            result = perspectiveClass.newInstance();
            result.activate(clientModContext, this);
        } catch (InstantiationException | IllegalAccessException e) {
            log.error("Failed to create view of {} - {}", perspectiveClass, e, e);
        }
        return result;
    }

    CompatibleWorldRenderer getEntityRenderer() {
        if(entityRenderer == null) {
            entityRenderer = new CompatibleWorldRenderer(mc,
                    mc.getResourceManager());
        }
        return entityRenderer;
    }

    MWCParticleManager getEffectRenderer() {
        if(effectRenderer == null) {
            WorldClient world = (WorldClient) mc.player.world;
            effectRenderer = MWCParticleManager.getParticleManager();
        }
        return effectRenderer;
    }

//    DynamicShaderGroupManager getShaderGroupManager() {
//        return shaderGroupManager;
//    }

}
