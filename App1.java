import java.sql.*;
public class App1 {
    public static void main(String[] args)  {
        System.out.println("Bem vindo a Padoka do ZeZin");
        exibirCardapio();

    }
    conectar();
    }
    public static Connection conectar(){
    String status = "Nada acontece ainda...";
    String mysqlHost = "127.0.0.1";
    String mysqlUser = "root";
    String mysqlDB = "mysql_connector";
    String mysqlPassword = "123456";
    String mysqlUrl = "jdbc:mysql://" + mysqlHost + "/" + mysqlDB + "?user=" + mysqlUser + "&password=" + mysqlPassword;

        Connection conn = null;

}
