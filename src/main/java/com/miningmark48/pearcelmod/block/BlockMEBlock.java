package com.miningmark48.pearcelmod.block;

import java.util.List;

import com.miningmark48.pearcelmod.creativetab.CreativeTabPearcelMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class BlockMEBlock extends BlockPearcelMod{
	
	public BlockMEBlock(){
		this.setBlockName("meBlock");
		this.setCreativeTab(CreativeTabPearcelMod.PearcelMod_TAB);
		this.setLightLevel(0.5f);
	}
	
	
}
