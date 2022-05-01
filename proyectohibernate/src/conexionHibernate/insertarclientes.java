package conexionHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class insertarclientes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory mifactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Clientes.class).buildSessionFactory();
		Session miSession=mifactory.openSession();
		
		try {
			
			Clientes cliente1=new Clientes("Antonio", "Pestana", "Las Palmas");
			miSession.beginTransaction();
			miSession.save(cliente1);
			miSession.getTransaction().commit();
			System.out.println("Registro Insertado..  ");
			miSession.close();
			
			miSession.beginTransaction();
			System.out.println("Lectura de datos ID" + cliente1.getId());
			Clientes clientea =miSession.get(Clientes.class, cliente1.getId());
			System.out.println("Registro: "+clientea);
			miSession.close();
			
		}finally{
			System.out.println("Finalizacion de proceso ");
			mifactory.close();
		}
		
	}

}
