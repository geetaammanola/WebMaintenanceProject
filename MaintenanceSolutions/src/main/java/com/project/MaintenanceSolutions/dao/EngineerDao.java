package com.project.MaintenanceSolutions.dao;

import java.util.List;


import com.project.MaintenanceSolutions.modal.Engineer;



public interface EngineerDao {
	
	public void addEngineers( Engineer engineers );
	public void deleteEngineers( int engineerId );
	public void updateEngineers( Engineer engineer);
	public List<Engineer> getAllEngineers();
	public Engineer getEngineersById(int engineerId);
	

}
