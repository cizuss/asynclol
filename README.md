# asynclol
An asyncrhonous Java client for the League of Legends developer API, based on Finagle and Twitter Futures.

# Usage
1. Login to developer.riotgames.com and get yourself an API key.
2. Create an instance of the `Client` class by selecting a region and using the previous API key.
```java
String apiKey = "<your-api-key>";
Client client = new Client(APIHost.NA, apiKey);
```
3. Use the client, duh! :D
```java
Future<SummonerDTO> summonerFuture = client.getSummonerByName("foggedftw2");
```