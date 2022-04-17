enum class PostType {
 AUDIO, VIDEO
}


fun main() {

val wallService = WallService()

 wallService.add(Post(
  1u,
  123456u,
  121212u,
  987654u,
 11122022u,
 "Мой первый пост",
  323232,
  111111,
 0,
" ",
"post",
 22,
  canPin = true,
 canDelete = true,
 canEdit = true,
 1,
 markedAsAds = true,
  isFavorite = true,
0
 ))
 println(wallService)


}

