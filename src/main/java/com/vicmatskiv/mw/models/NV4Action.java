// Date: 3/9/2019 12:53:47 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.vicmatskiv.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class NV4Action extends ModelBase
{
  //fields
    ModelRenderer Action1;
    ModelRenderer Action2;
    ModelRenderer Action3;
    ModelRenderer Action4;
    ModelRenderer Action5;
    ModelRenderer Action6;
    ModelRenderer Action7;
    ModelRenderer Action8;
    ModelRenderer Action9;
    ModelRenderer Action10;
    ModelRenderer Action11;
    ModelRenderer Action12;
    ModelRenderer Action13;
  
  public NV4Action()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      Action1 = new ModelRenderer(this, 0, 0);
      Action1.addBox(0F, 0F, 0F, 2, 1, 15);
      Action1.setRotationPoint(-0.3F, 0F, 0F);
      Action1.setTextureSize(64, 32);
      Action1.mirror = true;
      setRotation(Action1, 0F, 0F, 0F);
      Action2 = new ModelRenderer(this, 0, 0);
      Action2.addBox(0F, 0F, 0F, 6, 2, 1);
      Action2.setRotationPoint(-2F, -0.5F, 14.5F);
      Action2.setTextureSize(64, 32);
      Action2.mirror = true;
      setRotation(Action2, 0F, 0F, 0F);
      Action3 = new ModelRenderer(this, 0, 0);
      Action3.addBox(0F, 0F, 0F, 2, 2, 1);
      Action3.setRotationPoint(-2F, -0.5F, 14.5F);
      Action3.setTextureSize(64, 32);
      Action3.mirror = true;
      setRotation(Action3, 0F, 0.5576792F, 0F);
      Action4 = new ModelRenderer(this, 0, 0);
      Action4.addBox(0F, 0F, 0F, 1, 2, 2);
      Action4.setRotationPoint(4F, -0.5F, 14.5F);
      Action4.setTextureSize(64, 32);
      Action4.mirror = true;
      setRotation(Action4, 0F, -2.119181F, 0F);
      Action5 = new ModelRenderer(this, 0, 0);
      Action5.addBox(0F, 0F, 0F, 4, 2, 1);
      Action5.setRotationPoint(-1F, -0.5F, 14F);
      Action5.setTextureSize(64, 32);
      Action5.mirror = true;
      setRotation(Action5, 0F, 0F, 0F);
      Action6 = new ModelRenderer(this, 0, 0);
      Action6.addBox(0F, 0F, 0F, 3, 1, 1);
      Action6.setRotationPoint(1.5F, 0F, 13.7F);
      Action6.setTextureSize(64, 32);
      Action6.mirror = true;
      setRotation(Action6, 0F, 0.0743572F, 0F);
      Action7 = new ModelRenderer(this, 0, 0);
      Action7.addBox(0F, 0F, 0F, 1, 1, 15);
      Action7.setRotationPoint(1.3F, 0F, 0F);
      Action7.setTextureSize(64, 32);
      Action7.mirror = true;
      setRotation(Action7, 0F, 0F, 0F);
      Action8 = new ModelRenderer(this, 0, 0);
      Action8.addBox(0F, 0F, 0F, 5, 2, 1);
      Action8.setRotationPoint(-1.5F, -0.5F, 14.8F);
      Action8.setTextureSize(64, 32);
      Action8.mirror = true;
      setRotation(Action8, 0F, 0F, 0F);
      Action9 = new ModelRenderer(this, 0, 30);
      Action9.addBox(0F, 0F, 0F, 3, 1, 1);
      Action9.setRotationPoint(2.5F, 0.2F, 13.4F);
      Action9.setTextureSize(64, 32);
      Action9.mirror = true;
      setRotation(Action9, 0F, 0.1858931F, 0F);
      Action10 = new ModelRenderer(this, 0, 30);
      Action10.addBox(0F, 0F, 0F, 3, 1, 1);
      Action10.setRotationPoint(0.5F, 0.2F, 13.4F);
      Action10.setTextureSize(64, 32);
      Action10.mirror = true;
      setRotation(Action10, 0F, 0F, 0F);
      Action11 = new ModelRenderer(this, 0, 30);
      Action11.addBox(0F, 0F, 0F, 2, 1, 3);
      Action11.setRotationPoint(0.5F, 0.2F, 10.4F);
      Action11.setTextureSize(64, 32);
      Action11.mirror = true;
      setRotation(Action11, 0F, 0F, 0F);
      Action12 = new ModelRenderer(this, 0, 30);
      Action12.addBox(0F, 0F, 0F, 3, 2, 1);
      Action12.setRotationPoint(4.5F, -1.5F, 13F);
      Action12.setTextureSize(64, 32);
      Action12.mirror = true;
      setRotation(Action12, 0F, 0.4089647F, 0F);
      Action13 = new ModelRenderer(this, 0, 30);
      Action13.addBox(0F, 0F, 0F, 3, 1, 1);
      Action13.setRotationPoint(4.5F, 0F, 13F);
      Action13.setTextureSize(64, 32);
      Action13.mirror = true;
      setRotation(Action13, 0F, 0.4089647F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Action1.render(f5);
    Action2.render(f5);
    Action3.render(f5);
    Action4.render(f5);
    Action5.render(f5);
    Action6.render(f5);
    Action7.render(f5);
    Action8.render(f5);
    Action9.render(f5);
    Action10.render(f5);
    Action11.render(f5);
    Action12.render(f5);
    Action13.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}