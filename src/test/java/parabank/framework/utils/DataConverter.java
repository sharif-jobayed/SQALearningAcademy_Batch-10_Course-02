package parabank.framework.utils;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DataConverter {
    private final Gson GSON;
    private final File APP_DATA;
    private final File TIMEOUTS;
    private final File USER_CREDS;

    public DataConverter() {
        this.GSON = new Gson();
        this.APP_DATA = new File("./src/test/java/parabank/data/appData.json");
        this.TIMEOUTS = new File("./src/test/java/parabank/data/timeOuts.json");
        this.USER_CREDS = new File("./src/test/java/parabank/data/userCreds.json");
    }

    public ConvertedData.AppData getAppData() {
        try (FileReader reader = new FileReader(this.APP_DATA)) {
            return this.GSON.fromJson(reader, ConvertedData.AppData.class);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public ConvertedData.TimeOuts getTimeOuts() {
        try (FileReader reader = new FileReader(this.TIMEOUTS)) {
            return this.GSON.fromJson(reader, ConvertedData.TimeOuts.class);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public ConvertedData.UserCreds getUserCreds() {
        try (FileReader reader = new FileReader(this.USER_CREDS)) {
            return this.GSON.fromJson(reader, ConvertedData.UserCreds.class);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
