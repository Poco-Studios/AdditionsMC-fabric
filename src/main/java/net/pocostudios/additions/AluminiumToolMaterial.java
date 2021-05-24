package net.pocostudios.additions;


import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;




public class AluminiumToolMaterial  implements ToolMaterial {

	public static final AluminiumToolMaterial INSTANCE = new AluminiumToolMaterial();

	@Override
    public int getDurability() {return 500;}
	public float getMiningSpeedMultiplier() {return 5.0F;}
	public float getAttackDamage() {return 3.0F;}
	public int getMiningLevel() {return 2;}
	public int getEnchantability() {return 15;}
	public Ingredient getRepairIngredient() {return Ingredient.ofItems(additionsMod.ALUMINIUM_INGOT);}

}
