
package com.zoho.subscriptions.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.zoho.subscriptions.exception.ZSAPIException;
import com.zoho.subscriptions.net.GenericListParams;
import com.zoho.subscriptions.net.ListResponse;
import com.zoho.subscriptions.net.Resource;
import com.zoho.subscriptions.net.ResourceUtil;

import java.math.BigDecimal;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Transaction extends Resource
{
	String transactionId;

	String referenceId;

	String date;

	String type;

	String status;

	BigDecimal amount;

	public static ListResponse<Transaction> list() throws ZSAPIException
	{
		return list(GenericListParams.getDefaults());
	}

	public static ListResponse<Transaction> list(GenericListParams params) throws ZSAPIException
	{
		return ResourceUtil.list(RequestMethod.GET, classPath(Transaction.class), Transaction.class, params);
	}

	public String getTransactionId()
	{
		return transactionId;
	}

	public void setTransactionId(String transactionId)
	{
		this.transactionId = transactionId;
	}

	public String getReferenceId()
	{
		return referenceId;
	}

	public void setReferenceId(String referenceId)
	{
		this.referenceId = referenceId;
	}

	public String getDate()
	{
		return date;
	}

	public void setDate(String date)
	{
		this.date = date;
	}

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}

	public BigDecimal getAmount()
	{
		return amount;
	}

	public void setAmount(BigDecimal amount)
	{
		this.amount = amount;
	}

}
