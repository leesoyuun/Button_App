package com.example.button_app;

import android.view.View;

public class MyOnClickListener implements View.OnClickListener {
    MainActivity mainActivity;
    public MyOnClickListener(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    public void onClick(View v) {
        mainActivity.mTextView1.setText("You clicked 소윤이의 button!");
    }
}
