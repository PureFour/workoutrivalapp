package com.ruczajsoftware.workoutrival.util

class ErrorHandling {

    companion object {
        const val ERROR_401 = "Unauthorized. Token may be invalid"
        const val ERROR_403 = "403 Access Denied"
        const val ERROR_404 = "Not found"
        const val FAILED_TO_CONNECT_TO_SERVER =
            "Failed to connect to server. Please check internet connection."
        const val UNABLE_TO_RESOLVE_HOST = "Unable to resolve host"
        const val UNABLE_TODO_OPERATION_WO_INTERNET =
            "Can't do that operation without an internet connection"
        const val ERROR_CHECK_NETWORK_CONNECTION = "Check network connection."
        const val ERROR_UNKNOWN = "Unknown error"

        fun isNetworkError(msg: String): Boolean {
            when {
                msg.contains(UNABLE_TO_RESOLVE_HOST) -> return true
                else -> return false
            }
        }
    }

}