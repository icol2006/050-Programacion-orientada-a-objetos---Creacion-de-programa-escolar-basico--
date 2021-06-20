/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app01;

/**
 *
 * @author icol2
 */
public class Tutor extends Usuario implements Calificacion{
    
    private Alumno alumno;
    
    public Tutor(String id, String nombre, String apellido, String correoElectronico,Alumno alumno) {
        super(id, nombre, apellido, correoElectronico);
        this.alumno=alumno;
    }
    
    public Tutor(){
        
    }

    @Override
    public void mostrarCalificaciones() {
        System.out.print(this.alumno.getCalificacion()+"\n");
    }

    /**
     * @return the alumno
     */
    public Alumno getAlumno() {
        return alumno;
    }

    /**
     * @param alumno the alumno to set
     */
    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    
    
}
