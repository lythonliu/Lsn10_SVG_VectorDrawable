package com.dongnao.lsn10_svg_vectordrawable;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;
import android.widget.ImageView;

public class VectorCompatActivity extends com.lythonliu.LinkAppCompatActivity {
    static {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    @Override
    public String getAppName(){
        return BuildConfig.APP_NAME;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vector_compat);
        ImageView img = (ImageView) findViewById(R.id.iv);
        //img.setImageResource(R.drawable.hanb);
        img.setBackgroundResource(R.drawable.hanb);
    }

    public void anim(View view){
        ImageView imageView = (ImageView) view;
        Drawable drawable = imageView.getDrawable();
        ((Animatable)drawable).start();


    }
}
