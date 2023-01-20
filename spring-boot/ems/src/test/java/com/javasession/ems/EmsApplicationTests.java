package com.javasession.ems;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.javasession.bms.BmsApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BmsApplication.class)
@ContextConfiguration
public class EmsApplicationTests {

	@Test
	public void contextLoads() {
	}

}
