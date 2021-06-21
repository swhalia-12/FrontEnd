package FrontEnd.Services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import FrontEnd.models.Employee;

/**
 * The Class EmployeeService.
 */
@Service
public class EmployeeService {

	/** The rest template. */
	@Autowired
	private RestTemplate restTemplate;

	/**
	 * Gets the users.
	 *
	 * @return the users
	 */
	// For Getting List Of Employees
	public List<Object> getUsers() {
		String url = "http://localhost:8090";
		List userList = restTemplate.getForObject(url, List.class);
		return userList;
	}

	/**
	 * Adds the employee.
	 *
	 * @param emp the emp
	 * @return the string
	 */
	// For Adding New Employee
	public String addEmployee(Employee emp) {
		String url = "http://localhost:8090";
		String Resp = "Error";
		ResponseEntity<String> responseEntityObj = restTemplate.postForEntity(url, emp, String.class);

		if (responseEntityObj.getStatusCodeValue() == 200) {
			Resp = responseEntityObj.getBody();
		}
		return Resp;
	}

	/**
	 * Update employee.
	 *
	 * @param emp the emp
	 */
	// For updating existing Employee
	public void updateEmployee(Employee emp) {
		String url = "http://localhost:8090";

		restTemplate.put(url, emp);

	}

}
