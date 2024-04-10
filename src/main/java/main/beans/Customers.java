package main.beans;

import org.springframework.beans.factory.annotation.Autowired;

import main.beans.Address;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author emilylester empope1
 * CIS 175 Spring 2024
 * Apr 10, 2024
 */

@Entity
@Data
@Table(name="accountingcustomers")
@NoArgsConstructor
@AllArgsConstructor
public class Customers {
	
	@Id
	@GeneratedValue
	private long id;
	private String fullName;
	private String email;
	private String age;
	@Autowired
	private Address address;

}
