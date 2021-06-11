package top.lazyr.myweb.util;

/**
 * 处理Bean类型转寒
 * @author lazyr
 * @created 2021/3/22
 */
public class BeanUtil {
    /**
     * 类型转换
     */
    public static <T, R> R convertType(T source, Class<R> targetClass) {
        if (source == null || targetClass == null) {
            return null;
        }

        final R result;
        try {
            result = targetClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        org.springframework.beans.BeanUtils.copyProperties(source, result);
        return result;
    }
}
