//Shaohai Li (sli34@toromail.csudh.edu)
public class Config {
    private boolean supportCurrencies;
    private String currenciesSource;
    private String webserviceUrl;
    private String restUrl;
    private String currencyFile;

    public Config(boolean supportCurrencies, String currenciesSource, String webserviceUrl,String restUrl, String currencyFile) {
        this.supportCurrencies = supportCurrencies;
        this.currenciesSource = currenciesSource;
        this.webserviceUrl = webserviceUrl;
        this.restUrl = restUrl;
        this.currencyFile = currencyFile;
    }

    public boolean isSupportCurrencies() {
        return supportCurrencies;
    }

    public String getCurrenciesSource() {
        return currenciesSource;
    }

    public String getWebserviceUrl() {
        return webserviceUrl;
    }

    public String getCurrencyFile() {
        return currencyFile;
    }

    public String getRestUrl() {
        return restUrl;
    }
}
