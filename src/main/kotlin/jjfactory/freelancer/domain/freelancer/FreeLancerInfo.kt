package jjfactory.freelancer.domain.freelancer

import java.time.LocalDateTime

class FreeLancerInfo {
    data class Detail(
        val lastName: String,
        val firstName: String,
        val createdAt: LocalDateTime
    )
}