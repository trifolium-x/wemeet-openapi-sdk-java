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

/**
 * V1MeetingsMeetingIdEnrollImportPostRequestEnrollListInner
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingsMeetingIdEnrollImportPostRequestEnrollListInner {
    @JsonProperty(value = "area")
    private String area;

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
    public V1MeetingsMeetingIdEnrollImportPostRequestEnrollListInner() {
    }

    /**
     * @param area 国家/地区代码，若使用手机号，必填（例如：中国传86，不是+86）
     */
    public V1MeetingsMeetingIdEnrollImportPostRequestEnrollListInner area(String area) {
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
     * @param nickName 报名的昵称，与会中昵称可能不一致
     */
    public V1MeetingsMeetingIdEnrollImportPostRequestEnrollListInner nickName(String nickName) {
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
     * @param openId OAuth授权用户ID。  导入报名对象支持本企业（或与OAuth应用同企业）内 userid、授权用户的openid、phone_number 三种形式，三者必填其一；  如果都传了以openid为准；（优先级为：openid -&gt; userid -&gt; phone_number）  JWT鉴权方式无法使用open_id导入报名。
     */
    public V1MeetingsMeetingIdEnrollImportPostRequestEnrollListInner openId(String openId) {
        this.openId = openId;
        return this;
    }
    /**
     * @return openId OAuth授权用户ID。  导入报名对象支持本企业（或与OAuth应用同企业）内 userid、授权用户的openid、phone_number 三种形式，三者必填其一；  如果都传了以openid为准；（优先级为：openid -&gt; userid -&gt; phone_number）  JWT鉴权方式无法使用open_id导入报名。
     **/
    public String getOpenId() {
        return openId;
    }

    /**
     * @param openId OAuth授权用户ID。  导入报名对象支持本企业（或与OAuth应用同企业）内 userid、授权用户的openid、phone_number 三种形式，三者必填其一；  如果都传了以openid为准；（优先级为：openid -&gt; userid -&gt; phone_number）  JWT鉴权方式无法使用open_id导入报名。
     */
    public void setOpenId(String openId) {
        this.openId = openId;
    }
    /**
     * @param phoneNumber 手机号,导入报名支持本企业（或与OAuth应用同企业）内 userid、授权用户的openid、phone_number 三种形式，三者必填其一。
     */
    public V1MeetingsMeetingIdEnrollImportPostRequestEnrollListInner phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    /**
     * @return phoneNumber 手机号,导入报名支持本企业（或与OAuth应用同企业）内 userid、授权用户的openid、phone_number 三种形式，三者必填其一。
     **/
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber 手机号,导入报名支持本企业（或与OAuth应用同企业）内 userid、授权用户的openid、phone_number 三种形式，三者必填其一。
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    /**
     * @param userid 用户的唯一 ID（企业内部请使用企业唯一用户标识）。 导入报名支持本企业（或与OAuth应用同企业）内 userid、授权用户的openid、phone_number 三种形式，三者必填其一。
     */
    public V1MeetingsMeetingIdEnrollImportPostRequestEnrollListInner userid(String userid) {
        this.userid = userid;
        return this;
    }
    /**
     * @return userid 用户的唯一 ID（企业内部请使用企业唯一用户标识）。 导入报名支持本企业（或与OAuth应用同企业）内 userid、授权用户的openid、phone_number 三种形式，三者必填其一。
     **/
    public String getUserid() {
        return userid;
    }

    /**
     * @param userid 用户的唯一 ID（企业内部请使用企业唯一用户标识）。 导入报名支持本企业（或与OAuth应用同企业）内 userid、授权用户的openid、phone_number 三种形式，三者必填其一。
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
        V1MeetingsMeetingIdEnrollImportPostRequestEnrollListInner v1MeetingsMeetingIdEnrollImportPostRequestEnrollListInner = (V1MeetingsMeetingIdEnrollImportPostRequestEnrollListInner) o;
        return Objects.equals(this.area, v1MeetingsMeetingIdEnrollImportPostRequestEnrollListInner.area) &&
            Objects.equals(this.nickName, v1MeetingsMeetingIdEnrollImportPostRequestEnrollListInner.nickName) &&
            Objects.equals(this.openId, v1MeetingsMeetingIdEnrollImportPostRequestEnrollListInner.openId) &&
            Objects.equals(this.phoneNumber, v1MeetingsMeetingIdEnrollImportPostRequestEnrollListInner.phoneNumber) &&
            Objects.equals(this.userid, v1MeetingsMeetingIdEnrollImportPostRequestEnrollListInner.userid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(area, nickName, openId, phoneNumber, userid);
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
        sb.append("class V1MeetingsMeetingIdEnrollImportPostRequestEnrollListInner {\n");
        sb.append("    area: ").append(toIndentedString(area)).append("\n");
        sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
        sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
        sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
        sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

