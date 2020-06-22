public class Principal {
    //Sei que não é uma boa prática, porém gosttaria de explicar o que estou fazendo.
    public static void main(String[] args) {
        //Colocarei 2012, pois é o exemplo que está no curso
        int ano = 2012;
        int total;
        int media;
        //Eu tinha 18 anos em 2012
        int minhaIdade = 18;
        int idadePaulo = 32;
        int idadeAdriano = 26;
        mostrar("Eu nasci em " + (ano - minhaIdade));
        mostrar("Paulo nasceu em " + (ano - idadePaulo));
        mostrar("Adriano nasceu em " + (ano - idadeAdriano));
        total = minhaIdade + idadeAdriano + idadePaulo;
        media = total/3;
        mostrar("A soma das nossas idades é "+total);
        mostrar("A média das nossas idades é "+media);
    }

    //Para fins didáticos
    private static void mostrar(String frase) {
        System.out.print(frase);
        pularLinha();
    }

    //Para fins didáticos, demonstrando que uma função pode ser chamada por outra.
    private static void pularLinha() {
        System.out.println("");
    }
}