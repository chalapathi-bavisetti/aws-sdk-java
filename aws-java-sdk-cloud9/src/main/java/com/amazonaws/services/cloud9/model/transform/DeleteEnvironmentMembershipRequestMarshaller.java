/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.cloud9.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cloud9.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DeleteEnvironmentMembershipRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DeleteEnvironmentMembershipRequestMarshaller {

    private static final MarshallingInfo<String> ENVIRONMENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("environmentId").build();
    private static final MarshallingInfo<String> USERARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("userArn").build();

    private static final DeleteEnvironmentMembershipRequestMarshaller instance = new DeleteEnvironmentMembershipRequestMarshaller();

    public static DeleteEnvironmentMembershipRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DeleteEnvironmentMembershipRequest deleteEnvironmentMembershipRequest, ProtocolMarshaller protocolMarshaller) {

        if (deleteEnvironmentMembershipRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(deleteEnvironmentMembershipRequest.getEnvironmentId(), ENVIRONMENTID_BINDING);
            protocolMarshaller.marshall(deleteEnvironmentMembershipRequest.getUserArn(), USERARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}