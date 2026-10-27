package in.slidingwindows.concept;

public class WebsiteVisitors {

    static int websiteVisitors(int[] arr, int days){
        if (arr == null || arr.length < days || days <= 0) {
            return 0;
        }
            int windowSum= 0;

            for(int i = 0; i<days; i++){

                windowSum = windowSum+arr[i];
            }
        int maxVisitors = windowSum;

        System.out.println("Total user visited : "+windowSum);

            for(int j = 1; j<=arr.length-days; j++){

                windowSum = windowSum-arr[j-1]+arr[j+days-1];
                System.out.println("Total user visited : "+windowSum);

                if (windowSum > maxVisitors) {
                    maxVisitors = windowSum;
                }
            }
            return maxVisitors;
    }

    public static void main(String[] args) {

        int[] users = {100,48,82,57,34,112,65};
        int days = 3;
        int result = websiteVisitors(users, days);
        System.out.println(result);
    }
}
