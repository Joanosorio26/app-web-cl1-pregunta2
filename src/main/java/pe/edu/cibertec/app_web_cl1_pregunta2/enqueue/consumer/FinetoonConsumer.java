package pe.edu.cibertec.app_web_cl1_pregunta2.enqueue.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class FinetoonConsumer {

    @RabbitListener(queues = "orders_queue")
    public void consumirMensaje(String mensaje){
        log.info("Mensaje recibido"+mensaje+",inicio de operacion");
    }
}
