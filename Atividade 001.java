public class Main {
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("Digite um texto: ");
            return;
        }

        String texto = String.join(" ", args);

        int palavras = args.length;
        int vogais = 0;
        int pares = 0;
        int impares = 0;
        int tamanho;

        for(int i = 0; i < texto.length(); i++){
            char c = Character.toLowerCase(texto.charAt(i));

            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                vogais ++;
            }
        }
        for(String palavra : args){
            tamanho = palavra.length();

            if(tamanho % 2 == 0){
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("texto digitado: " + texto);
        System.out.println("Quantidade de palavras: " + palavras);
        System.out.println("Quantidade de vogais: " + vogais);
        System.out.println("Palavras pares: " + pares);
        System.out.println("Palavras impares: " + impares);
    }
}
