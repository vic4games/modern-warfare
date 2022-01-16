package com.vicmatskiv.mw.models;

import com.vicmatskiv.weaponlib.ModelWithAttachments;

import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.8.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class CZ805Bren extends ModelWithAttachments {
	private final ModelRenderer gun;
	private final ModelRenderer gun1_r1;
	private final ModelRenderer gun7_r1;
	private final ModelRenderer gun8_r1;
	private final ModelRenderer gun9_r1;
	private final ModelRenderer gun10_r1;
	private final ModelRenderer gun11_r1;
	private final ModelRenderer gun15_r1;
	private final ModelRenderer gun17_r1;
	private final ModelRenderer gun21_r1;
	private final ModelRenderer gun23_r1;
	private final ModelRenderer gun29_r1;
	private final ModelRenderer gun84_r1;
	private final ModelRenderer gun83_r1;
	private final ModelRenderer gun117_r1;
	private final ModelRenderer gun140_r1;
	private final ModelRenderer gun144_r1;
	private final ModelRenderer gun153_r1;
	private final ModelRenderer gun157_r1;
	private final ModelRenderer gun158_r1;
	private final ModelRenderer gun159_r1;
	private final ModelRenderer bone;
	private final ModelRenderer receiver;
	private final ModelRenderer gun185_r1;
	private final ModelRenderer gun186_r1;
	private final ModelRenderer gun186_r2;
	private final ModelRenderer gun185_r2;
	private final ModelRenderer gun186_r3;
	private final ModelRenderer gun187_r1;
	private final ModelRenderer gun187_r2;
	private final ModelRenderer gun186_r4;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer gun65_r1;
	private final ModelRenderer gun69_r1;
	private final ModelRenderer gun68_r1;
	private final ModelRenderer gun64_r1;
	private final ModelRenderer gun73_r1;
	private final ModelRenderer gun74_r1;
	private final ModelRenderer gun78_r1;
	private final ModelRenderer gun79_r1;
	private final ModelRenderer gun118_r1;
	private final ModelRenderer gun119_r1;
	private final ModelRenderer gun120_r1;
	private final ModelRenderer gun121_r1;
	private final ModelRenderer gun122_r1;
	private final ModelRenderer gun123_r1;
	private final ModelRenderer gun124_r1;
	private final ModelRenderer gun125_r1;
	private final ModelRenderer gun126_r1;
	private final ModelRenderer gun136_r1;
	private final ModelRenderer gun136_r2;
	private final ModelRenderer gun137_r1;
	private final ModelRenderer gun169_r1;
	private final ModelRenderer gun170_r1;
	private final ModelRenderer gun173_r1;
	private final ModelRenderer gun174_r1;
	private final ModelRenderer gun175_r1;
	private final ModelRenderer gun176_r1;
	private final ModelRenderer gun178_r1;
	private final ModelRenderer gun180_r1;
	private final ModelRenderer gun181_r1;
	private final ModelRenderer gun188_r1;
	private final ModelRenderer gun189_r1;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer bone15;
	private final ModelRenderer bone16;
	private final ModelRenderer bone17;
	private final ModelRenderer bone18;
	private final ModelRenderer bone11;
	private final ModelRenderer bone12;
	private final ModelRenderer bone13;
	private final ModelRenderer bone14;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;
	private final ModelRenderer bone2;
	private final ModelRenderer stock;
	private final ModelRenderer gun70_r1;
	private final ModelRenderer gun71_r1;
	private final ModelRenderer gun70_r2;
	private final ModelRenderer gun69_r2;
	private final ModelRenderer gun77_r1;
	private final ModelRenderer gun76_r1;
	private final ModelRenderer gun73_r2;
	private final ModelRenderer gun77_r2;
	private final ModelRenderer gun76_r2;
	private final ModelRenderer gun71_r2;
	private final ModelRenderer gun70_r3;
	private final ModelRenderer gun70_r4;
	private final ModelRenderer gun69_r3;
	private final ModelRenderer gun69_r4;
	private final ModelRenderer gun69_r5;
	private final ModelRenderer gun66_r1;
	private final ModelRenderer gun65_r2;
	private final ModelRenderer gun29_r2;
	private final ModelRenderer gun61_r1;
	private final ModelRenderer gun60_r1;
	private final ModelRenderer gun59_r1;
	private final ModelRenderer gun59_r2;
	private final ModelRenderer gun60_r2;
	private final ModelRenderer gun60_r3;
	private final ModelRenderer gun60_r4;
	private final ModelRenderer gun58_r1;
	private final ModelRenderer gun57_r1;
	private final ModelRenderer gun59_r3;
	private final ModelRenderer gun60_r5;
	private final ModelRenderer gun59_r4;
	private final ModelRenderer gun62_r1;
	private final ModelRenderer gun61_r2;
	private final ModelRenderer gun60_r6;
	private final ModelRenderer gun56_r1;
	private final ModelRenderer action;

	public CZ805Bren() {
		textureWidth = 175;
		textureHeight = 175;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.0F, 24.0F, 0.0F);
		gun.cubeList.add(new ModelBox(gun, 85, 50, -1.7F, -25.5F, -8.5F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 28, 72, 0.7F, -25.5F, -10.5F, 1, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 85, 47, 0.601F, -26.7F, -9.0F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 93, 25, -1.601F, -26.7F, -7.8F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 85, 57, -1.6F, -25.3F, -8.8F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 85, 60, -1.6F, -25.7F, -8.8F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 26, 93, 0.602F, -26.8F, -16.301F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 38, 30, 0.9F, -26.8F, -14.0F, 1, 2, 1, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 22, 15, -1.4F, -25.7F, -10.8F, 3, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 43, 65, -1.4F, -25.3F, -10.8F, 3, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 36, -1.1F, -25.5F, -13.8F, 3, 1, 3, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 24, 30, -1.9F, -25.5F, -15.2F, 1, 1, 7, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 11, 10, -1.401F, -26.6F, -7.0F, 3, 6, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 86, 103, -1.4F, -27.3F, -16.0F, 3, 1, 10, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 22, 0, -0.5F, -30.4F, -36.5F, 1, 4, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 43, 47, -0.299F, -30.6F, -36.5F, 1, 3, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 43, 54, -0.5F, -30.8F, -36.5F, 1, 3, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 55, -0.699F, -30.6F, -36.5F, 1, 3, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 89, -0.6F, -30.6F, -36.5F, 1, 1, 24, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 85, 66, -0.5F, -29.8F, -37.501F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 53, 65, -0.701F, -29.6F, -37.5F, 1, 2, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 26, 90, -0.7F, -28.6F, -45.5F, 1, 1, 24, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 49, 71, -0.9F, -28.6F, -48.5F, 1, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 93, 0, -0.499F, -30.6F, -37.0F, 1, 1, 24, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 114, -0.5F, -30.7F, -36.5F, 1, 1, 24, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 114, 71, -0.4F, -30.601F, -36.5F, 1, 1, 24, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 34, 72, -0.298F, -29.6F, -37.5F, 1, 2, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 115, 25, -0.5F, -28.4F, -45.5F, 1, 1, 24, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 71, 68, -0.5F, -28.2F, -48.5F, 1, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 26, 115, -0.5F, -28.8F, -45.5F, 1, 1, 24, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 72, 20, -0.5F, -29.0F, -48.5F, 1, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 85, 138, -0.601F, -27.1F, -6.5F, 2, 2, 15, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 52, 89, -1.401F, -27.1F, -6.5F, 1, 2, 15, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 76, 34, -1.502F, -27.1F, -2.1F, 3, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 22, 0, -1.201F, -25.7F, -6.4F, 3, 1, 6, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 77, 0.7F, -26.6F, -4.8F, 1, 1, 3, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 21, 55, 0.899F, -27.2F, -6.8F, 1, 1, 6, -0.4F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 55, -1.901F, -27.2F, -6.8F, 1, 1, 6, -0.4F, false));
		gun.cubeList.add(new ModelBox(gun, 52, 89, 0.699F, -26.1F, -2.9F, 1, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 65, 76, -1.701F, -26.6F, -4.8F, 1, 1, 3, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 19, 89, -1.701F, -26.1F, -2.9F, 1, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 46, 0, -1.801F, -25.701F, -6.4F, 2, 1, 6, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 104, 138, -1.6F, -27.3F, -16.0F, 3, 1, 10, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 73, 51, -1.5F, -27.8F, -16.3F, 3, 2, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 46, 20, -0.999F, -22.1F, -6.0F, 2, 1, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 56, 88, -0.3F, -28.6F, -45.5F, 1, 1, 28, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 72, -0.1F, -28.6F, -48.5F, 1, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 22, 71, -0.2F, -28.9F, -48.5F, 1, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 66, 30, -0.8F, -28.9F, -48.5F, 1, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 43, 70, -0.2F, -28.3F, -48.5F, 1, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 67, 10, -0.8F, -28.3F, -48.5F, 1, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 93, 31, -1.6F, -26.8F, -16.3F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 82, 27, -1.599F, -26.6F, -7.001F, 1, 6, 1, 0.0F, false));

		gun1_r1 = new ModelRenderer(this);
		gun1_r1.setRotationPoint(-1.5F, -24.0F, 0.5F);
		gun.addChild(gun1_r1);
		setRotationAngle(gun1_r1, 0.4363F, 0.0F, 0.0F);
		gun1_r1.cubeList.add(new ModelBox(gun1_r1, 0, 22, 0.002F, 0.0F, 0.0F, 3, 10, 4, 0.0F, false));

		gun7_r1 = new ModelRenderer(this);
		gun7_r1.setRotationPoint(-1.5F, -29.0F, 5.0F);
		gun.addChild(gun7_r1);
		setRotationAngle(gun7_r1, -0.9599F, 0.0F, 0.0F);
		gun7_r1.cubeList.add(new ModelBox(gun7_r1, 0, 65, 0.0F, 0.0F, 0.0F, 3, 3, 4, 0.0F, false));

		gun8_r1 = new ModelRenderer(this);
		gun8_r1.setRotationPoint(-1.5F, -18.9F, 2.2F);
		gun.addChild(gun8_r1);
		setRotationAngle(gun8_r1, -0.1199F, 0.0F, 0.0F);
		gun8_r1.cubeList.add(new ModelBox(gun8_r1, 54, 27, 0.0F, -0.4F, 1.0F, 3, 4, 2, 0.0F, false));

		gun9_r1 = new ModelRenderer(this);
		gun9_r1.setRotationPoint(-1.5F, -24.0F, 0.0F);
		gun.addChild(gun9_r1);
		setRotationAngle(gun9_r1, 0.3491F, 0.0F, 0.0F);
		gun9_r1.cubeList.add(new ModelBox(gun9_r1, 65, 47, -0.001F, 0.0F, 0.0F, 3, 9, 1, 0.0F, false));

		gun10_r1 = new ModelRenderer(this);
		gun10_r1.setRotationPoint(-1.0F, -25.5F, -2.0F);
		gun.addChild(gun10_r1);
		setRotationAngle(gun10_r1, -0.0698F, 0.0F, 0.0F);
		gun10_r1.cubeList.add(new ModelBox(gun10_r1, 0, 72, 0.5F, 0.0F, 0.0F, 1, 3, 1, 0.0F, false));

		gun11_r1 = new ModelRenderer(this);
		gun11_r1.setRotationPoint(-1.0F, -22.0F, -0.4F);
		gun.addChild(gun11_r1);
		setRotationAngle(gun11_r1, 0.4363F, 0.0F, 0.0F);
		gun11_r1.cubeList.add(new ModelBox(gun11_r1, 79, 13, 0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

		gun15_r1 = new ModelRenderer(this);
		gun15_r1.setRotationPoint(-1.0F, -25.5F, -6.7F);
		gun.addChild(gun15_r1);
		setRotationAngle(gun15_r1, 0.1745F, 0.0F, 0.0F);
		gun15_r1.cubeList.add(new ModelBox(gun15_r1, 21, 55, 0.0F, 0.0F, 0.0F, 2, 4, 1, 0.0F, false));

		gun17_r1 = new ModelRenderer(this);
		gun17_r1.setRotationPoint(-1.6F, -23.7F, -15.2F);
		gun.addChild(gun17_r1);
		setRotationAngle(gun17_r1, -0.2443F, 0.0F, 0.0F);
		gun17_r1.cubeList.add(new ModelBox(gun17_r1, 0, 102, -0.001F, 0.0F, 0.1F, 3, 1, 9, 0.0F, false));
		gun17_r1.cubeList.add(new ModelBox(gun17_r1, 0, 10, 2.2F, 0.0F, 0.1F, 1, 1, 9, 0.0F, false));

		gun21_r1 = new ModelRenderer(this);
		gun21_r1.setRotationPoint(-1.6F, -25.8F, -16.3F);
		gun.addChild(gun21_r1);
		setRotationAngle(gun21_r1, 0.522F, 0.0F, 0.0F);
		gun21_r1.cubeList.add(new ModelBox(gun21_r1, 32, 77, 0.001F, 0.0F, -0.001F, 3, 2, 1, 0.0F, false));
		gun21_r1.cubeList.add(new ModelBox(gun21_r1, 37, 60, 2.2F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun23_r1 = new ModelRenderer(this);
		gun23_r1.setRotationPoint(-1.6F, -25.8F, -15.6F);
		gun.addChild(gun23_r1);
		setRotationAngle(gun23_r1, 0.0759F, 0.0F, 0.0F);
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 51, 47, 0.0F, -1.0F, -0.001F, 3, 4, 1, 0.0F, false));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 24, 83, 2.201F, -1.0F, 0.0F, 1, 4, 1, 0.0F, false));

		gun29_r1 = new ModelRenderer(this);
		gun29_r1.setRotationPoint(-1.5F, -28.0F, -15.4F);
		gun.addChild(gun29_r1);
		setRotationAngle(gun29_r1, -0.17F, 0.0F, 0.0F);
		gun29_r1.cubeList.add(new ModelBox(gun29_r1, 52, 129, 0.01F, 0.1971F, 1.0338F, 3, 1, 8, 0.0F, false));
		gun29_r1.cubeList.add(new ModelBox(gun29_r1, 26, 89, 0.01F, 1.1971F, 1.0338F, 3, 4, 9, 0.0F, false));

		gun84_r1 = new ModelRenderer(this);
		gun84_r1.setRotationPoint(1.899F, -27.0F, -0.3F);
		gun.addChild(gun84_r1);
		setRotationAngle(gun84_r1, -1.5359F, 0.1745F, 0.0F);
		gun84_r1.cubeList.add(new ModelBox(gun84_r1, 5, 0, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun83_r1 = new ModelRenderer(this);
		gun83_r1.setRotationPoint(1.899F, -26.1F, -0.8F);
		gun.addChild(gun83_r1);
		setRotationAngle(gun83_r1, -0.5061F, 0.0F, 0.0F);
		gun83_r1.cubeList.add(new ModelBox(gun83_r1, 5, 77, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun117_r1 = new ModelRenderer(this);
		gun117_r1.setRotationPoint(-1.5F, -26.5F, -2.0F);
		gun.addChild(gun117_r1);
		setRotationAngle(gun117_r1, 0.6807F, 0.0F, 0.0F);
		gun117_r1.cubeList.add(new ModelBox(gun117_r1, 46, 7, 0.001F, 0.0F, 0.0F, 3, 5, 4, 0.0F, false));

		gun140_r1 = new ModelRenderer(this);
		gun140_r1.setRotationPoint(1.6F, -24.85F, -13.3F);
		gun.addChild(gun140_r1);
		setRotationAngle(gun140_r1, 0.3665F, 0.0F, 0.0F);
		gun140_r1.cubeList.add(new ModelBox(gun140_r1, 85, 63, -0.698F, -0.7F, -1.7F, 1, 1, 2, -0.3F, false));

		gun144_r1 = new ModelRenderer(this);
		gun144_r1.setRotationPoint(-1.4F, -25.7F, -10.8F);
		gun.addChild(gun144_r1);
		setRotationAngle(gun144_r1, -0.7854F, 0.0F, 0.0F);
		gun144_r1.cubeList.add(new ModelBox(gun144_r1, 54, 39, 0.001F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun153_r1 = new ModelRenderer(this);
		gun153_r1.setRotationPoint(-1.6F, -25.7F, -8.8F);
		gun.addChild(gun153_r1);
		setRotationAngle(gun153_r1, -0.7854F, 0.0F, 0.0F);
		gun153_r1.cubeList.add(new ModelBox(gun153_r1, 93, 20, -0.001F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun157_r1 = new ModelRenderer(this);
		gun157_r1.setRotationPoint(0.9F, -26.55F, -8.3F);
		gun.addChild(gun157_r1);
		setRotationAngle(gun157_r1, 0.0F, -0.0744F, 0.0F);
		gun157_r1.cubeList.add(new ModelBox(gun157_r1, 93, 18, 0.0F, 0.0F, 0.7F, 1, 1, 1, 0.0F, false));

		gun158_r1 = new ModelRenderer(this);
		gun158_r1.setRotationPoint(0.8F, -25.5F, -8.2F);
		gun.addChild(gun158_r1);
		setRotationAngle(gun158_r1, 0.0F, 0.1487F, 0.0F);
		gun158_r1.cubeList.add(new ModelBox(gun158_r1, 28, 83, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun159_r1 = new ModelRenderer(this);
		gun159_r1.setRotationPoint(0.6F, -24.3F, -8.8F);
		gun.addChild(gun159_r1);
		setRotationAngle(gun159_r1, 1.1525F, 0.0F, 0.0F);
		gun159_r1.cubeList.add(new ModelBox(gun159_r1, 38, 22, 0.001F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-1.3F, -25.9F, -16.1F);
		gun.addChild(bone);
		setRotationAngle(bone, -0.4363F, 0.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 93, 14, 2.1F, -0.9094F, 0.0423F, 1, 1, 1, -0.1F, false));
		bone.cubeList.add(new ModelBox(bone, 89, 57, -0.5F, -0.9094F, 0.0423F, 1, 1, 1, -0.1F, false));

		receiver = new ModelRenderer(this);
		receiver.setRotationPoint(0.0F, 24.0F, 0.0F);
		receiver.cubeList.add(new ModelBox(receiver, 92, 67, 1.5F, -28.8F, -32.1F, 1, 1, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 93, 16, -2.099F, -28.85F, -18.3F, 1, 1, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 17, 93, 1.099F, -28.85F, -18.3F, 1, 1, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 104, 71, 0.2F, -27.001F, -30.0F, 1, 1, 14, -0.2F, false));
		receiver.cubeList.add(new ModelBox(receiver, 114, 96, 0.201F, -26.801F, -32.301F, 1, 1, 17, -0.2F, false));
		receiver.cubeList.add(new ModelBox(receiver, 0, 47, -0.999F, -26.801F, -32.301F, 2, 1, 17, -0.2F, false));
		receiver.cubeList.add(new ModelBox(receiver, 85, 71, -1.0F, -27.001F, -30.0F, 2, 1, 15, -0.2F, false));
		receiver.cubeList.add(new ModelBox(receiver, 67, 15, -0.9F, -27.501F, -22.1F, 2, 1, 1, -0.2F, false));
		receiver.cubeList.add(new ModelBox(receiver, 56, 4, -0.9F, -27.501F, -19.0F, 2, 1, 1, -0.2F, false));
		receiver.cubeList.add(new ModelBox(receiver, 6, 72, -1.5F, -28.2F, -32.0F, 3, 2, 2, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 21, 47, -2.0F, -29.9F, 6.51F, 4, 5, 3, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 66, 35, -2.3F, -29.9F, 6.5F, 4, 1, 2, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 72, 25, -2.3F, -29.9F, 8.5F, 4, 4, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 73, 0, -1.7F, -29.9F, 8.5F, 4, 4, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 46, 35, -1.7F, -29.9F, 6.5F, 4, 1, 2, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 33, 22, -1.6F, -32.5F, 6.0F, 1, 3, 3, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 13, 54, -1.601F, -32.5F, 8.35F, 1, 3, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 33, 30, 0.6F, -32.5F, 6.0F, 1, 3, 3, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 29, 55, 0.601F, -32.5F, 8.35F, 1, 3, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 93, 25, -2.101F, -28.5F, -32.6F, 1, 1, 15, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 0, 139, -2.1F, -29.2F, -32.6F, 1, 1, 15, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 139, 50, 1.101F, -28.5F, -32.6F, 1, 1, 15, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 17, 140, 1.1F, -29.2F, -32.6F, 1, 1, 15, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 56, 24, -1.5F, -30.4F, -6.5F, 3, 1, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 140, 113, 0.49F, -32.2F, -16.5F, 1, 1, 10, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 141, 22, -1.49F, -32.2F, -16.5F, 1, 1, 10, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 34, 140, -1.7F, -29.6F, -4.5F, 1, 2, 10, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 0, 0, 0.7F, -29.6F, -14.5F, 1, 2, 20, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 58, 33, -1.8F, -29.6F, 5.0F, 1, 2, 2, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 10, 65, 0.8F, -29.6F, 5.0F, 1, 2, 2, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 119, 0, 1.101F, -29.9F, -15.0F, 1, 1, 21, -0.3F, false));
		receiver.cubeList.add(new ModelBox(receiver, 26, 115, -2.099F, -29.9F, -5.0F, 1, 1, 11, -0.3F, false));
		receiver.cubeList.add(new ModelBox(receiver, 54, 118, 0.798F, -27.8F, -14.5F, 1, 1, 22, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 46, 20, -1.799F, -28.3F, -32.5F, 1, 1, 18, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 115, 50, -1.201F, -28.3F, -32.5F, 3, 1, 18, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 92, 115, -1.8F, -27.8F, -14.5F, 3, 1, 22, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 73, 5, -1.8F, -29.6F, -6.5F, 3, 2, 2, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 78, 117, -1.8F, -29.6F, -29.5F, 3, 2, 15, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 0, 62, -1.5F, -27.6F, -33.0F, 3, 1, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 72, 20, -1.8F, -29.6F, -33.0F, 1, 2, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 73, 58, 0.8F, -29.6F, -33.0F, 1, 2, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 43, 47, -2.0F, -29.4F, -32.5F, 3, 2, 16, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 0, 0, -1.0F, -33.0F, -32.5F, 2, 5, 42, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 22, 65, -1.498F, -32.2F, -20.4F, 3, 2, 4, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 120, 115, -1.499F, -32.001F, -5.5F, 3, 5, 14, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 73, 9, -1.498F, -32.2F, -26.5F, 3, 2, 2, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 73, 47, -1.498F, -32.2F, -32.5F, 3, 2, 2, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 43, 65, -1.49F, -30.2F, -32.5F, 3, 1, 16, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 46, 0, -1.5F, -32.4F, -32.5F, 3, 1, 41, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 0, 114, 0.501F, -32.0F, -31.3F, 1, 1, 11, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 93, 12, -1.499F, -32.0F, -31.3F, 1, 1, 11, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 0, 65, -1.0F, -29.4F, -32.5F, 3, 2, 16, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 0, 22, -1.2F, -29.6F, -32.5001F, 3, 2, 18, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 8, 47, -1.49F, -32.4F, -33.001F, 3, 4, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 110, 25, -1.5F, -30.6F, -16.5F, 3, 1, 10, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 55, 82, -0.2F, -30.75F, 9.4F, 1, 1, 2, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 43, 82, -0.8F, -30.75F, 9.4F, 1, 1, 2, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 31, 7, -1.5F, -29.95F, 9.4F, 3, 5, 2, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 18, 83, -1.0F, -31.9F, 9.75F, 2, 2, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 56, 7, -1.0F, -32.9F, 9.002F, 2, 3, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 11, 17, -0.8F, -32.701F, -33.3F, 3, 1, 1, -0.3F, false));
		receiver.cubeList.add(new ModelBox(receiver, 46, 39, -0.9F, -33.401F, 9.301F, 3, 1, 1, -0.3F, false));
		receiver.cubeList.add(new ModelBox(receiver, 32, 38, -0.9F, -33.399F, 9.001F, 3, 1, 1, -0.3F, false));
		receiver.cubeList.add(new ModelBox(receiver, 24, 38, -0.8F, -32.699F, -32.999F, 3, 1, 1, -0.3F, false));
		receiver.cubeList.add(new ModelBox(receiver, 41, 89, -2.1F, -33.402F, 9.302F, 2, 1, 1, -0.3F, false));
		receiver.cubeList.add(new ModelBox(receiver, 26, 89, -2.1F, -33.4F, 9.001F, 2, 1, 1, -0.3F, false));
		receiver.cubeList.add(new ModelBox(receiver, 18, 86, -2.2F, -32.7F, -32.999F, 2, 1, 1, -0.3F, false));
		receiver.cubeList.add(new ModelBox(receiver, 12, 86, -2.2F, -32.699F, -33.3F, 2, 1, 1, -0.3F, false));

		gun185_r1 = new ModelRenderer(this);
		gun185_r1.setRotationPoint(1.8F, -33.1F, 9.6F);
		receiver.addChild(gun185_r1);
		setRotationAngle(gun185_r1, 0.0F, 0.0F, -0.2269F);
		gun185_r1.cubeList.add(new ModelBox(gun185_r1, 89, 50, -1.7F, 2.1F, -0.299F, 2, 1, 1, -0.3F, false));
		gun185_r1.cubeList.add(new ModelBox(gun185_r1, 89, 46, -1.699F, 2.1F, -0.6F, 2, 1, 1, -0.3F, false));
		gun185_r1.cubeList.add(new ModelBox(gun185_r1, 22, 71, -0.699F, -0.301F, -0.6F, 1, 3, 1, -0.3F, false));
		gun185_r1.cubeList.add(new ModelBox(gun185_r1, 28, 71, -0.7F, -0.3F, -0.3F, 1, 3, 1, -0.3F, false));

		gun186_r1 = new ModelRenderer(this);
		gun186_r1.setRotationPoint(1.9F, -32.4F, -32.7F);
		receiver.addChild(gun186_r1);
		setRotationAngle(gun186_r1, 0.0F, 0.0F, -0.2269F);
		gun186_r1.cubeList.add(new ModelBox(gun186_r1, 28, 86, -1.699F, 2.1F, -0.3F, 2, 1, 1, -0.3F, false));
		gun186_r1.cubeList.add(new ModelBox(gun186_r1, 88, 42, -1.7F, 2.1F, -0.6F, 2, 1, 1, -0.3F, false));
		gun186_r1.cubeList.add(new ModelBox(gun186_r1, 66, 30, -0.7F, -0.3F, -0.6F, 1, 3, 1, -0.3F, false));
		gun186_r1.cubeList.add(new ModelBox(gun186_r1, 67, 10, -0.699F, -0.301F, -0.3F, 1, 3, 1, -0.3F, false));

		gun186_r2 = new ModelRenderer(this);
		gun186_r2.setRotationPoint(1.3F, -32.2F, -33.0F);
		receiver.addChild(gun186_r2);
		setRotationAngle(gun186_r2, 0.0F, 0.0F, -0.2269F);
		gun186_r2.cubeList.add(new ModelBox(gun186_r2, 22, 15, -0.699F, -0.301F, -0.3F, 1, 3, 1, -0.3F, false));
		gun186_r2.cubeList.add(new ModelBox(gun186_r2, 46, 7, -0.7F, -0.3F, 0.0F, 1, 3, 1, -0.3F, false));

		gun185_r2 = new ModelRenderer(this);
		gun185_r2.setRotationPoint(1.1F, -32.9F, 9.3F);
		receiver.addChild(gun185_r2);
		setRotationAngle(gun185_r2, 0.0F, 0.0F, -0.2269F);
		gun185_r2.cubeList.add(new ModelBox(gun185_r2, 37, 55, -0.699F, -0.301F, -0.3F, 1, 3, 1, -0.3F, false));
		gun185_r2.cubeList.add(new ModelBox(gun185_r2, 0, 65, -0.7F, -0.3F, 0.0F, 1, 3, 1, -0.3F, false));

		gun186_r3 = new ModelRenderer(this);
		gun186_r3.setRotationPoint(-1.8F, -33.1F, 9.6F);
		receiver.addChild(gun186_r3);
		setRotationAngle(gun186_r3, 0.0F, 0.0F, 0.2269F);
		gun186_r3.cubeList.add(new ModelBox(gun186_r3, 13, 89, -0.3F, 2.1F, -0.299F, 2, 1, 1, -0.3F, false));
		gun186_r3.cubeList.add(new ModelBox(gun186_r3, 0, 89, -0.299F, 2.099F, -0.6F, 2, 1, 1, -0.3F, false));
		gun186_r3.cubeList.add(new ModelBox(gun186_r3, 49, 70, -0.3F, -0.3F, -0.3F, 1, 3, 1, -0.3F, false));
		gun186_r3.cubeList.add(new ModelBox(gun186_r3, 43, 70, -0.299F, -0.301F, -0.6F, 1, 3, 1, -0.3F, false));

		gun187_r1 = new ModelRenderer(this);
		gun187_r1.setRotationPoint(-1.9F, -32.4F, -32.7F);
		receiver.addChild(gun187_r1);
		setRotationAngle(gun187_r1, 0.0F, 0.0F, 0.2269F);
		gun187_r1.cubeList.add(new ModelBox(gun187_r1, 88, 44, -0.299F, 2.099F, -0.3F, 2, 1, 1, -0.3F, false));
		gun187_r1.cubeList.add(new ModelBox(gun187_r1, 86, 88, -0.3F, 2.1F, -0.6F, 2, 1, 1, -0.3F, false));
		gun187_r1.cubeList.add(new ModelBox(gun187_r1, 43, 65, -0.3F, -0.3F, -0.6F, 1, 3, 1, -0.3F, false));
		gun187_r1.cubeList.add(new ModelBox(gun187_r1, 65, 57, -0.299F, -0.301F, -0.3F, 1, 3, 1, -0.3F, false));

		gun187_r2 = new ModelRenderer(this);
		gun187_r2.setRotationPoint(-1.3F, -32.2F, -32.7F);
		receiver.addChild(gun187_r2);
		setRotationAngle(gun187_r2, 0.0F, 0.0F, 0.2269F);
		gun187_r2.cubeList.add(new ModelBox(gun187_r2, 10, 22, -0.3F, -0.3F, -0.3F, 1, 3, 1, -0.3F, false));
		gun187_r2.cubeList.add(new ModelBox(gun187_r2, 0, 22, -0.299F, -0.301F, -0.6F, 1, 3, 1, -0.3F, false));

		gun186_r4 = new ModelRenderer(this);
		gun186_r4.setRotationPoint(-1.1F, -32.9F, 9.6F);
		receiver.addChild(gun186_r4);
		setRotationAngle(gun186_r4, 0.0F, 0.0F, 0.2269F);
		gun186_r4.cubeList.add(new ModelBox(gun186_r4, 32, 65, -0.3F, -0.3F, -0.3F, 1, 3, 1, -0.3F, false));
		gun186_r4.cubeList.add(new ModelBox(gun186_r4, 22, 65, -0.299F, -0.301F, -0.6F, 1, 3, 1, -0.3F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.705F, -32.195F, 9.3F);
		receiver.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.4538F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 13, 93, -1.0F, -1.0F, 0.0F, 1, 1, 1, -0.2F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.705F, -30.695F, 10.1F);
		receiver.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.4538F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 77, 89, -1.0F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(1.0F, -31.9F, 10.75F);
		receiver.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.384F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 31, 90, -1.001F, 0.6F, -0.998F, 1, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 63, 90, -1.0F, 0.0F, -0.999F, 1, 1, 1, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-1.0F, -31.9F, 10.75F);
		receiver.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.384F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 46, 90, -0.001F, 0.6F, -0.998F, 1, 1, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 90, 52, 0.0F, 0.0F, -0.999F, 1, 1, 1, 0.0F, false));

		gun65_r1 = new ModelRenderer(this);
		gun65_r1.setRotationPoint(-1.75F, -30.351F, 9.45F);
		receiver.addChild(gun65_r1);
		setRotationAngle(gun65_r1, 0.0F, 0.0698F, 0.0F);
		gun65_r1.cubeList.add(new ModelBox(gun65_r1, 24, 22, 0.0F, 0.0F, 0.0F, 1, 5, 2, 0.0F, false));

		gun69_r1 = new ModelRenderer(this);
		gun69_r1.setRotationPoint(-0.8F, -30.75F, 10.4F);
		receiver.addChild(gun69_r1);
		setRotationAngle(gun69_r1, 0.0873F, 0.0349F, 1.1519F);
		gun69_r1.cubeList.add(new ModelBox(gun69_r1, 81, 7, 0.0F, 0.0F, -1.0F, 1, 1, 2, 0.0F, false));

		gun68_r1 = new ModelRenderer(this);
		gun68_r1.setRotationPoint(0.8F, -30.75F, 10.4F);
		receiver.addChild(gun68_r1);
		setRotationAngle(gun68_r1, 0.0873F, -0.0349F, -1.1519F);
		gun68_r1.cubeList.add(new ModelBox(gun68_r1, 49, 82, -1.0F, 0.0F, -1.0F, 1, 1, 2, 0.0F, false));

		gun64_r1 = new ModelRenderer(this);
		gun64_r1.setRotationPoint(1.75F, -30.351F, 9.45F);
		receiver.addChild(gun64_r1);
		setRotationAngle(gun64_r1, 0.0F, -0.0698F, 0.0F);
		gun64_r1.cubeList.add(new ModelBox(gun64_r1, 24, 30, -1.0F, 0.0F, 0.0F, 1, 5, 2, 0.0F, false));

		gun73_r1 = new ModelRenderer(this);
		gun73_r1.setRotationPoint(-1.5F, -31.5F, -31.2F);
		receiver.addChild(gun73_r1);
		setRotationAngle(gun73_r1, 0.7854F, 0.0F, 0.0F);
		gun73_r1.cubeList.add(new ModelBox(gun73_r1, 70, 39, -0.001F, 0.0707F, -0.0707F, 3, 1, 1, 0.0F, false));

		gun74_r1 = new ModelRenderer(this);
		gun74_r1.setRotationPoint(-1.5F, -30.6F, -30.5F);
		receiver.addChild(gun74_r1);
		setRotationAngle(gun74_r1, -0.7854F, 0.0F, 0.0F);
		gun74_r1.cubeList.add(new ModelBox(gun74_r1, 62, 39, 0.009F, 0.0707F, 0.0707F, 3, 1, 1, 0.0F, false));

		gun78_r1 = new ModelRenderer(this);
		gun78_r1.setRotationPoint(-1.5F, -30.6F, -26.5F);
		receiver.addChild(gun78_r1);
		setRotationAngle(gun78_r1, -0.7854F, 0.0F, 0.0F);
		gun78_r1.cubeList.add(new ModelBox(gun78_r1, 21, 62, 0.009F, 0.0707F, 0.0707F, 3, 1, 1, 0.0F, false));

		gun79_r1 = new ModelRenderer(this);
		gun79_r1.setRotationPoint(-1.5F, -31.5F, -27.2F);
		receiver.addChild(gun79_r1);
		setRotationAngle(gun79_r1, 0.7854F, 0.0F, 0.0F);
		gun79_r1.cubeList.add(new ModelBox(gun79_r1, 8, 62, -0.001F, 0.0707F, -0.0707F, 3, 1, 1, 0.0F, false));

		gun118_r1 = new ModelRenderer(this);
		gun118_r1.setRotationPoint(1.8F, -29.6F, -20.5F);
		receiver.addChild(gun118_r1);
		setRotationAngle(gun118_r1, 0.0F, 0.0F, 2.4166F);
		gun118_r1.cubeList.add(new ModelBox(gun118_r1, 85, 42, 0.0F, 0.0F, 0.0F, 1, 1, 28, 0.0F, false));

		gun119_r1 = new ModelRenderer(this);
		gun119_r1.setRotationPoint(2.0F, -29.4F, -32.5F);
		receiver.addChild(gun119_r1);
		setRotationAngle(gun119_r1, 0.0F, 0.0F, 2.4166F);
		gun119_r1.cubeList.add(new ModelBox(gun119_r1, 126, 134, 0.0F, 0.0F, 0.0F, 1, 1, 16, 0.0F, false));

		gun120_r1 = new ModelRenderer(this);
		gun120_r1.setRotationPoint(-1.8F, -29.6F, -18.5F);
		receiver.addChild(gun120_r1);
		setRotationAngle(gun120_r1, 0.0F, 0.0F, -2.4166F);
		gun120_r1.cubeList.add(new ModelBox(gun120_r1, 86, 88, -1.0F, 0.0F, 0.0F, 1, 1, 26, 0.0F, false));

		gun121_r1 = new ModelRenderer(this);
		gun121_r1.setRotationPoint(-2.0F, -29.4F, -32.5F);
		receiver.addChild(gun121_r1);
		setRotationAngle(gun121_r1, 0.0F, 0.0F, -2.4166F);
		gun121_r1.cubeList.add(new ModelBox(gun121_r1, 133, 96, -1.0F, 0.0F, 0.0F, 1, 1, 16, 0.0F, false));

		gun122_r1 = new ModelRenderer(this);
		gun122_r1.setRotationPoint(-1.5F, -31.5F, -21.1F);
		receiver.addChild(gun122_r1);
		setRotationAngle(gun122_r1, 0.7854F, 0.0F, 0.0F);
		gun122_r1.cubeList.add(new ModelBox(gun122_r1, 51, 61, -0.001F, 0.0707F, -0.0707F, 3, 1, 1, 0.0F, false));

		gun123_r1 = new ModelRenderer(this);
		gun123_r1.setRotationPoint(-1.5F, -30.6F, -20.4F);
		receiver.addChild(gun123_r1);
		setRotationAngle(gun123_r1, -0.7854F, 0.0F, 0.0F);
		gun123_r1.cubeList.add(new ModelBox(gun123_r1, 43, 61, 0.009F, 0.0707F, 0.0707F, 3, 1, 1, 0.0F, false));

		gun124_r1 = new ModelRenderer(this);
		gun124_r1.setRotationPoint(-1.5F, -31.5F, -25.2F);
		receiver.addChild(gun124_r1);
		setRotationAngle(gun124_r1, 0.7854F, 0.0F, 0.0F);
		gun124_r1.cubeList.add(new ModelBox(gun124_r1, 8, 59, -0.001F, 0.0707F, -0.0707F, 3, 1, 1, 0.0F, false));

		gun125_r1 = new ModelRenderer(this);
		gun125_r1.setRotationPoint(-1.5F, -30.6F, -24.5F);
		receiver.addChild(gun125_r1);
		setRotationAngle(gun125_r1, -0.7854F, 0.0F, 0.0F);
		gun125_r1.cubeList.add(new ModelBox(gun125_r1, 51, 58, 0.009F, 0.0707F, 0.0707F, 3, 1, 1, 0.0F, false));

		gun126_r1 = new ModelRenderer(this);
		gun126_r1.setRotationPoint(-2.3F, -28.8F, -6.5F);
		receiver.addChild(gun126_r1);
		setRotationAngle(gun126_r1, 0.0F, 0.1745F, 0.0F);
		gun126_r1.cubeList.add(new ModelBox(gun126_r1, 73, 55, -0.2462F, 0.0F, -0.0434F, 3, 1, 2, 0.0F, false));
		gun126_r1.cubeList.add(new ModelBox(gun126_r1, 72, 65, -0.247F, -0.5F, -0.043F, 3, 1, 2, 0.0F, false));

		gun136_r1 = new ModelRenderer(this);
		gun136_r1.setRotationPoint(-1.8F, -26.6F, -4.5F);
		receiver.addChild(gun136_r1);
		setRotationAngle(gun136_r1, 2.3562F, 0.0F, 0.0F);
		gun136_r1.cubeList.add(new ModelBox(gun136_r1, 60, 89, 0.001F, 0.1414F, 0.1414F, 1, 1, 1, 0.0F, false));

		gun136_r2 = new ModelRenderer(this);
		gun136_r2.setRotationPoint(-1.8F, -26.6F, -14.5F);
		receiver.addChild(gun136_r2);
		setRotationAngle(gun136_r2, 2.3562F, 0.0F, 0.0F);
		gun136_r2.cubeList.add(new ModelBox(gun136_r2, 56, 89, 0.001F, 0.1414F, 0.1414F, 1, 1, 1, 0.0F, false));
		gun136_r2.cubeList.add(new ModelBox(gun136_r2, 93, 29, 2.601F, 0.1414F, 0.1414F, 1, 1, 1, 0.0F, false));

		gun137_r1 = new ModelRenderer(this);
		gun137_r1.setRotationPoint(-1.8F, -28.2F, 5.0F);
		receiver.addChild(gun137_r1);
		setRotationAngle(gun137_r1, -0.7854F, 0.0F, 0.0F);
		gun137_r1.cubeList.add(new ModelBox(gun137_r1, 89, 60, 0.001F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		gun137_r1.cubeList.add(new ModelBox(gun137_r1, 93, 27, 2.601F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun169_r1 = new ModelRenderer(this);
		gun169_r1.setRotationPoint(2.3F, -29.9F, 7.5F);
		receiver.addChild(gun169_r1);
		setRotationAngle(gun169_r1, 0.0F, 0.0F, 2.3562F);
		gun169_r1.cubeList.add(new ModelBox(gun169_r1, 34, 0, 0.0F, 0.0F, -1.0F, 1, 2, 3, 0.0F, false));

		gun170_r1 = new ModelRenderer(this);
		gun170_r1.setRotationPoint(-2.3F, -29.9F, 7.5F);
		receiver.addChild(gun170_r1);
		setRotationAngle(gun170_r1, 0.0F, 0.0F, -0.7854F);
		gun170_r1.cubeList.add(new ModelBox(gun170_r1, 72, 30, 0.0F, 0.0F, -1.0F, 2, 1, 3, 0.0F, false));

		gun173_r1 = new ModelRenderer(this);
		gun173_r1.setRotationPoint(2.3F, -29.9F, 7.5F);
		receiver.addChild(gun173_r1);
		setRotationAngle(gun173_r1, 0.0F, -2.3562F, 0.0F);
		gun173_r1.cubeList.add(new ModelBox(gun173_r1, 79, 82, -0.7071F, 0.0F, 0.7071F, 1, 4, 1, 0.0F, false));

		gun174_r1 = new ModelRenderer(this);
		gun174_r1.setRotationPoint(2.3F, -29.9F, 8.5F);
		receiver.addChild(gun174_r1);
		setRotationAngle(gun174_r1, 0.0F, -2.3562F, 0.0F);
		gun174_r1.cubeList.add(new ModelBox(gun174_r1, 55, 70, 0.7071F, 0.0F, -0.7071F, 1, 4, 1, 0.0F, false));

		gun175_r1 = new ModelRenderer(this);
		gun175_r1.setRotationPoint(-2.3F, -29.9F, 7.5F);
		receiver.addChild(gun175_r1);
		setRotationAngle(gun175_r1, 0.0F, 0.7854F, 0.0F);
		gun175_r1.cubeList.add(new ModelBox(gun175_r1, 0, 47, 0.7071F, 0.0F, -0.7071F, 2, 4, 1, 0.0F, false));

		gun176_r1 = new ModelRenderer(this);
		gun176_r1.setRotationPoint(-2.3F, -29.9F, 8.5F);
		receiver.addChild(gun176_r1);
		setRotationAngle(gun176_r1, 0.0F, 0.7854F, 0.0F);
		gun176_r1.cubeList.add(new ModelBox(gun176_r1, 46, 27, -0.7071F, 0.0F, 0.7071F, 2, 4, 1, 0.0F, false));

		gun178_r1 = new ModelRenderer(this);
		gun178_r1.setRotationPoint(-1.5F, -26.2F, -30.0F);
		receiver.addChild(gun178_r1);
		setRotationAngle(gun178_r1, 2.3794F, 0.0F, 0.0F);
		gun178_r1.cubeList.add(new ModelBox(gun178_r1, 32, 15, 0.001F, 0.0F, 0.0F, 3, 2, 2, 0.0F, false));

		gun180_r1 = new ModelRenderer(this);
		gun180_r1.setRotationPoint(-1.5F, -32.4F, -32.5F);
		receiver.addChild(gun180_r1);
		setRotationAngle(gun180_r1, 0.0F, 0.0F, -0.522F);
		gun180_r1.cubeList.add(new ModelBox(gun180_r1, 43, 47, 0.0F, 0.0F, 0.01F, 1, 1, 40, 0.0F, false));

		gun181_r1 = new ModelRenderer(this);
		gun181_r1.setRotationPoint(1.5F, -32.4F, -32.5F);
		receiver.addChild(gun181_r1);
		setRotationAngle(gun181_r1, 0.0F, 0.0F, 0.522F);
		gun181_r1.cubeList.add(new ModelBox(gun181_r1, 0, 47, -1.0F, 0.0F, 0.01F, 1, 1, 41, 0.0F, false));

		gun188_r1 = new ModelRenderer(this);
		gun188_r1.setRotationPoint(1.6F, -32.5F, 6.35F);
		receiver.addChild(gun188_r1);
		setRotationAngle(gun188_r1, 0.0F, 0.0F, 0.522F);
		gun188_r1.cubeList.add(new ModelBox(gun188_r1, 73, 89, -1.0F, -0.001F, 2.0F, 1, 1, 1, 0.0F, false));
		gun188_r1.cubeList.add(new ModelBox(gun188_r1, 70, 77, -1.0F, 0.0F, -0.35F, 1, 1, 3, 0.0F, false));

		gun189_r1 = new ModelRenderer(this);
		gun189_r1.setRotationPoint(-1.6F, -32.5F, 6.35F);
		receiver.addChild(gun189_r1);
		setRotationAngle(gun189_r1, 0.0F, 0.0F, -0.522F);
		gun189_r1.cubeList.add(new ModelBox(gun189_r1, 69, 89, 0.0F, -0.001F, 2.0F, 1, 1, 1, 0.0F, false));
		gun189_r1.cubeList.add(new ModelBox(gun189_r1, 27, 77, 0.0F, 0.0F, -0.35F, 1, 1, 3, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, -24.9F, 6.5F);
		receiver.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.7679F, 0.0349F, -0.0698F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 46, 20, 1.0F, -3.0F, 0.0F, 1, 3, 2, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-3.0F, -24.9F, 6.5F);
		receiver.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.7679F, -0.0349F, 0.0698F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 46, 0, 1.0F, -3.0F, 0.0F, 1, 3, 2, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-1.3F, -28.1F, -18.9F);
		receiver.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.4189F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 89, 63, -1.0F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 89, 66, 2.6F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(0.1F, -25.7F, -32.1F);
		receiver.addChild(bone15);
		setRotationAngle(bone15, 0.0F, 0.0F, 1.5708F);
		

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(0.0F, 0.0F, -1.0F);
		bone15.addChild(bone16);
		setRotationAngle(bone16, 0.0F, 0.0F, -0.3491F);
		bone16.cubeList.add(new ModelBox(bone16, 61, 82, -0.8121F, -0.9316F, 14.5F, 1, 1, 2, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 52, 91, -0.8121F, -0.9316F, 10.0F, 1, 1, 1, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 90, 78, -0.8121F, -0.9316F, 11.5F, 1, 1, 1, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 12, 76, -0.8121F, -0.9316F, 13.0F, 1, 1, 1, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 91, 48, -0.8121F, -0.9316F, 2.5F, 1, 1, 1, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 90, 80, -0.8121F, -0.9316F, 1.0F, 1, 1, 1, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 41, 91, -0.8121F, -0.9316F, 4.0F, 1, 1, 1, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 26, 91, -0.8121F, -0.9316F, 5.5F, 1, 1, 1, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 17, 91, -0.8121F, -0.9316F, 7.0F, 1, 1, 1, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 13, 91, -0.8121F, -0.9316F, 8.5F, 1, 1, 1, 0.0F, false));

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(0.0F, 0.0F, -1.0F);
		bone15.addChild(bone17);
		setRotationAngle(bone17, 0.0F, 0.0F, 0.3491F);
		bone17.cubeList.add(new ModelBox(bone17, 67, 82, -0.8121F, -0.0684F, 14.5F, 1, 1, 2, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 4, 91, -0.8121F, -0.0684F, 10.0F, 1, 1, 1, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 90, 76, -0.8121F, -0.0684F, 11.5F, 1, 1, 1, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 59, 15, -0.8121F, -0.0684F, 13.0F, 1, 1, 1, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 0, 91, -0.8121F, -0.0684F, 2.5F, 1, 1, 1, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 80, 90, -0.8121F, -0.0684F, 1.0F, 1, 1, 1, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 90, 90, -0.8121F, -0.0684F, 4.0F, 1, 1, 1, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 86, 90, -0.8121F, -0.0684F, 5.5F, 1, 1, 1, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 90, 84, -0.8121F, -0.0684F, 7.0F, 1, 1, 1, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 90, 82, -0.8121F, -0.0684F, 8.5F, 1, 1, 1, 0.0F, false));

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone15.addChild(bone18);
		

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(-2.5F, -28.3F, -32.6F);
		receiver.addChild(bone11);
		setRotationAngle(bone11, 0.0F, 0.0F, -3.1416F);
		

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone11.addChild(bone12);
		setRotationAngle(bone12, 0.0F, 0.0F, -0.3491F);
		bone12.cubeList.add(new ModelBox(bone12, 0, 83, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 92, 64, -1.0F, -1.0F, 10.0F, 1, 1, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 63, 92, -1.0F, -1.0F, 2.5F, 1, 1, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 92, 61, -1.0F, -1.0F, 4.0F, 1, 1, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 92, 58, -1.0F, -1.0F, 5.5F, 1, 1, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 44, 92, -1.0F, -1.0F, 7.0F, 1, 1, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 29, 92, -1.0F, -1.0F, 8.5F, 1, 1, 1, 0.0F, false));

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone11.addChild(bone13);
		setRotationAngle(bone13, 0.0F, 0.0F, 0.3491F);
		bone13.cubeList.add(new ModelBox(bone13, 73, 82, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 20, 92, -1.0F, 0.0F, 10.0F, 1, 1, 1, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 7, 92, -1.0F, 0.0F, 2.5F, 1, 1, 1, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 77, 91, -1.0F, 0.0F, 4.0F, 1, 1, 1, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 73, 91, -1.0F, 0.0F, 5.5F, 1, 1, 1, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 69, 91, -1.0F, 0.0F, 7.0F, 1, 1, 1, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 60, 91, -1.0F, 0.0F, 8.5F, 1, 1, 1, 0.0F, false));

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone11.addChild(bone14);
		bone14.cubeList.add(new ModelBox(bone14, 56, 91, -1.0F, -0.5F, 0.5F, 1, 1, 1, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(2.5F, -28.3F, -32.6F);
		receiver.addChild(bone7);
		

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone7.addChild(bone8);
		setRotationAngle(bone8, 0.0F, 0.0F, -0.3491F);
		bone8.cubeList.add(new ModelBox(bone8, 12, 83, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 93, 12, -1.0F, -1.0F, 10.0F, 1, 1, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 93, 8, -1.0F, -1.0F, 2.5F, 1, 1, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 93, 6, -1.0F, -1.0F, 4.0F, 1, 1, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 93, 4, -1.0F, -1.0F, 5.5F, 1, 1, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 4, 93, -1.0F, -1.0F, 7.0F, 1, 1, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 93, 2, -1.0F, -1.0F, 8.5F, 1, 1, 1, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone7.addChild(bone9);
		setRotationAngle(bone9, 0.0F, 0.0F, 0.3491F);
		bone9.cubeList.add(new ModelBox(bone9, 6, 83, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 93, 0, -1.0F, 0.0F, 10.0F, 1, 1, 1, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 0, 93, -1.0F, 0.0F, 2.5F, 1, 1, 1, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 90, 92, -1.0F, 0.0F, 4.0F, 1, 1, 1, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 92, 88, -1.0F, 0.0F, 5.5F, 1, 1, 1, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 86, 92, -1.0F, 0.0F, 7.0F, 1, 1, 1, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 80, 92, -1.0F, 0.0F, 8.5F, 1, 1, 1, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-1.3F, -25.9F, -16.1F);
		receiver.addChild(bone2);
		setRotationAngle(bone2, -0.4363F, 0.0F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 90, 74, 2.4F, -11.542F, 20.2412F, 1, 1, 1, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 90, 72, -0.8F, -11.542F, 20.2412F, 1, 1, 1, 0.0F, false));

		stock = new ModelRenderer(this);
		stock.setRotationPoint(0.0F, 24.0F, 0.0F);
		stock.cubeList.add(new ModelBox(stock, 37, 82, -2.45F, -30.351F, 11.45F, 1, 5, 1, 0.0F, false));

		gun70_r1 = new ModelRenderer(this);
		gun70_r1.setRotationPoint(-0.8F, -30.75F, 10.4F);
		stock.addChild(gun70_r1);
		setRotationAngle(gun70_r1, 0.0873F, 0.0349F, 1.1519F);
		gun70_r1.cubeList.add(new ModelBox(gun70_r1, 75, 74, 0.0F, 0.0F, 1.0F, 1, 1, 3, 0.0F, false));

		gun71_r1 = new ModelRenderer(this);
		gun71_r1.setRotationPoint(-0.6F, -30.75F, 14.4F);
		stock.addChild(gun71_r1);
		setRotationAngle(gun71_r1, -0.0175F, 0.1222F, 1.0123F);
		gun71_r1.cubeList.add(new ModelBox(gun71_r1, 65, 72, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		gun70_r2 = new ModelRenderer(this);
		gun70_r2.setRotationPoint(0.6F, -30.75F, 14.4F);
		stock.addChild(gun70_r2);
		setRotationAngle(gun70_r2, -0.0175F, -0.1222F, -1.0123F);
		gun70_r2.cubeList.add(new ModelBox(gun70_r2, 70, 73, -1.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		gun69_r2 = new ModelRenderer(this);
		gun69_r2.setRotationPoint(0.8F, -30.75F, 10.4F);
		stock.addChild(gun69_r2);
		setRotationAngle(gun69_r2, 0.0873F, -0.0349F, -1.1519F);
		gun69_r2.cubeList.add(new ModelBox(gun69_r2, 7, 76, -1.0F, 0.0F, 1.0F, 1, 1, 3, 0.0F, false));

		gun77_r1 = new ModelRenderer(this);
		gun77_r1.setRotationPoint(-1.4F, -30.351F, 14.4F);
		stock.addChild(gun77_r1);
		setRotationAngle(gun77_r1, -0.1309F, -0.0349F, 0.0F);
		gun77_r1.cubeList.add(new ModelBox(gun77_r1, 32, 83, 1.799F, 2.551F, 1.3F, 1, 1, 1, 0.0F, false));

		gun76_r1 = new ModelRenderer(this);
		gun76_r1.setRotationPoint(-1.4F, -30.351F, 14.4F);
		stock.addChild(gun76_r1);
		setRotationAngle(gun76_r1, -0.1309F, 0.0349F, 0.0F);
		gun76_r1.cubeList.add(new ModelBox(gun76_r1, 83, 38, -0.001F, 2.551F, 1.4F, 1, 1, 1, 0.0F, false));
		gun76_r1.cubeList.add(new ModelBox(gun76_r1, 33, 85, -0.001F, 2.551F, 2.0F, 1, 1, 1, 0.0F, false));
		gun76_r1.cubeList.add(new ModelBox(gun76_r1, 16, 0, 0.0F, 1.001F, 2.0F, 1, 2, 1, 0.0F, false));
		gun76_r1.cubeList.add(new ModelBox(gun76_r1, 74, 13, 0.0F, 0.001F, 0.0F, 1, 1, 3, 0.0F, false));

		gun73_r2 = new ModelRenderer(this);
		gun73_r2.setRotationPoint(0.4F, -30.351F, 14.4F);
		stock.addChild(gun73_r2);
		setRotationAngle(gun73_r2, -0.1309F, -0.0349F, 0.0F);
		gun73_r2.cubeList.add(new ModelBox(gun73_r2, 32, 60, 0.0F, 0.001F, 0.0F, 1, 1, 3, 0.0F, false));
		gun73_r2.cubeList.add(new ModelBox(gun73_r2, 6, 89, 0.001F, 2.551F, 2.0F, 1, 1, 1, 0.0F, false));
		gun73_r2.cubeList.add(new ModelBox(gun73_r2, 9, 36, 0.0F, 1.001F, 2.0F, 1, 2, 1, 0.0F, false));

		gun77_r2 = new ModelRenderer(this);
		gun77_r2.setRotationPoint(0.4F, -30.351F, 14.4F);
		stock.addChild(gun77_r2);
		setRotationAngle(gun77_r2, 0.7592F, -0.0349F, 0.0F);
		gun77_r2.cubeList.add(new ModelBox(gun77_r2, 83, 10, 0.001F, 2.651F, -2.15F, 1, 1, 1, 0.0F, false));
		gun77_r2.cubeList.add(new ModelBox(gun77_r2, 77, 68, 0.0F, 2.651F, -3.4F, 1, 1, 2, 0.0F, false));

		gun76_r2 = new ModelRenderer(this);
		gun76_r2.setRotationPoint(0.4F, -30.351F, 14.4F);
		stock.addChild(gun76_r2);
		setRotationAngle(gun76_r2, 0.7592F, 0.0349F, 0.0F);
		gun76_r2.cubeList.add(new ModelBox(gun76_r2, 83, 36, -1.799F, 2.651F, -2.15F, 1, 1, 1, 0.0F, false));
		gun76_r2.cubeList.add(new ModelBox(gun76_r2, 81, 3, -1.8F, 2.651F, -3.4F, 1, 1, 2, 0.0F, false));

		gun71_r2 = new ModelRenderer(this);
		gun71_r2.setRotationPoint(-0.4F, -30.751F, 14.4F);
		stock.addChild(gun71_r2);
		setRotationAngle(gun71_r2, -0.1309F, -0.0349F, 0.0F);
		gun71_r2.cubeList.add(new ModelBox(gun71_r2, 74, 59, 0.0F, 0.0009F, 0.0F, 1, 1, 3, 0.0F, false));

		gun70_r3 = new ModelRenderer(this);
		gun70_r3.setRotationPoint(-0.6F, -30.751F, 14.4F);
		stock.addChild(gun70_r3);
		setRotationAngle(gun70_r3, -0.1309F, 0.0349F, 0.0F);
		gun70_r3.cubeList.add(new ModelBox(gun70_r3, 43, 75, 0.0F, 0.001F, 0.0F, 1, 1, 3, 0.0F, false));

		gun70_r4 = new ModelRenderer(this);
		gun70_r4.setRotationPoint(-0.8F, -26.351F, 11.4F);
		stock.addChild(gun70_r4);
		setRotationAngle(gun70_r4, 0.0F, 0.0698F, 0.0F);
		gun70_r4.cubeList.add(new ModelBox(gun70_r4, 56, 20, 0.0F, -0.0005F, 0.0F, 1, 1, 3, 0.0F, false));
		gun70_r4.cubeList.add(new ModelBox(gun70_r4, 22, 76, 0.0F, -4.4005F, 0.0F, 1, 1, 3, 0.0F, false));

		gun69_r3 = new ModelRenderer(this);
		gun69_r3.setRotationPoint(0.8F, -26.351F, 11.4F);
		stock.addChild(gun69_r3);
		setRotationAngle(gun69_r3, 0.0F, -0.0698F, 0.0F);
		gun69_r3.cubeList.add(new ModelBox(gun69_r3, 8, 55, -1.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));
		gun69_r3.cubeList.add(new ModelBox(gun69_r3, 48, 76, -1.0F, -4.4F, 0.0F, 1, 1, 3, 0.0F, false));

		gun69_r4 = new ModelRenderer(this);
		gun69_r4.setRotationPoint(-2.45F, -30.351F, 12.45F);
		stock.addChild(gun69_r4);
		setRotationAngle(gun69_r4, 0.0F, -0.6632F, 0.0F);
		gun69_r4.cubeList.add(new ModelBox(gun69_r4, 0, 86, 0.0F, 4.001F, -1.0F, 2, 1, 1, 0.0F, false));
		gun69_r4.cubeList.add(new ModelBox(gun69_r4, 6, 86, 0.0F, 0.001F, -1.0F, 2, 1, 1, 0.0F, false));

		gun69_r5 = new ModelRenderer(this);
		gun69_r5.setRotationPoint(-2.45F, -30.351F, 12.45F);
		stock.addChild(gun69_r5);
		setRotationAngle(gun69_r5, 0.0F, -0.4712F, 0.0F);
		gun69_r5.cubeList.add(new ModelBox(gun69_r5, 56, 0, 0.0F, 1.001F, -1.0F, 2, 3, 1, 0.0F, false));

		gun66_r1 = new ModelRenderer(this);
		gun66_r1.setRotationPoint(-1.75F, -30.351F, 9.45F);
		stock.addChild(gun66_r1);
		setRotationAngle(gun66_r1, 0.0F, 0.0698F, 0.0F);
		gun66_r1.cubeList.add(new ModelBox(gun66_r1, 0, 10, 0.0F, 0.0F, 2.0F, 1, 5, 3, 0.0F, false));

		gun65_r2 = new ModelRenderer(this);
		gun65_r2.setRotationPoint(1.75F, -30.351F, 9.45F);
		stock.addChild(gun65_r2);
		setRotationAngle(gun65_r2, 0.0F, -0.0698F, 0.0F);
		gun65_r2.cubeList.add(new ModelBox(gun65_r2, 11, 0, -1.0F, 0.0F, 2.0F, 1, 5, 3, 0.0F, false));

		gun29_r2 = new ModelRenderer(this);
		gun29_r2.setRotationPoint(-1.0F, -29.0F, 11.7F);
		stock.addChild(gun29_r2);
		setRotationAngle(gun29_r2, 0.4538F, 0.0F, 0.0F);
		gun29_r2.cubeList.add(new ModelBox(gun29_r2, 65, 65, 0.0F, -0.4384F, -0.8988F, 2, 4, 3, 0.0F, false));

		gun61_r1 = new ModelRenderer(this);
		gun61_r1.setRotationPoint(0.501F, -22.601F, 25.5F);
		stock.addChild(gun61_r1);
		setRotationAngle(gun61_r1, 0.9425F, 0.0F, 0.0F);
		gun61_r1.cubeList.add(new ModelBox(gun61_r1, 0, 0, -0.999F, -4.6F, 0.0F, 1, 6, 3, 0.0F, false));

		gun60_r1 = new ModelRenderer(this);
		gun60_r1.setRotationPoint(0.501F, -18.701F, 26.0F);
		stock.addChild(gun60_r1);
		setRotationAngle(gun60_r1, 0.1047F, 0.0F, 0.0F);
		gun60_r1.cubeList.add(new ModelBox(gun60_r1, 22, 7, -1.002F, -4.8F, 0.9F, 1, 5, 2, 0.0F, false));

		gun59_r1 = new ModelRenderer(this);
		gun59_r1.setRotationPoint(0.501F, -18.701F, 26.0F);
		stock.addChild(gun59_r1);
		setRotationAngle(gun59_r1, -0.1222F, 0.0F, 0.0F);
		gun59_r1.cubeList.add(new ModelBox(gun59_r1, 82, 20, -1.001F, -6.0F, 0.9F, 1, 6, 1, 0.0F, false));

		gun59_r2 = new ModelRenderer(this);
		gun59_r2.setRotationPoint(0.501F, -25.301F, 20.4F);
		stock.addChild(gun59_r2);
		setRotationAngle(gun59_r2, 0.7679F, 0.0F, 0.0F);
		gun59_r2.cubeList.add(new ModelBox(gun59_r2, 5, 10, -0.999F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun60_r2 = new ModelRenderer(this);
		gun60_r2.setRotationPoint(1.001F, -24.701F, 22.1F);
		stock.addChild(gun60_r2);
		setRotationAngle(gun60_r2, -0.6807F, 0.0F, 0.0F);
		gun60_r2.cubeList.add(new ModelBox(gun60_r2, 29, 55, -2.0F, -1.0F, -0.2F, 2, 1, 4, 0.0F, false));

		gun60_r3 = new ModelRenderer(this);
		gun60_r3.setRotationPoint(1.001F, -25.401F, 24.6F);
		stock.addChild(gun60_r3);
		setRotationAngle(gun60_r3, -0.6283F, 0.0F, 0.0F);
		gun60_r3.cubeList.add(new ModelBox(gun60_r3, 51, 54, -2.002F, 0.0F, 0.0F, 2, 2, 2, 0.0F, false));

		gun60_r4 = new ModelRenderer(this);
		gun60_r4.setRotationPoint(1.001F, -24.901F, 20.5F);
		stock.addChild(gun60_r4);
		setRotationAngle(gun60_r4, -0.1222F, 0.0F, 0.0F);
		gun60_r4.cubeList.add(new ModelBox(gun60_r4, 53, 76, -2.001F, 0.0F, 4.8F, 2, 2, 1, 0.0F, false));
		gun60_r4.cubeList.add(new ModelBox(gun60_r4, 65, 57, -2.001F, -1.0F, 0.0F, 2, 1, 4, 0.0F, false));

		gun58_r1 = new ModelRenderer(this);
		gun58_r1.setRotationPoint(0.501F, -25.301F, 20.4F);
		stock.addChild(gun58_r1);
		setRotationAngle(gun58_r1, -0.1222F, 0.0F, 0.0F);
		gun58_r1.cubeList.add(new ModelBox(gun58_r1, 0, 0, -1.001F, -1.0F, 0.0F, 1, 1, 9, 0.0F, false));

		gun57_r1 = new ModelRenderer(this);
		gun57_r1.setRotationPoint(0.501F, -26.401F, 18.5F);
		stock.addChild(gun57_r1);
		setRotationAngle(gun57_r1, -0.1222F, 0.0F, 0.0F);
		gun57_r1.cubeList.add(new ModelBox(gun57_r1, 93, 0, -1.0F, -1.0F, 0.0F, 1, 1, 11, 0.0F, false));

		gun59_r3 = new ModelRenderer(this);
		gun59_r3.setRotationPoint(0.201F, -29.901F, 18.9F);
		stock.addChild(gun59_r3);
		setRotationAngle(gun59_r3, -0.1222F, 0.0F, 0.0F);
		gun59_r3.cubeList.add(new ModelBox(gun59_r3, 85, 42, -1.4F, 0.299F, 0.001F, 2, 3, 12, 0.0F, false));
		gun59_r3.cubeList.add(new ModelBox(gun59_r3, 66, 20, -1.7F, 1.6F, 9.9F, 2, 9, 1, -0.3F, false));
		gun59_r3.cubeList.add(new ModelBox(gun59_r3, 65, 82, -1.7F, 8.0F, 10.3F, 1, 1, 1, -0.3F, false));
		gun59_r3.cubeList.add(new ModelBox(gun59_r3, 71, 82, -1.7F, 5.6F, 10.3F, 1, 1, 1, -0.3F, false));
		gun59_r3.cubeList.add(new ModelBox(gun59_r3, 59, 82, 0.3F, 8.0F, 10.3F, 1, 1, 1, -0.3F, false));
		gun59_r3.cubeList.add(new ModelBox(gun59_r3, 83, 0, 0.3F, 5.6F, 10.3F, 1, 1, 1, -0.3F, false));
		gun59_r3.cubeList.add(new ModelBox(gun59_r3, 67, 0, -0.7F, 1.6F, 9.9F, 2, 9, 1, -0.3F, false));
		gun59_r3.cubeList.add(new ModelBox(gun59_r3, 14, 22, -1.4F, 2.5F, 10.4F, 1, 8, 1, -0.2F, false));
		gun59_r3.cubeList.add(new ModelBox(gun59_r3, 14, 31, 0.0F, 2.5F, 10.4F, 1, 8, 1, -0.2F, false));
		gun59_r3.cubeList.add(new ModelBox(gun59_r3, 37, 64, -1.4F, 3.301F, 11.001F, 1, 7, 1, 0.0F, false));
		gun59_r3.cubeList.add(new ModelBox(gun59_r3, 35, 47, -1.0F, 3.3F, 11.0F, 2, 7, 1, 0.0F, false));
		gun59_r3.cubeList.add(new ModelBox(gun59_r3, 86, 88, 0.0F, 0.3F, 0.0F, 1, 3, 12, 0.0F, false));
		gun59_r3.cubeList.add(new ModelBox(gun59_r3, 85, 57, -0.7F, 0.0F, 0.0F, 1, 1, 12, 0.0F, false));

		gun60_r5 = new ModelRenderer(this);
		gun60_r5.setRotationPoint(-0.499F, -29.901F, 18.9F);
		stock.addChild(gun60_r5);
		setRotationAngle(gun60_r5, -0.0436F, 0.11F, 1.1519F);
		gun60_r5.cubeList.add(new ModelBox(gun60_r5, 43, 47, -0.101F, -0.1F, 6.1F, 1, 1, 6, -0.1F, false));
		gun60_r5.cubeList.add(new ModelBox(gun60_r5, 22, 7, -0.1F, -0.1F, -0.1F, 1, 1, 7, -0.1F, false));

		gun59_r4 = new ModelRenderer(this);
		gun59_r4.setRotationPoint(0.501F, -29.901F, 18.9F);
		stock.addChild(gun59_r4);
		setRotationAngle(gun59_r4, -0.0436F, -0.11F, -1.1519F);
		gun59_r4.cubeList.add(new ModelBox(gun59_r4, 43, 54, -0.901F, -0.1F, 6.1F, 1, 1, 6, -0.1F, false));
		gun59_r4.cubeList.add(new ModelBox(gun59_r4, 24, 22, -0.9F, -0.1F, -0.1F, 1, 1, 7, -0.1F, false));

		gun62_r1 = new ModelRenderer(this);
		gun62_r1.setRotationPoint(0.501F, -31.501F, 19.7F);
		stock.addChild(gun62_r1);
		setRotationAngle(gun62_r1, -0.1222F, 0.0F, 0.0F);
		gun62_r1.cubeList.add(new ModelBox(gun62_r1, 4, 83, -2.0F, 4.0F, 3.0F, 1, 1, 1, 0.0F, false));
		gun62_r1.cubeList.add(new ModelBox(gun62_r1, 46, 27, -2.0F, 3.0F, 4.0F, 1, 2, 6, 0.0F, false));
		gun62_r1.cubeList.add(new ModelBox(gun62_r1, 52, 117, -2.0F, 1.0F, 0.0F, 1, 2, 10, 0.0F, false));
		gun62_r1.cubeList.add(new ModelBox(gun62_r1, 10, 83, 0.0F, 4.0F, 3.0F, 1, 1, 1, 0.0F, false));
		gun62_r1.cubeList.add(new ModelBox(gun62_r1, 0, 47, 0.0F, 3.0F, 4.0F, 1, 2, 6, 0.0F, false));
		gun62_r1.cubeList.add(new ModelBox(gun62_r1, 0, 126, 0.0F, 1.0F, 0.0F, 1, 2, 10, 0.0F, false));
		gun62_r1.cubeList.add(new ModelBox(gun62_r1, 140, 80, -1.0F, 0.0F, 0.0F, 1, 1, 10, 0.0F, false));

		gun61_r2 = new ModelRenderer(this);
		gun61_r2.setRotationPoint(-0.499F, -31.501F, 19.7F);
		stock.addChild(gun61_r2);
		setRotationAngle(gun61_r2, -0.0873F, -0.0855F, -0.7854F);
		gun61_r2.cubeList.add(new ModelBox(gun61_r2, 26, 102, -1.401F, 0.001F, 0.001F, 1, 1, 10, 0.0F, false));
		gun61_r2.cubeList.add(new ModelBox(gun61_r2, 120, 139, -1.0F, 0.0F, 0.0F, 1, 1, 10, 0.0F, false));

		gun60_r6 = new ModelRenderer(this);
		gun60_r6.setRotationPoint(0.501F, -31.501F, 19.7F);
		stock.addChild(gun60_r6);
		setRotationAngle(gun60_r6, -0.0873F, -0.0855F, -0.7854F);
		gun60_r6.cubeList.add(new ModelBox(gun60_r6, 26, 127, -1.001F, 0.401F, 0.001F, 1, 1, 10, 0.0F, false));
		gun60_r6.cubeList.add(new ModelBox(gun60_r6, 140, 69, -1.0F, 0.0F, 0.0F, 1, 1, 10, 0.0F, false));

		gun56_r1 = new ModelRenderer(this);
		gun56_r1.setRotationPoint(1.001F, -26.601F, 12.5F);
		stock.addChild(gun56_r1);
		setRotationAngle(gun56_r1, -0.1222F, 0.0F, 0.0F);
		gun56_r1.cubeList.add(new ModelBox(gun56_r1, 46, 0, -2.0F, -3.8F, 0.0F, 2, 3, 17, 0.0F, false));

		action = new ModelRenderer(this);
		action.setRotationPoint(1.4F, -5.9F, -16.4F);
		action.cubeList.add(new ModelBox(action, 0, 89, -1.0F, -2.0F, 0.0F, 1, 2, 11, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 85, 83, 0.7F, -1.75F, -0.4F, 2, 1, 1, -0.4F, false));
		action.cubeList.add(new ModelBox(action, 43, 79, 0.7F, -1.25F, -0.4F, 2, 1, 1, -0.4F, false));
		action.cubeList.add(new ModelBox(action, 85, 77, 0.7F, -1.75F, 0.2F, 2, 1, 1, -0.4F, false));
		action.cubeList.add(new ModelBox(action, 47, 82, 1.7F, -1.701F, -0.1F, 1, 1, 1, -0.3F, false));
		action.cubeList.add(new ModelBox(action, 79, 60, 1.7F, -1.301F, -0.1F, 1, 1, 1, -0.3F, false));
		action.cubeList.add(new ModelBox(action, 79, 58, 1.701F, -1.601F, 0.101F, 1, 1, 1, -0.3F, false));
		action.cubeList.add(new ModelBox(action, 78, 22, 1.701F, -1.601F, -0.299F, 1, 1, 1, -0.3F, false));
		action.cubeList.add(new ModelBox(action, 55, 79, 1.702F, -1.401F, 0.099F, 1, 1, 1, -0.3F, false));
		action.cubeList.add(new ModelBox(action, 78, 20, 1.702F, -1.401F, -0.301F, 1, 1, 1, -0.3F, false));
		action.cubeList.add(new ModelBox(action, 43, 85, 0.7F, -1.25F, 0.2F, 2, 1, 1, -0.4F, false));
		action.cubeList.add(new ModelBox(action, 85, 73, 0.7F, -1.8F, 0.0F, 2, 1, 1, -0.4F, false));
		action.cubeList.add(new ModelBox(action, 61, 85, 0.7F, -1.2F, 0.0F, 2, 1, 1, -0.4F, false));
		action.cubeList.add(new ModelBox(action, 85, 71, 0.7F, -1.8F, -0.2F, 2, 1, 1, -0.4F, false));
		action.cubeList.add(new ModelBox(action, 67, 85, 0.7F, -1.2F, -0.2F, 2, 1, 1, -0.4F, false));
		action.cubeList.add(new ModelBox(action, 85, 81, -0.1F, -1.75F, -0.401F, 2, 1, 1, -0.4F, false));
		action.cubeList.add(new ModelBox(action, 75, 78, -0.1F, -1.25F, -0.401F, 2, 1, 1, -0.4F, false));
		action.cubeList.add(new ModelBox(action, 85, 79, -0.1F, -1.75F, 0.199F, 2, 1, 1, -0.4F, false));
		action.cubeList.add(new ModelBox(action, 78, 39, -0.1F, -1.25F, 0.199F, 2, 1, 1, -0.4F, false));
		action.cubeList.add(new ModelBox(action, 85, 75, -0.1F, -1.801F, -0.001F, 2, 1, 1, -0.4F, false));
		action.cubeList.add(new ModelBox(action, 49, 85, -0.1F, -1.201F, -0.001F, 2, 1, 1, -0.4F, false));
		action.cubeList.add(new ModelBox(action, 73, 85, -0.1F, -1.801F, -0.201F, 2, 1, 1, -0.4F, false));
		action.cubeList.add(new ModelBox(action, 55, 85, -0.1F, -1.201F, -0.201F, 2, 1, 1, -0.4F, false));
		action.cubeList.add(new ModelBox(action, 53, 82, -0.2F, -1.5F, -0.1F, 1, 1, 1, -0.2F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		gun.render(f5);
//		receiver.render(f5);
//		stock.render(f5);
//		action.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}