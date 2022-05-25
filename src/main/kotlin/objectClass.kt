class likes(
    val count: Int,                     // число пользователей, которым понравилась запись
    val userLikes: Boolean,             // наличие отметки "Мне нравится" у текущего пользователя
    val canLike: Boolean,               //инф. о том может ли текущий пользователь поставить отметку "Мне нравиться"
    val canPublish: Boolean             //может ли тек. пользователь сделать репост
)

class reposts(
    val count: Int,                     // число пользов. скопировавших запись
    val userReposted: Boolean           // наличие репоста у тек. пользов
)

class views(
    val count: Int                      // число просмотров записи
)

//class donut(
//    val is_donut: Boolean,              //
//    val paid_duration: Int,
//    val placeholder: object : ArraysUtilJVM {
//
//}
//    val can_publish_free_copy: Boolean,
//    val edit_mode: String,
    //val all // todo
    //val duration // todo


