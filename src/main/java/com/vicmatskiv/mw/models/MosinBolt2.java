// Date: 7/15/2017 2:21:33 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.vicmatskiv.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class MosinBolt2 extends ModelBase
{
  //fields
    ModelRenderer mosinbolt13;
    ModelRenderer mosinbolt14;
    ModelRenderer mosinbolt15;
  
  public MosinBolt2()
  {
    textureWidth = 256;
    textureHeight = 128;
    
      
      mosinbolt13 = new ModelRenderer(this, 0, 0);
      mosinbolt13.addBox(0F, 0F, 0F, 1, 1, 4);
      mosinbolt13.setRotationPoint(-2.5F, -15.8F, -17F);
      mosinbolt13.setTextureSize(64, 32);
      mosinbolt13.mirror = true;
      setRotation(mosinbolt13, 0F, 0F, 0F);
      mosinbolt14 = new ModelRenderer(this, 0, 0);
      mosinbolt14.addBox(0F, 0F, 0F, 1, 1, 1);
      mosinbolt14.setRotationPoint(-2.5F, -15.8F, -13F);
      mosinbolt14.setTextureSize(64, 32);
      mosinbolt14.mirror = true;
      setRotation(mosinbolt14, -0.669215F, 0F, 0F);
      mosinbolt15 = new ModelRenderer(this, 0, 0);
      mosinbolt15.addBox(0F, 0F, 0F, 1, 1, 1);
      mosinbolt15.setRotationPoint(-2.5F, -15F, -12F);
      mosinbolt15.setTextureSize(64, 32);
      mosinbolt15.mirror = true;
      setRotation(mosinbolt15, -2.267895F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    
    mosinbolt13.render(f5);
    mosinbolt14.render(f5);
    mosinbolt15.render(f5);
    
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }

}