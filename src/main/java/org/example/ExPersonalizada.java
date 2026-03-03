package org.example;

public class ExPersonalizada {

    static void sacar(double saldo, double valor) throws
        SaldoInsuficienteExcepction{
            if (valor > saldo){
                throw new SaldoInsuficienteExcepction("Saldo Insuficiente. Saldo: " + saldo);
            }
        }

    public static void main(String[] args) {
        try{
            sacar(100, 500);
        } catch (SaldoInsuficienteExcepction e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
