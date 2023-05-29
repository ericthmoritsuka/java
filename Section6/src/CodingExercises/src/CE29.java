package CodingExercises.src;

public class CE29 {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        double bucketsToBuy;
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        } else {
            double area = width * height;
            double areaLeft = area - (extraBuckets * areaPerBucket);
            bucketsToBuy = Math.ceil(areaLeft / areaPerBucket);
        }
        return (int)(bucketsToBuy);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        double bucketsToBuy;
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            double area = width * height;
            bucketsToBuy = Math.ceil(area / areaPerBucket);
        }
        return (int) (bucketsToBuy);
    }

    public static int getBucketCount(double area, double areaPerBucket){
        double bucketsToBuy;
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            bucketsToBuy = Math.ceil(area / areaPerBucket);
        }
        return (int)(bucketsToBuy);
    }

    public static void main(String[] args) {
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
    }
}
