package com.myjdbc.model.vo;

import java.io.Serializable;
import java.util.Objects;

public class Department implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5074704690471591907L;
	private String DeptId;
	private String DeptTitle;
	private String LocationId;
	

	

	public String getDeptId() {
		return DeptId;
	}

	public void setDeptId(String deptId) {
		DeptId = deptId;
	}

	public String getDeptTitle() {
		return DeptTitle;
	}

	public void setDeptTitle(String deptTitle) {
		DeptTitle = deptTitle;
	}

	public String getLocationId() {
		return LocationId;
	}

	public void setLocationId(String locationId) {
		LocationId = locationId;
	}

	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Department(String deptId, String deptTitle, String locationId) {
		super();
		DeptId = deptId;
		DeptTitle = deptTitle;
		LocationId = locationId;
	}

	@Override
	public String toString() {
		return "Department [DeptId=" + DeptId + ", DeptTitle=" + DeptTitle + ", LocationId=" + LocationId + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(DeptId, DeptTitle, LocationId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Objects.equals(DeptId, other.DeptId) && Objects.equals(DeptTitle, other.DeptTitle)
				&& Objects.equals(LocationId, other.LocationId);
	}
	
	
}
