package com.mycompany.invoice;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

@SpringBootApplication
public class App {
	
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(App.class, args);
		
		DataSource ds = context.getBean(DataSource.class);
		Connection conn = null;
		
		try {
			conn = ds.getConnection();
			System.out.println("success");
			ResultSet res = conn.createStatement().executeQuery("SELECT INVOICE_NUMBER, CUSTOMER_NAME FROM INVOICE");
			while(res.next()) {
				System.out.println(res.getLong("INVOICE_NUMBER") + " | " + res.getString("CUSTOMER_NAME"));
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			try {
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
