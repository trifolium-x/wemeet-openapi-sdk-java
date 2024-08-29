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
 * V1MeetingsMeetingIdGet200ResponseMeetingInfoListInnerLiveConfig
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingsMeetingIdGet200ResponseMeetingInfoListInnerLiveConfig {
    @JsonProperty(value = "enable_live_im")
    private Boolean enableLiveIm;

    @JsonProperty(value = "enable_live_replay")
    private Boolean enableLiveReplay;

    @JsonProperty(value = "live_addr")
    private String liveAddr;

    @JsonProperty(value = "live_password")
    private String livePassword;

    @JsonProperty(value = "live_subject")
    private String liveSubject;

    @JsonProperty(value = "live_summary")
    private String liveSummary;

    @JsonProperty(value = "live_watermark")
    private V1MeetingsGet200ResponseMeetingInfoListInnerLiveConfigLiveWatermark liveWatermark;

    /**
     */
    public V1MeetingsMeetingIdGet200ResponseMeetingInfoListInnerLiveConfig() {
    }

    /**
     * @param enableLiveIm 
     */
    public V1MeetingsMeetingIdGet200ResponseMeetingInfoListInnerLiveConfig enableLiveIm(Boolean enableLiveIm) {
        this.enableLiveIm = enableLiveIm;
        return this;
    }
    /**
     * @return enableLiveIm 
     **/
    public Boolean getEnableLiveIm() {
        return enableLiveIm;
    }

    /**
     * @param enableLiveIm 
     */
    public void setEnableLiveIm(Boolean enableLiveIm) {
        this.enableLiveIm = enableLiveIm;
    }
    /**
     * @param enableLiveReplay 
     */
    public V1MeetingsMeetingIdGet200ResponseMeetingInfoListInnerLiveConfig enableLiveReplay(Boolean enableLiveReplay) {
        this.enableLiveReplay = enableLiveReplay;
        return this;
    }
    /**
     * @return enableLiveReplay 
     **/
    public Boolean getEnableLiveReplay() {
        return enableLiveReplay;
    }

    /**
     * @param enableLiveReplay 
     */
    public void setEnableLiveReplay(Boolean enableLiveReplay) {
        this.enableLiveReplay = enableLiveReplay;
    }
    /**
     * @param liveAddr 
     */
    public V1MeetingsMeetingIdGet200ResponseMeetingInfoListInnerLiveConfig liveAddr(String liveAddr) {
        this.liveAddr = liveAddr;
        return this;
    }
    /**
     * @return liveAddr 
     **/
    public String getLiveAddr() {
        return liveAddr;
    }

    /**
     * @param liveAddr 
     */
    public void setLiveAddr(String liveAddr) {
        this.liveAddr = liveAddr;
    }
    /**
     * @param livePassword 
     */
    public V1MeetingsMeetingIdGet200ResponseMeetingInfoListInnerLiveConfig livePassword(String livePassword) {
        this.livePassword = livePassword;
        return this;
    }
    /**
     * @return livePassword 
     **/
    public String getLivePassword() {
        return livePassword;
    }

    /**
     * @param livePassword 
     */
    public void setLivePassword(String livePassword) {
        this.livePassword = livePassword;
    }
    /**
     * @param liveSubject 
     */
    public V1MeetingsMeetingIdGet200ResponseMeetingInfoListInnerLiveConfig liveSubject(String liveSubject) {
        this.liveSubject = liveSubject;
        return this;
    }
    /**
     * @return liveSubject 
     **/
    public String getLiveSubject() {
        return liveSubject;
    }

    /**
     * @param liveSubject 
     */
    public void setLiveSubject(String liveSubject) {
        this.liveSubject = liveSubject;
    }
    /**
     * @param liveSummary 
     */
    public V1MeetingsMeetingIdGet200ResponseMeetingInfoListInnerLiveConfig liveSummary(String liveSummary) {
        this.liveSummary = liveSummary;
        return this;
    }
    /**
     * @return liveSummary 
     **/
    public String getLiveSummary() {
        return liveSummary;
    }

    /**
     * @param liveSummary 
     */
    public void setLiveSummary(String liveSummary) {
        this.liveSummary = liveSummary;
    }
    /**
     * @param liveWatermark 
     */
    public V1MeetingsMeetingIdGet200ResponseMeetingInfoListInnerLiveConfig liveWatermark(V1MeetingsGet200ResponseMeetingInfoListInnerLiveConfigLiveWatermark liveWatermark) {
        this.liveWatermark = liveWatermark;
        return this;
    }
    /**
     * @return liveWatermark 
     **/
    public V1MeetingsGet200ResponseMeetingInfoListInnerLiveConfigLiveWatermark getLiveWatermark() {
        return liveWatermark;
    }

    /**
     * @param liveWatermark 
     */
    public void setLiveWatermark(V1MeetingsGet200ResponseMeetingInfoListInnerLiveConfigLiveWatermark liveWatermark) {
        this.liveWatermark = liveWatermark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingsMeetingIdGet200ResponseMeetingInfoListInnerLiveConfig v1MeetingsMeetingIdGet200ResponseMeetingInfoListInnerLiveConfig = (V1MeetingsMeetingIdGet200ResponseMeetingInfoListInnerLiveConfig) o;
        return Objects.equals(this.enableLiveIm, v1MeetingsMeetingIdGet200ResponseMeetingInfoListInnerLiveConfig.enableLiveIm) &&
            Objects.equals(this.enableLiveReplay, v1MeetingsMeetingIdGet200ResponseMeetingInfoListInnerLiveConfig.enableLiveReplay) &&
            Objects.equals(this.liveAddr, v1MeetingsMeetingIdGet200ResponseMeetingInfoListInnerLiveConfig.liveAddr) &&
            Objects.equals(this.livePassword, v1MeetingsMeetingIdGet200ResponseMeetingInfoListInnerLiveConfig.livePassword) &&
            Objects.equals(this.liveSubject, v1MeetingsMeetingIdGet200ResponseMeetingInfoListInnerLiveConfig.liveSubject) &&
            Objects.equals(this.liveSummary, v1MeetingsMeetingIdGet200ResponseMeetingInfoListInnerLiveConfig.liveSummary) &&
            Objects.equals(this.liveWatermark, v1MeetingsMeetingIdGet200ResponseMeetingInfoListInnerLiveConfig.liveWatermark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enableLiveIm, enableLiveReplay, liveAddr, livePassword, liveSubject, liveSummary, liveWatermark);
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
        sb.append("class V1MeetingsMeetingIdGet200ResponseMeetingInfoListInnerLiveConfig {\n");
        sb.append("    enableLiveIm: ").append(toIndentedString(enableLiveIm)).append("\n");
        sb.append("    enableLiveReplay: ").append(toIndentedString(enableLiveReplay)).append("\n");
        sb.append("    liveAddr: ").append(toIndentedString(liveAddr)).append("\n");
        sb.append("    livePassword: ").append(toIndentedString(livePassword)).append("\n");
        sb.append("    liveSubject: ").append(toIndentedString(liveSubject)).append("\n");
        sb.append("    liveSummary: ").append(toIndentedString(liveSummary)).append("\n");
        sb.append("    liveWatermark: ").append(toIndentedString(liveWatermark)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

