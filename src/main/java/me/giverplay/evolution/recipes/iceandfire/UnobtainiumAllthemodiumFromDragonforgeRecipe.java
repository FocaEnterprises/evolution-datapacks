package me.giverplay.evolution.recipes.iceandfire;

import me.giverplay.evolution.data.RecipeItem;

public class UnobtainiumAllthemodiumFromDragonforgeRecipe extends DragonForgeRecipe {
  public UnobtainiumAllthemodiumFromDragonforgeRecipe() {
    super("unobtainium_allthemodium_from_dragonforge", "lightning", 1000);

    addEntry("input", new RecipeItem("allthemodium:unobtainium_ingot"));
    addEntry("blood", new RecipeItem("allthemodium:allthemodium_ingot"));
    addEntry("result", new RecipeItem("allthemodium:unobtainium_allthemodium_alloy_ingot"));
  }
}
