import com.fasterxml.jackson.annotation.JsonProperty;

public class PeriodRate {
    @JsonProperty("super_reduced")
    private double superReduced;

    private double reduced;

    private double standard;

    public PeriodRate() {
    }

    public double getSuperReduced() {
        return superReduced;
    }

    public double getReduced() {
        return reduced;
    }

    public double getStandard() {
        return standard;
    }
}
