package com.tataelxsi.valenv;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tataelxsi.valenv.configuration.UsersDisplay;
import com.tataelxsi.valenv.env.EnvDemo;
import com.tataelxsi.valenv.value.ValueDemo;

@SpringBootApplication
public class ValueEnvDemoApplication {

	public static void main(String[] args) {
		 var context = SpringApplication.run(ValueEnvDemoApplication.class, args);
		 final Logger logger = Logger.getLogger(ValueEnvDemoApplication.class.getName());		 
//		 ValueDemo valueDemo = context.getBean(ValueDemo.class);
//		 logger.info(valueDemo.getName());
//		 
//		 logger.info(valueDemo.getServer());
//		 logger.info(valueDemo.getEmail());
//		 logger.info(valueDemo.getPassword());
//		 
//		 logger.info(valueDemo.getJavaHomeDirectory());
//		 logger.info(valueDemo.getMavenHomeDirectory());
//		 logger.info(valueDemo.getHomeDirectory());
//		 logger.info(valueDemo.getWorkingDirectory());
//		 
//		 EnvDemo envDemo = context.getBean(EnvDemo.class);
//		 logger.info(envDemo.getJavaEnv());
//		 logger.info(envDemo.getMavenEnv());
//		 logger.info(envDemo.getUser());
//		 logger.info(envDemo.getMailID());

		 
		 UsersDisplay usersDisplay = context.getBean(UsersDisplay.class);
		 usersDisplay.displayUsersProperties();
		 usersDisplay.displayDatabaseProperties();
		 		 
	}

}
