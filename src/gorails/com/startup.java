package gorails.com;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;

public class startup extends Activity implements OnGestureListener {
    /** Called when the activity is first created. */

	private static float velocity = 0;
    private GestureDetector gestureScanner;
    private HorizontalScrollView hScroll;
    @Override
    public void onCreate(Bundle savedInstanceState)
 
    {
    	
    	setContentView(R.layout.main);
        super.onCreate(savedInstanceState);
        gestureScanner = new GestureDetector(this);        
        hScroll = (HorizontalScrollView) findViewById(R.id.HList);
        
        
        
 
    } // ----- End On Create ----- //
    @Override
    public void onResume(){
    	hScroll = (HorizontalScrollView) findViewById(R.id.HList);
    	Log.d("startup V resume", "v= "+velocity);
    	hScroll.fling((int) velocity);
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
    	//text1.setText("-" + "FLING" + "-");
    	
    	/*
    	if(velocityX<-1000){
    		//go forward
    		Intent i = new Intent(startup.this, RailMap.class);
    		float v = (float) (.3*velocityX);
    		i.putExtra("v", -v);
    		Log.d("startup V out", "v= "+(-v));
			i.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP | Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NO_HISTORY);
	        startActivity(i);
	        finish();
    	}
    	else{
    		//go back
    	}
    	*/
        return true; 
    }
    @Override 
    public void onLongPress(MotionEvent e){
    	//text1.setText("-" + "LONG PRESS" + "-");

    }
    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY){
    	//text1.setText("-" + "SCROLL" + "-");
    	//int d = (int) ((int) distanceX*0.5);
    	/*
    	if(Distance+distanceX>=0){
    		//Can't Have a negative distance in this case
    		Distance+=distanceX;
    	}
    	
    	hScroll.scrollBy((int) distanceX, 0);
    	Log.d("Distance", ""+Distance);
    	
    	if(Distance>230 && Distance <= 500){
    		
    		Intent i = new Intent(startup.this, RailMap.class);
    		i.putExtra("Distance", Distance);
			i.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP | Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NO_HISTORY);
	        startActivity(i);
	        finish();
    	}
    	*/
        return true;
    } 
    @Override 
    public void onShowPress(MotionEvent e){
    	//text1.setText("-" + "SHOW PRESS" + "-");
    }    
    @Override 
    public boolean onSingleTapUp(MotionEvent e){
    	//text1.setText("-" + "SINGLE TAP UP" + "-");

        return true;
    }
  
	
    
}