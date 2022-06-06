package top.lazyr.lang.numorstr;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumOrStrTest {

    @Test
    public void testFloat() {
        FloatOrStr floatOrStr = new FloatOrStr("1.2saf");
        System.out.println(floatOrStr);
        LongOrStr longOrStr = new LongOrStr("13.12312");
        System.out.println(longOrStr);
    }
}
