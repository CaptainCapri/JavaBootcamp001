package Exercises;

import java.util.Scanner;

public class Exercise_PaintJob {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        boolean isDouble = scanner.hasNextDouble();

//        double width = scanner.nextDouble();
//        scanner.nextLine();
//        double height = scanner.nextDouble();
//        scanner.nextLine();
//        double areaPerBucket = scanner.nextDouble();
//        scanner.nextLine();
//        int extraBuckets = scanner.nextInt();
//        scanner.nextLine();
//
//
//        System.out.println(getBucketCount(width, height, areaPerBucket, extraBuckets));

        System.out.println(getBucketCount(3.4,2.1,1.5,2));

        scanner.close();

    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if (width<=0 || height <=0 || areaPerBucket<=0 || extraBuckets<0) return -1;


        //double wallArea = width * height;

        Double neededBucketsD = Math.ceil(((width * height) / areaPerBucket) - extraBuckets);
        int neededBucketsI = (int) Math.round(neededBucketsD);
        return neededBucketsI;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        if (width<=0 || height <=0 || areaPerBucket<=0) return -1;

        Double neededBucketsD = Math.ceil(((width * height) / areaPerBucket));
        int neededBucketsI = (int) Math.round(neededBucketsD);
        return neededBucketsI;
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if (area<=0 || areaPerBucket<=0) return -1;
        Double neededBucketsD = (Math.ceil(area / areaPerBucket));
        int neededBucketsI = (int) Math.round(neededBucketsD);
        return neededBucketsI;
    }

}
