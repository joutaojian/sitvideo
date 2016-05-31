package com.tajok.web.backend.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tajok.web.backend.dao.RecordMapper;
import com.tajok.web.backend.model.Record;
import com.tajok.web.backend.service.IRecordService;

@Service("recordService")
public class RecordServiceImpl implements IRecordService {
	
	@Resource
	private RecordMapper recordDao;

	@Override
	public void addRecord(Integer userId, int movId) {
		Record rec = new Record();
		rec.setUserId(userId);
		rec.setMovId(movId);
		rec.setTime(new Date());
		recordDao.insert(rec);
	}

	@Override
	public List rank(int i) {
		List ranks = recordDao.rank(i);
		return ranks;
	}


}
