/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.  
 */
package app02.Clases;

/**
 *
 * @author 
 */
public abstract class Cuenta {

    private double montoActual;
    
    public Cuenta(){
        
    }
        
    public Cuenta(double montoActual)
    {
       this.montoActual=montoActual; 
    }
    
    public void depositar(double cantidad)
    {
        double resultado=this.getMontoActual()+cantidad;
        this.setMontoActual(resultado);
    }
    
        /**
     * @return the montoActual
     */
    public double getMontoActual() {
        return montoActual;
    }

    /**
     * @param montoActual the montoActual to set
     */
    public void setMontoActual(double montoActual) {
        this.montoActual = montoActual;
    }
    

}
