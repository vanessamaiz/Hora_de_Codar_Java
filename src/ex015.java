public class ex015 {
    public static void main(String[] args){
        
        double alturaAnacleto = 1.50; 
        double crescimentoAnacleto = 0.02; 

        double alturaFelisberto = 1.10; 
        double crescimentoFelisberto = 0.03; 

        int anos = 0;

        while (alturaFelisberto <= alturaAnacleto) {
            alturaAnacleto += crescimentoAnacleto;
            alturaFelisberto += crescimentoFelisberto;
            anos++;
        }

        System.out.println("Serão necessários " + anos + " anos para Felisberto ser maior que Anacleto.");
    }
}
