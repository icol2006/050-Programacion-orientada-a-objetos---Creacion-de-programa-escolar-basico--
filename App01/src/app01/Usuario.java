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
public abstract class Usuario {
    private String id;
    private String nombre;
    private String apellido;
    private String correoElectronico;
    
    public Usuario(String id, String nombre, String apellido, String correoElectronico) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoElectronico = correoElectronico;
    }
    
    public Usuario(){
        
    }
    
    public void imprimirPerfil() {
        String resultado = "";

        resultado = "Id:" + this.getId() + "\n";
        resultado += "Nombre:" + this.getNombre() + "\n";
        resultado += "Apellido:" + this.getApellido() + "\n";
        resultado += "Correo Electronico:" + this.getCorreoElectronico();
        System.out.println(resultado);
    }
    
    
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the correoElectronico
     */
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    /**
     * @param correoElectronico the correoElectronico to set
     */
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    
    
}
