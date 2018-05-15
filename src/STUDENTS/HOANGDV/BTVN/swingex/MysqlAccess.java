package STUDENTS.HOANGDV.BTVN.swingex;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
public class MysqlAccess {
    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/calculation";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "admin";

    public void fillDatabaseToTable(JTable jTable) throws Exception {
        try {
            Class.forName(JDBC_DRIVER);
            System.out.println("Connecting to database...");
            connect = DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.println("Creating statement...");
            statement = connect.createStatement();
            System.out.println("Connected");
            resultSet = statement.executeQuery("SELECT * FROM result");
            if(resultSet != null) {
                DefaultTableModel model = (DefaultTableModel) jTable.getModel();
                model.setRowCount(0);

                while (resultSet.next()) {
                    model.addRow(new Object[]{resultSet.getString(1),
                            resultSet.getString(2),
                            resultSet.getString(3),
                            resultSet.getString(4),
                            resultSet.getString(5)});
                }
            }else{
                System.out.println("resultSet is Null");
            }
        } catch (Exception e) {
            throw e;
        } finally {
            close();
        }

    }
    public void insertToDatabase(float val1, float val2,String type,float result) throws Exception {
        try {
            Class.forName(JDBC_DRIVER);
            System.out.println("Connecting to database...");
            connect = DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.println("Creating statement...");
            preparedStatement = connect
                    .prepareStatement("insert into  result values (default, ?, ?,?,?)");
            preparedStatement.setFloat(1,val1);
            preparedStatement.setFloat(2,val2);
            preparedStatement.setString(3,type);
            preparedStatement.setFloat(4,result);
            preparedStatement.execute();

        } catch (Exception e) {
            throw e;
        } finally {
            close();
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
}
