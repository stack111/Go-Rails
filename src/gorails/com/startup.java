package gorails.com;






import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.TabWidget;

public class startup extends TabActivity implements OnGestureListener {
    /** Called when the activity is first created. */
	// Change
	private static float velocity = 0;
    private GestureDetector gestureScanner;
    private static int index = 0;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Resources res = getResources(); // Resource object to get Drawables
        TabHost tabHost = getTabHost();  // The activity TabHost
        TabHost.TabSpec spec;  // Resusable TabSpec for each tab
        Intent intent;  // Reusable Intent for each tab
        gestureScanner = new GestureDetector(this); // Set the GestureDector for this 

        // Create an Intent to launch an Activity for the tab (to be reused)
        intent = new Intent().setClass(this, TripPlannerActivity.class);

        // Initialize a TabSpec for each tab and add it to the TabHost
        spec = tabHost.newTabSpec("tripplanner").setIndicator("Trip Planner",
        		res.getDrawable(R.drawable.ic_tab_tripplanner))
                      .setContent(intent);
        tabHost.addTab(spec);

        // Do the same for the other tabs
        intent = new Intent().setClass(this, FareCalculatorActivity.class);
        spec = tabHost.newTabSpec("farecalculator").setIndicator("Fare Calc",
        		res.getDrawable(R.drawable.ic_tab_farecalculator))
                      .setContent(intent);
        tabHost.addTab(spec);
        
        intent = new Intent().setClass(this, MapActivity.class);
        spec = tabHost.newTabSpec("map").setIndicator("Map",
                          res.getDrawable(R.drawable.ic_tab_map))
                      .setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent().setClass(this, AdvisoriesActivity.class);
        spec = tabHost.newTabSpec("advisories").setIndicator("Advisories",
                          res.getDrawable(R.drawable.ic_tab_advisories))
                      .setContent(intent);
        tabHost.addTab(spec);
        
        intent = new Intent().setClass(this, AdvisoriesActivity.class);
        spec = tabHost.newTabSpec("helfinfo").setIndicator("Help & Info",
                          res.getDrawable(R.drawable.ic_tab_helpinfo))
                      .setContent(intent);
        tabHost.addTab(spec);

        tabHost.setCurrentTab(0);
    }
    @Override
    public void onResume(){
    	super.onResume();   	
    }
    
    
    @Override
    public boolean onTouchEvent(MotionEvent me){
        return gestureScanner.onTouchEvent(me);
    }
    @Override 
    public boolean onDown(MotionEvent e){
    	//text1.setText("-" + "DOWN" + "-");
        return true; 
    }
    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY){    	
    	HorizontalScrollView hScroll = (HorizontalScrollView) findViewById(R.id.HScroll);
    	TabHost tabHost = getTabHost(); 
    	if(velocityX<-1000){
    		//go forward
    		if(index<=4){
    			index++;
        		tabHost.setCurrentTab(index);
        		hScroll.scrollBy(100, 0);
    		}    		
    	}
    	else if(velocityX>1000){
    		//go back
    		if(index!=0){
    			index--;
    			tabHost.setCurrentTab(index);
    			hScroll.scrollBy(-100, 0);
    		}
    	}    	
        return true; 
    }
    @Override 
    public void onLongPress(MotionEvent e){
    }
    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY){
    	
        return true;
    } 
    @Override 
    public void onShowPress(MotionEvent e){
    }    
    @Override 
    public boolean onSingleTapUp(MotionEvent e){
        return true;
    }
  
	
    
}