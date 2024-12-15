sealed class NetworkResponse {
    data class Success(val data: String) : NetworkResponse()
    data class Error(val error: String) : NetworkResponse()
    object Loading : NetworkResponse()
}

fun handleResponse(response: NetworkResponse) {
    when (response) {
        is NetworkResponse.Success -> println("Success: ${response.data}")
        is NetworkResponse.Error -> println("Error: ${response.error}")
        is NetworkResponse.Loading -> println("Loading...")
    }
}

fun main() {
    val successResponse = NetworkResponse.Success("Data loaded successfully")
    val errorResponse = NetworkResponse.Error("Network error")
    val loadingResponse = NetworkResponse.Loading

    handleResponse(successResponse) // Success: Data loaded successfully
    handleResponse(errorResponse)   // Error: Network error
    handleResponse(loadingResponse) // Loading...
}
