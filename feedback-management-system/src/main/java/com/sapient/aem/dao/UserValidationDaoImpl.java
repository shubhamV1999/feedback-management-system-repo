package com.sapient.aem.dao;
import com.sapient.aem.model.User;
import com.sapient.aem.util.Validation;

public class UserValidationDaoImpl implements UserValidationDAO {

	private static User user = new User();
	@Override
	public Boolean isAuthorizeUser(User user) {
		if(Validation.isName(user.getUserName()) && Validation.isPassword(user.getPassword())) {
			return true;
		}
		
		
		return false;
	}

}
