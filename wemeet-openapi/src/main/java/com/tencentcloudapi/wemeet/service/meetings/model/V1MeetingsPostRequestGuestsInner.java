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
 * V1MeetingsPostRequestGuestsInner
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingsPostRequestGuestsInner {
    @JsonProperty(value = "area", required = true)
    private String area;

    @JsonProperty(value = "guest_name")
    private String guestName;

    @JsonProperty(value = "phone_number", required = true)
    private String phoneNumber;

    /**
     * @param area 国家/地区代码（例如：中国传86，不是+86，也不是0086） (required)
     * @param phoneNumber 手机号 (required)
     */
    public V1MeetingsPostRequestGuestsInner(@NotNull String area, @NotNull String phoneNumber) {
        this.area = area;
        this.phoneNumber = phoneNumber;
    }

    /**
     * @param area 国家/地区代码（例如：中国传86，不是+86，也不是0086） (required)
     */
    public V1MeetingsPostRequestGuestsInner area(@NotNull String area) {
        this.area = area;
        return this;
    }
    /**
     * @return area 国家/地区代码（例如：中国传86，不是+86，也不是0086）
     **/
    public String getArea() {
        return area;
    }

    /**
     * @param area 国家/地区代码（例如：中国传86，不是+86，也不是0086） (required)
     */
    public void setArea(String area) {
        this.area = area;
    }
    /**
     * @param guestName 嘉宾名称
     */
    public V1MeetingsPostRequestGuestsInner guestName(String guestName) {
        this.guestName = guestName;
        return this;
    }
    /**
     * @return guestName 嘉宾名称
     **/
    public String getGuestName() {
        return guestName;
    }

    /**
     * @param guestName 嘉宾名称
     */
    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }
    /**
     * @param phoneNumber 手机号 (required)
     */
    public V1MeetingsPostRequestGuestsInner phoneNumber(@NotNull String phoneNumber) {
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
     * @param phoneNumber 手机号 (required)
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingsPostRequestGuestsInner v1MeetingsPostRequestGuestsInner = (V1MeetingsPostRequestGuestsInner) o;
        return Objects.equals(this.area, v1MeetingsPostRequestGuestsInner.area) &&
            Objects.equals(this.guestName, v1MeetingsPostRequestGuestsInner.guestName) &&
            Objects.equals(this.phoneNumber, v1MeetingsPostRequestGuestsInner.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(area, guestName, phoneNumber);
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
        sb.append("class V1MeetingsPostRequestGuestsInner {\n");
        sb.append("    area: ").append(toIndentedString(area)).append("\n");
        sb.append("    guestName: ").append(toIndentedString(guestName)).append("\n");
        sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
