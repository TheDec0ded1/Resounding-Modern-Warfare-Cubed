// Date: 2/18/2019 5:39:14 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX


package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class VentEnd extends ModelBase {
    //fields
    ModelRenderer vent1;
    ModelRenderer vent2;
    ModelRenderer vent3;
    ModelRenderer vent4;
    ModelRenderer vent5;
    ModelRenderer vent6;
    ModelRenderer vent7;
    ModelRenderer vent8;
    ModelRenderer vent9;
    ModelRenderer vent10;

    public VentEnd() {
        textureWidth = 128;
        textureHeight = 128;

        vent1 = new ModelRenderer(this, 0, 0);
        vent1.addBox(0F, 0F, 0F, 14, 14, 16);
        vent1.setRotationPoint(-7F, 9F, -8F);
        vent1.setTextureSize(64, 32);
        vent1.mirror = true;
        setRotation(vent1, 0F, 0F, 0F);
        vent2 = new ModelRenderer(this, 0, 40);
        vent2.addBox(0F, 0F, 0F, 15, 15, 1);
        vent2.setRotationPoint(-7.5F, 8.5F, -0.5F);
        vent2.setTextureSize(64, 32);
        vent2.mirror = true;
        setRotation(vent2, 0F, 0F, 0F);
        vent3 = new ModelRenderer(this, 0, 40);
        vent3.addBox(0F, 0F, 0F, 15, 1, 1);
        vent3.setRotationPoint(-7.5F, 8.5F, -9F);
        vent3.setTextureSize(64, 32);
        vent3.mirror = true;
        setRotation(vent3, 0F, 0F, 0F);
        vent4 = new ModelRenderer(this, 0, 40);
        vent4.addBox(0F, 0F, 0F, 15, 1, 1);
        vent4.setRotationPoint(-7.5F, 22.5F, -9F);
        vent4.setTextureSize(64, 32);
        vent4.mirror = true;
        setRotation(vent4, 0F, 0F, 0F);
        vent5 = new ModelRenderer(this, 0, 40);
        vent5.addBox(0F, 0F, 0F, 1, 13, 1);
        vent5.setRotationPoint(-7.5F, 9.5F, -9F);
        vent5.setTextureSize(64, 32);
        vent5.mirror = true;
        setRotation(vent5, 0F, 0F, 0F);
        vent6 = new ModelRenderer(this, 0, 40);
        vent6.addBox(0F, 0F, 0F, 1, 13, 1);
        vent6.setRotationPoint(6.5F, 9.5F, -9F);
        vent6.setTextureSize(64, 32);
        vent6.mirror = true;
        setRotation(vent6, 0F, 0F, 0F);
        vent7 = new ModelRenderer(this, 0, 40);
        vent7.addBox(0F, 0F, 0F, 13, 2, 1);
        vent7.setRotationPoint(-6.5F, 10.5F, -8.8F);
        vent7.setTextureSize(64, 32);
        vent7.mirror = true;
        setRotation(vent7, 0F, 0F, 0F);
        vent8 = new ModelRenderer(this, 0, 40);
        vent8.addBox(0F, 0F, 0F, 13, 2, 1);
        vent8.setRotationPoint(-6.5F, 13.5F, -8.8F);
        vent8.setTextureSize(64, 32);
        vent8.mirror = true;
        setRotation(vent8, 0F, 0F, 0F);
        vent9 = new ModelRenderer(this, 0, 40);
        vent9.addBox(0F, 0F, 0F, 13, 2, 1);
        vent9.setRotationPoint(-6.5F, 16.5F, -8.8F);
        vent9.setTextureSize(64, 32);
        vent9.mirror = true;
        setRotation(vent9, 0F, 0F, 0F);
        vent10 = new ModelRenderer(this, 0, 40);
        vent10.addBox(0F, 0F, 0F, 13, 2, 1);
        vent10.setRotationPoint(-6.5F, 19.5F, -8.8F);
        vent10.setTextureSize(64, 32);
        vent10.mirror = true;
        setRotation(vent10, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        vent1.render(f5);
        vent2.render(f5);
        vent3.render(f5);
        vent4.render(f5);
        vent5.render(f5);
        vent6.render(f5);
        vent7.render(f5);
        vent8.render(f5);
        vent9.render(f5);
        vent10.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }

}
