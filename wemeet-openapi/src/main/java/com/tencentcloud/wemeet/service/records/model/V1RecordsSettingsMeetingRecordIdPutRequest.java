/*
 * 腾讯会议OpenAPI
 * SAAS版RESTFUL风格API
 *
 * The version of the OpenAPI document: v1.0.0.70
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.tencentcloud.wemeet.service.records.model;

import java.util.*;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;

/**
 * V1RecordsSettingsMeetingRecordIdPutRequest
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1RecordsSettingsMeetingRecordIdPutRequest {
    @JsonProperty(value = "meeting_id", required = true)
    private String meetingId;

    @JsonProperty(value = "operator_id")
    private String operatorId;

    @JsonProperty(value = "operator_id_type")
    private Long operatorIdType;

    @JsonProperty(value = "sharing_config")
    private V1RecordsSettingsMeetingRecordIdPutRequestSharingConfig sharingConfig;

    @JsonProperty(value = "userid")
    private String userid;

    /**
     * @param meetingId 会议id (required)
     */
    public V1RecordsSettingsMeetingRecordIdPutRequest(@NotNull String meetingId) {
        this.meetingId = meetingId;
    }

    /**
     * @param meetingId 会议id (required)
     */
    public V1RecordsSettingsMeetingRecordIdPutRequest meetingId(@NotNull String meetingId) {
        this.meetingId = meetingId;
        return this;
    }
    /**
     * @return meetingId 会议id
     **/
    public String getMeetingId() {
        return meetingId;
    }

    /**
     * @param meetingId 会议id (required)
     */
    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }
    /**
     * @param operatorId 操作者ID
     */
    public V1RecordsSettingsMeetingRecordIdPutRequest operatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    /**
     * @return operatorId 操作者ID
     **/
    public String getOperatorId() {
        return operatorId;
    }

    /**
     * @param operatorId 操作者ID
     */
    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }
    /**
     * @param operatorIdType 操作者ID的类型。3. rooms_id 说明：当前仅支持 rooms_id。如操作者为企业内 userid 或 openId，请使用 userid 字段。
     */
    public V1RecordsSettingsMeetingRecordIdPutRequest operatorIdType(Long operatorIdType) {
        this.operatorIdType = operatorIdType;
        return this;
    }
    /**
     * @return operatorIdType 操作者ID的类型。3. rooms_id 说明：当前仅支持 rooms_id。如操作者为企业内 userid 或 openId，请使用 userid 字段。
     **/
    public Long getOperatorIdType() {
        return operatorIdType;
    }

    /**
     * @param operatorIdType 操作者ID的类型。3. rooms_id 说明：当前仅支持 rooms_id。如操作者为企业内 userid 或 openId，请使用 userid 字段。
     */
    public void setOperatorIdType(Long operatorIdType) {
        this.operatorIdType = operatorIdType;
    }
    /**
     * @param sharingConfig 
     */
    public V1RecordsSettingsMeetingRecordIdPutRequest sharingConfig(V1RecordsSettingsMeetingRecordIdPutRequestSharingConfig sharingConfig) {
        this.sharingConfig = sharingConfig;
        return this;
    }
    /**
     * @return sharingConfig 
     **/
    public V1RecordsSettingsMeetingRecordIdPutRequestSharingConfig getSharingConfig() {
        return sharingConfig;
    }

    /**
     * @param sharingConfig 
     */
    public void setSharingConfig(V1RecordsSettingsMeetingRecordIdPutRequestSharingConfig sharingConfig) {
        this.sharingConfig = sharingConfig;
    }
    /**
     * @param userid 用户id。仅会议创建者、企业超级管理员或有企业录制管理权限的用户可调用。调用方用于标示用户的唯一 ID（企业内部请使用企业唯一用户标识；OAuth2.0 鉴权用户请使用 openId）。 企业唯一用户标识说明： 1. 企业对接 SSO 时使用的员工唯一标识 ID。 2. 企业调用创建用户接口时传递的 userid 参数。
     */
    public V1RecordsSettingsMeetingRecordIdPutRequest userid(String userid) {
        this.userid = userid;
        return this;
    }
    /**
     * @return userid 用户id。仅会议创建者、企业超级管理员或有企业录制管理权限的用户可调用。调用方用于标示用户的唯一 ID（企业内部请使用企业唯一用户标识；OAuth2.0 鉴权用户请使用 openId）。 企业唯一用户标识说明： 1. 企业对接 SSO 时使用的员工唯一标识 ID。 2. 企业调用创建用户接口时传递的 userid 参数。
     **/
    public String getUserid() {
        return userid;
    }

    /**
     * @param userid 用户id。仅会议创建者、企业超级管理员或有企业录制管理权限的用户可调用。调用方用于标示用户的唯一 ID（企业内部请使用企业唯一用户标识；OAuth2.0 鉴权用户请使用 openId）。 企业唯一用户标识说明： 1. 企业对接 SSO 时使用的员工唯一标识 ID。 2. 企业调用创建用户接口时传递的 userid 参数。
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
        V1RecordsSettingsMeetingRecordIdPutRequest v1RecordsSettingsMeetingRecordIdPutRequest = (V1RecordsSettingsMeetingRecordIdPutRequest) o;
        return Objects.equals(this.meetingId, v1RecordsSettingsMeetingRecordIdPutRequest.meetingId) &&
            Objects.equals(this.operatorId, v1RecordsSettingsMeetingRecordIdPutRequest.operatorId) &&
            Objects.equals(this.operatorIdType, v1RecordsSettingsMeetingRecordIdPutRequest.operatorIdType) &&
            Objects.equals(this.sharingConfig, v1RecordsSettingsMeetingRecordIdPutRequest.sharingConfig) &&
            Objects.equals(this.userid, v1RecordsSettingsMeetingRecordIdPutRequest.userid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(meetingId, operatorId, operatorIdType, sharingConfig, userid);
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
        sb.append("class V1RecordsSettingsMeetingRecordIdPutRequest {\n");
        sb.append("    meetingId: ").append(toIndentedString(meetingId)).append("\n");
        sb.append("    operatorId: ").append(toIndentedString(operatorId)).append("\n");
        sb.append("    operatorIdType: ").append(toIndentedString(operatorIdType)).append("\n");
        sb.append("    sharingConfig: ").append(toIndentedString(sharingConfig)).append("\n");
        sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
