package com.example.properties;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertiesApplicationTests {
	@Value("${url}")
	String url;

	@Autowired
	DatabaseConfiguration databaseConfiguration;

	@Test
	public void contextLoads() {
		Assert.assertEquals(url, "www.google.com");
	}

	@Test
	public void dataConfigurationTests() {
		Assert.assertEquals(databaseConfiguration.getUrl(), "172.16.21.5");
		Assert.assertEquals(databaseConfiguration.getUsername(), "admin");
		Assert.assertEquals(databaseConfiguration.getPassword(), "admin");
	}
}
