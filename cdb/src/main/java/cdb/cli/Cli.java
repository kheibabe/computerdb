package cdb.cli;

import java.util.List;

import cdb.controller.CompanyController;
import cdb.model.Company;
import cdb.model.Computer;
import cdb.service.ComputerService;

public class Cli {

	public static void main(String[] args) {
		ComputerService cs = ComputerService.getInstance();
		List <Computer> listcomputer = cs.getAllComputer();
		
		for (Computer computer : listcomputer) {
			System.out.println(computer);
		}
	}

}