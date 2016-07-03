package tictactoe.grails

class GetPlaylistController {
    def playlistGeneratorService
    private Map<String, List<String>> genreMap = new HashMap<String, List<String>>() {{
        put("Happy", new ArrayList<String>(Arrays.asList("Instrumental", "Blues", "Pop", "Classical/opera")));
        put("Sad", new ArrayList<String>(Arrays.asList("Classical/opera", "Blues")));
        put("Love", new ArrayList<String>(Arrays.asList("Instrumental", "Jazz", "Pop")));
        put("Nervous", new ArrayList<String>(Arrays.asList("Blues")));
        put("Anxious", new ArrayList<String>(Arrays.asList("Blues")));
        put("Energetic", new ArrayList<String>(Arrays.asList("Rock")));
        put("Angry", new ArrayList<String>(Arrays.asList("Jazz")));
        put("Workout", new ArrayList<String>(Arrays.asList("Pop", "Rock")));
        put("Angry", new ArrayList<String>(Arrays.asList("Jazz")));
        put("Break Up", new ArrayList<String>(Arrays.asList("Jazz")));
        put("Dance", new ArrayList<String>(Arrays.asList("Dance", "Jazz")));
        put("Sleepy", new ArrayList<String>(Arrays.asList("Folk", "Classical/opera", "Pop")));
        put("Relax", new ArrayList<String>(Arrays.asList("Jazz", "Metal", "Hip-Hop")));
        put("Meditation", new ArrayList<String>(Arrays.asList("International", "Blues")));
        put("Exhaustion", new ArrayList<String>(Arrays.asList("Rock", "Hip-Hop", "Blues")));
        put("Calm", new ArrayList<String>(Arrays.asList("Jazz")));
        put("Romantic", new ArrayList<String>(Arrays.asList("Jazz")));
    }};
    def index() { }

    def generateList(){
        String genre = params.mood
        List<String> genreList = genreMap.get(genre);
        println "genreList = $genreList"
        def playList = playlistGeneratorService.getPlayList(genreList)
        [pl:playList]
    }
}
