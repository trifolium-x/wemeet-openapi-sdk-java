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

package com.tencentcloudapi.wemeet.service.meeting_room.model;

import java.util.*;

import com.fasterxml.jackson.annotation.*;

/**
 * 会议室账号信息
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingRoomsMeetingRoomIdGet200ResponseAccountInfo {
    @JsonProperty(value = "account_new_type")
    private Long accountNewType;

    @JsonProperty(value = "account_type")
    private Long accountType;

    @JsonProperty(value = "pro_account_type")
    private Long proAccountType;

    @JsonProperty(value = "valid_period")
    private String validPeriod;

    /**
     */
    public V1MeetingRoomsMeetingRoomIdGet200ResponseAccountInfo() {
    }

    /**
     * @param accountNewType 
     */
    public V1MeetingRoomsMeetingRoomIdGet200ResponseAccountInfo accountNewType(Long accountNewType) {
        this.accountNewType = accountNewType;
        return this;
    }
    /**
     * @return accountNewType 
     **/
    public Long getAccountNewType() {
        return accountNewType;
    }

    /**
     * @param accountNewType 
     */
    public void setAccountNewType(Long accountNewType) {
        this.accountNewType = accountNewType;
    }
    /**
     * @param accountType 账号类型，0：普通 1：专款 2：试用
     */
    public V1MeetingRoomsMeetingRoomIdGet200ResponseAccountInfo accountType(Long accountType) {
        this.accountType = accountType;
        return this;
    }
    /**
     * @return accountType 账号类型，0：普通 1：专款 2：试用
     **/
    public Long getAccountType() {
        return accountType;
    }

    /**
     * @param accountType 账号类型，0：普通 1：专款 2：试用
     */
    public void setAccountType(Long accountType) {
        this.accountType = accountType;
    }
    /**
     * @param proAccountType 1-预装 2-体验 3-付费
     */
    public V1MeetingRoomsMeetingRoomIdGet200ResponseAccountInfo proAccountType(Long proAccountType) {
        this.proAccountType = proAccountType;
        return this;
    }
    /**
     * @return proAccountType 1-预装 2-体验 3-付费
     **/
    public Long getProAccountType() {
        return proAccountType;
    }

    /**
     * @param proAccountType 1-预装 2-体验 3-付费
     */
    public void setProAccountType(Long proAccountType) {
        this.proAccountType = proAccountType;
    }
    /**
     * @param validPeriod 有效期限
     */
    public V1MeetingRoomsMeetingRoomIdGet200ResponseAccountInfo validPeriod(String validPeriod) {
        this.validPeriod = validPeriod;
        return this;
    }
    /**
     * @return validPeriod 有效期限
     **/
    public String getValidPeriod() {
        return validPeriod;
    }

    /**
     * @param validPeriod 有效期限
     */
    public void setValidPeriod(String validPeriod) {
        this.validPeriod = validPeriod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingRoomsMeetingRoomIdGet200ResponseAccountInfo v1MeetingRoomsMeetingRoomIdGet200ResponseAccountInfo = (V1MeetingRoomsMeetingRoomIdGet200ResponseAccountInfo) o;
        return Objects.equals(this.accountNewType, v1MeetingRoomsMeetingRoomIdGet200ResponseAccountInfo.accountNewType) &&
            Objects.equals(this.accountType, v1MeetingRoomsMeetingRoomIdGet200ResponseAccountInfo.accountType) &&
            Objects.equals(this.proAccountType, v1MeetingRoomsMeetingRoomIdGet200ResponseAccountInfo.proAccountType) &&
            Objects.equals(this.validPeriod, v1MeetingRoomsMeetingRoomIdGet200ResponseAccountInfo.validPeriod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNewType, accountType, proAccountType, validPeriod);
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
        sb.append("class V1MeetingRoomsMeetingRoomIdGet200ResponseAccountInfo {\n");
        sb.append("    accountNewType: ").append(toIndentedString(accountNewType)).append("\n");
        sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
        sb.append("    proAccountType: ").append(toIndentedString(proAccountType)).append("\n");
        sb.append("    validPeriod: ").append(toIndentedString(validPeriod)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

