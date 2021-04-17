package net.pocostudios.additions;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class additionsMod implements ModInitializer {

	//test item
	public static final Item TEST_ITEM = new Item(new FabricItemSettings().group(ItemGroup.MISC));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		System.out.println("AdditionsMC is initializing. Have fun!");

		Registry.register(Registry.ITEM, new Identifier("additions", "test_item"), TEST_ITEM);
	}
}
