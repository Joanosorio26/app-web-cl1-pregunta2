package pe.edu.cibertec.app_web_cl1_pregunta2.enqueue.producer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class FinetoonProducer {
    @Autowired
    private RabbitTemplate rabbitTemplate;
    private static final String EXCHANGE= "orders_exchange";
    private static final String ROUTING_KEY= "orders_routing";

    public void enviarMensaje(String mensaje){
        rabbitTemplate.convertAndSend(EXCHANGE,ROUTING_KEY,mensaje);
        log.info("Mensaje enviado a RabbitMQ" + mensaje);
    }

}

