package net.pocostudios.additions;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.pocostudios.additions.additionsMod;

public class AluminiumToolMaterial implements ToolMaterial {

	public static final AluminiumToolMaterial INSTANCE = new AluminiumToolMaterial();

	@Override
	public int getDurability() { return 500; }
	public float getMiningSpeedMultiplier() { return 5.0F; }
	public float getAttackDamage() { return 3.0F; }
	public int getEnchantability() { return 22; }
	public Ingredient getRepairIngredient() { return Ingredient.ofItems(Items.AIR); }
	public int getMiningLevel() { return 4; }



}