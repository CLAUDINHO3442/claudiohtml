public class ContaBancaria {

    double saldo = 0;

    public void depositar(){
        System.out.println(saldo += 100);

    }
    public void sacar(){
        System.out.println(saldo -= 50);

    }
    public void mostrarSaldo(){
        System.out.println(saldo);
    }
    public static void main(String[] args) {

        ContaBancaria c1 = new ContaBancaria();
        
        c1.depositar();
        c1.sacar();
        c1.mostrarSaldo(); 


    }


}
