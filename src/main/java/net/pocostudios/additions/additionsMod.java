package net.pocostudios.additions;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
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
	public static final Item MEMORY_CARD= new Item(new FabricItemSettings().group(ItemGroup.MISC)); //m. card
	public static final Item POWER_CORE= new Item(new FabricItemSettings().group(ItemGroup.MISC)); //p.core
	public static final Item CHARGED_POWER_CORE= new Item(new FabricItemSettings().group(ItemGroup.MISC)); //charged p.core

	public static final Item FUEL_TANK= new Item(new FabricItemSettings().group(ItemGroup.MISC)); //fuel





	//Al ore
	private static ConfiguredFeature<?, ?> ALUMINIUM_ORE_GEN = Feature.ORE
			.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
					additionsMod.ALUMINIUM_ORE_BLOCK.getDefaultState(), //Issue with "ALUMINIUM_ORE_BLOCK"; same as when we tried to make the tool repair ingredient. Update: Think I fixed it.
					9)) // vein size
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 64)))
			.spreadHorizontally()
			.repeat(20); // number of veins per chunk



	//Si ore
	private static ConfiguredFeature<?, ?> SILICON_ORE_GEN = Feature.ORE
	.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
			additionsMod.SILICON_ORE_BLOCK.getDefaultState(), //Issue with "ALUMINIUM_ORE_BLOCK"; same as when we tried to make the tool repair ingredient. Update: Think I fixed it.
			9)) // vein size
	.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 64)))
	.spreadHorizontally()
	.repeat(20); // number of veins per chunk




	@Override //Ok, this can only go here.
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

		Registry.register(Registry.ITEM, new Identifier("additions", "cpu"), CPU); //cpu
		Registry.register(Registry.ITEM, new Identifier("additions", "memory_card"), MEMORY_CARD); //cpu
		Registry.register(Registry.ITEM, new Identifier("additions", "power_core"), POWER_CORE); //power core
		Registry.register(Registry.ITEM, new Identifier("additions", "charged_power_core"), CHARGED_POWER_CORE); //power core

		Registry.register(Registry.ITEM, new Identifier("additions", "fuel_tank"), FUEL_TANK);






		//Al ore gen
		RegistryKey<ConfiguredFeature<?, ?>> aluminiumOreGen = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier("additions", "aluminium_ore_gen"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, aluminiumOreGen.getValue(), ALUMINIUM_ORE_GEN); //Some issue in "Registry.register..." 
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, aluminiumOreGen);

		//Si ore gen
		RegistryKey<ConfiguredFeature<?, ?>> siliconOreGen = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier("additions", "silicon_ore_gen"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, siliconOreGen.getValue(), SILICON_ORE_GEN); //Some issue in "Registry.register..." 
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, siliconOreGen);




	}
}
