package com.magentoSoftwareTestingBoard.utils;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DataConverter {
    private final Gson GSON;
    private final File APPDATA;

    public DataConverter() {
        this.GSON = new Gson();
        this.APPDATA = new File("./src/test/java/com/magentoSoftwareTestingBoard/data/appData.json");
    }

    public ConvertedData.AppData getAppData() {
        try (FileReader reader = new FileReader(this.APPDATA)) {
            return this.GSON.fromJson(reader, ConvertedData.AppData.class);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
