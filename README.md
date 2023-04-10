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
  <version>1.0.20230410</version>
</dependency>

or
<!-- independent -->
<dependency>
    <groupId>com.alibaba</groupId>
    <artifactId>alibabacloud-yjopenapi-java-client</artifactId>
    <version>1.0.20230410</version>
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
 | *ConsoleAdminApi* | **activateDeployment** | *activateDeploymentForms*  | *ConsoleAdminActivateDeploymentResult* | 激活已部署成功的游戏版本的部署 |
 | *ConsoleAdminApi* | **adaptGameVersion** | *adaptGameVersionForms*  | *ConsoleAdminAdaptGameVersionResult* | 发起游戏版本适配 |
 | *ConsoleAdminApi* | **addGameToProject** | *addGameToProjectForms*  | *ConsoleAdminAddGameToProjectResult* | 将游戏添加到项目 |
 | *ConsoleAdminApi* | **createGame** | *createGameForms*  | *ConsoleAdminCreateGameResult* | 创建游戏 |
 | *ConsoleAdminApi* | **createProject** | *createProjectForms*  | *ConsoleAdminCreateProjectResult* | 创建项目 |
 | *ConsoleAdminApi* | **deleteGame** | *deleteGameForms*  | *ConsoleAdminDeleteGameResult* | 删除指定的游戏 |
 | *ConsoleAdminApi* | **deleteGameVersion** | *deleteGameVersionForms*  | *ConsoleAdminDeleteGameVersionResult* | 发起游戏版本适配 |
 | *ConsoleAdminApi* | **deleteProject** | *deleteProjectForms*  | *ConsoleAdminDeleteProjectResult* | 删除指定的项目 |
 | *ConsoleAdminApi* | **getGameVersion** | *getGameVersionForms*  | *ConsoleAdminGetGameVersionResult* | 获取单个游戏版本信息 |
 | *ConsoleAdminApi* | **getGameVersionProgress** | *getGameVersionProgressForms*  | *ConsoleAdminGetGameVersionProgressResult* | 查询版本处理进度（包含上传、适配、部署） |
 | *ConsoleAdminApi* | **listActivateableInstances** | *listActivateableInstancesForms*  | *ConsoleAdminListActivateableInstancesResult* | 指定项目和游戏版本，获取可激活且可调度的实例及调度配置 |
 | *ConsoleAdminApi* | **listActivatedInstances** | *listActivatedInstancesForms*  | *ConsoleAdminListActivatedInstancesResult* | 指定项目和游戏，获取已激活版本的可调度实例及调度配置 |
 | *ConsoleAdminApi* | **listControllersOfGame** | *listControllersOfGameForms*  | *ConsoleAdminListControllersOfGameResult* | 获取单个游戏关联的控制器列表 |
 | *ConsoleAdminApi* | **listDeployableInstances** | *listDeployableInstancesForms*  | *ConsoleAdminListDeployableInstancesResult* | 指定项目和游戏版本，获取可以部署的实例 |
 | *ConsoleAdminApi* | **listGameVersions** | *listGameVersionsForms*  | *ConsoleAdminListGameVersionsResult* | 分页获取游戏版本列表 |
 | *ConsoleAdminApi* | **listGames** | *listGamesForms*  | *ConsoleAdminListGamesResult* | 分页获取游戏列表 |
 | *ConsoleAdminApi* | **listProjects** | *listProjectsForms*  | *ConsoleAdminListProjectsResult* | 分页获取项目列表 |
 | *ConsoleAdminApi* | **removeGameFromProject** | *removeGameFromProjectForms*  | *ConsoleAdminRemoveGameFromProjectResult* | 将游戏移出项目 |
 | *ConsoleAdminApi* | **submitDeployment** | *submitDeploymentForms*  | *ConsoleAdminSubmitDeploymentResult* | 提交游戏版本的部署请求 |
 | *ConsoleAdminApi* | **uploadGameVersionByDownload** | *uploadGameVersionByDownloadForms*  | *ConsoleAdminUploadGameVersionByDownloadResult* | 一键上传：文件上传接口，用远程下载的方式生成新版本 |
 | *DispatchApi* | **batchStopGame** | *batchStopGameForms*  | *BatchStopGameResult* | 游戏下全量踢下线，异步接口 |
 | *DispatchApi* | **cancelGameHang** | *cancelGameHangForms*  | *CancelGameHangResult* | 取消游戏挂机 |
 | *DispatchApi* | **getGameConcurrency** | *getGameConcurrencyForms*  | *GetGameConcurrencyResult* | 调用GetGameConcurrency获取游戏当前并发数 |
 | *DispatchApi* | **getStock** | *getStockForms*  | *GetStockResult* | 调用GetStock获取游戏当前库存 |
 | *DispatchApi* | **getStopGameToken** | *getStopGameTokenForms*  | *GetStopGameTokenResult* | 全量踢下线获取token |
 | *DispatchApi* | **listGameServerIp** | *listGameServerIpForms*  | *ListGameServerIpResult* | 获取自己租户下的游戏服务器ip列表 |
 | *DispatchApi* | **queryGameHang** | *queryGameHangForms*  | *QueryGameHangResult* | 查询游戏挂机状态 |
 | *DispatchApi* | **querySessionStatus** | *querySessionStatusForms*  | *QuerySessionStatusResult* | 查询会话当前状态 |
 | *DispatchApi* | **setGameAlive** | *setGameAliveForms*  | *SetGameAliveResult* | 设置游戏可运行时长 |
 | *DispatchApi* | **setGameHang** | *setGameHangForms*  | *SetGameHangResult* | 设置游戏挂机 |
 | *DispatchApi* | **stopGame** | *stopGameForms*  | *StopGameResult* | 服务端发起，停止某个用户的某个游戏的某个会话 |
 | *DispatchApi* | **tryToGetSlot** | *tryToGetSlotForms*  | *TryToGetSlotResult* | 为用户调度分配游戏容器，容器一旦分配成功会被锁住，一段时间内不再分配给其他用户，过期释放。 |
 | *InteractiveApi* | **getParty** | *getPartyForms*  | *InteractiveGetPartyResult* | 获取派对 |
 | *InteractiveApi* | **getPartyStatus** | *getPartyStatusForms*  | *InteractiveGetPartyStatusResult* | 查询派对游戏状态 |
 | *InteractiveApi* | **joinParty** | *joinPartyForms*  | *InteractiveJoinPartyResult* | 加入分配席位 |
 | *InteractiveApi* | **kickOutUser** | *kickOutUserForms*  | *InteractiveKickOutUserResult* | 踢出派对 |
 | *InteractiveApi* | **modifySeats** | *modifySeatsForms*  | *InteractiveModifySeatsResult* | 修改席位 |
 | *InteractiveApi* | **shutDownParty** | *shutDownPartyForms*  | *InteractiveShutDownPartyResult* | 关闭派对 |
 | *LiveApi* | **queryStatus** | *queryStatusForms*  | *LiveQueryStatusResult* | 查询推流状态 |
 | *LiveApi* | **startGameLive** | *startGameLiveForms*  | *LiveStartGameLiveResult* | 开始直播推流 |
 | *LiveApi* | **stopGameLive** | *stopGameLiveForms*  | *LiveStopGameLiveResult* | 结束直播推流 |
 | *MultiplayApi* | **close** | *closeForms*  | *MultiplayCloseResult* | 关闭联机 |
 | *MultiplayApi* | **init** | *initForms*  | *MultiplayInitResult* | 初始化联机 |
 | *MultiplayApi* | **join** | *joinForms*  | *MultiplayJoinResult* | 加入联机 |
 | *MultiplayApi* | **leave** | *leaveForms*  | *MultiplayLeaveResult* | 离开联机 |
 | *MultiplayApi* | **modify** | *modifyForms*  | *MultiplayModifyResult* | 修改联机 |
 | *MultiplayApi* | **query** | *queryForms*  | *MultiplayQueryResult* | 离开联机 |
 | *TokenApi* | **getTriple** |   | *GetTripleResult* | 获取临时安全令牌 |
 | *UsercontrollerApi* | **deleteGameArchive** | *deleteGameArchiveForms*  | *UsercontollerDeleteGameArchiveResult* | 根据存档id删除存档纪录 |
 | *UsercontrollerApi* | **getGameTrialSurplusDuration** | *getGameTrialSurplusDurationForms*  | *UsercontollerGetGameTrialSurplusDurationResult* | 查询剩余试玩游戏时长 |
 | *UsercontrollerApi* | **listLatestGameArchive** | *listLatestGameArchiveForms*  | *UsercontollerListLatestGameArchiveResult* | 查询用户正常状态的最新存档纪录，按照存档时间倒序 |
 | *UsercontrollerApi* | **restoreGameArchive** | *restoreGameArchiveForms*  | *UsercontollerRestoreGameArchiveResult* | 将指定的存档ID恢复为最新存档 |
 | *UsercontrollerApi* | **updateGameArchiveTagStatus** | *updateGameArchiveTagStatusForms*  | *UsercontollerUpdateGameArchiveTagStatusResult* | 更新存档打标状态 |

## License
[Apache-2.0](http://www.apache.org/licenses/LICENSE-2.0)

Copyright (c) 2009-present, Alibaba Cloud All rights reserved.
