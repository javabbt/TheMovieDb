package com.weinc.feature_home.data.models

data class Films(
    val page: Int,
    val results: List<Result>,
    val total_pages: Int,
    val total_results: Int
)