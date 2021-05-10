package bd_json

data class Result(
    val ClickUrl: String,
    val FileFormat: String,
    val FileSize: Int,
    val Height: String,
    val RefererUrl: String,
    val Summary: String,
    val Thumbnail: Thumbnail,
    val Title: String,
    val Url: String,
    val Width: String
)
