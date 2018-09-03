package com.pazz.message;

import javax.jms.Connection;
import javax.jms.JMSContext;
import javax.jms.JMSException;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;

/**
 * @author: 彭坚
 * @create: 2018/9/3 15:59
 * @description:
 */
public class MyQueueConnectionFactory implements QueueConnectionFactory {

    public QueueConnection createQueueConnection() throws JMSException {
        return null;
    }

    public QueueConnection createQueueConnection(String userName, String password) throws JMSException {
        return null;
    }

    public Connection createConnection() throws JMSException {
        return null;
    }

    public Connection createConnection(String userName, String password) throws JMSException {
        return null;
    }

    public JMSContext createContext() {
        return null;
    }

    public JMSContext createContext(String userName, String password) {
        return null;
    }

    public JMSContext createContext(String userName, String password, int sessionMode) {
        return null;
    }

    public JMSContext createContext(int sessionMode) {
        return null;
    }

}
