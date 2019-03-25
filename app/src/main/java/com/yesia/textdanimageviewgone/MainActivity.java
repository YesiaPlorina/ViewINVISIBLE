package com.yesia.textdanimageviewgone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView;
    ToggleButton toggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.imageView1);
        textView = (TextView) findViewById(R.id.textView1);

        toggleButton = (ToggleButton) findViewById(R.id.toggleButton);

        //inisialisasi 3 View

        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                boolean checked = toggleButton.isChecked();

                if (checked) {
                    imageView.setVisibility(View.INVISIBLE);
                    textView.setVisibility(View.INVISIBLE);
                    //Digunakan untuk menyembunyikan TextView dan ImageView

                } else {

                    imageView.setVisibility(View.VISIBLE);
                    textView.setVisibility(View.VISIBLE);
                    //Digunakan untuk menampilkan lagi  TextView dan ImageView
                }


            }
        });


    }

}
