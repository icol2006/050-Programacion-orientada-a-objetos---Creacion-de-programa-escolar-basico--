/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app01;

/**
 *
 * @author 
 */
public class Alumno extends Usuario implements Calificacion {

    private int calificacion;

    public Alumno(String id, String nombre, String apellido, String correoElectronico, int calificacion) {
        super(id, nombre, apellido, correoElectronico);
        this.calificacion = calificacion;
    }

    public Alumno() {
        super();
    }

    @Override
    public void mostrarCalificaciones() {
         System.out.print("Calificacion: "+this.getCalificacion()+"\n");
    }
    
    public void guardarCalificacion(int calificacion)
    {
        this.setCalificacion(calificacion);
    }

    /**
     * @return the calificacion
     */
    public int getCalificacion() {
        return calificacion;
    }

    /**
     * @param calificacion the calificacion to set
     */
    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

}
