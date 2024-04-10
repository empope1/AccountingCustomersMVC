package main.beans;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author emilylester empope1
 * CIS 175 Spring 2024
 * Apr 10, 2024
 */

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
	private String street;
	private String city;
	private String state;

}
