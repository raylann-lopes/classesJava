package br.com.itaubank.exercicios1.controller;

public class dadosBancarios {
    private float saldo;

    private float deposito;

    private float saque;

    private float chequeEspecial;

    public float getSaldo() {
        return saldo;
    }

    public float setSaldo(float saldo) {
        this.saldo = saldo;
        return this.saldo;
    }

    public float getDeposito() {
        return deposito;
    }

    public void setDeposito(float deposito) {
        if (deposito > 10.0) {
            this.saldo += deposito;
        }
    }

    public float getSaque() {
        return saque;
    }

    public float setSaque(float saque) {
        this.saque = saque;
        return saldo;
    }

    public float getChequeEspecial() {
        return chequeEspecial;
    }
}

