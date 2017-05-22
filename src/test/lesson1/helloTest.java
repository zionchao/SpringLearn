package test.lesson1;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lesson1.Helloworld;

@RunWith(BlockJUnit4ClassRunner.class)
public class helloTest {

	@Test
	public void testHelloworld() {
		ApplicationContext context=new ClassPathXmlApplicationContext("/resource/helloworld.xml");
		Helloworld helloworld=(Helloworld) context.getBean("helloworld");
		helloworld.say();
	}

	
}
