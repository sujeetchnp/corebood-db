package com.spring.coreboot2.repos;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OracleImplementation implements DatabaseService{
    @Override
    public List<String> getTables() {
        return List.of("authentication", "auth_users");
    }
}
