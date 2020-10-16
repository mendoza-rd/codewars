package codewars.k8.fundamentals;

/**
 * Determine offspring sex based on genes XX and XY chromosomes
 * <p>
 * The male gametes or sperm cells in humans and other mammals are heterogametic and contain one of two types of sex
 * chromosomes. They are either X or Y. The female gametes or eggs however, contain only the X sex chromosome and are
 * homogametic.
 * <p>
 * The sperm cell determines the sex of an individual in this case. If a sperm cell containing an X chromosome
 * fertilizes an egg, the resulting zygote will be XX or female. If the sperm cell contains a Y chromosome, then the
 * resulting zygote will be XY or male.
 * <p>
 * Determine if the sex of the offspring will be male or female based on the X or Y chromosome present in the male's
 * sperm.
 * <p>
 * If the sperm contains the X chromosome, return "Congratulations! You're going to have a daughter."; If the sperm
 * contains the Y chromosome, return "Congratulations! You're going to have a son.";
 */

public class DetXX {

    public static String chromosomeCheck(String sperm) {
        return sperm == "XX" ? "Congratulations! You're going to have a daughter." : "Congratulations! You're going to have a son.";
    }
}

/*
return "Congratulations! You're going to have a " + (sperm.contains("Y") ? "son." : "daughter.");
 */