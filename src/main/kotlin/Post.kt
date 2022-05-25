data class Post(

    var id: Int = 1,                    //Идентификатор записи.
    val ownerId: UInt,               //Идентификатор владельца стены, на которой размещена запись.
    val fromId: UInt,                //Идентификатор автора записи (от чьего имени опубликована запись)
    val createdBy: UInt,             //Идентификатор администратора, который опубликовал запись (возвращается только для сообществ при запросе с ключом доступа администратора). Возвращается в записях, опубликованных менее 24 часов назад.
    val date: UInt,                  //Время публикации записи в формате unixtime
    val text: String?,               //Текст записи.,
    val replyOwnerId: Int,           //Идентификатор владельца записи, в ответ на которую была оставлена текущая.
    val replyPostId: Int,            //Идентификатор записи, в ответ на которую была оставлена текущая.
    val friendsOnly: Int,               //1, если запись была создана с опцией «Только для друзей»
    val copyright: String?,              // источник материала
    val postType: String?,              // должна принимать post, copy, reply, postpone, suggest
    val signerId: Int,                  //идентификатор автора, ести запись была опубликована от имени сообщества и подписана пользователем
    val canPin: Boolean,                //может ли текущий пользователь закрепить запись
    val canDelete: Boolean,             //может ли текущий пользователь удалить запись
    val canEdit: Boolean,               //может ли текущий пользователь редактировать запись
    val isPinned: Int?,                  //о том что запись закреплена
    val markedAsAds: Boolean,           // от том, содержит ли запись отметку реклама
    val isFavorite: Boolean,            //true, если объект добавлен в закладки у текущего пользователя
    val postponedId: Int?                //идентификатор отложенной записи, возвращается тогда если запись стояла на таймере
)





