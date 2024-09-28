package pe.edu.cibertec.app_web_cl1_pregunta2.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.app_web_cl1_pregunta2.enqueue.producer.FinetoonProducer;

@RequiredArgsConstructor
@RestController
public class FinetoonController {

    private final FinetoonProducer finetoonProducer;

    @GetMapping("/enviar")
    public String enviarMensaje(@RequestParam String mensaje){
        finetoonProducer.enviarMensaje(mensaje);
        return "Mensaje enviado a RabbitMQ" + mensaje;
    }
}
