// Date: 3/25/2016 11:02:56 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX


package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class P90iron extends ModelBase {
    //fields
    ModelRenderer sight1;
    ModelRenderer sight2;
    ModelRenderer sight3;
    ModelRenderer sight4;
    ModelRenderer sight5;
    ModelRenderer sight6;
    ModelRenderer sight7;

    public P90iron() {
        textureWidth = 128;
        textureHeight = 64;

        sight1 = new ModelRenderer(this, 0, 0);
        sight1.addBox(0F, 0F, 0F, 3, 1, 2);
        sight1.setRotationPoint(0F, 0F, 0F);
        sight1.setTextureSize(64, 32);
        sight1.mirror = true;
        setRotation(sight1, 0F, 0F, 0F);
        sight2 = new ModelRenderer(this, 0, 0);
        sight2.addBox(0F, 0F, 0F, 2, 1, 2);
        sight2.setRotationPoint(0F, 1F, 0F);
        sight2.setTextureSize(64, 32);
        sight2.mirror = true;
        setRotation(sight2, 0F, 0F, -2.119181F);
        sight3 = new ModelRenderer(this, 0, 0);
        sight3.addBox(0F, 0F, 0F, 1, 2, 2);
        sight3.setRotationPoint(3F, 1F, 0F);
        sight3.setTextureSize(64, 32);
        sight3.mirror = true;
        setRotation(sight3, 0F, 0F, -2.67686F);
        sight4 = new ModelRenderer(this, 0, 0);
        sight4.addBox(0F, 0F, 0F, 1, 2, 2);
        sight4.setRotationPoint(3.9F, -0.8F, 0F);
        sight4.setTextureSize(64, 32);
        sight4.mirror = true;
        setRotation(sight4, 0F, 0F, 2.862753F);
        sight5 = new ModelRenderer(this, 0, 0);
        sight5.addBox(0F, 0F, 0F, 2, 1, 2);
        sight5.setRotationPoint(-1F, -0.7F, 0F);
        sight5.setTextureSize(64, 32);
        sight5.mirror = true;
        setRotation(sight5, 0F, 0F, -1.33843F);
        sight6 = new ModelRenderer(this, 0, 0);
        sight6.addBox(0F, 0F, 0F, 1, 2, 2);
        sight6.setRotationPoint(1F, -1.5F, 0F);
        sight6.setTextureSize(64, 32);
        sight6.mirror = true;
        setRotation(sight6, 0F, 0F, 0F);
        sight7 = new ModelRenderer(this, 0, 0);
        sight7.addBox(0F, 0F, 0F, 2, 3, 2);
        sight7.setRotationPoint(0.5F, 0.5F, 0F);
        sight7.setTextureSize(64, 32);
        sight7.mirror = true;
        setRotation(sight7, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        sight1.render(f5);
        sight2.render(f5);
        sight3.render(f5);
        sight4.render(f5);
        sight5.render(f5);
        sight6.render(f5);
        sight7.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

}
