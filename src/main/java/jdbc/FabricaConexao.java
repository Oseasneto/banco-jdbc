package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {

    public static Connection getConexao() {

        try {
            final String url = "jdbc:mysql://localhost:3306?useTimezone=true&serverTimezone=UTC";
            final String usuario = "root";
            final String senha = "tijolopreto";

            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
