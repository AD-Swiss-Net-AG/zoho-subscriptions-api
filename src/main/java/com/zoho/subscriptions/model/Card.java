
package com.zoho.subscriptions.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.zoho.subscriptions.exception.ZSAPIException;
import com.zoho.subscriptions.net.Resource;
import com.zoho.subscriptions.net.ResourceUtil;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Card extends Resource
{
	String cardId;
	
	String customerId;

	String status;

	String lastFourDigits;

	String expiryMonth;

	String expiryYear;

	@JsonIgnore
	Date createdTime;

	String cardNumber;

	String cvvNumber;

	String firstName;

	String lastName;

	String street;

	String city;

	String state;

	String country;

	String zip;

	String paymentGateway;
	@JsonIgnore
	Integer subscriptionCount;
	String cardType;

	String gatewayReferenceId;

	String gatewayCardId;

	String gatewayCustomerId;

	String address;

	String funding;

	public static Card retrieve(String customerId,String cardId) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.GET, instancePath(Customer.class, customerId)+"/cards/"+cardId, Card.class);
	}
	public static void delete(String customerId,String cardId) throws ZSAPIException
	{
		ResourceUtil.process(RequestMethod.DELETE, instancePath(Customer.class, customerId)+"/cards/"+cardId, Card.class);
	}

	public void setCardId(String cardId)
	{
		this.cardId = cardId;
	}

	public String getCardId()
	{
		return cardId;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}

	public String getStatus()
	{
		return status;
	}
	
	public void setCustomerId(String customerId)
	{
		this.customerId=customerId;
	}
	public String getCustomerId()
	{
		return customerId;
	}

	public void setLastFourDigits(String lastFourDigits)
	{
		this.lastFourDigits = lastFourDigits;
	}

	public String getLastFourDigits()
	{
		return lastFourDigits;
	}

	public void setExpiryMonth(String expiryMonth)
	{
		this.expiryMonth = expiryMonth;
	}

	public String getExpiryMonth()
	{
		return expiryMonth;
	}

	public void setExpiryYear(String expiryYear)
	{
		this.expiryYear = expiryYear;
	}

	public String getExpiryYear()
	{
		return expiryYear;
	}

	@JsonProperty
	public void setCreatedTime(Date createdTime)
	{
		this.createdTime = createdTime;
	}

	@JsonIgnore
	public Date getCreatedTime()
	{
		return createdTime;
	}

	public void setCardNumber(String cardNumber)
	{
		this.cardNumber = cardNumber;
	}

	public String getCardNumber()
	{
		return cardNumber;
	}

	public void setCvvNumber(String cvvNumber)
	{
		this.cvvNumber = cvvNumber;
	}

	public String getCvvNumber()
	{
		return cvvNumber;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setStreet(String street)
	{
		this.street = street;
	}

	public String getStreet()
	{
		return street;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public String getCity()
	{
		return city;
	}

	public void setState(String state)
	{
		this.state = state;
	}

	public String getState()
	{
		return state;
	}

	public void setCountry(String country)
	{
		this.country = country;
	}

	public String getCountry()
	{
		return country;
	}

	public void setZip(String zip)
	{
		this.zip = zip;
	}

	public String getZip()
	{
		return zip;
	}

	public String getPaymentGateway()
	{
		return paymentGateway;
	}

	public void setPaymentGateway(String paymentGateway)
	{
		this.paymentGateway = paymentGateway;
	}

	@JsonIgnore
	public Integer getSubscriptionCount()
	{
		return subscriptionCount;
	}

	@JsonProperty
	public void setSubscriptionCount(Integer subscriptionCount)
	{
		this.subscriptionCount = subscriptionCount;
	}

	public String getCardType()
	{
		return cardType;
	}

	public void setCardType(String cardType)
	{
		this.cardType = cardType;
	}

	public String getGatewayReferenceId()
	{
		return gatewayReferenceId;
	}

	public void setGatewayReferenceId(String gatewayReferenceId)
	{
		this.gatewayReferenceId = gatewayReferenceId;
	}

	public String getGatewayCardId()
	{
		return gatewayCardId;
	}

	public void setGatewayCardId(String gatewayCardId)
	{
		this.gatewayCardId = gatewayCardId;
	}

	public String getGatewayCustomerId()
	{
		return gatewayCustomerId;
	}

	public void setGatewayCustomerId(String gatewayCustomerId)
	{
		this.gatewayCustomerId = gatewayCustomerId;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public void setFunding(String funding)
	{
		this.funding = funding;
	}

	public String getFunding()
	{
		return funding;
	}

}
