package com.bank.sprint1.servicetest;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.bank.sprint1.entity.Customer;
import com.bank.sprint1.repository.CustomerRepository;
import com.bank.sprint1.service.CustomerService;

@SpringBootTest
public class CustomerServiceTest {

	@Autowired
	private CustomerService custservice;

	@MockBean
	private CustomerRepository custsrepo;

	// testing savePassenger() of passenger service
	@Test
	public void testSavePassenger() {
		Customer c = new Customer();
		c.setCustomerId(1);
		c.setFirstName("Ram");
		c.setLastName("Shah");
		c.setCustomerAddharNo(657478238);
		c.setCustomerAccountNo(768593474);
		c.setCustomerAddress("Mumbai");
		c.setCustomerPhone(839012457);
		Mockito.when(custsrepo.save(c)).thenReturn(c);
		assertThat(custservice.saveCustomer(c)).isEqualTo(c);
	}


 //testing getAllpassenger() of passenger service
	@Test
	public void testgetAllPassenger() {
		Customer c = new Customer();
		c.setCustomerId(1);
		c.setFirstName("Ram");
		c.setLastName("Shah");
		c.setCustomerAddharNo(657478238);
		c.setCustomerAccountNo(768593474);
		c.setCustomerAddress("Mumbai");
		c.setCustomerPhone(839012457);

		Customer c1 = new Customer();
		c1.setCustomerId(2);
		c1.setFirstName("Mayuri");
		c1.setLastName("Deshmukh");
		c1.setCustomerAddharNo(657657238);
		c1.setCustomerAccountNo(728373474);
		c1.setCustomerAddress("Delhi");
		c1.setCustomerPhone(783546789);

		Customer c2 = new Customer();
		c2.setCustomerId(3);
		c2.setFirstName("Kumar");
		c2.setLastName("Pandit");
		c2.setCustomerAddharNo(658392738);
		c2.setCustomerAccountNo(657383937);
		c2.setCustomerAddress("Kohlapur");
		c2.setCustomerPhone(904567349);

		List<Customer> al = new ArrayList<Customer>();
		al.add(c);
		al.add(c1);
		al.add(c2);
		Mockito.when(custsrepo.findAll()).thenReturn(al);
		assertThat(custservice.getAllCustomers()).isEqualTo(al);
	}

// testing getByIdPassenger() of passenger service
	@Test
	public void testgetPassengerById() {
		Customer c1 = new Customer();
		c1.setCustomerId(1);
		c1.setFirstName("Ram");
		c1.setLastName("Shah");
		c1.setCustomerAddharNo(657478238);
		c1.setCustomerAccountNo(768593474);
		c1.setCustomerAddress("Mumbai");
		c1.setCustomerPhone(839012457);

		Optional<Customer> a = Optional.of(c1);
		Customer ua = a.get();

		Mockito.when(custsrepo.findById((long) 1)).thenReturn(a);
		assertThat(custservice.getCustomerById(1)).isEqualTo(ua);

	}

// testing updateByIdPassenger() of passenger service
	@Test
	public void testUpdatePassengerById() {
		Customer c1 = new Customer();
		c1.setCustomerId(1);
		c1.setFirstName("Ram");
		c1.setLastName("Shah");
		c1.setCustomerAddharNo(657478238);
		c1.setCustomerAccountNo(768593474);
		c1.setCustomerAddress("Mumbai");
		c1.setCustomerPhone(839012457);

		Optional<Customer> a = Optional.of(c1);
		Customer ua = a.get();

		Mockito.when(custsrepo.findById((long) 1)).thenReturn(a);

		// updated phone
		ua.setCustomerPhone(657846579);
		Mockito.when(custsrepo.save(ua)).thenReturn(ua);
		assertThat(custservice.updateCustomerById(ua, 1)).isEqualTo(ua);
	}

// testing deleteByIdPassenger() of passenger service
	@Test
	public void testdeletePassengerById() {
		Customer c1 = new Customer();
		c1.setCustomerId(1);
		c1.setFirstName("Ram");
		c1.setLastName("Shah");
		c1.setCustomerAddharNo(657478238);
		c1.setCustomerAccountNo(768593474);
		c1.setCustomerAddress("Mumbai");
		c1.setCustomerPhone(839012457);

		Optional<Customer> a = Optional.of(c1);

		Mockito.when(custsrepo.existsById((long) 1)).thenReturn(false);
		assertThat(custsrepo.existsById(a.get().getCustomerId()));

	}

}
