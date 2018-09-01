package Guia_3.Ejercicio_2.Instalaciones;
import Guia_3.Ejercicio_2.Instalacion;

public class Pileta extends Instalacion {

    @Override
    public void setInstalacionName() {
        nombre_instalacion = this.getClass().getSimpleName();
    }

    @Override
    public String getInstalacionName() {
        return nombre_instalacion;
    }

    public void crearClase(String nombre_instalacion, int id_prof, int sociosU){
        
    }

    public void inscribirClase(int id_socio){

    }
}
