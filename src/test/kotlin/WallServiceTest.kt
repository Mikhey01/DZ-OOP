import junit.framework.Assert
import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add() {
        val wallService = WallService()

        val post = wallService.add(Post(0, 321654, 12112022, "Добрый день"))

        var result = false

        if (post.id > 0) {
            result = true
        }

        assertEquals(true, result)
    }

    @Test
    fun update() {
        // создаём целевой сервис
        val wallservice = WallService()
        // заполняем несколькими постами
        wallservice.add(Post(0, 321654, 12112022, "Добрый день"))
        wallservice.add(Post(0, 654987, 12112022, "Добрый вечер"))
        wallservice.add(Post(0, 123698, 12112022, "Доброй ночи"))
        // создаём информацию об обновлении
        val updateTestPost = Post(1, 321654, 12112022, "Доброй всем ночи")

        // выполняем целевое действие
        val result = wallservice.update(updateTestPost)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertTrue(result)
    }

//    @Test
//    fun updateExistingNew() {
//        // создаём целевой сервис
//        val service = WallService()
//        // заполняем несколькими постами
//        service.add(Post(0, 321654, 12112022, "Добрый день"))
//        service.add(Post(0, 654987, 12112022, "Добрый вечер"))
//        service.add(Post(0, 123698, 12112022, "Доброй ночи"))
//        // создаём информацию об обновлении
//        val updateTestPost = Post(4, 321654, 12112022, "Доброй всем ночи")
//
//        // выполняем целевое действие
//        val result = service.update(updateTestPost)
//
//        // проверяем результат (используйте assertTrue или assertFalse)
//        assertTrue(result)
//    }

    @Test
    fun createCommentTest() {
        val service = WallService()
        val photoAttachment = 0
        // заполняем несколькими постами
        service.add(Post(0, 321654, 12112022, "Добрый день"))
        service.add(Post(0, 654987, 12112022, "Добрый вечер"))
        service.add(Post(0, 123698, 12112022, "Доброй ночи"))
        // создаём комментарий
        val comment = service.createComment(postId = 2, Comment(0,3,2223434,"text comment one",null,
            arrayOf(photoAttachment),null))
        var result = false
        if (comment.id > 0 ) {
            result = true
        }

            assertEquals(true, result)

    }

    @Test(expected = PostNotFoundException::class)

    fun shouldThrow() {
        val service = WallService()

        service.add(Post(0, 321654, 12112022, "Добрый день"))
        service.createComment(postId = 11, Comment(
                2,
        223434,
        324234234,
        "text comment one",
        null,
        arrayOf(),
        null,

        ))

    }

}