package com.example.suncuoglu.customview;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.print.PrintAttributes;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CustomView extends LinearLayout{

    Context mcontext;
    Button btn;
    TextView tv;
    //OnCustomListener onCustomListener;

    public CustomView(Context context) {
        super(context);
        mcontext = context;
        init(null);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs) {

        super(context, attrs);
        mcontext = context;
        init(attrs);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mcontext = context;
        init(attrs);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        mcontext = context;
        init(attrs);
    }

//    public void setOnCustomListener(OnCustomListener onCustomListener) {
//        this.onCustomListener = onCustomListener;
//    }

    private void init(@Nullable AttributeSet set) {
        this.setOrientation(LinearLayout.VERTICAL);
        LayoutParams linLayoutParam = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
        this.setLayoutParams(linLayoutParam);
        LayoutParams lpView = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);

        tv = new TextView(mcontext);
        tv.setTextColor(Color.BLACK);
        tv.setTextSize(2, 25);
        tv.setText("Welcome");

        btn = new Button(mcontext);
        btn.setText("Click");
        btn.setBackgroundColor(Color.BLUE);
        btn.setTextColor(Color.WHITE);

//        btn.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                onCustomListener.onButtonClicked(getText());
//            }
//        });

        LinearLayout.LayoutParams CenterGravityParams = new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        CenterGravityParams.gravity = Gravity.CENTER;
        CenterGravityParams.setMargins(0, 0, 0, 45);
        tv.setLayoutParams(lpView);
        btn.setLayoutParams(lpView);
        this.addView(tv, CenterGravityParams);
        this.addView(btn, CenterGravityParams);
    }



    public String getText() {
        return tv.getText().toString();
    }

    public Button getBtn() {
        return btn;
    }

//    public interface OnCustomListener{
//        void onButtonClicked(String text);
//    }
}
