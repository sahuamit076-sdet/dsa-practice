package dsa.greedy.medium;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MeetingRooms {

    public static void main(String[] args) {
        int[] start = {0, 3, 1, 5, 5, 8};
        int[] end = {5, 4, 2, 9, 7, 9};
        int count =  possibleMeetings(start, end);
        System.out.println(count);
    }

    static int possibleMeetings(int[] start, int[] end) {
        List<Interval> meetings = new ArrayList<>();
        //time complexity O(n)
        for(int i = 0; i < start.length; i++) {
            Interval interval = new Interval();
            interval.start = start[i];
            interval.end = end[i];
            meetings.add(interval);
        }
        //time complexity O(n log n)
        meetings.sort(Comparator.comparingInt(t -> t.end));

        int count  = 1;
        int last  = meetings.get(0).end;
        System.out.println(meetings.get(0).toString());
        //time complexity O(n)
        for(int i = 1; i < meetings.size(); i++) {
                if(meetings.get(i).start > last) {
                    count++;
                    System.out.println(meetings.get(i).toString());
                    last = meetings.get(i).end;
                }
        }
        return count;
    }

    public static class Interval {
        int start;
        int end;

        @Override
        public String toString() {
            return "Interval{" +
                    "startTime=" + start +
                    ", endTime=" + end +
                    '}';
        }
    }

}



