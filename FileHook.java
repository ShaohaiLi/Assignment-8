import java.io.*;
import java.util.ArrayList;
import java.util.List;
//Shaohai Li (sli34@toromail.csudh.edu)
public class FileHook extends Template{
    private Config config;

    public FileHook(Config config) {
        this.config = config;
    }

    @Override
    public InputStream getCurrenciesInputStream() {
        InputStream is = null;
        try {
            is = new FileInputStream("exchange-rate.csv");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return is;
    }
}
