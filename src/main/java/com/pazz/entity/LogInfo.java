package com.pazz.entity;

import lombok.Data;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.MessageFormat;
import java.util.Date;

/**
 * @author 彭坚
 * @create 2018/8/23 23:35
 * @see LogInfo 系统日志信息
 */
@Data
public class LogInfo implements Serializable {

    public final static String BEGIN_ACTION = "BEGIN";

    public final static String END_ACTION = "END";

    /**
     * 日期时间 格式：yyyy-MM-dd hh-mm-ss-ms
     */
    private Date date;

    /**
     * requestId 起日志信息关联作用
     */
    private String requestId;

    /**
     * web.xml中的display-name
     */
    private String appName;

    /**
     * 模块名称
     */
    private String moduleName;

    /**
     * 登录用户
     */
    private String userName;

    /**
     * 访问url
     */
    private String url;

    /**
     * 日志类型 从LogType中取值
     *
     * @see LogType#AUDIT
     * @see LogType#BUSINESS
     * @see LogType#DAO
     * @see LogType#EXCEPTION
     * @see LogType#INTERFACE
     * @see LogType#JOB
     * @see LogType#PERFORMANCE
     * @see LogType#SERVICE
     * @see LogType#WEB
     */
    private String type;

    /**
     * 类名
     */
    private String clazz;

    /**
     * 方法名
     */
    private String method;

    /**
     * ip地址
     */
    private String ip;

    /**
     * 主机名称
     */
    private String hostName;

    /**
     * 主机地址
     */
    private String hostAddress;

    /**
     * 版本
     */
    private String version;

    /**
     * mac地址
     */
    private String macAddress;

    /**
     * 信息 可做预留字段
     */
    private String message;

    /**
     * 操作标记  从LogInfo中常量获取
     *
     * @see LogInfo#BEGIN_ACTION
     * @see LogInfo#END_ACTION
     */
    private String action;

    /**
     * 执行方法参数
     * <p>
     * json格式
     */
    private String args;

    /**
     * 执行方法返回值
     * <p>
     * json格式
     */
    private String result;

    public LogInfo() {
    }

    public Date newDate() {
        return new Date(System.currentTimeMillis());
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer(8);
        sb.append("LogInfo [");
        Field[] fields = this.getClass().getDeclaredFields();
        PropertyDescriptor pd = null;
        for (int i = 0; i < fields.length; i++) {
            try {
                pd = new PropertyDescriptor(fields[i].getName(), this.getClass());
                Method method = pd.getReadMethod();
                Object value = method.invoke(this);
                sb.append(fields[i].getName()).append("=").append(value);
                if (fields.length - 1 > i) {
                    sb.append(",");
                }
            } catch (Exception e) {
                continue;
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void setMessage(String message, Object... formatArgs) {
        this.message = (formatArgs == null || formatArgs.length == 0) ? message
                : MessageFormat.format(message, formatArgs);
    }

}
