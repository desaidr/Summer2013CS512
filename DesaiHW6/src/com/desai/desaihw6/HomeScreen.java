package com.desai.desaihw6;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class HomeScreen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.homescreen);
	}	
		public void getAssignments(View v){
			startActivityForResult(new Intent(v.getContext(),ManageAssignments.class),1);
		}
	    
       public void retrieveFromServer(View v){
    	    startActivityForResult(new Intent(v.getContext(),ServerRetriever.class),1);
       }
}