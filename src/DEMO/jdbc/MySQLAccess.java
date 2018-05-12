package DEMO.jdbc;

//STEP 1. Import required packages
import java.sql.*;

public class MySQLAccess {
    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/dbtest";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "root";

    public void readDataBase() throws Exception {
        try {
            //STEP 2: Register JDBC driver
            Class.forName(JDBC_DRIVER);

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            connect = DriverManager.getConnection(DB_URL,USER,PASS);

            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            statement = connect.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM dbtest.table1");
            writeResultSet(resultSet);


            /*Execute update*//*
            // PreparedStatements can use variables and are more efficient
            preparedStatement = connect
                    .prepareStatement("insert into  dbtest.table1 values (default, ?, ?)");
            preparedStatement.setString(1, "Test name");
            preparedStatement.setString(2, "Test address");
            preparedStatement.executeUpdate();

            System.out.println("After updated");
            resultSet = statement.executeQuery("SELECT * FROM dbtest.table1");*/

            //STEP 5: Extract data from result set
//            writeResultSet(resultSet);
//            writeMetaData(resultSet);

        } catch (Exception e) {
            throw e;
        } finally {
            close();
        }

    }

    private void writeResultSet(ResultSet resultSet) throws SQLException {
        // ResultSet is initially before the first data set
        while (resultSet.next()) {
             /*It is possible to get the columns via name
             also possible to get the columns via the column number
             which starts at 1*/
            // e.g. resultSet.getSTring(2);
            String name = resultSet.getString("name");
            String address = resultSet.getString("address");

            System.out.println("Name: " + name);
            System.out.println("Address: " + address);
        }
    }

    // You need to close the resultSet
    private void close() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }

            if (statement != null) {
                statement.close();
            }

            if (connect != null) {
                connect.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private void writeMetaData(ResultSet resultSet) throws SQLException {
        System.out.println("The columns in the table are: ");
        System.out.println("Table: " + resultSet.getMetaData().getTableName(1));
        for  (int i = 1; i<= resultSet.getMetaData().getColumnCount(); i++){
            System.out.println("Column " +i  + " "+ resultSet.getMetaData().getColumnName(i));
        }
    }
}
