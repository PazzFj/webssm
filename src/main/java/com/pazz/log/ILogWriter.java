package com.pazz.log;

/**
 * @author 彭坚
 * @create 2018/8/23 22:17
 * @see ILogWriter 写日志接口
 */
public interface ILogWriter {

    /**
     * 写日志对象
     */
    void write(Object obj);

}
