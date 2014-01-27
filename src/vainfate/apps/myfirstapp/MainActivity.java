package vainfate.apps.myfirstapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.widget.EditText;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {
	public final static String EXTRA_MESSAGE = "vainfate.apps.myfirstapp.MESSAGE";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	// Called when the user clicks the Send button
	public void sendMessage(View view) {
		// Create a new Intent to start an activity called DisplayMessageActivity
		Intent intent = new Intent(this, DisplayMessageActivity.class);
		
		// Use findViewById() to get the EditText element and add its text value to the intent.
		EditText editText = (EditText) findViewById(R.id.edit_message);
		
		String message = editText.getText().toString();
		
		intent.putExtra(EXTRA_MESSAGE, message);
		
		// Start the activity
		startActivity(intent);
	}

}
