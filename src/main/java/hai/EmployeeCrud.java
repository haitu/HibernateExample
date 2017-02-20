package hai;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class EmployeeCrud {
	public void add(Session ses)
	{
		Employee epl = new Employee();
		epl.setFirstName("phuong");
		epl.setLastName("tran");
		epl.setSalary(100);
		ses.save(epl);
		
	}
	public void readAll(Session session)
	{
		
		String hql1 = "FROM Employee as e";
		Query query1 = session.createQuery(hql1);
		List<Employee> results1 =query1.list();
		for(Employee e : results1)
		{
			System.out.println("First name " + e.getFirstName() + " ,Last name " + e.getLastName());
			
		}
	}
	public void addMultipleEmployee(Session session)
	{
		int start = 100;
		for(int i = 0;i < 1000;i ++)
		{
			int num = start + i;
			Employee epl = new Employee();
			epl.setFirstName("phuong " + num);
			epl.setLastName("tran " + num);
			epl.setSalary(100 + num);
			session.save(epl);
			
		}
		
	}
}
