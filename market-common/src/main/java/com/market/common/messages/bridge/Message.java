package com.market.common.messages.bridge;

import com.market.common.def.MessageType;
import io.vertx.core.json.JsonObject;
import lombok.Data;

/**
 * @author yjt
 * @since 2020/10/11 12:34
 */
@Data
public class Message<T> {
    public static final String TYPE = "type";

    /**
     * 消息类型
     */
    private MessageType type;

    /**
     * 发送时间
     */
    private Long ts;

    /**
     * 消息内容
     */
    private T data;

    public static MessageType getTypeFromJson(JsonObject json) {
        if (json == null) {
            return null;
        }
        return MessageType.ofName(json.getString("type"));
    }
}
