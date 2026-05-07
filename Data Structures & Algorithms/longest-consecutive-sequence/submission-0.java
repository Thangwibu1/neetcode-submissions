class Solution {
    public int longestConsecutive(int[] nums) {
        // Xử lý trường hợp mảng rỗng
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // Bước 1: Đưa tất cả các số vào HashSet
        HashSet<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int maxLength = 0;

        // Bước 2: Duyệt qua từng số trong HashSet
        for (int num : numSet) {
            // Bước 3: Chỉ bắt đầu đếm nếu 'num' là số đầu tiên của chuỗi
            // (Nghĩa là số 'num - 1' KHÔNG tồn tại trong Set)
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;

                // Bước 4: Đếm độ dài chuỗi bằng cách tìm các số liên tiếp tiếp theo
                while (numSet.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentLength += 1;
                }

                // Cập nhật độ dài lớn nhất tìm được
                maxLength = Math.max(maxLength, currentLength);
            }
        }

        return maxLength;
    }
}
