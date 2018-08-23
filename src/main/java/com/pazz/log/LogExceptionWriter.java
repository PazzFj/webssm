package com.pazz.log;

import com.pazz.entity.LogInfo;
import com.pazz.exception.BusinessException;
import lombok.Data;

/**
 * @author 彭坚
 * @create 2018/8/23 22:22
 * @see LogExceptionWriter 记录异常日志
 */
@Data
public class LogExceptionWriter implements ILogExceptionWriter {

    /**
     * 日志发送
     */
    private ILogSender logSender;

    /**
     * 是否记录业务异常
     */
    private boolean writeBusinessException = false;

    /**
     * 是否记录异常日志
     */
    private boolean writeException = true;

    public void write(Object obj) {
        if (logSender == null || !writeException || !(obj instanceof Exception)) {
            //不写异常
            return;
        }
        if (!writeBusinessException || obj instanceof BusinessException){
            //不写业务异常
            return;
        }
        Exception exception = (Exception) obj;
        //发送日志
        logSender.send(exception);
    }

    private LogInfo getExceptionLogInfo(Exception exception){
        LogInfo info = new LogInfo();


        return info;
    }


}
