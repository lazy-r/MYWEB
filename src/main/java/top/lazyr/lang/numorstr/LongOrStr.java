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
public class LongOrStr implements NumOrStr{
    private static Logger logger = LoggerFactory.getLogger(LongOrStr.class);

    private final boolean isLong;
    private final String strValue;
    private final Long longValue;

    /**
     * 若传入的字符串可转为整数，则自动给intValue赋值，否则intValue为null
     * @param value
     */
    public LongOrStr(final @NonNull String value) {
        // TODO: 待修复
        this.isLong = FmtValidator.isDouble(value);
        if (!isLong) {
            logger.info("the str({}) is not a long string.", value);
        }
        this.strValue = value;
        this.longValue = this.isLong ? Long.parseLong(value) : null;
    }

    public LongOrStr(final long value) {
        this.isLong = true;
        this.strValue = value + "";
        this.longValue = value;
    }


    @Override
    public boolean isNum() {
        return isLong;
    }

    @Override
    public String getStrValue() {
        return strValue;
    }

    @Override
    public Long getNumValue() {
        return longValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LongOrStr longOrStr = (LongOrStr) o;
        return isLong == longOrStr.isLong && Objects.equals(strValue, longOrStr.strValue) && Objects.equals(longValue, longOrStr.longValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isLong, strValue, longValue);
    }

    @Override
    public String toString() {
        return strValue;
    }
}
