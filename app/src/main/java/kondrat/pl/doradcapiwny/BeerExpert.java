package kondrat.pl.doradcapiwny;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    List<String> getBrands(String colour){
        List<String> brands = new ArrayList<String>();
        switch(colour) {
            case("pszeniczne") : {
                brands.add("Żywiec Białe");
                brands.add("Książęce Weizer");
                brands.add("Książęce pszeniczne");
                break;
            }
            case ("jasne"): {
                brands.add("Tyskie");
                brands.add("Żubr");
                brands.add("Warka");
                break;
            }
            case("ciemne"):{
                brands.add("Porter");
                break;
            }
            default:
                brands.add("Inne piwo");
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
