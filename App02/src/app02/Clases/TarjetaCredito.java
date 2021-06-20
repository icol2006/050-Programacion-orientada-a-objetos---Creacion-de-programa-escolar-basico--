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
public class TarjetaCredito extends Cuenta {

    public TarjetaCredito(double apertura) {
        super(apertura);
    }

    public void sumaInteres(double cantidad) {
        double resultado = this.getMontoActual() + cantidad;
        double resultadoInteres = (resultado / 100) * 15;
        resultado = resultadoInteres - resultado;
        this.setMontoActual(resultado);
    }

}
