

package com.zoho.subscriptions.net;

import com.zoho.subscriptions.exception.APIConnectionException;

public class ZSClient
{

	static final String CHARSET = "UTF-8";

	static final String DEFAULT_ACCEPT_HEADER = "application/json";

	static String host = "www.zohoapis.com";

	static String version = "v1";

	static String oauthtoken;

	static String organizationId;

	static String userAgentName = "ZohoSubscriptions-Java-Client";

	private static String getDefaults(String propName, String defValue)
	{
		String value = System.getProperty(propName);
		return (value == null || value.trim().isEmpty()) ? defValue : value.trim();
	}

	public static void setHost(String host)
	{
		ZSClient.host = host;
	}

	public static void setVersion(String version)
	{
		ZSClient.version = version;
	}

	public static void setOauthtoken(String oauthtoken) throws Exception
	{
		if (oauthtoken == null || oauthtoken.trim().isEmpty())
		{
			throw new Exception("OauthToken to speak with Zoho Subscriptions is not set. Please set the oauthtoken in System property");
		}
		ZSClient.oauthtoken = oauthtoken;
	}

	public static void setOrganizationId(String organizationId)
	{
		ZSClient.organizationId = organizationId;
	}

	public static void setUserAgentName(String userAgentName)
	{
		ZSClient.userAgentName = userAgentName;
	}

	protected static String getHost()
	{
		return host;
	}

	protected static String getVersion()
	{
		return version;
	}

	protected static String getBaseUrl()
	{
		return "https://" + getHost() + "/billing/" + getVersion();
	}

	protected static String getOauthtoken() throws Exception
	{
		if (oauthtoken == null || oauthtoken.trim().isEmpty())
		{
			throw new APIConnectionException("OauthToken to speak with Zoho Subscriptions is not set. Please set the oauthtoken in System property");
		}
		return oauthtoken;
	}

	protected static String getOrganizationId()
	{
		return organizationId;
	}

	protected static String getUserAgentName()
	{
		return userAgentName;
	}

}
