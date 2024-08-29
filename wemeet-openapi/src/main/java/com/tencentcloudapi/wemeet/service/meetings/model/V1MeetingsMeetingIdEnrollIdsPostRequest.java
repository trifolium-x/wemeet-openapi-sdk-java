/*
 * 腾讯会议OpenAPI
 * SAAS版RESTFUL风格API
 *
 * The version of the OpenAPI document: v1.0.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.tencentcloudapi.wemeet.service.meetings.model;

import java.util.*;

import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;

/**
 * V1MeetingsMeetingIdEnrollIdsPostRequest
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingsMeetingIdEnrollIdsPostRequest {
    @JsonProperty(value = "instanceid", required = true)
    private Long instanceid;

    @JsonProperty(value = "ms_open_id_list", required = true)
    private List<String> msOpenIdList;

    @JsonProperty(value = "operator_id")
    private String operatorId;

    @JsonProperty(value = "operator_id_type")
    private Long operatorIdType;

    @JsonProperty(value = "sorting_rules")
    private Long sortingRules;

    @JsonProperty(value = "userid")
    private String userid;

    /**
     * @param instanceid 用户的终端设备类型： 0：PSTN 1：PC 2：Mac 3：Android 4：iOS 5：Web 6：iPad 7：Android Pad 8：小程序 9：voip、sip 设备 10：linux 20：Rooms for Touch Windows 21：Rooms for Touch MacOS 22：Rooms for Touch Android 30：Controller for Touch Windows 32：Controller for Touch Android 33：Controller for Touch iOS (required)
     * @param msOpenIdList 当场会议的用户临时 ID（适用于所有用户）数组，单次最多支持500条。 (required)
     */
    public V1MeetingsMeetingIdEnrollIdsPostRequest(@NotNull Long instanceid, @NotNull List<String> msOpenIdList) {
        this.instanceid = instanceid;
        this.msOpenIdList = msOpenIdList;
    }

    /**
     * @param instanceid 用户的终端设备类型： 0：PSTN 1：PC 2：Mac 3：Android 4：iOS 5：Web 6：iPad 7：Android Pad 8：小程序 9：voip、sip 设备 10：linux 20：Rooms for Touch Windows 21：Rooms for Touch MacOS 22：Rooms for Touch Android 30：Controller for Touch Windows 32：Controller for Touch Android 33：Controller for Touch iOS (required)
     */
    public V1MeetingsMeetingIdEnrollIdsPostRequest instanceid(@NotNull Long instanceid) {
        this.instanceid = instanceid;
        return this;
    }
    /**
     * @return instanceid 用户的终端设备类型： 0：PSTN 1：PC 2：Mac 3：Android 4：iOS 5：Web 6：iPad 7：Android Pad 8：小程序 9：voip、sip 设备 10：linux 20：Rooms for Touch Windows 21：Rooms for Touch MacOS 22：Rooms for Touch Android 30：Controller for Touch Windows 32：Controller for Touch Android 33：Controller for Touch iOS
     **/
    public Long getInstanceid() {
        return instanceid;
    }

    /**
     * @param instanceid 用户的终端设备类型： 0：PSTN 1：PC 2：Mac 3：Android 4：iOS 5：Web 6：iPad 7：Android Pad 8：小程序 9：voip、sip 设备 10：linux 20：Rooms for Touch Windows 21：Rooms for Touch MacOS 22：Rooms for Touch Android 30：Controller for Touch Windows 32：Controller for Touch Android 33：Controller for Touch iOS (required)
     */
    public void setInstanceid(Long instanceid) {
        this.instanceid = instanceid;
    }
    /**
     * @param msOpenIdList 当场会议的用户临时 ID（适用于所有用户）数组，单次最多支持500条。 (required)
     */
    public V1MeetingsMeetingIdEnrollIdsPostRequest msOpenIdList(@NotNull List<String> msOpenIdList) {
        this.msOpenIdList = msOpenIdList;
        return this;
    }
    /**
     * @return msOpenIdList 当场会议的用户临时 ID（适用于所有用户）数组，单次最多支持500条。
     **/
    public List<String> getMsOpenIdList() {
        return msOpenIdList;
    }

    /**
     * @param msOpenIdList 当场会议的用户临时 ID（适用于所有用户）数组，单次最多支持500条。 (required)
     */
    public void setMsOpenIdList(List<String> msOpenIdList) {
        this.msOpenIdList = msOpenIdList;
    }
    /**
     * @param operatorId 操作者 ID。会议创建者可以导入报名信息。 operator_id 必须与 operator_id_type 配合使用。根据 operator_id_type 的值，operator_id 代表不同类型。 operator_id_type&#x3D;2，operator_id 必须和公共参数的 openid 一致。 operator_id 和 userid 至少填写一个，两个参数如果都传了以 operator_id 为准。 使用 OAuth 公参鉴权后不能使用 userid 为入参。
     */
    public V1MeetingsMeetingIdEnrollIdsPostRequest operatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    /**
     * @return operatorId 操作者 ID。会议创建者可以导入报名信息。 operator_id 必须与 operator_id_type 配合使用。根据 operator_id_type 的值，operator_id 代表不同类型。 operator_id_type&#x3D;2，operator_id 必须和公共参数的 openid 一致。 operator_id 和 userid 至少填写一个，两个参数如果都传了以 operator_id 为准。 使用 OAuth 公参鉴权后不能使用 userid 为入参。
     **/
    public String getOperatorId() {
        return operatorId;
    }

    /**
     * @param operatorId 操作者 ID。会议创建者可以导入报名信息。 operator_id 必须与 operator_id_type 配合使用。根据 operator_id_type 的值，operator_id 代表不同类型。 operator_id_type&#x3D;2，operator_id 必须和公共参数的 openid 一致。 operator_id 和 userid 至少填写一个，两个参数如果都传了以 operator_id 为准。 使用 OAuth 公参鉴权后不能使用 userid 为入参。
     */
    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }
    /**
     * @param operatorIdType 操作者 ID 的类型： 1：userid 2：open_id 如果 operator_id 和 userid 具有值，则以 operator_id 为准。
     */
    public V1MeetingsMeetingIdEnrollIdsPostRequest operatorIdType(Long operatorIdType) {
        this.operatorIdType = operatorIdType;
        return this;
    }
    /**
     * @return operatorIdType 操作者 ID 的类型： 1：userid 2：open_id 如果 operator_id 和 userid 具有值，则以 operator_id 为准。
     **/
    public Long getOperatorIdType() {
        return operatorIdType;
    }

    /**
     * @param operatorIdType 操作者 ID 的类型： 1：userid 2：open_id 如果 operator_id 和 userid 具有值，则以 operator_id 为准。
     */
    public void setOperatorIdType(Long operatorIdType) {
        this.operatorIdType = operatorIdType;
    }
    /**
     * @param sortingRules 查询报名 ID 的排序规则。当该账号存在多条报名记录（手机号导入、手动报名等）时，该接口返回的顺序。 1：优先查询手机号导入报名，再查询用户手动报名，默认值。 2：优先查询用户手动报名，再查手机号导入。
     */
    public V1MeetingsMeetingIdEnrollIdsPostRequest sortingRules(Long sortingRules) {
        this.sortingRules = sortingRules;
        return this;
    }
    /**
     * @return sortingRules 查询报名 ID 的排序规则。当该账号存在多条报名记录（手机号导入、手动报名等）时，该接口返回的顺序。 1：优先查询手机号导入报名，再查询用户手动报名，默认值。 2：优先查询用户手动报名，再查手机号导入。
     **/
    public Long getSortingRules() {
        return sortingRules;
    }

    /**
     * @param sortingRules 查询报名 ID 的排序规则。当该账号存在多条报名记录（手机号导入、手动报名等）时，该接口返回的顺序。 1：优先查询手机号导入报名，再查询用户手动报名，默认值。 2：优先查询用户手动报名，再查手机号导入。
     */
    public void setSortingRules(Long sortingRules) {
        this.sortingRules = sortingRules;
    }
    /**
     * @param userid 会议创建者的用户 ID。为了防止现网应用报错，此参数实则仍然兼容 openid，如无 oauth 应用使用报名接口则也可做成不兼容变更。
     */
    public V1MeetingsMeetingIdEnrollIdsPostRequest userid(String userid) {
        this.userid = userid;
        return this;
    }
    /**
     * @return userid 会议创建者的用户 ID。为了防止现网应用报错，此参数实则仍然兼容 openid，如无 oauth 应用使用报名接口则也可做成不兼容变更。
     **/
    public String getUserid() {
        return userid;
    }

    /**
     * @param userid 会议创建者的用户 ID。为了防止现网应用报错，此参数实则仍然兼容 openid，如无 oauth 应用使用报名接口则也可做成不兼容变更。
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingsMeetingIdEnrollIdsPostRequest v1MeetingsMeetingIdEnrollIdsPostRequest = (V1MeetingsMeetingIdEnrollIdsPostRequest) o;
        return Objects.equals(this.instanceid, v1MeetingsMeetingIdEnrollIdsPostRequest.instanceid) &&
            Objects.equals(this.msOpenIdList, v1MeetingsMeetingIdEnrollIdsPostRequest.msOpenIdList) &&
            Objects.equals(this.operatorId, v1MeetingsMeetingIdEnrollIdsPostRequest.operatorId) &&
            Objects.equals(this.operatorIdType, v1MeetingsMeetingIdEnrollIdsPostRequest.operatorIdType) &&
            Objects.equals(this.sortingRules, v1MeetingsMeetingIdEnrollIdsPostRequest.sortingRules) &&
            Objects.equals(this.userid, v1MeetingsMeetingIdEnrollIdsPostRequest.userid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceid, msOpenIdList, operatorId, operatorIdType, sortingRules, userid);
    }

    /**
    * Convert the given object to string with each line indented by 4 spaces
    * (except the first line).
    */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class V1MeetingsMeetingIdEnrollIdsPostRequest {\n");
        sb.append("    instanceid: ").append(toIndentedString(instanceid)).append("\n");
        sb.append("    msOpenIdList: ").append(toIndentedString(msOpenIdList)).append("\n");
        sb.append("    operatorId: ").append(toIndentedString(operatorId)).append("\n");
        sb.append("    operatorIdType: ").append(toIndentedString(operatorIdType)).append("\n");
        sb.append("    sortingRules: ").append(toIndentedString(sortingRules)).append("\n");
        sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

