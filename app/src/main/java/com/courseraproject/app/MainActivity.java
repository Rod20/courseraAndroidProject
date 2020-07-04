package com.courseraproject.app;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        agregarFab();
    }

    public void agregarFab(){
        FloatingActionButton miFav = findViewById(R.id.fabMyFab);
        miFav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,getResources().getString(R.string.message),Snackbar.LENGTH_LONG).show();
            }
        });
    }
}
