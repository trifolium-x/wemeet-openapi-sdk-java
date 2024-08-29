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

package com.tencentcloudapi.wemeet.service.meeting_room.model;

import java.util.*;

import com.fasterxml.jackson.annotation.*;

/**
 * V1MeetingRoomsMonitorDeviceControllerInfoGet200Response
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingRoomsMonitorDeviceControllerInfoGet200Response {
    @JsonProperty(value = "controller_info_list")
    private List<V1MeetingRoomsMonitorDeviceControllerInfoGet200ResponseControllerInfoListInner> controllerInfoList;

    @JsonProperty(value = "current_page")
    private Long currentPage;

    @JsonProperty(value = "current_size")
    private Long currentSize;

    @JsonProperty(value = "total_count")
    private Long totalCount;

    @JsonProperty(value = "total_page")
    private Long totalPage;

    /**
     */
    public V1MeetingRoomsMonitorDeviceControllerInfoGet200Response() {
    }

    /**
     * @param controllerInfoList 控制器信息对象
     */
    public V1MeetingRoomsMonitorDeviceControllerInfoGet200Response controllerInfoList(List<V1MeetingRoomsMonitorDeviceControllerInfoGet200ResponseControllerInfoListInner> controllerInfoList) {
        this.controllerInfoList = controllerInfoList;
        return this;
    }
    /**
     * @return controllerInfoList 控制器信息对象
     **/
    public List<V1MeetingRoomsMonitorDeviceControllerInfoGet200ResponseControllerInfoListInner> getControllerInfoList() {
        return controllerInfoList;
    }

    /**
     * @param controllerInfoList 控制器信息对象
     */
    public void setControllerInfoList(List<V1MeetingRoomsMonitorDeviceControllerInfoGet200ResponseControllerInfoListInner> controllerInfoList) {
        this.controllerInfoList = controllerInfoList;
    }
    /**
     * @param currentPage 分页查询返回当前页码。
     */
    public V1MeetingRoomsMonitorDeviceControllerInfoGet200Response currentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    /**
     * @return currentPage 分页查询返回当前页码。
     **/
    public Long getCurrentPage() {
        return currentPage;
    }

    /**
     * @param currentPage 分页查询返回当前页码。
     */
    public void setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
    }
    /**
     * @param currentSize 分页查询返回单页数据条数。
     */
    public V1MeetingRoomsMonitorDeviceControllerInfoGet200Response currentSize(Long currentSize) {
        this.currentSize = currentSize;
        return this;
    }
    /**
     * @return currentSize 分页查询返回单页数据条数。
     **/
    public Long getCurrentSize() {
        return currentSize;
    }

    /**
     * @param currentSize 分页查询返回单页数据条数。
     */
    public void setCurrentSize(Long currentSize) {
        this.currentSize = currentSize;
    }
    /**
     * @param totalCount 分页查询返回数据总数。
     */
    public V1MeetingRoomsMonitorDeviceControllerInfoGet200Response totalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    /**
     * @return totalCount 分页查询返回数据总数。
     **/
    public Long getTotalCount() {
        return totalCount;
    }

    /**
     * @param totalCount 分页查询返回数据总数。
     */
    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }
    /**
     * @param totalPage 分页查询返回分页总数。
     */
    public V1MeetingRoomsMonitorDeviceControllerInfoGet200Response totalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    /**
     * @return totalPage 分页查询返回分页总数。
     **/
    public Long getTotalPage() {
        return totalPage;
    }

    /**
     * @param totalPage 分页查询返回分页总数。
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
        V1MeetingRoomsMonitorDeviceControllerInfoGet200Response v1MeetingRoomsMonitorDeviceControllerInfoGet200Response = (V1MeetingRoomsMonitorDeviceControllerInfoGet200Response) o;
        return Objects.equals(this.controllerInfoList, v1MeetingRoomsMonitorDeviceControllerInfoGet200Response.controllerInfoList) &&
            Objects.equals(this.currentPage, v1MeetingRoomsMonitorDeviceControllerInfoGet200Response.currentPage) &&
            Objects.equals(this.currentSize, v1MeetingRoomsMonitorDeviceControllerInfoGet200Response.currentSize) &&
            Objects.equals(this.totalCount, v1MeetingRoomsMonitorDeviceControllerInfoGet200Response.totalCount) &&
            Objects.equals(this.totalPage, v1MeetingRoomsMonitorDeviceControllerInfoGet200Response.totalPage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(controllerInfoList, currentPage, currentSize, totalCount, totalPage);
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
        sb.append("class V1MeetingRoomsMonitorDeviceControllerInfoGet200Response {\n");
        sb.append("    controllerInfoList: ").append(toIndentedString(controllerInfoList)).append("\n");
        sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
        sb.append("    currentSize: ").append(toIndentedString(currentSize)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    totalPage: ").append(toIndentedString(totalPage)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

