package com.example.findmyprofessor;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class Search extends Activity implements OnItemSelectedListener {
	TextView department;
	TextView professor;
	String[] departs = { "Department", "CS", "Art", "Managment"};
	String[] names ={"James Pepe","Wendy Lucas"};
	@Override
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		setContentView(R.layout.search);
		

		Spinner spin1 = (Spinner) findViewById(R.id.spinner1);
		Spinner spin2 = (Spinner) findViewById(R.id.spinner2);
		spin1.setOnItemSelectedListener(this);   //set listener
		spin2.setOnItemSelectedListener(this);
		ArrayAdapter<String> aa1 = new ArrayAdapter<String>(
				this,
				android.R.layout.simple_spinner_item,  //Android supplied Spinner item format
				departs);
		ArrayAdapter<String> aa2 = new ArrayAdapter<String>(
				this,
				android.R.layout.simple_spinner_item,  //Android supplied Spinner item format
				names);

		//set resource to use for drop down view, Android supplied format
		aa1.setDropDownViewResource(
		   android.R.layout.simple_spinner_dropdown_item);  
		spin1.setAdapter(aa1);  //connect ArrayAdapter to <Spinner>
		aa2.setDropDownViewResource(
				   android.R.layout.simple_spinner_dropdown_item);  
		spin2.setAdapter(aa2);  //connect ArrayAdapter to <Spinner>
	}
	

	//listener methods for callbacks 
	public void onItemSelected(AdapterView<?> parent, View v, int position,
			long id) {
		
	}

	public void onNothingSelected(AdapterView<?> parent) {
	}
}//class

