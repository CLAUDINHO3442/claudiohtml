public class Cachorro {
    String raça;
    int idade;



    public Cachorro(String raça, int idade){
        this.raça = raça;
        this.idade = idade;



    }



    public String getRaça(){
       return this.raça;

    }




    public int getIdade(){
       return this.idade;

    }



    public void setRaça(String raça){
        this.raça = raça;
    }



    public void setIdade(int idade){
        this.idade = idade;
    }
        



    





    public void latir(){
        System.out.println("auauau");



    }





    public static void main(String[] args) {

    Cachorro c1 = new Cachorro("buldogue", 27);{
        

        c1.setRaça("pastor alemao");
        c1.setIdade(32);
      
        
        System.out.println("a raça é " + c1.getRaça() + "e a idade é " + c1.getIdade() + "anos");
        c1.latir();


    }
}
}
