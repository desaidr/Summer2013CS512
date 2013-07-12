package com.desai.desaihw6;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
public class SplashScreen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash_screen);
	
	    //to fire up the homescreen activity after 5 seconds
		Handler h= new Handler();
		h.postDelayed(new HomeScreenActivator(),5000);
	}


class HomeScreenActivator implements Runnable{
        public void run(){
        	//fire up the homescreen Activity
        	startActivity(new Intent(getApplication(),HomeScreen.class));
        	
        	//get rid of the SplashScreen activity
        	finish();
        }

}
}

