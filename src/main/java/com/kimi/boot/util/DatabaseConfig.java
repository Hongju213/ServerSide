package com.kimi.boot.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

@Configuration
//@EnableTransactionManagement
public class DatabaseConfig {
	
	@Bean
	DataSource dataSource(Environment env) throws SQLException, FileNotFoundException, IOException {
		
		StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
		encryptor.setPassword("kimi");
		
		String decEnvUsername = encryptor.decrypt(env.getProperty("spring.datasource.username"));
		String decEnvPwd = encryptor.decrypt(env.getProperty("spring.datasource.password"));
		String envDriverClassName = env.getProperty("spring.datasource.driverClassName");
		String envUrl = env.getProperty("spring.datasource.url");
		
		BasicDataSource ret = new BasicDataSource();
		ret.setDriverClassName(envDriverClassName);
		ret.setUsername(decEnvUsername);
		ret.setPassword(decEnvPwd);
		ret.setUrl(envUrl);
		return ret;
	}
	
	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource);
		
		org.springframework.core.io.Resource[] arrResource = new PathMatchingResourcePatternResolver()
				.getResources("classpath:/mapper/*-mapping.xml");
		sqlSessionFactoryBean.setMapperLocations(arrResource);
		
		return sqlSessionFactoryBean.getObject();
	}
	
	@Bean
	public DataSourceTransactionManager transactionManager(DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}
}