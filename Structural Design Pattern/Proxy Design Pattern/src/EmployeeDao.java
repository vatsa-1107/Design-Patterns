public interface EmployeeDao {
    public void createRequest(String accountType) throws Exception;
    public void deleteRequest(String accountType) throws Exception;
    public void getRequest(String accountType) throws Exception;
}
