/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democuentasbancarias;

import java.util.Scanner;
import modelo.CuentaBasica;

/**
 *
 * @author tatia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(" Mi Cuenta ");
        
    // Se crea la cuenta
    CuentaBasica miCuenta = new CuentaBasica(16470257, "Tania Martínez Tuz", 50);
    System.out.println(" Datos de la cuenta ");
    System.out.println(" Cliente: " + miCuenta.getCliente());
    System.out.println(" Número de Cuenta: " + miCuenta.getNumeroDeCuenta());
    
System.out.println("---------------------------------------------------------");

    // Depositar $1,000.00
    System.out.println(" Se deposita en la cuenta: $1,000.00 ");
    miCuenta.depositar(1000);
    
    // Saldo actual
    System.out.println(" Su saldo es: " + miCuenta.getSaldo());
    
System.out.println("---------------------------------------------------------");

    // Depositar $1,500.00
    System.out.println(" Se deposita en la cuenta: $1,500.00");
    miCuenta.depositar(1500);
    
    // Saldo actual
    System.out.println(" Su saldo es: " + miCuenta.getSaldo());
    
System.out.println("---------------------------------------------------------");

    // Retirar $200.00
    System.out.println(" Se retira de la cuenta: $200.00");
    miCuenta.retirar(200);
    
    // Saldo actual
    System.out.println(" Su saldo es: " + miCuenta.getSaldo());
    
System.out.println("---------------------------------------------------------");

    // Depositar $300.00
    System.out.println(" Se deposita en la cuenta: $300.00");
    miCuenta.depositar(300);
    
    // Saldo actual
    System.out.println(" Su saldo es: " + miCuenta.getSaldo());
    
System.out.println("---------------------------------------------------------");

    // Retirar $1000.00
    System.out.println(" Se retira de la cuenta: $1000.00");
    miCuenta.retirar(1000);
    
    // Saldo actual
    System.out.println(" Su saldo es: " + miCuenta.getSaldo());
        
    }
    
}