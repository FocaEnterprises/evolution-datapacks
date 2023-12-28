package me.giverplay.evolution.recipes.iceandfire;

import me.giverplay.evolution.data.RecipeItem;

public class AllthemodiumVibraniumFromDragonforgeRecipe extends DragonForgeRecipe {
  public AllthemodiumVibraniumFromDragonforgeRecipe() {
    super("allthemodium_vibranium_from_dragonforge", "fire", 1000);

    addEntry("input", new RecipeItem("allthemodium:vibranium_ingot"));
    addEntry("blood", new RecipeItem("allthemodium:allthemodium_ingot"));
    addEntry("result", new RecipeItem("allthemodium:vibranium_allthemodium_alloy_ingot"));
  }
}
