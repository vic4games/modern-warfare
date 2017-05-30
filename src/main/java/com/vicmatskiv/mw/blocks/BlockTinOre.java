package com.vicmatskiv.mw.blocks;

import java.util.Random;

import com.vicmatskiv.mw.ModernWarfareMod;
import com.vicmatskiv.mw.Ores;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlockTinOre extends Block 

{
	private static final String name = "titaniumore";
	
	public BlockTinOre()
	{
		super(Material.rock);
		setBlockName(ModernWarfareMod.MODID + "_" + "TinOre");
		setBlockTextureName(ModernWarfareMod.MODID + ":" + "tinore");
		setHardness(4F);
		setResistance(600000F);
		setStepSound(soundTypeStone); 
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	public Block getBlockDropped(int meta, Random rand, int fortune)
		{
			return Ores.TinOre;
		}
		
	}
