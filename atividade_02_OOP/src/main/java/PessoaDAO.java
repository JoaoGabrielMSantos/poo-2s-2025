import java.sql.*;

public class PessoaDAO implements Operacoes {

    public PessoaDAO() {
        criarTabela();
    }

    private void criarTabela() {
        String sql = "CREATE TABLE IF NOT EXISTS pessoas (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "nome TEXT NOT NULL," +
                "idade INTEGER NOT NULL," +
                "tipo TEXT NOT NULL)";

        try (Connection conn = Database.conectar();
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabela 'pessoas' verificada/criada com sucesso!");
        } catch (SQLException e) {
            System.err.println("Erro ao criar tabela: " + e.getMessage());
        }
    }

    @Override
    public void cadastrar(Pessoa p) {
        String sql = "INSERT INTO pessoas(nome, idade, tipo) VALUES (?, ?, ?)";

        try (Connection conn = Database.conectar();
             PreparedStatement pst = conn.prepareStatement(sql)) {

            pst.setString(1, p.getNome());
            pst.setInt(2, p.getIdade());
            pst.setString(3, p.getTipo());
            pst.executeUpdate();

            System.out.println( p.getTipo() + " cadastrado com sucesso!");

        } catch (SQLException e) {
            System.err.println("Erro ao cadastrar: " + e.getMessage());
        }
    }

    @Override
    public void consultar() {
        String sql = "SELECT * FROM pessoas ORDER BY id";

        try (Connection conn = Database.conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("\n--- PESSOAS CADASTRADAS ---");
            boolean hasData = false;

            while (rs.next()) {
                hasData = true;
                System.out.printf("ID: %d | Nome: %s | Idade: %d | Tipo: %s%n",
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getInt("idade"),
                        rs.getString("tipo"));
            }

            if (!hasData) {
                System.out.println("Nenhuma pessoa cadastrada.");
            }

        } catch (SQLException e) {
            System.err.println("Erro ao consultar: " + e.getMessage());
        }
    }
}