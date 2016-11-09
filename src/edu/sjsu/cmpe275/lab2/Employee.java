package edu.sjsu.cmpe275.lab2;

import javax.persistence.*;
@Entity
@Table(name = "user")
public class Employee {
          @Id
          
          @Column(name = "firstname")
          private String firstname;

		public String getFirstname() {
			return firstname;
		}

		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
          
       
}