package jjfactory.freelancer.infrastructure.freelancer

import jjfactory.freelancer.domain.freelancer.FreeLancer
import jjfactory.freelancer.domain.freelancer.FreeLancerNotExistException
import jjfactory.freelancer.domain.freelancer.FreeLancerReader
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class FreeLancerReaderImpl(
    private val freeLancerRepository: FreeLancerRepository
) : FreeLancerReader {
    override fun findById(id: Long): FreeLancer? {
        return freeLancerRepository.findByIdOrNull(id)
    }

    override fun findByIdOrThrow(id: Long): FreeLancer {
        return freeLancerRepository.findByIdOrNull(id) ?: throw FreeLancerNotExistException()
    }
}