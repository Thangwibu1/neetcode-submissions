class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int firstIndex = 0;
        int lastIndex = numbers.length - 1;
        int checkSum = numbers[firstIndex] + numbers[lastIndex];
        while (checkSum != target) {
            if (checkSum >  target) {
                lastIndex--;
            } else {
                firstIndex++;
            }
            checkSum = numbers[firstIndex] + numbers[lastIndex];
        }

        int[] result = {firstIndex + 1, lastIndex + 1};
        return result;
    }
}
