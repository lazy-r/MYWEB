package top.lazyr.lang.numorstr;

import com.fasterxml.jackson.core.JsonToken;
import lombok.NonNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import top.lazyr.validator.FmtValidator;

import java.io.IOException;
import java.util.Objects;

/**
 * 用于存储字符串类型的数字
 * @author lazyr
 * @created 2021/5/14
 */
public class IntOrStr implements NumOrStr {
    private static Logger logger = LoggerFactory.getLogger(IntOrStr.class);

    private final boolean isInt;
    private final String strValue;
    private final Integer intValue;

    /**
     * 若传入的字符串可转为整数，则自动给intValue赋值，否则intValue为null
     * @param value
     */
    public IntOrStr(final @NonNull String value) {
        this.isInt = FmtValidator.isInt(value);
        if (!isInt) {
            logger.info("the str({}) is not a numeric string.", value);
        }
        this.strValue = value;
        this.intValue = this.isInt ? Integer.parseInt(value) : null;
    }

    public IntOrStr(final int value) {
        this.isInt = true;
        this.strValue = value + "";
        this.intValue = value;
    }

    @Override
    public boolean isNum() {
        return isInt;
    }

    @Override
    public String getStrValue() {
        return strValue;
    }

    @Override
    public Integer getNumValue() {
        return intValue;
    }

    @Override
    public String toString() {
        return strValue;
    }

    @Override
    public boolean equals(Object o) {
        return this == o || (o instanceof IntOrStr && this.strValue.equals(((IntOrStr)o).getStrValue()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(isInt, strValue, intValue);
    }


}
