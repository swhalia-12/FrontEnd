package FrontEnd.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import FrontEnd.Repository.UserRepository;
import FrontEnd.models.User;

/**
 * The Class UserService.
 */
@Service
public class UserService {
	
	/** The repo. */
	@Autowired
	private UserRepository repo;
	
	/**
	 * Authenticate.
	 *
	 * @param username the username
	 * @param password the password
	 * @return true, if successful
	 */
	public boolean authenticate(String username,String password) {
		 User user = repo.getByusername(username);
		 if(user != null && user.getPassword().equals(password)) {
			 return true;
		 }
		 return false;

	}
}
