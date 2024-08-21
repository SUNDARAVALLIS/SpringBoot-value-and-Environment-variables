package com.tataelxsi.valenv.configuration;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UsersDisplay {
	@Autowired
	private UsersConfig userConfig;
	
	@Autowired
	private DbConfig dbConfig;
	
	Logger logger = Logger.getLogger(UsersDisplay.class.getName());
	
	public void displayUsersProperties() {
		logger.info(""+userConfig.getId());
		logger.info(userConfig.getName());
		logger.info(userConfig.getGrade());
		
		logger.info(""+userConfig.getDatabase().isEnabled());
		logger.info(""+userConfig.getDatabase().getPort());
		logger.info(userConfig.getDatabase().getDriver());
		logger.info(userConfig.getDatabase().getUsername());
		logger.info(userConfig.getDatabase().getPassword());
	}
	
	public void displayDatabaseProperties() {
		logger.info(""+dbConfig.isEnabled());
		logger.info(""+dbConfig.getPort());
		logger.info(""+dbConfig.getDriver());
		logger.info(""+dbConfig.getUsername());
		logger.info(""+dbConfig.getPassword());
		
	}
}
