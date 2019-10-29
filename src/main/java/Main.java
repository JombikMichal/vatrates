import country.Period;
import country.Rate;
import country.VatRate;
import fetch_data.FetchData;

import java.io.IOException;


public class Main {

    public static void main(String[] args) {
        FetchData fetchData = new FetchData("http://jsonvat.com");
        try {
            VatRate vatRate = fetchData.parse();
            display(vatRate);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void display(VatRate vatRate) {
        for (Rate rates : vatRate.getRates()) {
            for (Period p : rates.getPeriods()){
                System.out.println(p.getPeriodRates());
            }
        }
      //  System.out.println(vatRate.getRates().get(4).getPeriods().get(0).getPeriodRates());
    }
}
