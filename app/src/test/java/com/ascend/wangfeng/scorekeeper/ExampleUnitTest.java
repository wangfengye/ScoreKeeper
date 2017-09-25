package com.ascend.wangfeng.scorekeeper;

import org.junit.Test;

import java.text.DecimalFormat;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        DecimalFormat df = new DecimalFormat();
        int data = 2;
        df.applyPattern("00");
        System.out.println(df.format(data));
    }
}