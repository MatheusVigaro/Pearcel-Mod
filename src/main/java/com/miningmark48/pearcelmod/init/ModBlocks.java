package com.miningmark48.pearcelmod.init;

import com.miningmark48.pearcelmod.block.*;
import com.miningmark48.pearcelmod.creativetab.CreativeTabPearcelMod;
import com.miningmark48.pearcelmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.world.IBlockAccess;

public class ModBlocks {

	public static final Block meBlock = new BlockMEBlock().setBlockName("meBlock").setCreativeTab(CreativeTabPearcelMod.PearcelMod_TAB).setLightLevel(0.5f).setBlockTextureName(Reference.MOD_ID + ":meBlock");
	public static final Block pearcelOre = new BlockPearcelOre().setBlockName("pearcelOre").setCreativeTab(CreativeTabPearcelMod.PearcelMod_TAB).setBlockTextureName(Reference.MOD_ID + ":pearcelOre");
	public static final Block meGlass = new BlockMEGlass().setBlockName("meGlass").setCreativeTab(CreativeTabPearcelMod.PearcelMod_TAB).setLightLevel(0.2f).setBlockTextureName(Reference.MOD_ID + ":meGlass");
	
	public static void init(){
		
		GameRegistry.registerBlock(meBlock, "meBlock");
		GameRegistry.registerBlock(pearcelOre, "pearcelOre");
		GameRegistry.registerBlock(meGlass, "meGlass");
		
	}
	
}
