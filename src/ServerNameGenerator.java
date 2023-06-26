public class ServerNameGenerator {

    String[] adjectives = {"Big", "yellow", "small", "Silly", "loud", "senile", "aged", "smelly", "orange", "hard"};
    String[] nouns = {"ball", "car", "desk", "phone", "foot", "face", "boat", "airplane", "cup", "fork"};

    public void combineAdjAndNoun(String adjective, String noun) {
        System.out.println(adjective + "-" + noun);
    }

    public static void main(String[] args) {
        ServerNameGenerator generator = new ServerNameGenerator();

        int randomAdjectiveIndex = (int) (Math.random() * generator.adjectives.length);
        String randomAdjective = generator.adjectives[randomAdjectiveIndex];

        int randomNounIndex = (int) (Math.random() * generator.nouns.length);
        String randomNoun = generator.nouns[randomNounIndex];

//        System.out.println(randomAdjective);
//        System.out.println(randomNoun);

        generator.combineAdjAndNoun(randomAdjective, randomNoun);
    }
}
