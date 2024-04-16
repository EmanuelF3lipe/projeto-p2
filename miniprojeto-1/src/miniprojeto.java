import java.util.Scanner;


public class miniprojeto {
    public static void main(String[] args) throws Exception {

        Scanner escaner = new Scanner(System.in);

        
        System.out.println("Olá, para começarmos me diga seu nome: ");
        String nomeP = escaner.nextLine();
        System.out.println("É um prazer te conheçer, "+nomeP+", vamos começar essa aventura!!");
        System.out.println("\n\nVocê é um aventureiro aprendiz que acabou de chegar na cidade de Whiterun, você sente na pele um ar de misterio e tambem se sente ansioso pelas novas aventuras que estão por vir. Enquanto contemplava as ruas de Whiterun, a cidade parecia pulsar com uma energia própria, cheia de promessas e desafios. Seria sábio explorar cada canto em busca de segredos e oportunidades? Ou deveria seguir o caminho seguro, rumo à guilda local, em busca de orientação e talvez até mesmo de companheiros de jornada? As possibilidades se estendiam diante do aventureiro, cada uma com suas próprias recompensas e perigos. A escolha estava em suas mãos: explorar a cidade ou buscar a sabedoria da guilda?(Escolha entre Explorar a cidade ou Ir para guilda, digite do mesmo jeito desse parenteses.)");
        String decisao1 = escaner.nextLine();
        
        if(decisao1.equals("Explorar a cidade") || decisao1.equals("explorar a cidade")){
            System.out.println("\n\nEnquanto explorava a cidade antes de se dirigir à guilda, Você maravilhou-se com as lindas praças, fontes e as diversas barraquinhas vendendo uma variedade de alimentos. No entanto, à medida que vagava pelas ruas, uma sombra de inquietude se instalava em seu peito. O ambiente se tornava mais sombrio, como se estivesse adentrando uma parte obscura da cidade. De repente, seu olhar se fixou em um beco escuro à sua direita, onde quatro homens pareciam cercar uma mulher, cujos olhos refletiam o medo palpável. Você se vê diante de uma decisão crucial: ajudar a mulher em perigo ou chamar as autoridades? Cada opção carregava seu próprio peso, e ele sabia que o tempo para decidir era curto.(escolha entre Chamar as autoridades ou ajudar sozinho)");
            String decisao2 = escaner.nextLine();
            if(decisao2.equals("Chamar as autoridades")||decisao2.equals("chamar as autoridades")){
                System.out.println("Você corre o mais rapido que pode para encontrar um cavaleiro da cidade, sua sorte é que na esquina da rua 3 guardas estavam em sua ronda diaria pela cidade, você os alcança e pede para o seguir, vocês conseguem chegar a tempo e os homens são presos a mulher te agradeçe e te entrega uma bolsa com 20 peças de ouro que você usa numa estalagem pra passar a noite.");
            }
            else if (decisao2.equals("Ajudar sozinho")||decisao2.equals("ajudar sozinho")){
                System.out.println("Ao tentar ajudar a mulher sozinho, você se vê confrontado pelos quatro homens que a cercavam. Apesar de sua coragem, a superioridade numérica e talvez até mesmo a habilidade dos agressores se provam avassaladoras. Em meio à luta desigual, você é sobrepujado e sucumbe, deixando para trás um destino trágico e uma missão inacabada.");
            }
            else{
                System.out.println("Você escreveu algo errado tente novamente");
                return;
            }
        }
        else if (decisao1.equals("Ir para a guilda")|| decisao1.equals("ir para a guilda")) {
            System.out.println("\n\nApós decidir seguir para a guilda, você adentra um lugar animado, repleto de pessoas bebendo, conversando e rindo. De repente, uma mulher se aproxima: é a atendente da guilda, convidando-o a fazer seu cadastro. Ela explica que, no momento, apenas missões de nível baixo estão disponíveis. As opções são simples: a primeira, lidar com um acampamento goblin que ameaça a paz da floresta, e a segunda, erradicar uma infestação de ratos que assola os esgotos da cidade. Diante dessas escolhas, qual quest você decide pegar?(Digite Quest goblin ou Quest ratos)");
            String decisao3 = escaner.nextLine();
            if (decisao3.equals("Quest goblin") || decisao3.equals("quest goblin")){
                System.out.println("");
            }

        }
        else{
            System.out.println("Talvez você tenha digitado errado tente denovo");
            return;
        }
    }
}
