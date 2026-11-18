class Solution {
    public String frequencySort(String s) {
      HashMap<Character,Integer>mp=new HashMap<>();
      StringBuilder sb=new StringBuilder();
      for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        mp.put(ch,mp.getOrDefault(ch,0)+1);
      }  
      List<Character>l=new ArrayList(mp.keySet());
      l.sort((ob1,ob2)-> mp.get(ob2)-mp.get(ob1));
      for(char ch:l){
        for(int i=0;i<mp.get(ch);i++){
            sb.append(ch);
        }
      }
      return sb.toString();
    }
}