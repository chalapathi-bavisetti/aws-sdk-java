/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License is
 * located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.codedeploy.model.transform;

import java.util.Map;
import java.util.Map.Entry;
import java.math.*;
import java.nio.ByteBuffer;

import com.amazonaws.services.codedeploy.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RollbackInfo JSON Unmarshaller
 */
public class RollbackInfoJsonUnmarshaller implements
        Unmarshaller<RollbackInfo, JsonUnmarshallerContext> {

    public RollbackInfo unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        RollbackInfo rollbackInfo = new RollbackInfo();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL)
            return null;

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("rollbackDeploymentId", targetDepth)) {
                    context.nextToken();
                    rollbackInfo.setRollbackDeploymentId(context
                            .getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("rollbackTriggeringDeploymentId",
                        targetDepth)) {
                    context.nextToken();
                    rollbackInfo.setRollbackTriggeringDeploymentId(context
                            .getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("rollbackMessage", targetDepth)) {
                    context.nextToken();
                    rollbackInfo.setRollbackMessage(context.getUnmarshaller(
                            String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null
                        || context.getLastParsedParentElement().equals(
                                currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return rollbackInfo;
    }

    private static RollbackInfoJsonUnmarshaller instance;

    public static RollbackInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RollbackInfoJsonUnmarshaller();
        return instance;
    }
}