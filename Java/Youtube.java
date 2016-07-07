public class Youtube {
  
  private String urlToYoutubeID(String url) {
        String strPattern = "\\W([\\w-]{9,})(\\W|$)";
        Pattern pattern = Pattern.compile(strPattern);

        Matcher matcher = pattern.matcher(url);
        if (matcher.find()){
            System.out.println(matcher.group(1));
            return matcher.group(1);
        }
        return "";
    }
  
  private String urlToYoutubeID(String url) {
    String strPattern = "\\W([\\w-]{9,})(\\W|$)";
    Pattern pattern = Pattern.compile(strPattern);

    Matcher matcher = pattern.matcher(url);
    if (matcher.find()){
      System.out.println(matcher.group(1));
      return matcher.group(1);
    }
    return "";
  }
    
}
