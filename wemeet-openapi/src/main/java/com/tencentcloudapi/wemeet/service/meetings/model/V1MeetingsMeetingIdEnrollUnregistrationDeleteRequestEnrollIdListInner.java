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
import org.jetbrains.annotations.NotNull;

/**
 * V1MeetingsMeetingIdEnrollUnregistrationDeleteRequestEnrollIdListInner
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingsMeetingIdEnrollUnregistrationDeleteRequestEnrollIdListInner {
    @JsonProperty(value = "enroll_id", required = true)
    private Long enrollId;

    /**
     * @param enrollId 报名ID (required)
     */
    public V1MeetingsMeetingIdEnrollUnregistrationDeleteRequestEnrollIdListInner(@NotNull Long enrollId) {
        this.enrollId = enrollId;
    }

    /**
     * @param enrollId 报名ID (required)
     */
    public V1MeetingsMeetingIdEnrollUnregistrationDeleteRequestEnrollIdListInner enrollId(@NotNull Long enrollId) {
        this.enrollId = enrollId;
        return this;
    }
    /**
     * @return enrollId 报名ID
     **/
    public Long getEnrollId() {
        return enrollId;
    }

    /**
     * @param enrollId 报名ID (required)
     */
    public void setEnrollId(Long enrollId) {
        this.enrollId = enrollId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingsMeetingIdEnrollUnregistrationDeleteRequestEnrollIdListInner v1MeetingsMeetingIdEnrollUnregistrationDeleteRequestEnrollIdListInner = (V1MeetingsMeetingIdEnrollUnregistrationDeleteRequestEnrollIdListInner) o;
        return Objects.equals(this.enrollId, v1MeetingsMeetingIdEnrollUnregistrationDeleteRequestEnrollIdListInner.enrollId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enrollId);
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
        sb.append("class V1MeetingsMeetingIdEnrollUnregistrationDeleteRequestEnrollIdListInner {\n");
        sb.append("    enrollId: ").append(toIndentedString(enrollId)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

