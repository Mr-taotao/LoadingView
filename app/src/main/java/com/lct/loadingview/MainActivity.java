package com.lct.loadingview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    private static final String TAG ="MainActivity";
    private Button mStartButton;
    private Button mSuccessButton;
    private Button mFailButton;
    private MyLoadingView mLoadingView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InitUi();
    }

    private void InitUi(){
        mStartButton = (Button)findViewById(R.id.button);
        mStartButton.setOnClickListener(this);

        mSuccessButton = (Button)findViewById(R.id.button2);
        mSuccessButton.setOnClickListener(this);

        mFailButton = (Button)findViewById(R.id.button3);
        mFailButton.setOnClickListener(this);


        mLoadingView = (MyLoadingView)findViewById(R.id.myloadingview);

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                Log.e(TAG , "start on click");
                mLoadingView.start();
                break;
            case R.id.button2:
                Log.e(TAG , "success on click");
                mLoadingView.success();
                break;
            case R.id.button3:
                Log.e(TAG , "fail on click");
                mLoadingView.failed();
                break;
        }
    }
}
