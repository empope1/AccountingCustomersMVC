package main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import main.beans.Customers;
import main.repository.CustomersRepository;

/**
 * @author emilylester empope1
 * CIS 175 Spring 2024
 * Apr 10, 2024
 */

@Controller
public class WebController {
	@Autowired
	CustomersRepository repo;
	
	@GetMapping("/viewAll")
	public String viewAllCustomers(Model model) {
		if(repo.findAll().isEmpty()) {
			return addNewCustomers(model);
		}
		
		model.addAttribute("customers", repo.findAll());
		return "results";
	}

	@GetMapping("/inputCustomers")
	public String addNewCustomers(Model model) {
		Customers c = new Customers();
		model.addAttribute("newCustomers", c);
		return "input";
	}
	
	@PostMapping("/inputCustomers")
	public String addNewCustomers(@ModelAttribute Customers c, Model model) {
		return null;
	}

	@GetMapping("/edit/{id}")
	public String showUpdateCustomers(@PathVariable("id") long id, Model model) {
		Customers c = repo.findById(id).orElse(null);
		System.out.println("ITEM TO EDIT: " + c.toString());
		model.addAttribute("newCustomers", c);
		return "input";
	}

	@PostMapping("/update/{id}")
	public String reviseCustomers(Customers c, Model model) {
		repo.save(c);
		return viewAllCustomers(model);
	}
	
	@GetMapping("/delete/{id}")
	public String deleteCustomers(@PathVariable("id") long id, Model model) {
		Customers c = repo.findById(id).orElse(null);
	    repo.delete(c);
	    return viewAllCustomers(model);
	}
}

