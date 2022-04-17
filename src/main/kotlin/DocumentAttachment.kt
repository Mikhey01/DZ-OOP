data class DocumentAttachment(
    override val type: String = "DOCUMENT",
    val document: Document = Document()
): Attachment
