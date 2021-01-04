package com.vicmatskiv.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class Glock19GhostPrecisionSlide extends ModelBase {
	private final ModelRenderer gun;
	private final ModelRenderer gun31_r1;
	private final ModelRenderer gun110_r1;
	private final ModelRenderer gun109_r1;
	private final ModelRenderer gun113_r1;
	private final ModelRenderer gun112_r1;
	private final ModelRenderer gun111_r1;
	private final ModelRenderer gun110_r2;
	private final ModelRenderer gun111_r2;
	private final ModelRenderer gun110_r3;
	private final ModelRenderer gun111_r3;
	private final ModelRenderer gun110_r4;
	private final ModelRenderer gun111_r4;
	private final ModelRenderer gun110_r5;
	private final ModelRenderer gun111_r5;
	private final ModelRenderer gun111_r6;
	private final ModelRenderer gun39_r1;
	private final ModelRenderer gun38_r1;
	private final ModelRenderer gun37_r1;
	private final ModelRenderer gun93_r1;
	private final ModelRenderer gun92_r1;
	private final ModelRenderer gun92_r2;
	private final ModelRenderer gun141_r1;
	private final ModelRenderer gun140_r1;
	private final ModelRenderer gun157_r1;
	private final ModelRenderer gun10_r1;
	private final ModelRenderer gun12_r1;
	private final ModelRenderer gun13_r1;
	private final ModelRenderer gun13_r2;
	private final ModelRenderer gun14_r1;
	private final ModelRenderer gun13_r3;
	private final ModelRenderer gun11_r1;
	private final ModelRenderer gun10_r2;
	private final ModelRenderer gun9_r1;
	private final ModelRenderer gun11_r2;
	private final ModelRenderer gun12_r2;
	private final ModelRenderer gun12_r3;
	private final ModelRenderer gun13_r4;
	private final ModelRenderer gun10_r3;
	private final ModelRenderer gun9_r2;
	private final ModelRenderer gun8_r1;
	private final ModelRenderer gun7_r1;
	private final ModelRenderer gun6_r1;
	private final ModelRenderer gun145_r1;
	private final ModelRenderer gun145_r2;
	private final ModelRenderer gun144_r1;
	private final ModelRenderer mag13rnd;
	private final ModelRenderer mag3_r1;
	private final ModelRenderer mag5_r1;
	private final ModelRenderer mag4_r1;
	private final ModelRenderer mag20rnd;
	private final ModelRenderer mag4_r2;
	private final ModelRenderer mag6_r1;
	private final ModelRenderer mag5_r2;
	private final ModelRenderer G18slide;
	private final ModelRenderer slide55_r1;
	private final ModelRenderer slide53_r1;
	private final ModelRenderer slide19_r1;
	private final ModelRenderer slide18_r1;
	private final ModelRenderer slide22_r1;
	private final ModelRenderer slide21_r1;
	private final ModelRenderer slide20_r1;
	private final ModelRenderer slide20_r2;
	private final ModelRenderer slide19_r2;
	private final ModelRenderer G18cncslide;
	private final ModelRenderer slide56_r1;
	private final ModelRenderer slide54_r1;
	private final ModelRenderer slide20_r3;
	private final ModelRenderer slide19_r3;
	private final ModelRenderer slide23_r1;
	private final ModelRenderer slide22_r2;
	private final ModelRenderer slide21_r2;
	private final ModelRenderer slide21_r3;
	private final ModelRenderer slide20_r4;
	private final ModelRenderer G19slide;
	private final ModelRenderer slide56_r2;
	private final ModelRenderer slide54_r2;
	private final ModelRenderer slide23_r2;
	private final ModelRenderer slide22_r3;
	private final ModelRenderer slide21_r4;
	private final ModelRenderer slide21_r5;
	private final ModelRenderer slide20_r5;
	private final ModelRenderer G19razorbackslide;
	private final ModelRenderer slide59_r1;
	private final ModelRenderer slide70_r1;
	private final ModelRenderer slide57_r1;
	private final ModelRenderer slide58_r1;
	private final ModelRenderer slide57_r2;
	private final ModelRenderer slide57_r3;
	private final ModelRenderer slide16_r1;
	private final ModelRenderer slide15_r1;
	private final ModelRenderer slide19_r4;
	private final ModelRenderer slide23_r3;
	private final ModelRenderer slide22_r4;
	private final ModelRenderer slide21_r6;
	private final ModelRenderer slide21_r7;
	private final ModelRenderer slide20_r6;
	private final ModelRenderer slide19_r5;
	private final ModelRenderer slide17_r1;
	private final ModelRenderer slide16_r2;
	private final ModelRenderer slide15_r2;
	private final ModelRenderer slide14_r1;
	private final ModelRenderer slide15_r3;
	private final ModelRenderer slide14_r2;
	private final ModelRenderer slide34_r1;
	private final ModelRenderer slide34_r2;
	private final ModelRenderer slide34_r3;
	private final ModelRenderer slide33_r1;
	private final ModelRenderer slide32_r1;
	private final ModelRenderer slide33_r2;
	private final ModelRenderer slide32_r2;
	private final ModelRenderer slide31_r1;
	private final ModelRenderer slide42_r1;
	private final ModelRenderer slide41_r1;
	private final ModelRenderer slide38_r1;
	private final ModelRenderer slide35_r1;
	private final ModelRenderer slide35_r2;
	private final ModelRenderer slide34_r4;
	private final ModelRenderer slide29_r1;
	private final ModelRenderer slide29_r2;
	private final ModelRenderer slide30_r1;
	private final ModelRenderer slide28_r1;
	private final ModelRenderer G19rockslide;
	private final ModelRenderer slide16_r3;
	private final ModelRenderer slide17_r2;
	private final ModelRenderer slide16_r4;
	private final ModelRenderer slide17_r3;
	private final ModelRenderer slide18_r2;
	private final ModelRenderer slide19_r6;
	private final ModelRenderer slide57_r4;
	private final ModelRenderer slide55_r2;
	private final ModelRenderer slide25_r1;
	private final ModelRenderer slide24_r1;
	private final ModelRenderer slide27_r1;
	private final ModelRenderer slide29_r3;
	private final ModelRenderer slide28_r2;
	private final ModelRenderer slide27_r2;
	private final ModelRenderer slide26_r1;
	private final ModelRenderer slide25_r2;
	private final ModelRenderer slide24_r2;
	private final ModelRenderer slide23_r4;
	private final ModelRenderer slide22_r5;
	private final ModelRenderer slide22_r6;
	private final ModelRenderer slide21_r8;
	private final ModelRenderer slide25_r3;
	private final ModelRenderer slide24_r3;
	private final ModelRenderer slide17_r4;
	private final ModelRenderer slide16_r5;
	private final ModelRenderer slide19_r7;
	private final ModelRenderer slide18_r3;
	private final ModelRenderer slide20_r7;
	private final ModelRenderer slide19_r8;
	private final ModelRenderer slide18_r4;
	private final ModelRenderer slide17_r5;
	private final ModelRenderer G19ghostprecisionslide;
	private final ModelRenderer slide18_r5;
	private final ModelRenderer slide17_r6;
	private final ModelRenderer slide16_r6;
	private final ModelRenderer slide15_r4;
	private final ModelRenderer slide15_r5;
	private final ModelRenderer slide16_r7;
	private final ModelRenderer slide59_r2;
	private final ModelRenderer slide56_r3;
	private final ModelRenderer slide26_r2;
	private final ModelRenderer slide28_r3;
	private final ModelRenderer slide27_r3;
	private final ModelRenderer slide28_r4;
	private final ModelRenderer slide29_r4;
	private final ModelRenderer slide30_r2;
	private final ModelRenderer slide28_r5;
	private final ModelRenderer slide35_r3;
	private final ModelRenderer slide34_r5;
	private final ModelRenderer slide33_r3;
	private final ModelRenderer slide32_r3;
	private final ModelRenderer slide31_r2;
	private final ModelRenderer slide30_r3;
	private final ModelRenderer slide29_r5;
	private final ModelRenderer slide27_r4;
	private final ModelRenderer slide27_r5;
	private final ModelRenderer slide26_r3;
	private final ModelRenderer slide25_r4;
	private final ModelRenderer slide26_r4;
	private final ModelRenderer slide25_r5;
	private final ModelRenderer slide24_r4;
	private final ModelRenderer slide23_r5;
	private final ModelRenderer slide23_r6;
	private final ModelRenderer slide22_r7;

	public Glock19GhostPrecisionSlide() {
		textureWidth = 64;
		textureHeight = 64;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.0F, 24.0F, 0.0F);
		gun.cubeList.add(new ModelBox(gun, 0, 53, -2.999F, -31.0F, -6.8F, 4, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 53, 73, -2.5F, -17.5F, -4.8F, 3, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 66, 53, -3.001F, -19.5F, -3.7F, 4, 3, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 68, 12, -2.999F, -20.0F, 1.9F, 4, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 41, 0, -2.5F, -20.0F, 2.9F, 3, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 19, 64, -3.0F, -32.0F, -8.5F, 4, 2, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 65, 21, -3.0F, -34.0F, 0.25F, 4, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 41, 3, -2.5F, -35.7F, 0.8F, 3, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 68, 0, -0.1F, -32.0F, -6.5F, 1, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 66, 45, -2.9F, -32.0F, -6.5F, 1, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 81, 40, -2.499F, -27.5F, -16.5F, 3, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 45, 20, -2.3F, -37.9F, -15.5F, 2, 2, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 19, 53, -3.0F, -34.7F, -28.4F, 1, 1, 15, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 51, 0, 0.0F, -34.7F, -28.4F, 1, 1, 15, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 30, 69, -2.999F, -33.8F, -19.4F, 4, 2, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 68, 0, -2.999F, -34.0F, -10.5F, 4, 1, 11, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 72, -2.999F, -33.0F, -10.5F, 4, 1, 10, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 24, 30, -0.299F, -34.0F, -13.4F, 1, 3, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 14, 30, -2.699F, -34.0F, -13.4F, 1, 3, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 31, 0, -2.499F, -31.6F, -16.1F, 3, 4, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 18, 72, -2.0F, -32.3F, -26.8F, 2, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 58, -2.0F, -32.3F, -22.8F, 2, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 34, 45, -2.0F, -32.5F, -23.8F, 2, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 80, 12, -2.8F, -34.0F, -28.4F, 1, 1, 9, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 51, 80, -0.2F, -34.0F, -28.4F, 1, 1, 9, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 31, 20, -2.5F, -33.2F, -27.4F, 3, 1, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 14, -2.6F, -37.6F, -15.5F, 1, 2, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 44, 20, -2.0F, -35.0F, -29.0F, 2, 2, 17, -0.3F, false));

		gun31_r1 = new ModelRenderer(this);
		gun31_r1.setRotationPoint(-2.0F, -37.3F, -28.8F);
		gun.addChild(gun31_r1);
		setRotationAngle(gun31_r1, -0.0372F, 0.0F, 0.0F);
		gun31_r1.cubeList.add(new ModelBox(gun31_r1, 45, 45, 0.0F, 0.0F, 0.0F, 2, 2, 17, 0.0F, false));

		gun110_r1 = new ModelRenderer(this);
		gun110_r1.setRotationPoint(1.0F, -33.7F, -28.4F);
		gun.addChild(gun110_r1);
		setRotationAngle(gun110_r1, 0.0F, 0.0F, 0.9774F);
		gun110_r1.cubeList.add(new ModelBox(gun110_r1, 62, 81, -1.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		gun109_r1 = new ModelRenderer(this);
		gun109_r1.setRotationPoint(-3.0F, -33.7F, -28.4F);
		gun.addChild(gun109_r1);
		setRotationAngle(gun109_r1, 0.0F, 0.0F, -0.9774F);
		gun109_r1.cubeList.add(new ModelBox(gun109_r1, 81, 30, 0.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		gun113_r1 = new ModelRenderer(this);
		gun113_r1.setRotationPoint(-1.3F, -32.2F, -27.4F);
		gun.addChild(gun113_r1);
		setRotationAngle(gun113_r1, 0.0F, 0.0F, -0.7854F);
		gun113_r1.cubeList.add(new ModelBox(gun113_r1, 44, 39, -1.0F, -1.0F, 0.0F, 1, 1, 8, 0.0F, false));

		gun112_r1 = new ModelRenderer(this);
		gun112_r1.setRotationPoint(0.7F, -32.2F, -27.4F);
		gun.addChild(gun112_r1);
		setRotationAngle(gun112_r1, 0.0F, 0.0F, -0.7854F);
		gun112_r1.cubeList.add(new ModelBox(gun112_r1, 0, 83, -1.0F, -1.0F, 0.0F, 1, 1, 8, 0.0F, false));

		gun111_r1 = new ModelRenderer(this);
		gun111_r1.setRotationPoint(0.8F, -33.0F, -28.4F);
		gun.addChild(gun111_r1);
		setRotationAngle(gun111_r1, 0.0F, 0.0F, -0.7854F);
		gun111_r1.cubeList.add(new ModelBox(gun111_r1, 74, 77, -1.0F, -1.0F, 0.0F, 1, 1, 9, 0.0F, false));

		gun110_r2 = new ModelRenderer(this);
		gun110_r2.setRotationPoint(-2.8F, -33.0F, -28.4F);
		gun.addChild(gun110_r2);
		setRotationAngle(gun110_r2, 0.0F, 0.0F, -0.7854F);
		gun110_r2.cubeList.add(new ModelBox(gun110_r2, 40, 79, 0.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		gun111_r2 = new ModelRenderer(this);
		gun111_r2.setRotationPoint(0.0F, -31.53F, -27.8F);
		gun.addChild(gun111_r2);
		setRotationAngle(gun111_r2, 0.6632F, 0.0F, 0.0F);
		gun111_r2.cubeList.add(new ModelBox(gun111_r2, 44, 41, -2.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

		gun110_r3 = new ModelRenderer(this);
		gun110_r3.setRotationPoint(0.0F, -31.3F, -26.8F);
		gun.addChild(gun110_r3);
		setRotationAngle(gun110_r3, 1.3439F, 0.0F, 0.0F);
		gun110_r3.cubeList.add(new ModelBox(gun110_r3, 24, 45, -2.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

		gun111_r3 = new ModelRenderer(this);
		gun111_r3.setRotationPoint(1.501F, -31.2F, -19.5F);
		gun.addChild(gun111_r3);
		setRotationAngle(gun111_r3, 1.5184F, 0.0F, 0.0F);
		gun111_r3.cubeList.add(new ModelBox(gun111_r3, 0, 0, -4.001F, 0.0F, 0.0F, 3, 11, 1, 0.0F, false));

		gun110_r4 = new ModelRenderer(this);
		gun110_r4.setRotationPoint(1.001F, -31.8F, -19.4F);
		gun.addChild(gun110_r4);
		setRotationAngle(gun110_r4, 1.501F, 0.0F, 0.0F);
		gun110_r4.cubeList.add(new ModelBox(gun110_r4, 19, 57, -4.001F, 0.0F, 0.0F, 4, 6, 1, 0.0F, false));

		gun111_r4 = new ModelRenderer(this);
		gun111_r4.setRotationPoint(-2.999F, -31.8F, -19.4F);
		gun.addChild(gun111_r4);
		setRotationAngle(gun111_r4, 0.0F, -0.7854F, 0.0F);
		gun111_r4.cubeList.add(new ModelBox(gun111_r4, 81, 40, 0.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F, false));

		gun110_r5 = new ModelRenderer(this);
		gun110_r5.setRotationPoint(1.001F, -31.8F, -19.4F);
		gun.addChild(gun110_r5);
		setRotationAngle(gun110_r5, 0.0F, -0.7854F, 0.0F);
		gun110_r5.cubeList.add(new ModelBox(gun110_r5, 81, 43, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun111_r5 = new ModelRenderer(this);
		gun111_r5.setRotationPoint(0.501F, -29.8F, -15.6F);
		gun.addChild(gun111_r5);
		setRotationAngle(gun111_r5, 0.8727F, 0.0F, 0.0F);
		gun111_r5.cubeList.add(new ModelBox(gun111_r5, 0, 72, -3.002F, -2.0F, 0.0F, 3, 2, 2, 0.0F, false));

		gun111_r6 = new ModelRenderer(this);
		gun111_r6.setRotationPoint(1.101F, -32.85F, -7.5F);
		gun.addChild(gun111_r6);
		setRotationAngle(gun111_r6, 0.0F, 0.0F, 0.192F);
		gun111_r6.cubeList.add(new ModelBox(gun111_r6, 23, 0, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun39_r1 = new ModelRenderer(this);
		gun39_r1.setRotationPoint(-3.0F, -30.9F, -10.7F);
		gun.addChild(gun39_r1);
		setRotationAngle(gun39_r1, -0.1222F, 0.0F, 0.0F);
		gun39_r1.cubeList.add(new ModelBox(gun39_r1, 15, 22, -0.001F, -2.0F, 0.0F, 4, 2, 3, 0.0F, false));

		gun38_r1 = new ModelRenderer(this);
		gun38_r1.setRotationPoint(-3.0F, -30.9F, -10.7F);
		gun.addChild(gun38_r1);
		setRotationAngle(gun38_r1, 1.8218F, 0.0F, 0.0F);
		gun38_r1.cubeList.add(new ModelBox(gun38_r1, 51, 10, 0.0F, 0.0F, 0.0F, 4, 1, 3, 0.0F, false));

		gun37_r1 = new ModelRenderer(this);
		gun37_r1.setRotationPoint(-3.0F, -30.9F, -13.5F);
		gun.addChild(gun37_r1);
		setRotationAngle(gun37_r1, 1.8218F, 0.0F, 0.0F);
		gun37_r1.cubeList.add(new ModelBox(gun37_r1, 19, 53, 0.0F, 0.0F, 0.0F, 4, 1, 3, 0.0F, false));

		gun93_r1 = new ModelRenderer(this);
		gun93_r1.setRotationPoint(0.5F, -27.5F, -13.6F);
		gun.addChild(gun93_r1);
		setRotationAngle(gun93_r1, -0.5934F, 0.0F, 0.0F);
		gun93_r1.cubeList.add(new ModelBox(gun93_r1, 69, 73, -3.0F, 0.0F, -2.0F, 3, 1, 2, 0.0F, false));

		gun92_r1 = new ModelRenderer(this);
		gun92_r1.setRotationPoint(0.5F, -27.5F, -16.5F);
		gun.addChild(gun92_r1);
		setRotationAngle(gun92_r1, -0.4538F, 0.0F, 0.0F);
		gun92_r1.cubeList.add(new ModelBox(gun92_r1, 44, 44, -3.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun92_r2 = new ModelRenderer(this);
		gun92_r2.setRotationPoint(0.501F, -26.5F, -9.5F);
		gun.addChild(gun92_r2);
		setRotationAngle(gun92_r2, 2.0246F, 0.0F, 0.0F);
		gun92_r2.cubeList.add(new ModelBox(gun92_r2, 41, 9, -3.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F, false));

		gun141_r1 = new ModelRenderer(this);
		gun141_r1.setRotationPoint(-2.0F, -29.5F, -10.0F);
		gun.addChild(gun141_r1);
		setRotationAngle(gun141_r1, 3.0356F, 0.0F, 0.0F);
		gun141_r1.cubeList.add(new ModelBox(gun141_r1, 23, 14, 0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F, false));

		gun140_r1 = new ModelRenderer(this);
		gun140_r1.setRotationPoint(-2.0F, -29.5F, -10.0F);
		gun.addChild(gun140_r1);
		setRotationAngle(gun140_r1, -2.3051F, 0.0F, 0.0F);
		gun140_r1.cubeList.add(new ModelBox(gun140_r1, 41, 12, 0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

		gun157_r1 = new ModelRenderer(this);
		gun157_r1.setRotationPoint(-0.2F, -31.3F, -12.3F);
		gun.addChild(gun157_r1);
		setRotationAngle(gun157_r1, 1.8218F, 0.0F, 0.0F);
		gun157_r1.cubeList.add(new ModelBox(gun157_r1, 23, 3, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));
		gun157_r1.cubeList.add(new ModelBox(gun157_r1, 23, 17, -2.6F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun10_r1 = new ModelRenderer(this);
		gun10_r1.setRotationPoint(1.0F, -30.0F, -8.5F);
		gun.addChild(gun10_r1);
		setRotationAngle(gun10_r1, -0.5585F, 0.0F, 0.0F);
		gun10_r1.cubeList.add(new ModelBox(gun10_r1, 24, 50, -3.999F, -1.0F, 0.0F, 4, 1, 1, 0.0F, false));

		gun12_r1 = new ModelRenderer(this);
		gun12_r1.setRotationPoint(1.0F, -31.7F, -1.4F);
		gun.addChild(gun12_r1);
		setRotationAngle(gun12_r1, -1.0647F, 0.0F, 0.0F);
		gun12_r1.cubeList.add(new ModelBox(gun12_r1, 69, 64, -4.001F, -3.0F, -1.0F, 4, 3, 1, 0.0F, false));

		gun13_r1 = new ModelRenderer(this);
		gun13_r1.setRotationPoint(1.0F, -33.0F, 2.25F);
		gun.addChild(gun13_r1);
		setRotationAngle(gun13_r1, 0.1745F, 0.0F, 0.0F);
		gun13_r1.cubeList.add(new ModelBox(gun13_r1, 48, 56, -4.001F, -1.0F, -2.0F, 4, 1, 2, 0.0F, false));

		gun13_r2 = new ModelRenderer(this);
		gun13_r2.setRotationPoint(1.0F, -34.0F, 2.25F);
		gun.addChild(gun13_r2);
		setRotationAngle(gun13_r2, 1.0123F, 0.0F, 0.0F);
		gun13_r2.cubeList.add(new ModelBox(gun13_r2, 10, 50, -4.001F, -1.0F, -1.0F, 4, 1, 1, 0.0F, false));

		gun14_r1 = new ModelRenderer(this);
		gun14_r1.setRotationPoint(0.5F, -31.0F, -0.45F);
		gun.addChild(gun14_r1);
		setRotationAngle(gun14_r1, 0.1396F, 0.0F, 0.0F);
		gun14_r1.cubeList.add(new ModelBox(gun14_r1, 0, 63, -2.999F, 0.0F, -2.0F, 3, 4, 2, 0.0F, false));

		gun13_r3 = new ModelRenderer(this);
		gun13_r3.setRotationPoint(0.5F, -33.0F, 2.25F);
		gun.addChild(gun13_r3);
		setRotationAngle(gun13_r3, 0.5236F, 0.0F, 0.0F);
		gun13_r3.cubeList.add(new ModelBox(gun13_r3, 63, 41, -3.0F, -1.0F, -3.0F, 3, 1, 3, 0.0F, false));

		gun11_r1 = new ModelRenderer(this);
		gun11_r1.setRotationPoint(0.5F, -30.0F, -0.8F);
		gun.addChild(gun11_r1);
		setRotationAngle(gun11_r1, -0.576F, 0.0F, 0.0F);
		gun11_r1.cubeList.add(new ModelBox(gun11_r1, 65, 24, -3.001F, -3.0F, -2.0F, 3, 3, 2, 0.0F, false));

		gun10_r2 = new ModelRenderer(this);
		gun10_r2.setRotationPoint(1.0F, -30.0F, -1.8F);
		gun.addChild(gun10_r2);
		setRotationAngle(gun10_r2, -0.576F, 0.0F, 0.0F);
		gun10_r2.cubeList.add(new ModelBox(gun10_r2, 54, 39, -4.001F, -3.0F, -2.0F, 4, 3, 2, 0.0F, false));

		gun9_r1 = new ModelRenderer(this);
		gun9_r1.setRotationPoint(-2.5F, -17.5F, -4.8F);
		gun.addChild(gun9_r1);
		setRotationAngle(gun9_r1, 0.8029F, 0.0F, 0.0F);
		gun9_r1.cubeList.add(new ModelBox(gun9_r1, 25, 72, 0.001F, 0.0F, 0.0F, 3, 1, 2, 0.0F, false));

		gun11_r2 = new ModelRenderer(this);
		gun11_r2.setRotationPoint(1.001F, -20.0F, 2.9F);
		gun.addChild(gun11_r2);
		setRotationAngle(gun11_r2, -1.0996F, 0.0F, 0.0F);
		gun11_r2.cubeList.add(new ModelBox(gun11_r2, 65, 30, -4.0F, 0.0F, -6.0F, 4, 1, 6, 0.0F, false));

		gun12_r2 = new ModelRenderer(this);
		gun12_r2.setRotationPoint(0.501F, -20.0F, 3.9F);
		gun.addChild(gun12_r2);
		setRotationAngle(gun12_r2, 0.4712F, 0.0F, 0.0F);
		gun12_r2.cubeList.add(new ModelBox(gun12_r2, 51, 0, -3.0F, -9.0F, -1.0F, 3, 9, 1, 0.0F, false));

		gun12_r3 = new ModelRenderer(this);
		gun12_r3.setRotationPoint(0.501F, -18.0F, 3.9F);
		gun.addChild(gun12_r3);
		setRotationAngle(gun12_r3, -0.7854F, 0.0F, 0.0F);
		gun12_r3.cubeList.add(new ModelBox(gun12_r3, 69, 69, -3.0F, 0.0F, -2.0F, 3, 2, 2, 0.0F, false));

		gun13_r4 = new ModelRenderer(this);
		gun13_r4.setRotationPoint(-1.699F, -17.8F, 2.5F);
		gun.addChild(gun13_r4);
		setRotationAngle(gun13_r4, -0.4014F, 0.0F, 0.0F);
		gun13_r4.cubeList.add(new ModelBox(gun13_r4, 86, 61, -1.001F, 0.0F, -1.0F, 1, 1, 1, 0.3F, false));
		gun13_r4.cubeList.add(new ModelBox(gun13_r4, 0, 87, 1.399F, 0.0F, -1.0F, 1, 1, 1, 0.3F, false));

		gun10_r3 = new ModelRenderer(this);
		gun10_r3.setRotationPoint(-5.1F, -31.45F, -8.8F);
		gun.addChild(gun10_r3);
		setRotationAngle(gun10_r3, 0.3543F, 0.0F, 0.0F);
		gun10_r3.cubeList.add(new ModelBox(gun10_r3, 4, 87, 2.0F, 3.0F, 1.0F, 1, 1, 1, 0.0F, false));

		gun9_r2 = new ModelRenderer(this);
		gun9_r2.setRotationPoint(-1.9F, -31.35F, -8.6F);
		gun.addChild(gun9_r2);
		setRotationAngle(gun9_r2, 0.3543F, 0.0F, 0.0F);
		gun9_r2.cubeList.add(new ModelBox(gun9_r2, 7, 14, 2.0F, 3.0F, 0.0F, 1, 2, 2, 0.0F, false));

		gun8_r1 = new ModelRenderer(this);
		gun8_r1.setRotationPoint(-2.3F, -31.2F, -9.0F);
		gun.addChild(gun8_r1);
		setRotationAngle(gun8_r1, 0.3543F, 0.0F, 0.0F);
		gun8_r1.cubeList.add(new ModelBox(gun8_r1, 45, 81, 2.0F, 3.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun7_r1 = new ModelRenderer(this);
		gun7_r1.setRotationPoint(-2.5F, -30.7F, -9.2F);
		gun.addChild(gun7_r1);
		setRotationAngle(gun7_r1, 0.3543F, 0.0F, 0.0F);
		gun7_r1.cubeList.add(new ModelBox(gun7_r1, 22, 77, 0.0F, 0.0F, 0.0F, 3, 14, 6, 0.0F, false));

		gun6_r1 = new ModelRenderer(this);
		gun6_r1.setRotationPoint(-3.0F, -30.0F, -8.0F);
		gun.addChild(gun6_r1);
		setRotationAngle(gun6_r1, 0.3718F, 0.0F, 0.0F);
		gun6_r1.cubeList.add(new ModelBox(gun6_r1, 0, 30, 0.0F, 0.0F, 0.0F, 4, 14, 6, 0.0F, false));

		gun145_r1 = new ModelRenderer(this);
		gun145_r1.setRotationPoint(-2.6F, -30.0F, -5.8F);
		gun.addChild(gun145_r1);
		setRotationAngle(gun145_r1, 0.0F, 0.0F, 0.7854F);
		gun145_r1.cubeList.add(new ModelBox(gun145_r1, 65, 16, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		gun145_r2 = new ModelRenderer(this);
		gun145_r2.setRotationPoint(0.5F, -33.3F, -7.95F);
		gun.addChild(gun145_r2);
		setRotationAngle(gun145_r2, 0.0F, 0.0F, 0.7854F);
		gun145_r2.cubeList.add(new ModelBox(gun145_r2, 34, 39, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		gun144_r1 = new ModelRenderer(this);
		gun144_r1.setRotationPoint(0.6F, -30.0F, -5.8F);
		gun.addChild(gun144_r1);
		setRotationAngle(gun144_r1, 0.0F, 0.0F, 0.7854F);
		gun144_r1.cubeList.add(new ModelBox(gun144_r1, 68, 5, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		mag13rnd = new ModelRenderer(this);
		mag13rnd.setRotationPoint(0.0F, 24.0F, 0.0F);
		mag13rnd.cubeList.add(new ModelBox(mag13rnd, 90, 17, -3.0F, -16.2F, -3.5F, 4, 2, 6, 0.0F, false));
		mag13rnd.cubeList.add(new ModelBox(mag13rnd, 41, 66, -2.5F, -16.2F, -4.25F, 3, 2, 1, 0.0F, false));

		mag3_r1 = new ModelRenderer(this);
		mag3_r1.setRotationPoint(-2.5F, -30.0F, -7.0F);
		mag13rnd.addChild(mag3_r1);
		setRotationAngle(mag3_r1, 0.2974F, 0.0F, 0.0F);
		mag3_r1.cubeList.add(new ModelBox(mag3_r1, 24, 79, 0.0F, 0.0F, 0.0F, 3, 16, 5, 0.0F, false));
		mag3_r1.cubeList.add(new ModelBox(mag3_r1, 50, 0, 0.5F, 0.0F, -0.5F, 2, 15, 1, 0.0F, false));

		mag5_r1 = new ModelRenderer(this);
		mag5_r1.setRotationPoint(0.5F, -14.1F, -4.35F);
		mag13rnd.addChild(mag5_r1);
		setRotationAngle(mag5_r1, -1.2741F, 0.0F, 0.0F);
		mag5_r1.cubeList.add(new ModelBox(mag5_r1, 0, 55, -3.0F, -1.0F, -2.0F, 3, 1, 2, -0.1F, false));

		mag4_r1 = new ModelRenderer(this);
		mag4_r1.setRotationPoint(1.0F, -16.3F, 2.6F);
		mag13rnd.addChild(mag4_r1);
		setRotationAngle(mag4_r1, -1.2392F, 0.0F, 0.0F);
		mag4_r1.cubeList.add(new ModelBox(mag4_r1, 15, 24, -4.0F, 0.0F, 0.0F, 4, 1, 2, -0.1F, false));

		mag20rnd = new ModelRenderer(this);
		mag20rnd.setRotationPoint(0.0F, 24.0F, 0.0F);
		mag20rnd.cubeList.add(new ModelBox(mag20rnd, 79, 9, -3.0F, -5.2F, -0.2F, 4, 2, 6, 0.0F, false));
		mag20rnd.cubeList.add(new ModelBox(mag20rnd, 17, 66, -2.5F, -5.2F, -0.95F, 3, 2, 1, 0.0F, false));

		mag4_r2 = new ModelRenderer(this);
		mag4_r2.setRotationPoint(-2.5F, -30.0F, -7.0F);
		mag20rnd.addChild(mag4_r2);
		setRotationAngle(mag4_r2, 0.2974F, 0.0F, 0.0F);
		mag4_r2.cubeList.add(new ModelBox(mag4_r2, 57, 59, 0.0F, 0.0F, 0.0F, 3, 28, 5, 0.0F, false));
		mag4_r2.cubeList.add(new ModelBox(mag4_r2, 49, 62, 0.5F, 0.0F, -0.5F, 2, 27, 1, 0.0F, false));

		mag6_r1 = new ModelRenderer(this);
		mag6_r1.setRotationPoint(0.5F, -3.1F, -1.05F);
		mag20rnd.addChild(mag6_r1);
		setRotationAngle(mag6_r1, -1.2741F, 0.0F, 0.0F);
		mag6_r1.cubeList.add(new ModelBox(mag6_r1, 46, 21, -3.0F, -1.0F, -2.0F, 3, 1, 2, -0.1F, false));

		mag5_r2 = new ModelRenderer(this);
		mag5_r2.setRotationPoint(1.0F, -5.3F, 5.9F);
		mag20rnd.addChild(mag5_r2);
		setRotationAngle(mag5_r2, -1.2392F, 0.0F, 0.0F);
		mag5_r2.cubeList.add(new ModelBox(mag5_r2, 17, 10, -4.0F, 0.0F, 0.0F, 4, 1, 2, -0.1F, false));

		G18slide = new ModelRenderer(this);
		G18slide.setRotationPoint(0.0F, 24.0F, 0.0F);
		G18slide.cubeList.add(new ModelBox(G18slide, 103, 33, -2.5F, -37.5F, 0.9F, 3, 2, 1, 0.0F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 24, 15, -2.3F, -37.5F, -28.499F, 2, 5, 1, 0.0F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 47, 47, -0.7F, -37.5F, -28.501F, 1, 5, 1, 0.0F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 47, 63, 0.1F, -37.0F, -4.5F, 1, 3, 6, 0.0F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 15, 62, -3.1F, -37.0F, -4.5F, 1, 3, 6, 0.0F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 151, 71, 0.101F, -37.5F, -4.5F, 1, 1, 6, 0.0F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 151, 57, -3.099F, -37.5F, -4.5F, 1, 1, 6, 0.0F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 138, 19, -2.4F, -38.1F, -10.5F, 2, 1, 12, 0.0F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 32, 63, -0.6F, -38.101F, -28.5F, 1, 1, 30, 0.0F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 26, 94, 0.2F, -37.501F, -28.5F, 1, 1, 24, 0.0F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 136, 57, -3.2F, -37.501F, -28.5F, 1, 1, 13, 0.0F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 130, 122, -3.2F, -37.501F, 1.001F, 1, 1, 1, 0.0F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 130, 120, 0.199F, -37.501F, 1.001F, 1, 1, 1, 0.0F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 13, 93, -3.2F, -37.501F, -7.5F, 1, 2, 3, 0.0F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 90, 90, 0.201F, -37.001F, -28.5F, 1, 3, 24, 0.0F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 0, 62, -3.199F, -37.001F, -28.5F, 1, 3, 13, 0.0F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 0, 67, -3.199F, -37.001F, 1.0F, 1, 3, 1, 0.0F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 130, 118, -3.099F, -35.901F, 0.9F, 1, 1, 1, 0.0F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 130, 37, -1.5F, -35.901F, 0.9F, 1, 1, 1, 0.0F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 130, 39, 0.101F, -35.901F, 0.9F, 1, 1, 1, 0.0F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 64, 19, 0.2F, -37.001F, 1.0F, 1, 3, 1, 0.0F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 36, 119, 0.45F, -37.75F, -0.25F, 1, 4, 1, -0.25F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 78, 118, -3.45F, -37.75F, -0.25F, 1, 4, 1, -0.25F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 89, 118, -3.45F, -37.75F, -2.25F, 1, 4, 1, -0.25F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 29, 119, 0.45F, -37.75F, -1.25F, 1, 4, 1, -0.25F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 82, 118, -3.45F, -37.75F, -1.25F, 1, 4, 1, -0.25F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 25, 119, 0.45F, -37.75F, -3.25F, 1, 4, 1, -0.25F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 93, 118, -3.45F, -37.75F, -3.25F, 1, 4, 1, -0.25F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 118, 8, 0.45F, -37.75F, -4.25F, 1, 4, 1, -0.25F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 118, 0, -3.45F, -37.75F, -4.25F, 1, 4, 1, -0.25F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 116, 100, -3.199F, -36.001F, -15.5F, 1, 2, 11, 0.0F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 39, 98, -3.2F, -36.201F, -10.5F, 1, 1, 3, 0.0F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 63, 131, -0.6F, -38.1F, 1.001F, 1, 1, 1, 0.0F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 116, 61, -2.4F, -38.099F, 1.001F, 2, 1, 1, 0.0F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 32, 16, -2.4F, -38.1F, -28.5F, 2, 1, 13, 0.0F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 120, 71, -3.0F, -37.0F, -10.499F, 1, 1, 1, 0.0F, false));
		G18slide.cubeList.add(new ModelBox(G18slide, 68, 94, -2.9F, -37.0F, -9.5F, 1, 1, 2, 0.0F, false));

		slide55_r1 = new ModelRenderer(this);
		slide55_r1.setRotationPoint(-2.4F, -38.1F, -28.5F);
		G18slide.addChild(slide55_r1);
		setRotationAngle(slide55_r1, 0.0F, 0.0F, -0.6545F);
		slide55_r1.cubeList.add(new ModelBox(slide55_r1, 123, 149, -1.0F, 0.0F, 18.0F, 1, 1, 12, 0.0F, false));
		slide55_r1.cubeList.add(new ModelBox(slide55_r1, 136, 76, -1.0F, 0.0F, 0.0F, 1, 1, 13, 0.0F, false));
		slide55_r1.cubeList.add(new ModelBox(slide55_r1, 55, 131, -1.0F, 0.0F, 29.5F, 1, 1, 1, 0.0F, false));

		slide53_r1 = new ModelRenderer(this);
		slide53_r1.setRotationPoint(0.4F, -38.1F, -28.5F);
		G18slide.addChild(slide53_r1);
		setRotationAngle(slide53_r1, 0.0F, 0.0F, 0.6545F);
		slide53_r1.cubeList.add(new ModelBox(slide53_r1, 0, 62, 0.0F, 0.0F, 0.0F, 1, 1, 30, 0.0F, false));
		slide53_r1.cubeList.add(new ModelBox(slide53_r1, 59, 131, 0.0F, 0.0F, 29.5F, 1, 1, 1, 0.0F, false));

		slide19_r1 = new ModelRenderer(this);
		slide19_r1.setRotationPoint(1.5F, -34.301F, -2.2F);
		G18slide.addChild(slide19_r1);
		setRotationAngle(slide19_r1, 0.4189F, 0.0F, 0.0F);
		slide19_r1.cubeList.add(new ModelBox(slide19_r1, 0, 98, -1.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		slide18_r1 = new ModelRenderer(this);
		slide18_r1.setRotationPoint(1.4F, -34.201F, -1.1F);
		G18slide.addChild(slide18_r1);
		setRotationAngle(slide18_r1, 0.4189F, 0.0F, 0.0F);
		slide18_r1.cubeList.add(new ModelBox(slide18_r1, 39, 0, -1.0F, -2.0F, 0.0F, 1, 2, 2, 0.0F, false));

		slide22_r1 = new ModelRenderer(this);
		slide22_r1.setRotationPoint(-0.5F, -36.501F, 0.55F);
		G18slide.addChild(slide22_r1);
		setRotationAngle(slide22_r1, -0.7854F, 0.0F, 0.0F);
		slide22_r1.cubeList.add(new ModelBox(slide22_r1, 37, 107, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide21_r1 = new ModelRenderer(this);
		slide21_r1.setRotationPoint(-0.5F, -36.301F, 0.55F);
		G18slide.addChild(slide21_r1);
		setRotationAngle(slide21_r1, -0.7854F, 0.0F, 0.0F);
		slide21_r1.cubeList.add(new ModelBox(slide21_r1, 104, 107, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide20_r1 = new ModelRenderer(this);
		slide20_r1.setRotationPoint(-0.5F, -35.901F, 0.55F);
		G18slide.addChild(slide20_r1);
		setRotationAngle(slide20_r1, -0.7854F, 0.0F, 0.0F);
		slide20_r1.cubeList.add(new ModelBox(slide20_r1, 0, 108, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide20_r2 = new ModelRenderer(this);
		slide20_r2.setRotationPoint(-0.5F, -36.101F, 0.55F);
		G18slide.addChild(slide20_r2);
		setRotationAngle(slide20_r2, -0.7854F, 0.0F, 0.0F);
		slide20_r2.cubeList.add(new ModelBox(slide20_r2, 96, 107, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide19_r2 = new ModelRenderer(this);
		slide19_r2.setRotationPoint(-0.5F, -35.701F, 0.55F);
		G18slide.addChild(slide19_r2);
		setRotationAngle(slide19_r2, -0.7854F, 0.0F, 0.0F);
		slide19_r2.cubeList.add(new ModelBox(slide19_r2, 14, 108, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		G18cncslide = new ModelRenderer(this);
		G18cncslide.setRotationPoint(0.0F, 24.0F, 0.0F);
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 54, 72, -2.5F, -37.5F, 0.9F, 3, 2, 1, 0.0F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 0, 0, -2.3F, -37.5F, -28.499F, 2, 5, 1, 0.0F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 8, 31, -0.7F, -37.5F, -28.501F, 1, 5, 1, 0.0F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 0, 15, 0.1F, -37.0F, -4.5F, 1, 3, 6, 0.0F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 0, 0, -3.1F, -37.0F, -4.5F, 1, 3, 6, 0.0F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 79, 0, 0.101F, -37.5F, -4.5F, 1, 1, 6, 0.0F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 15, 78, -3.099F, -37.5F, -4.5F, 1, 1, 6, 0.0F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 22, 71, -2.4F, -38.1F, -10.5F, 2, 1, 2, 0.0F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 91, 150, -2.0F, -37.85F, -8.75F, 2, 1, 7, 0.0F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 64, 52, -2.4F, -38.1F, -18.5F, 2, 1, 3, 0.0F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 0, 87, -0.6F, -38.101F, -28.5F, 1, 1, 3, 0.0F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 90, 43, -0.6F, -38.101F, -18.5F, 1, 1, 10, 0.0F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 90, 56, 0.2F, -37.501F, -28.5F, 1, 1, 24, 0.0F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 32, 63, -3.2F, -37.501F, -28.5F, 1, 1, 13, 0.0F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 58, 11, -3.2F, -37.501F, 1.001F, 1, 1, 1, 0.0F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 58, 4, 0.199F, -37.501F, 1.001F, 1, 1, 1, 0.0F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 47, 85, -3.2F, -37.501F, -7.5F, 1, 2, 3, 0.0F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 64, 64, 0.201F, -37.001F, -28.5F, 1, 3, 24, 0.0F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 0, 31, -3.199F, -37.001F, -28.5F, 1, 3, 13, 0.0F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 40, 22, -3.199F, -37.001F, 1.0F, 1, 3, 1, 0.0F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 26, 58, -3.099F, -35.901F, 0.9F, 1, 1, 1, 0.0F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 57, 56, -1.5F, -35.901F, 0.9F, 1, 1, 1, 0.0F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 57, 9, 0.101F, -35.901F, 0.9F, 1, 1, 1, 0.0F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 32, 39, 0.2F, -37.001F, 1.0F, 1, 3, 1, 0.0F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 47, 63, 0.45F, -37.75F, -0.25F, 1, 4, 1, -0.25F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 23, 62, -3.45F, -37.75F, -0.25F, 1, 4, 1, -0.25F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 15, 62, -3.45F, -37.75F, -2.25F, 1, 4, 1, -0.25F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 55, 46, 0.45F, -37.75F, -1.25F, 1, 4, 1, -0.25F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 55, 0, -3.45F, -37.75F, -1.25F, 1, 4, 1, -0.25F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 47, 0, 0.45F, -37.75F, -3.25F, 1, 4, 1, -0.25F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 32, 6, -3.45F, -37.75F, -3.25F, 1, 4, 1, -0.25F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 32, 0, 0.45F, -37.75F, -4.25F, 1, 4, 1, -0.25F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 32, 32, -3.45F, -37.75F, -4.25F, 1, 4, 1, -0.25F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 90, 30, -3.199F, -36.001F, -15.5F, 1, 2, 11, 0.0F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 5, 40, -3.2F, -36.201F, -10.5F, 1, 1, 3, 0.0F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 64, 0, -0.6F, -38.1F, -1.999F, 1, 1, 4, 0.0F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 32, 39, -2.4F, -38.099F, -1.999F, 2, 1, 4, 0.0F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 15, 71, -2.4F, -38.1F, -28.5F, 2, 1, 3, 0.0F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 25, 40, -3.0F, -37.0F, -10.499F, 1, 1, 1, 0.0F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 39, 32, -2.9F, -37.0F, -9.5F, 1, 1, 2, 0.0F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 96, 96, -2.65F, -38.351F, -26.0F, 1, 1, 8, -0.25F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 0, 118, -2.65F, -38.351F, -8.75F, 1, 1, 7, -0.25F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 76, 94, -0.35F, -38.35F, -26.0F, 1, 1, 8, -0.25F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 102, 117, -0.35F, -38.35F, -8.75F, 1, 1, 7, -0.25F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 32, 63, -0.85F, -38.35F, -22.25F, 1, 1, 4, -0.25F, false));
		G18cncslide.cubeList.add(new ModelBox(G18cncslide, 0, 62, -2.15F, -38.35F, -22.25F, 1, 1, 4, -0.25F, false));

		slide56_r1 = new ModelRenderer(this);
		slide56_r1.setRotationPoint(-2.4F, -38.1F, -28.5F);
		G18cncslide.addChild(slide56_r1);
		setRotationAngle(slide56_r1, 0.0F, 0.0F, -0.6545F);
		slide56_r1.cubeList.add(new ModelBox(slide56_r1, 32, 139, -1.0F, 0.0F, 18.0F, 1, 1, 12, 0.0F, false));
		slide56_r1.cubeList.add(new ModelBox(slide56_r1, 0, 47, -1.0F, 0.0F, 0.0F, 1, 1, 13, 0.0F, false));
		slide56_r1.cubeList.add(new ModelBox(slide56_r1, 25, 56, -1.0F, 0.0F, 29.5F, 1, 1, 1, 0.0F, false));

		slide54_r1 = new ModelRenderer(this);
		slide54_r1.setRotationPoint(0.4F, -38.1F, -28.5F);
		G18cncslide.addChild(slide54_r1);
		setRotationAngle(slide54_r1, 0.0F, 0.0F, 0.6545F);
		slide54_r1.cubeList.add(new ModelBox(slide54_r1, 0, 0, 0.0F, 0.0F, 0.0F, 1, 1, 30, 0.0F, false));
		slide54_r1.cubeList.add(new ModelBox(slide54_r1, 41, 56, 0.0F, 0.0F, 29.5F, 1, 1, 1, 0.0F, false));

		slide20_r3 = new ModelRenderer(this);
		slide20_r3.setRotationPoint(1.5F, -34.301F, -2.2F);
		G18cncslide.addChild(slide20_r3);
		setRotationAngle(slide20_r3, 0.4189F, 0.0F, 0.0F);
		slide20_r3.cubeList.add(new ModelBox(slide20_r3, 32, 86, -1.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		slide19_r3 = new ModelRenderer(this);
		slide19_r3.setRotationPoint(1.4F, -34.201F, -1.1F);
		G18cncslide.addChild(slide19_r3);
		setRotationAngle(slide19_r3, 0.4189F, 0.0F, 0.0F);
		slide19_r3.cubeList.add(new ModelBox(slide19_r3, 15, 31, -1.0F, -2.0F, 0.0F, 1, 2, 2, 0.0F, false));

		slide23_r1 = new ModelRenderer(this);
		slide23_r1.setRotationPoint(-0.5F, -36.501F, 0.55F);
		G18cncslide.addChild(slide23_r1);
		setRotationAngle(slide23_r1, -0.7854F, 0.0F, 0.0F);
		slide23_r1.cubeList.add(new ModelBox(slide23_r1, 90, 68, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide22_r2 = new ModelRenderer(this);
		slide22_r2.setRotationPoint(-0.5F, -36.301F, 0.55F);
		G18cncslide.addChild(slide22_r2);
		setRotationAngle(slide22_r2, -0.7854F, 0.0F, 0.0F);
		slide22_r2.cubeList.add(new ModelBox(slide22_r2, 64, 91, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide21_r2 = new ModelRenderer(this);
		slide21_r2.setRotationPoint(-0.5F, -35.901F, 0.55F);
		G18cncslide.addChild(slide21_r2);
		setRotationAngle(slide21_r2, -0.7854F, 0.0F, 0.0F);
		slide21_r2.cubeList.add(new ModelBox(slide21_r2, 72, 91, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide21_r3 = new ModelRenderer(this);
		slide21_r3.setRotationPoint(-0.5F, -36.101F, 0.55F);
		G18cncslide.addChild(slide21_r3);
		setRotationAngle(slide21_r3, -0.7854F, 0.0F, 0.0F);
		slide21_r3.cubeList.add(new ModelBox(slide21_r3, 80, 91, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide20_r4 = new ModelRenderer(this);
		slide20_r4.setRotationPoint(-0.5F, -35.701F, 0.55F);
		G18cncslide.addChild(slide20_r4);
		setRotationAngle(slide20_r4, -0.7854F, 0.0F, 0.0F);
		slide20_r4.cubeList.add(new ModelBox(slide20_r4, 0, 102, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		G19slide = new ModelRenderer(this);
		G19slide.setRotationPoint(0.0F, 24.0F, 0.0F);
		G19slide.cubeList.add(new ModelBox(G19slide, 64, 19, -2.5F, -37.5F, 0.9F, 3, 2, 1, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 15, 15, -2.3F, -37.5F, -28.499F, 2, 5, 1, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 8, 0, -0.7F, -37.5F, -28.501F, 1, 5, 1, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 15, 31, 0.1F, -37.0F, -4.5F, 1, 3, 6, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 15, 15, -3.1F, -37.0F, -4.5F, 1, 3, 6, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 56, 25, 0.101F, -37.5F, -4.5F, 1, 1, 6, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 15, 45, -3.099F, -37.5F, -4.5F, 1, 1, 6, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 73, 73, -2.4F, -38.1F, -10.5F, 2, 1, 12, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 0, 31, -0.6F, -38.101F, -28.5F, 1, 1, 30, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 32, 0, 0.2F, -37.501F, -28.5F, 1, 1, 24, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 0, 45, -3.2F, -37.501F, -28.5F, 1, 1, 13, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 52, 18, -3.2F, -37.501F, 1.001F, 1, 1, 1, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 52, 16, 0.199F, -37.501F, 1.001F, 1, 1, 1, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 34, 62, -3.2F, -37.501F, -7.5F, 1, 2, 3, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 32, 32, 0.201F, -37.001F, -28.5F, 1, 3, 24, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 0, 14, -3.199F, -37.001F, -28.5F, 1, 3, 13, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 0, 38, -3.199F, -37.001F, 1.0F, 1, 3, 1, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 42, 52, -3.099F, -35.901F, 0.9F, 1, 1, 1, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 25, 52, -1.5F, -35.901F, 0.9F, 1, 1, 1, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 9, 52, 0.101F, -35.901F, 0.9F, 1, 1, 1, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 32, 25, 0.2F, -37.001F, 1.0F, 1, 3, 1, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 15, 45, 0.45F, -37.75F, -0.25F, 1, 4, 1, -0.25F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 44, 0, -3.45F, -37.75F, -0.25F, 1, 4, 1, -0.25F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 9, 37, -3.45F, -37.75F, -2.25F, 1, 4, 1, -0.25F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 32, 0, 0.45F, -37.75F, -1.25F, 1, 4, 1, -0.25F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 0, 14, 0.45F, -37.75F, -2.25F, 1, 4, 1, -0.25F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 32, 32, -3.45F, -37.75F, -1.25F, 1, 4, 1, -0.25F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 23, 31, 0.45F, -37.75F, -3.25F, 1, 4, 1, -0.25F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 15, 31, -3.45F, -37.75F, -3.25F, 1, 4, 1, -0.25F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 25, 5, 0.45F, -37.75F, -4.25F, 1, 4, 1, -0.25F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 25, 0, -3.45F, -37.75F, -4.25F, 1, 4, 1, -0.25F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 0, 78, -3.199F, -36.001F, -15.5F, 1, 2, 11, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 5, 9, -3.2F, -36.201F, -10.5F, 1, 1, 3, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 9, 50, -0.6F, -38.1F, 1.001F, 1, 1, 1, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 24, 59, -2.4F, -38.099F, 1.001F, 2, 1, 1, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 0, 0, -2.4F, -38.1F, -28.5F, 2, 1, 13, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 25, 24, -3.0F, -37.0F, -10.499F, 1, 1, 1, 0.0F, false));
		G19slide.cubeList.add(new ModelBox(G19slide, 23, 14, -2.9F, -37.0F, -9.5F, 1, 1, 2, 0.0F, false));

		slide56_r2 = new ModelRenderer(this);
		slide56_r2.setRotationPoint(-2.4F, -38.1F, -28.5F);
		G19slide.addChild(slide56_r2);
		setRotationAngle(slide56_r2, 0.0F, 0.0F, -0.6545F);
		slide56_r2.cubeList.add(new ModelBox(slide56_r2, 73, 56, -1.0F, 0.0F, 18.0F, 1, 1, 12, 0.0F, false));
		slide56_r2.cubeList.add(new ModelBox(slide56_r2, 0, 31, -1.0F, 0.0F, 0.0F, 1, 1, 13, 0.0F, false));
		slide56_r2.cubeList.add(new ModelBox(slide56_r2, 26, 35, -1.0F, 0.0F, 29.5F, 1, 1, 1, 0.0F, false));

		slide54_r2 = new ModelRenderer(this);
		slide54_r2.setRotationPoint(0.4F, -38.1F, -28.5F);
		G19slide.addChild(slide54_r2);
		setRotationAngle(slide54_r2, 0.0F, 0.0F, 0.6545F);
		slide54_r2.cubeList.add(new ModelBox(slide54_r2, 0, 0, 0.0F, 0.0F, 0.0F, 1, 1, 30, 0.0F, false));
		slide54_r2.cubeList.add(new ModelBox(slide54_r2, 8, 45, 0.0F, 0.0F, 29.5F, 1, 1, 1, 0.0F, false));

		slide23_r2 = new ModelRenderer(this);
		slide23_r2.setRotationPoint(-0.5F, -36.501F, 0.55F);
		G19slide.addChild(slide23_r2);
		setRotationAngle(slide23_r2, -0.7854F, 0.0F, 0.0F);
		slide23_r2.cubeList.add(new ModelBox(slide23_r2, 58, 40, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide22_r3 = new ModelRenderer(this);
		slide22_r3.setRotationPoint(-0.5F, -36.301F, 0.55F);
		G19slide.addChild(slide22_r3);
		setRotationAngle(slide22_r3, -0.7854F, 0.0F, 0.0F);
		slide22_r3.cubeList.add(new ModelBox(slide22_r3, 0, 59, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide21_r4 = new ModelRenderer(this);
		slide21_r4.setRotationPoint(-0.5F, -35.901F, 0.55F);
		G19slide.addChild(slide21_r4);
		setRotationAngle(slide21_r4, -0.7854F, 0.0F, 0.0F);
		slide21_r4.cubeList.add(new ModelBox(slide21_r4, 8, 59, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide21_r5 = new ModelRenderer(this);
		slide21_r5.setRotationPoint(-0.5F, -36.101F, 0.55F);
		G19slide.addChild(slide21_r5);
		setRotationAngle(slide21_r5, -0.7854F, 0.0F, 0.0F);
		slide21_r5.cubeList.add(new ModelBox(slide21_r5, 16, 59, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide20_r5 = new ModelRenderer(this);
		slide20_r5.setRotationPoint(-0.5F, -35.701F, 0.55F);
		G19slide.addChild(slide20_r5);
		setRotationAngle(slide20_r5, -0.7854F, 0.0F, 0.0F);
		slide20_r5.cubeList.add(new ModelBox(slide20_r5, 32, 59, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		G19razorbackslide = new ModelRenderer(this);
		G19razorbackslide.setRotationPoint(0.0F, 24.0F, 0.0F);
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 31, 5, -2.5F, -37.5F, 0.9F, 3, 2, 1, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 15, 15, -2.3F, -37.5F, -28.499F, 2, 5, 1, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 8, 0, -0.7F, -37.5F, -28.501F, 1, 5, 1, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 31, 0, -3.1F, -36.0F, -16.5F, 1, 2, 18, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 24, 30, 0.1F, -36.0F, -16.5F, 1, 2, 18, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 31, 9, -3.1F, -35.0F, -28.5F, 1, 1, 8, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 31, 0, 0.1F, -35.0F, -28.5F, 1, 1, 8, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 36, 61, -3.1F, -37.0F, -28.5F, 1, 2, 4, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 36, 53, 0.1F, -37.0F, -28.5F, 1, 2, 4, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 6, 65, -3.101F, -35.5F, -20.5F, 1, 1, 4, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 53, 64, 0.099F, -35.5F, -20.5F, 1, 1, 4, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 37, 50, -3.099F, -37.5F, -7.5F, 1, 2, 9, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 0, 53, 0.101F, -37.5F, -15.5F, 1, 2, 17, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 69, 64, -2.4F, -38.1F, -10.5F, 2, 1, 12, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 0, 50, -3.0F, -38.2F, -2.75F, 4, 1, 1, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 44, 30, -2.5F, -38.201F, -4.75F, 3, 1, 5, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 0, 30, -0.6F, -38.101F, -20.5F, 1, 1, 22, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 5, 9, -0.6F, -38.101F, -28.5F, 1, 1, 3, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 15, 0, -0.35F, -38.35F, -25.75F, 1, 1, 6, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 15, 15, -2.65F, -38.351F, -25.75F, 1, 1, 6, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 66, 39, -3.099F, -37.501F, -28.5F, 1, 1, 13, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 0, 14, 0.101F, -37.501F, -28.5F, 1, 1, 13, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 86, 59, -3.2F, -37.501F, 1.001F, 1, 1, 1, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 85, 36, -3.201F, -37.501F, 0.601F, 1, 1, 1, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 51, 85, 0.199F, -37.501F, 0.601F, 1, 1, 1, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 86, 33, 0.199F, -37.501F, 1.001F, 1, 1, 1, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 80, 56, -3.4F, -37.001F, -7.8F, 1, 2, 1, -0.2F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 0, 76, -3.401F, -37.7F, -7.801F, 1, 2, 1, -0.2F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 58, 44, 0.399F, -37.7F, -7.801F, 1, 2, 1, -0.2F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 31, 9, 0.399F, -37.7F, -10.401F, 1, 1, 3, -0.2F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 86, 31, -3.199F, -37.501F, -16.5F, 1, 1, 1, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 84, 45, 0.201F, -37.501F, -16.5F, 1, 1, 1, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 44, 30, -3.199F, -37.001F, 1.0F, 1, 3, 1, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 86, 25, -3.099F, -35.901F, 0.9F, 1, 1, 1, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 44, 86, -1.5F, -35.901F, 0.9F, 1, 1, 1, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 40, 86, 0.101F, -35.901F, 0.9F, 1, 1, 1, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 24, 7, 0.2F, -37.001F, 1.0F, 1, 3, 1, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 80, 53, -3.45F, -35.75F, -0.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 63, 67, 0.45F, -35.75F, -0.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 80, 25, -3.45F, -35.75F, -2.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 29, 60, 0.45F, -35.75F, -2.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 80, 22, -3.45F, -35.75F, -1.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 66, 56, 0.45F, -35.75F, -1.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 80, 16, -3.45F, -35.75F, -3.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 59, 6, 0.45F, -35.75F, -3.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 66, 80, -3.45F, -35.75F, -5.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 59, 0, 0.45F, -35.75F, -5.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 77, 80, -3.45F, -35.75F, -4.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 59, 3, 0.45F, -35.75F, -4.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 73, 80, -3.45F, -35.75F, -6.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 57, 59, 0.45F, -35.75F, -6.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 62, 80, -3.45F, -35.75F, -7.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 58, 52, 0.45F, -35.75F, -7.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 55, 80, -3.45F, -35.75F, -21.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 0, 58, 0.45F, -35.75F, -21.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 85, 74, -3.45F, -34.75F, -22.25F, 1, 1, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 10, 85, 0.45F, -34.75F, -22.25F, 1, 1, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 85, 64, -3.45F, -34.75F, -24.25F, 1, 1, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 84, 53, 0.45F, -34.75F, -24.25F, 1, 1, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 85, 68, -3.45F, -34.75F, -23.25F, 1, 1, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 84, 57, 0.45F, -34.75F, -23.25F, 1, 1, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 51, 80, -3.45F, -35.75F, -25.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 57, 22, 0.45F, -35.75F, -25.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 79, 33, -3.45F, -35.75F, -26.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 29, 57, 0.45F, -35.75F, -26.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 79, 30, -3.45F, -35.75F, -27.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 55, 50, 0.45F, -35.75F, -27.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 85, 72, -3.45F, -35.25F, -22.25F, 1, 1, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 4, 85, 0.45F, -35.25F, -22.25F, 1, 1, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 85, 66, -3.45F, -35.25F, -24.25F, 1, 1, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 84, 49, 0.45F, -35.25F, -24.25F, 1, 1, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 85, 70, -3.45F, -35.25F, -23.25F, 1, 1, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 0, 85, 0.45F, -35.25F, -23.25F, 1, 1, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 53, 65, -3.45F, -34.75F, -20.75F, 1, 1, 14, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 37, 64, 0.45F, -34.75F, -20.75F, 1, 1, 14, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 34, 30, -3.451F, -34.75F, -27.25F, 1, 1, 3, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 34, 34, 0.449F, -34.75F, -27.25F, 1, 1, 3, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 48, 50, -3.199F, -36.001F, -16.0F, 1, 1, 5, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 0, 21, 0.201F, -36.001F, -16.0F, 1, 1, 5, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 77, 73, 0.199F, -36.001F, -11.75F, 1, 1, 1, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 24, 39, -3.2F, -36.201F, -10.5F, 1, 1, 3, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 85, 83, -0.6F, -38.1F, 1.001F, 1, 1, 1, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 44, 39, -2.4F, -38.099F, 1.001F, 2, 1, 1, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 15, 7, -2.4F, -38.1F, -20.5F, 2, 1, 5, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 53, 69, -2.4F, -38.1F, -28.5F, 2, 1, 3, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 45, 23, -3.0F, -37.0F, -10.499F, 1, 1, 1, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 15, 0, -2.9F, -37.0F, -9.5F, 1, 1, 2, 0.0F, false));

		slide59_r1 = new ModelRenderer(this);
		slide59_r1.setRotationPoint(-2.75F, -38.15F, -2.1F);
		G19razorbackslide.addChild(slide59_r1);
		setRotationAngle(slide59_r1, 0.0F, 0.0F, -0.6545F);
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 44, 84, -1.0F, 0.0F, 0.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 83, 27, -0.5F, 0.0F, -2.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 84, 22, -1.0F, 0.0F, -2.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 40, 82, -0.5F, 0.0F, -17.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 14, 83, -0.5F, 0.0F, -21.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 66, 83, -0.5F, 0.0F, -25.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 83, 18, -0.5F, 0.0F, -4.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 81, 50, -1.0F, 0.0F, -17.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 4, 83, -1.0F, 0.0F, -21.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 73, 83, -1.0F, 0.0F, -25.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 84, 42, -1.0F, 0.0F, -4.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 83, 30, -0.5F, 0.0F, 1.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 83, 62, -1.0F, 0.0F, 1.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 40, 84, -1.0F, 0.0F, -1.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 81, 48, -0.5F, 0.0F, -16.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 31, 20, -0.5F, 0.0F, -20.0F, 1, 1, 3, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 55, 83, -0.5F, 0.0F, -24.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 83, 24, -0.5F, 0.0F, -3.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 82, 12, -1.0F, 0.0F, -16.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 31, 13, -1.0F, 0.0F, -20.0F, 1, 1, 3, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 51, 83, -1.0F, 0.0F, -24.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 84, 16, -1.0F, 0.0F, -3.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 82, 32, -0.5F, 0.0F, -23.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 10, 83, -0.5F, 0.0F, -22.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 77, 83, -0.5F, 0.0F, -26.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 83, 14, -0.5F, 0.0F, -5.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 82, 37, -1.0F, 0.0F, -23.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 0, 83, -1.0F, 0.0F, -22.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 62, 83, -1.0F, 0.0F, -26.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 85, 77, -1.0F, 0.0F, -5.0F, 1, 1, 1, -0.25F, false));

		slide70_r1 = new ModelRenderer(this);
		slide70_r1.setRotationPoint(1.55F, -37.53F, -28.1F);
		G19razorbackslide.addChild(slide70_r1);
		setRotationAngle(slide70_r1, 0.0F, 0.0F, 0.6545F);
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 48, 53, -1.5F, 0.0F, 0.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 57, 27, -1.5F, 0.0F, 2.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 62, 5, -1.5F, 0.0F, 4.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 63, 16, -1.5F, 0.0F, 9.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 51, 16, -1.5F, 0.0F, 1.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 55, 33, -1.5F, 0.0F, 3.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 62, 2, -1.5F, 0.0F, 5.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 66, 50, -1.5F, 0.0F, 10.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 68, 39, -1.5F, 0.0F, 21.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 53, 27, -1.0F, 0.0F, 0.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 58, 56, -1.0F, 0.0F, 2.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 62, 11, -1.0F, 0.0F, 4.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 42, 63, -1.0F, 0.0F, 9.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 42, 50, -1.0F, 0.0F, 1.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 55, 16, -1.0F, 0.0F, 3.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 59, 16, -1.0F, 0.0F, 5.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 64, 39, -1.0F, 0.0F, 10.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 75, 44, -1.0F, 0.0F, 21.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 73, 24, -1.5F, 0.0F, 24.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 57, 76, -1.0F, 0.0F, 24.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 69, 77, -1.0F, 0.0F, 26.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 70, 50, -1.5F, 0.0F, 22.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 74, 18, -1.0F, 0.0F, 22.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 44, 73, -1.5F, 0.0F, 23.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 75, 47, -1.0F, 0.0F, 23.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 53, 76, -1.0F, 0.0F, 25.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 12, 67, -1.5F, 0.0F, 27.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 73, 77, -1.0F, 0.0F, 27.0F, 1, 1, 1, -0.25F, false));

		slide57_r1 = new ModelRenderer(this);
		slide57_r1.setRotationPoint(0.4F, -38.1F, -34.75F);
		G19razorbackslide.addChild(slide57_r1);
		setRotationAngle(slide57_r1, 0.0F, 0.0F, 0.6545F);
		slide57_r1.cubeList.add(new ModelBox(slide57_r1, 8, 63, 0.0F, -0.001F, 13.0F, 1, 1, 1, 0.0F, false));
		slide57_r1.cubeList.add(new ModelBox(slide57_r1, 15, 3, 0.0F, -0.001F, 13.5F, 1, 1, 2, 0.0F, false));
		slide57_r1.cubeList.add(new ModelBox(slide57_r1, 7, 21, 0.0F, -0.001F, 18.25F, 1, 1, 2, 0.0F, false));
		slide57_r1.cubeList.add(new ModelBox(slide57_r1, 24, 39, 0.0F, 0.0F, 19.75F, 1, 1, 8, 0.0F, false));
		slide57_r1.cubeList.add(new ModelBox(slide57_r1, 77, 77, 0.0F, -0.001F, 35.0F, 1, 1, 1, 0.0F, false));
		slide57_r1.cubeList.add(new ModelBox(slide57_r1, 85, 81, 0.0F, 0.0F, 35.75F, 1, 1, 1, 0.0F, false));

		slide58_r1 = new ModelRenderer(this);
		slide58_r1.setRotationPoint(0.31F, -38.1F, -28.5F);
		G19razorbackslide.addChild(slide58_r1);
		setRotationAngle(slide58_r1, 0.0F, 0.0F, 0.6545F);
		slide58_r1.cubeList.add(new ModelBox(slide58_r1, 0, 0, 0.0F, -0.001F, 0.0F, 1, 1, 29, 0.0F, false));

		slide57_r2 = new ModelRenderer(this);
		slide57_r2.setRotationPoint(-2.3F, -38.1F, -28.5F);
		G19razorbackslide.addChild(slide57_r2);
		setRotationAngle(slide57_r2, 0.0F, 0.0F, -0.6545F);
		slide57_r2.cubeList.add(new ModelBox(slide57_r2, 0, 0, -1.0F, -0.001F, 0.0F, 1, 1, 13, 0.0F, false));
		slide57_r2.cubeList.add(new ModelBox(slide57_r2, 24, 30, -1.0F, -0.001F, 21.0F, 1, 1, 8, 0.0F, false));

		slide57_r3 = new ModelRenderer(this);
		slide57_r3.setRotationPoint(-2.4F, -38.1F, -8.0F);
		G19razorbackslide.addChild(slide57_r3);
		setRotationAngle(slide57_r3, 0.0F, 0.0F, -0.6545F);
		slide57_r3.cubeList.add(new ModelBox(slide57_r3, 83, 34, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		slide57_r3.cubeList.add(new ModelBox(slide57_r3, 18, 83, -1.0F, -0.001F, -8.5F, 1, 1, 1, 0.0F, false));
		slide57_r3.cubeList.add(new ModelBox(slide57_r3, 31, 24, -1.0F, -0.001F, -2.5F, 1, 1, 3, 0.0F, false));
		slide57_r3.cubeList.add(new ModelBox(slide57_r3, 83, 55, -1.0F, -0.001F, 8.25F, 1, 1, 1, 0.0F, false));
		slide57_r3.cubeList.add(new ModelBox(slide57_r3, 85, 79, -1.0F, 0.0F, 9.0F, 1, 1, 1, 0.0F, false));

		slide16_r1 = new ModelRenderer(this);
		slide16_r1.setRotationPoint(-0.9F, -38.2F, -20.5F);
		G19razorbackslide.addChild(slide16_r1);
		setRotationAngle(slide16_r1, 0.0F, 0.8378F, 0.0F);
		slide16_r1.cubeList.add(new ModelBox(slide16_r1, 34, 50, 0.0F, -0.001F, 0.0F, 1, 1, 1, -0.1F, false));

		slide15_r1 = new ModelRenderer(this);
		slide15_r1.setRotationPoint(-1.1F, -38.2F, -20.5F);
		G19razorbackslide.addChild(slide15_r1);
		setRotationAngle(slide15_r1, 0.0F, -0.8378F, 0.0F);
		slide15_r1.cubeList.add(new ModelBox(slide15_r1, 38, 50, -1.0F, -0.001F, 0.0F, 1, 1, 1, -0.1F, false));

		slide19_r4 = new ModelRenderer(this);
		slide19_r4.setRotationPoint(-3.2F, -36.201F, -10.5F);
		G19razorbackslide.addChild(slide19_r4);
		setRotationAngle(slide19_r4, -1.2915F, 0.0F, 0.0F);
		slide19_r4.cubeList.add(new ModelBox(slide19_r4, 66, 85, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		slide23_r3 = new ModelRenderer(this);
		slide23_r3.setRotationPoint(-0.5F, -36.501F, 0.55F);
		G19razorbackslide.addChild(slide23_r3);
		setRotationAngle(slide23_r3, -0.7854F, 0.0F, 0.0F);
		slide23_r3.cubeList.add(new ModelBox(slide23_r3, 24, 36, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide22_r4 = new ModelRenderer(this);
		slide22_r4.setRotationPoint(-0.5F, -36.301F, 0.55F);
		G19razorbackslide.addChild(slide22_r4);
		setRotationAngle(slide22_r4, -0.7854F, 0.0F, 0.0F);
		slide22_r4.cubeList.add(new ModelBox(slide22_r4, 41, 6, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide21_r6 = new ModelRenderer(this);
		slide21_r6.setRotationPoint(-0.5F, -35.901F, 0.55F);
		G19razorbackslide.addChild(slide21_r6);
		setRotationAngle(slide21_r6, -0.7854F, 0.0F, 0.0F);
		slide21_r6.cubeList.add(new ModelBox(slide21_r6, 41, 15, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide21_r7 = new ModelRenderer(this);
		slide21_r7.setRotationPoint(-0.5F, -36.101F, 0.55F);
		G19razorbackslide.addChild(slide21_r7);
		setRotationAngle(slide21_r7, -0.7854F, 0.0F, 0.0F);
		slide21_r7.cubeList.add(new ModelBox(slide21_r7, 24, 43, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide20_r6 = new ModelRenderer(this);
		slide20_r6.setRotationPoint(-0.5F, -35.701F, 0.55F);
		G19razorbackslide.addChild(slide20_r6);
		setRotationAngle(slide20_r6, -0.7854F, 0.0F, 0.0F);
		slide20_r6.cubeList.add(new ModelBox(slide20_r6, 34, 43, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide19_r5 = new ModelRenderer(this);
		slide19_r5.setRotationPoint(0.201F, -36.501F, -16.5F);
		G19razorbackslide.addChild(slide19_r5);
		setRotationAngle(slide19_r5, 0.3316F, 0.0F, 0.0F);
		slide19_r5.cubeList.add(new ModelBox(slide19_r5, 14, 85, -0.001F, 0.601F, 0.0F, 1, 1, 1, 0.0F, false));
		slide19_r5.cubeList.add(new ModelBox(slide19_r5, 55, 85, -3.401F, 0.601F, 0.0F, 1, 1, 1, 0.0F, false));
		slide19_r5.cubeList.add(new ModelBox(slide19_r5, 18, 85, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		slide19_r5.cubeList.add(new ModelBox(slide19_r5, 62, 85, -3.4F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		slide17_r1 = new ModelRenderer(this);
		slide17_r1.setRotationPoint(1.0F, -38.2F, -2.75F);
		G19razorbackslide.addChild(slide17_r1);
		setRotationAngle(slide17_r1, 0.0F, -1.2043F, 0.0F);
		slide17_r1.cubeList.add(new ModelBox(slide17_r1, 7, 24, -2.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		slide16_r2 = new ModelRenderer(this);
		slide16_r2.setRotationPoint(1.0F, -38.2F, -1.75F);
		G19razorbackslide.addChild(slide16_r2);
		setRotationAngle(slide16_r2, 0.0F, 1.2043F, 0.0F);
		slide16_r2.cubeList.add(new ModelBox(slide16_r2, 0, 30, -2.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

		slide15_r2 = new ModelRenderer(this);
		slide15_r2.setRotationPoint(-3.0F, -38.2F, -1.75F);
		G19razorbackslide.addChild(slide15_r2);
		setRotationAngle(slide15_r2, 0.0F, -1.2043F, 0.0F);
		slide15_r2.cubeList.add(new ModelBox(slide15_r2, 0, 32, 0.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

		slide14_r1 = new ModelRenderer(this);
		slide14_r1.setRotationPoint(-3.0F, -38.2F, -2.75F);
		G19razorbackslide.addChild(slide14_r1);
		setRotationAngle(slide14_r1, 0.0F, 1.2043F, 0.0F);
		slide14_r1.cubeList.add(new ModelBox(slide14_r1, 0, 34, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		slide15_r3 = new ModelRenderer(this);
		slide15_r3.setRotationPoint(0.0F, -38.3F, -2.95F);
		G19razorbackslide.addChild(slide15_r3);
		setRotationAngle(slide15_r3, 0.0F, -0.5411F, 0.0F);
		slide15_r3.cubeList.add(new ModelBox(slide15_r3, 80, 19, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		slide14_r2 = new ModelRenderer(this);
		slide14_r2.setRotationPoint(-2.0F, -38.3F, -2.95F);
		G19razorbackslide.addChild(slide14_r2);
		setRotationAngle(slide14_r2, 0.0F, 0.5411F, 0.0F);
		slide14_r2.cubeList.add(new ModelBox(slide14_r2, 34, 81, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		slide34_r1 = new ModelRenderer(this);
		slide34_r1.setRotationPoint(1.45F, -34.95F, -3.1F);
		G19razorbackslide.addChild(slide34_r1);
		setRotationAngle(slide34_r1, 0.384F, 0.0F, 0.0F);
		slide34_r1.cubeList.add(new ModelBox(slide34_r1, 36, 61, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide34_r1.cubeList.add(new ModelBox(slide34_r1, 77, 68, -4.9F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide34_r1.cubeList.add(new ModelBox(slide34_r1, 65, 30, -1.001F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));
		slide34_r1.cubeList.add(new ModelBox(slide34_r1, 63, 74, -4.901F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));

		slide34_r2 = new ModelRenderer(this);
		slide34_r2.setRotationPoint(1.45F, -34.95F, -7.1F);
		G19razorbackslide.addChild(slide34_r2);
		setRotationAngle(slide34_r2, 0.384F, 0.0F, 0.0F);
		slide34_r2.cubeList.add(new ModelBox(slide34_r2, 46, 64, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide34_r2.cubeList.add(new ModelBox(slide34_r2, 75, 49, -4.9F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));

		slide34_r3 = new ModelRenderer(this);
		slide34_r3.setRotationPoint(1.45F, -35.95F, -11.1F);
		G19razorbackslide.addChild(slide34_r3);
		setRotationAngle(slide34_r3, -0.384F, 0.0F, 0.0F);
		slide34_r3.cubeList.add(new ModelBox(slide34_r3, 0, 14, -1.0F, -2.0F, 0.0F, 1, 3, 1, -0.25F, false));

		slide33_r1 = new ModelRenderer(this);
		slide33_r1.setRotationPoint(1.45F, -34.95F, -6.1F);
		G19razorbackslide.addChild(slide33_r1);
		setRotationAngle(slide33_r1, 0.384F, 0.0F, 0.0F);
		slide33_r1.cubeList.add(new ModelBox(slide33_r1, 12, 64, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide33_r1.cubeList.add(new ModelBox(slide33_r1, 0, 79, -4.9F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide33_r1.cubeList.add(new ModelBox(slide33_r1, 53, 64, -1.001F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));
		slide33_r1.cubeList.add(new ModelBox(slide33_r1, 71, 16, -4.901F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));

		slide32_r1 = new ModelRenderer(this);
		slide32_r1.setRotationPoint(1.45F, -34.95F, -27.1F);
		G19razorbackslide.addChild(slide32_r1);
		setRotationAngle(slide32_r1, 0.384F, 0.0F, 0.0F);
		slide32_r1.cubeList.add(new ModelBox(slide32_r1, 55, 30, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide32_r1.cubeList.add(new ModelBox(slide32_r1, 4, 79, -4.9F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide32_r1.cubeList.add(new ModelBox(slide32_r1, 54, 44, -1.001F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));
		slide32_r1.cubeList.add(new ModelBox(slide32_r1, 44, 69, -4.901F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));

		slide33_r2 = new ModelRenderer(this);
		slide33_r2.setRotationPoint(1.45F, -34.95F, -2.1F);
		G19razorbackslide.addChild(slide33_r2);
		setRotationAngle(slide33_r2, 0.384F, 0.0F, 0.0F);
		slide33_r2.cubeList.add(new ModelBox(slide33_r2, 12, 61, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide33_r2.cubeList.add(new ModelBox(slide33_r2, 22, 76, -4.9F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide33_r2.cubeList.add(new ModelBox(slide33_r2, 65, 33, -1.001F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));
		slide33_r2.cubeList.add(new ModelBox(slide33_r2, 74, 0, -4.901F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));

		slide32_r2 = new ModelRenderer(this);
		slide32_r2.setRotationPoint(1.45F, -34.95F, -5.1F);
		G19razorbackslide.addChild(slide32_r2);
		setRotationAngle(slide32_r2, 0.384F, 0.0F, 0.0F);
		slide32_r2.cubeList.add(new ModelBox(slide32_r2, 29, 63, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide32_r2.cubeList.add(new ModelBox(slide32_r2, 78, 12, -4.9F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide32_r2.cubeList.add(new ModelBox(slide32_r2, 59, 64, -1.001F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));
		slide32_r2.cubeList.add(new ModelBox(slide32_r2, 72, 39, -4.901F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));

		slide31_r1 = new ModelRenderer(this);
		slide31_r1.setRotationPoint(1.45F, -34.95F, -26.1F);
		G19razorbackslide.addChild(slide31_r1);
		setRotationAngle(slide31_r1, 0.384F, 0.0F, 0.0F);
		slide31_r1.cubeList.add(new ModelBox(slide31_r1, 42, 53, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide31_r1.cubeList.add(new ModelBox(slide31_r1, 18, 79, -4.9F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide31_r1.cubeList.add(new ModelBox(slide31_r1, 54, 20, -1.001F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));
		slide31_r1.cubeList.add(new ModelBox(slide31_r1, 60, 69, -4.901F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));

		slide42_r1 = new ModelRenderer(this);
		slide42_r1.setRotationPoint(1.45F, -34.95F, -25.1F);
		G19razorbackslide.addChild(slide42_r1);
		setRotationAngle(slide42_r1, 0.384F, 0.0F, 0.0F);
		slide42_r1.cubeList.add(new ModelBox(slide42_r1, 30, 53, -1.001F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));
		slide42_r1.cubeList.add(new ModelBox(slide42_r1, 47, 71, -4.901F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));
		slide42_r1.cubeList.add(new ModelBox(slide42_r1, 36, 53, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide42_r1.cubeList.add(new ModelBox(slide42_r1, 22, 79, -4.9F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));

		slide41_r1 = new ModelRenderer(this);
		slide41_r1.setRotationPoint(1.45F, -34.95F, -21.1F);
		G19razorbackslide.addChild(slide41_r1);
		setRotationAngle(slide41_r1, 0.384F, 0.0F, 0.0F);
		slide41_r1.cubeList.add(new ModelBox(slide41_r1, 12, 58, -1.001F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));
		slide41_r1.cubeList.add(new ModelBox(slide41_r1, 63, 71, -4.901F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));

		slide38_r1 = new ModelRenderer(this);
		slide38_r1.setRotationPoint(1.45F, -34.95F, -4.1F);
		G19razorbackslide.addChild(slide38_r1);
		setRotationAngle(slide38_r1, 0.384F, 0.0F, 0.0F);
		slide38_r1.cubeList.add(new ModelBox(slide38_r1, 63, 64, -1.001F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));
		slide38_r1.cubeList.add(new ModelBox(slide38_r1, 72, 45, -4.901F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));
		slide38_r1.cubeList.add(new ModelBox(slide38_r1, 62, 8, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide38_r1.cubeList.add(new ModelBox(slide38_r1, 34, 78, -4.9F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));

		slide35_r1 = new ModelRenderer(this);
		slide35_r1.setRotationPoint(1.45F, -34.95F, -1.1F);
		G19razorbackslide.addChild(slide35_r1);
		setRotationAngle(slide35_r1, 0.384F, 0.0F, 0.0F);
		slide35_r1.cubeList.add(new ModelBox(slide35_r1, 66, 45, -1.001F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));
		slide35_r1.cubeList.add(new ModelBox(slide35_r1, 74, 5, -4.901F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));
		slide35_r1.cubeList.add(new ModelBox(slide35_r1, 66, 53, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide35_r1.cubeList.add(new ModelBox(slide35_r1, 18, 76, -4.9F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));

		slide35_r2 = new ModelRenderer(this);
		slide35_r2.setRotationPoint(1.45F, -34.95F, 0.9F);
		G19razorbackslide.addChild(slide35_r2);
		setRotationAngle(slide35_r2, 0.384F, 0.0F, 0.0F);
		slide35_r2.cubeList.add(new ModelBox(slide35_r2, 15, 7, -1.001F, -2.75F, 0.0F, 1, 3, 1, -0.25F, false));
		slide35_r2.cubeList.add(new ModelBox(slide35_r2, 0, 21, -4.901F, -2.75F, 0.0F, 1, 3, 1, -0.25F, false));

		slide34_r4 = new ModelRenderer(this);
		slide34_r4.setRotationPoint(1.45F, -34.95F, -0.1F);
		G19razorbackslide.addChild(slide34_r4);
		setRotationAngle(slide34_r4, 0.384F, 0.0F, 0.0F);
		slide34_r4.cubeList.add(new ModelBox(slide34_r4, 68, 5, -1.001F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));
		slide34_r4.cubeList.add(new ModelBox(slide34_r4, 75, 41, -4.901F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));
		slide34_r4.cubeList.add(new ModelBox(slide34_r4, 68, 0, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide34_r4.cubeList.add(new ModelBox(slide34_r4, 4, 76, -4.9F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));

		slide29_r1 = new ModelRenderer(this);
		slide29_r1.setRotationPoint(1.45F, -34.95F, -21.1F);
		G19razorbackslide.addChild(slide29_r1);
		setRotationAngle(slide29_r1, 0.384F, 0.0F, 0.0F);
		slide29_r1.cubeList.add(new ModelBox(slide29_r1, 8, 58, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide29_r1.cubeList.add(new ModelBox(slide29_r1, 38, 79, -4.9F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));

		slide29_r2 = new ModelRenderer(this);
		slide29_r2.setRotationPoint(1.099F, -34.75F, -16.1F);
		G19razorbackslide.addChild(slide29_r2);
		setRotationAngle(slide29_r2, 0.384F, 0.0F, 0.0F);
		slide29_r2.cubeList.add(new ModelBox(slide29_r2, 0, 53, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));
		slide29_r2.cubeList.add(new ModelBox(slide29_r2, 12, 53, -4.2F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		slide30_r1 = new ModelRenderer(this);
		slide30_r1.setRotationPoint(-2.101F, -34.35F, -24.7F);
		G19razorbackslide.addChild(slide30_r1);
		setRotationAngle(slide30_r1, 0.384F, 0.0F, 0.0F);
		slide30_r1.cubeList.add(new ModelBox(slide30_r1, 8, 6, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));
		slide30_r1.cubeList.add(new ModelBox(slide30_r1, 45, 20, 2.2F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		slide28_r1 = new ModelRenderer(this);
		slide28_r1.setRotationPoint(1.099F, -34.75F, -21.2F);
		G19razorbackslide.addChild(slide28_r1);
		setRotationAngle(slide28_r1, 0.384F, 0.0F, 0.0F);
		slide28_r1.cubeList.add(new ModelBox(slide28_r1, 48, 50, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));
		slide28_r1.cubeList.add(new ModelBox(slide28_r1, 42, 79, -4.2F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		G19rockslide = new ModelRenderer(this);
		G19rockslide.setRotationPoint(0.0F, 24.0F, 0.0F);
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 26, 9, -2.5F, -37.5F, 0.9F, 3, 2, 1, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 18, 13, -2.3F, -37.5F, -28.499F, 2, 5, 1, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 19, 0, -0.7F, -37.5F, -28.501F, 1, 5, 1, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 26, 15, 0.1F, -37.0F, -4.5F, 1, 3, 6, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 22, 26, -3.1F, -37.0F, -4.5F, 1, 3, 6, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 44, 45, 0.101F, -37.5F, -4.5F, 1, 1, 6, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 40, 16, -3.099F, -37.5F, -4.5F, 1, 1, 6, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 42, 16, -2.4F, -38.1F, -10.5F, 2, 1, 12, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 0, 26, -0.6F, -38.101F, -18.5F, 1, 1, 20, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 34, 41, -0.6F, -38.101F, -28.5F, 1, 1, 2, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 6, 41, -0.6F, -38.1F, -27.0F, 1, 1, 2, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 4, 31, -0.6F, -38.101F, -21.0F, 1, 1, 1, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 20, 9, -2.45F, -38.1F, -21.0F, 1, 1, 1, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 20, 20, -2.45F, -38.1F, -23.5F, 1, 1, 1, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 16, 26, -0.6F, -38.101F, -23.5F, 1, 1, 1, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 0, 26, -1.5F, -38.099F, -26.5F, 1, 1, 8, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 22, 35, 0.2F, -37.501F, -10.5F, 1, 2, 6, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 4, 44, -3.2F, -37.501F, 1.001F, 1, 1, 1, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 0, 44, 0.199F, -37.501F, 1.001F, 1, 1, 1, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 0, 13, -3.2F, -37.501F, -7.5F, 1, 2, 3, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 0, 0, 0.201F, -36.001F, -28.5F, 1, 2, 24, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 26, 0, -3.199F, -36.001F, -28.5F, 1, 2, 13, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 41, 2, -3.2F, -36.25F, -28.5F, 1, 1, 13, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 22, 26, 0.2F, -36.25F, -28.5F, 1, 1, 18, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 42, 33, -3.199F, -37.001F, 1.0F, 1, 3, 1, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 15, 43, -3.099F, -35.901F, 0.9F, 1, 1, 1, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 11, 43, -1.5F, -35.901F, 0.9F, 1, 1, 1, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 42, 39, 0.101F, -35.901F, 0.9F, 1, 1, 1, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 36, 31, 0.2F, -37.001F, 1.0F, 1, 3, 1, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 0, 0, -3.199F, -36.001F, -15.5F, 1, 2, 11, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 13, 6, -3.2F, -36.201F, -10.5F, 1, 1, 3, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 42, 37, -0.6F, -38.1F, 1.001F, 1, 1, 1, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 42, 31, -2.4F, -38.099F, 1.001F, 2, 1, 1, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 26, 6, -2.4F, -38.1F, -28.5F, 2, 1, 2, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 0, 18, -2.4F, -38.101F, -27.0F, 2, 1, 2, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 0, 4, -2.4F, -38.1F, -18.5F, 2, 1, 3, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 4, 41, -3.0F, -37.0F, -10.499F, 1, 1, 1, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 41, 0, -2.9F, -37.0F, -9.5F, 1, 1, 2, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 0, 8, -3.0F, -38.2F, -2.75F, 4, 1, 1, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 0, 35, -2.5F, -38.201F, -4.75F, 3, 1, 5, 0.0F, false));

		slide16_r3 = new ModelRenderer(this);
		slide16_r3.setRotationPoint(-2.0F, -38.3F, -2.95F);
		G19rockslide.addChild(slide16_r3);
		setRotationAngle(slide16_r3, 0.0F, 0.5411F, 0.0F);
		slide16_r3.cubeList.add(new ModelBox(slide16_r3, 7, 0, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		slide17_r2 = new ModelRenderer(this);
		slide17_r2.setRotationPoint(-3.0F, -38.2F, -1.75F);
		G19rockslide.addChild(slide17_r2);
		setRotationAngle(slide17_r2, 0.0F, -1.2043F, 0.0F);
		slide17_r2.cubeList.add(new ModelBox(slide17_r2, 41, 3, 0.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

		slide16_r4 = new ModelRenderer(this);
		slide16_r4.setRotationPoint(-3.0F, -38.2F, -2.75F);
		G19rockslide.addChild(slide16_r4);
		setRotationAngle(slide16_r4, 0.0F, 1.2043F, 0.0F);
		slide16_r4.cubeList.add(new ModelBox(slide16_r4, 41, 5, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		slide17_r3 = new ModelRenderer(this);
		slide17_r3.setRotationPoint(0.0F, -38.3F, -2.95F);
		G19rockslide.addChild(slide17_r3);
		setRotationAngle(slide17_r3, 0.0F, -0.5411F, 0.0F);
		slide17_r3.cubeList.add(new ModelBox(slide17_r3, 7, 4, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		slide18_r2 = new ModelRenderer(this);
		slide18_r2.setRotationPoint(1.0F, -38.2F, -1.75F);
		G19rockslide.addChild(slide18_r2);
		setRotationAngle(slide18_r2, 0.0F, 1.2043F, 0.0F);
		slide18_r2.cubeList.add(new ModelBox(slide18_r2, 41, 7, -2.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

		slide19_r6 = new ModelRenderer(this);
		slide19_r6.setRotationPoint(1.0F, -38.2F, -2.75F);
		G19rockslide.addChild(slide19_r6);
		setRotationAngle(slide19_r6, 0.0F, -1.2043F, 0.0F);
		slide19_r6.cubeList.add(new ModelBox(slide19_r6, 41, 9, -2.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		slide57_r4 = new ModelRenderer(this);
		slide57_r4.setRotationPoint(-2.4F, -38.1F, -28.5F);
		G19rockslide.addChild(slide57_r4);
		setRotationAngle(slide57_r4, 0.0F, 0.0F, -0.6545F);
		slide57_r4.cubeList.add(new ModelBox(slide57_r4, 42, 29, -1.0F, 0.0F, 18.0F, 1, 1, 12, 0.0F, false));
		slide57_r4.cubeList.add(new ModelBox(slide57_r4, 10, 41, -1.0F, 0.0F, 29.5F, 1, 1, 1, 0.0F, false));

		slide55_r2 = new ModelRenderer(this);
		slide55_r2.setRotationPoint(0.4F, -38.1F, -28.5F);
		G19rockslide.addChild(slide55_r2);
		setRotationAngle(slide55_r2, 0.0F, 0.0F, 0.6545F);
		slide55_r2.cubeList.add(new ModelBox(slide55_r2, 30, 45, 0.0F, 0.0F, 18.0F, 1, 1, 12, 0.0F, false));
		slide55_r2.cubeList.add(new ModelBox(slide55_r2, 42, 16, 0.0F, 0.0F, 29.5F, 1, 1, 1, 0.0F, false));

		slide25_r1 = new ModelRenderer(this);
		slide25_r1.setRotationPoint(-2.7F, -37.5F, -4.75F);
		G19rockslide.addChild(slide25_r1);
		setRotationAngle(slide25_r1, 0.192F, 0.0F, 0.0F);
		slide25_r1.cubeList.add(new ModelBox(slide25_r1, 22, 35, -0.748F, -0.25F, -0.75F, 1, 4, 1, -0.25F, false));
		slide25_r1.cubeList.add(new ModelBox(slide25_r1, 34, 35, 3.149F, -0.25F, -0.75F, 1, 4, 1, -0.25F, false));

		slide24_r1 = new ModelRenderer(this);
		slide24_r1.setRotationPoint(-2.7F, -37.5F, -4.5F);
		G19rockslide.addChild(slide24_r1);
		setRotationAngle(slide24_r1, 0.192F, 0.0F, 0.0F);
		slide24_r1.cubeList.add(new ModelBox(slide24_r1, 30, 35, -0.751F, -0.25F, -0.75F, 1, 4, 1, -0.25F, false));
		slide24_r1.cubeList.add(new ModelBox(slide24_r1, 38, 15, 3.151F, -0.25F, -0.75F, 1, 4, 1, -0.25F, false));

		slide27_r1 = new ModelRenderer(this);
		slide27_r1.setRotationPoint(-2.7F, -37.5F, -2.5F);
		G19rockslide.addChild(slide27_r1);
		setRotationAngle(slide27_r1, 0.192F, 0.0F, 0.0F);
		slide27_r1.cubeList.add(new ModelBox(slide27_r1, 26, 15, -0.749F, -0.25F, -0.75F, 1, 4, 1, -0.25F, false));
		slide27_r1.cubeList.add(new ModelBox(slide27_r1, 0, 35, 3.151F, -0.25F, -0.75F, 1, 4, 1, -0.25F, false));

		slide29_r3 = new ModelRenderer(this);
		slide29_r3.setRotationPoint(-2.7F, -37.5F, 1.0F);
		G19rockslide.addChild(slide29_r3);
		setRotationAngle(slide29_r3, 0.192F, 0.0F, 0.0F);
		slide29_r3.cubeList.add(new ModelBox(slide29_r3, 34, 0, -0.75F, -0.25F, -0.75F, 1, 4, 1, -0.25F, false));
		slide29_r3.cubeList.add(new ModelBox(slide29_r3, 34, 5, 3.151F, -0.25F, -0.75F, 1, 4, 1, -0.25F, false));

		slide28_r2 = new ModelRenderer(this);
		slide28_r2.setRotationPoint(-2.7F, -37.5F, 0.5F);
		G19rockslide.addChild(slide28_r2);
		setRotationAngle(slide28_r2, 0.192F, 0.0F, 0.0F);
		slide28_r2.cubeList.add(new ModelBox(slide28_r2, 30, 26, -0.749F, -0.25F, -0.75F, 1, 4, 1, -0.25F, false));
		slide28_r2.cubeList.add(new ModelBox(slide28_r2, 34, 15, 3.151F, -0.25F, -0.75F, 1, 4, 1, -0.25F, false));

		slide27_r2 = new ModelRenderer(this);
		slide27_r2.setRotationPoint(-2.7F, -37.5F, -0.5F);
		G19rockslide.addChild(slide27_r2);
		setRotationAngle(slide27_r2, 0.192F, 0.0F, 0.0F);
		slide27_r2.cubeList.add(new ModelBox(slide27_r2, 14, 29, -0.749F, -0.25F, -0.75F, 1, 4, 1, -0.25F, false));
		slide27_r2.cubeList.add(new ModelBox(slide27_r2, 34, 26, 3.151F, -0.25F, -0.75F, 1, 4, 1, -0.25F, false));

		slide26_r1 = new ModelRenderer(this);
		slide26_r1.setRotationPoint(-2.7F, -37.5F, -1.5F);
		G19rockslide.addChild(slide26_r1);
		setRotationAngle(slide26_r1, 0.192F, 0.0F, 0.0F);
		slide26_r1.cubeList.add(new ModelBox(slide26_r1, 10, 29, -0.749F, -0.25F, -0.75F, 1, 4, 1, -0.25F, false));
		slide26_r1.cubeList.add(new ModelBox(slide26_r1, 11, 35, 3.151F, -0.25F, -0.75F, 1, 4, 1, -0.25F, false));

		slide25_r2 = new ModelRenderer(this);
		slide25_r2.setRotationPoint(-2.7F, -37.5F, -3.5F);
		G19rockslide.addChild(slide25_r2);
		setRotationAngle(slide25_r2, 0.192F, 0.0F, 0.0F);
		slide25_r2.cubeList.add(new ModelBox(slide25_r2, 22, 26, -0.749F, -0.25F, -0.75F, 1, 4, 1, -0.25F, false));
		slide25_r2.cubeList.add(new ModelBox(slide25_r2, 15, 35, 3.151F, -0.25F, -0.75F, 1, 4, 1, -0.25F, false));

		slide24_r2 = new ModelRenderer(this);
		slide24_r2.setRotationPoint(-0.5F, -36.501F, 0.55F);
		G19rockslide.addChild(slide24_r2);
		setRotationAngle(slide24_r2, -0.7854F, 0.0F, 0.0F);
		slide24_r2.cubeList.add(new ModelBox(slide24_r2, 12, 19, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide23_r4 = new ModelRenderer(this);
		slide23_r4.setRotationPoint(-0.5F, -36.301F, 0.55F);
		G19rockslide.addChild(slide23_r4);
		setRotationAngle(slide23_r4, -0.7854F, 0.0F, 0.0F);
		slide23_r4.cubeList.add(new ModelBox(slide23_r4, 0, 22, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide22_r5 = new ModelRenderer(this);
		slide22_r5.setRotationPoint(-0.5F, -35.901F, 0.55F);
		G19rockslide.addChild(slide22_r5);
		setRotationAngle(slide22_r5, -0.7854F, 0.0F, 0.0F);
		slide22_r5.cubeList.add(new ModelBox(slide22_r5, 8, 22, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide22_r6 = new ModelRenderer(this);
		slide22_r6.setRotationPoint(-0.5F, -36.101F, 0.55F);
		G19rockslide.addChild(slide22_r6);
		setRotationAngle(slide22_r6, -0.7854F, 0.0F, 0.0F);
		slide22_r6.cubeList.add(new ModelBox(slide22_r6, 16, 22, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide21_r8 = new ModelRenderer(this);
		slide21_r8.setRotationPoint(-0.5F, -35.701F, 0.55F);
		G19rockslide.addChild(slide21_r8);
		setRotationAngle(slide21_r8, -0.7854F, 0.0F, 0.0F);
		slide21_r8.cubeList.add(new ModelBox(slide21_r8, 0, 29, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide25_r3 = new ModelRenderer(this);
		slide25_r3.setRotationPoint(1.201F, -36.25F, -38.5F);
		G19rockslide.addChild(slide25_r3);
		setRotationAngle(slide25_r3, 0.0F, 0.0F, 1.1694F);
		slide25_r3.cubeList.add(new ModelBox(slide25_r3, 0, 26, -2.001F, -0.001F, 10.001F, 2, 1, 2, 0.0F, false));
		slide25_r3.cubeList.add(new ModelBox(slide25_r3, 26, 0, -2.001F, 0.0F, 11.5F, 2, 1, 2, 0.0F, false));
		slide25_r3.cubeList.add(new ModelBox(slide25_r3, 41, 11, -2.001F, 0.0F, 15.0F, 2, 1, 1, 0.0F, false));
		slide25_r3.cubeList.add(new ModelBox(slide25_r3, 42, 29, -2.001F, 0.0F, 17.5F, 2, 1, 1, 0.0F, false));
		slide25_r3.cubeList.add(new ModelBox(slide25_r3, 0, 13, -2.001F, 0.0F, 20.0F, 2, 1, 8, 0.0F, false));

		slide24_r3 = new ModelRenderer(this);
		slide24_r3.setRotationPoint(-3.199F, -36.25F, -38.5F);
		G19rockslide.addChild(slide24_r3);
		setRotationAngle(slide24_r3, 0.0F, 0.0F, -1.1694F);
		slide24_r3.cubeList.add(new ModelBox(slide24_r3, 10, 26, -0.001F, -0.001F, 10.001F, 2, 1, 2, 0.0F, false));
		slide24_r3.cubeList.add(new ModelBox(slide24_r3, 26, 3, -0.001F, 0.0F, 11.5F, 2, 1, 2, 0.0F, false));
		slide24_r3.cubeList.add(new ModelBox(slide24_r3, 42, 42, -0.001F, 0.0F, 15.0F, 2, 1, 1, 0.0F, false));
		slide24_r3.cubeList.add(new ModelBox(slide24_r3, 42, 26, -0.001F, 0.0F, 17.5F, 2, 1, 1, 0.0F, false));
		slide24_r3.cubeList.add(new ModelBox(slide24_r3, 0, 0, -0.001F, 0.0F, 20.0F, 2, 1, 3, 0.0F, false));

		slide17_r4 = new ModelRenderer(this);
		slide17_r4.setRotationPoint(1.2F, -37.501F, -10.5F);
		G19rockslide.addChild(slide17_r4);
		setRotationAngle(slide17_r4, -1.309F, -0.2094F, 0.6632F);
		slide17_r4.cubeList.add(new ModelBox(slide17_r4, 12, 13, -1.001F, 0.0F, 0.0F, 1, 4, 2, 0.0F, false));

		slide16_r5 = new ModelRenderer(this);
		slide16_r5.setRotationPoint(1.2F, -37.501F, -10.5F);
		G19rockslide.addChild(slide16_r5);
		setRotationAngle(slide16_r5, -1.2392F, 0.0F, 0.0F);
		slide16_r5.cubeList.add(new ModelBox(slide16_r5, 13, 0, -1.001F, 0.0F, 0.0F, 1, 4, 2, 0.0F, false));

		slide19_r7 = new ModelRenderer(this);
		slide19_r7.setRotationPoint(0.4F, -38.1F, -23.5F);
		G19rockslide.addChild(slide19_r7);
		setRotationAngle(slide19_r7, 0.0F, 0.9076F, 0.0F);
		slide19_r7.cubeList.add(new ModelBox(slide19_r7, 14, 40, -1.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));

		slide18_r3 = new ModelRenderer(this);
		slide18_r3.setRotationPoint(0.4F, -38.1F, -21.0F);
		G19rockslide.addChild(slide18_r3);
		setRotationAngle(slide18_r3, 0.0F, 0.9076F, 0.0F);
		slide18_r3.cubeList.add(new ModelBox(slide18_r3, 40, 18, -1.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));

		slide20_r7 = new ModelRenderer(this);
		slide20_r7.setRotationPoint(-2.4F, -38.1F, -23.5F);
		G19rockslide.addChild(slide20_r7);
		setRotationAngle(slide20_r7, 0.0F, -0.9076F, 0.0F);
		slide20_r7.cubeList.add(new ModelBox(slide20_r7, 18, 6, 0.0F, -0.001F, -2.0F, 1, 1, 2, 0.0F, false));

		slide19_r8 = new ModelRenderer(this);
		slide19_r8.setRotationPoint(-2.4F, -38.1F, -21.0F);
		G19rockslide.addChild(slide19_r8);
		setRotationAngle(slide19_r8, 0.0F, -0.9076F, 0.0F);
		slide19_r8.cubeList.add(new ModelBox(slide19_r8, 0, 31, 0.0F, -0.001F, -2.0F, 1, 1, 2, 0.0F, false));

		slide18_r4 = new ModelRenderer(this);
		slide18_r4.setRotationPoint(-2.4F, -38.1F, -18.5F);
		G19rockslide.addChild(slide18_r4);
		setRotationAngle(slide18_r4, 0.0F, -0.9076F, 0.0F);
		slide18_r4.cubeList.add(new ModelBox(slide18_r4, 32, 10, 0.0F, -0.001F, -2.0F, 1, 1, 2, 0.0F, false));

		slide17_r5 = new ModelRenderer(this);
		slide17_r5.setRotationPoint(0.4F, -38.1F, -18.5F);
		G19rockslide.addChild(slide17_r5);
		setRotationAngle(slide17_r5, 0.0F, 0.9076F, 0.0F);
		slide17_r5.cubeList.add(new ModelBox(slide17_r5, 0, 41, -1.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));

		G19ghostprecisionslide = new ModelRenderer(this);
		G19ghostprecisionslide.setRotationPoint(0.0F, 24.0F, 0.0F);
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 8, 27, -2.5F, -37.5F, 0.9F, 3, 2, 1, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 15, 0, -2.3F, -37.5F, -28.499F, 2, 5, 1, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 16, 16, -0.7F, -37.5F, -28.501F, 1, 5, 1, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 16, 16, 0.1F, -37.0F, -4.5F, 1, 3, 6, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 15, 0, -3.1F, -37.0F, -4.5F, 1, 3, 6, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 32, 0, 0.101F, -37.5F, -4.5F, 1, 1, 6, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 23, 31, -3.099F, -37.5F, -4.5F, 1, 1, 6, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 0, 14, -2.4F, -38.1F, -10.5F, 2, 1, 12, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 0, 31, -0.6F, -38.101F, -19.5F, 1, 1, 21, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 6, 6, -0.6F, -38.101F, -28.5F, 1, 1, 2, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 26, 4, -0.6F, -38.1F, -27.0F, 1, 1, 1, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 32, 0, 0.2F, -37.501F, -19.5F, 1, 1, 15, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 39, 12, 0.2F, -37.501F, -28.5F, 1, 1, 1, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 34, 35, -3.2F, -37.501F, -28.5F, 1, 1, 1, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 40, 44, -3.2F, -37.501F, 1.001F, 1, 1, 1, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 34, 44, 0.199F, -37.501F, 1.001F, 1, 1, 1, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 0, 19, -3.2F, -37.501F, -7.5F, 1, 2, 3, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 0, 14, -3.2F, -37.501F, -19.5F, 1, 1, 4, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 23, 31, 0.201F, -37.001F, -19.5F, 1, 3, 15, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 0, 5, 0.201F, -37.001F, -28.5F, 1, 3, 1, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 0, 0, -3.199F, -37.001F, -28.5F, 1, 3, 1, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 0, 40, -3.099F, -35.001F, -27.5F, 1, 1, 8, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 0, 31, 0.101F, -35.001F, -27.5F, 1, 1, 8, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 0, 5, -3.199F, -37.001F, -19.5F, 1, 3, 4, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 0, 14, -3.199F, -37.001F, 1.0F, 1, 3, 1, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 43, 11, -3.099F, -35.901F, 0.9F, 1, 1, 1, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 43, 4, -1.5F, -35.901F, 0.9F, 1, 1, 1, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 31, 43, 0.101F, -35.901F, 0.9F, 1, 1, 1, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 8, 0, 0.2F, -37.001F, 1.0F, 1, 3, 1, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 40, 31, -3.199F, -36.001F, -15.5F, 1, 2, 11, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 22, 9, -3.2F, -36.201F, -10.5F, 1, 1, 3, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 27, 43, -0.6F, -38.1F, 1.001F, 1, 1, 1, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 37, 26, -2.4F, -38.099F, 1.001F, 2, 1, 1, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 0, 0, -2.4F, -38.1F, -19.5F, 2, 1, 4, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 0, 27, -2.4F, -38.1F, -28.5F, 2, 1, 2, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 13, 37, -2.4F, -38.101F, -27.0F, 2, 1, 1, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 34, 42, -3.0F, -37.0F, -10.499F, 1, 1, 1, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 6, 14, -2.9F, -37.0F, -9.5F, 1, 1, 2, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 48, 48, -0.35F, -38.351F, -26.25F, 1, 1, 7, -0.25F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 32, 7, -2.6F, -38.35F, -25.75F, 3, 1, 1, -0.25F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 16, 27, -2.6F, -38.35F, -23.75F, 3, 1, 1, -0.25F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 16, 14, -2.6F, -38.35F, -21.75F, 3, 1, 1, -0.25F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 10, 31, -2.6F, -38.35F, -24.75F, 3, 1, 1, -0.25F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 0, 31, -2.6F, -38.35F, -22.75F, 3, 1, 1, -0.25F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 0, 24, -2.6F, -38.35F, -20.75F, 3, 1, 1, -0.25F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 46, 16, -2.65F, -38.351F, -26.25F, 1, 1, 7, -0.25F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 15, 9, -3.0F, -38.2F, -2.75F, 4, 1, 1, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 39, 49, -2.5F, -38.201F, -4.75F, 3, 1, 5, 0.0F, false));

		slide18_r5 = new ModelRenderer(this);
		slide18_r5.setRotationPoint(1.0F, -38.2F, -2.75F);
		G19ghostprecisionslide.addChild(slide18_r5);
		setRotationAngle(slide18_r5, 0.0F, -1.2043F, 0.0F);
		slide18_r5.cubeList.add(new ModelBox(slide18_r5, 15, 11, -2.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		slide17_r6 = new ModelRenderer(this);
		slide17_r6.setRotationPoint(1.0F, -38.2F, -1.75F);
		G19ghostprecisionslide.addChild(slide17_r6);
		setRotationAngle(slide17_r6, 0.0F, 1.2043F, 0.0F);
		slide17_r6.cubeList.add(new ModelBox(slide17_r6, 24, 19, -2.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

		slide16_r6 = new ModelRenderer(this);
		slide16_r6.setRotationPoint(0.0F, -38.3F, -2.95F);
		G19ghostprecisionslide.addChild(slide16_r6);
		setRotationAngle(slide16_r6, 0.0F, -0.5411F, 0.0F);
		slide16_r6.cubeList.add(new ModelBox(slide16_r6, 9, 11, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		slide15_r4 = new ModelRenderer(this);
		slide15_r4.setRotationPoint(-2.0F, -38.3F, -2.95F);
		G19ghostprecisionslide.addChild(slide15_r4);
		setRotationAngle(slide15_r4, 0.0F, 0.5411F, 0.0F);
		slide15_r4.cubeList.add(new ModelBox(slide15_r4, 8, 24, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		slide15_r5 = new ModelRenderer(this);
		slide15_r5.setRotationPoint(-3.0F, -38.2F, -2.75F);
		G19ghostprecisionslide.addChild(slide15_r5);
		setRotationAngle(slide15_r5, 0.0F, 1.2043F, 0.0F);
		slide15_r5.cubeList.add(new ModelBox(slide15_r5, 24, 27, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		slide16_r7 = new ModelRenderer(this);
		slide16_r7.setRotationPoint(-3.0F, -38.2F, -1.75F);
		G19ghostprecisionslide.addChild(slide16_r7);
		setRotationAngle(slide16_r7, 0.0F, -1.2043F, 0.0F);
		slide16_r7.cubeList.add(new ModelBox(slide16_r7, 32, 25, 0.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

		slide59_r2 = new ModelRenderer(this);
		slide59_r2.setRotationPoint(-2.4F, -38.1F, -46.5F);
		G19ghostprecisionslide.addChild(slide59_r2);
		setRotationAngle(slide59_r2, 0.0F, 0.0F, -0.6545F);
		slide59_r2.cubeList.add(new ModelBox(slide59_r2, 0, 0, -1.0F, 0.0F, 18.0F, 1, 1, 13, 0.0F, false));
		slide59_r2.cubeList.add(new ModelBox(slide59_r2, 32, 16, -1.0F, 0.0F, 36.0F, 1, 1, 12, 0.0F, false));
		slide59_r2.cubeList.add(new ModelBox(slide59_r2, 42, 13, -1.0F, 0.0F, 47.5F, 1, 1, 1, 0.0F, false));

		slide56_r3 = new ModelRenderer(this);
		slide56_r3.setRotationPoint(0.4F, -38.1F, -28.5F);
		G19ghostprecisionslide.addChild(slide56_r3);
		setRotationAngle(slide56_r3, 0.0F, 0.0F, 0.6545F);
		slide56_r3.cubeList.add(new ModelBox(slide56_r3, 0, 0, 0.0F, 0.0F, 0.0F, 1, 1, 30, 0.0F, false));
		slide56_r3.cubeList.add(new ModelBox(slide56_r3, 23, 43, 0.0F, 0.0F, 29.5F, 1, 1, 1, 0.0F, false));

		slide26_r2 = new ModelRenderer(this);
		slide26_r2.setRotationPoint(-2.7F, -37.4F, -4.1F);
		G19ghostprecisionslide.addChild(slide26_r2);
		setRotationAngle(slide26_r2, -0.192F, 0.0F, 0.0F);
		slide26_r2.cubeList.add(new ModelBox(slide26_r2, 40, 21, -0.751F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));
		slide26_r2.cubeList.add(new ModelBox(slide26_r2, 12, 53, 3.149F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));

		slide28_r3 = new ModelRenderer(this);
		slide28_r3.setRotationPoint(-2.7F, -37.4F, -27.05F);
		G19ghostprecisionslide.addChild(slide28_r3);
		setRotationAngle(slide28_r3, -0.192F, 0.0F, 0.0F);
		slide28_r3.cubeList.add(new ModelBox(slide28_r3, 4, 33, -0.7489F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));
		slide28_r3.cubeList.add(new ModelBox(slide28_r3, 8, 19, 3.1511F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));

		slide27_r3 = new ModelRenderer(this);
		slide27_r3.setRotationPoint(-2.7F, -37.4F, -26.55F);
		G19ghostprecisionslide.addChild(slide27_r3);
		setRotationAngle(slide27_r3, -0.192F, 0.0F, 0.0F);
		slide27_r3.cubeList.add(new ModelBox(slide27_r3, 10, 33, -0.751F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));
		slide27_r3.cubeList.add(new ModelBox(slide27_r3, 23, 38, 3.149F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));

		slide28_r4 = new ModelRenderer(this);
		slide28_r4.setRotationPoint(-2.7F, -37.4F, -1.85F);
		G19ghostprecisionslide.addChild(slide28_r4);
		setRotationAngle(slide28_r4, -0.192F, 0.0F, 0.0F);
		slide28_r4.cubeList.add(new ModelBox(slide28_r4, 14, 43, -0.75F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));
		slide28_r4.cubeList.add(new ModelBox(slide28_r4, 0, 53, 3.15F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));

		slide29_r4 = new ModelRenderer(this);
		slide29_r4.setRotationPoint(-2.7F, -37.4F, 1.65F);
		G19ghostprecisionslide.addChild(slide29_r4);
		setRotationAngle(slide29_r4, -0.192F, 0.0F, 0.0F);
		slide29_r4.cubeList.add(new ModelBox(slide29_r4, 49, 0, -0.749F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));
		slide29_r4.cubeList.add(new ModelBox(slide29_r4, 49, 5, 3.151F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));

		slide30_r2 = new ModelRenderer(this);
		slide30_r2.setRotationPoint(-2.7F, -37.4F, -18.6F);
		G19ghostprecisionslide.addChild(slide30_r2);
		setRotationAngle(slide30_r2, -0.192F, 0.0F, 0.0F);
		slide30_r2.cubeList.add(new ModelBox(slide30_r2, 23, 0, -0.751F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));
		slide30_r2.cubeList.add(new ModelBox(slide30_r2, 40, 7, 3.149F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));

		slide28_r5 = new ModelRenderer(this);
		slide28_r5.setRotationPoint(-2.7F, -37.4F, 1.15F);
		G19ghostprecisionslide.addChild(slide28_r5);
		setRotationAngle(slide28_r5, -0.192F, 0.0F, 0.0F);
		slide28_r5.cubeList.add(new ModelBox(slide28_r5, 46, 16, -0.75F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));
		slide28_r5.cubeList.add(new ModelBox(slide28_r5, 49, 10, 3.15F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));

		slide35_r3 = new ModelRenderer(this);
		slide35_r3.setRotationPoint(-2.7F, -37.4F, -25.1F);
		G19ghostprecisionslide.addChild(slide35_r3);
		setRotationAngle(slide35_r3, -0.192F, 0.0F, 0.0F);
		slide35_r3.cubeList.add(new ModelBox(slide35_r3, 0, 33, -0.7452F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));
		slide35_r3.cubeList.add(new ModelBox(slide35_r3, 31, 38, 3.1548F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));

		slide34_r5 = new ModelRenderer(this);
		slide34_r5.setRotationPoint(-2.7F, -37.4F, -24.1F);
		G19ghostprecisionslide.addChild(slide34_r5);
		setRotationAngle(slide34_r5, -0.192F, 0.0F, 0.0F);
		slide34_r5.cubeList.add(new ModelBox(slide34_r5, 32, 20, -0.7452F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));
		slide34_r5.cubeList.add(new ModelBox(slide34_r5, 17, 39, 3.1548F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));

		slide33_r3 = new ModelRenderer(this);
		slide33_r3.setRotationPoint(-2.7F, -37.4F, -23.1F);
		G19ghostprecisionslide.addChild(slide33_r3);
		setRotationAngle(slide33_r3, -0.192F, 0.0F, 0.0F);
		slide33_r3.cubeList.add(new ModelBox(slide33_r3, 32, 0, -0.7452F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));
		slide33_r3.cubeList.add(new ModelBox(slide33_r3, 0, 40, 3.1548F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));

		slide32_r3 = new ModelRenderer(this);
		slide32_r3.setRotationPoint(-2.7F, -37.4F, -22.1F);
		G19ghostprecisionslide.addChild(slide32_r3);
		setRotationAngle(slide32_r3, -0.192F, 0.0F, 0.0F);
		slide32_r3.cubeList.add(new ModelBox(slide32_r3, 17, 32, -0.7452F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));
		slide32_r3.cubeList.add(new ModelBox(slide32_r3, 4, 40, 3.1548F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));

		slide31_r2 = new ModelRenderer(this);
		slide31_r2.setRotationPoint(-2.7F, -37.4F, -21.1F);
		G19ghostprecisionslide.addChild(slide31_r2);
		setRotationAngle(slide31_r2, -0.192F, 0.0F, 0.0F);
		slide31_r2.cubeList.add(new ModelBox(slide31_r2, 31, 31, -0.7452F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));
		slide31_r2.cubeList.add(new ModelBox(slide31_r2, 10, 40, 3.1548F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));

		slide30_r3 = new ModelRenderer(this);
		slide30_r3.setRotationPoint(-2.7F, -37.4F, -20.1F);
		G19ghostprecisionslide.addChild(slide30_r3);
		setRotationAngle(slide30_r3, -0.192F, 0.0F, 0.0F);
		slide30_r3.cubeList.add(new ModelBox(slide30_r3, 23, 31, -0.7452F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));
		slide30_r3.cubeList.add(new ModelBox(slide30_r3, 40, 0, 3.1548F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));

		slide29_r5 = new ModelRenderer(this);
		slide29_r5.setRotationPoint(-2.7F, -37.4F, -19.1F);
		G19ghostprecisionslide.addChild(slide29_r5);
		setRotationAngle(slide29_r5, -0.192F, 0.0F, 0.0F);
		slide29_r5.cubeList.add(new ModelBox(slide29_r5, 24, 14, -0.7452F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));
		slide29_r5.cubeList.add(new ModelBox(slide29_r5, 40, 16, 3.1548F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));

		slide27_r4 = new ModelRenderer(this);
		slide27_r4.setRotationPoint(-2.7F, -37.4F, 0.15F);
		G19ghostprecisionslide.addChild(slide27_r4);
		setRotationAngle(slide27_r4, -0.192F, 0.0F, 0.0F);
		slide27_r4.cubeList.add(new ModelBox(slide27_r4, 44, 36, -0.75F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));
		slide27_r4.cubeList.add(new ModelBox(slide27_r4, 4, 53, 3.15F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));

		slide27_r5 = new ModelRenderer(this);
		slide27_r5.setRotationPoint(-2.7F, -37.4F, -2.85F);
		G19ghostprecisionslide.addChild(slide27_r5);
		setRotationAngle(slide27_r5, -0.192F, 0.0F, 0.0F);
		slide27_r5.cubeList.add(new ModelBox(slide27_r5, 40, 36, -0.75F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));
		slide27_r5.cubeList.add(new ModelBox(slide27_r5, 50, 49, 3.15F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));

		slide26_r3 = new ModelRenderer(this);
		slide26_r3.setRotationPoint(-2.7F, -37.4F, -0.85F);
		G19ghostprecisionslide.addChild(slide26_r3);
		setRotationAngle(slide26_r3, -0.192F, 0.0F, 0.0F);
		slide26_r3.cubeList.add(new ModelBox(slide26_r3, 44, 31, -0.75F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));
		slide26_r3.cubeList.add(new ModelBox(slide26_r3, 8, 53, 3.15F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));

		slide25_r4 = new ModelRenderer(this);
		slide25_r4.setRotationPoint(-2.7F, -37.4F, -3.85F);
		G19ghostprecisionslide.addChild(slide25_r4);
		setRotationAngle(slide25_r4, -0.192F, 0.0F, 0.0F);
		slide25_r4.cubeList.add(new ModelBox(slide25_r4, 40, 31, -0.75F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));
		slide25_r4.cubeList.add(new ModelBox(slide25_r4, 16, 53, 3.15F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));

		slide26_r4 = new ModelRenderer(this);
		slide26_r4.setRotationPoint(-2.7F, -37.4F, -26.1F);
		G19ghostprecisionslide.addChild(slide26_r4);
		setRotationAngle(slide26_r4, -0.192F, 0.0F, 0.0F);
		slide26_r4.cubeList.add(new ModelBox(slide26_r4, 36, 20, -0.75F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));
		slide26_r4.cubeList.add(new ModelBox(slide26_r4, 27, 38, 3.15F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));

		slide25_r5 = new ModelRenderer(this);
		slide25_r5.setRotationPoint(-0.5F, -36.501F, 0.55F);
		G19ghostprecisionslide.addChild(slide25_r5);
		setRotationAngle(slide25_r5, -0.7854F, 0.0F, 0.0F);
		slide25_r5.cubeList.add(new ModelBox(slide25_r5, 32, 9, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide24_r4 = new ModelRenderer(this);
		slide24_r4.setRotationPoint(-0.5F, -36.301F, 0.55F);
		G19ghostprecisionslide.addChild(slide24_r4);
		setRotationAngle(slide24_r4, -0.7854F, 0.0F, 0.0F);
		slide24_r4.cubeList.add(new ModelBox(slide24_r4, 32, 11, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide23_r5 = new ModelRenderer(this);
		slide23_r5.setRotationPoint(-0.5F, -35.901F, 0.55F);
		G19ghostprecisionslide.addChild(slide23_r5);
		setRotationAngle(slide23_r5, -0.7854F, 0.0F, 0.0F);
		slide23_r5.cubeList.add(new ModelBox(slide23_r5, 32, 13, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide23_r6 = new ModelRenderer(this);
		slide23_r6.setRotationPoint(-0.5F, -36.101F, 0.55F);
		G19ghostprecisionslide.addChild(slide23_r6);
		setRotationAngle(slide23_r6, -0.7854F, 0.0F, 0.0F);
		slide23_r6.cubeList.add(new ModelBox(slide23_r6, 32, 16, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide22_r7 = new ModelRenderer(this);
		slide22_r7.setRotationPoint(-0.5F, -35.701F, 0.55F);
		G19ghostprecisionslide.addChild(slide22_r7);
		setRotationAngle(slide22_r7, -0.7854F, 0.0F, 0.0F);
		slide22_r7.cubeList.add(new ModelBox(slide22_r7, 32, 18, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		G19ghostprecisionslide.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}