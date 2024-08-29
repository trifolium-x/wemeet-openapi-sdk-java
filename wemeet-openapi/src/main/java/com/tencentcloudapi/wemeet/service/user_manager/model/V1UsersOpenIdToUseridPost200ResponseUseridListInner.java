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

package com.tencentcloudapi.wemeet.service.user_manager.model;

import java.util.*;

import com.fasterxml.jackson.annotation.*;

/**
 * V1UsersOpenIdToUseridPost200ResponseUseridListInner
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1UsersOpenIdToUseridPost200ResponseUseridListInner {
    @JsonProperty(value = "open_id")
    private String openId;

    @JsonProperty(value = "userid")
    private String userid;

    /**
     */
    public V1UsersOpenIdToUseridPost200ResponseUseridListInner() {
    }

    /**
     * @param openId 需要转换的open_id
     */
    public V1UsersOpenIdToUseridPost200ResponseUseridListInner openId(String openId) {
        this.openId = openId;
        return this;
    }
    /**
     * @return openId 需要转换的open_id
     **/
    public String getOpenId() {
        return openId;
    }

    /**
     * @param openId 需要转换的open_id
     */
    public void setOpenId(String openId) {
        this.openId = openId;
    }
    /**
     * @param userid 转换成功后，该open_id所对应的本企业下用户的userid。
     */
    public V1UsersOpenIdToUseridPost200ResponseUseridListInner userid(String userid) {
        this.userid = userid;
        return this;
    }
    /**
     * @return userid 转换成功后，该open_id所对应的本企业下用户的userid。
     **/
    public String getUserid() {
        return userid;
    }

    /**
     * @param userid 转换成功后，该open_id所对应的本企业下用户的userid。
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
        V1UsersOpenIdToUseridPost200ResponseUseridListInner v1UsersOpenIdToUseridPost200ResponseUseridListInner = (V1UsersOpenIdToUseridPost200ResponseUseridListInner) o;
        return Objects.equals(this.openId, v1UsersOpenIdToUseridPost200ResponseUseridListInner.openId) &&
            Objects.equals(this.userid, v1UsersOpenIdToUseridPost200ResponseUseridListInner.userid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(openId, userid);
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
        sb.append("class V1UsersOpenIdToUseridPost200ResponseUseridListInner {\n");
        sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
        sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

