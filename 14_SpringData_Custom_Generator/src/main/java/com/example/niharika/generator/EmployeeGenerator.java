package com.example.niharika.generator;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import org.hibernate.jdbc.ReturningWork;


public class EmployeeGenerator implements IdentifierGenerator {
	private static final long serialVersionUID = 1L;

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) {
		String formattedEmployeeId = "niharika_%s"; //prefix : niharika_ && suffix:Random number from sequence
		String employeeId = null;
		
		//Obtaining connection object from Hibernate session object
		Connection con = session.doReturningWork(new ReturningWork<Connection>() {
			
			@Override
			public Connection execute(Connection conn) throws SQLException{
				return conn;
			}
			
		});
		//try with resource(Java7 version)
		try(Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select niharika_emp_seq.nextval from dual");){
			if(rs.next()) {
				employeeId = rs.getString(1);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Error generated while generating custom sequence");
		}
		System.out.println("Format::::" + String.format(formattedEmployeeId,employeeId));
		return String.format(formattedEmployeeId,employeeId);
	}
}
