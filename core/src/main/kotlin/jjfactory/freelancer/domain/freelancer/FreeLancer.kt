package jjfactory.freelancer.domain.freelancer

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime

@Entity
class FreeLancer(
    val lastName: String,
    val firstName: String,
) {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null

    @CreationTimestamp
    var createdAt: LocalDateTime? = null
    @UpdateTimestamp
    var updatedAt: LocalDateTime? = null

    var isExposed: Boolean = false
    var exposedAt: LocalDateTime? = null

    fun exposeProfile(){
        isExposed = true
        exposedAt = LocalDateTime.now()
    }

    fun getKoreanFullName(): String {
        return lastName + firstName
    }
}