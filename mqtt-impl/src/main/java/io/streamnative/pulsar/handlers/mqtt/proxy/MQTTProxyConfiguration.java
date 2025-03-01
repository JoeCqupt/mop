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
package io.streamnative.pulsar.handlers.mqtt.proxy;

import io.streamnative.pulsar.handlers.mqtt.MQTTCommonConfiguration;
import lombok.Getter;
import lombok.Setter;
import org.apache.pulsar.common.configuration.Category;
import org.apache.pulsar.common.configuration.FieldContext;

/**
 * Configuration for MQTT proxy service.
 */
@Getter
@Setter
public class MQTTProxyConfiguration extends MQTTCommonConfiguration {

    @Category
    private static final String CATEGORY_BROKER_DISCOVERY = "Broker Discovery";

    @FieldContext(
            category = CATEGORY_BROKER_DISCOVERY,
            doc = "The service url points to the broker cluster"
    )
    private String brokerServiceURL;

    @FieldContext(
            category = CATEGORY_MQTT_PROXY,
            doc = "Maximum number of lookup requests allowed on "
                    + "each broker connection to prevent overloading a broker."
    )
    private int maxLookupRequest = 50000;

    @FieldContext(
            category = CATEGORY_MQTT_PROXY,
            doc = "The number of concurrent lookup requests that can be sent on each broker connection. "
                    + "Setting a maximum prevents overloading a broker."
    )
    private int concurrentLookupRequest = 5000;

    @FieldContext(
            category = CATEGORY_MQTT_PROXY,
            doc = "Enable system event service."
    )
    private boolean systemEventEnabled = false;

}
