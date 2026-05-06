class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort(Map.Entry.comparingByValue());


        for (Map.Entry<Integer, Integer> entry : list) {
            System.out.println("Key: " + entry.getKey() + " | Count: " + entry.getValue());
        }

        int[] result = new int[k];
        int index = 0;
        for (int i = list.size() - 1; i >= list.size() - k; i--) {
            result[index++] = list.get(i).getKey();
        }

        return result;
    }
}