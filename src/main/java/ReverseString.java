
class ReverseString {

    String reverse(String inputString) {
        String reverse = "";
        for(int i=inputString.length()-1;i>=0;i--){
            reverse+=inputString.charAt(i);
        }

        return reverse;
    }
  
}
