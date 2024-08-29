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
 * V1MeetingsMeetingIdPut200ResponseMeetingInfoListInner
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingsMeetingIdPut200ResponseMeetingInfoListInner {
    @JsonProperty(value = "enable_live")
    private Boolean enableLive;

    @JsonProperty(value = "host_key")
    private String hostKey;

    @JsonProperty(value = "live_config")
    private V1MeetingsMeetingIdPut200ResponseMeetingInfoListInnerLiveConfig liveConfig;

    @JsonProperty(value = "meeting_code")
    private String meetingCode;

    @JsonProperty(value = "meeting_id")
    private String meetingId;

    /**
     */
    public V1MeetingsMeetingIdPut200ResponseMeetingInfoListInner() {
    }

    /**
     * @param enableLive 是否开启直播
     */
    public V1MeetingsMeetingIdPut200ResponseMeetingInfoListInner enableLive(Boolean enableLive) {
        this.enableLive = enableLive;
        return this;
    }
    /**
     * @return enableLive 是否开启直播
     **/
    public Boolean getEnableLive() {
        return enableLive;
    }

    /**
     * @param enableLive 是否开启直播
     */
    public void setEnableLive(Boolean enableLive) {
        this.enableLive = enableLive;
    }
    /**
     * @param hostKey 主持人密钥，仅支持6位数字。 如开启主持人密钥后没有填写此项，将自动分配一个6位数字的密钥。 
     */
    public V1MeetingsMeetingIdPut200ResponseMeetingInfoListInner hostKey(String hostKey) {
        this.hostKey = hostKey;
        return this;
    }
    /**
     * @return hostKey 主持人密钥，仅支持6位数字。 如开启主持人密钥后没有填写此项，将自动分配一个6位数字的密钥。 
     **/
    public String getHostKey() {
        return hostKey;
    }

    /**
     * @param hostKey 主持人密钥，仅支持6位数字。 如开启主持人密钥后没有填写此项，将自动分配一个6位数字的密钥。 
     */
    public void setHostKey(String hostKey) {
        this.hostKey = hostKey;
    }
    /**
     * @param liveConfig 
     */
    public V1MeetingsMeetingIdPut200ResponseMeetingInfoListInner liveConfig(V1MeetingsMeetingIdPut200ResponseMeetingInfoListInnerLiveConfig liveConfig) {
        this.liveConfig = liveConfig;
        return this;
    }
    /**
     * @return liveConfig 
     **/
    public V1MeetingsMeetingIdPut200ResponseMeetingInfoListInnerLiveConfig getLiveConfig() {
        return liveConfig;
    }

    /**
     * @param liveConfig 
     */
    public void setLiveConfig(V1MeetingsMeetingIdPut200ResponseMeetingInfoListInnerLiveConfig liveConfig) {
        this.liveConfig = liveConfig;
    }
    /**
     * @param meetingCode 会议号码
     */
    public V1MeetingsMeetingIdPut200ResponseMeetingInfoListInner meetingCode(String meetingCode) {
        this.meetingCode = meetingCode;
        return this;
    }
    /**
     * @return meetingCode 会议号码
     **/
    public String getMeetingCode() {
        return meetingCode;
    }

    /**
     * @param meetingCode 会议号码
     */
    public void setMeetingCode(String meetingCode) {
        this.meetingCode = meetingCode;
    }
    /**
     * @param meetingId 会议的唯一 ID
     */
    public V1MeetingsMeetingIdPut200ResponseMeetingInfoListInner meetingId(String meetingId) {
        this.meetingId = meetingId;
        return this;
    }
    /**
     * @return meetingId 会议的唯一 ID
     **/
    public String getMeetingId() {
        return meetingId;
    }

    /**
     * @param meetingId 会议的唯一 ID
     */
    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingsMeetingIdPut200ResponseMeetingInfoListInner v1MeetingsMeetingIdPut200ResponseMeetingInfoListInner = (V1MeetingsMeetingIdPut200ResponseMeetingInfoListInner) o;
        return Objects.equals(this.enableLive, v1MeetingsMeetingIdPut200ResponseMeetingInfoListInner.enableLive) &&
            Objects.equals(this.hostKey, v1MeetingsMeetingIdPut200ResponseMeetingInfoListInner.hostKey) &&
            Objects.equals(this.liveConfig, v1MeetingsMeetingIdPut200ResponseMeetingInfoListInner.liveConfig) &&
            Objects.equals(this.meetingCode, v1MeetingsMeetingIdPut200ResponseMeetingInfoListInner.meetingCode) &&
            Objects.equals(this.meetingId, v1MeetingsMeetingIdPut200ResponseMeetingInfoListInner.meetingId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enableLive, hostKey, liveConfig, meetingCode, meetingId);
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
        sb.append("class V1MeetingsMeetingIdPut200ResponseMeetingInfoListInner {\n");
        sb.append("    enableLive: ").append(toIndentedString(enableLive)).append("\n");
        sb.append("    hostKey: ").append(toIndentedString(hostKey)).append("\n");
        sb.append("    liveConfig: ").append(toIndentedString(liveConfig)).append("\n");
        sb.append("    meetingCode: ").append(toIndentedString(meetingCode)).append("\n");
        sb.append("    meetingId: ").append(toIndentedString(meetingId)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

