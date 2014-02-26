/**
 * Copyright (C) 2014 Inversebit
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * 
 * The CLIPS files used are under public domain. * 
 * The rest of the files are under public domain unless the contrary is stated.
 * 
 * This program uses the CLIPS4Android project. Check it out in:
 * https://github.com/gomezgoiri/CLIPS4Android
 */

package org.inversebit.clipsdroidconsole.main;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import eu.deustotech.clips.Environment;
import eu.deustotech.clips.PrimitiveValue;


public class MainActivity extends Activity
{

	private Environment clips;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		clips = new Environment();
		
		((TextView)findViewById(R.id.tVWelcome))
			.setText(
				getString(R.string.welcomeMessage) + " " +
				Environment.getCLIPSVersion());
	}

	public void runCommand(View pView){
		String command = getCommandFromGUI();
		PrimitiveValue pv = clips.eval(command);
		Object o =  pv.getValue();
		((TextView)findViewById(R.id.tVOutput)).append("" + o);
		((TextView)findViewById(R.id.tVOutput)).append("\n");
	}

	private String getCommandFromGUI()
	{
		return ((EditText)findViewById(R.id.eTInput)).getText().toString();
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
