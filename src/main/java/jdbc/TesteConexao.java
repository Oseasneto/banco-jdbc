package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {

    public static void main(String[] args) throws SQLException {

        //fazendo a conexão com o banco de dados
        final String url = "jdbc:mysql://localhost:3306?useTimezone=true&serverTimezone=UTC";

        final String usuario = "root";

        final String senha = "tijolopreto";


        Connection conexao = DriverManager
                .getConnection(url, usuario, senha);

        System.out.println("conexão efetuada com sucesso!");
        conexao.close();

    }
}
