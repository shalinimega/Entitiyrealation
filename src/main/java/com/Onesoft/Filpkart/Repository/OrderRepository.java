package com.Onesoft.Filpkart.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Onesoft.Filpkart.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{
	@Query(value="SELECT city,price FROM order_table INNER JOIN prod_table ON order_table.id = prod_table.Order_fkey",nativeQuery = true)
			public List<Object> geta();

}
