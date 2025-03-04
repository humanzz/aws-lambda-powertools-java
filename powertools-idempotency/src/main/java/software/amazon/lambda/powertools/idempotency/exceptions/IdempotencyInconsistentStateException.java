/*
 * Copyright 2022 Amazon.com, Inc. or its affiliates.
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package software.amazon.lambda.powertools.idempotency.exceptions;

/**
 * IdempotencyInconsistentStateException can happen under rare but expected cases
 * when persistent state changes in the small-time between put &amp; get requests.
 */
public class IdempotencyInconsistentStateException extends RuntimeException {
    private static final long serialVersionUID = -4293951999802300672L;

    public IdempotencyInconsistentStateException(String msg, Exception e) {
        super(msg, e);
    }

    public IdempotencyInconsistentStateException(String msg) {
        super(msg);
    }
}
