package test.lesson1;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lesson1.Helloworld;
import com.lesson1.IOutputGenerator;

@RunWith(BlockJUnit4ClassRunner.class)
public class helloTest {

	@Test
	public void testHelloworld() {
		ApplicationContext context=new ClassPathXmlApplicationContext("/resource/helloworld.xml");
		Helloworld helloworld=(Helloworld) context.getBean("helloworld");
		helloworld.say();
	}
	
	@Test
	public void testOutput() {
		ApplicationContext context=new ClassPathXmlApplicationContext("/resource/helloworld.xml");
		IOutputGenerator output=(IOutputGenerator) context.getBean("OutputHelper");
		output.generateOutput();
	}

	
}
