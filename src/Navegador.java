import java.util.Stack;

public class Navegador {
    private Stack<Pagina> historico; // Pilha de páginas
    private Pagina paginaAtual;

    public Navegador() {
        historico = new Stack<>();
    }

    public void visitarPagina(String url, String titulo) {
        Pagina novaPagina = new Pagina(url, titulo);
        if (paginaAtual != null) {
            historico.push(paginaAtual); // Armazena a página atual na pilha
        }
        paginaAtual = novaPagina;
        System.out.println("Visitando: " + paginaAtual);
    }

    public void voltar() {
        if (!historico.isEmpty()) {
            paginaAtual = historico.pop(); // Retorna a página anterior
            System.out.println("Voltando para: " + paginaAtual);
        } else {
            System.out.println("Não há páginas anteriores no histórico.");
        }
    }

    public void mostrarPaginaAtual() {
        if (paginaAtual != null) {
            System.out.println("Página atual: " + paginaAtual);
        } else {
            System.out.println("Nenhuma página visitada.");
        }
    }
}

