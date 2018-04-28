// Date: 12/10/2017 2:35:25 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.vicmatskiv.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Tec9Mag extends ModelBase
{
  //fields
   
    ModelRenderer mag1;
    ModelRenderer mag2;
  
  public Tec9Mag()
  {
    textureWidth = 512;
    textureHeight = 256;
    
      
      mag1 = new ModelRenderer(this, 0, 0);
      mag1.addBox(0F, 0F, 0F, 5, 30, 6);
      mag1.setRotationPoint(-4F, -6F, -23.5F);
      mag1.setTextureSize(64, 32);
      mag1.mirror = true;
      setRotation(mag1, 0F, 0F, 0F);
      mag2 = new ModelRenderer(this, 0, 0);
      mag2.addBox(0F, 0F, 0F, 4, 30, 7);
      mag2.setRotationPoint(-3.5F, -6F, -24F);
      mag2.setTextureSize(64, 32);
      mag2.mirror = true;
      setRotation(mag2, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    
    mag1.render(f5);
    mag2.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
}