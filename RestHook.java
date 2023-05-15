import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
//Shaohai Li (sli34@toromail.csudh.edu)
public class RestHook extends Template{
    private Config config;

    public RestHook(Config config) {
        this.config = config;
    }

    @Override
    public InputStream getCurrenciesInputStream() {
        try {
            URL url = new URL(config.getRestUrl());
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            return connection.getInputStream();
        } catch (IOException e) {
            throw new RuntimeException("Failed to load currency data from URL: " + config.getRestUrl(), e);
        }
    }
}
