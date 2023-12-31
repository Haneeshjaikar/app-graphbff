package com.neobank.graph.bff.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.neobank.graph.bff.model.enums.CommunicationChannel;
import com.neobank.graph.bff.model.enums.Gender;
import com.neobank.graph.bff.model.enums.MaritalStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(value = PropertyNamingStrategies.UpperCamelCaseStrategy.class)
public class Profile {
    private String id;

    private String firstName;

    private String lastName;

    private String dateOfBirth;

    private Address address;

    private Gender gender;

    private MaritalStatus maritalStatus;

    private CommunicationChannel preferredCommunicationChannel;
}