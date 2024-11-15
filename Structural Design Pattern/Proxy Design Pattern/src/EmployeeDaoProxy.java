public class EmployeeDaoProxy implements EmployeeDao{
    private EmployeeDao employeeDao;
    public EmployeeDaoProxy(){
        employeeDao = new EmployeeDaoImpl();
    }

    @Override
    public void deleteRequest(String accountType) throws Exception {
        if(accountType.equals("Admin")){
            employeeDao.deleteRequest(accountType);
        }else throw new Exception("Wrong");
    }

    @Override
    public void createRequest(String accountType) throws Exception {
        if(accountType.equals("Admin")){
            employeeDao.createRequest(accountType);
        }
        else throw new Exception("Wrong");
    }

    @Override
    public void getRequest(String accountType) throws Exception {
        if(accountType.equals("User")){
            employeeDao.getRequest(accountType);
        }else throw new Exception("Wrong");
    }
}
