
import java.util.ArrayList;
import java.util.List;

public class CadastroPessoas {
    private List<String> pessoas = new ArrayList<>();

    // Método para adicionar uma pessoa
    public void adicionarPessoa(String pessoa) {
        pessoas.add(pessoa);
    }

    // Método para listar todas as pessoas
    public List<String> listarPessoas() {
        return pessoas;
    }

    // Método para alterar uma pessoa
    public void alterarPessoa(int indice, String pessoa) {
        if (indice >= 0 && indice < pessoas.size()) {
            pessoas.set(indice, pessoa);
        } else {
            System.out.println("Índice inválido");
        }
    }

    // Método para excluir uma pessoa
    public void excluirPessoa(int indice) {
        if (indice >= 0 && indice < pessoas.size()) {
            pessoas.remove(indice);
        } else {
            System.out.println("Índice inválido");
        }
    }

    public static void main(String[] args) {
        CadastroPessoas cadastro = new CadastroPessoas();

        // Exemplo de utilização
        cadastro.adicionarPessoa("João");
        cadastro.adicionarPessoa("Maria");

        List<String> todasPessoas = cadastro.listarPessoas();
        System.out.println("Pessoas cadastradas:");
        for (String pessoa : todasPessoas) {
            System.out.println("- " + pessoa);
        }

        cadastro.alterarPessoa(0, "João da Silva");

        cadastro.excluirPessoa(1);

        todasPessoas = cadastro.listarPessoas();
        System.out.println("\nPessoas após alteração e exclusão:");
        for (String pessoa : todasPessoas) {
            System.out.println("- " + pessoa);
        }
    }
}
