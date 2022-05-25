fun main() {

val postOne = Post(
  0,
  123456u,
  121212u,
  987654u,
 11122022u,
 "Мой первый пост",
  323232,
  111111,
 0,
" ",
"post",
 22,
  canPin = true,
 canDelete = true,
 canEdit = true,
 1,
 markedAsAds = true,
  isFavorite = true,
0
 )

    val postTwo = Post(
        0,
        123984u,
        1265412u,
        9889554u,
        12122022u,
        "Мой второй пост",
        328232,
        111811,
        1,
        " ",
        "post",
        222,
        canPin = true,
        canDelete = true,
        canEdit = true,
        1,
        markedAsAds = true,
        isFavorite = true,
        0
    )
 WallService.add(postOne)
    WallService.add(postTwo)
 WallService.print()



    val photoAttachment = 0
    val commentOne = Comment(
        0,
        20,
        2223434,
        324234234,
        "text comment one",
        null,
        arrayOf(photoAttachment),
        null,

    )

    try {
        WallService.createComment(commentOne)
        WallService.printComment()
    } catch (e: PostNotFoundException){
        println(e.message)
    }


}

