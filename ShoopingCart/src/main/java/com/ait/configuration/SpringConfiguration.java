package com.ait.configuration;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableTransactionManagement
@EnableWebMvc
@ComponentScan("com.ait")
@Configuration
public class SpringConfiguration 
{
	@Bean
	public InternalResourceViewResolver m1() 
	{
		InternalResourceViewResolver i=new InternalResourceViewResolver();
		i.setPrefix("WEB-INF/JSP/");
		i.setSuffix(".jsp");
		return i;
	}
	
	@Bean
	public LocalSessionFactoryBean sessionFactory()
	{
		LocalSessionFactoryBean sessionFactory=new LocalSessionFactoryBean();
		sessionFactory.setDataSource(datasource());
		sessionFactory.setHibernateProperties(getHibernateProperties());
		sessionFactory.setPackagesToScan("com.ait.model");
		return sessionFactory;
	}
	
	public Properties getHibernateProperties()
	{
		Properties p1=new Properties();
		p1.put("hibernate.dialect","org.hibernate.dialect.MySQL8Dialect");
		p1.put("hibernate.hbm2ddl.auto","update");
		p1.put("hibernate.show_sql","true");
		return p1;
	}
	
	public DriverManagerDataSource datasource()
	{
		DriverManagerDataSource datasource=new DriverManagerDataSource();
		datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://localhost:3306/mini_project");
		datasource.setUsername("root");
		datasource.setPassword("root");
		return datasource;
	}
	
	@Bean
	public HibernateTransactionManager transactionManager(SessionFactory ob)
	{
		HibernateTransactionManager tx=new HibernateTransactionManager();
		tx.setSessionFactory(ob);
		return tx;
	}
	
	
}
