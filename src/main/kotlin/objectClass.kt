class comments(
    val count: Int,                     //количество комментариев
    val canPost: Boolean,              //информация о том, может ли текущий пользователь комментировать запись (1 — может, 0 — не может);
    val groupsCanPost: Boolean,         //информация о том, могут ли сообщества комментировать запись;
    val canClose: Boolean,              //может ли текущий пользователь закрыть комментарии к записи;
    val canOpen: Boolean                //может ли текущий пользователь открыть комментарии к записи.
)

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


