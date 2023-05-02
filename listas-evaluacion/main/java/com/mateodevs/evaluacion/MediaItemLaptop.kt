package com.mateodevs.evaluacion
data class MediaItemLaptop(
    val id: Int,
    val title: String,
    val ImageLaptop: Int
)
val ImageList: List<Int> = listOf(
    R.drawable.laptop1,
    R.drawable.laptop2,
    R.drawable.laptop3,
    R.drawable.laptop4)

val TitleList: List<String> = listOf(
     "Lenovo",
     "Hp",
     "Dell",
     "Acer")

fun getMedia()=(1..4).map{
    MediaItemLaptop(
        id=it,
        title = TitleList[it-1],
        ImageLaptop = ImageList[it-1]
    )
}
