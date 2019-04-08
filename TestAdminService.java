package com.cognizant.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cognizant.entity.Admin;
import com.cognizant.service.AdminServiceImpl;

public class TestAdminService {

	private  AdminServiceImpl ai;
	private Admin admin;
	
	@Before
	public void setUp() throws Exception {
		ai=new AdminServiceImpl();
		admin=new Admin();
		
	}

	@After
	public void tearDown() throws Exception {
		ai=null;
		admin=null;
	}

	@Test
	public void test() {
		try
		{
			admin.setAdminId("1");
			admin.setAdminPassword("helo");
			int i=ai.ValidateAdmin(admin);
			int expected=3;
			assertEquals(expected, i);
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}
		@Test
		public void test1() {
			try
			{
				admin.setAdminContactNo("919013234");
				admin.setAdminEmailId("rahul@gmail.com");
				int i=ai.checkAdminCredentials(admin);
				int expected=4;
				assertEquals(expected, i);
				
			}
			catch(Exception e1)
			{
				System.out.print(e1);
			}
			
		
	}

}
