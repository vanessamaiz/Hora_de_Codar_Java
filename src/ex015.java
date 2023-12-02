public class ex015 {
    public static void main(String[] args){
        
        double alturaAnacleto = 1.50;  // Altura inicial de Anacleto em metros
        double crescimentoAnacleto = 0.02;  // Crescimento anual de Anacleto em metros

        double alturaFelisberto = 1.10;  // Altura inicial de Felisberto em metros
        double crescimentoFelisberto = 0.03;  // Crescimento anual de Felisberto em metros

        int anos = 0;

        // Loop para calcular quantos anos serão necessários
        while (alturaFelisberto <= alturaAnacleto) {
            alturaAnacleto += crescimentoAnacleto;
            alturaFelisberto += crescimentoFelisberto;
            anos++;
        }

        // Exibir o resultado
        System.out.println("Serão necessários " + anos + " anos para Felisberto ser maior que Anacleto.");
    }
}
