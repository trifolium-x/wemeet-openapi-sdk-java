/*
 * 腾讯会议OpenAPI
 * SAAS版RESTFUL风格API
 *
 * The version of the OpenAPI document: v1.0.1
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
 * V1MeetingsMeetingIdEnrollImportPostRequest
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingsMeetingIdEnrollImportPostRequest {
    @JsonProperty(value = "enroll_list", required = true)
    private List<V1MeetingsMeetingIdEnrollImportPostRequestEnrollListInner> enrollList;

    @JsonProperty(value = "instanceid", required = true)
    private Long instanceid;

    @JsonProperty(value = "operator_id", required = true)
    private String operatorId;

    @JsonProperty(value = "operator_id_type", required = true)
    private Long operatorIdType;

    /**
     * @param enrollList 导入的报名对象列表，单次导入最大1000条。累计导入最大4000 (required)
     * @param instanceid 操作者的终端设备类型 (required)
     * @param operatorId 操作者 ID。operator_id 必须与 operator_id_type 配合使用。根据 operator_id_type 的值，operator_id 代表不同类型。operator_id_type&#x3D;2，operator_id必须和公共参数的openid一致。  使用OAuth公参鉴权后不能使用userid为入参。 (required)
     * @param operatorIdType 操作者 ID 的类型： 1. 企业用户 userid 2 open_id (required)
     */
    public V1MeetingsMeetingIdEnrollImportPostRequest(@NotNull List<V1MeetingsMeetingIdEnrollImportPostRequestEnrollListInner> enrollList, @NotNull Long instanceid, @NotNull String operatorId, @NotNull Long operatorIdType) {
        this.enrollList = enrollList;
        this.instanceid = instanceid;
        this.operatorId = operatorId;
        this.operatorIdType = operatorIdType;
    }

    /**
     * @param enrollList 导入的报名对象列表，单次导入最大1000条。累计导入最大4000 (required)
     */
    public V1MeetingsMeetingIdEnrollImportPostRequest enrollList(@NotNull List<V1MeetingsMeetingIdEnrollImportPostRequestEnrollListInner> enrollList) {
        this.enrollList = enrollList;
        return this;
    }
    /**
     * @return enrollList 导入的报名对象列表，单次导入最大1000条。累计导入最大4000
     **/
    public List<V1MeetingsMeetingIdEnrollImportPostRequestEnrollListInner> getEnrollList() {
        return enrollList;
    }

    /**
     * @param enrollList 导入的报名对象列表，单次导入最大1000条。累计导入最大4000 (required)
     */
    public void setEnrollList(List<V1MeetingsMeetingIdEnrollImportPostRequestEnrollListInner> enrollList) {
        this.enrollList = enrollList;
    }
    /**
     * @param instanceid 操作者的终端设备类型 (required)
     */
    public V1MeetingsMeetingIdEnrollImportPostRequest instanceid(@NotNull Long instanceid) {
        this.instanceid = instanceid;
        return this;
    }
    /**
     * @return instanceid 操作者的终端设备类型
     **/
    public Long getInstanceid() {
        return instanceid;
    }

    /**
     * @param instanceid 操作者的终端设备类型 (required)
     */
    public void setInstanceid(Long instanceid) {
        this.instanceid = instanceid;
    }
    /**
     * @param operatorId 操作者 ID。operator_id 必须与 operator_id_type 配合使用。根据 operator_id_type 的值，operator_id 代表不同类型。operator_id_type&#x3D;2，operator_id必须和公共参数的openid一致。  使用OAuth公参鉴权后不能使用userid为入参。 (required)
     */
    public V1MeetingsMeetingIdEnrollImportPostRequest operatorId(@NotNull String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    /**
     * @return operatorId 操作者 ID。operator_id 必须与 operator_id_type 配合使用。根据 operator_id_type 的值，operator_id 代表不同类型。operator_id_type&#x3D;2，operator_id必须和公共参数的openid一致。  使用OAuth公参鉴权后不能使用userid为入参。
     **/
    public String getOperatorId() {
        return operatorId;
    }

    /**
     * @param operatorId 操作者 ID。operator_id 必须与 operator_id_type 配合使用。根据 operator_id_type 的值，operator_id 代表不同类型。operator_id_type&#x3D;2，operator_id必须和公共参数的openid一致。  使用OAuth公参鉴权后不能使用userid为入参。 (required)
     */
    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }
    /**
     * @param operatorIdType 操作者 ID 的类型： 1. 企业用户 userid 2 open_id (required)
     */
    public V1MeetingsMeetingIdEnrollImportPostRequest operatorIdType(@NotNull Long operatorIdType) {
        this.operatorIdType = operatorIdType;
        return this;
    }
    /**
     * @return operatorIdType 操作者 ID 的类型： 1. 企业用户 userid 2 open_id
     **/
    public Long getOperatorIdType() {
        return operatorIdType;
    }

    /**
     * @param operatorIdType 操作者 ID 的类型： 1. 企业用户 userid 2 open_id (required)
     */
    public void setOperatorIdType(Long operatorIdType) {
        this.operatorIdType = operatorIdType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingsMeetingIdEnrollImportPostRequest v1MeetingsMeetingIdEnrollImportPostRequest = (V1MeetingsMeetingIdEnrollImportPostRequest) o;
        return Objects.equals(this.enrollList, v1MeetingsMeetingIdEnrollImportPostRequest.enrollList) &&
            Objects.equals(this.instanceid, v1MeetingsMeetingIdEnrollImportPostRequest.instanceid) &&
            Objects.equals(this.operatorId, v1MeetingsMeetingIdEnrollImportPostRequest.operatorId) &&
            Objects.equals(this.operatorIdType, v1MeetingsMeetingIdEnrollImportPostRequest.operatorIdType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enrollList, instanceid, operatorId, operatorIdType);
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
        sb.append("class V1MeetingsMeetingIdEnrollImportPostRequest {\n");
        sb.append("    enrollList: ").append(toIndentedString(enrollList)).append("\n");
        sb.append("    instanceid: ").append(toIndentedString(instanceid)).append("\n");
        sb.append("    operatorId: ").append(toIndentedString(operatorId)).append("\n");
        sb.append("    operatorIdType: ").append(toIndentedString(operatorIdType)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
