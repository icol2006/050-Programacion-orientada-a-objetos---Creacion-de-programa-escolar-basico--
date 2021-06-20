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
public class TarjetaDebito extends Cuenta{

    public TarjetaDebito(double apertura) {
        super(apertura);
    }

    public void retirar(double cantidad) {
        double resultado=this.getMontoActual()+cantidad;
        this.setMontoActual(resultado);
    }
}
