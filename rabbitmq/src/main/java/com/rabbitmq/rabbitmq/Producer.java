package com.rabbitmq.rabbitmq;


import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.Channel;

public class Producer {

    private final static String QUEUE_NAME = "hello";

    public static void main(String[] args) throws Exception {

        // Connection setup
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");

        try (
            Connection connection = factory.newConnection();
            Channel channel = connection.createChannel()
        ) {

            // Queue declare
            channel.queueDeclare(QUEUE_NAME, false, false, false, null);

            String message = "This is my fifth message in the  rabbit mq";

            // Send message
            channel.basicPublish("", QUEUE_NAME, null, message.getBytes());

            System.out.println(" Sent: " + message);
        }
    }
}
