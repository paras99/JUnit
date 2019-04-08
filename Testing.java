package com.cognizant.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import com.cognizant.controller.AdminController;
import com.cognizant.dao.AdminDAOImpl;
import com.cognizant.entity.Admin;

public class Testing {
	AdminController ac= null;
	ModelAndView mv=null;
	Admin admin=null;
	AdminDAOImpl ai=null;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		ac=new AdminController();
		mv=new ModelAndView();
		admin=new Admin();
		ai=new AdminDAOImpl();
		
	}

	@After
	public void tearDown() throws Exception {
		ac=null;
		mv=null;
		admin=null;
		ai=null;
		
		
	}

	@Test
	public void test() {
		try{
			
			
		String expected="adminlogin";
		String actual=ac.showLogin();
			assertEquals(expected,actual);
			System.out.println("General Testing Success");
			//fail("Not implemented yet");
		}catch(ArithmeticException e)
				{
					fail("Should never throw exception");
				}
		}
	
	
	
	
		}
	
	

	
	
	


