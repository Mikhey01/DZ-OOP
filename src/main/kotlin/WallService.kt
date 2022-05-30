class WallService {

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
                return true
            }
        }
        return false
    }


    fun print() {
        for (post in posts) {
            println(post.text)
            println(post.id)

        }
    }

    fun createComment(postId: Long, comment: Comment): Comment {
        for (post in posts) {
            if (postId == post.id) {
                if (comments.isEmpty()) {
                    comment.id = 1
                } else {
                    comment.id = comments.last().id+1
                }
                comments += comment
                return comments.last()
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




