package jp.ac.it_college_std.s23027.messageboard.application.service

import jp.ac.it_college_std.s23027.messageboard.domain.repository.ThreadsRepository
import jp.ac.it_college_std.s23027.messageboard.domain.model.Threads
import org.springframework.stereotype.Service

@Service
class ThreadsService (
    private val threadsRepository: ThreadsRepository
){
    fun createThread(thread: Threads): Threads{
        return threadsRepository.createThread(thread)
    }
}