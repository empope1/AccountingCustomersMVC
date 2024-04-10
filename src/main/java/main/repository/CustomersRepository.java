package main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import main.beans.Customers;

/**
 * @author emilylester empope1
 * CIS 175 Spring 2024
 * Apr 10, 2024
 */

@Repository
public interface CustomersRepository extends JpaRepository<Customers, Long>{

}
