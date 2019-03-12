package présentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import metier.IMetier;

public class InstatiationSpring {

	public static void main(String[] args) {
		
ApplicationContext ctx= new ClassPathXmlApplicationContext("config.xml");

	
	IMetier metier=(IMetier) ctx.getBean("metier");
	
	System.out.println(metier.calcul());
	}

}
