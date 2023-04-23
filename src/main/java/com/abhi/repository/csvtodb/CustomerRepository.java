//CSV file into a database
package com.abhi.repository.csvtodb;
import com.abhi.entity.csvtodb.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository  extends JpaRepository<Customer,Integer> {
}