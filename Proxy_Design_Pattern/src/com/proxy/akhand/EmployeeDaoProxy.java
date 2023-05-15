package com.proxy.akhand;

public class EmployeeDaoProxy implements EmployeeDao{

    EmployeeDao employeeDaoObj;
    public EmployeeDaoProxy(){
        this.employeeDaoObj = new EmployeeDaoImple();
    }
    @Override
    public void create(String client, EmployeeDo obj) throws Exception{
        if(client.equals("Admin")){
            employeeDaoObj.create(client,obj);
            return;
        }
        throw new Exception("Access denied");
    }
    @Override
    public void delete(String client, int employeeId) throws Exception{
        if(client.equals("Admin")){
            employeeDaoObj.delete(client,employeeId);
        }
        throw new Exception("Access denied");
    }

    @Override
    public EmployeeDo get(String client, int employeeId) throws Exception{
        if(client=="Admin" || client=="User"){
            employeeDaoObj.get(client,employeeId);
        }
        throw new Exception("Access denied");
    }
}
