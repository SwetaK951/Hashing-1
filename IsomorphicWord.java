
public class IsomorphicWord{
    public boolean isIsomorphic(String s, String t) {
        if(s == null || t == null || s.length() != t.length())
            return false;
           
        HashMap<Character, Character> up = new HashMap<>();
        HashMap<Character, Character> down = new HashMap<>();
        
        for(int i=0; i<s.length(); i++){
            if(up.containsKey(s.charAt(i))){
                if(up.get(s.charAt(i)) != t.charAt(i))
                    return false;
            }
            up.put(s.charAt(i), t.charAt(i));
        }

        for(int i=0; i<t.length(); i++){
            if(down.containsKey(t.charAt(i))){
                if(down.get(t.charAt(i)) != s.charAt(i))
                    return false;
            }
            down.put(t.charAt(i), s.charAt(i));
        }
        return true;
        
    }
}