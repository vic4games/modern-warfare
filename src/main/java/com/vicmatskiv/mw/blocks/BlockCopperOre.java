package com.vicmatskiv.mw.blocks;

import java.util.Random;

import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.ModernWarfareMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockCopperOre extends Block {
	
	public BlockCopperOre()
	{
		super(Material.rock);
		setRegistryName(ModernWarfareMod.MODID + "_" + "CopperOre");
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "CopperOre");
		//setBlockTextureName(ModernWarfareMod.MODID + ":" + "CopperOre");
		setHardness(6F);
		setResistance(600000F);
		setStepSound(soundTypeStone); 
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	public Block getBlockDropped(int meta, Random rand, int fortune)
		{
			return CommonProxy.CopperOre;
		}
		
	}