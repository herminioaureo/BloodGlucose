package com.bloodglucose.api.core.util;

import org.springframework.stereotype.Service;

import com.bloodglucose.api.core.dto.GlucoseRecord;
import com.bloodglucose.api.core.entity.GlucoseEntity;

import java.util.ArrayList;
import java.util.List;

@Service
public class GlucoseConverter {
	
	public GlucoseEntity convertToEntity(GlucoseRecord record) {
		return new GlucoseEntity(record.meal(), record.value(), record.datetime());
	}

	public GlucoseRecord convertToRecord(GlucoseEntity entity) {
		return new GlucoseRecord(entity.getIdglucose(), entity.getMeal(), entity.getValue(), entity.getDate());
	}

	public List<GlucoseRecord> convertToRecord(List<GlucoseEntity> entities) {
		List<GlucoseRecord> recordList = new ArrayList<GlucoseRecord>();

		for (GlucoseEntity entity : entities) {
			recordList.add(new GlucoseRecord(entity.getIdglucose(), entity.getMeal(), entity.getValue(), entity.getDate()));
		}

		return recordList;
	}

}
