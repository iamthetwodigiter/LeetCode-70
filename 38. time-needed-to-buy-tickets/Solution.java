class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        int kTickets = tickets[k];
        // for(int i=0; i<tickets.length; i=((i+1)%tickets.length)) {
        //     if(tickets[k] == 0) return time;
        //     if(tickets[i] == 0) continue;
        //     tickets[i]--;
        //     time++;
        // }
        // return time;

        for(int i=0; i<tickets.length; i++) {
            if(i<=k) {
                time += Math.min(tickets[i], kTickets);
            } else {
                time += Math.min(tickets[i], kTickets-1);
            }
        }
        return time;
    }
}