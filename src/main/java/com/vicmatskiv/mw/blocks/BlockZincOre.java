package com.vicmatskiv.mw.blocks;

import com.vicmatskiv.mw.ModernWarfareMod;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockZincOre extends Block {

	public BlockZincOre() {
		super(Material.ROCK);
		//setRegistryName(ModernWarfareMod.MODID + "_" + "ZincOre");
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "ZincOre");
		setHardness(6F);
		setResistance(600000F);
		setSoundType(SoundType.STONE);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
}