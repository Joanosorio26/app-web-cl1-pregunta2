package pe.edu.cibertec.app_web_cl1_pregunta2.enqueue.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class FinetoonConfig {

    @Bean
    public Queue orderQueue(){
        return new Queue("orders_queue", false);
    }

    @Bean
    public TopicExchange ordersExchange(){
        return new TopicExchange("orders_exchange");
    }

    @Bean
    public Binding bindingOrder(Queue orderQueue, TopicExchange ordersExchange){
        return BindingBuilder.bind(orderQueue).to(ordersExchange)
                .with("orders_routing");
    }

}
