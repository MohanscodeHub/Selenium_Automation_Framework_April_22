package com.clipboard.reports;






import static com.clipboard.reports.ExtentManager.getExtentTest;

public final class ExtentLogger {

    private ExtentLogger() {

    }

    public static void pass(String message){
        getExtentTest().pass(message);
    }

   public static void fail(String message){
      getExtentTest().fail(message);
  }

   public static void skip(String message){
      getExtentTest().skip(message);
   }

    public static void info(String message){
        getExtentTest().info(message);
    }
}
