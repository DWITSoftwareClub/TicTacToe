package tictactoe.grails

import grails.transaction.Transactional
import groovy.json.JsonSlurper

@Transactional
class PlaylistGeneratorService {

    def getPlayList(genre){
        def apiUrl
        def multipleUrl = []
        Map<String, String> songs = new HashMap<>();


        if (genre.size()==1){
            apiUrl = "http://api.musicgraph.com/api/v2/playlist?api_key=c8303e90962e3a5ebd5a1f260a69b138&genres=" + genre[0] + "&decade=2010s";
            def json = new JsonSlurper().parseText( new URL(apiUrl).text )
            def data = json.getAt('data')
            def sortedData = data.sort{it.getAt("popularity")}
            sortedData.each {
                if(it.getAt("track_youtube_id")!=null){
                    String title = it.getAt("title") + " - " + it.getAt("main_genre")+" - "+it.getAt("release_year")
                    String link = "https://www.youtube.com/watch?v="+it.getAt("track_youtube_id")
                    songs.put(title,link)
                }
            }
            return songs;
        }else {
            for (int i = 0; i < genre.size(); i++) {
                multipleUrl.add(i,"http://api.musicgraph.com/api/v2/playlist?api_key=c8303e90962e3a5ebd5a1f260a69b138&genres=" + genre[i] + "&decade=2010s")
            }
            getList(multipleUrl);
        }
    }
    def getList(url){
        Map<String, String> multipleList = new HashMap<>();
        for (int i = 0; i < url.size(); i++) {
            def json = new JsonSlurper().parseText( new URL(url[i]).text )
            def data = json.getAt('data')
            data.each {
                if (it.getAt("track_youtube_id")!=null){
                    String title = it.getAt("title") + " - " + it.getAt("main_genre")+" - "+it.getAt("release_year")
                    String link = "https://www.youtube.com/watch?v="+it.getAt("track_youtube_id")
                    multipleList.put(title,link)
                }
            }
        }
        return multipleList;
    }
}
