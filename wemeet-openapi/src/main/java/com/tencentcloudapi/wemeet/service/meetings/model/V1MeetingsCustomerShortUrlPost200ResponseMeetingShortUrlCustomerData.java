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
 * 用户专属参会链接对象。
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingsCustomerShortUrlPost200ResponseMeetingShortUrlCustomerData {
    @JsonProperty(value = "customer_data")
    private String customerData;

    @JsonProperty(value = "meeting_short_url")
    private String meetingShortUrl;

    /**
     */
    public V1MeetingsCustomerShortUrlPost200ResponseMeetingShortUrlCustomerData() {
    }

    /**
     * @param customerData 用户专属字段
     */
    public V1MeetingsCustomerShortUrlPost200ResponseMeetingShortUrlCustomerData customerData(String customerData) {
        this.customerData = customerData;
        return this;
    }
    /**
     * @return customerData 用户专属字段
     **/
    public String getCustomerData() {
        return customerData;
    }

    /**
     * @param customerData 用户专属字段
     */
    public void setCustomerData(String customerData) {
        this.customerData = customerData;
    }
    /**
     * @param meetingShortUrl 用户专属参会链接
     */
    public V1MeetingsCustomerShortUrlPost200ResponseMeetingShortUrlCustomerData meetingShortUrl(String meetingShortUrl) {
        this.meetingShortUrl = meetingShortUrl;
        return this;
    }
    /**
     * @return meetingShortUrl 用户专属参会链接
     **/
    public String getMeetingShortUrl() {
        return meetingShortUrl;
    }

    /**
     * @param meetingShortUrl 用户专属参会链接
     */
    public void setMeetingShortUrl(String meetingShortUrl) {
        this.meetingShortUrl = meetingShortUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingsCustomerShortUrlPost200ResponseMeetingShortUrlCustomerData v1MeetingsCustomerShortUrlPost200ResponseMeetingShortUrlCustomerData = (V1MeetingsCustomerShortUrlPost200ResponseMeetingShortUrlCustomerData) o;
        return Objects.equals(this.customerData, v1MeetingsCustomerShortUrlPost200ResponseMeetingShortUrlCustomerData.customerData) &&
            Objects.equals(this.meetingShortUrl, v1MeetingsCustomerShortUrlPost200ResponseMeetingShortUrlCustomerData.meetingShortUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerData, meetingShortUrl);
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
        sb.append("class V1MeetingsCustomerShortUrlPost200ResponseMeetingShortUrlCustomerData {\n");
        sb.append("    customerData: ").append(toIndentedString(customerData)).append("\n");
        sb.append("    meetingShortUrl: ").append(toIndentedString(meetingShortUrl)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

