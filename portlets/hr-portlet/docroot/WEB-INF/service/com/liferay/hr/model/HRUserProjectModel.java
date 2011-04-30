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
 * The base model interface for the HRUserProject service. Represents a row in the &quot;HRUserProject&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.hr.model.impl.HRUserProjectModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.hr.model.impl.HRUserProjectImpl}.
 * </p>
 *
 * @author Wesley Gong
 * @see HRUserProject
 * @see com.liferay.hr.model.impl.HRUserProjectImpl
 * @see com.liferay.hr.model.impl.HRUserProjectModelImpl
 * @generated
 */
public interface HRUserProjectModel extends BaseModel<HRUserProject>,
	GroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a h r user project model instance should use the {@link HRUserProject} interface instead.
	 */

	/**
	 * Gets the primary key of this h r user project.
	 *
	 * @return the primary key of this h r user project
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this h r user project
	 *
	 * @param pk the primary key of this h r user project
	 */
	public void setPrimaryKey(long pk);

	/**
	 * Gets the hr user project ID of this h r user project.
	 *
	 * @return the hr user project ID of this h r user project
	 */
	public long getHrUserProjectId();

	/**
	 * Sets the hr user project ID of this h r user project.
	 *
	 * @param hrUserProjectId the hr user project ID of this h r user project
	 */
	public void setHrUserProjectId(long hrUserProjectId);

	/**
	 * Gets the group ID of this h r user project.
	 *
	 * @return the group ID of this h r user project
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this h r user project.
	 *
	 * @param groupId the group ID of this h r user project
	 */
	public void setGroupId(long groupId);

	/**
	 * Gets the company ID of this h r user project.
	 *
	 * @return the company ID of this h r user project
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this h r user project.
	 *
	 * @param companyId the company ID of this h r user project
	 */
	public void setCompanyId(long companyId);

	/**
	 * Gets the user ID of this h r user project.
	 *
	 * @return the user ID of this h r user project
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this h r user project.
	 *
	 * @param userId the user ID of this h r user project
	 */
	public void setUserId(long userId);

	/**
	 * Gets the user uuid of this h r user project.
	 *
	 * @return the user uuid of this h r user project
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this h r user project.
	 *
	 * @param userUuid the user uuid of this h r user project
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Gets the user name of this h r user project.
	 *
	 * @return the user name of this h r user project
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this h r user project.
	 *
	 * @param userName the user name of this h r user project
	 */
	public void setUserName(String userName);

	/**
	 * Gets the create date of this h r user project.
	 *
	 * @return the create date of this h r user project
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this h r user project.
	 *
	 * @param createDate the create date of this h r user project
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Gets the modified date of this h r user project.
	 *
	 * @return the modified date of this h r user project
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this h r user project.
	 *
	 * @param modifiedDate the modified date of this h r user project
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Gets the hr project billing rate ID of this h r user project.
	 *
	 * @return the hr project billing rate ID of this h r user project
	 */
	public long getHrProjectBillingRateId();

	/**
	 * Sets the hr project billing rate ID of this h r user project.
	 *
	 * @param hrProjectBillingRateId the hr project billing rate ID of this h r user project
	 */
	public void setHrProjectBillingRateId(long hrProjectBillingRateId);

	/**
	 * Gets the hr project ID of this h r user project.
	 *
	 * @return the hr project ID of this h r user project
	 */
	public long getHrProjectId();

	/**
	 * Sets the hr project ID of this h r user project.
	 *
	 * @param hrProjectId the hr project ID of this h r user project
	 */
	public void setHrProjectId(long hrProjectId);

	/**
	 * Gets the hr project role ID of this h r user project.
	 *
	 * @return the hr project role ID of this h r user project
	 */
	public long getHrProjectRoleId();

	/**
	 * Sets the hr project role ID of this h r user project.
	 *
	 * @param hrProjectRoleId the hr project role ID of this h r user project
	 */
	public void setHrProjectRoleId(long hrProjectRoleId);

	/**
	 * Gets the hr user ID of this h r user project.
	 *
	 * @return the hr user ID of this h r user project
	 */
	public long getHrUserId();

	/**
	 * Sets the hr user ID of this h r user project.
	 *
	 * @param hrUserId the hr user ID of this h r user project
	 */
	public void setHrUserId(long hrUserId);

	/**
	 * Gets the hr user uuid of this h r user project.
	 *
	 * @return the hr user uuid of this h r user project
	 * @throws SystemException if a system exception occurred
	 */
	public String getHrUserUuid() throws SystemException;

	/**
	 * Sets the hr user uuid of this h r user project.
	 *
	 * @param hrUserUuid the hr user uuid of this h r user project
	 */
	public void setHrUserUuid(String hrUserUuid);

	/**
	 * Gets the actual rate of this h r user project.
	 *
	 * @return the actual rate of this h r user project
	 */
	public double getActualRate();

	/**
	 * Sets the actual rate of this h r user project.
	 *
	 * @param actualRate the actual rate of this h r user project
	 */
	public void setActualRate(double actualRate);

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

	public int compareTo(HRUserProject hrUserProject);

	public int hashCode();

	public HRUserProject toEscapedModel();

	public String toString();

	public String toXmlString();
}