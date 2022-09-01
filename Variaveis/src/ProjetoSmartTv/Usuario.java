package ProjetoSmartTv;

public class Usuario {
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv Ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual: " +  smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        // Ligando e Desligando a Tv
        smartTv.ligar();
        System.out.println("Novo status -> Tv Ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status -> Tv Ligada?  " + smartTv.ligada);


        //Diminuir Volume
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume Atual: " + smartTv.volume);


        // Mundando o Canal
        System.out.println("Canal Atual:  " + smartTv.canal);
        smartTv.mudarCanal(4);
        System.out.println("Canal Atual: " + smartTv.canal);

        
    }
    
}
