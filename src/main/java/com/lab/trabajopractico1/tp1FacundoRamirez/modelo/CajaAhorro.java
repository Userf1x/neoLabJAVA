package com.lab.trabajopractico1.tp1FacundoRamirez.modelo;


public class CajaAhorro extends Cuenta{
    public CajaAhorro (int saldo, int saldoDescubierto, int retiro, long nroCuenta, String titular, boolean habilitada) {
        super(saldo, saldoDescubierto, retiro, nroCuenta, titular, habilitada);
    }
    public void validarRetiro(int saldo, int retiro, boolean habilitada){
      if (habilitada = true){
        if (saldo>retiro){
            saldo -=retiro;
        }
        else {
            System.out.println("Saldo insuficiente");
        }
        }
      }
    }
    public void
}