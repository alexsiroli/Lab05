package it.unibo.oop.lab05.ex3;

import java.util.HashSet;
import java.util.Set;

public class WarehouseImpl implements Warehouse {

	private final Set<Product> set = new HashSet<>();
	
	@Override
	public void addProduct(Product p) {
		this.set.add(p);

	}

	@Override
	public Set<String> allNames() {
		Set<String> an = new HashSet<>();
		for (Product elem : this.set) {
			an.add(elem.getName());
		}
		return an;
	}

	@Override
	public Set<Product> allProducts() {
		return new HashSet<>(this.set);
	}

	@Override
	public boolean containsProduct(Product p) {
		return this.set.contains(p);
	}

	@Override
	public double getQuantity(String name) {
		for (Product elem : this.set) {
			if (elem.getName().equals(name)) {
				return elem.getQuantity();
			}
		}
		return 0;
	}

}
