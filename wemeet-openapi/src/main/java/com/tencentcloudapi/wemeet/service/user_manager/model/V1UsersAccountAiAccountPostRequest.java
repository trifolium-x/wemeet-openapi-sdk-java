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

package com.tencentcloudapi.wemeet.service.user_manager.model;

import java.util.*;

import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;

/**
 * V1UsersAccountAiAccountPostRequest
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1UsersAccountAiAccountPostRequest {
    @JsonProperty(value = "ai_account_type")
    private Long aiAccountType;

    @JsonProperty(value = "operator_id", required = true)
    private String operatorId;

    @JsonProperty(value = "operator_id_type", required = true)
    private Long operatorIdType;

    @JsonProperty(value = "to_operator_id", required = true)
    private String toOperatorId;

    @JsonProperty(value = "to_operator_id_type", required = true)
    private Long toOperatorIdType;

    /**
     * @param operatorId 操作者ID，拥有用户管理权限 (required)
     * @param operatorIdType ID类型，1:userid (required)
     * @param toOperatorId 被操作者ID，仅支持企业版/教育版高级账号被设置，其他类型账号会报错 (required)
     * @param toOperatorIdType ID类型  1:userid (required)
     */
    public V1UsersAccountAiAccountPostRequest(@NotNull String operatorId, @NotNull Long operatorIdType, @NotNull String toOperatorId, @NotNull Long toOperatorIdType) {
        this.operatorId = operatorId;
        this.operatorIdType = operatorIdType;
        this.toOperatorId = toOperatorId;
        this.toOperatorIdType = toOperatorIdType;
    }

    /**
     * @param aiAccountType 1:购买版 2:赠送版AI账号类型  1：购买版  2：赠送版  如果未传入该字段，默认分配赠送版AI账号
     */
    public V1UsersAccountAiAccountPostRequest aiAccountType(Long aiAccountType) {
        this.aiAccountType = aiAccountType;
        return this;
    }
    /**
     * @return aiAccountType 1:购买版 2:赠送版AI账号类型  1：购买版  2：赠送版  如果未传入该字段，默认分配赠送版AI账号
     **/
    public Long getAiAccountType() {
        return aiAccountType;
    }

    /**
     * @param aiAccountType 1:购买版 2:赠送版AI账号类型  1：购买版  2：赠送版  如果未传入该字段，默认分配赠送版AI账号
     */
    public void setAiAccountType(Long aiAccountType) {
        this.aiAccountType = aiAccountType;
    }
    /**
     * @param operatorId 操作者ID，拥有用户管理权限 (required)
     */
    public V1UsersAccountAiAccountPostRequest operatorId(@NotNull String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    /**
     * @return operatorId 操作者ID，拥有用户管理权限
     **/
    public String getOperatorId() {
        return operatorId;
    }

    /**
     * @param operatorId 操作者ID，拥有用户管理权限 (required)
     */
    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }
    /**
     * @param operatorIdType ID类型，1:userid (required)
     */
    public V1UsersAccountAiAccountPostRequest operatorIdType(@NotNull Long operatorIdType) {
        this.operatorIdType = operatorIdType;
        return this;
    }
    /**
     * @return operatorIdType ID类型，1:userid
     **/
    public Long getOperatorIdType() {
        return operatorIdType;
    }

    /**
     * @param operatorIdType ID类型，1:userid (required)
     */
    public void setOperatorIdType(Long operatorIdType) {
        this.operatorIdType = operatorIdType;
    }
    /**
     * @param toOperatorId 被操作者ID，仅支持企业版/教育版高级账号被设置，其他类型账号会报错 (required)
     */
    public V1UsersAccountAiAccountPostRequest toOperatorId(@NotNull String toOperatorId) {
        this.toOperatorId = toOperatorId;
        return this;
    }
    /**
     * @return toOperatorId 被操作者ID，仅支持企业版/教育版高级账号被设置，其他类型账号会报错
     **/
    public String getToOperatorId() {
        return toOperatorId;
    }

    /**
     * @param toOperatorId 被操作者ID，仅支持企业版/教育版高级账号被设置，其他类型账号会报错 (required)
     */
    public void setToOperatorId(String toOperatorId) {
        this.toOperatorId = toOperatorId;
    }
    /**
     * @param toOperatorIdType ID类型  1:userid (required)
     */
    public V1UsersAccountAiAccountPostRequest toOperatorIdType(@NotNull Long toOperatorIdType) {
        this.toOperatorIdType = toOperatorIdType;
        return this;
    }
    /**
     * @return toOperatorIdType ID类型  1:userid
     **/
    public Long getToOperatorIdType() {
        return toOperatorIdType;
    }

    /**
     * @param toOperatorIdType ID类型  1:userid (required)
     */
    public void setToOperatorIdType(Long toOperatorIdType) {
        this.toOperatorIdType = toOperatorIdType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1UsersAccountAiAccountPostRequest v1UsersAccountAiAccountPostRequest = (V1UsersAccountAiAccountPostRequest) o;
        return Objects.equals(this.aiAccountType, v1UsersAccountAiAccountPostRequest.aiAccountType) &&
            Objects.equals(this.operatorId, v1UsersAccountAiAccountPostRequest.operatorId) &&
            Objects.equals(this.operatorIdType, v1UsersAccountAiAccountPostRequest.operatorIdType) &&
            Objects.equals(this.toOperatorId, v1UsersAccountAiAccountPostRequest.toOperatorId) &&
            Objects.equals(this.toOperatorIdType, v1UsersAccountAiAccountPostRequest.toOperatorIdType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aiAccountType, operatorId, operatorIdType, toOperatorId, toOperatorIdType);
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
        sb.append("class V1UsersAccountAiAccountPostRequest {\n");
        sb.append("    aiAccountType: ").append(toIndentedString(aiAccountType)).append("\n");
        sb.append("    operatorId: ").append(toIndentedString(operatorId)).append("\n");
        sb.append("    operatorIdType: ").append(toIndentedString(operatorIdType)).append("\n");
        sb.append("    toOperatorId: ").append(toIndentedString(toOperatorId)).append("\n");
        sb.append("    toOperatorIdType: ").append(toIndentedString(toOperatorIdType)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

