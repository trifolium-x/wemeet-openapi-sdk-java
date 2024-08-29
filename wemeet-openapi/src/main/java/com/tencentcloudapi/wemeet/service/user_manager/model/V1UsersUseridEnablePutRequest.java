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

package com.tencentcloudapi.wemeet.service.user_manager.model;

import java.util.*;

import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;

/**
 * V1UsersUseridEnablePutRequest
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1UsersUseridEnablePutRequest {
    @JsonProperty(value = "enable", required = true)
    private Boolean enable;

    /**
     * @param enable 是否启用用户： true：启用 false：禁用 (required)
     */
    public V1UsersUseridEnablePutRequest(@NotNull Boolean enable) {
        this.enable = enable;
    }

    /**
     * @param enable 是否启用用户： true：启用 false：禁用 (required)
     */
    public V1UsersUseridEnablePutRequest enable(@NotNull Boolean enable) {
        this.enable = enable;
        return this;
    }
    /**
     * @return enable 是否启用用户： true：启用 false：禁用
     **/
    public Boolean getEnable() {
        return enable;
    }

    /**
     * @param enable 是否启用用户： true：启用 false：禁用 (required)
     */
    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1UsersUseridEnablePutRequest v1UsersUseridEnablePutRequest = (V1UsersUseridEnablePutRequest) o;
        return Objects.equals(this.enable, v1UsersUseridEnablePutRequest.enable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enable);
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
        sb.append("class V1UsersUseridEnablePutRequest {\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

