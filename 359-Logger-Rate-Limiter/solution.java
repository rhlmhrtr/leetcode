public class Logger {
    Map<String,Integer> hm = null;
    /** Initialize your data structure here. */
    public Logger() {
        hm = Collections.synchronizedMap(new HashMap<String,Integer>());
    }
    
    /** Returns true if the message should be printed in the given timestamp, otherwise returns false.
        If this method returns false, the message will not be printed.
        The timestamp is in seconds granularity. */
    public boolean shouldPrintMessage(int timestamp, String message) {
        Integer t = hm.get(message);
        if(t == null)
        {
            hm.put(message,timestamp);
            return true;
        }
        else
        {
            if((timestamp-t)>=10)
            {
                hm.put(message,timestamp);
                return true;
            }
            else
            {
                return false;
            }
        }
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */