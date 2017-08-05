package com.example.julia.toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;

    ScrollView scroll;

    TextView textViewTitle;
    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);

        scroll = (ScrollView) findViewById(R.id.scroll);

        textViewTitle = (TextView) findViewById(R.id.textViewTitle);

        textView1 = (TextView) findViewById(R.id.textView1);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        textView4 = (TextView) findViewById(R.id.textView4);

        imageView = (ImageView) findViewById(R.id.imageView);
    /* чтобы не дублировать один и тот же метод 3 раза
    лучше сделать один общий метод changeColor, который будет принимать в качестве параметров
    идентификатор цвета, изображения и текстов
     */
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scroll.setBackgroundColor(getResources().getColor(R.color.colorRed));

                textViewTitle.setText(getResources().getString(R.string.title_panther));

                textView1.setText(getResources().getString(R.string.about_panther1));
                textView2.setText(getResources().getString(R.string.about_panther2));
                textView3.setText(getResources().getString(R.string.about_panther3));
                textView4.setText(getResources().getString(R.string.about_panther4));

                imageView.setImageDrawable(getResources().getDrawable(R.drawable.panther));

                Toast toast_red = Toast.makeText(getApplicationContext(), "The color changed to RED!", Toast.LENGTH_SHORT);
                toast_red.show();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scroll.setBackgroundColor(getResources().getColor(R.color.colorGreen));

                textViewTitle.setText(getResources().getString(R.string.title_leopard));

                textView1.setText(getResources().getString(R.string.about_leopard1));
                textView2.setText(getResources().getString(R.string.about_leopard2));
                textView3.setText(getResources().getString(R.string.about_leopard3));
                textView4.setText(getResources().getString(R.string.about_leopard4));

                imageView.setImageDrawable(getResources().getDrawable(R.drawable.leopard));

                Toast toast_green = Toast.makeText(getApplicationContext(), "The color changed to GREEN!", Toast.LENGTH_SHORT);
                toast_green.show();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scroll.setBackgroundColor(getResources().getColor(R.color.colorBlue));

                textViewTitle.setText(getResources().getString(R.string.title_lynx));

                textView1.setText(getResources().getString(R.string.about_lynx1));
                textView2.setText(getResources().getString(R.string.about_lynx2));
                textView3.setText(getResources().getString(R.string.about_lynx3));
                textView4.setText(getResources().getString(R.string.about_lynx4));

                imageView.setImageDrawable(getResources().getDrawable(R.drawable.lynx));

                Toast toast_blue = Toast.makeText(getApplicationContext(), "The color changed to BLUE!", Toast.LENGTH_SHORT);
                toast_blue.show();
            }
        });

    }

}
