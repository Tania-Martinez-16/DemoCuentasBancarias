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
public class CuentaDeCheques extends CuentaBasica {
    // Variables de instancia
    private int chequesEmitidos;
    private int chequesRebotados;
    
    // Constructor
    public CuentaDeCheques(int numeroDeCuenta, String cliente, double saldo){
        super(numeroDeCuenta, cliente, saldo);
        this.chequesEmitidos = 0;
        this.chequesRebotados = 0;
    }
    
    // Retirar
    public boolean retirar(double cantidad){
        boolean retiroexitoso = true;
        if(retiroexitoso){
            this.chequesEmitidos++;
        }
        else
            {
                this.chequesRebotados++;
            }
        return retiroexitoso;
    }
    
    // Calcular Comisión Por Cheques Emitidos
    public double calcularComisionPorChequesEmitidos(){
        double comisionEmitidos;
        if(chequesEmitidos <= 5){
            comisionEmitidos = 0;
        }
        else
            {
                comisionEmitidos = (chequesEmitidos - 5) * 10;
            }
        return comisionEmitidos;
    }
    
    // Calcular Comisiñon Por Cheques Rebotados
    public double calcularComisionPorChequesRebotados(){
        double comisionRebotados;
        if(chequesRebotados <= 0){
            comisionRebotados = 0;
        }
        else
            {
                comisionRebotados = 200 * (chequesRebotados);
            }
        return comisionRebotados;
    }
    
    // Realizar Corte Mensual
    public void realizarCorteMensual(){
        this.saldo = saldo - (this.chequesRebotados + this.chequesEmitidos);
    }
}