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
 * The base model interface for the HRAssetProduct service. Represents a row in the &quot;HRAssetProduct&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.hr.model.impl.HRAssetProductModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.hr.model.impl.HRAssetProductImpl}.
 * </p>
 *
 * @author Wesley Gong
 * @see HRAssetProduct
 * @see com.liferay.hr.model.impl.HRAssetProductImpl
 * @see com.liferay.hr.model.impl.HRAssetProductModelImpl
 * @generated
 */
public interface HRAssetProductModel extends BaseModel<HRAssetProduct>,
	GroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a h r asset product model instance should use the {@link HRAssetProduct} interface instead.
	 */

	/**
	 * Gets the primary key of this h r asset product.
	 *
	 * @return the primary key of this h r asset product
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this h r asset product
	 *
	 * @param pk the primary key of this h r asset product
	 */
	public void setPrimaryKey(long pk);

	/**
	 * Gets the hr asset product ID of this h r asset product.
	 *
	 * @return the hr asset product ID of this h r asset product
	 */
	public long getHrAssetProductId();

	/**
	 * Sets the hr asset product ID of this h r asset product.
	 *
	 * @param hrAssetProductId the hr asset product ID of this h r asset product
	 */
	public void setHrAssetProductId(long hrAssetProductId);

	/**
	 * Gets the group ID of this h r asset product.
	 *
	 * @return the group ID of this h r asset product
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this h r asset product.
	 *
	 * @param groupId the group ID of this h r asset product
	 */
	public void setGroupId(long groupId);

	/**
	 * Gets the company ID of this h r asset product.
	 *
	 * @return the company ID of this h r asset product
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this h r asset product.
	 *
	 * @param companyId the company ID of this h r asset product
	 */
	public void setCompanyId(long companyId);

	/**
	 * Gets the user ID of this h r asset product.
	 *
	 * @return the user ID of this h r asset product
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this h r asset product.
	 *
	 * @param userId the user ID of this h r asset product
	 */
	public void setUserId(long userId);

	/**
	 * Gets the user uuid of this h r asset product.
	 *
	 * @return the user uuid of this h r asset product
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this h r asset product.
	 *
	 * @param userUuid the user uuid of this h r asset product
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Gets the user name of this h r asset product.
	 *
	 * @return the user name of this h r asset product
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this h r asset product.
	 *
	 * @param userName the user name of this h r asset product
	 */
	public void setUserName(String userName);

	/**
	 * Gets the create date of this h r asset product.
	 *
	 * @return the create date of this h r asset product
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this h r asset product.
	 *
	 * @param createDate the create date of this h r asset product
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Gets the modified date of this h r asset product.
	 *
	 * @return the modified date of this h r asset product
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this h r asset product.
	 *
	 * @param modifiedDate the modified date of this h r asset product
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Gets the hr asset vendor ID of this h r asset product.
	 *
	 * @return the hr asset vendor ID of this h r asset product
	 */
	public long getHrAssetVendorId();

	/**
	 * Sets the hr asset vendor ID of this h r asset product.
	 *
	 * @param hrAssetVendorId the hr asset vendor ID of this h r asset product
	 */
	public void setHrAssetVendorId(long hrAssetVendorId);

	/**
	 * Gets the name of this h r asset product.
	 *
	 * @return the name of this h r asset product
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this h r asset product.
	 *
	 * @param name the name of this h r asset product
	 */
	public void setName(String name);

	/**
	 * Gets the description of this h r asset product.
	 *
	 * @return the description of this h r asset product
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this h r asset product.
	 *
	 * @param description the description of this h r asset product
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

	public int compareTo(HRAssetProduct hrAssetProduct);

	public int hashCode();

	public HRAssetProduct toEscapedModel();

	public String toString();

	public String toXmlString();
}