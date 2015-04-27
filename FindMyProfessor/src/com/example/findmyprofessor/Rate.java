package com.example.findmyprofessor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class Rate extends Activity implements OnClickListener{
      private Button loginButton;
   
   
   @Override
   public void onCreate(Bundle savedInstanceState) {

      super.onCreate(savedInstanceState);
      setContentView(R.layout.rate);

      // Get a handle to all user interface elements
      
      loginButton = (Button) findViewById(R.id.button3);
   

      // Set button to open browser
      loginButton.setOnClickListener(this);

   }


@Override
public void onClick(View v) {
	// TODO Auto-generated method stub
	Intent i3 = new Intent(this, Search.class);
    startActivity(i3);
}

}

