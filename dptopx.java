package com.dcrym.myview;

import android.content.Context;

public class dptopx {
    public static int dip2px(float dpValue){
        float scale = App.getApp().getResources().getDisplayMetrics().density;

        return (int)(dpValue*scale+0.5f);
    }
}
