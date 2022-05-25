import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {



    @Test
    fun createComment() {
    }

    @Test(expected = PostNotFoundException::class)

    fun shouldThrow() {
        WallService.createComment(comment =  Comment(
                2,
        888,
        2223434,
        324234234,
        "text comment one",
        null,
        arrayOf(),
        null,

        ))
        
    }

}