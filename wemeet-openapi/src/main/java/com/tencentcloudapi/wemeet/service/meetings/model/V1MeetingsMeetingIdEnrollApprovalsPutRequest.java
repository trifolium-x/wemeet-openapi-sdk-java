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
 * V1MeetingsMeetingIdEnrollApprovalsPutRequest
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingsMeetingIdEnrollApprovalsPutRequest {
    @JsonProperty(value = "action", required = true)
    private Long action;

    @JsonProperty(value = "enroll_id_list", required = true)
    private List<Long> enrollIdList;

    @JsonProperty(value = "instanceid")
    private Long instanceid;

    @JsonProperty(value = "operator_id")
    private String operatorId;

    @JsonProperty(value = "operator_id_type", required = true)
    private Long operatorIdType;

    @JsonProperty(value = "userid")
    private String userid;

    /**
     * @param action 审批动作：1 取消批准，2 拒绝，3.批准，取消批准后状态将变成待审批 (required)
     * @param enrollIdList 报名id列表效 (required)
     * @param operatorIdType 操作者 ID 的类型：  1: userid 2: open_id  如果operator_id和userid具有值，则以operator_id为准； (required)
     */
    public V1MeetingsMeetingIdEnrollApprovalsPutRequest(@NotNull Long action, @NotNull List<Long> enrollIdList, @NotNull Long operatorIdType) {
        this.action = action;
        this.enrollIdList = enrollIdList;
        this.operatorIdType = operatorIdType;
    }

    /**
     * @param action 审批动作：1 取消批准，2 拒绝，3.批准，取消批准后状态将变成待审批 (required)
     */
    public V1MeetingsMeetingIdEnrollApprovalsPutRequest action(@NotNull Long action) {
        this.action = action;
        return this;
    }
    /**
     * @return action 审批动作：1 取消批准，2 拒绝，3.批准，取消批准后状态将变成待审批
     **/
    public Long getAction() {
        return action;
    }

    /**
     * @param action 审批动作：1 取消批准，2 拒绝，3.批准，取消批准后状态将变成待审批 (required)
     */
    public void setAction(Long action) {
        this.action = action;
    }
    /**
     * @param enrollIdList 报名id列表效 (required)
     */
    public V1MeetingsMeetingIdEnrollApprovalsPutRequest enrollIdList(@NotNull List<Long> enrollIdList) {
        this.enrollIdList = enrollIdList;
        return this;
    }
    /**
     * @return enrollIdList 报名id列表效
     **/
    public List<Long> getEnrollIdList() {
        return enrollIdList;
    }

    /**
     * @param enrollIdList 报名id列表效 (required)
     */
    public void setEnrollIdList(List<Long> enrollIdList) {
        this.enrollIdList = enrollIdList;
    }
    /**
     * @param instanceid 设备类型
     */
    public V1MeetingsMeetingIdEnrollApprovalsPutRequest instanceid(Long instanceid) {
        this.instanceid = instanceid;
        return this;
    }
    /**
     * @return instanceid 设备类型
     **/
    public Long getInstanceid() {
        return instanceid;
    }

    /**
     * @param instanceid 设备类型
     */
    public void setInstanceid(Long instanceid) {
        this.instanceid = instanceid;
    }
    /**
     * @param operatorId 操作者 ID。会议创建者可以导入报名信息。 operator_id 必须与 operator_id_type 配合使用。根据 operator_id_type 的值，operator_id 代表不同类型。  operator_id_type&#x3D;2，operator_id必须和公共参数的openid一致。  operator_id和userid至少填写一个，两个参数如果都传了以operator_id为准。  使用OAuth公参鉴权后不能使用userid为入参。
     */
    public V1MeetingsMeetingIdEnrollApprovalsPutRequest operatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    /**
     * @return operatorId 操作者 ID。会议创建者可以导入报名信息。 operator_id 必须与 operator_id_type 配合使用。根据 operator_id_type 的值，operator_id 代表不同类型。  operator_id_type&#x3D;2，operator_id必须和公共参数的openid一致。  operator_id和userid至少填写一个，两个参数如果都传了以operator_id为准。  使用OAuth公参鉴权后不能使用userid为入参。
     **/
    public String getOperatorId() {
        return operatorId;
    }

    /**
     * @param operatorId 操作者 ID。会议创建者可以导入报名信息。 operator_id 必须与 operator_id_type 配合使用。根据 operator_id_type 的值，operator_id 代表不同类型。  operator_id_type&#x3D;2，operator_id必须和公共参数的openid一致。  operator_id和userid至少填写一个，两个参数如果都传了以operator_id为准。  使用OAuth公参鉴权后不能使用userid为入参。
     */
    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }
    /**
     * @param operatorIdType 操作者 ID 的类型：  1: userid 2: open_id  如果operator_id和userid具有值，则以operator_id为准； (required)
     */
    public V1MeetingsMeetingIdEnrollApprovalsPutRequest operatorIdType(@NotNull Long operatorIdType) {
        this.operatorIdType = operatorIdType;
        return this;
    }
    /**
     * @return operatorIdType 操作者 ID 的类型：  1: userid 2: open_id  如果operator_id和userid具有值，则以operator_id为准；
     **/
    public Long getOperatorIdType() {
        return operatorIdType;
    }

    /**
     * @param operatorIdType 操作者 ID 的类型：  1: userid 2: open_id  如果operator_id和userid具有值，则以operator_id为准； (required)
     */
    public void setOperatorIdType(Long operatorIdType) {
        this.operatorIdType = operatorIdType;
    }
    /**
     * @param userid 用户id
     */
    public V1MeetingsMeetingIdEnrollApprovalsPutRequest userid(String userid) {
        this.userid = userid;
        return this;
    }
    /**
     * @return userid 用户id
     **/
    public String getUserid() {
        return userid;
    }

    /**
     * @param userid 用户id
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
        V1MeetingsMeetingIdEnrollApprovalsPutRequest v1MeetingsMeetingIdEnrollApprovalsPutRequest = (V1MeetingsMeetingIdEnrollApprovalsPutRequest) o;
        return Objects.equals(this.action, v1MeetingsMeetingIdEnrollApprovalsPutRequest.action) &&
            Objects.equals(this.enrollIdList, v1MeetingsMeetingIdEnrollApprovalsPutRequest.enrollIdList) &&
            Objects.equals(this.instanceid, v1MeetingsMeetingIdEnrollApprovalsPutRequest.instanceid) &&
            Objects.equals(this.operatorId, v1MeetingsMeetingIdEnrollApprovalsPutRequest.operatorId) &&
            Objects.equals(this.operatorIdType, v1MeetingsMeetingIdEnrollApprovalsPutRequest.operatorIdType) &&
            Objects.equals(this.userid, v1MeetingsMeetingIdEnrollApprovalsPutRequest.userid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, enrollIdList, instanceid, operatorId, operatorIdType, userid);
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
        sb.append("class V1MeetingsMeetingIdEnrollApprovalsPutRequest {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    enrollIdList: ").append(toIndentedString(enrollIdList)).append("\n");
        sb.append("    instanceid: ").append(toIndentedString(instanceid)).append("\n");
        sb.append("    operatorId: ").append(toIndentedString(operatorId)).append("\n");
        sb.append("    operatorIdType: ").append(toIndentedString(operatorIdType)).append("\n");
        sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

