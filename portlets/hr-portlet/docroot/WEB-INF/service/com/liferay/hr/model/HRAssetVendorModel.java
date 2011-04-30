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
 * The base model interface for the HRAssetVendor service. Represents a row in the &quot;HRAssetVendor&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.hr.model.impl.HRAssetVendorModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.hr.model.impl.HRAssetVendorImpl}.
 * </p>
 *
 * @author Wesley Gong
 * @see HRAssetVendor
 * @see com.liferay.hr.model.impl.HRAssetVendorImpl
 * @see com.liferay.hr.model.impl.HRAssetVendorModelImpl
 * @generated
 */
public interface HRAssetVendorModel extends BaseModel<HRAssetVendor>,
	GroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a h r asset vendor model instance should use the {@link HRAssetVendor} interface instead.
	 */

	/**
	 * Gets the primary key of this h r asset vendor.
	 *
	 * @return the primary key of this h r asset vendor
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this h r asset vendor
	 *
	 * @param pk the primary key of this h r asset vendor
	 */
	public void setPrimaryKey(long pk);

	/**
	 * Gets the hr asset vendor ID of this h r asset vendor.
	 *
	 * @return the hr asset vendor ID of this h r asset vendor
	 */
	public long getHrAssetVendorId();

	/**
	 * Sets the hr asset vendor ID of this h r asset vendor.
	 *
	 * @param hrAssetVendorId the hr asset vendor ID of this h r asset vendor
	 */
	public void setHrAssetVendorId(long hrAssetVendorId);

	/**
	 * Gets the group ID of this h r asset vendor.
	 *
	 * @return the group ID of this h r asset vendor
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this h r asset vendor.
	 *
	 * @param groupId the group ID of this h r asset vendor
	 */
	public void setGroupId(long groupId);

	/**
	 * Gets the company ID of this h r asset vendor.
	 *
	 * @return the company ID of this h r asset vendor
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this h r asset vendor.
	 *
	 * @param companyId the company ID of this h r asset vendor
	 */
	public void setCompanyId(long companyId);

	/**
	 * Gets the user ID of this h r asset vendor.
	 *
	 * @return the user ID of this h r asset vendor
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this h r asset vendor.
	 *
	 * @param userId the user ID of this h r asset vendor
	 */
	public void setUserId(long userId);

	/**
	 * Gets the user uuid of this h r asset vendor.
	 *
	 * @return the user uuid of this h r asset vendor
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this h r asset vendor.
	 *
	 * @param userUuid the user uuid of this h r asset vendor
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Gets the user name of this h r asset vendor.
	 *
	 * @return the user name of this h r asset vendor
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this h r asset vendor.
	 *
	 * @param userName the user name of this h r asset vendor
	 */
	public void setUserName(String userName);

	/**
	 * Gets the create date of this h r asset vendor.
	 *
	 * @return the create date of this h r asset vendor
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this h r asset vendor.
	 *
	 * @param createDate the create date of this h r asset vendor
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Gets the modified date of this h r asset vendor.
	 *
	 * @return the modified date of this h r asset vendor
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this h r asset vendor.
	 *
	 * @param modifiedDate the modified date of this h r asset vendor
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Gets the name of this h r asset vendor.
	 *
	 * @return the name of this h r asset vendor
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this h r asset vendor.
	 *
	 * @param name the name of this h r asset vendor
	 */
	public void setName(String name);

	/**
	 * Gets the description of this h r asset vendor.
	 *
	 * @return the description of this h r asset vendor
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this h r asset vendor.
	 *
	 * @param description the description of this h r asset vendor
	 */
	public void setDescription(String description);

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

	public int compareTo(HRAssetVendor hrAssetVendor);

	public int hashCode();

	public HRAssetVendor toEscapedModel();

	public String toString();

	public String toXmlString();
}