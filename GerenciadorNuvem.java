public class GerenciadorNuvem {

    private String nome;
    private String tipo;
    private double tamanho;
    private static double espacoTotalDisponivel = 5000;

    private double duracao;
    private String resolucao;

    public GerenciadorNuvem(String nome, double tamanho, String tipo) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.tipo = tipo;
    }

    public static void setEspacoTotalDisponivel(double espaco) {
        espacoTotalDisponivel = espaco;
    }

    public static double getEspacoTotalDisponivel() {
        return espacoTotalDisponivel;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getTamanho() {
        return this.tamanho;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public double getDuracao() {
        return this.duracao;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

    public String getResolucao() {
        return resolucao;
    }


    public void uploadArquivo(String nome, double tamanho) {
        this.tamanho = tamanho;
        if (tamanho <= espacoTotalDisponivel) {
            this.tipo = getTipo();
            this.nome = nome;
            setEspacoTotalDisponivel(espacoTotalDisponivel - tamanho);
            mostrarDetalhes();
        } else {
            System.out.println("Espaco insuficiente. Tente novamente");
        }
    }

    public void uploadArquivo(String nome, double tamanho, String resolucao) {
            this.tamanho = tamanho;
        if (tamanho <= espacoTotalDisponivel) {
            this.tipo = getTipo();
            this.nome = nome;
            this.resolucao = resolucao;
            setEspacoTotalDisponivel(espacoTotalDisponivel - tamanho);
            mostrarDetalhes();
        } else {
            System.out.println("Espaco insuficiente. Tente novamente");
        }
    }

    public void uploadArquivo(String nome, double tamanho, double duracao) {
        if (tamanho <= espacoTotalDisponivel) {
            this.tipo = getTipo();
            this.nome = nome;
            this.duracao = duracao;
            setEspacoTotalDisponivel(espacoTotalDisponivel - tamanho);
            mostrarDetalhes();
        } else {
            System.out.println("Espaco insuficiente. Tente novamente");
        }

    }

    public void mostrarDetalhes() {
        System.out.println("Nome do arquivo: " + nome + "  - Tamanho: " + tamanho + " MB"
                + "   -  Tipo: " +  tipo + "   -   Espaco Disponivel: " + espacoTotalDisponivel + " MB");
    }
    public void mostrarespaco() {
        System.out.println("Espaço restante: " + espacoTotalDisponivel + " MB.");
    }

    public boolean espacoSuficiente() {
        if (espacoTotalDisponivel > 0) {
           return true;
        } else {
            return false;
        }
    }
}