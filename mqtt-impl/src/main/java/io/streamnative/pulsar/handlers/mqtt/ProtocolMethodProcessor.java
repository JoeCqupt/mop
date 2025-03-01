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
package io.streamnative.pulsar.handlers.mqtt;

import io.netty.handler.codec.mqtt.MqttConnectMessage;
import io.netty.handler.codec.mqtt.MqttMessage;
import io.netty.handler.codec.mqtt.MqttPubAckMessage;
import io.netty.handler.codec.mqtt.MqttPublishMessage;
import io.netty.handler.codec.mqtt.MqttSubscribeMessage;
import io.netty.handler.codec.mqtt.MqttUnsubscribeMessage;

/**
 * Interface for MQTT protocol method processor.
 */
public interface ProtocolMethodProcessor {

    void processConnect(MqttConnectMessage msg);

    void processPubAck(MqttPubAckMessage msg);

    void processPublish(MqttPublishMessage msg);

    void processPubRel(MqttMessage msg);

    void processPubRec(MqttMessage msg);

    void processPubComp(MqttMessage msg);

    void processDisconnect(MqttMessage msg);

    void processConnectionLost();

    void processSubscribe(MqttSubscribeMessage msg);

    void processUnSubscribe(MqttUnsubscribeMessage msg);

    void processPingReq();
}
