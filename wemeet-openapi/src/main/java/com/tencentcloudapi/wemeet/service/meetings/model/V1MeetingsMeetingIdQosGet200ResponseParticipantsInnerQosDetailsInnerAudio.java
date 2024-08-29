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
 * 音频
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingsMeetingIdQosGet200ResponseParticipantsInnerQosDetailsInnerAudio {
    @JsonProperty(value = "downstream_bitrate")
    private String downstreamBitrate;

    @JsonProperty(value = "loudspeaker_volume")
    private String loudspeakerVolume;

    @JsonProperty(value = "mic_volume")
    private String micVolume;

    @JsonProperty(value = "upstream_bitrate")
    private String upstreamBitrate;

    /**
     */
    public V1MeetingsMeetingIdQosGet200ResponseParticipantsInnerQosDetailsInnerAudio() {
    }

    /**
     * @param downstreamBitrate 下行码率（kbps）
     */
    public V1MeetingsMeetingIdQosGet200ResponseParticipantsInnerQosDetailsInnerAudio downstreamBitrate(String downstreamBitrate) {
        this.downstreamBitrate = downstreamBitrate;
        return this;
    }
    /**
     * @return downstreamBitrate 下行码率（kbps）
     **/
    public String getDownstreamBitrate() {
        return downstreamBitrate;
    }

    /**
     * @param downstreamBitrate 下行码率（kbps）
     */
    public void setDownstreamBitrate(String downstreamBitrate) {
        this.downstreamBitrate = downstreamBitrate;
    }
    /**
     * @param loudspeakerVolume 扬声器播放音量（db）
     */
    public V1MeetingsMeetingIdQosGet200ResponseParticipantsInnerQosDetailsInnerAudio loudspeakerVolume(String loudspeakerVolume) {
        this.loudspeakerVolume = loudspeakerVolume;
        return this;
    }
    /**
     * @return loudspeakerVolume 扬声器播放音量（db）
     **/
    public String getLoudspeakerVolume() {
        return loudspeakerVolume;
    }

    /**
     * @param loudspeakerVolume 扬声器播放音量（db）
     */
    public void setLoudspeakerVolume(String loudspeakerVolume) {
        this.loudspeakerVolume = loudspeakerVolume;
    }
    /**
     * @param micVolume 麦克风采集音量（db）
     */
    public V1MeetingsMeetingIdQosGet200ResponseParticipantsInnerQosDetailsInnerAudio micVolume(String micVolume) {
        this.micVolume = micVolume;
        return this;
    }
    /**
     * @return micVolume 麦克风采集音量（db）
     **/
    public String getMicVolume() {
        return micVolume;
    }

    /**
     * @param micVolume 麦克风采集音量（db）
     */
    public void setMicVolume(String micVolume) {
        this.micVolume = micVolume;
    }
    /**
     * @param upstreamBitrate 上行码率（kbps）
     */
    public V1MeetingsMeetingIdQosGet200ResponseParticipantsInnerQosDetailsInnerAudio upstreamBitrate(String upstreamBitrate) {
        this.upstreamBitrate = upstreamBitrate;
        return this;
    }
    /**
     * @return upstreamBitrate 上行码率（kbps）
     **/
    public String getUpstreamBitrate() {
        return upstreamBitrate;
    }

    /**
     * @param upstreamBitrate 上行码率（kbps）
     */
    public void setUpstreamBitrate(String upstreamBitrate) {
        this.upstreamBitrate = upstreamBitrate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingsMeetingIdQosGet200ResponseParticipantsInnerQosDetailsInnerAudio v1MeetingsMeetingIdQosGet200ResponseParticipantsInnerQosDetailsInnerAudio = (V1MeetingsMeetingIdQosGet200ResponseParticipantsInnerQosDetailsInnerAudio) o;
        return Objects.equals(this.downstreamBitrate, v1MeetingsMeetingIdQosGet200ResponseParticipantsInnerQosDetailsInnerAudio.downstreamBitrate) &&
            Objects.equals(this.loudspeakerVolume, v1MeetingsMeetingIdQosGet200ResponseParticipantsInnerQosDetailsInnerAudio.loudspeakerVolume) &&
            Objects.equals(this.micVolume, v1MeetingsMeetingIdQosGet200ResponseParticipantsInnerQosDetailsInnerAudio.micVolume) &&
            Objects.equals(this.upstreamBitrate, v1MeetingsMeetingIdQosGet200ResponseParticipantsInnerQosDetailsInnerAudio.upstreamBitrate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(downstreamBitrate, loudspeakerVolume, micVolume, upstreamBitrate);
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
        sb.append("class V1MeetingsMeetingIdQosGet200ResponseParticipantsInnerQosDetailsInnerAudio {\n");
        sb.append("    downstreamBitrate: ").append(toIndentedString(downstreamBitrate)).append("\n");
        sb.append("    loudspeakerVolume: ").append(toIndentedString(loudspeakerVolume)).append("\n");
        sb.append("    micVolume: ").append(toIndentedString(micVolume)).append("\n");
        sb.append("    upstreamBitrate: ").append(toIndentedString(upstreamBitrate)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

