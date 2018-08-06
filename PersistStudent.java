package javatpoint.jpa.persist;


	import javatpoint.jpa.student.*;  
	import javax.persistence.*;  
	public class PersistStudent {  
	      
	    public static void main(String args[])  
	    {  
	    	
	    	
	          
	        EntityManagerFactory emf=Persistence.createEntityManagerFactory("Student_Entity");  
	        EntityManager em=emf.createEntityManager();  
	          
	em.getTransaction().begin();  
	          
	        StudentEntity s1=new StudentEntity();  
	        s1.setS_id(1);  
	        s1.setS_name("Anil");  
	        s1.setS_age(22);  
	          
	        StudentEntity s2=new StudentEntity();  
	        s2.setS_id(2);  
	        s2.setS_name("Ronit");  
	        s2.setS_age(25);  
	          
	        StudentEntity s3=new StudentEntity();  
	        s3.setS_id(3);  
	        s3.setS_name("jk");  
	        s3.setS_age(27);  
	          
	        em.persist(s1);  
	        em.persist(s2);  
	        em.persist(s3);   
	        System.out.println("data="+s1+s2+s3);
	  
	em.getTransaction().commit();  
	          
	        emf.close();  
	        em.close();  
	          
	    }  
}
