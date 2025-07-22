package com.spring.coreboot2.controller;

import com.spring.coreboot2.repos.DatabaseService;
import com.spring.coreboot2.repos.OracleImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MainController {

    // this is interface, so we need its implementation class
    private DatabaseService databaseService;

    public MainController(DatabaseService databaseService) {   // myDatabaseService
        this.databaseService = databaseService;
    }

    public void useTable() {
        List<String> tables =  this.databaseService.getTables();
        System.out.println(tables);
    }
}
