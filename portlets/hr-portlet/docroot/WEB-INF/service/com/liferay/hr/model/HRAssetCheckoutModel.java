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
 * The base model interface for the HRAssetCheckout service. Represents a row in the &quot;HRAssetCheckout&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.hr.model.impl.HRAssetCheckoutModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.hr.model.impl.HRAssetCheckoutImpl}.
 * </p>
 *
 * @author Wesley Gong
 * @see HRAssetCheckout
 * @see com.liferay.hr.model.impl.HRAssetCheckoutImpl
 * @see com.liferay.hr.model.impl.HRAssetCheckoutModelImpl
 * @generated
 */
public interface HRAssetCheckoutModel extends BaseModel<HRAssetCheckout>,
	GroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a h r asset checkout model instance should use the {@link HRAssetCheckout} interface instead.
	 */

	/**
	 * Gets the primary key of this h r asset checkout.
	 *
	 * @return the primary key of this h r asset checkout
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this h r asset checkout
	 *
	 * @param pk the primary key of this h r asset checkout
	 */
	public void setPrimaryKey(long pk);

	/**
	 * Gets the hr asset checkout ID of this h r asset checkout.
	 *
	 * @return the hr asset checkout ID of this h r asset checkout
	 */
	public long getHrAssetCheckoutId();

	/**
	 * Sets the hr asset checkout ID of this h r asset checkout.
	 *
	 * @param hrAssetCheckoutId the hr asset checkout ID of this h r asset checkout
	 */
	public void setHrAssetCheckoutId(long hrAssetCheckoutId);

	/**
	 * Gets the group ID of this h r asset checkout.
	 *
	 * @return the group ID of this h r asset checkout
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this h r asset checkout.
	 *
	 * @param groupId the group ID of this h r asset checkout
	 */
	public void setGroupId(long groupId);

	/**
	 * Gets the company ID of this h r asset checkout.
	 *
	 * @return the company ID of this h r asset checkout
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this h r asset checkout.
	 *
	 * @param companyId the company ID of this h r asset checkout
	 */
	public void setCompanyId(long companyId);

	/**
	 * Gets the user ID of this h r asset checkout.
	 *
	 * @return the user ID of this h r asset checkout
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this h r asset checkout.
	 *
	 * @param userId the user ID of this h r asset checkout
	 */
	public void setUserId(long userId);

	/**
	 * Gets the user uuid of this h r asset checkout.
	 *
	 * @return the user uuid of this h r asset checkout
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this h r asset checkout.
	 *
	 * @param userUuid the user uuid of this h r asset checkout
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Gets the user name of this h r asset checkout.
	 *
	 * @return the user name of this h r asset checkout
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this h r asset checkout.
	 *
	 * @param userName the user name of this h r asset checkout
	 */
	public void setUserName(String userName);

	/**
	 * Gets the create date of this h r asset checkout.
	 *
	 * @return the create date of this h r asset checkout
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this h r asset checkout.
	 *
	 * @param createDate the create date of this h r asset checkout
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Gets the modified date of this h r asset checkout.
	 *
	 * @return the modified date of this h r asset checkout
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this h r asset checkout.
	 *
	 * @param modifiedDate the modified date of this h r asset checkout
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Gets the hr asset ID of this h r asset checkout.
	 *
	 * @return the hr asset ID of this h r asset checkout
	 */
	public long getHrAssetId();

	/**
	 * Sets the hr asset ID of this h r asset checkout.
	 *
	 * @param hrAssetId the hr asset ID of this h r asset checkout
	 */
	public void setHrAssetId(long hrAssetId);

	/**
	 * Gets the hr user ID of this h r asset checkout.
	 *
	 * @return the hr user ID of this h r asset checkout
	 */
	public long getHrUserId();

	/**
	 * Sets the hr user ID of this h r asset checkout.
	 *
	 * @param hrUserId the hr user ID of this h r asset checkout
	 */
	public void setHrUserId(long hrUserId);

	/**
	 * Gets the hr user uuid of this h r asset checkout.
	 *
	 * @return the hr user uuid of this h r asset checkout
	 * @throws SystemException if a system exception occurred
	 */
	public String getHrUserUuid() throws SystemException;

	/**
	 * Sets the hr user uuid of this h r asset checkout.
	 *
	 * @param hrUserUuid the hr user uuid of this h r asset checkout
	 */
	public void setHrUserUuid(String hrUserUuid);

	/**
	 * Gets the checkout date of this h r asset checkout.
	 *
	 * @return the checkout date of this h r asset checkout
	 */
	public Date getCheckoutDate();

	/**
	 * Sets the checkout date of this h r asset checkout.
	 *
	 * @param checkoutDate the checkout date of this h r asset checkout
	 */
	public void setCheckoutDate(Date checkoutDate);

	/**
	 * Gets the expected check in date of this h r asset checkout.
	 *
	 * @return the expected check in date of this h r asset checkout
	 */
	public Date getExpectedCheckInDate();

	/**
	 * Sets the expected check in date of this h r asset checkout.
	 *
	 * @param expectedCheckInDate the expected check in date of this h r asset checkout
	 */
	public void setExpectedCheckInDate(Date expectedCheckInDate);

	/**
	 * Gets the actual check in date of this h r asset checkout.
	 *
	 * @return the actual check in date of this h r asset checkout
	 */
	public Date getActualCheckInDate();

	/**
	 * Sets the actual check in date of this h r asset checkout.
	 *
	 * @param actualCheckInDate the actual check in date of this h r asset checkout
	 */
	public void setActualCheckInDate(Date actualCheckInDate);

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

	public int compareTo(HRAssetCheckout hrAssetCheckout);

	public int hashCode();

	public HRAssetCheckout toEscapedModel();

	public String toString();

	public String toXmlString();
}