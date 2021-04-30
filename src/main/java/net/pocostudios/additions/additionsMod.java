package net.pocostudios.additions;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import javax.tools.Tool;

public class additionsMod implements ModInitializer {

	public static final Item ALUMINIUM_INGOT = new Item(new FabricItemSettings().group(ItemGroup.MISC));

	public static ToolItem ALUMINIUM_SWORD = new SwordItem(AluminiumToolMaterial.INSTANCE, 7, +1.0F, new Item.Settings().group(ItemGroup.COMBAT));
	public static ToolItem ALUMINIUM_SHOVEL = new ShovelItem(AluminiumToolMaterial.INSTANCE, 1.5F, +1.0F, new Item.Settings().group(ItemGroup.TOOLS));
	//must figure out the Al axe and hoe (protected)


	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		System.out.println("AdditionsMC is initializing. Have fun!");

		Registry.register(Registry.ITEM, new Identifier("additions", "aluminium_ingot"), ALUMINIUM_INGOT); //Al ingot



	}
}
