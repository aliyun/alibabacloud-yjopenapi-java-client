![](https://aliyunsdk-pages.alicdn.com/icons/AlibabaCloud.svg)

# YuanJing OpenAPI SDK for Java

## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven

## Installation

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.alibaba</groupId>
  <artifactId>alibabacloud-yjopenapi-java-client</artifactId>
  <version>1.0.20221015-beta</version>
</dependency>

or
<!-- independent -->
<dependency>
    <groupId>com.alibaba</groupId>
    <artifactId>alibabacloud-yjopenapi-java-client</artifactId>
    <version>1.0.20221015-beta</version>
    <classifier>shaded</classifier>
    <exclusions>
        <exclusion>
            <groupId>*</groupId>
            <artifactId>*</artifactId>
        </exclusion>
    </exclusions>
</dependency>
```

## Usage

```java
import com.alibaba.yjopenapi.client.api.*;
import com.alibaba.yjopenapi.client.model.*;

Configuration configuration = Configuration.getDefaultConfiguration();
configuration
    .host("host")
    .accessKey("Your Access Key")
    .secretKey("Your Secret Key");

try {
    // {{Api}},{{Method}},{{Param}},{{Result}} is placeholder, take a look at Explain Of Usage Placeholder
    {{Api}} api = new {{Api}}(new ApiClient(), configuration);
    // OpenAPI result
    {{Result}} result = api.{{Method}}({{Param}});

    // OpenAPI result with header
    ApiResponse<{{Result}}> tripleWithHttpInfo = api. {{Method}}WithHttpInfo();
    result = tripleWithHttpInfo.getData();
    // OpenAPI TraceId
    String traceId = tripleWithHttpInfo.getHeaders().get(ApiClient.Trace_Id).get(0);
    // OpenAPI Status Code
    String resultStatus = tripleWithHttpInfo.getHeaders().get(ApiClient.Result_Status).get(0);

} catch (ApiException e) {
    // handle exception
}
```

## Explain Of Usage Placeholder

| Api | Method | Params | Result | Description |
| ------------ | ------------- | ------------- | ------------- | ------------- |
 | *DispatchApi* | **batchStopGame** | *batchStopGameForms*  | *BatchStopGameResult* | 游戏下全量踢下线，异步接口 |
 | *DispatchApi* | **getStock** | *getStockForms*  | *GetStockResult* | 调用GetStock获取游戏当前库存 |
 | *DispatchApi* | **getStopGameToken** | *getStopGameTokenForms*  | *GetStopGameTokenResult* | 全量踢下线获取token |
 | *DispatchApi* | **stopGame** | *stopGameForms*  | *StopGameResult* | 服务端发起，停止某个用户的某个游戏的某个会话 |
 | *DispatchApi* | **tryToGetSlot** | *tryToGetSlotForms*  | *TryToGetSlotResult* | 为用户调度分配游戏容器，容器一旦分配成功会被锁住，一段时间内不再分配给其他用户，过期释放。 |
 | *TokenApi* | **getTriple** |   | *GetTripleResult* | 获取临时安全令牌 |

## License
[Apache-2.0](http://www.apache.org/licenses/LICENSE-2.0)

Copyright (c) 2009-present, Alibaba Cloud All rights reserved.
