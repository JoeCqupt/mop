/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.streamnative.pulsar.handlers.mqtt.support.event;

public class DisableEventCenter implements PulsarEventCenter {
    @Override
    public void register(PulsarEventListener listener) {
        throw new UnsupportedOperationException("Unsupported operation.");
    }

    @Override
    public void unRegister(PulsarEventListener listener) {
        throw new UnsupportedOperationException("Unsupported operation.");
    }

    @Override
    public void shutdown() {
        throw new UnsupportedOperationException("Unsupported operation.");
    }
}
