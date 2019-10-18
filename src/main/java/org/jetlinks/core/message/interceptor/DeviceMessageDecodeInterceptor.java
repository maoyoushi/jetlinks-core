package org.jetlinks.core.message.interceptor;

import org.jetlinks.core.message.DeviceMessage;
import org.jetlinks.core.message.codec.MessageDecodeContext;
import org.jetlinks.core.message.codec.Transport;
import reactor.core.publisher.Mono;

/**
 * 设备消息解码拦截器
 * @see org.jetlinks.core.message.codec.DeviceMessageCodec#decode(Transport, MessageDecodeContext)
 * @see MessageDecodeContext
 *
 */
public interface DeviceMessageDecodeInterceptor extends DeviceMessageCodecInterceptor {

    /**
     * 解码前执行
     *
     * @param context
     */
    void preDecode(MessageDecodeContext context);

    /**
     * 解码后执行
     *
     * @param context       消息上下文
     * @param deviceMessage 解码后的设备消息
     * @return 新的设备消息
     */
    Mono<DeviceMessage> postDecode(MessageDecodeContext context, DeviceMessage deviceMessage);

}
