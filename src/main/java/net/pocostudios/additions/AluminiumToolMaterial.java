public class AluminiumToolMaterial implements ToolMaterial {

	@Override
	public int getDurability() { return 500; }
	public float getMiningSpeedMultiplier() { return 5.0F; }
	public float getAttackDamage() { return 3.0F; }
	public int getEnchantability() { return 22; }
	public Ingredient getRepairIngredient() { return Ingredient.ofItems(Items.Aluminium); }



}