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
  <version>1.1.20240703</version>
</dependency>

or
<!-- independent -->
<dependency>
    <groupId>com.alibaba</groupId>
    <artifactId>alibabacloud-yjopenapi-java-client</artifactId>
    <version>1.1.20240703</version>
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
 | *AdaptApi* | **createAndSubmitAll** | *createAndSubmitAllForms*  | *AdaptCreateAndSubmitAllResult* | createAndSubmitAll |
 | *AdaptApi* | **queryRequestById** | *queryRequestByIdForms*  | *AdaptQueryRequestByIdResult* | queryRequestById |
 | *ConsoleAdminApi* | **activateDeployment** | *activateDeploymentForms*  | *ConsoleAdminActivateDeploymentResult* |  |
 | *ConsoleAdminApi* | **adaptGameVersion** | *adaptGameVersionForms*  | *ConsoleAdminAdaptGameVersionResult* |  |
 | *ConsoleAdminApi* | **addGameToProject** | *addGameToProjectForms*  | *ConsoleAdminAddGameToProjectResult* |  |
 | *ConsoleAdminApi* | **batchUpdateDispatchConfig** | *batchUpdateDispatchConfigForms*  | *ConsoleAdminBatchUpdateDispatchConfigResult* | 批量更新游戏各自调度配置 |
 | *ConsoleAdminApi* | **createGame** | *createGameForms*  | *ConsoleAdminCreateGameResult* |  |
 | *ConsoleAdminApi* | **createOrder** | *createOrderForms*  | *ConsoleAdminCreateOrderResult* | 订单下单 |
 | *ConsoleAdminApi* | **createProject** | *createProjectForms*  | *ConsoleAdminCreateProjectResult* |  |
 | *ConsoleAdminApi* | **deleteGame** | *deleteGameForms*  | *ConsoleAdminDeleteGameResult* |  |
 | *ConsoleAdminApi* | **deleteGameVersion** | *deleteGameVersionForms*  | *ConsoleAdminDeleteGameVersionResult* |  |
 | *ConsoleAdminApi* | **deleteProject** | *deleteProjectForms*  | *ConsoleAdminDeleteProjectResult* |  |
 | *ConsoleAdminApi* | **getBillFlowInfo** | *getBillFlowInfoForms*  | *ConsoleAdminGetBillFlowInfoResult* |  |
 | *ConsoleAdminApi* | **getGameInstanceContainerRatio** | *getGameInstanceContainerRatioForms*  | *ConsoleAdminGetGameInstanceContainerRatioResult* |  |
 | *ConsoleAdminApi* | **getGameRecommendedInstance** | *getGameRecommendedInstanceForms*  | *ConsoleAdminGetGameRecommendedInstanceResult* |  |
 | *ConsoleAdminApi* | **getGameVersion** | *getGameVersionForms*  | *ConsoleAdminGetGameVersionResult* |  |
 | *ConsoleAdminApi* | **getGameVersionProgress** | *getGameVersionProgressForms*  | *ConsoleAdminGetGameVersionProgressResult* |  |
 | *ConsoleAdminApi* | **getOrder** | *getOrderForms*  | *ConsoleAdminGetOrderResult* | 查询订单 |
 | *ConsoleAdminApi* | **listActivateableInstances** | *listActivateableInstancesForms*  | *ConsoleAdminListActivateableInstancesResult* |  |
 | *ConsoleAdminApi* | **listActivatedInstances** | *listActivatedInstancesForms*  | *ConsoleAdminListActivatedInstancesResult* |  |
 | *ConsoleAdminApi* | **listControllersOfGame** | *listControllersOfGameForms*  | *ConsoleAdminListControllersOfGameResult* |  |
 | *ConsoleAdminApi* | **listDeployableInstances** | *listDeployableInstancesForms*  | *ConsoleAdminListDeployableInstancesResult* |  |
 | *ConsoleAdminApi* | **listGameCcu** | *listGameCcuForms*  | *ConsoleAdminListGameCcuResult* | 分游戏实时并发 |
 | *ConsoleAdminApi* | **listGameDeployDetailsOfProject** | *listGameDeployDetailsOfProjectForms*  | *ConsoleAdminListGameDeployDetailsOfProjectResult* | 获取项目下游戏部署版本信息。 |
 | *ConsoleAdminApi* | **listGameVersions** | *listGameVersionsForms*  | *ConsoleAdminListGameVersionsResult* |  |
 | *ConsoleAdminApi* | **listGames** | *listGamesForms*  | *ConsoleAdminListGamesResult* |  |
 | *ConsoleAdminApi* | **listInstancesOfProject** | *listInstancesOfProjectForms*  | *ConsoleAdminListInstancesOfProjectResult* | 分页获取项目中的实例 |
 | *ConsoleAdminApi* | **listMonthBill** | *listMonthBillForms*  | *ConsoleAdminListMonthBillResult* | 月度账单列表 |
 | *ConsoleAdminApi* | **listProjects** | *listProjectsForms*  | *ConsoleAdminListProjectsResult* |  |
 | *ConsoleAdminApi* | **listVersionDeployInstances** | *listVersionDeployInstancesForms*  | *ConsoleAdminListVersionDeployInstancesResult* | 获取项目下游戏版本的部署实例信息。 |
 | *ConsoleAdminApi* | **queryAdaptResultByVersionId** | *queryAdaptResultByVersionIdForms*  | *ConsoleAdminQueryAdaptResultByVersionIdResult* | 查询适配结果 |
 | *ConsoleAdminApi* | **recommendSpecification** | *recommendSpecificationForms*  | *ConsoleAdminRecommendSpecificationResult* |  |
 | *ConsoleAdminApi* | **removeGameFromProject** | *removeGameFromProjectForms*  | *ConsoleAdminRemoveGameFromProjectResult* |  |
 | *ConsoleAdminApi* | **rtOverView** | *rtOverViewForms*  | *ConsoleAdminRtOverViewResult* | 实时并发数 |
 | *ConsoleAdminApi* | **rtTrend** | *rtTrendForms*  | *ConsoleAdminRtTrendResult* | 实时并发趋势图 |
 | *ConsoleAdminApi* | **submitDeployment** | *submitDeploymentForms*  | *ConsoleAdminSubmitDeploymentResult* |  |
 | *ConsoleAdminApi* | **uploadGameVersionByDownload** | *uploadGameVersionByDownloadForms*  | *ConsoleAdminUploadGameVersionByDownloadResult* |  |
 | *DispatchApi* | **batchStopGame** | *batchStopGameForms*  | *BatchStopGameResult* |  |
 | *DispatchApi* | **cancelGameHang** | *cancelGameHangForms*  | *CancelGameHangResult* | 取消游戏挂机 |
 | *DispatchApi* | **clientNotify** | *clientNotifyForms*  | *ClientNotifyResult* | clientNotify |
 | *DispatchApi* | **gameNotify** | *gameNotifyForms*  | *GameNotifyResult* | 游戏通知接口 |
 | *DispatchApi* | **getGameConcurrency** | *getGameConcurrencyForms*  | *GetGameConcurrencyResult* | 调用GetGameConcurrency获取游戏当前并发数 |
 | *DispatchApi* | **getStock** | *getStockForms*  | *GetStockResult* | 调用GetStock获取游戏当前库存 |
 | *DispatchApi* | **getStopGameToken** | *getStopGameTokenForms*  | *GetStopGameTokenResult* | 全量踢下线获取token |
 | *DispatchApi* | **listGameServerIp** | *listGameServerIpForms*  | *ListGameServerIpResult* |  |
 | *DispatchApi* | **queryGameHang** | *queryGameHangForms*  | *QueryGameHangResult* | 查询游戏挂机状态 |
 | *DispatchApi* | **querySessionStatus** | *querySessionStatusForms*  | *QuerySessionStatusResult* | 查询会话当前状态 |
 | *DispatchApi* | **replaceSlot** | *replaceSlotForms*  | *ReplaceSlotResult* | replaceSlot |
 | *DispatchApi* | **setGameAlive** | *setGameAliveForms*  | *SetGameAliveResult* | 设置游戏可运行时长 |
 | *DispatchApi* | **setGameHang** | *setGameHangForms*  | *SetGameHangResult* | 设置游戏挂机 |
 | *DispatchApi* | **stopGame** | *stopGameForms*  | *StopGameResult* | 服务端发起，停止某个用户的某个游戏的某个会话 |
 | *DispatchApi* | **stopPreopenContainer** | *stopPreopenContainerForms*  | *StopPreopenContainerResult* | 停止预开容器 |
 | *DispatchApi* | **tryToGetSlot** | *tryToGetSlotForms*  | *TryToGetSlotResult* | 为用户调度分配游戏容器，容器一旦分配成功会被锁住，一段时间内不再分配给其他用户，过期释放。 |
 | *DispatchApi* | **tryToGetSlots** | *tryToGetSlotsForms*  | *TryToGetSlotsResult* | tryToGetSlots |
 | *DispatchApi* | **updatePreopenStrategy** | *updatePreopenStrategyForms*  | *UpdatePreopenStrategyResult* | 更新预开预起策略 |
 | *LiveApi* | **queryStatus** | *queryStatusForms*  | *LiveQueryStatusResult* |  |
 | *LiveApi* | **startGameLive** | *startGameLiveForms*  | *LiveStartGameLiveResult* |  |
 | *LiveApi* | **stopGameLive** | *stopGameLiveForms*  | *LiveStopGameLiveResult* |  |
 | *MultiplayApi* | **close** | *closeForms*  | *MultiplayCloseResult* |  |
 | *MultiplayApi* | **init** | *initForms*  | *MultiplayInitResult* |  |
 | *MultiplayApi* | **join** | *joinForms*  | *MultiplayJoinResult* |  |
 | *MultiplayApi* | **leave** | *leaveForms*  | *MultiplayLeaveResult* |  |
 | *MultiplayApi* | **modify** | *modifyForms*  | *MultiplayModifyResult* |  |
 | *MultiplayApi* | **query** | *queryForms*  | *MultiplayQueryResult* |  |
 | *TokenApi* | **getPair** |   | *GetPairResult* | 获取临时安全令牌(二元组) |
 | *TokenApi* | **getTriple** |   | *GetTripleResult* | 获取临时安全令牌 |
 | *UsercontrollerApi* | **deleteGameArchive** | *deleteGameArchiveForms*  | *UsercontrollerDeleteGameArchiveResult* |  |
 | *UsercontrollerApi* | **getGameTrialSurplusDuration** | *getGameTrialSurplusDurationForms*  | *UsercontrollerGetGameTrialSurplusDurationResult* |  |
 | *UsercontrollerApi* | **getUserGameArchive** | *getUserGameArchiveForms*  | *UsercontrollerGetUserGameArchiveResult* |  |
 | *UsercontrollerApi* | **listLatestGameArchive** | *listLatestGameArchiveForms*  | *UsercontrollerListLatestGameArchiveResult* |  |
 | *UsercontrollerApi* | **restoreGameArchive** | *restoreGameArchiveForms*  | *UsercontrollerRestoreGameArchiveResult* |  |
 | *UsercontrollerApi* | **updateGameArchiveTagStatus** | *updateGameArchiveTagStatusForms*  | *UsercontrollerUpdateGameArchiveTagStatusResult* |  |

## License
[Apache-2.0](http://www.apache.org/licenses/LICENSE-2.0)

Copyright (c) 2009-present, Alibaba Cloud All rights reserved.
