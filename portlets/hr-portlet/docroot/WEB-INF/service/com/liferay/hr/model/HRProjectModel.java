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
 * The base model interface for the HRProject service. Represents a row in the &quot;HRProject&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.hr.model.impl.HRProjectModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.hr.model.impl.HRProjectImpl}.
 * </p>
 *
 * @author Wesley Gong
 * @see HRProject
 * @see com.liferay.hr.model.impl.HRProjectImpl
 * @see com.liferay.hr.model.impl.HRProjectModelImpl
 * @generated
 */
public interface HRProjectModel extends BaseModel<HRProject>, GroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a h r project model instance should use the {@link HRProject} interface instead.
	 */

	/**
	 * Gets the primary key of this h r project.
	 *
	 * @return the primary key of this h r project
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this h r project
	 *
	 * @param pk the primary key of this h r project
	 */
	public void setPrimaryKey(long pk);

	/**
	 * Gets the hr project ID of this h r project.
	 *
	 * @return the hr project ID of this h r project
	 */
	public long getHrProjectId();

	/**
	 * Sets the hr project ID of this h r project.
	 *
	 * @param hrProjectId the hr project ID of this h r project
	 */
	public void setHrProjectId(long hrProjectId);

	/**
	 * Gets the group ID of this h r project.
	 *
	 * @return the group ID of this h r project
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this h r project.
	 *
	 * @param groupId the group ID of this h r project
	 */
	public void setGroupId(long groupId);

	/**
	 * Gets the company ID of this h r project.
	 *
	 * @return the company ID of this h r project
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this h r project.
	 *
	 * @param companyId the company ID of this h r project
	 */
	public void setCompanyId(long companyId);

	/**
	 * Gets the user ID of this h r project.
	 *
	 * @return the user ID of this h r project
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this h r project.
	 *
	 * @param userId the user ID of this h r project
	 */
	public void setUserId(long userId);

	/**
	 * Gets the user uuid of this h r project.
	 *
	 * @return the user uuid of this h r project
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this h r project.
	 *
	 * @param userUuid the user uuid of this h r project
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Gets the user name of this h r project.
	 *
	 * @return the user name of this h r project
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this h r project.
	 *
	 * @param userName the user name of this h r project
	 */
	public void setUserName(String userName);

	/**
	 * Gets the create date of this h r project.
	 *
	 * @return the create date of this h r project
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this h r project.
	 *
	 * @param createDate the create date of this h r project
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Gets the modified date of this h r project.
	 *
	 * @return the modified date of this h r project
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this h r project.
	 *
	 * @param modifiedDate the modified date of this h r project
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Gets the hr client ID of this h r project.
	 *
	 * @return the hr client ID of this h r project
	 */
	public long getHrClientId();

	/**
	 * Sets the hr client ID of this h r project.
	 *
	 * @param hrClientId the hr client ID of this h r project
	 */
	public void setHrClientId(long hrClientId);

	/**
	 * Gets the hr project status ID of this h r project.
	 *
	 * @return the hr project status ID of this h r project
	 */
	public long getHrProjectStatusId();

	/**
	 * Sets the hr project status ID of this h r project.
	 *
	 * @param hrProjectStatusId the hr project status ID of this h r project
	 */
	public void setHrProjectStatusId(long hrProjectStatusId);

	/**
	 * Gets the name of this h r project.
	 *
	 * @return the name of this h r project
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this h r project.
	 *
	 * @param name the name of this h r project
	 */
	public void setName(String name);

	/**
	 * Gets the description of this h r project.
	 *
	 * @return the description of this h r project
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this h r project.
	 *
	 * @param description the description of this h r project
	 */
	public void setDescription(String description);

	/**
	 * Gets the estimated start date of this h r project.
	 *
	 * @return the estimated start date of this h r project
	 */
	public Date getEstimatedStartDate();

	/**
	 * Sets the estimated start date of this h r project.
	 *
	 * @param estimatedStartDate the estimated start date of this h r project
	 */
	public void setEstimatedStartDate(Date estimatedStartDate);

	/**
	 * Gets the estimated end date of this h r project.
	 *
	 * @return the estimated end date of this h r project
	 */
	public Date getEstimatedEndDate();

	/**
	 * Sets the estimated end date of this h r project.
	 *
	 * @param estimatedEndDate the estimated end date of this h r project
	 */
	public void setEstimatedEndDate(Date estimatedEndDate);

	/**
	 * Gets the estimated hours of this h r project.
	 *
	 * @return the estimated hours of this h r project
	 */
	public double getEstimatedHours();

	/**
	 * Sets the estimated hours of this h r project.
	 *
	 * @param estimatedHours the estimated hours of this h r project
	 */
	public void setEstimatedHours(double estimatedHours);

	/**
	 * Gets the estimated hours cost of this h r project.
	 *
	 * @return the estimated hours cost of this h r project
	 */
	public double getEstimatedHoursCost();

	/**
	 * Sets the estimated hours cost of this h r project.
	 *
	 * @param estimatedHoursCost the estimated hours cost of this h r project
	 */
	public void setEstimatedHoursCost(double estimatedHoursCost);

	/**
	 * Gets the estimated hours cost currency code of this h r project.
	 *
	 * @return the estimated hours cost currency code of this h r project
	 */
	@AutoEscape
	public String getEstimatedHoursCostCurrencyCode();

	/**
	 * Sets the estimated hours cost currency code of this h r project.
	 *
	 * @param estimatedHoursCostCurrencyCode the estimated hours cost currency code of this h r project
	 */
	public void setEstimatedHoursCostCurrencyCode(
		String estimatedHoursCostCurrencyCode);

	/**
	 * Gets the estimated expenses of this h r project.
	 *
	 * @return the estimated expenses of this h r project
	 */
	public double getEstimatedExpenses();

	/**
	 * Sets the estimated expenses of this h r project.
	 *
	 * @param estimatedExpenses the estimated expenses of this h r project
	 */
	public void setEstimatedExpenses(double estimatedExpenses);

	/**
	 * Gets the estimated expenses currency code of this h r project.
	 *
	 * @return the estimated expenses currency code of this h r project
	 */
	@AutoEscape
	public String getEstimatedExpensesCurrencyCode();

	/**
	 * Sets the estimated expenses currency code of this h r project.
	 *
	 * @param estimatedExpensesCurrencyCode the estimated expenses currency code of this h r project
	 */
	public void setEstimatedExpensesCurrencyCode(
		String estimatedExpensesCurrencyCode);

	/**
	 * Gets the actual start date of this h r project.
	 *
	 * @return the actual start date of this h r project
	 */
	public Date getActualStartDate();

	/**
	 * Sets the actual start date of this h r project.
	 *
	 * @param actualStartDate the actual start date of this h r project
	 */
	public void setActualStartDate(Date actualStartDate);

	/**
	 * Gets the actual end date of this h r project.
	 *
	 * @return the actual end date of this h r project
	 */
	public Date getActualEndDate();

	/**
	 * Sets the actual end date of this h r project.
	 *
	 * @param actualEndDate the actual end date of this h r project
	 */
	public void setActualEndDate(Date actualEndDate);

	/**
	 * Gets the actual hours of this h r project.
	 *
	 * @return the actual hours of this h r project
	 */
	public double getActualHours();

	/**
	 * Sets the actual hours of this h r project.
	 *
	 * @param actualHours the actual hours of this h r project
	 */
	public void setActualHours(double actualHours);

	/**
	 * Gets the actual hours cost of this h r project.
	 *
	 * @return the actual hours cost of this h r project
	 */
	public double getActualHoursCost();

	/**
	 * Sets the actual hours cost of this h r project.
	 *
	 * @param actualHoursCost the actual hours cost of this h r project
	 */
	public void setActualHoursCost(double actualHoursCost);

	/**
	 * Gets the actual hours cost currency code of this h r project.
	 *
	 * @return the actual hours cost currency code of this h r project
	 */
	@AutoEscape
	public String getActualHoursCostCurrencyCode();

	/**
	 * Sets the actual hours cost currency code of this h r project.
	 *
	 * @param actualHoursCostCurrencyCode the actual hours cost currency code of this h r project
	 */
	public void setActualHoursCostCurrencyCode(
		String actualHoursCostCurrencyCode);

	/**
	 * Gets the actual expenses of this h r project.
	 *
	 * @return the actual expenses of this h r project
	 */
	public double getActualExpenses();

	/**
	 * Sets the actual expenses of this h r project.
	 *
	 * @param actualExpenses the actual expenses of this h r project
	 */
	public void setActualExpenses(double actualExpenses);

	/**
	 * Gets the actual expenses currency code of this h r project.
	 *
	 * @return the actual expenses currency code of this h r project
	 */
	public double getActualExpensesCurrencyCode();

	/**
	 * Sets the actual expenses currency code of this h r project.
	 *
	 * @param actualExpensesCurrencyCode the actual expenses currency code of this h r project
	 */
	public void setActualExpensesCurrencyCode(double actualExpensesCurrencyCode);

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

	public int compareTo(HRProject hrProject);

	public int hashCode();

	public HRProject toEscapedModel();

	public String toString();

	public String toXmlString();
}