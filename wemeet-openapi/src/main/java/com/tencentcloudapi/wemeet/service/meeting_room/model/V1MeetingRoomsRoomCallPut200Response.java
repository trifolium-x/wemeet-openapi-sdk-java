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

/**
 * V1MeetingRoomsRoomCallPut200Response
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingRoomsRoomCallPut200Response {
    @JsonProperty(value = "invite_id")
    private String inviteId;

    /**
     */
    public V1MeetingRoomsRoomCallPut200Response() {
    }

    /**
     * @param inviteId 呼叫ID
     */
    public V1MeetingRoomsRoomCallPut200Response inviteId(String inviteId) {
        this.inviteId = inviteId;
        return this;
    }
    /**
     * @return inviteId 呼叫ID
     **/
    public String getInviteId() {
        return inviteId;
    }

    /**
     * @param inviteId 呼叫ID
     */
    public void setInviteId(String inviteId) {
        this.inviteId = inviteId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingRoomsRoomCallPut200Response v1MeetingRoomsRoomCallPut200Response = (V1MeetingRoomsRoomCallPut200Response) o;
        return Objects.equals(this.inviteId, v1MeetingRoomsRoomCallPut200Response.inviteId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inviteId);
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
        sb.append("class V1MeetingRoomsRoomCallPut200Response {\n");
        sb.append("    inviteId: ").append(toIndentedString(inviteId)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
