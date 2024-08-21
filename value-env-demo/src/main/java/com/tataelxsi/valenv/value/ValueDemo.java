package com.tataelxsi.valenv.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueDemo {

	//SET DEFAULT VALUES
	@Value("ABCD")
	private String name;
	
	public String getName() {
		return name;
	}
	
	//GET VALUES FROM APPLICATION.YML
	@Value("${mail.server}")
	private String server;
	
	@Value("${mail.email}")
	private String email;
	
	@Value("${mail.password}")
	private String password;
	
	public String getServer() {
		return server;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}
	
	//GET ENVIRONMENT VARIABLES
	@Value("${java.home}")
	private String javaHomeDirectory;
	
	@Value("${m2.home}")
	private String mavenHomeDirectory;
	
	@Value("${user.home}")
	private String homeDirectory;
	
	@Value("${user.dir}")
	private String workingDirectory;
	

	public String getJavaHomeDirectory() {
		return javaHomeDirectory;
	}
	
	public String getMavenHomeDirectory() {
		return mavenHomeDirectory;
	}

	public String getHomeDirectory() {
		return homeDirectory;
	}

	public String getWorkingDirectory() {
		return workingDirectory;
	}
}
