package com.neobank.graph.bff.resolver;

import com.neobank.graph.bff.model.Profile;
import com.neobank.graph.bff.model.ProfileInput;
import com.neobank.graph.bff.service.ProfileService;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.InputArgument;
import lombok.AllArgsConstructor;

@DgsComponent
@AllArgsConstructor
public class ProfileDataUpdater {
    private final ProfileService service;

    @DgsData(parentType = "Mutation", field = "updateProfile")
    public Profile updateProfile(@InputArgument("profileId") String profileId,
                                 @InputArgument("profileInput") ProfileInput profileInput) {
        return service.updateProfile(profileId, profileInput);
    }

    @DgsData(parentType = "Mutation", field = "createProfile")
    public Profile createProfile(@InputArgument("profileInput") ProfileInput profileInput) {
        return service.createProfile(profileInput);
    }
}