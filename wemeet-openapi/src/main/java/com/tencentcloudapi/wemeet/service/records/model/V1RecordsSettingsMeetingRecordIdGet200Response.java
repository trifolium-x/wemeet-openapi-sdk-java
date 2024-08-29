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

package com.tencentcloudapi.wemeet.service.records.model;

import java.util.*;

import com.fasterxml.jackson.annotation.*;

/**
 * V1RecordsSettingsMeetingRecordIdGet200Response
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1RecordsSettingsMeetingRecordIdGet200Response {
    @JsonProperty(value = "meeting_id")
    private String meetingId;

    @JsonProperty(value = "meeting_record_name")
    private String meetingRecordName;

    @JsonProperty(value = "sharing_config")
    private V1RecordsSettingsMeetingRecordIdGet200ResponseSharingConfig sharingConfig;

    /**
     */
    public V1RecordsSettingsMeetingRecordIdGet200Response() {
    }

    /**
     * @param meetingId 会议ID
     */
    public V1RecordsSettingsMeetingRecordIdGet200Response meetingId(String meetingId) {
        this.meetingId = meetingId;
        return this;
    }
    /**
     * @return meetingId 会议ID
     **/
    public String getMeetingId() {
        return meetingId;
    }

    /**
     * @param meetingId 会议ID
     */
    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }
    /**
     * @param meetingRecordName 录制名称
     */
    public V1RecordsSettingsMeetingRecordIdGet200Response meetingRecordName(String meetingRecordName) {
        this.meetingRecordName = meetingRecordName;
        return this;
    }
    /**
     * @return meetingRecordName 录制名称
     **/
    public String getMeetingRecordName() {
        return meetingRecordName;
    }

    /**
     * @param meetingRecordName 录制名称
     */
    public void setMeetingRecordName(String meetingRecordName) {
        this.meetingRecordName = meetingRecordName;
    }
    /**
     * @param sharingConfig 
     */
    public V1RecordsSettingsMeetingRecordIdGet200Response sharingConfig(V1RecordsSettingsMeetingRecordIdGet200ResponseSharingConfig sharingConfig) {
        this.sharingConfig = sharingConfig;
        return this;
    }
    /**
     * @return sharingConfig 
     **/
    public V1RecordsSettingsMeetingRecordIdGet200ResponseSharingConfig getSharingConfig() {
        return sharingConfig;
    }

    /**
     * @param sharingConfig 
     */
    public void setSharingConfig(V1RecordsSettingsMeetingRecordIdGet200ResponseSharingConfig sharingConfig) {
        this.sharingConfig = sharingConfig;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1RecordsSettingsMeetingRecordIdGet200Response v1RecordsSettingsMeetingRecordIdGet200Response = (V1RecordsSettingsMeetingRecordIdGet200Response) o;
        return Objects.equals(this.meetingId, v1RecordsSettingsMeetingRecordIdGet200Response.meetingId) &&
            Objects.equals(this.meetingRecordName, v1RecordsSettingsMeetingRecordIdGet200Response.meetingRecordName) &&
            Objects.equals(this.sharingConfig, v1RecordsSettingsMeetingRecordIdGet200Response.sharingConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(meetingId, meetingRecordName, sharingConfig);
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
        sb.append("class V1RecordsSettingsMeetingRecordIdGet200Response {\n");
        sb.append("    meetingId: ").append(toIndentedString(meetingId)).append("\n");
        sb.append("    meetingRecordName: ").append(toIndentedString(meetingRecordName)).append("\n");
        sb.append("    sharingConfig: ").append(toIndentedString(sharingConfig)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

