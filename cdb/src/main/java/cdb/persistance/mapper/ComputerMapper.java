package cdb.persistance.mapper;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import cdb.model.Computer;

public class ComputerMapper {
	
	private static ComputerMapper instance;

	public static ComputerMapper getInstance() {
		if(instance == null) {
			instance = new ComputerMapper();
		}
		return instance;
	}

	public Computer mapToComputer(ResultSet rs) {
		Computer computer = new Computer();
		try {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			// Le company
			computer.setId(id);
			computer.setName(name);
			System.out.println(rs.getString("introduced") == null );
			if (rs.getString("introduced")!= null) {
				computer.setIntroduced(rs.getDate("introduced").toLocalDate());
			}
			if (rs.getString("discontinued")!= null) {
				computer.setDiscontinued(rs.getDate("discontinued").toLocalDate());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(computer);
		return computer;
	}
}