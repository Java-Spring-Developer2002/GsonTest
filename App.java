package MDM;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.math.BigInteger;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.YYYY HH:mm");
        String customdate = dateFormat.format(new Date());
        Custom custom = new Custom(dateFormat.parse(customdate), BigInteger.valueOf(new Date().getTime()));
        Gson gson = new GsonBuilder().registerTypeAdapter(Custom.class,new CustomTypeAdapter()).create();
        String json = gson.toJson(custom);

        System.out.println(json);
    }
}
