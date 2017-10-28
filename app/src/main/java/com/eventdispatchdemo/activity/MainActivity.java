package com.eventdispatchdemo.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import com.eventdispatchdemo.view.MyButton;

public class MainActivity extends Activity {

    private MyButton mBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //初始化
        mBtn = (MyButton) findViewById(R.id.btn_main);

        //按钮的触摸事件
        mBtn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        Log.e("TAG2", "MyButton:onTouch---DOWN");
                        break;
                    case MotionEvent.ACTION_MOVE:
                        Log.e("TAG2", "MyButton:onTouch---MOVE");
                        break;
                    case MotionEvent.ACTION_UP:
                        Log.e("TAG2", "MyButton:onTouch---UP");
                        break;
                }
                /**
                 * 这里返回false,MyButton方法里面的onTouchEvent方法将会被调用,onClick方法也会被调用
                 * 如果这里如果返回true,MyButton方法里面的onTouchEvent方法将不会被调用，onClick方法也不会被调用
                 * 说明优先级：OnTouchListener>onTouchEvent>onClickListener,即onClickListener处于事件
                 * 传递的尾端
                 */
                return false;
            }
        });
        //按钮的点击事件
        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("TAG2", "MyButton:onClick");
            }
        });
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.e("TAG2","Activity---dispatchTouchEvent---DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e("TAG2","Activity---dispatchTouchEvent---MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.e("TAG2", "Activity---dispatchTouchEvent---UP");
                break;
            default:
                break;
        }
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.e("TAG2", "Activity---onTouchEvent---DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e("TAG2", "Activity---onTouchEvent---MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.e("TAG2", "Activity---onTouchEvent---UP");
                break;
            default:
                break;
        }
        return super.onTouchEvent(event);
    }
}
