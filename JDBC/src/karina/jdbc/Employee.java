package karina.jdbc;

import java.time.LocalDate;

// empno | ename  | job       | mgr  | hiredate   | sal  | comm | deptno |

public class Employee {
	private int			empno;
	private String		ename;
	private String		job;
	private int			mgr;
	private LocalDate	hiredate;
	private int			sal;
	private boolean		recievingCommition;
	private int			comm;
	private int			deptno;
	
	public Employee(int empno, String ename, String job, int mgr, LocalDate hiredate, int sal, int comm, int deptno) {
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.sal = sal;
		this.comm = comm;
		this.deptno = deptno;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [empno=");
		builder.append(empno);
		builder.append(", ename=");
		builder.append(ename);
		builder.append(", job=");
		builder.append(job);
		builder.append(", mgr=");
		builder.append(mgr);
		builder.append(", hiredate=");
		builder.append(hiredate);
		builder.append(", sal=");
		builder.append(sal);
		builder.append(", recievingCommition=");
		builder.append(recievingCommition);
		builder.append(", comm=");
		builder.append(comm);
		builder.append(", deptno=");
		builder.append(deptno);
		builder.append("]");
		return builder.toString();
	}

	public int getEmpno() {
		return empno;
	}
	
	public String getEname() {
		return ename;
	}
	
	public String getJob() {
		return job;
	}
	
	public int getMgr() {
		return mgr;
	}
	
	public LocalDate getHiredate() {
		return hiredate;
	}
	
	public int getSal() {
		return sal;
	}
	
	public boolean isRecievingCommition() {
		return recievingCommition;
	}
	
	public int getComm() {
		return comm;
	}
	
	public int getDeptno() {
		return deptno;
	}
	
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public void setJob(String job) {
		this.job = job;
	}
	
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	
	public void setHiredate(LocalDate hiredate) {
		this.hiredate = hiredate;
	}
	
	public void setSal(int sal) {
		this.sal = sal;
	}
	
	private void setRecievingCommition(boolean recievingCommition) {
		this.recievingCommition = recievingCommition;
	}
	
	public void setComm(int comm) {
		this.setRecievingCommition((comm >= 0) ? true : false);
		this.comm = comm;
	}
	
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
	
}
