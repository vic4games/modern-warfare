package com.vicmatskiv.mw.blocks;

import java.util.Random;

import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.ModernWarfareMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockTinOre extends Block
{

	public BlockTinOre() {
		super(Material.rock);
		setRegistryName(ModernWarfareMod.MODID + "_" + "TinOre");
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "TinOre");
		// setBlockTextureName(ModernWarfareMod.MODID + ":" + "TinOre");
		setHardness(4F);
		setResistance(600000F);
		setStepSound(soundTypeStone);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(ModernWarfareMod.gunsTab);
	}

	public Block getBlockDropped(int meta, Random rand, int fortune) {
		return CommonProxy.TinOre;
	}

}
