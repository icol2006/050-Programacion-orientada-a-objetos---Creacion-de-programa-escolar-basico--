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
public class CuentaAhorro extends Cuenta {

    public CuentaAhorro(double apertura) {
        super(apertura);
    }

    public void invertir(double cantidad) {
        double resultado = this.getMontoActual() + cantidad;
        double resultadoInteres = (resultado / 100) * 10;
        resultado = resultadoInteres + resultado;
        this.setMontoActual(resultado);
    }
}
