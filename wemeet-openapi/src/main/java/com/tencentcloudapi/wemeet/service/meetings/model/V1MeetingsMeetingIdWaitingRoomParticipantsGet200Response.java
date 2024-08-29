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
 * V1MeetingsMeetingIdWaitingRoomParticipantsGet200Response
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingsMeetingIdWaitingRoomParticipantsGet200Response {
    @JsonProperty(value = "current_page")
    private Long currentPage;

    @JsonProperty(value = "current_size")
    private Long currentSize;

    @JsonProperty(value = "meeting_code")
    private String meetingCode;

    @JsonProperty(value = "meeting_id")
    private String meetingId;

    @JsonProperty(value = "participants")
    private List<V1MeetingsMeetingIdWaitingRoomParticipantsGet200ResponseParticipantsInner> participants;

    @JsonProperty(value = "schedule_end_time")
    private Long scheduleEndTime;

    @JsonProperty(value = "schedule_start_time")
    private Long scheduleStartTime;

    @JsonProperty(value = "subject")
    private String subject;

    @JsonProperty(value = "total_count")
    private Long totalCount;

    @JsonProperty(value = "total_page")
    private Long totalPage;

    /**
     */
    public V1MeetingsMeetingIdWaitingRoomParticipantsGet200Response() {
    }

    /**
     * @param currentPage 分页查询返回当前页码
     */
    public V1MeetingsMeetingIdWaitingRoomParticipantsGet200Response currentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    /**
     * @return currentPage 分页查询返回当前页码
     **/
    public Long getCurrentPage() {
        return currentPage;
    }

    /**
     * @param currentPage 分页查询返回当前页码
     */
    public void setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
    }
    /**
     * @param currentSize 分页查询返回单页数据条数
     */
    public V1MeetingsMeetingIdWaitingRoomParticipantsGet200Response currentSize(Long currentSize) {
        this.currentSize = currentSize;
        return this;
    }
    /**
     * @return currentSize 分页查询返回单页数据条数
     **/
    public Long getCurrentSize() {
        return currentSize;
    }

    /**
     * @param currentSize 分页查询返回单页数据条数
     */
    public void setCurrentSize(Long currentSize) {
        this.currentSize = currentSize;
    }
    /**
     * @param meetingCode 会议CODE
     */
    public V1MeetingsMeetingIdWaitingRoomParticipantsGet200Response meetingCode(String meetingCode) {
        this.meetingCode = meetingCode;
        return this;
    }
    /**
     * @return meetingCode 会议CODE
     **/
    public String getMeetingCode() {
        return meetingCode;
    }

    /**
     * @param meetingCode 会议CODE
     */
    public void setMeetingCode(String meetingCode) {
        this.meetingCode = meetingCode;
    }
    /**
     * @param meetingId 会议唯一 ID
     */
    public V1MeetingsMeetingIdWaitingRoomParticipantsGet200Response meetingId(String meetingId) {
        this.meetingId = meetingId;
        return this;
    }
    /**
     * @return meetingId 会议唯一 ID
     **/
    public String getMeetingId() {
        return meetingId;
    }

    /**
     * @param meetingId 会议唯一 ID
     */
    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }
    /**
     * @param participants 等候室人员对象数组
     */
    public V1MeetingsMeetingIdWaitingRoomParticipantsGet200Response participants(List<V1MeetingsMeetingIdWaitingRoomParticipantsGet200ResponseParticipantsInner> participants) {
        this.participants = participants;
        return this;
    }
    /**
     * @return participants 等候室人员对象数组
     **/
    public List<V1MeetingsMeetingIdWaitingRoomParticipantsGet200ResponseParticipantsInner> getParticipants() {
        return participants;
    }

    /**
     * @param participants 等候室人员对象数组
     */
    public void setParticipants(List<V1MeetingsMeetingIdWaitingRoomParticipantsGet200ResponseParticipantsInner> participants) {
        this.participants = participants;
    }
    /**
     * @param scheduleEndTime 预定的会议结束时间戳（单位秒）
     */
    public V1MeetingsMeetingIdWaitingRoomParticipantsGet200Response scheduleEndTime(Long scheduleEndTime) {
        this.scheduleEndTime = scheduleEndTime;
        return this;
    }
    /**
     * @return scheduleEndTime 预定的会议结束时间戳（单位秒）
     **/
    public Long getScheduleEndTime() {
        return scheduleEndTime;
    }

    /**
     * @param scheduleEndTime 预定的会议结束时间戳（单位秒）
     */
    public void setScheduleEndTime(Long scheduleEndTime) {
        this.scheduleEndTime = scheduleEndTime;
    }
    /**
     * @param scheduleStartTime 预定的会议开始时间戳（单位秒）
     */
    public V1MeetingsMeetingIdWaitingRoomParticipantsGet200Response scheduleStartTime(Long scheduleStartTime) {
        this.scheduleStartTime = scheduleStartTime;
        return this;
    }
    /**
     * @return scheduleStartTime 预定的会议开始时间戳（单位秒）
     **/
    public Long getScheduleStartTime() {
        return scheduleStartTime;
    }

    /**
     * @param scheduleStartTime 预定的会议开始时间戳（单位秒）
     */
    public void setScheduleStartTime(Long scheduleStartTime) {
        this.scheduleStartTime = scheduleStartTime;
    }
    /**
     * @param subject 会议主题 (base64 编码)
     */
    public V1MeetingsMeetingIdWaitingRoomParticipantsGet200Response subject(String subject) {
        this.subject = subject;
        return this;
    }
    /**
     * @return subject 会议主题 (base64 编码)
     **/
    public String getSubject() {
        return subject;
    }

    /**
     * @param subject 会议主题 (base64 编码)
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }
    /**
     * @param totalCount 分页查询返回数据总数
     */
    public V1MeetingsMeetingIdWaitingRoomParticipantsGet200Response totalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    /**
     * @return totalCount 分页查询返回数据总数
     **/
    public Long getTotalCount() {
        return totalCount;
    }

    /**
     * @param totalCount 分页查询返回数据总数
     */
    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }
    /**
     * @param totalPage 分页查询返回分页总数
     */
    public V1MeetingsMeetingIdWaitingRoomParticipantsGet200Response totalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    /**
     * @return totalPage 分页查询返回分页总数
     **/
    public Long getTotalPage() {
        return totalPage;
    }

    /**
     * @param totalPage 分页查询返回分页总数
     */
    public void setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingsMeetingIdWaitingRoomParticipantsGet200Response v1MeetingsMeetingIdWaitingRoomParticipantsGet200Response = (V1MeetingsMeetingIdWaitingRoomParticipantsGet200Response) o;
        return Objects.equals(this.currentPage, v1MeetingsMeetingIdWaitingRoomParticipantsGet200Response.currentPage) &&
            Objects.equals(this.currentSize, v1MeetingsMeetingIdWaitingRoomParticipantsGet200Response.currentSize) &&
            Objects.equals(this.meetingCode, v1MeetingsMeetingIdWaitingRoomParticipantsGet200Response.meetingCode) &&
            Objects.equals(this.meetingId, v1MeetingsMeetingIdWaitingRoomParticipantsGet200Response.meetingId) &&
            Objects.equals(this.participants, v1MeetingsMeetingIdWaitingRoomParticipantsGet200Response.participants) &&
            Objects.equals(this.scheduleEndTime, v1MeetingsMeetingIdWaitingRoomParticipantsGet200Response.scheduleEndTime) &&
            Objects.equals(this.scheduleStartTime, v1MeetingsMeetingIdWaitingRoomParticipantsGet200Response.scheduleStartTime) &&
            Objects.equals(this.subject, v1MeetingsMeetingIdWaitingRoomParticipantsGet200Response.subject) &&
            Objects.equals(this.totalCount, v1MeetingsMeetingIdWaitingRoomParticipantsGet200Response.totalCount) &&
            Objects.equals(this.totalPage, v1MeetingsMeetingIdWaitingRoomParticipantsGet200Response.totalPage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentPage, currentSize, meetingCode, meetingId, participants, scheduleEndTime, scheduleStartTime, subject, totalCount, totalPage);
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
        sb.append("class V1MeetingsMeetingIdWaitingRoomParticipantsGet200Response {\n");
        sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
        sb.append("    currentSize: ").append(toIndentedString(currentSize)).append("\n");
        sb.append("    meetingCode: ").append(toIndentedString(meetingCode)).append("\n");
        sb.append("    meetingId: ").append(toIndentedString(meetingId)).append("\n");
        sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
        sb.append("    scheduleEndTime: ").append(toIndentedString(scheduleEndTime)).append("\n");
        sb.append("    scheduleStartTime: ").append(toIndentedString(scheduleStartTime)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    totalPage: ").append(toIndentedString(totalPage)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

