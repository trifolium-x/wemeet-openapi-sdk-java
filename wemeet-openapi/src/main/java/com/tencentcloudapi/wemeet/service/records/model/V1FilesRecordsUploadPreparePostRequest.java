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
import org.jetbrains.annotations.NotNull;

/**
 * V1FilesRecordsUploadPreparePostRequest
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1FilesRecordsUploadPreparePostRequest {
    @JsonProperty(value = "file_name", required = true)
    private String fileName;

    @JsonProperty(value = "file_size", required = true)
    private Long fileSize;

    @JsonProperty(value = "file_type", required = true)
    private String fileType;

    @JsonProperty(value = "operator_id", required = true)
    private String operatorId;

    @JsonProperty(value = "operator_id_type", required = true)
    private Long operatorIdType;

    /**
     * @param fileName 文件名base64编码 (required)
     * @param fileSize 文件大小（以字节为单位） (required)
     * @param fileType 文件类型。voice：音频；video：视频 (required)
     * @param operatorId 操作者ID (required)
     * @param operatorIdType 操作者ID类型 (required)
     */
    public V1FilesRecordsUploadPreparePostRequest(@NotNull String fileName, @NotNull Long fileSize, @NotNull String fileType, @NotNull String operatorId, @NotNull Long operatorIdType) {
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.fileType = fileType;
        this.operatorId = operatorId;
        this.operatorIdType = operatorIdType;
    }

    /**
     * @param fileName 文件名base64编码 (required)
     */
    public V1FilesRecordsUploadPreparePostRequest fileName(@NotNull String fileName) {
        this.fileName = fileName;
        return this;
    }
    /**
     * @return fileName 文件名base64编码
     **/
    public String getFileName() {
        return fileName;
    }

    /**
     * @param fileName 文件名base64编码 (required)
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    /**
     * @param fileSize 文件大小（以字节为单位） (required)
     */
    public V1FilesRecordsUploadPreparePostRequest fileSize(@NotNull Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    /**
     * @return fileSize 文件大小（以字节为单位）
     **/
    public Long getFileSize() {
        return fileSize;
    }

    /**
     * @param fileSize 文件大小（以字节为单位） (required)
     */
    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }
    /**
     * @param fileType 文件类型。voice：音频；video：视频 (required)
     */
    public V1FilesRecordsUploadPreparePostRequest fileType(@NotNull String fileType) {
        this.fileType = fileType;
        return this;
    }
    /**
     * @return fileType 文件类型。voice：音频；video：视频
     **/
    public String getFileType() {
        return fileType;
    }

    /**
     * @param fileType 文件类型。voice：音频；video：视频 (required)
     */
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }
    /**
     * @param operatorId 操作者ID (required)
     */
    public V1FilesRecordsUploadPreparePostRequest operatorId(@NotNull String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    /**
     * @return operatorId 操作者ID
     **/
    public String getOperatorId() {
        return operatorId;
    }

    /**
     * @param operatorId 操作者ID (required)
     */
    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }
    /**
     * @param operatorIdType 操作者ID类型 (required)
     */
    public V1FilesRecordsUploadPreparePostRequest operatorIdType(@NotNull Long operatorIdType) {
        this.operatorIdType = operatorIdType;
        return this;
    }
    /**
     * @return operatorIdType 操作者ID类型
     **/
    public Long getOperatorIdType() {
        return operatorIdType;
    }

    /**
     * @param operatorIdType 操作者ID类型 (required)
     */
    public void setOperatorIdType(Long operatorIdType) {
        this.operatorIdType = operatorIdType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1FilesRecordsUploadPreparePostRequest v1FilesRecordsUploadPreparePostRequest = (V1FilesRecordsUploadPreparePostRequest) o;
        return Objects.equals(this.fileName, v1FilesRecordsUploadPreparePostRequest.fileName) &&
            Objects.equals(this.fileSize, v1FilesRecordsUploadPreparePostRequest.fileSize) &&
            Objects.equals(this.fileType, v1FilesRecordsUploadPreparePostRequest.fileType) &&
            Objects.equals(this.operatorId, v1FilesRecordsUploadPreparePostRequest.operatorId) &&
            Objects.equals(this.operatorIdType, v1FilesRecordsUploadPreparePostRequest.operatorIdType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileName, fileSize, fileType, operatorId, operatorIdType);
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
        sb.append("class V1FilesRecordsUploadPreparePostRequest {\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
        sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
        sb.append("    operatorId: ").append(toIndentedString(operatorId)).append("\n");
        sb.append("    operatorIdType: ").append(toIndentedString(operatorIdType)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
