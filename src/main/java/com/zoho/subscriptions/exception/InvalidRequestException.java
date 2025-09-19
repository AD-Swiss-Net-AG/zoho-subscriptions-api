

package com.zoho.subscriptions.exception;

public class InvalidRequestException extends ZSAPIException
{
	private final String paramName;

	public InvalidRequestException(String message, Throwable e)
	{
		this(message, e, null);
	}

	public InvalidRequestException(String message, Throwable e, String param)
	{
		super(message, e);
		this.paramName = param;
	}

	public String getParamName()
	{
		return this.paramName;
	}
}
