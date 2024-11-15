public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public void createRequest(String accountType) {
        System.out.println("Account created");
    }

    @Override
    public void deleteRequest(String accountType) {
        System.out.println("Account got deleted");
    }

    @Override
    public void getRequest(String accountType) {
        System.out.println("Account get request sent");
    }
}
