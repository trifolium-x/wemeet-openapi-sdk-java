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
 * V1MeetingsMeetingIdParticipantsGet200Response
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingsMeetingIdParticipantsGet200Response {
    @JsonProperty(value = "has_remaining")
    private Boolean hasRemaining;

    @JsonProperty(value = "meeting_code")
    private String meetingCode;

    @JsonProperty(value = "meeting_id")
    private String meetingId;

    @JsonProperty(value = "next_pos")
    private Long nextPos;

    @JsonProperty(value = "participants")
    private List<V1MeetingsMeetingIdParticipantsGet200ResponseParticipantsInner> participants;

    @JsonProperty(value = "schedule_end_time")
    private String scheduleEndTime;

    @JsonProperty(value = "schedule_start_time")
    private String scheduleStartTime;

    @JsonProperty(value = "subject")
    private String subject;

    @JsonProperty(value = "total_count")
    private Long totalCount;

    /**
     */
    public V1MeetingsMeetingIdParticipantsGet200Response() {
    }

    /**
     * @param hasRemaining 是否还有未拉取的数据，该接口可多次拉取到的数据总量上限为5w条。
     */
    public V1MeetingsMeetingIdParticipantsGet200Response hasRemaining(Boolean hasRemaining) {
        this.hasRemaining = hasRemaining;
        return this;
    }
    /**
     * @return hasRemaining 是否还有未拉取的数据，该接口可多次拉取到的数据总量上限为5w条。
     **/
    public Boolean getHasRemaining() {
        return hasRemaining;
    }

    /**
     * @param hasRemaining 是否还有未拉取的数据，该接口可多次拉取到的数据总量上限为5w条。
     */
    public void setHasRemaining(Boolean hasRemaining) {
        this.hasRemaining = hasRemaining;
    }
    /**
     * @param meetingCode 会议号码。
     */
    public V1MeetingsMeetingIdParticipantsGet200Response meetingCode(String meetingCode) {
        this.meetingCode = meetingCode;
        return this;
    }
    /**
     * @return meetingCode 会议号码。
     **/
    public String getMeetingCode() {
        return meetingCode;
    }

    /**
     * @param meetingCode 会议号码。
     */
    public void setMeetingCode(String meetingCode) {
        this.meetingCode = meetingCode;
    }
    /**
     * @param meetingId 会议的唯一 ID。
     */
    public V1MeetingsMeetingIdParticipantsGet200Response meetingId(String meetingId) {
        this.meetingId = meetingId;
        return this;
    }
    /**
     * @return meetingId 会议的唯一 ID。
     **/
    public String getMeetingId() {
        return meetingId;
    }

    /**
     * @param meetingId 会议的唯一 ID。
     */
    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }
    /**
     * @param nextPos 和“has_remaining”一起，数据量比较大的情况下支持参会成员列表的多次获取。
     */
    public V1MeetingsMeetingIdParticipantsGet200Response nextPos(Long nextPos) {
        this.nextPos = nextPos;
        return this;
    }
    /**
     * @return nextPos 和“has_remaining”一起，数据量比较大的情况下支持参会成员列表的多次获取。
     **/
    public Long getNextPos() {
        return nextPos;
    }

    /**
     * @param nextPos 和“has_remaining”一起，数据量比较大的情况下支持参会成员列表的多次获取。
     */
    public void setNextPos(Long nextPos) {
        this.nextPos = nextPos;
    }
    /**
     * @param participants 参会人员对象数组。
     */
    public V1MeetingsMeetingIdParticipantsGet200Response participants(List<V1MeetingsMeetingIdParticipantsGet200ResponseParticipantsInner> participants) {
        this.participants = participants;
        return this;
    }
    /**
     * @return participants 参会人员对象数组。
     **/
    public List<V1MeetingsMeetingIdParticipantsGet200ResponseParticipantsInner> getParticipants() {
        return participants;
    }

    /**
     * @param participants 参会人员对象数组。
     */
    public void setParticipants(List<V1MeetingsMeetingIdParticipantsGet200ResponseParticipantsInner> participants) {
        this.participants = participants;
    }
    /**
     * @param scheduleEndTime 预定会议开始时间戳（单位秒）。
     */
    public V1MeetingsMeetingIdParticipantsGet200Response scheduleEndTime(String scheduleEndTime) {
        this.scheduleEndTime = scheduleEndTime;
        return this;
    }
    /**
     * @return scheduleEndTime 预定会议开始时间戳（单位秒）。
     **/
    public String getScheduleEndTime() {
        return scheduleEndTime;
    }

    /**
     * @param scheduleEndTime 预定会议开始时间戳（单位秒）。
     */
    public void setScheduleEndTime(String scheduleEndTime) {
        this.scheduleEndTime = scheduleEndTime;
    }
    /**
     * @param scheduleStartTime 预定会议结束时间戳（单位秒）。
     */
    public V1MeetingsMeetingIdParticipantsGet200Response scheduleStartTime(String scheduleStartTime) {
        this.scheduleStartTime = scheduleStartTime;
        return this;
    }
    /**
     * @return scheduleStartTime 预定会议结束时间戳（单位秒）。
     **/
    public String getScheduleStartTime() {
        return scheduleStartTime;
    }

    /**
     * @param scheduleStartTime 预定会议结束时间戳（单位秒）。
     */
    public void setScheduleStartTime(String scheduleStartTime) {
        this.scheduleStartTime = scheduleStartTime;
    }
    /**
     * @param subject 会议主题。
     */
    public V1MeetingsMeetingIdParticipantsGet200Response subject(String subject) {
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
    /**
     * @param totalCount 当前参会总人次。
     */
    public V1MeetingsMeetingIdParticipantsGet200Response totalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    /**
     * @return totalCount 当前参会总人次。
     **/
    public Long getTotalCount() {
        return totalCount;
    }

    /**
     * @param totalCount 当前参会总人次。
     */
    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingsMeetingIdParticipantsGet200Response v1MeetingsMeetingIdParticipantsGet200Response = (V1MeetingsMeetingIdParticipantsGet200Response) o;
        return Objects.equals(this.hasRemaining, v1MeetingsMeetingIdParticipantsGet200Response.hasRemaining) &&
            Objects.equals(this.meetingCode, v1MeetingsMeetingIdParticipantsGet200Response.meetingCode) &&
            Objects.equals(this.meetingId, v1MeetingsMeetingIdParticipantsGet200Response.meetingId) &&
            Objects.equals(this.nextPos, v1MeetingsMeetingIdParticipantsGet200Response.nextPos) &&
            Objects.equals(this.participants, v1MeetingsMeetingIdParticipantsGet200Response.participants) &&
            Objects.equals(this.scheduleEndTime, v1MeetingsMeetingIdParticipantsGet200Response.scheduleEndTime) &&
            Objects.equals(this.scheduleStartTime, v1MeetingsMeetingIdParticipantsGet200Response.scheduleStartTime) &&
            Objects.equals(this.subject, v1MeetingsMeetingIdParticipantsGet200Response.subject) &&
            Objects.equals(this.totalCount, v1MeetingsMeetingIdParticipantsGet200Response.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasRemaining, meetingCode, meetingId, nextPos, participants, scheduleEndTime, scheduleStartTime, subject, totalCount);
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
        sb.append("class V1MeetingsMeetingIdParticipantsGet200Response {\n");
        sb.append("    hasRemaining: ").append(toIndentedString(hasRemaining)).append("\n");
        sb.append("    meetingCode: ").append(toIndentedString(meetingCode)).append("\n");
        sb.append("    meetingId: ").append(toIndentedString(meetingId)).append("\n");
        sb.append("    nextPos: ").append(toIndentedString(nextPos)).append("\n");
        sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
        sb.append("    scheduleEndTime: ").append(toIndentedString(scheduleEndTime)).append("\n");
        sb.append("    scheduleStartTime: ").append(toIndentedString(scheduleStartTime)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

