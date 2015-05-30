package ro.code.review.catinthehat;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.graphics.PorterDuff.*;
import static android.view.View.OnClickListener;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle(getString(R.string.title));
        int orange = 0xFFF08C35;
        Button buttonTheCat = (Button) findViewById(R.id.theCat);
        buttonTheCat.setOnClickListener(new OnClickListenerForToast());
        buttonTheCat.getBackground().setColorFilter(orange, Mode.MULTIPLY);
        Button buttonThing1 = (Button) findViewById(R.id.thing1);
        buttonThing1.setOnClickListener(new OnClickListenerForToast());
        buttonThing1.getBackground().setColorFilter(orange, Mode.MULTIPLY);
        Button buttonThing2 = (Button) findViewById(R.id.thing2);
        buttonThing2.setOnClickListener(new OnClickListenerForToast());
        buttonThing2.getBackground().setColorFilter(orange, Mode.MULTIPLY);
        Button buttonThingamajigger = (Button) findViewById(R.id.thingamajigger);
        buttonThingamajigger.setOnClickListener(new OnClickListenerForToast());
        buttonThingamajigger.getBackground().setColorFilter(orange, Mode.MULTIPLY);
        Button buttonSally = (Button) findViewById(R.id.sally);
        buttonSally.setOnClickListener(new OnClickListenerForToast());
        buttonSally.getBackground().setColorFilter(orange, Mode.MULTIPLY);
        Button buttonNick = (Button) findViewById(R.id.nick);
        buttonNick.setOnClickListener(new OnClickListenerForToast());
        buttonNick.getBackground().setColorFilter(orange, Mode.MULTIPLY);
        Button buttonDrSeuss = (Button) findViewById(R.id.drSeuss);
        buttonDrSeuss.setOnClickListener(new OnClickListenerForToast());
        buttonDrSeuss.getBackground().setColorFilter(Color.RED, Mode.MULTIPLY);
    }

    private class OnClickListenerForToast implements OnClickListener {
        @Override
        public void onClick(View v) {
            String message = getString(R.string.infoToast);
            message += ((Button)v).getText();
            Toast.makeText(getBaseContext(), message, Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
