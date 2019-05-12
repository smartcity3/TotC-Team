# TotC-Team

Re-Vol (v1.0)

Περιγραφή : 

Οι δημότες μέσα από την εφαρμογή συμμετέχουν σε εθελοντικές δράσεις στον δήμο τους και έτσι επωφελείται ο δήμος αλλά 
και οι ίδιοι αφού ανταμείβονται με μη χρηματικά κίνητρα.Αυτό γίνεται ως εξής, οι χρήστες μέσα απο εθελοντικές δράσεις κατά την 
ολοκλήρωση τους κερδίζουν κάποιους πόντους που γίνονται store σε ένα ηλεκτρονικό πορτοφόλι.Αυτούς τους πόντους μπορούν να τους 
εξαργυρώσουν σε non monetary incentives.

Τεχνολογίες :

- Hyperledger Composer  Blockchain  API
- XML
- PHP
- Native android ( Java )
- SQL
- Node.js
- Docker
- REST API 

Οθόνες εφαρμογής :

Για την δημιουργία του register/login έχει χρησιμοποιηθεί PHP και το API για αυτο βρίσκεται στους άλλους φακέλους τους Project.

Block Chain Hyperledger API/Server :

To blockchain server του Hyperledger  λειτουργεί με Json Objects τα οποία φαίνονται παρακάτω.

- Trader Object

```
{
  "$class": "org.example.mynetwork.Trader",
  "tradeId": "TRADER1",
  "firstName": "User",
  "lastName": "Name"
}
```

- Asset Object 

```
{
  "$class": "org.example.mynetwork.Commodity",
  "tradingSymbol": "RevVolut",
  "description": "RevVolut Currency",
  "mainExchange": "RevVolut",
  "quantity": 10,
  "owner": "resource:org.example.mynetwork.Trader#TRADER2"
}
```

- Trade Object 

```
{
  "$class": "org.example.mynetwork.Trade",
  "commodity": "resource:org.example.mynetwork.Commodity#RevVolut",
  "newOwner": "resource:org.example.mynetwork.Trader#TRADER1"
}
```

- Transaction BlockChain Object

```
{
 "$class": "org.hyperledger.composer.system.UpdateAsset",
 "resources": [
  {
   "$class": "org.example.mynetwork.Commodity",
   "tradingSymbol": "RevVolut",
   "description": "RevVolut Currency",
   "mainExchange": "RevVolut",
   "quantity": 10,
   "owner": "resource:org.example.mynetwork.Trader#TRADER2"
  }
 ],
 "targetRegistry": "resource:org.hyperledger.composer.system.AssetRegistry#org.example.mynetwork.Commodity",
 "transactionId": "5383d525ee869b03577823fc1fb7df62f674cb25008af2c0c73170bd1498178e",
 "timestamp": "2019-05-12T10:21:32.250Z"
}
```

Hyperledger Composer Rest API 
![alt text](https://raw.githubusercontent.com/smartcity3/TotC-Team/c34c2aeffc8a7b63e7f853a5fe2f429945cfe163/REST%20API%20.png)
