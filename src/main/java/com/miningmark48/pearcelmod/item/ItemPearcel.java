package com.miningmark48.pearcelmod.item;

import com.miningmark48.pearcelmod.creativetab.CreativeTabPearcelMod;
import com.miningmark48.pearcelmod.utility.LogHelper;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class ItemPearcel extends ItemFood{

	public ItemPearcel(){
		super(6, true);
		this.setUnlocalizedName("pearcelItem");
		this.setTextureName("pearcelMod:pearcelItem");
		this.setCreativeTab(CreativeTabPearcelMod.PearcelMod_TAB);
	}
	
}
