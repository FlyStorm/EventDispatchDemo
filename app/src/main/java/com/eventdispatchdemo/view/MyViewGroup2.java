package com.eventdispatchdemo.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * 创建者     yangyanfei
 * 创建时间   2017/10/28 下午 10:01
 * 作用	      自定义ViewGroup
 * 重写三个构造方法
 * 重写dispatchTouchEvent、onInterceptTouchEvent、onTouchEvent
 * <p/>
 * 版本       $$Rev$$
 * 更新者     $$Author$$
 * 更新时间   $$Date$$
 * 更新描述   ${TODO}
 */
public class MyViewGroup2 extends LinearLayout {
    public MyViewGroup2(Context context) {
        super(context);
    }

    public MyViewGroup2(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyViewGroup2(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e("TAG","MyViewGroup2:dispatchTouchEvent执行");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.e("TAG","MyViewGroup2:onInterceptTouchEvent执行");
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e("TAG","MyViewGroup2:onTouchEvent执行");
        return super.onTouchEvent(event);
    }
}
