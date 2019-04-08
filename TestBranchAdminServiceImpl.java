package com.cognizant.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springmodules.validation.util.condition.collection.IsEmptyCollectionCondition;
import org.springmodules.validation.util.condition.string.IsEmptyStringCondition;

import com.cognizant.entity.BranchAdmin;
import com.cognizant.service.BranchAdminServiceImpl;

public class TestBranchAdminServiceImpl {

	private BranchAdminServiceImpl bi;
	BranchAdmin badmin;
	
	@Before
	public void setUp() throws Exception {
		bi=new BranchAdminServiceImpl();
		
	}

	@After
	public void tearDown() throws Exception {
		bi=null;
	}

	@Test
	public void test() {
		try{
			badmin.setAddressLine1("abc");
			badmin.setAddressLine2("abc2");
			badmin.setBranchAdminAge(21);
			badmin.setBranchAdminAltContactNo("987456321");
			badmin.setBranchAdminContactNo("123456789");
			badmin.setBranchAdminDOB("16-02-1988");
			badmin.setBranchAdminEmailId("abc@gmail.com");
			badmin.setBranchAdminFirstName("rahul");
			badmin.setBranchAdminGender("M");
			badmin.setBranchAdminId("1");
			badmin.setBranchAdminLastName("bajaj");
			badmin.setBranchName("panipat");
			badmin.setCity("karnal");
			badmin.setState("haryaana");
			badmin.setZipCode("132001");
			boolean c=bi.insertBranchAdminDetails(badmin);
			boolean expected=true;
			assertEquals(expected, c);
		}
		catch(Exception e){
			System.out.print(e);
		}
	}
	
	@Test
	public void test1() {
		try{
			badmin.setAddressLine1("abc");
			badmin.setAddressLine2("abc2");
			badmin.setBranchAdminAge(21);
			badmin.setBranchAdminAltContactNo("987456321");
			badmin.setBranchAdminContactNo("123456789");
			badmin.setBranchAdminDOB("16-02-1988");
			badmin.setBranchAdminEmailId("abc@gmail.com");
			badmin.setBranchAdminFirstName("rahul");
			badmin.setBranchAdminGender("M");
			badmin.setBranchAdminId("1");
			badmin.setBranchAdminLastName("bajaj");
			badmin.setBranchName("panipat");
			badmin.setCity("karnal");
			badmin.setState("haryaana");
			badmin.setZipCode("132001");
			boolean c=bi.updateBranchAdminDetails(badmin);
			boolean expected=true;
			assertEquals(expected, c);
		}
		catch(Exception e){
			System.out.print(e);
		}
	}
	
	@Test
	public void test2() {
		try{
			
			
			List<BranchAdmin> badmin=bi.getBranchAdminDetails();
			boolean result=badmin.isEmpty();
			boolean expected=true;
			assertEquals(expected, result);
			
		}
		catch(Exception e){
			System.out.print(e);
		}
	}

	@Test
	public void test3() {
		try{
			
			badmin.setAddressLine1("abc");
			badmin.setAddressLine2("abc2");
			badmin.setBranchAdminAge(21);
			badmin.setBranchAdminAltContactNo("987456321");
			badmin.setBranchAdminContactNo("123456789");
			badmin.setBranchAdminDOB("16-02-1988");
			badmin.setBranchAdminEmailId("abc@gmail.com");
			badmin.setBranchAdminFirstName("rahul");
			badmin.setBranchAdminGender("M");
			badmin.setBranchAdminId("1");
			badmin.setBranchAdminLastName("bajaj");
			badmin.setBranchName("panipat");
			badmin.setCity("karnal");
			badmin.setState("haryaana");
			badmin.setZipCode("132001");
			int result=bi.checkBranchAdminDetails(badmin);
			int expected=0;
			assertEquals(expected, result);
			
		}
		catch(Exception e){
			System.out.print(e);
		}
	}
	
	@Test
	public void test4() {
		try{
			badmin.setAddressLine1("abc");
			badmin.setAddressLine2("abc2");
			badmin.setBranchAdminAge(21);
			badmin.setBranchAdminAltContactNo("987456321");
			badmin.setBranchAdminContactNo("123456789");
			badmin.setBranchAdminDOB("16-02-1988");
			badmin.setBranchAdminEmailId("abc@gmail.com");
			badmin.setBranchAdminFirstName("rahul");
			badmin.setBranchAdminGender("M");
			badmin.setBranchAdminId("1");
			badmin.setBranchAdminLastName("bajaj");
			badmin.setBranchName("panipat");
			badmin.setCity("karnal");
			badmin.setState("haryaana");
			badmin.setZipCode("132001");
			boolean c=bi.updateBranchAdminDetails(badmin);
			boolean expected=true;
			assertEquals(expected, c);
		}
		catch(Exception e){
			System.out.print(e);
		}
	}
	
}
