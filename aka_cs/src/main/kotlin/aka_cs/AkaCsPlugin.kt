package aka_cs

import com.lagradost.cloudstream3.MainAPI
import com.lagradost.cloudstream3.SearchResponse

class AkaCsPlugin : MainAPI() {
    override var mainUrl = "https://www.filmmodu.nl/"
    override var name = "AKA CS"

    override suspend fun search(query: String): List<SearchResponse> {
        // Basit boş liste döndürüyor, geliştirebilirsin
        return emptyList()
    }
}
