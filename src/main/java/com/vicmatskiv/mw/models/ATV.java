package com.vicmatskiv.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class ATV extends ModelBase {
	private final ModelRenderer ATV_total;
	private final ModelRenderer frame;
	private final ModelRenderer bone25;
	private final ModelRenderer bone26;
	private final ModelRenderer bone27;
	private final ModelRenderer bone28;
	private final ModelRenderer bone29;
	private final ModelRenderer bone69;
	private final ModelRenderer bone53;
	private final ModelRenderer bone24;
	private final ModelRenderer bone30;
	private final ModelRenderer bone51;
	private final ModelRenderer bone31;
	private final ModelRenderer bone32;
	private final ModelRenderer bone33;
	private final ModelRenderer bone66;
	private final ModelRenderer bone67;
	private final ModelRenderer bone68;
	private final ModelRenderer bone34;
	private final ModelRenderer bone36;
	private final ModelRenderer bone37;
	private final ModelRenderer bone35;
	private final ModelRenderer bone54;
	private final ModelRenderer bone10;
	private final ModelRenderer bone12;
	private final ModelRenderer bone13;
	private final ModelRenderer bone14;
	private final ModelRenderer bone17;
	private final ModelRenderer bone15;
	private final ModelRenderer bone16;
	private final ModelRenderer bone11;
	private final ModelRenderer bone18;
	private final ModelRenderer bone19;
	private final ModelRenderer bone58;
	private final ModelRenderer bone59;
	private final ModelRenderer bone20;
	private final ModelRenderer bone22;
	private final ModelRenderer bone21;
	private final ModelRenderer bone23;
	private final ModelRenderer bone52;
	private final ModelRenderer bone50;
	private final ModelRenderer bone49;
	private final ModelRenderer bone48;
	private final ModelRenderer bone47;
	private final ModelRenderer frame2;
	private final ModelRenderer ATV;
	private final ModelRenderer bone;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer bone5;
	private final ModelRenderer bone6;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;
	private final ModelRenderer bone2;
	private final ModelRenderer ATV2;
	private final ModelRenderer bone38;
	private final ModelRenderer bone39;
	private final ModelRenderer bone40;
	private final ModelRenderer bone41;
	private final ModelRenderer bone42;
	private final ModelRenderer bone43;
	private final ModelRenderer bone44;
	private final ModelRenderer bone45;
	private final ModelRenderer bone46;
	private final ModelRenderer frame3;
	private final ModelRenderer bone55;
	private final ModelRenderer bone60;
	private final ModelRenderer bone61;
	private final ModelRenderer bone62;
	private final ModelRenderer bone56;
	private final ModelRenderer bone57;
	private final ModelRenderer frame4;
	private final ModelRenderer bone63;
	private final ModelRenderer bone64;
	private final ModelRenderer bone65;
	private final ModelRenderer seat;
	private final ModelRenderer bone70;
	private final ModelRenderer bone71;
	private final ModelRenderer bone72;
	private final ModelRenderer bone73;
	private final ModelRenderer bone74;
	private final ModelRenderer bone75;

	public ATV() {
		textureWidth = 256;
		textureHeight = 256;

		ATV_total = new ModelRenderer(this);
		ATV_total.setRotationPoint(0.0F, 17.0F, 0.0F);
		

		frame = new ModelRenderer(this);
		frame.setRotationPoint(0.0F, 0.0F, 0.0F);
		ATV_total.addChild(frame);
		

		bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(0.0F, -16.0F, 7.0F);
		frame.addChild(bone25);
		setRotationAngle(bone25, 0.1745F, 0.0F, 0.0F);
		bone25.cubeList.add(new ModelBox(bone25, 134, 91, -6.0F, 0.8112F, 1.8F, 12, 7, 8, 0.0F, false));
		bone25.cubeList.add(new ModelBox(bone25, 100, 155, -4.5F, 0.8112F, -1.2F, 9, 7, 3, 0.0F, false));

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(0.5F, 2.2862F, 8.2861F);
		bone25.addChild(bone26);
		setRotationAngle(bone26, -0.4363F, 0.0F, 0.0F);
		bone26.cubeList.add(new ModelBox(bone26, 0, 77, -6.5F, 2.4161F, 0.8422F, 12, 10, 17, 0.0F, false));

		bone27 = new ModelRenderer(this);
		bone27.setRotationPoint(0.0F, 0.898F, -0.6661F);
		bone25.addChild(bone27);
		setRotationAngle(bone27, -0.3491F, 0.0F, 0.0F);
		bone27.cubeList.add(new ModelBox(bone27, 144, 131, -4.0F, -3.0F, 0.0F, 8, 3, 8, 0.0F, false));

		bone28 = new ModelRenderer(this);
		bone28.setRotationPoint(-0.5F, 1.7091F, 1.8245F);
		bone27.addChild(bone28);
		setRotationAngle(bone28, 0.3491F, 0.1745F, 0.0F);
		bone28.cubeList.add(new ModelBox(bone28, 0, 12, -1.0F, -5.0071F, 0.8415F, 5, 4, 8, 0.0F, false));

		bone29 = new ModelRenderer(this);
		bone29.setRotationPoint(-3.5F, 1.8394F, 1.0859F);
		bone27.addChild(bone29);
		setRotationAngle(bone29, 0.3491F, -0.1745F, 0.0F);
		bone29.cubeList.add(new ModelBox(bone29, 0, 0, 0.0F, -5.1374F, 0.9301F, 5, 4, 8, 0.0F, false));

		bone69 = new ModelRenderer(this);
		bone69.setRotationPoint(0.0F, -1.796F, -1.3321F);
		bone27.addChild(bone69);
		setRotationAngle(bone69, -0.6109F, 0.0F, 0.0F);
		bone69.cubeList.add(new ModelBox(bone69, 99, 24, -3.0F, -6.702F, 0.4482F, 6, 5, 4, 0.0F, false));

		bone53 = new ModelRenderer(this);
		bone53.setRotationPoint(0.0F, 0.0F, 0.0F);
		frame.addChild(bone53);
		

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(-13.5F, -13.83F, 10.65F);
		bone53.addChild(bone24);
		setRotationAngle(bone24, 0.6109F, 0.0F, 0.0F);
		bone24.cubeList.add(new ModelBox(bone24, 93, 80, -0.5F, 0.33F, -1.0F, 28, 9, 2, 0.0F, false));

		bone30 = new ModelRenderer(this);
		bone30.setRotationPoint(-1.0F, 9.4107F, -0.0155F);
		bone24.addChild(bone30);
		setRotationAngle(bone30, -0.3491F, 0.0F, 0.0F);
		bone30.cubeList.add(new ModelBox(bone30, 90, 52, -0.5F, -1.0F, -1.0F, 30, 8, 2, 0.0F, false));

		bone51 = new ModelRenderer(this);
		bone51.setRotationPoint(3.0F, 0.0F, 0.0F);
		bone24.addChild(bone51);
		setRotationAngle(bone51, 2.7925F, 0.0F, 0.0F);
		bone51.cubeList.add(new ModelBox(bone51, 0, 48, -2.0F, -1.0F, 5.0F, 25, 1, 13, 0.0F, false));
		bone51.cubeList.add(new ModelBox(bone51, 90, 62, -3.0F, -1.0F, -1.0F, 27, 1, 6, 0.0F, false));

		bone31 = new ModelRenderer(this);
		bone31.setRotationPoint(14.5F, 1.0F, 17.0F);
		bone53.addChild(bone31);
		bone31.cubeList.add(new ModelBox(bone31, 0, 32, -29.0F, -2.75F, 0.0F, 29, 3, 13, 0.0F, false));

		bone32 = new ModelRenderer(this);
		bone32.setRotationPoint(-28.0F, 0.0F, 13.0F);
		bone31.addChild(bone32);
		setRotationAngle(bone32, 1.2217F, 0.0F, 0.0F);
		bone32.cubeList.add(new ModelBox(bone32, 44, 0, -1.5F, -2.0F, 0.0F, 30, 2, 11, 0.0F, false));

		bone33 = new ModelRenderer(this);
		bone33.setRotationPoint(0.0F, -2.0F, 11.0F);
		bone32.addChild(bone33);
		setRotationAngle(bone33, -1.0472F, 0.0F, 0.0F);
		bone33.cubeList.add(new ModelBox(bone33, 0, 62, 1.5F, 0.0F, 8.0F, 24, 3, 12, 0.0F, false));
		bone33.cubeList.add(new ModelBox(bone33, 44, 13, -1.0F, 0.0F, 0.0F, 29, 3, 8, 0.0F, false));

		bone66 = new ModelRenderer(this);
		bone66.setRotationPoint(0.0F, -1.3178F, -0.2753F);
		bone33.addChild(bone66);
		setRotationAngle(bone66, -0.0698F, 0.0F, 0.0F);
		bone66.cubeList.add(new ModelBox(bone66, 124, 0, 8.0F, -2.2486F, 10.0261F, 11, 4, 13, 0.0F, false));
		bone66.cubeList.add(new ModelBox(bone66, 53, 54, 10.0F, 2.0F, 0.0F, 7, 3, 23, 0.0F, false));

		bone67 = new ModelRenderer(this);
		bone67.setRotationPoint(0.0F, -0.9945F, 0.1045F);
		bone66.addChild(bone67);
		setRotationAngle(bone67, -0.0873F, 0.0F, 0.0F);
		bone67.cubeList.add(new ModelBox(bone67, 58, 80, 9.5F, 3.0479F, -1.0912F, 8, 9, 19, 0.0F, false));

		bone68 = new ModelRenderer(this);
		bone68.setRotationPoint(14.0F, 5.3657F, 20.9095F);
		bone67.addChild(bone68);
		setRotationAngle(bone68, -0.3491F, 0.0F, 0.0F);
		bone68.cubeList.add(new ModelBox(bone68, 149, 106, -7.0F, 0.6625F, -3.2208F, 13, 4, 4, 0.0F, false));

		bone34 = new ModelRenderer(this);
		bone34.setRotationPoint(0.0F, -0.75F, 13.0F);
		bone31.addChild(bone34);
		setRotationAngle(bone34, 0.0873F, 0.1745F, 0.0F);
		bone34.cubeList.add(new ModelBox(bone34, 0, 150, 0.0F, -3.0F, -13.0F, 3, 3, 13, 0.0F, false));

		bone36 = new ModelRenderer(this);
		bone36.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone34.addChild(bone36);
		setRotationAngle(bone36, 1.1345F, -0.3491F, 0.0F);
		bone36.cubeList.add(new ModelBox(bone36, 20, 154, 0.0F, -3.0F, 0.0F, 3, 3, 12, 0.0F, false));

		bone37 = new ModelRenderer(this);
		bone37.setRotationPoint(-28.067F, -0.4313F, -4.9301F);
		bone34.addChild(bone37);
		setRotationAngle(bone37, 1.1345F, 0.0F, 0.0F);
		bone37.cubeList.add(new ModelBox(bone37, 111, 136, -3.4924F, -3.0816F, -0.0297F, 3, 3, 12, 0.0F, false));

		bone35 = new ModelRenderer(this);
		bone35.setRotationPoint(-30.0F, -0.75F, 13.0F);
		bone31.addChild(bone35);
		setRotationAngle(bone35, 0.0873F, -0.1745F, 0.0F);
		bone35.cubeList.add(new ModelBox(bone35, 49, 149, -2.0F, -3.05F, -13.0F, 3, 3, 13, 0.0F, false));

		bone54 = new ModelRenderer(this);
		bone54.setRotationPoint(0.0F, 0.0F, 0.0F);
		frame.addChild(bone54);
		

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(0.5F, -12.75F, 5.75F);
		bone54.addChild(bone10);
		setRotationAngle(bone10, 0.0873F, 0.0F, 0.0F);
		bone10.cubeList.add(new ModelBox(bone10, 133, 115, -4.0F, -1.0F, -14.0F, 7, 1, 15, 0.0F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(3.0F, -1.0F, 0.0F);
		bone10.addChild(bone12);
		setRotationAngle(bone12, 0.0F, 0.0F, -0.7854F);
		bone12.cubeList.add(new ModelBox(bone12, 126, 136, -1.0F, 0.0F, -14.0F, 1, 4, 15, 0.0F, false));

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(-4.0F, -1.0F, 0.0F);
		bone10.addChild(bone13);
		setRotationAngle(bone13, 0.0F, 0.0F, 0.7854F);
		bone13.cubeList.add(new ModelBox(bone13, 94, 136, 0.0F, 0.0F, -14.0F, 1, 4, 15, 0.0F, false));

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(9.0F, 0.0F, 0.0F);
		bone10.addChild(bone14);
		setRotationAngle(bone14, 0.0873F, 0.0873F, 0.6109F);
		bone14.cubeList.add(new ModelBox(bone14, 22, 132, -0.963F, -1.2434F, -12.9692F, 2, 4, 18, 0.0F, false));

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(0.05F, -1.25F, -12.95F);
		bone14.addChild(bone17);
		setRotationAngle(bone17, 0.6807F, 0.3142F, 0.0F);
		bone17.cubeList.add(new ModelBox(bone17, 0, 104, -1.0F, 0.0F, -7.0F, 2, 4, 7, 0.0F, false));

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(-10.0F, 0.0F, 0.0F);
		bone10.addChild(bone15);
		setRotationAngle(bone15, 0.0873F, -0.0873F, -0.6109F);
		bone15.cubeList.add(new ModelBox(bone15, 0, 128, -0.963F, -1.2434F, -12.9692F, 2, 4, 18, 0.0F, false));

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(0.05F, -1.25F, -12.97F);
		bone15.addChild(bone16);
		setRotationAngle(bone16, 0.6807F, -0.3142F, 0.0F);
		bone16.cubeList.add(new ModelBox(bone16, 25, 104, -1.0F, 0.0F, -6.98F, 2, 4, 7, 0.0F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(0.0F, -1.0F, -14.0F);
		bone10.addChild(bone11);
		setRotationAngle(bone11, -0.8727F, 0.0F, 0.0F);
		bone11.cubeList.add(new ModelBox(bone11, 0, 77, -4.0F, 0.0F, 0.0F, 7, 4, 1, 0.0F, false));

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(3.0F, 4.0F, 0.0F);
		bone11.addChild(bone18);
		setRotationAngle(bone18, 0.0F, 0.0F, -0.5236F);
		bone18.cubeList.add(new ModelBox(bone18, 44, 4, -4.0F, -3.0F, -0.01F, 4, 3, 1, 0.0F, false));

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(-4.0F, 4.0F, 0.0F);
		bone11.addChild(bone19);
		setRotationAngle(bone19, 0.0F, 0.0F, 0.5236F);
		bone19.cubeList.add(new ModelBox(bone19, 44, 0, 0.0F, -3.0F, -0.01F, 4, 3, 1, 0.0F, false));

		bone58 = new ModelRenderer(this);
		bone58.setRotationPoint(3.0F, 1.0F, 0.0F);
		bone11.addChild(bone58);
		setRotationAngle(bone58, 0.0F, 0.6109F, 0.0F);
		bone58.cubeList.add(new ModelBox(bone58, 60, 62, -1.0F, -1.0F, 0.0F, 1, 4, 5, 0.0F, false));

		bone59 = new ModelRenderer(this);
		bone59.setRotationPoint(-4.0F, 1.0F, 0.0F);
		bone11.addChild(bone59);
		setRotationAngle(bone59, 0.0F, -0.6109F, 0.0F);
		bone59.cubeList.add(new ModelBox(bone59, 0, 62, 0.0F, -1.0F, 0.0F, 1, 4, 5, 0.0F, false));

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(16.0F, -1.3114F, 6.0463F);
		bone10.addChild(bone20);
		setRotationAngle(bone20, 0.1222F, 0.1396F, 0.0F);
		bone20.cubeList.add(new ModelBox(bone20, 0, 104, -3.202F, -0.0567F, -21.3262F, 2, 3, 21, 0.0F, false));

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(-0.7F, -0.0529F, -0.2654F);
		bone20.addChild(bone22);
		setRotationAngle(bone22, -1.0472F, -0.1745F, 0.0F);
		bone22.cubeList.add(new ModelBox(bone22, 162, 114, -2.4999F, -0.0059F, -0.0106F, 2, 3, 9, 0.0F, false));

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(-17.75F, -1.3332F, 5.7973F);
		bone10.addChild(bone21);
		setRotationAngle(bone21, 0.1222F, -0.1396F, 0.0F);
		bone21.cubeList.add(new ModelBox(bone21, 99, 13, 1.9762F, -0.0446F, -21.2402F, 2, 3, 21, 0.0F, false));

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(1.97F, -0.0386F, -0.2463F);
		bone21.addChild(bone23);
		setRotationAngle(bone23, -1.0472F, 0.1745F, 0.0F);
		bone23.cubeList.add(new ModelBox(bone23, 160, 142, 0.0F, 0.0F, 0.0F, 2, 3, 9, 0.0F, false));

		bone52 = new ModelRenderer(this);
		bone52.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone54.addChild(bone52);
		

		bone50 = new ModelRenderer(this);
		bone50.setRotationPoint(14.0F, -13.25F, 51.25F);
		bone52.addChild(bone50);
		setRotationAngle(bone50, 0.0873F, 0.1745F, 0.0F);
		bone50.cubeList.add(new ModelBox(bone50, 36, 104, -9.9848F, -1.0151F, -2.173F, 8, 1, 3, 0.0F, false));

		bone49 = new ModelRenderer(this);
		bone49.setRotationPoint(-11.0F, -13.25F, 51.5F);
		bone52.addChild(bone49);
		setRotationAngle(bone49, 0.0873F, -0.1745F, 0.0F);
		bone49.cubeList.add(new ModelBox(bone49, 90, 108, -1.2462F, -0.9962F, -1.9568F, 8, 1, 3, 0.0F, false));

		bone48 = new ModelRenderer(this);
		bone48.setRotationPoint(-16.75F, -11.25F, 32.0F);
		bone52.addChild(bone48);
		setRotationAngle(bone48, 0.1047F, 0.2618F, 0.0F);
		bone48.cubeList.add(new ModelBox(bone48, 26, 108, -0.2962F, -1.0045F, -0.0432F, 3, 3, 20, 0.0F, false));

		bone47 = new ModelRenderer(this);
		bone47.setRotationPoint(16.75F, -11.25F, 32.0F);
		bone52.addChild(bone47);
		setRotationAngle(bone47, 0.1047F, -0.2618F, 0.0F);
		bone47.cubeList.add(new ModelBox(bone47, 52, 111, -3.0F, -1.0F, 0.0F, 3, 3, 20, 0.0F, false));

		frame2 = new ModelRenderer(this);
		frame2.setRotationPoint(0.0F, 7.0F, 0.0F);
		ATV_total.addChild(frame2);
		

		ATV = new ModelRenderer(this);
		ATV.setRotationPoint(0.0F, -6.5F, 0.25F);
		frame2.addChild(ATV);
		setRotationAngle(ATV, 0.0873F, 0.0F, 0.0F);
		

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, -14.0F, -10.0F);
		ATV.addChild(bone);
		setRotationAngle(bone, 0.0F, 0.3142F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 66, 24, -10.0F, -1.15F, 0.0F, 10, 1, 1, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-0.5F, -14.0F, 4.0F);
		ATV.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 64, 108, -4.0F, -1.15F, 0.0F, 9, 1, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 159, 18, -2.0F, -1.05F, -13.0F, 1, 1, 13, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 159, 4, 2.0F, -1.05F, -13.0F, 1, 1, 13, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 150, 47, 6.25F, -1.05F, -11.8F, 1, 1, 15, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 66, 150, -6.25F, -1.05F, -11.8F, 1, 1, 15, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(4.5F, -14.0F, 4.0F);
		ATV.addChild(bone4);
		setRotationAngle(bone4, 0.0F, -0.9599F, 0.0F);
		bone4.cubeList.add(new ModelBox(bone4, 0, 59, 0.0F, -1.15F, 0.0F, 5, 1, 1, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-4.5F, -14.0F, 4.0F);
		ATV.addChild(bone5);
		setRotationAngle(bone5, 0.0F, 0.9599F, 0.0F);
		bone5.cubeList.add(new ModelBox(bone5, 0, 57, -5.0F, -1.15F, 0.0F, 5, 1, 1, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-6.55F, -14.0F, 8.67F);
		ATV.addChild(bone6);
		setRotationAngle(bone6, 0.0F, -0.4363F, 0.0F);
		bone6.cubeList.add(new ModelBox(bone6, 60, 71, -6.0F, -1.15F, -1.0F, 6, 1, 1, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(6.45F, -14.0F, 8.67F);
		ATV.addChild(bone7);
		setRotationAngle(bone7, 0.0F, 0.4363F, 0.0F);
		bone7.cubeList.add(new ModelBox(bone7, 70, 30, 0.09F, -1.15F, -0.955F, 6, 1, 1, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(11.99F, -14.0F, 6.135F);
		ATV.addChild(bone8);
		setRotationAngle(bone8, 0.0F, 0.1745F, 0.0F);
		bone8.cubeList.add(new ModelBox(bone8, 158, 160, -1.0F, -1.15F, -13.005F, 1, 1, 13, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(-12.01F, -14.0F, 6.135F);
		ATV.addChild(bone9);
		setRotationAngle(bone9, 0.0F, -0.1745F, 0.0F);
		bone9.cubeList.add(new ModelBox(bone9, 159, 32, 0.02F, -1.15F, -13.005F, 1, 1, 13, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, -14.0F, -10.0F);
		ATV.addChild(bone2);
		setRotationAngle(bone2, 0.0F, -0.3142F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 63, 52, 0.0F, -1.15F, 0.0F, 10, 1, 1, 0.0F, false));

		ATV2 = new ModelRenderer(this);
		ATV2.setRotationPoint(0.0F, -7.75F, 47.0F);
		frame2.addChild(ATV2);
		setRotationAngle(ATV2, -0.0873F, 3.1416F, 0.0F);
		

		bone38 = new ModelRenderer(this);
		bone38.setRotationPoint(0.0F, -14.0F, -10.0F);
		ATV2.addChild(bone38);
		setRotationAngle(bone38, 0.0F, 0.3142F, 0.0F);
		bone38.cubeList.add(new ModelBox(bone38, 44, 24, -9.6922F, -0.9128F, -0.9474F, 10, 1, 1, 0.0F, false));

		bone39 = new ModelRenderer(this);
		bone39.setRotationPoint(-0.5F, -14.0F, 4.0F);
		ATV2.addChild(bone39);
		bone39.cubeList.add(new ModelBox(bone39, 99, 45, -4.0F, -0.9128F, -0.9962F, 9, 1, 1, 0.0F, false));
		bone39.cubeList.add(new ModelBox(bone39, 143, 159, -2.0F, -0.8628F, -13.9962F, 1, 1, 13, 0.0F, false));
		bone39.cubeList.add(new ModelBox(bone39, 128, 156, 2.0F, -0.8628F, -13.9962F, 1, 1, 13, 0.0F, false));
		bone39.cubeList.add(new ModelBox(bone39, 143, 143, 6.25F, -0.8628F, -12.7962F, 1, 1, 15, 0.0F, false));
		bone39.cubeList.add(new ModelBox(bone39, 142, 31, -6.25F, -0.8628F, -12.7962F, 1, 1, 15, 0.0F, false));

		bone40 = new ModelRenderer(this);
		bone40.setRotationPoint(4.5F, -14.0F, 4.0F);
		ATV2.addChild(bone40);
		setRotationAngle(bone40, 0.0F, -0.9599F, 0.0F);
		bone40.cubeList.add(new ModelBox(bone40, 0, 43, -0.816F, -0.9128F, -0.5714F, 5, 1, 1, 0.0F, false));

		bone41 = new ModelRenderer(this);
		bone41.setRotationPoint(-4.5F, -14.0F, 4.0F);
		ATV2.addChild(bone41);
		setRotationAngle(bone41, 0.0F, 0.9599F, 0.0F);
		bone41.cubeList.add(new ModelBox(bone41, 0, 41, -4.184F, -0.9128F, -0.5714F, 5, 1, 1, 0.0F, false));

		bone42 = new ModelRenderer(this);
		bone42.setRotationPoint(-6.55F, -14.0F, 8.67F);
		ATV2.addChild(bone42);
		setRotationAngle(bone42, 0.0F, -0.4363F, 0.0F);
		bone42.cubeList.add(new ModelBox(bone42, 70, 28, -6.421F, -0.9128F, -1.9029F, 6, 1, 1, 0.0F, false));

		bone43 = new ModelRenderer(this);
		bone43.setRotationPoint(6.45F, -14.0F, 8.67F);
		ATV2.addChild(bone43);
		setRotationAngle(bone43, 0.0F, 0.4363F, 0.0F);
		bone43.cubeList.add(new ModelBox(bone43, 70, 26, 0.511F, -0.9128F, -1.8579F, 6, 1, 1, 0.0F, false));

		bone44 = new ModelRenderer(this);
		bone44.setRotationPoint(11.99F, -14.0F, 6.135F);
		ATV2.addChild(bone44);
		setRotationAngle(bone44, 0.0F, 0.1745F, 0.0F);
		bone44.cubeList.add(new ModelBox(bone44, 113, 155, -0.827F, -0.9128F, -13.9861F, 1, 1, 13, 0.0F, false));

		bone45 = new ModelRenderer(this);
		bone45.setRotationPoint(-12.01F, -14.0F, 6.135F);
		ATV2.addChild(bone45);
		setRotationAngle(bone45, 0.0F, -0.1745F, 0.0F);
		bone45.cubeList.add(new ModelBox(bone45, 85, 155, -0.153F, -0.9128F, -13.9861F, 1, 1, 13, 0.0F, false));

		bone46 = new ModelRenderer(this);
		bone46.setRotationPoint(0.0F, -14.0F, -10.0F);
		ATV2.addChild(bone46);
		setRotationAngle(bone46, 0.0F, -0.3142F, 0.0F);
		bone46.cubeList.add(new ModelBox(bone46, 0, 24, -0.3078F, -0.9128F, -0.9474F, 10, 1, 1, 0.0F, false));

		frame3 = new ModelRenderer(this);
		frame3.setRotationPoint(0.5F, -9.25F, -10.75F);
		ATV_total.addChild(frame3);
		setRotationAngle(frame3, -0.1745F, 0.0F, 0.0F);
		frame3.cubeList.add(new ModelBox(frame3, 93, 91, -6.0F, 0.0F, 0.0F, 11, 4, 1, 0.0F, false));

		bone55 = new ModelRenderer(this);
		bone55.setRotationPoint(0.0F, 4.924F, 0.8682F);
		frame3.addChild(bone55);
		setRotationAngle(bone55, 0.4363F, 0.0F, 0.0F);
		bone55.cubeList.add(new ModelBox(bone55, 0, 0, -5.0F, -2.0F, 0.0F, 9, 6, 26, 0.0F, false));
		bone55.cubeList.add(new ModelBox(bone55, 63, 26, -4.0F, 4.0F, 4.0F, 7, 4, 22, 0.0F, false));

		bone60 = new ModelRenderer(this);
		bone60.setRotationPoint(0.0F, 4.9526F, 0.7891F);
		bone55.addChild(bone60);
		setRotationAngle(bone60, 0.7854F, 0.0F, 0.0F);
		bone60.cubeList.add(new ModelBox(bone60, 153, 78, -4.0F, -0.9659F, 0.2588F, 7, 5, 7, 0.0F, false));

		bone61 = new ModelRenderer(this);
		bone61.setRotationPoint(0.25F, -0.2415F, 0.0647F);
		bone55.addChild(bone61);
		setRotationAngle(bone61, 0.0F, 0.0F, -0.0873F);
		bone61.cubeList.add(new ModelBox(bone61, 0, 48, -6.4887F, -3.2583F, -0.9659F, 3, 6, 3, 0.0F, false));

		bone62 = new ModelRenderer(this);
		bone62.setRotationPoint(-0.25F, -0.2415F, 0.0647F);
		bone55.addChild(bone62);
		setRotationAngle(bone62, 0.0F, 0.0F, 0.0873F);
		bone62.cubeList.add(new ModelBox(bone62, 0, 32, 2.4887F, -3.1615F, -0.9659F, 3, 6, 3, 0.0F, false));

		bone56 = new ModelRenderer(this);
		bone56.setRotationPoint(-5.0F, 0.0F, 0.0F);
		frame3.addChild(bone56);
		setRotationAngle(bone56, 0.0F, 0.4363F, 0.2618F);
		bone56.cubeList.add(new ModelBox(bone56, 164, 63, -7.5931F, -0.171F, 0.2349F, 8, 4, 4, 0.0F, false));

		bone57 = new ModelRenderer(this);
		bone57.setRotationPoint(3.5F, 0.0F, 0.0F);
		frame3.addChild(bone57);
		setRotationAngle(bone57, 0.0F, -0.4363F, -0.2618F);
		bone57.cubeList.add(new ModelBox(bone57, 38, 154, 0.35F, -0.05F, 0.05F, 8, 4, 4, 0.0F, false));

		frame4 = new ModelRenderer(this);
		frame4.setRotationPoint(0.0F, 7.0F, 0.0F);
		ATV_total.addChild(frame4);
		

		bone63 = new ModelRenderer(this);
		bone63.setRotationPoint(0.5F, -9.0F, 0.5F);
		frame4.addChild(bone63);
		setRotationAngle(bone63, -0.5236F, 0.0F, 0.0F);
		bone63.cubeList.add(new ModelBox(bone63, 99, 37, -13.0F, -2.7679F, 1.866F, 25, 4, 4, 0.0F, false));
		bone63.cubeList.add(new ModelBox(bone63, 90, 69, -13.0F, -21.7679F, 34.775F, 25, 4, 4, 0.0F, false));

		bone64 = new ModelRenderer(this);
		bone64.setRotationPoint(8.75F, -16.25F, -10.0F);
		frame4.addChild(bone64);
		setRotationAngle(bone64, 0.3491F, 0.1745F, 0.2618F);
		bone64.cubeList.add(new ModelBox(bone64, 78, 108, -1.0F, -1.0F, 0.0F, 3, 3, 6, 0.0F, false));

		bone65 = new ModelRenderer(this);
		bone65.setRotationPoint(-9.0F, -16.25F, -10.0F);
		frame4.addChild(bone65);
		setRotationAngle(bone65, 0.3491F, -0.1745F, -0.2618F);
		bone65.cubeList.add(new ModelBox(bone65, 52, 108, -1.7622F, -0.9535F, -0.0615F, 3, 3, 6, 0.0F, false));

		seat = new ModelRenderer(this);
		seat.setRotationPoint(0.0F, 1.0F, 0.0F);
		ATV_total.addChild(seat);
		

		bone70 = new ModelRenderer(this);
		bone70.setRotationPoint(5.5F, -12.25F, 17.0F);
		seat.addChild(bone70);
		setRotationAngle(bone70, -0.2618F, 0.0F, 0.0F);
		bone70.cubeList.add(new ModelBox(bone70, 124, 17, -11.0F, -2.0F, -1.0F, 11, 2, 12, 0.0F, false));
		bone70.cubeList.add(new ModelBox(bone70, 71, 136, -8.5F, -5.15F, -2.0F, 6, 1, 13, 0.0F, false));

		bone71 = new ModelRenderer(this);
		bone71.setRotationPoint(-11.0F, -2.0F, -1.0F);
		bone70.addChild(bone71);
		setRotationAngle(bone71, 0.0F, 0.0F, -0.8901F);
		bone71.cubeList.add(new ModelBox(bone71, 143, 64, 0.0F, 0.0F, -1.0F, 4, 1, 13, 0.0F, false));

		bone72 = new ModelRenderer(this);
		bone72.setRotationPoint(0.0F, -2.0F, -1.0F);
		bone70.addChild(bone72);
		setRotationAngle(bone72, 0.0F, 0.0F, 0.8901F);
		bone72.cubeList.add(new ModelBox(bone72, 41, 80, -4.0F, 0.0F, -1.0F, 4, 1, 13, 0.0F, false));

		bone73 = new ModelRenderer(this);
		bone73.setRotationPoint(5.5F, -9.0F, 25.0F);
		seat.addChild(bone73);
		setRotationAngle(bone73, 0.0873F, 0.0F, 0.0F);
		bone73.cubeList.add(new ModelBox(bone73, 97, 97, -11.0F, -2.0F, -1.0F, 11, 3, 15, 0.0F, false));
		bone73.cubeList.add(new ModelBox(bone73, 44, 134, -8.5F, -5.1439F, 3.2705F, 6, 1, 14, 0.0F, false));

		bone74 = new ModelRenderer(this);
		bone74.setRotationPoint(-11.0F, -2.0F, -1.0F);
		bone73.addChild(bone74);
		setRotationAngle(bone74, 0.0F, 0.0F, -0.8901F);
		bone74.cubeList.add(new ModelBox(bone74, 106, 116, 0.0F, 0.0F, -1.0F, 4, 1, 19, 0.0F, false));

		bone75 = new ModelRenderer(this);
		bone75.setRotationPoint(0.0F, -2.0F, -1.0F);
		bone73.addChild(bone75);
		setRotationAngle(bone75, 0.0F, 0.0F, 0.8901F);
		bone75.cubeList.add(new ModelBox(bone75, 79, 115, -4.0F, 0.0F, -1.0F, 4, 1, 19, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		ATV_total.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}