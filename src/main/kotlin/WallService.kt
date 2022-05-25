object WallService {

    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()

    fun add(post: Post): Post {
        if (posts.isEmpty()) {
            post.id = 1
        } else {
            post.id = posts.last().id+1
        }
        posts += post
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for ((index, updatePost) in posts.withIndex()) {
            if (updatePost.id == post.id) {
                posts[index] = post.copy(
                    ownerId = post.ownerId,
                    date = post.date)
            }
        }
        return true
    }


    fun print() {
        for (post in posts) {
            println(post.text)
            println(post.id)

        }
    }

    fun createComment(comment: Comment): Boolean {
        for (post in posts) {
            if (comment.postId == post.id) {
                comments += comment
                return true
            }
        }
        throw PostNotFoundException("Пост для комментария не найден")
    }

    fun printComment() {
        for (comment in comments) {
            println(comment.text)
        }
    }
}




