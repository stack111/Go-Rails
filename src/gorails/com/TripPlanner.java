package gorails.com;

import android.app.Activity;
import android.os.Bundle;

public class TripPlanner extends Activity {
	@Override
    public void onCreate(Bundle savedInstanceState)
 
    {   	
    	setContentView(R.layout.tripplanner);
        super.onCreate(savedInstanceState);
        /*gestureScanner = new GestureDetector(this);        
        hScroll = (HorizontalScrollView) findViewById(R.id.HList);
         tabHost = getTabHost();

        tabHost.addTab(tabHost.newTabSpec("Trip Planner")
                .setIndicator("Trip Planner")
                .setContent(new Intent(this, TripPlanner.class)));

        tabHost.addTab(tabHost.newTabSpec("Metra Map")
                .setIndicator("Map")
                .setContent(new Intent(this, Map.class)));
        
        */
 
    } // ----- End On Create ----- //
}
