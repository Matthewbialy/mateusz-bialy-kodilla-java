package com.kodilla.hibernate.facade;


import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.facade.SearchFacade;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchFacadeTestSuit {

    @Autowired
    private SearchFacade searchFacade;
    @Autowired
    private CompanyDao companyDao;

    private ArrayList<Company> companies = new ArrayList<>();
    private ArrayList<Employee> employees = new ArrayList<>();

    @Test
    public void companyTest() {
        //Given
        Employee matthewWhite = new Employee("Matthew", "White");
        Employee alexWhite = new Employee("Alex", "White");

        Company intive = new Company("Intive");
        Company softwareIt = new Company("SoftwareIt");

        intive.getEmployees().add(matthewWhite);
        intive.getEmployees().add(alexWhite);
        softwareIt.getEmployees().add(matthewWhite);
        softwareIt.getEmployees().add(alexWhite);

        matthewWhite.getCompanies().add(intive);
        alexWhite.getCompanies().add(softwareIt);
        matthewWhite.getCompanies().add(softwareIt);
        alexWhite.getCompanies().add(intive);

        companyDao.save(softwareIt);
        companyDao.save(intive);

        companies.add(softwareIt);
        companies.add(intive);

        employees.add(matthewWhite);
        employees.add(alexWhite);

        //When
        List<Company> result = searchFacade.retrieveCompanyLike("int");
        //Then
        Assert.assertEquals(companies.size(), result.size());

        //CleanUp
        try {
            companyDao.delete(intive);
            companyDao.delete(softwareIt);
        } catch (Exception e) {

        }
    }

    @Test
    public void employeeTest() {
        //Given
        Employee matthewWhite = new Employee("Matthew", "White");
        Employee alexWhite = new Employee("Alex", "White");

        Company intive = new Company("Intive");
        Company softwareIt = new Company("SoftwareIt");

        intive.getEmployees().add(matthewWhite);
        intive.getEmployees().add(alexWhite);
        softwareIt.getEmployees().add(matthewWhite);
        softwareIt.getEmployees().add(alexWhite);

        matthewWhite.getCompanies().add(intive);
        alexWhite.getCompanies().add(softwareIt);
        matthewWhite.getCompanies().add(softwareIt);
        alexWhite.getCompanies().add(intive);

        companyDao.save(softwareIt);
        companyDao.save(intive);

        companies.add(softwareIt);
        companies.add(intive);

        employees.add(matthewWhite);
        employees.add(alexWhite);

        //When
        List<Employee> result = searchFacade.findSurname("ale");
        //Then
        Assert.assertEquals(employees.size(), result.size());

        //CleanUp
        try {
            companyDao.delete(intive);
            companyDao.delete(softwareIt);
        } catch (Exception e) {
        }


    }
}

