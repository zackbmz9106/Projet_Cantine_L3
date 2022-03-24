package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class DBconnect {



static Connection connection = null;
static String databaseName=  " DBBCantine ";
static String url = "jdbe:mysql://localhost:3306/+BDDcantine";

static String username = "root";
static String password = "projetjaval3";

public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
Class.forName("com.mysq].jdbc.Driver").newInstance();
connection = DriverManager.getConnection(url, username, password);

// PreparedStatement ps = connection.preparestatement("INSERT INTO
// studentdatabase*studenttliname)VALUES('michael
int status = ps.executeUpdate();
if (status != 0) {
System.out.println("Database was Connection") ;
System.out.println(" Kecord WAS INSERTED");

}