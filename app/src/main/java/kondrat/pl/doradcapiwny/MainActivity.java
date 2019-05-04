package kondrat.pl.doradcapiwny;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends Activity {

    private BeerExpert mBeerExpert=new BeerExpert();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFindBeer(View view) {
        TextView brands = (TextView) findViewById(R.id.brands);
        Spinner colour = (Spinner) findViewById(R.id.color);
        String beerType = String.valueOf(colour.getSelectedItem());
        String beers= mBeerExpert.getBrandsInString(beerType);
        brands.setText(beers);
    }
}
