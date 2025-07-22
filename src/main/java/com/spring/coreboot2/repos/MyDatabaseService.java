package com.spring.coreboot2.repos;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyDatabaseService implements DatabaseService{

    @Override
    public List<String> getTables() {

        List<String> tableList = List.of("users", "auth", "product");
        return tableList;
    }

}
