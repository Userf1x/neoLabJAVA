package com.lab.trabajopractico1.tp1FacundoRamirez.modelo;

public class CuentaCorriente extends Cuenta {

    public CuentaCorriente(int saldo, int saldoDescubierto, int retiro, long nroCuenta, String titular, boolean habilitada) {
        super(saldo, saldoDescubierto, retiro, nroCuenta, titular, habilitada);
    }
        public void validarRetiro(int saldo, int retiro, int saldoDescubierto, boolean habilitada){
        if (habilitada = true){
            if(saldo > retiro){
                saldo -= retiro;
                System.out.println("Su nuevo saldo es: " + saldo);
            } else if (saldo + saldoDescubierto > retiro) {
                saldo
            }
            }
        }

}
