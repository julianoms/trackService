package com.trackService.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.cassandra.config.AbstractReactiveCassandraConfiguration;
import org.springframework.data.cassandra.config.SchemaAction;
import org.springframework.data.cassandra.config.SessionBuilderConfigurer;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;
//
//@Configuration
//@EnableCassandraRepositories(basePackages = { "org.spring.cassandra.example.repo" })
//@Slf4j
//public class CassandraConfig extends AbstractReactiveCassandraConfiguration {
//
//    @Autowired
//    private Environment env;
//
//    @Value("${cassandra.contactpoints}")
//    private String contactPoints;
//
//    @Value("${cassandra.port}")
//    private int port;
//
//    @Value("${cassandra.keyspace}")
//    private String keyspace;
//
//    @Value("${cassandra.basepackages}")
//    private String basePackages;
//
//    @Override
//    protected String getKeyspaceName() {
//        return keyspace;
//    }
//
//    @Override
//    protected SessionBuilderConfigurer getSessionBuilderConfigurer() {
//        SessionBuilderConfigurer sessionBuilderConfigurer = super.getSessionBuilderConfigurer();
//        return sessionBuilderConfigurer;
//    }
//
//    @Override
//    protected String getContactPoints() {
//        return contactPoints;
//    }
//
//    @Override
//    protected int getPort() {
//        return port;
//    }
//
//    @Override
//    public SchemaAction getSchemaAction() {
//        return SchemaAction.CREATE_IF_NOT_EXISTS;
//    }
//
//    @Override
//    public String[] getEntityBasePackages() {
//        return new String[]{basePackages};
//    }
//}