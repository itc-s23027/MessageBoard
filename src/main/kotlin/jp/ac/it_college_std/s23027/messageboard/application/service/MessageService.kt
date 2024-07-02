package jp.ac.it_college_std.s23027.messageboard.application.service

import jp.ac.it_college_std.s23027.messageboard.domain.model.Messages
import jp.ac.it_college_std.s23027.messageboard.domain.repository.MessageRepository
import org.springframework.stereotype.Service

@Service
class MessageService (
    private val messageRepository: MessageRepository
) {
    fun createMassages(message: Messages): Messages {
        return messageRepository.createMessage(message)
    }
}