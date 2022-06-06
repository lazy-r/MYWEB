package top.lazyr.lang.numorstr;

import lombok.NonNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import top.lazyr.validator.FmtValidator;

import java.util.Objects;

/**
 * @author lazyr
 * @created 2022/5/1
 */
public class FloatOrStr implements NumOrStr{
    private static Logger logger = LoggerFactory.getLogger(FloatOrStr.class);

    private final boolean isFloat;
    private final String strValue;
    private final Float floatValue;

    /**
     * 若传入的字符串可转为整数，则自动给intValue赋值，否则intValue为null
     * @param value
     */
    public FloatOrStr(final @NonNull String value) {
        this.isFloat = FmtValidator.isDouble(value);
        if (!isFloat) {
            logger.info("the str({}) is not a float string.", value);
        }
        this.strValue = value;
        this.floatValue = this.isFloat ? Float.parseFloat(value) : null;
    }

    public FloatOrStr(final float value) {
        this.isFloat = true;
        this.strValue = value + "";
        this.floatValue = value;
    }

    @Override
    public boolean isNum() {
        return isFloat;
    }

    @Override
    public String getStrValue() {
        return strValue;
    }

    @Override
    public Float getNumValue() {
        return floatValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FloatOrStr that = (FloatOrStr) o;
        return isFloat == that.isFloat && Objects.equals(strValue, that.strValue) && Objects.equals(floatValue, that.floatValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isFloat, strValue, floatValue);
    }


    @Override
    public String toString() {
        return strValue;
    }
}
