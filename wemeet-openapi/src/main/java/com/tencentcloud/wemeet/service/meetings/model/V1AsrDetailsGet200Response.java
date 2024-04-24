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

package com.tencentcloud.wemeet.service.meetings.model;

import java.util.*;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;

/**
 * V1AsrDetailsGet200Response
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1AsrDetailsGet200Response {
    @JsonProperty(value = "curr_page")
    private Long currPage;

    @JsonProperty(value = "curr_size")
    private Long currSize;

    @JsonProperty(value = "total_count")
    private Long totalCount;

    @JsonProperty(value = "total_page")
    private Long totalPage;

    /**
     */
    public V1AsrDetailsGet200Response() {
    }

    /**
     * @param currPage 分页查询返回分页总数
     */
    public V1AsrDetailsGet200Response currPage(Long currPage) {
        this.currPage = currPage;
        return this;
    }
    /**
     * @return currPage 分页查询返回分页总数
     **/
    public Long getCurrPage() {
        return currPage;
    }

    /**
     * @param currPage 分页查询返回分页总数
     */
    public void setCurrPage(Long currPage) {
        this.currPage = currPage;
    }
    /**
     * @param currSize 分页查询返回当前页码
     */
    public V1AsrDetailsGet200Response currSize(Long currSize) {
        this.currSize = currSize;
        return this;
    }
    /**
     * @return currSize 分页查询返回当前页码
     **/
    public Long getCurrSize() {
        return currSize;
    }

    /**
     * @param currSize 分页查询返回当前页码
     */
    public void setCurrSize(Long currSize) {
        this.currSize = currSize;
    }
    /**
     * @param totalCount 分页查询返回数据总数
     */
    public V1AsrDetailsGet200Response totalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    /**
     * @return totalCount 分页查询返回数据总数
     **/
    public Long getTotalCount() {
        return totalCount;
    }

    /**
     * @param totalCount 分页查询返回数据总数
     */
    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }
    /**
     * @param totalPage 分页查询返回单页数据条数
     */
    public V1AsrDetailsGet200Response totalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    /**
     * @return totalPage 分页查询返回单页数据条数
     **/
    public Long getTotalPage() {
        return totalPage;
    }

    /**
     * @param totalPage 分页查询返回单页数据条数
     */
    public void setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1AsrDetailsGet200Response v1AsrDetailsGet200Response = (V1AsrDetailsGet200Response) o;
        return Objects.equals(this.currPage, v1AsrDetailsGet200Response.currPage) &&
            Objects.equals(this.currSize, v1AsrDetailsGet200Response.currSize) &&
            Objects.equals(this.totalCount, v1AsrDetailsGet200Response.totalCount) &&
            Objects.equals(this.totalPage, v1AsrDetailsGet200Response.totalPage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currPage, currSize, totalCount, totalPage);
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
        sb.append("class V1AsrDetailsGet200Response {\n");
        sb.append("    currPage: ").append(toIndentedString(currPage)).append("\n");
        sb.append("    currSize: ").append(toIndentedString(currSize)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    totalPage: ").append(toIndentedString(totalPage)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
