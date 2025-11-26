import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    static {
        try {
            Class.forName("org.sqlite.JDBC");
            System.out.println("Driver SQLite carregado!");
        } catch (ClassNotFoundException e) {
            System.err.println("ERRO: Driver SQLite não encontrado!");
            System.err.println("Configure as dependências no IntelliJ");
        }
    }

    public static Connection conectar() {
        try {
            // Criar pasta database se não existir
            java.io.File dbDir = new java.io.File("database");
            if (!dbDir.exists()) {
                dbDir.mkdirs();
                System.out.println("Pasta 'database' criada");
            }

            String url = "jdbc:sqlite:database/banco.db";
            Connection conn = DriverManager.getConnection(url);

            if (conn != null) {
                System.out.println("Conectado ao SQLite!");
                return conn;
            }
        } catch (SQLException e) {
            System.err.println("Erro de conexão: " + e.getMessage());
        }
        return null;
    }
}