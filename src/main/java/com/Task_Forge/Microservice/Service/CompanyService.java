package com.Task_Forge.Microservice.Service;

import com.Task_Forge.Microservice.Model.Company;
import com.Task_Forge.Microservice.Repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public Company createCompany(Company company){
//        company.setCreatedAt(LocalDateTime.now());
        return companyRepository.save(company);
    }

    public Company getCompanyById(UUID id){
        return companyRepository.findById(id).orElse(null);
    }

    public Company updateCpmpany(Company company){
        return companyRepository.save(company);
    }

    public void deleteCompany(UUID id){
        companyRepository.deleteById(id);
    }
}
