package com.pazz.message;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSContext;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.Session;

/**
 * @author: 彭坚
 * @create: 2018/8/31 10:45
 * @description: 消息提供者
 */
public class MessageProducerTest {

    public static void main(String[] args) throws Exception {
        ConnectionFactory connectionFactory = new QueueConnectionFactory() {
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
        };
//        Connection connection = connectionFactory.createConnection();
//        Session session = connection.createSession();
//        Topic
//        session.createConsumer()
    }

}
