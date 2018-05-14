package STUDENTS.MaiAnh.HomeWork.lession15;
import java.sql.*;

public class Access {
    private Connection connection = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_ULR = "jdbc:mysql://localhost/calculationdb";

    static final String USER = "root";
    static final String PASSWORD = "root";



    public void insertData ( double number1, double number2, String calculation, double result) throws Exception{
        try {
            Class.forName("com.mysql.jdbc.Driver");

            connection = DriverManager.getConnection(DB_ULR, USER, PASSWORD);

            preparedStatement = connection.prepareStatement("INSERT INTO results_list VALUES (DEFAULT , ?, ?, ?, ?)");


            preparedStatement.setDouble(1, number1);
            preparedStatement.setDouble(2, number2);
            preparedStatement.setString(3, calculation);
            preparedStatement.setDouble(4, result);

            preparedStatement.executeUpdate();

            preparedStatement.close();
            connection.close();


        }catch (Exception e){
            throw e;
        }
    }

}
