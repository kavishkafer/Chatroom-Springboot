package com.example.chatApp.config.chat;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatMessage {
    private String content;
    private String sender;
    private MessageType type;

    public int getSenderId() {
        return 0;
    }

    public int getReceiverId() {
        return 0;
    }

    public String getTime() {
        return null;
    }

    public String getDate() {
        return null;
    }


    public enum MessageType {
        CHAT, JOIN, LEAVE
    }

//    public ChatMessage() {
//    }

//    public ChatMessage(String content, String sender, MessageType type) {
//        this.content = content;
//        this.sender = sender;
//        this.type = type;
//    }

    // Getters and Setters (Omitted for brevity)
}
