// Date: 1/5/2017 7:17:42 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.vicmatskiv.mw.models;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

import com.vicmatskiv.weaponlib.ModelWithAttachments;

public class M110Mag extends ModelWithAttachments
{
  //fields
    ModelRenderer gun1;
    ModelRenderer gun2;
    ModelRenderer gun3;
    ModelRenderer gun4;
    ModelRenderer gun5;
    ModelRenderer gun6;
    ModelRenderer gun7;
    ModelRenderer gun8;
    ModelRenderer gun9;
    ModelRenderer gun10;
  
  public M110Mag()
  {
    textureWidth = 256;
    textureHeight = 128;
    
      gun1 = new ModelRenderer(this, 200, 0);
      gun1.addBox(0F, 0F, 0F, 3, 14, 7);
      gun1.setRotationPoint(1F, -12F, -4.5F);
      gun1.setTextureSize(64, 32);
      gun1.mirror = true;
      setRotation(gun1, 0F, 0F, 0F);
      gun2 = new ModelRenderer(this, 200, 0);
      gun2.addBox(0F, 0F, 0F, 1, 14, 2);
      gun2.setRotationPoint(0.8F, -12F, -0.5F);
      gun2.setTextureSize(64, 32);
      gun2.mirror = true;
      setRotation(gun2, 0F, 0F, 0F);
      gun3 = new ModelRenderer(this, 200, 0);
      gun3.addBox(0F, 0F, 0F, 1, 14, 2);
      gun3.setRotationPoint(3.2F, -12F, -0.5F);
      gun3.setTextureSize(64, 32);
      gun3.mirror = true;
      setRotation(gun3, 0F, 0F, 0F);
      gun4 = new ModelRenderer(this, 200, 0);
      gun4.addBox(0F, 0F, 0F, 1, 14, 2);
      gun4.setRotationPoint(3.2F, -12F, -3F);
      gun4.setTextureSize(64, 32);
      gun4.mirror = true;
      setRotation(gun4, 0F, 0F, 0F);
      gun5 = new ModelRenderer(this, 200, 0);
      gun5.addBox(0F, 0F, 0F, 1, 14, 1);
      gun5.setRotationPoint(3.2F, -12F, -4.5F);
      gun5.setTextureSize(64, 32);
      gun5.mirror = true;
      setRotation(gun5, 0F, 0F, 0F);
      gun6 = new ModelRenderer(this, 200, 0);
      gun6.addBox(0F, 0F, 0F, 1, 14, 1);
      gun6.setRotationPoint(0.8F, -12F, -4.5F);
      gun6.setTextureSize(64, 32);
      gun6.mirror = true;
      setRotation(gun6, 0F, 0F, 0F);
      gun7 = new ModelRenderer(this, 200, 0);
      gun7.addBox(0F, 0F, 0F, 1, 14, 2);
      gun7.setRotationPoint(0.8F, -12F, -3F);
      gun7.setTextureSize(64, 32);
      gun7.mirror = true;
      setRotation(gun7, 0F, 0F, 0F);
      gun8 = new ModelRenderer(this, 200, 0);
      gun8.addBox(0F, 0F, 0F, 3, 14, 1);
      gun8.setRotationPoint(0.8F, -12F, 2F);
      gun8.setTextureSize(64, 32);
      gun8.mirror = true;
      setRotation(gun8, 0F, 0F, 0F);
      gun9 = new ModelRenderer(this, 200, 0);
      gun9.addBox(0F, 0F, 0F, 1, 14, 1);
      gun9.setRotationPoint(3.2F, -12F, 2F);
      gun9.setTextureSize(64, 32);
      gun9.mirror = true;
      setRotation(gun9, 0F, 0F, 0F);
      gun10 = new ModelRenderer(this, 200, 0);
      gun10.addBox(0F, 0F, 0F, 3, 7, 1);
      gun10.setRotationPoint(1F, 2F, -4.5F);
      gun10.setTextureSize(64, 32);
      gun10.mirror = true;
      setRotation(gun10, 1.449966F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    gun1.render(f5);
    gun2.render(f5);
    gun3.render(f5);
    gun4.render(f5);
    gun5.render(f5);
    gun6.render(f5);
    gun7.render(f5);
    gun8.render(f5);
    gun9.render(f5);
    gun10.render(f5);
  }

}