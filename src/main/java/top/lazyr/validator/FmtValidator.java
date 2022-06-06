package top.lazyr.validator;

import java.io.FileInputStream;
import java.util.regex.Pattern;

/**
 * @author lazyr
 * @created 2022/4/30
 */
public class FmtValidator {
    /**
     * 正则表达式：用户名匹配，只含有汉字、数字、字母、下划线不能以下划线开头和结尾
     */
    public static final String REGEX_USERNAME = "^(?!_)(?!.*?_$)[a-zA-Z0-9_\\u4e00-\\u9fa5]+$";
    /**
     * 正则表达式：验证密码
     */
    public static final String REGEX_PASSWORD = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#.$%=\\-]).{8,20})";

    /**
     * 正则表达式：验证手机号
     */
    public static final String REGEX_MOBILE = "^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$";

    /**
     * 正则表达式：验证邮箱
     */
    public static final String REGEX_EMAIL = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";

    /**
     * 正则表达式：验证汉字
     */
    public static final String REGEX_CHINESE = "^[\u4e00-\u9fa5],{0,}$";

    /**
     * 正则表达式：验证URL
     */
    public static final String REGEX_URL = "(https?|ftp|file)://[-A-Za-z0-9+&@#/%?=~_|!:,.;]+[-A-Za-z0-9+&@#/%=~_|]";
    /**
     * 正则表达式：验证URL
     */
    public static final String REGEX_IMAGE_URL = "[-A-Za-z0-9+&@#/%?=~_|!:,.;]+[-A-Za-z0-9+&@#/%=~_|]";
    /**
     * 正则表达式：验证IP地址
     */
    public static final String REGEX_IP_ADDR = "(25[0-5]|2[0-4]\\d|[0-1]\\d{2}|[1-9]?\\d)";

    /**
     * 正则表达式：验证服务名称
     */
    public static final String REGEX_SERVICE_NAME = "^([a-z]+-?)*[a-z]+$";
    /**
     * 正则表达式：验证域名
     */
    public static final String REGEX_DOMAIN = "^([a-z0-9]+.?)+[a-z]+$";
    /**
     * 正则表达式：验证相对路径
     */
    public static final String REGEX_RELATIVE_PATH = "^[a-z0-9]([a-z0-9-]*[a-z0-9])?(/[a-z0-9]([a-z0-9-]*[a-z0-9])?)*$";

    /**
     * 正则表达式：验证字符串是否由英文字母和数字组成
     */
    public static final String REGEX_ENGLISH_NUM = "[a-zA-Z0-9]+";

    /**
     * 正则表达式：验证字符串是否由数字组成
     */
    public static final String REGEX_NUM = "[0-9]*";

    /**
     * 正则表达式：验证字符串是否为double类型
     */
    public static final String REGEX_DOUBLE = "[+-]?\\d+(.\\d+)?";

    /**
     * 正则表达式：验证字符串是否为float类型
     */
    public static final String REGEX_FLOAT = "^[-\\\\+]?[.\\\\d]*$";

    /**
     * 正则表达式：验证字符串是否为int类型
     */
    public static final String REGEX_INT = "[-\\\\+]?[\\\\d]*$";



    /**
     * 校验用户名
     *
     * @param username 用户名
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isUsername(String username) {
        return Pattern.matches(REGEX_USERNAME, username);
    }

    /**
     * 校验密码
     *
     * @param password 密码
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isPassword(String password) {
        return Pattern.matches(REGEX_PASSWORD, password);
    }

    /**
     * 校验手机号
     *
     * @param mobile 手机号
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isMobile(String mobile) {
        return Pattern.matches(REGEX_MOBILE, mobile);
    }

    /**
     * 校验邮箱
     *
     * @param email 电子邮箱
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isEmail(String email) {
        return Pattern.matches(REGEX_EMAIL, email);
    }

    /**
     * 校验汉字
     *
     * @param chinese 汉字
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isChinese(String chinese) {
        return Pattern.matches(REGEX_CHINESE, chinese);
    }

    /**
     * 校验URL
     *
     * @param url URL
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isUrl(String url) {
        return Pattern.matches(REGEX_URL, url);
    }

    /**
     * 校验URL
     *
     * @param imageUrl URL
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isImageUrl(String imageUrl) {
        return Pattern.matches(REGEX_IMAGE_URL, imageUrl);
    }

    /**
     * 校验IP地址
     *
     * @param ipAddr ip地址
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isIPAddr(String ipAddr) {
        return Pattern.matches(REGEX_IP_ADDR, ipAddr);
    }

    /**
     * 校验服务名字
     *
     * @param serviceName 服务名字
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isServiceName(String serviceName) {
        return Pattern.matches(REGEX_SERVICE_NAME, serviceName);
    }

    /**
     * 校验域名
     *
     * @param domain 域名
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isDomain(String domain) {
        return Pattern.matches(REGEX_DOMAIN, domain);
    }

    /**
     * 校验相对路径
     *
     * @param relativePath 相对路径
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isRelativePath(String relativePath) {
        return Pattern.matches(REGEX_RELATIVE_PATH, relativePath);
    }

    /**
     * 校验字符串是否只包含英文字母和数字
     * @param englishAndNum
     * @return
     */
    public static boolean isEnglishAndNum(String englishAndNum) {
        return Pattern.matches(REGEX_ENGLISH_NUM, englishAndNum);
    }

    /**
     * 校验字符串是否只包含数字
     * @param num
     * @return
     */
    public static boolean isNum(String num) {
        return Pattern.matches(REGEX_NUM, num);
    }

    /**
     * 校验字符串是否为int
     * @param intStr
     * @return
     */
    public static boolean isInt(String intStr) {
        return Pattern.matches(REGEX_INT, intStr);
    }

    /**
     * 校验字符串是否为double
     * @param doubleStr
     * @return
     */
    public static boolean isDouble(String doubleStr) {
        return Pattern.matches(REGEX_DOUBLE, doubleStr);
    }

    /**
     * 校验字符串是否为float
     * @param floatStr
     * @return
     */
    public static boolean isFloat(String floatStr) {
        return Pattern.matches(REGEX_FLOAT, floatStr);
    }

}
