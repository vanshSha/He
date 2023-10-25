package stop.controller;

import stop.Service.Service;
import stop.entity.UserEntity;
import stop.repository.Repository;

public class Controller {

	public static void main(String[] args) {
		Service service = new Service();
		Repository repository = new Repository();
		System.out.println(repository);

	}
}