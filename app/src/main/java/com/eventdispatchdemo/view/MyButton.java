package com.eventdispatchdemo.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;

/**
 * 创建者     yangyanfei
 * 创建时间   2017/10/29 上午 12:04
 * 作用	      自定义Button
 * 重写dispatchTouchEvent方法和onTouchEvent方法,并获取了MotionEvent各个事件状态，打印输出了每一个状态下的信息。
 * <p/>
 * 版本       $$Rev$$
 * 更新者     $$Author$$
 * 更新时间   $$Date$$
 * 更新描述   ${TODO}
 */
public class MyButton extends Button {
    public MyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.e("TAG2","MyButton:dispatchTouchEvent---DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e("TAG2","MyButton:dispatchTouchEvent---MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.e("TAG2","MyButton:dispatchTouchEvent---UP");
                break;
        }
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
//                Toast.makeText(getContext(),"MyButton---onTouchEvent---Down",Toast.LENGTH_SHORT).show();
                Log.e("TAG2","MyButton:onTouchEvent---DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e("TAG2","MyButton:onTouchEvent---MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.e("TAG2","MyButton:onTouchEvent---UP");
                break;
        }
        return super.onTouchEvent(event);
    }
}
