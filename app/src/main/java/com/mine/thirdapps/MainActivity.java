package com.mine.thirdapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        final Random rand = new Random();

        Button genBtn = findViewById( R.id.generatedButton );
        final TextView number = findViewById( R.id.textView );

        genBtn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number.setText( String.valueOf( rand.nextInt(100) ) );
                Toast.makeText( MainActivity.this, "Your Number is " + number.getText(), Toast.LENGTH_SHORT ).show();
            }
        } );
    }
}
