class Solution {
    public List<String> topKFrequent(String[] words, int k) {

        Map<String, Integer> mp = new HashMap<>();

        // Frequency Count
        for (int i = 0; i < words.length; i++) {
            mp.put(words[i], mp.getOrDefault(words[i], 0) + 1);
        }

        // Store all unique words
        List<String> list = new ArrayList<>(mp.keySet());

        // Sort
        Collections.sort(list, (a, b) -> {

            // Frequency different
            if (!mp.get(a).equals(mp.get(b))) {
                return mp.get(b) - mp.get(a);
            }

            // Same frequency -> Lexicographical order
            return a.compareTo(b);
        });

        // Return first k words
        return list.subList(0, k);
    }
}