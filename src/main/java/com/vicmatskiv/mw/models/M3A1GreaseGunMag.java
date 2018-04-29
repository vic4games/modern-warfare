package com.vicmatskiv.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class M3A1GreaseGunMag extends ModelBase
{
  //fields
    
    ModelRenderer mag1;
  
  public M3A1GreaseGunMag()
  {
    textureWidth = 512;
    textureHeight = 256;
    
      
      mag1 = new ModelRenderer(this, 0, 0);
      mag1.addBox(0F, 0F, 0F, 3, 30, 7);
      mag1.setRotationPoint(-3F, -9.2F, -37F);
      mag1.setTextureSize(64, 32);
      mag1.mirror = true;
      setRotation(mag1, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    
    mag1.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }

}
