/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.hr.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the HRTimeSheetHoursPerDay service. Represents a row in the &quot;HRTimeSheetHoursPerDay&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.hr.model.impl.HRTimeSheetHoursPerDayModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.hr.model.impl.HRTimeSheetHoursPerDayImpl}.
 * </p>
 *
 * @author Wesley Gong
 * @see HRTimeSheetHoursPerDay
 * @see com.liferay.hr.model.impl.HRTimeSheetHoursPerDayImpl
 * @see com.liferay.hr.model.impl.HRTimeSheetHoursPerDayModelImpl
 * @generated
 */
public interface HRTimeSheetHoursPerDayModel extends BaseModel<HRTimeSheetHoursPerDay>,
	GroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a h r time sheet hours per day model instance should use the {@link HRTimeSheetHoursPerDay} interface instead.
	 */

	/**
	 * Gets the primary key of this h r time sheet hours per day.
	 *
	 * @return the primary key of this h r time sheet hours per day
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this h r time sheet hours per day
	 *
	 * @param pk the primary key of this h r time sheet hours per day
	 */
	public void setPrimaryKey(long pk);

	/**
	 * Gets the hr time sheet hours per day ID of this h r time sheet hours per day.
	 *
	 * @return the hr time sheet hours per day ID of this h r time sheet hours per day
	 */
	public long getHrTimeSheetHoursPerDayId();

	/**
	 * Sets the hr time sheet hours per day ID of this h r time sheet hours per day.
	 *
	 * @param hrTimeSheetHoursPerDayId the hr time sheet hours per day ID of this h r time sheet hours per day
	 */
	public void setHrTimeSheetHoursPerDayId(long hrTimeSheetHoursPerDayId);

	/**
	 * Gets the group ID of this h r time sheet hours per day.
	 *
	 * @return the group ID of this h r time sheet hours per day
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this h r time sheet hours per day.
	 *
	 * @param groupId the group ID of this h r time sheet hours per day
	 */
	public void setGroupId(long groupId);

	/**
	 * Gets the company ID of this h r time sheet hours per day.
	 *
	 * @return the company ID of this h r time sheet hours per day
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this h r time sheet hours per day.
	 *
	 * @param companyId the company ID of this h r time sheet hours per day
	 */
	public void setCompanyId(long companyId);

	/**
	 * Gets the user ID of this h r time sheet hours per day.
	 *
	 * @return the user ID of this h r time sheet hours per day
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this h r time sheet hours per day.
	 *
	 * @param userId the user ID of this h r time sheet hours per day
	 */
	public void setUserId(long userId);

	/**
	 * Gets the user uuid of this h r time sheet hours per day.
	 *
	 * @return the user uuid of this h r time sheet hours per day
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this h r time sheet hours per day.
	 *
	 * @param userUuid the user uuid of this h r time sheet hours per day
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Gets the user name of this h r time sheet hours per day.
	 *
	 * @return the user name of this h r time sheet hours per day
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this h r time sheet hours per day.
	 *
	 * @param userName the user name of this h r time sheet hours per day
	 */
	public void setUserName(String userName);

	/**
	 * Gets the create date of this h r time sheet hours per day.
	 *
	 * @return the create date of this h r time sheet hours per day
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this h r time sheet hours per day.
	 *
	 * @param createDate the create date of this h r time sheet hours per day
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Gets the modified date of this h r time sheet hours per day.
	 *
	 * @return the modified date of this h r time sheet hours per day
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this h r time sheet hours per day.
	 *
	 * @param modifiedDate the modified date of this h r time sheet hours per day
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Gets the hr office ID of this h r time sheet hours per day.
	 *
	 * @return the hr office ID of this h r time sheet hours per day
	 */
	public long getHrOfficeId();

	/**
	 * Sets the hr office ID of this h r time sheet hours per day.
	 *
	 * @param hrOfficeId the hr office ID of this h r time sheet hours per day
	 */
	public void setHrOfficeId(long hrOfficeId);

	/**
	 * Gets the hours per day of this h r time sheet hours per day.
	 *
	 * @return the hours per day of this h r time sheet hours per day
	 */
	public double getHoursPerDay();

	/**
	 * Sets the hours per day of this h r time sheet hours per day.
	 *
	 * @param hoursPerDay the hours per day of this h r time sheet hours per day
	 */
	public void setHoursPerDay(double hoursPerDay);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public void setEscapedModel(boolean escapedModel);

	public Serializable getPrimaryKeyObj();

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(HRTimeSheetHoursPerDay hrTimeSheetHoursPerDay);

	public int hashCode();

	public HRTimeSheetHoursPerDay toEscapedModel();

	public String toString();

	public String toXmlString();
}