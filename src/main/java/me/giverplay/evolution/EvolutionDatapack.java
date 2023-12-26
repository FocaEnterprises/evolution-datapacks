package me.giverplay.evolution;

import me.giverplay.evolution.data.PackData;
import me.giverplay.evolution.data.RecipeData;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipOutputStream;

public class EvolutionDatapack {
  private final PackData packData = new PackData();
  private final List<RecipeData> recipes = new ArrayList<>();

  public void build() {
    try (ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
         ZipOutputStream zipOut = new ZipOutputStream(byteOut);
         FileOutputStream fileOut = new FileOutputStream("evolution-datapack.zip")) {

      for (RecipeData recipe : recipes) {
        recipe.writeZipEntry(zipOut);
      }

      packData.writeZipEntry(zipOut);
      zipOut.finish();
      fileOut.write(byteOut.toByteArray());
    } catch (IOException e) {
      System.out.println("Failed to build datapack");
      e.printStackTrace();
    }
  }
}
