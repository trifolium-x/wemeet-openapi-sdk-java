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

package com.tencentcloudapi.wemeet.service.meeting_room.model;

import java.util.*;

import com.fasterxml.jackson.annotation.*;

/**
 * V1MeetingRoomsGet200Response
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingRoomsGet200Response {
    @JsonProperty(value = "current_page")
    private Long currentPage;

    @JsonProperty(value = "current_size")
    private Long currentSize;

    @JsonProperty(value = "meeting_room_list")
    private List<V1MeetingRoomsGet200ResponseMeetingRoomListInner> meetingRoomList;

    @JsonProperty(value = "total_count")
    private Long totalCount;

    @JsonProperty(value = "total_page")
    private Long totalPage;

    /**
     */
    public V1MeetingRoomsGet200Response() {
    }

    /**
     * @param currentPage 当前页
     */
    public V1MeetingRoomsGet200Response currentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    /**
     * @return currentPage 当前页
     **/
    public Long getCurrentPage() {
        return currentPage;
    }

    /**
     * @param currentPage 当前页
     */
    public void setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
    }
    /**
     * @param currentSize 单页条数
     */
    public V1MeetingRoomsGet200Response currentSize(Long currentSize) {
        this.currentSize = currentSize;
        return this;
    }
    /**
     * @return currentSize 单页条数
     **/
    public Long getCurrentSize() {
        return currentSize;
    }

    /**
     * @param currentSize 单页条数
     */
    public void setCurrentSize(Long currentSize) {
        this.currentSize = currentSize;
    }
    /**
     * @param meetingRoomList 会议室对象列表
     */
    public V1MeetingRoomsGet200Response meetingRoomList(List<V1MeetingRoomsGet200ResponseMeetingRoomListInner> meetingRoomList) {
        this.meetingRoomList = meetingRoomList;
        return this;
    }
    /**
     * @return meetingRoomList 会议室对象列表
     **/
    public List<V1MeetingRoomsGet200ResponseMeetingRoomListInner> getMeetingRoomList() {
        return meetingRoomList;
    }

    /**
     * @param meetingRoomList 会议室对象列表
     */
    public void setMeetingRoomList(List<V1MeetingRoomsGet200ResponseMeetingRoomListInner> meetingRoomList) {
        this.meetingRoomList = meetingRoomList;
    }
    /**
     * @param totalCount 数据总条数
     */
    public V1MeetingRoomsGet200Response totalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    /**
     * @return totalCount 数据总条数
     **/
    public Long getTotalCount() {
        return totalCount;
    }

    /**
     * @param totalCount 数据总条数
     */
    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }
    /**
     * @param totalPage 数据总页数
     */
    public V1MeetingRoomsGet200Response totalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    /**
     * @return totalPage 数据总页数
     **/
    public Long getTotalPage() {
        return totalPage;
    }

    /**
     * @param totalPage 数据总页数
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
        V1MeetingRoomsGet200Response v1MeetingRoomsGet200Response = (V1MeetingRoomsGet200Response) o;
        return Objects.equals(this.currentPage, v1MeetingRoomsGet200Response.currentPage) &&
            Objects.equals(this.currentSize, v1MeetingRoomsGet200Response.currentSize) &&
            Objects.equals(this.meetingRoomList, v1MeetingRoomsGet200Response.meetingRoomList) &&
            Objects.equals(this.totalCount, v1MeetingRoomsGet200Response.totalCount) &&
            Objects.equals(this.totalPage, v1MeetingRoomsGet200Response.totalPage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentPage, currentSize, meetingRoomList, totalCount, totalPage);
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
        sb.append("class V1MeetingRoomsGet200Response {\n");
        sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
        sb.append("    currentSize: ").append(toIndentedString(currentSize)).append("\n");
        sb.append("    meetingRoomList: ").append(toIndentedString(meetingRoomList)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    totalPage: ").append(toIndentedString(totalPage)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

