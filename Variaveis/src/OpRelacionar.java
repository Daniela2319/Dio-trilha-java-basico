public class OpRelacionar {
    public static void main(String[] args) {

         int numero1 = 1;
        int numero2 = 2;
        boolean simNao = numero1 == numero2;
        System.out.println("NumeroUm é igual a o NumeroDois? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("NumeroUm é diferente do NumeroDois? " + simNao);

         simNao = numero1 < numero2;
        System.out.println("NumeroUm é menor que o NumeroDois? " + simNao);

        /*String nomeUm = "Daniela";
        String nomeDois = ("Daniela");
        System.out.println(nomeUm == nomeDois);*/

        String nomeUm = "Daniela";
        String nomeDois = new String("Daniela");

        System.out.println(nomeUm.equals(nomeDois));


        //Lógicas

        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras ");
        }
        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        }
    }       

   
        
    
}
