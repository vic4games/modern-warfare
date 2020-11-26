package com.vicmatskiv.mw.models;

import com.vicmatskiv.weaponlib.ModelWithAttachments;

import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class CZ805Bren extends ModelWithAttachments {
	private final ModelRenderer gun1;
	private final ModelRenderer gun3;
	private final ModelRenderer gun4;
	private final ModelRenderer gun5;
	private final ModelRenderer gun7;
	private final ModelRenderer gun8;
	private final ModelRenderer gun9;
	private final ModelRenderer gun10;
	private final ModelRenderer gun11;
	private final ModelRenderer gun12;
	private final ModelRenderer gun13;
	private final ModelRenderer gun14;
	private final ModelRenderer gun15;
	private final ModelRenderer gun16;
	private final ModelRenderer gun17;
	private final ModelRenderer gun18;
	private final ModelRenderer gun20;
	private final ModelRenderer gun21;
	private final ModelRenderer gun22;
	private final ModelRenderer gun23;
	private final ModelRenderer gun24;
	private final ModelRenderer gun25;
	private final ModelRenderer gun26;
	private final ModelRenderer gun27;
	private final ModelRenderer gun28;
	private final ModelRenderer gun29;
	private final ModelRenderer gun30;
	private final ModelRenderer gun32;
	private final ModelRenderer gun33;
	private final ModelRenderer gun34;
	private final ModelRenderer gun35;
	private final ModelRenderer gun36;
	private final ModelRenderer gun37;
	private final ModelRenderer gun38;
	private final ModelRenderer gun39;
	private final ModelRenderer gun40;
	private final ModelRenderer gun41;
	private final ModelRenderer gun42;
	private final ModelRenderer gun43;
	private final ModelRenderer gun44;
	private final ModelRenderer gun46;
	private final ModelRenderer gun47;
	private final ModelRenderer gun48;
	private final ModelRenderer gun49;
	private final ModelRenderer gun50;
	private final ModelRenderer gun51;
	private final ModelRenderer gun52;
	private final ModelRenderer gun53;
	private final ModelRenderer gun54;
	private final ModelRenderer gun55;
	private final ModelRenderer gun56;
	private final ModelRenderer gun57;
	private final ModelRenderer gun58;
	private final ModelRenderer gun59;
	private final ModelRenderer gun60;
	private final ModelRenderer gun62;
	private final ModelRenderer gun63;
	private final ModelRenderer gun64;
	private final ModelRenderer gun65;
	private final ModelRenderer gun66;
	private final ModelRenderer gun67;
	private final ModelRenderer gun68;
	private final ModelRenderer gun69;
	private final ModelRenderer gun70;
	private final ModelRenderer gun71;
	private final ModelRenderer gun72;
	private final ModelRenderer gun73;
	private final ModelRenderer gun74;
	private final ModelRenderer gun78;
	private final ModelRenderer gun79;
	private final ModelRenderer gun80;
	private final ModelRenderer gun82;
	private final ModelRenderer gun83;
	private final ModelRenderer gun84;
	private final ModelRenderer gun85;
	private final ModelRenderer gun86;
	private final ModelRenderer gun87;
	private final ModelRenderer gun88;
	private final ModelRenderer gun89;
	private final ModelRenderer gun90;
	private final ModelRenderer gun91;
	private final ModelRenderer gun92;
	private final ModelRenderer gun94;
	private final ModelRenderer gun95;
	private final ModelRenderer gun96;
	private final ModelRenderer gun97;
	private final ModelRenderer gun98;
	private final ModelRenderer gun99;
	private final ModelRenderer gun100;
	private final ModelRenderer gun101;
	private final ModelRenderer gun102;
	private final ModelRenderer gun103;
	private final ModelRenderer gun104;
	private final ModelRenderer gun105;
	private final ModelRenderer gun106;
	private final ModelRenderer gun107;
	private final ModelRenderer gun108;
	private final ModelRenderer gun109;
	private final ModelRenderer gun110;
	private final ModelRenderer gun111;
	private final ModelRenderer gun112;
	private final ModelRenderer action5;
	private final ModelRenderer gun113;
	private final ModelRenderer gun114;
	private final ModelRenderer gun115;
	private final ModelRenderer gun116;
	private final ModelRenderer gun117;
	private final ModelRenderer gun118;
	private final ModelRenderer gun119;
	private final ModelRenderer gun120;
	private final ModelRenderer gun121;
	private final ModelRenderer gun122;
	private final ModelRenderer gun123;
	private final ModelRenderer gun124;
	private final ModelRenderer gun125;
	private final ModelRenderer gun126;
	private final ModelRenderer gun127;
	private final ModelRenderer gun128;
	private final ModelRenderer gun129;
	private final ModelRenderer gun130;
	private final ModelRenderer gun131;
	private final ModelRenderer gun132;
	private final ModelRenderer gun133;
	private final ModelRenderer gun134;
	private final ModelRenderer gun135;
	private final ModelRenderer gun136;
	private final ModelRenderer gun137;
	private final ModelRenderer gun138;
	private final ModelRenderer gun139;
	private final ModelRenderer gun140;
	private final ModelRenderer gun141;
	private final ModelRenderer gun142;
	private final ModelRenderer gun143;
	private final ModelRenderer gun144;
	private final ModelRenderer gun145;
	private final ModelRenderer gun146;
	private final ModelRenderer gun147;
	private final ModelRenderer gun148;
	private final ModelRenderer gun149;
	private final ModelRenderer gun150;
	private final ModelRenderer gun151;
	private final ModelRenderer gun152;
	private final ModelRenderer gun153;
	private final ModelRenderer gun154;
	private final ModelRenderer gun155;
	private final ModelRenderer gun156;
	private final ModelRenderer gun157;
	private final ModelRenderer gun158;
	private final ModelRenderer gun159;
	private final ModelRenderer gun160;
	private final ModelRenderer gun161;
	private final ModelRenderer gun162;
	private final ModelRenderer gun163;
	private final ModelRenderer gun164;
	private final ModelRenderer gun165;
	private final ModelRenderer gun166;
	private final ModelRenderer gun167;
	private final ModelRenderer gun168;
	private final ModelRenderer gun169;
	private final ModelRenderer gun170;
	private final ModelRenderer gun171;
	private final ModelRenderer gun172;
	private final ModelRenderer gun173;
	private final ModelRenderer gun174;
	private final ModelRenderer gun175;
	private final ModelRenderer gun176;
	private final ModelRenderer gun177;
	private final ModelRenderer gun178;
	private final ModelRenderer gun179;
	private final ModelRenderer gun180;
	private final ModelRenderer gun181;
	private final ModelRenderer gun182;
	private final ModelRenderer gun183;
	private final ModelRenderer gun184;
	private final ModelRenderer gun185;
	private final ModelRenderer gun186;
	private final ModelRenderer gun187;
	private final ModelRenderer gun188;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer gun61;
	private final ModelRenderer gun2;
	private final ModelRenderer gun6;
	private final ModelRenderer gun19;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer bone5;
	private final ModelRenderer bone6;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;
	private final ModelRenderer bone10;
	private final ModelRenderer bone11;
	private final ModelRenderer bone12;
	private final ModelRenderer bone13;
	private final ModelRenderer bone14;
	private final ModelRenderer bone15;
	private final ModelRenderer bone16;
	private final ModelRenderer bone17;
	private final ModelRenderer bone18;

	public CZ805Bren() {
		textureWidth = 256;
		textureHeight = 256;

		gun1 = new ModelRenderer(this);
		gun1.setRotationPoint(-1.5F, 0.0F, 0.5F);
		setRotationAngle(gun1, 0.4363F, 0.0F, 0.0F);
		gun1.cubeList.add(new ModelBox(gun1, 0, 22, 0.0F, 0.0F, 0.0F, 3, 10, 4, 0.0F, false));

		gun3 = new ModelRenderer(this);
		gun3.setRotationPoint(-1.0F, -2.8F, -6.0F);
		setRotationAngle(gun3, -0.4363F, 0.0F, 0.0F);
		

		gun4 = new ModelRenderer(this);
		gun4.setRotationPoint(-1.5F, -0.5F, 0.8F);
		setRotationAngle(gun4, 0.0524F, 0.0F, 0.0F);
		gun4.cubeList.add(new ModelBox(gun4, 60, 33, 0.0F, 0.0F, 0.0F, 3, 3, 4, 0.0F, false));

		gun5 = new ModelRenderer(this);
		gun5.setRotationPoint(-1.5F, -2.0F, 1.7F);
		setRotationAngle(gun5, -0.2618F, 0.0F, 0.0F);
		

		gun7 = new ModelRenderer(this);
		gun7.setRotationPoint(-1.5F, -5.0F, 5.0F);
		setRotationAngle(gun7, -0.9599F, 0.0F, 0.0F);
		gun7.cubeList.add(new ModelBox(gun7, 44, 52, 0.0F, 0.0F, 0.0F, 3, 3, 4, 0.0F, false));

		gun8 = new ModelRenderer(this);
		gun8.setRotationPoint(-1.5F, 5.2F, 2.5F);
		setRotationAngle(gun8, -0.1199F, 0.0F, 0.0F);
		gun8.cubeList.add(new ModelBox(gun8, 63, 0, 0.0F, -0.4F, 0.0F, 3, 4, 3, 0.0F, false));

		gun9 = new ModelRenderer(this);
		gun9.setRotationPoint(-1.5F, 0.0F, 0.0F);
		setRotationAngle(gun9, 0.3491F, 0.0F, 0.0F);
		gun9.cubeList.add(new ModelBox(gun9, 22, 0, 0.0F, 0.0F, 0.0F, 3, 7, 1, 0.0F, false));

		gun10 = new ModelRenderer(this);
		gun10.setRotationPoint(-1.0F, -1.5F, -2.0F);
		setRotationAngle(gun10, -0.0698F, 0.0F, 0.0F);
		gun10.cubeList.add(new ModelBox(gun10, 48, 33, 0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, false));

		gun11 = new ModelRenderer(this);
		gun11.setRotationPoint(-1.0F, 1.9F, -0.4F);
		setRotationAngle(gun11, 0.4363F, 0.0F, 0.0F);
		gun11.cubeList.add(new ModelBox(gun11, 56, 33, 0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

		gun12 = new ModelRenderer(this);
		gun12.setRotationPoint(-1.0F, 1.9F, -6.0F);
		gun12.cubeList.add(new ModelBox(gun12, 6, 78, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		gun13 = new ModelRenderer(this);
		gun13.setRotationPoint(-1.6F, -1.6F, -7.0F);
		gun13.cubeList.add(new ModelBox(gun13, 14, 26, 0.0F, -1.0F, 0.0F, 1, 6, 1, 0.0F, false));

		gun14 = new ModelRenderer(this);
		gun14.setRotationPoint(-1.0F, -1.5F, -6.7F);
		setRotationAngle(gun14, 0.1745F, 0.0F, 0.0F);
		

		gun15 = new ModelRenderer(this);
		gun15.setRotationPoint(-1.0F, -1.5F, -6.7F);
		setRotationAngle(gun15, 0.1745F, 0.0F, 0.0F);
		gun15.cubeList.add(new ModelBox(gun15, 79, 22, 0.0F, 0.0F, 0.0F, 2, 4, 1, 0.0F, false));

		gun16 = new ModelRenderer(this);
		gun16.setRotationPoint(-1.6F, -2.8F, -16.3F);
		gun16.cubeList.add(new ModelBox(gun16, 70, 71, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun17 = new ModelRenderer(this);
		gun17.setRotationPoint(-1.6F, 0.3F, -15.2F);
		setRotationAngle(gun17, -0.2443F, 0.0F, 0.0F);
		gun17.cubeList.add(new ModelBox(gun17, 30, 87, 0.0F, 0.0F, 0.1F, 3, 1, 9, 0.0F, false));

		gun18 = new ModelRenderer(this);
		gun18.setRotationPoint(-1.0F, -3.9F, -14.5F);
		

		gun20 = new ModelRenderer(this);
		gun20.setRotationPoint(-0.3F, -4.6F, -45.5F);
		gun20.cubeList.add(new ModelBox(gun20, 0, 86, 0.0F, 0.0F, 0.0F, 1, 1, 28, 0.0F, false));

		gun21 = new ModelRenderer(this);
		gun21.setRotationPoint(-1.6F, -1.8F, -16.3F);
		setRotationAngle(gun21, 0.522F, 0.0F, 0.0F);
		gun21.cubeList.add(new ModelBox(gun21, 48, 6, 0.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F, false));

		gun22 = new ModelRenderer(this);
		gun22.setRotationPoint(-1.0F, 1.9F, -5.0F);
		gun22.cubeList.add(new ModelBox(gun22, 65, 53, 0.0F, 0.0F, 0.0F, 2, 1, 5, 0.0F, false));

		gun23 = new ModelRenderer(this);
		gun23.setRotationPoint(-1.6F, -1.8F, -15.6F);
		setRotationAngle(gun23, 0.0759F, 0.0F, 0.0F);
		gun23.cubeList.add(new ModelBox(gun23, 79, 11, 0.0F, -1.0F, 0.0F, 3, 4, 1, 0.0F, false));

		gun24 = new ModelRenderer(this);
		gun24.setRotationPoint(-1.5F, -3.8F, -16.3F);
		gun24.cubeList.add(new ModelBox(gun24, 76, 76, 0.0F, 0.0F, 0.0F, 3, 2, 2, 0.0F, false));

		gun25 = new ModelRenderer(this);
		gun25.setRotationPoint(-1.6F, -3.3F, -16.0F);
		gun25.cubeList.add(new ModelBox(gun25, 79, 11, 0.0F, 0.0F, 0.0F, 3, 1, 10, 0.0F, false));

		gun26 = new ModelRenderer(this);
		gun26.setRotationPoint(-0.8F, -4.7F, -32.5F);
		gun26.cubeList.add(new ModelBox(gun26, 136, 25, 0.0F, 0.0F, 0.0F, 2, 2, 14, 0.0F, false));

		gun27 = new ModelRenderer(this);
		gun27.setRotationPoint(-1.5F, -2.0F, -8.0F);
		

		gun28 = new ModelRenderer(this);
		gun28.setRotationPoint(-1.5F, -4.0F, -15.4F);
		setRotationAngle(gun28, -0.17F, 0.0F, 0.0F);
		gun28.cubeList.add(new ModelBox(gun28, 48, 0, 0.01F, 0.1971F, 1.0338F, 3, 5, 9, 0.0F, false));

		gun29 = new ModelRenderer(this);
		gun29.setRotationPoint(-1.0F, -5.0F, 11.7F);
		setRotationAngle(gun29, 0.4538F, 0.0F, 0.0F);
		gun29.cubeList.add(new ModelBox(gun29, 32, 62, 0.0F, -0.4384F, -0.8988F, 2, 4, 3, 0.0F, false));

		gun30 = new ModelRenderer(this);
		gun30.setRotationPoint(-1.0F, -9.0F, -14.5F);
		gun30.cubeList.add(new ModelBox(gun30, 134, 0, 0.0F, 0.0F, 9.0F, 2, 1, 15, 0.0F, false));

		gun32 = new ModelRenderer(this);
		gun32.setRotationPoint(-1.2F, -4.7F, -32.5F);
		gun32.cubeList.add(new ModelBox(gun32, 136, 67, 0.0F, 0.0F, 0.0F, 1, 2, 14, 0.0F, false));

		gun33 = new ModelRenderer(this);
		gun33.setRotationPoint(-1.5F, -6.6F, -16.5F);
		gun33.cubeList.add(new ModelBox(gun33, 79, 0, 0.0F, 0.0F, 0.0F, 3, 1, 10, 0.0F, false));

		gun34 = new ModelRenderer(this);
		gun34.setRotationPoint(-1.9F, -6.4F, 6.5F);
		setRotationAngle(gun34, 0.0F, 0.0873F, 0.0F);
		gun34.cubeList.add(new ModelBox(gun34, 24, 52, -0.0436F, -0.01F, 2.4981F, 2, 5, 4, 0.0F, false));

		gun35 = new ModelRenderer(this);
		gun35.setRotationPoint(-0.5F, -8.0F, 8.5F);
		

		gun36 = new ModelRenderer(this);
		gun36.setRotationPoint(-1.0F, -6.6F, 6.5F);
		

		gun37 = new ModelRenderer(this);
		gun37.setRotationPoint(-0.3F, 0.4F, 24.1F);
		setRotationAngle(gun37, 0.2793F, 0.0F, 0.0F);
		gun37.cubeList.add(new ModelBox(gun37, 11, 0, 0.0F, 0.0F, 0.0F, 1, 5, 3, 0.0F, false));

		gun38 = new ModelRenderer(this);
		gun38.setRotationPoint(1.3F, -7.7F, 12.5F);
		setRotationAngle(gun38, 0.0F, 0.0F, 0.7854F);
		gun38.cubeList.add(new ModelBox(gun38, 88, 44, 0.0F, 0.0F, 2.0F, 1, 1, 9, 0.0F, false));

		gun39 = new ModelRenderer(this);
		gun39.setRotationPoint(-1.2F, -7.0F, 22.5F);
		gun39.cubeList.add(new ModelBox(gun39, 64, 19, 0.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F, false));

		gun40 = new ModelRenderer(this);
		gun40.setRotationPoint(-1.0F, -6.8F, 25.5F);
		gun40.cubeList.add(new ModelBox(gun40, 66, 76, 0.0F, 11.0F, 0.0F, 2, 1, 3, 0.0F, false));

		gun41 = new ModelRenderer(this);
		gun41.setRotationPoint(-1.2F, -7.0F, 25.5F);
		gun41.cubeList.add(new ModelBox(gun41, 0, 43, 0.0F, 0.0F, 0.0F, 2, 12, 3, 0.0F, false));

		gun42 = new ModelRenderer(this);
		gun42.setRotationPoint(-1.0F, -7.2F, 22.5F);
		

		gun43 = new ModelRenderer(this);
		gun43.setRotationPoint(-1.0F, -2.6F, 25.0F);
		gun43.cubeList.add(new ModelBox(gun43, 79, 0, 0.0F, 0.0F, 0.0F, 2, 6, 1, 0.0F, false));

		gun44 = new ModelRenderer(this);
		gun44.setRotationPoint(-1.0F, -2.8F, 18.0F);
		setRotationAngle(gun44, 1.117F, 0.0F, 0.0F);
		gun44.cubeList.add(new ModelBox(gun44, 77, 63, 0.0F, 0.0F, 0.0F, 1, 8, 3, 0.0F, false));

		gun46 = new ModelRenderer(this);
		gun46.setRotationPoint(-0.7F, 0.4F, 24.1F);
		setRotationAngle(gun46, 0.2793F, 0.0F, 0.0F);
		gun46.cubeList.add(new ModelBox(gun46, 0, 0, 0.0F, 0.0F, 0.0F, 1, 5, 3, 0.0F, false));

		gun47 = new ModelRenderer(this);
		gun47.setRotationPoint(-0.1F, -6.4F, 6.5F);
		setRotationAngle(gun47, 0.0F, -0.0873F, 0.0F);
		gun47.cubeList.add(new ModelBox(gun47, 48, 33, 0.0261F, 0.0F, 2.2989F, 2, 5, 4, 0.0F, false));

		gun48 = new ModelRenderer(this);
		gun48.setRotationPoint(-0.7F, -2.6F, 18.0F);
		setRotationAngle(gun48, 1.117F, 0.0F, 0.0F);
		gun48.cubeList.add(new ModelBox(gun48, 44, 71, 0.0F, 0.0F, 0.0F, 1, 8, 3, 0.0F, false));

		gun49 = new ModelRenderer(this);
		gun49.setRotationPoint(0.0F, -2.8F, 18.0F);
		setRotationAngle(gun49, 1.117F, 0.0F, 0.0F);
		gun49.cubeList.add(new ModelBox(gun49, 10, 43, 0.0F, 0.0F, 0.0F, 1, 8, 3, 0.0F, false));

		gun50 = new ModelRenderer(this);
		gun50.setRotationPoint(-0.3F, -2.6F, 18.0F);
		setRotationAngle(gun50, 1.117F, 0.0F, 0.0F);
		gun50.cubeList.add(new ModelBox(gun50, 34, 22, 0.0F, 0.0F, 0.0F, 1, 8, 3, 0.0F, false));

		gun51 = new ModelRenderer(this);
		gun51.setRotationPoint(-1.0F, -7.2F, 25.5F);
		gun51.cubeList.add(new ModelBox(gun51, 0, 13, 0.0F, 0.0F, -3.0F, 2, 1, 6, 0.0F, false));

		gun52 = new ModelRenderer(this);
		gun52.setRotationPoint(-0.8F, -7.0F, 25.5F);
		gun52.cubeList.add(new ModelBox(gun52, 24, 24, 0.0F, 0.0F, 0.0F, 2, 12, 3, 0.0F, false));

		gun53 = new ModelRenderer(this);
		gun53.setRotationPoint(-1.2F, -5.2F, 22.5F);
		setRotationAngle(gun53, 0.6632F, 0.0F, 0.0F);
		gun53.cubeList.add(new ModelBox(gun53, 20, 62, 0.0F, 0.0F, 0.0F, 2, 5, 3, 0.0F, false));

		gun54 = new ModelRenderer(this);
		gun54.setRotationPoint(-0.8F, -7.0F, 22.5F);
		gun54.cubeList.add(new ModelBox(gun54, 64, 14, 0.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F, false));

		gun55 = new ModelRenderer(this);
		gun55.setRotationPoint(-0.8F, -5.2F, 22.5F);
		setRotationAngle(gun55, 0.6632F, 0.0F, 0.0F);
		gun55.cubeList.add(new ModelBox(gun55, 48, 14, 0.0F, 0.0F, 0.0F, 2, 5, 3, 0.0F, false));

		gun56 = new ModelRenderer(this);
		gun56.setRotationPoint(-1.0F, -6.6F, 13.5F);
		gun56.cubeList.add(new ModelBox(gun56, 0, 86, 0.0F, 0.0F, -1.0F, 2, 4, 12, 0.0F, false));

		gun57 = new ModelRenderer(this);
		gun57.setRotationPoint(-2.0F, -7.0F, 12.5F);
		gun57.cubeList.add(new ModelBox(gun57, 22, 0, 0.0F, 0.0F, 2.0F, 1, 4, 9, 0.0F, false));

		gun58 = new ModelRenderer(this);
		gun58.setRotationPoint(-1.5F, -7.7F, 12.5F);
		gun58.cubeList.add(new ModelBox(gun58, 81, 34, 0.0F, 0.0F, 2.0F, 3, 1, 9, 0.0F, false));

		gun59 = new ModelRenderer(this);
		gun59.setRotationPoint(-1.3F, -7.7F, 12.5F);
		setRotationAngle(gun59, 0.0F, 0.0F, 0.7854F);
		gun59.cubeList.add(new ModelBox(gun59, 66, 66, 0.0F, 0.0F, 2.0F, 1, 1, 9, 0.0F, false));

		gun60 = new ModelRenderer(this);
		gun60.setRotationPoint(1.0F, -7.0F, 12.5F);
		gun60.cubeList.add(new ModelBox(gun60, 0, 0, 0.0F, 0.0F, 2.0F, 1, 4, 9, 0.0F, false));

		gun62 = new ModelRenderer(this);
		gun62.setRotationPoint(-1.0F, -7.6F, 7.5F);
		setRotationAngle(gun62, -0.2618F, 0.0F, 0.0F);
		

		gun63 = new ModelRenderer(this);
		gun63.setRotationPoint(-1.0F, -7.6F, 8.5F);
		

		gun64 = new ModelRenderer(this);
		gun64.setRotationPoint(-1.5F, -8.4F, -33.0F);
		gun64.cubeList.add(new ModelBox(gun64, 76, 44, 0.01F, 0.0F, 0.0F, 3, 4, 1, 0.0F, false));

		gun65 = new ModelRenderer(this);
		gun65.setRotationPoint(-1.5F, -8.4F, -33.0F);
		setRotationAngle(gun65, 0.0F, 0.0F, 0.3316F);
		gun65.cubeList.add(new ModelBox(gun65, 24, 43, -0.0946F, 0.0326F, 0.0F, 1, 3, 1, 0.0F, false));

		gun66 = new ModelRenderer(this);
		gun66.setRotationPoint(0.5F, -8.1F, -33.0F);
		setRotationAngle(gun66, 0.0F, 0.0F, -0.3316F);
		gun66.cubeList.add(new ModelBox(gun66, 0, 22, 0.0946F, 0.0326F, 0.0F, 1, 3, 1, 0.0F, false));

		gun67 = new ModelRenderer(this);
		gun67.setRotationPoint(-1.2F, -5.6F, -32.5F);
		gun67.cubeList.add(new ModelBox(gun67, 0, 22, 0.0F, 0.0F, 0.0F, 3, 2, 18, 0.0F, false));

		gun68 = new ModelRenderer(this);
		gun68.setRotationPoint(-1.0F, -5.4F, -32.5F);
		gun68.cubeList.add(new ModelBox(gun68, 90, 113, 0.0F, 0.0F, 0.0F, 3, 2, 16, 0.0F, false));

		gun69 = new ModelRenderer(this);
		gun69.setRotationPoint(-1.5F, -8.4F, -32.5F);
		gun69.cubeList.add(new ModelBox(gun69, 0, 0, 0.0F, 0.0F, 0.0F, 3, 1, 42, 0.0F, false));

		gun70 = new ModelRenderer(this);
		gun70.setRotationPoint(-1.5F, -6.4F, -32.5F);
		gun70.cubeList.add(new ModelBox(gun70, 114, 34, 0.01F, 0.2F, 0.0F, 3, 1, 16, 0.0F, false));

		gun71 = new ModelRenderer(this);
		gun71.setRotationPoint(-1.5F, -7.4F, -32.5F);
		gun71.cubeList.add(new ModelBox(gun71, 74, 53, 0.01F, -0.8F, 0.0F, 3, 2, 2, 0.0F, false));

		gun72 = new ModelRenderer(this);
		gun72.setRotationPoint(-1.5F, -7.4F, -26.5F);
		gun72.cubeList.add(new ModelBox(gun72, 30, 74, 0.01F, -0.8F, 0.0F, 3, 2, 2, 0.0F, false));

		gun73 = new ModelRenderer(this);
		gun73.setRotationPoint(-1.5F, -7.8F, -31.2F);
		setRotationAngle(gun73, 0.7854F, 0.0F, 0.0F);
		gun73.cubeList.add(new ModelBox(gun73, 76, 49, -0.01F, 0.0707F, -0.0707F, 3, 1, 1, 0.0F, false));

		gun74 = new ModelRenderer(this);
		gun74.setRotationPoint(-1.5F, -6.7F, -30.5F);
		setRotationAngle(gun74, -0.7854F, 0.0F, 0.0F);
		gun74.cubeList.add(new ModelBox(gun74, 20, 70, 0.0F, 0.0707F, 0.0707F, 3, 1, 1, 0.0F, false));

		gun78 = new ModelRenderer(this);
		gun78.setRotationPoint(-1.5F, -6.7F, -26.5F);
		setRotationAngle(gun78, -0.7854F, 0.0F, 0.0F);
		gun78.cubeList.add(new ModelBox(gun78, 65, 49, 0.0F, 0.0707F, 0.0707F, 3, 1, 1, 0.0F, false));

		gun79 = new ModelRenderer(this);
		gun79.setRotationPoint(-1.5F, -7.8F, -27.2F);
		setRotationAngle(gun79, 0.7854F, 0.0F, 0.0F);
		gun79.cubeList.add(new ModelBox(gun79, 64, 25, -0.01F, 0.0707F, -0.0707F, 3, 1, 1, 0.0F, false));

		gun80 = new ModelRenderer(this);
		gun80.setRotationPoint(-1.5F, -5.0F, -6.5F);
		gun80.cubeList.add(new ModelBox(gun80, 0, 115, 0.0F, 2.0F, 0.0F, 3, 2, 15, 0.0F, false));

		gun82 = new ModelRenderer(this);
		gun82.setRotationPoint(-1.5F, -8.0F, -5.5F);
		gun82.cubeList.add(new ModelBox(gun82, 44, 44, 0.01F, 0.0F, 0.0F, 3, 7, 15, 0.0F, false));


		gun83 = new ModelRenderer(this);
		gun83.setRotationPoint(-1.5F, -7.4F, -20.4F);
		gun83.cubeList.add(new ModelBox(gun83, 0, 62, 0.01F, -0.8F, 0.0F, 3, 2, 4, 0.0F, false));

		action5 = new ModelRenderer(this);
		action5.setRotationPoint(0.0F, 0.0F, 0.0F);
		

		gun84 = new ModelRenderer(this);
		gun84.setRotationPoint(-1.0F, -9.0F, -32.5F);
		gun84.cubeList.add(new ModelBox(gun84, 48, 0, 0.0F, 0.0F, 0.0F, 2, 6, 27, 0.0F, false));

		gun85 = new ModelRenderer(this);
		gun85.setRotationPoint(-0.5F, -4.8F, -45.5F);
		gun85.cubeList.add(new ModelBox(gun85, 110, 84, 0.0F, 0.0F, 0.0F, 1, 1, 24, 0.0F, false));

		gun86 = new ModelRenderer(this);
		gun86.setRotationPoint(-0.5F, -4.4F, -45.5F);
		gun86.cubeList.add(new ModelBox(gun86, 110, 110, 0.0F, 0.0F, 0.0F, 1, 1, 24, 0.0F, false));

		gun87 = new ModelRenderer(this);
		gun87.setRotationPoint(-0.3F, -5.6F, -37.5F);
		gun87.cubeList.add(new ModelBox(gun87, 6, 81, 0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));

		gun88 = new ModelRenderer(this);
		gun88.setRotationPoint(-1.5F, -8.8F, 9.0F);
		setRotationAngle(gun88, 0.0F, 0.0F, 0.3316F);
		gun88.cubeList.add(new ModelBox(gun88, 0, 81, -0.0946F, -0.2674F, 0.0F, 2, 3, 1, 0.0F, false));

		gun89 = new ModelRenderer(this);
		gun89.setRotationPoint(-1.4F, -9.1F, 9.0F);
		gun89.cubeList.add(new ModelBox(gun89, 24, 81, 0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F, false));

		gun90 = new ModelRenderer(this);
		gun90.setRotationPoint(0.5F, -8.5F, 9.0F);
		setRotationAngle(gun90, 0.0F, 0.0F, -0.3316F);
		gun90.cubeList.add(new ModelBox(gun90, 80, 57, -0.9054F, -0.2674F, 0.0F, 2, 3, 1, 0.0F, false));

		gun91 = new ModelRenderer(this);
		gun91.setRotationPoint(-2.0F, -5.4F, -32.5F);
		gun91.cubeList.add(new ModelBox(gun91, 44, 66, 0.0F, 0.0F, 0.0F, 3, 2, 16, 0.0F, false));

		gun92 = new ModelRenderer(this);
		gun92.setRotationPoint(0.8F, -5.6F, -33.0F);
		gun92.cubeList.add(new ModelBox(gun92, 53, 0, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun94 = new ModelRenderer(this);
		gun94.setRotationPoint(-1.5F, -3.6F, -33.0F);
		gun94.cubeList.add(new ModelBox(gun94, 63, 7, 0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun95 = new ModelRenderer(this);
		gun95.setRotationPoint(-0.4F, -6.6F, -36.5F);
		gun95.cubeList.add(new ModelBox(gun95, 116, 25, 0.0F, 0.0F, 0.0F, 1, 1, 24, 0.0F, false));

		gun96 = new ModelRenderer(this);
		gun96.setRotationPoint(-0.5F, -6.5F, -36.5F);
		gun96.cubeList.add(new ModelBox(gun96, 108, 0, 0.0F, 0.0F, 0.0F, 1, 1, 24, 0.0F, false));

		gun97 = new ModelRenderer(this);
		gun97.setRotationPoint(-0.5F, -6.7F, -36.5F);
		gun97.cubeList.add(new ModelBox(gun97, 88, 59, 0.0F, 0.0F, 0.0F, 1, 1, 24, 0.0F, false));

		gun98 = new ModelRenderer(this);
		gun98.setRotationPoint(-0.5F, -6.6F, -37.0F);
		gun98.cubeList.add(new ModelBox(gun98, 88, 34, 0.0F, 0.0F, 0.0F, 1, 1, 24, 0.0F, false));

		gun99 = new ModelRenderer(this);
		gun99.setRotationPoint(-1.8F, -5.6F, -33.0F);
		gun99.cubeList.add(new ModelBox(gun99, 44, 52, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun100 = new ModelRenderer(this);
		gun100.setRotationPoint(-0.7F, -4.6F, -45.5F);
		gun100.cubeList.add(new ModelBox(gun100, 84, 88, 0.0F, 0.0F, 0.0F, 1, 1, 24, 0.0F, false));

		gun101 = new ModelRenderer(this);
		gun101.setRotationPoint(-0.5F, -6.6F, -36.5F);
		

		gun102 = new ModelRenderer(this);
		gun102.setRotationPoint(-0.5F, -5.4F, -37.5F);
		gun102.cubeList.add(new ModelBox(gun102, 80, 34, 0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));

		gun103 = new ModelRenderer(this);
		gun103.setRotationPoint(-0.7F, -5.6F, -37.5F);
		gun103.cubeList.add(new ModelBox(gun103, 66, 71, 0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));

		gun104 = new ModelRenderer(this);
		gun104.setRotationPoint(-0.5F, -5.8F, -37.5F);
		gun104.cubeList.add(new ModelBox(gun104, 18, 81, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun105 = new ModelRenderer(this);
		gun105.setRotationPoint(-0.6F, -6.6F, -36.5F);
		gun105.cubeList.add(new ModelBox(gun105, 58, 87, 0.0F, 0.0F, 0.0F, 1, 1, 24, 0.0F, false));

		gun106 = new ModelRenderer(this);
		gun106.setRotationPoint(-0.7F, -6.6F, -36.5F);
		gun106.cubeList.add(new ModelBox(gun106, 79, 16, 0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F, false));

		gun107 = new ModelRenderer(this);
		gun107.setRotationPoint(-0.5F, -6.8F, -36.5F);
		gun107.cubeList.add(new ModelBox(gun107, 36, 79, 0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F, false));

		gun108 = new ModelRenderer(this);
		gun108.setRotationPoint(-0.3F, -6.6F, -36.5F);
		gun108.cubeList.add(new ModelBox(gun108, 12, 66, 0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F, false));

		gun109 = new ModelRenderer(this);
		gun109.setRotationPoint(-0.5F, -6.4F, -36.5F);
		gun109.cubeList.add(new ModelBox(gun109, 0, 13, 0.0F, 0.0F, 0.0F, 1, 4, 2, 0.0F, false));

		gun110 = new ModelRenderer(this);
		gun110.setRotationPoint(-1.8F, -5.6F, -29.5F);
		gun110.cubeList.add(new ModelBox(gun110, 114, 59, 0.0F, 0.0F, 0.0F, 3, 2, 15, 0.0F, false));

		gun111 = new ModelRenderer(this);
		gun111.setRotationPoint(-1.8F, -5.6F, -6.5F);
		gun111.cubeList.add(new ModelBox(gun111, 8, 56, 0.0F, 0.0F, 0.0F, 3, 3, 2, 0.0F, false));

		gun112 = new ModelRenderer(this);
		gun112.setRotationPoint(-1.8F, -3.6F, -14.5F);
		gun112.cubeList.add(new ModelBox(gun112, 62, 113, 0.0F, 0.0F, 0.0F, 3, 1, 22, 0.0F, false));

		gun113 = new ModelRenderer(this);
		gun113.setRotationPoint(0.6F, 0.3F, -15.2F);
		setRotationAngle(gun113, -0.2443F, 0.0F, 0.0F);
		gun113.cubeList.add(new ModelBox(gun113, 65, 43, 0.0F, 0.0F, 0.1F, 1, 1, 9, 0.0F, false));

		gun114 = new ModelRenderer(this);
		gun114.setRotationPoint(0.6F, -1.8F, -16.3F);
		setRotationAngle(gun114, 0.522F, 0.0F, 0.0F);
		gun114.cubeList.add(new ModelBox(gun114, 24, 52, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun115 = new ModelRenderer(this);
		gun115.setRotationPoint(-1.4F, -3.3F, -16.0F);
		gun115.cubeList.add(new ModelBox(gun115, 48, 14, 0.0F, 0.0F, 0.0F, 3, 1, 10, 0.0F, false));

		gun116 = new ModelRenderer(this);
		gun116.setRotationPoint(-1.4F, -1.6F, -7.0F);
		gun116.cubeList.add(new ModelBox(gun116, 33, 0, 0.0F, -1.0F, 0.0F, 3, 6, 1, 0.0F, false));

		gun117 = new ModelRenderer(this);
		gun117.setRotationPoint(-1.5F, -2.5F, -2.0F);
		setRotationAngle(gun117, 0.6807F, 0.0F, 0.0F);
		gun117.cubeList.add(new ModelBox(gun117, 24, 43, 0.0F, 0.0F, 0.0F, 3, 5, 4, 0.0F, false));

		gun118 = new ModelRenderer(this);
		gun118.setRotationPoint(1.8F, -5.6F, -20.5F);
		setRotationAngle(gun118, 0.0F, 0.0F, 2.4166F);
		gun118.cubeList.add(new ModelBox(gun118, 78, 5, 0.0F, 0.0F, 0.0F, 1, 1, 28, 0.0F, false));

		gun119 = new ModelRenderer(this);
		gun119.setRotationPoint(2.0F, -5.4F, -32.5F);
		setRotationAngle(gun119, 0.0F, 0.0F, 2.4166F);
		gun119.cubeList.add(new ModelBox(gun119, 0, 132, 0.0F, 0.0F, 0.0F, 1, 1, 16, 0.0F, false));

		gun120 = new ModelRenderer(this);
		gun120.setRotationPoint(-1.8F, -5.6F, -18.5F);
		setRotationAngle(gun120, 0.0F, 0.0F, -2.4166F);
		gun120.cubeList.add(new ModelBox(gun120, 30, 87, -1.0F, 0.0F, 0.0F, 1, 1, 26, 0.0F, false));

		gun121 = new ModelRenderer(this);
		gun121.setRotationPoint(-2.0F, -5.4F, -32.5F);
		setRotationAngle(gun121, 0.0F, 0.0F, -2.4166F);
		gun121.cubeList.add(new ModelBox(gun121, 20, 116, -1.0F, 0.0F, 0.0F, 1, 1, 16, 0.0F, false));

		gun122 = new ModelRenderer(this);
		gun122.setRotationPoint(-1.5F, -7.8F, -21.1F);
		setRotationAngle(gun122, 0.7854F, 0.0F, 0.0F);
		gun122.cubeList.add(new ModelBox(gun122, 60, 40, -0.01F, 0.0707F, -0.0707F, 3, 1, 1, 0.0F, false));

		gun123 = new ModelRenderer(this);
		gun123.setRotationPoint(-1.5F, -6.7F, -20.4F);
		setRotationAngle(gun123, -0.7854F, 0.0F, 0.0F);
		gun123.cubeList.add(new ModelBox(gun123, 0, 58, 0.0F, 0.0707F, 0.0707F, 3, 1, 1, 0.0F, false));

		gun124 = new ModelRenderer(this);
		gun124.setRotationPoint(-1.5F, -7.8F, -25.2F);
		setRotationAngle(gun124, 0.7854F, 0.0F, 0.0F);
		gun124.cubeList.add(new ModelBox(gun124, 56, 25, -0.01F, 0.0707F, -0.0707F, 3, 1, 1, 0.0F, false));

		gun125 = new ModelRenderer(this);
		gun125.setRotationPoint(-1.5F, -6.7F, -24.5F);
		setRotationAngle(gun125, -0.7854F, 0.0F, 0.0F);
		gun125.cubeList.add(new ModelBox(gun125, 10, 54, 0.0F, 0.0707F, 0.0707F, 3, 1, 1, 0.0F, false));

		gun126 = new ModelRenderer(this);
		gun126.setRotationPoint(-2.3F, -4.8F, -6.5F);
		setRotationAngle(gun126, 0.0F, 0.1745F, 0.0F);
		gun126.cubeList.add(new ModelBox(gun126, 70, 33, -0.2462F, 0.0F, -0.0434F, 3, 1, 2, 0.0F, false));

		gun127 = new ModelRenderer(this);
		gun127.setRotationPoint(-2.3F, -5.3F, -6.5F);
		setRotationAngle(gun127, 0.0F, 0.1745F, 0.0F);
		gun127.cubeList.add(new ModelBox(gun127, 32, 69, -0.2462F, 0.0F, -0.0434F, 3, 1, 2, 0.0F, false));

		gun128 = new ModelRenderer(this);
		gun128.setRotationPoint(-1.2F, -4.1F, -32.5F);
		gun128.cubeList.add(new ModelBox(gun128, 0, 43, 0.0F, -0.2F, 0.0F, 3, 1, 18, 0.0F, false));

		gun129 = new ModelRenderer(this);
		gun129.setRotationPoint(-1.8F, -4.1F, -32.5F);
		gun129.cubeList.add(new ModelBox(gun129, 0, 62, 0.0F, -0.2F, 0.0F, 1, 1, 18, 0.0F, false));

		gun130 = new ModelRenderer(this);
		gun130.setRotationPoint(0.8F, -3.6F, -14.5F);
		gun130.cubeList.add(new ModelBox(gun130, 36, 114, 0.0F, -0.2F, 0.0F, 1, 1, 22, 0.0F, false));

		gun131 = new ModelRenderer(this);
		gun131.setRotationPoint(0.8F, -5.6F, 5.0F);
		gun131.cubeList.add(new ModelBox(gun131, 54, 66, 0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));

		gun132 = new ModelRenderer(this);
		gun132.setRotationPoint(-1.8F, -5.6F, 5.0F);
		gun132.cubeList.add(new ModelBox(gun132, 10, 62, 0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));

		gun133 = new ModelRenderer(this);
		gun133.setRotationPoint(0.7F, -5.6F, -14.5F);
		gun133.cubeList.add(new ModelBox(gun133, 0, 0, 0.0F, 0.0F, 0.0F, 1, 2, 20, 0.0F, false));

		gun134 = new ModelRenderer(this);
		gun134.setRotationPoint(-1.7F, -5.6F, -4.5F);
		gun134.cubeList.add(new ModelBox(gun134, 20, 62, 0.0F, 0.0F, 0.0F, 1, 2, 10, 0.0F, false));

		gun135 = new ModelRenderer(this);
		gun135.setRotationPoint(0.8F, -2.6F, -14.5F);
		setRotationAngle(gun135, 2.3562F, 0.0F, 0.0F);
		gun135.cubeList.add(new ModelBox(gun135, 12, 81, 0.0F, 0.1414F, 0.1414F, 1, 1, 2, 0.0F, false));

		gun136 = new ModelRenderer(this);
		gun136.setRotationPoint(0.8F, -4.2F, 5.0F);
		setRotationAngle(gun136, -0.7854F, 0.0F, 0.0F);
		gun136.cubeList.add(new ModelBox(gun136, 70, 43, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun137 = new ModelRenderer(this);
		gun137.setRotationPoint(-1.49F, -8.2F, -16.5F);
		gun137.cubeList.add(new ModelBox(gun137, 84, 87, 0.0F, 0.0F, 0.0F, 1, 1, 10, 0.0F, false));

		gun138 = new ModelRenderer(this);
		gun138.setRotationPoint(0.49F, -8.2F, -16.5F);
		gun138.cubeList.add(new ModelBox(gun138, 58, 87, 0.0F, 0.0F, 0.0F, 1, 1, 10, 0.0F, false));

		gun139 = new ModelRenderer(this);
		gun139.setRotationPoint(-1.5F, -6.4F, -6.5F);
		gun139.cubeList.add(new ModelBox(gun139, 48, 25, 0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun140 = new ModelRenderer(this);
		gun140.setRotationPoint(-1.4F, -1.3F, -14.8F);
		gun140.cubeList.add(new ModelBox(gun140, 48, 22, 0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun141 = new ModelRenderer(this);
		gun141.setRotationPoint(-1.4F, -1.5F, -13.8F);
		gun141.cubeList.add(new ModelBox(gun141, 30, 13, 0.0F, 0.0F, 0.0F, 3, 1, 3, 0.0F, false));

		gun142 = new ModelRenderer(this);
		gun142.setRotationPoint(-1.4F, -1.3F, -10.8F);
		gun142.cubeList.add(new ModelBox(gun142, 70, 36, 0.0F, 0.0F, 0.0F, 3, 1, 4, 0.0F, false));

		gun143 = new ModelRenderer(this);
		gun143.setRotationPoint(-1.4F, -1.7F, -10.8F);
		gun143.cubeList.add(new ModelBox(gun143, 0, 68, 0.0F, 0.0F, 0.0F, 3, 1, 4, 0.0F, false));

		gun144 = new ModelRenderer(this);
		gun144.setRotationPoint(-1.4F, -1.7F, -10.8F);
		setRotationAngle(gun144, -0.7854F, 0.0F, 0.0F);
		gun144.cubeList.add(new ModelBox(gun144, 33, 7, 0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun145 = new ModelRenderer(this);
		gun145.setRotationPoint(-1.4F, -0.3F, -13.8F);
		setRotationAngle(gun145, 2.4166F, 0.0F, 0.0F);
		gun145.cubeList.add(new ModelBox(gun145, 30, 17, 0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun146 = new ModelRenderer(this);
		gun146.setRotationPoint(-1.4F, -2.5F, -14.0F);
		gun146.cubeList.add(new ModelBox(gun146, 24, 22, 0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun147 = new ModelRenderer(this);
		gun147.setRotationPoint(-1.8F, -2.6F, -14.5F);
		setRotationAngle(gun147, 2.3562F, 0.0F, 0.0F);
		gun147.cubeList.add(new ModelBox(gun147, 79, 7, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun148 = new ModelRenderer(this);
		gun148.setRotationPoint(0.6F, -2.8F, -16.3F);
		gun148.cubeList.add(new ModelBox(gun148, 0, 70, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun149 = new ModelRenderer(this);
		gun149.setRotationPoint(-1.6F, -1.5F, -14.8F);
		gun149.cubeList.add(new ModelBox(gun149, 22, 13, 0.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F, false));

		gun150 = new ModelRenderer(this);
		gun150.setRotationPoint(-1.6F, -1.7F, -8.8F);
		gun150.cubeList.add(new ModelBox(gun150, 0, 77, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun151 = new ModelRenderer(this);
		gun151.setRotationPoint(-1.6F, -1.3F, -8.8F);
		gun151.cubeList.add(new ModelBox(gun151, 49, 71, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun152 = new ModelRenderer(this);
		gun152.setRotationPoint(-1.6F, -2.7F, -7.8F);
		gun152.cubeList.add(new ModelBox(gun152, 44, 68, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun153 = new ModelRenderer(this);
		gun153.setRotationPoint(-1.6F, -1.7F, -8.8F);
		setRotationAngle(gun153, -0.7854F, 0.0F, 0.0F);
		gun153.cubeList.add(new ModelBox(gun153, 0, 68, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun154 = new ModelRenderer(this);
		gun154.setRotationPoint(0.7F, -1.5F, -10.5F);
		gun154.cubeList.add(new ModelBox(gun154, 30, 35, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		gun155 = new ModelRenderer(this);
		gun155.setRotationPoint(-1.7F, -1.5F, -8.5F);
		gun155.cubeList.add(new ModelBox(gun155, 12, 71, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun156 = new ModelRenderer(this);
		gun156.setRotationPoint(0.6F, -2.7F, -9.0F);
		gun156.cubeList.add(new ModelBox(gun156, 7, 43, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun157 = new ModelRenderer(this);
		gun157.setRotationPoint(0.9F, -2.55F, -8.3F);
		setRotationAngle(gun157, 0.0F, -0.0744F, 0.0F);
		gun157.cubeList.add(new ModelBox(gun157, 44, 66, 0.0F, 0.0F, 0.7F, 1, 1, 1, 0.0F, false));

		gun158 = new ModelRenderer(this);
		gun158.setRotationPoint(0.8F, -1.5F, -8.2F);
		setRotationAngle(gun158, 0.0F, 0.1487F, 0.0F);
		gun158.cubeList.add(new ModelBox(gun158, 36, 17, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun159 = new ModelRenderer(this);
		gun159.setRotationPoint(0.6F, -0.3F, -8.8F);
		setRotationAngle(gun159, 1.1525F, 0.0F, 0.0F);
		gun159.cubeList.add(new ModelBox(gun159, 16, 0, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun160 = new ModelRenderer(this);
		gun160.setRotationPoint(0.6F, -1.8F, -15.6F);
		setRotationAngle(gun160, 0.0759F, 0.0F, 0.0F);
		gun160.cubeList.add(new ModelBox(gun160, 65, 53, 0.0F, -1.0F, 0.0F, 1, 4, 1, 0.0F, false));

		gun161 = new ModelRenderer(this);
		gun161.setRotationPoint(1.1F, -5.2F, -32.5F);
		gun161.cubeList.add(new ModelBox(gun161, 135, 51, 0.0F, 0.0F, -0.1F, 1, 1, 15, 0.0F, false));

		gun162 = new ModelRenderer(this);
		gun162.setRotationPoint(1.1F, -4.8F, -32.5F);
		gun162.cubeList.add(new ModelBox(gun162, 129, 135, 0.0F, 0.3F, -0.1F, 1, 1, 15, 0.0F, false));

		gun163 = new ModelRenderer(this);
		gun163.setRotationPoint(-2.1F, -5.2F, -32.5F);
		gun163.cubeList.add(new ModelBox(gun163, 97, 135, 0.0F, 0.0F, -0.1F, 1, 1, 15, 0.0F, false));

		gun164 = new ModelRenderer(this);
		gun164.setRotationPoint(-2.1F, -4.8F, -32.5F);
		gun164.cubeList.add(new ModelBox(gun164, 19, 134, 0.0F, 0.3F, -0.1F, 1, 1, 15, 0.0F, false));

		gun165 = new ModelRenderer(this);
		gun165.setRotationPoint(0.6F, -8.5F, 6.0F);
		gun165.cubeList.add(new ModelBox(gun165, 65, 43, 0.0F, 0.0F, 0.0F, 1, 3, 3, 0.0F, false));

		gun166 = new ModelRenderer(this);
		gun166.setRotationPoint(-1.6F, -8.5F, 6.0F);
		gun166.cubeList.add(new ModelBox(gun166, 48, 0, 0.0F, 0.0F, 0.0F, 1, 3, 3, 0.0F, false));

		gun167 = new ModelRenderer(this);
		gun167.setRotationPoint(0.3F, -5.9F, 7.5F);
		gun167.cubeList.add(new ModelBox(gun167, 44, 44, -2.3F, 0.0F, -0.99F, 4, 5, 3, 0.0F, false));
		gun167.cubeList.add(new ModelBox(gun167, 0, 36, -2.6F, 0.0F, -1.0F, 4, 1, 2, 0.0F, false));
		gun167.cubeList.add(new ModelBox(gun167, 10, 13, -2.6F, 0.0F, 1.0F, 4, 4, 1, 0.0F, false));
		gun167.cubeList.add(new ModelBox(gun167, 10, 13, -2.0F, 0.0F, 1.0F, 4, 4, 1, 0.0F, false));
		gun167.cubeList.add(new ModelBox(gun167, 0, 36, -2.0F, 0.0F, -1.0F, 4, 1, 2, 0.0F, false));

		gun168 = new ModelRenderer(this);
		gun168.setRotationPoint(-2.3F, -5.9F, 7.5F);
		

		gun169 = new ModelRenderer(this);
		gun169.setRotationPoint(2.3F, -5.9F, 7.5F);
		setRotationAngle(gun169, 0.0F, 0.0F, 2.3562F);
		gun169.cubeList.add(new ModelBox(gun169, 66, 66, 0.0F, 0.0F, -1.0F, 1, 2, 3, 0.0F, false));

		gun170 = new ModelRenderer(this);
		gun170.setRotationPoint(-2.3F, -5.9F, 7.5F);
		setRotationAngle(gun170, 0.0F, 0.0F, -0.7854F);
		gun170.cubeList.add(new ModelBox(gun170, 7, 74, 0.0F, 0.0F, -1.0F, 2, 1, 3, 0.0F, false));

		gun171 = new ModelRenderer(this);
		gun171.setRotationPoint(-2.3F, -5.9F, 6.5F);
		setRotationAngle(gun171, 0.0F, 0.0F, -0.7854F);
		

		gun172 = new ModelRenderer(this);
		gun172.setRotationPoint(2.3F, -5.9F, 6.7F);
		setRotationAngle(gun172, 0.0F, 0.0F, 2.3562F);
		

		gun173 = new ModelRenderer(this);
		gun173.setRotationPoint(2.3F, -5.9F, 7.5F);
		setRotationAngle(gun173, 0.0F, -2.3562F, 0.0F);
		gun173.cubeList.add(new ModelBox(gun173, 38, 47, -0.7071F, 0.0F, 0.7071F, 1, 4, 1, 0.0F, false));

		gun174 = new ModelRenderer(this);
		gun174.setRotationPoint(2.3F, -5.9F, 8.5F);
		setRotationAngle(gun174, 0.0F, -2.3562F, 0.0F);
		gun174.cubeList.add(new ModelBox(gun174, 14, 33, 0.7071F, 0.0F, -0.7071F, 1, 4, 1, 0.0F, false));

		gun175 = new ModelRenderer(this);
		gun175.setRotationPoint(-2.3F, -5.9F, 7.5F);
		setRotationAngle(gun175, 0.0F, 0.7854F, 0.0F);
		gun175.cubeList.add(new ModelBox(gun175, 36, 56, 0.7071F, 0.0F, -0.7071F, 2, 4, 1, 0.0F, false));

		gun176 = new ModelRenderer(this);
		gun176.setRotationPoint(-2.3F, -5.9F, 8.5F);
		setRotationAngle(gun176, 0.0F, 0.7854F, 0.0F);
		gun176.cubeList.add(new ModelBox(gun176, 36, 33, -0.7071F, 0.0F, 0.7071F, 2, 4, 1, 0.0F, false));

		gun177 = new ModelRenderer(this);
		gun177.setRotationPoint(-1.5F, -4.2F, -32.0F);
		gun177.cubeList.add(new ModelBox(gun177, 20, 74, 0.0F, 0.0F, 0.0F, 3, 2, 2, 0.0F, false));

		gun178 = new ModelRenderer(this);
		gun178.setRotationPoint(-1.5F, -2.2F, -30.0F);
		setRotationAngle(gun178, 2.3794F, 0.0F, 0.0F);
		gun178.cubeList.add(new ModelBox(gun178, 0, 73, 0.0F, 0.0F, 0.0F, 3, 2, 2, 0.0F, false));

		gun179 = new ModelRenderer(this);
		gun179.setRotationPoint(-1.0F, -4.2F, -30.0F);
		gun179.cubeList.add(new ModelBox(gun179, 114, 135, 0.0F, 0.0F, 0.0F, 2, 2, 13, 0.0F, false));

		gun180 = new ModelRenderer(this);
		gun180.setRotationPoint(-1.5F, -8.4F, -32.5F);
		setRotationAngle(gun180, 0.0F, 0.0F, -0.522F);
		gun180.cubeList.add(new ModelBox(gun180, 44, 44, 0.0F, 0.0F, 0.01F, 1, 1, 42, 0.0F, false));

		gun181 = new ModelRenderer(this);
		gun181.setRotationPoint(1.5F, -8.4F, -32.5F);
		setRotationAngle(gun181, 0.0F, 0.0F, 0.522F);
		gun181.cubeList.add(new ModelBox(gun181, 0, 43, -1.0F, 0.0F, 0.01F, 1, 1, 42, 0.0F, false));

		gun182 = new ModelRenderer(this);
		gun182.setRotationPoint(0.35F, -9.1F, 9.0F);
		gun182.cubeList.add(new ModelBox(gun182, 5, 0, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun183 = new ModelRenderer(this);
		gun183.setRotationPoint(1.1F, -5.0F, -20.3F);
		gun183.cubeList.add(new ModelBox(gun183, 0, 64, 0.0F, 0.15F, 2.0F, 1, 1, 1, 0.0F, false));

		gun184 = new ModelRenderer(this);
		gun184.setRotationPoint(-2.1F, -5.0F, -20.3F);
		gun184.cubeList.add(new ModelBox(gun184, 14, 62, 0.0F, 0.15F, 2.0F, 1, 1, 1, 0.0F, false));

		gun185 = new ModelRenderer(this);
		gun185.setRotationPoint(-1.5F, -4.2F, -18.3F);
		gun185.cubeList.add(new ModelBox(gun185, 32, 52, 0.0F, 0.0F, 0.0F, 3, 2, 2, 0.0F, false));

		gun186 = new ModelRenderer(this);
		gun186.setRotationPoint(-1.5F, -3.6F, -22.3F);
		gun186.cubeList.add(new ModelBox(gun186, 44, 66, 0.0F, 0.0F, 0.0F, 3, 1, 4, 0.0F, false));

		gun187 = new ModelRenderer(this);
		gun187.setRotationPoint(1.6F, -8.5F, 6.0F);
		setRotationAngle(gun187, 0.0F, 0.0F, 0.522F);
		gun187.cubeList.add(new ModelBox(gun187, 34, 43, -1.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		gun188 = new ModelRenderer(this);
		gun188.setRotationPoint(-1.6F, -8.5F, 6.0F);
		setRotationAngle(gun188, 0.0F, 0.0F, -0.522F);
		gun188.cubeList.add(new ModelBox(gun188, 9, 36, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-1.3F, -1.9F, -16.1F);
		setRotationAngle(bone, -0.4363F, 0.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 54, 52, 2.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 54, 52, 2.4F, -11.542F, 20.2412F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 54, 52, -0.8F, -11.542F, 20.2412F, 1, 1, 1, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-3.7F, -1.9F, -16.1F);
		setRotationAngle(bone2, -0.4363F, 0.0F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 54, 52, 2.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun61 = new ModelRenderer(this);
		gun61.setRotationPoint(-1.4F, -6.6F, 6.5F);
		setRotationAngle(gun61, 0.0F, 0.0873F, 0.0F);
		gun61.cubeList.add(new ModelBox(gun61, 10, 22, -0.45F, 0.0F, 3.5F, 1, 1, 3, 0.0F, false));

		gun2 = new ModelRenderer(this);
		gun2.setRotationPoint(-0.6F, -6.6F, 6.3F);
		setRotationAngle(gun2, 0.0F, -0.0873F, 0.0F);
		gun2.cubeList.add(new ModelBox(gun2, 10, 22, 1.45F, 0.0F, 3.5F, 1, 1, 3, 0.0F, false));

		gun6 = new ModelRenderer(this);
		gun6.setRotationPoint(1.55F, -6.6F, 9.8F);
		setRotationAngle(gun6, 0.0F, -0.0873F, -0.3491F);
		gun6.cubeList.add(new ModelBox(gun6, 55, 45, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		gun6.cubeList.add(new ModelBox(gun6, 55, 45, -0.99F, -1.4F, 0.01F, 1, 1, 1, 0.0F, false));

		gun19 = new ModelRenderer(this);
		gun19.setRotationPoint(1.55F, -6.6F, 9.8F);
		setRotationAngle(gun19, 0.0F, 0.0873F, 0.3491F);
		gun19.cubeList.add(new ModelBox(gun19, 55, 45, -2.902F, 0.0603F, -0.2539F, 1, 1, 1, 0.0F, false));
		gun19.cubeList.add(new ModelBox(gun19, 55, 45, -2.904F, -0.4F, -0.26F, 1, 1, 1, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, -8.0F, 10.0F);
		bone3.cubeList.add(new ModelBox(bone3, 0, 62, -1.0F, 0.0F, -0.25F, 1, 1, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 0, 62, 0.0F, 0.0F, -0.25F, 1, 1, 1, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, -6.4F, 10.6F);
		setRotationAngle(bone4, 0.0F, 0.0F, 0.7854F);
		bone4.cubeList.add(new ModelBox(bone4, 55, 43, -0.8586F, -0.8586F, 0.0F, 1, 1, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 55, 43, -1.495F, -1.495F, -1.5F, 1, 1, 1, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, -0.9F, 6.5F);
		setRotationAngle(bone5, 0.7679F, 0.0349F, -0.0698F);
		bone5.cubeList.add(new ModelBox(bone5, 22, 13, 1.0F, -3.0F, 0.0F, 1, 3, 2, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-3.0F, -0.9F, 6.5F);
		setRotationAngle(bone6, 0.7679F, -0.0349F, 0.0698F);
		bone6.cubeList.add(new ModelBox(bone6, 22, 13, 1.0F, -3.0F, 0.0F, 1, 3, 2, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(2.5F, -4.3F, -32.6F);
		

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone7.addChild(bone8);
		setRotationAngle(bone8, 0.0F, 0.0F, -0.3491F);
		bone8.cubeList.add(new ModelBox(bone8, 31, 22, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 16, 18, -1.0F, -1.0F, 10.0F, 1, 1, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 16, 18, -1.0F, -1.0F, 2.5F, 1, 1, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 16, 18, -1.0F, -1.0F, 4.0F, 1, 1, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 16, 18, -1.0F, -1.0F, 5.5F, 1, 1, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 16, 18, -1.0F, -1.0F, 7.0F, 1, 1, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 16, 18, -1.0F, -1.0F, 8.5F, 1, 1, 1, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone7.addChild(bone9);
		setRotationAngle(bone9, 0.0F, 0.0F, 0.3491F);
		bone9.cubeList.add(new ModelBox(bone9, 31, 22, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 16, 18, -1.0F, 0.0F, 10.0F, 1, 1, 1, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 16, 18, -1.0F, 0.0F, 2.5F, 1, 1, 1, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 16, 18, -1.0F, 0.0F, 4.0F, 1, 1, 1, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 16, 18, -1.0F, 0.0F, 5.5F, 1, 1, 1, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 16, 18, -1.0F, 0.0F, 7.0F, 1, 1, 1, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 16, 18, -1.0F, 0.0F, 8.5F, 1, 1, 1, 0.0F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone7.addChild(bone10);
		bone10.cubeList.add(new ModelBox(bone10, 54, 54, -1.0F, -0.5F, 0.5F, 1, 1, 1, 0.0F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(-2.5F, -4.3F, -32.6F);
		setRotationAngle(bone11, 0.0F, 0.0F, -3.1416F);
		

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone11.addChild(bone12);
		setRotationAngle(bone12, 0.0F, 0.0F, -0.3491F);
		bone12.cubeList.add(new ModelBox(bone12, 31, 22, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 16, 18, -1.0F, -1.0F, 10.0F, 1, 1, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 16, 18, -1.0F, -1.0F, 2.5F, 1, 1, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 16, 18, -1.0F, -1.0F, 4.0F, 1, 1, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 16, 18, -1.0F, -1.0F, 5.5F, 1, 1, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 16, 18, -1.0F, -1.0F, 7.0F, 1, 1, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 16, 18, -1.0F, -1.0F, 8.5F, 1, 1, 1, 0.0F, false));

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone11.addChild(bone13);
		setRotationAngle(bone13, 0.0F, 0.0F, 0.3491F);
		bone13.cubeList.add(new ModelBox(bone13, 31, 22, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 16, 18, -1.0F, 0.0F, 10.0F, 1, 1, 1, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 16, 18, -1.0F, 0.0F, 2.5F, 1, 1, 1, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 16, 18, -1.0F, 0.0F, 4.0F, 1, 1, 1, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 16, 18, -1.0F, 0.0F, 5.5F, 1, 1, 1, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 16, 18, -1.0F, 0.0F, 7.0F, 1, 1, 1, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 16, 18, -1.0F, 0.0F, 8.5F, 1, 1, 1, 0.0F, false));

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone11.addChild(bone14);
		bone14.cubeList.add(new ModelBox(bone14, 54, 54, -1.0F, -0.5F, 0.5F, 1, 1, 1, 0.0F, false));

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(0.1F, -1.7F, -32.1F);
		setRotationAngle(bone15, 0.0F, 0.0F, 1.5708F);
		

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(0.0F, 0.0F, -1.0F);
		bone15.addChild(bone16);
		setRotationAngle(bone16, 0.0F, 0.0F, -0.3491F);
		bone16.cubeList.add(new ModelBox(bone16, 31, 22, -1.0F, -1.0F, 12.9F, 1, 1, 2, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 16, 18, -1.0F, -1.0F, 10.0F, 1, 1, 1, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 16, 18, -1.0F, -1.0F, 11.5F, 1, 1, 1, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 16, 18, -1.0F, -1.0F, 2.5F, 1, 1, 1, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 16, 18, -1.0F, -1.0F, 1.0F, 1, 1, 1, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 16, 18, -1.0F, -1.0F, 4.0F, 1, 1, 1, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 16, 18, -1.0F, -1.0F, 5.5F, 1, 1, 1, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 16, 18, -1.0F, -1.0F, 7.0F, 1, 1, 1, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 16, 18, -1.0F, -1.0F, 8.5F, 1, 1, 1, 0.0F, false));

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(0.0F, 0.0F, -1.0F);
		bone15.addChild(bone17);
		setRotationAngle(bone17, 0.0F, 0.0F, 0.3491F);
		bone17.cubeList.add(new ModelBox(bone17, 31, 22, -1.0F, 0.0F, 12.9F, 1, 1, 2, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 16, 18, -1.0F, 0.0F, 10.0F, 1, 1, 1, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 16, 18, -1.0F, 0.0F, 11.5F, 1, 1, 1, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 16, 18, -1.0F, 0.0F, 2.5F, 1, 1, 1, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 16, 18, -1.0F, 0.0F, 1.0F, 1, 1, 1, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 16, 18, -1.0F, 0.0F, 4.0F, 1, 1, 1, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 16, 18, -1.0F, 0.0F, 5.5F, 1, 1, 1, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 16, 18, -1.0F, 0.0F, 7.0F, 1, 1, 1, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 16, 18, -1.0F, 0.0F, 8.5F, 1, 1, 1, 0.0F, false));

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone15.addChild(bone18);
		
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		gun1.render(f5);
		gun3.render(f5);
		gun4.render(f5);
		gun5.render(f5);
		gun7.render(f5);
		gun8.render(f5);
		gun9.render(f5);
		gun10.render(f5);
		gun11.render(f5);
		gun12.render(f5);
		gun13.render(f5);
		gun14.render(f5);
		gun15.render(f5);
		gun16.render(f5);
		gun17.render(f5);
		gun18.render(f5);
		gun20.render(f5);
		gun21.render(f5);
		gun22.render(f5);
		gun23.render(f5);
		gun24.render(f5);
		gun25.render(f5);
		gun26.render(f5);
		gun27.render(f5);
		gun28.render(f5);
		gun29.render(f5);
		gun30.render(f5);
		gun32.render(f5);
		gun33.render(f5);
		gun34.render(f5);
		gun35.render(f5);
		gun36.render(f5);
		gun37.render(f5);
		gun38.render(f5);
		gun39.render(f5);
		gun40.render(f5);
		gun41.render(f5);
		gun42.render(f5);
		gun43.render(f5);
		gun44.render(f5);
		gun46.render(f5);
		gun47.render(f5);
		gun48.render(f5);
		gun49.render(f5);
		gun50.render(f5);
		gun51.render(f5);
		gun52.render(f5);
		gun53.render(f5);
		gun54.render(f5);
		gun55.render(f5);
		gun56.render(f5);
		gun57.render(f5);
		gun58.render(f5);
		gun59.render(f5);
		gun60.render(f5);
		gun62.render(f5);
		gun63.render(f5);
		gun64.render(f5);
		gun65.render(f5);
		gun66.render(f5);
		gun67.render(f5);
		gun68.render(f5);
		gun69.render(f5);
		gun70.render(f5);
		gun71.render(f5);
		gun72.render(f5);
		gun73.render(f5);
		gun74.render(f5);
		gun78.render(f5);
		gun79.render(f5);
		gun80.render(f5);
		gun82.render(f5);
		gun83.render(f5);
		gun84.render(f5);
		gun85.render(f5);
		gun86.render(f5);
		gun87.render(f5);
		gun88.render(f5);
		gun89.render(f5);
		gun90.render(f5);
		gun91.render(f5);
		gun92.render(f5);
		gun94.render(f5);
		gun95.render(f5);
		gun96.render(f5);
		gun97.render(f5);
		gun98.render(f5);
		gun99.render(f5);
		gun100.render(f5);
		gun101.render(f5);
		gun102.render(f5);
		gun103.render(f5);
		gun104.render(f5);
		gun105.render(f5);
		gun106.render(f5);
		gun107.render(f5);
		gun108.render(f5);
		gun109.render(f5);
		gun110.render(f5);
		gun111.render(f5);
		gun112.render(f5);
		action5.render(f5);
		gun113.render(f5);
		gun114.render(f5);
		gun115.render(f5);
		gun116.render(f5);
		gun117.render(f5);
		gun118.render(f5);
		gun119.render(f5);
		gun120.render(f5);
		gun121.render(f5);
		gun122.render(f5);
		gun123.render(f5);
		gun124.render(f5);
		gun125.render(f5);
		gun126.render(f5);
		gun127.render(f5);
		gun128.render(f5);
		gun129.render(f5);
		gun130.render(f5);
		gun131.render(f5);
		gun132.render(f5);
		gun133.render(f5);
		gun134.render(f5);
		gun135.render(f5);
		gun136.render(f5);
		gun137.render(f5);
		gun138.render(f5);
		gun139.render(f5);
		gun140.render(f5);
		gun141.render(f5);
		gun142.render(f5);
		gun143.render(f5);
		gun144.render(f5);
		gun145.render(f5);
		gun146.render(f5);
		gun147.render(f5);
		gun148.render(f5);
		gun149.render(f5);
		gun150.render(f5);
		gun151.render(f5);
		gun152.render(f5);
		gun153.render(f5);
		gun154.render(f5);
		gun155.render(f5);
		gun156.render(f5);
		gun157.render(f5);
		gun158.render(f5);
		gun159.render(f5);
		gun160.render(f5);
		gun161.render(f5);
		gun162.render(f5);
		gun163.render(f5);
		gun164.render(f5);
		gun165.render(f5);
		gun166.render(f5);
		gun167.render(f5);
		gun168.render(f5);
		gun169.render(f5);
		gun170.render(f5);
		gun171.render(f5);
		gun172.render(f5);
		gun173.render(f5);
		gun174.render(f5);
		gun175.render(f5);
		gun176.render(f5);
		gun177.render(f5);
		gun178.render(f5);
		gun179.render(f5);
		gun180.render(f5);
		gun181.render(f5);
		gun182.render(f5);
		gun183.render(f5);
		gun184.render(f5);
		gun185.render(f5);
		gun186.render(f5);
		gun187.render(f5);
		gun188.render(f5);
		bone.render(f5);
		bone2.render(f5);
		gun61.render(f5);
		gun2.render(f5);
		gun6.render(f5);
		gun19.render(f5);
		bone3.render(f5);
		bone4.render(f5);
		bone5.render(f5);
		bone6.render(f5);
		bone7.render(f5);
		bone11.render(f5);
		bone15.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}