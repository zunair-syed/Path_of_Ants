package zunair.syed.pathofants;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class Splash extends Activity { //inherits activity which is an application class for android

	
	@Override
	protected void onCreate(Bundle yolo){ //calls the constructor, and has the bundle (which is passed in by android OS). 
		
		/*
		 * Bundle is a set of information about an application, specifically an activity. 
		 * It is used for passing data. 
		 */
		
		super.onCreate(yolo);//calls super class oncreate method with Android Bundle passed in
		
		//the following code lines below allow for a fullscreen, and no title application window
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		setContentView(R.layout.splash);//since we only want a picture, in our xml, (which is splash), we'll have it display a big picture of my name
		
		Thread timer = new Thread(){ //a timer thread, in which we'll declare a run method to get to our next application window
			public void run(){
				try{
				sleep(3000);//we'll delay by 3 seconds (the splash screen)	
				}catch(InterruptedException e){
					e.printStackTrace();
				}finally{
					Intent openGFXSurface = new Intent ("zunair.syed.pathofants.MAINGAME"); //then once that timer is over, we'll have an intent (going from one screen to another), to our next class path
					startActivity(openGFXSurface);//this is how we start it
				}
			}
		};//the end of declaring thread timer object
		
		timer.start();//we'll start our timer now
	}
	
	
	@Override
	protected void onPause(){
		super.onPause();
		finish(); //kills the activity destroys
	}
	
}