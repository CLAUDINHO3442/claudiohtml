public class Carro {

    String nome;
    int ano;
    int velocidade = 0;


    public Carro(String nome, int ano){
        this.nome = nome;
        this.ano = ano;

    }

    public String getNome(){
        return this.nome;
    }

    public int getAno(){
        return this.ano;
    }


    public void setNome(String nome){
        this.nome = nome;

    }

    public void setAno(int ano){
        this.ano = ano;
    }


    public void acelerar(){
        velocidade = velocidade + 10;
        System.out.println("velocidade" + velocidade);



    }
    
    public void frear(){
        velocidade = velocidade - 10;
        System.out.println("velocidade" +  velocidade);



    }


    public static void main(String[] args) {
    Carro c1 = new Carro("Gol", 2010 ); 

    c1.setNome("fox");
    c1.setAno(2015);

    

    System.out.println(c1.getNome());
    System.out.println(c1.getAno());
    c1.acelerar();
    c1.acelerar();
    c1.frear();
   


   
}

    

}