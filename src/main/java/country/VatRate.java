package country;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import country.Rate;

import java.util.List;

public class VatRate {

    @JsonIgnoreProperties("details")
    private String details;

    private String version;

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
