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

package com.tencentcloudapi.wemeet.service.meeting_room.model;

import java.util.*;

import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;

/**
 * V1MeetingRoomsModifyRoomConfigInfoPostRequest
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingRoomsModifyRoomConfigInfoPostRequest {
    @JsonProperty(value = "instance_id", required = true)
    private Long instanceId;

    @JsonProperty(value = "meeting_room_id", required = true)
    private String meetingRoomId;

    @JsonProperty(value = "meeting_settings")
    private V1MeetingRoomsModifyRoomConfigInfoPostRequestMeetingSettings meetingSettings;

    @JsonProperty(value = "operator_id", required = true)
    private String operatorId;

    @JsonProperty(value = "operator_id_type", required = true)
    private Long operatorIdType;

    @JsonProperty(value = "record_settings")
    private V1MeetingRoomsModifyRoomConfigInfoPostRequestRecordSettings recordSettings;

    /**
     * @param instanceId  (required)
     * @param meetingRoomId 要配置的会议室 ID。 (required)
     * @param operatorId  (required)
     * @param operatorIdType  (required)
     */
    public V1MeetingRoomsModifyRoomConfigInfoPostRequest(@NotNull Long instanceId, @NotNull String meetingRoomId, @NotNull String operatorId, @NotNull Long operatorIdType) {
        this.instanceId = instanceId;
        this.meetingRoomId = meetingRoomId;
        this.operatorId = operatorId;
        this.operatorIdType = operatorIdType;
    }

    /**
     * @param instanceId  (required)
     */
    public V1MeetingRoomsModifyRoomConfigInfoPostRequest instanceId(@NotNull Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    /**
     * @return instanceId 
     **/
    public Long getInstanceId() {
        return instanceId;
    }

    /**
     * @param instanceId  (required)
     */
    public void setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
    }
    /**
     * @param meetingRoomId 要配置的会议室 ID。 (required)
     */
    public V1MeetingRoomsModifyRoomConfigInfoPostRequest meetingRoomId(@NotNull String meetingRoomId) {
        this.meetingRoomId = meetingRoomId;
        return this;
    }
    /**
     * @return meetingRoomId 要配置的会议室 ID。
     **/
    public String getMeetingRoomId() {
        return meetingRoomId;
    }

    /**
     * @param meetingRoomId 要配置的会议室 ID。 (required)
     */
    public void setMeetingRoomId(String meetingRoomId) {
        this.meetingRoomId = meetingRoomId;
    }
    /**
     * @param meetingSettings 
     */
    public V1MeetingRoomsModifyRoomConfigInfoPostRequest meetingSettings(V1MeetingRoomsModifyRoomConfigInfoPostRequestMeetingSettings meetingSettings) {
        this.meetingSettings = meetingSettings;
        return this;
    }
    /**
     * @return meetingSettings 
     **/
    public V1MeetingRoomsModifyRoomConfigInfoPostRequestMeetingSettings getMeetingSettings() {
        return meetingSettings;
    }

    /**
     * @param meetingSettings 
     */
    public void setMeetingSettings(V1MeetingRoomsModifyRoomConfigInfoPostRequestMeetingSettings meetingSettings) {
        this.meetingSettings = meetingSettings;
    }
    /**
     * @param operatorId  (required)
     */
    public V1MeetingRoomsModifyRoomConfigInfoPostRequest operatorId(@NotNull String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    /**
     * @return operatorId 
     **/
    public String getOperatorId() {
        return operatorId;
    }

    /**
     * @param operatorId  (required)
     */
    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }
    /**
     * @param operatorIdType  (required)
     */
    public V1MeetingRoomsModifyRoomConfigInfoPostRequest operatorIdType(@NotNull Long operatorIdType) {
        this.operatorIdType = operatorIdType;
        return this;
    }
    /**
     * @return operatorIdType 
     **/
    public Long getOperatorIdType() {
        return operatorIdType;
    }

    /**
     * @param operatorIdType  (required)
     */
    public void setOperatorIdType(Long operatorIdType) {
        this.operatorIdType = operatorIdType;
    }
    /**
     * @param recordSettings 
     */
    public V1MeetingRoomsModifyRoomConfigInfoPostRequest recordSettings(V1MeetingRoomsModifyRoomConfigInfoPostRequestRecordSettings recordSettings) {
        this.recordSettings = recordSettings;
        return this;
    }
    /**
     * @return recordSettings 
     **/
    public V1MeetingRoomsModifyRoomConfigInfoPostRequestRecordSettings getRecordSettings() {
        return recordSettings;
    }

    /**
     * @param recordSettings 
     */
    public void setRecordSettings(V1MeetingRoomsModifyRoomConfigInfoPostRequestRecordSettings recordSettings) {
        this.recordSettings = recordSettings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingRoomsModifyRoomConfigInfoPostRequest v1MeetingRoomsModifyRoomConfigInfoPostRequest = (V1MeetingRoomsModifyRoomConfigInfoPostRequest) o;
        return Objects.equals(this.instanceId, v1MeetingRoomsModifyRoomConfigInfoPostRequest.instanceId) &&
            Objects.equals(this.meetingRoomId, v1MeetingRoomsModifyRoomConfigInfoPostRequest.meetingRoomId) &&
            Objects.equals(this.meetingSettings, v1MeetingRoomsModifyRoomConfigInfoPostRequest.meetingSettings) &&
            Objects.equals(this.operatorId, v1MeetingRoomsModifyRoomConfigInfoPostRequest.operatorId) &&
            Objects.equals(this.operatorIdType, v1MeetingRoomsModifyRoomConfigInfoPostRequest.operatorIdType) &&
            Objects.equals(this.recordSettings, v1MeetingRoomsModifyRoomConfigInfoPostRequest.recordSettings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, meetingRoomId, meetingSettings, operatorId, operatorIdType, recordSettings);
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
        sb.append("class V1MeetingRoomsModifyRoomConfigInfoPostRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    meetingRoomId: ").append(toIndentedString(meetingRoomId)).append("\n");
        sb.append("    meetingSettings: ").append(toIndentedString(meetingSettings)).append("\n");
        sb.append("    operatorId: ").append(toIndentedString(operatorId)).append("\n");
        sb.append("    operatorIdType: ").append(toIndentedString(operatorIdType)).append("\n");
        sb.append("    recordSettings: ").append(toIndentedString(recordSettings)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

