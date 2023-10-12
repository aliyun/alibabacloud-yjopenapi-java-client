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
  <version>1.0.20231012-test</version>
</dependency>

or
<!-- independent -->
<dependency>
    <groupId>com.alibaba</groupId>
    <artifactId>alibabacloud-yjopenapi-java-client</artifactId>
    <version>1.0.20231012-test</version>
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
 | *DevhubApi* | **downloadGameLogOver** |   | *DevHubDownloadGameLogOverResult* | downloadGameLogOver |
 | *DevhubApi* | **queryGameProject** |   | *DevHubQueryGameProjectResult* | openapiDevhubQueryGameProject |
 | *DevhubApi* | **queryGameProjectVersion** |   | *DevHubQueryGameProjectVersionResult* | queryGameProjectVersion |
 | *TokenApi* | **getPair** |   | *GetPairResult* | 获取临时安全令牌(二元组) |
 | *TokenApi* | **getTriple** |   | *GetTripleResult* | 获取临时安全令牌 |

## License
[Apache-2.0](http://www.apache.org/licenses/LICENSE-2.0)

Copyright (c) 2009-present, Alibaba Cloud All rights reserved.
