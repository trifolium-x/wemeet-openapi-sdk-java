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

package com.tencentcloudapi.wemeet.service.meeting_guest.model;

import java.util.*;

import com.fasterxml.jackson.annotation.*;

/**
 * V1GuestsMeetingIdGet200ResponseGuestsInner
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1GuestsMeetingIdGet200ResponseGuestsInner {
    @JsonProperty(value = "area")
    private String area;

    @JsonProperty(value = "guest_name")
    private String guestName;

    @JsonProperty(value = "phone_number")
    private String phoneNumber;

    /**
     */
    public V1GuestsMeetingIdGet200ResponseGuestsInner() {
    }

    /**
     * @param area 国家/地区代码（例如：中国传86，不是+86，也不是0086）。
     */
    public V1GuestsMeetingIdGet200ResponseGuestsInner area(String area) {
        this.area = area;
        return this;
    }
    /**
     * @return area 国家/地区代码（例如：中国传86，不是+86，也不是0086）。
     **/
    public String getArea() {
        return area;
    }

    /**
     * @param area 国家/地区代码（例如：中国传86，不是+86，也不是0086）。
     */
    public void setArea(String area) {
        this.area = area;
    }
    /**
     * @param guestName 嘉宾名称。
     */
    public V1GuestsMeetingIdGet200ResponseGuestsInner guestName(String guestName) {
        this.guestName = guestName;
        return this;
    }
    /**
     * @return guestName 嘉宾名称。
     **/
    public String getGuestName() {
        return guestName;
    }

    /**
     * @param guestName 嘉宾名称。
     */
    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }
    /**
     * @param phoneNumber 手机号。
     */
    public V1GuestsMeetingIdGet200ResponseGuestsInner phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    /**
     * @return phoneNumber 手机号。
     **/
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber 手机号。
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
        V1GuestsMeetingIdGet200ResponseGuestsInner v1GuestsMeetingIdGet200ResponseGuestsInner = (V1GuestsMeetingIdGet200ResponseGuestsInner) o;
        return Objects.equals(this.area, v1GuestsMeetingIdGet200ResponseGuestsInner.area) &&
            Objects.equals(this.guestName, v1GuestsMeetingIdGet200ResponseGuestsInner.guestName) &&
            Objects.equals(this.phoneNumber, v1GuestsMeetingIdGet200ResponseGuestsInner.phoneNumber);
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
        sb.append("class V1GuestsMeetingIdGet200ResponseGuestsInner {\n");
        sb.append("    area: ").append(toIndentedString(area)).append("\n");
        sb.append("    guestName: ").append(toIndentedString(guestName)).append("\n");
        sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

