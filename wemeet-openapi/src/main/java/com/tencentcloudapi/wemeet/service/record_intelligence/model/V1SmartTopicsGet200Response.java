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

package com.tencentcloudapi.wemeet.service.record_intelligence.model;

import java.util.*;

import com.fasterxml.jackson.annotation.*;

/**
 * V1SmartTopicsGet200Response
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1SmartTopicsGet200Response {
    @JsonProperty(value = "ai_topic_list")
    private List<V1SmartTopicsGet200ResponseAiTopicListInner> aiTopicList;

    /**
     */
    public V1SmartTopicsGet200Response() {
    }

    /**
     * @param aiTopicList 本录制文件的智能话题列表，以对象数组形式返回
     */
    public V1SmartTopicsGet200Response aiTopicList(List<V1SmartTopicsGet200ResponseAiTopicListInner> aiTopicList) {
        this.aiTopicList = aiTopicList;
        return this;
    }
    /**
     * @return aiTopicList 本录制文件的智能话题列表，以对象数组形式返回
     **/
    public List<V1SmartTopicsGet200ResponseAiTopicListInner> getAiTopicList() {
        return aiTopicList;
    }

    /**
     * @param aiTopicList 本录制文件的智能话题列表，以对象数组形式返回
     */
    public void setAiTopicList(List<V1SmartTopicsGet200ResponseAiTopicListInner> aiTopicList) {
        this.aiTopicList = aiTopicList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1SmartTopicsGet200Response v1SmartTopicsGet200Response = (V1SmartTopicsGet200Response) o;
        return Objects.equals(this.aiTopicList, v1SmartTopicsGet200Response.aiTopicList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aiTopicList);
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
        sb.append("class V1SmartTopicsGet200Response {\n");
        sb.append("    aiTopicList: ").append(toIndentedString(aiTopicList)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

