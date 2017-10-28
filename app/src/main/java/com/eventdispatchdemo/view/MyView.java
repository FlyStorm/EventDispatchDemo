package com.eventdispatchdemo.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * 创建者     yangyanfei
 * 创建时间   2017/10/28 下午 09:57
 * 作用	      自定义View
 * 重写三个构造方法
 * 重写dispatchTouchEvent和onTouchEvent方法
 * 说明：在View里面没有onInterceptEvent这个方法
 * <p/>
 * 版本       $$Rev$$
 * 更新者     $$Author$$
 * 更新时间   $$Date$$
 * 更新描述   ${TODO}
 */
public class MyView extends View {
    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public MyView(Context context) {
        super(context);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.e("TAG","MyView:dispatchTouchEvent执行");
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e("TAG","MyView:onTouchEvent");
        return super.onTouchEvent(event);
    }
}
