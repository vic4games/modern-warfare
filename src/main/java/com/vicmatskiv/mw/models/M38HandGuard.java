package com.vicmatskiv.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.6.2
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class M38HandGuard extends ModelBase {
	private final ModelRenderer handguard19;
	private final ModelRenderer handguard26;
	private final ModelRenderer handguard33;
	private final ModelRenderer handguard40;
	private final ModelRenderer handguard43;
	private final ModelRenderer bone;
	private final ModelRenderer handguard10;

	public M38HandGuard() {
		textureWidth = 256;
		textureHeight = 256;

		handguard19 = new ModelRenderer(this);
		handguard19.setRotationPoint(0.7F, -14.4F, -48.7F);
		setRotationAngle(handguard19, 0.0F, 0.0F, 0.7436F);
		handguard19.cubeList.add(new ModelBox(handguard19, 0, 0, -1.9F, 0.0F, 0.0F, 1, 1, 18, 0.0F, true));
		handguard19.cubeList.add(new ModelBox(handguard19, 0, 0, -0.4F, 0.0F, 0.0F, 1, 1, 18, 0.0F, true));
		handguard19.cubeList.add(new ModelBox(handguard19, 0, 0, -2.0F, 0.0F, 18.0F, 2, 1, 8, 0.0F, true));
		handguard19.cubeList.add(new ModelBox(handguard19, 0, 0, -1.0F, 0.0F, 15.0F, 1, 1, 1, 0.0F, true));
		handguard19.cubeList.add(new ModelBox(handguard19, 0, 0, -1.0F, 0.0F, 11.0F, 1, 1, 1, 0.0F, true));
		handguard19.cubeList.add(new ModelBox(handguard19, 0, 0, -1.0F, 0.0F, 7.0F, 1, 1, 1, 0.0F, true));
		handguard19.cubeList.add(new ModelBox(handguard19, 0, 0, -1.0F, 0.0F, 3.0F, 1, 1, 1, 0.0F, true));
		handguard19.cubeList.add(new ModelBox(handguard19, 0, 0, -2.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F, true));

		handguard26 = new ModelRenderer(this);
		handguard26.setRotationPoint(-3.7F, -14.4F, -48.7F);
		setRotationAngle(handguard26, 0.0F, 0.0F, -0.7436F);
		handguard26.cubeList.add(new ModelBox(handguard26, 0, 0, -0.6F, 0.0F, 0.0F, 1, 1, 18, 0.0F, true));
		handguard26.cubeList.add(new ModelBox(handguard26, 0, 0, 0.9F, 0.0F, 0.0F, 1, 1, 18, 0.0F, true));
		handguard26.cubeList.add(new ModelBox(handguard26, 0, 0, 0.0F, 0.0F, 18.0F, 2, 1, 8, 0.0F, true));
		handguard26.cubeList.add(new ModelBox(handguard26, 0, 0, 0.0F, 0.0F, 15.0F, 1, 1, 1, 0.0F, true));
		handguard26.cubeList.add(new ModelBox(handguard26, 0, 0, 0.0F, 0.0F, 11.0F, 1, 1, 1, 0.0F, true));
		handguard26.cubeList.add(new ModelBox(handguard26, 0, 0, 0.0F, 0.0F, 7.0F, 1, 1, 1, 0.0F, true));
		handguard26.cubeList.add(new ModelBox(handguard26, 0, 0, 0.0F, 0.0F, 3.0F, 1, 1, 1, 0.0F, true));
		handguard26.cubeList.add(new ModelBox(handguard26, 0, 0, 0.0F, 0.0F, -2.0F, 2, 1, 2, 0.0F, true));

		handguard33 = new ModelRenderer(this);
		handguard33.setRotationPoint(-3.7F, -12.5F, -48.7F);
		setRotationAngle(handguard33, 0.0F, 0.0F, 0.6692F);
		handguard33.cubeList.add(new ModelBox(handguard33, 0, 0, 0.9F, -1.0F, 0.0F, 1, 1, 18, 0.0F, true));
		handguard33.cubeList.add(new ModelBox(handguard33, 0, 0, -0.6F, -1.0F, 0.0F, 1, 1, 18, 0.0F, true));
		handguard33.cubeList.add(new ModelBox(handguard33, 0, 0, 0.0F, -1.0F, 18.0F, 2, 1, 8, 0.0F, true));
		handguard33.cubeList.add(new ModelBox(handguard33, 0, 0, 0.0F, -1.0F, 15.0F, 1, 1, 1, 0.0F, true));
		handguard33.cubeList.add(new ModelBox(handguard33, 0, 0, 0.0F, -1.0F, 11.0F, 1, 1, 1, 0.0F, true));
		handguard33.cubeList.add(new ModelBox(handguard33, 0, 0, 0.0F, -1.0F, 7.0F, 1, 1, 1, 0.0F, true));
		handguard33.cubeList.add(new ModelBox(handguard33, 0, 0, 0.0F, -1.0F, 3.0F, 1, 1, 1, 0.0F, true));
		handguard33.cubeList.add(new ModelBox(handguard33, 0, 0, 0.0F, -1.0F, -2.0F, 2, 1, 2, 0.0F, true));

		handguard40 = new ModelRenderer(this);
		handguard40.setRotationPoint(0.7F, -12.5F, -48.7F);
		setRotationAngle(handguard40, 0.0F, 0.0F, -0.6692F);
		handguard40.cubeList.add(new ModelBox(handguard40, 0, 0, -1.9F, -1.0F, 0.0F, 1, 1, 18, 0.0F, true));
		handguard40.cubeList.add(new ModelBox(handguard40, 0, 0, -0.4F, -1.0F, 0.0F, 1, 1, 18, 0.0F, true));
		handguard40.cubeList.add(new ModelBox(handguard40, 0, 0, -2.0F, -1.0F, 18.0F, 2, 1, 8, 0.0F, true));
		handguard40.cubeList.add(new ModelBox(handguard40, 0, 0, -1.0F, -1.0F, 15.0F, 1, 1, 1, 0.0F, true));
		handguard40.cubeList.add(new ModelBox(handguard40, 0, 0, -1.0F, -1.0F, 11.0F, 1, 1, 1, 0.0F, true));
		handguard40.cubeList.add(new ModelBox(handguard40, 0, 0, -1.0F, -1.0F, 7.0F, 1, 1, 1, 0.0F, true));
		handguard40.cubeList.add(new ModelBox(handguard40, 0, 0, -1.0F, -1.0F, 3.0F, 1, 1, 1, 0.0F, true));
		handguard40.cubeList.add(new ModelBox(handguard40, 0, 0, -2.0F, -1.0F, -2.0F, 2, 1, 2, 0.0F, true));

		handguard43 = new ModelRenderer(this);
		handguard43.setRotationPoint(-3.7F, -12.3F, -27.3F);
		setRotationAngle(handguard43, 0.2603F, 0.0F, 0.0F);
		handguard43.cubeList.add(new ModelBox(handguard43, 0, 0, 0.1F, 0.0F, 0.0F, 1, 1, 1, 0.0F, true));
		handguard43.cubeList.add(new ModelBox(handguard43, 0, 0, 3.3F, 0.0F, 0.0F, 1, 1, 1, 0.0F, true));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 0, 0, -3.5F, -37.2F, -27.7F, 4, 2, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 0.0F, -38.4F, -50.7F, 1, 2, 28, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -2.3F, -36.2F, -50.7F, 2, 1, 28, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -2.7F, -39.8F, -50.7F, 1, 1, 28, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -2.3F, -39.8F, -50.7F, 2, 1, 28, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -2.5F, -35.9F, -50.7F, 2, 1, 28, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -2.5F, -40.1F, -50.7F, 2, 1, 28, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -4.0F, -38.4F, -50.7F, 1, 2, 28, 0.0F, true));

		handguard10 = new ModelRenderer(this);
		handguard10.setRotationPoint(-2.7F, -36.2F, -50.7F);
		bone.addChild(handguard10);
		handguard10.cubeList.add(new ModelBox(handguard10, 0, 0, 0.0F, 0.0F, 0.0F, 1, 1, 28, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		handguard19.render(f5);
		handguard26.render(f5);
		handguard33.render(f5);
		handguard40.render(f5);
		handguard43.render(f5);
		bone.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}