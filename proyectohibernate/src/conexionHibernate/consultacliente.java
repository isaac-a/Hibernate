package conexionHibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class consultacliente {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory mifactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Clientes.class).buildSessionFactory();
		Session miSession=mifactory.openSession();
		
		try {
			//Dar inicio a la sesion
			miSession.beginTransaction();
			
			//Diseñar la consulta
			

			List<Clientes> losclientes= miSession.createQuery("from Clientes").getResultList();
			
			for(Clientes uncliente: losclientes) {
				System.out.println(uncliente);
			}
			
		}finally{
			mifactory.close();
		}
		
		
	}

}
