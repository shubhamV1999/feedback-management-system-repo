package com.sapient.aem.dao;

import com.sapient.aem.model.User;

public interface UserValidationDAO {
	public Boolean isAuthorizeUser(User user);

}
