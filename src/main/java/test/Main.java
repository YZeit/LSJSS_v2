package test;

import lsjss.main.Run;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Run.execute("D:/IntelliJProjects/LSJSS_GPHH/params/coevolve/parameter_coevolve.params", "D:/IntelliJProjects/LSJSS_GPHH/results/", "D:/IntelliJProjects/LSJSS_GPHH/Experiment1/", 10, 5, 10);
    }
}