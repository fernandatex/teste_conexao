package br.com.treinamento.conexaojava.conexaojava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException    {  //SQLExpection: 
        Connection conexao = DriverManager.getConnection(
        		
        		"jdbc:mysql://localhost:3306/ligadajustica", "root", "fernanda"); // procurar como sqlserver
        		 //PreparedStatement stmt = conexao.prepareStatement("insert into herois(nome, descricao) values (?, ?)");
        		// stmt.setString(1, "teste34");
        		//stmt.setString(2, "teste43");
        		// stmt.execute();
        		//conexao.close();
        
        Statement stmt = conexao.createStatement();
        ResultSet rs = stmt.executeQuery("select * from herois");
        
        while(rs.next()){
        	String nome = rs.getString("nome");
        	String descricao = rs.getString("descricao");
        	System.out.println(nome + " - " + descricao);
	
            }
        
        
    }
}
