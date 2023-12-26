package me.giverplay.evolution.data;

import org.json.JSONObject;

import java.io.IOException;
import java.util.Objects;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class PackData implements Data {
  private final JSONObject packData;

  public PackData() {
    JSONObject pack = new JSONObject();
    pack.put("pack_format", 6);
    pack.put("description", "Integrar umas coisas");

    packData = new JSONObject();
    packData.put("pack", pack);
  }

  @Override
  public void writeZipEntry(ZipOutputStream zipOut) throws IOException {
    ZipEntry entry = new ZipEntry("pack.mcmeta");
    byte[] data = packData.toString().getBytes();

    zipOut.putNextEntry(entry);
    zipOut.write(data, 0, data.length);
    zipOut.closeEntry();

    ZipEntry imageEntry = new ZipEntry("pack.png");
    byte[] imageData = Objects.requireNonNull(getClass().getResourceAsStream("/pack.png")).readAllBytes();

    zipOut.putNextEntry(imageEntry);
    zipOut.write(imageData, 0, imageData.length);
    zipOut.closeEntry();
  }

  @Override
  public JSONObject getData() {
    return packData;
  }
}
