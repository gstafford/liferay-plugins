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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author    Wesley Gong
 * @generated
 */
public class HRProjectSoap implements Serializable {
	public static HRProjectSoap toSoapModel(HRProject model) {
		HRProjectSoap soapModel = new HRProjectSoap();

		soapModel.setHrProjectId(model.getHrProjectId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setHrClientId(model.getHrClientId());
		soapModel.setHrProjectStatusId(model.getHrProjectStatusId());
		soapModel.setName(model.getName());
		soapModel.setDescription(model.getDescription());
		soapModel.setEstimatedStartDate(model.getEstimatedStartDate());
		soapModel.setEstimatedEndDate(model.getEstimatedEndDate());
		soapModel.setEstimatedHours(model.getEstimatedHours());
		soapModel.setEstimatedHoursCost(model.getEstimatedHoursCost());
		soapModel.setEstimatedHoursCostCurrencyCode(model.getEstimatedHoursCostCurrencyCode());
		soapModel.setEstimatedExpenses(model.getEstimatedExpenses());
		soapModel.setEstimatedExpensesCurrencyCode(model.getEstimatedExpensesCurrencyCode());
		soapModel.setActualStartDate(model.getActualStartDate());
		soapModel.setActualEndDate(model.getActualEndDate());
		soapModel.setActualHours(model.getActualHours());
		soapModel.setActualHoursCost(model.getActualHoursCost());
		soapModel.setActualHoursCostCurrencyCode(model.getActualHoursCostCurrencyCode());
		soapModel.setActualExpenses(model.getActualExpenses());
		soapModel.setActualExpensesCurrencyCode(model.getActualExpensesCurrencyCode());

		return soapModel;
	}

	public static HRProjectSoap[] toSoapModels(HRProject[] models) {
		HRProjectSoap[] soapModels = new HRProjectSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static HRProjectSoap[][] toSoapModels(HRProject[][] models) {
		HRProjectSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new HRProjectSoap[models.length][models[0].length];
		}
		else {
			soapModels = new HRProjectSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static HRProjectSoap[] toSoapModels(List<HRProject> models) {
		List<HRProjectSoap> soapModels = new ArrayList<HRProjectSoap>(models.size());

		for (HRProject model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new HRProjectSoap[soapModels.size()]);
	}

	public HRProjectSoap() {
	}

	public long getPrimaryKey() {
		return _hrProjectId;
	}

	public void setPrimaryKey(long pk) {
		setHrProjectId(pk);
	}

	public long getHrProjectId() {
		return _hrProjectId;
	}

	public void setHrProjectId(long hrProjectId) {
		_hrProjectId = hrProjectId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getHrClientId() {
		return _hrClientId;
	}

	public void setHrClientId(long hrClientId) {
		_hrClientId = hrClientId;
	}

	public long getHrProjectStatusId() {
		return _hrProjectStatusId;
	}

	public void setHrProjectStatusId(long hrProjectStatusId) {
		_hrProjectStatusId = hrProjectStatusId;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public Date getEstimatedStartDate() {
		return _estimatedStartDate;
	}

	public void setEstimatedStartDate(Date estimatedStartDate) {
		_estimatedStartDate = estimatedStartDate;
	}

	public Date getEstimatedEndDate() {
		return _estimatedEndDate;
	}

	public void setEstimatedEndDate(Date estimatedEndDate) {
		_estimatedEndDate = estimatedEndDate;
	}

	public double getEstimatedHours() {
		return _estimatedHours;
	}

	public void setEstimatedHours(double estimatedHours) {
		_estimatedHours = estimatedHours;
	}

	public double getEstimatedHoursCost() {
		return _estimatedHoursCost;
	}

	public void setEstimatedHoursCost(double estimatedHoursCost) {
		_estimatedHoursCost = estimatedHoursCost;
	}

	public String getEstimatedHoursCostCurrencyCode() {
		return _estimatedHoursCostCurrencyCode;
	}

	public void setEstimatedHoursCostCurrencyCode(
		String estimatedHoursCostCurrencyCode) {
		_estimatedHoursCostCurrencyCode = estimatedHoursCostCurrencyCode;
	}

	public double getEstimatedExpenses() {
		return _estimatedExpenses;
	}

	public void setEstimatedExpenses(double estimatedExpenses) {
		_estimatedExpenses = estimatedExpenses;
	}

	public String getEstimatedExpensesCurrencyCode() {
		return _estimatedExpensesCurrencyCode;
	}

	public void setEstimatedExpensesCurrencyCode(
		String estimatedExpensesCurrencyCode) {
		_estimatedExpensesCurrencyCode = estimatedExpensesCurrencyCode;
	}

	public Date getActualStartDate() {
		return _actualStartDate;
	}

	public void setActualStartDate(Date actualStartDate) {
		_actualStartDate = actualStartDate;
	}

	public Date getActualEndDate() {
		return _actualEndDate;
	}

	public void setActualEndDate(Date actualEndDate) {
		_actualEndDate = actualEndDate;
	}

	public double getActualHours() {
		return _actualHours;
	}

	public void setActualHours(double actualHours) {
		_actualHours = actualHours;
	}

	public double getActualHoursCost() {
		return _actualHoursCost;
	}

	public void setActualHoursCost(double actualHoursCost) {
		_actualHoursCost = actualHoursCost;
	}

	public String getActualHoursCostCurrencyCode() {
		return _actualHoursCostCurrencyCode;
	}

	public void setActualHoursCostCurrencyCode(
		String actualHoursCostCurrencyCode) {
		_actualHoursCostCurrencyCode = actualHoursCostCurrencyCode;
	}

	public double getActualExpenses() {
		return _actualExpenses;
	}

	public void setActualExpenses(double actualExpenses) {
		_actualExpenses = actualExpenses;
	}

	public double getActualExpensesCurrencyCode() {
		return _actualExpensesCurrencyCode;
	}

	public void setActualExpensesCurrencyCode(double actualExpensesCurrencyCode) {
		_actualExpensesCurrencyCode = actualExpensesCurrencyCode;
	}

	private long _hrProjectId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _hrClientId;
	private long _hrProjectStatusId;
	private String _name;
	private String _description;
	private Date _estimatedStartDate;
	private Date _estimatedEndDate;
	private double _estimatedHours;
	private double _estimatedHoursCost;
	private String _estimatedHoursCostCurrencyCode;
	private double _estimatedExpenses;
	private String _estimatedExpensesCurrencyCode;
	private Date _actualStartDate;
	private Date _actualEndDate;
	private double _actualHours;
	private double _actualHoursCost;
	private String _actualHoursCostCurrencyCode;
	private double _actualExpenses;
	private double _actualExpensesCurrencyCode;
}