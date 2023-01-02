
  package com.test.service;
  
  import org.springframework.beans.factory.annotation.Autowired; import
  org.springframework.stereotype.Service;
  
  import com.test.entity.Company; import com.test.repository.CompanyRepository;
  
  @Service 
  public class CompanyServiceImpl implements CompanyService{
  
  @Autowired
  private CompanyRepository companyRepository;

  
  
  
@Override
public Company validateUser(Company company) {
	
	
	
	return null;
}
  























  
//  @Override public Company findByUserNameAndEmail(String cEmail, String
//  Password) {
//  
//  return companyRepository.findByEmailAndPassword(cEmail,Password); }
  
  }
 