/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author tatia
 */
public class CuentaDeAhorro {
    // Variables de instancia
    private int numeroDeCuenta;
    private String cliente;
    private double saldo;
    private double tasaDeInteres;
    private double comisionPorSaldo;
    private double cantidad;
    
    // Constructor
    public CuentaDeAhorro(int numeroDeCuenta, String cliente, double saldo){
        this.numeroDeCuenta = numeroDeCuenta;
        this.cliente = cliente;
        this.saldo = saldo;
    }
    
    // Método getSaldo
    public double getSaldo(){
        return saldo;
    }
    
    // Método getNumeroDeCuenta
    public int getNumeroDeCuenta(){
        return numeroDeCuenta;
    }
    
    // Método getCliente
    public String getCliente(){
        return cliente;
    }
    
    // Método Depositar
    public boolean depositar(double cantidad){
        boolean depositoexitoso = true;
        if(cantidad >= 0){
            this.saldo = this.saldo + cantidad;
            depositoexitoso = true;
        }
        else
            {
                depositoexitoso = false;
            }
        return depositoexitoso;
    }
    
    // Método Retirar
    public boolean retirar(double cantidad){
        boolean retiroexitoso = true;
        if(cantidad <= saldo){
            this.saldo = this.saldo - cantidad;
            retiroexitoso = true;
        }
        else
            {
                if (cantidad > saldo){
                    retiroexitoso = false;
                }
            }
        return retiroexitoso;
    }
    
    // Método Calcular Interés
    public double calcularInteres(){
        tasaDeInteres = (((4.00 / 360.00) * 30.00) * getSaldo() / 100.00);
        return tasaDeInteres;
    }
    
    // Método Calcular Comision Por Saldo
    public double calcularComisionPorSaldo(double saldo){
        if(saldo < 1000.00){
            comisionPorSaldo = 50.00;
        }
        else 
            {
                if(saldo >= 1000.00){
                    comisionPorSaldo = 0.00;
                }
            }
        return comisionPorSaldo;
    }
    
    // Método Realizar Corte Mensual
    public void realizarCorteMensual(){
        saldo = ((getSaldo() + tasaDeInteres) - comisionPorSaldo);
    }
}