/*
 * 腾讯会议OpenAPI
 * SAAS版RESTFUL风格API
 *
 * The version of the OpenAPI document: v1.0.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.tencentcloudapi.wemeet.service.records.model;

import java.util.*;

import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;

/**
 * V1RecordsAccessMeetingRecordIdDeleteRequest
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1RecordsAccessMeetingRecordIdDeleteRequest {
    @JsonProperty(value = "access_members", required = true)
    private List<V1RecordsAccessMeetingRecordIdDeleteRequestAccessMembersInner> accessMembers;

    @JsonProperty(value = "operator_id", required = true)
    private String operatorId;

    @JsonProperty(value = "operator_id_type", required = true)
    private Long operatorIdType;

    /**
     * @param accessMembers 成员列表，如果传入非有权限的成员，则不生效 (required)
     * @param operatorId 操作者 ID。operator_id 必须与 operator_id_type 配合使用。根据 operator_id_type 的值，operator_id 代表不同类型。 (required)
     * @param operatorIdType 操作者 ID 的类型： 1:userid 2:open_id (required)
     */
    public V1RecordsAccessMeetingRecordIdDeleteRequest(@NotNull List<V1RecordsAccessMeetingRecordIdDeleteRequestAccessMembersInner> accessMembers, @NotNull String operatorId, @NotNull Long operatorIdType) {
        this.accessMembers = accessMembers;
        this.operatorId = operatorId;
        this.operatorIdType = operatorIdType;
    }

    /**
     * @param accessMembers 成员列表，如果传入非有权限的成员，则不生效 (required)
     */
    public V1RecordsAccessMeetingRecordIdDeleteRequest accessMembers(@NotNull List<V1RecordsAccessMeetingRecordIdDeleteRequestAccessMembersInner> accessMembers) {
        this.accessMembers = accessMembers;
        return this;
    }
    /**
     * @return accessMembers 成员列表，如果传入非有权限的成员，则不生效
     **/
    public List<V1RecordsAccessMeetingRecordIdDeleteRequestAccessMembersInner> getAccessMembers() {
        return accessMembers;
    }

    /**
     * @param accessMembers 成员列表，如果传入非有权限的成员，则不生效 (required)
     */
    public void setAccessMembers(List<V1RecordsAccessMeetingRecordIdDeleteRequestAccessMembersInner> accessMembers) {
        this.accessMembers = accessMembers;
    }
    /**
     * @param operatorId 操作者 ID。operator_id 必须与 operator_id_type 配合使用。根据 operator_id_type 的值，operator_id 代表不同类型。 (required)
     */
    public V1RecordsAccessMeetingRecordIdDeleteRequest operatorId(@NotNull String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    /**
     * @return operatorId 操作者 ID。operator_id 必须与 operator_id_type 配合使用。根据 operator_id_type 的值，operator_id 代表不同类型。
     **/
    public String getOperatorId() {
        return operatorId;
    }

    /**
     * @param operatorId 操作者 ID。operator_id 必须与 operator_id_type 配合使用。根据 operator_id_type 的值，operator_id 代表不同类型。 (required)
     */
    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }
    /**
     * @param operatorIdType 操作者 ID 的类型： 1:userid 2:open_id (required)
     */
    public V1RecordsAccessMeetingRecordIdDeleteRequest operatorIdType(@NotNull Long operatorIdType) {
        this.operatorIdType = operatorIdType;
        return this;
    }
    /**
     * @return operatorIdType 操作者 ID 的类型： 1:userid 2:open_id
     **/
    public Long getOperatorIdType() {
        return operatorIdType;
    }

    /**
     * @param operatorIdType 操作者 ID 的类型： 1:userid 2:open_id (required)
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
        V1RecordsAccessMeetingRecordIdDeleteRequest v1RecordsAccessMeetingRecordIdDeleteRequest = (V1RecordsAccessMeetingRecordIdDeleteRequest) o;
        return Objects.equals(this.accessMembers, v1RecordsAccessMeetingRecordIdDeleteRequest.accessMembers) &&
            Objects.equals(this.operatorId, v1RecordsAccessMeetingRecordIdDeleteRequest.operatorId) &&
            Objects.equals(this.operatorIdType, v1RecordsAccessMeetingRecordIdDeleteRequest.operatorIdType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessMembers, operatorId, operatorIdType);
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
        sb.append("class V1RecordsAccessMeetingRecordIdDeleteRequest {\n");
        sb.append("    accessMembers: ").append(toIndentedString(accessMembers)).append("\n");
        sb.append("    operatorId: ").append(toIndentedString(operatorId)).append("\n");
        sb.append("    operatorIdType: ").append(toIndentedString(operatorIdType)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

