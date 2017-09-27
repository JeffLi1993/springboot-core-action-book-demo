package demo.springboot;

import demo.springboot.config.BookProperties;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConfigApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	BookProperties bookProperties;

	public void getBookProperties() {
		Assert.assertEquals(bookProperties.getName(),"《Spring Boot 2.x 核心技术实战 - 上 基础篇》");
		Assert.assertEquals(bookProperties.getWriter(),"泥瓦匠BYSocket");
	}

}
