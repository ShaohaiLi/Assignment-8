import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Shaohai Li (sli34@toromail.csudh.edu)
public class WebHook extends Template{
    private Config config;

    public WebHook(Config config) {
        this.config = config;
    }

    @Override
    public InputStream getCurrenciesInputStream() {
        InputStream is = null;
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(config.getWebserviceUrl()))
                    .build();

            HttpResponse<byte[]> response = client.send(request, HttpResponse.BodyHandlers.ofByteArray());

            is = new ByteArrayInputStream(response.body());

        } catch (IOException | InterruptedException e) {
            System.out.println("Error retrieving exchange rates: " + e.getMessage());
        }
        return is;
    }
}
