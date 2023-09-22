

package com.zoho.subscriptions.exception;

public class APIConnectionException extends ZSAPIException
{
	public APIConnectionException(String message, Throwable e)
	{
		super(message, e);
	}

	public APIConnectionException(String message)
	{
		super(message);
	}
}
