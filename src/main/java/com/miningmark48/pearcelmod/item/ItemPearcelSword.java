package com.miningmark48.pearcelmod.item;

import java.util.List;

import com.miningmark48.pearcelmod.creativetab.CreativeTabPearcelMod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemPearcelSword extends ItemSword{

	public ItemPearcelSword(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("pearcelmod:pearcelSword");
		this.setTextureName("pearcelmod:pearcelSword");
		this.setMaxStackSize(1);
		this.setMaxDamage(2048);
		this.setCreativeTab(CreativeTabPearcelMod.PearcelMod_TAB);
	}
	
	@Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
            par3List.add("A pear of these would be better...");
    }
	
}
