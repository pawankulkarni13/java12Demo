package com.java12.demo.java12Demo;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumberFormattingTest {

    @Test
    public void compact_no_format(){
        NumberFormat fmtLong
                = NumberFormat.getCompactNumberInstance(
                Locale.US, NumberFormat.Style.LONG);

        System.out.println(fmtLong.format(100));
        System.out.println(fmtLong.format(1000));
        System.out.println(fmtLong.format(10000));

        NumberFormat fmtShort
                = NumberFormat.getCompactNumberInstance(
                Locale.US, NumberFormat.Style.SHORT);

        System.out.println(fmtShort.format(100));
        System.out.println(fmtShort.format(1000));
        System.out.println(fmtShort.format(10000));
    }
}
