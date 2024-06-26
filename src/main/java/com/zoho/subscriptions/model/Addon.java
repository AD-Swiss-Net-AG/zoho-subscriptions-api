
package com.zoho.subscriptions.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.zoho.subscriptions.exception.ZSAPIException;
import com.zoho.subscriptions.net.GenericListParams;
import com.zoho.subscriptions.net.ListResponse;
import com.zoho.subscriptions.net.Resource;
import com.zoho.subscriptions.net.ResourceUtil;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Addon extends Resource
{
	String name;

	String addonCode;

	String productId;

	String accountId;

	String accountName;

	Boolean applicableToAllPlans;

	List<Addon.Plan> plans;

	String type;

	String pricingScheme;

	String unitName;

	String intervalUnit;

	String taxId;

	String taxExemptionId;

	String taxExemptionCode;

	Boolean isTaxable;

	Boolean showInWidget;

	Boolean showInPortal;

	String description;

	@JsonIgnore
	String taxName;
	@JsonIgnore
	BigDecimal taxPercentage;
	@JsonIgnore
	String taxType;

	String productType;

	List<Addon.PriceBracket> priceBrackets;

	@JsonIgnore
	String addonId;

	@JsonIgnore
	String status;

	@JsonIgnore
	Date createdTime;

	@JsonIgnore
	Date updatedTime;

	List<CustomField> customFields;

	List<Tag> tags;

	public static Addon retrieve(String id) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.GET, instancePath(Addon.class, id), Addon.class);
	}

	public static ListResponse<Addon> list() throws ZSAPIException
	{
		return list(GenericListParams.getDefaults());
	}

	public static ListResponse<Addon> list(GenericListParams params) throws ZSAPIException
	{
		return ResourceUtil.list(RequestMethod.GET, classPath(Addon.class), Addon.class, params);
	}

	public static Addon create(Addon addon) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.POST, classPath(Addon.class), Addon.class, addon);
	}

	public static Addon update(Addon addon, String id) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.PUT, instancePath(Addon.class, id), Addon.class, addon);
	}

	public static Addon markAsActive(String id) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.POST, instancePath(Addon.class, id) + "/markasactive", Addon.class);
	}

	public static Addon markAsInactive(String id) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.POST, instancePath(Addon.class, id) + "/markasinactive", Addon.class);
	}

	public static void delete(String id) throws ZSAPIException
	{
		ResourceUtil.process(RequestMethod.DELETE, instancePath(Addon.class, id), Addon.class);
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setAddonCode(String addonCode)
	{
		this.addonCode = addonCode;
	}

	public String getAddonCode()
	{
		return addonCode;
	}

	public void setProductId(String productId)
	{
		this.productId = productId;
	}

	public String getProductId()
	{
		return productId;
	}

	public void setAccountId(String accountId)
	{
		this.accountId = accountId;
	}

	public String getAccountId()
	{
		return accountId;
	}

	public void setAccountName(String accountName)
	{
		this.accountName = accountName;
	}

	public String getAccountName()
	{
		return accountName;
	}

	public void setApplicableToAllPlans(Boolean applicableToAllPlans)
	{
		this.applicableToAllPlans = applicableToAllPlans;
	}

	public Boolean getApplicableToAllPlans()
	{
		return applicableToAllPlans;
	}

	public void setPlans(List<Addon.Plan> plans)
	{
		this.plans = plans;
	}

	public List<Addon.Plan> getPlans()
	{
		return plans;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public String getType()
	{
		return type;
	}

	public void setPricingScheme(String pricingScheme)
	{
		this.pricingScheme = pricingScheme;
	}

	public String getPricingScheme()
	{
		return pricingScheme;
	}

	public void setUnitName(String unitName)
	{
		this.unitName = unitName;
	}

	public String getUnitName()
	{
		return unitName;
	}

	public void setIntervalUnit(String intervalUnit)
	{
		this.intervalUnit = intervalUnit;
	}

	public String getIntervalUnit()
	{
		return intervalUnit;
	}

	public void setPriceBrackets(List<Addon.PriceBracket> priceBrackets)
	{
		this.priceBrackets = priceBrackets;
	}

	public List<Addon.PriceBracket> getPriceBrackets()
	{
		return priceBrackets;
	}

	public String getTaxId()
	{
		return taxId;
	}

	public void setTaxId(String taxId)
	{
		this.taxId = taxId;
	}

	public String getTaxExemptionId()
	{
		return taxExemptionId;
	}

	public void setTaxExemptionId(String taxExemptionId)
	{
		this.taxExemptionId = taxExemptionId;
	}

	public String getTaxExemptionCode()
	{
		return taxExemptionCode;
	}

	public void setTaxExemptionCode(String taxExemptionCode)
	{
		this.taxExemptionCode = taxExemptionCode;
	}

	public Boolean getIsTaxable()
	{
		return isTaxable;
	}

	public void setIsTaxable(Boolean isTaxable)
	{
		this.isTaxable = isTaxable;
	}

	@JsonIgnore
	public String getTaxName()
	{
		return taxName;
	}

	@JsonProperty
	public void setTaxName(String taxName)
	{
		this.taxName = taxName;
	}

	@JsonIgnore
	public BigDecimal getTaxPercentage()
	{
		return taxPercentage;
	}

	@JsonProperty
	public void setTaxPercentage(BigDecimal taxPercentage)
	{
		this.taxPercentage = taxPercentage;
	}

	@JsonIgnore
	public String getTaxType()
	{
		return taxType;
	}

	@JsonProperty
	public void setTaxType(String taxType)
	{
		this.taxType = taxType;
	}

	public String getProductType()
	{
		return productType;
	}

	public void setProductType(String productType)
	{
		this.productType = productType;
	}

	@JsonProperty
	public void setAddonId(String addonId)
	{
		this.addonId = addonId;
	}

	@JsonIgnore
	public String getAddonId()
	{
		return addonId;
	}

	@JsonProperty
	public void setStatus(String status)
	{
		this.status = status;
	}

	@JsonIgnore
	public String getStatus()
	{
		return status;
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

	@JsonProperty
	public void setUpdatedTime(Date updatedTime)
	{
		this.updatedTime = updatedTime;
	}

	@JsonIgnore
	public Date getUpdatedTime()
	{
		return updatedTime;
	}

	public void setShowInWidget(Boolean showInWidget) {
		this.showInWidget = showInWidget;
	}

	public Boolean getShowInWidget() {
		return this.showInWidget;
	}

	public void setShowInPortal(Boolean showInPortal) {
		this.showInPortal = showInPortal;
	}

	public Boolean getShowInPortal() {
		return this.showInPortal;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class Plan extends Resource
	{
		String planCode;

		@JsonIgnore
		String name;

		public void setPlanCode(String planCode)
		{
			this.planCode = planCode;
		}

		public String getPlanCode()
		{
			return planCode;
		}

		@JsonProperty
		public void setName(String name)
		{
			this.name = name;
		}

		@JsonIgnore
		public String getName()
		{
			return name;
		}

	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class PriceBracket extends Resource
	{
		Integer startQuantity;

		Integer endQuantity;

		BigDecimal price;

		public void setStartQuantity(Integer startQuantity)
		{
			this.startQuantity = startQuantity;
		}

		public Integer getStartQuantity()
		{
			return startQuantity;
		}

		public void setEndQuantity(Integer endQuantity)
		{
			this.endQuantity = endQuantity;
		}

		public Integer getEndQuantity()
		{
			return endQuantity;
		}

		public void setPrice(BigDecimal price)
		{
			this.price = price;
		}

		public BigDecimal getPrice()
		{
			return price;
		}
	}

	public void setCustomFields(List<CustomField> customFields)
	{
		this.customFields = customFields;
	}

	public List<CustomField> getCustomFields()
	{
		return customFields;
	}

	public void setTags(List<Tag> tags)
	{
		this.tags=tags;
	}

	public List<Tag> getTags(){
		return tags;
	}

}
