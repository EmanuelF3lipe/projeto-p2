import java.util.Scanner;


public class Chatbot {
    //private enum raças{DRACONATO, ORC, HUMANO, ELFO};
    public static void main(String[] args) throws Exception {
        Scanner n = new Scanner(System.in);


        System.out.println(" Olá, eu me chamo Thales e serei seu guia para criar a base do seu personagem de D&D 5e(Dungeons and Dragons Quinta edição), venha comigo nessa aventura e vamos desbravar esse novo mundo juntos!!");
        System.out.println("\n Primeiro me diga seu nome, aventureiro:");
        String nome = n.nextLine();
        System.out.println("Aah, então seu nome é "+ nome +" , é um prazer conheçer você\n agora iremos passar por tres etapas, primeiro você vai escolher a raça do seu persnoagem, depois a sua classe e depois seu antecedente.");
        System.out.println("\n agora você deve escolher uma raça para seu pernosagem, sendo elas 1-draconato, 2 - orc, 3 - humano e 4 - elfo.(Digite o numero correspondente a Raça)");
        String raça = n.nextLine();
        System.out.println("Muito Bem!, agora escolha sua classe, classe é o que define as habilidades e poderes do seu personagem, escolha entre 1 - Barbaro, 2 - Patrulheiro, 3 - Paladino, 4 - Mago e 5 - monge(escolha o numero correspondente a classe)");
        String classe = n.nextLine();
        System.out.println("\n Agora vem o ultimo passo para criar seu personagem, escolha seu antecedente entre 1 - Acólito, 2  - Artesão, 3 - Nobre e 4 - Militar(escolha o numero correspondente ao antecedente). ");
        String antecedente = n.nextLine();



        if(raça.equals("1")){
            raça = "Draconato";
        }
        else if(raça.equals("2")){
            raça = "orc";
        }
        else if(raça.equals("3")){
            raça = "humano";
        }
        else if(raça.equals("4")){
            raça = "elfo";
        }
        else{
            System.out.println("Raça invalida");
            return;
        }



        if(classe.equals("1")){
            classe = "Barbaro";
        }
        else if(classe.equals("2")){
            classe = "Patrulheiro";
        }
        else if(classe.equals("3")){
            classe = "Paladino";
        }
        else if(classe.equals("4")){
            classe = "Mago";
        }
        else if(classe.equals("5")){
            classe = "Monge";
        }
        else{
            System.out.println("classe invalida");
            return;
        }


        if(antecedente.equals("1")){
            antecedente = "Acólito";
        }
        else if(antecedente.equals("2")){
            antecedente = "Artesão";
        }
        else if(antecedente.equals("3")){
            antecedente = "Nobre";
        }
        else if(antecedente.equals("4")){
            antecedente = "Militar";
        }
        else{
            System.out.println("antecedente invalido");
            return;
        }





        System.out.println("Parabens você criou um "+ raça + " ,com sua classe sendo "+ classe + "  e seu antecedente "+ antecedente + " ,Pra finalizar diga um nome pro seu personagem "+ nome +".");
        String nome_persona = n.nextLine();
        
        System.out.println("\n o seu personagem , "+ nome_persona + " ,está pronto para aventura divirta-se jogando e até a proxima!!");
    }
}