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
 * 会议室录制配置对象
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingRoomsRoomConfigInfoPost200ResponseRecordSettings {
    @JsonProperty(value = "download_record")
    private Boolean downloadRecord;

    @JsonProperty(value = "share_record")
    private Long shareRecord;

    /**
     */
    public V1MeetingRoomsRoomConfigInfoPost200ResponseRecordSettings() {
    }

    /**
     * @param downloadRecord 是否允许下载云录制。 true：开启 false：关闭
     */
    public V1MeetingRoomsRoomConfigInfoPost200ResponseRecordSettings downloadRecord(Boolean downloadRecord) {
        this.downloadRecord = downloadRecord;
        return this;
    }
    /**
     * @return downloadRecord 是否允许下载云录制。 true：开启 false：关闭
     **/
    public Boolean getDownloadRecord() {
        return downloadRecord;
    }

    /**
     * @param downloadRecord 是否允许下载云录制。 true：开启 false：关闭
     */
    public void setDownloadRecord(Boolean downloadRecord) {
        this.downloadRecord = downloadRecord;
    }
    /**
     * @param shareRecord 分享云录制。 0：关闭分享 1：全部成员可查看 2：仅登录成员可查看 3：仅同企业成员可查看 4：仅参会成员可查看
     */
    public V1MeetingRoomsRoomConfigInfoPost200ResponseRecordSettings shareRecord(Long shareRecord) {
        this.shareRecord = shareRecord;
        return this;
    }
    /**
     * @return shareRecord 分享云录制。 0：关闭分享 1：全部成员可查看 2：仅登录成员可查看 3：仅同企业成员可查看 4：仅参会成员可查看
     **/
    public Long getShareRecord() {
        return shareRecord;
    }

    /**
     * @param shareRecord 分享云录制。 0：关闭分享 1：全部成员可查看 2：仅登录成员可查看 3：仅同企业成员可查看 4：仅参会成员可查看
     */
    public void setShareRecord(Long shareRecord) {
        this.shareRecord = shareRecord;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingRoomsRoomConfigInfoPost200ResponseRecordSettings v1MeetingRoomsRoomConfigInfoPost200ResponseRecordSettings = (V1MeetingRoomsRoomConfigInfoPost200ResponseRecordSettings) o;
        return Objects.equals(this.downloadRecord, v1MeetingRoomsRoomConfigInfoPost200ResponseRecordSettings.downloadRecord) &&
            Objects.equals(this.shareRecord, v1MeetingRoomsRoomConfigInfoPost200ResponseRecordSettings.shareRecord);
    }

    @Override
    public int hashCode() {
        return Objects.hash(downloadRecord, shareRecord);
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
        sb.append("class V1MeetingRoomsRoomConfigInfoPost200ResponseRecordSettings {\n");
        sb.append("    downloadRecord: ").append(toIndentedString(downloadRecord)).append("\n");
        sb.append("    shareRecord: ").append(toIndentedString(shareRecord)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

