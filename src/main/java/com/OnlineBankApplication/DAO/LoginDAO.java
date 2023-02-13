package com.OnlineBankApplication.DAO;

import com.OnlineBankApplication.Entity.Registration;

public interface LoginDAO {
  public void register(Registration registration);
  public boolean isUserIDExists(String userId);
  public boolean isPasswordExists(String password,String userId);
}
