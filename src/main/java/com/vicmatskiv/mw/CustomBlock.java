package com.vicmatskiv.mw;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class CustomBlock extends BlockContainer {

	private String iconName;
	
	// Treat it like a normal block here. The Block Bounds are a good idea - the
	// first three are X Y and Z of the botton-left corner,
	// And the second three are the top-right corner.
	public CustomBlock(Material material, String iconName) {
		super(material);
		this.iconName = iconName;
		this.setCreativeTab(ModernWarfareMod.gunsTab);
		this.setBlockBounds(0.4F, 0.0F, 0.4F, 0.6F, 3.0F, 0.6F);
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new CustomBlockEntity();
	}

	// You don't want the normal render type, or it wont render properly.
	@Override
	public int getRenderType() {
		return -1;
	}

	// It's not an opaque cube, so you need this.
	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	// It's not a normal block, so you need this too.
	public boolean renderAsNormalBlock() {
		return false;
	}
//
//	// This is the icon to use for showing the block in your hand.
//	public void registerIcons(IIconRegister iconRegister) {
//		this.blockIcon = iconRegister.registerIcon(ModernWarfareMod.MODID + ":" + iconName);
//	}

}