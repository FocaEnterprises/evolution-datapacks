package me.giverplay.evolution.data;

import org.json.JSONObject;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class RecipeData implements Data {
  private static final String RECIPES_PATH = "data/evolution/recipes/";

  private final String name;
  private final String path;
  private final String recipeType;
  private final JSONObject recipeData;

  public RecipeData(String name, String path, String recipeType) {
    this.name = name;
    this.path = RECIPES_PATH + path;
    this.recipeType = recipeType;
    this.recipeData = new JSONObject();

    this.recipeData.put("type", recipeType);
  }

  public void writeZipEntry(ZipOutputStream out) throws IOException {
    ZipEntry entry = new ZipEntry(String.format("%s/%s.json", path, name));
    byte[] data = recipeData.toString().getBytes(StandardCharsets.UTF_8);

    out.putNextEntry(entry);
    out.write(data, 0, data.length);
    out.closeEntry();
  }

  @Override
  public JSONObject getData() {
    return recipeData;
  }

  public String getName() {
    return name;
  }

  public String getPath() {
    return path;
  }

  public String getRecipeType() {
    return recipeType;
  }
}
