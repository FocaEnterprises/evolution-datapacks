package me.giverplay.evolution.recipes.mekanism;

import me.giverplay.evolution.data.RecipeItem;
import org.json.JSONObject;

public class SulfurDustFromCrushing extends CrushingRecipe {
  public SulfurDustFromCrushing() {
    super("sulfur_dust_from_crushing");

    addInput(new RecipeItem("thermal:sulfur"));
    addEntry("output", new RecipeItem("mekanism:dust_sulfur"));
  }

  public void addInput(RecipeItem item) {
    JSONObject input = new JSONObject();
    input.put("ingredient", item.toJSON());
    addData("input", input);
  }
}
