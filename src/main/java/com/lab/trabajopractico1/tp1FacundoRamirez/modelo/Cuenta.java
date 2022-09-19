package com.lab.trabajopractico1.tp1FacundoRamirez.modelo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Cuenta {
	private String titular;
	private int saldo, saldoDescubierto, retiro;
	private long nroCuenta;
	private boolean habilitada;

	public Cuenta(int saldo, int saldoDescubierto, int retiro, long nroCuenta, String titular, boolean habilitada) {
		this.titular = titular;
		this.saldo = saldo;
		this.saldoDescubierto = saldoDescubierto;
		this.retiro = retiro;
		this.nroCuenta = nroCuenta;
		this.habilitada = habilitada;
	}
}
