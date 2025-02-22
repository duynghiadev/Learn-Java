package com.agu.findthewayjpa.services;

import com.agu.findthewayjpa.dtos.MessageDto;
import com.agu.findthewayjpa.dtos.MessageSendDto;
import com.agu.findthewayjpa.entities.Message;
import com.agu.findthewayjpa.entities.User;
import com.agu.findthewayjpa.exceptions.NotFoundException;
import com.agu.findthewayjpa.repositories.MessageRepository;
import com.agu.findthewayjpa.repositories.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.util.HtmlUtils;

import java.util.List;


@Service
public class MessageService {
    @Autowired
    private MessageRepository messageRepository;
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private UserRepository userRepository;

    public List<MessageDto> getMessages(String senderUsername, String recipientUsername){
        List<Message> messagesDb = messageRepository.getMessages();

        return messagesDb.stream().map((msg) -> {
            String content = HtmlUtils.htmlUnescape(msg.getContent());
            msg.setContent(content);
            return modelMapper.map(msg, MessageDto.class);
        }).toList();
    }

    public MessageDto addMessage(MessageSendDto msg, String senderUsername){
        User recipientUser = userRepository.findByUsername(msg.getRecipientUsername())
                .orElseThrow(() -> new NotFoundException("Recipient Username not found: " + msg.getRecipientUsername()));

        User senderUser = userRepository.findByUsername(senderUsername)
                .orElseThrow(() -> new NotFoundException("Sender username not found: " + senderUsername));


        Message message = new Message();
        message.setSenderUsername(senderUsername);
        message.setContent(HtmlUtils.htmlEscape(msg.getContent()));

        Message dataReturn = messageRepository.save(message);
        String content = HtmlUtils.htmlUnescape(msg.getContent());
        dataReturn.setContent(content);
        return modelMapper.map(dataReturn, MessageDto.class);
    }
}
