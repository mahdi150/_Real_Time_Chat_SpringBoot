package com.chatApp.realTimeChatApp.Model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatMessage {
    private String content;
    private String sender;
    private MessageType type;

    /**
     * Enum representing the type of message.
     */
    public enum MessageType {
        CHAT, LEAVE, JOIN
    }
}
