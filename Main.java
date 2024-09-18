
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorNuvem objGerenciador = new GerenciadorNuvem("", 0, "vazio");
        Scanner sc = new Scanner(System.in);


        int menu = 0;

        while (menu != 5) {

            if (objGerenciador.espacoSuficiente()) {
                System.out.println("-------------Menu-------------");
                System.out.println("1) Fazer upload de documento");
                System.out.println("2) Fazer upload de imagem");
                System.out.println("3) Fazer upload de vídeo");
                System.out.println("4) Exibir espaço total disponível");
                System.out.println("5) Sair");


                menu = sc.nextInt();
                sc.nextLine();

                switch (menu) {
                    case 1:
                        System.out.println("Nome do arquivo:");
                        String nomeDoc = sc.nextLine();
                        System.out.println("Tamanho do arquivo:");
                        double tamanhoDoc = sc.nextDouble();
                        sc.nextLine();

                        objGerenciador.setTipo("Documento");
                        objGerenciador.setNome(nomeDoc);
                        objGerenciador.setTamanho(tamanhoDoc);

                        objGerenciador.uploadArquivo(objGerenciador.getNome(), objGerenciador.getTamanho());
                        break;
                    case 2:
                        System.out.println("Nome do arquivo:");
                        String nomeImagem = sc.nextLine();
                        System.out.println("Tamanho do arquivo:");
                        double tamanhoImagem = sc.nextDouble();
                        System.out.println("Resolucao da imagem: ");
                        String resImagem = sc.nextLine();
                        sc.nextLine();

                        objGerenciador.setTipo("Imagem");
                        objGerenciador.setNome(nomeImagem);
                        objGerenciador.setTamanho(tamanhoImagem);
                        objGerenciador.setResolucao(resImagem);
                        objGerenciador.uploadArquivo(objGerenciador.getNome(),
                                objGerenciador.getTamanho(), objGerenciador.getResolucao());

                        break;
                    case 3:
                        System.out.println("Nome do arquivo:");
                        String nomeVideo = sc.nextLine();

                        System.out.println("Tamanho do arquivo:");
                        double tamanhoVideo = sc.nextDouble();

                        System.out.println("Duracao do video:");
                        double duracaoVideo = sc.nextDouble();

                        objGerenciador.setTipo("Video");
                        objGerenciador.setNome(nomeVideo);
                        objGerenciador.setTamanho(tamanhoVideo);
                        objGerenciador.setDuracao(duracaoVideo);

                        objGerenciador.uploadArquivo(objGerenciador.getNome(), objGerenciador.getTamanho(),
                                objGerenciador.getDuracao());
                        break;
                    case 4:
                        objGerenciador.mostrarespaco();
                        break;
                    case 5:
                        System.out.println("Fim do Programa.");
                        System.out.println("O espaco restante é " + GerenciadorNuvem.getEspacoTotalDisponivel() + " MB");
                        break;
                    default:
                        System.out.println("Opcao invalida, tente novamente.");
                }
            } else {
                System.out.println("Armazenamento lotado!");
                break;
            }
        }
    }
}