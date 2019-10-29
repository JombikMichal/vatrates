package country;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Period {

    @JsonProperty("effective_from")
    private String effectiveFrom;

    @JsonProperty("rates")
    private List<PeriodRate> periodRates;

    public Period() {}

    public String getEffectiveFrom() {
        return effectiveFrom;
    }

    public List<PeriodRate> getPeriodRates() {
        return periodRates;
    }
}
