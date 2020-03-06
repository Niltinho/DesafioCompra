package utils;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Random;

public class Generator {
    public static String dataHoraParaArquivo (){
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        return new SimpleDateFormat("dd-MM-yyyy-hhmmss").format(ts); //yyyyMMddhhmmss
    }
    
    public static Random numeroRandomico () {
    	Random random = new Random();
    	return random;
    }
}
