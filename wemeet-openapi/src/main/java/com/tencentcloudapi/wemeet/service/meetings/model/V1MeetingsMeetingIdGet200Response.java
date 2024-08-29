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
 * V1MeetingsMeetingIdGet200Response
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingsMeetingIdGet200Response {
    @JsonProperty(value = "meeting_info_list")
    private List<V1MeetingsMeetingIdGet200ResponseMeetingInfoListInner> meetingInfoList;

    @JsonProperty(value = "meeting_number")
    private Long meetingNumber;

    /**
     */
    public V1MeetingsMeetingIdGet200Response() {
    }

    /**
     * @param meetingInfoList 
     */
    public V1MeetingsMeetingIdGet200Response meetingInfoList(List<V1MeetingsMeetingIdGet200ResponseMeetingInfoListInner> meetingInfoList) {
        this.meetingInfoList = meetingInfoList;
        return this;
    }
    /**
     * @return meetingInfoList 
     **/
    public List<V1MeetingsMeetingIdGet200ResponseMeetingInfoListInner> getMeetingInfoList() {
        return meetingInfoList;
    }

    /**
     * @param meetingInfoList 
     */
    public void setMeetingInfoList(List<V1MeetingsMeetingIdGet200ResponseMeetingInfoListInner> meetingInfoList) {
        this.meetingInfoList = meetingInfoList;
    }
    /**
     * @param meetingNumber 
     */
    public V1MeetingsMeetingIdGet200Response meetingNumber(Long meetingNumber) {
        this.meetingNumber = meetingNumber;
        return this;
    }
    /**
     * @return meetingNumber 
     **/
    public Long getMeetingNumber() {
        return meetingNumber;
    }

    /**
     * @param meetingNumber 
     */
    public void setMeetingNumber(Long meetingNumber) {
        this.meetingNumber = meetingNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingsMeetingIdGet200Response v1MeetingsMeetingIdGet200Response = (V1MeetingsMeetingIdGet200Response) o;
        return Objects.equals(this.meetingInfoList, v1MeetingsMeetingIdGet200Response.meetingInfoList) &&
            Objects.equals(this.meetingNumber, v1MeetingsMeetingIdGet200Response.meetingNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(meetingInfoList, meetingNumber);
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
        sb.append("class V1MeetingsMeetingIdGet200Response {\n");
        sb.append("    meetingInfoList: ").append(toIndentedString(meetingInfoList)).append("\n");
        sb.append("    meetingNumber: ").append(toIndentedString(meetingNumber)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

