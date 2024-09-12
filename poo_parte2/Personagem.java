public class Personagem{
    String nome;
    int energia = 10;
    int fome = 0;
    int sono = 0;

    void cacar(){
        if(energia >=2){
            System.out.printf("%s caçando\n", nome);
            energia -= 2; //energia = energia - 2
        }else{
            System.out.printf("%s sem energia para caçar", nome);
            if(fome < 10)
                fome = fome + 1; // fome +=1 fome++ fome++
            sono = sono == 10 ? sono : sono + 1;
        }
        
    }
   
    //método comer
    void comer(){
        if(fome >= 1){
            System.out.println(nome + " comendo");
            energia = Math.min(energia + 1, 10);
            fome--;
        }else{
            System.out.println(nome + " sem fome");
        }
       
    }
    
    //método dormir
    void dormir(){
        if(sono >= 1){
            System.out.print(nome + " dormindo\n");
            energia = Math.min(energia + 1, 10);
            sono -= 1;
        }else{
            System.out.println(nome + " sem sono");
        }
       
    }
    //byte, short, int, long, boolean, float, double, char variáveis primitivas, as de referência começam com letras maiúsculas
}