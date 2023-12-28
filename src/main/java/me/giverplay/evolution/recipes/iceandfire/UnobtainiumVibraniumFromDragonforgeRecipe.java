package me.giverplay.evolution.recipes.iceandfire;

import me.giverplay.evolution.data.RecipeItem;

public class UnobtainiumVibraniumFromDragonforgeRecipe extends DragonForgeRecipe {
  public UnobtainiumVibraniumFromDragonforgeRecipe() {
    super("unobtainium_vibranium_from_dragon_forge", "ice", 1000);

    addEntry("input", new RecipeItem("allthemodium:unobtainium_ingot"));
    addEntry("blood", new RecipeItem("allthemodium:vibranium_ingot"));
    addEntry("result", new RecipeItem("allthemodium:unobtainium_vibranium_alloy_ingot"));
  }
}
