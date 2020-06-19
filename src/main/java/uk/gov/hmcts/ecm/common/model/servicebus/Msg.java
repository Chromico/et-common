package uk.gov.hmcts.ecm.common.model.servicebus;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@JsonIgnoreProperties(ignoreUnknown = true)
public class Msg {

    @JsonProperty("id")
    String msgId;

    @JsonProperty("jurisdiction")
    String jurisdiction;

    @JsonProperty("caseTypeId")
    String caseTypeId;

    @JsonProperty("multipleRef")
    String multipleRef;

    @JsonProperty("totalCases")
    String totalCases;

    @JsonProperty("username")
    String username;

    @JsonProperty("updateType")
    String updateType;

    @JsonProperty("updateData")
    UpdateData updateData;

}
