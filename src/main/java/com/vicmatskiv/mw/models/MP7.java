package com.vicmatskiv.mw.models;

import com.vicmatskiv.weaponlib.ModelWithAttachments;

import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.6.3
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class MP7 extends ModelWithAttachments {
	private final ModelRenderer Main9;
	private final ModelRenderer Main12;
	private final ModelRenderer Main14;
	private final ModelRenderer Main26;
	private final ModelRenderer Main27;
	private final ModelRenderer Main29;
	private final ModelRenderer Main30;
	private final ModelRenderer Main31;
	private final ModelRenderer Main32;
	private final ModelRenderer Main33;
	private final ModelRenderer Main34;
	private final ModelRenderer Main35;
	private final ModelRenderer Main40;
	private final ModelRenderer Main41;
	private final ModelRenderer Main42;
	private final ModelRenderer Main44;
	private final ModelRenderer Main45;
	private final ModelRenderer Main46;
	private final ModelRenderer Main48;
	private final ModelRenderer Main50;
	private final ModelRenderer Main52;
	private final ModelRenderer Main54;
	private final ModelRenderer Main56;
	private final ModelRenderer Main79MUZZLE;
	private final ModelRenderer Main80MUZZLE;
	private final ModelRenderer Main81MUZZLE;
	private final ModelRenderer Main82MUZZLE;
	private final ModelRenderer Main83MUZZLE;
	private final ModelRenderer Main84MUZZLE;
	private final ModelRenderer Main85MUZZLE;
	private final ModelRenderer Main86MUZZLE;
	private final ModelRenderer Main88;
	private final ModelRenderer Main98Safety;
	private final ModelRenderer Main102;
	private final ModelRenderer Main103;
	private final ModelRenderer Main111GripFront;
	private final ModelRenderer Main112GripFront;
	private final ModelRenderer Main115GripFront;
	private final ModelRenderer Main126GripMain;
	private final ModelRenderer Main127GripMain;
	private final ModelRenderer Main128GripMain;
	private final ModelRenderer Main134Trigger;
	private final ModelRenderer Main140Stock;
	private final ModelRenderer Main141Stock;
	private final ModelRenderer Main143Stock;
	private final ModelRenderer Main144Stock;
	private final ModelRenderer Main145Stock;
	private final ModelRenderer Main146Stock;
	private final ModelRenderer Main147Stock;
	private final ModelRenderer Main192;
	private final ModelRenderer Main192Stock;
	private final ModelRenderer Main193Stock;
	private final ModelRenderer Main196Stock;
	private final ModelRenderer Main197Stock;
	private final ModelRenderer Main195;
	private final ModelRenderer Main196;
	private final ModelRenderer Main197;
	private final ModelRenderer Main198;
	private final ModelRenderer Main199;
	private final ModelRenderer Main200;
	private final ModelRenderer Main201;
	private final ModelRenderer Main202;
	private final ModelRenderer Main203;
	private final ModelRenderer Main204;
	private final ModelRenderer Main205;
	private final ModelRenderer Main206;
	private final ModelRenderer Main207;
	private final ModelRenderer Main208;
	private final ModelRenderer Main209;
	private final ModelRenderer Main210;
	private final ModelRenderer Main211;
	private final ModelRenderer Main212;
	private final ModelRenderer Main213;
	private final ModelRenderer Main214;
	private final ModelRenderer Main215;
	private final ModelRenderer Main216;
	private final ModelRenderer Main217;
	private final ModelRenderer Main218;
	private final ModelRenderer Main219;
	private final ModelRenderer Main221;
	private final ModelRenderer Main222;
	private final ModelRenderer bone2;
	private final ModelRenderer bone;

	public MP7() {
		textureWidth = 256;
		textureHeight = 256;

		Main9 = new ModelRenderer(this);
		Main9.setRotationPoint(-4.0F, 1.5F, 5.6F);
		setRotationAngle(Main9, 0.7679F, 0.0F, 0.0F);
		Main9.cubeList.add(new ModelBox(Main9, 0, 0, 0.01F, -1.0F, 0.0F, 8, 3, 2, 0.0F, true));

		Main12 = new ModelRenderer(this);
		Main12.setRotationPoint(-2.0F, 2.0F, -4.0F);
		setRotationAngle(Main12, 0.1745F, 0.0F, 0.0F);
		Main12.cubeList.add(new ModelBox(Main12, 0, 0, 0.0F, 0.1302F, 0.7386F, 4, 6, 1, 0.0F, true));

		Main14 = new ModelRenderer(this);
		Main14.setRotationPoint(-2.0F, 1.0F, -32.0F);
		setRotationAngle(Main14, 1.3264F, 0.0F, 0.0F);
		Main14.cubeList.add(new ModelBox(Main14, 0, 0, 0.0F, 0.0F, -3.0F, 4, 1, 3, 0.0F, true));

		Main26 = new ModelRenderer(this);
		Main26.setRotationPoint(-2.0F, 1.0F, -32.0F);
		setRotationAngle(Main26, 1.3264F, 0.0F, 0.0F);
		Main26.cubeList.add(new ModelBox(Main26, 0, 0, 0.0F, 0.0F, 7.3F, 4, 1, 4, 0.0F, true));

		Main27 = new ModelRenderer(this);
		Main27.setRotationPoint(-2.0F, -9.0F, -29.0F);
		setRotationAngle(Main27, 0.0F, 0.0F, 0.5934F);
		Main27.cubeList.add(new ModelBox(Main27, 0, 0, 0.0F, 0.0F, 0.0F, 2, 3, 6, 0.0F, true));

		Main29 = new ModelRenderer(this);
		Main29.setRotationPoint(1.2F, -8.5F, -29.0F);
		setRotationAngle(Main29, 0.0F, 0.0F, -0.5934F);
		Main29.cubeList.add(new ModelBox(Main29, 0, 0, -1.0F, 0.0F, 0.0F, 2, 3, 6, 0.0F, true));

		Main30 = new ModelRenderer(this);
		Main30.setRotationPoint(-2.0F, -10.0F, 8.0F);
		setRotationAngle(Main30, 0.0F, 0.0F, 0.6283F);
		Main30.cubeList.add(new ModelBox(Main30, 0, 0, 0.0F, 0.0F, 0.0F, 2, 5, 33, 0.0F, true));

		Main31 = new ModelRenderer(this);
		Main31.setRotationPoint(1.2F, -9.4F, 8.0F);
		setRotationAngle(Main31, 0.0F, 0.0F, -0.6283F);
		Main31.cubeList.add(new ModelBox(Main31, 0, 0, -1.0F, 0.0F, 0.0F, 2, 5, 33, 0.0F, true));

		Main32 = new ModelRenderer(this);
		Main32.setRotationPoint(-5.0F, -4.0F, 5.0F);
		setRotationAngle(Main32, 0.0F, 0.0F, -0.3491F);
		Main32.cubeList.add(new ModelBox(Main32, 0, 0, 0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F, true));

		Main33 = new ModelRenderer(this);
		Main33.setRotationPoint(-5.0F, -4.0F, 22.0F);
		setRotationAngle(Main33, 0.0F, 0.0F, -0.3491F);
		Main33.cubeList.add(new ModelBox(Main33, 0, 0, 0.0F, 0.0F, 0.0F, 2, 3, 19, 0.0F, true));

		Main34 = new ModelRenderer(this);
		Main34.setRotationPoint(5.0F, -4.0F, 5.0F);
		setRotationAngle(Main34, 0.0F, 0.0F, 0.3491F);
		Main34.cubeList.add(new ModelBox(Main34, 0, 0, -2.0F, 0.0F, 0.0F, 2, 3, 3, 0.0F, true));

		Main35 = new ModelRenderer(this);
		Main35.setRotationPoint(5.0F, -4.0F, 16.0F);
		setRotationAngle(Main35, 0.0F, 0.0F, 0.3491F);
		Main35.cubeList.add(new ModelBox(Main35, 0, 0, -2.0F, 0.0F, 0.0F, 2, 3, 25, 0.0F, true));

		Main40 = new ModelRenderer(this);
		Main40.setRotationPoint(-2.0F, -10.0F, 7.0F);
		setRotationAngle(Main40, 0.0F, 0.0F, 0.6283F);
		Main40.cubeList.add(new ModelBox(Main40, 0, 0, 0.0F, 1.0F, 0.0F, 2, 4, 1, 0.0F, true));

		Main41 = new ModelRenderer(this);
		Main41.setRotationPoint(-2.0F, -10.0F, 6.0F);
		setRotationAngle(Main41, 0.0F, 0.0F, 0.6283F);
		Main41.cubeList.add(new ModelBox(Main41, 0, 0, 0.0F, 2.0F, 0.0F, 2, 3, 1, 0.0F, true));

		Main42 = new ModelRenderer(this);
		Main42.setRotationPoint(-2.0F, -10.0F, 5.0F);
		setRotationAngle(Main42, 0.0F, 0.0F, 0.6283F);
		Main42.cubeList.add(new ModelBox(Main42, 0, 0, 0.0F, 3.0F, 0.0F, 2, 2, 1, 0.0F, true));

		Main44 = new ModelRenderer(this);
		Main44.setRotationPoint(1.2F, -9.4F, 7.0F);
		setRotationAngle(Main44, 0.0F, 0.0F, -0.6283F);
		Main44.cubeList.add(new ModelBox(Main44, 0, 0, -1.0F, 1.0F, 0.0F, 2, 4, 1, 0.0F, true));

		Main45 = new ModelRenderer(this);
		Main45.setRotationPoint(1.2F, -9.4F, 6.0F);
		setRotationAngle(Main45, 0.0F, 0.0F, -0.6283F);
		Main45.cubeList.add(new ModelBox(Main45, 0, 0, -1.0F, 2.0F, 0.0F, 2, 3, 1, 0.0F, true));

		Main46 = new ModelRenderer(this);
		Main46.setRotationPoint(1.2F, -9.4F, 5.0F);
		setRotationAngle(Main46, 0.0F, 0.0F, -0.6283F);
		Main46.cubeList.add(new ModelBox(Main46, 0, 0, -1.0F, 3.0F, 0.0F, 2, 2, 1, 0.0F, true));

		Main48 = new ModelRenderer(this);
		Main48.setRotationPoint(-4.0F, 1.0F, -32.0F);
		setRotationAngle(Main48, 1.3264F, 0.0F, 0.0F);
		Main48.cubeList.add(new ModelBox(Main48, 0, 0, 0.0F, -0.0059F, 0.0484F, 8, 2, 8, 0.0F, true));

		Main50 = new ModelRenderer(this);
		Main50.setRotationPoint(-2.0F, 3.5F, -32.5F);
		setRotationAngle(Main50, 0.8727F, 0.0F, 0.0F);
		Main50.cubeList.add(new ModelBox(Main50, 0, 0, 0.0F, 0.0F, 0.0F, 4, 1, 3, 0.0F, true));

		Main52 = new ModelRenderer(this);
		Main52.setRotationPoint(-3.5F, -9.3F, -27.0F);
		setRotationAngle(Main52, 0.0F, 0.0F, 0.5949F);
		Main52.cubeList.add(new ModelBox(Main52, 0, 0, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, true));

		Main54 = new ModelRenderer(this);
		Main54.setRotationPoint(-5.0F, -0.3F, 36.5F);
		setRotationAngle(Main54, -0.384F, 0.0F, 0.0F);
		Main54.cubeList.add(new ModelBox(Main54, 0, 0, 0.5F, 0.0F, 0.0F, 9, 2, 2, 0.0F, true));

		Main56 = new ModelRenderer(this);
		Main56.setRotationPoint(-2.0F, -11.0F, 38.0F);
		setRotationAngle(Main56, -0.8203F, 0.0F, 0.0F);
		Main56.cubeList.add(new ModelBox(Main56, 0, 0, 0.0F, 0.0F, -1.0F, 1, 2, 3, 0.0F, true));

		Main79MUZZLE = new ModelRenderer(this);
		Main79MUZZLE.setRotationPoint(1.2F, -1.7F, -40.0F);
		setRotationAngle(Main79MUZZLE, 0.0F, 0.0F, 0.7679F);
		Main79MUZZLE.cubeList.add(new ModelBox(Main79MUZZLE, 0, 0, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, true));

		Main80MUZZLE = new ModelRenderer(this);
		Main80MUZZLE.setRotationPoint(1.2F, -1.7F, -35.0F);
		setRotationAngle(Main80MUZZLE, 0.0F, 0.0F, 0.7505F);
		Main80MUZZLE.cubeList.add(new ModelBox(Main80MUZZLE, 0, 0, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, true));

		Main81MUZZLE = new ModelRenderer(this);
		Main81MUZZLE.setRotationPoint(-1.3F, -1.7F, -40.0F);
		setRotationAngle(Main81MUZZLE, 0.0F, 0.0F, 0.7679F);
		Main81MUZZLE.cubeList.add(new ModelBox(Main81MUZZLE, 0, 0, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, true));

		Main82MUZZLE = new ModelRenderer(this);
		Main82MUZZLE.setRotationPoint(-1.3F, -1.7F, -35.0F);
		setRotationAngle(Main82MUZZLE, 0.0F, 0.0F, 0.7679F);
		Main82MUZZLE.cubeList.add(new ModelBox(Main82MUZZLE, 0, 0, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, true));

		Main83MUZZLE = new ModelRenderer(this);
		Main83MUZZLE.setRotationPoint(0.5F, -3.5F, -40.0F);
		setRotationAngle(Main83MUZZLE, 0.0F, 0.0F, 0.7679F);
		Main83MUZZLE.cubeList.add(new ModelBox(Main83MUZZLE, 0, 0, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, true));

		Main84MUZZLE = new ModelRenderer(this);
		Main84MUZZLE.setRotationPoint(0.5F, -3.5F, -35.0F);
		setRotationAngle(Main84MUZZLE, 0.0F, 0.0F, 0.7679F);
		Main84MUZZLE.cubeList.add(new ModelBox(Main84MUZZLE, 0, 0, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, true));

		Main85MUZZLE = new ModelRenderer(this);
		Main85MUZZLE.setRotationPoint(-0.6F, -3.5F, -40.0F);
		setRotationAngle(Main85MUZZLE, 0.0F, 0.0F, 0.7679F);
		Main85MUZZLE.cubeList.add(new ModelBox(Main85MUZZLE, 0, 0, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, true));

		Main86MUZZLE = new ModelRenderer(this);
		Main86MUZZLE.setRotationPoint(-0.6F, -3.5F, -35.0F);
		setRotationAngle(Main86MUZZLE, 0.0F, 0.0F, 0.7679F);
		Main86MUZZLE.cubeList.add(new ModelBox(Main86MUZZLE, 0, 0, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, true));

		Main88 = new ModelRenderer(this);
		Main88.setRotationPoint(-2.0F, -11.0F, -24.9F);
		setRotationAngle(Main88, 0.5411F, 0.0F, 0.0F);
		Main88.cubeList.add(new ModelBox(Main88, 0, 0, -0.01F, -0.8789F, -3.574F, 4, 2, 4, 0.0F, true));

		Main98Safety = new ModelRenderer(this);
		Main98Safety.setRotationPoint(-5.7F, 0.5F, 8.0F);
		setRotationAngle(Main98Safety, -0.1396F, 0.1047F, 0.0F);
		Main98Safety.cubeList.add(new ModelBox(Main98Safety, 0, 0, 9.0F, -1.0F, 0.0F, 1, 2, 6, 0.0F, true));

		Main102 = new ModelRenderer(this);
		Main102.setRotationPoint(0.0F, -8.0F, 39.5F);
		setRotationAngle(Main102, 0.0F, 0.0F, -0.6283F);
		Main102.cubeList.add(new ModelBox(Main102, 0, 0, 2.5F, 1.0F, 0.0F, 1, 3, 1, 0.0F, true));

		Main103 = new ModelRenderer(this);
		Main103.setRotationPoint(-3.0F, -10.0F, 39.5F);
		setRotationAngle(Main103, 0.0F, 0.0F, 0.6283F);
		Main103.cubeList.add(new ModelBox(Main103, 0, 0, 0.1F, 1.0F, 0.0F, 1, 3, 1, 0.0F, true));

		Main111GripFront = new ModelRenderer(this);
		Main111GripFront.setRotationPoint(-1.0F, 5.0F, -26.0F);
		setRotationAngle(Main111GripFront, -0.6632F, 0.0F, 0.0F);
		Main111GripFront.cubeList.add(new ModelBox(Main111GripFront, 0, 0, 0.0F, -1.9F, 0.0F, 2, 2, 3, 0.0F, true));

		Main112GripFront = new ModelRenderer(this);
		Main112GripFront.setRotationPoint(-1.0F, 4.0F, -20.8F);
		setRotationAngle(Main112GripFront, -0.6632F, 0.0F, 0.0F);
		Main112GripFront.cubeList.add(new ModelBox(Main112GripFront, 0, 0, 0.0F, 1.0F, -0.5F, 2, 2, 1, 0.0F, true));

		Main115GripFront = new ModelRenderer(this);
		Main115GripFront.setRotationPoint(-2.0F, 8.0F, -26.0F);
		

		Main126GripMain = new ModelRenderer(this);
		Main126GripMain.setRotationPoint(-3.0F, 6.0F, 16.0F);
		setRotationAngle(Main126GripMain, 0.4014F, 0.0F, 0.0F);
		Main126GripMain.cubeList.add(new ModelBox(Main126GripMain, 0, 0, -0.49F, -3.0F, -1.0F, 7, 6, 3, 0.0F, true));

		Main127GripMain = new ModelRenderer(this);
		Main127GripMain.setRotationPoint(-3.0F, 1.0F, 20.0F);
		setRotationAngle(Main127GripMain, -1.0472F, 0.0F, 0.0F);
		Main127GripMain.cubeList.add(new ModelBox(Main127GripMain, 0, 0, -0.5F, 0.0F, -1.0F, 7, 5, 3, 0.0F, true));

		Main128GripMain = new ModelRenderer(this);
		Main128GripMain.setRotationPoint(-3.0F, 18.2F, 17.1F);
		setRotationAngle(Main128GripMain, -0.3142F, 0.0F, 0.0F);
		Main128GripMain.cubeList.add(new ModelBox(Main128GripMain, 0, 0, -0.49F, 0.0F, -2.0F, 7, 3, 4, 0.0F, true));
		Main128GripMain.cubeList.add(new ModelBox(Main128GripMain, 0, 0, -0.49F, -4.2686F, -8.7882F, 7, 10, 4, 0.0F, true));

		Main134Trigger = new ModelRenderer(this);
		Main134Trigger.setRotationPoint(-1.0F, 4.0F, 4.2F);
		setRotationAngle(Main134Trigger, -0.4887F, 0.0F, 0.0F);
		Main134Trigger.cubeList.add(new ModelBox(Main134Trigger, 0, 0, 0.0F, -3.1183F, -0.5255F, 2, 5, 2, 0.0F, true));

		Main140Stock = new ModelRenderer(this);
		Main140Stock.setRotationPoint(-1.0F, 3.0F, 41.0F);
		setRotationAngle(Main140Stock, 0.2443F, 0.0F, 0.0F);
		Main140Stock.cubeList.add(new ModelBox(Main140Stock, 70, 100, -0.5F, 0.0F, 0.0F, 3, 11, 3, 0.0F, true));

		Main141Stock = new ModelRenderer(this);
		Main141Stock.setRotationPoint(-3.0F, 1.0F, 44.0F);
		setRotationAngle(Main141Stock, 0.0F, 0.0F, -0.1571F);
		Main141Stock.cubeList.add(new ModelBox(Main141Stock, 70, 100, -0.6239F, 2.1037F, 0.0F, 3, 11, 3, 0.0F, true));

		Main143Stock = new ModelRenderer(this);
		Main143Stock.setRotationPoint(-4.0F, -7.0F, 41.0F);
		setRotationAngle(Main143Stock, 0.0F, 0.0F, 0.6283F);
		Main143Stock.cubeList.add(new ModelBox(Main143Stock, 70, 100, -0.1F, 0.2F, 0.0F, 1, 1, 6, 0.0F, true));

		Main144Stock = new ModelRenderer(this);
		Main144Stock.setRotationPoint(4.0F, -7.0F, 41.0F);
		setRotationAngle(Main144Stock, 0.0F, 0.0F, -0.6283F);
		Main144Stock.cubeList.add(new ModelBox(Main144Stock, 70, 100, -1.0F, 0.2F, 0.0F, 1, 1, 6, 0.0F, true));

		Main145Stock = new ModelRenderer(this);
		Main145Stock.setRotationPoint(-5.0F, -4.0F, 41.0F);
		setRotationAngle(Main145Stock, 0.0F, 0.0F, -0.2269F);
		Main145Stock.cubeList.add(new ModelBox(Main145Stock, 70, 100, -0.03F, 0.0F, 0.01F, 6, 8, 6, 0.0F, true));

		Main146Stock = new ModelRenderer(this);
		Main146Stock.setRotationPoint(5.0F, -4.0F, 41.0F);
		setRotationAngle(Main146Stock, 0.0F, 0.0F, 0.2269F);
		Main146Stock.cubeList.add(new ModelBox(Main146Stock, 70, 100, -4.0F, 0.0F, 0.0F, 4, 8, 6, 0.0F, true));

		Main147Stock = new ModelRenderer(this);
		Main147Stock.setRotationPoint(1.1F, 0.5F, 44.0F);
		setRotationAngle(Main147Stock, 0.0F, 0.0F, 0.1571F);
		Main147Stock.cubeList.add(new ModelBox(Main147Stock, 70, 100, -0.4436F, 2.3169F, 0.02F, 3, 11, 3, 0.0F, true));

		Main192 = new ModelRenderer(this);
		Main192.setRotationPoint(1.0F, -11.0F, 38.0F);
		setRotationAngle(Main192, -0.8203F, 0.0F, 0.0F);
		Main192.cubeList.add(new ModelBox(Main192, 0, 0, 0.0F, 0.0F, -1.0F, 1, 2, 3, 0.0F, true));

		Main192Stock = new ModelRenderer(this);
		Main192Stock.setRotationPoint(4.0F, -6.5F, -28.0F);
		setRotationAngle(Main192Stock, 0.0F, 0.0F, 0.7854F);
		Main192Stock.cubeList.add(new ModelBox(Main192Stock, 70, 100, -0.1414F, 0.1414F, 0.0F, 1, 1, 74, 0.0F, true));

		Main193Stock = new ModelRenderer(this);
		Main193Stock.setRotationPoint(-4.0F, -6.5F, -28.0F);
		setRotationAngle(Main193Stock, 0.0F, 0.0F, 0.7854F);
		Main193Stock.cubeList.add(new ModelBox(Main193Stock, 70, 100, 0.1414F, -0.1414F, 0.0F, 1, 1, 74, 0.0F, true));

		Main196Stock = new ModelRenderer(this);
		Main196Stock.setRotationPoint(4.5F, -6.0F, -28.0F);
		setRotationAngle(Main196Stock, 0.0F, -2.6025F, 0.0F);
		Main196Stock.cubeList.add(new ModelBox(Main196Stock, 70, 100, 0.0429F, 0.25F, 0.0257F, 1, 2, 1, 0.0F, true));

		Main197Stock = new ModelRenderer(this);
		Main197Stock.setRotationPoint(-4.5F, -6.0F, -28.0F);
		setRotationAngle(Main197Stock, 0.0F, 2.6025F, 0.0F);
		Main197Stock.cubeList.add(new ModelBox(Main197Stock, 70, 100, -1.0429F, 0.25F, 0.0257F, 1, 2, 1, 0.0F, true));

		Main195 = new ModelRenderer(this);
		Main195.setRotationPoint(-2.0F, -9.4F, -7.0F);
		setRotationAngle(Main195, -0.7854F, 0.0F, 0.0F);
		Main195.cubeList.add(new ModelBox(Main195, 0, 0, 0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, true));

		Main196 = new ModelRenderer(this);
		Main196.setRotationPoint(-2.0F, -9.4F, -11.0F);
		setRotationAngle(Main196, -0.7854F, 0.0F, 0.0F);
		Main196.cubeList.add(new ModelBox(Main196, 0, 0, 0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, true));

		Main197 = new ModelRenderer(this);
		Main197.setRotationPoint(-2.0F, -9.4F, -13.0F);
		setRotationAngle(Main197, -0.7854F, 0.0F, 0.0F);
		Main197.cubeList.add(new ModelBox(Main197, 0, 0, 0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, true));

		Main198 = new ModelRenderer(this);
		Main198.setRotationPoint(-2.0F, -9.4F, -17.0F);
		setRotationAngle(Main198, -0.7854F, 0.0F, 0.0F);
		Main198.cubeList.add(new ModelBox(Main198, 0, 0, 0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, true));

		Main199 = new ModelRenderer(this);
		Main199.setRotationPoint(-2.0F, -9.4F, -19.0F);
		setRotationAngle(Main199, -0.7854F, 0.0F, 0.0F);
		Main199.cubeList.add(new ModelBox(Main199, 0, 0, 0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, true));

		Main200 = new ModelRenderer(this);
		Main200.setRotationPoint(-2.0F, -9.4F, -23.0F);
		setRotationAngle(Main200, -0.7854F, 0.0F, 0.0F);
		Main200.cubeList.add(new ModelBox(Main200, 0, 0, 0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, true));

		Main201 = new ModelRenderer(this);
		Main201.setRotationPoint(-2.0F, -9.6F, -23.0F);
		setRotationAngle(Main201, 2.3562F, 0.0F, 0.0F);
		Main201.cubeList.add(new ModelBox(Main201, 0, 0, 0.01F, 0.0F, 0.0F, 4, 1, 1, 0.0F, true));

		Main202 = new ModelRenderer(this);
		Main202.setRotationPoint(-2.0F, -9.6F, -19.0F);
		setRotationAngle(Main202, 2.3562F, 0.0F, 0.0F);
		Main202.cubeList.add(new ModelBox(Main202, 0, 0, 0.01F, 0.0F, 0.0F, 4, 1, 1, 0.0F, true));

		Main203 = new ModelRenderer(this);
		Main203.setRotationPoint(-2.0F, -9.6F, -17.0F);
		setRotationAngle(Main203, 2.3562F, 0.0F, 0.0F);
		Main203.cubeList.add(new ModelBox(Main203, 0, 0, 0.01F, 0.0F, 0.0F, 4, 1, 1, 0.0F, true));

		Main204 = new ModelRenderer(this);
		Main204.setRotationPoint(-2.0F, -9.6F, -13.0F);
		setRotationAngle(Main204, 2.3562F, 0.0F, 0.0F);
		Main204.cubeList.add(new ModelBox(Main204, 0, 0, 0.01F, 0.0F, 0.0F, 4, 1, 1, 0.0F, true));

		Main205 = new ModelRenderer(this);
		Main205.setRotationPoint(-2.0F, -9.6F, -11.0F);
		setRotationAngle(Main205, 2.3562F, 0.0F, 0.0F);
		Main205.cubeList.add(new ModelBox(Main205, 0, 0, 0.01F, 0.0F, 0.0F, 4, 1, 1, 0.0F, true));

		Main206 = new ModelRenderer(this);
		Main206.setRotationPoint(-2.0F, -9.6F, -7.0F);
		setRotationAngle(Main206, 2.3562F, 0.0F, 0.0F);
		Main206.cubeList.add(new ModelBox(Main206, 0, 0, 0.01F, 0.0F, 0.0F, 4, 1, 1, 0.0F, true));

		Main207 = new ModelRenderer(this);
		Main207.setRotationPoint(-3.5F, -9.3F, -27.0F);
		setRotationAngle(Main207, 0.0F, 0.0F, 0.1487F);
		Main207.cubeList.add(new ModelBox(Main207, 0, 0, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, true));

		Main208 = new ModelRenderer(this);
		Main208.setRotationPoint(-4.6F, -7.6F, -27.0F);
		setRotationAngle(Main208, 0.0F, 0.0F, -0.5205F);
		Main208.cubeList.add(new ModelBox(Main208, 0, 0, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, true));

		Main209 = new ModelRenderer(this);
		Main209.setRotationPoint(3.5F, -9.3F, -27.0F);
		setRotationAngle(Main209, 0.0F, 0.0F, -0.5949F);
		Main209.cubeList.add(new ModelBox(Main209, 0, 0, -1.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, true));

		Main210 = new ModelRenderer(this);
		Main210.setRotationPoint(3.5F, -9.3F, -27.0F);
		setRotationAngle(Main210, 0.0F, 0.0F, -0.1487F);
		Main210.cubeList.add(new ModelBox(Main210, 0, 0, -2.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, true));

		Main211 = new ModelRenderer(this);
		Main211.setRotationPoint(4.6F, -7.6F, -27.0F);
		setRotationAngle(Main211, 0.0F, 0.0F, 0.5205F);
		Main211.cubeList.add(new ModelBox(Main211, 0, 0, -1.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, true));

		Main212 = new ModelRenderer(this);
		Main212.setRotationPoint(-3.8F, -9.6F, 34.0F);
		setRotationAngle(Main212, 0.0F, 0.0F, 0.5949F);
		Main212.cubeList.add(new ModelBox(Main212, 0, 0, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, true));

		Main213 = new ModelRenderer(this);
		Main213.setRotationPoint(-4.9F, -7.9F, 34.0F);
		setRotationAngle(Main213, 0.0F, 0.0F, -0.5205F);
		Main213.cubeList.add(new ModelBox(Main213, 0, 0, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, true));

		Main214 = new ModelRenderer(this);
		Main214.setRotationPoint(-3.8F, -9.6F, 34.0F);
		setRotationAngle(Main214, 0.0F, 0.0F, 0.1487F);
		Main214.cubeList.add(new ModelBox(Main214, 0, 0, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, true));

		Main215 = new ModelRenderer(this);
		Main215.setRotationPoint(3.8F, -9.6F, 34.0F);
		setRotationAngle(Main215, 0.0F, 0.0F, -0.5949F);
		Main215.cubeList.add(new ModelBox(Main215, 0, 0, -1.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, true));

		Main216 = new ModelRenderer(this);
		Main216.setRotationPoint(3.8F, -9.6F, 34.0F);
		setRotationAngle(Main216, 0.0F, 0.0F, -0.1487F);
		Main216.cubeList.add(new ModelBox(Main216, 0, 0, -2.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, true));

		Main217 = new ModelRenderer(this);
		Main217.setRotationPoint(4.9F, -7.9F, 34.0F);
		setRotationAngle(Main217, 0.0F, 0.0F, 0.5205F);
		Main217.cubeList.add(new ModelBox(Main217, 0, 0, -1.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, true));

		Main218 = new ModelRenderer(this);
		Main218.setRotationPoint(1.2F, -8.5F, -17.0F);
		setRotationAngle(Main218, 0.0F, 0.0F, -0.5934F);
		Main218.cubeList.add(new ModelBox(Main218, 0, 0, -1.0F, 0.0F, 0.0F, 2, 3, 25, 0.0F, true));

		Main219 = new ModelRenderer(this);
		Main219.setRotationPoint(1.2F, -8.5F, -23.0F);
		setRotationAngle(Main219, 0.0F, 0.0F, -0.5934F);
		Main219.cubeList.add(new ModelBox(Main219, 0, 0, -1.0F, 0.0F, 0.0F, 2, 2, 6, 0.0F, true));

		Main221 = new ModelRenderer(this);
		Main221.setRotationPoint(-2.0F, -9.0F, -17.0F);
		setRotationAngle(Main221, 0.0F, 0.0F, 0.5934F);
		Main221.cubeList.add(new ModelBox(Main221, 0, 0, 0.0F, 0.0F, 0.0F, 2, 3, 25, 0.0F, true));

		Main222 = new ModelRenderer(this);
		Main222.setRotationPoint(-2.0F, -9.0F, -23.0F);
		setRotationAngle(Main222, 0.0F, 0.0F, 0.5934F);
		Main222.cubeList.add(new ModelBox(Main222, 0, 0, 0.0F, 0.0F, 0.0F, 1, 2, 6, 0.0F, true));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-1.0F, 20.0F, -26.15F);
		setRotationAngle(bone2, 0.1745F, 0.0F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 0, 0, -1.0F, 0.0F, -0.05F, 4, 1, 5, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 0, 0, -1.8F, -34.0F, -11.0F, 1, 1, 4, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 0.8F, -34.0F, -11.0F, 1, 1, 4, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 70, 100, -4.5F, -29.75F, -28.0F, 9, 2, 74, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -5.5F, -27.1F, -29.0F, 11, 4, 22, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -2.0F, -36.0F, -25.0F, 4, 2, 62, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -1.5F, -34.5F, 37.0F, 3, 2, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 70, 100, -4.0F, -31.0F, 41.0F, 8, 1, 6, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -3.5F, -16.0F, 16.0F, 7, 11, 3, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -3.5F, -3.0F, 16.0F, 7, 1, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -3.5F, -21.4F, 10.0F, 7, 18, 6, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -3.0F, -21.0F, 8.5F, 6, 15, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -2.0F, -21.0F, -26.2F, 4, 11, 7, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -2.0F, -10.0F, -26.2F, 4, 6, 5, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -1.5F, -10.25F, -21.45F, 3, 6, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -2.5F, -19.6F, -23.7F, 5, 2, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 1.1F, -16.0F, -25.8F, 1, 11, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -2.1F, -16.0F, -25.8F, 1, 11, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 1.1F, -16.0F, -23.3F, 1, 11, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -2.1F, -16.0F, -23.3F, 1, 11, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -1.5F, -22.0F, -26.0F, 3, 3, 7, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -4.0F, -28.0F, -4.0F, 8, 6, 11, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -1.0F, -34.2F, 26.01F, 2, 2, 16, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -4.5F, -34.5F, 41.0F, 4, 3, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 0.5F, -34.5F, 41.0F, 4, 3, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -1.99F, -35.8F, 36.3F, 4, 2, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 100, -1.0F, -28.0F, 41.0F, 2, 6, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 100, -3.0F, -31.0F, 39.0F, 6, 3, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 1.0F, -26.0F, -40.0F, 1, 1, 6, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -2.0F, -26.0F, -40.0F, 1, 1, 6, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -0.5F, -27.5F, -40.0F, 1, 1, 6, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -0.5F, -24.5F, -40.0F, 1, 1, 6, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -4.0F, -26.0F, -21.0F, 3, 1, 5, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -4.0F, -26.0F, -30.0F, 3, 1, 6, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -1.5F, -27.0F, -34.0F, 3, 3, 40, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -4.5F, -32.0F, 36.0F, 9, 2, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -5.0F, -30.0F, 29.0F, 10, 2, 18, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -5.0F, -30.0F, 19.0F, 10, 2, 8, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -2.0F, -33.0F, -23.0F, 4, 2, 16, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -2.0F, -34.0F, -29.0F, 4, 3, 6, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -2.0F, -34.0F, -19.0F, 4, 1, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -2.0F, -34.0F, -13.0F, 4, 1, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -3.0F, -31.4F, -28.99F, 6, 4, 68, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -2.0F, -34.0F, -7.0F, 4, 3, 49, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -5.0F, -30.0F, 5.0F, 10, 2, 12, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -2.0F, -16.5F, -2.0F, 4, 1, 11, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -4.0F, -28.0F, -30.0F, 8, 5, 26, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -4.0F, -28.0F, 7.0F, 8, 7, 34, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -3.0F, -23.0F, -32.0F, 6, 1, 28, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Main9.render(f5);
		Main12.render(f5);
		Main14.render(f5);
		Main26.render(f5);
		Main27.render(f5);
		Main29.render(f5);
		Main30.render(f5);
		Main31.render(f5);
		Main32.render(f5);
		Main33.render(f5);
		Main34.render(f5);
		Main35.render(f5);
		Main40.render(f5);
		Main41.render(f5);
		Main42.render(f5);
		Main44.render(f5);
		Main45.render(f5);
		Main46.render(f5);
		Main48.render(f5);
		Main50.render(f5);
		Main52.render(f5);
		Main54.render(f5);
		Main56.render(f5);
		Main79MUZZLE.render(f5);
		Main80MUZZLE.render(f5);
		Main81MUZZLE.render(f5);
		Main82MUZZLE.render(f5);
		Main83MUZZLE.render(f5);
		Main84MUZZLE.render(f5);
		Main85MUZZLE.render(f5);
		Main86MUZZLE.render(f5);
		Main88.render(f5);
		Main98Safety.render(f5);
		Main102.render(f5);
		Main103.render(f5);
		Main111GripFront.render(f5);
		Main112GripFront.render(f5);
		Main115GripFront.render(f5);
		Main126GripMain.render(f5);
		Main127GripMain.render(f5);
		Main128GripMain.render(f5);
		Main134Trigger.render(f5);
		Main140Stock.render(f5);
		Main141Stock.render(f5);
		Main143Stock.render(f5);
		Main144Stock.render(f5);
		Main145Stock.render(f5);
		Main146Stock.render(f5);
		Main147Stock.render(f5);
		Main192.render(f5);
		Main192Stock.render(f5);
		Main193Stock.render(f5);
		Main196Stock.render(f5);
		Main197Stock.render(f5);
		Main195.render(f5);
		Main196.render(f5);
		Main197.render(f5);
		Main198.render(f5);
		Main199.render(f5);
		Main200.render(f5);
		Main201.render(f5);
		Main202.render(f5);
		Main203.render(f5);
		Main204.render(f5);
		Main205.render(f5);
		Main206.render(f5);
		Main207.render(f5);
		Main208.render(f5);
		Main209.render(f5);
		Main210.render(f5);
		Main211.render(f5);
		Main212.render(f5);
		Main213.render(f5);
		Main214.render(f5);
		Main215.render(f5);
		Main216.render(f5);
		Main217.render(f5);
		Main218.render(f5);
		Main219.render(f5);
		Main221.render(f5);
		Main222.render(f5);
		bone2.render(f5);
		bone.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}