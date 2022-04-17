import java.sql.RowId

data class AudioAttachment(
    override val type: String = "AUDIO",
    val audio: Audio = Audio()
) : Attachment {



}





