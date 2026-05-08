class Solution {
    public boolean isPalindrome(String s) {
        String cleanedString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder sb = new StringBuilder(cleanedString);
        String reversedString = sb.reverse().toString();
        // Bước 3: Kiểm tra xem chuỗi làm sạch và chuỗi đảo ngược có giống hệt nhau không
        return cleanedString.equals(reversedString);
    }
}