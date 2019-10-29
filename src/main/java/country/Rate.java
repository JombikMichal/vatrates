package country;

import com.fasterxml.jackson.annotation.JsonProperty;
import country.Period;

import java.util.List;

public class Rate {

    @JsonProperty("name")
    private String name;

    @JsonProperty("code")
    private String code;

    @JsonProperty("country_code")
    private String countryCode;

    @JsonProperty("periods")
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
