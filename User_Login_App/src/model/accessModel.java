package model;

import java.util.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.ArrayList;

/**
 *
 * @author Piano Hhagens
 */
public class accessModel extends userModel{//Query
    protected String stringSQL;//querySting
    protected HashMap datas;//parameters
    protected LinkedHashMap sortedDatas;//sortedParams
    protected String sqlType;//queryType

    public accessModel(String stringSQL, HashMap<String, String> datas){
        this.stringSQL = stringSQL;
        this.datas = convToLowerCase(datas);
        this.sortedDatas = new LinkedHashMap();
        this.sqlType = stringSQL.substring(0, 6);
    }
    public String getDataString(){
        sqlData(this.stringSQL);//sqlData-parmeterizeQuery
        return this.stringSQL;
    }

    private void sqlData(String stringSQL) {
        if(this.sqlType.equals("SELECT")){
            this.dataSELECT(stringSQL);
        }
    }

    private void dataSELECT(String stringSQL) {
        String[] sqlList = stringSQL.split(" ");
        ArrayList<String> stringArrayList = new ArrayList<String>(Arrays.asList(sqlList));
        String sqlStr = "";
        for(String sqlParts : stringArrayList){
            if(sqlParts.contains(":")){
                String dataTest = sqlParts.toLowerCase().replace(":", "");
                this.datas.forEach(
                    (key, value) -> {
                        //Finding match data
                        if (key.equals(dataTest)) {
                            this.sortedDatas.put(key, value);
                        }
                    }
                );
                //create a placeholder
                sqlParts = "?";
            }
            //Final query string
            sqlStr += sqlParts + " ";
        }
        //
        sqlStr = sqlStr.substring(0, sqlStr.length() -1);
        this.stringSQL = sqlStr;
    }
    public HashMap getsortedDatas(){
        if(this.sortedDatas.isEmpty()){
            this.sqlData(this.stringSQL);
        }
        return sortedDatas;
    }

}
