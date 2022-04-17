data class LinkAttachment (
    override val type: String = "LINK",
    val link: Link = Link()
        ): Attachment