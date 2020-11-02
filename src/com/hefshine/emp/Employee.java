package com.hefshine.emp;

public class Employee {

		private int id;
		private String name;
		
		private Address address;
		
		public Employee()
		{
			
		}
		
		public Employee(int id, String name, Address address) {
			super();
			this.id = id;
			this.name = name;
			this.address = address;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", getId()=" + getId()
					+ ", getName()=" + getName() + ", getAddress()=" + getAddress() + ", getClass()=" + getClass()
					+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}
		
		public void work()
		{
			System.out.println(name+" "+id);
			System.out.println(address.getCity()+" "+address.getCountry()+" "+address.getState());
			//System.out.println(address.display());
		}



}
