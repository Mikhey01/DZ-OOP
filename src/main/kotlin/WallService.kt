class WallService {

    private var posts = emptyArray<Post>()
    private var idNumber: UInt = 1u

    fun add(post: Post): Post {
        posts += post
        idNumber += post.id
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for ((index, post) in posts.withIndex()) {
            if (post.id == idNumber) {
                posts[index] = post.copy(
                    id = post.id,
                    ownerId = post.ownerId,
                    date = post.date,
                    text = post.text
                )
            }
        }
        return true
    }
}

