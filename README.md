# Campaign Standard API

#How to use, a short demonstration

## Authentication

```java
String jwtToken = "xxxxx_Your_JWT_Token_Here_xxxxx";
String apiKey = "xxxxx_Your_API_Key_Here_xxxxx";
String clientSecret = "xxxxx_Your_Client_Secret_Here_xxxxx";

ExchangeClient exchange = new ExchangeClient();

exchange.setEndpoint("https://ims-na1.adobelogin.com/ims/exchange/jwt/");
exchange.setApiKey(apiKey);
exchange.setClientSecret(clientSecret);
exchange.setJwtToken(jwtToken);

// this will exchange your JWT token for an access token
exchange.retrieveAccessToken();

String accessToken = exchange.getAccessToken();
```

## Setting up the client

```java
String tenant = "xxxxx_The_Name_Of_Your_Instance_Here_xxxxx";

CampaignClient campaign = new CampaignClient();
campaign.setTenant(tenant);
campaign.setApiKey(apiKey);
campaign.setAccessToken(accessToken);
// the service is now configured and ready to be used
```

## Retrieving the list of services available in Campaign

```java
List<Service> newsCategories = null;
ServicesResponse campaignServices;

campaignServices = campaign.getServices();
newsCategories = campaignServices.getServices();

System.out.println("Services:");
for (Service s: newsCategories) {
	System.out.println(s.getLabel() + " (" + s.getName() + ") - " + s.getPKey());
}
```

## Retrieving a profile

```java
String martonPrimaryKey = "thePrimaryKeyOfThatGuy";
Profile martonProfile = campaign.getProfile(martinPrimaryKey);
```

##Getting the subscriptions for a given profile

```java
// this is the URL to use to access that person's subscriptions
CampaignServiceUrl martonSubscriptionsUrl = martonProfile.getUrlToSubscriptions();

SubscriptionsResponse subscriptionsResponse = campaign.getSubscriptions(martonSubscriptionsUrl);
System.out.println("Is subscribed to:");
List<Subscription> subscriptionsForMarton = subscriptionsResponse.getSubscriptions();
for (Subscription s: subscriptionsForMarton) {
	System.out.println(s.getTitle());
}
```

##Unsubscribing from all the services
