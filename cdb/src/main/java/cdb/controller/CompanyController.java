package cdb.controller;

import java.util.List;

import cdb.model.Company;
import cdb.model.Computer;
import cdb.service.CompanyService;

public class CompanyController {
	
	private CompanyService companyService = new CompanyService();

	public List<Company> getAllCompany() {
		// TODO Auto-generated method stub
		return companyService.getAllCompany();
	}
	
	public Company getCompanyById(int id) {
		return companyService.getCompany(id);
	}
}
