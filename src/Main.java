public class Main {
    public static void main(String[] args) {
        MoodAnalyser moodAnalyser1 = new MoodAnalyser("I am in Sad Mood");
        String result1 = moodAnalyser1.analyseMood();
        System.out.println("Message: " + moodAnalyser1.getMessage() + " | Mood: " + result1);

        MoodAnalyser moodAnalyser2 = new MoodAnalyser();
        moodAnalyser2.setMessage("I am in Any Mood");
        String result2 = moodAnalyser2.analyseMood();
        System.out.println("Message: " + moodAnalyser2.getMessage() + " | Mood: " + result2);
    }
}