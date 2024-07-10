/*
 * L — Liskov substitution principle (Principio de sustitución de Liskov) 
 */
package paquete06l;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        Banco banco = new Banco("Pichincha");
        TarjetaCredito tarjeta = new TarjetaCredito("Visa MasterCard", "2224445551",
                banco);

        MayorEdad representante = new MayorEdad("José", tarjeta);

        MenorEdad menor = new MenorEdad("Felipe", representante);

        System.out.printf("Nombre:%s - Tarjeta:%s - Banco:%s\n",
                menor.obtenerNombre(),
                menor.obtenerRepresentante().obtenerTarjeta().obtenerNumero(),
                menor.obtenerRepresentante().obtenerTarjeta().obtenerBanco().obtenerNombre());

    }
}
