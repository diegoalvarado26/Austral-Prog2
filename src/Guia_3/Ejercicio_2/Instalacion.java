package Guia_3.Ejercicio_2;

import Guia_3.Ejercicio_2.Instalaciones.Clase;
import Guia_3.Ejercicio_2.Personas.Empleados.Profesor;

public  abstract class Instalacion{

    public String nombre_instalacion;
    public int capacidad;
    public Profesor profesor_a_cargo;

    public Clase[] clases_dictadas;

    public abstract void setInstalacionName();
    public abstract String getInstalacionName();
    public abstract void crearClase();




}
