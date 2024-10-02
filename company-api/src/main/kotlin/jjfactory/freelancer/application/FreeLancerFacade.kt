package jjfactory.freelancer.application

import jjfactory.freelancer.domain.freelancer.FreeLancerService
import org.springframework.stereotype.Component

@Component
class FreeLancerFacade(
    private val freeLancerService: FreeLancerService
) {
}