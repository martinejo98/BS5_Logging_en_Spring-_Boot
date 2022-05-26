package com.example.EjercicioBS5_Loggin_en_Spring_Boot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j  //Esta etiqueta de lombock es la que me permite trabajar con los logs
public class Controlador {

    public Controlador (){
        //TODA la configuración de los logs lo he hecho en el .properties
        log.info("Hola que tal desde el controlador");                          //log nos mostrará los mensajes log de tipos Warning, info, etc por consola
        log.error("Hola desde controlador pero este log es de tipo ERROR");     //en el fichero .properties podremos cofigurar para que solo nos muestre 1 tipo de log
        log.warn("Este es un log de tipoo warning");                            //o que nos meta en un fichero los logs, etc
        log.error("Otro de tipo error");
        log.debug("Hola soy un log de tipo DEBUG");
        log.error("El tercero de tipo ERROR");
        log.debug("Hola soy otro log de tipo DEBUG");
        log.warn("Este es un log de tipoo warning");
        log.trace("Yo soy de tipo TRACE");
        log.trace("Yo también soy de tipo TRACE");
        log.error("Otro mas de ERROR");
    }
}
