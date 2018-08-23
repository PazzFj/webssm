package com.pazz.log;

import java.util.List;

/**
 * @author 彭坚
 * @create 2018/8/23 22:30
 * @see ILogSender 发日志接口
 */
public interface ILogSender {

    /**
     * 批量发送日志
     * @param msg
     */
    void send(List<Object> msg);

    /**
     * 发送日志
     * @param msg
     */
    void send(Object msg);

}
