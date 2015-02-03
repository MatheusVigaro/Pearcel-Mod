package com.miningmark48.pearcelmod.item;

import com.miningmark48.pearcelmod.creativetab.CreativeTabPearcelMod;
import com.miningmark48.pearcelmod.utility.LogHelper;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class ItemPearcelNugget extends ItemPearcelMod{

	public ItemPearcelNugget(){
		super();
		this.setUnlocalizedName("pearcelNugget");
		this.setCreativeTab(CreativeTabPearcelMod.PearcelMod_TAB);
		this.setMaxStackSize(16);
	}
	
}
