package com.example.properties;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertiesApplicationTests {
	@Value("${url}")
	String url;

	@Test
	public void contextLoads() {
		Assert.assertEquals(url, "www.google.com");
	}
}
