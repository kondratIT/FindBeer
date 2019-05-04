package kondrat.pl.doradcapiwny;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    List<String> getBrands(String colour){
        List<String> brands = new ArrayList<String>();
        if(colour.equals("bursztynowe")){
            brands.add("Jack Amber");
            brands.add("Black Moore");
        }
        else{
            brands.add("Tyskie");
            brands.add("Żubr");
            brands.add("Warka");
        }
    return brands;
    }
    String getBrandsInString(String colour){
        List<String> brands= getBrands(colour);
        String beers= new String();
        for (String beer:brands){
            beers+=beer+'\n';
        }
        return beers;
    }
}
