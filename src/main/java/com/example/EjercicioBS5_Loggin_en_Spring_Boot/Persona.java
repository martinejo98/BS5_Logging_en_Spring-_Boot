package com.example.EjercicioBS5_Loggin_en_Spring_Boot;

import lombok.*;

@Data       //Esta etiqueta de lombock me crea metodos setters, getters, toString, constructores, etc
//@Setter     //Esta etiqueta de lombock me crea metodos setters
//@Getter     //Esta etiqueta de lombock me crea metodos getters
//@AllArgsConstructor         //Esta etiqueta de lombock me crea el constructor con los parametros
//@NoArgsConstructor          //Esta etiaqueta de lombock me crea un constructor vacío
public class Persona {
    private String nombre;
    private int edad;
}
