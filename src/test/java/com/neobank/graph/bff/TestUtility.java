package com.neobank.graph.bff;

import com.neobank.graph.bff.model.Address;
import com.neobank.graph.bff.model.Profile;
import com.neobank.graph.bff.model.ProfileInput;
import com.neobank.graph.bff.model.enums.CommunicationChannel;
import com.neobank.graph.bff.model.enums.Gender;
import com.neobank.graph.bff.model.enums.MaritalStatus;
import org.junit.jupiter.api.Disabled;

@Disabled
public class TestUtility {
    public static Profile getSampleProfile() {
        return getSampleProfile("user-id" );
    }

    public static Profile getSampleProfile(String id) {
        return new Profile(id,
                "Joel",
                "John",
                "1978-09-08",
                new Address("12345",
                        "67",
                        "Riyadh",
                        "12212",
                        "Kingdom of Saudi Arabia"
                ),
                Gender.Male,
                MaritalStatus.Married,
                CommunicationChannel.Phone
        );
    }

    public static Profile getSampleProfile(String id, ProfileInput profileInput) {
        return new Profile(id,
                profileInput.getFirstName(),
                profileInput.getLastName(),
                profileInput.getDateOfBirth(), profileInput.getAddress(), profileInput.getGender(),
                profileInput.getMaritalStatus(), profileInput.getPreferredCommunicationChannel());
    }

    public static ProfileInput getSampleProfileUpdateInput() {
        return new ProfileInput(
                "Joel",
                "John",
                "1978-09-08",
                new Address("12345",
                        "67",
                        "Riyadh",
                        "12212",
                        "Kingdom of Saudi Arabia"
                ),
                Gender.Male,
                MaritalStatus.Married,
                CommunicationChannel.Phone
        );
    }
}

