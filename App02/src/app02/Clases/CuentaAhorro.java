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
        //Suma monto actual mas la cantidad invertir
        double resultado = this.getMontoActual() + cantidad;
        //Cacular el diez porciento de montoActual+cantidadInvertir
        double resultadoInteres = (resultado / 100) * 10;
        //Sumar los intereses mas el monto total
        resultado = resultadoInteres + resultado;
        this.setMontoActual(resultado);
    }
}
