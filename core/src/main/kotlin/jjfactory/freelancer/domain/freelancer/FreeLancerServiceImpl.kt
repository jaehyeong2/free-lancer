package jjfactory.freelancer.domain.freelancer

import jjfactory.freelancer.infrastructure.freelancer.FreeLancerRepository
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@Component
class FreeLancerServiceImpl(
    private val freeLancerReader: FreeLancerReader,
    private val freeLancerRepository: FreeLancerRepository
) : FreeLancerService {

    @Transactional
    override fun store(command: FreeLancerCommand.Create): Long {
        val initFreeLancer = command.toEntity()
        return freeLancerRepository.save(initFreeLancer).id!!
    }

    override fun getById(id: Long): FreeLancerInfo.Detail {
        return freeLancerReader.findByIdOrThrow(id).let {
            FreeLancerInfo.Detail(
                lastName = it.lastName,
                firstName = it.firstName,
                createdAt = it.createdAt!!
            )
        }

    }
}