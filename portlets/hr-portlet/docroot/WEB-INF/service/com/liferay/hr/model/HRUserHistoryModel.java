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
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the HRUserHistory service. Represents a row in the &quot;HRUserHistory&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.hr.model.impl.HRUserHistoryModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.hr.model.impl.HRUserHistoryImpl}.
 * </p>
 *
 * @author Wesley Gong
 * @see HRUserHistory
 * @see com.liferay.hr.model.impl.HRUserHistoryImpl
 * @see com.liferay.hr.model.impl.HRUserHistoryModelImpl
 * @generated
 */
public interface HRUserHistoryModel extends BaseModel<HRUserHistory> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a h r user history model instance should use the {@link HRUserHistory} interface instead.
	 */

	/**
	 * Gets the primary key of this h r user history.
	 *
	 * @return the primary key of this h r user history
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this h r user history
	 *
	 * @param pk the primary key of this h r user history
	 */
	public void setPrimaryKey(long pk);

	/**
	 * Gets the hr user history ID of this h r user history.
	 *
	 * @return the hr user history ID of this h r user history
	 */
	public long getHrUserHistoryId();

	/**
	 * Sets the hr user history ID of this h r user history.
	 *
	 * @param hrUserHistoryId the hr user history ID of this h r user history
	 */
	public void setHrUserHistoryId(long hrUserHistoryId);

	/**
	 * Gets the group ID of this h r user history.
	 *
	 * @return the group ID of this h r user history
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this h r user history.
	 *
	 * @param groupId the group ID of this h r user history
	 */
	public void setGroupId(long groupId);

	/**
	 * Gets the company ID of this h r user history.
	 *
	 * @return the company ID of this h r user history
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this h r user history.
	 *
	 * @param companyId the company ID of this h r user history
	 */
	public void setCompanyId(long companyId);

	/**
	 * Gets the user ID of this h r user history.
	 *
	 * @return the user ID of this h r user history
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this h r user history.
	 *
	 * @param userId the user ID of this h r user history
	 */
	public void setUserId(long userId);

	/**
	 * Gets the user uuid of this h r user history.
	 *
	 * @return the user uuid of this h r user history
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this h r user history.
	 *
	 * @param userUuid the user uuid of this h r user history
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Gets the user name of this h r user history.
	 *
	 * @return the user name of this h r user history
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this h r user history.
	 *
	 * @param userName the user name of this h r user history
	 */
	public void setUserName(String userName);

	/**
	 * Gets the create date of this h r user history.
	 *
	 * @return the create date of this h r user history
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this h r user history.
	 *
	 * @param createDate the create date of this h r user history
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Gets the hr employment type ID of this h r user history.
	 *
	 * @return the hr employment type ID of this h r user history
	 */
	public long getHrEmploymentTypeId();

	/**
	 * Sets the hr employment type ID of this h r user history.
	 *
	 * @param hrEmploymentTypeId the hr employment type ID of this h r user history
	 */
	public void setHrEmploymentTypeId(long hrEmploymentTypeId);

	/**
	 * Gets the hr job title ID of this h r user history.
	 *
	 * @return the hr job title ID of this h r user history
	 */
	public long getHrJobTitleId();

	/**
	 * Sets the hr job title ID of this h r user history.
	 *
	 * @param hrJobTitleId the hr job title ID of this h r user history
	 */
	public void setHrJobTitleId(long hrJobTitleId);

	/**
	 * Gets the hr office ID of this h r user history.
	 *
	 * @return the hr office ID of this h r user history
	 */
	public long getHrOfficeId();

	/**
	 * Sets the hr office ID of this h r user history.
	 *
	 * @param hrOfficeId the hr office ID of this h r user history
	 */
	public void setHrOfficeId(long hrOfficeId);

	/**
	 * Gets the hr termination type ID of this h r user history.
	 *
	 * @return the hr termination type ID of this h r user history
	 */
	public long getHrTerminationTypeId();

	/**
	 * Sets the hr termination type ID of this h r user history.
	 *
	 * @param hrTerminationTypeId the hr termination type ID of this h r user history
	 */
	public void setHrTerminationTypeId(long hrTerminationTypeId);

	/**
	 * Gets the hr wage type ID of this h r user history.
	 *
	 * @return the hr wage type ID of this h r user history
	 */
	public long getHrWageTypeId();

	/**
	 * Sets the hr wage type ID of this h r user history.
	 *
	 * @param hrWageTypeId the hr wage type ID of this h r user history
	 */
	public void setHrWageTypeId(long hrWageTypeId);

	/**
	 * Gets the hire date of this h r user history.
	 *
	 * @return the hire date of this h r user history
	 */
	public Date getHireDate();

	/**
	 * Sets the hire date of this h r user history.
	 *
	 * @param hireDate the hire date of this h r user history
	 */
	public void setHireDate(Date hireDate);

	/**
	 * Gets the termination date of this h r user history.
	 *
	 * @return the termination date of this h r user history
	 */
	public Date getTerminationDate();

	/**
	 * Sets the termination date of this h r user history.
	 *
	 * @param terminationDate the termination date of this h r user history
	 */
	public void setTerminationDate(Date terminationDate);

	/**
	 * Gets the wage amount of this h r user history.
	 *
	 * @return the wage amount of this h r user history
	 */
	public double getWageAmount();

	/**
	 * Sets the wage amount of this h r user history.
	 *
	 * @param wageAmount the wage amount of this h r user history
	 */
	public void setWageAmount(double wageAmount);

	/**
	 * Gets the wage currency code of this h r user history.
	 *
	 * @return the wage currency code of this h r user history
	 */
	@AutoEscape
	public String getWageCurrencyCode();

	/**
	 * Sets the wage currency code of this h r user history.
	 *
	 * @param wageCurrencyCode the wage currency code of this h r user history
	 */
	public void setWageCurrencyCode(String wageCurrencyCode);

	/**
	 * Gets the benefits exempt of this h r user history.
	 *
	 * @return the benefits exempt of this h r user history
	 */
	public boolean getBenefitsExempt();

	/**
	 * Determines if this h r user history is benefits exempt.
	 *
	 * @return <code>true</code> if this h r user history is benefits exempt; <code>false</code> otherwise
	 */
	public boolean isBenefitsExempt();

	/**
	 * Sets whether this h r user history is benefits exempt.
	 *
	 * @param benefitsExempt the benefits exempt of this h r user history
	 */
	public void setBenefitsExempt(boolean benefitsExempt);

	/**
	 * Gets the overtime exempt of this h r user history.
	 *
	 * @return the overtime exempt of this h r user history
	 */
	public boolean getOvertimeExempt();

	/**
	 * Determines if this h r user history is overtime exempt.
	 *
	 * @return <code>true</code> if this h r user history is overtime exempt; <code>false</code> otherwise
	 */
	public boolean isOvertimeExempt();

	/**
	 * Sets whether this h r user history is overtime exempt.
	 *
	 * @param overtimeExempt the overtime exempt of this h r user history
	 */
	public void setOvertimeExempt(boolean overtimeExempt);

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

	public int compareTo(HRUserHistory hrUserHistory);

	public int hashCode();

	public HRUserHistory toEscapedModel();

	public String toString();

	public String toXmlString();
}