// Toggle Case

class Solution{
    
    String toggleCase(String str){
        StringBuilder sb = new StringBuilder(str);
        
        // approach: lowercase_ch = lowercase_firstLetter + gap_btw_Uppercase_ch_&_First
        
        for(int i=0; i<sb.length(); i++){
            char ch = sb.charAt(i);
            
            if(ch>='A' && ch<='Z'){ 
                // convert to LowerCase characters
                char LC = (char)('a' + ch - 'A');
                sb.setCharAt(i, LC); 
            }
            else{
                // convert to UpperCase characters
                char UC = (char)('A' + ch - 'a');
                sb.setCharAt(i, UC); 
            }
        }
        return sb.toString();
    }
	
}
