package com.example.findmyprofessor;

import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.view.View.OnClickListener;
public class MainActivity extends Activity implements OnClickListener{
	private LinearLayout layoutToAnimate1;
	private Button button1;
	private Button button2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		layoutToAnimate1 = (LinearLayout)findViewById(R.id.part2);
		// Load the appropriate animation and set listener
        Animation an1 =  AnimationUtils.loadAnimation(this, R.anim.snazzyintro);
        an1.setAnimationListener(new MyAnimationListener());
        
        // Start the animation
        layoutToAnimate1.startAnimation(an1);
    	button1 = (Button) findViewById(R.id.button1);
    	button1.setOnClickListener(this);
    	button2 = (Button) findViewById(R.id.button2);
    	button2.setOnClickListener(this); 
	} 
	class MyAnimationListener implements Animation.AnimationListener {

		public void onAnimationEnd(Animation animation) {
						
			layoutToAnimate1.setVisibility(View.VISIBLE);
	    }
		

		public void onAnimationRepeat(Animation animation) {
			// what to do when animation loops 
		}

		public void onAnimationStart(Animation animation) {			
			//what to do when animation stops
		}
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) { 
        case R.id.button1:
        	Intent i1 = new Intent(this, Search.class);
            startActivity(i1);
           break;
      
        case R.id.button2:
        	Intent i2 = new Intent(this, Rate.class);
            startActivity(i2);
           break;
       
        }
		
	}
		

	
	
}
