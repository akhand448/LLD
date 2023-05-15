import com.proxy.akhand.EmployeeDaoProxy;
import com.proxy.akhand.EmployeeDo;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

       String[] clients={"User","Admin","Outsider"};
       for(int i=0;i<10;i++){
           int randomNo = ThreadLocalRandom.current().nextInt(0,2);
           String user = clients[randomNo];
           if(i%2==0){
               try{
                   EmployeeDaoProxy employeeDaoProxy = new EmployeeDaoProxy();
                   employeeDaoProxy.create(user,new EmployeeDo());
                   System.out.println("operation is successful");
               }
               catch (Exception e){
                   System.out.println(e.getMessage());
               }
           }
           else if(i%3==0){
               try{
                   EmployeeDaoProxy employeeDaoProxy = new EmployeeDaoProxy();
                   employeeDaoProxy.get(user,i);
                   System.out.println("operation is successful");
               }
               catch (Exception e){
                   System.out.println(e.getMessage());
               }
           }
           else{
               try{
                   EmployeeDaoProxy employeeDaoProxy = new EmployeeDaoProxy();
                   employeeDaoProxy.delete(user,i);
                   System.out.println("operation is successful");
               }
               catch (Exception e){
                   System.out.println(e.getMessage());
               }
           }
       }



    }
}