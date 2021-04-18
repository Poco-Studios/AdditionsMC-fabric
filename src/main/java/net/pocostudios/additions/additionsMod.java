package net.pocostudios.additions;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class additionsMod implements ModInitializer {

	//test items
	//public static final Item TEST_ITEM = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	//public static final Block TEST_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f));

	public static final Item OBSIDIAN_SWORD = new Item(new FabricItemSettings().group(ItemGroup.COMBAT));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		System.out.println("AdditionsMC is initializing. Have fun!");

		//Registry.register(Registry.ITEM, new Identifier("additions", "test_item"), TEST_ITEM); //register test item
		//Registry.register(Registry.BLOCK, new Identifier("additions", "test_block"), TEST_BLOCK); //test block
		//Registry.register(Registry.ITEM, new Identifier("additions", "test_block"), new BlockItem(TEST_BLOCK, new FabricItemSettings().group(ItemGroup.MISC))); //item for block

		Registry.register(Registry.ITEM, new Identifier("additions", "obsidian_sword"), OBSIDIAN_SWORD); //obs. sword

	}
}
