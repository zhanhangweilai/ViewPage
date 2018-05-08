package com.example.lh.viewpagerdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;

/**
 * Created by lihang on 18-4-20.
 */

public class MYbutton extends Button {

    public MYbutton(Context context) {
        super(context);
    }

    public MYbutton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MYbutton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public MYbutton(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("cz", "onClick: ", new Throwable());
        return super.onTouchEvent(event);
    }
}
