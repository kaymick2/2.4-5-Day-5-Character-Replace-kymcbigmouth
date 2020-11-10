class Main {
  public static void main(String[] args) {
    String word = "windows 10 is updating! It's taking forever! Now it's slower! Also stop asking me to use cortana. Nobody plays halo anymore.";
    System.out.println(word);System.out.println("\n");
    replacements(word);
    System.out.println(replacements(word));
  }

  public static String replacements(String word) {
    String x = word.replace("i", "!");
    x = x.replace("s", "$");
    x = x.replace("10", "95");
    return x;

  }
}