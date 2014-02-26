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
