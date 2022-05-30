data class Comment(
    var id: Long, // Идентификатор комментария
    //val postId: Long, // идентификатор поста
    val fromId: Int, // Идентификатор автора комментария
    val date: Int, // Дата создания комментария в формате Unixtime
    val text: String, // Текст комментария
    //val donut : Donut?, //  Информация о VK Donut
    val attachments: Array<Attachment>? = emptyArray(), // Медиавложения комментария (фотографии, ссылки и т.п.)
    val parentsStack: Array<Int>? = emptyArray(), // Массив идентификаторов родительских комментариев
    val thread: Thread?
)