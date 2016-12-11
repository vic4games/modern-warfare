package com.vicmatskiv.mw.blocks;

import java.util.Random;

import com.vicmatskiv.mw.CommonProxy;
import com.vicmatskiv.mw.ModernWarfareMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockRubyOre extends Block {
	
	public BlockRubyOre()
	{
		super(Material.rock);
		setRegistryName(ModernWarfareMod.MODID + "_" + "RubyOre");
		setUnlocalizedName(ModernWarfareMod.MODID + "_" + "RubyOre");
		//setBlockTextureName(ModernWarfareMod.MODID + ":" + "RubyOre");
		setHardness(6F);
		setResistance(600000F);
		setStepSound(soundTypeStone); 
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(ModernWarfareMod.gunsTab);
	}
	public Item getItemDropped(int meta, Random rand, int fortune)
		{
			return CommonProxy.Ruby;
		}
		
	}