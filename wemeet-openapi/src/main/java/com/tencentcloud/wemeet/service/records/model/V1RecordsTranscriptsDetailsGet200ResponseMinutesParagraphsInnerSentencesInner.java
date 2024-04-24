/*
 * 腾讯会议OpenAPI
 * SAAS版RESTFUL风格API
 *
 * The version of the OpenAPI document: v1.0.0.70
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.tencentcloud.wemeet.service.records.model;

import java.util.*;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;

/**
 * V1RecordsTranscriptsDetailsGet200ResponseMinutesParagraphsInnerSentencesInner
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1RecordsTranscriptsDetailsGet200ResponseMinutesParagraphsInnerSentencesInner {
    @JsonProperty(value = "end_time")
    private Long endTime;

    @JsonProperty(value = "sid")
    private String sid;

    @JsonProperty(value = "start_time")
    private Long startTime;

    @JsonProperty(value = "words")
    private List<V1RecordsTranscriptsDetailsGet200ResponseMinutesParagraphsInnerSentencesInnerWordsInner> words;

    /**
     */
    public V1RecordsTranscriptsDetailsGet200ResponseMinutesParagraphsInnerSentencesInner() {
    }

    /**
     * @param endTime 录制文件中的句子结束时间（毫秒）。
     */
    public V1RecordsTranscriptsDetailsGet200ResponseMinutesParagraphsInnerSentencesInner endTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    /**
     * @return endTime 录制文件中的句子结束时间（毫秒）。
     **/
    public Long getEndTime() {
        return endTime;
    }

    /**
     * @param endTime 录制文件中的句子结束时间（毫秒）。
     */
    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }
    /**
     * @param sid 句子 ID。
     */
    public V1RecordsTranscriptsDetailsGet200ResponseMinutesParagraphsInnerSentencesInner sid(String sid) {
        this.sid = sid;
        return this;
    }
    /**
     * @return sid 句子 ID。
     **/
    public String getSid() {
        return sid;
    }

    /**
     * @param sid 句子 ID。
     */
    public void setSid(String sid) {
        this.sid = sid;
    }
    /**
     * @param startTime 录制文件中的句子开始时间（毫秒）。
     */
    public V1RecordsTranscriptsDetailsGet200ResponseMinutesParagraphsInnerSentencesInner startTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    /**
     * @return startTime 录制文件中的句子开始时间（毫秒）。
     **/
    public Long getStartTime() {
        return startTime;
    }

    /**
     * @param startTime 录制文件中的句子开始时间（毫秒）。
     */
    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }
    /**
     * @param words 词对象列表
     */
    public V1RecordsTranscriptsDetailsGet200ResponseMinutesParagraphsInnerSentencesInner words(List<V1RecordsTranscriptsDetailsGet200ResponseMinutesParagraphsInnerSentencesInnerWordsInner> words) {
        this.words = words;
        return this;
    }
    /**
     * @return words 词对象列表
     **/
    public List<V1RecordsTranscriptsDetailsGet200ResponseMinutesParagraphsInnerSentencesInnerWordsInner> getWords() {
        return words;
    }

    /**
     * @param words 词对象列表
     */
    public void setWords(List<V1RecordsTranscriptsDetailsGet200ResponseMinutesParagraphsInnerSentencesInnerWordsInner> words) {
        this.words = words;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1RecordsTranscriptsDetailsGet200ResponseMinutesParagraphsInnerSentencesInner v1RecordsTranscriptsDetailsGet200ResponseMinutesParagraphsInnerSentencesInner = (V1RecordsTranscriptsDetailsGet200ResponseMinutesParagraphsInnerSentencesInner) o;
        return Objects.equals(this.endTime, v1RecordsTranscriptsDetailsGet200ResponseMinutesParagraphsInnerSentencesInner.endTime) &&
            Objects.equals(this.sid, v1RecordsTranscriptsDetailsGet200ResponseMinutesParagraphsInnerSentencesInner.sid) &&
            Objects.equals(this.startTime, v1RecordsTranscriptsDetailsGet200ResponseMinutesParagraphsInnerSentencesInner.startTime) &&
            Objects.equals(this.words, v1RecordsTranscriptsDetailsGet200ResponseMinutesParagraphsInnerSentencesInner.words);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endTime, sid, startTime, words);
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
        sb.append("class V1RecordsTranscriptsDetailsGet200ResponseMinutesParagraphsInnerSentencesInner {\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    words: ").append(toIndentedString(words)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
