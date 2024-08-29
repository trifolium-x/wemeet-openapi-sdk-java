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
 * V1MeetingsMeetingIdLayoutsPostRequestLayoutListInner
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingsMeetingIdLayoutsPostRequestLayoutListInner {
    @JsonProperty(value = "layout_id", required = true)
    private String layoutId;

    @JsonProperty(value = "page_list", required = true)
    private List<V1MeetingsMeetingIdLayoutsPostRequestLayoutListInnerPageListInner> pageList;

    /**
     * @param layoutId  (required)
     * @param pageList 布局单页对象列表 (required)
     */
    public V1MeetingsMeetingIdLayoutsPostRequestLayoutListInner(@NotNull String layoutId, @NotNull List<V1MeetingsMeetingIdLayoutsPostRequestLayoutListInnerPageListInner> pageList) {
        this.layoutId = layoutId;
        this.pageList = pageList;
    }

    /**
     * @param layoutId  (required)
     */
    public V1MeetingsMeetingIdLayoutsPostRequestLayoutListInner layoutId(@NotNull String layoutId) {
        this.layoutId = layoutId;
        return this;
    }
    /**
     * @return layoutId 
     **/
    public String getLayoutId() {
        return layoutId;
    }

    /**
     * @param layoutId  (required)
     */
    public void setLayoutId(String layoutId) {
        this.layoutId = layoutId;
    }
    /**
     * @param pageList 布局单页对象列表 (required)
     */
    public V1MeetingsMeetingIdLayoutsPostRequestLayoutListInner pageList(@NotNull List<V1MeetingsMeetingIdLayoutsPostRequestLayoutListInnerPageListInner> pageList) {
        this.pageList = pageList;
        return this;
    }
    /**
     * @return pageList 布局单页对象列表
     **/
    public List<V1MeetingsMeetingIdLayoutsPostRequestLayoutListInnerPageListInner> getPageList() {
        return pageList;
    }

    /**
     * @param pageList 布局单页对象列表 (required)
     */
    public void setPageList(List<V1MeetingsMeetingIdLayoutsPostRequestLayoutListInnerPageListInner> pageList) {
        this.pageList = pageList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingsMeetingIdLayoutsPostRequestLayoutListInner v1MeetingsMeetingIdLayoutsPostRequestLayoutListInner = (V1MeetingsMeetingIdLayoutsPostRequestLayoutListInner) o;
        return Objects.equals(this.layoutId, v1MeetingsMeetingIdLayoutsPostRequestLayoutListInner.layoutId) &&
            Objects.equals(this.pageList, v1MeetingsMeetingIdLayoutsPostRequestLayoutListInner.pageList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(layoutId, pageList);
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
        sb.append("class V1MeetingsMeetingIdLayoutsPostRequestLayoutListInner {\n");
        sb.append("    layoutId: ").append(toIndentedString(layoutId)).append("\n");
        sb.append("    pageList: ").append(toIndentedString(pageList)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

