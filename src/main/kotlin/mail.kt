fun main() {

    val wallService = WallService()

    wallService.add(Post(0, 321654, 12112022, "Добрый день"))
    wallService.add(Post(0, 654987, 12112022, "Добрый вечер"))
    wallService.add(Post(0, 123698, 12112022, "Доброй ночи"))

    wallService.update(Post(2, 321654, 12112022, "Доброй всем ночи"))
    wallService.print()


val photoAttachment = 0

        try {
    wallService.createComment( postId = 4, Comment(
        0,  223434, 324234234, "text comment one", null,
        arrayOf(photoAttachment), null
    ))
    wallService.printComment()
} catch (e: PostNotFoundException){
    println(e.message)
}


}

