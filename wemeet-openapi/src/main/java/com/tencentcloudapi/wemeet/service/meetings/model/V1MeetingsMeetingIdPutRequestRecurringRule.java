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

package com.tencentcloudapi.wemeet.service.meetings.model;

import java.util.*;

import com.fasterxml.jackson.annotation.*;

/**
 * 周期性会议配置，meeting_type 为1时必填。
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class V1MeetingsMeetingIdPutRequestRecurringRule {
    @JsonProperty(value = "customized_recurring_days")
    private Long customizedRecurringDays;

    @JsonProperty(value = "customized_recurring_step")
    private Long customizedRecurringStep;

    @JsonProperty(value = "customized_recurring_type")
    private Long customizedRecurringType;

    @JsonProperty(value = "recurring_type")
    private Long recurringType;

    @JsonProperty(value = "sub_meeting_id")
    private String subMeetingId;

    @JsonProperty(value = "until_count")
    private Long untilCount;

    @JsonProperty(value = "until_date")
    private Long untilDate;

    @JsonProperty(value = "until_type")
    private Long untilType;

    /**
     */
    public V1MeetingsMeetingIdPutRequestRecurringRule() {
    }

    /**
     * @param customizedRecurringDays 哪些天重复。根据 customized_recurring_type 和 customized_recurring_step 的不同，该字段可取值与表达含义不同。如需选择多个日期，加和即可。 customized_recurring_type &#x3D; 0 时，传入该字段将被忽略。 详细请参见 自定义周期规则 API 调用示例
     */
    public V1MeetingsMeetingIdPutRequestRecurringRule customizedRecurringDays(Long customizedRecurringDays) {
        this.customizedRecurringDays = customizedRecurringDays;
        return this;
    }
    /**
     * @return customizedRecurringDays 哪些天重复。根据 customized_recurring_type 和 customized_recurring_step 的不同，该字段可取值与表达含义不同。如需选择多个日期，加和即可。 customized_recurring_type &#x3D; 0 时，传入该字段将被忽略。 详细请参见 自定义周期规则 API 调用示例
     **/
    public Long getCustomizedRecurringDays() {
        return customizedRecurringDays;
    }

    /**
     * @param customizedRecurringDays 哪些天重复。根据 customized_recurring_type 和 customized_recurring_step 的不同，该字段可取值与表达含义不同。如需选择多个日期，加和即可。 customized_recurring_type &#x3D; 0 时，传入该字段将被忽略。 详细请参见 自定义周期规则 API 调用示例
     */
    public void setCustomizedRecurringDays(Long customizedRecurringDays) {
        this.customizedRecurringDays = customizedRecurringDays;
    }
    /**
     * @param customizedRecurringStep 每[n]（天、周、月）重复，使用自定义周期性会议时传入。 例如：customized_recurring_type&#x3D;0 &amp;&amp; customized_recurring_step&#x3D;5 表示每5天重复一次。 customized_recurring_type&#x3D;2 &amp;&amp; customized_recurring_step&#x3D;3 表示每3个月重复一次，重复的时间依赖于 customized_recurring_days 字段。
     */
    public V1MeetingsMeetingIdPutRequestRecurringRule customizedRecurringStep(Long customizedRecurringStep) {
        this.customizedRecurringStep = customizedRecurringStep;
        return this;
    }
    /**
     * @return customizedRecurringStep 每[n]（天、周、月）重复，使用自定义周期性会议时传入。 例如：customized_recurring_type&#x3D;0 &amp;&amp; customized_recurring_step&#x3D;5 表示每5天重复一次。 customized_recurring_type&#x3D;2 &amp;&amp; customized_recurring_step&#x3D;3 表示每3个月重复一次，重复的时间依赖于 customized_recurring_days 字段。
     **/
    public Long getCustomizedRecurringStep() {
        return customizedRecurringStep;
    }

    /**
     * @param customizedRecurringStep 每[n]（天、周、月）重复，使用自定义周期性会议时传入。 例如：customized_recurring_type&#x3D;0 &amp;&amp; customized_recurring_step&#x3D;5 表示每5天重复一次。 customized_recurring_type&#x3D;2 &amp;&amp; customized_recurring_step&#x3D;3 表示每3个月重复一次，重复的时间依赖于 customized_recurring_days 字段。
     */
    public void setCustomizedRecurringStep(Long customizedRecurringStep) {
        this.customizedRecurringStep = customizedRecurringStep;
    }
    /**
     * @param customizedRecurringType 自定义周期性会议的循环类型。 0：按天。 1：按周。 2：按月，以周为粒度重复。例如：每3个月的第二周的周四。 3：按月，以日期为粒度重复。例如：每3个月的16日。 按周；按月、以周为粒度； 按月、以日期为粒度时，需要包含会议开始时间所在的日期。
     */
    public V1MeetingsMeetingIdPutRequestRecurringRule customizedRecurringType(Long customizedRecurringType) {
        this.customizedRecurringType = customizedRecurringType;
        return this;
    }
    /**
     * @return customizedRecurringType 自定义周期性会议的循环类型。 0：按天。 1：按周。 2：按月，以周为粒度重复。例如：每3个月的第二周的周四。 3：按月，以日期为粒度重复。例如：每3个月的16日。 按周；按月、以周为粒度； 按月、以日期为粒度时，需要包含会议开始时间所在的日期。
     **/
    public Long getCustomizedRecurringType() {
        return customizedRecurringType;
    }

    /**
     * @param customizedRecurringType 自定义周期性会议的循环类型。 0：按天。 1：按周。 2：按月，以周为粒度重复。例如：每3个月的第二周的周四。 3：按月，以日期为粒度重复。例如：每3个月的16日。 按周；按月、以周为粒度； 按月、以日期为粒度时，需要包含会议开始时间所在的日期。
     */
    public void setCustomizedRecurringType(Long customizedRecurringType) {
        this.customizedRecurringType = customizedRecurringType;
    }
    /**
     * @param recurringType 重复类型，默认值为0。 0：每天 1：每周一至周五 2：每周 3：每两周 4：每月 5：自定义，示例请参见 自定义周期规则 API 调用示例
     */
    public V1MeetingsMeetingIdPutRequestRecurringRule recurringType(Long recurringType) {
        this.recurringType = recurringType;
        return this;
    }
    /**
     * @return recurringType 重复类型，默认值为0。 0：每天 1：每周一至周五 2：每周 3：每两周 4：每月 5：自定义，示例请参见 自定义周期规则 API 调用示例
     **/
    public Long getRecurringType() {
        return recurringType;
    }

    /**
     * @param recurringType 重复类型，默认值为0。 0：每天 1：每周一至周五 2：每周 3：每两周 4：每月 5：自定义，示例请参见 自定义周期规则 API 调用示例
     */
    public void setRecurringType(Long recurringType) {
        this.recurringType = recurringType;
    }
    /**
     * @param subMeetingId 子会议 ID，表示修改该子会议时间，不可与周期性会议规则同时修改。 如不填写，默认修改整个周期性会议时间。
     */
    public V1MeetingsMeetingIdPutRequestRecurringRule subMeetingId(String subMeetingId) {
        this.subMeetingId = subMeetingId;
        return this;
    }
    /**
     * @return subMeetingId 子会议 ID，表示修改该子会议时间，不可与周期性会议规则同时修改。 如不填写，默认修改整个周期性会议时间。
     **/
    public String getSubMeetingId() {
        return subMeetingId;
    }

    /**
     * @param subMeetingId 子会议 ID，表示修改该子会议时间，不可与周期性会议规则同时修改。 如不填写，默认修改整个周期性会议时间。
     */
    public void setSubMeetingId(String subMeetingId) {
        this.subMeetingId = subMeetingId;
    }
    /**
     * @param untilCount 限定会议次数（1-50次）。
     */
    public V1MeetingsMeetingIdPutRequestRecurringRule untilCount(Long untilCount) {
        this.untilCount = untilCount;
        return this;
    }
    /**
     * @return untilCount 限定会议次数（1-50次）。
     **/
    public Long getUntilCount() {
        return untilCount;
    }

    /**
     * @param untilCount 限定会议次数（1-50次）。
     */
    public void setUntilCount(Long untilCount) {
        this.untilCount = untilCount;
    }
    /**
     * @param untilDate 结束日期时间戳，最大支持预定50场子会议。
     */
    public V1MeetingsMeetingIdPutRequestRecurringRule untilDate(Long untilDate) {
        this.untilDate = untilDate;
        return this;
    }
    /**
     * @return untilDate 结束日期时间戳，最大支持预定50场子会议。
     **/
    public Long getUntilDate() {
        return untilDate;
    }

    /**
     * @param untilDate 结束日期时间戳，最大支持预定50场子会议。
     */
    public void setUntilDate(Long untilDate) {
        this.untilDate = untilDate;
    }
    /**
     * @param untilType 结束重复类型。 0：按日期结束重复 1：按次数结束重复
     */
    public V1MeetingsMeetingIdPutRequestRecurringRule untilType(Long untilType) {
        this.untilType = untilType;
        return this;
    }
    /**
     * @return untilType 结束重复类型。 0：按日期结束重复 1：按次数结束重复
     **/
    public Long getUntilType() {
        return untilType;
    }

    /**
     * @param untilType 结束重复类型。 0：按日期结束重复 1：按次数结束重复
     */
    public void setUntilType(Long untilType) {
        this.untilType = untilType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V1MeetingsMeetingIdPutRequestRecurringRule v1MeetingsMeetingIdPutRequestRecurringRule = (V1MeetingsMeetingIdPutRequestRecurringRule) o;
        return Objects.equals(this.customizedRecurringDays, v1MeetingsMeetingIdPutRequestRecurringRule.customizedRecurringDays) &&
            Objects.equals(this.customizedRecurringStep, v1MeetingsMeetingIdPutRequestRecurringRule.customizedRecurringStep) &&
            Objects.equals(this.customizedRecurringType, v1MeetingsMeetingIdPutRequestRecurringRule.customizedRecurringType) &&
            Objects.equals(this.recurringType, v1MeetingsMeetingIdPutRequestRecurringRule.recurringType) &&
            Objects.equals(this.subMeetingId, v1MeetingsMeetingIdPutRequestRecurringRule.subMeetingId) &&
            Objects.equals(this.untilCount, v1MeetingsMeetingIdPutRequestRecurringRule.untilCount) &&
            Objects.equals(this.untilDate, v1MeetingsMeetingIdPutRequestRecurringRule.untilDate) &&
            Objects.equals(this.untilType, v1MeetingsMeetingIdPutRequestRecurringRule.untilType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customizedRecurringDays, customizedRecurringStep, customizedRecurringType, recurringType, subMeetingId, untilCount, untilDate, untilType);
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
        sb.append("class V1MeetingsMeetingIdPutRequestRecurringRule {\n");
        sb.append("    customizedRecurringDays: ").append(toIndentedString(customizedRecurringDays)).append("\n");
        sb.append("    customizedRecurringStep: ").append(toIndentedString(customizedRecurringStep)).append("\n");
        sb.append("    customizedRecurringType: ").append(toIndentedString(customizedRecurringType)).append("\n");
        sb.append("    recurringType: ").append(toIndentedString(recurringType)).append("\n");
        sb.append("    subMeetingId: ").append(toIndentedString(subMeetingId)).append("\n");
        sb.append("    untilCount: ").append(toIndentedString(untilCount)).append("\n");
        sb.append("    untilDate: ").append(toIndentedString(untilDate)).append("\n");
        sb.append("    untilType: ").append(toIndentedString(untilType)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

