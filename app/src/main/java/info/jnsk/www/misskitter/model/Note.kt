package info.jnsk.www.misskitter.model

data class Note(val createdAt: String,
                val userId: String,
                val id: String,
                val text: String,
                val user: User)