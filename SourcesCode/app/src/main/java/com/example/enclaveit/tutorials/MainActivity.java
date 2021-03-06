package com.example.enclaveit.tutorials;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.example.enclaveit.tutorials.aboutmanifest.Level2Activity;

public class MainActivity extends Activity {

    private Button btn;
    private final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        configurates();
        setContentView(R.layout.activity_main);

        /**
         * Create a funtion to definition infromation
         */
        initcomponets();

        /**
         * We want to add event listener inside onCreate, but we use button
         */
        addListenerOnButton();
    }

    protected void configurates(){
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
    }

    protected void initcomponets(){
        btn = (Button)findViewById(R.id.btn);
    }

    protected void addListenerOnButton(){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context.getApplicationContext(),Level2Activity.class);
                startActivity(intent);
            }
        });
    }
}
