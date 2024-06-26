class Solution {
    public String[] findWords(String[] Words) {
        List<String> result=new ArrayList<>();
        for(String name:Words){
            if(IsOneRowWord(name)){
                result.add(name);
            }
        }
       return result.toArray(new String[0]);
    }

public static Boolean IsOneRowWord(String name){
    String row1="qwertyuiop";
    String row2="asdfghjkl";
    String row3="zxcvbnm";
    char firstchar=Character.toLowerCase(name.charAt(0));
    String row;
    if(row1.indexOf(firstchar)!=-1){
        row=row1;
    }
    else if(row2.indexOf(firstchar)!=-1){
    row=row2;
}
else{
    row=row3;
}
for(int i=1;i<name.length();i++){
    if(row.indexOf(Character.toLowerCase(name.charAt(i)))==-1){
        return false;
    }
}
return true;
}
}
