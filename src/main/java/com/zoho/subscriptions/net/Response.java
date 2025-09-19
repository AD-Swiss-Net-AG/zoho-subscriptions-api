
package com.zoho.subscriptions.net;

import java.util.List;
import java.util.Map;

public class Response
{
	private final int httpStatus;

	private final Object body;

	private final boolean error;

	private final Map<String, List<String>> headerFields;

	public Response(int code, Object b, Map<String, List<String>> headerFields)
	{
		this.httpStatus = code;
		this.error = (this.httpStatus < 200 || this.httpStatus > 299);
		this.body = b;
		this.headerFields = headerFields;
	}

	public int getHttpStatus()
	{
		return httpStatus;
	}

	public boolean isError()
	{
		return this.error;
	}

	public Object getBody()
	{
		return body;
	}

	public Map<String, List<String>> getHeaderFields()
	{
		return headerFields;
	}

}
