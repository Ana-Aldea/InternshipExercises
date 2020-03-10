package com.example.internshipexercises;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();

    private int incrementValue = 0;

    private TextView incrementTv;
    private Button incrementBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate:Happy to be born!");
        initViews();
    }

    private void initViews() {
        incrementTv = findViewById(R.id.counter_value_tv);
        incrementBtn = findViewById((R.id.increment_bt));

        incrementTv.setText(incrementValue + "");
        incrementBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                incrementValue++;
                incrementTv.setText(incrementValue + "");
            }
        });
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putString("incrm",incrementTv.getText().toString());
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        incrementTv.setText(savedInstanceState.getString("incrm"));
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: I exist, but you cannot see me");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: preparing final UI changes for you master");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: You can see me, but I");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: Packing up,");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }
}
