package com.vicmatskiv.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class G36KScope extends ModelBase {
	private final ModelRenderer bone;
	private final ModelRenderer bone2;

	public G36KScope() {
		textureWidth = 16;
		textureHeight = 16;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 0, 0, -1.0F, -7.0F, -1.0F, 3, 1, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -1.0F, -13.24F, -1.0F, 3, 1, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -3.12F, -11.12F, -1.0F, 1, 3, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 3.12F, -11.12F, -1.0F, 1, 3, 2, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-1.0F, -6.0F, 0.0F);
		bone.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.0F, 0.7854F);
		bone2.cubeList.add(new ModelBox(bone2, 0, 0, -3.0F, -1.0F, -1.0F, 3, 1, 2, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 0, 0, 1.1213F, -5.1213F, -1.0F, 1, 3, 2, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 0, 0, -5.1213F, -5.1213F, -1.0F, 1, 3, 2, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 0, 0, -3.0F, -7.2426F, -1.0F, 3, 1, 2, 0.0F, false));
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