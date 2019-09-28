package com.marcelo;

public class Suma {
	private final long id;
    private final int resultado;

    public Suma(long id, int sumando01, int sumando02) {
        this.id = id;
        this.resultado = sumando01 + sumando02;
    }

    public long getId() {
        return id;
    }

    public int getResultado() {
        return resultado;
    }
}
