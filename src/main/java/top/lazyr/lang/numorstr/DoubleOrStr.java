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
public class DoubleOrStr implements NumOrStr{
    private static Logger logger = LoggerFactory.getLogger(DoubleOrStr.class);

    private final boolean isDouble;
    private final String strValue;
    private final Double doubleValue;

    /**
     * 若传入的字符串可转为整数，则自动给intValue赋值，否则intValue为null
     * @param value
     */
    public DoubleOrStr(final @NonNull String value) {
        this.isDouble = FmtValidator.isDouble(value);
        if (!isDouble) {
            logger.info("the str({}) is not a double string.", value);
        }
        this.strValue = value;
        this.doubleValue = this.isDouble ? Double.parseDouble(value) : null;
    }

    public DoubleOrStr(final double value) {
        this.isDouble = true;
        this.strValue = value + "";
        this.doubleValue = value;
    }



    @Override
    public boolean isNum() {
        return isDouble;
    }

    @Override
    public String getStrValue() {
        return strValue;
    }

    @Override
    public Double getNumValue() {
        return doubleValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DoubleOrStr that = (DoubleOrStr) o;
        return isDouble == that.isDouble && Objects.equals(strValue, that.strValue) && Objects.equals(doubleValue, that.doubleValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isDouble, strValue, doubleValue);
    }

    @Override
    public String toString() {
        return strValue;
    }
}
