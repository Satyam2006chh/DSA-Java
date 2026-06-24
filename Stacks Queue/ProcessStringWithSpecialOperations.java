// 3612. Process String with Special Operations I
class ProcessStringWithSpecialOperations {
    public String processStr(String s) {
        StringBuilder result = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                // Append lowercase letters
                result.append(ch);
            } else if (ch == '*') {
                // Remove last character if exists
                if (result.length() > 0) {
                    result.deleteCharAt(result.length() - 1);
                }
            } else if (ch == '#') {
                // Duplicate current result
                result.append(result.toString());
            } else if (ch == '%') {
                // Reverse current result
                result.reverse();
            }
        }

        return result.toString();
    }
}
