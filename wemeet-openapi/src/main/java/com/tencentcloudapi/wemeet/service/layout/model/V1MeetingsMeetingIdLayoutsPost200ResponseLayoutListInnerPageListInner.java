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

/**
 * V1MeetingsMeetingIdLayoutsPost200ResponseLayoutListInnerPageListInner
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingsMeetingIdLayoutsPost200ResponseLayoutListInnerPageListInner {
    @JsonProperty(value = "layout_template_id")
    private String layoutTemplateId;

    @JsonProperty(value = "user_seat_list")
    private List<V1MeetingsMeetingIdLayoutsPost200ResponseLayoutListInnerPageListInnerUserSeatListInner> userSeatList;

    /**
     */
    public V1MeetingsMeetingIdLayoutsPost200ResponseLayoutListInnerPageListInner() {
    }

    /**
     * @param layoutTemplateId 布局模板ID
     */
    public V1MeetingsMeetingIdLayoutsPost200ResponseLayoutListInnerPageListInner layoutTemplateId(String layoutTemplateId) {
        this.layoutTemplateId = layoutTemplateId;
        return this;
    }
    /**
     * @return layoutTemplateId 布局模板ID
     **/
    public String getLayoutTemplateId() {
        return layoutTemplateId;
    }

    /**
     * @param layoutTemplateId 布局模板ID
     */
    public void setLayoutTemplateId(String layoutTemplateId) {
        this.layoutTemplateId = layoutTemplateId;
    }
    /**
     * @param userSeatList 用户座次对象列表
     */
    public V1MeetingsMeetingIdLayoutsPost200ResponseLayoutListInnerPageListInner userSeatList(List<V1MeetingsMeetingIdLayoutsPost200ResponseLayoutListInnerPageListInnerUserSeatListInner> userSeatList) {
        this.userSeatList = userSeatList;
        return this;
    }
    /**
     * @return userSeatList 用户座次对象列表
     **/
    public List<V1MeetingsMeetingIdLayoutsPost200ResponseLayoutListInnerPageListInnerUserSeatListInner> getUserSeatList() {
        return userSeatList;
    }

    /**
     * @param userSeatList 用户座次对象列表
     */
    public void setUserSeatList(List<V1MeetingsMeetingIdLayoutsPost200ResponseLayoutListInnerPageListInnerUserSeatListInner> userSeatList) {
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
        V1MeetingsMeetingIdLayoutsPost200ResponseLayoutListInnerPageListInner v1MeetingsMeetingIdLayoutsPost200ResponseLayoutListInnerPageListInner = (V1MeetingsMeetingIdLayoutsPost200ResponseLayoutListInnerPageListInner) o;
        return Objects.equals(this.layoutTemplateId, v1MeetingsMeetingIdLayoutsPost200ResponseLayoutListInnerPageListInner.layoutTemplateId) &&
            Objects.equals(this.userSeatList, v1MeetingsMeetingIdLayoutsPost200ResponseLayoutListInnerPageListInner.userSeatList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(layoutTemplateId, userSeatList);
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
        sb.append("class V1MeetingsMeetingIdLayoutsPost200ResponseLayoutListInnerPageListInner {\n");
        sb.append("    layoutTemplateId: ").append(toIndentedString(layoutTemplateId)).append("\n");
        sb.append("    userSeatList: ").append(toIndentedString(userSeatList)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

