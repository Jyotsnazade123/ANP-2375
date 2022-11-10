package com.anudip.onetomany.daoimpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.anudip.onetomany.HibernateUtil;
import com.anudip.onetomany.entity.Learner;
import com.anudip.onetomany.entity.Trainer;
import com.anudip.onttomany.dao.TrainerDao;

public class TrainerDaoImpl implements TrainerDao{

	public void insert() {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction tx = session.beginTransaction();
			Trainer tr = new Trainer();
			tr.setTid(1011);
			tr.setTname("Achal");
			tr.setEmail("achalbagmare@gmail.com");
			tr.setSubject("Java");
			tr.setBatchCode("anpC2375");
			
			Learner l1 = new Learner();
			l1.setSid(1);
			l1.setSname("Ankit");
			l1.setEdu("BE");
			l1.setAddr("Mumbai");
			l1.setPhone(987654321);
			
			Learner l2 = new Learner();
			l2.setSid(2);
			l2.setSname("Anki");
			l2.setEdu("BSC");
			l2.setAddr("Chandrapur");
			l2.setPhone(887654321);
			
			Learner l3 = new Learner();
			l3.setSid(3);
			l3.setSname("Ruoa");
			l3.setEdu("BTECH");
			l3.setAddr("Goa");
			l3.setPhone(787654321);
					
			//arraylist to add all learner object
			List<Learner> a1 = new ArrayList<Learner>();
			a1.add(l1);
			a1.add(l2);
			a1.add(l3);
			
			tr.setLearner(a1);
			session.save(tr);
			tx.commit();
			System.out.println("done");
			
			
		}catch(HibernateException e) {
			System.out.println(e);
		}
		
		// TODO Auto-generated method stub
		
	}

	
		@SuppressWarnings("unchecked")
		public void read() {  
		
			
			try {
				Session session = HibernateUtil.getSessionFactory().openSession();
				TypedQuery<Trainer> query = session.createQuery("from Trainer");
				List<Trainer> all = query.getResultList();
				
				Iterator<Trainer> itr = all.iterator();
				while(itr.hasNext()) {
					Trainer tt = itr.next();
					System.out.println(tt.getTname() + " " + tt.getBatchCode());
				
				List<Learner> all1 = tt.getLearner();
				Iterator<Learner> itr1 = all1.iterator();

				}	
				
			}catch(HibernateException e) {
					System.out.println(e);
			}
				
			}
			
			



		// TODO Auto-generated method stub
		
	}


