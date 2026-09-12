package dasturlash.uz.service;

import dasturlash.uz.dto.chat.ChatMessageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;


@Service
public class ChatSocketService {
    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    public void sendChatUpdateToUser(String email, ChatMessageDTO dto) {
        messagingTemplate.convertAndSendToUser(email, "/queue/getChatUpdate/", dto);
    }


}
