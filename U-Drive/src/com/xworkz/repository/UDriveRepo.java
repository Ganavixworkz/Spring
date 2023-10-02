package com.xworkz.repository;

import com.xworkz.dto.UDriveDto;

public interface UDriveRepo {
	abstract boolean onSave(UDriveDto dto);

}
