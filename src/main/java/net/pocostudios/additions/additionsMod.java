package net.pocostudios.additions;


import net.fabricmc.api.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class additionsMod implements ModInitializer {

	//ores
	/*private static ConfiguredFeature<?, ?> ORE_WOOL_OVERWORLD = Feature.ORE
    .configure(new OreFeatureConfig(
      OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
      Blocks.ALUMINIUM_ORE.getDefaultState(),
      5)) // vein size
    .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
      0,
      0,
      64)))
    .spreadHorizontally()
    .repeat(10); // number of veins per chunk*/


	//Items
	public static final Item ALUMINIUM_INGOT = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Item SILICON_INGOT = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS));
	


	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		System.out.println("AdditionsMC is initializing. Have fun!");

		Registry.register(Registry.ITEM, new Identifier("additions", "aluminium_ingot"), ALUMINIUM_INGOT); //Al ingot
		Registry.register(Registry.BLOCK, new Identifier("additions", "aluminium_ore"), ALUMINIUM_ORE); //Al ore

		Registry.register(Registry.ITEM, new Identifier("additions", "silicon_ingot"), SILICON_INGOT); //Si Ingot
		Registry.register(Registry.ITEM, new Identifier("additions", "silicon_plate"), SILICON_PLATE); //Si plate


	/*@Override
	RegistryKey<ConfiguredFeature<?, ?>> aluminium_ore = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
        new Identifier("additions", "aluminium_ore"));
    Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreWoolOverworld.getValue(), ALUMINIUM_ORE);
    BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, aluminium_ore);*/
	}
}
