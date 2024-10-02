package jjfactory.freelancer.domain.freelancer

import jjfactory.freelancer.domain.freelancer.FreeLancer

interface FreeLancerReader {
    fun findById(id: Long): FreeLancer?
    fun findByIdOrThrow(id: Long): FreeLancer
}