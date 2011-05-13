package gorails.com;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MapActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textview = new TextView(this);
        textview.setText("This is the Map tab");
        setContentView(textview);
    }
}