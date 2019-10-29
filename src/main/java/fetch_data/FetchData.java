package fetch_data;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import country.VatRate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class FetchData {

    private String url;

    public FetchData(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     *  Does the whole magic:
     *  1) fetches data from the internet
     *  2) parses them into JAva objects
     */

    public VatRate parse() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        String jsonData = fetchData(url);

        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        objectMapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);

        /**
         * here is a JAVA object parsed out of the VatRates API
         */

        VatRate vatRate = objectMapper.readValue(jsonData, new TypeReference<VatRate>() {
        });
        return vatRate;
    }

    private String fetchData(String urlString) {
        StringBuilder content = new StringBuilder();

        /**
         * many of these calls can throw exceptions, so i've just
         * wrapped them all in one try/catch statement.
         */

        try {
            /**
             * create a url object
             */

            URL url = new URL(urlString);

            /**
             * create a urlconnection object
             */

            URLConnection urlConnection = url.openConnection();

            /**
             * wrap the urlconnection in a bufferedreader
             */

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

            String line;

            /**
             * read from the urlconnection via the bufferedreader
             */

            while ((line = bufferedReader.readLine()) != null) {
                content.append(line);
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return content.toString();
    }
}
