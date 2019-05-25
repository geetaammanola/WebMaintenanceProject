package com.project.MaintenanceSolutions.dao;

import java.util.List;


import com.project.MaintenanceSolutions.modal.NewComplain;

public interface NewComplainDao {
	
	public void addNewComplains( NewComplain NewComplain );
	public void deleteNewComplains( int ComplainId );
	public void updateNewComplains( NewComplain NewComplain);
	public List<NewComplain> getAllNewComplains();
	public NewComplain getNewComplainById(int ComplainId);
	


	

}
