/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.pulsar.transaction.coordinator.exceptions;

import org.apache.pulsar.transaction.coordinator.TransactionCoordinatorID;

/**
 * The base exception for exceptions thrown from coordinator.
 */
public abstract class CoordinatorException extends Exception {
    private static final long serialVersionUID = 0L;

    public CoordinatorException(String message) {
        super(message);
    }

    public CoordinatorException(String message, Throwable cause) {
        super(message, cause);
    }

    public CoordinatorException(Throwable cause) {
        super(cause);
    }

    /**
     * Transaction coordinator not found exception.
     */
    public static class NotFoundException extends CoordinatorException {

        public NotFoundException(TransactionCoordinatorID tcId) {
            super(String.format("Transaction coordinator with id %s not found!", tcId.getId()));
        }

        public NotFoundException(String message) {
            super(message);
        }

        public NotFoundException(String message, Throwable cause) {
            super(message, cause);
        }

        public NotFoundException(Throwable cause) {
            super(cause);
        }
    }
}
