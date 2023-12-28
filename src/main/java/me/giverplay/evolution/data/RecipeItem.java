package me.giverplay.evolution.data;

import org.json.JSONObject;

public class RecipeItem {
  private final String name;

  public RecipeItem(String name) {
    this.name = name;
  }

  public JSONObject toJSON() {
    JSONObject json = new JSONObject();
    json.put("item", name);
    return json;
  }

  public String getName() {
    return name;
  }
}
