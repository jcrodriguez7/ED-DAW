/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cuentas;

/**
 *
 * @author juanc
 * @version 1.1
 */
public class CCuenta {

    /**
     * Campos de la clase
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    
    public CCuenta()
    {
    }
    
    /**
     * Constructor de la cuenta con 4 parámetros
     * @param nom nombre del propietario
     * @param cue nombre de la cuenta
     * @param sal saldo inicial de la cuenta
     * @param tipo tipo de interés inicial de la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    public double estado()
    {
        return getSaldo();
    }

    /**
     * Este método se utiliza para ingresar X cantidad en la cuenta
     * @param cantidad Cantidad que se quiere ingresar
     * @throws Exception Si la cantidad que se intenta ingresar, es negativa.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Éste método posibilita retirar una cantidad X de la cuenta.
     * @param cantidad Cantidad que se quiere retirar
     * @throws Exception Si la cantidad a retirar es negativa o no hubiera suficiente saldo
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Los siguiente métodos son los set y get de los atributos de la clase.
     */
    
    
    /**
     * @return el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre el nombre a cambiar
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return la cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta la cuenta a cambiar
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
    
    /**
     * @return el saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo el saldo a cambiar
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return el tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés el tipoInterés a cambiar
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
