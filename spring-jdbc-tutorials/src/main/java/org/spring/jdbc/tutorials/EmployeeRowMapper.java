package org.spring.jdbc.tutorials;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.spring.jdbc.tutorials.model.Employee;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeRowMapper implements RowMapper<Employee>	{
		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
			Employee employee = new Employee();
			employee.setId(rs.getInt("ID"));
			employee.setName(rs.getString("NAME"));
			employee.setAge(rs.getInt("AGE"));
			return employee;
		}
}
