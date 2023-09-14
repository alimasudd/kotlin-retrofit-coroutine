package id.alimasudd.rerofit_qoroutine.`interface`

import id.alimasudd.rerofit_qoroutine.data.QuoteList
import retrofit2.Response
import retrofit2.http.GET

interface QuotesApi {
    @GET("/quotes")
    suspend fun getQuotes() : Response<QuoteList>
}