package com.agu.findthewayjpa.dtos;


import com.agu.findthewayjpa.config.LocalDateTimeDeserializer;
import com.agu.findthewayjpa.config.LocalDateTimeSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MessageDto {
    private Long id;
    private String senderUsername;
    private String recipientUsername;
    private String content;
    private UserDto senderUser;
    private UserDto recipientUser;

    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private Instant createdDate;
}