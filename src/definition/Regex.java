package definition;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Regex {
    public boolean isEmailcorrect(String emailAddress) {
        String correctEmail = "[a-zA-Z][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+";
        Pattern patternEmail = Pattern.compile(correctEmail);
        Matcher matcherEmail = patternEmail.matcher(emailAddress);
        return matcherEmail.matches();

    }

    public boolean isContactNumbercorrect(Long contactNumber) {
        String correctPhoneNumber = "^(0|91)?[1-9][0-9]{9}$";
        Pattern patternContact = Pattern.compile(correctPhoneNumber);
        Matcher matcherContact = patternContact.matcher(String.valueOf(contactNumber));
        return matcherContact.matches();
    }

}
