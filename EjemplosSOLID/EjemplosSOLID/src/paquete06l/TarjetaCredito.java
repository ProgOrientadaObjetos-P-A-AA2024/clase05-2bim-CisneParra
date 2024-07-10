/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06l;

/**
 *
 * @author natsu
 */
public class TarjetaCredito {

    private String nombre;
    private String numero;
    private Banco banco;

    public TarjetaCredito(String n, String nu, Banco b) {
        nombre = n;
        numero = nu;
        banco = b;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerNumero(String n) {
        numero = n;
    }

    public void establecerBanco(Banco n) {
        banco = n;
    }

    public Banco obtenerBanco() {
        return banco;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerNumero() {
        return numero;
    }
}
