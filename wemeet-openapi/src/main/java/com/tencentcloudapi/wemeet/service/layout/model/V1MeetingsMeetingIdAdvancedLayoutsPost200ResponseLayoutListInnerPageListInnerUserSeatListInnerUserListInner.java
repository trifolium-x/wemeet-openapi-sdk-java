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

package com.tencentcloudapi.wemeet.service.layout.model;

import java.util.*;

import com.fasterxml.jackson.annotation.*;

/**
 * V1MeetingsMeetingIdAdvancedLayoutsPost200ResponseLayoutListInnerPageListInnerUserSeatListInnerUserListInner
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingsMeetingIdAdvancedLayoutsPost200ResponseLayoutListInnerPageListInnerUserSeatListInnerUserListInner {
    @JsonProperty(value = "ms_open_id")
    private String msOpenId;

    @JsonProperty(value = "userid")
    private String userid;

    @JsonProperty(value = "username")
    private String username;

    /**
     */
    public V1MeetingsMeetingIdAdvancedLayoutsPost200ResponseLayoutListInnerPageListInnerUserSeatListInnerUserListInner() {
    }

    /**
     * @param msOpenId 用户当前会议临时身份 ID，单场会议唯一
     */
    public V1MeetingsMeetingIdAdvancedLayoutsPost200ResponseLayoutListInnerPageListInnerUserSeatListInnerUserListInner msOpenId(String msOpenId) {
        this.msOpenId = msOpenId;
        return this;
    }
    /**
     * @return msOpenId 用户当前会议临时身份 ID，单场会议唯一
     **/
    public String getMsOpenId() {
        return msOpenId;
    }

    /**
     * @param msOpenId 用户当前会议临时身份 ID，单场会议唯一
     */
    public void setMsOpenId(String msOpenId) {
        this.msOpenId = msOpenId;
    }
    /**
     * @param userid 用户 ID
     */
    public V1MeetingsMeetingIdAdvancedLayoutsPost200ResponseLayoutListInnerPageListInnerUserSeatListInnerUserListInner userid(String userid) {
        this.userid = userid;
        return this;
    }
    /**
     * @return userid 用户 ID
     **/
    public String getUserid() {
        return userid;
    }

    /**
     * @param userid 用户 ID
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }
    /**
     * @param username 用户昵称，base64编码
     */
    public V1MeetingsMeetingIdAdvancedLayoutsPost200ResponseLayoutListInnerPageListInnerUserSeatListInnerUserListInner username(String username) {
        this.username = username;
        return this;
    }
    /**
     * @return username 用户昵称，base64编码
     **/
    public String getUsername() {
        return username;
    }

    /**
     * @param username 用户昵称，base64编码
     */
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingsMeetingIdAdvancedLayoutsPost200ResponseLayoutListInnerPageListInnerUserSeatListInnerUserListInner v1MeetingsMeetingIdAdvancedLayoutsPost200ResponseLayoutListInnerPageListInnerUserSeatListInnerUserListInner = (V1MeetingsMeetingIdAdvancedLayoutsPost200ResponseLayoutListInnerPageListInnerUserSeatListInnerUserListInner) o;
        return Objects.equals(this.msOpenId, v1MeetingsMeetingIdAdvancedLayoutsPost200ResponseLayoutListInnerPageListInnerUserSeatListInnerUserListInner.msOpenId) &&
            Objects.equals(this.userid, v1MeetingsMeetingIdAdvancedLayoutsPost200ResponseLayoutListInnerPageListInnerUserSeatListInnerUserListInner.userid) &&
            Objects.equals(this.username, v1MeetingsMeetingIdAdvancedLayoutsPost200ResponseLayoutListInnerPageListInnerUserSeatListInnerUserListInner.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(msOpenId, userid, username);
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
        sb.append("class V1MeetingsMeetingIdAdvancedLayoutsPost200ResponseLayoutListInnerPageListInnerUserSeatListInnerUserListInner {\n");
        sb.append("    msOpenId: ").append(toIndentedString(msOpenId)).append("\n");
        sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

