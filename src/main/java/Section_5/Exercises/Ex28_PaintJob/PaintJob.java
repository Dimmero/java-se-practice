package Section_5.Exercises.Ex28_PaintJob;

public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        double area = width * height;
        double needBucket = area / areaPerBucket;
        return (int) Math.ceil(needBucket) - extraBuckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double area = width * height;
        double needBucket = area / areaPerBucket;
        return (int) Math.ceil(needBucket);
    }


    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double needBucket = area / areaPerBucket;
        return (int) Math.ceil(needBucket);
    }

}
