package Day12.Sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Students {
    public static void main(String args[]) throws SQLException {
        final String url = "jdbc:oracle:thin:@//localhost:1521/XEPDB1";
        String name = "system";
        String password = "tiger";

        Connection connection = DriverManager.getConnection(url, name, password);
        Statement statement = connection.createStatement();
        String query1 = "insert into students (id,name,rollnumber,department,avgmarks) values (101,'Vignesh',54,'CSBS',70)";
        String query2 = "insert into students (id,name,rollnumber,department,avgmarks) values (102,'Shivan',55,'CSBS',80)";
        String query3 = "insert into students (id,name,rollnumber,department,avgmarks) values (103,'Wikki',56,'CSBS',90)";
        statement.addBatch(query1);
        statement.addBatch(query2);
        statement.addBatch(query3);

        int[] rows = statement.executeBatch();
        System.out.println("Rows affected: " + rows.length);

        ResultSet data = statement.executeQuery("select * from students");
        while (data.next()) {
            System.out.println("Id: " + data.getInt("id"));
            System.out.println("Name: " + data.getString("name"));
            System.out.println("Roll number: " + data.getInt("rollnumber"));
            System.out.println("Department: " + data.getString("department"));
            System.out.println("Average marks: " + data.getInt("avgmarks"));
        }
        statement.close();
        connection.close();
    }
}
