package com.vicmatskiv.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class G36KReticle extends ModelBase {
	private final ModelRenderer bone;
	private final ModelRenderer bone2;

	public G36KReticle() {
		textureWidth = 256;
		textureHeight = 256;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 0, 2, -1.0F, -72.0F, 0.0F, 1, 25, 0, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 1, -79.0F, -79.0F, 0.0F, 72, 1, 0, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 6.0F, -79.0F, 0.0F, 72, 1, 0, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 2, 5, -2.0F, -76.0F, 0.0F, 3, 1, 0, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 2, 2, -2.0F, -82.25F, 0.0F, 3, 1, 0, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 6, 6, -4.12F, -80.12F, 0.0F, 1, 3, 0, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 4, 6, 2.1F, -80.12F, 0.0F, 1, 3, 0, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-1.5F, -75.0F, 0.0F);
		bone.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.0F, 0.7854F);
		bone2.cubeList.add(new ModelBox(bone2, 2, 4, -3.3536F, -0.6464F, 0.0F, 3, 1, 0, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 2, 6, -5.4749F, -4.7678F, 0.0F, 1, 3, 0, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 8, 8, 0.7678F, -4.7678F, 0.0F, 1, 3, 0, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 2, 3, -3.3536F, -6.8891F, 0.0F, 3, 1, 0, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}