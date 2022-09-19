package com.lab.trabajopractico1.tp1FacundoRamirez.modelo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Clientes extends Cuenta {

    public Clientes(int saldo, int saldoDescubierto, int retiro, long nroCuenta, String titular, boolean habilitada) {
        super(saldo, saldoDescubierto, retiro, nroCuenta, titular, habilitada);
    }


}