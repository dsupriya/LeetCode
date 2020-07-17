class Solution {
    public String[] reorderLogFiles(String[] logs) {
         Arrays.sort(logs, (a, b) -> {
            String aId = a.substring(0, a.indexOf(' '));
            String bId = b.substring(0, b.indexOf(' '));
            String aEntries = a.substring(a.indexOf(' ')+1);
            String bEntries = b.substring(b.indexOf(' ')+1);
            if (Character.isDigit(aEntries.charAt(0)) && Character.isDigit(bEntries.charAt(0))) {
                return 0;
            } else if (Character.isDigit(aEntries.charAt(0)) && !Character.isDigit(bEntries.charAt(0))) {
                return 1;
            } else if (!Character.isDigit(aEntries.charAt(0)) && Character.isDigit(bEntries.charAt(0))) {
                return -1;
            } else {
                // Compare two digits & sort them.
                int diff = aEntries.compareTo(bEntries);
                if (diff == 0) {
                    return aId.compareTo(bId);
                } else {
                    return diff;
                }
            }
        });
        return logs;
    }
}
