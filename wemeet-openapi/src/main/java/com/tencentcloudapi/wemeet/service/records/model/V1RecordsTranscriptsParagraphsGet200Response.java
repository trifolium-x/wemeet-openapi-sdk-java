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

package com.tencentcloudapi.wemeet.service.records.model;

import java.util.*;

import com.fasterxml.jackson.annotation.*;

/**
 * V1RecordsTranscriptsParagraphsGet200Response
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1RecordsTranscriptsParagraphsGet200Response {
    @JsonProperty(value = "audio_detect")
    private Long audioDetect;

    @JsonProperty(value = "pids")
    private List<V1RecordsTranscriptsParagraphsGet200ResponsePidsInner> pids;

    @JsonProperty(value = "total")
    private Long total;

    /**
     */
    public V1RecordsTranscriptsParagraphsGet200Response() {
    }

    /**
     * @param audioDetect 声纹识别状态0-未完成 1-已完成。说明：声纹识别是针对 Rooms 等设备出现一台设备多人讲话场景时，自动区分为多个发言人的能力。声纹识别与纪要生成的过程独立。无需声纹识别或声纹识别已完成时，该值为1。
     */
    public V1RecordsTranscriptsParagraphsGet200Response audioDetect(Long audioDetect) {
        this.audioDetect = audioDetect;
        return this;
    }
    /**
     * @return audioDetect 声纹识别状态0-未完成 1-已完成。说明：声纹识别是针对 Rooms 等设备出现一台设备多人讲话场景时，自动区分为多个发言人的能力。声纹识别与纪要生成的过程独立。无需声纹识别或声纹识别已完成时，该值为1。
     **/
    public Long getAudioDetect() {
        return audioDetect;
    }

    /**
     * @param audioDetect 声纹识别状态0-未完成 1-已完成。说明：声纹识别是针对 Rooms 等设备出现一台设备多人讲话场景时，自动区分为多个发言人的能力。声纹识别与纪要生成的过程独立。无需声纹识别或声纹识别已完成时，该值为1。
     */
    public void setAudioDetect(Long audioDetect) {
        this.audioDetect = audioDetect;
    }
    /**
     * @param pids 段落对象列表
     */
    public V1RecordsTranscriptsParagraphsGet200Response pids(List<V1RecordsTranscriptsParagraphsGet200ResponsePidsInner> pids) {
        this.pids = pids;
        return this;
    }
    /**
     * @return pids 段落对象列表
     **/
    public List<V1RecordsTranscriptsParagraphsGet200ResponsePidsInner> getPids() {
        return pids;
    }

    /**
     * @param pids 段落对象列表
     */
    public void setPids(List<V1RecordsTranscriptsParagraphsGet200ResponsePidsInner> pids) {
        this.pids = pids;
    }
    /**
     * @param total 段落总数。
     */
    public V1RecordsTranscriptsParagraphsGet200Response total(Long total) {
        this.total = total;
        return this;
    }
    /**
     * @return total 段落总数。
     **/
    public Long getTotal() {
        return total;
    }

    /**
     * @param total 段落总数。
     */
    public void setTotal(Long total) {
        this.total = total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1RecordsTranscriptsParagraphsGet200Response v1RecordsTranscriptsParagraphsGet200Response = (V1RecordsTranscriptsParagraphsGet200Response) o;
        return Objects.equals(this.audioDetect, v1RecordsTranscriptsParagraphsGet200Response.audioDetect) &&
            Objects.equals(this.pids, v1RecordsTranscriptsParagraphsGet200Response.pids) &&
            Objects.equals(this.total, v1RecordsTranscriptsParagraphsGet200Response.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(audioDetect, pids, total);
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
        sb.append("class V1RecordsTranscriptsParagraphsGet200Response {\n");
        sb.append("    audioDetect: ").append(toIndentedString(audioDetect)).append("\n");
        sb.append("    pids: ").append(toIndentedString(pids)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

