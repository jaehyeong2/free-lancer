package jjfactory.freelancer.application

import jjfactory.freelancer.domain.freelancer.FreeLancerCommand
import jjfactory.freelancer.domain.freelancer.FreeLancerService
import org.springframework.stereotype.Component

@Component
class FreeLancerFacade(
    private val freeLancerService: FreeLancerService
) {
    fun join(command: FreeLancerCommand.Create){
        freeLancerService.store(command)
    }
}