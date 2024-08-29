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
 * V1RecordsViewDetailsGet200ResponseViewDetailsInner
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1RecordsViewDetailsGet200ResponseViewDetailsInner {
    @JsonProperty(value = "record_file_name")
    private String recordFileName;

    @JsonProperty(value = "total_view_progress")
    private String totalViewProgress;

    @JsonProperty(value = "user_name")
    private String userName;

    @JsonProperty(value = "userid")
    private String userid;

    @JsonProperty(value = "view_end_time")
    private Long viewEndTime;

    @JsonProperty(value = "view_start_time")
    private Long viewStartTime;

    @JsonProperty(value = "view_time")
    private Long viewTime;

    /**
     */
    public V1RecordsViewDetailsGet200ResponseViewDetailsInner() {
    }

    /**
     * @param recordFileName 录制文件名称。
     */
    public V1RecordsViewDetailsGet200ResponseViewDetailsInner recordFileName(String recordFileName) {
        this.recordFileName = recordFileName;
        return this;
    }
    /**
     * @return recordFileName 录制文件名称。
     **/
    public String getRecordFileName() {
        return recordFileName;
    }

    /**
     * @param recordFileName 录制文件名称。
     */
    public void setRecordFileName(String recordFileName) {
        this.recordFileName = recordFileName;
    }
    /**
     * @param totalViewProgress 观看完成度（百分比），该用户累计观看该视频的完成度。
     */
    public V1RecordsViewDetailsGet200ResponseViewDetailsInner totalViewProgress(String totalViewProgress) {
        this.totalViewProgress = totalViewProgress;
        return this;
    }
    /**
     * @return totalViewProgress 观看完成度（百分比），该用户累计观看该视频的完成度。
     **/
    public String getTotalViewProgress() {
        return totalViewProgress;
    }

    /**
     * @param totalViewProgress 观看完成度（百分比），该用户累计观看该视频的完成度。
     */
    public void setTotalViewProgress(String totalViewProgress) {
        this.totalViewProgress = totalViewProgress;
    }
    /**
     * @param userName 用户名称。匿名用户给出匿名用户标识。
     */
    public V1RecordsViewDetailsGet200ResponseViewDetailsInner userName(String userName) {
        this.userName = userName;
        return this;
    }
    /**
     * @return userName 用户名称。匿名用户给出匿名用户标识。
     **/
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName 用户名称。匿名用户给出匿名用户标识。
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    /**
     * @param userid 所在同一企业下的用户 ID。
     */
    public V1RecordsViewDetailsGet200ResponseViewDetailsInner userid(String userid) {
        this.userid = userid;
        return this;
    }
    /**
     * @return userid 所在同一企业下的用户 ID。
     **/
    public String getUserid() {
        return userid;
    }

    /**
     * @param userid 所在同一企业下的用户 ID。
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }
    /**
     * @param viewEndTime 观看结束时间，UNIX时间戳（单位毫秒）。
     */
    public V1RecordsViewDetailsGet200ResponseViewDetailsInner viewEndTime(Long viewEndTime) {
        this.viewEndTime = viewEndTime;
        return this;
    }
    /**
     * @return viewEndTime 观看结束时间，UNIX时间戳（单位毫秒）。
     **/
    public Long getViewEndTime() {
        return viewEndTime;
    }

    /**
     * @param viewEndTime 观看结束时间，UNIX时间戳（单位毫秒）。
     */
    public void setViewEndTime(Long viewEndTime) {
        this.viewEndTime = viewEndTime;
    }
    /**
     * @param viewStartTime Integer 观看开始时间，UNIX 时间戳（单位毫秒）。
     */
    public V1RecordsViewDetailsGet200ResponseViewDetailsInner viewStartTime(Long viewStartTime) {
        this.viewStartTime = viewStartTime;
        return this;
    }
    /**
     * @return viewStartTime Integer 观看开始时间，UNIX 时间戳（单位毫秒）。
     **/
    public Long getViewStartTime() {
        return viewStartTime;
    }

    /**
     * @param viewStartTime Integer 观看开始时间，UNIX 时间戳（单位毫秒）。
     */
    public void setViewStartTime(Long viewStartTime) {
        this.viewStartTime = viewStartTime;
    }
    /**
     * @param viewTime 实际观看时长（单位毫秒）。
     */
    public V1RecordsViewDetailsGet200ResponseViewDetailsInner viewTime(Long viewTime) {
        this.viewTime = viewTime;
        return this;
    }
    /**
     * @return viewTime 实际观看时长（单位毫秒）。
     **/
    public Long getViewTime() {
        return viewTime;
    }

    /**
     * @param viewTime 实际观看时长（单位毫秒）。
     */
    public void setViewTime(Long viewTime) {
        this.viewTime = viewTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1RecordsViewDetailsGet200ResponseViewDetailsInner v1RecordsViewDetailsGet200ResponseViewDetailsInner = (V1RecordsViewDetailsGet200ResponseViewDetailsInner) o;
        return Objects.equals(this.recordFileName, v1RecordsViewDetailsGet200ResponseViewDetailsInner.recordFileName) &&
            Objects.equals(this.totalViewProgress, v1RecordsViewDetailsGet200ResponseViewDetailsInner.totalViewProgress) &&
            Objects.equals(this.userName, v1RecordsViewDetailsGet200ResponseViewDetailsInner.userName) &&
            Objects.equals(this.userid, v1RecordsViewDetailsGet200ResponseViewDetailsInner.userid) &&
            Objects.equals(this.viewEndTime, v1RecordsViewDetailsGet200ResponseViewDetailsInner.viewEndTime) &&
            Objects.equals(this.viewStartTime, v1RecordsViewDetailsGet200ResponseViewDetailsInner.viewStartTime) &&
            Objects.equals(this.viewTime, v1RecordsViewDetailsGet200ResponseViewDetailsInner.viewTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordFileName, totalViewProgress, userName, userid, viewEndTime, viewStartTime, viewTime);
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
        sb.append("class V1RecordsViewDetailsGet200ResponseViewDetailsInner {\n");
        sb.append("    recordFileName: ").append(toIndentedString(recordFileName)).append("\n");
        sb.append("    totalViewProgress: ").append(toIndentedString(totalViewProgress)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
        sb.append("    viewEndTime: ").append(toIndentedString(viewEndTime)).append("\n");
        sb.append("    viewStartTime: ").append(toIndentedString(viewStartTime)).append("\n");
        sb.append("    viewTime: ").append(toIndentedString(viewTime)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

