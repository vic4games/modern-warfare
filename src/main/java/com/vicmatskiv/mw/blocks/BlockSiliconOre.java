package com.vicmatskiv.mw.blocks;

import java.util.Random;

import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.ModernWarfareMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockSiliconOre extends Block 
{	
	public BlockSiliconOre()
	{
		super(Material.rock);
		setRegistryName(ModernWarfareMod.MODID + "_" + "SiliconOre");
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "SiliconOre");
		//setBlockTextureName(ModernWarfareMod.MODID + ":" + "SiliconOre");
		setHardness(6F);
		setResistance(600000F);
		setStepSound(soundTypeStone); 
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	public Block getBlockDropped(int meta, Random rand, int fortune)
		{
			return CommonProxy.SiliconOre;
		}
		
	}