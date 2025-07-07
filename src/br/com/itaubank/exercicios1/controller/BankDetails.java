package br.com.itaubank.exercicios1.controller;

public class dadosBancarios {
    private float saldo;
    private float deposito;
    private float saque;
    private float boleto;
    private float chequeEspecial;

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
        if (chequeEspecial <= 2000) {
        this.saldo += chequeEspecial;
        }
    }

    public float getDeposito() {
        return deposito;
    }

    public void setDeposito(float deposito) {
        this.deposito = deposito;
        if (deposito > 0) {
            this.saldo += deposito;
        } else {
            System.out.println("Operação não permitida.");
        }
    }

    public float getSaque() {
        return saque;
    }

    public void setSaque(float saque) {
        this.saque = saque;
        if (saque > 0) {
            this.saldo -= saque;
        } else {
            System.out.println("Operação não permitida.");
        }
    }

    public float getChequeEspecial() {
        if (deposito > 0 && deposito < 500) {
            this.chequeEspecial = 50;
        } else if (deposito > 500) {
            this.chequeEspecial = deposito / 2;
        } else {
            System.out.println("Operação não permitida.");
        }
        return chequeEspecial;
    }

    public void setChequeEspecial(float chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
        if (this.saldo <= 0) {
            saldo = (float) (this.saldo - (chequeEspecial * 0.2));
        }
    }

    public float getBoleto() {
        return boleto;
    }

    public void setBoleto(float boleto) {
        this.boleto = boleto;
        if (boleto > 0) {
            saldo -= boleto;
        } else {
            System.out.println("Operação não permitida.");
        }
    }
}
