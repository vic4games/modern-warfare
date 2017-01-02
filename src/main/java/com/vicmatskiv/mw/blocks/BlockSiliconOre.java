package com.vicmatskiv.mw.blocks;

import java.util.Random;

import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.ModernWarfareMod;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockSiliconOre extends Block 
{	
	public BlockSiliconOre()
	{
		super(Material.ROCK);
		//setRegistryName(ModernWarfareMod.MODID + "_" + "SiliconOre");
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "SiliconOre");
		setHardness(6F);
		setResistance(600000F);
		setSoundType(SoundType.STONE);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	public Block getBlockDropped(int meta, Random rand, int fortune)
		{
			return CommonProxy.SiliconOre;
		}
		
	}