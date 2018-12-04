package advent2018;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AoC2018Day4Part1 {
    public static void main(String[] args) {
        int result;

        result = test("[1518-11-01 00:00] Guard #10 begins shift\n" +
                "[1518-11-01 00:05] falls asleep\n" +
                "[1518-11-01 00:25] wakes up\n" +
                "[1518-11-01 00:30] falls asleep\n" +
                "[1518-11-01 00:55] wakes up\n" +
                "[1518-11-01 23:58] Guard #99 begins shift\n" +
                "[1518-11-02 00:40] falls asleep\n" +
                "[1518-11-02 00:50] wakes up\n" +
                "[1518-11-03 00:05] Guard #10 begins shift\n" +
                "[1518-11-03 00:24] falls asleep\n" +
                "[1518-11-03 00:29] wakes up\n" +
                "[1518-11-04 00:02] Guard #99 begins shift\n" +
                "[1518-11-04 00:36] falls asleep\n" +
                "[1518-11-04 00:46] wakes up\n" +
                "[1518-11-05 00:03] Guard #99 begins shift\n" +
                "[1518-11-05 00:45] falls asleep\n" +
                "[1518-11-05 00:55] wakes up");
        assert result == 240 : "unexpected result is " + result;
        System.out.println(result);

        result = test("[1518-10-05 00:10] falls asleep\n" +
                "[1518-07-22 23:53] Guard #1949 begins shift\n" +
                "[1518-07-06 00:55] wakes up\n" +
                "[1518-07-16 00:38] falls asleep\n" +
                "[1518-06-05 00:32] falls asleep\n" +
                "[1518-08-17 00:30] falls asleep\n" +
                "[1518-05-15 00:40] wakes up\n" +
                "[1518-10-14 00:00] Guard #853 begins shift\n" +
                "[1518-08-02 00:01] Guard #853 begins shift\n" +
                "[1518-07-18 00:37] falls asleep\n" +
                "[1518-04-29 00:36] wakes up\n" +
                "[1518-03-24 00:56] wakes up\n" +
                "[1518-11-03 00:32] falls asleep\n" +
                "[1518-06-01 00:54] falls asleep\n" +
                "[1518-08-07 00:01] Guard #761 begins shift\n" +
                "[1518-04-23 00:01] Guard #311 begins shift\n" +
                "[1518-10-03 00:43] wakes up\n" +
                "[1518-11-23 00:48] wakes up\n" +
                "[1518-05-21 00:50] wakes up\n" +
                "[1518-09-06 00:47] wakes up\n" +
                "[1518-09-20 00:58] wakes up\n" +
                "[1518-05-01 00:56] wakes up\n" +
                "[1518-10-15 00:53] wakes up\n" +
                "[1518-04-20 00:11] falls asleep\n" +
                "[1518-06-01 00:21] falls asleep\n" +
                "[1518-10-06 23:54] Guard #2011 begins shift\n" +
                "[1518-05-18 23:58] Guard #1433 begins shift\n" +
                "[1518-05-10 00:53] wakes up\n" +
                "[1518-03-29 00:52] falls asleep\n" +
                "[1518-03-10 00:26] wakes up\n" +
                "[1518-07-07 00:43] wakes up\n" +
                "[1518-10-22 00:17] falls asleep\n" +
                "[1518-08-20 00:39] wakes up\n" +
                "[1518-03-22 23:57] Guard #1129 begins shift\n" +
                "[1518-11-22 00:01] Guard #3467 begins shift\n" +
                "[1518-02-27 00:10] falls asleep\n" +
                "[1518-09-10 23:50] Guard #853 begins shift\n" +
                "[1518-04-23 00:27] wakes up\n" +
                "[1518-07-12 00:50] wakes up\n" +
                "[1518-10-13 00:57] falls asleep\n" +
                "[1518-03-21 23:59] Guard #2011 begins shift\n" +
                "[1518-04-26 00:00] Guard #1193 begins shift\n" +
                "[1518-03-02 00:01] falls asleep\n" +
                "[1518-08-05 00:45] wakes up\n" +
                "[1518-09-12 00:34] wakes up\n" +
                "[1518-05-13 00:04] Guard #1129 begins shift\n" +
                "[1518-11-15 00:59] wakes up\n" +
                "[1518-06-22 00:11] falls asleep\n" +
                "[1518-05-08 00:03] Guard #761 begins shift\n" +
                "[1518-10-18 00:21] wakes up\n" +
                "[1518-08-07 00:24] falls asleep\n" +
                "[1518-10-27 23:56] Guard #647 begins shift\n" +
                "[1518-05-29 00:10] falls asleep\n" +
                "[1518-08-13 23:48] Guard #1657 begins shift\n" +
                "[1518-07-03 00:52] wakes up\n" +
                "[1518-05-20 00:04] falls asleep\n" +
                "[1518-07-01 00:09] wakes up\n" +
                "[1518-07-04 00:17] wakes up\n" +
                "[1518-02-26 00:44] wakes up\n" +
                "[1518-05-22 00:53] wakes up\n" +
                "[1518-10-19 00:26] wakes up\n" +
                "[1518-10-20 00:46] falls asleep\n" +
                "[1518-05-18 00:35] wakes up\n" +
                "[1518-06-23 00:32] falls asleep\n" +
                "[1518-11-02 00:01] Guard #1129 begins shift\n" +
                "[1518-08-30 00:05] falls asleep\n" +
                "[1518-07-21 00:20] falls asleep\n" +
                "[1518-05-31 00:50] falls asleep\n" +
                "[1518-11-13 00:45] wakes up\n" +
                "[1518-10-12 00:02] Guard #2719 begins shift\n" +
                "[1518-07-21 00:38] wakes up\n" +
                "[1518-07-28 23:52] Guard #2719 begins shift\n" +
                "[1518-09-05 00:53] falls asleep\n" +
                "[1518-04-19 00:10] falls asleep\n" +
                "[1518-07-07 00:01] falls asleep\n" +
                "[1518-07-24 00:56] wakes up\n" +
                "[1518-11-01 00:52] wakes up\n" +
                "[1518-10-31 00:44] wakes up\n" +
                "[1518-06-24 00:30] wakes up\n" +
                "[1518-08-25 00:40] falls asleep\n" +
                "[1518-03-18 00:09] falls asleep\n" +
                "[1518-10-09 00:00] Guard #223 begins shift\n" +
                "[1518-11-15 00:02] Guard #3499 begins shift\n" +
                "[1518-08-29 00:12] falls asleep\n" +
                "[1518-10-27 00:04] falls asleep\n" +
                "[1518-03-08 00:55] wakes up\n" +
                "[1518-03-30 00:24] falls asleep\n" +
                "[1518-06-21 23:57] Guard #653 begins shift\n" +
                "[1518-03-10 00:29] falls asleep\n" +
                "[1518-06-07 00:36] wakes up\n" +
                "[1518-10-13 00:37] falls asleep\n" +
                "[1518-07-30 23:48] Guard #653 begins shift\n" +
                "[1518-04-04 00:59] wakes up\n" +
                "[1518-08-26 00:55] wakes up\n" +
                "[1518-11-23 00:02] Guard #1193 begins shift\n" +
                "[1518-06-12 00:53] falls asleep\n" +
                "[1518-08-25 00:56] wakes up\n" +
                "[1518-07-15 00:35] falls asleep\n" +
                "[1518-06-14 00:29] falls asleep\n" +
                "[1518-06-20 00:40] falls asleep\n" +
                "[1518-07-28 00:36] falls asleep\n" +
                "[1518-04-11 00:47] falls asleep\n" +
                "[1518-08-28 00:00] Guard #727 begins shift\n" +
                "[1518-04-07 23:57] Guard #311 begins shift\n" +
                "[1518-05-13 00:18] falls asleep\n" +
                "[1518-04-18 00:13] falls asleep\n" +
                "[1518-09-16 23:59] Guard #2719 begins shift\n" +
                "[1518-09-19 00:10] falls asleep\n" +
                "[1518-05-08 23:58] Guard #2503 begins shift\n" +
                "[1518-07-11 00:01] Guard #2011 begins shift\n" +
                "[1518-06-26 00:39] falls asleep\n" +
                "[1518-03-07 00:47] wakes up\n" +
                "[1518-06-22 00:57] wakes up\n" +
                "[1518-09-01 00:38] wakes up\n" +
                "[1518-07-20 00:03] falls asleep\n" +
                "[1518-07-13 00:50] wakes up\n" +
                "[1518-03-25 00:26] falls asleep\n" +
                "[1518-04-19 00:55] wakes up\n" +
                "[1518-09-04 00:41] wakes up\n" +
                "[1518-03-24 00:35] wakes up\n" +
                "[1518-07-19 00:41] falls asleep\n" +
                "[1518-07-31 00:33] falls asleep\n" +
                "[1518-11-23 00:30] falls asleep\n" +
                "[1518-10-23 00:03] Guard #311 begins shift\n" +
                "[1518-10-01 23:56] Guard #853 begins shift\n" +
                "[1518-05-28 00:35] wakes up\n" +
                "[1518-05-07 00:04] Guard #1433 begins shift\n" +
                "[1518-11-13 00:05] falls asleep\n" +
                "[1518-09-18 00:25] falls asleep\n" +
                "[1518-11-21 00:52] wakes up\n" +
                "[1518-07-08 00:43] falls asleep\n" +
                "[1518-08-18 23:54] Guard #1949 begins shift\n" +
                "[1518-05-10 23:58] Guard #647 begins shift\n" +
                "[1518-03-31 00:50] falls asleep\n" +
                "[1518-05-21 00:32] falls asleep\n" +
                "[1518-06-05 00:04] Guard #223 begins shift\n" +
                "[1518-11-06 00:02] Guard #3467 begins shift\n" +
                "[1518-03-08 00:14] wakes up\n" +
                "[1518-10-20 00:58] wakes up\n" +
                "[1518-03-11 00:32] falls asleep\n" +
                "[1518-07-25 00:29] falls asleep\n" +
                "[1518-04-04 00:33] wakes up\n" +
                "[1518-07-21 00:47] falls asleep\n" +
                "[1518-09-30 00:00] Guard #653 begins shift\n" +
                "[1518-11-18 23:57] Guard #3089 begins shift\n" +
                "[1518-11-08 00:25] falls asleep\n" +
                "[1518-09-16 00:39] falls asleep\n" +
                "[1518-03-09 00:53] wakes up\n" +
                "[1518-09-30 00:51] wakes up\n" +
                "[1518-09-11 23:56] Guard #1193 begins shift\n" +
                "[1518-07-26 00:22] falls asleep\n" +
                "[1518-05-30 00:35] wakes up\n" +
                "[1518-03-01 00:48] falls asleep\n" +
                "[1518-07-06 00:36] falls asleep\n" +
                "[1518-06-08 00:28] wakes up\n" +
                "[1518-08-31 00:37] falls asleep\n" +
                "[1518-03-19 00:18] falls asleep\n" +
                "[1518-09-22 00:57] falls asleep\n" +
                "[1518-07-30 00:29] wakes up\n" +
                "[1518-05-17 00:10] falls asleep\n" +
                "[1518-10-10 00:54] wakes up\n" +
                "[1518-05-05 00:12] falls asleep\n" +
                "[1518-03-04 00:31] falls asleep\n" +
                "[1518-05-18 00:58] wakes up\n" +
                "[1518-10-13 00:01] Guard #761 begins shift\n" +
                "[1518-09-05 23:58] Guard #1129 begins shift\n" +
                "[1518-07-21 00:33] wakes up\n" +
                "[1518-05-24 00:13] falls asleep\n" +
                "[1518-04-14 00:27] wakes up\n" +
                "[1518-03-13 23:57] Guard #653 begins shift\n" +
                "[1518-08-25 00:18] falls asleep\n" +
                "[1518-05-29 00:49] wakes up\n" +
                "[1518-06-04 00:24] falls asleep\n" +
                "[1518-07-29 00:32] falls asleep\n" +
                "[1518-11-05 00:51] falls asleep\n" +
                "[1518-10-25 00:24] falls asleep\n" +
                "[1518-06-11 00:00] Guard #2719 begins shift\n" +
                "[1518-08-28 00:48] wakes up\n" +
                "[1518-06-03 00:47] falls asleep\n" +
                "[1518-11-17 23:56] Guard #2011 begins shift\n" +
                "[1518-06-26 00:53] wakes up\n" +
                "[1518-08-13 00:32] falls asleep\n" +
                "[1518-07-02 00:59] wakes up\n" +
                "[1518-03-20 00:56] wakes up\n" +
                "[1518-03-24 00:00] Guard #1657 begins shift\n" +
                "[1518-10-09 00:45] wakes up\n" +
                "[1518-08-24 00:54] falls asleep\n" +
                "[1518-06-14 00:04] Guard #1949 begins shift\n" +
                "[1518-09-08 00:52] wakes up\n" +
                "[1518-09-25 00:04] Guard #2011 begins shift\n" +
                "[1518-03-01 00:24] falls asleep\n" +
                "[1518-11-06 00:57] wakes up\n" +
                "[1518-08-27 00:42] wakes up\n" +
                "[1518-08-18 00:24] falls asleep\n" +
                "[1518-10-28 00:56] wakes up\n" +
                "[1518-09-22 00:01] Guard #727 begins shift\n" +
                "[1518-10-26 00:00] Guard #1433 begins shift\n" +
                "[1518-07-11 00:56] wakes up\n" +
                "[1518-04-02 00:04] Guard #311 begins shift\n" +
                "[1518-03-22 00:58] wakes up\n" +
                "[1518-09-12 00:15] falls asleep\n" +
                "[1518-11-12 23:50] Guard #1657 begins shift\n" +
                "[1518-07-19 00:53] wakes up\n" +
                "[1518-11-21 00:38] falls asleep\n" +
                "[1518-06-17 00:50] wakes up\n" +
                "[1518-04-08 00:59] wakes up\n" +
                "[1518-06-30 00:55] wakes up\n" +
                "[1518-04-20 00:42] wakes up\n" +
                "[1518-03-03 00:57] wakes up\n" +
                "[1518-04-26 00:07] falls asleep\n" +
                "[1518-04-13 00:37] falls asleep\n" +
                "[1518-05-11 00:32] wakes up\n" +
                "[1518-08-02 00:23] falls asleep\n" +
                "[1518-08-17 23:48] Guard #1877 begins shift\n" +
                "[1518-06-11 23:56] Guard #3137 begins shift\n" +
                "[1518-05-03 00:34] falls asleep\n" +
                "[1518-11-09 00:45] wakes up\n" +
                "[1518-05-31 00:39] wakes up\n" +
                "[1518-07-19 23:52] Guard #647 begins shift\n" +
                "[1518-10-08 00:02] Guard #653 begins shift\n" +
                "[1518-07-21 00:51] wakes up\n" +
                "[1518-06-14 00:56] wakes up\n" +
                "[1518-05-03 00:24] wakes up\n" +
                "[1518-05-14 00:40] falls asleep\n" +
                "[1518-09-17 00:48] falls asleep\n" +
                "[1518-08-21 00:53] falls asleep\n" +
                "[1518-11-20 00:12] wakes up\n" +
                "[1518-09-03 00:57] wakes up\n" +
                "[1518-04-22 00:55] wakes up\n" +
                "[1518-06-08 00:24] falls asleep\n" +
                "[1518-04-06 00:59] wakes up\n" +
                "[1518-08-22 00:26] falls asleep\n" +
                "[1518-03-13 00:18] falls asleep\n" +
                "[1518-03-29 00:37] wakes up\n" +
                "[1518-06-21 00:48] falls asleep\n" +
                "[1518-09-02 00:23] falls asleep\n" +
                "[1518-08-29 23:50] Guard #653 begins shift\n" +
                "[1518-03-22 00:36] falls asleep\n" +
                "[1518-05-14 00:31] wakes up\n" +
                "[1518-09-13 00:49] wakes up\n" +
                "[1518-08-05 00:35] falls asleep\n" +
                "[1518-05-24 00:40] wakes up\n" +
                "[1518-05-18 00:27] falls asleep\n" +
                "[1518-03-20 00:04] Guard #653 begins shift\n" +
                "[1518-06-19 00:04] Guard #653 begins shift\n" +
                "[1518-03-24 00:30] falls asleep\n" +
                "[1518-03-28 00:55] wakes up\n" +
                "[1518-11-19 23:52] Guard #2719 begins shift\n" +
                "[1518-09-15 00:01] falls asleep\n" +
                "[1518-04-28 00:44] wakes up\n" +
                "[1518-09-23 00:08] falls asleep\n" +
                "[1518-09-20 00:56] falls asleep\n" +
                "[1518-03-06 00:44] wakes up\n" +
                "[1518-11-07 00:25] falls asleep\n" +
                "[1518-06-26 23:56] Guard #1193 begins shift\n" +
                "[1518-07-11 23:59] Guard #653 begins shift\n" +
                "[1518-04-01 00:00] Guard #727 begins shift\n" +
                "[1518-03-15 00:32] falls asleep\n" +
                "[1518-09-21 00:11] falls asleep\n" +
                "[1518-03-11 23:58] Guard #1129 begins shift\n" +
                "[1518-07-24 00:38] falls asleep\n" +
                "[1518-06-21 00:59] wakes up\n" +
                "[1518-04-13 00:01] Guard #2503 begins shift\n" +
                "[1518-05-08 00:46] wakes up\n" +
                "[1518-04-14 00:04] Guard #2011 begins shift\n" +
                "[1518-10-12 00:39] falls asleep\n" +
                "[1518-10-29 00:07] falls asleep\n" +
                "[1518-08-26 00:28] wakes up\n" +
                "[1518-04-03 23:59] Guard #1657 begins shift\n" +
                "[1518-05-13 00:52] wakes up\n" +
                "[1518-11-03 00:59] wakes up\n" +
                "[1518-08-05 00:27] wakes up\n" +
                "[1518-03-12 23:56] Guard #3137 begins shift\n" +
                "[1518-04-21 00:35] falls asleep\n" +
                "[1518-06-30 23:53] Guard #853 begins shift\n" +
                "[1518-06-09 23:58] Guard #1949 begins shift\n" +
                "[1518-06-18 00:00] Guard #853 begins shift\n" +
                "[1518-09-19 00:43] falls asleep\n" +
                "[1518-10-30 00:58] wakes up\n" +
                "[1518-08-31 00:02] Guard #3137 begins shift\n" +
                "[1518-05-19 00:24] falls asleep\n" +
                "[1518-05-10 00:52] falls asleep\n" +
                "[1518-07-04 00:27] falls asleep\n" +
                "[1518-06-02 00:26] falls asleep\n" +
                "[1518-11-09 00:03] Guard #653 begins shift\n" +
                "[1518-08-07 00:48] wakes up\n" +
                "[1518-08-16 23:51] Guard #311 begins shift\n" +
                "[1518-07-26 00:04] Guard #727 begins shift\n" +
                "[1518-04-27 00:41] falls asleep\n" +
                "[1518-05-24 00:39] falls asleep\n" +
                "[1518-05-20 00:23] wakes up\n" +
                "[1518-05-04 00:03] Guard #3137 begins shift\n" +
                "[1518-03-09 00:05] falls asleep\n" +
                "[1518-04-18 00:52] wakes up\n" +
                "[1518-08-17 00:04] falls asleep\n" +
                "[1518-09-08 00:41] falls asleep\n" +
                "[1518-04-14 23:56] Guard #1129 begins shift\n" +
                "[1518-03-30 23:59] Guard #1193 begins shift\n" +
                "[1518-07-14 00:53] wakes up\n" +
                "[1518-06-16 00:02] Guard #2503 begins shift\n" +
                "[1518-09-11 00:55] wakes up\n" +
                "[1518-07-18 00:45] wakes up\n" +
                "[1518-05-10 00:43] falls asleep\n" +
                "[1518-09-22 00:54] wakes up\n" +
                "[1518-07-29 00:39] wakes up\n" +
                "[1518-08-20 00:19] falls asleep\n" +
                "[1518-05-15 00:30] falls asleep\n" +
                "[1518-04-11 00:29] wakes up\n" +
                "[1518-10-25 00:00] Guard #647 begins shift\n" +
                "[1518-07-22 00:46] wakes up\n" +
                "[1518-09-20 23:57] Guard #653 begins shift\n" +
                "[1518-05-25 00:03] Guard #727 begins shift\n" +
                "[1518-03-23 00:30] falls asleep\n" +
                "[1518-06-04 00:25] wakes up\n" +
                "[1518-07-09 00:12] falls asleep\n" +
                "[1518-10-03 00:03] wakes up\n" +
                "[1518-08-03 00:13] falls asleep\n" +
                "[1518-09-22 00:58] wakes up\n" +
                "[1518-03-09 00:34] wakes up\n" +
                "[1518-07-29 00:00] falls asleep\n" +
                "[1518-11-04 00:11] falls asleep\n" +
                "[1518-10-15 00:01] Guard #1433 begins shift\n" +
                "[1518-06-02 00:52] wakes up\n" +
                "[1518-03-29 00:46] wakes up\n" +
                "[1518-10-28 00:48] falls asleep\n" +
                "[1518-07-16 23:47] Guard #2011 begins shift\n" +
                "[1518-04-14 00:14] falls asleep\n" +
                "[1518-06-09 00:48] falls asleep\n" +
                "[1518-08-11 00:52] wakes up\n" +
                "[1518-03-04 00:49] wakes up\n" +
                "[1518-03-19 00:49] wakes up\n" +
                "[1518-08-29 00:33] wakes up\n" +
                "[1518-08-25 23:56] Guard #1193 begins shift\n" +
                "[1518-06-24 00:40] falls asleep\n" +
                "[1518-11-01 00:04] Guard #647 begins shift\n" +
                "[1518-07-03 00:08] falls asleep\n" +
                "[1518-10-24 00:40] falls asleep\n" +
                "[1518-04-10 00:03] Guard #2579 begins shift\n" +
                "[1518-07-04 00:07] falls asleep\n" +
                "[1518-06-10 00:14] falls asleep\n" +
                "[1518-06-08 00:36] falls asleep\n" +
                "[1518-08-07 00:38] wakes up\n" +
                "[1518-08-13 00:59] wakes up\n" +
                "[1518-09-11 00:01] falls asleep\n" +
                "[1518-02-26 00:58] wakes up\n" +
                "[1518-05-18 00:00] Guard #3499 begins shift\n" +
                "[1518-08-05 00:24] falls asleep\n" +
                "[1518-05-15 00:48] falls asleep\n" +
                "[1518-09-24 00:39] wakes up\n" +
                "[1518-11-01 00:26] falls asleep\n" +
                "[1518-04-05 00:24] falls asleep\n" +
                "[1518-07-06 23:46] Guard #1129 begins shift\n" +
                "[1518-05-14 23:57] Guard #2719 begins shift\n" +
                "[1518-03-21 00:33] wakes up\n" +
                "[1518-09-28 00:19] falls asleep\n" +
                "[1518-04-19 00:04] Guard #223 begins shift\n" +
                "[1518-06-28 00:50] wakes up\n" +
                "[1518-08-23 00:11] falls asleep\n" +
                "[1518-10-04 00:07] falls asleep\n" +
                "[1518-02-28 00:06] falls asleep\n" +
                "[1518-04-19 00:32] wakes up\n" +
                "[1518-03-21 00:42] wakes up\n" +
                "[1518-06-12 00:58] wakes up\n" +
                "[1518-06-09 00:01] Guard #223 begins shift\n" +
                "[1518-07-17 00:00] falls asleep\n" +
                "[1518-06-27 00:21] falls asleep\n" +
                "[1518-05-15 00:56] wakes up\n" +
                "[1518-03-05 00:39] wakes up\n" +
                "[1518-06-25 00:03] Guard #1657 begins shift\n" +
                "[1518-08-01 00:00] Guard #1657 begins shift\n" +
                "[1518-09-10 00:46] wakes up\n" +
                "[1518-08-16 00:50] wakes up\n" +
                "[1518-07-14 00:02] Guard #3499 begins shift\n" +
                "[1518-03-26 00:52] wakes up\n" +
                "[1518-06-25 00:13] falls asleep\n" +
                "[1518-11-04 23:50] Guard #3137 begins shift\n" +
                "[1518-08-08 23:57] Guard #1181 begins shift\n" +
                "[1518-10-13 00:40] wakes up\n" +
                "[1518-09-30 00:07] falls asleep\n" +
                "[1518-03-05 00:17] wakes up\n" +
                "[1518-03-29 00:57] wakes up\n" +
                "[1518-08-08 00:59] wakes up\n" +
                "[1518-08-21 00:05] falls asleep\n" +
                "[1518-09-23 00:04] Guard #3499 begins shift\n" +
                "[1518-03-30 00:19] wakes up\n" +
                "[1518-10-21 23:58] Guard #1129 begins shift\n" +
                "[1518-08-10 00:11] falls asleep\n" +
                "[1518-04-02 00:51] falls asleep\n" +
                "[1518-04-10 00:33] wakes up\n" +
                "[1518-03-17 00:44] wakes up\n" +
                "[1518-04-18 00:32] wakes up\n" +
                "[1518-05-09 00:13] falls asleep\n" +
                "[1518-11-03 00:26] wakes up\n" +
                "[1518-05-06 00:58] wakes up\n" +
                "[1518-04-30 00:14] falls asleep\n" +
                "[1518-09-01 23:59] Guard #2503 begins shift\n" +
                "[1518-03-26 00:00] falls asleep\n" +
                "[1518-03-24 00:52] falls asleep\n" +
                "[1518-07-16 00:47] wakes up\n" +
                "[1518-09-18 00:04] Guard #1657 begins shift\n" +
                "[1518-05-31 00:58] wakes up\n" +
                "[1518-04-23 00:17] falls asleep\n" +
                "[1518-06-23 00:00] Guard #853 begins shift\n" +
                "[1518-08-13 00:02] Guard #223 begins shift\n" +
                "[1518-06-20 00:01] Guard #3467 begins shift\n" +
                "[1518-09-05 00:44] wakes up\n" +
                "[1518-05-05 00:48] wakes up\n" +
                "[1518-11-01 00:50] falls asleep\n" +
                "[1518-10-24 00:55] wakes up\n" +
                "[1518-08-29 00:58] wakes up\n" +
                "[1518-03-03 00:03] Guard #223 begins shift\n" +
                "[1518-08-04 00:42] falls asleep\n" +
                "[1518-04-18 00:48] falls asleep\n" +
                "[1518-07-07 00:39] falls asleep\n" +
                "[1518-04-04 23:57] Guard #2503 begins shift\n" +
                "[1518-04-03 00:55] wakes up\n" +
                "[1518-09-22 00:53] falls asleep\n" +
                "[1518-08-08 00:02] Guard #3467 begins shift\n" +
                "[1518-06-13 00:01] Guard #1129 begins shift\n" +
                "[1518-09-21 00:31] wakes up\n" +
                "[1518-08-01 00:24] falls asleep\n" +
                "[1518-10-29 00:40] wakes up\n" +
                "[1518-03-22 00:28] falls asleep\n" +
                "[1518-03-22 00:30] wakes up\n" +
                "[1518-10-19 00:03] falls asleep\n" +
                "[1518-04-03 00:51] falls asleep\n" +
                "[1518-08-30 00:55] wakes up\n" +
                "[1518-09-25 00:47] wakes up\n" +
                "[1518-09-09 23:56] Guard #1657 begins shift\n" +
                "[1518-10-15 00:09] falls asleep\n" +
                "[1518-05-16 00:42] wakes up\n" +
                "[1518-08-30 00:43] wakes up\n" +
                "[1518-05-01 00:00] falls asleep\n" +
                "[1518-08-22 00:02] Guard #653 begins shift\n" +
                "[1518-08-24 00:55] wakes up\n" +
                "[1518-09-02 00:39] falls asleep\n" +
                "[1518-03-31 00:41] wakes up\n" +
                "[1518-06-08 00:38] wakes up\n" +
                "[1518-10-11 00:59] wakes up\n" +
                "[1518-11-20 00:00] falls asleep\n" +
                "[1518-08-23 23:56] Guard #2719 begins shift\n" +
                "[1518-11-11 00:04] falls asleep\n" +
                "[1518-09-03 00:52] wakes up\n" +
                "[1518-04-05 00:48] falls asleep\n" +
                "[1518-11-18 00:51] wakes up\n" +
                "[1518-09-26 00:17] falls asleep\n" +
                "[1518-05-29 23:47] Guard #1657 begins shift\n" +
                "[1518-06-23 00:48] wakes up\n" +
                "[1518-08-06 00:37] wakes up\n" +
                "[1518-08-24 00:21] falls asleep\n" +
                "[1518-07-28 00:53] wakes up\n" +
                "[1518-04-07 00:10] falls asleep\n" +
                "[1518-07-27 00:36] wakes up\n" +
                "[1518-08-24 23:58] Guard #727 begins shift\n" +
                "[1518-09-09 00:04] falls asleep\n" +
                "[1518-04-12 00:57] wakes up\n" +
                "[1518-06-24 00:27] falls asleep\n" +
                "[1518-06-29 00:02] Guard #1949 begins shift\n" +
                "[1518-05-29 00:01] Guard #727 begins shift\n" +
                "[1518-05-10 00:03] Guard #3467 begins shift\n" +
                "[1518-07-27 00:00] Guard #647 begins shift\n" +
                "[1518-09-15 00:48] wakes up\n" +
                "[1518-06-24 00:04] Guard #727 begins shift\n" +
                "[1518-05-26 00:19] falls asleep\n" +
                "[1518-10-26 00:50] wakes up\n" +
                "[1518-05-16 00:00] Guard #1657 begins shift\n" +
                "[1518-11-06 00:50] wakes up\n" +
                "[1518-06-19 00:43] falls asleep\n" +
                "[1518-04-09 00:46] wakes up\n" +
                "[1518-10-16 00:27] wakes up\n" +
                "[1518-06-07 00:10] falls asleep\n" +
                "[1518-04-11 00:59] wakes up\n" +
                "[1518-09-23 00:45] wakes up\n" +
                "[1518-08-29 00:47] falls asleep\n" +
                "[1518-09-25 00:42] falls asleep\n" +
                "[1518-04-05 23:46] Guard #1129 begins shift\n" +
                "[1518-05-04 00:59] wakes up\n" +
                "[1518-08-22 00:28] wakes up\n" +
                "[1518-05-02 00:47] falls asleep\n" +
                "[1518-10-07 00:51] falls asleep\n" +
                "[1518-09-30 00:47] falls asleep\n" +
                "[1518-07-12 00:31] falls asleep\n" +
                "[1518-03-07 23:50] Guard #1193 begins shift\n" +
                "[1518-08-03 00:03] Guard #2719 begins shift\n" +
                "[1518-10-06 00:57] wakes up\n" +
                "[1518-02-26 00:11] falls asleep\n" +
                "[1518-03-27 00:10] falls asleep\n" +
                "[1518-05-10 00:44] wakes up\n" +
                "[1518-05-13 23:53] Guard #727 begins shift\n" +
                "[1518-04-14 00:54] wakes up\n" +
                "[1518-10-05 00:44] wakes up\n" +
                "[1518-10-30 00:12] falls asleep\n" +
                "[1518-09-08 23:54] Guard #2503 begins shift\n" +
                "[1518-03-28 00:05] falls asleep\n" +
                "[1518-05-17 00:32] wakes up\n" +
                "[1518-09-29 00:54] wakes up\n" +
                "[1518-10-31 00:01] Guard #1193 begins shift\n" +
                "[1518-10-23 00:36] wakes up\n" +
                "[1518-05-03 00:06] falls asleep\n" +
                "[1518-09-16 00:54] wakes up\n" +
                "[1518-07-27 00:56] wakes up\n" +
                "[1518-08-01 00:25] wakes up\n" +
                "[1518-08-12 00:46] wakes up\n" +
                "[1518-07-24 00:51] falls asleep\n" +
                "[1518-04-28 00:28] wakes up\n" +
                "[1518-04-12 00:23] falls asleep\n" +
                "[1518-05-12 00:34] falls asleep\n" +
                "[1518-04-24 00:57] wakes up\n" +
                "[1518-06-15 00:14] falls asleep\n" +
                "[1518-06-22 00:18] wakes up\n" +
                "[1518-09-07 23:58] Guard #853 begins shift\n" +
                "[1518-09-01 00:03] falls asleep\n" +
                "[1518-08-06 00:30] falls asleep\n" +
                "[1518-07-05 00:48] wakes up\n" +
                "[1518-04-07 00:22] wakes up\n" +
                "[1518-05-22 23:56] Guard #2579 begins shift\n" +
                "[1518-07-21 00:04] Guard #223 begins shift\n" +
                "[1518-08-22 00:31] falls asleep\n" +
                "[1518-08-30 00:52] falls asleep\n" +
                "[1518-07-05 00:03] Guard #1129 begins shift\n" +
                "[1518-11-10 00:35] falls asleep\n" +
                "[1518-09-20 00:03] Guard #3499 begins shift\n" +
                "[1518-05-25 23:56] Guard #1877 begins shift\n" +
                "[1518-09-20 00:51] wakes up\n" +
                "[1518-11-21 00:00] falls asleep\n" +
                "[1518-05-07 00:24] wakes up\n" +
                "[1518-05-03 00:46] wakes up\n" +
                "[1518-10-17 23:59] Guard #2579 begins shift\n" +
                "[1518-03-12 00:45] wakes up\n" +
                "[1518-05-21 00:01] Guard #3467 begins shift\n" +
                "[1518-06-28 00:43] falls asleep\n" +
                "[1518-06-21 00:51] wakes up\n" +
                "[1518-04-01 00:26] wakes up\n" +
                "[1518-07-16 00:04] Guard #223 begins shift\n" +
                "[1518-08-11 00:30] falls asleep\n" +
                "[1518-07-17 00:56] falls asleep\n" +
                "[1518-08-27 00:27] falls asleep\n" +
                "[1518-10-22 00:22] wakes up\n" +
                "[1518-07-17 00:53] wakes up\n" +
                "[1518-10-08 00:55] falls asleep\n" +
                "[1518-10-08 00:41] falls asleep\n" +
                "[1518-05-11 23:58] Guard #647 begins shift\n" +
                "[1518-03-15 00:39] wakes up\n" +
                "[1518-03-27 23:51] Guard #1877 begins shift\n" +
                "[1518-11-10 00:03] Guard #1877 begins shift\n" +
                "[1518-07-12 00:49] falls asleep\n" +
                "[1518-04-19 00:48] falls asleep\n" +
                "[1518-05-22 00:02] Guard #761 begins shift\n" +
                "[1518-09-03 00:00] Guard #647 begins shift\n" +
                "[1518-10-14 00:53] wakes up\n" +
                "[1518-05-05 23:50] Guard #647 begins shift\n" +
                "[1518-11-03 00:54] falls asleep\n" +
                "[1518-03-31 00:56] wakes up\n" +
                "[1518-09-23 00:44] falls asleep\n" +
                "[1518-04-11 00:32] falls asleep\n" +
                "[1518-07-11 00:17] falls asleep\n" +
                "[1518-10-18 00:58] wakes up\n" +
                "[1518-04-20 23:56] Guard #853 begins shift\n" +
                "[1518-09-02 00:26] wakes up\n" +
                "[1518-07-15 00:04] Guard #2011 begins shift\n" +
                "[1518-04-24 00:03] Guard #647 begins shift\n" +
                "[1518-05-03 00:54] falls asleep\n" +
                "[1518-03-16 23:56] Guard #647 begins shift\n" +
                "[1518-03-03 23:57] Guard #3467 begins shift\n" +
                "[1518-07-19 00:00] Guard #1129 begins shift\n" +
                "[1518-06-03 00:51] wakes up\n" +
                "[1518-03-16 00:04] Guard #2011 begins shift\n" +
                "[1518-02-25 00:20] falls asleep\n" +
                "[1518-04-05 00:49] wakes up\n" +
                "[1518-03-06 00:42] falls asleep\n" +
                "[1518-03-30 00:06] falls asleep\n" +
                "[1518-04-13 00:15] falls asleep\n" +
                "[1518-07-18 00:29] falls asleep\n" +
                "[1518-06-06 00:21] falls asleep\n" +
                "[1518-07-21 00:37] falls asleep\n" +
                "[1518-06-10 00:46] wakes up\n" +
                "[1518-07-31 00:56] wakes up\n" +
                "[1518-09-24 00:02] Guard #3499 begins shift\n" +
                "[1518-04-07 00:37] falls asleep\n" +
                "[1518-05-22 00:44] falls asleep\n" +
                "[1518-10-18 23:48] Guard #2011 begins shift\n" +
                "[1518-09-07 00:04] Guard #3089 begins shift\n" +
                "[1518-09-27 00:32] falls asleep\n" +
                "[1518-03-28 00:37] wakes up\n" +
                "[1518-07-10 00:31] falls asleep\n" +
                "[1518-08-25 00:31] wakes up\n" +
                "[1518-10-20 00:01] Guard #2011 begins shift\n" +
                "[1518-07-23 00:53] wakes up\n" +
                "[1518-04-29 00:00] Guard #1657 begins shift\n" +
                "[1518-05-27 00:51] wakes up\n" +
                "[1518-03-21 00:26] falls asleep\n" +
                "[1518-06-17 00:01] Guard #3137 begins shift\n" +
                "[1518-11-04 00:59] wakes up\n" +
                "[1518-07-09 00:55] wakes up\n" +
                "[1518-03-17 00:13] falls asleep\n" +
                "[1518-09-28 00:51] wakes up\n" +
                "[1518-08-10 00:04] Guard #1877 begins shift\n" +
                "[1518-04-15 00:56] wakes up\n" +
                "[1518-04-08 00:39] falls asleep\n" +
                "[1518-06-29 00:46] wakes up\n" +
                "[1518-02-26 23:59] Guard #223 begins shift\n" +
                "[1518-09-26 00:39] wakes up\n" +
                "[1518-08-23 00:02] Guard #2719 begins shift\n" +
                "[1518-07-03 00:49] falls asleep\n" +
                "[1518-03-27 00:39] wakes up\n" +
                "[1518-09-14 00:01] Guard #3137 begins shift\n" +
                "[1518-07-08 00:53] wakes up\n" +
                "[1518-08-18 00:02] falls asleep\n" +
                "[1518-06-03 00:34] falls asleep\n" +
                "[1518-08-27 00:00] Guard #1877 begins shift\n" +
                "[1518-04-07 00:57] wakes up\n" +
                "[1518-05-27 00:00] Guard #1193 begins shift\n" +
                "[1518-04-30 00:52] wakes up\n" +
                "[1518-03-03 00:31] falls asleep\n" +
                "[1518-06-06 00:04] Guard #2579 begins shift\n" +
                "[1518-07-29 00:25] wakes up\n" +
                "[1518-06-29 00:08] falls asleep\n" +
                "[1518-05-03 00:57] wakes up\n" +
                "[1518-06-19 00:56] wakes up\n" +
                "[1518-06-27 00:52] wakes up\n" +
                "[1518-07-03 00:00] Guard #1433 begins shift\n" +
                "[1518-04-29 00:31] falls asleep\n" +
                "[1518-08-15 23:57] Guard #2011 begins shift\n" +
                "[1518-05-05 00:04] Guard #2011 begins shift\n" +
                "[1518-10-04 23:57] Guard #727 begins shift\n" +
                "[1518-08-04 00:00] Guard #311 begins shift\n" +
                "[1518-07-25 00:41] wakes up\n" +
                "[1518-08-20 23:52] Guard #727 begins shift\n" +
                "[1518-10-21 00:00] Guard #1949 begins shift\n" +
                "[1518-04-22 00:34] falls asleep\n" +
                "[1518-11-12 00:42] falls asleep\n" +
                "[1518-03-07 00:33] falls asleep\n" +
                "[1518-04-06 00:05] falls asleep\n" +
                "[1518-04-08 00:54] falls asleep\n" +
                "[1518-07-24 23:58] Guard #727 begins shift\n" +
                "[1518-08-03 00:51] wakes up\n" +
                "[1518-08-04 00:58] wakes up\n" +
                "[1518-04-09 00:30] falls asleep\n" +
                "[1518-09-23 00:41] wakes up\n" +
                "[1518-03-23 00:56] falls asleep\n" +
                "[1518-04-23 00:49] falls asleep\n" +
                "[1518-10-14 00:48] falls asleep\n" +
                "[1518-04-08 23:56] Guard #1129 begins shift\n" +
                "[1518-05-12 00:57] wakes up\n" +
                "[1518-10-19 00:56] wakes up\n" +
                "[1518-11-06 00:53] falls asleep\n" +
                "[1518-06-11 00:48] wakes up\n" +
                "[1518-11-03 00:47] wakes up\n" +
                "[1518-10-12 00:32] wakes up\n" +
                "[1518-03-12 00:14] falls asleep\n" +
                "[1518-11-22 00:20] falls asleep\n" +
                "[1518-06-03 00:35] wakes up\n" +
                "[1518-05-27 23:57] Guard #1129 begins shift\n" +
                "[1518-11-03 23:59] Guard #647 begins shift\n" +
                "[1518-06-06 00:29] wakes up\n" +
                "[1518-07-30 00:00] Guard #3499 begins shift\n" +
                "[1518-04-25 00:44] falls asleep\n" +
                "[1518-04-10 00:57] falls asleep\n" +
                "[1518-09-13 00:38] falls asleep\n" +
                "[1518-10-04 00:50] wakes up\n" +
                "[1518-06-01 23:56] Guard #223 begins shift\n" +
                "[1518-06-09 00:59] wakes up\n" +
                "[1518-10-18 00:06] falls asleep\n" +
                "[1518-09-29 00:10] falls asleep\n" +
                "[1518-04-19 00:22] falls asleep\n" +
                "[1518-10-15 00:48] falls asleep\n" +
                "[1518-11-18 00:41] wakes up\n" +
                "[1518-02-27 00:30] wakes up\n" +
                "[1518-04-27 23:58] Guard #2719 begins shift\n" +
                "[1518-03-11 00:00] Guard #1657 begins shift\n" +
                "[1518-11-14 00:43] wakes up\n" +
                "[1518-04-29 00:57] wakes up\n" +
                "[1518-10-21 00:29] falls asleep\n" +
                "[1518-11-07 23:58] Guard #2719 begins shift\n" +
                "[1518-10-06 00:03] Guard #761 begins shift\n" +
                "[1518-03-16 00:47] falls asleep\n" +
                "[1518-07-10 00:02] Guard #1193 begins shift\n" +
                "[1518-04-27 00:47] wakes up\n" +
                "[1518-09-12 00:42] falls asleep\n" +
                "[1518-04-17 00:58] wakes up\n" +
                "[1518-08-18 00:32] wakes up\n" +
                "[1518-07-13 00:22] falls asleep\n" +
                "[1518-07-27 00:14] falls asleep\n" +
                "[1518-07-23 00:00] falls asleep\n" +
                "[1518-10-19 00:30] falls asleep\n" +
                "[1518-04-28 00:17] falls asleep\n" +
                "[1518-05-16 23:56] Guard #1949 begins shift\n" +
                "[1518-09-18 00:40] wakes up\n" +
                "[1518-09-28 00:00] Guard #727 begins shift\n" +
                "[1518-03-01 00:49] wakes up\n" +
                "[1518-07-27 23:56] Guard #311 begins shift\n" +
                "[1518-03-10 00:48] wakes up\n" +
                "[1518-03-09 00:41] falls asleep\n" +
                "[1518-04-25 00:03] Guard #2011 begins shift\n" +
                "[1518-06-26 00:31] wakes up\n" +
                "[1518-09-10 00:11] falls asleep\n" +
                "[1518-04-16 00:56] wakes up\n" +
                "[1518-03-29 00:44] falls asleep\n" +
                "[1518-05-14 00:44] wakes up\n" +
                "[1518-05-13 00:37] wakes up\n" +
                "[1518-03-23 00:59] wakes up\n" +
                "[1518-06-15 00:03] Guard #653 begins shift\n" +
                "[1518-04-15 00:07] falls asleep\n" +
                "[1518-02-26 00:37] falls asleep\n" +
                "[1518-02-28 00:00] Guard #3499 begins shift\n" +
                "[1518-11-17 00:32] falls asleep\n" +
                "[1518-04-14 00:48] falls asleep\n" +
                "[1518-11-06 00:48] falls asleep\n" +
                "[1518-06-26 00:00] Guard #653 begins shift\n" +
                "[1518-09-24 00:15] falls asleep\n" +
                "[1518-11-05 00:40] wakes up\n" +
                "[1518-11-18 00:11] falls asleep\n" +
                "[1518-11-14 00:28] falls asleep\n" +
                "[1518-08-08 00:17] falls asleep\n" +
                "[1518-03-07 00:01] Guard #1949 begins shift\n" +
                "[1518-07-10 00:32] wakes up\n" +
                "[1518-03-10 00:25] falls asleep\n" +
                "[1518-07-23 23:57] Guard #1433 begins shift\n" +
                "[1518-05-13 00:48] falls asleep\n" +
                "[1518-10-16 00:23] falls asleep\n" +
                "[1518-10-10 00:44] falls asleep\n" +
                "[1518-03-26 23:59] Guard #223 begins shift\n" +
                "[1518-03-19 00:03] Guard #1129 begins shift\n" +
                "[1518-08-14 00:02] falls asleep\n" +
                "[1518-05-27 00:29] falls asleep\n" +
                "[1518-04-04 00:37] falls asleep\n" +
                "[1518-03-30 00:54] wakes up\n" +
                "[1518-10-04 00:53] falls asleep\n" +
                "[1518-10-26 00:25] falls asleep\n" +
                "[1518-06-05 00:17] falls asleep\n" +
                "[1518-11-18 00:45] falls asleep\n" +
                "[1518-05-02 00:28] falls asleep\n" +
                "[1518-02-26 00:19] wakes up\n" +
                "[1518-03-17 23:59] Guard #3467 begins shift\n" +
                "[1518-04-28 00:31] falls asleep\n" +
                "[1518-07-08 00:03] Guard #1193 begins shift\n" +
                "[1518-10-18 00:26] falls asleep\n" +
                "[1518-04-21 00:58] wakes up\n" +
                "[1518-03-23 00:42] wakes up\n" +
                "[1518-10-07 00:59] wakes up\n" +
                "[1518-09-20 00:50] falls asleep\n" +
                "[1518-03-08 23:52] Guard #761 begins shift\n" +
                "[1518-11-07 00:52] wakes up\n" +
                "[1518-08-19 00:47] wakes up\n" +
                "[1518-05-19 00:29] wakes up\n" +
                "[1518-09-19 00:16] wakes up\n" +
                "[1518-10-23 00:51] falls asleep\n" +
                "[1518-07-05 00:19] wakes up\n" +
                "[1518-04-08 00:50] wakes up\n" +
                "[1518-11-17 00:58] wakes up\n" +
                "[1518-07-08 23:56] Guard #1193 begins shift\n" +
                "[1518-11-11 00:19] wakes up\n" +
                "[1518-05-09 00:47] wakes up\n" +
                "[1518-06-13 00:49] wakes up\n" +
                "[1518-10-29 00:00] Guard #223 begins shift\n" +
                "[1518-03-25 00:45] wakes up\n" +
                "[1518-10-28 00:34] falls asleep\n" +
                "[1518-08-05 00:03] Guard #3467 begins shift\n" +
                "[1518-09-30 00:16] wakes up\n" +
                "[1518-05-23 23:58] Guard #2579 begins shift\n" +
                "[1518-08-14 00:52] wakes up\n" +
                "[1518-04-07 00:02] Guard #2503 begins shift\n" +
                "[1518-11-03 00:00] Guard #223 begins shift\n" +
                "[1518-03-08 00:30] falls asleep\n" +
                "[1518-09-22 00:43] wakes up\n" +
                "[1518-10-11 00:04] Guard #3137 begins shift\n" +
                "[1518-07-17 00:57] wakes up\n" +
                "[1518-11-11 00:30] falls asleep\n" +
                "[1518-04-13 00:50] wakes up\n" +
                "[1518-06-24 00:59] wakes up\n" +
                "[1518-10-12 00:25] falls asleep\n" +
                "[1518-04-17 23:57] Guard #223 begins shift\n" +
                "[1518-02-25 23:56] Guard #3499 begins shift\n" +
                "[1518-04-19 23:57] Guard #1193 begins shift\n" +
                "[1518-06-04 00:00] Guard #3499 begins shift\n" +
                "[1518-06-15 00:56] wakes up\n" +
                "[1518-04-24 00:18] falls asleep\n" +
                "[1518-11-10 00:40] wakes up\n" +
                "[1518-08-29 00:03] Guard #223 begins shift\n" +
                "[1518-05-23 00:38] wakes up\n" +
                "[1518-02-26 00:53] falls asleep\n" +
                "[1518-10-21 00:34] wakes up\n" +
                "[1518-03-08 00:05] falls asleep\n" +
                "[1518-03-18 00:18] wakes up\n" +
                "[1518-06-20 00:52] wakes up\n" +
                "[1518-10-08 00:47] wakes up\n" +
                "[1518-10-02 23:52] Guard #2503 begins shift\n" +
                "[1518-07-14 00:13] falls asleep\n" +
                "[1518-04-02 00:52] wakes up\n" +
                "[1518-11-02 00:56] wakes up\n" +
                "[1518-09-03 00:56] falls asleep\n" +
                "[1518-07-28 00:43] wakes up\n" +
                "[1518-04-30 23:46] Guard #1949 begins shift\n" +
                "[1518-06-18 00:57] wakes up\n" +
                "[1518-07-05 23:57] Guard #1433 begins shift\n" +
                "[1518-04-19 00:14] wakes up\n" +
                "[1518-06-16 00:23] wakes up\n" +
                "[1518-04-10 00:58] wakes up\n" +
                "[1518-07-01 23:56] Guard #1433 begins shift\n" +
                "[1518-08-17 00:55] wakes up\n" +
                "[1518-03-21 00:41] falls asleep\n" +
                "[1518-06-01 00:43] wakes up\n" +
                "[1518-04-23 00:58] wakes up\n" +
                "[1518-09-05 00:43] falls asleep\n" +
                "[1518-09-27 00:00] Guard #853 begins shift\n" +
                "[1518-03-04 23:47] Guard #1877 begins shift\n" +
                "[1518-08-15 00:40] falls asleep\n" +
                "[1518-08-12 00:30] falls asleep\n" +
                "[1518-07-12 00:34] wakes up\n" +
                "[1518-11-09 00:36] falls asleep\n" +
                "[1518-09-18 23:58] Guard #1193 begins shift\n" +
                "[1518-10-23 23:58] Guard #1877 begins shift\n" +
                "[1518-06-03 00:00] Guard #1193 begins shift\n" +
                "[1518-03-31 00:32] falls asleep\n" +
                "[1518-05-19 23:49] Guard #2719 begins shift\n" +
                "[1518-07-22 00:38] falls asleep\n" +
                "[1518-10-06 00:44] falls asleep\n" +
                "[1518-05-31 00:54] wakes up\n" +
                "[1518-03-19 00:32] falls asleep\n" +
                "[1518-09-09 00:50] wakes up\n" +
                "[1518-06-30 00:04] Guard #2011 begins shift\n" +
                "[1518-04-15 23:59] Guard #223 begins shift\n" +
                "[1518-08-28 00:29] falls asleep\n" +
                "[1518-07-15 00:46] wakes up\n" +
                "[1518-11-05 00:00] falls asleep\n" +
                "[1518-07-03 00:39] wakes up\n" +
                "[1518-05-16 00:29] falls asleep\n" +
                "[1518-11-15 00:17] falls asleep\n" +
                "[1518-10-15 00:43] wakes up\n" +
                "[1518-02-28 00:53] wakes up\n" +
                "[1518-10-26 23:46] Guard #2503 begins shift\n" +
                "[1518-11-21 00:31] wakes up\n" +
                "[1518-05-02 00:01] Guard #1877 begins shift\n" +
                "[1518-06-29 00:26] wakes up\n" +
                "[1518-08-15 00:35] wakes up\n" +
                "[1518-07-26 00:48] wakes up\n" +
                "[1518-09-06 00:29] falls asleep\n" +
                "[1518-10-23 00:32] falls asleep\n" +
                "[1518-05-02 00:50] wakes up\n" +
                "[1518-05-18 00:46] falls asleep\n" +
                "[1518-05-07 00:13] falls asleep\n" +
                "[1518-11-10 23:51] Guard #1949 begins shift\n" +
                "[1518-07-18 00:00] Guard #1657 begins shift\n" +
                "[1518-02-24 23:58] Guard #853 begins shift\n" +
                "[1518-11-12 00:52] wakes up\n" +
                "[1518-05-12 00:53] falls asleep\n" +
                "[1518-11-11 23:59] Guard #3137 begins shift\n" +
                "[1518-10-04 00:57] wakes up\n" +
                "[1518-09-14 23:49] Guard #761 begins shift\n" +
                "[1518-11-07 00:00] Guard #2011 begins shift\n" +
                "[1518-05-17 00:48] falls asleep\n" +
                "[1518-09-14 00:56] wakes up\n" +
                "[1518-07-01 00:03] falls asleep\n" +
                "[1518-11-02 00:46] falls asleep\n" +
                "[1518-03-11 00:37] wakes up\n" +
                "[1518-10-01 00:04] Guard #2897 begins shift\n" +
                "[1518-09-14 00:55] falls asleep\n" +
                "[1518-09-04 00:03] falls asleep\n" +
                "[1518-03-20 00:44] falls asleep\n" +
                "[1518-08-18 00:47] falls asleep\n" +
                "[1518-10-21 00:24] wakes up\n" +
                "[1518-03-29 23:58] Guard #1657 begins shift\n" +
                "[1518-05-04 00:51] falls asleep\n" +
                "[1518-02-25 00:43] wakes up\n" +
                "[1518-05-31 00:57] falls asleep\n" +
                "[1518-06-13 00:20] falls asleep\n" +
                "[1518-07-07 00:23] wakes up\n" +
                "[1518-10-25 00:50] wakes up\n" +
                "[1518-04-11 00:00] Guard #1949 begins shift\n" +
                "[1518-07-04 00:37] wakes up\n" +
                "[1518-07-30 00:10] falls asleep\n" +
                "[1518-09-03 00:40] falls asleep\n" +
                "[1518-04-29 00:55] falls asleep\n" +
                "[1518-09-13 00:34] wakes up\n" +
                "[1518-03-24 23:59] Guard #761 begins shift\n" +
                "[1518-11-08 00:42] wakes up\n" +
                "[1518-07-30 00:18] falls asleep\n" +
                "[1518-04-10 00:32] falls asleep\n" +
                "[1518-05-14 00:01] falls asleep\n" +
                "[1518-03-11 00:43] falls asleep\n" +
                "[1518-04-02 23:58] Guard #311 begins shift\n" +
                "[1518-07-05 00:32] falls asleep\n" +
                "[1518-03-13 00:41] wakes up\n" +
                "[1518-04-22 00:03] Guard #3467 begins shift\n" +
                "[1518-08-24 00:24] wakes up\n" +
                "[1518-11-22 00:45] wakes up\n" +
                "[1518-06-01 00:04] Guard #1129 begins shift\n" +
                "[1518-10-27 00:30] wakes up\n" +
                "[1518-10-28 00:36] wakes up\n" +
                "[1518-04-12 00:14] wakes up\n" +
                "[1518-09-05 00:58] wakes up\n" +
                "[1518-03-25 23:48] Guard #853 begins shift\n" +
                "[1518-03-01 00:33] wakes up\n" +
                "[1518-08-15 00:12] falls asleep\n" +
                "[1518-04-25 00:50] wakes up\n" +
                "[1518-10-17 00:51] wakes up\n" +
                "[1518-10-07 00:01] falls asleep\n" +
                "[1518-10-30 00:01] Guard #3467 begins shift\n" +
                "[1518-11-20 23:53] Guard #727 begins shift\n" +
                "[1518-03-13 00:49] falls asleep\n" +
                "[1518-08-22 00:58] wakes up\n" +
                "[1518-05-28 00:10] falls asleep\n" +
                "[1518-03-14 00:52] wakes up\n" +
                "[1518-07-05 00:13] falls asleep\n" +
                "[1518-07-13 00:01] Guard #1657 begins shift\n" +
                "[1518-08-31 23:53] Guard #727 begins shift\n" +
                "[1518-04-11 00:09] falls asleep\n" +
                "[1518-11-03 00:23] falls asleep\n" +
                "[1518-06-21 00:03] Guard #311 begins shift\n" +
                "[1518-07-02 00:47] falls asleep\n" +
                "[1518-06-28 00:04] Guard #853 begins shift\n" +
                "[1518-06-25 00:33] wakes up\n" +
                "[1518-03-05 00:00] falls asleep\n" +
                "[1518-10-16 00:00] Guard #3467 begins shift\n" +
                "[1518-10-31 00:28] falls asleep\n" +
                "[1518-06-11 00:41] falls asleep\n" +
                "[1518-04-12 00:09] falls asleep\n" +
                "[1518-07-28 00:46] falls asleep\n" +
                "[1518-06-05 00:24] wakes up\n" +
                "[1518-05-02 23:57] Guard #647 begins shift\n" +
                "[1518-05-30 00:01] falls asleep\n" +
                "[1518-11-14 00:00] Guard #2719 begins shift\n" +
                "[1518-03-02 00:53] wakes up\n" +
                "[1518-09-26 00:04] Guard #727 begins shift\n" +
                "[1518-10-13 00:59] wakes up\n" +
                "[1518-07-31 00:20] wakes up\n" +
                "[1518-10-11 00:47] falls asleep\n" +
                "[1518-03-28 00:42] falls asleep\n" +
                "[1518-04-26 00:32] wakes up\n" +
                "[1518-07-31 00:02] falls asleep\n" +
                "[1518-09-16 00:03] Guard #1877 begins shift\n" +
                "[1518-10-23 00:59] wakes up\n" +
                "[1518-08-31 00:53] wakes up\n" +
                "[1518-05-25 00:46] wakes up\n" +
                "[1518-10-02 00:40] wakes up\n" +
                "[1518-05-08 00:41] falls asleep\n" +
                "[1518-09-17 00:58] wakes up\n" +
                "[1518-08-15 00:00] Guard #1949 begins shift\n" +
                "[1518-08-20 00:03] Guard #223 begins shift\n" +
                "[1518-10-03 23:56] Guard #653 begins shift\n" +
                "[1518-04-12 00:02] Guard #853 begins shift\n" +
                "[1518-08-19 00:05] falls asleep\n" +
                "[1518-07-20 00:51] wakes up\n" +
                "[1518-09-13 00:00] Guard #853 begins shift\n" +
                "[1518-06-29 00:42] falls asleep\n" +
                "[1518-04-13 00:20] wakes up\n" +
                "[1518-05-23 00:26] falls asleep\n" +
                "[1518-03-14 00:18] falls asleep\n" +
                "[1518-08-17 00:13] wakes up\n" +
                "[1518-03-01 23:53] Guard #1877 begins shift\n" +
                "[1518-03-28 23:56] Guard #3467 begins shift\n" +
                "[1518-03-11 00:53] wakes up\n" +
                "[1518-04-11 00:42] wakes up\n" +
                "[1518-07-24 00:48] wakes up\n" +
                "[1518-08-18 00:03] wakes up\n" +
                "[1518-08-23 00:40] wakes up\n" +
                "[1518-08-05 23:57] Guard #1657 begins shift\n" +
                "[1518-05-17 00:49] wakes up\n" +
                "[1518-03-09 23:59] Guard #647 begins shift\n" +
                "[1518-05-12 00:45] wakes up\n" +
                "[1518-07-27 00:55] falls asleep\n" +
                "[1518-09-02 00:45] wakes up\n" +
                "[1518-09-29 00:02] Guard #311 begins shift\n" +
                "[1518-06-05 00:59] wakes up\n" +
                "[1518-09-12 00:48] wakes up\n" +
                "[1518-11-16 00:02] Guard #1433 begins shift\n" +
                "[1518-11-01 00:37] wakes up\n" +
                "[1518-06-26 00:10] falls asleep\n" +
                "[1518-06-21 00:56] falls asleep\n" +
                "[1518-04-30 00:00] Guard #3137 begins shift\n" +
                "[1518-08-12 00:02] Guard #2503 begins shift\n" +
                "[1518-10-07 00:10] wakes up\n" +
                "[1518-03-05 00:36] falls asleep\n" +
                "[1518-04-17 00:33] falls asleep\n" +
                "[1518-11-16 23:56] Guard #1657 begins shift\n" +
                "[1518-10-12 00:46] wakes up\n" +
                "[1518-03-16 00:58] wakes up\n" +
                "[1518-09-27 00:53] wakes up\n" +
                "[1518-03-20 23:58] Guard #2579 begins shift\n" +
                "[1518-04-26 23:59] Guard #311 begins shift\n" +
                "[1518-05-11 00:14] falls asleep\n" +
                "[1518-10-02 00:19] falls asleep\n" +
                "[1518-04-16 00:43] falls asleep\n" +
                "[1518-08-15 00:54] wakes up\n" +
                "[1518-08-21 00:28] wakes up\n" +
                "[1518-03-19 00:24] wakes up\n" +
                "[1518-05-24 00:14] wakes up\n" +
                "[1518-03-29 00:08] falls asleep\n" +
                "[1518-06-17 00:16] falls asleep\n" +
                "[1518-08-26 00:38] falls asleep\n" +
                "[1518-11-11 00:50] wakes up\n" +
                "[1518-09-13 00:25] falls asleep\n" +
                "[1518-08-07 00:41] falls asleep\n" +
                "[1518-11-16 00:59] wakes up\n" +
                "[1518-04-04 00:28] falls asleep\n" +
                "[1518-11-16 00:50] falls asleep\n" +
                "[1518-04-01 00:25] falls asleep\n" +
                "[1518-10-03 00:00] falls asleep\n" +
                "[1518-06-16 00:10] falls asleep\n" +
                "[1518-08-16 00:44] falls asleep\n" +
                "[1518-05-30 23:59] Guard #2503 begins shift\n" +
                "[1518-05-25 00:15] falls asleep\n" +
                "[1518-06-22 00:45] falls asleep\n" +
                "[1518-10-17 00:06] falls asleep\n" +
                "[1518-03-14 23:57] Guard #2503 begins shift\n" +
                "[1518-05-06 00:00] falls asleep\n" +
                "[1518-10-16 23:57] Guard #2719 begins shift\n" +
                "[1518-06-08 00:04] Guard #2719 begins shift\n" +
                "[1518-04-16 23:58] Guard #2579 begins shift\n" +
                "[1518-09-04 23:56] Guard #2011 begins shift\n" +
                "[1518-06-18 00:25] falls asleep\n" +
                "[1518-04-05 00:42] wakes up\n" +
                "[1518-08-18 00:50] wakes up\n" +
                "[1518-10-09 00:21] falls asleep\n" +
                "[1518-07-30 00:14] wakes up\n" +
                "[1518-09-19 00:52] wakes up\n" +
                "[1518-07-22 00:02] Guard #1129 begins shift\n" +
                "[1518-05-26 00:59] wakes up\n" +
                "[1518-08-10 00:49] wakes up\n" +
                "[1518-10-21 00:20] falls asleep\n" +
                "[1518-06-01 00:57] wakes up\n" +
                "[1518-10-10 00:03] Guard #311 begins shift\n" +
                "[1518-05-31 00:38] falls asleep\n" +
                "[1518-08-21 00:56] wakes up\n" +
                "[1518-10-03 00:33] falls asleep\n" +
                "[1518-10-08 00:59] wakes up\n" +
                "[1518-08-02 00:49] wakes up\n" +
                "[1518-09-03 23:50] Guard #1129 begins shift\n" +
                "[1518-05-02 00:39] wakes up\n" +
                "[1518-08-26 00:06] falls asleep\n" +
                "[1518-09-22 00:18] falls asleep\n" +
                "[1518-11-05 00:58] wakes up\n" +
                "[1518-07-04 00:01] Guard #1657 begins shift\n" +
                "[1518-06-30 00:45] falls asleep\n" +
                "[1518-02-28 23:56] Guard #727 begins shift\n" +
                "[1518-07-18 00:34] wakes up\n" +
                "[1518-06-06 23:58] Guard #2503 begins shift\n" +
                "[1518-03-05 23:57] Guard #761 begins shift\n" +
                "[1518-08-11 00:01] Guard #2503 begins shift\n" +
                "[1518-03-13 00:55] wakes up");
        assert result == 21083 : "unexpected result is " + result;
        System.out.println(result);
    }

    public static int test(String s) {
        Pattern pattern = Pattern.compile("\\[(\\d+)-(\\d+)-(\\d+) (\\d+):(\\d+)\\] (.+)");
        Pattern guardPattern = Pattern.compile("Guard #(\\d+) begins shift");
        List<Record> records = new ArrayList<>();
        String[] parts = s.split("\n");
        int line = 0;
        for (String part : parts) {
            ++line;
            Matcher matcher = pattern.matcher(part);
            assert matcher.matches() : "not matches: " + part;
            Record record = new Record();
            record.y = Integer.parseInt(matcher.group(1));
            record.m = Integer.parseInt(matcher.group(2));
            record.d = Integer.parseInt(matcher.group(3));
            record.h = Integer.parseInt(matcher.group(4));
            record.min = Integer.parseInt(matcher.group(5));
            String rest = matcher.group(6);
            if (rest.equals("falls asleep")) {
                record.event = Event.falls_asleep;
            } else if (rest.equals("wakes up")) {
                record.event = Event.wakes_up;
            } else {
                Matcher guardMatcher = guardPattern.matcher(rest);
                assert guardMatcher.matches() : "not matches: " + rest;
                record.event = Event.begins_shift;
                int id = Integer.parseInt(guardMatcher.group(1));
                record.id = id;
            }
            records.add(record);
        }
        Collections.sort(records);
        int previousId = 0;
        for (Record record : records) {
            if (record.id == 0) {
                assert previousId != 0 : "invalid id";
                record.id = previousId;
            } else {
                previousId = record.id;
            }
        }

        Map<Integer, Integer> sleepTimeMap = new HashMap<>();
        for (int i = 0; i < records.size(); ++i) {
            Record startRecord = records.get(i);
            int time = 0;
            if (startRecord.event == Event.falls_asleep) {
                for (int j = i + 1; j < records.size(); ++j) {
                    Record endRecord = records.get(j);
                    if (startRecord.id == endRecord.id
                            && endRecord.event == Event.wakes_up) {
                        // inside the one hour
                        time = endRecord.min - startRecord.min;
                        break;
                    }
                }
            }
            int sum = time;
            sleepTimeMap.compute(startRecord.id, (key, val) -> {
                return val == null ? sum : val + sum;
            });
        }
        Map.Entry<Integer, Integer> maxSleepEntry = findMaxEntry(sleepTimeMap);

        Map<Integer, Integer> minutesMap = new HashMap<>();
        for (int i = 0; i < records.size(); ++i) {
            Record record = records.get(i);
            if (record.id == maxSleepEntry.getKey()) {
                int startMin = 0, endMin = 0;
                if (record.event == Event.falls_asleep) {
                    startMin = record.min;
                    for (i += 1; i < records.size(); ++i) {
                        record = records.get(i);
                        if (record.id == maxSleepEntry.getKey()
                                && record.event == Event.wakes_up) {
                            endMin = record.min;
                            break;
                        }
                    }
                }
                for (int j = startMin; j < endMin; ++j) {
                    minutesMap.compute(j, (key, val) -> val == null ? 1 : val + 1);
                }
            }
        }
        Map.Entry<Integer, Integer> maxMinuteEntry = findMaxEntry(minutesMap);

        return maxSleepEntry.getKey() * maxMinuteEntry.getKey();
    }

    private static Map.Entry<Integer, Integer> findMaxEntry(Map<Integer, Integer> map) {
        Map.Entry<Integer, Integer> maxEntry = null;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (maxEntry == null) {
                maxEntry = entry;
            } else {
                if (entry.getValue() > maxEntry.getValue()) {
                    maxEntry = entry;
                }
            }
        }
        return maxEntry;
    }

    private static class Record implements Comparable<Record> {
        int y, m, d, h, min, id;
        Event event;

        @Override
        public int compareTo(Record other) {
            if (y == other.y) {
                if (m == other.m) {
                    if (d == other.d) {
                        if (h == other.h) {
                            return Integer.compare(min, other.min);
                        }
                        return Integer.compare(h, other.h);
                    }
                    return Integer.compare(d, other.d);
                }
                return Integer.compare(m, other.m);
            }
            return Integer.compare(y, other.y);
        }
    }

    private enum Event {falls_asleep, wakes_up, begins_shift}
}
