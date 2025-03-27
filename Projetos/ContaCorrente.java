class ContaCorrente {
    String nomeCliente;
    int numero;
    double saldo;

    ContaCorrente(String nomeCliente, int numero, double saldo){
        this.nomeCliente = nomeCliente;
        this.numero = numero;
        this.saldo = saldo;
    }

    void depositar(double deposito){
        if(deposito > 0){
            saldo += deposito;
        }else{
            System.out.println("Depósito inválido");
        }
    }

    void sacar(double saque){
        if(saque > 0 && saque <= saldo){
            saldo -= saque;
        }else if(saque > 0){
            System.out.printf("Dinheiro insuficiente, não é possível realizar o saque (R$ %.2f)", (saque - saldo));
        }else {
            System.out.println("Saque usado de maneira errada ");  
        }
    }

    void imprimirExtrato(){
        System.out.println("------------------------------------");
        System.out.println("Nome: " + nomeCliente);
        System.out.println("Numero: " + numero);
        System.out.printf("Saldo: %.2f reais\n", saldo);
        System.out.println("------------------------------------");
    }

    public static void main(String[] args){
        ContaCorrente conta01 = new ContaCorrente("Arthur", 82039229, 81912.90);
        ContaCorrente conta02 = new ContaCorrente("Cássio", 99738234, 98217.80);

        conta01.depositar(200);
        conta01.sacar(700);
        conta01.imprimirExtrato();

        conta02.depositar(400);
        conta02.sacar(500);
        conta02.imprimirExtrato();
    }
}
