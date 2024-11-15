public class Main {
    public static void main(String[] args) throws Exception {
        try{
            EmployeeDao employeeDao = new EmployeeDaoProxy();
            employeeDao.deleteRequest("User");
//            employeeDao.getRequest("Admin");
            System.out.println("Operation successful");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}