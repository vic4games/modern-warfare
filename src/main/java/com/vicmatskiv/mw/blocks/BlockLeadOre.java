package com.vicmatskiv.mw.blocks;

import java.util.Random;

import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.ModernWarfareMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlockLeadOre extends Block 

{
	private static final String name = "titaniumore";
	
	public BlockLeadOre()
	{
		super(Material.rock);
		setBlockName(ModernWarfareMod.MODID + "_" + "LeadOre");
		setBlockTextureName(ModernWarfareMod.MODID + ":" + "LeadOre");
		setHardness(6F);
		setResistance(600000F);
		setStepSound(soundTypeStone); 
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	public Block getBlockDropped(int meta, Random rand, int fortune)
		{
			return CommonProxy.LeadOre;
		}
		
	}