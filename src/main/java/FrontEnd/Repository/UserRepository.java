package FrontEnd.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import FrontEnd.models.User;

/**
 * The Interface UserRepository.
 */
public interface UserRepository extends JpaRepository<User, Integer>{

	/**
	 * Gets the byusername.
	 *
	 * @param username the username
	 * @return the byusername
	 */
	User getByusername(String username);

}
