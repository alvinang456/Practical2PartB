package com.example.practical2_parta;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount =0;
    private TextView mShowCount;
    private Button button_zero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        button_zero = findViewById(R.id.button_zero);
    }

    public void showToast(View view){
        Toast toast = Toast.makeText( this, R.string.toast_message, Toast.LENGTH_SHORT);

        toast.show();
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void countUp(View view){
        ++mCount;
       if (mShowCount != null)
           mShowCount.setText(Integer.toString(mCount));
        button_zero.setBackgroundColor(getColor(R.color.colorPink));
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void reset(View view){

        button_zero.setBackgroundColor(getColor(R.color.colorGray));
        mShowCount.setText("0");
    }
}