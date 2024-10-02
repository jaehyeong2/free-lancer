package jjfactory.freelancer.infrastructure.freelancer

import jjfactory.freelancer.domain.freelancer.FreeLancer
import org.springframework.data.jpa.repository.JpaRepository

interface FreeLancerRepository: JpaRepository<FreeLancer, Long> {
}