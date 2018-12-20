package com.kodilla.testing.forum.statistics;

public class Statistics {

  private int usersCount;
  private int postsCount;
  private int commentsCount;

  private double avgUserPosts;
  private double avgUserComments;
  private double avgPostComments;

  public void calculateAdvStatistics(InterfaceStatistic  statistics) {
      usersCount = statistics.usersNames().size();
      postsCount = statistics.postsCount();
      commentsCount = statistics.commentsCount();

      double avgUserPosts;

      if (postsCount > 0 ) {
          avgUserPosts = (double) postsCount / usersCount;
      }else {
          avgUserPosts = 0;
      }

      double avgUserComments ;
      if (usersCount > 0) {
          avgUserComments = commentsCount / (double) usersCount;
      }else {
          avgUserComments = 0;
      }

      double avgPostComments;
      if (commentsCount > 0) {
          avgPostComments = postsCount / (double) commentsCount;
      }else {
          avgPostComments = 0;
      }
  }

  public void showStatistic(Statistics statistics) {
      System.out.println("Ststistics : \n" + "Users Count:\n" + usersCount + "Posts Count:\n" + postsCount + "Comments Count:\n " + commentsCount + "Average posts count per User:\n" +
              avgUserPosts + "Average coments count per user:\n" + avgUserComments + "Average comments count per post:\n" + avgPostComments);

  }

  public int getUsersCount() {

      return usersCount;
  }

  public int getPostsCount() {

      return postsCount;
  }
  public int getCommentsCount() {

      return commentsCount;
  }

  public double getAvgUserPosts() {

      return avgUserPosts; }

  public double getAvgUserComments() {

      return avgUserComments;
  }
  public double getAvgPostComments() {

      return avgPostComments;
  }
}
