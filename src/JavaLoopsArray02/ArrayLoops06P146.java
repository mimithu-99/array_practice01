package JavaLoopsArray02;

public class ArrayLoops06P146 {

    public static void main(String[] args) {

        int b[] = {1,4,3,5,7};
        for (int i = 0; i <b.length ; i++) {
            System.out.println(b[i]);

            // Retrieve values present in this array

        }
    }
}
/*

public class ArrayLoops06P146 {

    public static void main(String[] args) {

        // একটি 1D অ্যারে তৈরি করা হচ্ছে এবং একে সরাসরি মান দিয়ে পূরণ করা হচ্ছে
        int b[] = {1, 4, 3, 5, 7};

        // লুপটি অ্যারেটির প্রতিটি উপাদান (element) এর জন্য চলবে
        for (int i = 0; i < b.length; i++) {
            // বর্তমান উপাদান প্রিন্ট করা হচ্ছে
            System.out.println(b[i]);

            // এই লাইনটি অ্যারেটি থেকে মানগুলো প্রিন্ট করছে
        }
    }
}
এখন, প্রতিটি লাইন ব্যাখ্যা করা হলো:

public class ArrayLoops06P146 {

একটি নতুন ক্লাস তৈরি করা হচ্ছে যার নাম ArrayLoops06P146।
public static void main(String[] args) {

এটি প্রোগ্রামের প্রধান অংশ, যেখানে কোড চালানো শুরু হয়।
int b[] = {1, 4, 3, 5, 7};

b নামের একটি 1D অ্যারে তৈরি করা হচ্ছে এবং একে সরাসরি মান দিয়ে পূরণ করা হচ্ছে। এই অ্যারেটির 5টি উপাদান আছে: 1, 4, 3, 5, এবং 7।
for (int i = 0; i < b.length; i++) {

একটি লুপ শুরু করা হচ্ছে যা অ্যারেটির প্রতিটি উপাদানের জন্য চলবে। b.length হল 5, তাই লুপটি 5 বার চলবে।
System.out.println(b[i]);

লুপের ভিতরে, প্রতিবার বর্তমান উপাদান b[i] প্রিন্ট করা হচ্ছে।
এই কোডটি অ্যারেতে সংখ্যাগুলি প্রিন্ট করবে: 1, 4, 3, 5, এবং 7। আশা করি তুমি কোডটি ভালভাবে বুঝতে পেরেছো!


 */