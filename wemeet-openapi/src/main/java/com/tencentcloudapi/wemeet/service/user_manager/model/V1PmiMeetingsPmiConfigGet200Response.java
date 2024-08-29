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

package com.tencentcloudapi.wemeet.service.user_manager.model;

import java.util.*;

import com.fasterxml.jackson.annotation.*;

/**
 * V1PmiMeetingsPmiConfigGet200Response
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1PmiMeetingsPmiConfigGet200Response {
    @JsonProperty(value = "allow_in_before_host")
    private Boolean allowInBeforeHost;

    @JsonProperty(value = "allow_in_waiting_room")
    private Boolean allowInWaitingRoom;

    @JsonProperty(value = "allow_multi_device")
    private Boolean allowMultiDevice;

    @JsonProperty(value = "disable_note_capture")
    private Boolean disableNoteCapture;

    @JsonProperty(value = "hosts")
    private List<V1PmiMeetingsPmiConfigGet200ResponseHostsInner> hosts;

    @JsonProperty(value = "mute_enable_type_join")
    private Long muteEnableTypeJoin;

    @JsonProperty(value = "only_enterprise_user_allowed")
    private Boolean onlyEnterpriseUserAllowed;

    @JsonProperty(value = "pmi_code")
    private String pmiCode;

    @JsonProperty(value = "pmi_name")
    private String pmiName;

    @JsonProperty(value = "pmi_password")
    private String pmiPassword;

    @JsonProperty(value = "water_mark_type")
    private Long waterMarkType;

    @JsonProperty(value = "watermark")
    private Boolean watermark;

    /**
     */
    public V1PmiMeetingsPmiConfigGet200Response() {
    }

    /**
     * @param allowInBeforeHost 是否允许成员在主持人前入会
     */
    public V1PmiMeetingsPmiConfigGet200Response allowInBeforeHost(Boolean allowInBeforeHost) {
        this.allowInBeforeHost = allowInBeforeHost;
        return this;
    }
    /**
     * @return allowInBeforeHost 是否允许成员在主持人前入会
     **/
    public Boolean getAllowInBeforeHost() {
        return allowInBeforeHost;
    }

    /**
     * @param allowInBeforeHost 是否允许成员在主持人前入会
     */
    public void setAllowInBeforeHost(Boolean allowInBeforeHost) {
        this.allowInBeforeHost = allowInBeforeHost;
    }
    /**
     * @param allowInWaitingRoom 是否开启等候室
     */
    public V1PmiMeetingsPmiConfigGet200Response allowInWaitingRoom(Boolean allowInWaitingRoom) {
        this.allowInWaitingRoom = allowInWaitingRoom;
        return this;
    }
    /**
     * @return allowInWaitingRoom 是否开启等候室
     **/
    public Boolean getAllowInWaitingRoom() {
        return allowInWaitingRoom;
    }

    /**
     * @param allowInWaitingRoom 是否开启等候室
     */
    public void setAllowInWaitingRoom(Boolean allowInWaitingRoom) {
        this.allowInWaitingRoom = allowInWaitingRoom;
    }
    /**
     * @param allowMultiDevice 是否允许多端入会
     */
    public V1PmiMeetingsPmiConfigGet200Response allowMultiDevice(Boolean allowMultiDevice) {
        this.allowMultiDevice = allowMultiDevice;
        return this;
    }
    /**
     * @return allowMultiDevice 是否允许多端入会
     **/
    public Boolean getAllowMultiDevice() {
        return allowMultiDevice;
    }

    /**
     * @param allowMultiDevice 是否允许多端入会
     */
    public void setAllowMultiDevice(Boolean allowMultiDevice) {
        this.allowMultiDevice = allowMultiDevice;
    }
    /**
     * @param disableNoteCapture 是否禁止笔记截屏
     */
    public V1PmiMeetingsPmiConfigGet200Response disableNoteCapture(Boolean disableNoteCapture) {
        this.disableNoteCapture = disableNoteCapture;
        return this;
    }
    /**
     * @return disableNoteCapture 是否禁止笔记截屏
     **/
    public Boolean getDisableNoteCapture() {
        return disableNoteCapture;
    }

    /**
     * @param disableNoteCapture 是否禁止笔记截屏
     */
    public void setDisableNoteCapture(Boolean disableNoteCapture) {
        this.disableNoteCapture = disableNoteCapture;
    }
    /**
     * @param hosts 指定主持人列表
     */
    public V1PmiMeetingsPmiConfigGet200Response hosts(List<V1PmiMeetingsPmiConfigGet200ResponseHostsInner> hosts) {
        this.hosts = hosts;
        return this;
    }
    /**
     * @return hosts 指定主持人列表
     **/
    public List<V1PmiMeetingsPmiConfigGet200ResponseHostsInner> getHosts() {
        return hosts;
    }

    /**
     * @param hosts 指定主持人列表
     */
    public void setHosts(List<V1PmiMeetingsPmiConfigGet200ResponseHostsInner> hosts) {
        this.hosts = hosts;
    }
    /**
     * @param muteEnableTypeJoin 成员入会静音设置，0-关闭，1-开启，2-超过6人后自动开启
     */
    public V1PmiMeetingsPmiConfigGet200Response muteEnableTypeJoin(Long muteEnableTypeJoin) {
        this.muteEnableTypeJoin = muteEnableTypeJoin;
        return this;
    }
    /**
     * @return muteEnableTypeJoin 成员入会静音设置，0-关闭，1-开启，2-超过6人后自动开启
     **/
    public Long getMuteEnableTypeJoin() {
        return muteEnableTypeJoin;
    }

    /**
     * @param muteEnableTypeJoin 成员入会静音设置，0-关闭，1-开启，2-超过6人后自动开启
     */
    public void setMuteEnableTypeJoin(Long muteEnableTypeJoin) {
        this.muteEnableTypeJoin = muteEnableTypeJoin;
    }
    /**
     * @param onlyEnterpriseUserAllowed 是否仅企业内部成员可入会
     */
    public V1PmiMeetingsPmiConfigGet200Response onlyEnterpriseUserAllowed(Boolean onlyEnterpriseUserAllowed) {
        this.onlyEnterpriseUserAllowed = onlyEnterpriseUserAllowed;
        return this;
    }
    /**
     * @return onlyEnterpriseUserAllowed 是否仅企业内部成员可入会
     **/
    public Boolean getOnlyEnterpriseUserAllowed() {
        return onlyEnterpriseUserAllowed;
    }

    /**
     * @param onlyEnterpriseUserAllowed 是否仅企业内部成员可入会
     */
    public void setOnlyEnterpriseUserAllowed(Boolean onlyEnterpriseUserAllowed) {
        this.onlyEnterpriseUserAllowed = onlyEnterpriseUserAllowed;
    }
    /**
     * @param pmiCode 个人会议号
     */
    public V1PmiMeetingsPmiConfigGet200Response pmiCode(String pmiCode) {
        this.pmiCode = pmiCode;
        return this;
    }
    /**
     * @return pmiCode 个人会议号
     **/
    public String getPmiCode() {
        return pmiCode;
    }

    /**
     * @param pmiCode 个人会议号
     */
    public void setPmiCode(String pmiCode) {
        this.pmiCode = pmiCode;
    }
    /**
     * @param pmiName 个人会议室名称
     */
    public V1PmiMeetingsPmiConfigGet200Response pmiName(String pmiName) {
        this.pmiName = pmiName;
        return this;
    }
    /**
     * @return pmiName 个人会议室名称
     **/
    public String getPmiName() {
        return pmiName;
    }

    /**
     * @param pmiName 个人会议室名称
     */
    public void setPmiName(String pmiName) {
        this.pmiName = pmiName;
    }
    /**
     * @param pmiPassword 个人会议号密码，经过base64处理
     */
    public V1PmiMeetingsPmiConfigGet200Response pmiPassword(String pmiPassword) {
        this.pmiPassword = pmiPassword;
        return this;
    }
    /**
     * @return pmiPassword 个人会议号密码，经过base64处理
     **/
    public String getPmiPassword() {
        return pmiPassword;
    }

    /**
     * @param pmiPassword 个人会议号密码，经过base64处理
     */
    public void setPmiPassword(String pmiPassword) {
        this.pmiPassword = pmiPassword;
    }
    /**
     * @param waterMarkType 水印样式，0-单排，1-多排
     */
    public V1PmiMeetingsPmiConfigGet200Response waterMarkType(Long waterMarkType) {
        this.waterMarkType = waterMarkType;
        return this;
    }
    /**
     * @return waterMarkType 水印样式，0-单排，1-多排
     **/
    public Long getWaterMarkType() {
        return waterMarkType;
    }

    /**
     * @param waterMarkType 水印样式，0-单排，1-多排
     */
    public void setWaterMarkType(Long waterMarkType) {
        this.waterMarkType = waterMarkType;
    }
    /**
     * @param watermark 是否开启会议水印
     */
    public V1PmiMeetingsPmiConfigGet200Response watermark(Boolean watermark) {
        this.watermark = watermark;
        return this;
    }
    /**
     * @return watermark 是否开启会议水印
     **/
    public Boolean getWatermark() {
        return watermark;
    }

    /**
     * @param watermark 是否开启会议水印
     */
    public void setWatermark(Boolean watermark) {
        this.watermark = watermark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1PmiMeetingsPmiConfigGet200Response v1PmiMeetingsPmiConfigGet200Response = (V1PmiMeetingsPmiConfigGet200Response) o;
        return Objects.equals(this.allowInBeforeHost, v1PmiMeetingsPmiConfigGet200Response.allowInBeforeHost) &&
            Objects.equals(this.allowInWaitingRoom, v1PmiMeetingsPmiConfigGet200Response.allowInWaitingRoom) &&
            Objects.equals(this.allowMultiDevice, v1PmiMeetingsPmiConfigGet200Response.allowMultiDevice) &&
            Objects.equals(this.disableNoteCapture, v1PmiMeetingsPmiConfigGet200Response.disableNoteCapture) &&
            Objects.equals(this.hosts, v1PmiMeetingsPmiConfigGet200Response.hosts) &&
            Objects.equals(this.muteEnableTypeJoin, v1PmiMeetingsPmiConfigGet200Response.muteEnableTypeJoin) &&
            Objects.equals(this.onlyEnterpriseUserAllowed, v1PmiMeetingsPmiConfigGet200Response.onlyEnterpriseUserAllowed) &&
            Objects.equals(this.pmiCode, v1PmiMeetingsPmiConfigGet200Response.pmiCode) &&
            Objects.equals(this.pmiName, v1PmiMeetingsPmiConfigGet200Response.pmiName) &&
            Objects.equals(this.pmiPassword, v1PmiMeetingsPmiConfigGet200Response.pmiPassword) &&
            Objects.equals(this.waterMarkType, v1PmiMeetingsPmiConfigGet200Response.waterMarkType) &&
            Objects.equals(this.watermark, v1PmiMeetingsPmiConfigGet200Response.watermark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allowInBeforeHost, allowInWaitingRoom, allowMultiDevice, disableNoteCapture, hosts, muteEnableTypeJoin, onlyEnterpriseUserAllowed, pmiCode, pmiName, pmiPassword, waterMarkType, watermark);
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
        sb.append("class V1PmiMeetingsPmiConfigGet200Response {\n");
        sb.append("    allowInBeforeHost: ").append(toIndentedString(allowInBeforeHost)).append("\n");
        sb.append("    allowInWaitingRoom: ").append(toIndentedString(allowInWaitingRoom)).append("\n");
        sb.append("    allowMultiDevice: ").append(toIndentedString(allowMultiDevice)).append("\n");
        sb.append("    disableNoteCapture: ").append(toIndentedString(disableNoteCapture)).append("\n");
        sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
        sb.append("    muteEnableTypeJoin: ").append(toIndentedString(muteEnableTypeJoin)).append("\n");
        sb.append("    onlyEnterpriseUserAllowed: ").append(toIndentedString(onlyEnterpriseUserAllowed)).append("\n");
        sb.append("    pmiCode: ").append(toIndentedString(pmiCode)).append("\n");
        sb.append("    pmiName: ").append(toIndentedString(pmiName)).append("\n");
        sb.append("    pmiPassword: ").append(toIndentedString(pmiPassword)).append("\n");
        sb.append("    waterMarkType: ").append(toIndentedString(waterMarkType)).append("\n");
        sb.append("    watermark: ").append(toIndentedString(watermark)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

