package stop.Service;

import stop.entity.UserEntity;
import stop.repository.Repository;

public class Service {

	private Repository repository;

	 public UserEntity createUser(UserEntity users) {
		UserEntity userEntity = repository.createUser();
		 return userEntity;
	 }
	 
//public UserEntity updateUser(UserEntity userEntity ) {//	
//	 
// }
//	public void printUser(UserEntity userEntity) {
//		repository.printUser(userEntity);
//	}
//
//	public UserEntity updateUser(long l, String string) {
//	return repository.createUser(l, string);
//	}
//
//	public void deleteUser(UserEntity userEntity) {
//		repository.deleteUser(userEntity);
//	}
//
//	public UserEntity updateUser(UserEntity existingUser, UserEntity newUser) {
//		return repository.updateUser(existingUser, newUser);
//	}
}
