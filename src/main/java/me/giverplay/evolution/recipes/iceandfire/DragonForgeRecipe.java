package me.giverplay.evolution.recipes.iceandfire;

import me.giverplay.evolution.data.RecipeData;

public class DragonForgeRecipe extends RecipeData {
  public DragonForgeRecipe(String name, String dragonType, int cookTime) {
    super(name, "dragonforge", "iceandfire:dragonforge");

    addData("dragon_type", dragonType);
    addData("cook_time", cookTime);
  }
}
