abstract class Plan {
    private String patientName;
    private double baseFee;

    public Plan(String patientName, double baseFee) {
        this.patientName = patientName;
        this.baseFee = baseFee;
    }

    public String getPatientName() { return patientName; }
    public double getBaseFee() { return baseFee; }

    public abstract double calculateBill();
}

class SilverPlan extends Plan {
    public SilverPlan(String patientName, double baseFee) {
        super(patientName, baseFee);
    }

    @Override
    public double calculateBill() {
        return getBaseFee() + 15.0;
    }
}

class GoldPlan extends Plan {
    public GoldPlan(String patientName, double baseFee) {
        super(patientName, baseFee);
    }

    @Override
    public double calculateBill() {
        double surcharge = getBaseFee() * 0.10;
        return getBaseFee() + surcharge - 20.0;
    }
}

public class case_1 {
    public static void printInvoice(Plan p) {
        System.out.println("Patient: " + p.getPatientName());
        System.out.println("Plan Type: " + p.getClass().getSimpleName());
        System.out.println("Total Bill: $" + p.calculateBill());
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        System.out.println("--- TC 1: Silver Plan ---");
        printInvoice(new SilverPlan("John", 100.0));

        System.out.println("--- TC 2: Gold Plan (Standard) ---");
        printInvoice(new GoldPlan("Sophia", 200.0));

        System.out.println("--- TC 3: Gold Plan (Small Fee) ---");
        printInvoice(new GoldPlan("Max", 50.0));
    }
}