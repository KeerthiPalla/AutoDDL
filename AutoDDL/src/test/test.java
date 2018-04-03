package test;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
		Configuration cfg=new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
	System.out.println("Created Tables Successfully");
	sf.close();
}catch(Exception e){
	
	e.printStackTrace();
}
	
	
	}
}
