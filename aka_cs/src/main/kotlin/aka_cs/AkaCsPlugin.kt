package aka_cs

import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.MainAPI

class AkaCsPlugin : MainAPI() {
    override var mainUrl = "https://www.filmmodu.nl/"
    override var name = "AKA CS"

    override suspend fun search(query: String): List<SearchResponse> {
        return emptyList() // Şimdilik boş, sonra içerik eklersin
    }
}
