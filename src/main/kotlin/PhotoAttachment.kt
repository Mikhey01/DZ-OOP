data class PhotoAttachment(
    override val type: String = "PHOTO",
val photo: Photo = Photo()
): Attachment
