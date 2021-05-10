package bd_json

data class ResultSet(
    val Result: List<Result>,
    val firstResultPosition: Int,
    val totalResultsAvailable: String,
    val totalResultsReturned: Int
)