import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Gürkan on 26.3.2015.
 */
public class JDBC {
    public static void main(String[] args) throws SQLException ,ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver Loaded!");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/sakila" , "scott", "tiger");
        System.out.println("Database Connected");

        java.sql.Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT firstName,mi,lastName FROM Student WHERE lastName = 'Smith'");
        while(resultSet.next()){
            System.out.println(resultSet.getString(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getString(3));


        }

        connection.close();


    }
}
