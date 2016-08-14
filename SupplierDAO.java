package com.niit.shoppingcart.dao;

import java.util.List;
import java.util.function.Supplier;

import org.springframework.stereotype.Repository;

public interface SupplierDAO {
	@Repository
	public interface supplierDAO {
		
		public boolean save (Supplier supplier);
		
		public boolean update (Supplier supplier);
		
		public boolean delete (Supplier supplier);
		
		public Supplier  get(String id);
		
		public List<Supplier> list();
		
	}
		
		
		
		
		
}
