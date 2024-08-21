package com.tataelxsi.valenv.env;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class EnvDemo {
	
	@Autowired
	private Environment env;

	public String getJavaEnv() {
		return env.getProperty("java.home");
	}
	
	public String getMavenEnv() {
		return env.getProperty("m2.home");
	}
	
	public String getUser() {
		return env.getProperty("user.dir");
	}
	
	public String getMailID() {
		return env.getProperty("mail.email");
	}
}
