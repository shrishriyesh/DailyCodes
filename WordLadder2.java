
class Solution {
   
    public ArrayList<ArrayList<String>> findLadders(String beginWord,
         String endWord, ArrayList<String> wordList) {
        ArrayList<ArrayList<String>> res = new ArrayList<>();
        Set<String> dict = new HashSet<>(wordList);
        if (!dict.contains(endWord)) 
        return res;
        Map<String, ArrayList<String>> map = new HashMap<>();
        Set<String> startSet = new HashSet<>();
        startSet.add(beginWord);
        bfs(startSet, endWord, map, dict);

        ArrayList<String> list = new ArrayList<>();
        list.add(beginWord);
        dfs(res, list, beginWord, endWord, map);
        return res;
    }


    private void dfs(ArrayList<ArrayList<String>> res, ArrayList<String> list, 
        String word, String endWord, Map<String, ArrayList<String>> map) {
        if (word.equals(endWord)) {
            res.add(new ArrayList(list));
            return;
        }

        if (map.get(word) == null) return;
        for (String next : map.get(word)) {
            list.add(next);
            dfs(res, list, next, endWord, map);
            list.remove(list.size() - 1);
        }
    }

    private void bfs(Set<String> startSet, String endWord, 
        Map<String, ArrayList<String>> map, Set<String> dict) {
        if (startSet.size() == 0) return;

        Set<String> tmp = new HashSet<>();
        dict.removeAll(startSet);
        boolean finish = false;

        for (String s : startSet) {
            char[] chs = s.toCharArray();
            for (int i = 0; i < chs.length; i++) {
                char old = chs[i];
                for (char c = 'a'; c <= 'z'; c++) {
                    chs[i] = c;
                    String word = new String(chs);

                    if (dict.contains(word)) {
                        if (word.equals(endWord)) {
                            finish = true;
                        } else {
                            tmp.add(word);
                        }

                        if (map.get(s) == null) {
                            map.put(s, new ArrayList<>());
                        }

                        map.get(s).add(word);
                    }
                }

                chs[i] = old;
            }
        }

        if (!finish) {
            bfs(tmp, endWord, map, dict);
        }
    }
}

