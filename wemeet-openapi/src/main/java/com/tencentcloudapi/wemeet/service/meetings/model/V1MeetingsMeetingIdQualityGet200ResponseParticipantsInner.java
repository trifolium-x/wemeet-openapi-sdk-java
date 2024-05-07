/*
 * 腾讯会议OpenAPI
 * SAAS版RESTFUL风格API
 *
 * The version of the OpenAPI document: v1.0.1
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
 * V1MeetingsMeetingIdQualityGet200ResponseParticipantsInner
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingsMeetingIdQualityGet200ResponseParticipantsInner {
    @JsonProperty(value = "audio_quality")
    private Long audioQuality;

    @JsonProperty(value = "instanceid")
    private String instanceid;

    @JsonProperty(value = "ms_open_id")
    private String msOpenId;

    @JsonProperty(value = "network_quality")
    private Long networkQuality;

    @JsonProperty(value = "open_id")
    private String openId;

    @JsonProperty(value = "problems")
    private List<String> problems;

    @JsonProperty(value = "quality")
    private Long quality;

    @JsonProperty(value = "screen_share_quality")
    private Long screenShareQuality;

    @JsonProperty(value = "userid")
    private String userid;

    @JsonProperty(value = "video_quality")
    private Long videoQuality;

    /**
     */
    public V1MeetingsMeetingIdQualityGet200ResponseParticipantsInner() {
    }

    /**
     * @param audioQuality 音频质量：0-无数据，1-好、2-较好、3-中、4-差
     */
    public V1MeetingsMeetingIdQualityGet200ResponseParticipantsInner audioQuality(Long audioQuality) {
        this.audioQuality = audioQuality;
        return this;
    }
    /**
     * @return audioQuality 音频质量：0-无数据，1-好、2-较好、3-中、4-差
     **/
    public Long getAudioQuality() {
        return audioQuality;
    }

    /**
     * @param audioQuality 音频质量：0-无数据，1-好、2-较好、3-中、4-差
     */
    public void setAudioQuality(Long audioQuality) {
        this.audioQuality = audioQuality;
    }
    /**
     * @param instanceid 用户的终端设备类型： 0：PSTN 1：PC 2：Mac 3：Android 4：iOS 5：Web 6：iPad 7：Android Pad 8：小程序 9：voip、sip 设备 10：linux 20：Rooms for Touch Windows 21：Rooms for Touch MacOS 22：Rooms for Touch Android 30：Controller for Touch Windows 32：Controller for Touch Android 33：Controller for Touch iOS
     */
    public V1MeetingsMeetingIdQualityGet200ResponseParticipantsInner instanceid(String instanceid) {
        this.instanceid = instanceid;
        return this;
    }
    /**
     * @return instanceid 用户的终端设备类型： 0：PSTN 1：PC 2：Mac 3：Android 4：iOS 5：Web 6：iPad 7：Android Pad 8：小程序 9：voip、sip 设备 10：linux 20：Rooms for Touch Windows 21：Rooms for Touch MacOS 22：Rooms for Touch Android 30：Controller for Touch Windows 32：Controller for Touch Android 33：Controller for Touch iOS
     **/
    public String getInstanceid() {
        return instanceid;
    }

    /**
     * @param instanceid 用户的终端设备类型： 0：PSTN 1：PC 2：Mac 3：Android 4：iOS 5：Web 6：iPad 7：Android Pad 8：小程序 9：voip、sip 设备 10：linux 20：Rooms for Touch Windows 21：Rooms for Touch MacOS 22：Rooms for Touch Android 30：Controller for Touch Windows 32：Controller for Touch Android 33：Controller for Touch iOS
     */
    public void setInstanceid(String instanceid) {
        this.instanceid = instanceid;
    }
    /**
     * @param msOpenId 当场会议的用户临时 ID，可用于会控操作，适用于所有用户。 
     */
    public V1MeetingsMeetingIdQualityGet200ResponseParticipantsInner msOpenId(String msOpenId) {
        this.msOpenId = msOpenId;
        return this;
    }
    /**
     * @return msOpenId 当场会议的用户临时 ID，可用于会控操作，适用于所有用户。 
     **/
    public String getMsOpenId() {
        return msOpenId;
    }

    /**
     * @param msOpenId 当场会议的用户临时 ID，可用于会控操作，适用于所有用户。 
     */
    public void setMsOpenId(String msOpenId) {
        this.msOpenId = msOpenId;
    }
    /**
     * @param networkQuality 网络质量：0-无数据，1-好、2-较好、3-中、4-差
     */
    public V1MeetingsMeetingIdQualityGet200ResponseParticipantsInner networkQuality(Long networkQuality) {
        this.networkQuality = networkQuality;
        return this;
    }
    /**
     * @return networkQuality 网络质量：0-无数据，1-好、2-较好、3-中、4-差
     **/
    public Long getNetworkQuality() {
        return networkQuality;
    }

    /**
     * @param networkQuality 网络质量：0-无数据，1-好、2-较好、3-中、4-差
     */
    public void setNetworkQuality(Long networkQuality) {
        this.networkQuality = networkQuality;
    }
    /**
     * @param openId OAuth2.0 鉴权用户请使用 open_id。
     */
    public V1MeetingsMeetingIdQualityGet200ResponseParticipantsInner openId(String openId) {
        this.openId = openId;
        return this;
    }
    /**
     * @return openId OAuth2.0 鉴权用户请使用 open_id。
     **/
    public String getOpenId() {
        return openId;
    }

    /**
     * @param openId OAuth2.0 鉴权用户请使用 open_id。
     */
    public void setOpenId(String openId) {
        this.openId = openId;
    }
    /**
     * @param problems 告警的具体问题
     */
    public V1MeetingsMeetingIdQualityGet200ResponseParticipantsInner problems(List<String> problems) {
        this.problems = problems;
        return this;
    }
    /**
     * @return problems 告警的具体问题
     **/
    public List<String> getProblems() {
        return problems;
    }

    /**
     * @param problems 告警的具体问题
     */
    public void setProblems(List<String> problems) {
        this.problems = problems;
    }
    /**
     * @param quality 用户健康度：0-无数据，1-健康、2-告警
     */
    public V1MeetingsMeetingIdQualityGet200ResponseParticipantsInner quality(Long quality) {
        this.quality = quality;
        return this;
    }
    /**
     * @return quality 用户健康度：0-无数据，1-健康、2-告警
     **/
    public Long getQuality() {
        return quality;
    }

    /**
     * @param quality 用户健康度：0-无数据，1-健康、2-告警
     */
    public void setQuality(Long quality) {
        this.quality = quality;
    }
    /**
     * @param screenShareQuality 共享屏幕质量：0-无数据，1-好、2-较好、3-中、4-差
     */
    public V1MeetingsMeetingIdQualityGet200ResponseParticipantsInner screenShareQuality(Long screenShareQuality) {
        this.screenShareQuality = screenShareQuality;
        return this;
    }
    /**
     * @return screenShareQuality 共享屏幕质量：0-无数据，1-好、2-较好、3-中、4-差
     **/
    public Long getScreenShareQuality() {
        return screenShareQuality;
    }

    /**
     * @param screenShareQuality 共享屏幕质量：0-无数据，1-好、2-较好、3-中、4-差
     */
    public void setScreenShareQuality(Long screenShareQuality) {
        this.screenShareQuality = screenShareQuality;
    }
    /**
     * @param userid 同企业内部请使用企业唯一用户标识； 其他企业，个人，小程序没有 。
     */
    public V1MeetingsMeetingIdQualityGet200ResponseParticipantsInner userid(String userid) {
        this.userid = userid;
        return this;
    }
    /**
     * @return userid 同企业内部请使用企业唯一用户标识； 其他企业，个人，小程序没有 。
     **/
    public String getUserid() {
        return userid;
    }

    /**
     * @param userid 同企业内部请使用企业唯一用户标识； 其他企业，个人，小程序没有 。
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }
    /**
     * @param videoQuality 视频质量：0-无数据，1-好、2-较好、3-中、4-差
     */
    public V1MeetingsMeetingIdQualityGet200ResponseParticipantsInner videoQuality(Long videoQuality) {
        this.videoQuality = videoQuality;
        return this;
    }
    /**
     * @return videoQuality 视频质量：0-无数据，1-好、2-较好、3-中、4-差
     **/
    public Long getVideoQuality() {
        return videoQuality;
    }

    /**
     * @param videoQuality 视频质量：0-无数据，1-好、2-较好、3-中、4-差
     */
    public void setVideoQuality(Long videoQuality) {
        this.videoQuality = videoQuality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingsMeetingIdQualityGet200ResponseParticipantsInner v1MeetingsMeetingIdQualityGet200ResponseParticipantsInner = (V1MeetingsMeetingIdQualityGet200ResponseParticipantsInner) o;
        return Objects.equals(this.audioQuality, v1MeetingsMeetingIdQualityGet200ResponseParticipantsInner.audioQuality) &&
            Objects.equals(this.instanceid, v1MeetingsMeetingIdQualityGet200ResponseParticipantsInner.instanceid) &&
            Objects.equals(this.msOpenId, v1MeetingsMeetingIdQualityGet200ResponseParticipantsInner.msOpenId) &&
            Objects.equals(this.networkQuality, v1MeetingsMeetingIdQualityGet200ResponseParticipantsInner.networkQuality) &&
            Objects.equals(this.openId, v1MeetingsMeetingIdQualityGet200ResponseParticipantsInner.openId) &&
            Objects.equals(this.problems, v1MeetingsMeetingIdQualityGet200ResponseParticipantsInner.problems) &&
            Objects.equals(this.quality, v1MeetingsMeetingIdQualityGet200ResponseParticipantsInner.quality) &&
            Objects.equals(this.screenShareQuality, v1MeetingsMeetingIdQualityGet200ResponseParticipantsInner.screenShareQuality) &&
            Objects.equals(this.userid, v1MeetingsMeetingIdQualityGet200ResponseParticipantsInner.userid) &&
            Objects.equals(this.videoQuality, v1MeetingsMeetingIdQualityGet200ResponseParticipantsInner.videoQuality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(audioQuality, instanceid, msOpenId, networkQuality, openId, problems, quality, screenShareQuality, userid, videoQuality);
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
        sb.append("class V1MeetingsMeetingIdQualityGet200ResponseParticipantsInner {\n");
        sb.append("    audioQuality: ").append(toIndentedString(audioQuality)).append("\n");
        sb.append("    instanceid: ").append(toIndentedString(instanceid)).append("\n");
        sb.append("    msOpenId: ").append(toIndentedString(msOpenId)).append("\n");
        sb.append("    networkQuality: ").append(toIndentedString(networkQuality)).append("\n");
        sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
        sb.append("    problems: ").append(toIndentedString(problems)).append("\n");
        sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
        sb.append("    screenShareQuality: ").append(toIndentedString(screenShareQuality)).append("\n");
        sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
        sb.append("    videoQuality: ").append(toIndentedString(videoQuality)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
