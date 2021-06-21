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
        //Suma monto actual mas la cantidad a retirar
        double resultado = this.getMontoActual() - cantidad;
        //Cacular el 15 porciento de montoActual+cantidadRetirar
        double resultadoInteres = (resultado / 100) * 15;
        //Sumar los intereses mas el monto total
        resultado = resultado - resultadoInteres;
        this.setMontoActual(resultado);
    }

}
