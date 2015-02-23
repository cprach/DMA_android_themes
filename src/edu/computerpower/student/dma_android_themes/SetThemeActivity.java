package edu.computerpower.student.dma_android_themes;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class SetThemeActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		//setTheme(R.style.BlueTheme);

		setContentView(R.layout.activity_settheme);
	}

	public void setActivityTheme(View view) {
		int id = view.getId();
		TextView txtSelectedTheme = (TextView)findViewById(R.id.txtSelectedTheme);
		switch (id) {
		case R.id.btnSetWhiteTheme:
			setTheme(R.style.WhiteTheme);
			txtSelectedTheme.setText("You have selected the White theme");
			break;
		case R.id.btnSetBlueTheme:
			setTheme(R.style.BlueTheme);
			txtSelectedTheme.setText("You have selected the Blue theme");
			break;
		case R.id.btnSetRedTheme:
			setTheme(R.style.RedTheme);
			txtSelectedTheme.setText("You have selected the Red theme");
			break;
		default:
			setTheme(R.style.WhiteTheme);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.next, menu);
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
}
