package com.linkshare.snaplink;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

// TODO: Auto-generated Javadoc
/**
 * The Class HibernateConfiguration.
 *
 * @author MukulRaizada
 */
@Configuration
@EnableTransactionManagement
@EnableAutoConfiguration(exclude=HibernateJpaAutoConfiguration.class)
public class HibernateConfiguration {

	/** The driver. */
	@Value("${spring.datasource.driver-class-name}")
	private String DRIVER;

	/** The password. */
	@Value("${spring.datasource.password}")
	private String PASSWORD;

	/** The url. */
	@Value("${spring.datasource.url}")
	private String URL;

	/** The username. */
	@Value("${spring.datasource.username}")
	private String USERNAME;

	/** The dialect. */
	@Value("${hibernate.dialect}")
	private String DIALECT;

	/** The show sql. */
	@Value("${hibernate.show_sql}")
	private boolean SHOW_SQL;

	/** The format sql. */
	@Value("${hibernate.format_sql}")
	private boolean FORMAT_SQL;

	/** The hbm2ddl auto. */
	@Value("${hibernate.hbm2ddl.auto}")
	private String HBM2DDL_AUTO;

	/** The pool size. */
	@Value("${hibernate.pool_size}")
	private int POOL_SIZE;

	/** The c3p0 min size. */
	@Value("${hibernate.c3p0.min_size}")
	private int C3P0_MIN_SIZE;

	/** The c3p0 max size. */
	@Value("${hibernate.c3p0.max_size}")
	private int C3P0_MAX_SIZE;

	/** The c3p0 timeout. */
	@Value("${hibernate.c3p0.timeout}")
	private int C3P0_TIMEOUT;

	/** The c3p0 max statements. */
	@Value("${hibernate.c3p0.max_statements}")
	private int C3P0_MAX_STATEMENTS;

	/** The c3p0 idle test period. */
	@Value("${hibernate.c3p0.idle_test_period}")
	private int C3P0_IDLE_TEST_PERIOD;

	/** The packages to scan. */
	@Value("${entitymanager.packagesToScan}")
	private String PACKAGES_TO_SCAN;
	
	
	/*
	@Autowired
	ConnectionPoolContextListener connectionPoolContextListener;
	*/
	

	/**
	 * Data source.
	 *
	 * @return the data source
	 */
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(DRIVER);
		dataSource.setUrl(URL);
		dataSource.setUsername(USERNAME);
		dataSource.setPassword(PASSWORD);
		return dataSource;

	}
	
	
	
	/*
	@Bean
	public DataSource dataSource() {
		
		DataSource ds = null;
		try {
			ds = connectionPoolContextListener.createConnectionPool();
		}catch(Exception ex) {
		ex.printStackTrace();
		}
		return ds;

	}
	*/

	/**
	 * Session factory.
	 *
	 * @return the local session factory bean
	 */
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		sessionFactory.setPackagesToScan(PACKAGES_TO_SCAN);
		sessionFactory.setHibernateProperties(hibernateProperties());
		return sessionFactory;
	}

	/**
	 * Hibernate properties.
	 *
	 * @return the properties
	 */
	private Properties hibernateProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.dialect", DIALECT);
		properties.put("hibernate.show_sql", SHOW_SQL);
		properties.put("hibernate.format_sql", FORMAT_SQL);
		properties.put("hibernate.c3p0.min_size", C3P0_MIN_SIZE);
		properties.put("hibernate.c3p0.timeout", C3P0_TIMEOUT);
		properties.put("hibernate.c3p0.max_statements", C3P0_MAX_STATEMENTS);
		properties.put("hibernate.c3p0.idle_test_period", C3P0_IDLE_TEST_PERIOD);
		return properties;

	}

	/**
	 * Transaction manager.
	 *
	 * @return the hibernate transaction manager
	 */
	@Bean
	public HibernateTransactionManager transactionManager() {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(sessionFactory().getObject());
		return transactionManager;

	}

}