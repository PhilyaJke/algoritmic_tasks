import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[]arr = new String[]{"acb","b","",""};
        System.out.println(longestCommonPrefix(arr));
    }
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }else if(strs.length==1){
            return strs[0];
        }else{
            bubblesort(strs);
            char[] chars = strs[0].toCharArray();
            StringBuilder stringBuilder = new StringBuilder();
            boolean flag = true;
            for(int j = 0; j < chars.length; j++){
                for(int i = 1; i < strs.length; i++){
                    if(strs[i].charAt(j)==chars[j])
                        flag = true;
                    else {
                        flag = false;
                        break;
                    }
                }
                if(flag==false)
                    break;
                else
                    stringBuilder.append(chars[j]);
            }
            return stringBuilder.toString();
        }
    }

    public static void bubblesort(String[] strs){
        boolean flag = false;
        while (!flag){
            flag = true;
            for (int i = 0; i < strs.length-1; i++) {
                if(strs[i].length()>strs[i+1].length()){
                    String temp = strs[i];
                    strs[i] = strs[i+1];
                    strs[i+1] = temp;
                    flag = false;
                }
            }
        }
    }
}
//
//5
//-10 2 1 4 6
//-5


