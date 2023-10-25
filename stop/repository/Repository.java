package stop.repository;

import stop.entity.UserEntity;

public class Repository {

	public UserEntity createUser() {
		UserEntity userEntity = new UserEntity();
		userEntity.setId(2L);
		userEntity.setName("Vansh");
		return userEntity;
	}

	public void printUser(UserEntity userEntity) {
		System.out.println(" User id " + userEntity.getId() + " User Name " + userEntity.getName());

	}

	public UserEntity updateUser(UserEntity existingUser, UserEntity newUser) {
	existingUser.setId(newUser.getId());
    existingUser.setName(newUser.getName());
	return existingUser;
	
   }
	
//	public void updateUser(UserEntity user) {
//		  // Get the current user from the database.
//		  User existingUser = repository.findById(user.getId()).get();
//		  // Update the user object with the new values.
//		  existingUser.setName(user.getName());
//		  existingUser.setEmail(user.getEmail());
//
//		  // Save the user object to the database.
//		  userRepository.save(existingUser);
//		}

	public void deleteUser(UserEntity userEntity) {
         userEntity = null;
	}

}
