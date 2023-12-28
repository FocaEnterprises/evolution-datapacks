package me.giverplay.evolution.data;

import org.json.JSONObject;

public class RecipeItemTag extends RecipeItem {
  public RecipeItemTag(String name) {
    super(name);
  }

  @Override
  public JSONObject toJSON() {
    JSONObject json = new JSONObject();
    json.put("tag", getName());
    return json;
  }
}
