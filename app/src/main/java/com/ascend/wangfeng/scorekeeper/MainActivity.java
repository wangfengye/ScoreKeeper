package com.ascend.wangfeng.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    public static final int ZERO = 0;
    private TextView mAScore;
    private TextView mBScore;
    private TextView mAError;
    private TextView mBError;
    private Button mAAdd;
    private Button mBAdd;
    private Button mAReduce;
    private Button mBReduce;
    private Button mClear;
    private int mAScoreCount = ZERO;
    private int mBScoreCount = ZERO;
    private int mAErrorCount = ZERO;
    private int mBErrorCount = ZERO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findView();
        initListener();
        initData();
    }

    private void initListener() {
        mClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                initData();
            }
        });

        mAAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mAScoreCount++;
                setText(mAScore, mAScoreCount);
            }
        });
        mBAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mBScoreCount++;
                setText(mBScore, mBScoreCount);
            }
        });
        mAReduce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mAErrorCount++;
                setText(mAError, mAErrorCount);
            }
        });
        mBReduce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mBErrorCount++;
                setText(mBError, mBErrorCount);
            }
        });

    }

    //初始化数据
    private void initData() {
        setText(mAScore, ZERO);
        setText(mBScore, ZERO);
        setText(mAError, ZERO);
        setText(mBError, ZERO);
        mAScoreCount = 0;
        mBScoreCount = 0;
        mAErrorCount = 0;
        mBErrorCount = 0;
    }

    private void findView() {
        mAScore = (TextView) findViewById(R.id.a_score);
        mBScore = (TextView) findViewById(R.id.b_score);
        mAError = (TextView) findViewById(R.id.a_error);
        mBError = (TextView) findViewById(R.id.b_error);
        mAAdd = (Button) findViewById(R.id.a_add);
        mBAdd = (Button) findViewById(R.id.b_add);
        mAReduce = (Button) findViewById(R.id.a_reduce);
        mBReduce = (Button) findViewById(R.id.b_reduce);
        mClear = (Button) findViewById(R.id.clear);
    }


    /**
     * 显示两位数
     *
     * @param view
     * @param number
     */
    private void setText(TextView view, int number) {
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("00");
        view.setText(df.format(number));
    }
}
