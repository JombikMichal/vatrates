package country;

import com.fasterxml.jackson.annotation.JsonProperty;
import country.Period;

import java.util.List;

public class Rate {
    private String name;

    private String code;

    @JsonProperty("country_code")
    private String countryCode;

    private List<Period> periods;

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public List<Period> getPeriods() {
        return periods;
    }
}
