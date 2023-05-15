package com.proxy.akhand;

public class EmployeeDaoImple implements EmployeeDao{
    @Override
    public void create(String user, EmployeeDo obj) throws Exception {
        System.out.println("Employee successfully created");
    }
    @Override
    public void delete(String client, int employeeId) throws Exception{
        System.out.println("Employee successfully removed");
    }
    @Override
    public EmployeeDo get(String client, int employeeId){
        System.out.println("fetching data from DB");
        return new EmployeeDo();
    }
}
