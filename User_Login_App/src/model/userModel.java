package model;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Piano Hhagens
 */
public class userModel{//BaseClass
    protected static String loggedUser = "loadUser";
    public static String getLoggedUser(){
        return loggedUser;
    }
    public static void setLoggedUser(String user){
        loggedUser = user;
    }
    //Convert all entry in to lower case
    public static HashMap<String, String> convToLowerCase(HashMap<String, String> inMap){
        HashMap<String, String> lowerCaseData = new HashMap<>();
        for (Map.Entry<String, String> entry : inMap.entrySet()){
            String entryKey = entry.getKey().toLowerCase();
            String entryK = entry.getValue();
            lowerCaseData.put(entryKey, entryK);
        }
        return lowerCaseData;
    }
}
