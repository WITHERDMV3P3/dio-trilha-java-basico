public class Usuario {
    public static void main(String[] args) {
        
        SmartTv smartTV = new SmartTv();
        
        System.out.println("Tv ligada? "+smartTV.ligada);
        System.out.println("Volume Atual : "+smartTV.volume);

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();

        System.out.println("Volume atual -> " + smartTV.volume);

        System.out.println("Canal Atual: "+smartTV.canal);
        smartTV.mudarcanal(13);
        System.out.println("Canal Atual: "+smartTV.canal);



        smartTV.ligar();
        System.out.println("novo status -> TV ligada? " + smartTV.ligada);

        smartTV.desligar();
        System.out.println("novo status -> TV ligada? " + smartTV.ligada);

        
    }
}
