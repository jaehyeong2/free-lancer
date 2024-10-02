package jjfactory.freelancer.domain.freelancer

interface FreeLancerService {
    fun store(command: FreeLancerCommand.Create): Long
    fun getById(id: Long): FreeLancerInfo.Detail
}