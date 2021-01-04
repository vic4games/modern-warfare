package com.vicmatskiv.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class UMP9Mag extends ModelBase {
	private final ModelRenderer mag3;
	private final ModelRenderer mag;
	private final ModelRenderer mag2;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;

	public UMP9Mag() {
		textureWidth = 64;
		textureHeight = 64;

		mag3 = new ModelRenderer(this);
		mag3.setRotationPoint(-2.0F, 24.0F, 0.0F);
		

		mag = new ModelRenderer(this);
		mag.setRotationPoint(0.25F, -27.75F, -23.0F);
		mag3.addChild(mag);
		setRotationAngle(mag, -0.1571F, 0.0F, 0.0F);
		mag.cubeList.add(new ModelBox(mag, 0, 0, -1.25F, -4.0F, 0.0F, 3, 4, 5, 0.0F, false));

		mag2 = new ModelRenderer(this);
		mag2.setRotationPoint(0.25F, -26.95F, -18.0F);
		mag3.addChild(mag2);
		setRotationAngle(mag2, -0.2443F, 0.0F, 0.0F);
		mag2.cubeList.add(new ModelBox(mag2, 33, 8, 0.9F, 0.0F, -2.0F, 1, 6, 2, 0.0F, false));
		mag2.cubeList.add(new ModelBox(mag2, 32, 23, 0.7F, 0.0476F, -3.431F, 1, 6, 2, 0.0F, false));
		mag2.cubeList.add(new ModelBox(mag2, 18, 31, -1.2F, 0.0476F, -3.431F, 1, 6, 2, 0.0F, false));
		mag2.cubeList.add(new ModelBox(mag2, 20, 23, -1.4F, 0.0F, -2.0F, 3, 6, 2, 0.0F, false));
		mag2.cubeList.add(new ModelBox(mag2, 0, 0, 0.9F, 5.15F, -4.1F, 1, 1, 1, 0.0F, false));
		mag2.cubeList.add(new ModelBox(mag2, 9, 10, -1.3F, 5.15F, -4.1F, 3, 1, 1, 0.0F, false));
		mag2.cubeList.add(new ModelBox(mag2, 12, 31, 0.9F, -0.0268F, -5.1F, 1, 6, 2, 0.0F, false));
		mag2.cubeList.add(new ModelBox(mag2, 12, 12, -1.3F, -0.0268F, -5.1F, 3, 6, 2, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.1F, 5.9396F, -4.1F);
		mag2.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.2269F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 34, 34, -1.4F, 4.9104F, 2.0F, 3, 1, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 18, -1.4F, -0.8896F, 2.0F, 3, 6, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 10, 23, -1.4F, 0.0F, -1.0F, 3, 6, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 11, 0, 0.8F, 4.9104F, 2.0F, 1, 1, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 26, -1.3F, -0.4322F, 0.6618F, 1, 7, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 6, 29, 0.6001F, -0.4322F, 0.6618F, 1, 7, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 29, 15, 0.8F, -0.8896F, 2.0F, 1, 6, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 34, 31, -1.4F, 5.2104F, -1.0F, 3, 1, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 10, 20, 0.8F, 5.2104F, -1.0F, 1, 1, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 30, 0, 0.8F, 0.0F, -1.0F, 1, 6, 2, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-0.3F, 11.7354F, -5.4376F);
		mag2.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.4538F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 28, 29, 1.2F, -0.9352F, 1.8876F, 1, 6, 2, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 22, 8, 1.2F, 0.0F, -1.0F, 1, 6, 3, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 20, 0, -1.0F, -0.9352F, 1.8876F, 3, 6, 2, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 9, -1.0F, 0.0F, -1.0F, 3, 6, 3, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-0.1F, 17.5571F, -3.9861F);
		mag2.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.4538F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 11, 4, -1.2F, 0.3584F, -4.9604F, 2, 1, 5, 0.1F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 17, 17, 1.0F, 0.3584F, -4.9604F, 1, 1, 5, 0.1F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		mag3.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}