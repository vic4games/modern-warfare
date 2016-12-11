package com.vicmatskiv.mw.blocks;

import com.vicmatskiv.mw.ModernWarfareMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockZincOre extends Block {

	public BlockZincOre() {
		super(Material.rock);
		setRegistryName(ModernWarfareMod.MODID + "_" + "ZincOre");
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "ZincOre");
		// setBlockTextureName(ModernWarfareMod.MODID + ":" + "ZincOre");
		setHardness(6F);
		setResistance(600000F);
		setStepSound(soundTypeStone);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	// public Block getBlockDropped(int meta, Random rand, int fortune)
	// {
	// return CommonProxy.ZincOre;
	// }

}