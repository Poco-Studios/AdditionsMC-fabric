package net.pocostudios.additions;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class additionsMod implements ModInitializer {

	public static final Item ALUMINIUM_INGOT = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Block ALUMINIUM_ORE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(1.5F).resistance(6.0F)); //Al things
	public static final Item ALUMINIUM_WIRE = new Item(new FabricItemSettings().group(ItemGroup.MISC));

	public static final Item SILICON_INGOT = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Block SILICON_ORE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(1.5F).resistance(6.0F));
	public static final Item SILICON_PLATE= new Item(new FabricItemSettings().group(ItemGroup.MISC)); //Si things

	public static final Item CPU= new Item(new FabricItemSettings().group(ItemGroup.MISC)); //CPU









	//Ore gen

	/* //Ugh. This never works. Will remain commented till we fix it.
	private static ConfiguredFeature<?, ?> ALUMINIUM_ORE_GEN = Feature.ORE
			.configure(new OreFeatureConfig(
					OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
					Blocks.ALUMINIUM_ORE_BLOCK.getDefaultState(), //Issue with "ALUMINIUM_ORE_BLOCK"; same as when we tried to make the tool repair ingredient.
					9)) // vein size
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
					0,
					0,
					64)))
			.spreadHorizontally()
			.repeat(20); // number of veins per chunk
	*/





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

		Registry.register(Registry.ITEM, new Identifier("additions", "cpu"), CPU); //si ore





		/* This doesn't work either.
		RegistryKey<ConfiguredFeature<?, ?>> aluminiumOreGen = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier("additions", "aluminium_ore_gen"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, aluminiumOreGen.getValue(), ALUMINIUM_ORE_BLOCK);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, aluminiumOreGen);
		*/






	}
}
