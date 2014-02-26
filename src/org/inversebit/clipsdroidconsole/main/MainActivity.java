package org.inversebit.clipsdroidconsole.main;


import eu.deustotech.clips.Environment;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;


public class MainActivity extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		((TextView)findViewById(R.id.tVWelcome))
			.setText(
				getString(R.string.welcomeMessage) + " " +
				Environment.getCLIPSVersion());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
