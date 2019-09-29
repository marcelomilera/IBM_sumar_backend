package com.marcelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Suma {
	
	@Id
	@SequenceGenerator(name="suma_id_seq",sequenceName="suma_id_seq", initialValue=1, allocationSize=12)
	@GeneratedValue(strategy= GenerationType.IDENTITY, generator="suma_id_seq")
	private long id;
	private final int sumando01;
	private final int sumando02;
    private final int resultado;

    public Suma(int sumando01, int sumando02) {
    	this.sumando01 = sumando01;
        this.sumando02 = sumando02;
        this.resultado = sumando01 + sumando02;
    }
    

    public long getId() {
        return id;
    }

    public int getSumando01() {
		return sumando01;
	}

	public int getSumando02() {
		return sumando02;
	}

	public int getResultado() {
        return resultado;
    }
}
