data class VideoAttachment(
    override val type: String = "VIDEO",
val video: Video = Video()
) : Attachment