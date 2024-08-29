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

package com.tencentcloudapi.wemeet.service.meetings.model;

import java.util.*;

import com.fasterxml.jackson.annotation.*;

/**
 * V1MeetingsMeetingIdEnrollImportPost200ResponseEnrollListInner
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingsMeetingIdEnrollImportPost200ResponseEnrollListInner {
    @JsonProperty(value = "area")
    private String area;

    @JsonProperty(value = "enroll_code")
    private String enrollCode;

    @JsonProperty(value = "enroll_id")
    private Long enrollId;

    @JsonProperty(value = "nick_name")
    private String nickName;

    @JsonProperty(value = "open_id")
    private String openId;

    @JsonProperty(value = "phone_number")
    private String phoneNumber;

    @JsonProperty(value = "userid")
    private String userid;

    /**
     */
    public V1MeetingsMeetingIdEnrollImportPost200ResponseEnrollListInner() {
    }

    /**
     * @param area 国家/地区代码，若使用手机号，必填（例如：中国传86，不是+86）
     */
    public V1MeetingsMeetingIdEnrollImportPost200ResponseEnrollListInner area(String area) {
        this.area = area;
        return this;
    }
    /**
     * @return area 国家/地区代码，若使用手机号，必填（例如：中国传86，不是+86）
     **/
    public String getArea() {
        return area;
    }

    /**
     * @param area 国家/地区代码，若使用手机号，必填（例如：中国传86，不是+86）
     */
    public void setArea(String area) {
        this.area = area;
    }
    /**
     * @param enrollCode 
     */
    public V1MeetingsMeetingIdEnrollImportPost200ResponseEnrollListInner enrollCode(String enrollCode) {
        this.enrollCode = enrollCode;
        return this;
    }
    /**
     * @return enrollCode 
     **/
    public String getEnrollCode() {
        return enrollCode;
    }

    /**
     * @param enrollCode 
     */
    public void setEnrollCode(String enrollCode) {
        this.enrollCode = enrollCode;
    }
    /**
     * @param enrollId 报名ID
     */
    public V1MeetingsMeetingIdEnrollImportPost200ResponseEnrollListInner enrollId(Long enrollId) {
        this.enrollId = enrollId;
        return this;
    }
    /**
     * @return enrollId 报名ID
     **/
    public Long getEnrollId() {
        return enrollId;
    }

    /**
     * @param enrollId 报名ID
     */
    public void setEnrollId(Long enrollId) {
        this.enrollId = enrollId;
    }
    /**
     * @param nickName 报名的昵称，与会中昵称可能不一致
     */
    public V1MeetingsMeetingIdEnrollImportPost200ResponseEnrollListInner nickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
    /**
     * @return nickName 报名的昵称，与会中昵称可能不一致
     **/
    public String getNickName() {
        return nickName;
    }

    /**
     * @param nickName 报名的昵称，与会中昵称可能不一致
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    /**
     * @param openId OAuth授权用户ID。  导入报名对象支持本企业（或与OAuth应用同企业）内 userid、授权用户的openid、phone_number 三种形式，三者必填其一；
     */
    public V1MeetingsMeetingIdEnrollImportPost200ResponseEnrollListInner openId(String openId) {
        this.openId = openId;
        return this;
    }
    /**
     * @return openId OAuth授权用户ID。  导入报名对象支持本企业（或与OAuth应用同企业）内 userid、授权用户的openid、phone_number 三种形式，三者必填其一；
     **/
    public String getOpenId() {
        return openId;
    }

    /**
     * @param openId OAuth授权用户ID。  导入报名对象支持本企业（或与OAuth应用同企业）内 userid、授权用户的openid、phone_number 三种形式，三者必填其一；
     */
    public void setOpenId(String openId) {
        this.openId = openId;
    }
    /**
     * @param phoneNumber 手机号
     */
    public V1MeetingsMeetingIdEnrollImportPost200ResponseEnrollListInner phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    /**
     * @return phoneNumber 手机号
     **/
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber 手机号
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    /**
     * @param userid 用户的唯一 ID（企业内部请使用企业唯一用户标识）。 userid 和 phone_number 两者必填一个
     */
    public V1MeetingsMeetingIdEnrollImportPost200ResponseEnrollListInner userid(String userid) {
        this.userid = userid;
        return this;
    }
    /**
     * @return userid 用户的唯一 ID（企业内部请使用企业唯一用户标识）。 userid 和 phone_number 两者必填一个
     **/
    public String getUserid() {
        return userid;
    }

    /**
     * @param userid 用户的唯一 ID（企业内部请使用企业唯一用户标识）。 userid 和 phone_number 两者必填一个
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
        V1MeetingsMeetingIdEnrollImportPost200ResponseEnrollListInner v1MeetingsMeetingIdEnrollImportPost200ResponseEnrollListInner = (V1MeetingsMeetingIdEnrollImportPost200ResponseEnrollListInner) o;
        return Objects.equals(this.area, v1MeetingsMeetingIdEnrollImportPost200ResponseEnrollListInner.area) &&
            Objects.equals(this.enrollCode, v1MeetingsMeetingIdEnrollImportPost200ResponseEnrollListInner.enrollCode) &&
            Objects.equals(this.enrollId, v1MeetingsMeetingIdEnrollImportPost200ResponseEnrollListInner.enrollId) &&
            Objects.equals(this.nickName, v1MeetingsMeetingIdEnrollImportPost200ResponseEnrollListInner.nickName) &&
            Objects.equals(this.openId, v1MeetingsMeetingIdEnrollImportPost200ResponseEnrollListInner.openId) &&
            Objects.equals(this.phoneNumber, v1MeetingsMeetingIdEnrollImportPost200ResponseEnrollListInner.phoneNumber) &&
            Objects.equals(this.userid, v1MeetingsMeetingIdEnrollImportPost200ResponseEnrollListInner.userid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(area, enrollCode, enrollId, nickName, openId, phoneNumber, userid);
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
        sb.append("class V1MeetingsMeetingIdEnrollImportPost200ResponseEnrollListInner {\n");
        sb.append("    area: ").append(toIndentedString(area)).append("\n");
        sb.append("    enrollCode: ").append(toIndentedString(enrollCode)).append("\n");
        sb.append("    enrollId: ").append(toIndentedString(enrollId)).append("\n");
        sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
        sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
        sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
        sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

