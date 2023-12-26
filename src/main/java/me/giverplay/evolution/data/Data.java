package me.giverplay.evolution.data;

import org.json.JSONObject;

import java.io.IOException;
import java.util.zip.ZipOutputStream;

public interface Data {
  void writeZipEntry(ZipOutputStream zipOut) throws IOException;

  JSONObject getData();
}
