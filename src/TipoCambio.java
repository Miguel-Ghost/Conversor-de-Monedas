import java.util.Map;

public class TipoCambio {
    private String base_code;
    private Map<String, Double> conversion_rates;

    public Map<String, Double> getRates() {
        return conversion_rates;
    }

    public String getBase_code() {
        return base_code;
    }

}
