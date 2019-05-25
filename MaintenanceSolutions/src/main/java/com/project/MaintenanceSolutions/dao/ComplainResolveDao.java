package com.project.MaintenanceSolutions.dao;

import java.util.List;

import com.project.MaintenanceSolutions.modal.ComplainResolve;


public interface ComplainResolveDao {
	public void addsolvedComplain( ComplainResolve ComplainResolve );
	public void deletesolvedComplains( int resolveid );
	public void updatesolvedComplains( ComplainResolve ComplainResolve);
	public List<ComplainResolve> getAllsolvedComplains();
	public ComplainResolve getResolveById(int resolveid);
	




}
