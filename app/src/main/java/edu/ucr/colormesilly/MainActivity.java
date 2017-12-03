package edu.ucr.colormesilly;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private boolean set_bk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        set_bk = false;

        Button click_bt = (Button) findViewById(R.id.change_color_bt);
        click_bt.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));

        click_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RelativeLayout cl = (RelativeLayout) findViewById(R.id.cl);
                Random rnd = new Random();
                int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
                cl.setBackgroundColor(color);
                color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
                Button bt = (Button) findViewById(R.id.change_color_bt);
                bt.setBackgroundColor(color);
            }
        });

    }
}
