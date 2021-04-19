public class Tester {
    public static void main(String[] args) {

        // Activity 1 method calls
        System.out.println(Review.sentimentVal("awesome"));
        System.out.println(Review.sentimentVal("backed"));
        System.out.println(Review.sentimentVal("decline"));


         //Activity 2 method calls

        double totalSentiment = Review.totalSentiment("SimpleReview.txt");
        System.out.println(totalSentiment);

        int rating = Review.starRating("SimpleReview.txt");
        System.out.println(rating);

        totalSentiment = Review.totalSentiment("PositiveReview.txt");
        System.out.println(totalSentiment);

        rating = Review.starRating("PositiveReview.txt");
        System.out.println(rating);



        String fakeReview = Review.fakeReview("SimpleReview.txt");
        System.out.println(fakeReview);

    }
}
