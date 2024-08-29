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

package com.tencentcloudapi.wemeet.service.records.model;

import java.util.*;

import com.fasterxml.jackson.annotation.*;

/**
 * V1AddressesGet200Response
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1AddressesGet200Response {
    @JsonProperty(value = "current_page")
    private Long currentPage;

    @JsonProperty(value = "current_size")
    private Long currentSize;

    @JsonProperty(value = "meeting_code")
    private String meetingCode;

    @JsonProperty(value = "meeting_id")
    private String meetingId;

    @JsonProperty(value = "meeting_record_id")
    private String meetingRecordId;

    @JsonProperty(value = "record_files")
    private List<V1AddressesGet200ResponseRecordFilesInner> recordFiles;

    @JsonProperty(value = "subject")
    private String subject;

    @JsonProperty(value = "total_count")
    private Long totalCount;

    @JsonProperty(value = "total_page")
    private Long totalPage;

    /**
     */
    public V1AddressesGet200Response() {
    }

    /**
     * @param currentPage 当前页
     */
    public V1AddressesGet200Response currentPage(Long currentPage) {
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
     * @param currentSize 当前size
     */
    public V1AddressesGet200Response currentSize(Long currentSize) {
        this.currentSize = currentSize;
        return this;
    }
    /**
     * @return currentSize 当前size
     **/
    public Long getCurrentSize() {
        return currentSize;
    }

    /**
     * @param currentSize 当前size
     */
    public void setCurrentSize(Long currentSize) {
        this.currentSize = currentSize;
    }
    /**
     * @param meetingCode 会议 code。
     */
    public V1AddressesGet200Response meetingCode(String meetingCode) {
        this.meetingCode = meetingCode;
        return this;
    }
    /**
     * @return meetingCode 会议 code。
     **/
    public String getMeetingCode() {
        return meetingCode;
    }

    /**
     * @param meetingCode 会议 code。
     */
    public void setMeetingCode(String meetingCode) {
        this.meetingCode = meetingCode;
    }
    /**
     * @param meetingId 会议唯一 ID。
     */
    public V1AddressesGet200Response meetingId(String meetingId) {
        this.meetingId = meetingId;
        return this;
    }
    /**
     * @return meetingId 会议唯一 ID。
     **/
    public String getMeetingId() {
        return meetingId;
    }

    /**
     * @param meetingId 会议唯一 ID。
     */
    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }
    /**
     * @param meetingRecordId 会议录制 ID。
     */
    public V1AddressesGet200Response meetingRecordId(String meetingRecordId) {
        this.meetingRecordId = meetingRecordId;
        return this;
    }
    /**
     * @return meetingRecordId 会议录制 ID。
     **/
    public String getMeetingRecordId() {
        return meetingRecordId;
    }

    /**
     * @param meetingRecordId 会议录制 ID。
     */
    public void setMeetingRecordId(String meetingRecordId) {
        this.meetingRecordId = meetingRecordId;
    }
    /**
     * @param recordFiles 录制文件列表。
     */
    public V1AddressesGet200Response recordFiles(List<V1AddressesGet200ResponseRecordFilesInner> recordFiles) {
        this.recordFiles = recordFiles;
        return this;
    }
    /**
     * @return recordFiles 录制文件列表。
     **/
    public List<V1AddressesGet200ResponseRecordFilesInner> getRecordFiles() {
        return recordFiles;
    }

    /**
     * @param recordFiles 录制文件列表。
     */
    public void setRecordFiles(List<V1AddressesGet200ResponseRecordFilesInner> recordFiles) {
        this.recordFiles = recordFiles;
    }
    /**
     * @param subject 会议主题。
     */
    public V1AddressesGet200Response subject(String subject) {
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
     * @param totalCount 录制总数
     */
    public V1AddressesGet200Response totalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    /**
     * @return totalCount 录制总数
     **/
    public Long getTotalCount() {
        return totalCount;
    }

    /**
     * @param totalCount 录制总数
     */
    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }
    /**
     * @param totalPage 总页数
     */
    public V1AddressesGet200Response totalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    /**
     * @return totalPage 总页数
     **/
    public Long getTotalPage() {
        return totalPage;
    }

    /**
     * @param totalPage 总页数
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
        V1AddressesGet200Response v1AddressesGet200Response = (V1AddressesGet200Response) o;
        return Objects.equals(this.currentPage, v1AddressesGet200Response.currentPage) &&
            Objects.equals(this.currentSize, v1AddressesGet200Response.currentSize) &&
            Objects.equals(this.meetingCode, v1AddressesGet200Response.meetingCode) &&
            Objects.equals(this.meetingId, v1AddressesGet200Response.meetingId) &&
            Objects.equals(this.meetingRecordId, v1AddressesGet200Response.meetingRecordId) &&
            Objects.equals(this.recordFiles, v1AddressesGet200Response.recordFiles) &&
            Objects.equals(this.subject, v1AddressesGet200Response.subject) &&
            Objects.equals(this.totalCount, v1AddressesGet200Response.totalCount) &&
            Objects.equals(this.totalPage, v1AddressesGet200Response.totalPage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentPage, currentSize, meetingCode, meetingId, meetingRecordId, recordFiles, subject, totalCount, totalPage);
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
        sb.append("class V1AddressesGet200Response {\n");
        sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
        sb.append("    currentSize: ").append(toIndentedString(currentSize)).append("\n");
        sb.append("    meetingCode: ").append(toIndentedString(meetingCode)).append("\n");
        sb.append("    meetingId: ").append(toIndentedString(meetingId)).append("\n");
        sb.append("    meetingRecordId: ").append(toIndentedString(meetingRecordId)).append("\n");
        sb.append("    recordFiles: ").append(toIndentedString(recordFiles)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    totalPage: ").append(toIndentedString(totalPage)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

