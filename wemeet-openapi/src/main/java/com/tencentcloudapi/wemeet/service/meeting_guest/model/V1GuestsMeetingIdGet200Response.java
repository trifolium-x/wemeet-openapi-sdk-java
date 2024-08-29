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
 * V1GuestsMeetingIdGet200Response
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1GuestsMeetingIdGet200Response {
    @JsonProperty(value = "guests")
    private List<V1GuestsMeetingIdGet200ResponseGuestsInner> guests;

    @JsonProperty(value = "meeting_code")
    private String meetingCode;

    @JsonProperty(value = "meeting_id")
    private String meetingId;

    @JsonProperty(value = "subject")
    private String subject;

    /**
     */
    public V1GuestsMeetingIdGet200Response() {
    }

    /**
     * @param guests 会议嘉宾列表数组。
     */
    public V1GuestsMeetingIdGet200Response guests(List<V1GuestsMeetingIdGet200ResponseGuestsInner> guests) {
        this.guests = guests;
        return this;
    }
    /**
     * @return guests 会议嘉宾列表数组。
     **/
    public List<V1GuestsMeetingIdGet200ResponseGuestsInner> getGuests() {
        return guests;
    }

    /**
     * @param guests 会议嘉宾列表数组。
     */
    public void setGuests(List<V1GuestsMeetingIdGet200ResponseGuestsInner> guests) {
        this.guests = guests;
    }
    /**
     * @param meetingCode 会议 Code。
     */
    public V1GuestsMeetingIdGet200Response meetingCode(String meetingCode) {
        this.meetingCode = meetingCode;
        return this;
    }
    /**
     * @return meetingCode 会议 Code。
     **/
    public String getMeetingCode() {
        return meetingCode;
    }

    /**
     * @param meetingCode 会议 Code。
     */
    public void setMeetingCode(String meetingCode) {
        this.meetingCode = meetingCode;
    }
    /**
     * @param meetingId 会议 ID。
     */
    public V1GuestsMeetingIdGet200Response meetingId(String meetingId) {
        this.meetingId = meetingId;
        return this;
    }
    /**
     * @return meetingId 会议 ID。
     **/
    public String getMeetingId() {
        return meetingId;
    }

    /**
     * @param meetingId 会议 ID。
     */
    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }
    /**
     * @param subject 会议主题。
     */
    public V1GuestsMeetingIdGet200Response subject(String subject) {
        this.subject = subject;
        return this;
    }
    /**
     * @return subject 会议主题。
     **/
    public String getSubject() {
        return subject;
    }

    /**
     * @param subject 会议主题。
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1GuestsMeetingIdGet200Response v1GuestsMeetingIdGet200Response = (V1GuestsMeetingIdGet200Response) o;
        return Objects.equals(this.guests, v1GuestsMeetingIdGet200Response.guests) &&
            Objects.equals(this.meetingCode, v1GuestsMeetingIdGet200Response.meetingCode) &&
            Objects.equals(this.meetingId, v1GuestsMeetingIdGet200Response.meetingId) &&
            Objects.equals(this.subject, v1GuestsMeetingIdGet200Response.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(guests, meetingCode, meetingId, subject);
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
        sb.append("class V1GuestsMeetingIdGet200Response {\n");
        sb.append("    guests: ").append(toIndentedString(guests)).append("\n");
        sb.append("    meetingCode: ").append(toIndentedString(meetingCode)).append("\n");
        sb.append("    meetingId: ").append(toIndentedString(meetingId)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

