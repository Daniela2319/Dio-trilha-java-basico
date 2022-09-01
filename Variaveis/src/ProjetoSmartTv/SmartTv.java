package ProjetoSmartTv;

public class SmartTv {
    
    boolean ligada;
    int canal = 1;
    int volume = 25;


    // Criando método para manipular nossa Tv : ligar ();
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

    // Método para trocar de canal
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal(){
        canal++;  // Representa canal = canal + 1;
    }
    public void diminuirCanal(){
        canal--;
    }

    // Método para Aumentar o Volume
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentar o volume para: " + volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuir o volume para: " + volume);
    }

}
