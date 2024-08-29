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

package com.tencentcloudapi.wemeet.service.layout.model;

import java.util.*;

import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;

/**
 * V1MeetingsMeetingIdAdvancedLayoutsPostRequestLayoutListInnerPageListInner
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingsMeetingIdAdvancedLayoutsPostRequestLayoutListInnerPageListInner {
    @JsonProperty(value = "enable_polling")
    private Boolean enablePolling;

    @JsonProperty(value = "layout_template_id", required = true)
    private String layoutTemplateId;

    @JsonProperty(value = "polling_setting")
    private V1MeetingsMeetingIdAdvancedLayoutsPostRequestLayoutListInnerPageListInnerPollingSetting pollingSetting;

    @JsonProperty(value = "user_seat_list", required = true)
    private List<V1MeetingsMeetingIdAdvancedLayoutsPostRequestLayoutListInnerPageListInnerUserSeatListInner> userSeatList;

    /**
     * @param layoutTemplateId 布局模板 ID (required)
     * @param userSeatList 用户座次对象列表 (required)
     */
    public V1MeetingsMeetingIdAdvancedLayoutsPostRequestLayoutListInnerPageListInner(@NotNull String layoutTemplateId, @NotNull List<V1MeetingsMeetingIdAdvancedLayoutsPostRequestLayoutListInnerPageListInnerUserSeatListInner> userSeatList) {
        this.layoutTemplateId = layoutTemplateId;
        this.userSeatList = userSeatList;
    }

    /**
     * @param enablePolling 开启/关闭轮询
     */
    public V1MeetingsMeetingIdAdvancedLayoutsPostRequestLayoutListInnerPageListInner enablePolling(Boolean enablePolling) {
        this.enablePolling = enablePolling;
        return this;
    }
    /**
     * @return enablePolling 开启/关闭轮询
     **/
    public Boolean getEnablePolling() {
        return enablePolling;
    }

    /**
     * @param enablePolling 开启/关闭轮询
     */
    public void setEnablePolling(Boolean enablePolling) {
        this.enablePolling = enablePolling;
    }
    /**
     * @param layoutTemplateId 布局模板 ID (required)
     */
    public V1MeetingsMeetingIdAdvancedLayoutsPostRequestLayoutListInnerPageListInner layoutTemplateId(@NotNull String layoutTemplateId) {
        this.layoutTemplateId = layoutTemplateId;
        return this;
    }
    /**
     * @return layoutTemplateId 布局模板 ID
     **/
    public String getLayoutTemplateId() {
        return layoutTemplateId;
    }

    /**
     * @param layoutTemplateId 布局模板 ID (required)
     */
    public void setLayoutTemplateId(String layoutTemplateId) {
        this.layoutTemplateId = layoutTemplateId;
    }
    /**
     * @param pollingSetting 
     */
    public V1MeetingsMeetingIdAdvancedLayoutsPostRequestLayoutListInnerPageListInner pollingSetting(V1MeetingsMeetingIdAdvancedLayoutsPostRequestLayoutListInnerPageListInnerPollingSetting pollingSetting) {
        this.pollingSetting = pollingSetting;
        return this;
    }
    /**
     * @return pollingSetting 
     **/
    public V1MeetingsMeetingIdAdvancedLayoutsPostRequestLayoutListInnerPageListInnerPollingSetting getPollingSetting() {
        return pollingSetting;
    }

    /**
     * @param pollingSetting 
     */
    public void setPollingSetting(V1MeetingsMeetingIdAdvancedLayoutsPostRequestLayoutListInnerPageListInnerPollingSetting pollingSetting) {
        this.pollingSetting = pollingSetting;
    }
    /**
     * @param userSeatList 用户座次对象列表 (required)
     */
    public V1MeetingsMeetingIdAdvancedLayoutsPostRequestLayoutListInnerPageListInner userSeatList(@NotNull List<V1MeetingsMeetingIdAdvancedLayoutsPostRequestLayoutListInnerPageListInnerUserSeatListInner> userSeatList) {
        this.userSeatList = userSeatList;
        return this;
    }
    /**
     * @return userSeatList 用户座次对象列表
     **/
    public List<V1MeetingsMeetingIdAdvancedLayoutsPostRequestLayoutListInnerPageListInnerUserSeatListInner> getUserSeatList() {
        return userSeatList;
    }

    /**
     * @param userSeatList 用户座次对象列表 (required)
     */
    public void setUserSeatList(List<V1MeetingsMeetingIdAdvancedLayoutsPostRequestLayoutListInnerPageListInnerUserSeatListInner> userSeatList) {
        this.userSeatList = userSeatList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingsMeetingIdAdvancedLayoutsPostRequestLayoutListInnerPageListInner v1MeetingsMeetingIdAdvancedLayoutsPostRequestLayoutListInnerPageListInner = (V1MeetingsMeetingIdAdvancedLayoutsPostRequestLayoutListInnerPageListInner) o;
        return Objects.equals(this.enablePolling, v1MeetingsMeetingIdAdvancedLayoutsPostRequestLayoutListInnerPageListInner.enablePolling) &&
            Objects.equals(this.layoutTemplateId, v1MeetingsMeetingIdAdvancedLayoutsPostRequestLayoutListInnerPageListInner.layoutTemplateId) &&
            Objects.equals(this.pollingSetting, v1MeetingsMeetingIdAdvancedLayoutsPostRequestLayoutListInnerPageListInner.pollingSetting) &&
            Objects.equals(this.userSeatList, v1MeetingsMeetingIdAdvancedLayoutsPostRequestLayoutListInnerPageListInner.userSeatList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enablePolling, layoutTemplateId, pollingSetting, userSeatList);
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
        sb.append("class V1MeetingsMeetingIdAdvancedLayoutsPostRequestLayoutListInnerPageListInner {\n");
        sb.append("    enablePolling: ").append(toIndentedString(enablePolling)).append("\n");
        sb.append("    layoutTemplateId: ").append(toIndentedString(layoutTemplateId)).append("\n");
        sb.append("    pollingSetting: ").append(toIndentedString(pollingSetting)).append("\n");
        sb.append("    userSeatList: ").append(toIndentedString(userSeatList)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

