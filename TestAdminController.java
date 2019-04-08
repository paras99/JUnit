package com.cognizant.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.validation.Errors;
import org.springframework.web.servlet.ModelAndView;

import com.cognizant.controller.AdminController;
import com.cognizant.entity.Admin;

public class TestAdminController {
	
	private AdminController controller;

	@Before
	public void setUp() throws Exception {
		controller=new AdminController();
	}

	@After
	public void tearDown() throws Exception {
		controller=null;
	}

	/*@Test
public void testRegisterAdmin() {
		
		Admin admin=new Admin();
		admin.setAdminEmailId("abc@xyz.com");
	
        Errors errors=new Errors();
		ModelAndView mv=controller.registerAdmin(admin,errors);
		String viewName=mv.getViewName();
		assertEquals("registersuccess",viewName);
		
	}
*/
	
}
