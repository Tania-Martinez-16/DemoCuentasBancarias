/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democuentasbancarias;

import java.util.Scanner;
import modelo.CuentaBasica;
import modelo.CuentaDeAhorro;
import modelo.CuentaDeCheques;

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

System.out.println("_________________________________________________________");

    System.out.println(" Mi cuenta de Ahorro ");
    
    // Se crea la cuenta
    CuentaDeAhorro misAhorros = new CuentaDeAhorro(16470257, "Tania Martínez Tuz", 50);
    System.out.println(" Datos de la cuenta ");
    System.out.println(" Cliente: " + misAhorros.getCliente());
    System.out.println(" Número de Cuenta: " + misAhorros.getNumeroDeCuenta());
    
System.out.println("---------------------------------------------------------");

    //Depositar $1,000.00
    System.out.println(" Se deposita en la cuenta: $1,000.00");
    misAhorros.depositar(1000);
    
    // Saldo actual
    System.out.println(" Su saldo es: " + misAhorros.getSaldo());
    
System.out.println("---------------------------------------------------------");

    //Depositar $1,500.00
    System.out.println(" Se deposita en la cuenta: $1,500.00");
    misAhorros.depositar(1500);

    // Saldo actual
    System.out.println(" Su saldo es: " + misAhorros.getSaldo());    
    
System.out.println("---------------------------------------------------------");    

    // Retirar $200.00
    System.out.println(" Se deposita en la cuenta: $200.00");
    misAhorros.retirar(200);

    // Saldo actual
    System.out.println(" Su saldo es: " + misAhorros.getSaldo());   
    
System.out.println("---------------------------------------------------------");
    
    // Depositar $300.00
    System.out.println(" Se deposita en la cuenta: $300.00");
    misAhorros.depositar(300);

    // Saldo actual
    System.out.println(" Su saldo es: " + misAhorros.getSaldo());   

System.out.println("---------------------------------------------------------");

    // Retirar $1,000.00
    System.out.println(" Se retira de la cuenta: $1,000");
    misAhorros.retirar(1000);
    
    // Saldo actual
    System.out.println(" Su saldo es: " + misAhorros.getSaldo());
    
System.out.println("---------------------------------------------------------");

    System.out.println(" Intereses:");
    System.out.println(misAhorros.calcularInteres());
    System.out.println(" Comisión:");
    System.out.println(misAhorros.calcularComisionPorSaldo(1650));
    System.out.println("Corte Mensual:");
    System.out.println(misAhorros.getSaldo() + misAhorros.calcularInteres() -
            misAhorros.calcularComisionPorSaldo(1650));   
    
System.out.println("_________________________________________________________");

    System.out.println(" Cuenta de Cheques ");
    
    // Creamos la cuenta
    CuentaDeCheques misCheques = new CuentaDeCheques(16470257, "Tania Martínez Tuz", 2000);
    System.out.println(" Datos de la cuenta");
    System.out.println(" Cliente:" + misCheques.getCliente());
    System.out.println(" Número de Cuenta:" + misCheques.getNumeroDeCuenta());
    System.out.println(" Saldo:" + misCheques.getSaldo());
    
System.out.println("---------------------------------------------------------");

    System.out.println(" ¿Cuánto desea depositar?");
    double cantidad;
    cantidad = entrada.nextInt();
    misCheques.depositar(cantidad);
    
    System.out.println(" Su saldo es: $" + misCheques.getSaldo());
    
System.out.println("---------------------------------------------------------");

    System.out.println(" ¿Cuánto desea retirar?");
    cantidad = entrada.nextInt();
    misCheques.retirar(cantidad);

System.out.println("---------------------------------------------------------");
    
    System.out.println(" Su comisión por Cheques Emitidos es: $" +
            misCheques.calcularComisionPorChequesEmitidos());
    
    System.out.println(" Su comisión por Cheques Rebotados es: $" +
            misCheques.calcularComisionPorChequesRebotados());
    
System.out.println("---------------------------------------------------------");

        System.out.println(" Su saldo es: $" + (misCheques.getSaldo()- cantidad));
    }
}