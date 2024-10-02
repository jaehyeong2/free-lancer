package jjfactory.freelancer.domain.freelancer

class FreeLancerCommand {
    data class Create(
        val lastName: String,
        val firstName: String,
    ){
        fun toEntity(): FreeLancer {
            return FreeLancer(
                lastName = lastName,
                firstName = firstName
            )
        }
    }
}