package com.tajok.web.backend.service;

import java.util.List;

public interface IRecordService {

	void addRecord(Integer userId, int movId);

	List rank(int i);
	
}
