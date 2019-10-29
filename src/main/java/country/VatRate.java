package country;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class VatRate {

    @JsonProperty("details")
    private String details;

    @JsonProperty("version")
    private String version;

    @JsonProperty("rates")
    private List<Rate> rates;

    public String getDetails() {
        return details;
    }

    public String getVersion() {
        return version;
    }

    public List<Rate> getRates() {
        return rates;
    }
}
