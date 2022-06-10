<section style="
  display: flex;
  align-items: center;
  justify-content: center;">
  <img src="./static/img/logo/logo-256_x_256.png" />
</Section>

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.binance4j/binance4j-core/badge.svg)](https://search.maven.org/search?q=com.binance4j)
[![Sonatype Nexus](https://img.shields.io/nexus/r/com.binance4j/binance4j-core?server=https%3A%2F%2Fs01.oss.sonatype.org%2F)](https://s01.oss.sonatype.org/#nexus-search;quick~com.binance4j)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
![JDK](https://upload.wikimedia.org/wikipedia/commons/7/75/Blue_JDK_1.8%2B_Shield_Badge.svg)

Java connectors and technical analysis for the Binance API

## Documentation

[Link](https://binance4j.github.io/binance4j-documentation/)

# binance4j-market

![Build Status develop](https://img.shields.io/github/workflow/status/binance4j/binance4j-market/deploy?label=Test)
[![javadoc](https://img.shields.io/badge/javadoc-latest-informational)](https://binance4j.github.io/binance4j-market)

## Description

Java connector for the market endpoints of the Binance REST API.

## Features

- Test the API connectivity
- Get the server time
- Get the exchange trading rules and symbols informations.
- Get symbols order book
- Get symbols best price/quantity on the order book
- Get recent/historical trades
- Get aggregate trades
- Get candlesticks
- Get symbols average/latest price
- Get symbols 24 hour rolling window price change statistics

## Installation

### Maven

```xml
<dependency>
  <groupId>com.binance4j</groupId>
  <artifactId>binance4j-market</artifactId>
  <version>1.7.3</version>
</dependency>
```

# binance4j-nft

![Build Status develop](https://img.shields.io/github/workflow/status/binance4j/binance4j-nft/deploy?label=Test)
[![javadoc](https://img.shields.io/badge/javadoc-latest-informational)](https://binance4j.github.io/binance4j-nft)

## Description

Java connector for the NFT endpoints of the Binance REST API.

## Features

- Get NFT Transaction History
- Get NFT Deposit History
- Get NFT Withdraw History
- Get NFT Asset

## Installation

### Maven

```xml
<dependency>
  <groupId>com.binance4j</groupId>
  <artifactId>binance4j-nft</artifactId>
  <version>1.7.3</version>
</dependency>
```

# binance4j-spot

![Build Status develop](https://img.shields.io/github/workflow/status/binance4j/binance4j-spot/deploy?label=Test)
[![javadoc](https://img.shields.io/badge/javadoc-latest-informational)](https://binance4j.github.io/binance4j-spot)


## Description

Java connector for the SPOT endpoints of the Binance REST API.

## Features

- Send orders
- Cancel orders
- Get orders status
- Get account informations
- Get past trades
- Get order count for API order rate limiting

## Installation

### Maven

```xml
<dependency>
  <groupId>com.binance4j</groupId>
  <artifactId>binance4j-spot</artifactId>
  <version>1.7.3</version>
</dependency>
```

# binance4j-strategy

![Build Status develop](https://img.shields.io/github/workflow/status/binance4j/binance4j-strategy/deploy?label=Test)
[![javadoc](https://img.shields.io/badge/javadoc-latest-informational)](https://binance4j.github.io/binance4j-strategy)

## Description

Technical analysis for the binance4j ecosystem.

## Features

- Create trading strategies
- Analyse strategy with ta4j
- Backtest strategy with external klines/bar series or Binance public klines with binance4j-vision
- Live trade on Binance streams with binance4j-websocket
- Live trade on multiple symbols

## Installation

### Maven

```xml
<dependency>
  <groupId>com.binance4j</groupId>
  <artifactId>binance4j-strategy</artifactId>
  <version>1.7.3</version>
</dependency>
```

# binance4j-vision

![Build Status develop](https://img.shields.io/github/workflow/status/binance4j/binance4j-vision/deploy?label=Test)
[![javadoc](https://img.shields.io/badge/javadoc-latest-informational)](https://binance4j.github.io/binance4j-vision)

## Description

Java connector for the public data endpoints of the Binance REST API.

## Features

### SPOT

- Get historical daily/monthly klines
- Get historical daily/monthly trades
- Get historical daily/monthly aggregate trades

### FUTURES

coming soon

## Installation

### Maven

```xml
<dependency>
  <groupId>com.binance4j</groupId>
  <artifactId>binance4j-vision</artifactId>
  <version>1.7.3</version>
</dependency>
```

# binance4j-wallet

![Build Status develop](https://img.shields.io/github/workflow/status/binance4j/binance4j-wallet/Deploy%20Artifact%20on%20Maven%20then%20merge%20on%20main/deploy?label=Test)
[![javadoc](https://img.shields.io/badge/javadoc-latest-informational)](https://binance4j.github.io/binance4j-wallet)

## Description

Java connector for the wallet enpoints of the Binance REST API.

## Features

- Get the system status
- Get coins informations
- Get account daily snapshots
- Get account status
- Get API trading status
- Get API permissions
- Deposit/withdraw funds
- Get deposit/withdraw history
- Do a dust transfer
- Get dust transfer logs
- Get assets convertible into BNB
- Get asset dividend record
- Get asset details
- Get trade fees
- Transfer funds between account wallets
- Get transfer history
- Get funding wallet asset balance

## Installation

### Maven

```xml
<dependency>
  <groupId>com.binance4j</groupId>
  <artifactId>binance4j-wallet</artifactId>
  <version>1.7.3</version>
</dependency>
```

# binance4j-websocket

![Build Status develop](https://img.shields.io/github/workflow/status/binance4j/binance4j-websocket/deploy?label=Test)
[![javadoc](https://img.shields.io/badge/javadoc-latest-informational)](https://binance4j.github.io/binance4j-websocket)

## Description

Java connectors for the Binance Websocket API.

## Features

- Real time order book events
- Real time symbol tickers events
- Real time kline events
- Real time trades events
- Real time user data / balance events
- Auto ping and auto pong
- Auto reconnection on connection failure and disconnection by the server
- Auto call to keep alive listen key for user data stream

## Installation

### Maven

```xml
<dependency>
  <groupId>com.binance4j</groupId>
  <artifactId>binance4j-websocket</artifactId>
  <version>1.7.3</version>
</dependency>
```

# binance4j-core

![Build Status develop](https://img.shields.io/github/workflow/status/binance4j/binance4j-core/deploy?label=Test)
[![javadoc](https://img.shields.io/badge/javadoc-latest-informational)](https://binance4j.github.io/binance4j-core)

The core module of the binance4j ecosystem.

## Installation

### Maven

```xml
<dependency>
  <groupId>com.binance4j</groupId>
  <artifactId>binance4j-core</artifactId>
  <version>1.7.3</version>
</dependency>
```
