package com.spring.coreboot2.repos;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;

@Primary
@Component
public class MyDatabaseService implements DatabaseService{

    @Override
    public List<String> getTables() {

        List<String> tableList = List.of("users", "auth", "product");
        return tableList;
    }

}
