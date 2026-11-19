class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder builder = new StringBuilder();
        char[] asArray = identifier.toCharArray();

        for(int i = 0; i < asArray.length; i++){
            if(asArray[i] == ' '){
                builder.append('_');
            }
            else if(asArray[i] == '-'){
                asArray[i+1] = Character.toUpperCase(asArray[i+1]);
            }
            else{
                if(asArray[i] == '3'){
                    asArray[i] = 'e';
                    
                }
                if(asArray[i] == '0'){
                    asArray[i] ='o';
                   
                }
                if(asArray[i] == '4'){
                    asArray[i] ='a';
                    
                }
                if(asArray[i] == '1'){
                    asArray[i] ='l';
                    
                }
                if(asArray[i] == '7'){
                    asArray[i] ='t';
                   
                }

                if(!Character.isLetter(asArray[i])){
                    continue;
                }
                
             builder.append(asArray[i]);
            }
        }
        return builder.toString();
    }   
}
