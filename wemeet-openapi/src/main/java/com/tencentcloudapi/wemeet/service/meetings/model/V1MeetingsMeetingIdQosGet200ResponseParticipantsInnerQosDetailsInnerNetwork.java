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
 * 网络
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingsMeetingIdQosGet200ResponseParticipantsInnerQosDetailsInnerNetwork {
    @JsonProperty(value = "downstream_bindwidth")
    private String downstreamBindwidth;

    @JsonProperty(value = "downstream_packet_loss")
    private String downstreamPacketLoss;

    @JsonProperty(value = "network_delay")
    private String networkDelay;

    @JsonProperty(value = "upstream_bindwidth")
    private String upstreamBindwidth;

    @JsonProperty(value = "upstream_packet_loss")
    private String upstreamPacketLoss;

    /**
     */
    public V1MeetingsMeetingIdQosGet200ResponseParticipantsInnerQosDetailsInnerNetwork() {
    }

    /**
     * @param downstreamBindwidth 下行带宽（kbps）
     */
    public V1MeetingsMeetingIdQosGet200ResponseParticipantsInnerQosDetailsInnerNetwork downstreamBindwidth(String downstreamBindwidth) {
        this.downstreamBindwidth = downstreamBindwidth;
        return this;
    }
    /**
     * @return downstreamBindwidth 下行带宽（kbps）
     **/
    public String getDownstreamBindwidth() {
        return downstreamBindwidth;
    }

    /**
     * @param downstreamBindwidth 下行带宽（kbps）
     */
    public void setDownstreamBindwidth(String downstreamBindwidth) {
        this.downstreamBindwidth = downstreamBindwidth;
    }
    /**
     * @param downstreamPacketLoss 下行丢包（%）
     */
    public V1MeetingsMeetingIdQosGet200ResponseParticipantsInnerQosDetailsInnerNetwork downstreamPacketLoss(String downstreamPacketLoss) {
        this.downstreamPacketLoss = downstreamPacketLoss;
        return this;
    }
    /**
     * @return downstreamPacketLoss 下行丢包（%）
     **/
    public String getDownstreamPacketLoss() {
        return downstreamPacketLoss;
    }

    /**
     * @param downstreamPacketLoss 下行丢包（%）
     */
    public void setDownstreamPacketLoss(String downstreamPacketLoss) {
        this.downstreamPacketLoss = downstreamPacketLoss;
    }
    /**
     * @param networkDelay 网络延迟 (ms)
     */
    public V1MeetingsMeetingIdQosGet200ResponseParticipantsInnerQosDetailsInnerNetwork networkDelay(String networkDelay) {
        this.networkDelay = networkDelay;
        return this;
    }
    /**
     * @return networkDelay 网络延迟 (ms)
     **/
    public String getNetworkDelay() {
        return networkDelay;
    }

    /**
     * @param networkDelay 网络延迟 (ms)
     */
    public void setNetworkDelay(String networkDelay) {
        this.networkDelay = networkDelay;
    }
    /**
     * @param upstreamBindwidth 上行带宽（kbps）
     */
    public V1MeetingsMeetingIdQosGet200ResponseParticipantsInnerQosDetailsInnerNetwork upstreamBindwidth(String upstreamBindwidth) {
        this.upstreamBindwidth = upstreamBindwidth;
        return this;
    }
    /**
     * @return upstreamBindwidth 上行带宽（kbps）
     **/
    public String getUpstreamBindwidth() {
        return upstreamBindwidth;
    }

    /**
     * @param upstreamBindwidth 上行带宽（kbps）
     */
    public void setUpstreamBindwidth(String upstreamBindwidth) {
        this.upstreamBindwidth = upstreamBindwidth;
    }
    /**
     * @param upstreamPacketLoss 上行丢包（%）
     */
    public V1MeetingsMeetingIdQosGet200ResponseParticipantsInnerQosDetailsInnerNetwork upstreamPacketLoss(String upstreamPacketLoss) {
        this.upstreamPacketLoss = upstreamPacketLoss;
        return this;
    }
    /**
     * @return upstreamPacketLoss 上行丢包（%）
     **/
    public String getUpstreamPacketLoss() {
        return upstreamPacketLoss;
    }

    /**
     * @param upstreamPacketLoss 上行丢包（%）
     */
    public void setUpstreamPacketLoss(String upstreamPacketLoss) {
        this.upstreamPacketLoss = upstreamPacketLoss;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingsMeetingIdQosGet200ResponseParticipantsInnerQosDetailsInnerNetwork v1MeetingsMeetingIdQosGet200ResponseParticipantsInnerQosDetailsInnerNetwork = (V1MeetingsMeetingIdQosGet200ResponseParticipantsInnerQosDetailsInnerNetwork) o;
        return Objects.equals(this.downstreamBindwidth, v1MeetingsMeetingIdQosGet200ResponseParticipantsInnerQosDetailsInnerNetwork.downstreamBindwidth) &&
            Objects.equals(this.downstreamPacketLoss, v1MeetingsMeetingIdQosGet200ResponseParticipantsInnerQosDetailsInnerNetwork.downstreamPacketLoss) &&
            Objects.equals(this.networkDelay, v1MeetingsMeetingIdQosGet200ResponseParticipantsInnerQosDetailsInnerNetwork.networkDelay) &&
            Objects.equals(this.upstreamBindwidth, v1MeetingsMeetingIdQosGet200ResponseParticipantsInnerQosDetailsInnerNetwork.upstreamBindwidth) &&
            Objects.equals(this.upstreamPacketLoss, v1MeetingsMeetingIdQosGet200ResponseParticipantsInnerQosDetailsInnerNetwork.upstreamPacketLoss);
    }

    @Override
    public int hashCode() {
        return Objects.hash(downstreamBindwidth, downstreamPacketLoss, networkDelay, upstreamBindwidth, upstreamPacketLoss);
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
        sb.append("class V1MeetingsMeetingIdQosGet200ResponseParticipantsInnerQosDetailsInnerNetwork {\n");
        sb.append("    downstreamBindwidth: ").append(toIndentedString(downstreamBindwidth)).append("\n");
        sb.append("    downstreamPacketLoss: ").append(toIndentedString(downstreamPacketLoss)).append("\n");
        sb.append("    networkDelay: ").append(toIndentedString(networkDelay)).append("\n");
        sb.append("    upstreamBindwidth: ").append(toIndentedString(upstreamBindwidth)).append("\n");
        sb.append("    upstreamPacketLoss: ").append(toIndentedString(upstreamPacketLoss)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

