# Zoho Subscriptions Java Client Library

## Prologue

An open source Java Client library for integrating with Zoho Subscriptions Billing Solution

This is a fork of https://github.com/zoho/subscriptions-java-client. It used outdated dependencies.

So we decided to update dependencies and mavenized the project for easier dependency-injection.

## Usage
Import the Zoho Subscriptions Java Client Library to your project through maven:

    <dependency>
        <groupId>ch.adswiss.utils</groupId>
        <artifactId>zoho-subscriptions-api</artifactId>
        <version>3.0.0</version>
    </dependency>

### Setup


**SetUp Organization ID and OAuth Access Token**

1. Get Organization Id <a href="https://www.zohoapis.com/billing/v1/#organization-id">refer</a>
2. Generate oauth token using <a href="https://www.zohoapis.com/billing/v1/#oauth">API Reference</a>

##### Sample Code:

<pre><code>import com.zoho.subscription.net.*;
import java.io.IOException;
import java.util.*;
public class Main {
    public static void main (String args[]) throws Exception
    {
        ZSClient object = new ZSClient();
        object.setOauthtoken("{{Zoho Subscriptions Oauth Token}}");
        object.setOrganizationId("{{Zoho Organization ID}}");
    }
}</code></pre>

## How to use

Use the below sample code for Customer Creation refer <a href="https://www.zohoapis.com/billing/v1/#Customers_Create_a_customer">Api Docs</a>

Example to create a Customer:

<pre><code>import com.zoho.subscription.net.*;
import com.zoho.subscription.model.*;
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;
public class Main {
    public static void main (String args[]) throws Exception
    {
        ZSClient object = new ZSClient();
        object.setOauthtoken("{{Zoho Subscriptions Oauth Token}}");
        object.setOrganizationId("{{Zoho Organization ID}}");
        ObjectMapper mapper = new ObjectMapper();
        Customer customer=new Customer();
        customer.setDisplayName("Patricia Boyale");
        customer.setEmail("patricia.boyale@zylker.com");
        customer.setPhone("9876543210");
     

        Customer new_customer = new Customer();
        new_customer = Customer.create(customer);
        System.out.println(new_customer.getCustomerId())
    }
}</pre></code>


## License

See the LICENCE file.
