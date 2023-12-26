package me.giverplay;

import org.json.JSONObject;

public class Main {
  public static void main(String[] args) {
    JSONObject json = new JSONObject();
    json.put("message", "Hello");
    System.out.println(json);
  }
}