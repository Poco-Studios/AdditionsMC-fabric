package net.pocostudios.additions;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class additionsMod implements ModInitializer {

	public static final Item ALUMINIUM_INGOT = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Block ALUMINIUM_ORE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(1.5F).resistance(6.0F)); //Al things
	public static final Item ALUMINIUM_WIRE = new Item(new FabricItemSettings().group(ItemGroup.MISC));

	public static final Item SILICON_INGOT = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Block SILICON_ORE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(1.5F).resistance(6.0F));
	public static final Item SILICON_PLATE= new Item(new FabricItemSettings().group(ItemGroup.MISC)); //Si things

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		System.out.println("AdditionsMC is initializing. Have fun!");

		Registry.register(Registry.ITEM, new Identifier("additions", "aluminium_ingot"), ALUMINIUM_INGOT); //Al ingot
		Registry.register(Registry.BLOCK, new Identifier("additions", "aluminium_ore"), ALUMINIUM_ORE_BLOCK); //Al ore
		Registry.register(Registry.ITEM, new Identifier("additions", "aluminium_ore"), new BlockItem(ALUMINIUM_ORE_BLOCK, new FabricItemSettings().group(ItemGroup.MISC)));
		Registry.register(Registry.ITEM, new Identifier("additions", "aluminium_wire"), ALUMINIUM_WIRE); //Al wire

		Registry.register(Registry.ITEM, new Identifier("additions", "silicon_ingot"), SILICON_INGOT); //Si ingot
		Registry.register(Registry.ITEM, new Identifier("additions", "silicon_plate"), SILICON_PLATE); //Si plate
		Registry.register(Registry.BLOCK, new Identifier("additions", "silicon_ore"), SILICON_ORE_BLOCK); //si ore
		Registry.register(Registry.ITEM, new Identifier("additions", "silicon_ore"), new BlockItem(SILICON_ORE_BLOCK, new FabricItemSettings().group(ItemGroup.MISC))); //si ore blockItem


	}
}
