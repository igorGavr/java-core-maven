package les_1.jdbc;

import java.sql.*;

public class Main {

    public static void main(String[] args) throws SQLException {


//        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "rootroot");
//
//        final PreparedStatement preparedStatement = connection.prepareStatement("select * from actor");
//        final ResultSet resultSet = preparedStatement.executeQuery();
//
//        while (resultSet.next()){
//            System.out.println(resultSet.getInt(1)+ " " +resultSet.getString("first_name"));
//        }
//        connection.close();


        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "rootroot");

        final PreparedStatement preparedStatement = connection.prepareStatement("select * from film");
        final ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()){
            System.out.println(resultSet.getInt(1)+ " " +resultSet.getString("title")+ " " + resultSet.getString("description"));
        }
        connection.close();
    }

}
