package com.vicmatskiv.mw.models;

import com.vicmatskiv.weaponlib.ModelWithAttachments;

import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class Glock13rndMagazine extends ModelWithAttachments {
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

	public Glock13rndMagazine() {
		textureWidth = 128;
		textureHeight = 128;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.0F, 24.0F, 0.0F);
		gun.cubeList.add(new ModelBox(gun, 32, 25, -2.999F, -31.0F, -6.8F, 4, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 64, 7, -2.5F, -17.5F, -4.8F, 3, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 89, 69, -3.001F, -19.5F, -3.7F, 4, 3, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 5, 62, -2.999F, -20.0F, 1.9F, 4, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 7, 67, -2.5F, -20.0F, 2.9F, 3, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 15, 52, -3.0F, -32.0F, -8.5F, 4, 2, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 44, 52, -3.0F, -34.0F, 0.25F, 4, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 67, 0, -2.5F, -35.7F, 0.8F, 3, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 58, 12, -0.1F, -32.0F, -6.5F, 1, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 58, 7, -2.9F, -32.0F, -6.5F, 1, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 91, -2.499F, -27.5F, -16.5F, 3, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 58, 0, -2.3F, -37.9F, -15.5F, 2, 2, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 17, 63, -3.0F, -34.7F, -28.4F, 1, 1, 15, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 62, 0.0F, -34.7F, -28.4F, 1, 1, 15, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 90, 29, -2.999F, -33.8F, -19.4F, 4, 2, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 58, 44, -2.999F, -34.0F, -10.5F, 4, 1, 11, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 77, 44, -2.999F, -33.0F, -10.5F, 4, 1, 10, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 62, -0.299F, -34.0F, -13.4F, 1, 3, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 58, 44, -2.699F, -34.0F, -13.4F, 1, 3, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 64, 25, -2.499F, -31.6F, -16.1F, 3, 4, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 17, 62, -2.0F, -32.3F, -26.8F, 2, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 38, -2.0F, -32.3F, -22.8F, 2, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 55, 62, -2.0F, -32.5F, -23.8F, 2, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 64, 86, -2.8F, -34.0F, -28.4F, 1, 1, 9, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 46, 83, -0.2F, -34.0F, -28.4F, 1, 1, 9, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 79, 0, -2.5F, -33.2F, -27.4F, 3, 1, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 14, -2.6F, -37.6F, -15.5F, 1, 2, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 58, 0, -2.0F, -35.0F, -29.0F, 2, 2, 17, -0.3F, false));

		gun31_r1 = new ModelRenderer(this);
		gun31_r1.setRotationPoint(-2.0F, -37.3F, -28.8F);
		gun.addChild(gun31_r1);
		setRotationAngle(gun31_r1, -0.0372F, 0.0F, 0.0F);
		gun31_r1.cubeList.add(new ModelBox(gun31_r1, 58, 25, 0.0F, 0.0F, 0.0F, 2, 2, 17, 0.0F, false));

		gun110_r1 = new ModelRenderer(this);
		gun110_r1.setRotationPoint(1.0F, -33.7F, -28.4F);
		gun.addChild(gun110_r1);
		setRotationAngle(gun110_r1, 0.0F, 0.0F, 0.9774F);
		gun110_r1.cubeList.add(new ModelBox(gun110_r1, 84, 86, -1.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		gun109_r1 = new ModelRenderer(this);
		gun109_r1.setRotationPoint(-3.0F, -33.7F, -28.4F);
		gun.addChild(gun109_r1);
		setRotationAngle(gun109_r1, 0.0F, 0.0F, -0.9774F);
		gun109_r1.cubeList.add(new ModelBox(gun109_r1, 87, 55, 0.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		gun113_r1 = new ModelRenderer(this);
		gun113_r1.setRotationPoint(-1.3F, -32.2F, -27.4F);
		gun.addChild(gun113_r1);
		setRotationAngle(gun113_r1, 0.0F, 0.0F, -0.7854F);
		gun113_r1.cubeList.add(new ModelBox(gun113_r1, 75, 86, -1.0F, -1.0F, 0.0F, 1, 1, 8, 0.0F, false));

		gun112_r1 = new ModelRenderer(this);
		gun112_r1.setRotationPoint(0.7F, -32.2F, -27.4F);
		gun.addChild(gun112_r1);
		setRotationAngle(gun112_r1, 0.0F, 0.0F, -0.7854F);
		gun112_r1.cubeList.add(new ModelBox(gun112_r1, 12, 92, -1.0F, -1.0F, 0.0F, 1, 1, 8, 0.0F, false));

		gun111_r1 = new ModelRenderer(this);
		gun111_r1.setRotationPoint(0.8F, -33.0F, -28.4F);
		gun.addChild(gun111_r1);
		setRotationAngle(gun111_r1, 0.0F, 0.0F, -0.7854F);
		gun111_r1.cubeList.add(new ModelBox(gun111_r1, 79, 19, -1.0F, -1.0F, 0.0F, 1, 1, 9, 0.0F, false));

		gun110_r2 = new ModelRenderer(this);
		gun110_r2.setRotationPoint(-2.8F, -33.0F, -28.4F);
		gun.addChild(gun110_r2);
		setRotationAngle(gun110_r2, 0.0F, 0.0F, -0.7854F);
		gun110_r2.cubeList.add(new ModelBox(gun110_r2, 79, 29, 0.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		gun111_r2 = new ModelRenderer(this);
		gun111_r2.setRotationPoint(0.0F, -31.53F, -27.8F);
		gun.addChild(gun111_r2);
		setRotationAngle(gun111_r2, 0.6632F, 0.0F, 0.0F);
		gun111_r2.cubeList.add(new ModelBox(gun111_r2, 48, 59, -2.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

		gun110_r3 = new ModelRenderer(this);
		gun110_r3.setRotationPoint(0.0F, -31.3F, -26.8F);
		gun.addChild(gun110_r3);
		setRotationAngle(gun110_r3, 1.3439F, 0.0F, 0.0F);
		gun110_r3.cubeList.add(new ModelBox(gun110_r3, 54, 59, -2.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

		gun111_r3 = new ModelRenderer(this);
		gun111_r3.setRotationPoint(1.501F, -31.2F, -19.5F);
		gun.addChild(gun111_r3);
		setRotationAngle(gun111_r3, 1.5184F, 0.0F, 0.0F);
		gun111_r3.cubeList.add(new ModelBox(gun111_r3, 0, 0, -4.001F, 0.0F, 0.0F, 3, 11, 1, 0.0F, false));

		gun110_r4 = new ModelRenderer(this);
		gun110_r4.setRotationPoint(1.001F, -31.8F, -19.4F);
		gun.addChild(gun110_r4);
		setRotationAngle(gun110_r4, 1.501F, 0.0F, 0.0F);
		gun110_r4.cubeList.add(new ModelBox(gun110_r4, 0, 31, -4.001F, 0.0F, 0.0F, 4, 6, 1, 0.0F, false));

		gun111_r4 = new ModelRenderer(this);
		gun111_r4.setRotationPoint(-2.999F, -31.8F, -19.4F);
		gun.addChild(gun111_r4);
		setRotationAngle(gun111_r4, 0.0F, -0.7854F, 0.0F);
		gun111_r4.cubeList.add(new ModelBox(gun111_r4, 26, 40, 0.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F, false));

		gun110_r5 = new ModelRenderer(this);
		gun110_r5.setRotationPoint(1.001F, -31.8F, -19.4F);
		gun.addChild(gun110_r5);
		setRotationAngle(gun110_r5, 0.0F, -0.7854F, 0.0F);
		gun110_r5.cubeList.add(new ModelBox(gun110_r5, 43, 20, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun111_r5 = new ModelRenderer(this);
		gun111_r5.setRotationPoint(0.501F, -29.8F, -15.6F);
		gun.addChild(gun111_r5);
		setRotationAngle(gun111_r5, 0.8727F, 0.0F, 0.0F);
		gun111_r5.cubeList.add(new ModelBox(gun111_r5, 58, 50, -3.002F, -2.0F, 0.0F, 3, 2, 2, 0.0F, false));

		gun111_r6 = new ModelRenderer(this);
		gun111_r6.setRotationPoint(1.101F, -32.85F, -7.5F);
		gun.addChild(gun111_r6);
		setRotationAngle(gun111_r6, 0.0F, 0.0F, 0.192F);
		gun111_r6.cubeList.add(new ModelBox(gun111_r6, 23, 17, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun39_r1 = new ModelRenderer(this);
		gun39_r1.setRotationPoint(-3.0F, -30.9F, -10.7F);
		gun.addChild(gun39_r1);
		setRotationAngle(gun39_r1, -0.1222F, 0.0F, 0.0F);
		gun39_r1.cubeList.add(new ModelBox(gun39_r1, 48, 25, -0.001F, -2.0F, 0.0F, 4, 2, 3, 0.0F, false));

		gun38_r1 = new ModelRenderer(this);
		gun38_r1.setRotationPoint(-3.0F, -30.9F, -10.7F);
		gun.addChild(gun38_r1);
		setRotationAngle(gun38_r1, 1.8218F, 0.0F, 0.0F);
		gun38_r1.cubeList.add(new ModelBox(gun38_r1, 32, 20, 0.0F, 0.0F, 0.0F, 4, 1, 3, 0.0F, false));

		gun37_r1 = new ModelRenderer(this);
		gun37_r1.setRotationPoint(-3.0F, -30.9F, -13.5F);
		gun.addChild(gun37_r1);
		setRotationAngle(gun37_r1, 1.8218F, 0.0F, 0.0F);
		gun37_r1.cubeList.add(new ModelBox(gun37_r1, 15, 40, 0.0F, 0.0F, 0.0F, 4, 1, 3, 0.0F, false));

		gun93_r1 = new ModelRenderer(this);
		gun93_r1.setRotationPoint(0.5F, -27.5F, -13.6F);
		gun.addChild(gun93_r1);
		setRotationAngle(gun93_r1, -0.5934F, 0.0F, 0.0F);
		gun93_r1.cubeList.add(new ModelBox(gun93_r1, 64, 12, -3.0F, 0.0F, -2.0F, 3, 1, 2, 0.0F, false));

		gun92_r1 = new ModelRenderer(this);
		gun92_r1.setRotationPoint(0.5F, -27.5F, -16.5F);
		gun.addChild(gun92_r1);
		setRotationAngle(gun92_r1, -0.4538F, 0.0F, 0.0F);
		gun92_r1.cubeList.add(new ModelBox(gun92_r1, 40, 59, -3.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun92_r2 = new ModelRenderer(this);
		gun92_r2.setRotationPoint(0.501F, -26.5F, -9.5F);
		gun.addChild(gun92_r2);
		setRotationAngle(gun92_r2, 2.0246F, 0.0F, 0.0F);
		gun92_r2.cubeList.add(new ModelBox(gun92_r2, 67, 39, -3.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F, false));

		gun141_r1 = new ModelRenderer(this);
		gun141_r1.setRotationPoint(-2.0F, -29.5F, -10.0F);
		gun.addChild(gun141_r1);
		setRotationAngle(gun141_r1, 3.0356F, 0.0F, 0.0F);
		gun141_r1.cubeList.add(new ModelBox(gun141_r1, 23, 45, 0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F, false));

		gun140_r1 = new ModelRenderer(this);
		gun140_r1.setRotationPoint(-2.0F, -29.5F, -10.0F);
		gun.addChild(gun140_r1);
		setRotationAngle(gun140_r1, -2.3051F, 0.0F, 0.0F);
		gun140_r1.cubeList.add(new ModelBox(gun140_r1, 23, 67, 0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

		gun157_r1 = new ModelRenderer(this);
		gun157_r1.setRotationPoint(-0.2F, -31.3F, -12.3F);
		gun.addChild(gun157_r1);
		setRotationAngle(gun157_r1, 1.8218F, 0.0F, 0.0F);
		gun157_r1.cubeList.add(new ModelBox(gun157_r1, 44, 25, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));
		gun157_r1.cubeList.add(new ModelBox(gun157_r1, 23, 48, -2.6F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun10_r1 = new ModelRenderer(this);
		gun10_r1.setRotationPoint(1.0F, -30.0F, -8.5F);
		gun.addChild(gun10_r1);
		setRotationAngle(gun10_r1, -0.5585F, 0.0F, 0.0F);
		gun10_r1.cubeList.add(new ModelBox(gun10_r1, 15, 56, -3.999F, -1.0F, 0.0F, 4, 1, 1, 0.0F, false));

		gun12_r1 = new ModelRenderer(this);
		gun12_r1.setRotationPoint(1.0F, -31.7F, -1.4F);
		gun.addChild(gun12_r1);
		setRotationAngle(gun12_r1, -1.0647F, 0.0F, 0.0F);
		gun12_r1.cubeList.add(new ModelBox(gun12_r1, 58, 36, -4.001F, -3.0F, -1.0F, 4, 3, 1, 0.0F, false));

		gun13_r1 = new ModelRenderer(this);
		gun13_r1.setRotationPoint(1.0F, -33.0F, 2.25F);
		gun.addChild(gun13_r1);
		setRotationAngle(gun13_r1, 0.1745F, 0.0F, 0.0F);
		gun13_r1.cubeList.add(new ModelBox(gun13_r1, 32, 52, -4.001F, -1.0F, -2.0F, 4, 1, 2, 0.0F, false));

		gun13_r2 = new ModelRenderer(this);
		gun13_r2.setRotationPoint(1.0F, -34.0F, 2.25F);
		gun.addChild(gun13_r2);
		setRotationAngle(gun13_r2, 1.0123F, 0.0F, 0.0F);
		gun13_r2.cubeList.add(new ModelBox(gun13_r2, 46, 36, -4.001F, -1.0F, -1.0F, 4, 1, 1, 0.0F, false));

		gun14_r1 = new ModelRenderer(this);
		gun14_r1.setRotationPoint(0.5F, -31.0F, -0.45F);
		gun.addChild(gun14_r1);
		setRotationAngle(gun14_r1, 0.1396F, 0.0F, 0.0F);
		gun14_r1.cubeList.add(new ModelBox(gun14_r1, 0, 45, -2.999F, 0.0F, -2.0F, 3, 4, 2, 0.0F, false));

		gun13_r3 = new ModelRenderer(this);
		gun13_r3.setRotationPoint(0.5F, -33.0F, 2.25F);
		gun.addChild(gun13_r3);
		setRotationAngle(gun13_r3, 0.5236F, 0.0F, 0.0F);
		gun13_r3.cubeList.add(new ModelBox(gun13_r3, 0, 51, -3.0F, -1.0F, -3.0F, 3, 1, 3, 0.0F, false));

		gun11_r1 = new ModelRenderer(this);
		gun11_r1.setRotationPoint(0.5F, -30.0F, -0.8F);
		gun.addChild(gun11_r1);
		setRotationAngle(gun11_r1, -0.576F, 0.0F, 0.0F);
		gun11_r1.cubeList.add(new ModelBox(gun11_r1, 46, 31, -3.001F, -3.0F, -2.0F, 3, 3, 2, 0.0F, false));

		gun10_r2 = new ModelRenderer(this);
		gun10_r2.setRotationPoint(1.0F, -30.0F, -1.8F);
		gun.addChild(gun10_r2);
		setRotationAngle(gun10_r2, -0.576F, 0.0F, 0.0F);
		gun10_r2.cubeList.add(new ModelBox(gun10_r2, 0, 21, -4.001F, -3.0F, -2.0F, 4, 3, 2, 0.0F, false));

		gun9_r1 = new ModelRenderer(this);
		gun9_r1.setRotationPoint(-2.5F, -17.5F, -4.8F);
		gun.addChild(gun9_r1);
		setRotationAngle(gun9_r1, 0.8029F, 0.0F, 0.0F);
		gun9_r1.cubeList.add(new ModelBox(gun9_r1, 39, 62, 0.001F, 0.0F, 0.0F, 3, 1, 2, 0.0F, false));

		gun11_r2 = new ModelRenderer(this);
		gun11_r2.setRotationPoint(1.001F, -20.0F, 2.9F);
		gun.addChild(gun11_r2);
		setRotationAngle(gun11_r2, -1.0996F, 0.0F, 0.0F);
		gun11_r2.cubeList.add(new ModelBox(gun11_r2, 89, 78, -4.0F, 0.0F, -6.0F, 4, 1, 6, 0.0F, false));

		gun12_r2 = new ModelRenderer(this);
		gun12_r2.setRotationPoint(0.501F, -20.0F, 3.9F);
		gun.addChild(gun12_r2);
		setRotationAngle(gun12_r2, 0.4712F, 0.0F, 0.0F);
		gun12_r2.cubeList.add(new ModelBox(gun12_r2, 17, 0, -3.0F, -9.0F, -1.0F, 3, 9, 1, 0.0F, false));

		gun12_r3 = new ModelRenderer(this);
		gun12_r3.setRotationPoint(0.501F, -18.0F, 3.9F);
		gun.addChild(gun12_r3);
		setRotationAngle(gun12_r3, -0.7854F, 0.0F, 0.0F);
		gun12_r3.cubeList.add(new ModelBox(gun12_r3, 58, 32, -3.0F, 0.0F, -2.0F, 3, 2, 2, 0.0F, false));

		gun13_r4 = new ModelRenderer(this);
		gun13_r4.setRotationPoint(-1.699F, -17.8F, 2.5F);
		gun.addChild(gun13_r4);
		setRotationAngle(gun13_r4, -0.4014F, 0.0F, 0.0F);
		gun13_r4.cubeList.add(new ModelBox(gun13_r4, 52, 38, -1.001F, 0.0F, -1.0F, 1, 1, 1, 0.3F, false));
		gun13_r4.cubeList.add(new ModelBox(gun13_r4, 52, 40, 1.399F, 0.0F, -1.0F, 1, 1, 1, 0.3F, false));

		gun10_r3 = new ModelRenderer(this);
		gun10_r3.setRotationPoint(-5.1F, -31.45F, -8.8F);
		gun.addChild(gun10_r3);
		setRotationAngle(gun10_r3, 0.3543F, 0.0F, 0.0F);
		gun10_r3.cubeList.add(new ModelBox(gun10_r3, 52, 42, 2.0F, 3.0F, 1.0F, 1, 1, 1, 0.0F, false));

		gun9_r2 = new ModelRenderer(this);
		gun9_r2.setRotationPoint(-1.9F, -31.35F, -8.6F);
		gun.addChild(gun9_r2);
		setRotationAngle(gun9_r2, 0.3543F, 0.0F, 0.0F);
		gun9_r2.cubeList.add(new ModelBox(gun9_r2, 7, 14, 2.0F, 3.0F, 0.0F, 1, 2, 2, 0.0F, false));

		gun8_r1 = new ModelRenderer(this);
		gun8_r1.setRotationPoint(-2.3F, -31.2F, -9.0F);
		gun.addChild(gun8_r1);
		setRotationAngle(gun8_r1, 0.3543F, 0.0F, 0.0F);
		gun8_r1.cubeList.add(new ModelBox(gun8_r1, 8, 6, 2.0F, 3.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun7_r1 = new ModelRenderer(this);
		gun7_r1.setRotationPoint(-2.5F, -30.7F, -9.2F);
		gun.addChild(gun7_r1);
		setRotationAngle(gun7_r1, 0.3543F, 0.0F, 0.0F);
		gun7_r1.cubeList.add(new ModelBox(gun7_r1, 32, 0, 0.0F, 0.0F, 0.0F, 3, 14, 6, 0.0F, false));

		gun6_r1 = new ModelRenderer(this);
		gun6_r1.setRotationPoint(-3.0F, -30.0F, -8.0F);
		gun.addChild(gun6_r1);
		setRotationAngle(gun6_r1, 0.3718F, 0.0F, 0.0F);
		gun6_r1.cubeList.add(new ModelBox(gun6_r1, 32, 32, 0.0F, 0.0F, 0.0F, 4, 14, 6, 0.0F, false));

		gun145_r1 = new ModelRenderer(this);
		gun145_r1.setRotationPoint(-2.6F, -30.0F, -5.8F);
		gun.addChild(gun145_r1);
		setRotationAngle(gun145_r1, 0.0F, 0.0F, 0.7854F);
		gun145_r1.cubeList.add(new ModelBox(gun145_r1, 46, 16, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		gun145_r2 = new ModelRenderer(this);
		gun145_r2.setRotationPoint(0.5F, -33.3F, -7.95F);
		gun.addChild(gun145_r2);
		setRotationAngle(gun145_r2, 0.0F, 0.0F, 0.7854F);
		gun145_r2.cubeList.add(new ModelBox(gun145_r2, 24, 63, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		gun144_r1 = new ModelRenderer(this);
		gun144_r1.setRotationPoint(0.6F, -30.0F, -5.8F);
		gun.addChild(gun144_r1);
		setRotationAngle(gun144_r1, 0.0F, 0.0F, 0.7854F);
		gun144_r1.cubeList.add(new ModelBox(gun144_r1, 58, 19, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

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
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 26, 101, -2.5F, -37.5F, 0.9F, 3, 2, 1, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 24, 0, -2.3F, -37.5F, -28.499F, 2, 5, 1, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 23, 47, -0.7F, -37.5F, -28.501F, 1, 5, 1, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 116, 56, -3.1F, -36.0F, -16.5F, 1, 2, 18, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 76, 91, 0.1F, -36.0F, -16.5F, 1, 2, 18, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 81, 150, -3.1F, -35.0F, -28.5F, 1, 1, 8, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 63, 150, 0.1F, -35.0F, -28.5F, 1, 1, 8, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 32, 51, -3.1F, -37.0F, -28.5F, 1, 2, 4, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 49, 37, 0.1F, -37.0F, -28.5F, 1, 2, 4, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 64, 19, -3.101F, -35.5F, -20.5F, 1, 1, 4, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 64, 14, 0.099F, -35.5F, -20.5F, 1, 1, 4, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 95, 0, -3.099F, -37.5F, -7.5F, 1, 2, 9, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 118, 0, 0.101F, -37.5F, -15.5F, 1, 2, 17, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 16, 138, -2.4F, -38.1F, -10.5F, 2, 1, 12, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 74, 59, -3.0F, -38.2F, -2.75F, 4, 1, 1, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 104, 81, -2.5F, -38.201F, -4.75F, 3, 1, 5, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 52, 95, -0.6F, -38.101F, -20.5F, 1, 1, 22, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 76, 94, -0.6F, -38.101F, -28.5F, 1, 1, 3, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 22, 151, -0.35F, -38.35F, -25.75F, 1, 1, 6, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 150, 141, -2.65F, -38.351F, -25.75F, 1, 1, 6, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 87, 136, -3.099F, -37.501F, -28.5F, 1, 1, 13, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 135, 135, 0.101F, -37.501F, -28.5F, 1, 1, 13, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 135, 118, -0.399F, -37.501F, -28.5F, 1, 1, 13, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 130, 27, -3.2F, -37.501F, 1.001F, 1, 1, 1, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 43, 130, -3.201F, -37.501F, 0.601F, 1, 1, 1, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 129, 102, 0.199F, -37.501F, 0.601F, 1, 1, 1, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 130, 25, 0.199F, -37.501F, 1.001F, 1, 1, 1, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 12, 126, -3.4F, -37.001F, -7.8F, 1, 2, 1, -0.2F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 44, 122, -3.401F, -37.7F, -7.801F, 1, 2, 1, -0.2F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 100, 0, 0.399F, -37.7F, -7.801F, 1, 2, 1, -0.2F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 86, 94, 0.399F, -37.7F, -10.401F, 1, 1, 3, -0.2F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 130, 23, -3.199F, -37.501F, -16.5F, 1, 1, 1, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 129, 68, 0.201F, -37.501F, -16.5F, 1, 1, 1, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 64, 14, -3.199F, -37.001F, 1.0F, 1, 3, 1, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 130, 19, -3.099F, -35.901F, 0.9F, 1, 1, 1, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 130, 13, -1.5F, -35.901F, 0.9F, 1, 1, 1, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 130, 11, 0.101F, -35.901F, 0.9F, 1, 1, 1, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 64, 5, 0.2F, -37.001F, 1.0F, 1, 3, 1, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 8, 126, -3.45F, -35.75F, -0.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 120, 56, 0.45F, -35.75F, -0.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 0, 126, -3.45F, -35.75F, -2.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 116, 70, 0.45F, -35.75F, -2.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 114, 125, -3.45F, -35.75F, -1.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 120, 49, 0.45F, -35.75F, -1.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 110, 125, -3.45F, -35.75F, -3.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 110, 35, 0.45F, -35.75F, -3.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 66, 125, -3.45F, -35.75F, -5.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 100, 15, 0.45F, -35.75F, -5.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 102, 125, -3.45F, -35.75F, -4.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 20, 110, 0.45F, -35.75F, -4.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 70, 125, -3.45F, -35.75F, -6.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 100, 11, 0.45F, -35.75F, -6.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 59, 125, -3.45F, -35.75F, -7.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 100, 4, 0.45F, -35.75F, -7.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 55, 125, -3.45F, -35.75F, -21.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 95, 48, 0.45F, -35.75F, -21.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 94, 130, -3.45F, -34.75F, -22.25F, 1, 1, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 129, 93, 0.45F, -34.75F, -22.25F, 1, 1, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 47, 130, -3.45F, -34.75F, -24.25F, 1, 1, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 129, 82, 0.45F, -34.75F, -24.25F, 1, 1, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 82, 130, -3.45F, -34.75F, -23.25F, 1, 1, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 129, 84, 0.45F, -34.75F, -23.25F, 1, 1, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 49, 125, -3.45F, -35.75F, -25.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 95, 43, 0.45F, -35.75F, -25.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 124, 76, -3.45F, -35.75F, -26.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 84, 48, 0.45F, -35.75F, -26.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 29, 124, -3.45F, -35.75F, -27.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 41, 81, 0.45F, -35.75F, -27.25F, 1, 2, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 90, 130, -3.45F, -35.25F, -22.25F, 1, 1, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 129, 91, 0.45F, -35.25F, -22.25F, 1, 1, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 78, 130, -3.45F, -35.25F, -24.25F, 1, 1, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 129, 70, 0.45F, -35.25F, -24.25F, 1, 1, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 86, 130, -3.45F, -35.25F, -23.25F, 1, 1, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 129, 86, 0.45F, -35.25F, -23.25F, 1, 1, 1, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 0, 15, -3.45F, -34.75F, -20.75F, 1, 1, 14, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 0, 0, 0.45F, -34.75F, -20.75F, 1, 1, 14, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 96, 96, -3.451F, -34.75F, -27.25F, 1, 1, 3, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 95, 15, 0.449F, -34.75F, -27.25F, 1, 1, 3, -0.25F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 32, 6, -3.199F, -36.001F, -16.0F, 1, 1, 5, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 32, 0, 0.201F, -36.001F, -16.0F, 1, 1, 5, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 127, 32, 0.199F, -36.001F, -11.75F, 1, 1, 1, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 26, 97, -3.2F, -36.201F, -10.5F, 1, 1, 3, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 130, 9, -0.6F, -38.1F, 1.001F, 1, 1, 1, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 52, 115, -2.4F, -38.099F, 1.001F, 2, 1, 1, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 79, 7, -2.4F, -38.1F, -20.5F, 2, 1, 5, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 79, 21, -2.4F, -38.1F, -28.5F, 2, 1, 3, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 120, 59, -3.0F, -37.0F, -10.499F, 1, 1, 1, 0.0F, false));
		G19razorbackslide.cubeList.add(new ModelBox(G19razorbackslide, 44, 94, -2.9F, -37.0F, -9.5F, 1, 1, 2, 0.0F, false));

		slide59_r1 = new ModelRenderer(this);
		slide59_r1.setRotationPoint(-2.75F, -38.15F, -2.1F);
		G19razorbackslide.addChild(slide59_r1);
		setRotationAngle(slide59_r1, 0.0F, 0.0F, -0.6545F);
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 129, 57, -1.0F, 0.0F, 0.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 40, 129, -0.5F, 0.0F, -2.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 129, 61, -1.0F, 0.0F, -2.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 43, 128, -0.5F, 0.0F, -17.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 102, 128, -0.5F, 0.0F, -21.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 8, 129, -0.5F, 0.0F, -25.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 29, 129, -0.5F, 0.0F, -4.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 127, 78, -1.0F, 0.0F, -17.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 90, 128, -1.0F, 0.0F, -21.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 12, 129, -1.0F, 0.0F, -25.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 129, 66, -1.0F, 0.0F, -4.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 55, 129, -0.5F, 0.0F, 1.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 67, 129, -1.0F, 0.0F, 1.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 71, 129, -1.0F, 0.0F, -1.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 127, 38, -0.5F, 0.0F, -16.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 95, 4, -0.5F, 0.0F, -20.0F, 1, 1, 3, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 128, 76, -0.5F, 0.0F, -24.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 36, 129, -0.5F, 0.0F, -3.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 47, 128, -1.0F, 0.0F, -16.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 95, 0, -1.0F, 0.0F, -20.0F, 1, 1, 3, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 114, 128, -1.0F, 0.0F, -24.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 129, 59, -1.0F, 0.0F, -3.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 78, 128, -0.5F, 0.0F, -23.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 94, 128, -0.5F, 0.0F, -22.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 21, 129, -0.5F, 0.0F, -26.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 25, 129, -0.5F, 0.0F, -5.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 82, 128, -1.0F, 0.0F, -23.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 86, 128, -1.0F, 0.0F, -22.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 0, 129, -1.0F, 0.0F, -26.0F, 1, 1, 1, -0.25F, false));
		slide59_r1.cubeList.add(new ModelBox(slide59_r1, 130, 1, -1.0F, 0.0F, -5.0F, 1, 1, 1, -0.25F, false));

		slide70_r1 = new ModelRenderer(this);
		slide70_r1.setRotationPoint(1.55F, -37.53F, -28.1F);
		G19razorbackslide.addChild(slide70_r1);
		setRotationAngle(slide70_r1, 0.0F, 0.0F, 0.6545F);
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 126, 56, -1.5F, 0.0F, 0.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 126, 65, -1.5F, 0.0F, 2.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 126, 81, -1.5F, 0.0F, 4.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 126, 90, -1.5F, 0.0F, 9.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 126, 19, -1.5F, 0.0F, 1.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 126, 62, -1.5F, 0.0F, 3.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 126, 71, -1.5F, 0.0F, 5.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 126, 94, -1.5F, 0.0F, 10.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 25, 127, -1.5F, 0.0F, 21.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 126, 58, -1.0F, 0.0F, 0.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 126, 67, -1.0F, 0.0F, 2.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 126, 83, -1.0F, 0.0F, 4.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 126, 87, -1.0F, 0.0F, 9.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 44, 126, -1.0F, 0.0F, 1.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 126, 60, -1.0F, 0.0F, 3.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 126, 69, -1.0F, 0.0F, 5.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 126, 92, -1.0F, 0.0F, 10.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 127, 8, -1.0F, 0.0F, 21.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 127, 2, -1.5F, 0.0F, 24.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 127, 22, -1.0F, 0.0F, 24.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 127, 24, -1.0F, 0.0F, 26.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 29, 127, -1.5F, 0.0F, 22.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 127, 4, -1.0F, 0.0F, 22.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 127, 0, -1.5F, 0.0F, 23.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 127, 10, -1.0F, 0.0F, 23.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 127, 12, -1.0F, 0.0F, 25.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 126, 96, -1.5F, 0.0F, 27.0F, 1, 1, 1, -0.25F, false));
		slide70_r1.cubeList.add(new ModelBox(slide70_r1, 127, 26, -1.0F, 0.0F, 27.0F, 1, 1, 1, -0.25F, false));

		slide57_r1 = new ModelRenderer(this);
		slide57_r1.setRotationPoint(0.4F, -38.1F, -34.75F);
		G19razorbackslide.addChild(slide57_r1);
		setRotationAngle(slide57_r1, 0.0F, 0.0F, 0.6545F);
		slide57_r1.cubeList.add(new ModelBox(slide57_r1, 126, 85, 0.0F, -0.001F, 13.0F, 1, 1, 1, 0.0F, false));
		slide57_r1.cubeList.add(new ModelBox(slide57_r1, 31, 97, 0.0F, -0.001F, 13.5F, 1, 1, 2, 0.0F, false));
		slide57_r1.cubeList.add(new ModelBox(slide57_r1, 5, 98, 0.0F, -0.001F, 18.25F, 1, 1, 2, 0.0F, false));
		slide57_r1.cubeList.add(new ModelBox(slide57_r1, 150, 116, 0.0F, 0.0F, 19.75F, 1, 1, 8, 0.0F, false));
		slide57_r1.cubeList.add(new ModelBox(slide57_r1, 127, 28, 0.0F, -0.001F, 35.0F, 1, 1, 1, 0.0F, false));
		slide57_r1.cubeList.add(new ModelBox(slide57_r1, 130, 5, 0.0F, 0.0F, 35.75F, 1, 1, 1, 0.0F, false));

		slide58_r1 = new ModelRenderer(this);
		slide58_r1.setRotationPoint(0.31F, -38.1F, -28.5F);
		G19razorbackslide.addChild(slide58_r1);
		setRotationAngle(slide58_r1, 0.0F, 0.0F, 0.6545F);
		slide58_r1.cubeList.add(new ModelBox(slide58_r1, 64, 0, 0.0F, -0.001F, 0.0F, 1, 1, 29, 0.0F, false));

		slide57_r2 = new ModelRenderer(this);
		slide57_r2.setRotationPoint(-2.3F, -38.1F, -28.5F);
		G19razorbackslide.addChild(slide57_r2);
		setRotationAngle(slide57_r2, 0.0F, 0.0F, -0.6545F);
		slide57_r2.cubeList.add(new ModelBox(slide57_r2, 21, 119, -1.0F, -0.001F, 0.0F, 1, 1, 13, 0.0F, false));
		slide57_r2.cubeList.add(new ModelBox(slide57_r2, 136, 90, -1.0F, -0.001F, 21.0F, 1, 1, 8, 0.0F, false));

		slide57_r3 = new ModelRenderer(this);
		slide57_r3.setRotationPoint(-2.4F, -38.1F, -8.0F);
		G19razorbackslide.addChild(slide57_r3);
		setRotationAngle(slide57_r3, 0.0F, 0.0F, -0.6545F);
		slide57_r3.cubeList.add(new ModelBox(slide57_r3, 59, 129, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		slide57_r3.cubeList.add(new ModelBox(slide57_r3, 110, 128, -1.0F, -0.001F, -8.5F, 1, 1, 1, 0.0F, false));
		slide57_r3.cubeList.add(new ModelBox(slide57_r3, 95, 11, -1.0F, -0.001F, -2.5F, 1, 1, 3, 0.0F, false));
		slide57_r3.cubeList.add(new ModelBox(slide57_r3, 63, 129, -1.0F, -0.001F, 8.25F, 1, 1, 1, 0.0F, false));
		slide57_r3.cubeList.add(new ModelBox(slide57_r3, 130, 3, -1.0F, 0.0F, 9.0F, 1, 1, 1, 0.0F, false));

		slide16_r1 = new ModelRenderer(this);
		slide16_r1.setRotationPoint(-0.9F, -38.2F, -20.5F);
		G19razorbackslide.addChild(slide16_r1);
		setRotationAngle(slide16_r1, 0.0F, 0.8378F, 0.0F);
		slide16_r1.cubeList.add(new ModelBox(slide16_r1, 123, 102, 0.0F, -0.001F, 0.0F, 1, 1, 1, -0.1F, false));

		slide15_r1 = new ModelRenderer(this);
		slide15_r1.setRotationPoint(-1.1F, -38.2F, -20.5F);
		G19razorbackslide.addChild(slide15_r1);
		setRotationAngle(slide15_r1, 0.0F, -0.8378F, 0.0F);
		slide15_r1.cubeList.add(new ModelBox(slide15_r1, 123, 105, -1.0F, -0.001F, 0.0F, 1, 1, 1, -0.1F, false));

		slide19_r4 = new ModelRenderer(this);
		slide19_r4.setRotationPoint(-3.2F, -36.201F, -10.5F);
		G19razorbackslide.addChild(slide19_r4);
		setRotationAngle(slide19_r4, -1.2915F, 0.0F, 0.0F);
		slide19_r4.cubeList.add(new ModelBox(slide19_r4, 129, 108, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		slide23_r3 = new ModelRenderer(this);
		slide23_r3.setRotationPoint(-0.5F, -36.501F, 0.55F);
		G19razorbackslide.addChild(slide23_r3);
		setRotationAngle(slide23_r3, -0.7854F, 0.0F, 0.0F);
		slide23_r3.cubeList.add(new ModelBox(slide23_r3, 106, 17, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide22_r4 = new ModelRenderer(this);
		slide22_r4.setRotationPoint(-0.5F, -36.301F, 0.55F);
		G19razorbackslide.addChild(slide22_r4);
		setRotationAngle(slide22_r4, -0.7854F, 0.0F, 0.0F);
		slide22_r4.cubeList.add(new ModelBox(slide22_r4, 106, 96, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide21_r6 = new ModelRenderer(this);
		slide21_r6.setRotationPoint(-0.5F, -35.901F, 0.55F);
		G19razorbackslide.addChild(slide21_r6);
		setRotationAngle(slide21_r6, -0.7854F, 0.0F, 0.0F);
		slide21_r6.cubeList.add(new ModelBox(slide21_r6, 106, 98, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide21_r7 = new ModelRenderer(this);
		slide21_r7.setRotationPoint(-0.5F, -36.101F, 0.55F);
		G19razorbackslide.addChild(slide21_r7);
		setRotationAngle(slide21_r7, -0.7854F, 0.0F, 0.0F);
		slide21_r7.cubeList.add(new ModelBox(slide21_r7, 106, 100, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide20_r6 = new ModelRenderer(this);
		slide20_r6.setRotationPoint(-0.5F, -35.701F, 0.55F);
		G19razorbackslide.addChild(slide20_r6);
		setRotationAngle(slide20_r6, -0.7854F, 0.0F, 0.0F);
		slide20_r6.cubeList.add(new ModelBox(slide20_r6, 106, 102, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide19_r5 = new ModelRenderer(this);
		slide19_r5.setRotationPoint(0.201F, -36.501F, -16.5F);
		G19razorbackslide.addChild(slide19_r5);
		setRotationAngle(slide19_r5, 0.3316F, 0.0F, 0.0F);
		slide19_r5.cubeList.add(new ModelBox(slide19_r5, 129, 95, -0.001F, 0.601F, 0.0F, 1, 1, 1, 0.0F, false));
		slide19_r5.cubeList.add(new ModelBox(slide19_r5, 129, 104, -3.401F, 0.601F, 0.0F, 1, 1, 1, 0.0F, false));
		slide19_r5.cubeList.add(new ModelBox(slide19_r5, 129, 100, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		slide19_r5.cubeList.add(new ModelBox(slide19_r5, 129, 106, -3.4F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		slide17_r1 = new ModelRenderer(this);
		slide17_r1.setRotationPoint(1.0F, -38.2F, -2.75F);
		G19razorbackslide.addChild(slide17_r1);
		setRotationAngle(slide17_r1, 0.0F, -1.2043F, 0.0F);
		slide17_r1.cubeList.add(new ModelBox(slide17_r1, 0, 115, -2.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		slide16_r2 = new ModelRenderer(this);
		slide16_r2.setRotationPoint(1.0F, -38.2F, -1.75F);
		G19razorbackslide.addChild(slide16_r2);
		setRotationAngle(slide16_r2, 0.0F, 1.2043F, 0.0F);
		slide16_r2.cubeList.add(new ModelBox(slide16_r2, 6, 115, -2.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

		slide15_r2 = new ModelRenderer(this);
		slide15_r2.setRotationPoint(-3.0F, -38.2F, -1.75F);
		G19razorbackslide.addChild(slide15_r2);
		setRotationAngle(slide15_r2, 0.0F, -1.2043F, 0.0F);
		slide15_r2.cubeList.add(new ModelBox(slide15_r2, 12, 115, 0.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

		slide14_r1 = new ModelRenderer(this);
		slide14_r1.setRotationPoint(-3.0F, -38.2F, -2.75F);
		G19razorbackslide.addChild(slide14_r1);
		setRotationAngle(slide14_r1, 0.0F, 1.2043F, 0.0F);
		slide14_r1.cubeList.add(new ModelBox(slide14_r1, 18, 115, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		slide15_r3 = new ModelRenderer(this);
		slide15_r3.setRotationPoint(0.0F, -38.3F, -2.95F);
		G19razorbackslide.addChild(slide15_r3);
		setRotationAngle(slide15_r3, 0.0F, -0.5411F, 0.0F);
		slide15_r3.cubeList.add(new ModelBox(slide15_r3, 127, 34, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		slide14_r2 = new ModelRenderer(this);
		slide14_r2.setRotationPoint(-2.0F, -38.3F, -2.95F);
		G19razorbackslide.addChild(slide14_r2);
		setRotationAngle(slide14_r2, 0.0F, 0.5411F, 0.0F);
		slide14_r2.cubeList.add(new ModelBox(slide14_r2, 127, 36, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		slide34_r1 = new ModelRenderer(this);
		slide34_r1.setRotationPoint(1.45F, -34.95F, -3.1F);
		G19razorbackslide.addChild(slide34_r1);
		setRotationAngle(slide34_r1, 0.384F, 0.0F, 0.0F);
		slide34_r1.cubeList.add(new ModelBox(slide34_r1, 116, 95, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide34_r1.cubeList.add(new ModelBox(slide34_r1, 66, 122, -4.9F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide34_r1.cubeList.add(new ModelBox(slide34_r1, 120, 26, -1.001F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));
		slide34_r1.cubeList.add(new ModelBox(slide34_r1, 121, 4, -4.901F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));

		slide34_r2 = new ModelRenderer(this);
		slide34_r2.setRotationPoint(1.45F, -34.95F, -7.1F);
		G19razorbackslide.addChild(slide34_r2);
		setRotationAngle(slide34_r2, 0.384F, 0.0F, 0.0F);
		slide34_r2.cubeList.add(new ModelBox(slide34_r2, 59, 119, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide34_r2.cubeList.add(new ModelBox(slide34_r2, 3, 122, -4.9F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));

		slide34_r3 = new ModelRenderer(this);
		slide34_r3.setRotationPoint(1.45F, -35.95F, -11.1F);
		G19razorbackslide.addChild(slide34_r3);
		setRotationAngle(slide34_r3, -0.384F, 0.0F, 0.0F);
		slide34_r3.cubeList.add(new ModelBox(slide34_r3, 0, 62, -1.0F, -2.0F, 0.0F, 1, 3, 1, -0.25F, false));

		slide33_r1 = new ModelRenderer(this);
		slide33_r1.setRotationPoint(1.45F, -34.95F, -6.1F);
		G19razorbackslide.addChild(slide33_r1);
		setRotationAngle(slide33_r1, 0.384F, 0.0F, 0.0F);
		slide33_r1.cubeList.add(new ModelBox(slide33_r1, 55, 119, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide33_r1.cubeList.add(new ModelBox(slide33_r1, 78, 123, -4.9F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide33_r1.cubeList.add(new ModelBox(slide33_r1, 66, 119, -1.001F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));
		slide33_r1.cubeList.add(new ModelBox(slide33_r1, 120, 103, -4.901F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));

		slide32_r1 = new ModelRenderer(this);
		slide32_r1.setRotationPoint(1.45F, -34.95F, -27.1F);
		G19razorbackslide.addChild(slide32_r1);
		setRotationAngle(slide32_r1, 0.384F, 0.0F, 0.0F);
		slide32_r1.cubeList.add(new ModelBox(slide32_r1, 0, 78, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide32_r1.cubeList.add(new ModelBox(slide32_r1, 82, 123, -4.9F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide32_r1.cubeList.add(new ModelBox(slide32_r1, 32, 77, -1.001F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));
		slide32_r1.cubeList.add(new ModelBox(slide32_r1, 120, 76, -4.901F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));

		slide33_r2 = new ModelRenderer(this);
		slide33_r2.setRotationPoint(1.45F, -34.95F, -2.1F);
		G19razorbackslide.addChild(slide33_r2);
		setRotationAngle(slide33_r2, 0.384F, 0.0F, 0.0F);
		slide33_r2.cubeList.add(new ModelBox(slide33_r2, 116, 76, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide33_r2.cubeList.add(new ModelBox(slide33_r2, 59, 122, -4.9F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide33_r2.cubeList.add(new ModelBox(slide33_r2, 120, 32, -1.001F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));
		slide33_r2.cubeList.add(new ModelBox(slide33_r2, 121, 12, -4.901F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));

		slide32_r2 = new ModelRenderer(this);
		slide32_r2.setRotationPoint(1.45F, -34.95F, -5.1F);
		G19razorbackslide.addChild(slide32_r2);
		setRotationAngle(slide32_r2, 0.384F, 0.0F, 0.0F);
		slide32_r2.cubeList.add(new ModelBox(slide32_r2, 48, 119, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide32_r2.cubeList.add(new ModelBox(slide32_r2, 21, 123, -4.9F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide32_r2.cubeList.add(new ModelBox(slide32_r2, 70, 119, -1.001F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));
		slide32_r2.cubeList.add(new ModelBox(slide32_r2, 120, 106, -4.901F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));

		slide31_r1 = new ModelRenderer(this);
		slide31_r1.setRotationPoint(1.45F, -34.95F, -26.1F);
		G19razorbackslide.addChild(slide31_r1);
		setRotationAngle(slide31_r1, 0.384F, 0.0F, 0.0F);
		slide31_r1.cubeList.add(new ModelBox(slide31_r1, 73, 9, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide31_r1.cubeList.add(new ModelBox(slide31_r1, 89, 123, -4.9F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide31_r1.cubeList.add(new ModelBox(slide31_r1, 73, 23, -1.001F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));
		slide31_r1.cubeList.add(new ModelBox(slide31_r1, 120, 90, -4.901F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));

		slide42_r1 = new ModelRenderer(this);
		slide42_r1.setRotationPoint(1.45F, -34.95F, -25.1F);
		G19razorbackslide.addChild(slide42_r1);
		setRotationAngle(slide42_r1, 0.384F, 0.0F, 0.0F);
		slide42_r1.cubeList.add(new ModelBox(slide42_r1, 71, 52, -1.001F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));
		slide42_r1.cubeList.add(new ModelBox(slide42_r1, 120, 93, -4.901F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));
		slide42_r1.cubeList.add(new ModelBox(slide42_r1, 41, 72, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide42_r1.cubeList.add(new ModelBox(slide42_r1, 93, 123, -4.9F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));

		slide41_r1 = new ModelRenderer(this);
		slide41_r1.setRotationPoint(1.45F, -34.95F, -21.1F);
		G19razorbackslide.addChild(slide41_r1);
		setRotationAngle(slide41_r1, 0.384F, 0.0F, 0.0F);
		slide41_r1.cubeList.add(new ModelBox(slide41_r1, 97, 37, -1.001F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));
		slide41_r1.cubeList.add(new ModelBox(slide41_r1, 120, 100, -4.901F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));

		slide38_r1 = new ModelRenderer(this);
		slide38_r1.setRotationPoint(1.45F, -34.95F, -4.1F);
		G19razorbackslide.addChild(slide38_r1);
		setRotationAngle(slide38_r1, 0.384F, 0.0F, 0.0F);
		slide38_r1.cubeList.add(new ModelBox(slide38_r1, 119, 119, -1.001F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));
		slide38_r1.cubeList.add(new ModelBox(slide38_r1, 105, 121, -4.901F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));
		slide38_r1.cubeList.add(new ModelBox(slide38_r1, 44, 119, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide38_r1.cubeList.add(new ModelBox(slide38_r1, 70, 122, -4.9F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));

		slide35_r1 = new ModelRenderer(this);
		slide35_r1.setRotationPoint(1.45F, -34.95F, -1.1F);
		G19razorbackslide.addChild(slide35_r1);
		setRotationAngle(slide35_r1, 0.384F, 0.0F, 0.0F);
		slide35_r1.cubeList.add(new ModelBox(slide35_r1, 120, 43, -1.001F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));
		slide35_r1.cubeList.add(new ModelBox(slide35_r1, 121, 22, -4.901F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));
		slide35_r1.cubeList.add(new ModelBox(slide35_r1, 120, 46, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide35_r1.cubeList.add(new ModelBox(slide35_r1, 55, 122, -4.9F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));

		slide35_r2 = new ModelRenderer(this);
		slide35_r2.setRotationPoint(1.45F, -34.95F, 0.9F);
		G19razorbackslide.addChild(slide35_r2);
		setRotationAngle(slide35_r2, 0.384F, 0.0F, 0.0F);
		slide35_r2.cubeList.add(new ModelBox(slide35_r2, 32, 63, -1.001F, -2.75F, 0.0F, 1, 3, 1, -0.25F, false));
		slide35_r2.cubeList.add(new ModelBox(slide35_r2, 64, 0, -4.901F, -2.75F, 0.0F, 1, 3, 1, -0.25F, false));

		slide34_r4 = new ModelRenderer(this);
		slide34_r4.setRotationPoint(1.45F, -34.95F, -0.1F);
		G19razorbackslide.addChild(slide34_r4);
		setRotationAngle(slide34_r4, 0.384F, 0.0F, 0.0F);
		slide34_r4.cubeList.add(new ModelBox(slide34_r4, 120, 68, -1.001F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));
		slide34_r4.cubeList.add(new ModelBox(slide34_r4, 121, 35, -4.901F, -2.75F, 0.0F, 1, 2, 1, -0.25F, false));
		slide34_r4.cubeList.add(new ModelBox(slide34_r4, 120, 65, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide34_r4.cubeList.add(new ModelBox(slide34_r4, 48, 122, -4.9F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));

		slide29_r1 = new ModelRenderer(this);
		slide29_r1.setRotationPoint(1.45F, -34.95F, -21.1F);
		G19razorbackslide.addChild(slide29_r1);
		setRotationAngle(slide29_r1, 0.384F, 0.0F, 0.0F);
		slide29_r1.cubeList.add(new ModelBox(slide29_r1, 96, 91, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));
		slide29_r1.cubeList.add(new ModelBox(slide29_r1, 123, 108, -4.9F, -2.0F, 0.0F, 1, 2, 1, -0.25F, false));

		slide29_r2 = new ModelRenderer(this);
		slide29_r2.setRotationPoint(1.099F, -34.75F, -16.1F);
		G19razorbackslide.addChild(slide29_r2);
		setRotationAngle(slide29_r2, 0.384F, 0.0F, 0.0F);
		slide29_r2.cubeList.add(new ModelBox(slide29_r2, 41, 67, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));
		slide29_r2.cubeList.add(new ModelBox(slide29_r2, 9, 71, -4.2F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		slide30_r1 = new ModelRenderer(this);
		slide30_r1.setRotationPoint(-2.101F, -34.35F, -24.7F);
		G19razorbackslide.addChild(slide30_r1);
		setRotationAngle(slide30_r1, 0.384F, 0.0F, 0.0F);
		slide30_r1.cubeList.add(new ModelBox(slide30_r1, 25, 25, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));
		slide30_r1.cubeList.add(new ModelBox(slide30_r1, 8, 37, 2.2F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		slide28_r1 = new ModelRenderer(this);
		slide28_r1.setRotationPoint(1.099F, -34.75F, -21.2F);
		G19razorbackslide.addChild(slide28_r1);
		setRotationAngle(slide28_r1, 0.384F, 0.0F, 0.0F);
		slide28_r1.cubeList.add(new ModelBox(slide28_r1, 9, 53, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));
		slide28_r1.cubeList.add(new ModelBox(slide28_r1, 25, 124, -4.2F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		G19rockslide = new ModelRenderer(this);
		G19rockslide.setRotationPoint(0.0F, 24.0F, 0.0F);
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 86, 98, -2.5F, -37.5F, 0.9F, 3, 2, 1, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 16, 16, -2.3F, -37.5F, -28.499F, 2, 5, 1, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 40, 16, -0.7F, -37.5F, -28.501F, 1, 5, 1, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 15, 47, 0.1F, -37.0F, -4.5F, 1, 3, 6, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 15, 31, -3.1F, -37.0F, -4.5F, 1, 3, 6, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 102, 125, 0.101F, -37.5F, -4.5F, 1, 1, 6, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 36, 119, -3.099F, -37.5F, -4.5F, 1, 1, 6, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 0, 137, -2.4F, -38.1F, -10.5F, 2, 1, 12, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 116, 22, -0.6F, -38.101F, -18.5F, 1, 1, 20, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 81, 84, -0.6F, -38.101F, -28.5F, 1, 1, 2, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 6, 78, -0.6F, -38.1F, -27.0F, 1, 1, 2, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 110, 38, -0.6F, -38.101F, -21.0F, 1, 1, 1, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 4, 110, -2.45F, -38.1F, -21.0F, 1, 1, 1, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 33, 103, -2.45F, -38.1F, -23.5F, 1, 1, 1, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 110, 32, -0.6F, -38.101F, -23.5F, 1, 1, 1, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 116, 90, -1.5F, -38.099F, -26.5F, 1, 1, 8, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 47, 77, 0.2F, -37.501F, -10.5F, 1, 2, 6, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 119, 109, -3.2F, -37.501F, 1.001F, 1, 1, 1, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 118, 19, 0.199F, -37.501F, 1.001F, 1, 1, 1, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 90, 48, -3.2F, -37.501F, -7.5F, 1, 2, 3, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 90, 30, 0.201F, -36.001F, -28.5F, 1, 2, 24, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 32, 46, -3.199F, -36.001F, -28.5F, 1, 2, 13, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 64, 14, -3.2F, -36.25F, -28.5F, 1, 1, 13, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 116, 81, 0.2F, -36.25F, -28.5F, 1, 1, 18, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 49, 37, -3.199F, -37.001F, 1.0F, 1, 3, 1, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 64, 115, -3.099F, -35.901F, 0.9F, 1, 1, 1, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 110, 78, -1.5F, -35.901F, 0.9F, 1, 1, 1, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 110, 68, 0.101F, -35.901F, 0.9F, 1, 1, 1, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 49, 32, 0.2F, -37.001F, 1.0F, 1, 3, 1, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 0, 93, -3.199F, -36.001F, -15.5F, 1, 2, 11, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 39, 94, -3.2F, -36.201F, -10.5F, 1, 1, 3, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 110, 66, -0.6F, -38.1F, 1.001F, 1, 1, 1, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 37, 114, -2.4F, -38.099F, 1.001F, 2, 1, 1, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 76, 98, -2.4F, -38.1F, -28.5F, 2, 1, 2, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 52, 85, -2.4F, -38.101F, -27.0F, 2, 1, 2, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 78, 63, -2.4F, -38.1F, -18.5F, 2, 1, 3, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 110, 60, -3.0F, -37.0F, -10.499F, 1, 1, 1, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 23, 88, -2.9F, -37.0F, -9.5F, 1, 1, 2, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 49, 43, -3.0F, -38.2F, -2.75F, 4, 1, 1, 0.0F, false));
		G19rockslide.cubeList.add(new ModelBox(G19rockslide, 95, 22, -2.5F, -38.201F, -4.75F, 3, 1, 5, 0.0F, false));

		slide16_r3 = new ModelRenderer(this);
		slide16_r3.setRotationPoint(-2.0F, -38.3F, -2.95F);
		G19rockslide.addChild(slide16_r3);
		setRotationAngle(slide16_r3, 0.0F, 0.5411F, 0.0F);
		slide16_r3.cubeList.add(new ModelBox(slide16_r3, 58, 27, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		slide17_r2 = new ModelRenderer(this);
		slide17_r2.setRotationPoint(-3.0F, -38.2F, -1.75F);
		G19rockslide.addChild(slide17_r2);
		setRotationAngle(slide17_r2, 0.0F, -1.2043F, 0.0F);
		slide17_r2.cubeList.add(new ModelBox(slide17_r2, 15, 35, 0.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

		slide16_r4 = new ModelRenderer(this);
		slide16_r4.setRotationPoint(-3.0F, -38.2F, -2.75F);
		G19rockslide.addChild(slide16_r4);
		setRotationAngle(slide16_r4, 0.0F, 1.2043F, 0.0F);
		slide16_r4.cubeList.add(new ModelBox(slide16_r4, 39, 35, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		slide17_r3 = new ModelRenderer(this);
		slide17_r3.setRotationPoint(0.0F, -38.3F, -2.95F);
		G19rockslide.addChild(slide17_r3);
		setRotationAngle(slide17_r3, 0.0F, -0.5411F, 0.0F);
		slide17_r3.cubeList.add(new ModelBox(slide17_r3, 58, 42, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		slide18_r2 = new ModelRenderer(this);
		slide18_r2.setRotationPoint(1.0F, -38.2F, -1.75F);
		G19rockslide.addChild(slide18_r2);
		setRotationAngle(slide18_r2, 0.0F, 1.2043F, 0.0F);
		slide18_r2.cubeList.add(new ModelBox(slide18_r2, 55, 51, -2.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

		slide19_r6 = new ModelRenderer(this);
		slide19_r6.setRotationPoint(1.0F, -38.2F, -2.75F);
		G19rockslide.addChild(slide19_r6);
		setRotationAngle(slide19_r6, 0.0F, -1.2043F, 0.0F);
		slide19_r6.cubeList.add(new ModelBox(slide19_r6, 82, 53, -2.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		slide57_r4 = new ModelRenderer(this);
		slide57_r4.setRotationPoint(-2.4F, -38.1F, -28.5F);
		G19rockslide.addChild(slide57_r4);
		setRotationAngle(slide57_r4, 0.0F, 0.0F, -0.6545F);
		slide57_r4.cubeList.add(new ModelBox(slide57_r4, 142, 90, -1.0F, 0.0F, 18.0F, 1, 1, 12, 0.0F, false));
		slide57_r4.cubeList.add(new ModelBox(slide57_r4, 110, 62, -1.0F, 0.0F, 29.5F, 1, 1, 1, 0.0F, false));

		slide55_r2 = new ModelRenderer(this);
		slide55_r2.setRotationPoint(0.4F, -38.1F, -28.5F);
		G19rockslide.addChild(slide55_r2);
		setRotationAngle(slide55_r2, 0.0F, 0.0F, 0.6545F);
		slide55_r2.cubeList.add(new ModelBox(slide55_r2, 142, 103, 0.0F, 0.0F, 18.0F, 1, 1, 12, 0.0F, false));
		slide55_r2.cubeList.add(new ModelBox(slide55_r2, 110, 64, 0.0F, 0.0F, 29.5F, 1, 1, 1, 0.0F, false));

		slide25_r1 = new ModelRenderer(this);
		slide25_r1.setRotationPoint(-2.7F, -37.5F, -4.75F);
		G19rockslide.addChild(slide25_r1);
		setRotationAngle(slide25_r1, 0.192F, 0.0F, 0.0F);
		slide25_r1.cubeList.add(new ModelBox(slide25_r1, 116, 48, -0.748F, -0.25F, -0.75F, 1, 4, 1, -0.25F, false));
		slide25_r1.cubeList.add(new ModelBox(slide25_r1, 116, 65, 3.149F, -0.25F, -0.75F, 1, 4, 1, -0.25F, false));

		slide24_r1 = new ModelRenderer(this);
		slide24_r1.setRotationPoint(-2.7F, -37.5F, -4.5F);
		G19rockslide.addChild(slide24_r1);
		setRotationAngle(slide24_r1, 0.192F, 0.0F, 0.0F);
		slide24_r1.cubeList.add(new ModelBox(slide24_r1, 116, 56, -0.751F, -0.25F, -0.75F, 1, 4, 1, -0.25F, false));
		slide24_r1.cubeList.add(new ModelBox(slide24_r1, 116, 90, 3.151F, -0.25F, -0.75F, 1, 4, 1, -0.25F, false));

		slide27_r1 = new ModelRenderer(this);
		slide27_r1.setRotationPoint(-2.7F, -37.5F, -2.5F);
		G19rockslide.addChild(slide27_r1);
		setRotationAngle(slide27_r1, 0.192F, 0.0F, 0.0F);
		slide27_r1.cubeList.add(new ModelBox(slide27_r1, 110, 43, -0.749F, -0.25F, -0.75F, 1, 4, 1, -0.25F, false));
		slide27_r1.cubeList.add(new ModelBox(slide27_r1, 115, 81, 3.151F, -0.25F, -0.75F, 1, 4, 1, -0.25F, false));

		slide29_r3 = new ModelRenderer(this);
		slide29_r3.setRotationPoint(-2.7F, -37.5F, 1.0F);
		G19rockslide.addChild(slide29_r3);
		setRotationAngle(slide29_r3, 0.192F, 0.0F, 0.0F);
		slide29_r3.cubeList.add(new ModelBox(slide29_r3, 84, 111, -0.75F, -0.25F, -0.75F, 1, 4, 1, -0.25F, false));
		slide29_r3.cubeList.add(new ModelBox(slide29_r3, 46, 112, 3.151F, -0.25F, -0.75F, 1, 4, 1, -0.25F, false));

		slide28_r2 = new ModelRenderer(this);
		slide28_r2.setRotationPoint(-2.7F, -37.5F, 0.5F);
		G19rockslide.addChild(slide28_r2);
		setRotationAngle(slide28_r2, 0.192F, 0.0F, 0.0F);
		slide28_r2.cubeList.add(new ModelBox(slide28_r2, 80, 111, -0.749F, -0.25F, -0.75F, 1, 4, 1, -0.25F, false));
		slide28_r2.cubeList.add(new ModelBox(slide28_r2, 68, 112, 3.151F, -0.25F, -0.75F, 1, 4, 1, -0.25F, false));

		slide27_r2 = new ModelRenderer(this);
		slide27_r2.setRotationPoint(-2.7F, -37.5F, -0.5F);
		G19rockslide.addChild(slide27_r2);
		setRotationAngle(slide27_r2, 0.192F, 0.0F, 0.0F);
		slide27_r2.cubeList.add(new ModelBox(slide27_r2, 76, 111, -0.749F, -0.25F, -0.75F, 1, 4, 1, -0.25F, false));
		slide27_r2.cubeList.add(new ModelBox(slide27_r2, 113, 22, 3.151F, -0.25F, -0.75F, 1, 4, 1, -0.25F, false));

		slide26_r1 = new ModelRenderer(this);
		slide26_r1.setRotationPoint(-2.7F, -37.5F, -1.5F);
		G19rockslide.addChild(slide26_r1);
		setRotationAngle(slide26_r1, 0.192F, 0.0F, 0.0F);
		slide26_r1.cubeList.add(new ModelBox(slide26_r1, 110, 48, -0.749F, -0.25F, -0.75F, 1, 4, 1, -0.25F, false));
		slide26_r1.cubeList.add(new ModelBox(slide26_r1, 116, 32, 3.151F, -0.25F, -0.75F, 1, 4, 1, -0.25F, false));

		slide25_r2 = new ModelRenderer(this);
		slide25_r2.setRotationPoint(-2.7F, -37.5F, -3.5F);
		G19rockslide.addChild(slide25_r2);
		setRotationAngle(slide25_r2, 0.192F, 0.0F, 0.0F);
		slide25_r2.cubeList.add(new ModelBox(slide25_r2, 41, 109, -0.749F, -0.25F, -0.75F, 1, 4, 1, -0.25F, false));
		slide25_r2.cubeList.add(new ModelBox(slide25_r2, 116, 43, 3.151F, -0.25F, -0.75F, 1, 4, 1, -0.25F, false));

		slide24_r2 = new ModelRenderer(this);
		slide24_r2.setRotationPoint(-0.5F, -36.501F, 0.55F);
		G19rockslide.addChild(slide24_r2);
		setRotationAngle(slide24_r2, -0.7854F, 0.0F, 0.0F);
		slide24_r2.cubeList.add(new ModelBox(slide24_r2, 104, 105, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide23_r4 = new ModelRenderer(this);
		slide23_r4.setRotationPoint(-0.5F, -36.301F, 0.55F);
		G19rockslide.addChild(slide23_r4);
		setRotationAngle(slide23_r4, -0.7854F, 0.0F, 0.0F);
		slide23_r4.cubeList.add(new ModelBox(slide23_r4, 0, 106, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide22_r5 = new ModelRenderer(this);
		slide22_r5.setRotationPoint(-0.5F, -35.901F, 0.55F);
		G19rockslide.addChild(slide22_r5);
		setRotationAngle(slide22_r5, -0.7854F, 0.0F, 0.0F);
		slide22_r5.cubeList.add(new ModelBox(slide22_r5, 14, 106, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide22_r6 = new ModelRenderer(this);
		slide22_r6.setRotationPoint(-0.5F, -36.101F, 0.55F);
		G19rockslide.addChild(slide22_r6);
		setRotationAngle(slide22_r6, -0.7854F, 0.0F, 0.0F);
		slide22_r6.cubeList.add(new ModelBox(slide22_r6, 106, 0, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide21_r8 = new ModelRenderer(this);
		slide21_r8.setRotationPoint(-0.5F, -35.701F, 0.55F);
		G19rockslide.addChild(slide21_r8);
		setRotationAngle(slide21_r8, -0.7854F, 0.0F, 0.0F);
		slide21_r8.cubeList.add(new ModelBox(slide21_r8, 106, 2, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide25_r3 = new ModelRenderer(this);
		slide25_r3.setRotationPoint(1.201F, -36.25F, -38.5F);
		G19rockslide.addChild(slide25_r3);
		setRotationAngle(slide25_r3, 0.0F, 0.0F, 1.1694F);
		slide25_r3.cubeList.add(new ModelBox(slide25_r3, 37, 86, -2.001F, -0.001F, 10.001F, 2, 1, 2, 0.0F, false));
		slide25_r3.cubeList.add(new ModelBox(slide25_r3, 90, 38, -2.001F, 0.0F, 11.5F, 2, 1, 2, 0.0F, false));
		slide25_r3.cubeList.add(new ModelBox(slide25_r3, 100, 111, -2.001F, 0.0F, 15.0F, 2, 1, 1, 0.0F, false));
		slide25_r3.cubeList.add(new ModelBox(slide25_r3, 26, 114, -2.001F, 0.0F, 17.5F, 2, 1, 1, 0.0F, false));
		slide25_r3.cubeList.add(new ModelBox(slide25_r3, 114, 81, -2.001F, 0.0F, 20.0F, 2, 1, 8, 0.0F, false));

		slide24_r3 = new ModelRenderer(this);
		slide24_r3.setRotationPoint(-3.199F, -36.25F, -38.5F);
		G19rockslide.addChild(slide24_r3);
		setRotationAngle(slide24_r3, 0.0F, 0.0F, -1.1694F);
		slide24_r3.cubeList.add(new ModelBox(slide24_r3, 5, 87, -0.001F, -0.001F, 10.001F, 2, 1, 2, 0.0F, false));
		slide24_r3.cubeList.add(new ModelBox(slide24_r3, 90, 59, -0.001F, 0.0F, 11.5F, 2, 1, 2, 0.0F, false));
		slide24_r3.cubeList.add(new ModelBox(slide24_r3, 106, 111, -0.001F, 0.0F, 15.0F, 2, 1, 1, 0.0F, false));
		slide24_r3.cubeList.add(new ModelBox(slide24_r3, 14, 112, -0.001F, 0.0F, 17.5F, 2, 1, 1, 0.0F, false));
		slide24_r3.cubeList.add(new ModelBox(slide24_r3, 47, 72, -0.001F, 0.0F, 20.0F, 2, 1, 3, 0.0F, false));

		slide17_r4 = new ModelRenderer(this);
		slide17_r4.setRotationPoint(1.2F, -37.501F, -10.5F);
		G19rockslide.addChild(slide17_r4);
		setRotationAngle(slide17_r4, -1.309F, -0.2094F, 0.6632F);
		slide17_r4.cubeList.add(new ModelBox(slide17_r4, 0, 15, -1.001F, 0.0F, 0.0F, 1, 4, 2, 0.0F, false));

		slide16_r5 = new ModelRenderer(this);
		slide16_r5.setRotationPoint(1.2F, -37.501F, -10.5F);
		G19rockslide.addChild(slide16_r5);
		setRotationAngle(slide16_r5, -1.2392F, 0.0F, 0.0F);
		slide16_r5.cubeList.add(new ModelBox(slide16_r5, 8, 15, -1.001F, 0.0F, 0.0F, 1, 4, 2, 0.0F, false));

		slide19_r7 = new ModelRenderer(this);
		slide19_r7.setRotationPoint(0.4F, -38.1F, -23.5F);
		G19rockslide.addChild(slide19_r7);
		setRotationAngle(slide19_r7, 0.0F, 0.9076F, 0.0F);
		slide19_r7.cubeList.add(new ModelBox(slide19_r7, 70, 0, -1.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));

		slide18_r3 = new ModelRenderer(this);
		slide18_r3.setRotationPoint(0.4F, -38.1F, -21.0F);
		G19rockslide.addChild(slide18_r3);
		setRotationAngle(slide18_r3, 0.0F, 0.9076F, 0.0F);
		slide18_r3.cubeList.add(new ModelBox(slide18_r3, 70, 14, -1.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));

		slide20_r7 = new ModelRenderer(this);
		slide20_r7.setRotationPoint(-2.4F, -38.1F, -23.5F);
		G19rockslide.addChild(slide20_r7);
		setRotationAngle(slide20_r7, 0.0F, -0.9076F, 0.0F);
		slide20_r7.cubeList.add(new ModelBox(slide20_r7, 55, 37, 0.0F, -0.001F, -2.0F, 1, 1, 2, 0.0F, false));

		slide19_r8 = new ModelRenderer(this);
		slide19_r8.setRotationPoint(-2.4F, -38.1F, -21.0F);
		G19rockslide.addChild(slide19_r8);
		setRotationAngle(slide19_r8, 0.0F, -0.9076F, 0.0F);
		slide19_r8.cubeList.add(new ModelBox(slide19_r8, 6, 62, 0.0F, -0.001F, -2.0F, 1, 1, 2, 0.0F, false));

		slide18_r4 = new ModelRenderer(this);
		slide18_r4.setRotationPoint(-2.4F, -38.1F, -18.5F);
		G19rockslide.addChild(slide18_r4);
		setRotationAngle(slide18_r4, 0.0F, -0.9076F, 0.0F);
		slide18_r4.cubeList.add(new ModelBox(slide18_r4, 38, 63, 0.0F, -0.001F, -2.0F, 1, 1, 2, 0.0F, false));

		slide17_r5 = new ModelRenderer(this);
		slide17_r5.setRotationPoint(0.4F, -38.1F, -18.5F);
		G19rockslide.addChild(slide17_r5);
		setRotationAngle(slide17_r5, 0.0F, 0.9076F, 0.0F);
		slide17_r5.cubeList.add(new ModelBox(slide17_r5, 38, 77, -1.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));

		G19ghostprecisionslide = new ModelRenderer(this);
		G19ghostprecisionslide.setRotationPoint(0.0F, 24.0F, 0.0F);
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 20, 85, -2.5F, -37.5F, 0.9F, 3, 2, 1, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 8, 0, -2.3F, -37.5F, -28.499F, 2, 5, 1, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 23, 31, -0.7F, -37.5F, -28.501F, 1, 5, 1, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 16, 0, 0.1F, -37.0F, -4.5F, 1, 3, 6, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 16, 16, -3.1F, -37.0F, -4.5F, 1, 3, 6, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 105, 22, 0.101F, -37.5F, -4.5F, 1, 1, 6, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 79, 14, -3.099F, -37.5F, -4.5F, 1, 1, 6, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 72, 136, -2.4F, -38.1F, -10.5F, 2, 1, 12, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 95, 0, -0.6F, -38.101F, -19.5F, 1, 1, 21, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 6, 47, -0.6F, -38.101F, -28.5F, 1, 1, 2, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 58, 81, -0.6F, -38.1F, -27.0F, 1, 1, 1, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 61, 118, 0.2F, -37.501F, -19.5F, 1, 1, 15, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 26, 82, 0.2F, -37.501F, -28.5F, 1, 1, 1, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 9, 82, -3.2F, -37.501F, -28.5F, 1, 1, 1, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 46, 101, -3.2F, -37.501F, 1.001F, 1, 1, 1, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 20, 101, 0.199F, -37.501F, 1.001F, 1, 1, 1, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 90, 43, -3.2F, -37.501F, -7.5F, 1, 2, 3, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 64, 5, -3.2F, -37.501F, -19.5F, 1, 1, 4, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 38, 119, 0.201F, -37.001F, -19.5F, 1, 3, 15, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 32, 46, 0.201F, -37.001F, -28.5F, 1, 3, 1, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 40, 39, -3.199F, -37.001F, -28.5F, 1, 3, 1, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 116, 65, -3.099F, -35.001F, -27.5F, 1, 1, 8, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 116, 56, 0.101F, -35.001F, -27.5F, 1, 1, 8, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 0, 47, -3.199F, -37.001F, -19.5F, 1, 3, 4, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 0, 47, -3.199F, -37.001F, 1.0F, 1, 3, 1, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 7, 101, -3.099F, -35.901F, 0.9F, 1, 1, 1, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 33, 100, -1.5F, -35.901F, 0.9F, 1, 1, 1, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 97, 67, 0.101F, -35.901F, 0.9F, 1, 1, 1, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 40, 46, 0.2F, -37.001F, 1.0F, 1, 3, 1, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 90, 59, -3.199F, -36.001F, -15.5F, 1, 2, 11, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 26, 93, -3.2F, -36.201F, -10.5F, 1, 1, 3, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 96, 59, -0.6F, -38.1F, 1.001F, 1, 1, 1, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 94, 111, -2.4F, -38.099F, 1.001F, 2, 1, 1, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 32, 46, -2.4F, -38.1F, -19.5F, 2, 1, 4, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 82, 59, -2.4F, -38.1F, -28.5F, 2, 1, 2, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 88, 111, -2.4F, -38.101F, -27.0F, 2, 1, 1, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 72, 84, -3.0F, -37.0F, -10.499F, 1, 1, 1, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 38, 51, -2.9F, -37.0F, -9.5F, 1, 1, 2, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 118, 8, -0.35F, -38.351F, -26.25F, 1, 1, 7, -0.25F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 103, 65, -2.6F, -38.35F, -25.75F, 3, 1, 1, -0.25F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 103, 59, -2.6F, -38.35F, -23.75F, 3, 1, 1, -0.25F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 13, 102, -2.6F, -38.35F, -21.75F, 3, 1, 1, -0.25F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 103, 63, -2.6F, -38.35F, -24.75F, 3, 1, 1, -0.25F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 103, 61, -2.6F, -38.35F, -22.75F, 3, 1, 1, -0.25F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 103, 39, -2.6F, -38.35F, -20.75F, 3, 1, 1, -0.25F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 118, 0, -2.65F, -38.351F, -26.25F, 1, 1, 7, -0.25F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 32, 57, -3.0F, -38.2F, -2.75F, 4, 1, 1, 0.0F, false));
		G19ghostprecisionslide.cubeList.add(new ModelBox(G19ghostprecisionslide, 76, 103, -2.5F, -38.201F, -4.75F, 3, 1, 5, 0.0F, false));

		slide18_r5 = new ModelRenderer(this);
		slide18_r5.setRotationPoint(1.0F, -38.2F, -2.75F);
		G19ghostprecisionslide.addChild(slide18_r5);
		setRotationAngle(slide18_r5, 0.0F, -1.2043F, 0.0F);
		slide18_r5.cubeList.add(new ModelBox(slide18_r5, 55, 88, -2.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		slide17_r6 = new ModelRenderer(this);
		slide17_r6.setRotationPoint(1.0F, -38.2F, -1.75F);
		G19ghostprecisionslide.addChild(slide17_r6);
		setRotationAngle(slide17_r6, 0.0F, 1.2043F, 0.0F);
		slide17_r6.cubeList.add(new ModelBox(slide17_r6, 88, 91, -2.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

		slide16_r6 = new ModelRenderer(this);
		slide16_r6.setRotationPoint(0.0F, -38.3F, -2.95F);
		G19ghostprecisionslide.addChild(slide16_r6);
		setRotationAngle(slide16_r6, 0.0F, -0.5411F, 0.0F);
		slide16_r6.cubeList.add(new ModelBox(slide16_r6, 26, 66, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		slide15_r4 = new ModelRenderer(this);
		slide15_r4.setRotationPoint(-2.0F, -38.3F, -2.95F);
		G19ghostprecisionslide.addChild(slide15_r4);
		setRotationAngle(slide15_r4, 0.0F, 0.5411F, 0.0F);
		slide15_r4.cubeList.add(new ModelBox(slide15_r4, 58, 67, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		slide15_r5 = new ModelRenderer(this);
		slide15_r5.setRotationPoint(-3.0F, -38.2F, -2.75F);
		G19ghostprecisionslide.addChild(slide15_r5);
		setRotationAngle(slide15_r5, 0.0F, 1.2043F, 0.0F);
		slide15_r5.cubeList.add(new ModelBox(slide15_r5, 31, 94, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		slide16_r7 = new ModelRenderer(this);
		slide16_r7.setRotationPoint(-3.0F, -38.2F, -1.75F);
		G19ghostprecisionslide.addChild(slide16_r7);
		setRotationAngle(slide16_r7, 0.0F, -1.2043F, 0.0F);
		slide16_r7.cubeList.add(new ModelBox(slide16_r7, 14, 110, 0.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

		slide59_r2 = new ModelRenderer(this);
		slide59_r2.setRotationPoint(-2.4F, -38.1F, -46.5F);
		G19ghostprecisionslide.addChild(slide59_r2);
		setRotationAngle(slide59_r2, 0.0F, 0.0F, -0.6545F);
		slide59_r2.cubeList.add(new ModelBox(slide59_r2, 64, 0, -1.0F, 0.0F, 18.0F, 1, 1, 13, 0.0F, false));
		slide59_r2.cubeList.add(new ModelBox(slide59_r2, 103, 140, -1.0F, 0.0F, 36.0F, 1, 1, 12, 0.0F, false));
		slide59_r2.cubeList.add(new ModelBox(slide59_r2, 58, 85, -1.0F, 0.0F, 47.5F, 1, 1, 1, 0.0F, false));

		slide56_r3 = new ModelRenderer(this);
		slide56_r3.setRotationPoint(0.4F, -38.1F, -28.5F);
		G19ghostprecisionslide.addChild(slide56_r3);
		setRotationAngle(slide56_r3, 0.0F, 0.0F, 0.6545F);
		slide56_r3.cubeList.add(new ModelBox(slide56_r3, 0, 31, 0.0F, 0.0F, 0.0F, 1, 1, 30, 0.0F, false));
		slide56_r3.cubeList.add(new ModelBox(slide56_r3, 88, 59, 0.0F, 0.0F, 29.5F, 1, 1, 1, 0.0F, false));

		slide26_r2 = new ModelRenderer(this);
		slide26_r2.setRotationPoint(-2.7F, -37.4F, -4.1F);
		G19ghostprecisionslide.addChild(slide26_r2);
		setRotationAngle(slide26_r2, -0.192F, 0.0F, 0.0F);
		slide26_r2.cubeList.add(new ModelBox(slide26_r2, 90, 81, -0.751F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));
		slide26_r2.cubeList.add(new ModelBox(slide26_r2, 30, 109, 3.149F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));

		slide28_r3 = new ModelRenderer(this);
		slide28_r3.setRotationPoint(-2.7F, -37.4F, -27.05F);
		G19ghostprecisionslide.addChild(slide28_r3);
		setRotationAngle(slide28_r3, -0.192F, 0.0F, 0.0F);
		slide28_r3.cubeList.add(new ModelBox(slide28_r3, 15, 78, -0.7489F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));
		slide28_r3.cubeList.add(new ModelBox(slide28_r3, 55, 63, 3.1511F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));

		slide27_r3 = new ModelRenderer(this);
		slide27_r3.setRotationPoint(-2.7F, -37.4F, -26.55F);
		G19ghostprecisionslide.addChild(slide27_r3);
		setRotationAngle(slide27_r3, -0.192F, 0.0F, 0.0F);
		slide27_r3.cubeList.add(new ModelBox(slide27_r3, 23, 78, -0.751F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));
		slide27_r3.cubeList.add(new ModelBox(slide27_r3, 79, 7, 3.149F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));

		slide28_r4 = new ModelRenderer(this);
		slide28_r4.setRotationPoint(-2.7F, -37.4F, -1.85F);
		G19ghostprecisionslide.addChild(slide28_r4);
		setRotationAngle(slide28_r4, -0.192F, 0.0F, 0.0F);
		slide28_r4.cubeList.add(new ModelBox(slide28_r4, 95, 30, -0.75F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));
		slide28_r4.cubeList.add(new ModelBox(slide28_r4, 45, 107, 3.15F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));

		slide29_r4 = new ModelRenderer(this);
		slide29_r4.setRotationPoint(-2.7F, -37.4F, 1.65F);
		G19ghostprecisionslide.addChild(slide29_r4);
		setRotationAngle(slide29_r4, -0.192F, 0.0F, 0.0F);
		slide29_r4.cubeList.add(new ModelBox(slide29_r4, 76, 103, -0.749F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));
		slide29_r4.cubeList.add(new ModelBox(slide29_r4, 87, 103, 3.151F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));

		slide30_r2 = new ModelRenderer(this);
		slide30_r2.setRotationPoint(-2.7F, -37.4F, -18.6F);
		G19ghostprecisionslide.addChild(slide30_r2);
		setRotationAngle(slide30_r2, -0.192F, 0.0F, 0.0F);
		slide30_r2.cubeList.add(new ModelBox(slide30_r2, 64, 64, -0.751F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));
		slide30_r2.cubeList.add(new ModelBox(slide30_r2, 89, 21, 3.149F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));

		slide28_r5 = new ModelRenderer(this);
		slide28_r5.setRotationPoint(-2.7F, -37.4F, 1.15F);
		G19ghostprecisionslide.addChild(slide28_r5);
		setRotationAngle(slide28_r5, -0.192F, 0.0F, 0.0F);
		slide28_r5.cubeList.add(new ModelBox(slide28_r5, 68, 102, -0.75F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));
		slide28_r5.cubeList.add(new ModelBox(slide28_r5, 104, 81, 3.15F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));

		slide35_r3 = new ModelRenderer(this);
		slide35_r3.setRotationPoint(-2.7F, -37.4F, -25.1F);
		G19ghostprecisionslide.addChild(slide35_r3);
		setRotationAngle(slide35_r3, -0.192F, 0.0F, 0.0F);
		slide35_r3.cubeList.add(new ModelBox(slide35_r3, 55, 77, -0.7452F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));
		slide35_r3.cubeList.add(new ModelBox(slide35_r3, 84, 69, 3.1548F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));

		slide34_r5 = new ModelRenderer(this);
		slide34_r5.setRotationPoint(-2.7F, -37.4F, -24.1F);
		G19ghostprecisionslide.addChild(slide34_r5);
		setRotationAngle(slide34_r5, -0.192F, 0.0F, 0.0F);
		slide34_r5.cubeList.add(new ModelBox(slide34_r5, 47, 77, -0.7452F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));
		slide34_r5.cubeList.add(new ModelBox(slide34_r5, 84, 74, 3.1548F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));

		slide33_r3 = new ModelRenderer(this);
		slide33_r3.setRotationPoint(-2.7F, -37.4F, -23.1F);
		G19ghostprecisionslide.addChild(slide33_r3);
		setRotationAngle(slide33_r3, -0.192F, 0.0F, 0.0F);
		slide33_r3.cubeList.add(new ModelBox(slide33_r3, 76, 32, -0.7452F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));
		slide33_r3.cubeList.add(new ModelBox(slide33_r3, 84, 79, 3.1548F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));

		slide32_r3 = new ModelRenderer(this);
		slide32_r3.setRotationPoint(-2.7F, -37.4F, -22.1F);
		G19ghostprecisionslide.addChild(slide32_r3);
		setRotationAngle(slide32_r3, -0.192F, 0.0F, 0.0F);
		slide32_r3.cubeList.add(new ModelBox(slide32_r3, 73, 18, -0.7452F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));
		slide32_r3.cubeList.add(new ModelBox(slide32_r3, 87, 0, 3.1548F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));

		slide31_r2 = new ModelRenderer(this);
		slide31_r2.setRotationPoint(-2.7F, -37.4F, -21.1F);
		G19ghostprecisionslide.addChild(slide31_r2);
		setRotationAngle(slide31_r2, -0.192F, 0.0F, 0.0F);
		slide31_r2.cubeList.add(new ModelBox(slide31_r2, 73, 4, -0.7452F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));
		slide31_r2.cubeList.add(new ModelBox(slide31_r2, 87, 14, 3.1548F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));

		slide30_r3 = new ModelRenderer(this);
		slide30_r3.setRotationPoint(-2.7F, -37.4F, -20.1F);
		G19ghostprecisionslide.addChild(slide30_r3);
		setRotationAngle(slide30_r3, -0.192F, 0.0F, 0.0F);
		slide30_r3.cubeList.add(new ModelBox(slide30_r3, 9, 66, -0.7452F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));
		slide30_r3.cubeList.add(new ModelBox(slide30_r3, 88, 7, 3.1548F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));

		slide29_r5 = new ModelRenderer(this);
		slide29_r5.setRotationPoint(-2.7F, -37.4F, -19.1F);
		G19ghostprecisionslide.addChild(slide29_r5);
		setRotationAngle(slide29_r5, -0.192F, 0.0F, 0.0F);
		slide29_r5.cubeList.add(new ModelBox(slide29_r5, 64, 32, -0.7452F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));
		slide29_r5.cubeList.add(new ModelBox(slide29_r5, 90, 72, 3.1548F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));

		slide27_r4 = new ModelRenderer(this);
		slide27_r4.setRotationPoint(-2.7F, -37.4F, 0.15F);
		G19ghostprecisionslide.addChild(slide27_r4);
		setRotationAngle(slide27_r4, -0.192F, 0.0F, 0.0F);
		slide27_r4.cubeList.add(new ModelBox(slide27_r4, 97, 61, -0.75F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));
		slide27_r4.cubeList.add(new ModelBox(slide27_r4, 68, 107, 3.15F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));

		slide27_r5 = new ModelRenderer(this);
		slide27_r5.setRotationPoint(-2.7F, -37.4F, -2.85F);
		G19ghostprecisionslide.addChild(slide27_r5);
		setRotationAngle(slide27_r5, -0.192F, 0.0F, 0.0F);
		slide27_r5.cubeList.add(new ModelBox(slide27_r5, 95, 22, -0.75F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));
		slide27_r5.cubeList.add(new ModelBox(slide27_r5, 106, 22, 3.15F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));

		slide26_r3 = new ModelRenderer(this);
		slide26_r3.setRotationPoint(-2.7F, -37.4F, -0.85F);
		G19ghostprecisionslide.addChild(slide26_r3);
		setRotationAngle(slide26_r3, -0.192F, 0.0F, 0.0F);
		slide26_r3.cubeList.add(new ModelBox(slide26_r3, 70, 97, -0.75F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));
		slide26_r3.cubeList.add(new ModelBox(slide26_r3, 26, 109, 3.15F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));

		slide25_r4 = new ModelRenderer(this);
		slide25_r4.setRotationPoint(-2.7F, -37.4F, -3.85F);
		G19ghostprecisionslide.addChild(slide25_r4);
		setRotationAngle(slide25_r4, -0.192F, 0.0F, 0.0F);
		slide25_r4.cubeList.add(new ModelBox(slide25_r4, 52, 94, -0.75F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));
		slide25_r4.cubeList.add(new ModelBox(slide25_r4, 37, 109, 3.15F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));

		slide26_r4 = new ModelRenderer(this);
		slide26_r4.setRotationPoint(-2.7F, -37.4F, -26.1F);
		G19ghostprecisionslide.addChild(slide26_r4);
		setRotationAngle(slide26_r4, -0.192F, 0.0F, 0.0F);
		slide26_r4.cubeList.add(new ModelBox(slide26_r4, 79, 0, -0.75F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));
		slide26_r4.cubeList.add(new ModelBox(slide26_r4, 79, 14, 3.15F, -0.28F, -0.75F, 1, 4, 1, -0.25F, false));

		slide25_r5 = new ModelRenderer(this);
		slide25_r5.setRotationPoint(-0.5F, -36.501F, 0.55F);
		G19ghostprecisionslide.addChild(slide25_r5);
		setRotationAngle(slide25_r5, -0.7854F, 0.0F, 0.0F);
		slide25_r5.cubeList.add(new ModelBox(slide25_r5, 103, 67, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide24_r4 = new ModelRenderer(this);
		slide24_r4.setRotationPoint(-0.5F, -36.301F, 0.55F);
		G19ghostprecisionslide.addChild(slide24_r4);
		setRotationAngle(slide24_r4, -0.7854F, 0.0F, 0.0F);
		slide24_r4.cubeList.add(new ModelBox(slide24_r4, 104, 72, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide23_r5 = new ModelRenderer(this);
		slide23_r5.setRotationPoint(-0.5F, -35.901F, 0.55F);
		G19ghostprecisionslide.addChild(slide23_r5);
		setRotationAngle(slide23_r5, -0.7854F, 0.0F, 0.0F);
		slide23_r5.cubeList.add(new ModelBox(slide23_r5, 104, 74, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide23_r6 = new ModelRenderer(this);
		slide23_r6.setRotationPoint(-0.5F, -36.101F, 0.55F);
		G19ghostprecisionslide.addChild(slide23_r6);
		setRotationAngle(slide23_r6, -0.7854F, 0.0F, 0.0F);
		slide23_r6.cubeList.add(new ModelBox(slide23_r6, 104, 76, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		slide22_r7 = new ModelRenderer(this);
		slide22_r7.setRotationPoint(-0.5F, -35.701F, 0.55F);
		G19ghostprecisionslide.addChild(slide22_r7);
		setRotationAngle(slide22_r7, -0.7854F, 0.0F, 0.0F);
		slide22_r7.cubeList.add(new ModelBox(slide22_r7, 96, 105, -2.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
//		gun.render(f5);
		mag13rnd.render(f5);
//		mag20rnd.render(f5);
//		G19slide.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}