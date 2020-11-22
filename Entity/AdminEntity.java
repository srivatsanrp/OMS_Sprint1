package com.cg.oms.entity;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Admin")
public class AdminEntity {

	@Id
	@Column(name = "admin_Id",length=5)
	@GeneratedValue(strategy = GenerationType.AUTO)
		private int adminId;

	@Column(name = "admin_Name",length=10)
		private String adminName;

	@Column(name = "admin_User",length=10)
		private String adminUserName;

	@Column(name = "admin_Pwd",length=10)
		private String adminPassword;
		
		public AdminEntity() {
			super();
		}
		
		public AdminEntity(String adminName, String adminUserName, String adminPassword) {
			super();
			this.adminName = adminName;
			this.adminUserName =adminUserName;
			this.adminPassword = adminPassword;
		}

		public int getadminId() {
			return adminId;
		}

		public void setadminId(int adminId) {
			this.adminId = adminId;
		}

		public String getadminName() {
			return adminName;
		}

		public void setadminName(String adminName) {
			this.adminName = adminName;
		}

		public String getaUserName() {
			return adminUserName;
		}

		public void setaUserName(String adminUserName) {
			this.adminUserName =adminUserName;
		}

		public String getadminPassword() {
			return adminPassword;
		}

		public void setadminPassword(String adminPassword) {
			this.adminPassword = adminPassword;
		}

		@Override
		public String toString() {
			return "adminentity [adminId=" + adminId + ", adminName=" + adminName + ",adminUserName=" +adminUserName + ", adminPassword="
					+ adminPassword + "]";
		}
		
		
		
		
	
}
