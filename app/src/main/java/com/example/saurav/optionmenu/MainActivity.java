package com.example.saurav.optionmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar();

        text = (TextView) findViewById(R.id.text1);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_example,menu);

        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.Subitem1 :
                Toast.makeText(MainActivity.this,"Selected Red",Toast.LENGTH_SHORT).show();
                text.setTextColor(getResources().getColor(R.color.colorAccent));
                break;

            case R.id.Subitem2 :
                Toast.makeText(MainActivity.this,"Selected Green",Toast.LENGTH_SHORT).show();
                text.setTextColor(getResources().getColor(R.color.colorGreen));
                break;
            case R.id.Subitem3 :
                Toast.makeText(MainActivity.this,"Selected Blue",Toast.LENGTH_SHORT).show();
                text.setTextColor(getResources().getColor(R.color.colorBlue));
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
